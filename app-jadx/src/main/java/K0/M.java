package K0;

import androidx.compose.ui.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class M {
    /* JADX INFO: Access modifiers changed from: private */
    public static final e.c b(InterfaceC1794j interfaceC1794j) {
        int iA = AbstractC1789g0.a(4);
        int iA2 = AbstractC1789g0.a(2);
        e.c child$ui_release = interfaceC1794j.getNode().getChild$ui_release();
        if (child$ui_release == null || (child$ui_release.getAggregateChildKindSet$ui_release() & iA) == 0) {
            return null;
        }
        while (child$ui_release != null && (child$ui_release.getKindSet$ui_release() & iA2) == 0) {
            if ((child$ui_release.getKindSet$ui_release() & iA) != 0) {
                return child$ui_release;
            }
            child$ui_release = child$ui_release.getChild$ui_release();
        }
        return null;
    }
}
