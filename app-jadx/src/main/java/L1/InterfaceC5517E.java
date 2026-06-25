package l1;

import i1.C5015h;
import l1.AbstractC5527i;

/* JADX INFO: renamed from: l1.E */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5517E {
    static /* synthetic */ void a(InterfaceC5517E interfaceC5517E, AbstractC5527i.c cVar, float f10, float f11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkTo-VpY3zN4");
        }
        if ((i10 & 2) != 0) {
            f10 = C5015h.n(0);
        }
        if ((i10 & 4) != 0) {
            f11 = C5015h.n(0);
        }
        interfaceC5517E.b(cVar, f10, f11);
    }

    void b(AbstractC5527i.c cVar, float f10, float f11);
}
