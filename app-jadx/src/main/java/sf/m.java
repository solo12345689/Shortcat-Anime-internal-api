package sf;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import jf.C5380d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7230h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class m extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h kind, String... formatParams) {
        super(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        AbstractC5504s.h(kind, "kind");
        AbstractC5504s.h(formatParams, "formatParams");
    }

    @Override // sf.g, jf.InterfaceC5387k
    public Set b() {
        throw new IllegalStateException();
    }

    @Override // sf.g, jf.InterfaceC5387k
    public Set d() {
        throw new IllegalStateException();
    }

    @Override // sf.g, jf.InterfaceC5390n
    public InterfaceC7230h e(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        throw new IllegalStateException(j() + ", required name: " + name);
    }

    @Override // sf.g, jf.InterfaceC5387k
    public Set f() {
        throw new IllegalStateException();
    }

    @Override // sf.g, jf.InterfaceC5390n
    public Collection g(C5380d kindFilter, Function1 nameFilter) {
        AbstractC5504s.h(kindFilter, "kindFilter");
        AbstractC5504s.h(nameFilter, "nameFilter");
        throw new IllegalStateException(j());
    }

    @Override // sf.g, jf.InterfaceC5387k
    /* JADX INFO: renamed from: h */
    public Set c(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        throw new IllegalStateException(j() + ", required name: " + name);
    }

    @Override // sf.g, jf.InterfaceC5387k
    /* JADX INFO: renamed from: i */
    public Set a(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        throw new IllegalStateException(j() + ", required name: " + name);
    }

    @Override // sf.g
    public String toString() {
        return "ThrowingScope{" + j() + '}';
    }
}
