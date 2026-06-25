package mf;

import jf.InterfaceC5387k;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class r extends Be.H {

    /* JADX INFO: renamed from: g */
    private final pf.n f53468g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Xe.c fqName, pf.n storageManager, ye.H module) {
        super(module, fqName);
        AbstractC5504s.h(fqName, "fqName");
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(module, "module");
        this.f53468g = storageManager;
    }

    public abstract InterfaceC5679j H0();

    public boolean K0(Xe.f name) {
        AbstractC5504s.h(name, "name");
        InterfaceC5387k interfaceC5387kO = o();
        return (interfaceC5387kO instanceof of.w) && ((of.w) interfaceC5387kO).t().contains(name);
    }

    public abstract void L0(C5683n c5683n);
}
