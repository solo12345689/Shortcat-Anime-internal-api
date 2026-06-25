package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.producers.X;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class D extends AbstractC3184d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f36024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExecutorService f36025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final F5.b f36026e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f36027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ X.a f36028b;

        a(c cVar, X.a aVar) {
            this.f36027a = cVar;
            this.f36028b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            D.this.j(this.f36027a, this.f36028b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends AbstractC3186f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Future f36030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ X.a f36031b;

        b(Future future, X.a aVar) {
            this.f36030a = future;
            this.f36031b = aVar;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void b() {
            if (this.f36030a.cancel(false)) {
                this.f36031b.b();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class c extends C {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f36033f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f36034g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f36035h;

        public c(InterfaceC3194n interfaceC3194n, e0 e0Var) {
            super(interfaceC3194n, e0Var);
        }
    }

    public D(int i10) {
        this(null, null, RealtimeSinceBootClock.get());
        this.f36022a = i10;
    }

    private HttpURLConnection g(Uri uri, int i10) throws IOException {
        HttpURLConnection httpURLConnectionO = o(uri);
        String str = this.f36023b;
        if (str != null) {
            httpURLConnectionO.setRequestProperty("User-Agent", str);
        }
        Map map = this.f36024c;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnectionO.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        httpURLConnectionO.setConnectTimeout(this.f36022a);
        int responseCode = httpURLConnectionO.getResponseCode();
        if (m(responseCode)) {
            return httpURLConnectionO;
        }
        if (!l(responseCode)) {
            httpURLConnectionO.disconnect();
            throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
        }
        String headerField = httpURLConnectionO.getHeaderField("Location");
        httpURLConnectionO.disconnect();
        Uri uri2 = headerField == null ? null : Uri.parse(headerField);
        String scheme = uri.getScheme();
        if (i10 <= 0 || uri2 == null || y5.i.a(uri2.getScheme(), scheme)) {
            throw new IOException(i10 == 0 ? h("URL %s follows too many redirects", uri.toString()) : h("URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode)));
        }
        return g(uri2, i10 - 1);
    }

    private static String h(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    private static boolean l(int i10) {
        if (i10 == 307 || i10 == 308) {
            return true;
        }
        switch (i10) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    private static boolean m(int i10) {
        return i10 >= 200 && i10 < 300;
    }

    static HttpURLConnection o(Uri uri) {
        return (HttpURLConnection) G5.f.p(uri).openConnection();
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public c e(InterfaceC3194n interfaceC3194n, e0 e0Var) {
        return new c(interfaceC3194n, e0Var);
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void a(c cVar, X.a aVar) {
        cVar.f36033f = this.f36026e.now();
        cVar.b().b(new b(this.f36025d.submit(new a(cVar, aVar)), aVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void j(com.facebook.imagepipeline.producers.D.c r5, com.facebook.imagepipeline.producers.X.a r6) throws java.lang.Throwable {
        /*
            r4 = this;
            r0 = 0
            android.net.Uri r1 = r5.g()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            r2 = 5
            java.net.HttpURLConnection r1 = r4.g(r1, r2)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            F5.b r2 = r4.f36026e     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L20
            long r2 = r2.now()     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L20
            com.facebook.imagepipeline.producers.D.c.o(r5, r2)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L20
            if (r1 == 0) goto L22
            java.io.InputStream r0 = r1.getInputStream()     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L20
            r5 = -1
            r6.c(r0, r5)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L20
            goto L22
        L1e:
            r5 = move-exception
            goto L3e
        L20:
            r5 = move-exception
            goto L32
        L22:
            if (r0 == 0) goto L27
            r0.close()     // Catch: java.io.IOException -> L27
        L27:
            if (r1 == 0) goto L3d
        L29:
            r1.disconnect()
            goto L3d
        L2d:
            r5 = move-exception
            r1 = r0
            goto L3e
        L30:
            r5 = move-exception
            r1 = r0
        L32:
            r6.a(r5)     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L3a
            r0.close()     // Catch: java.io.IOException -> L3a
        L3a:
            if (r1 == 0) goto L3d
            goto L29
        L3d:
            return
        L3e:
            if (r0 == 0) goto L43
            r0.close()     // Catch: java.io.IOException -> L43
        L43:
            if (r1 == 0) goto L48
            r1.disconnect()
        L48:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.D.j(com.facebook.imagepipeline.producers.D$c, com.facebook.imagepipeline.producers.X$a):void");
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Map d(c cVar, int i10) {
        HashMap map = new HashMap(4);
        map.put("queue_time", Long.toString(cVar.f36034g - cVar.f36033f));
        map.put("fetch_time", Long.toString(cVar.f36035h - cVar.f36034g));
        map.put("total_time", Long.toString(cVar.f36035h - cVar.f36033f));
        map.put("image_size", Integer.toString(i10));
        return map;
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void b(c cVar, int i10) {
        cVar.f36035h = this.f36026e.now();
    }

    D(String str, Map map, F5.b bVar) {
        this.f36025d = Executors.newFixedThreadPool(3);
        this.f36026e = bVar;
        this.f36024c = map;
        this.f36023b = str;
    }
}
