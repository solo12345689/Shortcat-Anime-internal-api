package xe;

import Af.b;
import Af.k;
import Be.C1116k;
import Le.C1882n;
import Le.C1893z;
import Qe.B;
import Qe.C;
import Td.z;
import Ud.AbstractC2279u;
import Ud.a0;
import be.AbstractC3048a;
import bf.o;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jf.InterfaceC5387k;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.O;
import mf.L;
import of.C5890m;
import pe.InterfaceC6023m;
import pf.AbstractC6048m;
import pf.InterfaceC6036a;
import pf.InterfaceC6042g;
import pf.InterfaceC6044i;
import qf.AbstractC6183d0;
import qf.G0;
import qf.S;
import qf.Y;
import xe.C7147k;
import ye.AbstractC7240s;
import ye.AbstractC7241t;
import ye.AbstractC7246y;
import ye.E;
import ye.EnumC7228f;
import ye.H;
import ye.InterfaceC7224b;
import ye.InterfaceC7226d;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7234l;
import ye.InterfaceC7235m;
import ye.InterfaceC7247z;
import ye.M;
import ye.g0;
import ye.h0;
import ye.t0;
import ze.AbstractC7373g;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class u implements Ae.a, Ae.c {

    /* JADX INFO: renamed from: i */
    static final /* synthetic */ InterfaceC6023m[] f64435i = {O.k(new F(u.class, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0)), O.k(new F(u.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)), O.k(new F(u.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0))};

    /* JADX INFO: renamed from: a */
    private final H f64436a;

    /* JADX INFO: renamed from: b */
    private final C7140d f64437b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC6044i f64438c;

    /* JADX INFO: renamed from: d */
    private final S f64439d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC6044i f64440e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC6036a f64441f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC6044i f64442g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC6042g f64443h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a extends Enum {

        /* JADX INFO: renamed from: a */
        public static final a f64444a = new a("HIDDEN", 0);

        /* JADX INFO: renamed from: b */
        public static final a f64445b = new a("VISIBLE", 1);

        /* JADX INFO: renamed from: c */
        public static final a f64446c = new a("DEPRECATED_LIST_METHODS", 2);

        /* JADX INFO: renamed from: d */
        public static final a f64447d = new a("NOT_CONSIDERED", 3);

        /* JADX INFO: renamed from: e */
        public static final a f64448e = new a("DROP", 4);

        /* JADX INFO: renamed from: f */
        private static final /* synthetic */ a[] f64449f;

        /* JADX INFO: renamed from: g */
        private static final /* synthetic */ EnumEntries f64450g;

        static {
            a[] aVarArrA = a();
            f64449f = aVarArrA;
            f64450g = AbstractC3048a.a(aVarArrA);
        }

        private a(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f64444a, f64445b, f64446c, f64447d, f64448e};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f64449f.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64451a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f64444a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f64446c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f64447d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.f64448e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.f64445b.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f64451a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends Be.H {
        c(H h10, Xe.c cVar) {
            super(h10, cVar);
        }

        @Override // ye.N
        /* JADX INFO: renamed from: H0 */
        public InterfaceC5387k.b o() {
            return InterfaceC5387k.b.f51800b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends b.AbstractC0011b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f64452a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ N f64453b;

        d(String str, N n10) {
            this.f64452a = str;
            this.f64453b = n10;
        }

        @Override // Af.b.d
        /* JADX INFO: renamed from: d */
        public boolean c(InterfaceC7227e javaClassDescriptor) {
            AbstractC5504s.h(javaClassDescriptor, "javaClassDescriptor");
            String strA = B.a(Qe.F.f14805a, javaClassDescriptor, this.f64452a);
            x xVar = x.f64457a;
            if (xVar.f().contains(strA)) {
                this.f64453b.f52259a = a.f64444a;
            } else if (xVar.i().contains(strA)) {
                this.f64453b.f52259a = a.f64445b;
            } else if (xVar.c().contains(strA)) {
                this.f64453b.f52259a = a.f64446c;
            } else if (xVar.d().contains(strA)) {
                this.f64453b.f52259a = a.f64448e;
            }
            return this.f64453b.f52259a == null;
        }

        @Override // Af.b.d
        /* JADX INFO: renamed from: e */
        public a a() {
            a aVar = (a) this.f64453b.f52259a;
            return aVar == null ? a.f64447d : aVar;
        }
    }

    public u(H moduleDescriptor, pf.n storageManager, InterfaceC5082a settingsComputation) {
        AbstractC5504s.h(moduleDescriptor, "moduleDescriptor");
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(settingsComputation, "settingsComputation");
        this.f64436a = moduleDescriptor;
        this.f64437b = C7140d.f64395a;
        this.f64438c = storageManager.c(settingsComputation);
        this.f64439d = q(storageManager);
        this.f64440e = storageManager.c(new l(this, storageManager));
        this.f64441f = storageManager.a();
        this.f64442g = storageManager.c(new m(this));
        this.f64443h = storageManager.h(new n(this));
    }

    private final a A(InterfaceC7247z interfaceC7247z) {
        InterfaceC7235m interfaceC7235mB = interfaceC7247z.b();
        AbstractC5504s.f(interfaceC7235mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Object objB = Af.b.b(AbstractC2279u.e((InterfaceC7227e) interfaceC7235mB), new t(this), new d(C.c(interfaceC7247z, false, false, 3, null), new N()));
        AbstractC5504s.g(objB, "dfs(...)");
        return (a) objB;
    }

    public static final Iterable B(u uVar, InterfaceC7227e interfaceC7227e) {
        Collection collectionK = interfaceC7227e.l().k();
        AbstractC5504s.g(collectionK, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionK.iterator();
        while (it.hasNext()) {
            InterfaceC7230h interfaceC7230hP = ((S) it.next()).N0().p();
            InterfaceC7227e interfaceC7227eZ = null;
            InterfaceC7230h interfaceC7230hA = interfaceC7230hP != null ? interfaceC7230hP.a() : null;
            InterfaceC7227e interfaceC7227e2 = interfaceC7230hA instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7230hA : null;
            if (interfaceC7227e2 != null && (interfaceC7227eZ = uVar.z(interfaceC7227e2)) == null) {
                interfaceC7227eZ = interfaceC7227e2;
            }
            if (interfaceC7227eZ != null) {
                arrayList.add(interfaceC7227eZ);
            }
        }
        return arrayList;
    }

    private final InterfaceC7374h C() {
        return (InterfaceC7374h) AbstractC6048m.a(this.f64442g, this, f64435i[2]);
    }

    private final C7147k.b D() {
        return (C7147k.b) AbstractC6048m.a(this.f64438c, this, f64435i[0]);
    }

    private final boolean E(g0 g0Var, boolean z10) {
        InterfaceC7235m interfaceC7235mB = g0Var.b();
        AbstractC5504s.f(interfaceC7235mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        String strC = C.c(g0Var, false, false, 3, null);
        if (z10 ^ x.f64457a.g().contains(B.a(Qe.F.f14805a, (InterfaceC7227e) interfaceC7235mB, strC))) {
            return true;
        }
        Boolean boolE = Af.b.e(AbstractC2279u.e(g0Var), r.f64432a, new s(this));
        AbstractC5504s.g(boolE, "ifAny(...)");
        return boolE.booleanValue();
    }

    public static final Iterable F(InterfaceC7224b interfaceC7224b) {
        return interfaceC7224b.a().e();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Boolean G(xe.u r2, ye.InterfaceC7224b r3) {
        /*
            ye.b$a r0 = r3.h()
            ye.b$a r1 = ye.InterfaceC7224b.a.DECLARATION
            if (r0 != r1) goto L1d
            xe.d r2 = r2.f64437b
            ye.m r3 = r3.b()
            java.lang.String r0 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.AbstractC5504s.f(r3, r0)
            ye.e r3 = (ye.InterfaceC7227e) r3
            boolean r2 = r2.c(r3)
            if (r2 == 0) goto L1d
            r2 = 1
            goto L1e
        L1d:
            r2 = 0
        L1e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: xe.u.G(xe.u, ye.b):java.lang.Boolean");
    }

    private final boolean H(InterfaceC7234l interfaceC7234l, InterfaceC7227e interfaceC7227e) {
        if (interfaceC7234l.j().size() != 1) {
            return false;
        }
        List listJ = interfaceC7234l.j();
        AbstractC5504s.g(listJ, "getValueParameters(...)");
        InterfaceC7230h interfaceC7230hP = ((t0) AbstractC2279u.M0(listJ)).getType().N0().p();
        return AbstractC5504s.c(interfaceC7230hP != null ? ff.e.p(interfaceC7230hP) : null, ff.e.p(interfaceC7227e));
    }

    public static final InterfaceC7374h I(u uVar) {
        return InterfaceC7374h.f66223k0.a(AbstractC2279u.e(AbstractC7373g.c(uVar.f64436a.n(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, true, 6, null)));
    }

    public static final AbstractC6183d0 o(u uVar, pf.n nVar) {
        return AbstractC7246y.d(uVar.D().a(), C7143g.f64399d.a(), new M(nVar, uVar.D().a())).p();
    }

    private final g0 p(C5890m c5890m, g0 g0Var) {
        InterfaceC7247z.a aVarV = g0Var.v();
        aVarV.n(c5890m);
        aVarV.h(AbstractC7241t.f65124e);
        aVarV.o(c5890m.p());
        aVarV.c(c5890m.J0());
        InterfaceC7247z interfaceC7247zBuild = aVarV.build();
        AbstractC5504s.e(interfaceC7247zBuild);
        return (g0) interfaceC7247zBuild;
    }

    private final S q(pf.n nVar) {
        C1116k c1116k = new C1116k(new c(this.f64436a, new Xe.c("java.io")), Xe.f.m("Serializable"), E.f65063e, EnumC7228f.f65098c, AbstractC2279u.e(new Y(nVar, new o(this))), h0.f65112a, false, nVar);
        c1116k.K0(InterfaceC5387k.b.f51800b, a0.d(), null);
        AbstractC6183d0 abstractC6183d0P = c1116k.p();
        AbstractC5504s.g(abstractC6183d0P, "getDefaultType(...)");
        return abstractC6183d0P;
    }

    public static final S r(u uVar) {
        AbstractC6183d0 abstractC6183d0I = uVar.f64436a.n().i();
        AbstractC5504s.g(abstractC6183d0I, "getAnyType(...)");
        return abstractC6183d0I;
    }

    public static final InterfaceC7374h s(u uVar, Pair pair) {
        AbstractC5504s.h(pair, "<destruct>");
        String str = (String) pair.getFirst();
        String str2 = (String) pair.getSecond();
        return InterfaceC7374h.f66223k0.a(AbstractC2279u.e(AbstractC7373g.b(uVar.f64436a.n(), '\'' + str + "()' member of List is redundant in Kotlin and might be removed soon. Please use '" + str2 + "()' stdlib extension instead", str2 + "()", "HIDDEN", false)));
    }

    private final Collection t(InterfaceC7227e interfaceC7227e, Function1 function1) {
        C1882n c1882nZ = z(interfaceC7227e);
        if (c1882nZ == null) {
            return AbstractC2279u.m();
        }
        Collection collectionG = this.f64437b.g(ff.e.o(c1882nZ), C7138b.f64373h.a());
        InterfaceC7227e interfaceC7227e2 = (InterfaceC7227e) AbstractC2279u.z0(collectionG);
        if (interfaceC7227e2 == null) {
            return AbstractC2279u.m();
        }
        k.b bVar = Af.k.f430c;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(collectionG, 10));
        Iterator it = collectionG.iterator();
        while (it.hasNext()) {
            arrayList.add(ff.e.o((InterfaceC7227e) it.next()));
        }
        Af.k kVarB = bVar.b(arrayList);
        boolean zC = this.f64437b.c(interfaceC7227e);
        InterfaceC5387k interfaceC5387kX = ((InterfaceC7227e) this.f64441f.a(ff.e.o(c1882nZ), new q(c1882nZ, interfaceC7227e2))).X();
        AbstractC5504s.g(interfaceC5387kX, "getUnsubstitutedMemberScope(...)");
        Iterable iterable = (Iterable) function1.invoke(interfaceC5387kX);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable) {
            g0 g0Var = (g0) obj;
            if (g0Var.h() == InterfaceC7224b.a.DECLARATION && g0Var.getVisibility().d() && !ve.i.l0(g0Var)) {
                Collection collectionE = g0Var.e();
                AbstractC5504s.g(collectionE, "getOverriddenDescriptors(...)");
                Collection collection = collectionE;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        InterfaceC7235m interfaceC7235mB = ((InterfaceC7247z) it2.next()).b();
                        AbstractC5504s.g(interfaceC7235mB, "getContainingDeclaration(...)");
                        if (kVarB.contains(ff.e.o(interfaceC7235mB))) {
                            break;
                        }
                    }
                }
                if (!E(g0Var, zC)) {
                    arrayList2.add(obj);
                }
            }
        }
        return arrayList2;
    }

    public static final InterfaceC7227e u(C1882n c1882n, InterfaceC7227e interfaceC7227e) {
        Ie.j EMPTY = Ie.j.f9100a;
        AbstractC5504s.g(EMPTY, "EMPTY");
        return c1882n.P0(EMPTY, interfaceC7227e);
    }

    private final AbstractC6183d0 v() {
        return (AbstractC6183d0) AbstractC6048m.a(this.f64440e, this, f64435i[1]);
    }

    private static final boolean w(InterfaceC7234l interfaceC7234l, G0 g02, InterfaceC7234l interfaceC7234l2) {
        return bf.o.x(interfaceC7234l, interfaceC7234l2.c(g02)) == o.i.a.OVERRIDABLE;
    }

    public static final Collection x(Xe.f fVar, InterfaceC5387k it) {
        AbstractC5504s.h(it, "it");
        return it.c(fVar, Ge.d.f7458d);
    }

    private final C1882n z(InterfaceC7227e interfaceC7227e) {
        Xe.b bVarN;
        Xe.c cVarA;
        if (ve.i.b0(interfaceC7227e) || !ve.i.C0(interfaceC7227e)) {
            return null;
        }
        Xe.d dVarP = ff.e.p(interfaceC7227e);
        if (dVarP.f() && (bVarN = C7139c.f64375a.n(dVarP)) != null && (cVarA = bVarN.a()) != null) {
            InterfaceC7227e interfaceC7227eD = AbstractC7240s.d(D().a(), cVarA, Ge.d.f7458d);
            if (interfaceC7227eD instanceof C1882n) {
                return (C1882n) interfaceC7227eD;
            }
        }
        return null;
    }

    @Override // Ae.a
    public Collection a(InterfaceC7227e classDescriptor) {
        AbstractC5504s.h(classDescriptor, "classDescriptor");
        Xe.d dVarP = ff.e.p(classDescriptor);
        x xVar = x.f64457a;
        return xVar.j(dVarP) ? AbstractC2279u.p(v(), this.f64439d) : xVar.k(dVarP) ? AbstractC2279u.e(this.f64439d) : AbstractC2279u.m();
    }

    @Override // Ae.c
    public boolean b(InterfaceC7227e classDescriptor, g0 functionDescriptor) {
        AbstractC5504s.h(classDescriptor, "classDescriptor");
        AbstractC5504s.h(functionDescriptor, "functionDescriptor");
        C1882n c1882nZ = z(classDescriptor);
        if (c1882nZ == null || !functionDescriptor.getAnnotations().k0(Ae.d.a())) {
            return true;
        }
        if (!D().b()) {
            return false;
        }
        String strC = C.c(functionDescriptor, false, false, 3, null);
        C1893z c1893zX = c1882nZ.X();
        Xe.f name = functionDescriptor.getName();
        AbstractC5504s.g(name, "getName(...)");
        Collection collectionC = c1893zX.c(name, Ge.d.f7458d);
        if ((collectionC instanceof Collection) && collectionC.isEmpty()) {
            return false;
        }
        Iterator it = collectionC.iterator();
        while (it.hasNext()) {
            if (AbstractC5504s.c(C.c((g0) it.next(), false, false, 3, null), strC)) {
                return true;
            }
        }
        return false;
    }

    @Override // Ae.a
    public Collection c(Xe.f name, InterfaceC7227e classDescriptor) {
        InterfaceC7374h interfaceC7374h;
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(classDescriptor, "classDescriptor");
        if (AbstractC5504s.c(name, C7137a.f64371e.a()) && (classDescriptor instanceof C5890m) && ve.i.f0(classDescriptor)) {
            C5890m c5890m = (C5890m) classDescriptor;
            List listM0 = c5890m.e1().M0();
            AbstractC5504s.g(listM0, "getFunctionList(...)");
            if (listM0 == null || !listM0.isEmpty()) {
                Iterator it = listM0.iterator();
                while (it.hasNext()) {
                    if (AbstractC5504s.c(L.b(c5890m.d1().g(), ((Se.j) it.next()).i0()), C7137a.f64371e.a())) {
                        return AbstractC2279u.m();
                    }
                }
            }
            return AbstractC2279u.e(p(c5890m, (g0) AbstractC2279u.L0(v().o().c(name, Ge.d.f7458d))));
        }
        if (!D().b()) {
            return AbstractC2279u.m();
        }
        Collection<g0> collectionT = t(classDescriptor, new p(name));
        ArrayList arrayList = new ArrayList();
        for (g0 g0Var : collectionT) {
            InterfaceC7235m interfaceC7235mB = g0Var.b();
            AbstractC5504s.f(interfaceC7235mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            InterfaceC7247z interfaceC7247zC = g0Var.c(y.a((InterfaceC7227e) interfaceC7235mB, classDescriptor).c());
            AbstractC5504s.f(interfaceC7247zC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            InterfaceC7247z.a aVarV = ((g0) interfaceC7247zC).v();
            aVarV.n(classDescriptor);
            aVarV.c(classDescriptor.J0());
            aVarV.l();
            int i10 = b.f64451a[A(g0Var).ordinal()];
            g0 g0Var2 = null;
            if (i10 != 1) {
                if (i10 == 2) {
                    Xe.f name2 = g0Var.getName();
                    if (AbstractC5504s.c(name2, v.f64454a)) {
                        interfaceC7374h = (InterfaceC7374h) this.f64443h.invoke(z.a(g0Var.getName().b(), "first"));
                    } else {
                        if (!AbstractC5504s.c(name2, v.f64455b)) {
                            throw new IllegalStateException(("Unexpected name: " + g0Var.getName()).toString());
                        }
                        interfaceC7374h = (InterfaceC7374h) this.f64443h.invoke(z.a(g0Var.getName().b(), "last"));
                    }
                    aVarV.s(interfaceC7374h);
                } else if (i10 == 3) {
                    aVarV.s(C());
                } else if (i10 != 4) {
                    if (i10 != 5) {
                        throw new Td.r();
                    }
                    Td.L l10 = Td.L.f17438a;
                }
                InterfaceC7247z interfaceC7247zBuild = aVarV.build();
                AbstractC5504s.e(interfaceC7247zBuild);
                g0Var2 = (g0) interfaceC7247zBuild;
            } else if (!ye.F.a(classDescriptor)) {
                aVarV.f();
                InterfaceC7247z interfaceC7247zBuild2 = aVarV.build();
                AbstractC5504s.e(interfaceC7247zBuild2);
                g0Var2 = (g0) interfaceC7247zBuild2;
            }
            if (g0Var2 != null) {
                arrayList.add(g0Var2);
            }
        }
        return arrayList;
    }

    @Override // Ae.a
    public Collection d(InterfaceC7227e classDescriptor) {
        AbstractC5504s.h(classDescriptor, "classDescriptor");
        if (classDescriptor.h() != EnumC7228f.f65097b || !D().b()) {
            return AbstractC2279u.m();
        }
        C1882n c1882nZ = z(classDescriptor);
        if (c1882nZ == null) {
            return AbstractC2279u.m();
        }
        InterfaceC7227e interfaceC7227eF = C7140d.f(this.f64437b, ff.e.o(c1882nZ), C7138b.f64373h.a(), null, 4, null);
        if (interfaceC7227eF == null) {
            return AbstractC2279u.m();
        }
        G0 g0C = y.a(interfaceC7227eF, c1882nZ).c();
        List listI = c1882nZ.i();
        ArrayList<InterfaceC7226d> arrayList = new ArrayList();
        for (Object obj : listI) {
            InterfaceC7226d interfaceC7226d = (InterfaceC7226d) obj;
            if (interfaceC7226d.getVisibility().d()) {
                Collection collectionI = interfaceC7227eF.i();
                AbstractC5504s.g(collectionI, "getConstructors(...)");
                Collection<InterfaceC7226d> collection = collectionI;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    for (InterfaceC7226d interfaceC7226d2 : collection) {
                        AbstractC5504s.e(interfaceC7226d2);
                        if (w(interfaceC7226d2, g0C, interfaceC7226d)) {
                            break;
                        }
                    }
                }
                if (!H(interfaceC7226d, classDescriptor) && !ve.i.l0(interfaceC7226d) && !x.f64457a.e().contains(B.a(Qe.F.f14805a, c1882nZ, C.c(interfaceC7226d, false, false, 3, null)))) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(arrayList, 10));
        for (InterfaceC7226d interfaceC7226d3 : arrayList) {
            InterfaceC7247z.a aVarV = interfaceC7226d3.v();
            aVarV.n(classDescriptor);
            aVarV.o(classDescriptor.p());
            aVarV.l();
            aVarV.p(g0C.j());
            if (!x.f64457a.h().contains(B.a(Qe.F.f14805a, c1882nZ, C.c(interfaceC7226d3, false, false, 3, null)))) {
                aVarV.s(C());
            }
            InterfaceC7247z interfaceC7247zBuild = aVarV.build();
            AbstractC5504s.f(interfaceC7247zBuild, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            arrayList2.add((InterfaceC7226d) interfaceC7247zBuild);
        }
        return arrayList2;
    }

    @Override // Ae.a
    /* JADX INFO: renamed from: y */
    public Set e(InterfaceC7227e classDescriptor) {
        C1893z c1893zX;
        Set setB;
        AbstractC5504s.h(classDescriptor, "classDescriptor");
        if (!D().b()) {
            return a0.d();
        }
        C1882n c1882nZ = z(classDescriptor);
        return (c1882nZ == null || (c1893zX = c1882nZ.X()) == null || (setB = c1893zX.b()) == null) ? a0.d() : setB;
    }
}
