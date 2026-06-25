package He;

import Le.AbstractC1872d;
import bf.j;
import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7223a;
import ye.InterfaceC7227e;
import ye.Z;

/* JADX INFO: renamed from: He.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1671s implements bf.j {
    @Override // bf.j
    public j.b a(InterfaceC7223a superDescriptor, InterfaceC7223a subDescriptor, InterfaceC7227e interfaceC7227e) {
        AbstractC5504s.h(superDescriptor, "superDescriptor");
        AbstractC5504s.h(subDescriptor, "subDescriptor");
        if (!(subDescriptor instanceof Z) || !(superDescriptor instanceof Z)) {
            return j.b.UNKNOWN;
        }
        Z z10 = (Z) subDescriptor;
        Z z11 = (Z) superDescriptor;
        return !AbstractC5504s.c(z10.getName(), z11.getName()) ? j.b.UNKNOWN : (AbstractC1872d.a(z10) && AbstractC1872d.a(z11)) ? j.b.OVERRIDABLE : (AbstractC1872d.a(z10) || AbstractC1872d.a(z11)) ? j.b.INCOMPATIBLE : j.b.UNKNOWN;
    }

    @Override // bf.j
    public j.a b() {
        return j.a.BOTH;
    }
}
