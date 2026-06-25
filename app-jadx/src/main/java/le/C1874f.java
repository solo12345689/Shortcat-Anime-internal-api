package Le;

import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import jf.AbstractC5389m;
import jf.C5380d;
import jf.InterfaceC5387k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6023m;
import pf.AbstractC6048m;
import pf.InterfaceC6044i;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7231i;
import zf.AbstractC7385a;

/* JADX INFO: renamed from: Le.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1874f implements InterfaceC5387k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ InterfaceC6023m[] f11482f = {kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(C1874f.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ke.k f11483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D f11484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final G f11485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC6044i f11486e;

    public C1874f(Ke.k c10, Oe.u jPackage, D packageFragment) {
        AbstractC5504s.h(c10, "c");
        AbstractC5504s.h(jPackage, "jPackage");
        AbstractC5504s.h(packageFragment, "packageFragment");
        this.f11483b = c10;
        this.f11484c = packageFragment;
        this.f11485d = new G(c10, jPackage, packageFragment);
        this.f11486e = c10.e().c(new C1873e(this));
    }

    private final InterfaceC5387k[] j() {
        return (InterfaceC5387k[]) AbstractC6048m.a(this.f11486e, this, f11482f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5387k[] k(C1874f c1874f) {
        Collection collectionValues = c1874f.f11484c.O0().values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            InterfaceC5387k interfaceC5387kC = c1874f.f11483b.a().b().c(c1874f.f11484c, (Qe.x) it.next());
            if (interfaceC5387kC != null) {
                arrayList.add(interfaceC5387kC);
            }
        }
        return (InterfaceC5387k[]) AbstractC7385a.b(arrayList).toArray(new InterfaceC5387k[0]);
    }

    @Override // jf.InterfaceC5387k
    public Collection a(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        l(name, location);
        G g10 = this.f11485d;
        InterfaceC5387k[] interfaceC5387kArrJ = j();
        Collection collectionA = g10.a(name, location);
        for (InterfaceC5387k interfaceC5387k : interfaceC5387kArrJ) {
            collectionA = AbstractC7385a.a(collectionA, interfaceC5387k.a(name, location));
        }
        return collectionA == null ? Ud.a0.d() : collectionA;
    }

    @Override // jf.InterfaceC5387k
    public Set b() {
        InterfaceC5387k[] interfaceC5387kArrJ = j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC5387k interfaceC5387k : interfaceC5387kArrJ) {
            AbstractC2279u.D(linkedHashSet, interfaceC5387k.b());
        }
        linkedHashSet.addAll(this.f11485d.b());
        return linkedHashSet;
    }

    @Override // jf.InterfaceC5387k
    public Collection c(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        l(name, location);
        G g10 = this.f11485d;
        InterfaceC5387k[] interfaceC5387kArrJ = j();
        Collection collectionC = g10.c(name, location);
        for (InterfaceC5387k interfaceC5387k : interfaceC5387kArrJ) {
            collectionC = AbstractC7385a.a(collectionC, interfaceC5387k.c(name, location));
        }
        return collectionC == null ? Ud.a0.d() : collectionC;
    }

    @Override // jf.InterfaceC5387k
    public Set d() {
        InterfaceC5387k[] interfaceC5387kArrJ = j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC5387k interfaceC5387k : interfaceC5387kArrJ) {
            AbstractC2279u.D(linkedHashSet, interfaceC5387k.d());
        }
        linkedHashSet.addAll(this.f11485d.d());
        return linkedHashSet;
    }

    @Override // jf.InterfaceC5390n
    public InterfaceC7230h e(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        l(name, location);
        InterfaceC7227e interfaceC7227eE = this.f11485d.e(name, location);
        if (interfaceC7227eE != null) {
            return interfaceC7227eE;
        }
        InterfaceC7230h interfaceC7230h = null;
        for (InterfaceC5387k interfaceC5387k : j()) {
            InterfaceC7230h interfaceC7230hE = interfaceC5387k.e(name, location);
            if (interfaceC7230hE != null) {
                if (!(interfaceC7230hE instanceof InterfaceC7231i) || !((ye.D) interfaceC7230hE).m0()) {
                    return interfaceC7230hE;
                }
                if (interfaceC7230h == null) {
                    interfaceC7230h = interfaceC7230hE;
                }
            }
        }
        return interfaceC7230h;
    }

    @Override // jf.InterfaceC5387k
    public Set f() {
        Set setA = AbstractC5389m.a(AbstractC2273n.L(j()));
        if (setA == null) {
            return null;
        }
        setA.addAll(this.f11485d.f());
        return setA;
    }

    @Override // jf.InterfaceC5390n
    public Collection g(C5380d kindFilter, Function1 nameFilter) {
        AbstractC5504s.h(kindFilter, "kindFilter");
        AbstractC5504s.h(nameFilter, "nameFilter");
        G g10 = this.f11485d;
        InterfaceC5387k[] interfaceC5387kArrJ = j();
        Collection collectionG = g10.g(kindFilter, nameFilter);
        for (InterfaceC5387k interfaceC5387k : interfaceC5387kArrJ) {
            collectionG = AbstractC7385a.a(collectionG, interfaceC5387k.g(kindFilter, nameFilter));
        }
        return collectionG == null ? Ud.a0.d() : collectionG;
    }

    public final G i() {
        return this.f11485d;
    }

    public void l(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        Fe.a.b(this.f11483b.a().l(), location, this.f11484c, name);
    }

    public String toString() {
        return "scope for " + this.f11484c;
    }
}
