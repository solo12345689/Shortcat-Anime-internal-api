package K0;

import I0.AbstractC1675a;
import K0.J;
import Td.C2160k;
import a0.C2507c;
import androidx.compose.ui.layout.s;
import be.AbstractC3048a;
import i1.C5009b;
import i1.C5021n;
import i1.C5025r;
import ie.InterfaceC5082a;
import java.util.List;
import java.util.Map;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import v0.C6811c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class V extends androidx.compose.ui.layout.s implements I0.A, InterfaceC1778b, Z {

    /* JADX INFO: renamed from: A */
    private boolean f10549A;

    /* JADX INFO: renamed from: f */
    private final O f10550f;

    /* JADX INFO: renamed from: g */
    private boolean f10551g;

    /* JADX INFO: renamed from: k */
    private boolean f10555k;

    /* JADX INFO: renamed from: l */
    private boolean f10556l;

    /* JADX INFO: renamed from: m */
    private boolean f10557m;

    /* JADX INFO: renamed from: n */
    private C5009b f10558n;

    /* JADX INFO: renamed from: p */
    private float f10560p;

    /* JADX INFO: renamed from: q */
    private Function1 f10561q;

    /* JADX INFO: renamed from: r */
    private C6811c f10562r;

    /* JADX INFO: renamed from: w */
    private boolean f10567w;

    /* JADX INFO: renamed from: z */
    private boolean f10570z;

    /* JADX INFO: renamed from: h */
    private int f10552h = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: i */
    private int f10553i = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: j */
    private J.g f10554j = J.g.f10486c;

    /* JADX INFO: renamed from: o */
    private long f10559o = C5021n.f48560b.b();

    /* JADX INFO: renamed from: s */
    private a f10563s = a.f10573c;

    /* JADX INFO: renamed from: t */
    private final AbstractC1776a f10564t = new S(this);

    /* JADX INFO: renamed from: u */
    private final C2507c f10565u = new C2507c(new V[16], 0);

    /* JADX INFO: renamed from: v */
    private boolean f10566v = true;

    /* JADX INFO: renamed from: x */
    private boolean f10568x = true;

    /* JADX INFO: renamed from: y */
    private Object f10569y = O1().j();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a extends Enum {

        /* JADX INFO: renamed from: a */
        public static final a f10571a = new a("IsPlacedInLookahead", 0);

        /* JADX INFO: renamed from: b */
        public static final a f10572b = new a("IsPlacedInApproach", 1);

        /* JADX INFO: renamed from: c */
        public static final a f10573c = new a("IsNotPlaced", 2);

        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ a[] f10574d;

        /* JADX INFO: renamed from: e */
        private static final /* synthetic */ EnumEntries f10575e;

        static {
            a[] aVarArrA = a();
            f10574d = aVarArrA;
            f10575e = AbstractC3048a.a(aVarArrA);
        }

        private a(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f10571a, f10572b, f10573c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f10574d.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10576a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f10577b;

        static {
            int[] iArr = new int[J.e.values().length];
            try {
                iArr[J.e.f10477b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[J.e.f10476a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[J.e.f10478c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[J.e.f10479d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f10576a = iArr;
            int[] iArr2 = new int[J.g.values().length];
            try {
                iArr2[J.g.f10484a.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[J.g.f10485b.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f10577b = iArr2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ U f10579b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            public static final a f10580a = new a();

            a() {
                super(1);
            }

            public final void a(InterfaceC1778b interfaceC1778b) {
                interfaceC1778b.z().t(false);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((InterfaceC1778b) obj);
                return Td.L.f17438a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            public static final b f10581a = new b();

            b() {
                super(1);
            }

            public final void a(InterfaceC1778b interfaceC1778b) {
                interfaceC1778b.z().q(interfaceC1778b.z().l());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((InterfaceC1778b) obj);
                return Td.L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(U u10) {
            super(0);
            this.f10579b = u10;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m18invoke();
            return Td.L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m18invoke() {
            V.this.F1();
            V.this.C0(a.f10580a);
            U uI2 = V.this.f0().I2();
            if (uI2 != null) {
                boolean zU1 = uI2.U1();
                List listP = V.this.K1().P();
                int size = listP.size();
                for (int i10 = 0; i10 < size; i10++) {
                    U uI22 = ((J) listP.get(i10)).w0().I2();
                    if (uI22 != null) {
                        uI22.a2(zU1);
                    }
                }
            }
            this.f10579b.M1().A();
            U uI23 = V.this.f0().I2();
            if (uI23 != null) {
                uI23.U1();
                List listP2 = V.this.K1().P();
                int size2 = listP2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    U uI24 = ((J) listP2.get(i11)).w0().I2();
                    if (uI24 != null) {
                        uI24.a2(false);
                    }
                }
            }
            V.this.E1();
            V.this.C0(b.f10581a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ long f10583b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j10) {
            super(0);
            this.f10583b = j10;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m19invoke();
            return Td.L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m19invoke() {
            U uI2 = V.this.R1().I2();
            AbstractC5504s.e(uI2);
            uI2.v0(this.f10583b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ p0 f10585b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ long f10586c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(p0 p0Var, long j10) {
            super(0);
            this.f10585b = p0Var;
            this.f10586c = j10;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m20invoke();
            return Td.L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m20invoke() {
            U uI2;
            s.a aVarO1 = null;
            if (P.a(V.this.K1()) || V.this.f10550f.h()) {
                AbstractC1785e0 abstractC1785e0P2 = V.this.R1().P2();
                if (abstractC1785e0P2 != null) {
                    aVarO1 = abstractC1785e0P2.O1();
                }
            } else {
                AbstractC1785e0 abstractC1785e0P22 = V.this.R1().P2();
                if (abstractC1785e0P22 != null && (uI2 = abstractC1785e0P22.I2()) != null) {
                    aVarO1 = uI2.O1();
                }
            }
            if (aVarO1 == null) {
                aVarO1 = this.f10585b.getPlacementScope();
            }
            V v10 = V.this;
            long j10 = this.f10586c;
            U uI22 = v10.R1().I2();
            AbstractC5504s.e(uI22);
            s.a.U(aVarO1, uI22, j10, 0.0f, 2, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final f f10587a = new f();

        f() {
            super(1);
        }

        public final void a(InterfaceC1778b interfaceC1778b) {
            interfaceC1778b.z().u(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC1778b) obj);
            return Td.L.f17438a;
        }
    }

    public V(O o10) {
        this.f10550f = o10;
    }

    public final void E1() {
        C2507c c2507cI0 = K1().I0();
        Object[] objArr = c2507cI0.f23496a;
        int iP = c2507cI0.p();
        for (int i10 = 0; i10 < iP; i10++) {
            V vU = ((J) objArr[i10]).d0().u();
            AbstractC5504s.e(vU);
            int i11 = vU.f10552h;
            int i12 = vU.f10553i;
            if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                vU.W1(true);
            }
        }
    }

    public final void F1() {
        this.f10550f.X(0);
        C2507c c2507cI0 = K1().I0();
        Object[] objArr = c2507cI0.f23496a;
        int iP = c2507cI0.p();
        for (int i10 = 0; i10 < iP; i10++) {
            V vU = ((J) objArr[i10]).d0().u();
            AbstractC5504s.e(vU);
            vU.f10552h = vU.f10553i;
            vU.f10553i = Integer.MAX_VALUE;
            if (vU.f10554j == J.g.f10485b) {
                vU.f10554j = J.g.f10486c;
            }
        }
    }

    private final boolean H1() {
        return this.f10550f.h();
    }

    public final J K1() {
        return this.f10550f.l();
    }

    private final boolean L1() {
        return this.f10550f.r();
    }

    private final boolean M1() {
        return this.f10550f.s();
    }

    private final J.e N1() {
        return this.f10550f.n();
    }

    public final AbstractC1785e0 R1() {
        return this.f10550f.z();
    }

    private final void X1() {
        a aVar = this.f10563s;
        if (H1()) {
            this.f10563s = a.f10572b;
        } else {
            this.f10563s = a.f10571a;
        }
        if (aVar != a.f10571a && this.f10550f.t()) {
            J.E1(K1(), true, false, false, 6, null);
        }
        C2507c c2507cI0 = K1().I0();
        Object[] objArr = c2507cI0.f23496a;
        int iP = c2507cI0.p();
        for (int i10 = 0; i10 < iP; i10++) {
            J j10 = (J) objArr[i10];
            V vI0 = j10.i0();
            if (vI0 == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (vI0.f10553i != Integer.MAX_VALUE) {
                vI0.X1();
                j10.J1(j10);
            }
        }
    }

    private final void a2() {
        C2507c c2507cI0 = K1().I0();
        Object[] objArr = c2507cI0.f23496a;
        int iP = c2507cI0.p();
        for (int i10 = 0; i10 < iP; i10++) {
            J j10 = (J) objArr[i10];
            if (j10.h0() && j10.p0() == J.g.f10484a) {
                V vU = j10.d0().u();
                AbstractC5504s.e(vU);
                C5009b c5009bK = j10.d0().k();
                AbstractC5504s.e(c5009bK);
                if (vU.g2(c5009bK.r())) {
                    J.E1(K1(), false, false, false, 7, null);
                }
            }
        }
    }

    private final void b2() {
        J.E1(K1(), false, false, false, 7, null);
        J jA0 = K1().A0();
        if (jA0 == null || K1().b0() != J.g.f10486c) {
            return;
        }
        J jK1 = K1();
        int i10 = b.f10576a[jA0.f0().ordinal()];
        jK1.R1(i10 != 2 ? i10 != 3 ? jA0.b0() : J.g.f10485b : J.g.f10484a);
    }

    private final void f2(long j10, float f10, Function1 function1, C6811c c6811c) throws Throwable {
        J jK1 = K1();
        try {
            J jA0 = K1().A0();
            J.e eVarF0 = jA0 != null ? jA0.f0() : null;
            J.e eVar = J.e.f10479d;
            if (eVarF0 == eVar) {
                this.f10550f.Q(false);
            }
            if (K1().z()) {
                H0.a.a("place is called on a deactivated node");
            }
            l2(eVar);
            this.f10556l = true;
            this.f10549A = false;
            if (!C5021n.j(j10, this.f10559o)) {
                if (this.f10550f.p() || this.f10550f.q()) {
                    j2(true);
                }
                Y1();
            }
            p0 p0VarB = N.b(K1());
            if (L1() || !p()) {
                this.f10550f.S(false);
                z().r(false);
                r0.d(p0VarB.getSnapshotObserver(), K1(), false, new e(p0VarB, j10), 2, null);
            } else {
                U uI2 = R1().I2();
                AbstractC5504s.e(uI2);
                uI2.m2(j10);
                d2();
            }
            this.f10559o = j10;
            this.f10560p = f10;
            this.f10561q = function1;
            this.f10562r = c6811c;
            l2(J.e.f10480e);
            Td.L l10 = Td.L.f17438a;
        } catch (Throwable th2) {
            jK1.M1(th2);
            throw new C2160k();
        }
    }

    private final void j2(boolean z10) {
        this.f10550f.U(z10);
    }

    private final void k2(boolean z10) {
        this.f10550f.V(z10);
    }

    private final void l2(J.e eVar) {
        this.f10550f.R(eVar);
    }

    private final void m2(boolean z10) {
        this.f10550f.W(z10);
    }

    private final void q2(J j10) {
        J.g gVar;
        J jA0 = j10.A0();
        if (jA0 == null) {
            this.f10554j = J.g.f10486c;
            return;
        }
        if (!(this.f10554j == J.g.f10486c || j10.M())) {
            H0.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
        }
        int i10 = b.f10576a[jA0.f0().ordinal()];
        if (i10 == 1 || i10 == 2) {
            gVar = J.g.f10484a;
        } else {
            if (i10 != 3 && i10 != 4) {
                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + jA0.f0());
            }
            gVar = J.g.f10485b;
        }
        this.f10554j = gVar;
    }

    @Override // K0.InterfaceC1778b
    public void C0(Function1 function1) {
        C2507c c2507cI0 = K1().I0();
        Object[] objArr = c2507cI0.f23496a;
        int iP = c2507cI0.p();
        for (int i10 = 0; i10 < iP; i10++) {
            InterfaceC1778b interfaceC1778bO = ((J) objArr[i10]).d0().o();
            AbstractC5504s.e(interfaceC1778bO);
            function1.invoke(interfaceC1778bO);
        }
    }

    @Override // K0.InterfaceC1778b
    public void G0() {
        J.E1(K1(), false, false, false, 7, null);
    }

    public final List G1() {
        K1().P();
        if (!this.f10566v) {
            return this.f10565u.h();
        }
        J jK1 = K1();
        C2507c c2507c = this.f10565u;
        C2507c c2507cI0 = jK1.I0();
        Object[] objArr = c2507cI0.f23496a;
        int iP = c2507cI0.p();
        for (int i10 = 0; i10 < iP; i10++) {
            J j10 = (J) objArr[i10];
            if (c2507c.p() <= i10) {
                V vU = j10.d0().u();
                AbstractC5504s.e(vU);
                c2507c.c(vU);
            } else {
                V vU2 = j10.d0().u();
                AbstractC5504s.e(vU2);
                c2507c.D(i10, vU2);
            }
        }
        c2507c.z(jK1.P().size(), c2507c.p());
        this.f10566v = false;
        return this.f10565u.h();
    }

    @Override // I0.InterfaceC1686l
    public int I(int i10) {
        b2();
        U uI2 = R1().I2();
        AbstractC5504s.e(uI2);
        return uI2.I(i10);
    }

    public final C5009b I1() {
        return this.f10558n;
    }

    public final boolean J1() {
        return this.f10567w;
    }

    @Override // K0.InterfaceC1778b
    public Map L() {
        if (!this.f10555k) {
            if (N1() == J.e.f10477b) {
                z().s(true);
                if (z().g()) {
                    this.f10550f.E();
                }
            } else {
                z().r(true);
            }
        }
        U uI2 = f0().I2();
        if (uI2 != null) {
            uI2.a2(true);
        }
        Y();
        U uI22 = f0().I2();
        if (uI22 != null) {
            uI22.a2(false);
        }
        return z().h();
    }

    @Override // I0.D
    public int N(AbstractC1675a abstractC1675a) {
        J jA0 = K1().A0();
        if ((jA0 != null ? jA0.f0() : null) == J.e.f10477b) {
            z().u(true);
        } else {
            J jA02 = K1().A0();
            if ((jA02 != null ? jA02.f0() : null) == J.e.f10479d) {
                z().t(true);
            }
        }
        this.f10555k = true;
        U uI2 = R1().I2();
        AbstractC5504s.e(uI2);
        int iN = uI2.N(abstractC1675a);
        this.f10555k = false;
        return iN;
    }

    public final X O1() {
        return this.f10550f.v();
    }

    public final J.g P1() {
        return this.f10554j;
    }

    public final boolean Q1() {
        if (P.a(K1())) {
            return true;
        }
        if (this.f10563s == a.f10573c && !this.f10550f.g()) {
            this.f10550f.Q(true);
        }
        return H1();
    }

    @Override // K0.InterfaceC1778b
    public InterfaceC1778b S() {
        O oD0;
        J jA0 = K1().A0();
        if (jA0 == null || (oD0 = jA0.d0()) == null) {
            return null;
        }
        return oD0.o();
    }

    public final boolean S1() {
        return this.f10556l;
    }

    public final void T1(boolean z10) {
        J j10;
        J jA0 = K1().A0();
        J.g gVarB0 = K1().b0();
        if (jA0 == null || gVarB0 == J.g.f10486c) {
            return;
        }
        do {
            j10 = jA0;
            if (j10.b0() != gVarB0) {
                break;
            } else {
                jA0 = j10.A0();
            }
        } while (jA0 != null);
        int i10 = b.f10577b[gVarB0.ordinal()];
        if (i10 == 1) {
            if (j10.j0() != null) {
                J.E1(j10, z10, false, false, 6, null);
                return;
            } else {
                J.I1(j10, z10, false, false, 6, null);
                return;
            }
        }
        if (i10 != 2) {
            throw new IllegalStateException("Intrinsics isn't used by the parent");
        }
        if (j10.j0() != null) {
            j10.B1(z10);
        } else {
            j10.F1(z10);
        }
    }

    public final void U1() {
        this.f10568x = true;
    }

    public final void V1() {
        j2(true);
        k2(true);
    }

    @Override // K0.Z
    public void W(boolean z10) {
        U uI2;
        U uI22 = R1().I2();
        if (!AbstractC5504s.c(Boolean.valueOf(z10), uI22 != null ? Boolean.valueOf(uI22.T1()) : null) && (uI2 = R1().I2()) != null) {
            uI2.Z1(z10);
        }
        p2(z10);
    }

    public final void W1(boolean z10) {
        if (z10 && H1()) {
            return;
        }
        if (z10 || H1()) {
            this.f10563s = a.f10573c;
            C2507c c2507cI0 = K1().I0();
            Object[] objArr = c2507cI0.f23496a;
            int iP = c2507cI0.p();
            for (int i10 = 0; i10 < iP; i10++) {
                V vU = ((J) objArr[i10]).d0().u();
                AbstractC5504s.e(vU);
                vU.W1(true);
            }
        }
    }

    @Override // K0.InterfaceC1778b
    public void Y() {
        this.f10567w = true;
        z().o();
        if (L1()) {
            a2();
        }
        U uI2 = f0().I2();
        AbstractC5504s.e(uI2);
        if (M1() || (!this.f10555k && !uI2.U1() && L1())) {
            j2(false);
            J.e eVarN1 = N1();
            l2(J.e.f10479d);
            p0 p0VarB = N.b(K1());
            this.f10550f.T(false);
            r0.f(p0VarB.getSnapshotObserver(), K1(), false, new c(uI2), 2, null);
            l2(eVarN1);
            if (this.f10550f.q() && uI2.U1()) {
                requestLayout();
            }
            k2(false);
        }
        if (z().l()) {
            z().q(true);
        }
        if (z().g() && z().k()) {
            z().n();
        }
        this.f10567w = false;
    }

    @Override // androidx.compose.ui.layout.s
    public void Y0(long j10, float f10, Function1 function1) throws Throwable {
        f2(j10, f10, function1, null);
    }

    public final void Y1() {
        if (this.f10550f.d() > 0) {
            C2507c c2507cI0 = K1().I0();
            Object[] objArr = c2507cI0.f23496a;
            int iP = c2507cI0.p();
            for (int i10 = 0; i10 < iP; i10++) {
                J j10 = (J) objArr[i10];
                O oD0 = j10.d0();
                if ((oD0.q() || oD0.p()) && !oD0.r()) {
                    J.C1(j10, false, 1, null);
                }
                V vU = oD0.u();
                if (vU != null) {
                    vU.Y1();
                }
            }
        }
    }

    @Override // I0.InterfaceC1686l
    public int Z(int i10) {
        b2();
        U uI2 = R1().I2();
        AbstractC5504s.e(uI2);
        return uI2.Z(i10);
    }

    public final void Z1() {
        this.f10563s = a.f10571a;
    }

    @Override // androidx.compose.ui.layout.s
    public void a1(long j10, float f10, C6811c c6811c) throws Throwable {
        f2(j10, f10, null, c6811c);
    }

    public final void c2() {
        this.f10553i = Integer.MAX_VALUE;
        this.f10552h = Integer.MAX_VALUE;
        this.f10563s = a.f10573c;
    }

    public final void d2() {
        this.f10549A = true;
        J jA0 = K1().A0();
        if ((this.f10563s != a.f10571a && !H1()) || (this.f10563s != a.f10572b && H1())) {
            X1();
            if (this.f10551g && jA0 != null) {
                J.C1(jA0, false, 1, null);
            }
        }
        if (jA0 == null) {
            this.f10553i = 0;
        } else if (!this.f10551g && (jA0.f0() == J.e.f10478c || jA0.f0() == J.e.f10479d)) {
            if (!(this.f10553i == Integer.MAX_VALUE)) {
                H0.a.b("Place was called on a node which was placed already");
            }
            this.f10553i = jA0.d0().x();
            O oD0 = jA0.d0();
            oD0.X(oD0.x() + 1);
        }
        Y();
    }

    public final void e2(long j10) {
        l2(J.e.f10477b);
        m2(false);
        r0.h(N.b(K1()).getSnapshotObserver(), K1(), false, new d(j10), 2, null);
        V1();
        if (P.a(K1())) {
            O1().Z1();
        } else {
            O1().a2();
        }
        l2(J.e.f10480e);
    }

    @Override // K0.InterfaceC1778b
    public AbstractC1785e0 f0() {
        return K1().X();
    }

    public final boolean g2(long j10) throws Throwable {
        long jC;
        J jK1 = K1();
        try {
            if (K1().z()) {
                H0.a.a("measure is called on a deactivated node");
            }
            J jA0 = K1().A0();
            K1().N1(K1().M() || (jA0 != null && jA0.M()));
            if (!K1().h0()) {
                C5009b c5009b = this.f10558n;
                if (c5009b == null ? false : C5009b.f(c5009b.r(), j10)) {
                    p0 p0VarZ0 = K1().z0();
                    if (p0VarZ0 != null) {
                        p0VarZ0.J(K1(), true);
                    }
                    K1().L1();
                    return false;
                }
            }
            this.f10558n = C5009b.a(j10);
            i1(j10);
            z().s(false);
            C0(f.f10587a);
            if (this.f10557m) {
                jC = R0();
            } else {
                long j11 = Integer.MIN_VALUE;
                jC = C5025r.c((j11 & 4294967295L) | (j11 << 32));
            }
            this.f10557m = true;
            U uI2 = R1().I2();
            if (!(uI2 != null)) {
                H0.a.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            this.f10550f.J(j10);
            b1(C5025r.c((((long) uI2.P0()) & 4294967295L) | (((long) uI2.W0()) << 32)));
            return (((int) (jC >> 32)) == uI2.W0() && ((int) (jC & 4294967295L)) == uI2.P0()) ? false : true;
        } catch (Throwable th2) {
            jK1.M1(th2);
            throw new C2160k();
        }
    }

    public final void h2() {
        V v10;
        boolean zP;
        J jA0;
        try {
            this.f10551g = true;
            if (!this.f10556l) {
                H0.a.b("replace() called on item that was not placed");
            }
            this.f10549A = false;
            zP = p();
            v10 = this;
        } catch (Throwable th2) {
            th = th2;
            v10 = this;
        }
        try {
            v10.f2(this.f10559o, 0.0f, this.f10561q, this.f10562r);
            if (zP && !v10.f10549A && (jA0 = K1().A0()) != null) {
                J.C1(jA0, false, 1, null);
            }
            v10.f10551g = false;
        } catch (Throwable th3) {
            th = th3;
            v10.f10551g = false;
            throw th;
        }
    }

    public final void i2(boolean z10) {
        this.f10566v = z10;
    }

    @Override // I0.D, I0.InterfaceC1686l
    public Object j() {
        return this.f10569y;
    }

    @Override // I0.InterfaceC1686l
    public int l0(int i10) {
        b2();
        U uI2 = R1().I2();
        AbstractC5504s.e(uI2);
        return uI2.l0(i10);
    }

    public final void n2(J.g gVar) {
        this.f10554j = gVar;
    }

    public final void o2(int i10) {
        this.f10553i = i10;
    }

    @Override // K0.InterfaceC1778b
    public boolean p() {
        return this.f10563s != a.f10573c;
    }

    public void p2(boolean z10) {
        this.f10570z = z10;
    }

    @Override // I0.InterfaceC1686l
    public int q0(int i10) {
        b2();
        U uI2 = R1().I2();
        AbstractC5504s.e(uI2);
        return uI2.q0(i10);
    }

    public final boolean r2() {
        if (j() == null) {
            U uI2 = R1().I2();
            AbstractC5504s.e(uI2);
            if (uI2.j() == null) {
                return false;
            }
        }
        if (!this.f10568x) {
            return false;
        }
        this.f10568x = false;
        U uI22 = R1().I2();
        AbstractC5504s.e(uI22);
        this.f10569y = uI22.j();
        return true;
    }

    @Override // K0.InterfaceC1778b
    public void requestLayout() {
        J.C1(K1(), false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0027  */
    @Override // I0.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.compose.ui.layout.s v0(long r4) throws java.lang.Throwable {
        /*
            r3 = this;
            K0.J r0 = r3.K1()
            K0.J r0 = r0.A0()
            r1 = 0
            if (r0 == 0) goto L10
            K0.J$e r0 = r0.f0()
            goto L11
        L10:
            r0 = r1
        L11:
            K0.J$e r2 = K0.J.e.f10477b
            if (r0 == r2) goto L27
            K0.J r0 = r3.K1()
            K0.J r0 = r0.A0()
            if (r0 == 0) goto L23
            K0.J$e r1 = r0.f0()
        L23:
            K0.J$e r0 = K0.J.e.f10479d
            if (r1 != r0) goto L2d
        L27:
            K0.O r0 = r3.f10550f
            r1 = 0
            r0.P(r1)
        L2d:
            K0.J r0 = r3.K1()
            r3.q2(r0)
            K0.J r0 = r3.K1()
            K0.J$g r0 = r0.b0()
            K0.J$g r1 = K0.J.g.f10486c
            if (r0 != r1) goto L47
            K0.J r0 = r3.K1()
            r0.C()
        L47:
            r3.g2(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.V.v0(long):androidx.compose.ui.layout.s");
    }

    @Override // K0.InterfaceC1778b
    public AbstractC1776a z() {
        return this.f10564t;
    }
}
