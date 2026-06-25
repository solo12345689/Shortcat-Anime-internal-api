package io.sentry;

import io.sentry.util.C5288a;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: io.sentry.g3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5205g3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile C5205g3 f50704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C5288a f50705d = new C5288a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile Boolean f50706e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C5288a f50707f = new C5288a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f50708a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f50709b = new CopyOnWriteArraySet();

    private C5205g3() {
    }

    public static C5205g3 d() {
        if (f50704c == null) {
            InterfaceC5192e0 interfaceC5192e0A = f50705d.a();
            try {
                if (f50704c == null) {
                    f50704c = new C5205g3();
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
        return f50704c;
    }

    public void a(String str) {
        io.sentry.util.w.c(str, "integration is required.");
        this.f50708a.add(str);
    }

    public void b(String str, String str2) {
        io.sentry.util.w.c(str, "name is required.");
        io.sentry.util.w.c(str2, "version is required.");
        this.f50709b.add(new io.sentry.protocol.y(str, str2));
        InterfaceC5192e0 interfaceC5192e0A = f50707f.a();
        try {
            f50706e = null;
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

    public boolean c(ILogger iLogger) {
        Boolean bool = f50706e;
        if (bool != null) {
            return bool.booleanValue();
        }
        InterfaceC5192e0 interfaceC5192e0A = f50707f.a();
        try {
            boolean z10 = false;
            for (io.sentry.protocol.y yVar : this.f50709b) {
                if (yVar.a().startsWith("maven:io.sentry:") && !"8.31.0".equalsIgnoreCase(yVar.b())) {
                    iLogger.c(EnumC5215i3.ERROR, "The Sentry SDK has been configured with mixed versions. Expected %s to match core SDK version %s but was %s", yVar.a(), "8.31.0", yVar.b());
                    z10 = true;
                }
            }
            if (z10) {
                EnumC5215i3 enumC5215i3 = EnumC5215i3.ERROR;
                iLogger.c(enumC5215i3, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.c(enumC5215i3, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.c(enumC5215i3, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.c(enumC5215i3, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
            }
            f50706e = Boolean.valueOf(z10);
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return z10;
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

    public Set e() {
        return this.f50708a;
    }

    public Set f() {
        return this.f50709b;
    }
}
