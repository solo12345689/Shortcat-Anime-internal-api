package io.sentry.util;

import io.sentry.InterfaceC5192e0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f51426b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f51425a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5288a f51427c = new C5288a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        Object a();
    }

    public p(a aVar) {
        this.f51426b = aVar;
    }

    public Object a() {
        if (this.f51425a == null) {
            InterfaceC5192e0 interfaceC5192e0A = this.f51427c.a();
            try {
                if (this.f51425a == null) {
                    this.f51425a = this.f51426b.a();
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
        return this.f51425a;
    }

    public void b() {
        InterfaceC5192e0 interfaceC5192e0A = this.f51427c.a();
        try {
            this.f51425a = null;
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

    public void c(Object obj) {
        InterfaceC5192e0 interfaceC5192e0A = this.f51427c.a();
        try {
            this.f51425a = obj;
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
}
