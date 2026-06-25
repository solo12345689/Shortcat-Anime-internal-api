package w2;

import P9.AbstractC2006o;
import P9.AbstractC2012v;
import P9.T;
import android.net.Uri;
import com.adjust.sdk.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import t2.AbstractC6635w;
import t2.a0;
import w2.InterfaceC6940g;
import w2.q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class q extends AbstractC6935b implements InterfaceC6940g {

    /* JADX INFO: renamed from: e */
    private final boolean f62860e;

    /* JADX INFO: renamed from: f */
    private final boolean f62861f;

    /* JADX INFO: renamed from: g */
    private final int f62862g;

    /* JADX INFO: renamed from: h */
    private final int f62863h;

    /* JADX INFO: renamed from: i */
    private final String f62864i;

    /* JADX INFO: renamed from: j */
    private final y f62865j;

    /* JADX INFO: renamed from: k */
    private final y f62866k;

    /* JADX INFO: renamed from: l */
    private final O9.o f62867l;

    /* JADX INFO: renamed from: m */
    private final boolean f62868m;

    /* JADX INFO: renamed from: n */
    private o f62869n;

    /* JADX INFO: renamed from: o */
    private HttpURLConnection f62870o;

    /* JADX INFO: renamed from: p */
    private InputStream f62871p;

    /* JADX INFO: renamed from: q */
    private boolean f62872q;

    /* JADX INFO: renamed from: r */
    private int f62873r;

    /* JADX INFO: renamed from: s */
    private long f62874s;

    /* JADX INFO: renamed from: t */
    private long f62875t;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC6940g.a {

        /* JADX INFO: renamed from: b */
        private InterfaceC6932F f62877b;

        /* JADX INFO: renamed from: c */
        private O9.o f62878c;

        /* JADX INFO: renamed from: d */
        private String f62879d;

        /* JADX INFO: renamed from: g */
        private boolean f62882g;

        /* JADX INFO: renamed from: h */
        private boolean f62883h;

        /* JADX INFO: renamed from: i */
        private boolean f62884i;

        /* JADX INFO: renamed from: a */
        private final y f62876a = new y();

        /* JADX INFO: renamed from: e */
        private int f62880e = 8000;

        /* JADX INFO: renamed from: f */
        private int f62881f = 8000;

        @Override // w2.InterfaceC6940g.a
        /* JADX INFO: renamed from: b */
        public q a() {
            q qVar = new q(this.f62879d, this.f62880e, this.f62881f, this.f62882g, this.f62883h, this.f62876a, this.f62878c, this.f62884i);
            InterfaceC6932F interfaceC6932F = this.f62877b;
            if (interfaceC6932F != null) {
                qVar.i(interfaceC6932F);
            }
            return qVar;
        }

        public b c(String str) {
            this.f62879d = str;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c extends AbstractC2006o {

        /* JADX INFO: renamed from: a */
        private final Map f62885a;

        public c(Map map) {
            this.f62885a = map;
        }

        public static /* synthetic */ boolean q(Map.Entry entry) {
            return entry.getKey() != null;
        }

        public static /* synthetic */ boolean r(String str) {
            return str != null;
        }

        @Override // P9.AbstractC2007p
        public Map b() {
            return this.f62885a;
        }

        @Override // P9.AbstractC2006o, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return super.h(obj);
        }

        @Override // P9.AbstractC2006o, java.util.Map
        public Set entrySet() {
            return T.b(super.entrySet(), new O9.o() { // from class: w2.r
                @Override // O9.o
                public final boolean apply(Object obj) {
                    return q.c.q((Map.Entry) obj);
                }
            });
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return obj != null && super.m(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return super.n();
        }

        @Override // P9.AbstractC2006o, java.util.Map
        public boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
        }

        @Override // P9.AbstractC2006o, java.util.Map
        public Set keySet() {
            return T.b(super.keySet(), new O9.o() { // from class: w2.s
                @Override // O9.o
                public final boolean apply(Object obj) {
                    return q.c.r((String) obj);
                }
            });
        }

        @Override // P9.AbstractC2006o, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override // P9.AbstractC2006o, java.util.Map
        /* JADX INFO: renamed from: t */
        public List get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }
    }

    /* synthetic */ q(String str, int i10, int i11, boolean z10, boolean z11, y yVar, O9.o oVar, boolean z12, a aVar) {
        this(str, i10, i11, z10, z11, yVar, oVar, z12);
    }

    private void A(long j10, o oVar) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int i10 = ((InputStream) a0.l(this.f62871p)).read(bArr, 0, (int) Math.min(j10, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new v(new InterruptedIOException(), oVar, 2000, 1);
            }
            if (i10 == -1) {
                throw new v(oVar, 2008, 1);
            }
            j10 -= (long) i10;
            p(i10);
        }
    }

    private void t() {
        HttpURLConnection httpURLConnection = this.f62870o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                AbstractC6635w.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
        }
    }

    private URL u(URL url, String str, o oVar) throws v {
        if (str == null) {
            throw new v("Null location redirect", oVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!Constants.SCHEME.equals(protocol) && !"http".equals(protocol)) {
                throw new v("Unsupported protocol redirect: " + protocol, oVar, 2001, 1);
            }
            if (this.f62860e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.f62861f) {
                try {
                    return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (MalformedURLException e10) {
                    throw new v(e10, oVar, 2001, 1);
                }
            }
            throw new v("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", oVar, 2001, 1);
        } catch (MalformedURLException e11) {
            throw new v(e11, oVar, 2001, 1);
        }
    }

    private static boolean v(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection w(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) throws IOException {
        HttpURLConnection httpURLConnectionY = y(url);
        httpURLConnectionY.setConnectTimeout(this.f62862g);
        httpURLConnectionY.setReadTimeout(this.f62863h);
        HashMap map2 = new HashMap();
        y yVar = this.f62865j;
        if (yVar != null) {
            map2.putAll(yVar.b());
        }
        map2.putAll(this.f62866k.b());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionY.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = z.a(j10, j11);
        if (strA != null) {
            httpURLConnectionY.setRequestProperty("Range", strA);
        }
        String str = this.f62864i;
        if (str != null) {
            httpURLConnectionY.setRequestProperty("User-Agent", str);
        }
        httpURLConnectionY.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnectionY.setInstanceFollowRedirects(z11);
        httpURLConnectionY.setDoOutput(bArr != null);
        httpURLConnectionY.setRequestMethod(o.c(i10));
        if (bArr == null) {
            httpURLConnectionY.connect();
            return httpURLConnectionY;
        }
        httpURLConnectionY.setFixedLengthStreamingMode(bArr.length);
        httpURLConnectionY.connect();
        OutputStream outputStream = httpURLConnectionY.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnectionY;
    }

    private HttpURLConnection x(o oVar) throws IOException {
        HttpURLConnection httpURLConnectionW;
        URL url = new URL(oVar.f62825a.toString());
        int i10 = oVar.f62827c;
        byte[] bArr = oVar.f62828d;
        long j10 = oVar.f62831g;
        long j11 = oVar.f62832h;
        int i11 = 1;
        boolean zD = oVar.d(1);
        if (!this.f62860e && !this.f62861f && !this.f62868m) {
            return w(url, i10, bArr, j10, j11, zD, true, oVar.f62829e);
        }
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new v(new NoRouteToHostException("Too many redirects: " + i13), oVar, 2001, 1);
            }
            httpURLConnectionW = w(url, i10, bArr, j10, j11, zD, false, oVar.f62829e);
            int responseCode = httpURLConnectionW.getResponseCode();
            String headerField = httpURLConnectionW.getHeaderField("Location");
            if ((i10 == i11 || i10 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionW.disconnect();
                url = u(url, headerField, oVar);
            } else {
                if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionW.disconnect();
                if (!this.f62868m || responseCode != 302) {
                    bArr = null;
                    i10 = 1;
                }
                url = u(url, headerField, oVar);
            }
            i12 = i13;
            i11 = 1;
        }
        return httpURLConnectionW;
    }

    private int z(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f62874s;
        if (j10 != -1) {
            long j11 = j10 - this.f62875t;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int i12 = ((InputStream) a0.l(this.f62871p)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f62875t += (long) i12;
        p(i12);
        return i12;
    }

    @Override // w2.InterfaceC6940g
    public long a(o oVar) throws v {
        byte[] bArrB;
        this.f62869n = oVar;
        long j10 = 0;
        this.f62875t = 0L;
        this.f62874s = 0L;
        r(oVar);
        try {
            HttpURLConnection httpURLConnectionX = x(oVar);
            this.f62870o = httpURLConnectionX;
            this.f62873r = httpURLConnectionX.getResponseCode();
            String responseMessage = httpURLConnectionX.getResponseMessage();
            int i10 = this.f62873r;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionX.getHeaderFields();
                if (this.f62873r == 416) {
                    if (oVar.f62831g == z.c(httpURLConnectionX.getHeaderField("Content-Range"))) {
                        this.f62872q = true;
                        s(oVar);
                        long j11 = oVar.f62832h;
                        if (j11 != -1) {
                            return j11;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionX.getErrorStream();
                try {
                    bArrB = errorStream != null ? Q9.a.b(errorStream) : a0.f60567f;
                } catch (IOException unused) {
                    bArrB = a0.f60567f;
                }
                byte[] bArr = bArrB;
                t();
                throw new x(this.f62873r, responseMessage, this.f62873r == 416 ? new l(2008) : null, headerFields, oVar, bArr);
            }
            String contentType = httpURLConnectionX.getContentType();
            O9.o oVar2 = this.f62867l;
            if (oVar2 != null && !oVar2.apply(contentType)) {
                t();
                throw new w(contentType, oVar);
            }
            if (this.f62873r == 200) {
                long j12 = oVar.f62831g;
                if (j12 != 0) {
                    j10 = j12;
                }
            }
            boolean zV = v(httpURLConnectionX);
            if (zV) {
                this.f62874s = oVar.f62832h;
            } else {
                long j13 = oVar.f62832h;
                if (j13 != -1) {
                    this.f62874s = j13;
                } else {
                    long jB = z.b(httpURLConnectionX.getHeaderField("Content-Length"), httpURLConnectionX.getHeaderField("Content-Range"));
                    this.f62874s = jB != -1 ? jB - j10 : -1L;
                }
            }
            try {
                this.f62871p = httpURLConnectionX.getInputStream();
                if (zV) {
                    this.f62871p = new GZIPInputStream(this.f62871p);
                }
                this.f62872q = true;
                s(oVar);
                try {
                    A(j10, oVar);
                    return this.f62874s;
                } catch (IOException e10) {
                    t();
                    if (e10 instanceof v) {
                        throw ((v) e10);
                    }
                    throw new v(e10, oVar, 2000, 1);
                }
            } catch (IOException e11) {
                t();
                throw new v(e11, oVar, 2000, 1);
            }
        } catch (IOException e12) {
            t();
            throw v.c(e12, oVar, 1);
        }
    }

    @Override // w2.InterfaceC6940g
    public Uri c() {
        HttpURLConnection httpURLConnection = this.f62870o;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        o oVar = this.f62869n;
        if (oVar != null) {
            return oVar.f62825a;
        }
        return null;
    }

    @Override // w2.InterfaceC6940g
    public void close() {
        try {
            InputStream inputStream = this.f62871p;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new v(e10, (o) a0.l(this.f62869n), 2000, 3);
                }
            }
        } finally {
            this.f62871p = null;
            t();
            if (this.f62872q) {
                this.f62872q = false;
                q();
            }
            this.f62870o = null;
            this.f62869n = null;
        }
    }

    @Override // w2.InterfaceC6940g
    public Map f() {
        HttpURLConnection httpURLConnection = this.f62870o;
        return httpURLConnection == null ? AbstractC2012v.k() : new c(httpURLConnection.getHeaderFields());
    }

    @Override // q2.InterfaceC6098m
    public int read(byte[] bArr, int i10, int i11) throws v {
        try {
            return z(bArr, i10, i11);
        } catch (IOException e10) {
            throw v.c(e10, (o) a0.l(this.f62869n), 2);
        }
    }

    HttpURLConnection y(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    private q(String str, int i10, int i11, boolean z10, boolean z11, y yVar, O9.o oVar, boolean z12) {
        super(true);
        this.f62864i = str;
        this.f62862g = i10;
        this.f62863h = i11;
        this.f62860e = z10;
        this.f62861f = z11;
        if (z10 && z11) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.f62865j = yVar;
        this.f62867l = oVar;
        this.f62866k = new y();
        this.f62868m = z12;
    }
}
