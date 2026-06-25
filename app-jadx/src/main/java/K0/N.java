package K0;

import Td.C2160k;
import i1.AbstractC5013f;
import i1.InterfaceC5011d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class N {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC5011d f10496a = AbstractC5013f.b(1.0f, 0.0f, 2, null);

    public static final p0 b(J j10) {
        p0 p0VarZ0 = j10.z0();
        if (p0VarZ0 != null) {
            return p0VarZ0;
        }
        H0.a.c("LayoutNode should be attached to an owner");
        throw new C2160k();
    }
}
