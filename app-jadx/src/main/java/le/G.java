package Le;

import He.InterfaceC1673u;
import Le.InterfaceC1871c;
import Qe.v;
import Re.a;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import jf.C5380d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.InterfaceC6043h;
import pf.InterfaceC6045j;
import ye.InterfaceC7227e;
import ye.InterfaceC7235m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class G extends b0 {

    /* JADX INFO: renamed from: n */
    private final Oe.u f11416n;

    /* JADX INFO: renamed from: o */
    private final D f11417o;

    /* JADX INFO: renamed from: p */
    private final InterfaceC6045j f11418p;

    /* JADX INFO: renamed from: q */
    private final InterfaceC6043h f11419q;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a {

        /* JADX INFO: renamed from: a */
        private final Xe.f f11420a;

        /* JADX INFO: renamed from: b */
        private final Oe.g f11421b;

        public a(Xe.f name, Oe.g gVar) {
            AbstractC5504s.h(name, "name");
            this.f11420a = name;
            this.f11421b = gVar;
        }

        public final Oe.g a() {
            return this.f11421b;
        }

        public final Xe.f b() {
            return this.f11420a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && AbstractC5504s.c(this.f11420a, ((a) obj).f11420a);
        }

        public int hashCode() {
            return this.f11420a.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static abstract class b {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a extends b {

            /* JADX INFO: renamed from: a */
            private final InterfaceC7227e f11422a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC7227e descriptor) {
                super(null);
                AbstractC5504s.h(descriptor, "descriptor");
                this.f11422a = descriptor;
            }

            public final InterfaceC7227e a() {
                return this.f11422a;
            }
        }

        /* JADX INFO: renamed from: Le.G$b$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0181b extends b {

            /* JADX INFO: renamed from: a */
            public static final C0181b f11423a = new C0181b();

            private C0181b() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class c extends b {

            /* JADX INFO: renamed from: a */
            public static final c f11424a = new c();

            private c() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(Ke.k c10, Oe.u jPackage, D ownerDescriptor) {
        super(c10);
        AbstractC5504s.h(c10, "c");
        AbstractC5504s.h(jPackage, "jPackage");
        AbstractC5504s.h(ownerDescriptor, "ownerDescriptor");
        this.f11416n = jPackage;
        this.f11417o = ownerDescriptor;
        this.f11418p = c10.e().g(new E(c10, this));
        this.f11419q = c10.e().d(new F(this, c10));
    }

    public static final InterfaceC7227e i0(G g10, Ke.k kVar, a request) {
        AbstractC5504s.h(request, "request");
        Xe.b bVar = new Xe.b(g10.R().f(), request.b());
        v.a aVarA = request.a() != null ? kVar.a().j().a(request.a(), g10.m0()) : kVar.a().j().c(bVar, g10.m0());
        Qe.x xVarA = aVarA != null ? aVarA.a() : null;
        Xe.b bVarG = xVarA != null ? xVarA.g() : null;
        if (bVarG != null && (bVarG.j() || bVarG.i())) {
            return null;
        }
        b bVarP0 = g10.p0(xVarA);
        if (bVarP0 instanceof b.a) {
            return ((b.a) bVarP0).a();
        }
        if (bVarP0 instanceof b.c) {
            return null;
        }
        if (!(bVarP0 instanceof b.C0181b)) {
            throw new Td.r();
        }
        Oe.g gVarA = request.a();
        if (gVarA == null) {
            gVarA = kVar.a().d().b(new InterfaceC1673u.a(bVar, null, null, 4, null));
        }
        Oe.g gVar = gVarA;
        if ((gVar != null ? gVar.K() : null) != Oe.D.f13155b) {
            Xe.c cVarF = gVar != null ? gVar.f() : null;
            if (cVarF == null || cVarF.c() || !AbstractC5504s.c(cVarF.d(), g10.R().f())) {
                return null;
            }
            C1882n c1882n = new C1882n(kVar, g10.R(), gVar, null, 8, null);
            kVar.a().e().a(c1882n);
            return c1882n;
        }
        throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + gVar + "\nClassId: " + bVar + "\nfindKotlinClass(JavaClass) = " + Qe.w.a(kVar.a().j(), gVar, g10.m0()) + "\nfindKotlinClass(ClassId) = " + Qe.w.b(kVar.a().j(), bVar, g10.m0()) + '\n');
    }

    private final InterfaceC7227e j0(Xe.f fVar, Oe.g gVar) {
        if (!Xe.h.f21780a.a(fVar)) {
            return null;
        }
        Set set = (Set) this.f11418p.invoke();
        if (gVar != null || set == null || set.contains(fVar.b())) {
            return (InterfaceC7227e) this.f11419q.invoke(new a(fVar, gVar));
        }
        return null;
    }

    private final Ue.c m0() {
        return L().a().b().f().g().d();
    }

    public static final Set o0(Ke.k kVar, G g10) {
        return kVar.a().d().c(g10.R().f());
    }

    private final b p0(Qe.x xVar) {
        if (xVar == null) {
            return b.C0181b.f11423a;
        }
        if (xVar.d().c() != a.EnumC0265a.f15479e) {
            return b.c.f11424a;
        }
        InterfaceC7227e interfaceC7227eN = L().a().b().n(xVar);
        return interfaceC7227eN != null ? new b.a(interfaceC7227eN) : b.C0181b.f11423a;
    }

    @Override // Le.U
    protected void B(Collection result, Xe.f name) {
        AbstractC5504s.h(result, "result");
        AbstractC5504s.h(name, "name");
    }

    @Override // Le.U
    protected Set D(C5380d kindFilter, Function1 function1) {
        AbstractC5504s.h(kindFilter, "kindFilter");
        return Ud.a0.d();
    }

    @Override // Le.U, jf.AbstractC5388l, jf.InterfaceC5387k
    public Collection a(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        return AbstractC2279u.m();
    }

    @Override // Le.U, jf.AbstractC5388l, jf.InterfaceC5390n
    public Collection g(C5380d kindFilter, Function1 nameFilter) {
        AbstractC5504s.h(kindFilter, "kindFilter");
        AbstractC5504s.h(nameFilter, "nameFilter");
        C5380d.a aVar = C5380d.f51759c;
        if (!kindFilter.a(aVar.e() | aVar.c())) {
            return AbstractC2279u.m();
        }
        Iterable iterable = (Iterable) K().invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            InterfaceC7235m interfaceC7235m = (InterfaceC7235m) obj;
            if (interfaceC7235m instanceof InterfaceC7227e) {
                Xe.f name = ((InterfaceC7227e) interfaceC7235m).getName();
                AbstractC5504s.g(name, "getName(...)");
                if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public final InterfaceC7227e k0(Oe.g javaClass) {
        AbstractC5504s.h(javaClass, "javaClass");
        return j0(javaClass.getName(), javaClass);
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5390n
    /* JADX INFO: renamed from: l0 */
    public InterfaceC7227e e(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        return j0(name, null);
    }

    @Override // Le.U
    /* JADX INFO: renamed from: n0 */
    public D R() {
        return this.f11417o;
    }

    @Override // Le.U
    protected Set v(C5380d kindFilter, Function1 function1) {
        AbstractC5504s.h(kindFilter, "kindFilter");
        if (!kindFilter.a(C5380d.f51759c.e())) {
            return Ud.a0.d();
        }
        Set set = (Set) this.f11418p.invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(Xe.f.m((String) it.next()));
            }
            return hashSet;
        }
        Oe.u uVar = this.f11416n;
        if (function1 == null) {
            function1 = Af.i.k();
        }
        Collection<Oe.g> collectionF = uVar.F(function1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Oe.g gVar : collectionF) {
            Xe.f name = gVar.K() == Oe.D.f13154a ? null : gVar.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // Le.U
    protected Set x(C5380d kindFilter, Function1 function1) {
        AbstractC5504s.h(kindFilter, "kindFilter");
        return Ud.a0.d();
    }

    @Override // Le.U
    protected InterfaceC1871c z() {
        return InterfaceC1871c.a.f11478a;
    }
}
