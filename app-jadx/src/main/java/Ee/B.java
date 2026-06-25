package Ee;

import Oe.InterfaceC1980a;
import Ud.AbstractC2279u;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class B extends u implements Oe.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Xe.c f5901a;

    public B(Xe.c fqName) {
        AbstractC5504s.h(fqName, "fqName");
        this.f5901a = fqName;
    }

    @Override // Oe.InterfaceC1983d
    public boolean D() {
        return false;
    }

    @Override // Oe.u
    public Collection F(Function1 nameFilter) {
        AbstractC5504s.h(nameFilter, "nameFilter");
        return AbstractC2279u.m();
    }

    public boolean equals(Object obj) {
        return (obj instanceof B) && AbstractC5504s.c(f(), ((B) obj).f());
    }

    @Override // Oe.u
    public Xe.c f() {
        return this.f5901a;
    }

    @Override // Oe.InterfaceC1983d
    public InterfaceC1980a h(Xe.c fqName) {
        AbstractC5504s.h(fqName, "fqName");
        return null;
    }

    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return B.class.getName() + ": " + f();
    }

    @Override // Oe.u
    public Collection u() {
        return AbstractC2279u.m();
    }

    @Override // Oe.InterfaceC1983d
    public List getAnnotations() {
        return AbstractC2279u.m();
    }
}
