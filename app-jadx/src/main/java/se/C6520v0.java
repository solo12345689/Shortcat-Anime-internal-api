package se;

import Ee.AbstractC1527f;
import Td.AbstractC2163n;
import Ud.AbstractC2279u;
import Ze.i;
import java.util.Collection;
import jf.InterfaceC5387k;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6023m;
import se.AbstractC6484d0;
import se.a1;

/* JADX INFO: renamed from: se.v0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6520v0 extends AbstractC6484d0 {

    /* JADX INFO: renamed from: d */
    private final Class f59567d;

    /* JADX INFO: renamed from: e */
    private final Lazy f59568e;

    /* JADX INFO: renamed from: se.v0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class a extends AbstractC6484d0.b {

        /* JADX INFO: renamed from: j */
        static final /* synthetic */ InterfaceC6023m[] f59569j = {kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(a.class, "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(a.class, "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(a.class, "members", "getMembers()Ljava/util/Collection;", 0))};

        /* JADX INFO: renamed from: d */
        private final a1.a f59570d;

        /* JADX INFO: renamed from: e */
        private final a1.a f59571e;

        /* JADX INFO: renamed from: f */
        private final Lazy f59572f;

        /* JADX INFO: renamed from: g */
        private final Lazy f59573g;

        /* JADX INFO: renamed from: h */
        private final a1.a f59574h;

        public a() {
            super();
            this.f59570d = a1.b(new C6510q0(C6520v0.this));
            this.f59571e = a1.b(new C6512r0(this));
            Td.q qVar = Td.q.f17462b;
            this.f59572f = AbstractC2163n.a(qVar, new C6514s0(this, C6520v0.this));
            this.f59573g = AbstractC2163n.a(qVar, new C6516t0(this));
            this.f59574h = a1.b(new C6518u0(C6520v0.this, this));
        }

        private final De.f i() {
            return (De.f) this.f59570d.b(this, f59569j[0]);
        }

        public static final De.f m(C6520v0 c6520v0) {
            return De.f.f3699c.a(c6520v0.j());
        }

        public static final Collection n(C6520v0 c6520v0, a aVar) {
            return c6520v0.L(aVar.l(), AbstractC6484d0.d.f59483a);
        }

        public static final Td.y o(a aVar) {
            Re.a aVarD;
            De.f fVarI = aVar.i();
            if (fVarI != null && (aVarD = fVarI.d()) != null) {
                String[] strArrA = aVarD.a();
                String[] strArrG = aVarD.g();
                if (strArrA != null && strArrG != null) {
                    Pair pairM = We.h.m(strArrA, strArrG);
                    return new Td.y((We.e) pairM.getFirst(), (Se.m) pairM.getSecond(), aVarD.d());
                }
            }
            return null;
        }

        public static final Class p(a aVar, C6520v0 c6520v0) {
            Re.a aVarD;
            De.f fVarI = aVar.i();
            String strE = (fVarI == null || (aVarD = fVarI.d()) == null) ? null : aVarD.e();
            if (strE == null || strE.length() <= 0) {
                return null;
            }
            return c6520v0.j().getClassLoader().loadClass(Df.r.J(strE, '/', com.amazon.a.a.o.c.a.b.f34706a, false, 4, null));
        }

        public static final InterfaceC5387k q(a aVar) {
            De.f fVarI = aVar.i();
            return fVarI != null ? aVar.b().c().a(fVarI) : InterfaceC5387k.b.f51800b;
        }

        public final Td.y j() {
            return (Td.y) this.f59573g.getValue();
        }

        public final Class k() {
            return (Class) this.f59572f.getValue();
        }

        public final InterfaceC5387k l() {
            Object objB = this.f59571e.b(this, f59569j[1]);
            AbstractC5504s.g(objB, "getValue(...)");
            return (InterfaceC5387k) objB;
        }
    }

    /* JADX INFO: renamed from: se.v0$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class b extends AbstractC5502p implements Function2 {

        /* JADX INFO: renamed from: a */
        public static final b f59576a = new b();

        b() {
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

    public C6520v0(Class jClass) {
        AbstractC5504s.h(jClass, "jClass");
        this.f59567d = jClass;
        this.f59568e = AbstractC2163n.a(Td.q.f17462b, new C6508p0(this));
    }

    public static final a U(C6520v0 c6520v0) {
        return c6520v0.new a();
    }

    private final InterfaceC5387k V() {
        return ((a) this.f59568e.getValue()).l();
    }

    @Override // se.AbstractC6484d0
    public Collection I() {
        return AbstractC2279u.m();
    }

    @Override // se.AbstractC6484d0
    public Collection J(Xe.f name) {
        AbstractC5504s.h(name, "name");
        return V().c(name, Ge.d.f7462h);
    }

    @Override // se.AbstractC6484d0
    public ye.Z K(int i10) {
        Td.y yVarJ = ((a) this.f59568e.getValue()).j();
        if (yVarJ != null) {
            We.e eVar = (We.e) yVarJ.a();
            Se.m mVar = (Se.m) yVarJ.b();
            Ue.c cVar = (Ue.c) yVarJ.c();
            i.f packageLocalVariable = Ve.a.f20041n;
            AbstractC5504s.g(packageLocalVariable, "packageLocalVariable");
            Se.o oVar = (Se.o) Ue.f.b(mVar, packageLocalVariable, i10);
            if (oVar != null) {
                Class clsJ = j();
                Se.u uVarW = mVar.W();
                AbstractC5504s.g(uVarW, "getTypeTable(...)");
                return (ye.Z) j1.h(clsJ, oVar, eVar, new Ue.h(uVarW), cVar, b.f59576a);
            }
        }
        return null;
    }

    @Override // se.AbstractC6484d0
    protected Class M() {
        Class clsK = ((a) this.f59568e.getValue()).k();
        return clsK == null ? j() : clsK;
    }

    @Override // se.AbstractC6484d0
    public Collection N(Xe.f name) {
        AbstractC5504s.h(name, "name");
        return V().a(name, Ge.d.f7462h);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6520v0) && AbstractC5504s.c(j(), ((C6520v0) obj).j());
    }

    public int hashCode() {
        return j().hashCode();
    }

    @Override // kotlin.jvm.internal.InterfaceC5494h
    public Class j() {
        return this.f59567d;
    }

    public String toString() {
        return "file class " + AbstractC1527f.e(j()).a();
    }
}
