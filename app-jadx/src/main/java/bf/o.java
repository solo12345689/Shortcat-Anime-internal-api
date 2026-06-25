package bf;

import Be.AbstractC1123s;
import Be.J;
import Be.K;
import Td.L;
import Ud.AbstractC2279u;
import bf.j;
import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import qf.C6188g;
import qf.S;
import qf.W;
import qf.u0;
import qf.v0;
import rf.AbstractC6316f;
import rf.AbstractC6317g;
import rf.InterfaceC6315e;
import ye.AbstractC7241t;
import ye.AbstractC7242u;
import ye.D;
import ye.E;
import ye.InterfaceC7223a;
import ye.InterfaceC7224b;
import ye.InterfaceC7227e;
import ye.InterfaceC7235m;
import ye.InterfaceC7239q;
import ye.InterfaceC7247z;
import ye.Y;
import ye.Z;
import ye.c0;
import ye.m0;
import ye.t0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class o {

    /* JADX INFO: renamed from: e */
    private static final List f33311e = AbstractC2279u.b1(ServiceLoader.load(j.class, j.class.getClassLoader()));

    /* JADX INFO: renamed from: f */
    public static final o f33312f;

    /* JADX INFO: renamed from: g */
    private static final InterfaceC6315e.a f33313g;

    /* JADX INFO: renamed from: a */
    private final AbstractC6317g f33314a;

    /* JADX INFO: renamed from: b */
    private final AbstractC6316f f33315b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC6315e.a f33316c;

    /* JADX INFO: renamed from: d */
    private final Function2 f33317d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a implements InterfaceC6315e.a {
        a() {
        }

        private static /* synthetic */ void b(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // rf.InterfaceC6315e.a
        public boolean a(v0 v0Var, v0 v0Var2) {
            if (v0Var == null) {
                b(0);
            }
            if (v0Var2 == null) {
                b(1);
            }
            return v0Var.equals(v0Var2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b implements Function2 {
        b() {
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a */
        public Pair invoke(InterfaceC7223a interfaceC7223a, InterfaceC7223a interfaceC7223a2) {
            return new Pair(interfaceC7223a, interfaceC7223a2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC7235m f33318a;

        c(InterfaceC7235m interfaceC7235m) {
            this.f33318a = interfaceC7235m;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public Boolean invoke(InterfaceC7224b interfaceC7224b) {
            return Boolean.valueOf(interfaceC7224b.b() == this.f33318a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class e implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC7227e f33319a;

        e(InterfaceC7227e interfaceC7227e) {
            this.f33319a = interfaceC7227e;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public Boolean invoke(InterfaceC7224b interfaceC7224b) {
            boolean z10 = false;
            if (!AbstractC7241t.g(interfaceC7224b.getVisibility()) && AbstractC7241t.h(interfaceC7224b, this.f33319a, false)) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class g implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ n f33320a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC7224b f33321b;

        g(n nVar, InterfaceC7224b interfaceC7224b) {
            this.f33320a = nVar;
            this.f33321b = interfaceC7224b;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public L invoke(InterfaceC7224b interfaceC7224b) {
            this.f33320a.b(this.f33321b, interfaceC7224b);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class h {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f33322a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f33323b;

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ int[] f33324c;

        static {
            int[] iArr = new int[E.values().length];
            f33324c = iArr;
            try {
                iArr[E.f65060b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33324c[E.f65061c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33324c[E.f65062d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33324c[E.f65063e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[i.a.values().length];
            f33323b = iArr2;
            try {
                iArr2[i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33323b[i.a.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33323b[i.a.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[j.b.values().length];
            f33322a = iArr3;
            try {
                iArr3[j.b.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f33322a[j.b.INCOMPATIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f33322a[j.b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class i {

        /* JADX INFO: renamed from: c */
        private static final i f33325c = new i(a.OVERRIDABLE, HybridPurchaseLogicBridge.RESULT_SUCCESS);

        /* JADX INFO: renamed from: a */
        private final a f33326a;

        /* JADX INFO: renamed from: b */
        private final String f33327b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public enum a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public i(a aVar, String str) {
            if (aVar == null) {
                a(3);
            }
            if (str == null) {
                a(4);
            }
            this.f33326a = aVar;
            this.f33327b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:67:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto Lf
                if (r10 == r2) goto Lf
                if (r10 == r1) goto Lf
                if (r10 == r0) goto Lf
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L11
            Lf:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L11:
                if (r10 == r3) goto L1b
                if (r10 == r2) goto L1b
                if (r10 == r1) goto L1b
                if (r10 == r0) goto L1b
                r5 = r2
                goto L1c
            L1b:
                r5 = r1
            L1c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L31
                if (r10 == r2) goto L31
                if (r10 == r1) goto L2e
                if (r10 == r0) goto L31
                r5[r8] = r7
                goto L35
            L2e:
                r5[r8] = r6
                goto L35
            L31:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L35:
                switch(r10) {
                    case 1: goto L45;
                    case 2: goto L45;
                    case 3: goto L45;
                    case 4: goto L45;
                    case 5: goto L40;
                    case 6: goto L3b;
                    default: goto L38;
                }
            L38:
                r5[r3] = r6
                goto L47
            L3b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L47
            L40:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L47
            L45:
                r5[r3] = r7
            L47:
                if (r10 == r3) goto L5a
                if (r10 == r2) goto L55
                if (r10 == r1) goto L50
                if (r10 == r0) goto L50
                goto L5e
            L50:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L5e
            L55:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L5e
            L5a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L5e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L70
                if (r10 == r2) goto L70
                if (r10 == r1) goto L70
                if (r10 == r0) goto L70
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L75
            L70:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L75:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: bf.o.i.a(int):void");
        }

        public static i b(String str) {
            if (str == null) {
                a(2);
            }
            return new i(a.CONFLICT, str);
        }

        public static i d(String str) {
            if (str == null) {
                a(1);
            }
            return new i(a.INCOMPATIBLE, str);
        }

        public static i e() {
            i iVar = f33325c;
            if (iVar == null) {
                a(0);
            }
            return iVar;
        }

        public a c() {
            a aVar = this.f33326a;
            if (aVar == null) {
                a(5);
            }
            return aVar;
        }

        public String toString() {
            return this.f33326a + ": " + this.f33327b;
        }
    }

    static {
        a aVar = new a();
        f33313g = aVar;
        f33312f = new o(aVar, AbstractC6317g.a.f58775a, AbstractC6316f.a.f58774a, null);
    }

    private o(InterfaceC6315e.a aVar, AbstractC6317g abstractC6317g, AbstractC6316f abstractC6316f, Function2 function2) {
        if (aVar == null) {
            a(5);
        }
        if (abstractC6317g == null) {
            a(6);
        }
        if (abstractC6316f == null) {
            a(7);
        }
        this.f33316c = aVar;
        this.f33314a = abstractC6317g;
        this.f33315b = abstractC6316f;
        this.f33317d = function2;
    }

    private static boolean A(Y y10, Y y11) {
        if (y10 == null || y11 == null) {
            return true;
        }
        return H(y10, y11);
    }

    public static boolean B(InterfaceC7223a interfaceC7223a, InterfaceC7223a interfaceC7223a2) {
        if (interfaceC7223a == null) {
            a(65);
        }
        if (interfaceC7223a2 == null) {
            a(66);
        }
        S returnType = interfaceC7223a.getReturnType();
        S returnType2 = interfaceC7223a2.getReturnType();
        if (!H(interfaceC7223a, interfaceC7223a2)) {
            return false;
        }
        u0 u0VarL = f33312f.l(interfaceC7223a.getTypeParameters(), interfaceC7223a2.getTypeParameters());
        if (interfaceC7223a instanceof InterfaceC7247z) {
            return G(interfaceC7223a, returnType, interfaceC7223a2, returnType2, u0VarL);
        }
        if (!(interfaceC7223a instanceof Z)) {
            throw new IllegalArgumentException("Unexpected callable: " + interfaceC7223a.getClass());
        }
        Z z10 = (Z) interfaceC7223a;
        Z z11 = (Z) interfaceC7223a2;
        if (A(z10.g(), z11.g())) {
            return (z10.N() && z11.N()) ? C6188g.f58052a.m(u0VarL, returnType.Q0(), returnType2.Q0()) : (z10.N() || !z11.N()) && G(interfaceC7223a, returnType, interfaceC7223a2, returnType2, u0VarL);
        }
        return false;
    }

    private static boolean C(InterfaceC7223a interfaceC7223a, Collection collection) {
        if (interfaceC7223a == null) {
            a(69);
        }
        if (collection == null) {
            a(70);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!B(interfaceC7223a, (InterfaceC7223a) it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean G(InterfaceC7223a interfaceC7223a, S s10, InterfaceC7223a interfaceC7223a2, S s11, u0 u0Var) {
        if (interfaceC7223a == null) {
            a(71);
        }
        if (s10 == null) {
            a(72);
        }
        if (interfaceC7223a2 == null) {
            a(73);
        }
        if (s11 == null) {
            a(74);
        }
        if (u0Var == null) {
            a(75);
        }
        return C6188g.f58052a.t(u0Var, s10.Q0(), s11.Q0());
    }

    private static boolean H(InterfaceC7239q interfaceC7239q, InterfaceC7239q interfaceC7239q2) {
        if (interfaceC7239q == null) {
            a(67);
        }
        if (interfaceC7239q2 == null) {
            a(68);
        }
        Integer numD = AbstractC7241t.d(interfaceC7239q.getVisibility(), interfaceC7239q2.getVisibility());
        return numD == null || numD.intValue() >= 0;
    }

    public static boolean I(D d10, D d11, boolean z10) {
        if (d10 == null) {
            a(55);
        }
        if (d11 == null) {
            a(56);
        }
        return !AbstractC7241t.g(d11.getVisibility()) && AbstractC7241t.h(d11, d10, z10);
    }

    public static boolean J(InterfaceC7223a interfaceC7223a, InterfaceC7223a interfaceC7223a2, boolean z10, boolean z11) {
        if (interfaceC7223a == null) {
            a(13);
        }
        if (interfaceC7223a2 == null) {
            a(14);
        }
        if (!interfaceC7223a.equals(interfaceC7223a2) && bf.g.f33298a.k(interfaceC7223a.a(), interfaceC7223a2.a(), z10, z11)) {
            return true;
        }
        InterfaceC7223a interfaceC7223aA = interfaceC7223a2.a();
        Iterator it = bf.i.d(interfaceC7223a).iterator();
        while (it.hasNext()) {
            if (bf.g.f33298a.k(interfaceC7223aA, (InterfaceC7223a) it.next(), z10, z11)) {
                return true;
            }
        }
        return false;
    }

    public static void K(InterfaceC7224b interfaceC7224b, Function1 function1) {
        AbstractC7242u abstractC7242u;
        if (interfaceC7224b == null) {
            a(105);
        }
        for (InterfaceC7224b interfaceC7224b2 : interfaceC7224b.e()) {
            if (interfaceC7224b2.getVisibility() == AbstractC7241t.f65126g) {
                K(interfaceC7224b2, function1);
            }
        }
        if (interfaceC7224b.getVisibility() != AbstractC7241t.f65126g) {
            return;
        }
        AbstractC7242u abstractC7242uH = h(interfaceC7224b);
        if (abstractC7242uH == null) {
            if (function1 != null) {
                function1.invoke(interfaceC7224b);
            }
            abstractC7242u = AbstractC7241t.f65124e;
        } else {
            abstractC7242u = abstractC7242uH;
        }
        if (interfaceC7224b instanceof K) {
            ((K) interfaceC7224b).c1(abstractC7242u);
            Iterator it = ((Z) interfaceC7224b).w().iterator();
            while (it.hasNext()) {
                K((Y) it.next(), abstractC7242uH == null ? null : function1);
            }
            return;
        }
        if (interfaceC7224b instanceof AbstractC1123s) {
            ((AbstractC1123s) interfaceC7224b).j1(abstractC7242u);
            return;
        }
        J j10 = (J) interfaceC7224b;
        j10.N0(abstractC7242u);
        if (abstractC7242u != j10.W().getVisibility()) {
            j10.L0(false);
        }
    }

    public static Object L(Collection collection, Function1 function1) {
        Object next;
        if (collection == null) {
            a(76);
        }
        if (function1 == null) {
            a(77);
        }
        if (collection.size() == 1) {
            Object objL0 = AbstractC2279u.l0(collection);
            if (objL0 == null) {
                a(78);
            }
            return objL0;
        }
        ArrayList arrayList = new ArrayList(2);
        List listB0 = AbstractC2279u.B0(collection, function1);
        Object objL02 = AbstractC2279u.l0(collection);
        InterfaceC7223a interfaceC7223a = (InterfaceC7223a) function1.invoke(objL02);
        for (Object obj : collection) {
            InterfaceC7223a interfaceC7223a2 = (InterfaceC7223a) function1.invoke(obj);
            if (C(interfaceC7223a2, listB0)) {
                arrayList.add(obj);
            }
            if (B(interfaceC7223a2, interfaceC7223a) && !B(interfaceC7223a, interfaceC7223a2)) {
                objL02 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objL02 == null) {
                a(79);
            }
            return objL02;
        }
        if (arrayList.size() == 1) {
            Object objL03 = AbstractC2279u.l0(arrayList);
            if (objL03 == null) {
                a(80);
            }
            return objL03;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!qf.L.b(((InterfaceC7223a) function1.invoke(next)).getReturnType())) {
                break;
            }
        }
        if (next != null) {
            return next;
        }
        Object objL04 = AbstractC2279u.l0(arrayList);
        if (objL04 == null) {
            a(82);
        }
        return objL04;
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r24) {
        /*
            Method dump skipped, instruction units count: 1298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.o.a(int):void");
    }

    private static boolean b(Collection collection) {
        if (collection == null) {
            a(61);
        }
        if (collection.size() < 2) {
            return true;
        }
        return AbstractC2279u.b0(collection, new c(((InterfaceC7224b) collection.iterator().next()).b()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0054, code lost:
    
        r1.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean c(ye.m0 r4, ye.m0 r5, qf.u0 r6) {
        /*
            if (r4 != 0) goto L7
            r0 = 47
            a(r0)
        L7:
            if (r5 != 0) goto Le
            r0 = 48
            a(r0)
        Le:
            if (r6 != 0) goto L15
            r0 = 49
            a(r0)
        L15:
            java.util.List r4 = r4.getUpperBounds()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r5 = r5.getUpperBounds()
            r0.<init>(r5)
            int r5 = r4.size()
            int r1 = r0.size()
            r2 = 0
            if (r5 == r1) goto L2e
            return r2
        L2e:
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.next()
            qf.S r5 = (qf.S) r5
            java.util.ListIterator r1 = r0.listIterator()
        L42:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r1.next()
            qf.S r3 = (qf.S) r3
            boolean r3 = d(r5, r3, r6)
            if (r3 == 0) goto L42
            r1.remove()
            goto L32
        L58:
            return r2
        L59:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.o.c(ye.m0, ye.m0, qf.u0):boolean");
    }

    private static boolean d(S s10, S s11, u0 u0Var) {
        if (s10 == null) {
            a(44);
        }
        if (s11 == null) {
            a(45);
        }
        if (u0Var == null) {
            a(46);
        }
        if (W.a(s10) && W.a(s11)) {
            return true;
        }
        return C6188g.f58052a.m(u0Var, s10.Q0(), s11.Q0());
    }

    private static i e(InterfaceC7223a interfaceC7223a, InterfaceC7223a interfaceC7223a2) {
        if ((interfaceC7223a.O() == null) != (interfaceC7223a2.O() == null)) {
            return i.d("Receiver presence mismatch");
        }
        if (interfaceC7223a.j().size() != interfaceC7223a2.j().size()) {
            return i.d("Value parameter number mismatch");
        }
        return null;
    }

    private static void f(InterfaceC7224b interfaceC7224b, Set set) {
        if (interfaceC7224b == null) {
            a(17);
        }
        if (set == null) {
            a(18);
        }
        if (interfaceC7224b.h().a()) {
            set.add(interfaceC7224b);
            return;
        }
        if (interfaceC7224b.e().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + interfaceC7224b);
        }
        Iterator it = interfaceC7224b.e().iterator();
        while (it.hasNext()) {
            f((InterfaceC7224b) it.next(), set);
        }
    }

    private static List g(InterfaceC7223a interfaceC7223a) {
        c0 c0VarO = interfaceC7223a.O();
        ArrayList arrayList = new ArrayList();
        if (c0VarO != null) {
            arrayList.add(c0VarO.getType());
        }
        Iterator it = interfaceC7223a.j().iterator();
        while (it.hasNext()) {
            arrayList.add(((t0) it.next()).getType());
        }
        return arrayList;
    }

    private static AbstractC7242u h(InterfaceC7224b interfaceC7224b) {
        if (interfaceC7224b == null) {
            a(106);
        }
        Collection<InterfaceC7224b> collectionE = interfaceC7224b.e();
        AbstractC7242u abstractC7242uU = u(collectionE);
        if (abstractC7242uU == null) {
            return null;
        }
        if (interfaceC7224b.h() != InterfaceC7224b.a.FAKE_OVERRIDE) {
            return abstractC7242uU.f();
        }
        for (InterfaceC7224b interfaceC7224b2 : collectionE) {
            if (interfaceC7224b2.r() != E.f65063e && !interfaceC7224b2.getVisibility().equals(abstractC7242uU)) {
                return null;
            }
        }
        return abstractC7242uU;
    }

    public static o i(AbstractC6317g abstractC6317g, InterfaceC6315e.a aVar) {
        if (abstractC6317g == null) {
            a(3);
        }
        if (aVar == null) {
            a(4);
        }
        return new o(aVar, abstractC6317g, AbstractC6316f.a.f58774a, null);
    }

    private static void j(Collection collection, InterfaceC7227e interfaceC7227e, n nVar) {
        if (collection == null) {
            a(83);
        }
        if (interfaceC7227e == null) {
            a(84);
        }
        if (nVar == null) {
            a(85);
        }
        Collection collectionT = t(interfaceC7227e, collection);
        boolean zIsEmpty = collectionT.isEmpty();
        if (!zIsEmpty) {
            collection = collectionT;
        }
        InterfaceC7224b interfaceC7224bL0 = ((InterfaceC7224b) L(collection, new d())).l0(interfaceC7227e, n(collection, interfaceC7227e), zIsEmpty ? AbstractC7241t.f65127h : AbstractC7241t.f65126g, InterfaceC7224b.a.FAKE_OVERRIDE, false);
        nVar.d(interfaceC7224bL0, collection);
        nVar.a(interfaceC7224bL0);
    }

    private static void k(InterfaceC7227e interfaceC7227e, Collection collection, n nVar) {
        if (interfaceC7227e == null) {
            a(62);
        }
        if (collection == null) {
            a(63);
        }
        if (nVar == null) {
            a(64);
        }
        if (b(collection)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                j(Collections.singleton((InterfaceC7224b) it.next()), interfaceC7227e, nVar);
            }
        } else {
            LinkedList linkedList = new LinkedList(collection);
            while (!linkedList.isEmpty()) {
                j(q(w.a(linkedList), linkedList, nVar), interfaceC7227e, nVar);
            }
        }
    }

    private u0 l(List list, List list2) {
        if (list == null) {
            a(40);
        }
        if (list2 == null) {
            a(41);
        }
        if (list.isEmpty()) {
            u0 u0VarF0 = new p(null, this.f33316c, this.f33314a, this.f33315b, this.f33317d).F0(true, true, false);
            if (u0VarF0 == null) {
                a(42);
            }
            return u0VarF0;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            map.put(((m0) list.get(i10)).l(), ((m0) list2.get(i10)).l());
        }
        u0 u0VarF02 = new p(map, this.f33316c, this.f33314a, this.f33315b, this.f33317d).F0(true, true, false);
        if (u0VarF02 == null) {
            a(43);
        }
        return u0VarF02;
    }

    public static o m(AbstractC6317g abstractC6317g) {
        if (abstractC6317g == null) {
            a(0);
        }
        return new o(f33313g, abstractC6317g, AbstractC6316f.a.f58774a, null);
    }

    private static E n(Collection collection, InterfaceC7227e interfaceC7227e) {
        if (collection == null) {
            a(86);
        }
        if (interfaceC7227e == null) {
            a(87);
        }
        Iterator it = collection.iterator();
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (it.hasNext()) {
            InterfaceC7224b interfaceC7224b = (InterfaceC7224b) it.next();
            int i10 = h.f33324c[interfaceC7224b.r().ordinal()];
            if (i10 == 1) {
                E e10 = E.f65060b;
                if (e10 == null) {
                    a(88);
                }
                return e10;
            }
            if (i10 == 2) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + interfaceC7224b);
            }
            if (i10 == 3) {
                z11 = true;
            } else if (i10 == 4) {
                z12 = true;
            }
        }
        if (interfaceC7227e.m0() && interfaceC7227e.r() != E.f65063e && interfaceC7227e.r() != E.f65061c) {
            z10 = true;
        }
        if (z11 && !z12) {
            E e11 = E.f65062d;
            if (e11 == null) {
                a(89);
            }
            return e11;
        }
        if (!z11 && z12) {
            E eR = z10 ? interfaceC7227e.r() : E.f65063e;
            if (eR == null) {
                a(90);
            }
            return eR;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            hashSet.addAll(z((InterfaceC7224b) it2.next()));
        }
        return y(r(hashSet), z10, interfaceC7227e.r());
    }

    private Collection o(InterfaceC7224b interfaceC7224b, Collection collection, InterfaceC7227e interfaceC7227e, n nVar) {
        if (interfaceC7224b == null) {
            a(57);
        }
        if (collection == null) {
            a(58);
        }
        if (interfaceC7227e == null) {
            a(59);
        }
        if (nVar == null) {
            a(60);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Af.k kVarD = Af.k.d();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC7224b interfaceC7224b2 = (InterfaceC7224b) it.next();
            i.a aVarC = D(interfaceC7224b2, interfaceC7224b, interfaceC7227e).c();
            boolean zI = I(interfaceC7224b, interfaceC7224b2, false);
            int i10 = h.f33323b[aVarC.ordinal()];
            if (i10 == 1) {
                if (zI) {
                    kVarD.add(interfaceC7224b2);
                }
                arrayList.add(interfaceC7224b2);
            } else if (i10 == 2) {
                if (zI) {
                    nVar.c(interfaceC7224b2, interfaceC7224b);
                }
                arrayList.add(interfaceC7224b2);
            }
        }
        nVar.d(interfaceC7224b, kVarD);
        return arrayList;
    }

    public static Collection p(Object obj, Collection collection, Function1 function1, Function1 function12) {
        if (obj == null) {
            a(97);
        }
        if (collection == null) {
            a(98);
        }
        if (function1 == null) {
            a(99);
        }
        if (function12 == null) {
            a(100);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        InterfaceC7223a interfaceC7223a = (InterfaceC7223a) function1.invoke(obj);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC7223a interfaceC7223a2 = (InterfaceC7223a) function1.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                i.a aVarX = x(interfaceC7223a, interfaceC7223a2);
                if (aVarX == i.a.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (aVarX == i.a.CONFLICT) {
                    function12.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    private static Collection q(InterfaceC7224b interfaceC7224b, Queue queue, n nVar) {
        if (interfaceC7224b == null) {
            a(102);
        }
        if (queue == null) {
            a(103);
        }
        if (nVar == null) {
            a(104);
        }
        return p(interfaceC7224b, queue, new f(), new g(nVar, interfaceC7224b));
    }

    public static Set r(Set set) {
        if (set == null) {
            a(8);
        }
        return s(set, !set.isEmpty() && ff.e.y(ff.e.s((InterfaceC7235m) set.iterator().next())), null, new b());
    }

    public static Set s(Set set, boolean z10, InterfaceC5082a interfaceC5082a, Function2 function2) {
        if (set == null) {
            a(9);
        }
        if (function2 == null) {
            a(10);
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (interfaceC5082a != null) {
                interfaceC5082a.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(obj);
                    break;
                }
                Pair pair = (Pair) function2.invoke(obj, it.next());
                InterfaceC7223a interfaceC7223a = (InterfaceC7223a) pair.getFirst();
                InterfaceC7223a interfaceC7223a2 = (InterfaceC7223a) pair.getSecond();
                if (!J(interfaceC7223a, interfaceC7223a2, z10, true)) {
                    if (J(interfaceC7223a2, interfaceC7223a, z10, true)) {
                        break;
                    }
                } else {
                    it.remove();
                }
            }
        }
        return linkedHashSet;
    }

    public static Collection t(InterfaceC7227e interfaceC7227e, Collection collection) {
        if (interfaceC7227e == null) {
            a(94);
        }
        if (collection == null) {
            a(95);
        }
        List listI0 = AbstractC2279u.i0(collection, new e(interfaceC7227e));
        if (listI0 == null) {
            a(96);
        }
        return listI0;
    }

    public static AbstractC7242u u(Collection collection) {
        AbstractC7242u abstractC7242u;
        if (collection == null) {
            a(107);
        }
        if (collection.isEmpty()) {
            return AbstractC7241t.f65131l;
        }
        Iterator it = collection.iterator();
        loop0: while (true) {
            abstractC7242u = null;
            while (it.hasNext()) {
                AbstractC7242u visibility = ((InterfaceC7224b) it.next()).getVisibility();
                if (abstractC7242u != null) {
                    Integer numD = AbstractC7241t.d(visibility, abstractC7242u);
                    if (numD == null) {
                        break;
                    }
                    if (numD.intValue() > 0) {
                    }
                }
                abstractC7242u = visibility;
            }
        }
        if (abstractC7242u == null) {
            return null;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            Integer numD2 = AbstractC7241t.d(abstractC7242u, ((InterfaceC7224b) it2.next()).getVisibility());
            if (numD2 == null || numD2.intValue() < 0) {
                return null;
            }
        }
        return abstractC7242u;
    }

    public static i w(InterfaceC7223a interfaceC7223a, InterfaceC7223a interfaceC7223a2) {
        boolean z10;
        if (interfaceC7223a == null) {
            a(38);
        }
        if (interfaceC7223a2 == null) {
            a(39);
        }
        boolean z11 = interfaceC7223a instanceof InterfaceC7247z;
        if ((z11 && !(interfaceC7223a2 instanceof InterfaceC7247z)) || (((z10 = interfaceC7223a instanceof Z)) && !(interfaceC7223a2 instanceof Z))) {
            return i.d("Member kind mismatch");
        }
        if (!z11 && !z10) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + interfaceC7223a);
        }
        if (!interfaceC7223a.getName().equals(interfaceC7223a2.getName())) {
            return i.d("Name mismatch");
        }
        i iVarE = e(interfaceC7223a, interfaceC7223a2);
        if (iVarE != null) {
            return iVarE;
        }
        return null;
    }

    public static i.a x(InterfaceC7223a interfaceC7223a, InterfaceC7223a interfaceC7223a2) {
        o oVar = f33312f;
        i.a aVarC = oVar.D(interfaceC7223a2, interfaceC7223a, null).c();
        i.a aVarC2 = oVar.D(interfaceC7223a, interfaceC7223a2, null).c();
        i.a aVar = i.a.OVERRIDABLE;
        if (aVarC == aVar && aVarC2 == aVar) {
            return aVar;
        }
        i.a aVar2 = i.a.CONFLICT;
        return (aVarC == aVar2 || aVarC2 == aVar2) ? aVar2 : i.a.INCOMPATIBLE;
    }

    private static E y(Collection collection, boolean z10, E e10) {
        if (collection == null) {
            a(91);
        }
        if (e10 == null) {
            a(92);
        }
        E e11 = E.f65063e;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC7224b interfaceC7224b = (InterfaceC7224b) it.next();
            E eR = (z10 && interfaceC7224b.r() == E.f65063e) ? e10 : interfaceC7224b.r();
            if (eR.compareTo(e11) < 0) {
                e11 = eR;
            }
        }
        if (e11 == null) {
            a(93);
        }
        return e11;
    }

    public static Set z(InterfaceC7224b interfaceC7224b) {
        if (interfaceC7224b == null) {
            a(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f(interfaceC7224b, linkedHashSet);
        return linkedHashSet;
    }

    public i D(InterfaceC7223a interfaceC7223a, InterfaceC7223a interfaceC7223a2, InterfaceC7227e interfaceC7227e) {
        if (interfaceC7223a == null) {
            a(19);
        }
        if (interfaceC7223a2 == null) {
            a(20);
        }
        i iVarE = E(interfaceC7223a, interfaceC7223a2, interfaceC7227e, false);
        if (iVarE == null) {
            a(21);
        }
        return iVarE;
    }

    public i E(InterfaceC7223a interfaceC7223a, InterfaceC7223a interfaceC7223a2, InterfaceC7227e interfaceC7227e, boolean z10) {
        if (interfaceC7223a == null) {
            a(22);
        }
        if (interfaceC7223a2 == null) {
            a(23);
        }
        i iVarF = F(interfaceC7223a, interfaceC7223a2, z10);
        boolean z11 = iVarF.c() == i.a.OVERRIDABLE;
        for (j jVar : f33311e) {
            if (jVar.b() != j.a.CONFLICTS_ONLY && (!z11 || jVar.b() != j.a.SUCCESS_ONLY)) {
                int i10 = h.f33322a[jVar.a(interfaceC7223a, interfaceC7223a2, interfaceC7227e).ordinal()];
                if (i10 == 1) {
                    z11 = true;
                } else if (i10 == 2) {
                    i iVarD = i.d("External condition");
                    if (iVarD == null) {
                        a(24);
                    }
                    return iVarD;
                }
            }
        }
        if (!z11) {
            return iVarF;
        }
        for (j jVar2 : f33311e) {
            if (jVar2.b() == j.a.CONFLICTS_ONLY) {
                int i11 = h.f33322a[jVar2.a(interfaceC7223a, interfaceC7223a2, interfaceC7227e).ordinal()];
                if (i11 == 1) {
                    throw new IllegalStateException("Contract violation in " + jVar2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (i11 == 2) {
                    i iVarD2 = i.d("External condition");
                    if (iVarD2 == null) {
                        a(26);
                    }
                    return iVarD2;
                }
            }
        }
        i iVarE = i.e();
        if (iVarE == null) {
            a(27);
        }
        return iVarE;
    }

    public i F(InterfaceC7223a interfaceC7223a, InterfaceC7223a interfaceC7223a2, boolean z10) {
        if (interfaceC7223a == null) {
            a(28);
        }
        if (interfaceC7223a2 == null) {
            a(29);
        }
        i iVarW = w(interfaceC7223a, interfaceC7223a2);
        if (iVarW != null) {
            return iVarW;
        }
        List listG = g(interfaceC7223a);
        List listG2 = g(interfaceC7223a2);
        List typeParameters = interfaceC7223a.getTypeParameters();
        List typeParameters2 = interfaceC7223a2.getTypeParameters();
        int i10 = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i10 < listG.size()) {
                if (!InterfaceC6315e.f58773a.c((S) listG.get(i10), (S) listG2.get(i10))) {
                    i iVarD = i.d("Type parameter number mismatch");
                    if (iVarD == null) {
                        a(31);
                    }
                    return iVarD;
                }
                i10++;
            }
            i iVarB = i.b("Type parameter number mismatch");
            if (iVarB == null) {
                a(32);
            }
            return iVarB;
        }
        u0 u0VarL = l(typeParameters, typeParameters2);
        for (int i11 = 0; i11 < typeParameters.size(); i11++) {
            if (!c((m0) typeParameters.get(i11), (m0) typeParameters2.get(i11), u0VarL)) {
                i iVarD2 = i.d("Type parameter bounds mismatch");
                if (iVarD2 == null) {
                    a(33);
                }
                return iVarD2;
            }
        }
        while (i10 < listG.size()) {
            if (!d((S) listG.get(i10), (S) listG2.get(i10), u0VarL)) {
                i iVarD3 = i.d("Value parameter type mismatch");
                if (iVarD3 == null) {
                    a(34);
                }
                return iVarD3;
            }
            i10++;
        }
        if ((interfaceC7223a instanceof InterfaceC7247z) && (interfaceC7223a2 instanceof InterfaceC7247z) && ((InterfaceC7247z) interfaceC7223a).isSuspend() != ((InterfaceC7247z) interfaceC7223a2).isSuspend()) {
            i iVarB2 = i.b("Incompatible suspendability");
            if (iVarB2 == null) {
                a(35);
            }
            return iVarB2;
        }
        if (z10) {
            S returnType = interfaceC7223a.getReturnType();
            S returnType2 = interfaceC7223a2.getReturnType();
            if (returnType != null && returnType2 != null && ((!W.a(returnType2) || !W.a(returnType)) && !C6188g.f58052a.t(u0VarL, returnType2.Q0(), returnType.Q0()))) {
                i iVarB3 = i.b("Return type mismatch");
                if (iVarB3 == null) {
                    a(36);
                }
                return iVarB3;
            }
        }
        i iVarE = i.e();
        if (iVarE == null) {
            a(37);
        }
        return iVarE;
    }

    public void v(Xe.f fVar, Collection collection, Collection collection2, InterfaceC7227e interfaceC7227e, n nVar) {
        if (fVar == null) {
            a(50);
        }
        if (collection == null) {
            a(51);
        }
        if (collection2 == null) {
            a(52);
        }
        if (interfaceC7227e == null) {
            a(53);
        }
        if (nVar == null) {
            a(54);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            linkedHashSet.removeAll(o((InterfaceC7224b) it.next(), collection, interfaceC7227e, nVar));
        }
        k(interfaceC7227e, linkedHashSet, nVar);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class d implements Function1 {
        d() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public InterfaceC7224b invoke(InterfaceC7224b interfaceC7224b) {
            return interfaceC7224b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class f implements Function1 {
        f() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public InterfaceC7223a invoke(InterfaceC7224b interfaceC7224b) {
            return interfaceC7224b;
        }
    }
}
