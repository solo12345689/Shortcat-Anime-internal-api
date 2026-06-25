package qf;

import cf.AbstractC3103e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import ve.o;
import vf.AbstractC6867d;
import wf.AbstractC6975c;
import ze.C7381o;
import ze.C7382p;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class G0 {

    /* JADX INFO: renamed from: b */
    public static final G0 f57972b = g(E0.f57967b);

    /* JADX INFO: renamed from: a */
    private final E0 f57973a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a implements Function1 {
        a() {
        }

        private static /* synthetic */ void a(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b */
        public Boolean invoke(Xe.c cVar) {
            if (cVar == null) {
                a(0);
            }
            return Boolean.valueOf(!cVar.equals(o.a.f62215Q));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f57974a;

        static {
            int[] iArr = new int[d.values().length];
            f57974a = iArr;
            try {
                iArr[d.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57974a[d.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57974a[d.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c extends Exception {
        public c(String str) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private enum d {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    protected G0(E0 e02) {
        if (e02 == null) {
            a(7);
        }
        this.f57973a = e02;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r13) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qf.G0.a(int):void");
    }

    private static void b(int i10, B0 b02, E0 e02) {
        if (i10 <= 100) {
            return;
        }
        throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + o(b02) + "; substitution: " + o(e02));
    }

    public static N0 c(N0 n02, B0 b02) {
        if (n02 == null) {
            a(35);
        }
        if (b02 == null) {
            a(36);
        }
        if (!b02.a()) {
            return d(n02, b02.b());
        }
        N0 n03 = N0.f58001g;
        if (n03 == null) {
            a(37);
        }
        return n03;
    }

    public static N0 d(N0 n02, N0 n03) {
        if (n02 == null) {
            a(38);
        }
        if (n03 == null) {
            a(39);
        }
        N0 n04 = N0.f57999e;
        if (n02 == n04) {
            if (n03 == null) {
                a(40);
            }
            return n03;
        }
        if (n03 == n04) {
            if (n02 == null) {
                a(41);
            }
            return n02;
        }
        if (n02 == n03) {
            if (n03 == null) {
                a(42);
            }
            return n03;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + n02 + "' and projection kind '" + n03 + "' cannot be combined");
    }

    private static d e(N0 n02, N0 n03) {
        N0 n04 = N0.f58000f;
        return (n02 == n04 && n03 == N0.f58001g) ? d.OUT_IN_IN_POSITION : (n02 == N0.f58001g && n03 == n04) ? d.IN_IN_OUT_POSITION : d.NO_CONFLICT;
    }

    public static G0 f(S s10) {
        if (s10 == null) {
            a(6);
        }
        return g(w0.i(s10.N0(), s10.L0()));
    }

    public static G0 g(E0 e02) {
        if (e02 == null) {
            a(0);
        }
        return new G0(e02);
    }

    public static G0 h(E0 e02, E0 e03) {
        if (e02 == null) {
            a(3);
        }
        if (e03 == null) {
            a(4);
        }
        return g(D.i(e02, e03));
    }

    private static InterfaceC7374h i(InterfaceC7374h interfaceC7374h) {
        if (interfaceC7374h == null) {
            a(33);
        }
        return !interfaceC7374h.k0(o.a.f62215Q) ? interfaceC7374h : new C7382p(interfaceC7374h, new a());
    }

    private static B0 l(S s10, B0 b02, ye.m0 m0Var, B0 b03) {
        if (s10 == null) {
            a(26);
        }
        if (b02 == null) {
            a(27);
        }
        if (b03 == null) {
            a(28);
        }
        if (!s10.getAnnotations().k0(o.a.f62215Q)) {
            if (b02 == null) {
                a(29);
            }
            return b02;
        }
        v0 v0VarN0 = b02.getType().N0();
        if (!(v0VarN0 instanceof rf.n)) {
            return b02;
        }
        B0 b0A = ((rf.n) v0VarN0).a();
        N0 n0B = b0A.b();
        d dVarE = e(b03.b(), n0B);
        d dVar = d.OUT_IN_IN_POSITION;
        return dVarE == dVar ? new D0(b0A.getType()) : (m0Var != null && e(m0Var.m(), n0B) == dVar) ? new D0(b0A.getType()) : b02;
    }

    private static String o(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th2) {
            if (Af.c.a(th2)) {
                throw th2;
            }
            return "[Exception while computing toString(): " + th2 + "]";
        }
    }

    private B0 r(B0 b02, int i10) {
        S type = b02.getType();
        N0 n0B = b02.b();
        if (type.N0().p() instanceof ye.m0) {
            return b02;
        }
        AbstractC6183d0 abstractC6183d0B = AbstractC6191h0.b(type);
        S sP = abstractC6183d0B != null ? m().p(abstractC6183d0B, N0.f57999e) : null;
        S sB = F0.b(type, s(type.N0().getParameters(), type.L0(), i10), this.f57973a.d(type.getAnnotations()));
        if ((sB instanceof AbstractC6183d0) && (sP instanceof AbstractC6183d0)) {
            sB = AbstractC6191h0.j((AbstractC6183d0) sB, (AbstractC6183d0) sP);
        }
        return new D0(n0B, sB);
    }

    private List s(List list, List list2, int i10) throws c {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z10 = false;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ye.m0 m0Var = (ye.m0) list.get(i11);
            B0 b02 = (B0) list2.get(i11);
            B0 b0U = u(b02, m0Var, i10 + 1);
            int i12 = b.f57974a[e(m0Var.m(), b0U.b()).ordinal()];
            if (i12 == 1 || i12 == 2) {
                b0U = J0.s(m0Var);
            } else if (i12 == 3) {
                N0 n0M = m0Var.m();
                N0 n02 = N0.f57999e;
                if (n0M != n02 && !b0U.a()) {
                    b0U = new D0(n02, b0U.getType());
                }
            }
            if (b0U != b02) {
                z10 = true;
            }
            arrayList.add(b0U);
        }
        return !z10 ? list2 : arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private B0 u(B0 b02, ye.m0 m0Var, int i10) throws c {
        if (b02 == null) {
            a(18);
        }
        b(i10, b02, this.f57973a);
        if (!b02.a()) {
            S type = b02.getType();
            if (type instanceof K0) {
                K0 k02 = (K0) type;
                M0 m0H0 = k02.H0();
                S sJ0 = k02.j0();
                B0 b0U = u(new D0(b02.b(), m0H0), m0Var, i10 + 1);
                return b0U.a() ? b0U : new D0(b0U.b(), L0.d(b0U.getType().Q0(), p(sJ0, b02.b())));
            }
            if (!E.a(type) && !(type.Q0() instanceof InterfaceC6181c0)) {
                B0 b0E = this.f57973a.e(type);
                B0 b0L = b0E != null ? l(type, b0E, m0Var, b02) : null;
                N0 n0B = b02.b();
                if (b0L == null && L.b(type) && !t0.b(type)) {
                    I iA = L.a(type);
                    int i11 = i10 + 1;
                    B0 b0U2 = u(new D0(n0B, iA.V0()), m0Var, i11);
                    B0 b0U3 = u(new D0(n0B, iA.W0()), m0Var, i11);
                    N0 n0B2 = b0U2.b();
                    if (b0U2.getType() != iA.V0() || b0U3.getType() != iA.W0()) {
                        return new D0(n0B2, V.e(F0.a(b0U2.getType()), F0.a(b0U3.getType())));
                    }
                } else if (!ve.i.o0(type) && !W.a(type)) {
                    if (b0L != null) {
                        d dVarE = e(n0B, b0L.b());
                        if (!AbstractC3103e.f(type)) {
                            int i12 = b.f57974a[dVarE.ordinal()];
                            if (i12 == 1) {
                                throw new c("Out-projection in in-position");
                            }
                            if (i12 == 2) {
                                return new D0(N0.f58001g, type.N0().n().J());
                            }
                        }
                        InterfaceC6212w interfaceC6212wA = t0.a(type);
                        if (b0L.a()) {
                            return b0L;
                        }
                        S sT = interfaceC6212wA != null ? interfaceC6212wA.T(b0L.getType()) : J0.q(b0L.getType(), type.O0());
                        if (!type.getAnnotations().isEmpty()) {
                            sT = AbstractC6867d.C(sT, new C7381o(sT.getAnnotations(), i(this.f57973a.d(type.getAnnotations()))));
                        }
                        if (dVarE == d.NO_CONFLICT) {
                            n0B = d(n0B, b0L.b());
                        }
                        return new D0(n0B, sT);
                    }
                    b02 = r(b02, i10);
                    if (b02 == null) {
                        a(25);
                    }
                }
            }
        }
        return b02;
    }

    public E0 j() {
        E0 e02 = this.f57973a;
        if (e02 == null) {
            a(8);
        }
        return e02;
    }

    public boolean k() {
        return this.f57973a.f();
    }

    public G0 m() {
        E0 e02 = this.f57973a;
        return ((e02 instanceof M) && e02.b()) ? new G0(new M(((M) this.f57973a).j(), ((M) this.f57973a).i(), false)) : this;
    }

    public S n(S s10, N0 n02) {
        if (s10 == null) {
            a(9);
        }
        if (n02 == null) {
            a(10);
        }
        if (k()) {
            if (s10 == null) {
                a(11);
            }
            return s10;
        }
        try {
            S type = u(new D0(n02, s10), null, 0).getType();
            if (type == null) {
                a(12);
            }
            return type;
        } catch (c e10) {
            sf.i iVarD = sf.l.d(sf.k.f59643D, e10.getMessage());
            if (iVarD == null) {
                a(13);
            }
            return iVarD;
        }
    }

    public S p(S s10, N0 n02) {
        if (s10 == null) {
            a(14);
        }
        if (n02 == null) {
            a(15);
        }
        B0 b0Q = q(new D0(n02, j().g(s10, n02)));
        if (b0Q == null) {
            return null;
        }
        return b0Q.getType();
    }

    public B0 q(B0 b02) {
        if (b02 == null) {
            a(16);
        }
        B0 b0T = t(b02);
        return (this.f57973a.a() || this.f57973a.b()) ? AbstractC6975c.d(b0T, this.f57973a.b()) : b0T;
    }

    public B0 t(B0 b02) {
        if (b02 == null) {
            a(17);
        }
        if (k()) {
            return b02;
        }
        try {
            return u(b02, null, 0);
        } catch (c unused) {
            return null;
        }
    }
}
