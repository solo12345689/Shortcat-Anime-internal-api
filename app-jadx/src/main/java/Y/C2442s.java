package Y;

import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import Y.U0;
import a0.C2507c;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import i0.AbstractC4984c;
import i0.AbstractC5003v;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k0.AbstractC5412b;
import k0.AbstractC5414d;
import k0.AbstractC5420j;
import k0.AbstractC5425o;
import k0.C5418h;
import k0.C5427q;
import k0.InterfaceC5415e;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import t.C6538D;
import t.C6540F;
import t.C6550P;

/* JADX INFO: renamed from: Y.s */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2442s implements InterfaceC2425m {

    /* JADX INFO: renamed from: A */
    private boolean f22485A;

    /* JADX INFO: renamed from: C */
    private int f22487C;

    /* JADX INFO: renamed from: D */
    private int f22488D;

    /* JADX INFO: renamed from: E */
    private boolean f22489E;

    /* JADX INFO: renamed from: F */
    private final c f22490F;

    /* JADX INFO: renamed from: G */
    private final ArrayList f22491G;

    /* JADX INFO: renamed from: H */
    private boolean f22492H;

    /* JADX INFO: renamed from: I */
    private boolean f22493I;

    /* JADX INFO: renamed from: J */
    private D1 f22494J;

    /* JADX INFO: renamed from: K */
    private E1 f22495K;

    /* JADX INFO: renamed from: L */
    private H1 f22496L;

    /* JADX INFO: renamed from: M */
    private boolean f22497M;

    /* JADX INFO: renamed from: N */
    private U0 f22498N;

    /* JADX INFO: renamed from: O */
    private Z.a f22499O;

    /* JADX INFO: renamed from: P */
    private final Z.b f22500P;

    /* JADX INFO: renamed from: Q */
    private C2392b f22501Q;

    /* JADX INFO: renamed from: R */
    private Z.c f22502R;

    /* JADX INFO: renamed from: S */
    private C1 f22503S;

    /* JADX INFO: renamed from: T */
    private final C5418h f22504T;

    /* JADX INFO: renamed from: U */
    private final Zd.i f22505U;

    /* JADX INFO: renamed from: V */
    private boolean f22506V;

    /* JADX INFO: renamed from: W */
    private long f22507W;

    /* JADX INFO: renamed from: X */
    private InterfaceC5415e f22508X;

    /* JADX INFO: renamed from: b */
    private final InterfaceC2398d f22509b;

    /* JADX INFO: renamed from: c */
    private final AbstractC2460y f22510c;

    /* JADX INFO: renamed from: d */
    private final E1 f22511d;

    /* JADX INFO: renamed from: e */
    private final Set f22512e;

    /* JADX INFO: renamed from: f */
    private Z.a f22513f;

    /* JADX INFO: renamed from: g */
    private Z.a f22514g;

    /* JADX INFO: renamed from: h */
    private final K f22515h;

    /* JADX INFO: renamed from: i */
    private final B f22516i;

    /* JADX INFO: renamed from: k */
    private T0 f22518k;

    /* JADX INFO: renamed from: l */
    private int f22519l;

    /* JADX INFO: renamed from: m */
    private int f22520m;

    /* JADX INFO: renamed from: n */
    private int f22521n;

    /* JADX INFO: renamed from: p */
    private int[] f22523p;

    /* JADX INFO: renamed from: q */
    private C6538D f22524q;

    /* JADX INFO: renamed from: r */
    private boolean f22525r;

    /* JADX INFO: renamed from: s */
    private boolean f22526s;

    /* JADX INFO: renamed from: t */
    private boolean f22527t;

    /* JADX INFO: renamed from: x */
    private C6540F f22531x;

    /* JADX INFO: renamed from: y */
    private boolean f22532y;

    /* JADX INFO: renamed from: j */
    private final ArrayList f22517j = g2.c(null, 1, null);

    /* JADX INFO: renamed from: o */
    private final C2414i0 f22522o = new C2414i0();

    /* JADX INFO: renamed from: u */
    private final List f22528u = new ArrayList();

    /* JADX INFO: renamed from: v */
    private final C2414i0 f22529v = new C2414i0();

    /* JADX INFO: renamed from: w */
    private U0 f22530w = g0.n.a();

    /* JADX INFO: renamed from: z */
    private final C2414i0 f22533z = new C2414i0();

    /* JADX INFO: renamed from: B */
    private int f22486B = -1;

    /* JADX INFO: renamed from: Y.s$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class b extends AbstractC2460y {

        /* JADX INFO: renamed from: a */
        private final long f22535a;

        /* JADX INFO: renamed from: b */
        private final boolean f22536b;

        /* JADX INFO: renamed from: c */
        private final boolean f22537c;

        /* JADX INFO: renamed from: d */
        private final K f22538d;

        /* JADX INFO: renamed from: e */
        private Set f22539e;

        /* JADX INFO: renamed from: f */
        private final Set f22540f = new LinkedHashSet();

        /* JADX INFO: renamed from: g */
        private final C0 f22541g = U1.h(g0.n.a(), U1.n());

        public b(long j10, boolean z10, boolean z11, K k10) {
            this.f22535a = j10;
            this.f22536b = z10;
            this.f22537c = z11;
            this.f22538d = k10;
        }

        private final U0 y() {
            return (U0) this.f22541g.getValue();
        }

        private final void z(U0 u02) {
            this.f22541g.setValue(u02);
        }

        public final void A(U0 u02) {
            z(u02);
        }

        @Override // Y.AbstractC2460y
        public void a(Q q10, Function2 function2) {
            C2442s.this.f22510c.a(q10, function2);
        }

        @Override // Y.AbstractC2460y
        public t.e0 b(Q q10, C1 c12, Function2 function2) {
            return C2442s.this.f22510c.b(q10, c12, function2);
        }

        @Override // Y.AbstractC2460y
        public void c() {
            C2442s.this.f22487C--;
        }

        @Override // Y.AbstractC2460y
        public boolean d() {
            return C2442s.this.f22510c.d();
        }

        @Override // Y.AbstractC2460y
        public boolean e() {
            return this.f22536b;
        }

        @Override // Y.AbstractC2460y
        public boolean f() {
            return this.f22537c;
        }

        @Override // Y.AbstractC2460y
        public long g() {
            return this.f22535a;
        }

        @Override // Y.AbstractC2460y
        public InterfaceC2457x h() {
            return C2442s.this.H0();
        }

        @Override // Y.AbstractC2460y
        public U0 i() {
            return y();
        }

        @Override // Y.AbstractC2460y
        public Zd.i j() {
            return C2442s.this.f22510c.j();
        }

        @Override // Y.AbstractC2460y
        public K k() {
            return this.f22538d;
        }

        @Override // Y.AbstractC2460y
        public void l(C2461y0 c2461y0) {
            C2442s.this.f22510c.l(c2461y0);
        }

        @Override // Y.AbstractC2460y
        public void m(Q q10) {
            C2442s.this.f22510c.m(C2442s.this.H0());
            C2442s.this.f22510c.m(q10);
        }

        @Override // Y.AbstractC2460y
        public AbstractC2458x0 n(C2461y0 c2461y0) {
            return C2442s.this.f22510c.n(c2461y0);
        }

        @Override // Y.AbstractC2460y
        public t.e0 o(Q q10, C1 c12, t.e0 e0Var) {
            return C2442s.this.f22510c.o(q10, c12, e0Var);
        }

        @Override // Y.AbstractC2460y
        public void p(Set set) {
            Set hashSet = this.f22539e;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f22539e = hashSet;
            }
            hashSet.add(set);
        }

        @Override // Y.AbstractC2460y
        public void q(InterfaceC2425m interfaceC2425m) {
            AbstractC5504s.f(interfaceC2425m, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
            super.q((C2442s) interfaceC2425m);
            this.f22540f.add(interfaceC2425m);
        }

        @Override // Y.AbstractC2460y
        public void r(C2406f1 c2406f1) {
            C2442s.this.f22510c.r(c2406f1);
        }

        @Override // Y.AbstractC2460y
        public void s(Q q10) {
            C2442s.this.f22510c.s(q10);
        }

        @Override // Y.AbstractC2460y
        public void t() {
            C2442s.this.f22487C++;
        }

        @Override // Y.AbstractC2460y
        public void u(InterfaceC2425m interfaceC2425m) {
            Set<Set> set = this.f22539e;
            if (set != null) {
                for (Set set2 : set) {
                    AbstractC5504s.f(interfaceC2425m, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                    set2.remove(((C2442s) interfaceC2425m).f22511d);
                }
            }
            kotlin.jvm.internal.V.a(this.f22540f).remove(interfaceC2425m);
        }

        @Override // Y.AbstractC2460y
        public void v(Q q10) {
            C2442s.this.f22510c.v(q10);
        }

        public final void w() {
            if (this.f22540f.isEmpty()) {
                return;
            }
            Set set = this.f22539e;
            if (set != null) {
                for (C2442s c2442s : this.f22540f) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((Set) it.next()).remove(c2442s.f22511d);
                    }
                }
            }
            this.f22540f.clear();
        }

        public final Set x() {
            return this.f22540f;
        }
    }

    /* JADX INFO: renamed from: Y.s$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements V {
        c() {
        }

        @Override // Y.V
        public void a(U u10) {
            C2442s.this.f22487C++;
        }

        @Override // Y.V
        public void b(U u10) {
            C2442s.this.f22487C--;
        }
    }

    /* JADX INFO: renamed from: Y.s$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f22544a;

        d(AbstractC2455w0 abstractC2455w0, Object obj) {
            this.f22544a = obj;
        }

        public final void a(InterfaceC2425m interfaceC2425m, int i10) {
            if (!interfaceC2425m.p((i10 & 3) != 2, i10 & 1)) {
                interfaceC2425m.K();
            } else {
                if (AbstractC2454w.L()) {
                    AbstractC2454w.U(316014703, i10, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:3477)");
                }
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }
    }

    public C2442s(InterfaceC2398d interfaceC2398d, AbstractC2460y abstractC2460y, E1 e12, Set set, Z.a aVar, Z.a aVar2, K k10, B b10) {
        this.f22509b = interfaceC2398d;
        this.f22510c = abstractC2460y;
        this.f22511d = e12;
        this.f22512e = set;
        this.f22513f = aVar;
        this.f22514g = aVar2;
        this.f22515h = k10;
        this.f22516i = b10;
        this.f22489E = abstractC2460y.f() || abstractC2460y.d();
        this.f22490F = new c();
        this.f22491G = g2.c(null, 1, null);
        D1 d1F = e12.F();
        d1F.d();
        this.f22494J = d1F;
        E1 e13 = new E1();
        if (abstractC2460y.f()) {
            e13.l();
        }
        if (abstractC2460y.d()) {
            e13.i();
        }
        this.f22495K = e13;
        H1 h1G = e13.G();
        h1G.J(true);
        this.f22496L = h1G;
        this.f22500P = new Z.b(this, this.f22513f);
        D1 d1F2 = this.f22495K.F();
        try {
            C2392b c2392bA = d1F2.a(0);
            d1F2.d();
            this.f22501Q = c2392bA;
            this.f22502R = new Z.c();
            this.f22504T = new C5418h(this);
            Zd.i iVarJ = abstractC2460y.j();
            Zd.i iVarK0 = K0();
            this.f22505U = iVarJ.w(iVarK0 == null ? Zd.j.f23275a : iVarK0);
        } catch (Throwable th2) {
            d1F2.d();
            throw th2;
        }
    }

    private final void A0(boolean z10, T0 t02) {
        g2.j(this.f22517j, this.f22518k);
        this.f22518k = t02;
        this.f22522o.h(this.f22520m);
        this.f22522o.h(this.f22521n);
        this.f22522o.h(this.f22519l);
        if (z10) {
            this.f22519l = 0;
        }
        this.f22520m = 0;
        this.f22521n = 0;
    }

    private final void A1() {
        this.f22521n = 0;
        this.f22494J = this.f22511d.F();
        w1(100);
        this.f22510c.t();
        U0 u0I = this.f22510c.i();
        this.f22533z.h(AbstractC2454w.q(this.f22532y));
        this.f22532y = U(u0I);
        this.f22498N = null;
        if (!this.f22525r) {
            this.f22525r = this.f22510c.e();
        }
        if (!this.f22489E) {
            this.f22489E = this.f22510c.f();
        }
        if (this.f22489E) {
            D dC = AbstractC5420j.c();
            AbstractC5504s.f(dC, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
            u0I = u0I.x(dC, new j2(K0()));
        }
        this.f22530w = u0I;
        Set set = (Set) J.b(u0I, AbstractC5425o.c());
        if (set != null) {
            set.add(E());
            this.f22510c.p(set);
        }
        w1(Long.hashCode(this.f22510c.g()));
    }

    private final void B0(C2406f1 c2406f1) {
        c2406f1.P(this.f22488D);
        this.f22515h.a();
    }

    private final void C0(int i10, boolean z10) {
        T0 t02 = (T0) g2.i(this.f22517j);
        if (t02 != null && !z10) {
            t02.l(t02.a() + 1);
        }
        this.f22518k = t02;
        this.f22519l = this.f22522o.g() + i10;
        this.f22521n = this.f22522o.g();
        this.f22520m = this.f22522o.g() + i10;
    }

    private final Function1 D0(C2406f1 c2406f1) {
        this.f22515h.a();
        return c2406f1.f(this.f22488D);
    }

    private final void E0() {
        this.f22500P.n();
        if (!g2.e(this.f22517j)) {
            AbstractC2454w.t("Start/end imbalance");
        }
        i0();
    }

    private final void E1(int i10, int i11) {
        if (J1(i10) != i11) {
            if (i10 < 0) {
                C6538D c6538d = this.f22524q;
                if (c6538d == null) {
                    c6538d = new C6538D(0, 1, null);
                    this.f22524q = c6538d;
                }
                c6538d.r(i10, i11);
                return;
            }
            int[] iArr = this.f22523p;
            if (iArr == null) {
                int[] iArr2 = new int[this.f22494J.x()];
                AbstractC2273n.x(iArr2, -1, 0, 0, 6, null);
                this.f22523p = iArr2;
                iArr = iArr2;
            }
            iArr[i10] = i11;
        }
    }

    private final void F0() {
        E1 e12 = new E1();
        if (this.f22489E) {
            e12.l();
        }
        if (this.f22510c.d()) {
            e12.i();
        }
        this.f22495K = e12;
        H1 h1G = e12.G();
        h1G.J(true);
        this.f22496L = h1G;
    }

    private final void F1(int i10, int i11) {
        int iJ1 = J1(i10);
        if (iJ1 != i11) {
            int i12 = i11 - iJ1;
            int iD = g2.d(this.f22517j) - 1;
            while (i10 != -1) {
                int iJ12 = J1(i10) + i12;
                E1(i10, iJ12);
                int i13 = iD;
                while (true) {
                    if (-1 < i13) {
                        T0 t02 = (T0) g2.h(this.f22517j, i13);
                        if (t02 != null && t02.n(i10, iJ12)) {
                            iD = i13 - 1;
                            break;
                        }
                        i13--;
                    } else {
                        break;
                    }
                }
                if (i10 < 0) {
                    i10 = this.f22494J.u();
                } else if (this.f22494J.K(i10)) {
                    return;
                } else {
                    i10 = this.f22494J.Q(i10);
                }
            }
        }
    }

    private final U0 G1(U0 u02, U0 u03) {
        U0.a aVarBuilder = u02.builder();
        aVarBuilder.putAll(u03);
        U0 u0Build = aVarBuilder.build();
        x1(204, AbstractC2454w.G());
        H1(u0Build);
        H1(u03);
        w0();
        return u0Build;
    }

    private final void H1(Object obj) {
        W0();
        I1(obj);
    }

    private final int J1(int i10) {
        int i11;
        if (i10 >= 0) {
            int[] iArr = this.f22523p;
            return (iArr == null || (i11 = iArr[i10]) < 0) ? this.f22494J.O(i10) : i11;
        }
        C6538D c6538d = this.f22524q;
        if (c6538d == null || !c6538d.a(i10)) {
            return 0;
        }
        return c6538d.c(i10);
    }

    private final void K1() {
        if (!this.f22527t) {
            AbstractC2454w.t("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f22527t = false;
    }

    private final Object L0(D1 d12) {
        return d12.M(d12.u());
    }

    private final void L1() {
        if (this.f22527t) {
            AbstractC2454w.t("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final int N0(D1 d12, int i10) {
        Object objA;
        if (!d12.H(i10)) {
            int iD = d12.D(i10);
            return (iD != 207 || (objA = d12.A(i10)) == null || AbstractC5504s.c(objA, InterfaceC2425m.f22370a.a())) ? iD : objA.hashCode();
        }
        Object objE = d12.E(i10);
        if (objE != null) {
            return objE instanceof Enum ? ((Enum) objE).ordinal() : objE.hashCode();
        }
        return 0;
    }

    private final void O0(List list) throws Throwable {
        Z.b bVar;
        Z.a aVar;
        Z.b bVar2;
        Z.a aVar2;
        D1 d12;
        C6540F c6540f;
        Z.b bVar3;
        Z.a aVar3;
        int i10;
        int i11;
        Z.b bVar4 = this.f22500P;
        Z.a aVar4 = this.f22514g;
        Z.a aVarO = bVar4.o();
        try {
            bVar4.T(aVar4);
            this.f22500P.R();
            int size = list.size();
            int i12 = 0;
            int i13 = 0;
            while (i13 < size) {
                try {
                    Pair pair = (Pair) list.get(i13);
                    final C2461y0 c2461y0 = (C2461y0) pair.getFirst();
                    C2461y0 c2461y02 = (C2461y0) pair.getSecond();
                    C2392b c2392bA = c2461y0.a();
                    int iD = c2461y0.g().d(c2392bA);
                    g0.k kVar = new g0.k(i12, 1, null);
                    this.f22500P.e(kVar, c2392bA);
                    if (c2461y02 == null) {
                        if (AbstractC5504s.c(c2461y0.g(), this.f22495K)) {
                            m0();
                        }
                        final D1 d1F = c2461y0.g().F();
                        try {
                            d1F.R(iD);
                            this.f22500P.z(iD);
                            final Z.a aVar5 = new Z.a();
                            f1(this, null, null, null, null, new InterfaceC5082a() { // from class: Y.n
                                @Override // ie.InterfaceC5082a
                                public final Object invoke() {
                                    return C2442s.P0(this.f22377a, aVar5, d1F, c2461y0);
                                }
                            }, 15, null);
                            this.f22500P.s(aVar5, kVar);
                            Td.L l10 = Td.L.f17438a;
                            d1F.d();
                            i11 = size;
                            bVar2 = bVar4;
                            aVar2 = aVarO;
                            i10 = i13;
                        } finally {
                        }
                    } else {
                        AbstractC2458x0 abstractC2458x0N = this.f22510c.n(c2461y02);
                        E1 e1G = c2461y02.g();
                        C2392b c2392bA2 = c2461y02.a();
                        List listR = AbstractC2454w.r(e1G, c2392bA2);
                        if (!listR.isEmpty()) {
                            this.f22500P.b(listR, kVar);
                            if (AbstractC5504s.c(c2461y0.g(), this.f22511d)) {
                                int iD2 = this.f22511d.d(c2392bA);
                                E1(iD2, J1(iD2) + listR.size());
                            }
                        }
                        this.f22500P.c(abstractC2458x0N, this.f22510c, c2461y02, c2461y0);
                        D1 d1F2 = e1G.F();
                        try {
                            D1 d13 = this.f22494J;
                            int[] iArr = this.f22523p;
                            C6540F c6540f2 = this.f22531x;
                            this.f22523p = null;
                            this.f22531x = null;
                            try {
                                this.f22494J = d1F2;
                                int iD3 = e1G.d(c2392bA2);
                                d1F2.R(iD3);
                                this.f22500P.z(iD3);
                                Z.a aVar6 = new Z.a();
                                Z.b bVar5 = this.f22500P;
                                Z.a aVarO2 = bVar5.o();
                                try {
                                    bVar5.T(aVar6);
                                    d12 = d1F2;
                                    try {
                                        Z.b bVar6 = this.f22500P;
                                        i10 = i13;
                                        boolean zP = bVar6.p();
                                        i11 = size;
                                        try {
                                            bVar6.U(false);
                                            c2461y02.h();
                                            try {
                                                c6540f = c6540f2;
                                                bVar2 = bVar4;
                                                aVar2 = aVarO;
                                                aVar3 = aVarO2;
                                                bVar3 = bVar5;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                c6540f = c6540f2;
                                                aVar3 = aVarO2;
                                                bVar3 = bVar5;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            c6540f = c6540f2;
                                            bVar3 = bVar5;
                                            aVar3 = aVarO2;
                                        }
                                        try {
                                            e1(c2461y02.b(), c2461y0.b(), Integer.valueOf(d12.k()), c2461y02.d(), new InterfaceC5082a() { // from class: Y.o
                                                @Override // ie.InterfaceC5082a
                                                public final Object invoke() {
                                                    return C2442s.Q0(this.f22388a, c2461y0);
                                                }
                                            });
                                            try {
                                                bVar6.U(zP);
                                                try {
                                                    bVar3.T(aVar3);
                                                    this.f22500P.s(aVar6, kVar);
                                                    Td.L l11 = Td.L.f17438a;
                                                    try {
                                                        this.f22494J = d13;
                                                        this.f22523p = iArr;
                                                        this.f22531x = c6540f;
                                                        try {
                                                            d12.d();
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            bVar = bVar2;
                                                            aVar = aVar2;
                                                            bVar.T(aVar);
                                                            throw th;
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        d12.d();
                                                        throw th;
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    this.f22494J = d13;
                                                    this.f22523p = iArr;
                                                    this.f22531x = c6540f;
                                                    throw th;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                bVar3.T(aVar3);
                                                throw th;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            bVar6.U(zP);
                                            throw th;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        c6540f = c6540f2;
                                        bVar3 = bVar5;
                                        aVar3 = aVarO2;
                                        bVar3.T(aVar3);
                                        throw th;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    c6540f = c6540f2;
                                    d12 = d1F2;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                c6540f = c6540f2;
                                d12 = d1F2;
                            }
                        } catch (Throwable th12) {
                            th = th12;
                            d12 = d1F2;
                        }
                    }
                    this.f22500P.W();
                    i13 = i10 + 1;
                    size = i11;
                    bVar4 = bVar2;
                    aVarO = aVar2;
                    i12 = 0;
                } catch (Throwable th13) {
                    th = th13;
                    bVar2 = bVar4;
                    aVar2 = aVarO;
                }
            }
            Z.b bVar7 = bVar4;
            Z.a aVar7 = aVarO;
            this.f22500P.h();
            this.f22500P.z(0);
            bVar7.T(aVar7);
        } catch (Throwable th14) {
            th = th14;
            bVar = bVar4;
            aVar = aVarO;
        }
    }

    public static final Td.L P0(C2442s c2442s, Z.a aVar, D1 d12, C2461y0 c2461y0) {
        Z.b bVar = c2442s.f22500P;
        Z.a aVarO = bVar.o();
        try {
            bVar.T(aVar);
            D1 d13 = c2442s.f22494J;
            int[] iArr = c2442s.f22523p;
            C6540F c6540f = c2442s.f22531x;
            c2442s.f22523p = null;
            c2442s.f22531x = null;
            try {
                c2442s.f22494J = d12;
                Z.b bVar2 = c2442s.f22500P;
                boolean zP = bVar2.p();
                try {
                    bVar2.U(false);
                    c2461y0.c();
                    c2442s.T0(null, c2461y0.e(), c2461y0.f(), true);
                    bVar2.U(zP);
                    Td.L l10 = Td.L.f17438a;
                    bVar.T(aVarO);
                    return Td.L.f17438a;
                } catch (Throwable th2) {
                    bVar2.U(zP);
                    throw th2;
                }
            } finally {
                c2442s.f22494J = d13;
                c2442s.f22523p = iArr;
                c2442s.f22531x = c6540f;
            }
        } catch (Throwable th3) {
            bVar.T(aVarO);
            throw th3;
        }
    }

    public static final Td.L Q0(C2442s c2442s, C2461y0 c2461y0) {
        c2461y0.c();
        c2442s.T0(null, c2461y0.e(), c2461y0.f(), true);
        return Td.L.f17438a;
    }

    private final int S0(int i10) {
        return (-2) - i10;
    }

    private final void T0(AbstractC2455w0 abstractC2455w0, U0 u02, Object obj, boolean z10) {
        H(126665345, abstractC2455w0);
        H1(obj);
        long jO = o();
        try {
            this.f22507W = 126665345;
            boolean z11 = false;
            if (e()) {
                H1.r0(this.f22496L, 0, 1, null);
            }
            if (!e() && !AbstractC5504s.c(this.f22494J.l(), u02)) {
                z11 = true;
            }
            if (z11) {
                j1(u02);
            }
            v1(202, AbstractC2454w.C(), AbstractC2408g0.f22332a.a(), u02);
            this.f22498N = null;
            if (!e() || z10) {
                boolean z12 = this.f22532y;
                this.f22532y = z11;
                g0.j.a(this, g0.i.b(316014703, true, new d(abstractC2455w0, obj)));
                this.f22532y = z12;
            } else {
                this.f22497M = true;
                H1 h12 = this.f22496L;
                this.f22510c.l(new C2461y0(abstractC2455w0, obj, H0(), this.f22495K, h12.B(h12.C0(h12.a0())), AbstractC2279u.m(), n0(), null));
            }
        } catch (Throwable th2) {
            try {
                throw AbstractC5414d.b(th2, new InterfaceC5082a() { // from class: Y.r
                    @Override // ie.InterfaceC5082a
                    public final Object invoke() {
                        return C2442s.U0(this.f22479a);
                    }
                });
            } finally {
                w0();
                this.f22498N = null;
                this.f22507W = jO;
                S();
            }
        }
    }

    public static final List U0(C2442s c2442s) {
        return c2442s.p0();
    }

    private final Object Y0(D1 d12, int i10) {
        return d12.M(i10);
    }

    private final int Z0(int i10, int i11, int i12, int i13) {
        int iQ = this.f22494J.Q(i11);
        while (iQ != i12 && !this.f22494J.K(iQ)) {
            iQ = this.f22494J.Q(iQ);
        }
        if (this.f22494J.K(iQ)) {
            i13 = 0;
        }
        if (iQ == i11) {
            return i13;
        }
        int iJ1 = (J1(iQ) - this.f22494J.O(i11)) + i13;
        loop1: while (i13 < iJ1 && iQ != i10) {
            iQ++;
            while (iQ < i10) {
                int iF = this.f22494J.F(iQ) + iQ;
                if (i10 >= iF) {
                    i13 += this.f22494J.K(iQ) ? 1 : J1(iQ);
                    iQ = iF;
                }
            }
            break loop1;
        }
        return i13;
    }

    private final void b0() {
        i0();
        g2.a(this.f22517j);
        this.f22522o.a();
        this.f22529v.a();
        this.f22533z.a();
        this.f22531x = null;
        this.f22502R.a();
        this.f22507W = 0;
        this.f22487C = 0;
        this.f22527t = false;
        this.f22506V = false;
        this.f22485A = false;
        this.f22492H = false;
        this.f22526s = false;
        this.f22486B = -1;
        if (!this.f22494J.i()) {
            this.f22494J.d();
        }
        if (this.f22496L.Y()) {
            return;
        }
        F0();
    }

    private final int c1(int i10) {
        int iQ = this.f22494J.Q(i10) + 1;
        int i11 = 0;
        while (iQ < i10) {
            if (!this.f22494J.H(iQ)) {
                i11++;
            }
            iQ += this.f22494J.F(iQ);
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x003f A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:31:0x0005, B:33:0x0010, B:35:0x0022, B:39:0x002c, B:38:0x0028, B:42:0x0033, B:44:0x0039, B:46:0x003f), top: B:51:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object e1(Y.Q r7, Y.Q r8, java.lang.Integer r9, java.util.List r10, ie.InterfaceC5082a r11) {
        /*
            r6 = this;
            boolean r0 = r6.f22492H
            int r1 = r6.f22519l
            r2 = 1
            r6.f22492H = r2     // Catch: java.lang.Throwable -> L26
            r2 = 0
            r6.f22519l = r2     // Catch: java.lang.Throwable -> L26
            int r3 = r10.size()     // Catch: java.lang.Throwable -> L26
        Le:
            if (r2 >= r3) goto L2f
            java.lang.Object r4 = r10.get(r2)     // Catch: java.lang.Throwable -> L26
            kotlin.Pair r4 = (kotlin.Pair) r4     // Catch: java.lang.Throwable -> L26
            java.lang.Object r5 = r4.getFirst()     // Catch: java.lang.Throwable -> L26
            Y.f1 r5 = (Y.C2406f1) r5     // Catch: java.lang.Throwable -> L26
            java.lang.Object r4 = r4.getSecond()     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L28
            r6.B1(r5, r4)     // Catch: java.lang.Throwable -> L26
            goto L2c
        L26:
            r7 = move-exception
            goto L48
        L28:
            r4 = 0
            r6.B1(r5, r4)     // Catch: java.lang.Throwable -> L26
        L2c:
            int r2 = r2 + 1
            goto Le
        L2f:
            if (r7 == 0) goto L3f
            if (r9 == 0) goto L38
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L26
            goto L39
        L38:
            r9 = -1
        L39:
            java.lang.Object r7 = r7.m(r8, r9, r11)     // Catch: java.lang.Throwable -> L26
            if (r7 != 0) goto L43
        L3f:
            java.lang.Object r7 = r11.invoke()     // Catch: java.lang.Throwable -> L26
        L43:
            r6.f22492H = r0
            r6.f22519l = r1
            return r7
        L48:
            r6.f22492H = r0
            r6.f22519l = r1
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.C2442s.e1(Y.Q, Y.Q, java.lang.Integer, java.util.List, ie.a):java.lang.Object");
    }

    static /* synthetic */ Object f1(C2442s c2442s, Q q10, Q q11, Integer num, List list, InterfaceC5082a interfaceC5082a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            q10 = null;
        }
        if ((i10 & 2) != 0) {
            q11 = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            list = AbstractC2279u.m();
        }
        return c2442s.e1(q10, q11, num, list, interfaceC5082a);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g0() {
        /*
            r4 = this;
            boolean r0 = r4.e()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"
            if (r0 == 0) goto L20
            Y.f1 r0 = new Y.f1
            Y.B r2 = r4.H0()
            kotlin.jvm.internal.AbstractC5504s.f(r2, r1)
            r0.<init>(r2)
            java.util.ArrayList r1 = r4.f22491G
            Y.g2.j(r1, r0)
            r4.I1(r0)
            r4.B0(r0)
            return
        L20:
            java.util.List r0 = r4.f22528u
            Y.D1 r2 = r4.f22494J
            int r2 = r2.u()
            Y.k0 r0 = Y.AbstractC2454w.n(r0, r2)
            Y.D1 r2 = r4.f22494J
            java.lang.Object r2 = r2.L()
            Y.m$a r3 = Y.InterfaceC2425m.f22370a
            java.lang.Object r3 = r3.a()
            boolean r3 = kotlin.jvm.internal.AbstractC5504s.c(r2, r3)
            if (r3 == 0) goto L4e
            Y.f1 r2 = new Y.f1
            Y.B r3 = r4.H0()
            kotlin.jvm.internal.AbstractC5504s.f(r3, r1)
            r2.<init>(r3)
            r4.I1(r2)
            goto L55
        L4e:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.AbstractC5504s.f(r2, r1)
            Y.f1 r2 = (Y.C2406f1) r2
        L55:
            r1 = 0
            r3 = 1
            if (r0 != 0) goto L67
            boolean r0 = r2.l()
            if (r0 == 0) goto L62
            r2.G(r1)
        L62:
            if (r0 == 0) goto L65
            goto L67
        L65:
            r0 = r1
            goto L68
        L67:
            r0 = r3
        L68:
            r2.I(r0)
            java.util.ArrayList r0 = r4.f22491G
            Y.g2.j(r0, r2)
            r4.B0(r2)
            boolean r0 = r2.m()
            if (r0 == 0) goto L93
            r2.H(r1)
            r2.L(r3)
            Z.b r0 = r4.f22500P
            r0.X(r2)
            boolean r0 = r4.f22485A
            if (r0 != 0) goto L93
            boolean r0 = r2.r()
            if (r0 == 0) goto L93
            r4.f22485A = r3
            r2.K(r3)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.C2442s.g0():void");
    }

    private final void g1() {
        boolean z10 = this.f22492H;
        this.f22492H = true;
        int iU = this.f22494J.u();
        int iF = this.f22494J.F(iU) + iU;
        int i10 = this.f22519l;
        long jO = o();
        int i11 = this.f22520m;
        int i12 = this.f22521n;
        C2420k0 c2420k0A = AbstractC2454w.A(this.f22528u, this.f22494J.k(), iF);
        boolean z11 = false;
        int i13 = iU;
        while (c2420k0A != null) {
            int iB = c2420k0A.b();
            C2406f1 c2406f1C = c2420k0A.c();
            AbstractC2454w.R(this.f22528u, iB);
            if (c2420k0A.d()) {
                this.f22494J.R(iB);
                int iK = this.f22494J.k();
                k1(i13, iK, iU);
                this.f22519l = Z0(iB, iK, iU, i10);
                this.f22521n = c1(iK);
                this.f22507W = l0(this.f22494J.Q(iK), iU, jO);
                this.f22498N = null;
                c2406f1C.e(this);
                this.f22498N = null;
                this.f22494J.S(iU);
                z11 = true;
                i13 = iK;
            } else {
                g2.j(this.f22491G, c2406f1C);
                this.f22515h.a();
                c2406f1C.B();
                g2.i(this.f22491G);
            }
            c2420k0A = AbstractC2454w.A(this.f22528u, this.f22494J.k(), iF);
        }
        if (z11) {
            k1(i13, iU, iU);
            this.f22494J.U();
            int iJ1 = J1(iU);
            this.f22519l = i10 + iJ1;
            this.f22520m = i11 + iJ1;
            this.f22521n = i12;
        } else {
            r1();
        }
        this.f22507W = jO;
        this.f22492H = z10;
    }

    private final void h1() {
        n1(this.f22494J.k());
        this.f22500P.P();
    }

    private final void i0() {
        this.f22518k = null;
        this.f22519l = 0;
        this.f22520m = 0;
        this.f22507W = 0L;
        this.f22527t = false;
        this.f22500P.S();
        g2.a(this.f22491G);
        j0();
    }

    private final void i1(C2392b c2392b) {
        if (this.f22502R.e()) {
            this.f22500P.t(c2392b, this.f22495K);
        } else {
            this.f22500P.u(c2392b, this.f22495K, this.f22502R);
            this.f22502R = new Z.c();
        }
    }

    private final void j0() {
        this.f22523p = null;
        this.f22524q = null;
    }

    private final void j1(U0 u02) {
        C6540F c6540f = this.f22531x;
        if (c6540f == null) {
            c6540f = new C6540F(0, 1, null);
            this.f22531x = c6540f;
        }
        c6540f.s(this.f22494J.k(), u02);
    }

    private final void k1(int i10, int i11, int i12) {
        D1 d12 = this.f22494J;
        int iN = AbstractC2454w.N(d12, i10, i11, i12);
        while (i10 > 0 && i10 != iN) {
            if (d12.K(i10)) {
                this.f22500P.A();
            }
            i10 = d12.Q(i10);
        }
        u0(i11, iN);
    }

    private final long l0(int i10, int i11, long j10) {
        long jRotateLeft;
        long jRotateLeft2 = 0;
        int i12 = 3;
        int i13 = 0;
        while (i10 >= 0) {
            if (i10 == i11) {
                jRotateLeft = Long.rotateLeft(j10, i13);
            } else {
                int iN0 = N0(this.f22494J, i10);
                if (iN0 == 126665345) {
                    jRotateLeft = Long.rotateLeft(iN0, i13);
                } else {
                    jRotateLeft2 = (jRotateLeft2 ^ Long.rotateLeft(iN0, i12)) ^ Long.rotateLeft(this.f22494J.H(i10) ? 0 : c1(i10), i13);
                    i12 = (i12 + 6) % 64;
                    i13 = (i13 + 6) % 64;
                    i10 = this.f22494J.Q(i10);
                }
            }
            return jRotateLeft ^ jRotateLeft2;
        }
        return jRotateLeft2;
    }

    private final C2392b l1() {
        int i10;
        int i11;
        if (e()) {
            if (!AbstractC2454w.K(this.f22496L)) {
                return null;
            }
            int iZ = this.f22496L.Z() - 1;
            int iC0 = this.f22496L.C0(iZ);
            while (true) {
                int i12 = iC0;
                i11 = iZ;
                iZ = i12;
                if (iZ == this.f22496L.a0() || iZ < 0) {
                    break;
                }
                iC0 = this.f22496L.C0(iZ);
            }
            return this.f22496L.B(i11);
        }
        if (!AbstractC2454w.J(this.f22494J)) {
            return null;
        }
        int iK = this.f22494J.k() - 1;
        int iQ = this.f22494J.Q(iK);
        while (true) {
            int i13 = iQ;
            i10 = iK;
            iK = i13;
            if (iK == this.f22494J.u() || iK < 0) {
                break;
            }
            iQ = this.f22494J.Q(iK);
        }
        return this.f22494J.a(i10);
    }

    private final void m0() {
        if (!this.f22496L.Y()) {
            AbstractC2454w.t("Check failed");
        }
        F0();
    }

    private final void m1() {
        if (this.f22511d.n()) {
            H0().Y();
            Z.a aVar = new Z.a();
            this.f22499O = aVar;
            D1 d1F = this.f22511d.F();
            try {
                this.f22494J = d1F;
                Z.b bVar = this.f22500P;
                Z.a aVarO = bVar.o();
                try {
                    bVar.T(aVar);
                    n1(0);
                    this.f22500P.M();
                    bVar.T(aVarO);
                    Td.L l10 = Td.L.f17438a;
                } catch (Throwable th2) {
                    bVar.T(aVarO);
                    throw th2;
                }
            } finally {
                d1F.d();
            }
        }
    }

    private final U0 n0() {
        U0 u02 = this.f22498N;
        return u02 != null ? u02 : o0(this.f22494J.u());
    }

    private final void n1(int i10) {
        boolean zK = this.f22494J.K(i10);
        if (zK) {
            this.f22500P.i();
            this.f22500P.w(this.f22494J.M(i10));
        }
        o1(this, i10, i10, zK, 0);
        this.f22500P.i();
        if (zK) {
            this.f22500P.A();
        }
    }

    private final U0 o0(int i10) {
        U0 u02;
        if (e() && this.f22497M) {
            int iA0 = this.f22496L.a0();
            while (iA0 > 0) {
                if (this.f22496L.f0(iA0) == 202 && AbstractC5504s.c(this.f22496L.g0(iA0), AbstractC2454w.C())) {
                    Object objD0 = this.f22496L.d0(iA0);
                    AbstractC5504s.f(objD0, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    U0 u03 = (U0) objD0;
                    this.f22498N = u03;
                    return u03;
                }
                iA0 = this.f22496L.C0(iA0);
            }
        }
        if (this.f22494J.x() > 0) {
            while (i10 > 0) {
                if (this.f22494J.D(i10) == 202 && AbstractC5504s.c(this.f22494J.E(i10), AbstractC2454w.C())) {
                    C6540F c6540f = this.f22531x;
                    if (c6540f == null || (u02 = (U0) c6540f.c(i10)) == null) {
                        Object objA = this.f22494J.A(i10);
                        AbstractC5504s.f(objA, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        u02 = (U0) objA;
                    }
                    this.f22498N = u02;
                    return u02;
                }
                i10 = this.f22494J.Q(i10);
            }
        }
        U0 u04 = this.f22530w;
        this.f22498N = u04;
        return u04;
    }

    private static final int o1(C2442s c2442s, int i10, int i11, boolean z10, int i12) {
        D1 d12 = c2442s.f22494J;
        if (d12.G(i11)) {
            int iD = d12.D(i11);
            Object objE = d12.E(i11);
            if (iD != 206 || !AbstractC5504s.c(objE, AbstractC2454w.H())) {
                if (d12.K(i11)) {
                    return 1;
                }
                return d12.O(i11);
            }
            Object objC = d12.C(i11, 0);
            a aVar = objC instanceof a ? (a) objC : null;
            if (aVar != null) {
                for (C2442s c2442s2 : aVar.a().x()) {
                    c2442s2.m1();
                    c2442s.f22510c.s(c2442s2.H0());
                }
            }
            return d12.O(i11);
        }
        if (!d12.e(i11)) {
            if (d12.K(i11)) {
                return 1;
            }
            return d12.O(i11);
        }
        int iF = d12.F(i11) + i11;
        int iO1 = 0;
        for (int iF2 = i11 + 1; iF2 < iF; iF2 += d12.F(iF2)) {
            boolean zK = d12.K(iF2);
            if (zK) {
                c2442s.f22500P.i();
                c2442s.f22500P.w(d12.M(iF2));
            }
            iO1 += o1(c2442s, i10, iF2, zK || z10, zK ? 0 : i12 + iO1);
            if (zK) {
                c2442s.f22500P.i();
                c2442s.f22500P.A();
            }
        }
        if (d12.K(i11)) {
            return 1;
        }
        return iO1;
    }

    private final List p0() {
        if (!this.f22489E) {
            return AbstractC2279u.m();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(AbstractC5412b.c(this.f22496L, null, 0, null, 7, null));
        arrayList.addAll(AbstractC5412b.a(this.f22494J));
        arrayList.addAll(a1());
        return arrayList;
    }

    private final void q1() {
        this.f22520m += this.f22494J.T();
    }

    private final void r1() {
        this.f22520m = this.f22494J.v();
        this.f22494J.U();
    }

    private final void s0(C6550P c6550p, Function2 function2) {
        if (this.f22492H) {
            AbstractC2454w.t("Reentrant composition is not supported");
        }
        this.f22515h.a();
        g0.x xVar = g0.x.f47218a;
        Object objA = xVar.a("Compose:recompose");
        try {
            this.f22488D = Long.hashCode(AbstractC5003v.M().i());
            this.f22531x = null;
            D1(c6550p);
            this.f22519l = 0;
            this.f22492H = true;
            try {
                A1();
                Object objW0 = W0();
                if (objW0 != function2 && function2 != null) {
                    I1(function2);
                }
                c cVar = this.f22490F;
                C2507c c2507cB = U1.b();
                try {
                    c2507cB.c(cVar);
                    if (function2 != null) {
                        x1(200, AbstractC2454w.D());
                        g0.j.a(this, function2);
                        w0();
                    } else if ((!this.f22526s && !this.f22532y) || objW0 == null || AbstractC5504s.c(objW0, InterfaceC2425m.f22370a.a())) {
                        p1();
                    } else {
                        x1(200, AbstractC2454w.D());
                        g0.j.a(this, (Function2) kotlin.jvm.internal.V.e(objW0, 2));
                        w0();
                    }
                    c2507cB.y(c2507cB.p() - 1);
                    y0();
                    this.f22492H = false;
                    this.f22528u.clear();
                    m0();
                    Td.L l10 = Td.L.f17438a;
                    xVar.b(objA);
                } catch (Throwable th2) {
                    c2507cB.y(c2507cB.p() - 1);
                    throw th2;
                }
            } finally {
            }
        } catch (Throwable th3) {
            g0.x.f47218a.b(objA);
            throw th3;
        }
    }

    private final List s1(int i10, Integer num) {
        if (!this.f22489E) {
            return AbstractC2279u.m();
        }
        D1 d1F = this.f22511d.F();
        try {
            return AbstractC5412b.g(d1F, i10, num);
        } finally {
            d1F.d();
        }
    }

    public static final List t0(C2442s c2442s) {
        return c2442s.p0();
    }

    public static final boolean t1(Object obj, Object obj2) {
        if (obj2 == obj) {
            return true;
        }
        C2456w1 c2456w1 = obj2 instanceof C2456w1 ? (C2456w1) obj2 : null;
        return (c2456w1 != null ? c2456w1.b() : null) == obj;
    }

    private final void u0(int i10, int i11) {
        if (i10 <= 0 || i10 == i11) {
            return;
        }
        u0(this.f22494J.Q(i10), i11);
        if (this.f22494J.K(i10)) {
            this.f22500P.w(Y0(this.f22494J, i10));
        }
    }

    private final void v0(boolean z10) {
        long jRotateRight;
        long j10;
        int iW;
        List list;
        List list2;
        long jRotateRight2;
        long j11;
        int iE = this.f22522o.e() - 1;
        if (e()) {
            int iA0 = this.f22496L.a0();
            int iF0 = this.f22496L.f0(iA0);
            Object objG0 = this.f22496L.g0(iA0);
            Object objD0 = this.f22496L.d0(iA0);
            if (objG0 != null) {
                int iOrdinal = objG0 instanceof Enum ? ((Enum) objG0).ordinal() : objG0.hashCode();
                jRotateRight2 = Long.rotateRight(o() ^ ((long) 0), 3);
                j11 = iOrdinal;
            } else if (objD0 == null || iF0 != 207 || AbstractC5504s.c(objD0, InterfaceC2425m.f22370a.a())) {
                jRotateRight2 = Long.rotateRight(o() ^ ((long) iE), 3);
                j11 = iF0;
            } else {
                this.f22507W = Long.rotateRight(((long) objD0.hashCode()) ^ Long.rotateRight(o() ^ ((long) iE), 3), 3);
            }
            this.f22507W = Long.rotateRight(jRotateRight2 ^ j11, 3);
        } else {
            int iU = this.f22494J.u();
            int iD = this.f22494J.D(iU);
            Object objE = this.f22494J.E(iU);
            Object objA = this.f22494J.A(iU);
            if (objE != null) {
                int iOrdinal2 = objE instanceof Enum ? ((Enum) objE).ordinal() : objE.hashCode();
                jRotateRight = Long.rotateRight(o() ^ ((long) 0), 3);
                j10 = iOrdinal2;
            } else if (objA == null || iD != 207 || AbstractC5504s.c(objA, InterfaceC2425m.f22370a.a())) {
                jRotateRight = Long.rotateRight(o() ^ ((long) iE), 3);
                j10 = iD;
            } else {
                this.f22507W = Long.rotateRight(((long) objA.hashCode()) ^ Long.rotateRight(o() ^ ((long) iE), 3), 3);
            }
            this.f22507W = Long.rotateRight(jRotateRight ^ j10, 3);
        }
        int i10 = this.f22520m;
        T0 t02 = this.f22518k;
        if (t02 != null && t02.b().size() > 0) {
            List listB = t02.b();
            List listF = t02.f();
            Set setE = AbstractC4984c.e(listF);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = listF.size();
            int size2 = listB.size();
            int i11 = 0;
            int i12 = 0;
            int iO = 0;
            while (i11 < size2) {
                C2429n0 c2429n0 = (C2429n0) listB.get(i11);
                if (setE.contains(c2429n0)) {
                    list = listB;
                    if (!linkedHashSet.contains(c2429n0)) {
                        if (i12 < size) {
                            C2429n0 c2429n02 = (C2429n0) listF.get(i12);
                            if (c2429n02 != c2429n0) {
                                int iG = t02.g(c2429n02);
                                linkedHashSet.add(c2429n02);
                                if (iG != iO) {
                                    int iO2 = t02.o(c2429n02);
                                    list2 = listF;
                                    this.f22500P.x(t02.e() + iG, iO + t02.e(), iO2);
                                    t02.j(iG, iO, iO2);
                                } else {
                                    list2 = listF;
                                }
                            } else {
                                list2 = listF;
                                i11++;
                            }
                            i12++;
                            iO += t02.o(c2429n02);
                            listB = list;
                            listF = list2;
                        }
                    }
                    listB = list;
                } else {
                    this.f22500P.Q(t02.g(c2429n0) + t02.e(), c2429n0.c());
                    t02.n(c2429n0.b(), 0);
                    this.f22500P.y(c2429n0.b());
                    this.f22494J.R(c2429n0.b());
                    h1();
                    this.f22494J.T();
                    list = listB;
                    AbstractC2454w.S(this.f22528u, c2429n0.b(), c2429n0.b() + this.f22494J.F(c2429n0.b()));
                }
                i11++;
                listB = list;
            }
            this.f22500P.i();
            if (listB.size() > 0) {
                this.f22500P.y(this.f22494J.m());
                this.f22494J.U();
            }
        }
        boolean zE = e();
        if (!zE && (iW = this.f22494J.w()) > 0) {
            this.f22500P.Y(iW);
        }
        int i13 = this.f22519l;
        while (!this.f22494J.I()) {
            int iK = this.f22494J.k();
            h1();
            this.f22500P.Q(i13, this.f22494J.T());
            AbstractC2454w.S(this.f22528u, iK, this.f22494J.k());
        }
        if (zE) {
            if (z10) {
                this.f22502R.c();
                i10 = 1;
            }
            this.f22494J.f();
            int iA02 = this.f22496L.a0();
            this.f22496L.R();
            if (!this.f22494J.t()) {
                int iS0 = S0(iA02);
                this.f22496L.S();
                this.f22496L.J(true);
                i1(this.f22501Q);
                this.f22506V = false;
                if (!this.f22511d.isEmpty()) {
                    E1(iS0, 0);
                    F1(iS0, i10);
                }
            }
        } else {
            if (z10) {
                this.f22500P.A();
            }
            this.f22500P.g();
            int iU2 = this.f22494J.u();
            if (i10 != J1(iU2)) {
                F1(iU2, i10);
            }
            if (z10) {
                i10 = 1;
            }
            this.f22494J.g();
            this.f22500P.i();
        }
        C0(i10, zE);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void v1(int r11, java.lang.Object r12, int r13, java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.C2442s.v1(int, java.lang.Object, int, java.lang.Object):void");
    }

    private final void w0() {
        v0(false);
    }

    private final void w1(int i10) {
        v1(i10, null, AbstractC2408g0.f22332a.a(), null);
    }

    private final void x1(int i10, Object obj) {
        v1(i10, obj, AbstractC2408g0.f22332a.a(), null);
    }

    private final void y0() {
        w0();
        this.f22510c.c();
        w0();
        this.f22500P.k();
        E0();
        this.f22494J.d();
        this.f22526s = false;
        this.f22532y = AbstractC2454w.p(this.f22533z.g());
    }

    private final void y1(boolean z10, Object obj) {
        if (z10) {
            this.f22494J.X();
            return;
        }
        if (obj != null && this.f22494J.l() != obj) {
            this.f22500P.a0(obj);
        }
        this.f22494J.W();
    }

    private final void z0() {
        if (this.f22496L.Y()) {
            H1 h1G = this.f22495K.G();
            this.f22496L = h1G;
            h1G.U0();
            this.f22497M = false;
            this.f22498N = null;
        }
    }

    @Override // Y.InterfaceC2425m
    public InterfaceC2400d1 A() {
        return I0();
    }

    @Override // Y.InterfaceC2425m
    public void B() {
        if (this.f22485A && this.f22494J.u() == this.f22486B) {
            this.f22486B = -1;
            this.f22485A = false;
        }
        v0(false);
    }

    public final boolean B1(C2406f1 c2406f1, Object obj) {
        C2392b c2392bH = c2406f1.h();
        if (c2392bH == null) {
            return false;
        }
        int iD = c2392bH.d(this.f22494J.z());
        if (!this.f22492H || iD < this.f22494J.k()) {
            return false;
        }
        AbstractC2454w.I(this.f22528u, iD, c2406f1, obj);
        return true;
    }

    @Override // Y.InterfaceC2425m
    public void C(int i10) {
        v1(i10, null, AbstractC2408g0.f22332a.a(), null);
    }

    public final void C1(Object obj) {
        if (obj instanceof InterfaceC2453v1) {
            C2456w1 c2456w1 = new C2456w1((InterfaceC2453v1) obj, l1());
            if (e()) {
                this.f22500P.N(c2456w1);
            }
            this.f22512e.add(obj);
            obj = c2456w1;
        }
        I1(obj);
    }

    @Override // Y.InterfaceC2425m
    public Object D() {
        return X0();
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D1(t.C6550P r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.util.List r2 = r0.f22528u
            int r2 = Ud.AbstractC2279u.o(r2)
        La:
            r3 = -1
            if (r3 >= r2) goto L3f
            java.util.List r3 = r0.f22528u
            java.lang.Object r3 = r3.get(r2)
            Y.k0 r3 = (Y.C2420k0) r3
            Y.f1 r4 = r3.c()
            Y.b r4 = r4.h()
            if (r4 == 0) goto L37
            boolean r5 = r4.b()
            if (r5 == 0) goto L37
            int r5 = r3.b()
            int r6 = r4.a()
            if (r5 == r6) goto L3c
            int r4 = r4.a()
            r3.f(r4)
            goto L3c
        L37:
            java.util.List r3 = r0.f22528u
            r3.remove(r2)
        L3c:
            int r2 = r2 + (-1)
            goto La
        L3f:
            java.lang.Object[] r2 = r1.f60044b
            java.lang.Object[] r3 = r1.f60045c
            long[] r1 = r1.f60043a
            int r4 = r1.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto La2
            r6 = 0
        L4b:
            r7 = r1[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L9d
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        L65:
            if (r11 >= r9) goto L9b
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.32E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L97
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r2[r12]
            r12 = r3[r12]
            java.lang.String r14 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.AbstractC5504s.f(r13, r14)
            Y.f1 r13 = (Y.C2406f1) r13
            Y.b r14 = r13.h()
            if (r14 == 0) goto L97
            int r14 = r14.a()
            java.util.List r15 = r0.f22528u
            Y.A1 r5 = Y.A1.f22057a
            if (r12 != r5) goto L8f
            r12 = 0
        L8f:
            Y.k0 r5 = new Y.k0
            r5.<init>(r13, r14, r12)
            r15.add(r5)
        L97:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L65
        L9b:
            if (r9 != r10) goto La2
        L9d:
            if (r6 == r4) goto La2
            int r6 = r6 + 1
            goto L4b
        La2:
            java.util.List r1 = r0.f22528u
            java.util.Comparator r2 = Y.AbstractC2454w.i()
            Ud.AbstractC2279u.B(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.C2442s.D1(t.P):void");
    }

    @Override // Y.InterfaceC2425m
    public InterfaceC5415e E() {
        InterfaceC5415e interfaceC5415e = this.f22508X;
        if (interfaceC5415e != null) {
            return interfaceC5415e;
        }
        A a10 = new A(H0());
        this.f22508X = a10;
        return a10;
    }

    @Override // Y.InterfaceC2425m
    public boolean F(Object obj) {
        if (W0() == obj) {
            return false;
        }
        I1(obj);
        return true;
    }

    @Override // Y.InterfaceC2425m
    public void G() {
        v1(-127, null, AbstractC2408g0.f22332a.a(), null);
    }

    public final boolean G0() {
        return this.f22487C > 0;
    }

    @Override // Y.InterfaceC2425m
    public void H(int i10, Object obj) {
        v1(i10, obj, AbstractC2408g0.f22332a.a(), null);
    }

    public B H0() {
        return this.f22516i;
    }

    @Override // Y.InterfaceC2425m
    public void I() {
        v1(125, null, AbstractC2408g0.f22332a.c(), null);
        this.f22527t = true;
    }

    public final C2406f1 I0() {
        ArrayList arrayList = this.f22491G;
        if (this.f22487C == 0 && g2.f(arrayList)) {
            return (C2406f1) g2.g(arrayList);
        }
        return null;
    }

    public final void I1(Object obj) {
        if (e()) {
            this.f22496L.j1(obj);
            return;
        }
        if (!this.f22494J.r()) {
            Z.b bVar = this.f22500P;
            D1 d12 = this.f22494J;
            bVar.a(d12.a(d12.u()), obj);
            return;
        }
        int iQ = this.f22494J.q() - 1;
        if (!this.f22500P.q()) {
            this.f22500P.c0(obj, iQ);
            return;
        }
        Z.b bVar2 = this.f22500P;
        D1 d13 = this.f22494J;
        bVar2.Z(obj, d13.a(d13.u()), iQ);
    }

    @Override // Y.InterfaceC2425m
    public void J(int i10, Object obj) {
        if (!e() && this.f22494J.n() == i10 && !AbstractC5504s.c(this.f22494J.l(), obj) && this.f22486B < 0) {
            this.f22486B = this.f22494J.k();
            this.f22485A = true;
        }
        v1(i10, null, AbstractC2408g0.f22332a.a(), obj);
    }

    public final Z.a J0() {
        return this.f22499O;
    }

    @Override // Y.InterfaceC2425m
    public void K() {
        if (!(this.f22520m == 0)) {
            AbstractC2454w.t("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (e()) {
            return;
        }
        C2406f1 c2406f1I0 = I0();
        if (c2406f1I0 != null) {
            c2406f1I0.C();
        }
        if (this.f22528u.isEmpty()) {
            r1();
        } else {
            g1();
        }
    }

    public final C5418h K0() {
        if (this.f22489E) {
            return this.f22504T;
        }
        return null;
    }

    @Override // Y.InterfaceC2425m
    public void L(C2397c1[] c2397c1Arr) {
        U0 u0G1;
        U0 u0N0 = n0();
        x1(RCHTTPStatusCodes.CREATED, AbstractC2454w.F());
        boolean z10 = true;
        boolean z11 = false;
        if (e()) {
            u0G1 = G1(u0N0, J.d(c2397c1Arr, u0N0, null, 4, null));
            this.f22497M = true;
        } else {
            Object objB = this.f22494J.B(0);
            AbstractC5504s.f(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            U0 u02 = (U0) objB;
            Object objB2 = this.f22494J.B(1);
            AbstractC5504s.f(objB2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            U0 u03 = (U0) objB2;
            U0 u0C = J.c(c2397c1Arr, u0N0, u03);
            if (i() && !this.f22485A && AbstractC5504s.c(u03, u0C)) {
                q1();
                u0G1 = u02;
            } else {
                u0G1 = G1(u0N0, u0C);
                if (!this.f22485A && AbstractC5504s.c(u0G1, u02)) {
                    z10 = false;
                }
                z11 = z10;
            }
        }
        if (z11 && !e()) {
            j1(u0G1);
        }
        this.f22533z.h(AbstractC2454w.q(this.f22532y));
        this.f22532y = z11;
        this.f22498N = u0G1;
        v1(202, AbstractC2454w.C(), AbstractC2408g0.f22332a.a(), u0G1);
    }

    @Override // Y.InterfaceC2425m
    public void M() {
        w0();
        w0();
        this.f22532y = AbstractC2454w.p(this.f22533z.g());
        this.f22498N = null;
    }

    public final D1 M0() {
        return this.f22494J;
    }

    @Override // Y.InterfaceC2425m
    public boolean N() {
        C2406f1 c2406f1I0;
        return !i() || this.f22532y || ((c2406f1I0 = I0()) != null && c2406f1I0.k());
    }

    @Override // Y.InterfaceC2425m
    public void O() {
        w0();
    }

    @Override // Y.InterfaceC2425m
    public void P(C2397c1 c2397c1) {
        n2 n2Var;
        U0 u0N0 = n0();
        x1(RCHTTPStatusCodes.CREATED, AbstractC2454w.F());
        Object objD = D();
        if (AbstractC5504s.c(objD, InterfaceC2425m.f22370a.a())) {
            n2Var = null;
        } else {
            AbstractC5504s.f(objD, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            n2Var = (n2) objD;
        }
        D dB = c2397c1.b();
        AbstractC5504s.f(dB, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        AbstractC5504s.f(c2397c1, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
        n2 n2VarB = dB.b(c2397c1, n2Var);
        boolean zC = AbstractC5504s.c(n2VarB, n2Var);
        if (!zC) {
            u(n2VarB);
        }
        boolean z10 = true;
        boolean z11 = false;
        if (e()) {
            if (c2397c1.a() || !J.a(u0N0, dB)) {
                u0N0 = u0N0.x(dB, n2VarB);
            }
            this.f22497M = true;
        } else {
            D1 d12 = this.f22494J;
            Object objA = d12.A(d12.k());
            AbstractC5504s.f(objA, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            U0 u02 = (U0) objA;
            if (!(i() && zC) && (c2397c1.a() || !J.a(u0N0, dB))) {
                u0N0 = u0N0.x(dB, n2VarB);
            } else if ((zC && !this.f22532y) || !this.f22532y) {
                u0N0 = u02;
            }
            if (!this.f22485A && u02 == u0N0) {
                z10 = false;
            }
            z11 = z10;
        }
        if (z11 && !e()) {
            j1(u0N0);
        }
        this.f22533z.h(AbstractC2454w.q(this.f22532y));
        this.f22532y = z11;
        this.f22498N = u0N0;
        v1(202, AbstractC2454w.C(), AbstractC2408g0.f22332a.a(), u0N0);
    }

    @Override // Y.InterfaceC2425m
    public AbstractC2460y R() {
        x1(206, AbstractC2454w.H());
        if (e()) {
            H1.r0(this.f22496L, 0, 1, null);
        }
        Object objW0 = W0();
        a aVar = objW0 instanceof a ? (a) objW0 : null;
        if (aVar == null) {
            long jO = o();
            boolean z10 = this.f22525r;
            boolean z11 = this.f22489E;
            B bH0 = H0();
            if (bH0 == null) {
                bH0 = null;
            }
            aVar = new a(new b(jO, z10, z11, bH0 != null ? bH0.O() : null));
            I1(aVar);
        }
        aVar.a().A(n0());
        w0();
        return aVar.a();
    }

    public void R0(List list) {
        try {
            O0(list);
            i0();
        } catch (Throwable th2) {
            b0();
            throw th2;
        }
    }

    @Override // Y.InterfaceC2425m
    public void S() {
        w0();
    }

    @Override // Y.InterfaceC2425m
    public void T() {
        w0();
    }

    @Override // Y.InterfaceC2425m
    public boolean U(Object obj) {
        if (AbstractC5504s.c(W0(), obj)) {
            return false;
        }
        I1(obj);
        return true;
    }

    @Override // Y.InterfaceC2425m
    public void V(int i10) {
        if (this.f22518k != null) {
            v1(i10, null, AbstractC2408g0.f22332a.a(), null);
            return;
        }
        L1();
        this.f22507W = Long.rotateLeft(Long.rotateLeft(o(), 3) ^ ((long) i10), 3) ^ ((long) this.f22521n);
        this.f22521n++;
        D1 d12 = this.f22494J;
        if (e()) {
            d12.c();
            this.f22496L.e1(i10, InterfaceC2425m.f22370a.a());
            A0(false, null);
            return;
        }
        if (d12.n() == i10 && !d12.s()) {
            d12.W();
            A0(false, null);
            return;
        }
        if (!d12.I()) {
            int i11 = this.f22519l;
            int iK = d12.k();
            h1();
            this.f22500P.Q(i11, d12.T());
            AbstractC2454w.S(this.f22528u, iK, d12.k());
        }
        d12.c();
        this.f22506V = true;
        this.f22498N = null;
        z0();
        H1 h12 = this.f22496L;
        h12.F();
        int iZ = h12.Z();
        h12.e1(i10, InterfaceC2425m.f22370a.a());
        this.f22501Q = h12.B(iZ);
        A0(false, null);
    }

    public final boolean V0() {
        return this.f22492H;
    }

    public final Object W0() {
        if (e()) {
            L1();
            return InterfaceC2425m.f22370a.a();
        }
        Object objL = this.f22494J.L();
        return (!this.f22485A || (objL instanceof InterfaceC2465z1)) ? objL : InterfaceC2425m.f22370a.a();
    }

    public final Object X0() {
        if (e()) {
            L1();
            return InterfaceC2425m.f22370a.a();
        }
        Object objL = this.f22494J.L();
        return (!this.f22485A || (objL instanceof InterfaceC2465z1)) ? objL instanceof C2456w1 ? ((C2456w1) objL).b() : objL : InterfaceC2425m.f22370a.a();
    }

    @Override // Y.InterfaceC2425m
    public boolean a(boolean z10) {
        Object objW0 = W0();
        if ((objW0 instanceof Boolean) && z10 == ((Boolean) objW0).booleanValue()) {
            return false;
        }
        I1(Boolean.valueOf(z10));
        return true;
    }

    public final List a1() {
        InterfaceC2457x interfaceC2457xH = this.f22510c.h();
        B b10 = interfaceC2457xH instanceof B ? (B) interfaceC2457xH : null;
        if (b10 == null) {
            return AbstractC2279u.m();
        }
        Integer numE = AbstractC5412b.e(b10.P(), this.f22510c);
        if (numE == null) {
            return AbstractC2279u.m();
        }
        D1 d1F = b10.P().F();
        try {
            return AbstractC5412b.g(d1F, numE.intValue(), 0);
        } finally {
            d1F.d();
        }
    }

    @Override // Y.InterfaceC2425m
    public boolean b(float f10) {
        Object objW0 = W0();
        if ((objW0 instanceof Float) && f10 == ((Number) objW0).floatValue()) {
            return false;
        }
        I1(Float.valueOf(f10));
        return true;
    }

    public final void b1(InterfaceC5082a interfaceC5082a) {
        if (this.f22492H) {
            AbstractC2454w.t("Preparing a composition while composing is not supported");
        }
        this.f22492H = true;
        try {
            interfaceC5082a.invoke();
        } finally {
            this.f22492H = false;
        }
    }

    @Override // Y.InterfaceC2425m
    public boolean c(int i10) {
        Object objW0 = W0();
        if ((objW0 instanceof Integer) && i10 == ((Number) objW0).intValue()) {
            return false;
        }
        I1(Integer.valueOf(i10));
        return true;
    }

    @Override // Y.InterfaceC2425m
    public boolean d(long j10) {
        Object objW0 = W0();
        if ((objW0 instanceof Long) && j10 == ((Number) objW0).longValue()) {
            return false;
        }
        I1(Long.valueOf(j10));
        return true;
    }

    public final boolean d1(C6550P c6550p, C1 c12) {
        if (!this.f22513f.c()) {
            AbstractC2454w.t("Expected applyChanges() to have been called");
        }
        if (a0.g.f(c6550p) <= 0 && this.f22528u.isEmpty() && !this.f22526s) {
            return false;
        }
        this.f22503S = c12;
        try {
            s0(c6550p, null);
            this.f22503S = null;
            return this.f22513f.d();
        } catch (Throwable th2) {
            this.f22503S = null;
            throw th2;
        }
    }

    @Override // Y.InterfaceC2425m
    public boolean e() {
        return this.f22506V;
    }

    @Override // Y.InterfaceC2425m
    public void f(boolean z10) {
        if (!(this.f22520m == 0)) {
            AbstractC2454w.t("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (e()) {
            return;
        }
        if (!z10) {
            r1();
            return;
        }
        int iK = this.f22494J.k();
        int iJ = this.f22494J.j();
        this.f22500P.d();
        AbstractC2454w.S(this.f22528u, iK, iJ);
        this.f22494J.U();
    }

    @Override // Y.InterfaceC2425m
    public InterfaceC2425m g(int i10) {
        V(i10);
        g0();
        return this;
    }

    @Override // Y.InterfaceC2425m
    public void h(InterfaceC5082a interfaceC5082a) {
        K1();
        if (!e()) {
            AbstractC2454w.t("createNode() can only be called when inserting");
        }
        int iC = this.f22522o.c();
        H1 h12 = this.f22496L;
        C2392b c2392bB = h12.B(h12.a0());
        this.f22520m++;
        this.f22502R.b(interfaceC5082a, iC, c2392bB);
    }

    public final void h0() {
        this.f22531x = null;
    }

    @Override // Y.InterfaceC2425m
    public boolean i() {
        C2406f1 c2406f1I0;
        return (e() || this.f22485A || this.f22532y || (c2406f1I0 = I0()) == null || c2406f1I0.n() || this.f22526s) ? false : true;
    }

    @Override // Y.InterfaceC2425m
    public InterfaceC2398d j() {
        return this.f22509b;
    }

    @Override // Y.InterfaceC2425m
    public B1 k() {
        C2392b c2392bA;
        C2406f1 c2406f1 = null;
        C2406f1 c2406f12 = g2.f(this.f22491G) ? (C2406f1) g2.i(this.f22491G) : null;
        if (c2406f12 != null) {
            c2406f12.I(false);
            Function1 function1D0 = D0(c2406f12);
            if (function1D0 != null) {
                this.f22500P.f(function1D0, H0());
            }
            if (c2406f12.q()) {
                c2406f12.L(false);
                this.f22500P.j(c2406f12);
                c2406f12.M(false);
                if (c2406f12.p()) {
                    c2406f12.K(false);
                    this.f22485A = false;
                }
            }
        }
        if (c2406f12 != null && !c2406f12.s() && (c2406f12.t() || this.f22525r)) {
            if (c2406f12.h() == null) {
                if (e()) {
                    H1 h12 = this.f22496L;
                    c2392bA = h12.B(h12.a0());
                } else {
                    D1 d12 = this.f22494J;
                    c2392bA = d12.a(d12.u());
                }
                c2406f12.D(c2392bA);
            }
            c2406f12.F(false);
            c2406f1 = c2406f12;
        }
        v0(false);
        return c2406f1;
    }

    public final void k0(C6550P c6550p, Function2 function2, C1 c12) {
        if (!this.f22513f.c()) {
            AbstractC2454w.t("Expected applyChanges() to have been called");
        }
        this.f22503S = c12;
        try {
            s0(c6550p, function2);
        } finally {
            this.f22503S = null;
        }
    }

    @Override // Y.InterfaceC2425m
    public void l() {
        v1(125, null, AbstractC2408g0.f22332a.b(), null);
        this.f22527t = true;
    }

    @Override // Y.InterfaceC2425m
    public void m(Object obj, Function2 function2) {
        if (e()) {
            this.f22502R.f(obj, function2);
        } else {
            this.f22500P.b0(obj, function2);
        }
    }

    @Override // Y.InterfaceC2425m
    public Object n(D d10) {
        return J.b(n0(), d10);
    }

    @Override // Y.InterfaceC2425m
    public long o() {
        return this.f22507W;
    }

    @Override // Y.InterfaceC2425m
    public boolean p(boolean z10, int i10) {
        C2406f1 c2406f1I0;
        if ((i10 & 1) != 0 || (!e() && !this.f22485A)) {
            return z10 || !i();
        }
        C1 c12 = this.f22503S;
        if (c12 == null || (c2406f1I0 = I0()) == null || !c12.a()) {
            return true;
        }
        c2406f1I0.O(true);
        c2406f1I0.M(this.f22485A);
        c2406f1I0.H(true);
        this.f22500P.O(c2406f1I0);
        this.f22510c.r(c2406f1I0);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p1() {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.C2442s.p1():void");
    }

    @Override // Y.InterfaceC2425m
    public Zd.i q() {
        return this.f22505U;
    }

    public final void q0() {
        g2.a(this.f22491G);
        this.f22528u.clear();
        this.f22513f.a();
        this.f22531x = null;
    }

    @Override // Y.InterfaceC2425m
    public I r() {
        return n0();
    }

    public final void r0() {
        g0.x xVar = g0.x.f47218a;
        Object objA = xVar.a("Compose:Composer.dispose");
        try {
            this.f22510c.u(this);
            q0();
            j().clear();
            this.f22493I = true;
            Td.L l10 = Td.L.f17438a;
            xVar.b(objA);
        } catch (Throwable th2) {
            g0.x.f47218a.b(objA);
            throw th2;
        }
    }

    @Override // Y.InterfaceC2425m
    public void s() {
        K1();
        if (e()) {
            AbstractC2454w.t("useNode() called while inserting");
        }
        Object objL0 = L0(this.f22494J);
        this.f22500P.w(objL0);
        if (this.f22485A && (objL0 instanceof InterfaceC2413i)) {
            this.f22500P.d0(objL0);
        }
    }

    @Override // Y.InterfaceC2425m
    public void t(InterfaceC5082a interfaceC5082a) {
        this.f22500P.V(interfaceC5082a);
    }

    @Override // Y.InterfaceC2425m
    public void u(Object obj) {
        C1(obj);
    }

    public final List u1(final Object obj) {
        List listI0;
        if (!this.f22489E) {
            return AbstractC2279u.m();
        }
        C5427q c5427qD = AbstractC5412b.d(this.f22511d, new Function1() { // from class: Y.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(C2442s.t1(obj, obj2));
            }
        });
        return (c5427qD == null || (listI0 = AbstractC2279u.I0(s1(c5427qD.a(), c5427qD.b()), a1())) == null) ? AbstractC2279u.m() : listI0;
    }

    @Override // Y.InterfaceC2425m
    public void v(InterfaceC2400d1 interfaceC2400d1) {
        C2406f1 c2406f1 = interfaceC2400d1 instanceof C2406f1 ? (C2406f1) interfaceC2400d1 : null;
        if (c2406f1 != null) {
            c2406f1.O(true);
        }
    }

    @Override // Y.InterfaceC2425m
    public void w() {
        w0();
        w0();
        this.f22532y = AbstractC2454w.p(this.f22533z.g());
        this.f22498N = null;
    }

    @Override // Y.InterfaceC2425m
    public void x() {
        v0(true);
    }

    public final void x0() {
        if (!(!this.f22492H && this.f22486B == 100)) {
            V0.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f22486B = -1;
        this.f22485A = false;
    }

    @Override // Y.InterfaceC2425m
    public void y() {
        w0();
        C2406f1 c2406f1I0 = I0();
        if (c2406f1I0 == null || !c2406f1I0.t()) {
            return;
        }
        c2406f1I0.E(true);
    }

    @Override // Y.InterfaceC2425m
    public void z() {
        this.f22525r = true;
        this.f22489E = true;
        this.f22511d.l();
        this.f22495K.l();
        this.f22496L.s1();
    }

    public final void z1() {
        this.f22486B = 100;
        this.f22485A = true;
    }

    /* JADX INFO: renamed from: Y.s$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC2465z1 {

        /* JADX INFO: renamed from: a */
        private final b f22534a;

        public a(b bVar) {
            this.f22534a = bVar;
        }

        public final b a() {
            return this.f22534a;
        }

        @Override // Y.InterfaceC2453v1
        public void d() {
            this.f22534a.w();
        }

        @Override // Y.InterfaceC2453v1
        public void e() {
            this.f22534a.w();
        }

        @Override // Y.InterfaceC2453v1
        public void c() {
        }
    }
}
