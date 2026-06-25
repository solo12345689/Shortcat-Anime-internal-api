package Le;

import Af.b;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.C5380d;
import jf.InterfaceC5387k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.g0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class a0 extends b0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Oe.g f11467n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Je.c f11468o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Ke.k c10, Oe.g jClass, Je.c ownerDescriptor) {
        super(c10);
        AbstractC5504s.h(c10, "c");
        AbstractC5504s.h(jClass, "jClass");
        AbstractC5504s.h(ownerDescriptor, "ownerDescriptor");
        this.f11467n = jClass;
        this.f11468o = ownerDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m0(Oe.q it) {
        AbstractC5504s.h(it, "it");
        return it.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection n0(Xe.f fVar, InterfaceC5387k it) {
        AbstractC5504s.h(it, "it");
        return it.a(fVar, Ge.d.f7469o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection o0(InterfaceC5387k it) {
        AbstractC5504s.h(it, "it");
        return it.d();
    }

    private final Set p0(InterfaceC7227e interfaceC7227e, Set set, Function1 function1) {
        Af.b.b(AbstractC2279u.e(interfaceC7227e), Y.f11464a, new a(interfaceC7227e, set, function1));
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable q0(InterfaceC7227e interfaceC7227e) {
        Collection collectionK = interfaceC7227e.l().k();
        AbstractC5504s.g(collectionK, "getSupertypes(...)");
        return Cf.l.u(Cf.l.L(AbstractC2279u.c0(collectionK), Z.f11465a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC7227e r0(qf.S s10) {
        InterfaceC7230h interfaceC7230hP = s10.N0().p();
        if (interfaceC7230hP instanceof InterfaceC7227e) {
            return (InterfaceC7227e) interfaceC7230hP;
        }
        return null;
    }

    private final ye.Z t0(ye.Z z10) {
        if (z10.h().a()) {
            return z10;
        }
        Collection collectionE = z10.e();
        AbstractC5504s.g(collectionE, "getOverriddenDescriptors(...)");
        Collection<ye.Z> collection = collectionE;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(collection, 10));
        for (ye.Z z11 : collection) {
            AbstractC5504s.e(z11);
            arrayList.add(t0(z11));
        }
        return (ye.Z) AbstractC2279u.M0(AbstractC2279u.f0(arrayList));
    }

    private final Set u0(Xe.f fVar, InterfaceC7227e interfaceC7227e) {
        a0 a0VarB = Je.h.b(interfaceC7227e);
        return a0VarB == null ? Ud.a0.d() : AbstractC2279u.f1(a0VarB.c(fVar, Ge.d.f7469o));
    }

    @Override // Le.U
    protected void B(Collection result, Xe.f name) {
        AbstractC5504s.h(result, "result");
        AbstractC5504s.h(name, "name");
        Collection collectionE = Ie.a.e(name, u0(name, R()), result, R(), L().a().c(), L().a().k().b());
        AbstractC5504s.g(collectionE, "resolveOverridesForStaticMembers(...)");
        result.addAll(collectionE);
        if (this.f11467n.v()) {
            if (AbstractC5504s.c(name, ve.o.f62162f)) {
                g0 g0VarG = bf.h.g(R());
                AbstractC5504s.g(g0VarG, "createEnumValueOfMethod(...)");
                result.add(g0VarG);
            } else if (AbstractC5504s.c(name, ve.o.f62160d)) {
                g0 g0VarH = bf.h.h(R());
                AbstractC5504s.g(g0VarH, "createEnumValuesMethod(...)");
                result.add(g0VarH);
            }
        }
    }

    @Override // Le.b0, Le.U
    protected void C(Xe.f name, Collection result) {
        Xe.f fVar;
        Collection collection;
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(result, "result");
        Set setP0 = p0(R(), new LinkedHashSet(), new X(name));
        if (result.isEmpty()) {
            fVar = name;
            collection = result;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : setP0) {
                ye.Z zT0 = t0((ye.Z) obj);
                Object arrayList = linkedHashMap.get(zT0);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(zT0, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collectionE = Ie.a.e(fVar, (Collection) ((Map.Entry) it.next()).getValue(), collection, R(), L().a().c(), L().a().k().b());
                AbstractC5504s.g(collectionE, "resolveOverridesForStaticMembers(...)");
                AbstractC2279u.D(arrayList2, collectionE);
            }
            collection.addAll(arrayList2);
        } else {
            fVar = name;
            collection = result;
            Collection collectionE2 = Ie.a.e(fVar, setP0, collection, R(), L().a().c(), L().a().k().b());
            AbstractC5504s.g(collectionE2, "resolveOverridesForStaticMembers(...)");
            collection.addAll(collectionE2);
        }
        if (this.f11467n.v() && AbstractC5504s.c(fVar, ve.o.f62161e)) {
            Af.a.a(collection, bf.h.f(R()));
        }
    }

    @Override // Le.U
    protected Set D(C5380d kindFilter, Function1 function1) {
        AbstractC5504s.h(kindFilter, "kindFilter");
        Set setE1 = AbstractC2279u.e1(((InterfaceC1871c) N().invoke()).e());
        p0(R(), setE1, W.f11462a);
        if (this.f11467n.v()) {
            setE1.add(ve.o.f62161e);
        }
        return setE1;
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5390n
    public InterfaceC7230h e(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Le.U
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public C1870b z() {
        return new C1870b(this.f11467n, V.f11461a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Le.U
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public Je.c R() {
        return this.f11468o;
    }

    @Override // Le.U
    protected Set v(C5380d kindFilter, Function1 function1) {
        AbstractC5504s.h(kindFilter, "kindFilter");
        return Ud.a0.d();
    }

    @Override // Le.U
    protected Set x(C5380d kindFilter, Function1 function1) {
        AbstractC5504s.h(kindFilter, "kindFilter");
        Set setE1 = AbstractC2279u.e1(((InterfaceC1871c) N().invoke()).a());
        a0 a0VarB = Je.h.b(R());
        Set setB = a0VarB != null ? a0VarB.b() : null;
        if (setB == null) {
            setB = Ud.a0.d();
        }
        setE1.addAll(setB);
        if (this.f11467n.v()) {
            setE1.addAll(AbstractC2279u.p(ve.o.f62162f, ve.o.f62160d));
        }
        setE1.addAll(L().a().w().b(R(), L()));
        return setE1;
    }

    @Override // Le.U
    protected void y(Collection result, Xe.f name) {
        AbstractC5504s.h(result, "result");
        AbstractC5504s.h(name, "name");
        L().a().w().f(R(), name, result, L());
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends b.AbstractC0011b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC7227e f11469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f11470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f11471c;

        a(InterfaceC7227e interfaceC7227e, Set set, Function1 function1) {
            this.f11469a = interfaceC7227e;
            this.f11470b = set;
            this.f11471c = function1;
        }

        @Override // Af.b.d
        public /* bridge */ /* synthetic */ Object a() {
            e();
            return Td.L.f17438a;
        }

        @Override // Af.b.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean c(InterfaceC7227e current) {
            AbstractC5504s.h(current, "current");
            if (current == this.f11469a) {
                return true;
            }
            InterfaceC5387k interfaceC5387kO0 = current.o0();
            AbstractC5504s.g(interfaceC5387kO0, "getStaticScope(...)");
            if (!(interfaceC5387kO0 instanceof b0)) {
                return true;
            }
            this.f11470b.addAll((Collection) this.f11471c.invoke(interfaceC5387kO0));
            return false;
        }

        public void e() {
        }
    }
}
