package se;

import Be.C1116k;
import Be.C1121p;
import Ee.AbstractC1527f;
import Re.a;
import Td.AbstractC2163n;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import Ze.i;
import he.AbstractC4945a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jf.AbstractC5382f;
import jf.InterfaceC5387k;
import jf.InterfaceC5390n;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;
import of.C5890m;
import pe.InterfaceC6014d;
import pe.InterfaceC6023m;
import qf.AbstractC6183d0;
import se.AbstractC6484d0;
import se.a1;
import ye.AbstractC7246y;
import ye.EnumC7228f;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7234l;
import ye.InterfaceC7235m;

/* JADX INFO: renamed from: se.X */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6475X extends AbstractC6484d0 implements InterfaceC6014d, InterfaceC6476Y, X0 {

    /* JADX INFO: renamed from: d */
    private final Class f59440d;

    /* JADX INFO: renamed from: e */
    private final Lazy f59441e;

    /* JADX INFO: renamed from: se.X$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class a extends AbstractC6484d0.b {

        /* JADX INFO: renamed from: w */
        static final /* synthetic */ InterfaceC6023m[] f59442w = {kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(a.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(a.class, "annotations", "getAnnotations()Ljava/util/List;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(a.class, "simpleName", "getSimpleName()Ljava/lang/String;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(a.class, "qualifiedName", "getQualifiedName()Ljava/lang/String;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(a.class, "constructors", "getConstructors()Ljava/util/Collection;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(a.class, "nestedClasses", "getNestedClasses()Ljava/util/Collection;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(a.class, "typeParameters", "getTypeParameters()Ljava/util/List;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(a.class, "supertypes", "getSupertypes()Ljava/util/List;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(a.class, "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(a.class, "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(a.class, "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(a.class, "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(a.class, "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(a.class, "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(a.class, "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(a.class, "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(a.class, "allMembers", "getAllMembers()Ljava/util/Collection;", 0))};

        /* JADX INFO: renamed from: d */
        private final a1.a f59443d;

        /* JADX INFO: renamed from: e */
        private final a1.a f59444e;

        /* JADX INFO: renamed from: f */
        private final a1.a f59445f;

        /* JADX INFO: renamed from: g */
        private final a1.a f59446g;

        /* JADX INFO: renamed from: h */
        private final a1.a f59447h;

        /* JADX INFO: renamed from: i */
        private final a1.a f59448i;

        /* JADX INFO: renamed from: j */
        private final Lazy f59449j;

        /* JADX INFO: renamed from: k */
        private final a1.a f59450k;

        /* JADX INFO: renamed from: l */
        private final a1.a f59451l;

        /* JADX INFO: renamed from: m */
        private final a1.a f59452m;

        /* JADX INFO: renamed from: n */
        private final a1.a f59453n;

        /* JADX INFO: renamed from: o */
        private final a1.a f59454o;

        /* JADX INFO: renamed from: p */
        private final a1.a f59455p;

        /* JADX INFO: renamed from: q */
        private final a1.a f59456q;

        /* JADX INFO: renamed from: r */
        private final a1.a f59457r;

        /* JADX INFO: renamed from: s */
        private final a1.a f59458s;

        /* JADX INFO: renamed from: t */
        private final a1.a f59459t;

        /* JADX INFO: renamed from: u */
        private final a1.a f59460u;

        public a() {
            super();
            this.f59443d = a1.b(new C6455C(C6475X.this));
            this.f59444e = a1.b(new C6466N(this));
            this.f59445f = a1.b(new C6467O(C6475X.this, this));
            this.f59446g = a1.b(new C6468P(C6475X.this));
            this.f59447h = a1.b(new C6469Q(C6475X.this));
            this.f59448i = a1.b(new C6470S(this));
            this.f59449j = AbstractC2163n.a(Td.q.f17462b, new C6471T(this, C6475X.this));
            this.f59450k = a1.b(new C6472U(this, C6475X.this));
            this.f59451l = a1.b(new C6473V(this, C6475X.this));
            this.f59452m = a1.b(new C6474W(this));
            this.f59453n = a1.b(new C6456D(C6475X.this));
            this.f59454o = a1.b(new C6457E(C6475X.this));
            this.f59455p = a1.b(new C6458F(C6475X.this));
            this.f59456q = a1.b(new C6459G(C6475X.this));
            this.f59457r = a1.b(new C6460H(this));
            this.f59458s = a1.b(new C6461I(this));
            this.f59459t = a1.b(new C6462J(this));
            this.f59460u = a1.b(new C6463K(this));
        }

        public static final List A(a aVar) {
            return j1.e(aVar.N());
        }

        private final String B(Class cls) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                AbstractC5504s.e(simpleName);
                return Df.r.W0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                AbstractC5504s.e(simpleName);
                return Df.r.V0(simpleName, '$', null, 2, null);
            }
            AbstractC5504s.e(simpleName);
            return Df.r.W0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        public static final List C(C6475X c6475x) {
            Collection collectionI = c6475x.I();
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(collectionI, 10));
            Iterator it = collectionI.iterator();
            while (it.hasNext()) {
                arrayList.add(new C6494i0(c6475x, (InterfaceC7234l) it.next()));
            }
            return arrayList;
        }

        public static final List D(a aVar) {
            return AbstractC2279u.I0(aVar.L(), aVar.M());
        }

        public static final Collection E(C6475X c6475x) {
            return c6475x.L(c6475x.c0(), AbstractC6484d0.d.f59483a);
        }

        public static final Collection F(C6475X c6475x) {
            return c6475x.L(c6475x.d0(), AbstractC6484d0.d.f59483a);
        }

        public static final InterfaceC7227e G(C6475X c6475x) {
            Xe.b bVarZ = c6475x.Z();
            De.k kVarB = ((a) c6475x.a0().getValue()).b();
            InterfaceC7227e interfaceC7227eB = (bVarZ.i() && c6475x.j().isAnnotationPresent(Metadata.class)) ? kVarB.a().b(bVarZ) : AbstractC7246y.b(kVarB.b(), bVarZ);
            return interfaceC7227eB == null ? c6475x.X(bVarZ, kVarB) : interfaceC7227eB;
        }

        private final Collection M() {
            Object objB = this.f59454o.b(this, f59442w[10]);
            AbstractC5504s.g(objB, "getValue(...)");
            return (Collection) objB;
        }

        private final Collection O() {
            Object objB = this.f59455p.b(this, f59442w[11]);
            AbstractC5504s.g(objB, "getValue(...)");
            return (Collection) objB;
        }

        private final Collection P() {
            Object objB = this.f59456q.b(this, f59442w[12]);
            AbstractC5504s.g(objB, "getValue(...)");
            return (Collection) objB;
        }

        public static final Collection T(C6475X c6475x) {
            return c6475x.L(c6475x.c0(), AbstractC6484d0.d.f59484b);
        }

        public static final Collection U(C6475X c6475x) {
            return c6475x.L(c6475x.d0(), AbstractC6484d0.d.f59484b);
        }

        public static final List V(a aVar) {
            Collection collectionA = InterfaceC5390n.a.a(aVar.N().U(), null, null, 3, null);
            ArrayList<InterfaceC7235m> arrayList = new ArrayList();
            for (Object obj : collectionA) {
                if (!bf.i.B((InterfaceC7235m) obj)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (InterfaceC7235m interfaceC7235m : arrayList) {
                InterfaceC7227e interfaceC7227e = interfaceC7235m instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7235m : null;
                Class clsQ = interfaceC7227e != null ? j1.q(interfaceC7227e) : null;
                C6475X c6475x = clsQ != null ? new C6475X(clsQ) : null;
                if (c6475x != null) {
                    arrayList2.add(c6475x);
                }
            }
            return arrayList2;
        }

        public static final Object W(a aVar, C6475X c6475x) throws IllegalAccessException {
            InterfaceC7227e interfaceC7227eN = aVar.N();
            if (interfaceC7227eN.h() != EnumC7228f.f65102g) {
                return null;
            }
            Object obj = ((!interfaceC7227eN.c0() || ve.e.a(ve.d.f62095a, interfaceC7227eN)) ? c6475x.j().getDeclaredField("INSTANCE") : c6475x.j().getEnclosingClass().getDeclaredField(interfaceC7227eN.getName().b())).get(null);
            AbstractC5504s.f(obj, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
            return obj;
        }

        public static final String X(C6475X c6475x) {
            if (c6475x.j().isAnonymousClass()) {
                return null;
            }
            Xe.b bVarZ = c6475x.Z();
            if (bVarZ.i()) {
                return null;
            }
            return bVarZ.a().a();
        }

        public static final List Y(a aVar) {
            Collection<InterfaceC7227e> collectionZ = aVar.N().z();
            AbstractC5504s.g(collectionZ, "getSealedSubclasses(...)");
            ArrayList arrayList = new ArrayList();
            for (InterfaceC7227e interfaceC7227e : collectionZ) {
                AbstractC5504s.f(interfaceC7227e, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                Class clsQ = j1.q(interfaceC7227e);
                C6475X c6475x = clsQ != null ? new C6475X(clsQ) : null;
                if (c6475x != null) {
                    arrayList.add(c6475x);
                }
            }
            return arrayList;
        }

        public static final String Z(C6475X c6475x, a aVar) {
            if (c6475x.j().isAnonymousClass()) {
                return null;
            }
            Xe.b bVarZ = c6475x.Z();
            if (bVarZ.i()) {
                return aVar.B(c6475x.j());
            }
            String strB = bVarZ.h().b();
            AbstractC5504s.g(strB, "asString(...)");
            return strB;
        }

        public static final List a0(a aVar, C6475X c6475x) {
            Collection<qf.S> collectionK = aVar.N().l().k();
            AbstractC5504s.g(collectionK, "getSupertypes(...)");
            ArrayList arrayList = new ArrayList(collectionK.size());
            for (qf.S s10 : collectionK) {
                AbstractC5504s.e(s10);
                arrayList.add(new U0(s10, new C6464L(s10, aVar, c6475x)));
            }
            if (!ve.i.v0(aVar.N())) {
                if (arrayList.isEmpty()) {
                    AbstractC6183d0 abstractC6183d0I = ff.e.m(aVar.N()).i();
                    AbstractC5504s.g(abstractC6183d0I, "getAnyType(...)");
                    arrayList.add(new U0(abstractC6183d0I, C6465M.f59404a));
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        EnumC7228f enumC7228fH = bf.i.e(((U0) it.next()).A()).h();
                        AbstractC5504s.g(enumC7228fH, "getKind(...)");
                        if (enumC7228fH != EnumC7228f.f65098c && enumC7228fH != EnumC7228f.f65101f) {
                            break;
                        }
                    }
                    AbstractC6183d0 abstractC6183d0I2 = ff.e.m(aVar.N()).i();
                    AbstractC5504s.g(abstractC6183d0I2, "getAnyType(...)");
                    arrayList.add(new U0(abstractC6183d0I2, C6465M.f59404a));
                }
            }
            return Af.a.c(arrayList);
        }

        public static final Type b0(qf.S s10, a aVar, C6475X c6475x) {
            InterfaceC7230h interfaceC7230hP = s10.N0().p();
            if (!(interfaceC7230hP instanceof InterfaceC7227e)) {
                throw new Y0("Supertype not a class: " + interfaceC7230hP);
            }
            Class clsQ = j1.q((InterfaceC7227e) interfaceC7230hP);
            if (clsQ == null) {
                throw new Y0("Unsupported superclass of " + aVar + ": " + interfaceC7230hP);
            }
            if (AbstractC5504s.c(c6475x.j().getSuperclass(), clsQ)) {
                Type genericSuperclass = c6475x.j().getGenericSuperclass();
                AbstractC5504s.e(genericSuperclass);
                return genericSuperclass;
            }
            Class<?>[] interfaces = c6475x.j().getInterfaces();
            AbstractC5504s.g(interfaces, "getInterfaces(...)");
            int iN0 = AbstractC2273n.n0(interfaces, clsQ);
            if (iN0 >= 0) {
                Type type = c6475x.j().getGenericInterfaces()[iN0];
                AbstractC5504s.e(type);
                return type;
            }
            throw new Y0("No superclass of " + aVar + " in Java reflection for " + interfaceC7230hP);
        }

        public static final Type c0() {
            return Object.class;
        }

        public static final List d0(a aVar, C6475X c6475x) {
            List<ye.m0> listQ = aVar.N().q();
            AbstractC5504s.g(listQ, "getDeclaredTypeParameters(...)");
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(listQ, 10));
            for (ye.m0 m0Var : listQ) {
                AbstractC5504s.e(m0Var);
                arrayList.add(new W0(c6475x, m0Var));
            }
            return arrayList;
        }

        public static final List x(a aVar) {
            return AbstractC2279u.I0(aVar.H(), aVar.I());
        }

        public static final List y(a aVar) {
            return AbstractC2279u.I0(aVar.L(), aVar.O());
        }

        public static final List z(a aVar) {
            return AbstractC2279u.I0(aVar.M(), aVar.P());
        }

        public final Collection H() {
            Object objB = this.f59457r.b(this, f59442w[13]);
            AbstractC5504s.g(objB, "getValue(...)");
            return (Collection) objB;
        }

        public final Collection I() {
            Object objB = this.f59458s.b(this, f59442w[14]);
            AbstractC5504s.g(objB, "getValue(...)");
            return (Collection) objB;
        }

        public final List J() {
            Object objB = this.f59444e.b(this, f59442w[1]);
            AbstractC5504s.g(objB, "getValue(...)");
            return (List) objB;
        }

        public final Collection K() {
            Object objB = this.f59447h.b(this, f59442w[4]);
            AbstractC5504s.g(objB, "getValue(...)");
            return (Collection) objB;
        }

        public final Collection L() {
            Object objB = this.f59453n.b(this, f59442w[9]);
            AbstractC5504s.g(objB, "getValue(...)");
            return (Collection) objB;
        }

        public final InterfaceC7227e N() {
            Object objB = this.f59443d.b(this, f59442w[0]);
            AbstractC5504s.g(objB, "getValue(...)");
            return (InterfaceC7227e) objB;
        }

        public final String Q() {
            return (String) this.f59446g.b(this, f59442w[3]);
        }

        public final String R() {
            return (String) this.f59445f.b(this, f59442w[2]);
        }

        public final List S() {
            Object objB = this.f59451l.b(this, f59442w[7]);
            AbstractC5504s.g(objB, "getValue(...)");
            return (List) objB;
        }
    }

    /* JADX INFO: renamed from: se.X$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f59462a;

        static {
            int[] iArr = new int[a.EnumC0265a.values().length];
            try {
                iArr[a.EnumC0265a.f15480f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC0265a.f15482h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.EnumC0265a.f15483i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.EnumC0265a.f15481g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.EnumC0265a.f15478d.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.EnumC0265a.f15479e.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f59462a = iArr;
        }
    }

    /* JADX INFO: renamed from: se.X$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends AbstractC5382f {
        c(C1116k c1116k, pf.n nVar) {
            super(nVar, c1116k);
        }

        @Override // jf.AbstractC5382f
        protected List j() {
            return AbstractC2279u.m();
        }
    }

    /* JADX INFO: renamed from: se.X$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class d extends AbstractC5502p implements Function2 {

        /* JADX INFO: renamed from: a */
        public static final d f59463a = new d();

        d() {
            super(2, mf.K.class, "loadProperty", "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: j */
        public final ye.Z invoke(mf.K p02, Se.o p12) {
            AbstractC5504s.h(p02, "p0");
            AbstractC5504s.h(p12, "p1");
            return p02.u(p12);
        }
    }

    public C6475X(Class jClass) {
        AbstractC5504s.h(jClass, "jClass");
        this.f59440d = jClass;
        this.f59441e = AbstractC2163n.a(Td.q.f17462b, new C6454B(this));
    }

    private final InterfaceC7227e W(Xe.b bVar, De.k kVar) {
        C1116k c1116k = new C1116k(new C1121p(kVar.b(), bVar.f()), bVar.h(), ye.E.f65060b, EnumC7228f.f65097b, AbstractC2279u.e(kVar.b().n().h().p()), ye.h0.f65112a, false, kVar.a().u());
        c1116k.K0(new c(c1116k, kVar.a().u()), Ud.a0.d(), null);
        return c1116k;
    }

    public final InterfaceC7227e X(Xe.b bVar, De.k kVar) {
        Re.a aVarD;
        if (j().isSynthetic()) {
            return W(bVar, kVar);
        }
        De.f fVarA = De.f.f3699c.a(j());
        a.EnumC0265a enumC0265aC = (fVarA == null || (aVarD = fVarA.d()) == null) ? null : aVarD.c();
        switch (enumC0265aC == null ? -1 : b.f59462a[enumC0265aC.ordinal()]) {
            case -1:
            case 6:
                throw new Y0("Unresolved class: " + j() + " (kind = " + enumC0265aC + ')');
            case 0:
            default:
                throw new Td.r();
            case 1:
            case 2:
            case 3:
            case 4:
                return W(bVar, kVar);
            case 5:
                throw new Y0("Unknown class: " + j() + " (kind = " + enumC0265aC + ')');
        }
    }

    public static final a Y(C6475X c6475x) {
        return c6475x.new a();
    }

    public final Xe.b Z() {
        return f1.f59496a.c(j());
    }

    @Override // se.AbstractC6484d0
    public Collection I() {
        InterfaceC7227e descriptor = getDescriptor();
        if (descriptor.h() == EnumC7228f.f65098c || descriptor.h() == EnumC7228f.f65102g) {
            return AbstractC2279u.m();
        }
        Collection collectionI = descriptor.i();
        AbstractC5504s.g(collectionI, "getConstructors(...)");
        return collectionI;
    }

    @Override // se.AbstractC6484d0
    public Collection J(Xe.f name) {
        AbstractC5504s.h(name, "name");
        InterfaceC5387k interfaceC5387kC0 = c0();
        Ge.d dVar = Ge.d.f7462h;
        return AbstractC2279u.I0(interfaceC5387kC0.c(name, dVar), d0().c(name, dVar));
    }

    @Override // se.AbstractC6484d0
    public ye.Z K(int i10) {
        Class<?> declaringClass;
        if (AbstractC5504s.c(j().getSimpleName(), "DefaultImpls") && (declaringClass = j().getDeclaringClass()) != null && declaringClass.isInterface()) {
            InterfaceC6014d interfaceC6014dE = AbstractC4945a.e(declaringClass);
            AbstractC5504s.f(interfaceC6014dE, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            return ((C6475X) interfaceC6014dE).K(i10);
        }
        InterfaceC7227e descriptor = getDescriptor();
        C5890m c5890m = descriptor instanceof C5890m ? (C5890m) descriptor : null;
        if (c5890m != null) {
            Se.c cVarE1 = c5890m.e1();
            i.f classLocalVariable = Ve.a.f20037j;
            AbstractC5504s.g(classLocalVariable, "classLocalVariable");
            Se.o oVar = (Se.o) Ue.f.b(cVarE1, classLocalVariable, i10);
            if (oVar != null) {
                return (ye.Z) j1.h(j(), oVar, c5890m.d1().g(), c5890m.d1().j(), c5890m.g1(), d.f59463a);
            }
        }
        return null;
    }

    @Override // se.AbstractC6484d0
    public Collection N(Xe.f name) {
        AbstractC5504s.h(name, "name");
        InterfaceC5387k interfaceC5387kC0 = c0();
        Ge.d dVar = Ge.d.f7462h;
        return AbstractC2279u.I0(interfaceC5387kC0.a(name, dVar), d0().a(name, dVar));
    }

    public final Lazy a0() {
        return this.f59441e;
    }

    @Override // se.InterfaceC6476Y
    /* JADX INFO: renamed from: b0 */
    public InterfaceC7227e getDescriptor() {
        return ((a) this.f59441e.getValue()).N();
    }

    public final InterfaceC5387k c0() {
        return getDescriptor().p().o();
    }

    public final InterfaceC5387k d0() {
        InterfaceC5387k interfaceC5387kO0 = getDescriptor().o0();
        AbstractC5504s.g(interfaceC5387kO0, "getStaticScope(...)");
        return interfaceC5387kO0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6475X) && AbstractC5504s.c(AbstractC4945a.c(this), AbstractC4945a.c((InterfaceC6014d) obj));
    }

    @Override // pe.InterfaceC6012b
    public List getAnnotations() {
        return ((a) this.f59441e.getValue()).J();
    }

    @Override // pe.InterfaceC6014d
    public int hashCode() {
        return AbstractC4945a.c(this).hashCode();
    }

    @Override // pe.InterfaceC6014d
    public Collection i() {
        return ((a) this.f59441e.getValue()).K();
    }

    @Override // kotlin.jvm.internal.InterfaceC5494h
    public Class j() {
        return this.f59440d;
    }

    @Override // pe.InterfaceC6014d
    public List k() {
        return ((a) this.f59441e.getValue()).S();
    }

    @Override // pe.InterfaceC6014d
    public boolean s() {
        return getDescriptor().s();
    }

    @Override // pe.InterfaceC6014d
    public boolean t(Object obj) {
        Integer numG = AbstractC1527f.g(j());
        if (numG != null) {
            return kotlin.jvm.internal.V.k(obj, numG.intValue());
        }
        Class clsK = AbstractC1527f.k(j());
        if (clsK == null) {
            clsK = j();
        }
        return clsK.isInstance(obj);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("class ");
        Xe.b bVarZ = Z();
        Xe.c cVarF = bVarZ.f();
        if (cVarF.c()) {
            str = "";
        } else {
            str = cVarF.a() + com.amazon.a.a.o.c.a.b.f34706a;
        }
        sb2.append(str + Df.r.J(bVarZ.g().a(), com.amazon.a.a.o.c.a.b.f34706a, '$', false, 4, null));
        return sb2.toString();
    }

    @Override // pe.InterfaceC6014d
    public String u() {
        return ((a) this.f59441e.getValue()).Q();
    }

    @Override // pe.InterfaceC6014d
    public String v() {
        return ((a) this.f59441e.getValue()).R();
    }
}
