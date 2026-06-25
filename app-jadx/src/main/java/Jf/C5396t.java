package jf;

import Td.AbstractC2163n;
import cf.AbstractC3103e;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import jf.InterfaceC5390n;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import qf.E0;
import qf.G0;
import ye.InterfaceC7230h;
import ye.InterfaceC7235m;
import ye.j0;

/* JADX INFO: renamed from: jf.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5396t implements InterfaceC5387k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5387k f51810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f51811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final G0 f51812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f51813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f51814f;

    public C5396t(InterfaceC5387k workerScope, G0 givenSubstitutor) {
        AbstractC5504s.h(workerScope, "workerScope");
        AbstractC5504s.h(givenSubstitutor, "givenSubstitutor");
        this.f51810b = workerScope;
        this.f51811c = AbstractC2163n.b(new C5394r(givenSubstitutor));
        E0 e0J = givenSubstitutor.j();
        AbstractC5504s.g(e0J, "getSubstitution(...)");
        this.f51812d = AbstractC3103e.h(e0J, false, 1, null).c();
        this.f51814f = AbstractC2163n.b(new C5395s(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection h(C5396t c5396t) {
        return c5396t.l(InterfaceC5390n.a.a(c5396t.f51810b, null, null, 3, null));
    }

    private final Collection k() {
        return (Collection) this.f51814f.getValue();
    }

    private final Collection l(Collection collection) {
        if (this.f51812d.k() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSetG = Af.a.g(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSetG.add(m((InterfaceC7235m) it.next()));
        }
        return linkedHashSetG;
    }

    private final InterfaceC7235m m(InterfaceC7235m interfaceC7235m) {
        if (this.f51812d.k()) {
            return interfaceC7235m;
        }
        if (this.f51813e == null) {
            this.f51813e = new HashMap();
        }
        Map map = this.f51813e;
        AbstractC5504s.e(map);
        Object objC = map.get(interfaceC7235m);
        if (objC == null) {
            if (!(interfaceC7235m instanceof j0)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + interfaceC7235m).toString());
            }
            objC = ((j0) interfaceC7235m).c(this.f51812d);
            if (objC == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + interfaceC7235m + " substitution fails");
            }
            map.put(interfaceC7235m, objC);
        }
        InterfaceC7235m interfaceC7235m2 = (InterfaceC7235m) objC;
        AbstractC5504s.f(interfaceC7235m2, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return interfaceC7235m2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 n(G0 g02) {
        return g02.j().c();
    }

    @Override // jf.InterfaceC5387k
    public Collection a(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        return l(this.f51810b.a(name, location));
    }

    @Override // jf.InterfaceC5387k
    public Set b() {
        return this.f51810b.b();
    }

    @Override // jf.InterfaceC5387k
    public Collection c(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        return l(this.f51810b.c(name, location));
    }

    @Override // jf.InterfaceC5387k
    public Set d() {
        return this.f51810b.d();
    }

    @Override // jf.InterfaceC5390n
    public InterfaceC7230h e(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        InterfaceC7230h interfaceC7230hE = this.f51810b.e(name, location);
        if (interfaceC7230hE != null) {
            return (InterfaceC7230h) m(interfaceC7230hE);
        }
        return null;
    }

    @Override // jf.InterfaceC5387k
    public Set f() {
        return this.f51810b.f();
    }

    @Override // jf.InterfaceC5390n
    public Collection g(C5380d kindFilter, Function1 nameFilter) {
        AbstractC5504s.h(kindFilter, "kindFilter");
        AbstractC5504s.h(nameFilter, "nameFilter");
        return k();
    }
}
