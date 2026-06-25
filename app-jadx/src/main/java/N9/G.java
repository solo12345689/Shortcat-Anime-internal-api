package n9;

import R8.AbstractC2115p;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class G extends i {

    /* JADX INFO: renamed from: a */
    private final Object f54009a = new Object();

    /* JADX INFO: renamed from: b */
    private final D f54010b = new D();

    /* JADX INFO: renamed from: c */
    private boolean f54011c;

    /* JADX INFO: renamed from: d */
    private volatile boolean f54012d;

    /* JADX INFO: renamed from: e */
    private Object f54013e;

    /* JADX INFO: renamed from: f */
    private Exception f54014f;

    G() {
    }

    private final void w() {
        AbstractC2115p.p(this.f54011c, "Task is not yet complete");
    }

    private final void x() {
        if (this.f54011c) {
            throw C5758b.a(this);
        }
    }

    private final void y() {
        if (this.f54012d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void z() {
        synchronized (this.f54009a) {
            try {
                if (this.f54011c) {
                    this.f54010b.b(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // n9.i
    public final i a(Executor executor, InterfaceC5759c interfaceC5759c) {
        this.f54010b.a(new t(executor, interfaceC5759c));
        z();
        return this;
    }

    @Override // n9.i
    public final i b(Executor executor, InterfaceC5760d interfaceC5760d) {
        this.f54010b.a(new v(executor, interfaceC5760d));
        z();
        return this;
    }

    @Override // n9.i
    public final i c(InterfaceC5760d interfaceC5760d) {
        this.f54010b.a(new v(k.f54018a, interfaceC5760d));
        z();
        return this;
    }

    @Override // n9.i
    public final i d(Executor executor, InterfaceC5761e interfaceC5761e) {
        this.f54010b.a(new x(executor, interfaceC5761e));
        z();
        return this;
    }

    @Override // n9.i
    public final i e(InterfaceC5761e interfaceC5761e) {
        d(k.f54018a, interfaceC5761e);
        return this;
    }

    @Override // n9.i
    public final i f(Executor executor, InterfaceC5762f interfaceC5762f) {
        this.f54010b.a(new z(executor, interfaceC5762f));
        z();
        return this;
    }

    @Override // n9.i
    public final i g(InterfaceC5762f interfaceC5762f) {
        f(k.f54018a, interfaceC5762f);
        return this;
    }

    @Override // n9.i
    public final i h(Executor executor, InterfaceC5757a interfaceC5757a) {
        G g10 = new G();
        this.f54010b.a(new p(executor, interfaceC5757a, g10));
        z();
        return g10;
    }

    @Override // n9.i
    public final i i(Executor executor, InterfaceC5757a interfaceC5757a) {
        G g10 = new G();
        this.f54010b.a(new r(executor, interfaceC5757a, g10));
        z();
        return g10;
    }

    @Override // n9.i
    public final Exception j() {
        Exception exc;
        synchronized (this.f54009a) {
            exc = this.f54014f;
        }
        return exc;
    }

    @Override // n9.i
    public final Object k() {
        Object obj;
        synchronized (this.f54009a) {
            try {
                w();
                y();
                Exception exc = this.f54014f;
                if (exc != null) {
                    throw new C5763g(exc);
                }
                obj = this.f54013e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    @Override // n9.i
    public final Object l(Class cls) {
        Object obj;
        synchronized (this.f54009a) {
            try {
                w();
                y();
                if (cls.isInstance(this.f54014f)) {
                    throw ((Throwable) cls.cast(this.f54014f));
                }
                Exception exc = this.f54014f;
                if (exc != null) {
                    throw new C5763g(exc);
                }
                obj = this.f54013e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    @Override // n9.i
    public final boolean m() {
        return this.f54012d;
    }

    @Override // n9.i
    public final boolean n() {
        boolean z10;
        synchronized (this.f54009a) {
            z10 = this.f54011c;
        }
        return z10;
    }

    @Override // n9.i
    public final boolean o() {
        boolean z10;
        synchronized (this.f54009a) {
            try {
                z10 = false;
                if (this.f54011c && !this.f54012d && this.f54014f == null) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    @Override // n9.i
    public final i p(Executor executor, InterfaceC5764h interfaceC5764h) {
        G g10 = new G();
        this.f54010b.a(new B(executor, interfaceC5764h, g10));
        z();
        return g10;
    }

    @Override // n9.i
    public final i q(InterfaceC5764h interfaceC5764h) {
        Executor executor = k.f54018a;
        G g10 = new G();
        this.f54010b.a(new B(executor, interfaceC5764h, g10));
        z();
        return g10;
    }

    public final void r(Object obj) {
        synchronized (this.f54009a) {
            x();
            this.f54011c = true;
            this.f54013e = obj;
        }
        this.f54010b.b(this);
    }

    public final boolean s(Object obj) {
        synchronized (this.f54009a) {
            try {
                if (this.f54011c) {
                    return false;
                }
                this.f54011c = true;
                this.f54013e = obj;
                this.f54010b.b(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void t(Exception exc) {
        AbstractC2115p.m(exc, "Exception must not be null");
        synchronized (this.f54009a) {
            x();
            this.f54011c = true;
            this.f54014f = exc;
        }
        this.f54010b.b(this);
    }

    public final boolean u(Exception exc) {
        AbstractC2115p.m(exc, "Exception must not be null");
        synchronized (this.f54009a) {
            try {
                if (this.f54011c) {
                    return false;
                }
                this.f54011c = true;
                this.f54014f = exc;
                this.f54010b.b(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean v() {
        synchronized (this.f54009a) {
            try {
                if (this.f54011c) {
                    return false;
                }
                this.f54011c = true;
                this.f54012d = true;
                this.f54010b.b(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
