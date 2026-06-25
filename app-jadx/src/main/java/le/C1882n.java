package Le;

import Be.AbstractC1115j;
import Td.AbstractC2163n;
import Ud.AbstractC2279u;
import df.C4615x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jf.C5383g;
import jf.InterfaceC5387k;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.InterfaceC5691w;
import oe.C5870f;
import pf.InterfaceC6044i;
import qf.AbstractC6178b;
import qf.D0;
import qf.I0;
import qf.N0;
import qf.r0;
import qf.v0;
import rf.AbstractC6317g;
import ye.AbstractC7241t;
import ye.AbstractC7242u;
import ye.EnumC7228f;
import ye.InterfaceC7226d;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7235m;
import ye.M;
import ye.f0;
import ye.k0;
import ye.m0;
import ye.q0;
import ye.x0;
import ze.InterfaceC7369c;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: Le.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1882n extends AbstractC1115j implements Je.c {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f11502y = new a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Set f11503z = Ud.a0.h("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Ke.k f11504i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Oe.g f11505j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final InterfaceC7227e f11506k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Ke.k f11507l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Lazy f11508m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final EnumC7228f f11509n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ye.E f11510o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final x0 f11511p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f11512q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final b f11513r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final C1893z f11514s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final f0 f11515t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final C5383g f11516u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final a0 f11517v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final InterfaceC7374h f11518w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final InterfaceC6044i f11519x;

    /* JADX INFO: renamed from: Le.n$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Le.n$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class b extends AbstractC6178b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final InterfaceC6044i f11520d;

        public b() {
            super(C1882n.this.f11507l.e());
            this.f11520d = C1882n.this.f11507l.e().c(new C1883o(C1882n.this));
        }

        private final qf.S K() {
            Xe.c cVarB;
            ArrayList arrayList;
            Xe.c cVarL = L();
            if (cVarL == null || cVarL.c() || !cVarL.h(ve.o.f62182z)) {
                cVarL = null;
            }
            if (cVarL == null) {
                cVarB = He.r.f8572a.b(ff.e.o(C1882n.this));
                if (cVarB == null) {
                    return null;
                }
            } else {
                cVarB = cVarL;
            }
            InterfaceC7227e interfaceC7227eB = ff.e.B(C1882n.this.f11507l.d(), cVarB, Ge.d.f7473s);
            if (interfaceC7227eB == null) {
                return null;
            }
            int size = interfaceC7227eB.l().getParameters().size();
            List parameters = C1882n.this.l().getParameters();
            AbstractC5504s.g(parameters, "getParameters(...)");
            int size2 = parameters.size();
            if (size2 == size) {
                arrayList = new ArrayList(AbstractC2279u.x(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new D0(N0.f57999e, ((m0) it.next()).p()));
                }
            } else {
                if (size2 != 1 || size <= 1 || cVarL != null) {
                    return null;
                }
                D0 d02 = new D0(N0.f57999e, ((m0) AbstractC2279u.M0(parameters)).p());
                C5870f c5870f = new C5870f(1, size);
                ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(c5870f, 10));
                Iterator it2 = c5870f.iterator();
                while (it2.hasNext()) {
                    ((Ud.O) it2).nextInt();
                    arrayList2.add(d02);
                }
                arrayList = arrayList2;
            }
            return qf.V.h(r0.f58089b.k(), interfaceC7227eB, arrayList);
        }

        private final Xe.c L() {
            String str;
            InterfaceC7374h annotations = C1882n.this.getAnnotations();
            Xe.c PURELY_IMPLEMENTS_ANNOTATION = He.I.f8461r;
            AbstractC5504s.g(PURELY_IMPLEMENTS_ANNOTATION, "PURELY_IMPLEMENTS_ANNOTATION");
            InterfaceC7369c interfaceC7369cH = annotations.h(PURELY_IMPLEMENTS_ANNOTATION);
            if (interfaceC7369cH == null) {
                return null;
            }
            Object objN0 = AbstractC2279u.N0(interfaceC7369cH.a().values());
            C4615x c4615x = objN0 instanceof C4615x ? (C4615x) objN0 : null;
            if (c4615x == null || (str = (String) c4615x.b()) == null || !Xe.e.e(str)) {
                return null;
            }
            return new Xe.c(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List M(C1882n c1882n) {
            return q0.g(c1882n);
        }

        @Override // qf.AbstractC6211v, qf.v0
        /* JADX INFO: renamed from: I */
        public InterfaceC7227e p() {
            return C1882n.this;
        }

        @Override // qf.v0
        public List getParameters() {
            return (List) this.f11520d.invoke();
        }

        @Override // qf.v0
        public boolean q() {
            return true;
        }

        @Override // qf.AbstractC6206p
        protected Collection r() {
            Collection collectionK = C1882n.this.S0().k();
            ArrayList arrayList = new ArrayList(collectionK.size());
            ArrayList<Oe.x> arrayList2 = new ArrayList(0);
            qf.S sK = K();
            Iterator it = collectionK.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Oe.j jVar = (Oe.j) it.next();
                qf.S sQ = C1882n.this.f11507l.a().r().q(C1882n.this.f11507l.g().p(jVar, Me.b.b(I0.f57981a, false, false, null, 7, null)), C1882n.this.f11507l);
                if (sQ.N0().p() instanceof M.b) {
                    arrayList2.add(jVar);
                }
                if (!AbstractC5504s.c(sQ.N0(), sK != null ? sK.N0() : null) && !ve.i.c0(sQ)) {
                    arrayList.add(sQ);
                }
            }
            InterfaceC7227e interfaceC7227e = C1882n.this.f11506k;
            Af.a.a(arrayList, interfaceC7227e != null ? xe.y.a(interfaceC7227e, C1882n.this).c().p(interfaceC7227e.p(), N0.f57999e) : null);
            Af.a.a(arrayList, sK);
            if (!arrayList2.isEmpty()) {
                InterfaceC5691w interfaceC5691wC = C1882n.this.f11507l.a().c();
                InterfaceC7227e interfaceC7227eP = p();
                ArrayList arrayList3 = new ArrayList(AbstractC2279u.x(arrayList2, 10));
                for (Oe.x xVar : arrayList2) {
                    AbstractC5504s.f(xVar, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList3.add(((Oe.j) xVar).E());
                }
                interfaceC5691wC.b(interfaceC7227eP, arrayList3);
            }
            return !arrayList.isEmpty() ? AbstractC2279u.b1(arrayList) : AbstractC2279u.e(C1882n.this.f11507l.d().n().i());
        }

        public String toString() {
            String strB = C1882n.this.getName().b();
            AbstractC5504s.g(strB, "asString(...)");
            return strB;
        }

        @Override // qf.AbstractC6206p
        protected k0 v() {
            return C1882n.this.f11507l.a().v();
        }
    }

    /* JADX INFO: renamed from: Le.n$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Xd.a.d(ff.e.o((InterfaceC7227e) obj).a(), ff.e.o((InterfaceC7227e) obj2).a());
        }
    }

    public /* synthetic */ C1882n(Ke.k kVar, InterfaceC7235m interfaceC7235m, Oe.g gVar, InterfaceC7227e interfaceC7227e, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, interfaceC7235m, gVar, (i10 & 8) != 0 ? null : interfaceC7227e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List Q0(C1882n c1882n) {
        List<Oe.y> typeParameters = c1882n.f11505j.getTypeParameters();
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(typeParameters, 10));
        for (Oe.y yVar : typeParameters) {
            m0 m0VarA = c1882n.f11507l.f().a(yVar);
            if (m0VarA == null) {
                throw new AssertionError("Parameter " + yVar + " surely belongs to class " + c1882n.f11505j + ", so it must be resolved");
            }
            arrayList.add(m0VarA);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List W0(C1882n c1882n) {
        Xe.b bVarN = ff.e.n(c1882n);
        if (bVarN != null) {
            return c1882n.f11504i.a().f().a(bVarN);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1893z X0(C1882n c1882n, AbstractC6317g it) {
        AbstractC5504s.h(it, "it");
        return new C1893z(c1882n.f11507l, c1882n, c1882n.f11505j, c1882n.f11506k != null, c1882n.f11514s);
    }

    @Override // ye.InterfaceC7231i
    public boolean A() {
        return this.f11512q;
    }

    @Override // ye.InterfaceC7227e
    public InterfaceC7226d D() {
        return null;
    }

    @Override // ye.InterfaceC7227e
    public boolean I0() {
        return false;
    }

    public final C1882n P0(Ie.j javaResolverCache, InterfaceC7227e interfaceC7227e) {
        AbstractC5504s.h(javaResolverCache, "javaResolverCache");
        Ke.k kVar = this.f11507l;
        Ke.k kVarM = Ke.c.m(kVar, kVar.a().x(javaResolverCache));
        InterfaceC7235m interfaceC7235mB = b();
        AbstractC5504s.g(interfaceC7235mB, "getContainingDeclaration(...)");
        return new C1882n(kVarM, interfaceC7235mB, this.f11505j, interfaceC7227e);
    }

    @Override // ye.InterfaceC7227e
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public List i() {
        return (List) this.f11514s.a1().invoke();
    }

    public final Oe.g S0() {
        return this.f11505j;
    }

    public final List T0() {
        return (List) this.f11508m.getValue();
    }

    @Override // Be.AbstractC1106a, ye.InterfaceC7227e
    public InterfaceC5387k U() {
        return this.f11516u;
    }

    @Override // Be.AbstractC1106a, ye.InterfaceC7227e
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public C1893z X() {
        InterfaceC5387k interfaceC5387kX = super.X();
        AbstractC5504s.f(interfaceC5387kX, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (C1893z) interfaceC5387kX;
    }

    @Override // ye.InterfaceC7227e
    public ye.r0 V() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Be.z
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public C1893z j0(AbstractC6317g kotlinTypeRefiner) {
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return (C1893z) this.f11515t.c(kotlinTypeRefiner);
    }

    @Override // ye.D
    public boolean Y() {
        return false;
    }

    @Override // ye.InterfaceC7227e
    public boolean c0() {
        return false;
    }

    @Override // ye.InterfaceC7227e
    public boolean g0() {
        return false;
    }

    @Override // ze.InterfaceC7367a
    public InterfaceC7374h getAnnotations() {
        return this.f11518w;
    }

    @Override // ye.InterfaceC7227e, ye.D, ye.InterfaceC7239q
    public AbstractC7242u getVisibility() {
        if (!AbstractC5504s.c(this.f11511p, AbstractC7241t.f65120a) || this.f11505j.l() != null) {
            return He.V.d(this.f11511p);
        }
        AbstractC7242u abstractC7242u = He.y.f8587a;
        AbstractC5504s.e(abstractC7242u);
        return abstractC7242u;
    }

    @Override // ye.InterfaceC7227e
    public EnumC7228f h() {
        return this.f11509n;
    }

    @Override // ye.InterfaceC7227e
    public boolean isInline() {
        return false;
    }

    @Override // ye.InterfaceC7230h
    public v0 l() {
        return this.f11513r;
    }

    @Override // ye.D
    public boolean m0() {
        return false;
    }

    @Override // ye.InterfaceC7227e
    public InterfaceC5387k o0() {
        return this.f11517v;
    }

    @Override // ye.InterfaceC7227e
    public InterfaceC7227e p0() {
        return null;
    }

    @Override // ye.InterfaceC7227e, ye.InterfaceC7231i
    public List q() {
        return (List) this.f11519x.invoke();
    }

    @Override // ye.InterfaceC7227e, ye.D
    public ye.E r() {
        return this.f11510o;
    }

    @Override // ye.InterfaceC7227e
    public boolean s() {
        return false;
    }

    public String toString() {
        return "Lazy Java class " + ff.e.p(this);
    }

    @Override // ye.InterfaceC7227e
    public Collection z() {
        if (this.f11510o != ye.E.f65061c) {
            return AbstractC2279u.m();
        }
        Me.a aVarB = Me.b.b(I0.f57982b, false, false, null, 7, null);
        Cf.i iVarC = this.f11505j.C();
        ArrayList arrayList = new ArrayList();
        Iterator it = iVarC.iterator();
        while (it.hasNext()) {
            InterfaceC7230h interfaceC7230hP = this.f11507l.g().p((Oe.j) it.next(), aVarB).N0().p();
            InterfaceC7227e interfaceC7227e = interfaceC7230hP instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7230hP : null;
            if (interfaceC7227e != null) {
                arrayList.add(interfaceC7227e);
            }
        }
        return AbstractC2279u.R0(arrayList, new c());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1882n(Ke.k outerContext, InterfaceC7235m containingDeclaration, Oe.g jClass, InterfaceC7227e interfaceC7227e) {
        ye.E eA;
        super(outerContext.e(), containingDeclaration, jClass.getName(), outerContext.a().t().a(jClass), false);
        AbstractC5504s.h(outerContext, "outerContext");
        AbstractC5504s.h(containingDeclaration, "containingDeclaration");
        AbstractC5504s.h(jClass, "jClass");
        this.f11504i = outerContext;
        this.f11505j = jClass;
        this.f11506k = interfaceC7227e;
        Ke.k kVarF = Ke.c.f(outerContext, this, jClass, 0, 4, null);
        this.f11507l = kVarF;
        kVarF.a().h().d(jClass, this);
        jClass.K();
        this.f11508m = AbstractC2163n.b(new C1879k(this));
        this.f11509n = jClass.o() ? EnumC7228f.f65101f : jClass.J() ? EnumC7228f.f65098c : jClass.v() ? EnumC7228f.f65099d : EnumC7228f.f65097b;
        if (jClass.o() || jClass.v()) {
            eA = ye.E.f65060b;
        } else {
            eA = ye.E.f65059a.a(jClass.y(), jClass.y() || jClass.isAbstract() || jClass.J(), !jClass.isFinal());
        }
        this.f11510o = eA;
        this.f11511p = jClass.getVisibility();
        this.f11512q = (jClass.l() == null || jClass.P()) ? false : true;
        this.f11513r = new b();
        C1893z c1893z = new C1893z(kVarF, this, jClass, interfaceC7227e != null, null, 16, null);
        this.f11514s = c1893z;
        this.f11515t = f0.f65106e.a(this, kVarF.e(), kVarF.a().k().d(), new C1880l(this));
        this.f11516u = new C5383g(c1893z);
        this.f11517v = new a0(kVarF, jClass, this);
        this.f11518w = Ke.h.a(kVarF, jClass);
        this.f11519x = kVarF.e().c(new C1881m(this));
    }
}
