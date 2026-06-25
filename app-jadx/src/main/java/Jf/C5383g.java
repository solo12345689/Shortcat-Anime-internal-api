package jf;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7231i;
import ye.l0;

/* JADX INFO: renamed from: jf.g */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5383g extends AbstractC5388l {

    /* JADX INFO: renamed from: b */
    private final InterfaceC5387k f51793b;

    public C5383g(InterfaceC5387k workerScope) {
        AbstractC5504s.h(workerScope, "workerScope");
        this.f51793b = workerScope;
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5387k
    public Set b() {
        return this.f51793b.b();
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5387k
    public Set d() {
        return this.f51793b.d();
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5390n
    public InterfaceC7230h e(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        InterfaceC7230h interfaceC7230hE = this.f51793b.e(name, location);
        if (interfaceC7230hE != null) {
            InterfaceC7227e interfaceC7227e = interfaceC7230hE instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7230hE : null;
            if (interfaceC7227e != null) {
                return interfaceC7227e;
            }
            if (interfaceC7230hE instanceof l0) {
                return (l0) interfaceC7230hE;
            }
        }
        return null;
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5387k
    public Set f() {
        return this.f51793b.f();
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5390n
    /* JADX INFO: renamed from: h */
    public List g(C5380d kindFilter, Function1 nameFilter) {
        AbstractC5504s.h(kindFilter, "kindFilter");
        AbstractC5504s.h(nameFilter, "nameFilter");
        C5380d c5380dN = kindFilter.n(C5380d.f51759c.c());
        if (c5380dN == null) {
            return AbstractC2279u.m();
        }
        Collection collectionG = this.f51793b.g(c5380dN, nameFilter);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionG) {
            if (obj instanceof InterfaceC7231i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public String toString() {
        return "Classes from " + this.f51793b;
    }
}
