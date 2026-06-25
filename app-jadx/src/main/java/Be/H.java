package Be;

import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7235m;
import ye.InterfaceC7237o;
import ye.h0;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class H extends AbstractC1119n implements ye.N {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Xe.c f1685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f1686f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(ye.H module, Xe.c fqName) {
        super(module, InterfaceC7374h.f66223k0.b(), fqName.g(), h0.f65112a);
        AbstractC5504s.h(module, "module");
        AbstractC5504s.h(fqName, "fqName");
        this.f1685e = fqName;
        this.f1686f = "package " + fqName + " of " + module;
    }

    @Override // ye.InterfaceC7235m
    public Object b0(InterfaceC7237o visitor, Object obj) {
        AbstractC5504s.h(visitor, "visitor");
        return visitor.d(this, obj);
    }

    @Override // ye.N
    public final Xe.c f() {
        return this.f1685e;
    }

    @Override // Be.AbstractC1119n, ye.InterfaceC7238p
    public h0 k() {
        h0 NO_SOURCE = h0.f65112a;
        AbstractC5504s.g(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // Be.AbstractC1118m
    public String toString() {
        return this.f1686f;
    }

    @Override // Be.AbstractC1119n, ye.InterfaceC7235m
    public ye.H b() {
        InterfaceC7235m interfaceC7235mB = super.b();
        AbstractC5504s.f(interfaceC7235mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (ye.H) interfaceC7235mB;
    }
}
