package io.sentry;

import io.sentry.C5322z3;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.concurrent.RejectedExecutionException;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class SpotlightIntegration implements InterfaceC5247p0, C5322z3.b, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C5322z3 f49320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ILogger f49321b = N0.e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC5187d0 f49322c = C5115a1.e();

    private void h(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    private HttpURLConnection j(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) URI.create(str).toURL().openConnection();
        httpURLConnection.setReadTimeout(1000);
        httpURLConnection.setConnectTimeout(1000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(C5265q2 c5265q2) {
        OutputStream outputStream;
        try {
            if (this.f49320a == null) {
                throw new IllegalArgumentException("SentryOptions are required to send envelopes.");
            }
            HttpURLConnection httpURLConnectionJ = j(k());
            try {
                outputStream = httpURLConnectionJ.getOutputStream();
            } catch (Throwable th2) {
                try {
                    this.f49321b.b(EnumC5215i3.ERROR, "An exception occurred while submitting the envelope to the Sentry server.", th2);
                    this.f49321b.c(EnumC5215i3.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionJ.getResponseCode()));
                } catch (Throwable th3) {
                    this.f49321b.c(EnumC5215i3.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionJ.getResponseCode()));
                    h(httpURLConnectionJ);
                    throw th3;
                }
            }
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f49320a.getSerializer().b(c5265q2, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    this.f49321b.c(EnumC5215i3.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionJ.getResponseCode()));
                    h(httpURLConnectionJ);
                } finally {
                }
            } finally {
            }
        } catch (Exception e10) {
            this.f49321b.b(EnumC5215i3.ERROR, "An exception occurred while creating the connection to spotlight.", e10);
        }
    }

    @Override // io.sentry.C5322z3.b
    public void a(final C5265q2 c5265q2, H h10) {
        try {
            this.f49322c.submit(new Runnable() { // from class: io.sentry.b4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50534a.l(c5265q2);
                }
            });
        } catch (RejectedExecutionException e10) {
            this.f49321b.b(EnumC5215i3.WARNING, "Spotlight envelope submission rejected.", e10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f49322c.a(0L);
        C5322z3 c5322z3 = this.f49320a;
        if (c5322z3 == null || c5322z3.getBeforeEnvelopeCallback() != this) {
            return;
        }
        this.f49320a.setBeforeEnvelopeCallback(null);
    }

    @Override // io.sentry.InterfaceC5247p0
    public void g(InterfaceC5114a0 interfaceC5114a0, C5322z3 c5322z3) {
        this.f49320a = c5322z3;
        this.f49321b = c5322z3.getLogger();
        if (c5322z3.getBeforeEnvelopeCallback() != null || !c5322z3.isEnableSpotlight()) {
            this.f49321b.c(EnumC5215i3.DEBUG, "SpotlightIntegration is not enabled. BeforeEnvelopeCallback is already set or spotlight is not enabled.", new Object[0]);
            return;
        }
        this.f49322c = new Z2(c5322z3);
        c5322z3.setBeforeEnvelopeCallback(this);
        this.f49321b.c(EnumC5215i3.DEBUG, "SpotlightIntegration enabled.", new Object[0]);
        io.sentry.util.n.a("Spotlight");
    }

    public String k() {
        C5322z3 c5322z3 = this.f49320a;
        return (c5322z3 == null || c5322z3.getSpotlightConnectionUrl() == null) ? io.sentry.util.y.a() ? "http://10.0.2.2:8969/stream" : "http://localhost:8969/stream" : this.f49320a.getSpotlightConnectionUrl();
    }
}
