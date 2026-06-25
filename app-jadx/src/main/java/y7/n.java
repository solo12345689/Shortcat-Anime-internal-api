package y7;

import Td.L;
import e7.InterfaceC4656a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y7.n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements InterfaceC4656a {

    /* JADX INFO: renamed from: g */
    public static final a f64899g = new a(null);

    /* JADX INFO: renamed from: h */
    public static final Executor f64900h = c.f64880c;

    /* JADX INFO: renamed from: i */
    public static final Executor f64901i = c.f64879b;

    /* JADX INFO: renamed from: j */
    private static final n f64902j = new n((Object) null);

    /* JADX INFO: renamed from: k */
    private static final n f64903k = new n(Boolean.TRUE);

    /* JADX INFO: renamed from: l */
    private static final n f64904l = new n(Boolean.FALSE);

    /* JADX INFO: renamed from: m */
    private static final n f64905m = new n(true);

    /* JADX INFO: renamed from: b */
    private boolean f64907b;

    /* JADX INFO: renamed from: c */
    private boolean f64908c;

    /* JADX INFO: renamed from: d */
    private Object f64909d;

    /* JADX INFO: renamed from: e */
    private Exception f64910e;

    /* JADX INFO: renamed from: a */
    private final Object f64906a = new Object();

    /* JADX INFO: renamed from: f */
    private final List f64911f = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final void i(Callable callable, final o oVar) {
            InterfaceC7207a interfaceC7207a = new InterfaceC7207a() { // from class: y7.j
                @Override // y7.InterfaceC7207a
                public final Object a(n nVar) {
                    return n.a.j(oVar, nVar);
                }
            };
            try {
                n nVar = (n) callable.call();
                synchronized (nVar.f64906a) {
                    try {
                        if (nVar.u()) {
                            AbstractC5504s.e(nVar);
                            interfaceC7207a.a(nVar);
                        } else {
                            nVar.f64911f.add(interfaceC7207a);
                        }
                    } finally {
                    }
                }
            } catch (CancellationException unused) {
                oVar.b();
            } catch (Exception e10) {
                oVar.c(e10);
            }
        }

        public static final L j(o oVar, n task) {
            AbstractC5504s.h(task, "task");
            if (task.t()) {
                oVar.b();
            } else if (task.v()) {
                oVar.c(task.r());
            } else {
                oVar.d(task.s());
            }
            return L.f17438a;
        }

        public final void l(final o oVar, final InterfaceC7207a interfaceC7207a, final n nVar, Executor executor) {
            try {
                executor.execute(new Runnable() { // from class: y7.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        n.a.m(interfaceC7207a, nVar, oVar);
                    }
                });
            } catch (Exception e10) {
                oVar.c(new b(e10));
            }
        }

        public static final void m(InterfaceC7207a interfaceC7207a, n nVar, final o oVar) {
            try {
                n nVar2 = (n) interfaceC7207a.a(nVar);
                if (nVar2 == null) {
                    oVar.d(null);
                } else {
                    n.m(nVar2, new InterfaceC7207a() { // from class: y7.m
                        @Override // y7.InterfaceC7207a
                        public final Object a(n nVar3) {
                            return n.a.n(oVar, nVar3);
                        }
                    }, null, 2, null);
                }
            } catch (CancellationException unused) {
                oVar.b();
            } catch (Exception e10) {
                oVar.c(e10);
            }
        }

        public static final L n(o oVar, n task) {
            AbstractC5504s.h(task, "task");
            if (task.t()) {
                oVar.b();
            } else if (task.v()) {
                oVar.c(task.r());
            } else {
                oVar.d(task.s());
            }
            return L.f17438a;
        }

        public final void o(final o oVar, final InterfaceC7207a interfaceC7207a, final n nVar, Executor executor) {
            try {
                executor.execute(new Runnable() { // from class: y7.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        n.a.p(interfaceC7207a, nVar, oVar);
                    }
                });
            } catch (Exception e10) {
                oVar.c(new b(e10));
            }
        }

        public static final void p(InterfaceC7207a interfaceC7207a, n nVar, o oVar) {
            try {
                oVar.d(interfaceC7207a.a(nVar));
            } catch (CancellationException unused) {
                oVar.b();
            } catch (Exception e10) {
                oVar.c(e10);
            }
        }

        public final n h(final Callable callable, Executor executor) {
            AbstractC5504s.h(callable, "callable");
            AbstractC5504s.h(executor, "executor");
            final o oVar = new o();
            try {
                executor.execute(new Runnable() { // from class: y7.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        n.a.i(callable, oVar);
                    }
                });
            } catch (Exception e10) {
                oVar.c(new b(e10));
            }
            return oVar.a();
        }

        public final n k() {
            n nVar = n.f64905m;
            AbstractC5504s.f(nVar, "null cannot be cast to non-null type com.facebook.react.runtime.internal.bolts.Task<TResult of com.facebook.react.runtime.internal.bolts.Task.Companion.cancelled>");
            return nVar;
        }

        public final n q(Exception exc) {
            o oVar = new o();
            oVar.c(exc);
            return oVar.a();
        }

        public final n r(Object obj) {
            if (obj == null) {
                n nVar = n.f64902j;
                AbstractC5504s.f(nVar, "null cannot be cast to non-null type com.facebook.react.runtime.internal.bolts.Task<TResult of com.facebook.react.runtime.internal.bolts.Task.Companion.forResult>");
                return nVar;
            }
            if (obj instanceof Boolean) {
                n nVar2 = ((Boolean) obj).booleanValue() ? n.f64903k : n.f64904l;
                AbstractC5504s.f(nVar2, "null cannot be cast to non-null type com.facebook.react.runtime.internal.bolts.Task<TResult of com.facebook.react.runtime.internal.bolts.Task.Companion.forResult>");
                return nVar2;
            }
            o oVar = new o();
            oVar.d(obj);
            return oVar.a();
        }

        private a() {
        }
    }

    public n() {
    }

    public static final n A(InterfaceC7207a interfaceC7207a, n task) {
        AbstractC5504s.h(task, "task");
        return task.t() ? f64899g.k() : task.v() ? f64899g.q(task.r()) : m(task, interfaceC7207a, null, 2, null);
    }

    public static final n C(InterfaceC7207a interfaceC7207a, n task) {
        AbstractC5504s.h(task, "task");
        return task.t() ? f64899g.k() : task.v() ? f64899g.q(task.r()) : p(task, interfaceC7207a, null, 2, null);
    }

    private final void D() {
        synchronized (this.f64906a) {
            Iterator it = this.f64911f.iterator();
            while (it.hasNext()) {
                try {
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
            this.f64911f.clear();
            L l10 = L.f17438a;
        }
    }

    public static /* synthetic */ n m(n nVar, InterfaceC7207a interfaceC7207a, Executor executor, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            executor = f64900h;
        }
        return nVar.l(interfaceC7207a, executor);
    }

    public static final L n(o oVar, InterfaceC7207a interfaceC7207a, Executor executor, n task) {
        AbstractC5504s.h(task, "task");
        f64899g.o(oVar, interfaceC7207a, task, executor);
        return L.f17438a;
    }

    public static /* synthetic */ n p(n nVar, InterfaceC7207a interfaceC7207a, Executor executor, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            executor = f64900h;
        }
        return nVar.o(interfaceC7207a, executor);
    }

    public static final L q(o oVar, InterfaceC7207a interfaceC7207a, Executor executor, n task) {
        AbstractC5504s.h(task, "task");
        f64899g.l(oVar, interfaceC7207a, task, executor);
        return L.f17438a;
    }

    public static final n x(n task) {
        AbstractC5504s.h(task, "task");
        return task.t() ? f64899g.k() : task.v() ? f64899g.q(task.r()) : f64902j;
    }

    public static /* synthetic */ n z(n nVar, InterfaceC7207a interfaceC7207a, Executor executor, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            executor = f64900h;
        }
        return nVar.y(interfaceC7207a, executor);
    }

    public final n B(final InterfaceC7207a continuation, Executor executor) {
        AbstractC5504s.h(continuation, "continuation");
        AbstractC5504s.h(executor, "executor");
        return o(new InterfaceC7207a() { // from class: y7.h
            @Override // y7.InterfaceC7207a
            public final Object a(n nVar) {
                return n.C(continuation, nVar);
            }
        }, executor);
    }

    public final boolean E() {
        synchronized (this.f64906a) {
            if (this.f64907b) {
                return false;
            }
            this.f64907b = true;
            this.f64908c = true;
            this.f64906a.notifyAll();
            D();
            return true;
        }
    }

    public final boolean F(Exception exc) {
        synchronized (this.f64906a) {
            if (this.f64907b) {
                return false;
            }
            this.f64907b = true;
            this.f64910e = exc;
            this.f64906a.notifyAll();
            D();
            return true;
        }
    }

    public final boolean G(Object obj) {
        synchronized (this.f64906a) {
            if (this.f64907b) {
                return false;
            }
            this.f64907b = true;
            this.f64909d = obj;
            this.f64906a.notifyAll();
            D();
            return true;
        }
    }

    public final n l(final InterfaceC7207a continuation, final Executor executor) {
        boolean zU;
        AbstractC5504s.h(continuation, "continuation");
        AbstractC5504s.h(executor, "executor");
        final o oVar = new o();
        synchronized (this.f64906a) {
            try {
                zU = u();
                if (!zU) {
                    this.f64911f.add(new InterfaceC7207a() { // from class: y7.g
                        @Override // y7.InterfaceC7207a
                        public final Object a(n nVar) {
                            return n.n(oVar, continuation, executor, nVar);
                        }
                    });
                }
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zU) {
            f64899g.o(oVar, continuation, this, executor);
        }
        return oVar.a();
    }

    public final n o(final InterfaceC7207a continuation, final Executor executor) {
        boolean zU;
        AbstractC5504s.h(continuation, "continuation");
        AbstractC5504s.h(executor, "executor");
        final o oVar = new o();
        synchronized (this.f64906a) {
            try {
                zU = u();
                if (!zU) {
                    this.f64911f.add(new InterfaceC7207a() { // from class: y7.e
                        @Override // y7.InterfaceC7207a
                        public final Object a(n nVar) {
                            return n.q(oVar, continuation, executor, nVar);
                        }
                    });
                }
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zU) {
            f64899g.l(oVar, continuation, this, executor);
        }
        return oVar.a();
    }

    public Exception r() {
        Exception exc;
        synchronized (this.f64906a) {
            exc = this.f64910e;
        }
        return exc;
    }

    public Object s() {
        Object obj;
        synchronized (this.f64906a) {
            obj = this.f64909d;
        }
        return obj;
    }

    public boolean t() {
        boolean z10;
        synchronized (this.f64906a) {
            z10 = this.f64908c;
        }
        return z10;
    }

    public boolean u() {
        boolean z10;
        synchronized (this.f64906a) {
            z10 = this.f64907b;
        }
        return z10;
    }

    public boolean v() {
        boolean z10;
        synchronized (this.f64906a) {
            z10 = r() != null;
        }
        return z10;
    }

    public final n w() {
        return p(this, new InterfaceC7207a() { // from class: y7.d
            @Override // y7.InterfaceC7207a
            public final Object a(n nVar) {
                return n.x(nVar);
            }
        }, null, 2, null);
    }

    public final n y(final InterfaceC7207a continuation, Executor executor) {
        AbstractC5504s.h(continuation, "continuation");
        AbstractC5504s.h(executor, "executor");
        return o(new InterfaceC7207a() { // from class: y7.f
            @Override // y7.InterfaceC7207a
            public final Object a(n nVar) {
                return n.A(continuation, nVar);
            }
        }, executor);
    }

    private n(Object obj) {
        G(obj);
    }

    private n(boolean z10) {
        if (z10) {
            E();
        } else {
            G(null);
        }
    }
}
