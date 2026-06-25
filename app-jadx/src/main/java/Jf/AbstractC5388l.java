package jf;

import Ud.AbstractC2279u;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7230h;
import ye.g0;

/* JADX INFO: renamed from: jf.l */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC5388l implements InterfaceC5387k {
    @Override // jf.InterfaceC5387k
    public Collection a(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        return AbstractC2279u.m();
    }

    @Override // jf.InterfaceC5387k
    public Set b() {
        Collection collectionG = g(C5380d.f51778v, Af.i.k());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionG) {
            if (obj instanceof g0) {
                Xe.f name = ((g0) obj).getName();
                AbstractC5504s.g(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // jf.InterfaceC5387k
    public Collection c(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        return AbstractC2279u.m();
    }

    @Override // jf.InterfaceC5387k
    public Set d() {
        Collection collectionG = g(C5380d.f51779w, Af.i.k());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionG) {
            if (obj instanceof g0) {
                Xe.f name = ((g0) obj).getName();
                AbstractC5504s.g(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // jf.InterfaceC5390n
    public InterfaceC7230h e(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        return null;
    }

    @Override // jf.InterfaceC5387k
    public Set f() {
        return null;
    }

    @Override // jf.InterfaceC5390n
    public Collection g(C5380d kindFilter, Function1 nameFilter) {
        AbstractC5504s.h(kindFilter, "kindFilter");
        AbstractC5504s.h(nameFilter, "nameFilter");
        return AbstractC2279u.m();
    }
}
