package jf;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7230h;

/* JADX INFO: renamed from: jf.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC5377a implements InterfaceC5387k {
    @Override // jf.InterfaceC5387k
    public Collection a(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        return i().a(name, location);
    }

    @Override // jf.InterfaceC5387k
    public Set b() {
        return i().b();
    }

    @Override // jf.InterfaceC5387k
    public Collection c(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        return i().c(name, location);
    }

    @Override // jf.InterfaceC5387k
    public Set d() {
        return i().d();
    }

    @Override // jf.InterfaceC5390n
    public InterfaceC7230h e(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        return i().e(name, location);
    }

    @Override // jf.InterfaceC5387k
    public Set f() {
        return i().f();
    }

    @Override // jf.InterfaceC5390n
    public Collection g(C5380d kindFilter, Function1 nameFilter) {
        AbstractC5504s.h(kindFilter, "kindFilter");
        AbstractC5504s.h(nameFilter, "nameFilter");
        return i().g(kindFilter, nameFilter);
    }

    public final InterfaceC5387k h() {
        if (!(i() instanceof AbstractC5377a)) {
            return i();
        }
        InterfaceC5387k interfaceC5387kI = i();
        AbstractC5504s.f(interfaceC5387kI, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((AbstractC5377a) interfaceC5387kI).h();
    }

    protected abstract InterfaceC5387k i();
}
