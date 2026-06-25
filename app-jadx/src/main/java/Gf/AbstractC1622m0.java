package Gf;

import Gf.Y;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: renamed from: Gf.m0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1622m0 extends AbstractC1624n0 implements Y {

    /* JADX INFO: renamed from: f */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7590f = AtomicReferenceFieldUpdater.newUpdater(AbstractC1622m0.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: g */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7591g = AtomicReferenceFieldUpdater.newUpdater(AbstractC1622m0.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: h */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f7592h = AtomicIntegerFieldUpdater.newUpdater(AbstractC1622m0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: Gf.m0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class a extends c {

        /* JADX INFO: renamed from: c */
        private final InterfaceC1623n f7593c;

        public a(long j10, InterfaceC1623n interfaceC1623n) {
            super(j10);
            this.f7593c = interfaceC1623n;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7593c.N(AbstractC1622m0.this, Td.L.f17438a);
        }

        @Override // Gf.AbstractC1622m0.c
        public String toString() {
            return super.toString() + this.f7593c;
        }
    }

    /* JADX INFO: renamed from: Gf.m0$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b extends c {

        /* JADX INFO: renamed from: c */
        private final Runnable f7595c;

        public b(long j10, Runnable runnable) {
            super(j10);
            this.f7595c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7595c.run();
        }

        @Override // Gf.AbstractC1622m0.c
        public String toString() {
            return super.toString() + this.f7595c;
        }
    }

    /* JADX INFO: renamed from: Gf.m0$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class c implements Runnable, Comparable, InterfaceC1612h0, Lf.O {
        private volatile Object _heap;

        /* JADX INFO: renamed from: a */
        public long f7596a;

        /* JADX INFO: renamed from: b */
        private int f7597b = -1;

        public c(long j10) {
            this.f7596a = j10;
        }

        @Override // Lf.O
        public Lf.N b() {
            Object obj = this._heap;
            if (obj instanceof Lf.N) {
                return (Lf.N) obj;
            }
            return null;
        }

        @Override // Lf.O
        public void c(Lf.N n10) {
            if (this._heap == AbstractC1628p0.f7605a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = n10;
        }

        @Override // Gf.InterfaceC1612h0
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == AbstractC1628p0.f7605a) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.h(this);
                    }
                    this._heap = AbstractC1628p0.f7605a;
                    Td.L l10 = Td.L.f17438a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // Lf.O
        public int getIndex() {
            return this.f7597b;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: h */
        public int compareTo(c cVar) {
            long j10 = this.f7596a - cVar.f7596a;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        public final int k(long j10, d dVar, AbstractC1622m0 abstractC1622m0) {
            synchronized (this) {
                if (this._heap == AbstractC1628p0.f7605a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c cVar = (c) dVar.b();
                        if (abstractC1622m0.j()) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f7598c = j10;
                        } else {
                            long j11 = cVar.f7596a;
                            if (j11 - j10 < 0) {
                                j10 = j11;
                            }
                            if (j10 - dVar.f7598c > 0) {
                                dVar.f7598c = j10;
                            }
                        }
                        long j12 = this.f7596a;
                        long j13 = dVar.f7598c;
                        if (j12 - j13 < 0) {
                            this.f7596a = j13;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public final boolean m(long j10) {
            return j10 - this.f7596a >= 0;
        }

        @Override // Lf.O
        public void setIndex(int i10) {
            this.f7597b = i10;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f7596a + ']';
        }
    }

    /* JADX INFO: renamed from: Gf.m0$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends Lf.N {

        /* JADX INFO: renamed from: c */
        public long f7598c;

        public d(long j10) {
            this.f7598c = j10;
        }
    }

    private final void A2() {
        c cVar;
        AbstractC1601c.a();
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f7591g.get(this);
            if (dVar == null || (cVar = (c) dVar.j()) == null) {
                return;
            } else {
                o2(jNanoTime, cVar);
            }
        }
    }

    private final int D2(long j10, c cVar) {
        if (j()) {
            return 1;
        }
        d dVar = (d) f7591g.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.b.a(f7591g, this, null, new d(j10));
            Object obj = f7591g.get(this);
            AbstractC5504s.e(obj);
            dVar = (d) obj;
        }
        return cVar.k(j10, dVar, this);
    }

    private final void F2(boolean z10) {
        f7592h.set(this, z10 ? 1 : 0);
    }

    private final boolean G2(c cVar) {
        d dVar = (d) f7591g.get(this);
        return (dVar != null ? (c) dVar.f() : null) == cVar;
    }

    public final boolean j() {
        return f7592h.get(this) == 1;
    }

    private final void r2() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7590f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f7590f, this, null, AbstractC1628p0.f7606b)) {
                    return;
                }
            } else if (obj instanceof Lf.r) {
                ((Lf.r) obj).d();
                return;
            } else {
                if (obj == AbstractC1628p0.f7606b) {
                    return;
                }
                Lf.r rVar = new Lf.r(8, true);
                AbstractC5504s.f(obj, "null cannot be cast to non-null type java.lang.Runnable");
                rVar.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f7590f, this, obj, rVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable s2() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7590f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof Lf.r) {
                AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                Lf.r rVar = (Lf.r) obj;
                Object objM = rVar.m();
                if (objM != Lf.r.f11594h) {
                    return (Runnable) objM;
                }
                androidx.concurrent.futures.b.a(f7590f, this, obj, rVar.l());
            } else {
                if (obj == AbstractC1628p0.f7606b) {
                    return null;
                }
                if (androidx.concurrent.futures.b.a(f7590f, this, obj, null)) {
                    AbstractC5504s.f(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final void u2() {
        Lf.O oI;
        d dVar = (d) f7591g.get(this);
        if (dVar == null || dVar.e()) {
            return;
        }
        AbstractC1601c.a();
        long jNanoTime = System.nanoTime();
        do {
            synchronized (dVar) {
                try {
                    Lf.O oB = dVar.b();
                    if (oB != null) {
                        c cVar = (c) oB;
                        oI = cVar.m(jNanoTime) ? v2(cVar) : false ? dVar.i(0) : null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (((c) oI) != null);
    }

    private final boolean v2(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7590f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (j()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f7590f, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof Lf.r) {
                AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                Lf.r rVar = (Lf.r) obj;
                int iA = rVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    androidx.concurrent.futures.b.a(f7590f, this, obj, rVar.l());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == AbstractC1628p0.f7606b) {
                    return false;
                }
                Lf.r rVar2 = new Lf.r(8, true);
                AbstractC5504s.f(obj, "null cannot be cast to non-null type java.lang.Runnable");
                rVar2.a((Runnable) obj);
                rVar2.a(runnable);
                if (androidx.concurrent.futures.b.a(f7590f, this, obj, rVar2)) {
                    return true;
                }
            }
        }
    }

    public InterfaceC1612h0 B0(long j10, Runnable runnable, Zd.i iVar) {
        return Y.a.a(this, j10, runnable, iVar);
    }

    protected final void B2() {
        f7590f.set(this, null);
        f7591g.set(this, null);
    }

    public final void C2(long j10, c cVar) {
        int iD2 = D2(j10, cVar);
        if (iD2 == 0) {
            if (G2(cVar)) {
                p2();
            }
        } else if (iD2 == 1) {
            o2(j10, cVar);
        } else if (iD2 != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    @Override // Gf.K
    public final void D1(Zd.i iVar, Runnable runnable) {
        t2(runnable);
    }

    protected final InterfaceC1612h0 E2(long j10, Runnable runnable) {
        long jC = AbstractC1628p0.c(j10);
        if (jC >= 4611686018427387903L) {
            return P0.f7528a;
        }
        AbstractC1601c.a();
        long jNanoTime = System.nanoTime();
        b bVar = new b(jC + jNanoTime, runnable);
        C2(jNanoTime, bVar);
        return bVar;
    }

    @Override // Gf.Y
    public void G0(long j10, InterfaceC1623n interfaceC1623n) {
        long jC = AbstractC1628p0.c(j10);
        if (jC < 4611686018427387903L) {
            AbstractC1601c.a();
            long jNanoTime = System.nanoTime();
            a aVar = new a(jC + jNanoTime, interfaceC1623n);
            C2(jNanoTime, aVar);
            r.a(interfaceC1623n, aVar);
        }
    }

    @Override // Gf.AbstractC1620l0
    protected long f2() {
        c cVar;
        if (super.f2() == 0) {
            return 0L;
        }
        Object obj = f7590f.get(this);
        if (obj != null) {
            if (!(obj instanceof Lf.r)) {
                return obj == AbstractC1628p0.f7606b ? Long.MAX_VALUE : 0L;
            }
            if (!((Lf.r) obj).j()) {
                return 0L;
            }
        }
        d dVar = (d) f7591g.get(this);
        if (dVar == null || (cVar = (c) dVar.f()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = cVar.f7596a;
        AbstractC1601c.a();
        return AbstractC5874j.f(j10 - System.nanoTime(), 0L);
    }

    @Override // Gf.AbstractC1620l0
    public long k2() {
        if (l2()) {
            return 0L;
        }
        u2();
        Runnable runnableS2 = s2();
        if (runnableS2 == null) {
            return f2();
        }
        runnableS2.run();
        return 0L;
    }

    @Override // Gf.AbstractC1620l0
    public void shutdown() {
        Z0.f7544a.c();
        F2(true);
        r2();
        while (k2() <= 0) {
        }
        A2();
    }

    public void t2(Runnable runnable) {
        u2();
        if (v2(runnable)) {
            p2();
        } else {
            U.f7538i.t2(runnable);
        }
    }

    protected boolean z2() {
        if (!j2()) {
            return false;
        }
        d dVar = (d) f7591g.get(this);
        if (dVar != null && !dVar.e()) {
            return false;
        }
        Object obj = f7590f.get(this);
        if (obj == null) {
            return true;
        }
        return obj instanceof Lf.r ? ((Lf.r) obj).j() : obj == AbstractC1628p0.f7606b;
    }
}
