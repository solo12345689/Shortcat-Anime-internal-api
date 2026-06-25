package If;

import Gf.C1627p;
import Gf.InterfaceC1623n;
import Gf.h1;
import Lf.AbstractC1895b;
import Lf.AbstractC1896c;
import Lf.AbstractC1904k;
import Lf.B;
import Lf.C;
import Lf.D;
import Lf.Q;
import Td.AbstractC2156g;
import Td.L;
import Td.u;
import ae.AbstractC2605b;
import ie.InterfaceC5096o;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6018h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class e implements g {

    /* JADX INFO: renamed from: d */
    private static final /* synthetic */ AtomicLongFieldUpdater f9124d = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: e */
    private static final /* synthetic */ AtomicLongFieldUpdater f9125e = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* JADX INFO: renamed from: f */
    private static final /* synthetic */ AtomicLongFieldUpdater f9126f = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: g */
    private static final /* synthetic */ AtomicLongFieldUpdater f9127g = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: h */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9128h = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: i */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9129i = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: j */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9130j = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9131k = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: l */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9132l = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: a */
    private final int f9133a;

    /* JADX INFO: renamed from: b */
    public final Function1 f9134b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* JADX INFO: renamed from: c */
    private final InterfaceC5096o f9135c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class a implements i, h1 {

        /* JADX INFO: renamed from: a */
        private Object f9136a = f.f9154p;

        /* JADX INFO: renamed from: b */
        private C1627p f9137b;

        public a() {
        }

        private final Object f(m mVar, int i10, long j10, Zd.e eVar) throws Throwable {
            Boolean boolA;
            Function1 function1;
            m mVarQ;
            e eVar2 = e.this;
            C1627p c1627pB = Gf.r.b(AbstractC2605b.c(eVar));
            try {
                this.f9137b = c1627pB;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                Object objW0 = eVar2.W0(mVar, i10, j10, this);
                if (objW0 == f.f9151m) {
                    eVar2.G0(this, mVar, i10);
                } else {
                    InterfaceC5096o interfaceC5096oC = null;
                    if (objW0 == f.f9153o) {
                        if (j10 < eVar2.f0()) {
                            mVar.c();
                        }
                        m mVar2 = (m) e.Z().get(eVar2);
                        while (true) {
                            if (eVar2.n0()) {
                                h();
                                break;
                            }
                            long andIncrement = e.a0().getAndIncrement(eVar2);
                            int i11 = f.f9140b;
                            long j11 = andIncrement / ((long) i11);
                            int i12 = (int) (andIncrement % ((long) i11));
                            if (mVar2.f11547c != j11) {
                                mVarQ = eVar2.Q(j11, mVar2);
                                if (mVarQ == null) {
                                }
                            } else {
                                mVarQ = mVar2;
                            }
                            objW0 = eVar2.W0(mVarQ, i12, andIncrement, this);
                            if (objW0 == f.f9151m) {
                                eVar2.G0(this, mVarQ, i12);
                                break;
                            }
                            if (objW0 == f.f9153o) {
                                if (andIncrement < eVar2.f0()) {
                                    mVarQ.c();
                                }
                                mVar2 = mVarQ;
                            } else {
                                if (objW0 == f.f9152n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                mVarQ.c();
                                this.f9136a = objW0;
                                this.f9137b = null;
                                boolA = kotlin.coroutines.jvm.internal.b.a(true);
                                function1 = eVar2.f9134b;
                                if (function1 != null) {
                                }
                            }
                        }
                    } else {
                        mVar.c();
                        this.f9136a = objW0;
                        this.f9137b = null;
                        boolA = kotlin.coroutines.jvm.internal.b.a(true);
                        function1 = eVar2.f9134b;
                        if (function1 != null) {
                            interfaceC5096oC = eVar2.C(function1, objW0);
                        }
                        c1627pB.I(boolA, interfaceC5096oC);
                    }
                }
                Object objV = c1627pB.v();
                if (objV == AbstractC2605b.f()) {
                    kotlin.coroutines.jvm.internal.h.c(eVar);
                }
                return objV;
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                c1627pB.M();
                throw th4;
            }
        }

        private final boolean g() throws Throwable {
            this.f9136a = f.z();
            Throwable thV = e.this.V();
            if (thV == null) {
                return false;
            }
            throw D.a(thV);
        }

        public final void h() {
            C1627p c1627p = this.f9137b;
            AbstractC5504s.e(c1627p);
            this.f9137b = null;
            this.f9136a = f.z();
            Throwable thV = e.this.V();
            if (thV == null) {
                u.a aVar = Td.u.f17466b;
                c1627p.resumeWith(Td.u.b(Boolean.FALSE));
            } else {
                u.a aVar2 = Td.u.f17466b;
                c1627p.resumeWith(Td.u.b(Td.v.a(thV)));
            }
        }

        @Override // If.i
        public Object a(Zd.e eVar) throws Throwable {
            m mVarQ;
            boolean zG = true;
            if (this.f9136a == f.f9154p || this.f9136a == f.z()) {
                e eVar2 = e.this;
                m mVar = (m) e.Z().get(eVar2);
                while (!eVar2.n0()) {
                    long andIncrement = e.a0().getAndIncrement(eVar2);
                    int i10 = f.f9140b;
                    long j10 = andIncrement / ((long) i10);
                    int i11 = (int) (andIncrement % ((long) i10));
                    if (mVar.f11547c != j10) {
                        mVarQ = eVar2.Q(j10, mVar);
                        if (mVarQ == null) {
                            continue;
                        }
                    } else {
                        mVarQ = mVar;
                    }
                    Object objW0 = eVar2.W0(mVarQ, i11, andIncrement, null);
                    if (objW0 == f.f9151m) {
                        throw new IllegalStateException("unreachable");
                    }
                    if (objW0 == f.f9153o) {
                        if (andIncrement < eVar2.f0()) {
                            mVarQ.c();
                        }
                        mVar = mVarQ;
                    } else {
                        if (objW0 == f.f9152n) {
                            return f(mVarQ, i11, andIncrement, eVar);
                        }
                        mVarQ.c();
                        this.f9136a = objW0;
                    }
                }
                zG = g();
            }
            return kotlin.coroutines.jvm.internal.b.a(zG);
        }

        @Override // Gf.h1
        public void c(B b10, int i10) {
            C1627p c1627p = this.f9137b;
            if (c1627p != null) {
                c1627p.c(b10, i10);
            }
        }

        public final boolean i(Object obj) {
            C1627p c1627p = this.f9137b;
            AbstractC5504s.e(c1627p);
            this.f9137b = null;
            this.f9136a = obj;
            Boolean bool = Boolean.TRUE;
            e eVar = e.this;
            Function1 function1 = eVar.f9134b;
            return f.B(c1627p, bool, function1 != null ? eVar.C(function1, obj) : null);
        }

        public final void j() {
            C1627p c1627p = this.f9137b;
            AbstractC5504s.e(c1627p);
            this.f9137b = null;
            this.f9136a = f.z();
            Throwable thV = e.this.V();
            if (thV == null) {
                u.a aVar = Td.u.f17466b;
                c1627p.resumeWith(Td.u.b(Boolean.FALSE));
            } else {
                u.a aVar2 = Td.u.f17466b;
                c1627p.resumeWith(Td.u.b(Td.v.a(thV)));
            }
        }

        @Override // If.i
        public Object next() throws Throwable {
            Object obj = this.f9136a;
            if (obj == f.f9154p) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.f9136a = f.f9154p;
            if (obj != f.z()) {
                return obj;
            }
            throw D.a(e.this.Y());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class b extends AbstractC5502p implements InterfaceC5096o {
        b(Object obj) {
            super(3, obj, e.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            j((Throwable) obj, obj2, (Zd.i) obj3);
            return L.f17438a;
        }

        public final void j(Throwable th2, Object obj, Zd.i iVar) {
            ((e) this.receiver).x0(th2, obj, iVar);
        }
    }

    public e(int i10, Function1 function1) {
        this.f9133a = i10;
        this.f9134b = function1;
        if (i10 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = f.A(i10);
        this.completedExpandBuffersAndPauseFlag$volatile = T();
        m mVar = new m(0L, null, this, 3);
        this.sendSegment$volatile = mVar;
        this.receiveSegment$volatile = mVar;
        if (r0()) {
            mVar = f.f9139a;
            AbstractC5504s.f(mVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = mVar;
        this.f9135c = function1 != null ? new InterfaceC5096o() { // from class: If.b
            @Override // ie.InterfaceC5096o
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                e eVar = this.f9119a;
                android.support.v4.media.session.b.a(obj);
                return e.E0(eVar, null, obj2, obj3);
            }
        } : null;
        this._closeCause$volatile = f.f9157s;
    }

    private final Object A0(Object obj, Zd.e eVar) {
        Q qC;
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p.C();
        Function1 function1 = this.f9134b;
        if (function1 == null || (qC = Lf.x.c(function1, obj, null, 2, null)) == null) {
            Throwable thC0 = c0();
            u.a aVar = Td.u.f17466b;
            c1627p.resumeWith(Td.u.b(Td.v.a(thC0)));
        } else {
            AbstractC2156g.a(qC, c0());
            u.a aVar2 = Td.u.f17466b;
            c1627p.resumeWith(Td.u.b(Td.v.a(qC)));
        }
        Object objV = c1627p.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV == AbstractC2605b.f() ? objV : L.f17438a;
    }

    public final void B0(Object obj, InterfaceC1623n interfaceC1623n) {
        Function1 function1 = this.f9134b;
        if (function1 != null) {
            Lf.x.a(function1, obj, interfaceC1623n.getContext());
        }
        Throwable thC0 = c0();
        u.a aVar = Td.u.f17466b;
        interfaceC1623n.resumeWith(Td.u.b(Td.v.a(thC0)));
    }

    public final InterfaceC5096o C(final Function1 function1, final Object obj) {
        return new InterfaceC5096o() { // from class: If.c
            @Override // ie.InterfaceC5096o
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                return e.E(function1, obj, (Throwable) obj2, obj3, (Zd.i) obj4);
            }
        };
    }

    public final InterfaceC6018h D(Function1 function1) {
        return new b(this);
    }

    public static final L E(Function1 function1, Object obj, Throwable th2, Object obj2, Zd.i iVar) {
        Lf.x.a(function1, obj, iVar);
        return L.f17438a;
    }

    public static final InterfaceC5096o E0(final e eVar, final Of.a aVar, Object obj, final Object obj2) {
        return new InterfaceC5096o(obj2, eVar, aVar) { // from class: If.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f9122a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f9123b;

            @Override // ie.InterfaceC5096o
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return e.F0(this.f9122a, this.f9123b, null, (Throwable) obj3, obj4, (Zd.i) obj5);
            }
        };
    }

    private final boolean F(long j10) {
        return j10 < T() || j10 < b0() + ((long) this.f9133a);
    }

    public static final L F0(Object obj, e eVar, Of.a aVar, Throwable th2, Object obj2, Zd.i iVar) {
        if (obj != f.z()) {
            Lf.x.a(eVar.f9134b, obj, aVar.getContext());
        }
        return L.f17438a;
    }

    public final void G0(h1 h1Var, m mVar, int i10) {
        D0();
        h1Var.c(mVar, i10);
    }

    private final void H(m mVar, long j10) {
        Object objB = AbstractC1904k.b(null, 1, null);
        loop0: while (mVar != null) {
            for (int i10 = f.f9140b - 1; -1 < i10; i10--) {
                if ((mVar.f11547c * ((long) f.f9140b)) + ((long) i10) < j10) {
                    break loop0;
                }
                while (true) {
                    Object objB2 = mVar.B(i10);
                    if (objB2 != null && objB2 != f.f9143e) {
                        if (!(objB2 instanceof x)) {
                            if (!(objB2 instanceof h1)) {
                                break;
                            }
                            if (mVar.v(i10, objB2, f.z())) {
                                objB = AbstractC1904k.c(objB, objB2);
                                mVar.C(i10, true);
                                break;
                            }
                        } else {
                            if (mVar.v(i10, objB2, f.z())) {
                                objB = AbstractC1904k.c(objB, ((x) objB2).f9176a);
                                mVar.C(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (mVar.v(i10, objB2, f.z())) {
                            mVar.t();
                            break;
                        }
                    }
                }
            }
            mVar = (m) mVar.h();
        }
        if (objB != null) {
            if (!(objB instanceof ArrayList)) {
                L0((h1) objB);
                return;
            }
            AbstractC5504s.f(objB, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) objB;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                L0((h1) arrayList.get(size));
            }
        }
    }

    public final void H0(h1 h1Var, m mVar, int i10) {
        h1Var.c(mVar, i10 + f.f9140b);
    }

    private final m I() {
        Object obj = f9130j.get(this);
        m mVar = (m) f9128h.get(this);
        if (mVar.f11547c > ((m) obj).f11547c) {
            obj = mVar;
        }
        m mVar2 = (m) f9129i.get(this);
        if (mVar2.f11547c > ((m) obj).f11547c) {
            obj = mVar2;
        }
        return (m) AbstractC1895b.b((AbstractC1896c) obj);
    }

    static /* synthetic */ Object I0(e eVar, Zd.e eVar2) throws Throwable {
        m mVar;
        m mVar2 = (m) Z().get(eVar);
        while (!eVar.n0()) {
            long andIncrement = a0().getAndIncrement(eVar);
            int i10 = f.f9140b;
            long j10 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (mVar2.f11547c != j10) {
                m mVarQ = eVar.Q(j10, mVar2);
                if (mVarQ == null) {
                    continue;
                } else {
                    mVar = mVarQ;
                }
            } else {
                mVar = mVar2;
            }
            e eVar3 = eVar;
            Object objW0 = eVar3.W0(mVar, i11, andIncrement, null);
            if (objW0 == f.f9151m) {
                throw new IllegalStateException("unexpected");
            }
            if (objW0 != f.f9153o) {
                if (objW0 == f.f9152n) {
                    return eVar3.J0(mVar, i11, andIncrement, eVar2);
                }
                mVar.c();
                return objW0;
            }
            if (andIncrement < eVar3.f0()) {
                mVar.c();
            }
            eVar = eVar3;
            mVar2 = mVar;
        }
        throw D.a(eVar.Y());
    }

    private final Object J0(m mVar, int i10, long j10, Zd.e eVar) {
        m mVar2;
        C1627p c1627pB = Gf.r.b(AbstractC2605b.c(eVar));
        try {
            Object objW0 = W0(mVar, i10, j10, c1627pB);
            if (objW0 == f.f9151m) {
                G0(c1627pB, mVar, i10);
            } else {
                InterfaceC6018h interfaceC6018hD = null;
                interfaceC6018hD = null;
                if (objW0 == f.f9153o) {
                    if (j10 < f0()) {
                        mVar.c();
                    }
                    m mVar3 = (m) Z().get(this);
                    while (true) {
                        if (n0()) {
                            z0(c1627pB);
                            break;
                        }
                        long andIncrement = a0().getAndIncrement(this);
                        int i11 = f.f9140b;
                        long j11 = andIncrement / ((long) i11);
                        int i12 = (int) (andIncrement % ((long) i11));
                        if (mVar3.f11547c != j11) {
                            m mVarQ = Q(j11, mVar3);
                            if (mVarQ != null) {
                                mVar2 = mVarQ;
                            }
                        } else {
                            mVar2 = mVar3;
                        }
                        objW0 = W0(mVar2, i12, andIncrement, c1627pB);
                        m mVar4 = mVar2;
                        if (objW0 == f.f9151m) {
                            C1627p c1627p = c1627pB != null ? c1627pB : null;
                            if (c1627p != null) {
                                G0(c1627p, mVar4, i12);
                            }
                        } else if (objW0 == f.f9153o) {
                            if (andIncrement < f0()) {
                                mVar4.c();
                            }
                            mVar3 = mVar4;
                        } else {
                            if (objW0 == f.f9152n) {
                                throw new IllegalStateException("unexpected");
                            }
                            mVar4.c();
                            Function1 function1 = this.f9134b;
                            if (function1 != null) {
                                interfaceC6018hD = D(function1);
                            }
                        }
                    }
                } else {
                    mVar.c();
                    Function1 function12 = this.f9134b;
                    if (function12 != null) {
                        interfaceC6018hD = D(function12);
                    }
                }
                c1627pB.I(objW0, (InterfaceC5096o) interfaceC6018hD);
            }
            Object objV = c1627pB.v();
            if (objV == AbstractC2605b.f()) {
                kotlin.coroutines.jvm.internal.h.c(eVar);
            }
            return objV;
        } catch (Throwable th2) {
            c1627pB.M();
            throw th2;
        }
    }

    private final void K(long j10) {
        K0(L(j10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x00b3, code lost:
    
        r12 = (If.m) r12.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void K0(If.m r12) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: If.e.K0(If.m):void");
    }

    private final m L(long j10) {
        m mVarI = I();
        if (q0()) {
            long jS0 = s0(mVarI);
            if (jS0 != -1) {
                N(jS0);
            }
        }
        H(mVarI, j10);
        return mVarI;
    }

    private final void L0(h1 h1Var) {
        N0(h1Var, true);
    }

    private final void M() {
        m();
    }

    private final void M0(h1 h1Var) {
        N0(h1Var, false);
    }

    private final void N0(h1 h1Var, boolean z10) {
        if (h1Var instanceof InterfaceC1623n) {
            Zd.e eVar = (Zd.e) h1Var;
            u.a aVar = Td.u.f17466b;
            eVar.resumeWith(Td.u.b(Td.v.a(z10 ? Y() : c0())));
        } else {
            if (h1Var instanceof a) {
                ((a) h1Var).j();
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + h1Var).toString());
        }
    }

    private final void O() {
        if (r0()) {
            return;
        }
        m mVar = (m) f9130j.get(this);
        while (true) {
            long andIncrement = f9126f.getAndIncrement(this);
            int i10 = f.f9140b;
            long j10 = andIncrement / ((long) i10);
            if (f0() <= andIncrement) {
                if (mVar.f11547c < j10 && mVar.f() != null) {
                    w0(j10, mVar);
                }
                j0(this, 0L, 1, null);
                return;
            }
            if (mVar.f11547c != j10) {
                m mVarP = P(j10, mVar, andIncrement);
                if (mVarP == null) {
                    continue;
                } else {
                    mVar = mVarP;
                }
            }
            if (U0(mVar, (int) (andIncrement % ((long) i10)), andIncrement)) {
                j0(this, 0L, 1, null);
                return;
            }
            j0(this, 0L, 1, null);
        }
    }

    static /* synthetic */ Object O0(e eVar, Object obj, Zd.e eVar2) {
        m mVar;
        m mVar2 = (m) d0().get(eVar);
        while (true) {
            long andIncrement = e0().getAndIncrement(eVar);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zP0 = eVar.p0(andIncrement);
            int i10 = f.f9140b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (mVar2.f11547c != j11) {
                m mVarR = eVar.R(j11, mVar2);
                if (mVarR != null) {
                    mVar = mVarR;
                } else if (zP0) {
                    Object objA0 = eVar.A0(obj, eVar2);
                    if (objA0 == AbstractC2605b.f()) {
                        return objA0;
                    }
                }
            } else {
                mVar = mVar2;
            }
            e eVar3 = eVar;
            Object obj2 = obj;
            int iY0 = eVar3.Y0(mVar, i11, obj2, j10, null, zP0);
            if (iY0 == 0) {
                mVar.c();
                break;
            }
            if (iY0 == 1) {
                break;
            }
            if (iY0 != 2) {
                if (iY0 == 3) {
                    Object objP0 = eVar3.P0(mVar, i11, obj2, j10, eVar2);
                    if (objP0 == AbstractC2605b.f()) {
                        return objP0;
                    }
                } else if (iY0 != 4) {
                    if (iY0 == 5) {
                        mVar.c();
                    }
                    eVar = eVar3;
                    mVar2 = mVar;
                    obj = obj2;
                } else {
                    if (j10 < eVar3.b0()) {
                        mVar.c();
                    }
                    Object objA02 = eVar3.A0(obj2, eVar2);
                    if (objA02 == AbstractC2605b.f()) {
                        return objA02;
                    }
                }
            } else if (zP0) {
                mVar.t();
                Object objA03 = eVar3.A0(obj2, eVar2);
                if (objA03 == AbstractC2605b.f()) {
                    return objA03;
                }
            }
        }
        return L.f17438a;
    }

    private final m P(long j10, m mVar, long j11) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9130j;
        Function2 function2 = (Function2) f.y();
        loop0: while (true) {
            objC = AbstractC1895b.c(mVar, j10, function2);
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
        if (C.c(objC)) {
            M();
            w0(j10, mVar);
            j0(this, 0L, 1, null);
            return null;
        }
        m mVar2 = (m) C.b(objC);
        if (mVar2.f11547c <= j10) {
            return mVar2;
        }
        long j12 = mVar2.f11547c;
        int i10 = f.f9140b;
        if (f9126f.compareAndSet(this, j11 + 1, j12 * ((long) i10))) {
            i0((mVar2.f11547c * ((long) i10)) - j11);
        } else {
            j0(this, 0L, 1, null);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object P0(If.m r17, int r18, java.lang.Object r19, long r20, Zd.e r22) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: If.e.P0(If.m, int, java.lang.Object, long, Zd.e):java.lang.Object");
    }

    public final m Q(long j10, m mVar) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9129i;
        Function2 function2 = (Function2) f.y();
        loop0: while (true) {
            objC = AbstractC1895b.c(mVar, j10, function2);
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
        if (C.c(objC)) {
            M();
            if (mVar.f11547c * ((long) f.f9140b) < f0()) {
                mVar.c();
            }
            return null;
        }
        m mVar2 = (m) C.b(objC);
        if (!r0() && j10 <= T() / ((long) f.f9140b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f9130j;
            while (true) {
                B b12 = (B) atomicReferenceFieldUpdater2.get(this);
                if (b12.f11547c >= mVar2.f11547c || !mVar2.u()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, b12, mVar2)) {
                    if (b12.p()) {
                        b12.n();
                    }
                } else if (mVar2.p()) {
                    mVar2.n();
                }
            }
        }
        long j11 = mVar2.f11547c;
        if (j11 <= j10) {
            return mVar2;
        }
        int i10 = f.f9140b;
        a1(j11 * ((long) i10));
        if (mVar2.f11547c * ((long) i10) < f0()) {
            mVar2.c();
        }
        return null;
    }

    private final boolean Q0(long j10) {
        if (p0(j10)) {
            return false;
        }
        return !F(j10 & 1152921504606846975L);
    }

    public final m R(long j10, m mVar) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9128h;
        Function2 function2 = (Function2) f.y();
        loop0: while (true) {
            objC = AbstractC1895b.c(mVar, j10, function2);
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
        if (C.c(objC)) {
            M();
            if (mVar.f11547c * ((long) f.f9140b) < b0()) {
                mVar.c();
            }
            return null;
        }
        m mVar2 = (m) C.b(objC);
        long j11 = mVar2.f11547c;
        if (j11 <= j10) {
            return mVar2;
        }
        int i10 = f.f9140b;
        b1(j11 * ((long) i10));
        if (mVar2.f11547c * ((long) i10) < b0()) {
            mVar2.c();
        }
        return null;
    }

    private final boolean R0(Object obj, Object obj2) {
        if (obj instanceof a) {
            AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(obj2);
        }
        if (obj instanceof InterfaceC1623n) {
            AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC1623n interfaceC1623n = (InterfaceC1623n) obj;
            Function1 function1 = this.f9134b;
            return f.B(interfaceC1623n, obj2, (InterfaceC5096o) (function1 != null ? D(function1) : null));
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    private final boolean S0(Object obj, m mVar, int i10) {
        if (obj instanceof InterfaceC1623n) {
            AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return f.C((InterfaceC1623n) obj, L.f17438a, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    private final long T() {
        return f9126f.get(this);
    }

    private final boolean U0(m mVar, int i10, long j10) {
        Object objB = mVar.B(i10);
        if (!(objB instanceof h1) || j10 < f9125e.get(this) || !mVar.v(i10, objB, f.f9145g)) {
            return V0(mVar, i10, j10);
        }
        if (S0(objB, mVar, i10)) {
            mVar.F(i10, f.f9142d);
            return true;
        }
        mVar.F(i10, f.f9148j);
        mVar.C(i10, false);
        return false;
    }

    private final boolean V0(m mVar, int i10, long j10) {
        while (true) {
            Object objB = mVar.B(i10);
            if (objB instanceof h1) {
                if (j10 < f9125e.get(this)) {
                    if (mVar.v(i10, objB, new x((h1) objB))) {
                        return true;
                    }
                } else if (mVar.v(i10, objB, f.f9145g)) {
                    if (S0(objB, mVar, i10)) {
                        mVar.F(i10, f.f9142d);
                        return true;
                    }
                    mVar.F(i10, f.f9148j);
                    mVar.C(i10, false);
                    return false;
                }
            } else {
                if (objB == f.f9148j) {
                    return false;
                }
                if (objB == null) {
                    if (mVar.v(i10, objB, f.f9143e)) {
                        return true;
                    }
                } else {
                    if (objB == f.f9142d || objB == f.f9146h || objB == f.f9147i || objB == f.f9149k || objB == f.z()) {
                        return true;
                    }
                    if (objB != f.f9144f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objB).toString());
                    }
                }
            }
        }
    }

    public final Object W0(m mVar, int i10, long j10, Object obj) {
        Object objB = mVar.B(i10);
        if (objB == null) {
            if (j10 >= (f9124d.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return f.f9152n;
                }
                if (mVar.v(i10, objB, obj)) {
                    O();
                    return f.f9151m;
                }
            }
        } else if (objB == f.f9142d && mVar.v(i10, objB, f.f9147i)) {
            O();
            return mVar.D(i10);
        }
        return X0(mVar, i10, j10, obj);
    }

    private final Object X0(m mVar, int i10, long j10, Object obj) {
        while (true) {
            Object objB = mVar.B(i10);
            if (objB == null || objB == f.f9143e) {
                if (j10 < (f9124d.get(this) & 1152921504606846975L)) {
                    if (mVar.v(i10, objB, f.f9146h)) {
                        O();
                        return f.f9153o;
                    }
                } else {
                    if (obj == null) {
                        return f.f9152n;
                    }
                    if (mVar.v(i10, objB, obj)) {
                        O();
                        return f.f9151m;
                    }
                }
            } else {
                if (objB != f.f9142d) {
                    if (objB != f.f9148j && objB != f.f9146h) {
                        if (objB == f.z()) {
                            O();
                            return f.f9153o;
                        }
                        if (objB != f.f9145g && mVar.v(i10, objB, f.f9144f)) {
                            boolean z10 = objB instanceof x;
                            if (z10) {
                                objB = ((x) objB).f9176a;
                            }
                            if (S0(objB, mVar, i10)) {
                                mVar.F(i10, f.f9147i);
                                O();
                                return mVar.D(i10);
                            }
                            mVar.F(i10, f.f9148j);
                            mVar.C(i10, false);
                            if (z10) {
                                O();
                            }
                            return f.f9153o;
                        }
                    }
                    return f.f9153o;
                }
                if (mVar.v(i10, objB, f.f9147i)) {
                    O();
                    return mVar.D(i10);
                }
            }
        }
    }

    public final Throwable Y() {
        Throwable thV = V();
        return thV == null ? new p("Channel was closed") : thV;
    }

    public final int Y0(m mVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        mVar.G(i10, obj);
        if (z10) {
            return Z0(mVar, i10, obj, j10, obj2, z10);
        }
        Object objB = mVar.B(i10);
        if (objB == null) {
            if (F(j10)) {
                if (mVar.v(i10, null, f.f9142d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (mVar.v(i10, null, obj2)) {
                    return 2;
                }
            }
        } else if (objB instanceof h1) {
            mVar.w(i10);
            if (R0(objB, obj)) {
                mVar.F(i10, f.f9147i);
                C0();
                return 0;
            }
            if (mVar.x(i10, f.f9149k) == f.f9149k) {
                return 5;
            }
            mVar.C(i10, true);
            return 5;
        }
        return Z0(mVar, i10, obj, j10, obj2, z10);
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater Z() {
        return f9129i;
    }

    private final int Z0(m mVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        while (true) {
            Object objB = mVar.B(i10);
            if (objB == null) {
                if (!F(j10) || z10) {
                    if (z10) {
                        if (mVar.v(i10, null, f.f9148j)) {
                            mVar.C(i10, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (mVar.v(i10, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (mVar.v(i10, null, f.f9142d)) {
                    return 1;
                }
            } else {
                if (objB != f.f9143e) {
                    if (objB == f.f9149k) {
                        mVar.w(i10);
                        return 5;
                    }
                    if (objB == f.f9146h) {
                        mVar.w(i10);
                        return 5;
                    }
                    if (objB == f.z()) {
                        mVar.w(i10);
                        M();
                        return 4;
                    }
                    mVar.w(i10);
                    if (objB instanceof x) {
                        objB = ((x) objB).f9176a;
                    }
                    if (R0(objB, obj)) {
                        mVar.F(i10, f.f9147i);
                        C0();
                        return 0;
                    }
                    if (mVar.x(i10, f.f9149k) != f.f9149k) {
                        mVar.C(i10, true);
                    }
                    return 5;
                }
                if (mVar.v(i10, objB, f.f9142d)) {
                    return 1;
                }
            }
        }
    }

    public static final /* synthetic */ AtomicLongFieldUpdater a0() {
        return f9125e;
    }

    private final void a1(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9125e;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j10) {
                return;
            }
            long j12 = j10;
            if (f9125e.compareAndSet(this, j11, j12)) {
                return;
            } else {
                j10 = j12;
            }
        }
    }

    private final void b1(long j10) {
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9124d;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            j12 = 1152921504606846975L & j11;
            if (j12 >= j10) {
                return;
            }
        } while (!f9124d.compareAndSet(this, j11, f.w(j12, (int) (j11 >> 60))));
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater d0() {
        return f9128h;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater e0() {
        return f9124d;
    }

    private final void i0(long j10) {
        if ((f9127g.addAndGet(this, j10) & 4611686018427387904L) != 0) {
            while ((f9127g.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    static /* synthetic */ void j0(e eVar, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        eVar.i0(j10);
    }

    private final void k0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9132l;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? f.f9155q : f.f9156r));
        if (obj == null) {
            return;
        }
        ((Function1) obj).invoke(V());
    }

    private final boolean l0(m mVar, int i10, long j10) {
        Object objB;
        do {
            objB = mVar.B(i10);
            if (objB != null && objB != f.f9143e) {
                if (objB == f.f9142d) {
                    return true;
                }
                if (objB == f.f9148j || objB == f.z() || objB == f.f9147i || objB == f.f9146h) {
                    return false;
                }
                if (objB == f.f9145g) {
                    return true;
                }
                return objB != f.f9144f && j10 == b0();
            }
        } while (!mVar.v(i10, objB, f.f9146h));
        O();
        return false;
    }

    private final boolean m0(long j10, boolean z10) {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            L(j10 & 1152921504606846975L);
            return (z10 && h0()) ? false : true;
        }
        if (i10 == 3) {
            K(j10 & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i10).toString());
    }

    private final boolean o0(long j10) {
        return m0(j10, true);
    }

    public final boolean p0(long j10) {
        return m0(j10, false);
    }

    private final boolean r0() {
        long jT = T();
        return jT == 0 || jT == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x003c, code lost:
    
        r8 = (If.m) r8.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long s0(If.m r8) {
        /*
            r7 = this;
        L0:
            int r0 = If.f.f9140b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.f11547c
            int r5 = If.f.f9140b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.b0()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.B(r0)
            if (r1 == 0) goto L2c
            Lf.E r2 = If.f.k()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            Lf.E r2 = If.f.f9142d
            if (r1 != r2) goto L39
            return r3
        L2c:
            Lf.E r2 = If.f.z()
            boolean r1 = r8.v(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.t()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            Lf.c r8 = r8.h()
            If.m r8 = (If.m) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: If.e.s0(If.m):long");
    }

    private final void t0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9124d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, f.w(1152921504606846975L & j10, 1)));
    }

    private final void u0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9124d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, f.w(1152921504606846975L & j10, 3)));
    }

    private final void v0() {
        long j10;
        long jW;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9124d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 >> 60);
            if (i10 == 0) {
                jW = f.w(1152921504606846975L & j10, 2);
            } else if (i10 != 1) {
                return;
            } else {
                jW = f.w(1152921504606846975L & j10, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, jW));
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void w0(long r5, If.m r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f11547c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            Lf.c r0 = r7.f()
            If.m r0 = (If.m) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.k()
            if (r5 == 0) goto L22
            Lf.c r5 = r7.f()
            If.m r5 = (If.m) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = U()
        L26:
            java.lang.Object r6 = r5.get(r4)
            Lf.B r6 = (Lf.B) r6
            long r0 = r6.f11547c
            long r2 = r7.f11547c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L35
            return
        L35:
            boolean r0 = r7.u()
            if (r0 != 0) goto L3c
            goto L11
        L3c:
            boolean r0 = androidx.concurrent.futures.b.a(r5, r4, r6, r7)
            if (r0 == 0) goto L4c
            boolean r5 = r6.p()
            if (r5 == 0) goto L4b
            r6.n()
        L4b:
            return
        L4c:
            boolean r6 = r7.p()
            if (r6 == 0) goto L26
            r7.n()
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: If.e.w0(long, If.m):void");
    }

    public final void x0(Throwable th2, Object obj, Zd.i iVar) {
        Function1 function1 = this.f9134b;
        AbstractC5504s.e(function1);
        Lf.x.a(function1, obj, iVar);
    }

    public final void z0(InterfaceC1623n interfaceC1623n) {
        u.a aVar = Td.u.f17466b;
        interfaceC1623n.resumeWith(Td.u.b(Td.v.a(Y())));
    }

    public boolean G(Throwable th2) {
        if (th2 == null) {
            th2 = new CancellationException("Channel was cancelled");
        }
        return J(th2, true);
    }

    protected boolean J(Throwable th2, boolean z10) {
        if (z10) {
            t0();
        }
        boolean zA = androidx.concurrent.futures.b.a(f9131k, this, f.f9157s, th2);
        if (z10) {
            u0();
        } else {
            v0();
        }
        M();
        y0();
        if (zA) {
            k0();
        }
        return zA;
    }

    protected final void N(long j10) {
        m mVarQ;
        Q qC;
        m mVar = (m) f9129i.get(this);
        while (true) {
            long j11 = f9125e.get(this);
            if (j10 < Math.max(((long) this.f9133a) + j11, T())) {
                return;
            }
            if (f9125e.compareAndSet(this, j11, 1 + j11)) {
                int i10 = f.f9140b;
                long j12 = j11 / ((long) i10);
                int i11 = (int) (j11 % ((long) i10));
                if (mVar.f11547c != j12) {
                    mVarQ = Q(j12, mVar);
                    if (mVarQ == null) {
                        continue;
                    }
                } else {
                    mVarQ = mVar;
                }
                Object objW0 = W0(mVarQ, i11, j11, null);
                if (objW0 != f.f9153o) {
                    mVarQ.c();
                    Function1 function1 = this.f9134b;
                    if (function1 != null && (qC = Lf.x.c(function1, objW0, null, 2, null)) != null) {
                        throw qC;
                    }
                } else if (j11 < f0()) {
                    mVarQ.c();
                }
                mVar = mVarQ;
            }
        }
    }

    protected final Object T0(Object obj) {
        m mVarR;
        int i10;
        e eVar;
        Object obj2 = f.f9142d;
        m mVar = (m) d0().get(this);
        while (true) {
            long andIncrement = e0().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zP0 = p0(andIncrement);
            int i11 = f.f9140b;
            long j11 = j10 / ((long) i11);
            int i12 = (int) (j10 % ((long) i11));
            if (mVar.f11547c != j11) {
                mVarR = R(j11, mVar);
                if (mVarR != null) {
                    eVar = this;
                    i10 = i12;
                } else if (zP0) {
                    return k.f9163b.a(c0());
                }
            } else {
                mVarR = mVar;
                i10 = i12;
                eVar = this;
            }
            Object obj3 = obj;
            int iY0 = eVar.Y0(mVarR, i10, obj3, j10, obj2, zP0);
            mVar = mVarR;
            if (iY0 == 0) {
                mVar.c();
                return k.f9163b.c(L.f17438a);
            }
            if (iY0 == 1) {
                return k.f9163b.c(L.f17438a);
            }
            if (iY0 == 2) {
                if (zP0) {
                    mVar.t();
                    return k.f9163b.a(c0());
                }
                h1 h1Var = obj2 instanceof h1 ? (h1) obj2 : null;
                if (h1Var != null) {
                    H0(h1Var, mVar, i10);
                }
                N((mVar.f11547c * ((long) i11)) + ((long) i10));
                return k.f9163b.c(L.f17438a);
            }
            if (iY0 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iY0 == 4) {
                if (j10 < b0()) {
                    mVar.c();
                }
                return k.f9163b.a(c0());
            }
            if (iY0 == 5) {
                mVar.c();
            }
            obj = obj3;
        }
    }

    protected final Throwable V() {
        return (Throwable) f9131k.get(this);
    }

    @Override // If.v
    public Object a(Zd.e eVar) {
        return I0(this, eVar);
    }

    public final long b0() {
        return f9125e.get(this);
    }

    @Override // If.w
    public void c(Function1 function1) {
        if (androidx.concurrent.futures.b.a(f9132l, this, null, function1)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9132l;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != f.f9155q) {
                if (obj == f.f9156r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f9132l, this, f.f9155q, f.f9156r));
        function1.invoke(V());
    }

    protected final Throwable c0() {
        Throwable thV = V();
        return thV == null ? new q("Channel was closed") : thV;
    }

    public final void c1(long j10) {
        e eVar = this;
        if (eVar.r0()) {
            return;
        }
        while (eVar.T() <= j10) {
            eVar = this;
        }
        int i10 = f.f9141c;
        for (int i11 = 0; i11 < i10; i11++) {
            long jT = eVar.T();
            if (jT == (4611686018427387903L & f9127g.get(eVar)) && jT == eVar.T()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9127g;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(eVar);
            if (atomicLongFieldUpdater.compareAndSet(eVar, j11, f.v(j11 & 4611686018427387903L, true))) {
                break;
            } else {
                eVar = this;
            }
        }
        while (true) {
            long jT2 = eVar.T();
            long j12 = f9127g.get(eVar);
            long j13 = j12 & 4611686018427387903L;
            boolean z10 = (4611686018427387904L & j12) != 0;
            if (jT2 == j13 && jT2 == eVar.T()) {
                break;
            }
            if (z10) {
                eVar = this;
            } else {
                eVar = this;
                f9127g.compareAndSet(eVar, j12, f.v(j13, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f9127g;
        while (true) {
            long j14 = atomicLongFieldUpdater2.get(eVar);
            boolean zCompareAndSet = atomicLongFieldUpdater2.compareAndSet(eVar, j14, f.v(j14 & 4611686018427387903L, false));
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            if (zCompareAndSet) {
                return;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            eVar = this;
        }
    }

    @Override // If.w
    public Object d(Object obj) {
        Object obj2;
        int i10;
        m mVar;
        e eVar;
        if (Q0(f9124d.get(this))) {
            return k.f9163b.b();
        }
        Object obj3 = f.f9148j;
        m mVar2 = (m) d0().get(this);
        while (true) {
            long andIncrement = e0().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zP0 = p0(andIncrement);
            int i11 = f.f9140b;
            long j11 = j10 / ((long) i11);
            int i12 = (int) (j10 % ((long) i11));
            if (mVar2.f11547c != j11) {
                m mVarR = R(j11, mVar2);
                if (mVarR != null) {
                    i10 = i12;
                    mVar = mVarR;
                    eVar = this;
                    obj2 = obj;
                } else if (zP0) {
                    return k.f9163b.a(c0());
                }
            } else {
                obj2 = obj;
                i10 = i12;
                mVar = mVar2;
                eVar = this;
            }
            int iY0 = eVar.Y0(mVar, i10, obj2, j10, obj3, zP0);
            mVar2 = mVar;
            if (iY0 == 0) {
                mVar2.c();
                return k.f9163b.c(L.f17438a);
            }
            if (iY0 == 1) {
                return k.f9163b.c(L.f17438a);
            }
            if (iY0 == 2) {
                if (zP0) {
                    mVar2.t();
                    return k.f9163b.a(c0());
                }
                h1 h1Var = obj3 instanceof h1 ? (h1) obj3 : null;
                if (h1Var != null) {
                    H0(h1Var, mVar2, i10);
                }
                mVar2.t();
                return k.f9163b.b();
            }
            if (iY0 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iY0 == 4) {
                if (j10 < b0()) {
                    mVar2.c();
                }
                return k.f9163b.a(c0());
            }
            if (iY0 == 5) {
                mVar2.c();
            }
            obj = obj2;
        }
    }

    @Override // If.w
    public Object e(Object obj, Zd.e eVar) {
        return O0(this, obj, eVar);
    }

    @Override // If.v
    public Object f() {
        m mVarQ;
        long j10 = f9125e.get(this);
        long j11 = f9124d.get(this);
        if (o0(j11)) {
            return k.f9163b.a(V());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return k.f9163b.b();
        }
        Object obj = f.f9149k;
        m mVar = (m) Z().get(this);
        while (!n0()) {
            long andIncrement = a0().getAndIncrement(this);
            int i10 = f.f9140b;
            long j12 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (mVar.f11547c != j12) {
                mVarQ = Q(j12, mVar);
                if (mVarQ == null) {
                    continue;
                }
            } else {
                mVarQ = mVar;
            }
            Object objW0 = W0(mVarQ, i11, andIncrement, obj);
            if (objW0 == f.f9151m) {
                h1 h1Var = obj instanceof h1 ? (h1) obj : null;
                if (h1Var != null) {
                    G0(h1Var, mVarQ, i11);
                }
                c1(andIncrement);
                mVarQ.t();
                return k.f9163b.b();
            }
            if (objW0 != f.f9153o) {
                if (objW0 == f.f9152n) {
                    throw new IllegalStateException("unexpected");
                }
                mVarQ.c();
                return k.f9163b.c(objW0);
            }
            if (andIncrement < f0()) {
                mVarQ.c();
            }
            mVar = mVarQ;
        }
        return k.f9163b.a(V());
    }

    public final long f0() {
        return f9124d.get(this) & 1152921504606846975L;
    }

    public final boolean h0() {
        while (true) {
            m mVarQ = (m) f9129i.get(this);
            long jB0 = b0();
            if (f0() <= jB0) {
                return false;
            }
            int i10 = f.f9140b;
            long j10 = jB0 / ((long) i10);
            if (mVarQ.f11547c == j10 || (mVarQ = Q(j10, mVarQ)) != null) {
                mVarQ.c();
                if (l0(mVarQ, (int) (jB0 % ((long) i10)), jB0)) {
                    return true;
                }
                f9125e.compareAndSet(this, jB0, 1 + jB0);
            } else if (((m) f9129i.get(this)).f11547c < j10) {
                return false;
            }
        }
    }

    @Override // If.w
    public boolean i(Throwable th2) {
        return J(th2, false);
    }

    @Override // If.v
    public i iterator() {
        return new a();
    }

    @Override // If.v
    public final void k(CancellationException cancellationException) {
        G(cancellationException);
    }

    @Override // If.w
    public boolean m() {
        return p0(f9124d.get(this));
    }

    public boolean n0() {
        return o0(f9124d.get(this));
    }

    protected boolean q0() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x01b3, code lost:
    
        r16 = r7;
        r3 = (If.m) r3.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x01bc, code lost:
    
        if (r3 != null) goto L180;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: If.e.toString():java.lang.String");
    }

    protected void C0() {
    }

    protected void D0() {
    }

    protected void y0() {
    }
}
