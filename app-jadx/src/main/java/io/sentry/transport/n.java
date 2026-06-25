package io.sentry.transport;

import com.adjust.sdk.Constants;
import io.sentry.B1;
import io.sentry.C5265q2;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Charset f51382e = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Proxy f51383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B1 f51384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5322z3 f51385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z f51386d;

    public n(C5322z3 c5322z3, B1 b12, z zVar) {
        this(c5322z3, b12, l.a(), zVar);
    }

    private void a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    private HttpURLConnection b() throws IOException {
        HttpURLConnection httpURLConnectionE = e();
        for (Map.Entry entry : this.f51384b.a().entrySet()) {
            httpURLConnectionE.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnectionE.setRequestMethod("POST");
        httpURLConnectionE.setDoOutput(true);
        httpURLConnectionE.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnectionE.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnectionE.setRequestProperty("Accept", "application/json");
        httpURLConnectionE.setRequestProperty("Connection", "close");
        httpURLConnectionE.setConnectTimeout(this.f51385c.getConnectionTimeoutMillis());
        httpURLConnectionE.setReadTimeout(this.f51385c.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = this.f51385c.getSslSocketFactory();
        if ((httpURLConnectionE instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnectionE).setSSLSocketFactory(sslSocketFactory);
        }
        httpURLConnectionE.connect();
        return httpURLConnectionE;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String c(java.net.HttpURLConnection r5) {
        /*
            r4 = this;
            java.io.InputStream r5 = r5.getErrorStream()     // Catch: java.io.IOException -> L4e
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L38
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L38
            java.nio.charset.Charset r2 = io.sentry.transport.n.f51382e     // Catch: java.lang.Throwable -> L38
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L38
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r1.<init>()     // Catch: java.lang.Throwable -> L24
            r2 = 1
        L16:
            java.lang.String r3 = r0.readLine()     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L2b
            if (r2 != 0) goto L26
            java.lang.String r2 = "\n"
            r1.append(r2)     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r1 = move-exception
            goto L3a
        L26:
            r1.append(r3)     // Catch: java.lang.Throwable -> L24
            r2 = 0
            goto L16
        L2b:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L24
            r0.close()     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L37
            r5.close()     // Catch: java.io.IOException -> L4e
        L37:
            return r1
        L38:
            r0 = move-exception
            goto L43
        L3a:
            r0.close()     // Catch: java.lang.Throwable -> L3e
            goto L42
        L3e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L38
        L42:
            throw r1     // Catch: java.lang.Throwable -> L38
        L43:
            if (r5 == 0) goto L4d
            r5.close()     // Catch: java.lang.Throwable -> L49
            goto L4d
        L49:
            r5 = move-exception
            r0.addSuppressed(r5)     // Catch: java.io.IOException -> L4e
        L4d:
            throw r0     // Catch: java.io.IOException -> L4e
        L4e:
            java.lang.String r5 = "Failed to obtain error message while analyzing send failure."
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.transport.n.c(java.net.HttpURLConnection):java.lang.String");
    }

    private boolean d(int i10) {
        return i10 == 200;
    }

    private B f(HttpURLConnection httpURLConnection) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                i(httpURLConnection, responseCode);
                if (d(responseCode)) {
                    this.f51385c.getLogger().c(EnumC5215i3.DEBUG, "Envelope sent successfully.", new Object[0]);
                    B bE = B.e();
                    a(httpURLConnection);
                    return bE;
                }
                ILogger logger = this.f51385c.getLogger();
                EnumC5215i3 enumC5215i3 = EnumC5215i3.ERROR;
                logger.c(enumC5215i3, "Request failed, API returned %s", Integer.valueOf(responseCode));
                if (this.f51385c.isDebug()) {
                    this.f51385c.getLogger().c(enumC5215i3, "%s", c(httpURLConnection));
                }
                B b10 = B.b(responseCode);
                a(httpURLConnection);
                return b10;
            } catch (IOException e10) {
                this.f51385c.getLogger().a(EnumC5215i3.ERROR, e10, "Error reading and logging the response stream", new Object[0]);
                a(httpURLConnection);
                return B.a();
            }
        } catch (Throwable th2) {
            a(httpURLConnection);
            throw th2;
        }
    }

    private Proxy g(C5322z3.m mVar) {
        if (mVar == null) {
            return null;
        }
        String strC = mVar.c();
        String strA = mVar.a();
        if (strC == null || strA == null) {
            return null;
        }
        try {
            return new Proxy(mVar.d() != null ? mVar.d() : Proxy.Type.HTTP, new InetSocketAddress(strA, Integer.parseInt(strC)));
        } catch (NumberFormatException e10) {
            this.f51385c.getLogger().a(EnumC5215i3.ERROR, e10, "Failed to parse Sentry Proxy port: " + mVar.c() + ". Proxy is ignored", new Object[0]);
            return null;
        }
    }

    HttpURLConnection e() {
        return (HttpURLConnection) (this.f51383a == null ? this.f51384b.b().openConnection() : this.f51384b.b().openConnection(this.f51383a));
    }

    public B h(C5265q2 c5265q2) {
        B bF;
        this.f51385c.getSocketTagger().b();
        try {
            OutputStream outputStream = b().getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f51385c.getSerializer().b(c5265q2, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } finally {
                }
            } finally {
            }
        } finally {
            try {
            } finally {
            }
        }
        return bF;
    }

    public void i(HttpURLConnection httpURLConnection, int i10) {
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        this.f51386d.H(httpURLConnection.getHeaderField("X-Sentry-Rate-Limits"), headerField, i10);
    }

    n(C5322z3 c5322z3, B1 b12, l lVar, z zVar) {
        this.f51384b = b12;
        this.f51385c = c5322z3;
        this.f51386d = zVar;
        Proxy proxyG = g(c5322z3.getProxy());
        this.f51383a = proxyG;
        if (proxyG == null || c5322z3.getProxy() == null) {
            return;
        }
        String strE = c5322z3.getProxy().e();
        String strB = c5322z3.getProxy().b();
        if (strE == null || strB == null) {
            return;
        }
        lVar.b(new u(strE, strB));
    }
}
