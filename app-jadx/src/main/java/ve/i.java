package ve;

import Ae.a;
import Ae.c;
import Be.F;
import ie.InterfaceC5082a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jf.InterfaceC5387k;
import kotlin.jvm.functions.Function1;
import pf.InterfaceC6042g;
import pf.InterfaceC6044i;
import qf.AbstractC6183d0;
import qf.B0;
import qf.D0;
import qf.J0;
import qf.N0;
import qf.S;
import qf.V;
import qf.s0;
import qf.v0;
import ve.o;
import we.C6966a;
import ye.AbstractC7240s;
import ye.AbstractC7246y;
import ye.H;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7235m;
import ye.N;
import ye.Z;
import ye.a0;
import ye.b0;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class i {

    /* JADX INFO: renamed from: g */
    public static final Xe.f f62100g = Xe.f.q("<built-ins module>");

    /* JADX INFO: renamed from: a */
    private F f62101a;

    /* JADX INFO: renamed from: b */
    private InterfaceC6044i f62102b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC6044i f62103c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC6044i f62104d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC6042g f62105e;

    /* JADX INFO: renamed from: f */
    private final pf.n f62106f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements InterfaceC5082a {
        a() {
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public Collection invoke() {
            return Arrays.asList(i.this.s().S(o.f62147A), i.this.s().S(o.f62149C), i.this.s().S(o.f62150D), i.this.s().S(o.f62148B));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements InterfaceC5082a {
        b() {
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public e invoke() {
            EnumMap enumMap = new EnumMap(l.class);
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            for (l lVar : l.values()) {
                AbstractC6183d0 abstractC6183d0R = i.this.r(lVar.q().b());
                AbstractC6183d0 abstractC6183d0R2 = i.this.r(lVar.m().b());
                enumMap.put(lVar, abstractC6183d0R2);
                map.put(abstractC6183d0R, abstractC6183d0R2);
                map2.put(abstractC6183d0R2, abstractC6183d0R);
            }
            return new e(enumMap, map, map2, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements Function1 {
        c() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public InterfaceC7227e invoke(Xe.f fVar) {
            InterfaceC7230h interfaceC7230hE = i.this.t().e(fVar, Ge.d.f7458d);
            if (interfaceC7230hE == null) {
                throw new AssertionError("Built-in class " + o.f62147A.b(fVar) + " is not found");
            }
            if (interfaceC7230hE instanceof InterfaceC7227e) {
                return (InterfaceC7227e) interfaceC7230hE;
            }
            throw new AssertionError("Must be a class descriptor " + fVar + ", but was " + interfaceC7230hE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ F f62110a;

        d(F f10) {
            this.f62110a = f10;
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public Void invoke() {
            if (i.this.f62101a == null) {
                i.this.f62101a = this.f62110a;
                return null;
            }
            throw new AssertionError("Built-ins module is already set: " + i.this.f62101a + " (attempting to reset to " + this.f62110a + ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class e {

        /* JADX INFO: renamed from: a */
        public final Map f62112a;

        /* JADX INFO: renamed from: b */
        public final Map f62113b;

        /* JADX INFO: renamed from: c */
        public final Map f62114c;

        /* synthetic */ e(Map map, Map map2, Map map3, a aVar) {
            this(map, map2, map3);
        }

        private static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i10 != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private e(Map map, Map map2, Map map3) {
            if (map == null) {
                a(0);
            }
            if (map2 == null) {
                a(1);
            }
            if (map3 == null) {
                a(2);
            }
            this.f62112a = map;
            this.f62113b = map2;
            this.f62114c = map3;
        }
    }

    protected i(pf.n nVar) {
        if (nVar == null) {
            a(0);
        }
        this.f62106f = nVar;
        this.f62104d = nVar.c(new a());
        this.f62103c = nVar.c(new b());
        this.f62105e = nVar.h(new c());
    }

    public static boolean A0(S s10) {
        if (s10 == null) {
            a(131);
        }
        return j0(s10, o.a.f62204K0.i());
    }

    private static S B(S s10, H h10) {
        Xe.b bVarN;
        Xe.b bVarA;
        InterfaceC7227e interfaceC7227eB;
        if (s10 == null) {
            a(71);
        }
        if (h10 == null) {
            a(72);
        }
        InterfaceC7230h interfaceC7230hP = s10.N0().p();
        if (interfaceC7230hP == null) {
            return null;
        }
        s sVar = s.f62301a;
        if (!sVar.b(interfaceC7230hP.getName()) || (bVarN = ff.e.n(interfaceC7230hP)) == null || (bVarA = sVar.a(bVarN)) == null || (interfaceC7227eB = AbstractC7246y.b(h10, bVarA)) == null) {
            return null;
        }
        return interfaceC7227eB.p();
    }

    public static boolean B0(S s10) {
        if (s10 == null) {
            a(129);
        }
        return j0(s10, o.a.f62200I0.i());
    }

    public static boolean C0(InterfaceC7235m interfaceC7235m) {
        if (interfaceC7235m == null) {
            a(10);
        }
        while (interfaceC7235m != null) {
            if (interfaceC7235m instanceof N) {
                return ((N) interfaceC7235m).f().h(o.f62182z);
            }
            interfaceC7235m = interfaceC7235m.b();
        }
        return false;
    }

    public static boolean D0(S s10) {
        if (s10 == null) {
            a(142);
        }
        return n0(s10, o.a.f62241f);
    }

    public static boolean E0(S s10) {
        if (s10 == null) {
            a(132);
        }
        return y0(s10) || B0(s10) || z0(s10) || A0(s10);
    }

    public static l O(S s10) {
        if (s10 == null) {
            a(92);
        }
        InterfaceC7230h interfaceC7230hP = s10.N0().p();
        if (interfaceC7230hP == null) {
            return null;
        }
        return Q(interfaceC7230hP);
    }

    public static l Q(InterfaceC7235m interfaceC7235m) {
        if (interfaceC7235m == null) {
            a(77);
        }
        if (o.a.f62222T0.contains(interfaceC7235m.getName())) {
            return (l) o.a.f62226V0.get(bf.i.m(interfaceC7235m));
        }
        return null;
    }

    private InterfaceC7227e R(l lVar) {
        if (lVar == null) {
            a(16);
        }
        return q(lVar.q().b());
    }

    public static l T(InterfaceC7235m interfaceC7235m) {
        if (interfaceC7235m == null) {
            a(76);
        }
        if (o.a.f62220S0.contains(interfaceC7235m.getName())) {
            return (l) o.a.f62224U0.get(bf.i.m(interfaceC7235m));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:261:0x0035 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r23) {
        /*
            Method dump skipped, instruction units count: 2222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ve.i.a(int):void");
    }

    public static boolean b0(InterfaceC7227e interfaceC7227e) {
        if (interfaceC7227e == null) {
            a(108);
        }
        return e(interfaceC7227e, o.a.f62233b);
    }

    public static boolean c0(S s10) {
        if (s10 == null) {
            a(139);
        }
        return i0(s10, o.a.f62233b);
    }

    public static boolean d0(S s10) {
        if (s10 == null) {
            a(88);
        }
        return i0(s10, o.a.f62247i);
    }

    private static boolean e(InterfaceC7230h interfaceC7230h, Xe.d dVar) {
        if (interfaceC7230h == null) {
            a(103);
        }
        if (dVar == null) {
            a(104);
        }
        return interfaceC7230h.getName().equals(dVar.j()) && dVar.equals(bf.i.m(interfaceC7230h));
    }

    public static boolean e0(S s10) {
        if (s10 == null) {
            a(90);
        }
        return d0(s10) || r0(s10);
    }

    public static boolean f0(InterfaceC7227e interfaceC7227e) {
        if (interfaceC7227e == null) {
            a(89);
        }
        return e(interfaceC7227e, o.a.f62247i) || Q(interfaceC7227e) != null;
    }

    public static boolean g0(S s10) {
        if (s10 == null) {
            a(110);
        }
        return j0(s10, o.a.f62249j);
    }

    public static boolean h0(InterfaceC7235m interfaceC7235m) {
        if (interfaceC7235m == null) {
            a(9);
        }
        return bf.i.r(interfaceC7235m, ve.c.class, false) != null;
    }

    private static boolean i0(S s10, Xe.d dVar) {
        if (s10 == null) {
            a(97);
        }
        if (dVar == null) {
            a(98);
        }
        return x0(s10.N0(), dVar);
    }

    private static boolean j0(S s10, Xe.d dVar) {
        if (s10 == null) {
            a(134);
        }
        if (dVar == null) {
            a(135);
        }
        return i0(s10, dVar) && !s10.O0();
    }

    public static boolean k0(S s10) {
        if (s10 == null) {
            a(141);
        }
        return q0(s10);
    }

    public static boolean l0(InterfaceC7235m interfaceC7235m) {
        if (interfaceC7235m == null) {
            a(160);
        }
        if (interfaceC7235m.a().getAnnotations().k0(o.a.f62279y)) {
            return true;
        }
        if (interfaceC7235m instanceof Z) {
            Z z10 = (Z) interfaceC7235m;
            boolean zN = z10.N();
            a0 a0VarD = z10.d();
            b0 b0VarG = z10.g();
            if (a0VarD != null && l0(a0VarD) && (!zN || (b0VarG != null && l0(b0VarG)))) {
                return true;
            }
        }
        return false;
    }

    public static boolean m0(InterfaceC7227e interfaceC7227e) {
        if (interfaceC7227e == null) {
            a(158);
        }
        return e(interfaceC7227e, o.a.f62254l0);
    }

    private static boolean n0(S s10, Xe.d dVar) {
        if (s10 == null) {
            a(105);
        }
        if (dVar == null) {
            a(106);
        }
        return !s10.O0() && i0(s10, dVar);
    }

    public static boolean o0(S s10) {
        if (s10 == null) {
            a(136);
        }
        return p0(s10) && !J0.l(s10);
    }

    public static boolean p0(S s10) {
        if (s10 == null) {
            a(138);
        }
        return i0(s10, o.a.f62235c);
    }

    private InterfaceC7227e q(String str) {
        if (str == null) {
            a(14);
        }
        InterfaceC7227e interfaceC7227e = (InterfaceC7227e) this.f62105e.invoke(Xe.f.m(str));
        if (interfaceC7227e == null) {
            a(15);
        }
        return interfaceC7227e;
    }

    public static boolean q0(S s10) {
        if (s10 == null) {
            a(140);
        }
        return c0(s10) && s10.O0();
    }

    public AbstractC6183d0 r(String str) {
        if (str == null) {
            a(47);
        }
        AbstractC6183d0 abstractC6183d0P = q(str).p();
        if (abstractC6183d0P == null) {
            a(48);
        }
        return abstractC6183d0P;
    }

    public static boolean r0(S s10) {
        if (s10 == null) {
            a(91);
        }
        InterfaceC7230h interfaceC7230hP = s10.N0().p();
        return (interfaceC7230hP == null || Q(interfaceC7230hP) == null) ? false : true;
    }

    public static boolean s0(InterfaceC7227e interfaceC7227e) {
        if (interfaceC7227e == null) {
            a(96);
        }
        return T(interfaceC7227e) != null;
    }

    public static boolean t0(S s10) {
        if (s10 == null) {
            a(94);
        }
        return !s10.O0() && u0(s10);
    }

    public static boolean u0(S s10) {
        if (s10 == null) {
            a(95);
        }
        InterfaceC7230h interfaceC7230hP = s10.N0().p();
        return (interfaceC7230hP instanceof InterfaceC7227e) && s0((InterfaceC7227e) interfaceC7230hP);
    }

    public static boolean v0(InterfaceC7227e interfaceC7227e) {
        if (interfaceC7227e == null) {
            a(107);
        }
        return e(interfaceC7227e, o.a.f62233b) || e(interfaceC7227e, o.a.f62235c);
    }

    public static boolean w0(S s10) {
        return s10 != null && n0(s10, o.a.f62245h);
    }

    public static boolean x0(v0 v0Var, Xe.d dVar) {
        if (v0Var == null) {
            a(101);
        }
        if (dVar == null) {
            a(102);
        }
        InterfaceC7230h interfaceC7230hP = v0Var.p();
        return (interfaceC7230hP instanceof InterfaceC7227e) && e(interfaceC7230hP, dVar);
    }

    public static boolean y0(S s10) {
        if (s10 == null) {
            a(128);
        }
        return j0(s10, o.a.f62198H0.i());
    }

    public static boolean z0(S s10) {
        if (s10 == null) {
            a(130);
        }
        return j0(s10, o.a.f62202J0.i());
    }

    public AbstractC6183d0 A() {
        AbstractC6183d0 abstractC6183d0S = S(l.f62126n);
        if (abstractC6183d0S == null) {
            a(62);
        }
        return abstractC6183d0S;
    }

    public AbstractC6183d0 C() {
        AbstractC6183d0 abstractC6183d0S = S(l.f62124l);
        if (abstractC6183d0S == null) {
            a(61);
        }
        return abstractC6183d0S;
    }

    public InterfaceC7227e D(int i10) {
        return q(o.b(i10));
    }

    public AbstractC6183d0 E() {
        AbstractC6183d0 abstractC6183d0S = S(l.f62123k);
        if (abstractC6183d0S == null) {
            a(59);
        }
        return abstractC6183d0S;
    }

    public InterfaceC7227e F() {
        InterfaceC7227e interfaceC7227eP = p(o.a.f62254l0.m());
        if (interfaceC7227eP == null) {
            a(21);
        }
        return interfaceC7227eP;
    }

    public void F0(F f10) {
        if (f10 == null) {
            a(1);
        }
        this.f62106f.b(new d(f10));
    }

    public AbstractC6183d0 G() {
        AbstractC6183d0 abstractC6183d0S = S(l.f62125m);
        if (abstractC6183d0S == null) {
            a(60);
        }
        return abstractC6183d0S;
    }

    public InterfaceC7227e H() {
        return q("Nothing");
    }

    public AbstractC6183d0 I() {
        AbstractC6183d0 abstractC6183d0P = H().p();
        if (abstractC6183d0P == null) {
            a(49);
        }
        return abstractC6183d0P;
    }

    public AbstractC6183d0 J() {
        AbstractC6183d0 abstractC6183d0R0 = i().R0(true);
        if (abstractC6183d0R0 == null) {
            a(52);
        }
        return abstractC6183d0R0;
    }

    public AbstractC6183d0 K() {
        AbstractC6183d0 abstractC6183d0R0 = I().R0(true);
        if (abstractC6183d0R0 == null) {
            a(50);
        }
        return abstractC6183d0R0;
    }

    public InterfaceC7227e L() {
        return q("Number");
    }

    public AbstractC6183d0 M() {
        AbstractC6183d0 abstractC6183d0P = L().p();
        if (abstractC6183d0P == null) {
            a(56);
        }
        return abstractC6183d0P;
    }

    protected Ae.c N() {
        c.b bVar = c.b.f407a;
        if (bVar == null) {
            a(4);
        }
        return bVar;
    }

    public AbstractC6183d0 P(l lVar) {
        if (lVar == null) {
            a(73);
        }
        AbstractC6183d0 abstractC6183d0 = (AbstractC6183d0) ((e) this.f62103c.invoke()).f62112a.get(lVar);
        if (abstractC6183d0 == null) {
            a(74);
        }
        return abstractC6183d0;
    }

    public AbstractC6183d0 S(l lVar) {
        if (lVar == null) {
            a(54);
        }
        AbstractC6183d0 abstractC6183d0P = R(lVar).p();
        if (abstractC6183d0P == null) {
            a(55);
        }
        return abstractC6183d0P;
    }

    public AbstractC6183d0 U() {
        AbstractC6183d0 abstractC6183d0S = S(l.f62122j);
        if (abstractC6183d0S == null) {
            a(58);
        }
        return abstractC6183d0S;
    }

    protected pf.n V() {
        pf.n nVar = this.f62106f;
        if (nVar == null) {
            a(6);
        }
        return nVar;
    }

    public InterfaceC7227e W() {
        return q("String");
    }

    public AbstractC6183d0 X() {
        AbstractC6183d0 abstractC6183d0P = W().p();
        if (abstractC6183d0P == null) {
            a(66);
        }
        return abstractC6183d0P;
    }

    public InterfaceC7227e Y(int i10) {
        InterfaceC7227e interfaceC7227eP = p(o.f62175s.b(Xe.f.m(o.d(i10))));
        if (interfaceC7227eP == null) {
            a(18);
        }
        return interfaceC7227eP;
    }

    public InterfaceC7227e Z() {
        return q("Unit");
    }

    public AbstractC6183d0 a0() {
        AbstractC6183d0 abstractC6183d0P = Z().p();
        if (abstractC6183d0P == null) {
            a(65);
        }
        return abstractC6183d0P;
    }

    protected void f(boolean z10) {
        F f10 = new F(f62100g, this.f62106f, this, null);
        this.f62101a = f10;
        f10.O0(ve.b.f62092a.c().a(this.f62106f, this.f62101a, w(), N(), g(), z10));
        F f11 = this.f62101a;
        f11.W0(f11);
    }

    protected Ae.a g() {
        a.C0010a c0010a = a.C0010a.f405a;
        if (c0010a == null) {
            a(3);
        }
        return c0010a;
    }

    public InterfaceC7227e h() {
        return q("Any");
    }

    public AbstractC6183d0 i() {
        AbstractC6183d0 abstractC6183d0P = h().p();
        if (abstractC6183d0P == null) {
            a(51);
        }
        return abstractC6183d0P;
    }

    public InterfaceC7227e j() {
        return q("Array");
    }

    public S k(S s10) {
        if (s10 == null) {
            a(68);
        }
        S sL = l(s10);
        if (sL != null) {
            return sL;
        }
        throw new IllegalStateException("not array: " + s10);
    }

    public S l(S s10) {
        S sB;
        if (s10 == null) {
            a(70);
        }
        if (d0(s10)) {
            if (s10.L0().size() != 1) {
                return null;
            }
            return ((B0) s10.L0().get(0)).getType();
        }
        S sN = J0.n(s10);
        S s11 = (S) ((e) this.f62103c.invoke()).f62114c.get(sN);
        if (s11 != null) {
            return s11;
        }
        H h10 = bf.i.h(sN);
        if (h10 == null || (sB = B(sN, h10)) == null) {
            return null;
        }
        return sB;
    }

    public AbstractC6183d0 m(N0 n02, S s10) {
        if (n02 == null) {
            a(82);
        }
        if (s10 == null) {
            a(83);
        }
        AbstractC6183d0 abstractC6183d0N = n(n02, s10, InterfaceC7374h.f66223k0.b());
        if (abstractC6183d0N == null) {
            a(84);
        }
        return abstractC6183d0N;
    }

    public AbstractC6183d0 n(N0 n02, S s10, InterfaceC7374h interfaceC7374h) {
        if (n02 == null) {
            a(78);
        }
        if (s10 == null) {
            a(79);
        }
        if (interfaceC7374h == null) {
            a(80);
        }
        AbstractC6183d0 abstractC6183d0H = V.h(s0.b(interfaceC7374h), j(), Collections.singletonList(new D0(n02, s10)));
        if (abstractC6183d0H == null) {
            a(81);
        }
        return abstractC6183d0H;
    }

    public AbstractC6183d0 o() {
        AbstractC6183d0 abstractC6183d0S = S(l.f62119g);
        if (abstractC6183d0S == null) {
            a(64);
        }
        return abstractC6183d0S;
    }

    public InterfaceC7227e p(Xe.c cVar) {
        if (cVar == null) {
            a(12);
        }
        InterfaceC7227e interfaceC7227eD = AbstractC7240s.d(s(), cVar, Ge.d.f7458d);
        if (interfaceC7227eD == null) {
            a(13);
        }
        return interfaceC7227eD;
    }

    public F s() {
        if (this.f62101a == null) {
            this.f62101a = (F) this.f62102b.invoke();
        }
        F f10 = this.f62101a;
        if (f10 == null) {
            a(7);
        }
        return f10;
    }

    public InterfaceC5387k t() {
        InterfaceC5387k interfaceC5387kO = s().S(o.f62147A).o();
        if (interfaceC5387kO == null) {
            a(11);
        }
        return interfaceC5387kO;
    }

    public AbstractC6183d0 u() {
        AbstractC6183d0 abstractC6183d0S = S(l.f62121i);
        if (abstractC6183d0S == null) {
            a(57);
        }
        return abstractC6183d0S;
    }

    public AbstractC6183d0 v() {
        AbstractC6183d0 abstractC6183d0S = S(l.f62120h);
        if (abstractC6183d0S == null) {
            a(63);
        }
        return abstractC6183d0S;
    }

    protected Iterable w() {
        List listSingletonList = Collections.singletonList(new C6966a(this.f62106f, s()));
        if (listSingletonList == null) {
            a(5);
        }
        return listSingletonList;
    }

    public InterfaceC7227e x() {
        InterfaceC7227e interfaceC7227eP = p(o.a.f62228X);
        if (interfaceC7227eP == null) {
            a(35);
        }
        return interfaceC7227eP;
    }

    public InterfaceC7227e y() {
        return q("Comparable");
    }

    public AbstractC6183d0 z() {
        AbstractC6183d0 abstractC6183d0J = J();
        if (abstractC6183d0J == null) {
            a(53);
        }
        return abstractC6183d0J;
    }
}
