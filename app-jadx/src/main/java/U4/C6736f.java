package u4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: u4.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C6736f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ExecutorService f61376i = C6732b.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Executor f61377j = C6732b.b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Executor f61378k = C6731a.c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static C6736f f61379l = new C6736f((Object) null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static C6736f f61380m = new C6736f(Boolean.TRUE);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static C6736f f61381n = new C6736f(Boolean.FALSE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static C6736f f61382o = new C6736f(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f61384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f61385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f61386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Exception f61387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f61388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AbstractC6738h f61389g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f61383a = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f61390h = new ArrayList();

    /* JADX INFO: renamed from: u4.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements InterfaceC6734d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6737g f61391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6734d f61392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f61393c;

        a(C6737g c6737g, InterfaceC6734d interfaceC6734d, Executor executor, AbstractC6733c abstractC6733c) {
            this.f61391a = c6737g;
            this.f61392b = interfaceC6734d;
            this.f61393c = executor;
        }

        @Override // u4.InterfaceC6734d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(C6736f c6736f) {
            C6736f.d(this.f61391a, this.f61392b, c6736f, this.f61393c, null);
            return null;
        }
    }

    /* JADX INFO: renamed from: u4.f$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6737g f61395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6734d f61396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C6736f f61397c;

        b(AbstractC6733c abstractC6733c, C6737g c6737g, InterfaceC6734d interfaceC6734d, C6736f c6736f) {
            this.f61395a = c6737g;
            this.f61396b = interfaceC6734d;
            this.f61397c = c6736f;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f61395a.d(this.f61396b.a(this.f61397c));
            } catch (CancellationException unused) {
                this.f61395a.b();
            } catch (Exception e10) {
                this.f61395a.c(e10);
            }
        }
    }

    /* JADX INFO: renamed from: u4.f$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6737g f61398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callable f61399b;

        c(AbstractC6733c abstractC6733c, C6737g c6737g, Callable callable) {
            this.f61398a = c6737g;
            this.f61399b = callable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f61398a.d(this.f61399b.call());
            } catch (CancellationException unused) {
                this.f61398a.b();
            } catch (Exception e10) {
                this.f61398a.c(e10);
            }
        }
    }

    /* JADX INFO: renamed from: u4.f$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface d {
    }

    C6736f() {
    }

    public static C6736f b(Callable callable, Executor executor) {
        return c(callable, executor, null);
    }

    public static C6736f c(Callable callable, Executor executor, AbstractC6733c abstractC6733c) {
        C6737g c6737g = new C6737g();
        try {
            executor.execute(new c(abstractC6733c, c6737g, callable));
        } catch (Exception e10) {
            c6737g.c(new C6735e(e10));
        }
        return c6737g.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(C6737g c6737g, InterfaceC6734d interfaceC6734d, C6736f c6736f, Executor executor, AbstractC6733c abstractC6733c) {
        try {
            executor.execute(new b(abstractC6733c, c6737g, interfaceC6734d, c6736f));
        } catch (Exception e10) {
            c6737g.c(new C6735e(e10));
        }
    }

    public static C6736f g(Exception exc) {
        C6737g c6737g = new C6737g();
        c6737g.c(exc);
        return c6737g.a();
    }

    public static C6736f h(Object obj) {
        if (obj == null) {
            return f61379l;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? f61380m : f61381n;
        }
        C6737g c6737g = new C6737g();
        c6737g.d(obj);
        return c6737g.a();
    }

    public static d k() {
        return null;
    }

    private void o() {
        synchronized (this.f61383a) {
            Iterator it = this.f61390h.iterator();
            while (it.hasNext()) {
                try {
                    ((InterfaceC6734d) it.next()).a(this);
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
            this.f61390h = null;
        }
    }

    public C6736f e(InterfaceC6734d interfaceC6734d) {
        return f(interfaceC6734d, f61377j, null);
    }

    public C6736f f(InterfaceC6734d interfaceC6734d, Executor executor, AbstractC6733c abstractC6733c) throws Throwable {
        InterfaceC6734d interfaceC6734d2;
        Executor executor2;
        AbstractC6733c abstractC6733c2;
        C6737g c6737g = new C6737g();
        synchronized (this.f61383a) {
            try {
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                boolean zM = m();
                if (zM) {
                    interfaceC6734d2 = interfaceC6734d;
                    executor2 = executor;
                    abstractC6733c2 = abstractC6733c;
                } else {
                    interfaceC6734d2 = interfaceC6734d;
                    executor2 = executor;
                    abstractC6733c2 = abstractC6733c;
                    this.f61390h.add(new a(c6737g, interfaceC6734d2, executor2, abstractC6733c2));
                }
                if (zM) {
                    d(c6737g, interfaceC6734d2, this, executor2, abstractC6733c2);
                }
                return c6737g.a();
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    public Exception i() {
        Exception exc;
        synchronized (this.f61383a) {
            try {
                if (this.f61387e != null) {
                    this.f61388f = true;
                }
                exc = this.f61387e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return exc;
    }

    public Object j() {
        Object obj;
        synchronized (this.f61383a) {
            obj = this.f61386d;
        }
        return obj;
    }

    public boolean l() {
        boolean z10;
        synchronized (this.f61383a) {
            z10 = this.f61385c;
        }
        return z10;
    }

    public boolean m() {
        boolean z10;
        synchronized (this.f61383a) {
            z10 = this.f61384b;
        }
        return z10;
    }

    public boolean n() {
        boolean z10;
        synchronized (this.f61383a) {
            z10 = i() != null;
        }
        return z10;
    }

    boolean p() {
        synchronized (this.f61383a) {
            try {
                if (this.f61384b) {
                    return false;
                }
                this.f61384b = true;
                this.f61385c = true;
                this.f61383a.notifyAll();
                o();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean q(Exception exc) {
        synchronized (this.f61383a) {
            try {
                if (this.f61384b) {
                    return false;
                }
                this.f61384b = true;
                this.f61387e = exc;
                this.f61388f = false;
                this.f61383a.notifyAll();
                o();
                if (!this.f61388f) {
                    k();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean r(Object obj) {
        synchronized (this.f61383a) {
            try {
                if (this.f61384b) {
                    return false;
                }
                this.f61384b = true;
                this.f61386d = obj;
                this.f61383a.notifyAll();
                o();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private C6736f(Object obj) {
        r(obj);
    }

    private C6736f(boolean z10) {
        if (z10) {
            p();
        } else {
            r(null);
        }
    }
}
