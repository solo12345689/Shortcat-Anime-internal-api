import { NextResponse } from 'next/server';

export async function GET(request) {
  const { searchParams } = new URL(request.url);
  const targetUrl = searchParams.get('url');

  if (!targetUrl) {
    return NextResponse.json({ error: 'Missing target url parameter' }, { status: 400 });
  }

  try {
    const forwardHeaders = new Headers();
    forwardHeaders.set('Referer', 'https://www.getshortcat.com/');
    if (!targetUrl.includes('auth.k.prod.sinj.net')) {
      forwardHeaders.set('Origin', 'https://www.getshortcat.com');
    }
    forwardHeaders.set('User-Agent', 'Shortcat/0.0.24 (Android)');

    // Forward Authorization and map to X-Session-Token
    const authHeader = request.headers.get('authorization');
    if (authHeader) {
      forwardHeaders.set('Authorization', authHeader);
      const tokenVal = authHeader.replace('Bearer ', '').trim();
      forwardHeaders.set('X-Session-Token', tokenVal);
    }
    
    const sessionTokenHeader = request.headers.get('x-session-token');
    if (sessionTokenHeader) {
      forwardHeaders.set('X-Session-Token', sessionTokenHeader);
    }

    // Forward Range header for byte-range segment requests
    const rangeHeader = request.headers.get('range');
    if (rangeHeader) {
      forwardHeaders.set('Range', rangeHeader);
    }

    const response = await fetch(targetUrl, {
      headers: forwardHeaders,
    });

    const contentType = response.headers.get('content-type') || '';
    const status = response.status;

    // Check if the response is an HLS playlist (.m3u8)
    if (targetUrl.includes('.m3u8') || contentType.includes('application/x-mpegURL') || contentType.includes('application/vnd.apple.mpegurl')) {
      let text = await response.text();
      
      // Get the base URL directory of the m3u8 playlist to resolve relative segments
      const urlObj = new URL(targetUrl);
      const baseUrl = urlObj.origin + urlObj.pathname.substring(0, urlObj.pathname.lastIndexOf('/') + 1);

      // Parse and rewrite relative URLs in the m3u8 manifest to route back through our proxy
      const lines = text.split('\n');
      const rewrittenLines = lines.map(line => {
        let currentLine = line;
        
        // Rewrite URI="..." attributes (e.g. for audio/subtitles/keys in #EXT-X-MEDIA or #EXT-X-KEY)
        currentLine = currentLine.replace(/URI=["']([^"']+)["']/g, (match, p1) => {
          let resolved = p1;
          if (!p1.startsWith('http://') && !p1.startsWith('https://')) {
            resolved = new URL(p1, baseUrl).toString();
          }
          const requestUrl = new URL(request.url);
          return `URI="${requestUrl.origin}/api/proxy?url=${encodeURIComponent(resolved)}"`;
        });

        const trimmed = currentLine.trim();
        // Skip tags/comments for full-line rewrite
        if (!trimmed || trimmed.startsWith('#')) {
          return currentLine;
        }
        
        // Resolve absolute URL
        let segmentUrl = trimmed;
        if (!trimmed.startsWith('http://') && !trimmed.startsWith('https://')) {
          segmentUrl = new URL(trimmed, baseUrl).toString();
        }
        
        // Route through proxy
        const requestUrl = new URL(request.url);
        return `${requestUrl.origin}/api/proxy?url=${encodeURIComponent(segmentUrl)}`;
      });

      return new Response(rewrittenLines.join('\n'), {
        status,
        headers: {
          'Content-Type': 'application/vnd.apple.mpegurl',
          'Access-Control-Allow-Origin': '*',
        },
      });
    }

    // For other files (like .ts video chunks, images, JSON catalogs)
    const data = await response.arrayBuffer();
    
    // Forward range response headers
    const responseHeaders = {
      'Content-Type': contentType,
      'Access-Control-Allow-Origin': '*',
    };

    const contentRange = response.headers.get('content-range');
    if (contentRange) {
      responseHeaders['Content-Range'] = contentRange;
    }
    const acceptRanges = response.headers.get('accept-ranges');
    if (acceptRanges) {
      responseHeaders['Accept-Ranges'] = acceptRanges;
    }
    const contentLength = response.headers.get('content-length');
    if (contentLength) {
      responseHeaders['Content-Length'] = contentLength;
    }

    return new Response(data, {
      status,
      headers: responseHeaders,
    });

  } catch (error) {
    console.error('Proxy error:', error);
    return NextResponse.json({ error: 'Proxy request failed', details: error.message }, { status: 500 });
  }
}

async function handleWriteRequest(request, method) {
  const { searchParams } = new URL(request.url);
  const targetUrl = searchParams.get('url');

  if (!targetUrl) {
    return NextResponse.json({ error: 'Missing target url parameter' }, { status: 400 });
  }

  try {
    const forwardHeaders = new Headers();
    forwardHeaders.set('Referer', 'https://www.getshortcat.com/');
    if (!targetUrl.includes('auth.k.prod.sinj.net')) {
      forwardHeaders.set('Origin', 'https://www.getshortcat.com');
    }
    forwardHeaders.set('User-Agent', 'Shortcat/0.0.24 (Android)');
    
    const contentTypeHeader = request.headers.get('content-type');
    if (contentTypeHeader) {
      forwardHeaders.set('Content-Type', contentTypeHeader);
    } else {
      forwardHeaders.set('Content-Type', 'application/json');
    }

    // Forward Authorization and map to X-Session-Token
    const authHeader = request.headers.get('authorization');
    if (authHeader) {
      forwardHeaders.set('Authorization', authHeader);
      const tokenVal = authHeader.replace('Bearer ', '').trim();
      forwardHeaders.set('X-Session-Token', tokenVal);
    }
    
    const sessionTokenHeader = request.headers.get('x-session-token');
    if (sessionTokenHeader) {
      forwardHeaders.set('X-Session-Token', sessionTokenHeader);
    }

    const acceptHeader = request.headers.get('accept');
    if (acceptHeader) {
      forwardHeaders.set('Accept', acceptHeader);
    }

    let body;
    let byteLength = 0;
    if (contentTypeHeader && contentTypeHeader.includes('application/json')) {
      body = await request.text();
      byteLength = Buffer.byteLength(body, 'utf8');
      console.log(`[PROXY ${method}] JSON text body read:`, body);
    } else {
      body = await request.arrayBuffer();
      byteLength = body.byteLength;
      console.log(`[PROXY ${method}] Binary/Multipart body size:`, byteLength);
    }

    forwardHeaders.set('Content-Length', byteLength.toString());

    console.log(`[PROXY ${method}] Forwarding to:`, targetUrl);
    console.log(`[PROXY ${method}] Headers sent:`, Object.fromEntries(forwardHeaders.entries()));

    const response = await fetch(targetUrl, {
      method: method,
      headers: forwardHeaders,
      body: body,
    });

    const contentType = response.headers.get('content-type') || 'application/json';
    const status = response.status;
    const data = await response.arrayBuffer();

    return new Response(data, {
      status,
      headers: {
        'Content-Type': contentType,
        'Access-Control-Allow-Origin': '*',
      },
    });

  } catch (error) {
    return NextResponse.json({ error: 'Proxy request failed', details: error.message }, { status: 500 });
  }
}

export async function POST(request) {
  return handleWriteRequest(request, 'POST');
}

export async function PUT(request) {
  return handleWriteRequest(request, 'PUT');
}

export async function PATCH(request) {
  return handleWriteRequest(request, 'PATCH');
}
