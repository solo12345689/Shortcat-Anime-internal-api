package Le;

import Oe.InterfaceC1980a;
import Oe.InterfaceC1981b;
import Oe.InterfaceC1982c;
import Ud.AbstractC2279u;
import df.AbstractC4598g;
import df.C4592a;
import df.C4600i;
import df.C4602k;
import df.C4610s;
import df.C4612u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pe.InterfaceC6023m;
import pf.AbstractC6048m;
import pf.InterfaceC6044i;
import pf.InterfaceC6045j;
import qf.AbstractC6183d0;
import qf.I0;
import qf.N0;
import xe.C7140d;
import ye.AbstractC7246y;
import ye.InterfaceC7227e;
import ye.t0;

/* JADX INFO: renamed from: Le.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1878j implements Je.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final /* synthetic */ InterfaceC6023m[] f11490i = {kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(C1878j.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(C1878j.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(C1878j.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ke.k f11491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1980a f11492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC6045j f11493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC6044i f11494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Ne.a f11495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC6044i f11496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f11497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f11498h;

    public C1878j(Ke.k c10, InterfaceC1980a javaAnnotation, boolean z10) {
        AbstractC5504s.h(c10, "c");
        AbstractC5504s.h(javaAnnotation, "javaAnnotation");
        this.f11491a = c10;
        this.f11492b = javaAnnotation;
        this.f11493c = c10.e().g(new C1875g(this));
        this.f11494d = c10.e().c(new C1876h(this));
        this.f11495e = c10.a().t().a(javaAnnotation);
        this.f11496f = c10.e().c(new C1877i(this));
        this.f11497g = javaAnnotation.d();
        this.f11498h = javaAnnotation.G() || z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map g(C1878j c1878j) {
        Collection<InterfaceC1981b> collectionE = c1878j.f11492b.e();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1981b interfaceC1981b : collectionE) {
            Xe.f name = interfaceC1981b.getName();
            if (name == null) {
                name = He.I.f8446c;
            }
            AbstractC4598g abstractC4598gN = c1878j.n(interfaceC1981b);
            Pair pairA = abstractC4598gN != null ? Td.z.a(name, abstractC4598gN) : null;
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        return Ud.S.w(arrayList);
    }

    private final InterfaceC7227e h(Xe.c cVar) {
        return AbstractC7246y.d(this.f11491a.d(), Xe.b.f21759d.c(cVar), this.f11491a.a().b().f().r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Xe.c i(C1878j c1878j) {
        Xe.b bVarG = c1878j.f11492b.g();
        if (bVarG != null) {
            return bVarG.a();
        }
        return null;
    }

    private final AbstractC4598g n(InterfaceC1981b interfaceC1981b) {
        if (interfaceC1981b instanceof Oe.o) {
            return C4600i.f(C4600i.f45156a, ((Oe.o) interfaceC1981b).getValue(), null, 2, null);
        }
        if (interfaceC1981b instanceof Oe.m) {
            Oe.m mVar = (Oe.m) interfaceC1981b;
            return q(mVar.d(), mVar.e());
        }
        if (!(interfaceC1981b instanceof Oe.e)) {
            if (interfaceC1981b instanceof InterfaceC1982c) {
                return o(((InterfaceC1982c) interfaceC1981b).a());
            }
            if (interfaceC1981b instanceof Oe.h) {
                return r(((Oe.h) interfaceC1981b).b());
            }
            return null;
        }
        Oe.e eVar = (Oe.e) interfaceC1981b;
        Xe.f name = eVar.getName();
        if (name == null) {
            name = He.I.f8446c;
        }
        AbstractC5504s.e(name);
        return p(name, eVar.c());
    }

    private final AbstractC4598g o(InterfaceC1980a interfaceC1980a) {
        return new C4592a(new C1878j(this.f11491a, interfaceC1980a, false, 4, null));
    }

    private final AbstractC4598g p(Xe.f fVar, List list) {
        qf.S sM;
        if (qf.W.a(getType())) {
            return null;
        }
        InterfaceC7227e interfaceC7227eL = ff.e.l(this);
        AbstractC5504s.e(interfaceC7227eL);
        t0 t0VarB = Ie.a.b(fVar, interfaceC7227eL);
        if (t0VarB == null || (sM = t0VarB.getType()) == null) {
            sM = this.f11491a.a().m().n().m(N0.f57999e, sf.l.d(sf.k.f59678c1, new String[0]));
            AbstractC5504s.g(sM, "getArrayType(...)");
        }
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC4598g abstractC4598gN = n((InterfaceC1981b) it.next());
            if (abstractC4598gN == null) {
                abstractC4598gN = new C4612u();
            }
            arrayList.add(abstractC4598gN);
        }
        return C4600i.f45156a.b(arrayList, sM);
    }

    private final AbstractC4598g q(Xe.b bVar, Xe.f fVar) {
        if (bVar == null || fVar == null) {
            return null;
        }
        return new C4602k(bVar, fVar);
    }

    private final AbstractC4598g r(Oe.x xVar) {
        return C4610s.f45174b.a(this.f11491a.g().p(xVar, Me.b.b(I0.f57982b, false, false, null, 7, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC6183d0 s(C1878j c1878j) {
        Xe.c cVarF = c1878j.f();
        if (cVarF == null) {
            return sf.l.d(sf.k.f59680d1, c1878j.f11492b.toString());
        }
        InterfaceC7227e interfaceC7227eF = C7140d.f(C7140d.f64395a, cVarF, c1878j.f11491a.d().n(), null, 4, null);
        if (interfaceC7227eF == null) {
            Oe.g gVarB = c1878j.f11492b.b();
            interfaceC7227eF = gVarB != null ? c1878j.f11491a.a().n().a(gVarB) : null;
            if (interfaceC7227eF == null) {
                interfaceC7227eF = c1878j.h(cVarF);
            }
        }
        return interfaceC7227eF.p();
    }

    @Override // ze.InterfaceC7369c
    public Map a() {
        return (Map) AbstractC6048m.a(this.f11496f, this, f11490i[2]);
    }

    @Override // Je.g
    public boolean d() {
        return this.f11497g;
    }

    @Override // ze.InterfaceC7369c
    public Xe.c f() {
        return (Xe.c) AbstractC6048m.b(this.f11493c, this, f11490i[0]);
    }

    @Override // ze.InterfaceC7369c
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Ne.a k() {
        return this.f11495e;
    }

    @Override // ze.InterfaceC7369c
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC6183d0 getType() {
        return (AbstractC6183d0) AbstractC6048m.a(this.f11494d, this, f11490i[1]);
    }

    public final boolean m() {
        return this.f11498h;
    }

    public String toString() {
        return af.n.O(af.n.f23993h, this, null, 2, null);
    }

    public /* synthetic */ C1878j(Ke.k kVar, InterfaceC1980a interfaceC1980a, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, interfaceC1980a, (i10 & 4) != 0 ? false : z10);
    }
}
