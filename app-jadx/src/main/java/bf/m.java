package bf;

import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7224b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class m extends n {
    @Override // bf.n
    public void b(InterfaceC7224b first, InterfaceC7224b second) {
        AbstractC5504s.h(first, "first");
        AbstractC5504s.h(second, "second");
        e(first, second);
    }

    @Override // bf.n
    public void c(InterfaceC7224b fromSuper, InterfaceC7224b fromCurrent) {
        AbstractC5504s.h(fromSuper, "fromSuper");
        AbstractC5504s.h(fromCurrent, "fromCurrent");
        e(fromSuper, fromCurrent);
    }

    protected abstract void e(InterfaceC7224b interfaceC7224b, InterfaceC7224b interfaceC7224b2);
}
