package androidx.compose.ui.layout;

import I0.C1679e;
import I0.P;
import K0.C1781c0;
import K0.J;
import K0.J0;
import K0.N;
import K0.U;
import K0.V;
import K0.X;
import K0.n0;
import Td.C2160k;
import Td.L;
import Ud.AbstractC2279u;
import Y.AbstractC2454w;
import Y.AbstractC2460y;
import Y.C0;
import Y.C1;
import Y.InterfaceC2413i;
import Y.InterfaceC2425m;
import Y.InterfaceC2462y1;
import Y.N0;
import Y.Q0;
import Y.b2;
import a0.C2507c;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.C;
import androidx.compose.ui.layout.D;
import androidx.compose.ui.platform.p1;
import i0.AbstractC4993l;
import i1.C5009b;
import i1.EnumC5027t;
import ie.InterfaceC5082a;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t.C6541G;
import t.C6550P;
import t.d0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements InterfaceC2413i {

    /* JADX INFO: renamed from: a */
    private final J f26943a;

    /* JADX INFO: renamed from: b */
    private AbstractC2460y f26944b;

    /* JADX INFO: renamed from: c */
    private D f26945c;

    /* JADX INFO: renamed from: d */
    private int f26946d;

    /* JADX INFO: renamed from: e */
    private int f26947e;

    /* JADX INFO: renamed from: n */
    private int f26956n;

    /* JADX INFO: renamed from: o */
    private int f26957o;

    /* JADX INFO: renamed from: f */
    private final C6550P f26948f = d0.b();

    /* JADX INFO: renamed from: g */
    private final C6550P f26949g = d0.b();

    /* JADX INFO: renamed from: h */
    private final c f26950h = new c();

    /* JADX INFO: renamed from: i */
    private final a f26951i = new a();

    /* JADX INFO: renamed from: j */
    private final C6550P f26952j = d0.b();

    /* JADX INFO: renamed from: k */
    private final D.a f26953k = new D.a(null, 1, null);

    /* JADX INFO: renamed from: l */
    private final C6550P f26954l = d0.b();

    /* JADX INFO: renamed from: m */
    private final C2507c f26955m = new C2507c(new Object[16], 0);

    /* JADX INFO: renamed from: p */
    private final String f26958p = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class a implements P, l {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ c f26959a;

        public a() {
            this.f26959a = j.this.f26950h;
        }

        @Override // i1.InterfaceC5011d
        public float A(int i10) {
            return this.f26959a.A(i10);
        }

        @Override // I0.P
        public List M(Object obj, Function2 function2) {
            J j10 = (J) j.this.f26949g.e(obj);
            return (j10 == null || j.this.f26943a.T().indexOf(j10) >= j.this.f26946d) ? j.this.r(obj, function2) : j10.O();
        }

        @Override // androidx.compose.ui.layout.l
        public I0.C M0(int i10, int i11, Map map, Function1 function1) {
            return this.f26959a.M0(i10, i11, map, function1);
        }

        @Override // i1.InterfaceC5019l
        public long O(float f10) {
            return this.f26959a.O(f10);
        }

        @Override // i1.InterfaceC5011d
        public long Q(long j10) {
            return this.f26959a.Q(j10);
        }

        @Override // i1.InterfaceC5019l
        public float T(long j10) {
            return this.f26959a.T(j10);
        }

        @Override // i1.InterfaceC5011d
        public long d0(float f10) {
            return this.f26959a.d0(f10);
        }

        @Override // i1.InterfaceC5011d
        public float e1(float f10) {
            return this.f26959a.e1(f10);
        }

        @Override // i1.InterfaceC5011d
        public float getDensity() {
            return this.f26959a.getDensity();
        }

        @Override // I0.InterfaceC1687m
        public EnumC5027t getLayoutDirection() {
            return this.f26959a.getLayoutDirection();
        }

        @Override // i1.InterfaceC5019l
        public float j1() {
            return this.f26959a.j1();
        }

        @Override // I0.InterfaceC1687m
        public boolean k0() {
            return this.f26959a.k0();
        }

        @Override // i1.InterfaceC5011d
        public float l1(float f10) {
            return this.f26959a.l1(f10);
        }

        @Override // androidx.compose.ui.layout.l
        public I0.C q1(int i10, int i11, Map map, Function1 function1, Function1 function12) {
            return this.f26959a.q1(i10, i11, map, function1, function12);
        }

        @Override // i1.InterfaceC5011d
        public int s0(float f10) {
            return this.f26959a.s0(f10);
        }

        @Override // i1.InterfaceC5011d
        public long w1(long j10) {
            return this.f26959a.w1(j10);
        }

        @Override // i1.InterfaceC5011d
        public float z0(long j10) {
            return this.f26959a.z0(j10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class c implements P {

        /* JADX INFO: renamed from: a */
        private EnumC5027t f26969a = EnumC5027t.f48574b;

        /* JADX INFO: renamed from: b */
        private float f26970b;

        /* JADX INFO: renamed from: c */
        private float f26971c;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a implements I0.C {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f26973a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ int f26974b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ Map f26975c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ Function1 f26976d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ c f26977e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ j f26978f;

            /* JADX INFO: renamed from: g */
            final /* synthetic */ Function1 f26979g;

            a(int i10, int i11, Map map, Function1 function1, c cVar, j jVar, Function1 function12) {
                this.f26973a = i10;
                this.f26974b = i11;
                this.f26975c = map;
                this.f26976d = function1;
                this.f26977e = cVar;
                this.f26978f = jVar;
                this.f26979g = function12;
            }

            @Override // I0.C
            public void A() {
                U uI2;
                if (!this.f26977e.k0() || (uI2 = this.f26978f.f26943a.X().I2()) == null) {
                    this.f26979g.invoke(this.f26978f.f26943a.X().O1());
                } else {
                    this.f26979g.invoke(uI2.O1());
                }
            }

            @Override // I0.C
            public Function1 B() {
                return this.f26976d;
            }

            @Override // I0.C
            public int getHeight() {
                return this.f26974b;
            }

            @Override // I0.C
            public int getWidth() {
                return this.f26973a;
            }

            @Override // I0.C
            public Map z() {
                return this.f26975c;
            }
        }

        public c() {
        }

        @Override // I0.P
        public List M(Object obj, Function2 function2) {
            return j.this.P(obj, function2);
        }

        public void b(float f10) {
            this.f26970b = f10;
        }

        @Override // i1.InterfaceC5011d
        public float getDensity() {
            return this.f26970b;
        }

        @Override // I0.InterfaceC1687m
        public EnumC5027t getLayoutDirection() {
            return this.f26969a;
        }

        public void j(float f10) {
            this.f26971c = f10;
        }

        @Override // i1.InterfaceC5019l
        public float j1() {
            return this.f26971c;
        }

        @Override // I0.InterfaceC1687m
        public boolean k0() {
            return j.this.f26943a.f0() == J.e.f10479d || j.this.f26943a.f0() == J.e.f10477b;
        }

        public void p(EnumC5027t enumC5027t) {
            this.f26969a = enumC5027t;
        }

        @Override // androidx.compose.ui.layout.l
        public I0.C q1(int i10, int i11, Map map, Function1 function1, Function1 function12) {
            if (!((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0)) {
                H0.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            return new a(i10, i11, map, function1, this, j.this, function12);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends J.f {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Function2 f26981c;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a implements I0.C {

            /* JADX INFO: renamed from: a */
            private final /* synthetic */ I0.C f26982a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ j f26983b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ int f26984c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ I0.C f26985d;

            public a(I0.C c10, j jVar, int i10, I0.C c11) {
                this.f26983b = jVar;
                this.f26984c = i10;
                this.f26985d = c11;
                this.f26982a = c10;
            }

            @Override // I0.C
            public void A() {
                this.f26983b.f26947e = this.f26984c;
                this.f26985d.A();
                this.f26983b.A();
            }

            @Override // I0.C
            public Function1 B() {
                return this.f26982a.B();
            }

            @Override // I0.C
            public int getHeight() {
                return this.f26982a.getHeight();
            }

            @Override // I0.C
            public int getWidth() {
                return this.f26982a.getWidth();
            }

            @Override // I0.C
            public Map z() {
                return this.f26982a.z();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b implements I0.C {

            /* JADX INFO: renamed from: a */
            private final /* synthetic */ I0.C f26986a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ j f26987b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ int f26988c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ I0.C f26989d;

            public b(I0.C c10, j jVar, int i10, I0.C c11) {
                this.f26987b = jVar;
                this.f26988c = i10;
                this.f26989d = c11;
                this.f26986a = c10;
            }

            @Override // I0.C
            public void A() {
                this.f26987b.f26946d = this.f26988c;
                this.f26989d.A();
                j jVar = this.f26987b;
                jVar.y(jVar.f26946d);
            }

            @Override // I0.C
            public Function1 B() {
                return this.f26986a.B();
            }

            @Override // I0.C
            public int getHeight() {
                return this.f26986a.getHeight();
            }

            @Override // I0.C
            public int getWidth() {
                return this.f26986a.getWidth();
            }

            @Override // I0.C
            public Map z() {
                return this.f26986a.z();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function2 function2, String str) {
            super(str);
            this.f26981c = function2;
        }

        @Override // I0.B
        /* JADX INFO: renamed from: measure-3p2s80s */
        public I0.C mo0measure3p2s80s(l lVar, List list, long j10) {
            j.this.f26950h.p(lVar.getLayoutDirection());
            j.this.f26950h.b(lVar.getDensity());
            j.this.f26950h.j(lVar.j1());
            if (lVar.k0() || j.this.f26943a.j0() == null) {
                j.this.f26946d = 0;
                I0.C c10 = (I0.C) this.f26981c.invoke(j.this.f26950h, C5009b.a(j10));
                return new b(c10, j.this, j.this.f26946d, c10);
            }
            j.this.f26947e = 0;
            I0.C c11 = (I0.C) this.f26981c.invoke(j.this.f26951i, C5009b.a(j10));
            return new a(c11, j.this, j.this.f26947e, c11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements C.a {

        /* JADX INFO: renamed from: a */
        private final C6541G f26990a = t.r.b();

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Object f26992c;

        f(Object obj) {
            this.f26992c = obj;
        }

        @Override // androidx.compose.ui.layout.C.a
        public void a(Object obj, Function1 function1) {
            C1781c0 c1781c0T0;
            e.c cVarK;
            J j10 = (J) j.this.f26952j.e(this.f26992c);
            if (j10 == null || (c1781c0T0 = j10.t0()) == null || (cVarK = c1781c0T0.k()) == null) {
                return;
            }
            J0.e(cVarK, obj, function1);
        }

        @Override // androidx.compose.ui.layout.C.a
        public void b(int i10, long j10) {
            J j11 = (J) j.this.f26952j.e(this.f26992c);
            if (j11 == null || !j11.b()) {
                return;
            }
            int size = j11.P().size();
            if (i10 < 0 || i10 >= size) {
                H0.a.d("Index (" + i10 + ") is out of bound of [0, " + size + ')');
            }
            if (j11.p()) {
                H0.a.a("Pre-measure called on node that is not placed");
            }
            J j12 = j.this.f26943a;
            j12.f10466r = true;
            N.b(j11).s((J) j11.P().get(i10), j10);
            L l10 = L.f17438a;
            j12.f10466r = false;
            this.f26990a.g(i10);
        }

        @Override // androidx.compose.ui.layout.C.a
        public void dispose() {
            j.this.z(this.f26992c);
        }

        @Override // androidx.compose.ui.layout.C.a
        public int g() {
            List listP;
            J j10 = (J) j.this.f26952j.e(this.f26992c);
            if (j10 == null || (listP = j10.P()) == null) {
                return 0;
            }
            return listP.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ b f26993a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(0);
            this.f26993a = bVar;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m78invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m78invoke() {
            InterfaceC2462y1 interfaceC2462y1C;
            if (this.f26993a.a() || (interfaceC2462y1C = this.f26993a.c()) == null) {
                return;
            }
            interfaceC2462y1C.deactivate();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ b f26994a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function2 f26995b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(b bVar, Function2 function2) {
            super(2);
            this.f26994a = bVar;
            this.f26995b = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if (!interfaceC2425m.p((i10 & 3) != 2, i10 & 1)) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1524156494, i10, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:683)");
            }
            boolean zA = this.f26994a.a();
            Function2 function2 = this.f26995b;
            interfaceC2425m.J(207, Boolean.valueOf(zA));
            boolean zA2 = interfaceC2425m.a(zA);
            if (zA) {
                function2.invoke(interfaceC2425m, 0);
            } else {
                interfaceC2425m.f(zA2);
            }
            interfaceC2425m.B();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    public j(J j10, D d10) {
        this.f26943a = j10;
        this.f26945c = d10;
    }

    public final void A() {
        C6550P c6550p = this.f26954l;
        long[] jArr = c6550p.f60043a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = c6550p.f60044b[i13];
                        C.a aVar = (C.a) c6550p.f60045c[i13];
                        int iR = this.f26955m.r(obj);
                        if (iR < 0 || iR >= this.f26947e) {
                            aVar.dispose();
                            c6550p.v(i13);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    private final n0 C() {
        if (l0.h.f52335h) {
            return N.b(this.f26943a).getOutOfFrameExecutor();
        }
        return null;
    }

    private final Object D(List list, int i10) {
        Object objE = this.f26948f.e((J) list.get(i10));
        AbstractC5504s.e(objE);
        return ((b) objE).h();
    }

    private final void F(boolean z10) {
        this.f26957o = 0;
        this.f26952j.k();
        List listT = this.f26943a.T();
        int size = listT.size();
        if (this.f26956n != size) {
            this.f26956n = size;
            AbstractC4993l.a aVar = AbstractC4993l.f48495e;
            AbstractC4993l abstractC4993lD = aVar.d();
            Function1 function1G = abstractC4993lD != null ? abstractC4993lD.g() : null;
            AbstractC4993l abstractC4993lE = aVar.e(abstractC4993lD);
            for (int i10 = 0; i10 < size; i10++) {
                try {
                    J j10 = (J) listT.get(i10);
                    b bVar = (b) this.f26948f.e(j10);
                    if (bVar != null && bVar.a()) {
                        L(j10);
                        M(bVar, z10);
                        bVar.q(B.f26860a);
                    }
                } catch (Throwable th2) {
                    aVar.l(abstractC4993lD, abstractC4993lE, function1G);
                    throw th2;
                }
            }
            L l10 = L.f17438a;
            aVar.l(abstractC4993lD, abstractC4993lE, function1G);
            this.f26949g.k();
        }
        E();
    }

    private final void G(int i10, int i11, int i12) {
        J j10 = this.f26943a;
        j10.f10466r = true;
        this.f26943a.p1(i10, i11, i12);
        L l10 = L.f17438a;
        j10.f10466r = false;
    }

    static /* synthetic */ void H(j jVar, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = 1;
        }
        jVar.G(i10, i11, i12);
    }

    private final void K(Object obj, Function2 function2, boolean z10) {
        if (this.f26943a.b()) {
            E();
            if (this.f26949g.c(obj)) {
                return;
            }
            this.f26954l.u(obj);
            C6550P c6550p = this.f26952j;
            Object objE = c6550p.e(obj);
            if (objE == null) {
                objE = S(obj);
                if (objE != null) {
                    G(this.f26943a.T().indexOf(objE), this.f26943a.T().size(), 1);
                    this.f26957o++;
                } else {
                    objE = u(this.f26943a.T().size());
                    this.f26957o++;
                }
                c6550p.x(obj, objE);
            }
            R((J) objE, obj, z10, function2);
        }
    }

    private final void L(J j10) {
        X xL0 = j10.l0();
        J.g gVar = J.g.f10486c;
        xL0.p2(gVar);
        V vI0 = j10.i0();
        if (vI0 != null) {
            vI0.n2(gVar);
        }
    }

    private final void M(b bVar, boolean z10) {
        InterfaceC2462y1 interfaceC2462y1C;
        if (z10 || !bVar.b()) {
            bVar.j(b2.e(Boolean.FALSE, null, 2, null));
        } else {
            bVar.i(false);
        }
        if (bVar.g() != null) {
            s(bVar);
            return;
        }
        if (z10) {
            InterfaceC2462y1 interfaceC2462y1C2 = bVar.c();
            if (interfaceC2462y1C2 != null) {
                interfaceC2462y1C2.deactivate();
                return;
            }
            return;
        }
        n0 n0VarC = C();
        if (n0VarC != null) {
            w(bVar, n0VarC);
        } else {
            if (bVar.b() || (interfaceC2462y1C = bVar.c()) == null) {
                return;
            }
            interfaceC2462y1C.deactivate();
        }
    }

    private final void Q(J j10, b bVar, boolean z10) {
        if (!(bVar.g() == null)) {
            H0.a.a("new subcompose call while paused composition is still active");
        }
        AbstractC4993l.a aVar = AbstractC4993l.f48495e;
        AbstractC4993l abstractC4993lD = aVar.d();
        Function1 function1G = abstractC4993lD != null ? abstractC4993lD.g() : null;
        AbstractC4993l abstractC4993lE = aVar.e(abstractC4993lD);
        try {
            J j11 = this.f26943a;
            j11.f10466r = true;
            InterfaceC2462y1 interfaceC2462y1C = bVar.c();
            AbstractC2460y abstractC2460y = this.f26944b;
            if (abstractC2460y == null) {
                H0.a.c("parent composition reference not set");
                throw new C2160k();
            }
            if (interfaceC2462y1C == null || interfaceC2462y1C.e()) {
                interfaceC2462y1C = z10 ? p1.a(j10, abstractC2460y) : p1.b(j10, abstractC2460y);
            }
            bVar.l(interfaceC2462y1C);
            Function2 function2D = bVar.d();
            if (C() != null) {
                bVar.k(false);
            } else {
                bVar.k(true);
                function2D = g0.i.b(1524156494, true, new h(bVar, function2D));
            }
            if (z10) {
                AbstractC5504s.f(interfaceC2462y1C, "null cannot be cast to non-null type androidx.compose.runtime.PausableComposition");
                if (bVar.f()) {
                    bVar.p(((N0) interfaceC2462y1C).u(function2D));
                } else {
                    bVar.p(((N0) interfaceC2462y1C).d(function2D));
                }
            } else if (bVar.f()) {
                interfaceC2462y1C.r(function2D);
            } else {
                interfaceC2462y1C.h(function2D);
            }
            bVar.o(false);
            L l10 = L.f17438a;
            j11.f10466r = false;
            aVar.l(abstractC4993lD, abstractC4993lE, function1G);
        } catch (Throwable th2) {
            aVar.l(abstractC4993lD, abstractC4993lE, function1G);
            throw th2;
        }
    }

    private final void R(J j10, Object obj, boolean z10, Function2 function2) {
        C6550P c6550p = this.f26948f;
        Object objE = c6550p.e(j10);
        if (objE == null) {
            b bVar = new b(obj, C1679e.f8700a.a(), null, 4, null);
            c6550p.x(j10, bVar);
            objE = bVar;
        }
        b bVar2 = (b) objE;
        boolean z11 = bVar2.d() != function2;
        if (bVar2.g() != null) {
            if (z11) {
                s(bVar2);
            } else if (z10) {
                return;
            } else {
                p(bVar2, true);
            }
        }
        InterfaceC2462y1 interfaceC2462y1C = bVar2.c();
        boolean zT = interfaceC2462y1C != null ? interfaceC2462y1C.t() : true;
        if (z11 || zT || bVar2.e()) {
            bVar2.m(function2);
            Q(j10, bVar2, z10);
            bVar2.n(false);
        }
    }

    private final J S(Object obj) {
        int i10;
        if (this.f26956n == 0) {
            return null;
        }
        List listT = this.f26943a.T();
        int size = listT.size() - this.f26957o;
        int i11 = size - this.f26956n;
        int i12 = size - 1;
        int i13 = i12;
        while (true) {
            if (i13 < i11) {
                i10 = -1;
                break;
            }
            if (AbstractC5504s.c(D(listT, i13), obj)) {
                i10 = i13;
                break;
            }
            i13--;
        }
        if (i10 == -1) {
            while (i12 >= i11) {
                Object objE = this.f26948f.e((J) listT.get(i12));
                AbstractC5504s.e(objE);
                b bVar = (b) objE;
                if (bVar.h() == B.f26860a || this.f26945c.b(obj, bVar.h())) {
                    bVar.q(obj);
                    i13 = i12;
                    i10 = i13;
                    break;
                }
                i12--;
            }
            i13 = i12;
        }
        if (i10 == -1) {
            return null;
        }
        if (i13 != i11) {
            G(i13, i11, 1);
        }
        this.f26956n--;
        J j10 = (J) listT.get(i11);
        Object objE2 = this.f26948f.e(j10);
        AbstractC5504s.e(objE2);
        b bVar2 = (b) objE2;
        bVar2.j(b2.e(Boolean.TRUE, null, 2, null));
        bVar2.o(true);
        bVar2.n(true);
        return j10;
    }

    private final void p(b bVar, boolean z10) {
        Q0 q0G = bVar.g();
        if (q0G != null) {
            AbstractC4993l.a aVar = AbstractC4993l.f48495e;
            AbstractC4993l abstractC4993lD = aVar.d();
            Function1 function1G = abstractC4993lD != null ? abstractC4993lD.g() : null;
            AbstractC4993l abstractC4993lE = aVar.e(abstractC4993lD);
            try {
                J j10 = this.f26943a;
                j10.f10466r = true;
                if (z10) {
                    while (!q0G.isComplete()) {
                        q0G.a(new C1() { // from class: I0.x
                            @Override // Y.C1
                            public final boolean a() {
                                return androidx.compose.ui.layout.j.q();
                            }
                        });
                    }
                }
                q0G.apply();
                bVar.p(null);
                L l10 = L.f17438a;
                j10.f10466r = false;
                aVar.l(abstractC4993lD, abstractC4993lE, function1G);
            } catch (Throwable th2) {
                aVar.l(abstractC4993lD, abstractC4993lE, function1G);
                throw th2;
            }
        }
    }

    public static final boolean q() {
        return false;
    }

    public final List r(Object obj, Function2 function2) {
        if (!(this.f26955m.p() >= this.f26947e)) {
            H0.a.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int iP = this.f26955m.p();
        int i10 = this.f26947e;
        if (iP == i10) {
            this.f26955m.c(obj);
        } else {
            this.f26955m.D(i10, obj);
        }
        this.f26947e++;
        if (this.f26952j.b(obj)) {
            J j10 = (J) this.f26952j.e(obj);
            b bVar = j10 != null ? (b) this.f26948f.e(j10) : null;
            if (bVar != null && bVar.e()) {
                R(j10, obj, false, function2);
            }
        } else {
            this.f26954l.x(obj, J(obj, function2));
            if (this.f26943a.f0() == J.e.f10478c) {
                this.f26943a.B1(true);
            } else {
                J.E1(this.f26943a, true, false, false, 6, null);
            }
        }
        J j11 = (J) this.f26952j.e(obj);
        if (j11 != null) {
            List listI1 = j11.l0().I1();
            int size = listI1.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((X) listI1.get(i11)).Y1();
            }
            if (listI1 != null) {
                return listI1;
            }
        }
        return AbstractC2279u.m();
    }

    private final void s(b bVar) {
        Q0 q0G = bVar.g();
        if (q0G != null) {
            q0G.cancel();
            bVar.p(null);
            InterfaceC2462y1 interfaceC2462y1C = bVar.c();
            if (interfaceC2462y1C != null) {
                interfaceC2462y1C.dispose();
            }
            bVar.l(null);
        }
    }

    private final J u(int i10) {
        J j10 = new J(true, 0, 2, null);
        J j11 = this.f26943a;
        j11.f10466r = true;
        this.f26943a.O0(i10, j10);
        L l10 = L.f17438a;
        j11.f10466r = false;
        return j10;
    }

    private final C.a v(Object obj) {
        return !this.f26943a.b() ? new e() : new f(obj);
    }

    private final void w(b bVar, n0 n0Var) {
        n0Var.o(new g(bVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void x() {
        /*
            r15 = this;
            K0.J r0 = r15.f26943a
            r1 = 1
            K0.J.v(r0, r1)
            t.P r1 = r15.f26948f
            java.lang.Object[] r2 = r1.f60045c
            long[] r1 = r1.f60043a
            int r3 = r1.length
            int r3 = r3 + (-2)
            r4 = 0
            if (r3 < 0) goto L53
            r5 = r4
        L13:
            r6 = r1[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L4e
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L2d:
            if (r10 >= r8) goto L4c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.32E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L48
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            androidx.compose.ui.layout.j$b r11 = (androidx.compose.ui.layout.j.b) r11
            Y.y1 r11 = r11.c()
            if (r11 == 0) goto L48
            r11.dispose()
        L48:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2d
        L4c:
            if (r8 != r9) goto L53
        L4e:
            if (r5 == r3) goto L53
            int r5 = r5 + 1
            goto L13
        L53:
            K0.J r1 = r15.f26943a
            r1.y1()
            Td.L r1 = Td.L.f17438a
            K0.J.v(r0, r4)
            t.P r0 = r15.f26948f
            r0.k()
            t.P r0 = r15.f26949g
            r0.k()
            r15.f26957o = r4
            r15.f26956n = r4
            t.P r0 = r15.f26952j
            r0.k()
            r15.E()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.j.x():void");
    }

    public final void z(Object obj) {
        E();
        J j10 = (J) this.f26952j.u(obj);
        if (j10 != null) {
            if (!(this.f26957o > 0)) {
                H0.a.b("No pre-composed items to dispose");
            }
            int iIndexOf = this.f26943a.T().indexOf(j10);
            if (!(iIndexOf >= this.f26943a.T().size() - this.f26957o)) {
                H0.a.b("Item is not in pre-composed item range");
            }
            this.f26956n++;
            this.f26957o--;
            b bVar = (b) this.f26948f.e(j10);
            if (bVar != null) {
                s(bVar);
            }
            int size = (this.f26943a.T().size() - this.f26957o) - this.f26956n;
            G(iIndexOf, size, 1);
            y(size);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B() {
        /*
            r14 = this;
            K0.J r0 = r14.f26943a
            java.util.List r0 = r0.T()
            int r0 = r0.size()
            int r1 = r14.f26956n
            if (r1 == r0) goto L83
            t.P r0 = r14.f26948f
            java.lang.Object[] r1 = r0.f60045c
            long[] r0 = r0.f60043a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L56
            r3 = 0
            r4 = r3
        L1b:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L51
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L35:
            if (r9 >= r7) goto L4f
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4b
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.ui.layout.j$b r10 = (androidx.compose.ui.layout.j.b) r10
            r11 = 1
            r10.n(r11)
        L4b:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L4f:
            if (r7 != r8) goto L56
        L51:
            if (r4 == r2) goto L56
            int r4 = r4 + 1
            goto L1b
        L56:
            K0.J r0 = r14.f26943a
            K0.J r0 = r0.j0()
            if (r0 == 0) goto L71
            K0.J r0 = r14.f26943a
            boolean r0 = r0.h0()
            if (r0 != 0) goto L83
            K0.J r1 = r14.f26943a
            r5 = 7
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            K0.J.E1(r1, r2, r3, r4, r5, r6)
            return
        L71:
            K0.J r0 = r14.f26943a
            boolean r0 = r0.m0()
            if (r0 != 0) goto L83
            K0.J r1 = r14.f26943a
            r5 = 7
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            K0.J.I1(r1, r2, r3, r4, r5, r6)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.j.B():void");
    }

    public final void E() {
        int size = this.f26943a.T().size();
        if (!(this.f26948f.g() == size)) {
            H0.a.a("Inconsistency between the count of nodes tracked by the state (" + this.f26948f.g() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if (!((size - this.f26956n) - this.f26957o >= 0)) {
            H0.a.a("Incorrect state. Total children " + size + ". Reusable children " + this.f26956n + ". Precomposed children " + this.f26957o);
        }
        if (this.f26952j.g() == this.f26957o) {
            return;
        }
        H0.a.a("Incorrect state. Precomposed children " + this.f26957o + ". Map size " + this.f26952j.g());
    }

    public void I() {
        F(false);
    }

    public final C.a J(Object obj, Function2 function2) {
        K(obj, function2, false);
        return v(obj);
    }

    public final void N(AbstractC2460y abstractC2460y) {
        this.f26944b = abstractC2460y;
    }

    public final void O(D d10) {
        if (this.f26945c != d10) {
            this.f26945c = d10;
            F(false);
            J.I1(this.f26943a, false, false, false, 7, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List P(java.lang.Object r13, kotlin.jvm.functions.Function2 r14) {
        /*
            r12 = this;
            r12.E()
            K0.J r0 = r12.f26943a
            K0.J$e r0 = r0.f0()
            K0.J$e r1 = K0.J.e.f10476a
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L1e
            K0.J$e r4 = K0.J.e.f10478c
            if (r0 == r4) goto L1e
            K0.J$e r4 = K0.J.e.f10477b
            if (r0 == r4) goto L1e
            K0.J$e r4 = K0.J.e.f10479d
            if (r0 != r4) goto L1c
            goto L1e
        L1c:
            r4 = r3
            goto L1f
        L1e:
            r4 = r2
        L1f:
            if (r4 != 0) goto L26
            java.lang.String r4 = "subcompose can only be used inside the measure or layout blocks"
            H0.a.b(r4)
        L26:
            t.P r4 = r12.f26949g
            java.lang.Object r5 = r4.e(r13)
            if (r5 != 0) goto L5c
            t.P r5 = r12.f26952j
            java.lang.Object r5 = r5.u(r13)
            K0.J r5 = (K0.J) r5
            if (r5 == 0) goto L4d
            int r6 = r12.f26957o
            if (r6 <= 0) goto L3e
            r6 = r2
            goto L3f
        L3e:
            r6 = r3
        L3f:
            if (r6 != 0) goto L46
            java.lang.String r6 = "Check failed."
            H0.a.b(r6)
        L46:
            int r6 = r12.f26957o
            int r6 = r6 + (-1)
            r12.f26957o = r6
            goto L59
        L4d:
            K0.J r5 = r12.S(r13)
            if (r5 != 0) goto L59
            int r5 = r12.f26946d
            K0.J r5 = r12.u(r5)
        L59:
            r4.x(r13, r5)
        L5c:
            K0.J r5 = (K0.J) r5
            K0.J r4 = r12.f26943a
            java.util.List r4 = r4.T()
            int r6 = r12.f26946d
            java.lang.Object r4 = Ud.AbstractC2279u.p0(r4, r6)
            if (r4 == r5) goto La4
            K0.J r4 = r12.f26943a
            java.util.List r4 = r4.T()
            int r7 = r4.indexOf(r5)
            int r4 = r12.f26946d
            if (r7 < r4) goto L7c
            r4 = r2
            goto L7d
        L7c:
            r4 = r3
        L7d:
            if (r4 != 0) goto L98
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Key \""
            r4.append(r6)
            r4.append(r13)
            java.lang.String r6 = "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            H0.a.a(r4)
        L98:
            int r8 = r12.f26946d
            if (r8 == r7) goto La4
            r10 = 4
            r11 = 0
            r9 = 0
            r6 = r12
            H(r6, r7, r8, r9, r10, r11)
            goto La5
        La4:
            r6 = r12
        La5:
            int r4 = r6.f26946d
            int r4 = r4 + r2
            r6.f26946d = r4
            r12.R(r5, r13, r3, r14)
            if (r0 == r1) goto Lb9
            K0.J$e r13 = K0.J.e.f10478c
            if (r0 != r13) goto Lb4
            goto Lb9
        Lb4:
            java.util.List r13 = r5.N()
            return r13
        Lb9:
            java.util.List r13 = r5.O()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.j.P(java.lang.Object, kotlin.jvm.functions.Function2):java.util.List");
    }

    @Override // Y.InterfaceC2413i
    public void a() {
        x();
    }

    @Override // Y.InterfaceC2413i
    public void h() {
        F(true);
    }

    public final I0.B t(Function2 function2) {
        return new d(function2, this.f26958p);
    }

    public final void y(int i10) {
        boolean z10 = false;
        this.f26956n = 0;
        List listT = this.f26943a.T();
        int size = (listT.size() - this.f26957o) - 1;
        if (i10 <= size) {
            this.f26953k.clear();
            if (i10 <= size) {
                int i11 = i10;
                while (true) {
                    this.f26953k.add(D(listT, i11));
                    if (i11 == size) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f26945c.a(this.f26953k);
            AbstractC4993l.a aVar = AbstractC4993l.f48495e;
            AbstractC4993l abstractC4993lD = aVar.d();
            Function1 function1G = abstractC4993lD != null ? abstractC4993lD.g() : null;
            AbstractC4993l abstractC4993lE = aVar.e(abstractC4993lD);
            boolean z11 = false;
            while (size >= i10) {
                try {
                    J j10 = (J) listT.get(size);
                    Object objE = this.f26948f.e(j10);
                    AbstractC5504s.e(objE);
                    b bVar = (b) objE;
                    Object objH = bVar.h();
                    if (this.f26953k.contains(objH)) {
                        this.f26956n++;
                        if (bVar.a()) {
                            L(j10);
                            M(bVar, false);
                            if (bVar.b()) {
                                z11 = true;
                            }
                        }
                    } else {
                        J j11 = this.f26943a;
                        j11.f10466r = true;
                        this.f26948f.u(j10);
                        InterfaceC2462y1 interfaceC2462y1C = bVar.c();
                        if (interfaceC2462y1C != null) {
                            interfaceC2462y1C.dispose();
                        }
                        this.f26943a.z1(size, 1);
                        L l10 = L.f17438a;
                        j11.f10466r = false;
                    }
                    this.f26949g.u(objH);
                    size--;
                } catch (Throwable th2) {
                    aVar.l(abstractC4993lD, abstractC4993lE, function1G);
                    throw th2;
                }
            }
            L l11 = L.f17438a;
            aVar.l(abstractC4993lD, abstractC4993lE, function1G);
            z10 = z11;
        }
        if (z10) {
            AbstractC4993l.f48495e.m();
        }
        E();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a */
        private Object f26961a;

        /* JADX INFO: renamed from: b */
        private Function2 f26962b;

        /* JADX INFO: renamed from: c */
        private InterfaceC2462y1 f26963c;

        /* JADX INFO: renamed from: d */
        private boolean f26964d;

        /* JADX INFO: renamed from: e */
        private boolean f26965e;

        /* JADX INFO: renamed from: f */
        private Q0 f26966f;

        /* JADX INFO: renamed from: g */
        private C0 f26967g;

        /* JADX INFO: renamed from: h */
        private boolean f26968h;

        public b(Object obj, Function2 function2, InterfaceC2462y1 interfaceC2462y1) {
            this.f26961a = obj;
            this.f26962b = function2;
            this.f26963c = interfaceC2462y1;
            this.f26967g = b2.e(Boolean.TRUE, null, 2, null);
        }

        public final boolean a() {
            return ((Boolean) this.f26967g.getValue()).booleanValue();
        }

        public final boolean b() {
            return this.f26968h;
        }

        public final InterfaceC2462y1 c() {
            return this.f26963c;
        }

        public final Function2 d() {
            return this.f26962b;
        }

        public final boolean e() {
            return this.f26964d;
        }

        public final boolean f() {
            return this.f26965e;
        }

        public final Q0 g() {
            return this.f26966f;
        }

        public final Object h() {
            return this.f26961a;
        }

        public final void i(boolean z10) {
            this.f26967g.setValue(Boolean.valueOf(z10));
        }

        public final void j(C0 c02) {
            this.f26967g = c02;
        }

        public final void k(boolean z10) {
            this.f26968h = z10;
        }

        public final void l(InterfaceC2462y1 interfaceC2462y1) {
            this.f26963c = interfaceC2462y1;
        }

        public final void m(Function2 function2) {
            this.f26962b = function2;
        }

        public final void n(boolean z10) {
            this.f26964d = z10;
        }

        public final void o(boolean z10) {
            this.f26965e = z10;
        }

        public final void p(Q0 q02) {
            this.f26966f = q02;
        }

        public final void q(Object obj) {
            this.f26961a = obj;
        }

        public /* synthetic */ b(Object obj, Function2 function2, InterfaceC2462y1 interfaceC2462y1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, function2, (i10 & 4) != 0 ? null : interfaceC2462y1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements C.a {
        e() {
        }

        @Override // androidx.compose.ui.layout.C.a
        public void dispose() {
        }
    }
}
