package androidx.compose.foundation.relocation;

import I0.InterfaceC1690p;
import K0.InterfaceC1794j;
import K0.J0;
import r0.C6226h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class d {
    public static final H.a b(InterfaceC1794j interfaceC1794j) {
        if (!interfaceC1794j.getNode().isAttached()) {
            return null;
        }
        H.a aVar = (H.a) J0.a(interfaceC1794j, f.f26374d);
        return aVar == null ? H.d.b(interfaceC1794j) : aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6226h c(InterfaceC1690p interfaceC1690p, InterfaceC1690p interfaceC1690p2, C6226h c6226h) {
        return c6226h.t(interfaceC1690p.w0(interfaceC1690p2, false).m());
    }
}
