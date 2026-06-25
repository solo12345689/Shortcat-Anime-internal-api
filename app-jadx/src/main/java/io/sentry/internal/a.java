package io.sentry.internal;

import io.sentry.C5205g3;
import io.sentry.InterfaceC5192e0;
import io.sentry.util.C5288a;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f50744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C5288a f50745e = new C5288a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f50746a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0798a f50747b = new C0798a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C5288a f50748c = new C5288a();

    /* JADX INFO: renamed from: io.sentry.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0798a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile String f50749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile String f50750b;
    }

    private a() {
    }

    public static a a() {
        if (f50744d == null) {
            InterfaceC5192e0 interfaceC5192e0A = f50745e.a();
            try {
                if (f50744d == null) {
                    f50744d = new a();
                }
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
            } catch (Throwable th2) {
                if (interfaceC5192e0A != null) {
                    try {
                        interfaceC5192e0A.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return f50744d;
    }

    public void b() {
        InterfaceC5192e0 interfaceC5192e0A;
        if (this.f50746a) {
            return;
        }
        try {
            interfaceC5192e0A = this.f50748c.a();
        } catch (IOException unused) {
        } catch (Throwable th2) {
            this.f50746a = true;
            throw th2;
        }
        try {
            if (this.f50746a) {
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
                this.f50746a = true;
                return;
            }
            Enumeration<URL> resources = ClassLoader.getSystemClassLoader().getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                try {
                    Attributes mainAttributes = new Manifest(resources.nextElement().openStream()).getMainAttributes();
                    if (mainAttributes != null) {
                        String value = mainAttributes.getValue("Sentry-Opentelemetry-SDK-Name");
                        String value2 = mainAttributes.getValue("Implementation-Version");
                        String value3 = mainAttributes.getValue("Sentry-SDK-Name");
                        String value4 = mainAttributes.getValue("Sentry-SDK-Package-Name");
                        if (value != null && value2 != null) {
                            this.f50747b.f50749a = value;
                            this.f50747b.f50750b = value2;
                            String value5 = mainAttributes.getValue("Sentry-Opentelemetry-Version-Name");
                            if (value5 != null) {
                                C5205g3.d().b("maven:io.opentelemetry:opentelemetry-sdk", value5);
                                C5205g3.d().a("OpenTelemetry");
                            }
                            String value6 = mainAttributes.getValue("Sentry-Opentelemetry-Javaagent-Version-Name");
                            if (value6 != null) {
                                C5205g3.d().b("maven:io.opentelemetry.javaagent:opentelemetry-javaagent", value6);
                                C5205g3.d().a("OpenTelemetry-Agent");
                            }
                            if (value.equals("sentry.java.opentelemetry.agentless")) {
                                C5205g3.d().a("OpenTelemetry-Agentless");
                            }
                            if (value.equals("sentry.java.opentelemetry.agentless-spring")) {
                                C5205g3.d().a("OpenTelemetry-Agentless-Spring");
                            }
                        }
                        if (value3 != null && value2 != null && value4 != null && value3.startsWith("sentry.java")) {
                            C5205g3.d().b(value4, value2);
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            this.f50746a = true;
            this.f50746a = true;
        } finally {
        }
    }
}
