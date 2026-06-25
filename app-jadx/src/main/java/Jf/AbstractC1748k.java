package Jf;

import Gf.C0;
import Kf.m;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Jf.k */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
abstract /* synthetic */ class AbstractC1748k {
    public static final InterfaceC1742e a(InterfaceC1742e interfaceC1742e, int i10, If.a aVar) {
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
        }
        if (i10 == -1 && aVar != If.a.f9114a) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == -1) {
            aVar = If.a.f9115b;
            i10 = 0;
        }
        int i11 = i10;
        If.a aVar2 = aVar;
        return interfaceC1742e instanceof Kf.m ? m.a.a((Kf.m) interfaceC1742e, null, i11, aVar2, 1, null) : new Kf.h(interfaceC1742e, null, i11, aVar2, 2, null);
    }

    public static /* synthetic */ InterfaceC1742e b(InterfaceC1742e interfaceC1742e, int i10, If.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            aVar = If.a.f9114a;
        }
        return AbstractC1744g.c(interfaceC1742e, i10, aVar);
    }

    private static final void c(Zd.i iVar) {
        if (iVar.l(C0.f7490K) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + iVar).toString());
    }

    public static final InterfaceC1742e d(InterfaceC1742e interfaceC1742e) {
        return b(interfaceC1742e, -1, null, 2, null);
    }

    public static final InterfaceC1742e e(InterfaceC1742e interfaceC1742e, Zd.i iVar) {
        c(iVar);
        return AbstractC5504s.c(iVar, Zd.j.f23275a) ? interfaceC1742e : interfaceC1742e instanceof Kf.m ? m.a.a((Kf.m) interfaceC1742e, iVar, 0, null, 6, null) : new Kf.h(interfaceC1742e, iVar, 0, null, 12, null);
    }
}
