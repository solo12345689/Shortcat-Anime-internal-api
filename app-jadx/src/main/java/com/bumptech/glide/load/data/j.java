package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import o5.AbstractC5830g;
import o5.C5826c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class j implements d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final b f35707g = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y4.h f35708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f35709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f35710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HttpURLConnection f35711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InputStream f35712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f35713f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.data.j.b
        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface b {
        HttpURLConnection a(URL url);
    }

    public j(Y4.h hVar, int i10) {
        this(hVar, i10, f35707g);
    }

    private HttpURLConnection c(URL url, Map map) throws S4.e {
        try {
            HttpURLConnection httpURLConnectionA = this.f35710c.a(url);
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnectionA.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnectionA.setConnectTimeout(this.f35709b);
            httpURLConnectionA.setReadTimeout(this.f35709b);
            httpURLConnectionA.setUseCaches(false);
            httpURLConnectionA.setDoInput(true);
            httpURLConnectionA.setInstanceFollowRedirects(false);
            return httpURLConnectionA;
        } catch (IOException e10) {
            throw new S4.e("URL.openConnection threw", 0, e10);
        }
    }

    private static int f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e10) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e10);
            return -1;
        }
    }

    private InputStream g(HttpURLConnection httpURLConnection) throws S4.e {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f35712e = C5826c.b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f35712e = httpURLConnection.getInputStream();
            }
            return this.f35712e;
        } catch (IOException e10) {
            throw new S4.e("Failed to obtain InputStream", f(httpURLConnection), e10);
        }
    }

    private static boolean h(int i10) {
        return i10 / 100 == 2;
    }

    private static boolean i(int i10) {
        return i10 / 100 == 3;
    }

    private InputStream j(URL url, int i10, URL url2, Map map) throws S4.e {
        if (i10 >= 5) {
            throw new S4.e("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new S4.e("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection httpURLConnectionC = c(url, map);
        this.f35711d = httpURLConnectionC;
        try {
            httpURLConnectionC.connect();
            this.f35712e = this.f35711d.getInputStream();
            if (this.f35713f) {
                return null;
            }
            int iF = f(this.f35711d);
            if (h(iF)) {
                return g(this.f35711d);
            }
            if (!i(iF)) {
                if (iF == -1) {
                    throw new S4.e(iF);
                }
                try {
                    throw new S4.e(this.f35711d.getResponseMessage(), iF);
                } catch (IOException e10) {
                    throw new S4.e("Failed to get a response message", iF, e10);
                }
            }
            String headerField = this.f35711d.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new S4.e("Received empty or null redirect url", iF);
            }
            try {
                URL url3 = new URL(url, headerField);
                b();
                return j(url3, i10 + 1, url, map);
            } catch (MalformedURLException e11) {
                throw new S4.e("Bad redirect url: " + headerField, iF, e11);
            }
        } catch (IOException e12) {
            throw new S4.e("Failed to connect or obtain data", f(this.f35711d), e12);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f35712e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f35711d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f35711d = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f35713f = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public S4.a d() {
        return S4.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.g gVar, d.a aVar) {
        long jB = AbstractC5830g.b();
        try {
            try {
                aVar.f(j(this.f35708a.i(), 0, null, this.f35708a.e()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC5830g.a(jB));
                }
            } catch (IOException e10) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e10);
                }
                aVar.c(e10);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC5830g.a(jB));
                }
            }
        } catch (Throwable th2) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC5830g.a(jB));
            }
            throw th2;
        }
    }

    j(Y4.h hVar, int i10, b bVar) {
        this.f35708a = hVar;
        this.f35709b = i10;
        this.f35710c = bVar;
    }
}
