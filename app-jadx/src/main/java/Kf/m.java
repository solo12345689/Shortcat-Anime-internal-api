package Kf;

import Jf.InterfaceC1742e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface m extends InterfaceC1742e {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public static /* synthetic */ InterfaceC1742e a(m mVar, Zd.i iVar, int i10, If.a aVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i11 & 1) != 0) {
                iVar = Zd.j.f23275a;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                aVar = If.a.f9114a;
            }
            return mVar.a(iVar, i10, aVar);
        }
    }

    InterfaceC1742e a(Zd.i iVar, int i10, If.a aVar);
}
