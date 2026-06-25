package F;

import F.InterfaceC1533d;
import a0.C2507c;

/* JADX INFO: renamed from: F.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1534e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(C2507c c2507c, int i10) {
        int iP = c2507c.p() - 1;
        int i11 = 0;
        while (i11 < iP) {
            int i12 = ((iP - i11) / 2) + i11;
            int iB = ((InterfaceC1533d.a) c2507c.o()[i12]).b();
            if (iB != i10) {
                if (iB < i10) {
                    i11 = i12 + 1;
                    if (i10 < ((InterfaceC1533d.a) c2507c.o()[i11]).b()) {
                    }
                } else {
                    iP = i12 - 1;
                }
            }
            return i12;
        }
        return i11;
    }
}
