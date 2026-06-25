package E3;

import E3.C1375h3;
import P9.AbstractC2011u;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicBoolean;
import q2.C6082N;
import q2.InterfaceC6084P;
import t.C6551a;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: E3.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C1363g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakReference f5238d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6551a f5236b = new C6551a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6551a f5237c = new C6551a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f5235a = new Object();

    /* JADX INFO: renamed from: E3.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        com.google.common.util.concurrent.p run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E3.g$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f5239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final S6 f5240b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public U6 f5242d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public InterfaceC6084P.b f5243e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public InterfaceC6084P.b f5244f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f5245g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public C6082N f5247i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public M6 f5248j;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Deque f5241c = new ArrayDeque();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public InterfaceC6084P.b f5246h = InterfaceC6084P.b.f56604b;

        public b(Object obj, S6 s62, U6 u62, InterfaceC6084P.b bVar) {
            this.f5239a = obj;
            this.f5240b = s62;
            this.f5242d = u62;
            this.f5243e = bVar;
        }
    }

    public C1363g(I3 i32) {
        this.f5238d = new WeakReference(i32);
    }

    public static /* synthetic */ void a(C1363g c1363g, AtomicBoolean atomicBoolean, b bVar, AtomicBoolean atomicBoolean2) {
        synchronized (c1363g.f5235a) {
            try {
                if (atomicBoolean.get()) {
                    atomicBoolean2.set(true);
                } else {
                    c1363g.g(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void b(final C1363g c1363g, a aVar, final AtomicBoolean atomicBoolean, final b bVar, final AtomicBoolean atomicBoolean2) {
        c1363g.getClass();
        aVar.run().k(new Runnable() { // from class: E3.f
            @Override // java.lang.Runnable
            public final void run() {
                C1363g.a(this.f5216a, atomicBoolean, bVar, atomicBoolean2);
            }
        }, com.google.common.util.concurrent.s.a());
    }

    public static /* synthetic */ com.google.common.util.concurrent.p c(C1363g c1363g, C1375h3.g gVar, InterfaceC6084P.b bVar) {
        I3 i32 = (I3) c1363g.f5238d.get();
        if (i32 != null) {
            i32.F0(gVar, bVar);
        }
        return com.google.common.util.concurrent.j.e();
    }

    public static /* synthetic */ void d(I3 i32, C1375h3.g gVar) {
        if (i32.t0()) {
            return;
        }
        i32.A0(gVar);
    }

    private void g(b bVar) {
        I3 i32 = (I3) this.f5238d.get();
        if (i32 == null) {
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        while (atomicBoolean.get()) {
            atomicBoolean.set(false);
            final a aVar = (a) bVar.f5241c.poll();
            if (aVar == null) {
                bVar.f5245g = false;
                return;
            }
            final AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
            final b bVar2 = bVar;
            t2.a0.g1(i32.X(), i32.L(k(bVar.f5239a), new Runnable() { // from class: E3.e
                @Override // java.lang.Runnable
                public final void run() {
                    C1363g.b(this.f5199a, aVar, atomicBoolean2, bVar2, atomicBoolean);
                }
            }));
            atomicBoolean2.set(false);
            bVar = bVar2;
        }
    }

    public void e(Object obj, C1375h3.g gVar, U6 u62, InterfaceC6084P.b bVar) {
        synchronized (this.f5235a) {
            try {
                C1375h3.g gVarK = k(obj);
                if (gVarK == null) {
                    this.f5236b.put(obj, gVar);
                    this.f5237c.put(gVar, new b(obj, new S6(), u62, bVar));
                } else {
                    b bVar2 = (b) AbstractC6614a.i((b) this.f5237c.get(gVarK));
                    bVar2.f5242d = u62;
                    bVar2.f5243e = bVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void f(C1375h3.g gVar, int i10, a aVar) {
        synchronized (this.f5235a) {
            try {
                b bVar = (b) this.f5237c.get(gVar);
                if (bVar != null) {
                    bVar.f5246h = bVar.f5246h.b().a(i10).f();
                    bVar.f5241c.add(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void h(final C1375h3.g gVar) {
        synchronized (this.f5235a) {
            try {
                b bVar = (b) this.f5237c.get(gVar);
                if (bVar == null) {
                    return;
                }
                final InterfaceC6084P.b bVar2 = bVar.f5246h;
                bVar.f5246h = InterfaceC6084P.b.f56604b;
                bVar.f5241c.add(new a() { // from class: E3.c
                    @Override // E3.C1363g.a
                    public final com.google.common.util.concurrent.p run() {
                        return C1363g.c(this.f5168a, gVar, bVar2);
                    }
                });
                if (bVar.f5245g) {
                    return;
                }
                bVar.f5245g = true;
                g(bVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public InterfaceC6084P.b i(C1375h3.g gVar) {
        synchronized (this.f5235a) {
            try {
                b bVar = (b) this.f5237c.get(gVar);
                if (bVar == null) {
                    return null;
                }
                return bVar.f5243e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public AbstractC2011u j() {
        AbstractC2011u abstractC2011uW;
        synchronized (this.f5235a) {
            abstractC2011uW = AbstractC2011u.w(this.f5236b.values());
        }
        return abstractC2011uW;
    }

    public C1375h3.g k(Object obj) {
        C1375h3.g gVar;
        synchronized (this.f5235a) {
            gVar = (C1375h3.g) this.f5236b.get(obj);
        }
        return gVar;
    }

    public C6082N l(C1375h3.g gVar) {
        synchronized (this.f5235a) {
            try {
                b bVar = (b) this.f5237c.get(gVar);
                if (bVar == null) {
                    return null;
                }
                return bVar.f5247i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public M6 m(C1375h3.g gVar) {
        synchronized (this.f5235a) {
            try {
                b bVar = (b) this.f5237c.get(gVar);
                if (bVar == null) {
                    return null;
                }
                return bVar.f5248j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public S6 n(C1375h3.g gVar) {
        b bVar;
        synchronized (this.f5235a) {
            bVar = (b) this.f5237c.get(gVar);
        }
        if (bVar != null) {
            return bVar.f5240b;
        }
        return null;
    }

    public S6 o(Object obj) {
        b bVar;
        synchronized (this.f5235a) {
            try {
                C1375h3.g gVarK = k(obj);
                bVar = gVarK != null ? (b) this.f5237c.get(gVarK) : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bVar != null) {
            return bVar.f5240b;
        }
        return null;
    }

    public boolean p(C1375h3.g gVar) {
        boolean z10;
        synchronized (this.f5235a) {
            z10 = this.f5237c.get(gVar) != null;
        }
        return z10;
    }

    public boolean q(C1375h3.g gVar, int i10) {
        b bVar;
        synchronized (this.f5235a) {
            bVar = (b) this.f5237c.get(gVar);
        }
        I3 i32 = (I3) this.f5238d.get();
        return bVar != null && bVar.f5243e.c(i10) && i32 != null && i32.j0().p0().c(i10);
    }

    public boolean r(C1375h3.g gVar, int i10) {
        b bVar;
        synchronized (this.f5235a) {
            bVar = (b) this.f5237c.get(gVar);
        }
        return bVar != null && bVar.f5242d.b(i10);
    }

    public boolean s(C1375h3.g gVar, T6 t62) {
        b bVar;
        synchronized (this.f5235a) {
            bVar = (b) this.f5237c.get(gVar);
        }
        return bVar != null && bVar.f5242d.c(t62);
    }

    public void t(final C1375h3.g gVar) {
        synchronized (this.f5235a) {
            try {
                b bVar = (b) this.f5237c.remove(gVar);
                if (bVar == null) {
                    return;
                }
                this.f5236b.remove(bVar.f5239a);
                bVar.f5240b.d();
                final I3 i32 = (I3) this.f5238d.get();
                if (i32 == null || i32.t0()) {
                    return;
                }
                t2.a0.g1(i32.X(), new Runnable() { // from class: E3.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1363g.d(i32, gVar);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void u(Object obj) {
        C1375h3.g gVarK = k(obj);
        if (gVarK != null) {
            t(gVarK);
        }
    }

    public void v(C1375h3.g gVar, C6082N c6082n, InterfaceC6084P.b bVar) {
        synchronized (this.f5235a) {
            try {
                b bVar2 = (b) this.f5237c.get(gVar);
                if (bVar2 != null) {
                    bVar2.f5247i = c6082n;
                    bVar2.f5244f = bVar;
                    bVar2.f5248j = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void w(C1375h3.g gVar, M6 m62) {
        synchronized (this.f5235a) {
            try {
                b bVar = (b) this.f5237c.get(gVar);
                if (bVar != null) {
                    AbstractC6614a.i(bVar.f5247i);
                    bVar.f5248j = m62;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
