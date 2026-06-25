package Pf;

import Gf.C1627p;
import Gf.InterfaceC1623n;
import Gf.h1;
import Gf.r;
import Lf.AbstractC1895b;
import Lf.B;
import Lf.C;
import Td.L;
import ae.AbstractC2605b;
import ie.InterfaceC5096o;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class j {

    /* JADX INFO: renamed from: c */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f13959c = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d */
    private static final /* synthetic */ AtomicLongFieldUpdater f13960d = AtomicLongFieldUpdater.newUpdater(j.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f13961e = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f */
    private static final /* synthetic */ AtomicLongFieldUpdater f13962f = AtomicLongFieldUpdater.newUpdater(j.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f13963g = AtomicIntegerFieldUpdater.newUpdater(j.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a */
    private final int f13964a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC5096o f13965b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class a extends AbstractC5502p implements Function2 {

        /* JADX INFO: renamed from: a */
        public static final a f13966a = new a();

        a() {
            super(2, l.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return j(((Number) obj).longValue(), (m) obj2);
        }

        public final m j(long j10, m mVar) {
            return l.j(j10, mVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class b extends AbstractC5502p implements Function2 {

        /* JADX INFO: renamed from: a */
        public static final b f13967a = new b();

        b() {
            super(2, l.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return j(((Number) obj).longValue(), (m) obj2);
        }

        public final m j(long j10, m mVar) {
            return l.j(j10, mVar);
        }
    }

    public j(int i10, int i11) {
        this.f13964a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        }
        if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        m mVar = new m(0L, null, 2);
        this.head$volatile = mVar;
        this.tail$volatile = mVar;
        this._availablePermits$volatile = i10 - i11;
        this.f13965b = new InterfaceC5096o() { // from class: Pf.i
            @Override // ie.InterfaceC5096o
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return j.s(this.f13958a, (Throwable) obj, (L) obj2, (Zd.i) obj3);
            }
        };
    }

    private final Object i(Zd.e eVar) {
        C1627p c1627pB = r.b(AbstractC2605b.c(eVar));
        try {
            if (!j(c1627pB)) {
                h(c1627pB);
            }
            Object objV = c1627pB.v();
            if (objV == AbstractC2605b.f()) {
                kotlin.coroutines.jvm.internal.h.c(eVar);
            }
            return objV == AbstractC2605b.f() ? objV : L.f17438a;
        } catch (Throwable th2) {
            c1627pB.M();
            throw th2;
        }
    }

    public final boolean j(h1 h1Var) {
        Object objC;
        m mVar = (m) f13961e.get(this);
        long andIncrement = f13962f.getAndIncrement(this);
        a aVar = a.f13966a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13961e;
        long j10 = andIncrement / ((long) l.f13973f);
        loop0: while (true) {
            objC = AbstractC1895b.c(mVar, j10, aVar);
            if (!C.c(objC)) {
                B b10 = C.b(objC);
                while (true) {
                    B b11 = (B) atomicReferenceFieldUpdater.get(this);
                    if (b11.f11547c >= b10.f11547c) {
                        break loop0;
                    }
                    if (!b10.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, b11, b10)) {
                        if (b11.p()) {
                            b11.n();
                        }
                    } else if (b10.p()) {
                        b10.n();
                    }
                }
            } else {
                break;
            }
        }
        m mVar2 = (m) C.b(objC);
        int i10 = (int) (andIncrement % ((long) l.f13973f));
        if (If.l.a(mVar2.v(), i10, null, h1Var)) {
            h1Var.c(mVar2, i10);
            return true;
        }
        if (!If.l.a(mVar2.v(), i10, l.f13969b, l.f13970c)) {
            return false;
        }
        if (h1Var instanceof InterfaceC1623n) {
            AbstractC5504s.f(h1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((InterfaceC1623n) h1Var).I(L.f17438a, this.f13965b);
            return true;
        }
        throw new IllegalStateException(("unexpected: " + h1Var).toString());
    }

    private final void k() {
        int i10;
        do {
            i10 = f13963g.get(this);
            if (i10 <= this.f13964a) {
                return;
            }
        } while (!f13963g.compareAndSet(this, i10, this.f13964a));
    }

    private final int l() {
        int andDecrement;
        do {
            andDecrement = f13963g.getAndDecrement(this);
        } while (andDecrement > this.f13964a);
        return andDecrement;
    }

    public static final L s(j jVar, Throwable th2, L l10, Zd.i iVar) {
        jVar.a();
        return L.f17438a;
    }

    private final boolean u(Object obj) {
        if (!(obj instanceof InterfaceC1623n)) {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC1623n interfaceC1623n = (InterfaceC1623n) obj;
        Object objV = interfaceC1623n.V(L.f17438a, null, this.f13965b);
        if (objV == null) {
            return false;
        }
        interfaceC1623n.U(objV);
        return true;
    }

    private final boolean v() {
        Object objC;
        m mVar = (m) f13959c.get(this);
        long andIncrement = f13960d.getAndIncrement(this);
        long j10 = andIncrement / ((long) l.f13973f);
        b bVar = b.f13967a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13959c;
        loop0: while (true) {
            objC = AbstractC1895b.c(mVar, j10, bVar);
            if (C.c(objC)) {
                break;
            }
            B b10 = C.b(objC);
            while (true) {
                B b11 = (B) atomicReferenceFieldUpdater.get(this);
                if (b11.f11547c >= b10.f11547c) {
                    break loop0;
                }
                if (!b10.u()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, b11, b10)) {
                    if (b11.p()) {
                        b11.n();
                    }
                } else if (b10.p()) {
                    b10.n();
                }
            }
        }
        m mVar2 = (m) C.b(objC);
        mVar2.c();
        if (mVar2.f11547c > j10) {
            return false;
        }
        int i10 = (int) (andIncrement % ((long) l.f13973f));
        Object andSet = mVar2.v().getAndSet(i10, l.f13969b);
        if (andSet != null) {
            if (andSet == l.f13972e) {
                return false;
            }
            return u(andSet);
        }
        int i11 = l.f13968a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (mVar2.v().get(i10) == l.f13970c) {
                return true;
            }
        }
        return !If.l.a(mVar2.v(), i10, l.f13969b, l.f13971d);
    }

    public final void a() {
        do {
            int andIncrement = f13963g.getAndIncrement(this);
            if (andIncrement >= this.f13964a) {
                k();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f13964a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!v());
    }

    public final Object b(Zd.e eVar) {
        if (l() > 0) {
            return L.f17438a;
        }
        Object objI = i(eVar);
        return objI == AbstractC2605b.f() ? objI : L.f17438a;
    }

    protected final void h(InterfaceC1623n interfaceC1623n) {
        while (l() <= 0) {
            AbstractC5504s.f(interfaceC1623n, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (j((h1) interfaceC1623n)) {
                return;
            }
        }
        interfaceC1623n.I(L.f17438a, this.f13965b);
    }

    public final int m() {
        return Math.max(f13963g.get(this), 0);
    }

    public final boolean t() {
        while (true) {
            int i10 = f13963g.get(this);
            if (i10 > this.f13964a) {
                k();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (f13963g.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }
}
