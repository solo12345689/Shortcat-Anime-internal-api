package qf;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jf.InterfaceC5387k;
import kotlin.jvm.functions.Function1;
import rf.AbstractC6317g;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class J0 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC6183d0 f57988a = sf.l.d(sf.k.f59645E, new String[0]);

    /* JADX INFO: renamed from: b */
    public static final AbstractC6183d0 f57989b = sf.l.d(sf.k.f59716x, new String[0]);

    /* JADX INFO: renamed from: c */
    public static final AbstractC6183d0 f57990c = new a("NO_EXPECTED_TYPE");

    /* JADX INFO: renamed from: d */
    public static final AbstractC6183d0 f57991d = new a("UNIT_EXPECTED_TYPE");

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends AbstractC6175A {

        /* JADX INFO: renamed from: b */
        private final String f57992b;

        public a(String str) {
            this.f57992b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void Z0(int r9) {
            /*
                r0 = 4
                r1 = 1
                if (r9 == r1) goto L9
                if (r9 == r0) goto L9
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto Lb
            L9:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            Lb:
                r3 = 3
                r4 = 2
                if (r9 == r1) goto L13
                if (r9 == r0) goto L13
                r5 = r3
                goto L14
            L13:
                r5 = r4
            L14:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
                r7 = 0
                if (r9 == r1) goto L30
                if (r9 == r4) goto L2b
                if (r9 == r3) goto L26
                if (r9 == r0) goto L30
                java.lang.String r8 = "newAttributes"
                r5[r7] = r8
                goto L32
            L26:
                java.lang.String r8 = "kotlinTypeRefiner"
                r5[r7] = r8
                goto L32
            L2b:
                java.lang.String r8 = "delegate"
                r5[r7] = r8
                goto L32
            L30:
                r5[r7] = r6
            L32:
                java.lang.String r7 = "refine"
                if (r9 == r1) goto L3e
                if (r9 == r0) goto L3b
                r5[r1] = r6
                goto L42
            L3b:
                r5[r1] = r7
                goto L42
            L3e:
                java.lang.String r6 = "toString"
                r5[r1] = r6
            L42:
                if (r9 == r1) goto L56
                if (r9 == r4) goto L52
                if (r9 == r3) goto L4f
                if (r9 == r0) goto L56
                java.lang.String r3 = "replaceAttributes"
                r5[r4] = r3
                goto L56
            L4f:
                r5[r4] = r7
                goto L56
            L52:
                java.lang.String r3 = "replaceDelegate"
                r5[r4] = r3
            L56:
                java.lang.String r2 = java.lang.String.format(r2, r5)
                if (r9 == r1) goto L64
                if (r9 == r0) goto L64
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L69
            L64:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L69:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: qf.J0.a.Z0(int):void");
        }

        @Override // qf.M0
        /* JADX INFO: renamed from: U0 */
        public AbstractC6183d0 R0(boolean z10) {
            throw new IllegalStateException(this.f57992b);
        }

        @Override // qf.M0
        /* JADX INFO: renamed from: V0 */
        public AbstractC6183d0 T0(r0 r0Var) {
            if (r0Var == null) {
                Z0(0);
            }
            throw new IllegalStateException(this.f57992b);
        }

        @Override // qf.AbstractC6175A
        protected AbstractC6183d0 W0() {
            throw new IllegalStateException(this.f57992b);
        }

        @Override // qf.AbstractC6175A
        public AbstractC6175A Y0(AbstractC6183d0 abstractC6183d0) {
            if (abstractC6183d0 == null) {
                Z0(2);
            }
            throw new IllegalStateException(this.f57992b);
        }

        @Override // qf.AbstractC6175A
        /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a X0(AbstractC6317g abstractC6317g) {
            if (abstractC6317g == null) {
                Z0(3);
            }
            return this;
        }

        @Override // qf.AbstractC6183d0
        public String toString() {
            String str = this.f57992b;
            if (str == null) {
                Z0(1);
            }
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r24) {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qf.J0.a(int):void");
    }

    public static boolean b(S s10) {
        if (s10 == null) {
            a(28);
        }
        if (s10.O0()) {
            return true;
        }
        return L.b(s10) && b(L.a(s10).W0());
    }

    public static boolean c(S s10, Function1 function1) {
        if (function1 == null) {
            a(43);
        }
        return d(s10, function1, null);
    }

    private static boolean d(S s10, Function1 function1, Af.k kVar) {
        if (function1 == null) {
            a(44);
        }
        if (s10 == null) {
            return false;
        }
        M0 m0Q0 = s10.Q0();
        if (w(s10)) {
            return ((Boolean) function1.invoke(m0Q0)).booleanValue();
        }
        if (kVar != null && kVar.contains(s10)) {
            return false;
        }
        if (((Boolean) function1.invoke(m0Q0)).booleanValue()) {
            return true;
        }
        if (kVar == null) {
            kVar = Af.k.d();
        }
        kVar.add(s10);
        I i10 = m0Q0 instanceof I ? (I) m0Q0 : null;
        if (i10 != null && (d(i10.V0(), function1, kVar) || d(i10.W0(), function1, kVar))) {
            return true;
        }
        if ((m0Q0 instanceof C6214y) && d(((C6214y) m0Q0).Z0(), function1, kVar)) {
            return true;
        }
        v0 v0VarN0 = s10.N0();
        if (v0VarN0 instanceof Q) {
            Iterator it = ((Q) v0VarN0).k().iterator();
            while (it.hasNext()) {
                if (d((S) it.next(), function1, kVar)) {
                    return true;
                }
            }
            return false;
        }
        for (B0 b02 : s10.L0()) {
            if (!b02.a() && d(b02.getType(), function1, kVar)) {
                return true;
            }
        }
        return false;
    }

    public static S e(S s10, S s11, G0 g02) {
        if (s10 == null) {
            a(20);
        }
        if (s11 == null) {
            a(21);
        }
        if (g02 == null) {
            a(22);
        }
        S sP = g02.p(s11, N0.f57999e);
        if (sP != null) {
            return q(sP, s10.O0());
        }
        return null;
    }

    public static InterfaceC7227e f(S s10) {
        if (s10 == null) {
            a(30);
        }
        InterfaceC7230h interfaceC7230hP = s10.N0().p();
        if (interfaceC7230hP instanceof InterfaceC7227e) {
            return (InterfaceC7227e) interfaceC7230hP;
        }
        return null;
    }

    public static List g(List list) {
        if (list == null) {
            a(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new D0(((ye.m0) it.next()).p()));
        }
        List listB1 = AbstractC2279u.b1(arrayList);
        if (listB1 == null) {
            a(17);
        }
        return listB1;
    }

    public static List h(S s10) {
        if (s10 == null) {
            a(18);
        }
        G0 g0F = G0.f(s10);
        Collection collectionK = s10.N0().k();
        ArrayList arrayList = new ArrayList(collectionK.size());
        Iterator it = collectionK.iterator();
        while (it.hasNext()) {
            S sE = e(s10, (S) it.next(), g0F);
            if (sE != null) {
                arrayList.add(sE);
            }
        }
        return arrayList;
    }

    public static ye.m0 i(S s10) {
        if (s10 == null) {
            a(63);
        }
        if (s10.N0().p() instanceof ye.m0) {
            return (ye.m0) s10.N0().p();
        }
        return null;
    }

    public static boolean j(S s10) {
        if (s10 == null) {
            a(29);
        }
        if (s10.N0().p() instanceof InterfaceC7227e) {
            return false;
        }
        Iterator it = h(s10).iterator();
        while (it.hasNext()) {
            if (l((S) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(S s10) {
        return s10 != null && s10.N0() == f57988a.N0();
    }

    public static boolean l(S s10) {
        if (s10 == null) {
            a(27);
        }
        if (s10.O0()) {
            return true;
        }
        if (L.b(s10) && l(L.a(s10).W0())) {
            return true;
        }
        if (AbstractC6191h0.c(s10)) {
            return false;
        }
        if (m(s10)) {
            return j(s10);
        }
        v0 v0VarN0 = s10.N0();
        if (v0VarN0 instanceof Q) {
            Iterator it = v0VarN0.k().iterator();
            while (it.hasNext()) {
                if (l((S) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m(S s10) {
        if (s10 == null) {
            a(60);
        }
        if (i(s10) != null) {
            return true;
        }
        s10.N0();
        return false;
    }

    public static S n(S s10) {
        if (s10 == null) {
            a(2);
        }
        return p(s10, false);
    }

    public static S o(S s10) {
        if (s10 == null) {
            a(1);
        }
        return p(s10, true);
    }

    public static S p(S s10, boolean z10) {
        if (s10 == null) {
            a(3);
        }
        M0 m0R0 = s10.Q0().R0(z10);
        if (m0R0 == null) {
            a(4);
        }
        return m0R0;
    }

    public static S q(S s10, boolean z10) {
        if (s10 == null) {
            a(8);
        }
        if (z10) {
            return o(s10);
        }
        if (s10 == null) {
            a(9);
        }
        return s10;
    }

    public static AbstractC6183d0 r(AbstractC6183d0 abstractC6183d0, boolean z10) {
        if (abstractC6183d0 == null) {
            a(5);
        }
        if (!z10) {
            if (abstractC6183d0 == null) {
                a(7);
            }
            return abstractC6183d0;
        }
        AbstractC6183d0 abstractC6183d0R0 = abstractC6183d0.R0(true);
        if (abstractC6183d0R0 == null) {
            a(6);
        }
        return abstractC6183d0R0;
    }

    public static B0 s(ye.m0 m0Var) {
        if (m0Var == null) {
            a(45);
        }
        return new C6197k0(m0Var);
    }

    public static B0 t(ye.m0 m0Var, G g10) {
        if (m0Var == null) {
            a(46);
        }
        return g10.b() == I0.f57981a ? new D0(AbstractC6199l0.b(m0Var)) : new C6197k0(m0Var);
    }

    public static AbstractC6183d0 u(v0 v0Var, InterfaceC5387k interfaceC5387k, Function1 function1) {
        if (v0Var == null) {
            a(12);
        }
        if (interfaceC5387k == null) {
            a(13);
        }
        if (function1 == null) {
            a(14);
        }
        AbstractC6183d0 abstractC6183d0N = V.n(r0.f58089b.k(), v0Var, g(v0Var.getParameters()), false, interfaceC5387k, function1);
        if (abstractC6183d0N == null) {
            a(15);
        }
        return abstractC6183d0N;
    }

    public static AbstractC6183d0 v(InterfaceC7230h interfaceC7230h, InterfaceC5387k interfaceC5387k, Function1 function1) {
        if (!sf.l.m(interfaceC7230h)) {
            return u(interfaceC7230h.l(), interfaceC5387k, function1);
        }
        sf.i iVarD = sf.l.d(sf.k.f59643D, interfaceC7230h.toString());
        if (iVarD == null) {
            a(11);
        }
        return iVarD;
    }

    public static boolean w(S s10) {
        if (s10 == null) {
            a(0);
        }
        return s10 == f57990c || s10 == f57991d;
    }
}
