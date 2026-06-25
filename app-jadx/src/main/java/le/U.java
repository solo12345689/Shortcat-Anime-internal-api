package Le;

import Ud.AbstractC2279u;
import df.AbstractC4598g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jf.AbstractC5379c;
import jf.AbstractC5388l;
import jf.C5380d;
import jf.InterfaceC5387k;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pe.InterfaceC6023m;
import pf.AbstractC6048m;
import pf.InterfaceC6042g;
import pf.InterfaceC6043h;
import pf.InterfaceC6044i;
import pf.InterfaceC6045j;
import qf.I0;
import qf.J0;
import ye.InterfaceC7223a;
import ye.InterfaceC7227e;
import ye.InterfaceC7235m;
import ye.InterfaceC7247z;
import ye.g0;
import ye.m0;
import ye.u0;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class U extends AbstractC5388l {

    /* JADX INFO: renamed from: m */
    static final /* synthetic */ InterfaceC6023m[] f11441m = {kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(U.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(U.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(U.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0))};

    /* JADX INFO: renamed from: b */
    private final Ke.k f11442b;

    /* JADX INFO: renamed from: c */
    private final U f11443c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC6044i f11444d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC6044i f11445e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC6042g f11446f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC6043h f11447g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC6042g f11448h;

    /* JADX INFO: renamed from: i */
    private final InterfaceC6044i f11449i;

    /* JADX INFO: renamed from: j */
    private final InterfaceC6044i f11450j;

    /* JADX INFO: renamed from: k */
    private final InterfaceC6044i f11451k;

    /* JADX INFO: renamed from: l */
    private final InterfaceC6042g f11452l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    protected static final class a {

        /* JADX INFO: renamed from: a */
        private final qf.S f11453a;

        /* JADX INFO: renamed from: b */
        private final qf.S f11454b;

        /* JADX INFO: renamed from: c */
        private final List f11455c;

        /* JADX INFO: renamed from: d */
        private final List f11456d;

        /* JADX INFO: renamed from: e */
        private final boolean f11457e;

        /* JADX INFO: renamed from: f */
        private final List f11458f;

        public a(qf.S returnType, qf.S s10, List valueParameters, List typeParameters, boolean z10, List errors) {
            AbstractC5504s.h(returnType, "returnType");
            AbstractC5504s.h(valueParameters, "valueParameters");
            AbstractC5504s.h(typeParameters, "typeParameters");
            AbstractC5504s.h(errors, "errors");
            this.f11453a = returnType;
            this.f11454b = s10;
            this.f11455c = valueParameters;
            this.f11456d = typeParameters;
            this.f11457e = z10;
            this.f11458f = errors;
        }

        public final List a() {
            return this.f11458f;
        }

        public final boolean b() {
            return this.f11457e;
        }

        public final qf.S c() {
            return this.f11454b;
        }

        public final qf.S d() {
            return this.f11453a;
        }

        public final List e() {
            return this.f11456d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC5504s.c(this.f11453a, aVar.f11453a) && AbstractC5504s.c(this.f11454b, aVar.f11454b) && AbstractC5504s.c(this.f11455c, aVar.f11455c) && AbstractC5504s.c(this.f11456d, aVar.f11456d) && this.f11457e == aVar.f11457e && AbstractC5504s.c(this.f11458f, aVar.f11458f);
        }

        public final List f() {
            return this.f11455c;
        }

        public int hashCode() {
            int iHashCode = this.f11453a.hashCode() * 31;
            qf.S s10 = this.f11454b;
            return ((((((((iHashCode + (s10 == null ? 0 : s10.hashCode())) * 31) + this.f11455c.hashCode()) * 31) + this.f11456d.hashCode()) * 31) + Boolean.hashCode(this.f11457e)) * 31) + this.f11458f.hashCode();
        }

        public String toString() {
            return "MethodSignatureData(returnType=" + this.f11453a + ", receiverType=" + this.f11454b + ", valueParameters=" + this.f11455c + ", typeParameters=" + this.f11456d + ", hasStableParameterNames=" + this.f11457e + ", errors=" + this.f11458f + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    protected static final class b {

        /* JADX INFO: renamed from: a */
        private final List f11459a;

        /* JADX INFO: renamed from: b */
        private final boolean f11460b;

        public b(List descriptors, boolean z10) {
            AbstractC5504s.h(descriptors, "descriptors");
            this.f11459a = descriptors;
            this.f11460b = z10;
        }

        public final List a() {
            return this.f11459a;
        }

        public final boolean b() {
            return this.f11460b;
        }
    }

    public /* synthetic */ U(Ke.k kVar, U u10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, (i10 & 2) != 0 ? null : u10);
    }

    private final Be.K E(Oe.n nVar) {
        Je.f fVarF1 = Je.f.f1(R(), Ke.h.a(this.f11442b, nVar), ye.E.f65060b, He.V.d(nVar.getVisibility()), !nVar.isFinal(), nVar.getName(), this.f11442b.a().t().a(nVar), U(nVar));
        AbstractC5504s.g(fVarF1, "create(...)");
        return fVarF1;
    }

    public static final ye.Z F(U u10, Xe.f name) {
        AbstractC5504s.h(name, "name");
        U u11 = u10.f11443c;
        if (u11 != null) {
            return (ye.Z) u11.f11447g.invoke(name);
        }
        Oe.n nVarF = ((InterfaceC1871c) u10.f11445e.invoke()).f(name);
        if (nVarF == null || nVarF.I()) {
            return null;
        }
        return u10.a0(nVarF);
    }

    public static final Collection G(U u10, Xe.f name) {
        AbstractC5504s.h(name, "name");
        U u11 = u10.f11443c;
        if (u11 != null) {
            return (Collection) u11.f11446f.invoke(name);
        }
        ArrayList arrayList = new ArrayList();
        for (Oe.r rVar : ((InterfaceC1871c) u10.f11445e.invoke()).c(name)) {
            Je.e eVarZ = u10.Z(rVar);
            if (u10.V(eVarZ)) {
                u10.f11442b.a().h().a(rVar, eVarZ);
                arrayList.add(eVarZ);
            }
        }
        u10.y(arrayList, name);
        return arrayList;
    }

    public static final InterfaceC1871c H(U u10) {
        return u10.z();
    }

    public static final Set I(U u10) {
        return u10.x(C5380d.f51778v, null);
    }

    public static final Collection J(U u10, Xe.f name) {
        AbstractC5504s.h(name, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) u10.f11446f.invoke(name));
        u10.e0(linkedHashSet);
        u10.B(linkedHashSet, name);
        return AbstractC2279u.b1(u10.f11442b.a().r().p(u10.f11442b, linkedHashSet));
    }

    private final Set M() {
        return (Set) AbstractC6048m.a(this.f11451k, this, f11441m[2]);
    }

    private final Set P() {
        return (Set) AbstractC6048m.a(this.f11449i, this, f11441m[0]);
    }

    private final Set S() {
        return (Set) AbstractC6048m.a(this.f11450j, this, f11441m[1]);
    }

    private final qf.S T(Oe.n nVar) {
        qf.S sP = this.f11442b.g().p(nVar.getType(), Me.b.b(I0.f57982b, false, false, null, 7, null));
        if ((!ve.i.t0(sP) && !ve.i.w0(sP)) || !U(nVar) || !nVar.N()) {
            return sP;
        }
        qf.S sN = J0.n(sP);
        AbstractC5504s.g(sN, "makeNotNullable(...)");
        return sN;
    }

    private final boolean U(Oe.n nVar) {
        return nVar.isFinal() && nVar.P();
    }

    public static final List W(U u10, Xe.f name) {
        AbstractC5504s.h(name, "name");
        ArrayList arrayList = new ArrayList();
        Af.a.a(arrayList, u10.f11447g.invoke(name));
        u10.C(name, arrayList);
        return bf.i.t(u10.R()) ? AbstractC2279u.b1(arrayList) : AbstractC2279u.b1(u10.f11442b.a().r().p(u10.f11442b, arrayList));
    }

    public static final Set X(U u10) {
        return u10.D(C5380d.f51779w, null);
    }

    private final ye.Z a0(Oe.n nVar) {
        kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
        Be.K kE = E(nVar);
        n10.f52259a = kE;
        kE.V0(null, null, null, null);
        ((Be.K) n10.f52259a).b1(T(nVar), AbstractC2279u.m(), O(), null, AbstractC2279u.m());
        InterfaceC7235m interfaceC7235mR = R();
        InterfaceC7227e interfaceC7227e = interfaceC7235mR instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7235mR : null;
        if (interfaceC7227e != null) {
            n10.f52259a = this.f11442b.a().w().e(interfaceC7227e, (Be.K) n10.f52259a, this.f11442b);
        }
        Object obj = n10.f52259a;
        if (bf.i.K((u0) obj, ((Be.K) obj).getType())) {
            ((Be.K) n10.f52259a).L0(new I(this, nVar, n10));
        }
        this.f11442b.a().h().e(nVar, (ye.Z) n10.f52259a);
        return (ye.Z) n10.f52259a;
    }

    public static final InterfaceC6045j b0(U u10, Oe.n nVar, kotlin.jvm.internal.N n10) {
        return u10.f11442b.e().g(new J(u10, nVar, n10));
    }

    public static final AbstractC4598g c0(U u10, Oe.n nVar, kotlin.jvm.internal.N n10) {
        return u10.f11442b.a().g().a(nVar, (ye.Z) n10.f52259a);
    }

    private final void e0(Set set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String strC = Qe.C.c((g0) obj, false, false, 2, null);
            Object arrayList = linkedHashMap.get(strC);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strC, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                Collection collectionB = bf.r.b(list, T.f11440a);
                set.removeAll(list);
                set.addAll(collectionB);
            }
        }
    }

    public static final InterfaceC7223a f0(g0 selectMostSpecificInEachOverridableGroup) {
        AbstractC5504s.h(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    public static final Collection t(U u10) {
        return u10.w(C5380d.f51771o, InterfaceC5387k.f51797a.c());
    }

    public static final Set u(U u10) {
        return u10.v(C5380d.f51776t, null);
    }

    protected final qf.S A(Oe.r method, Ke.k c10) {
        AbstractC5504s.h(method, "method");
        AbstractC5504s.h(c10, "c");
        return c10.g().p(method.getReturnType(), Me.b.b(I0.f57982b, method.O().o(), false, null, 6, null));
    }

    protected abstract void B(Collection collection, Xe.f fVar);

    protected abstract void C(Xe.f fVar, Collection collection);

    protected abstract Set D(C5380d c5380d, Function1 function1);

    protected final InterfaceC6044i K() {
        return this.f11444d;
    }

    protected final Ke.k L() {
        return this.f11442b;
    }

    protected final InterfaceC6044i N() {
        return this.f11445e;
    }

    protected abstract ye.c0 O();

    protected final U Q() {
        return this.f11443c;
    }

    protected abstract InterfaceC7235m R();

    protected boolean V(Je.e eVar) {
        AbstractC5504s.h(eVar, "<this>");
        return true;
    }

    protected abstract a Y(Oe.r rVar, List list, qf.S s10, List list2);

    protected final Je.e Z(Oe.r method) {
        AbstractC5504s.h(method, "method");
        Je.e eVarP1 = Je.e.p1(R(), Ke.h.a(this.f11442b, method), method.getName(), this.f11442b.a().t().a(method), ((InterfaceC1871c) this.f11445e.invoke()).b(method.getName()) != null && method.j().isEmpty());
        AbstractC5504s.g(eVarP1, "createJavaMethod(...)");
        Ke.k kVarI = Ke.c.i(this.f11442b, eVarP1, method, 0, 4, null);
        List typeParameters = method.getTypeParameters();
        List arrayList = new ArrayList(AbstractC2279u.x(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            m0 m0VarA = kVarI.f().a((Oe.y) it.next());
            AbstractC5504s.e(m0VarA);
            arrayList.add(m0VarA);
        }
        b bVarD0 = d0(kVarI, eVarP1, method.j());
        a aVarY = Y(method, arrayList, A(method, kVarI), bVarD0.a());
        qf.S sC = aVarY.c();
        eVarP1.o1(sC != null ? bf.h.i(eVarP1, sC, InterfaceC7374h.f66223k0.b()) : null, O(), AbstractC2279u.m(), aVarY.e(), aVarY.f(), aVarY.d(), ye.E.f65059a.a(false, method.isAbstract(), !method.isFinal()), He.V.d(method.getVisibility()), aVarY.c() != null ? Ud.S.f(Td.z.a(Je.e.f9499G, AbstractC2279u.m0(bVarD0.a()))) : Ud.S.i());
        eVarP1.s1(aVarY.b(), bVarD0.b());
        if (!aVarY.a().isEmpty()) {
            kVarI.a().s().b(eVarP1, aVarY.a());
        }
        return eVarP1;
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5387k
    public Collection a(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        return !d().contains(name) ? AbstractC2279u.m() : (Collection) this.f11452l.invoke(name);
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5387k
    public Set b() {
        return P();
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5387k
    public Collection c(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        return !b().contains(name) ? AbstractC2279u.m() : (Collection) this.f11448h.invoke(name);
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5387k
    public Set d() {
        return S();
    }

    protected final b d0(Ke.k c10, InterfaceC7247z interfaceC7247z, List jValueParameters) {
        Pair pairA;
        Xe.f name;
        AbstractC5504s.h(c10, "c");
        InterfaceC7247z function = interfaceC7247z;
        AbstractC5504s.h(function, "function");
        AbstractC5504s.h(jValueParameters, "jValueParameters");
        Iterable<Ud.L> iterableH1 = AbstractC2279u.h1(jValueParameters);
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(iterableH1, 10));
        boolean z10 = false;
        for (Ud.L l10 : iterableH1) {
            int iA = l10.a();
            Oe.B b10 = (Oe.B) l10.b();
            InterfaceC7374h interfaceC7374hA = Ke.h.a(c10, b10);
            Me.a aVarB = Me.b.b(I0.f57982b, false, false, null, 7, null);
            if (b10.a()) {
                Oe.x type = b10.getType();
                Oe.f fVar = type instanceof Oe.f ? (Oe.f) type : null;
                if (fVar == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + b10);
                }
                qf.S sL = c10.g().l(fVar, aVarB, true);
                pairA = Td.z.a(sL, c10.d().n().k(sL));
            } else {
                pairA = Td.z.a(c10.g().p(b10.getType(), aVarB), null);
            }
            qf.S s10 = (qf.S) pairA.getFirst();
            qf.S s11 = (qf.S) pairA.getSecond();
            if (AbstractC5504s.c(function.getName().b(), "equals") && jValueParameters.size() == 1 && AbstractC5504s.c(c10.d().n().J(), s10)) {
                name = Xe.f.m("other");
            } else {
                name = b10.getName();
                if (name == null) {
                    z10 = true;
                }
                if (name == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('p');
                    sb2.append(iA);
                    name = Xe.f.m(sb2.toString());
                    AbstractC5504s.g(name, "identifier(...)");
                }
            }
            boolean z11 = z10;
            AbstractC5504s.e(name);
            arrayList.add(new Be.V(function, null, iA, interfaceC7374hA, name, s10, false, false, false, s11, c10.a().t().a(b10)));
            function = interfaceC7247z;
            z10 = z11;
        }
        return new b(AbstractC2279u.b1(arrayList), z10);
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5387k
    public Set f() {
        return M();
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5390n
    public Collection g(C5380d kindFilter, Function1 nameFilter) {
        AbstractC5504s.h(kindFilter, "kindFilter");
        AbstractC5504s.h(nameFilter, "nameFilter");
        return (Collection) this.f11444d.invoke();
    }

    public String toString() {
        return "Lazy scope for " + R();
    }

    protected abstract Set v(C5380d c5380d, Function1 function1);

    protected final List w(C5380d kindFilter, Function1 nameFilter) {
        AbstractC5504s.h(kindFilter, "kindFilter");
        AbstractC5504s.h(nameFilter, "nameFilter");
        Ge.d dVar = Ge.d.f7467m;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (kindFilter.a(C5380d.f51759c.c())) {
            for (Xe.f fVar : v(kindFilter, nameFilter)) {
                if (((Boolean) nameFilter.invoke(fVar)).booleanValue()) {
                    Af.a.a(linkedHashSet, e(fVar, dVar));
                }
            }
        }
        if (kindFilter.a(C5380d.f51759c.d()) && !kindFilter.l().contains(AbstractC5379c.a.f51756a)) {
            for (Xe.f fVar2 : x(kindFilter, nameFilter)) {
                if (((Boolean) nameFilter.invoke(fVar2)).booleanValue()) {
                    linkedHashSet.addAll(c(fVar2, dVar));
                }
            }
        }
        if (kindFilter.a(C5380d.f51759c.i()) && !kindFilter.l().contains(AbstractC5379c.a.f51756a)) {
            for (Xe.f fVar3 : D(kindFilter, nameFilter)) {
                if (((Boolean) nameFilter.invoke(fVar3)).booleanValue()) {
                    linkedHashSet.addAll(a(fVar3, dVar));
                }
            }
        }
        return AbstractC2279u.b1(linkedHashSet);
    }

    protected abstract Set x(C5380d c5380d, Function1 function1);

    protected void y(Collection result, Xe.f name) {
        AbstractC5504s.h(result, "result");
        AbstractC5504s.h(name, "name");
    }

    protected abstract InterfaceC1871c z();

    public U(Ke.k c10, U u10) {
        AbstractC5504s.h(c10, "c");
        this.f11442b = c10;
        this.f11443c = u10;
        this.f11444d = c10.e().i(new H(this), AbstractC2279u.m());
        this.f11445e = c10.e().c(new K(this));
        this.f11446f = c10.e().h(new L(this));
        this.f11447g = c10.e().d(new M(this));
        this.f11448h = c10.e().h(new N(this));
        this.f11449i = c10.e().c(new O(this));
        this.f11450j = c10.e().c(new P(this));
        this.f11451k = c10.e().c(new Q(this));
        this.f11452l = c10.e().h(new S(this));
    }
}
