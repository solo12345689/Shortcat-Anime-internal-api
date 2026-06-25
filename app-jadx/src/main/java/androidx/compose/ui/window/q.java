package androidx.compose.ui.window;

import Ud.AbstractC2279u;
import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class q extends r {
    @Override // androidx.compose.ui.window.r, androidx.compose.ui.window.o
    public void c(View view, int i10, int i11) {
        view.setSystemGestureExclusionRects(AbstractC2279u.s(new Rect(0, 0, i10, i11)));
    }
}
