package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;

/* JADX INFO: renamed from: androidx.compose.ui.platform.i0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2705i0 implements InterfaceC2702h0 {

    /* JADX INFO: renamed from: b */
    public static final C2705i0 f27461b = new C2705i0();

    private C2705i0() {
    }

    @Override // androidx.compose.ui.platform.InterfaceC2702h0
    public Rect a(Activity activity) {
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iG = AbstractC2690d0.g(activity);
            int i10 = rect.bottom;
            if (i10 + iG == point.y) {
                rect.bottom = i10 + iG;
                return rect;
            }
            int i11 = rect.right;
            if (i11 + iG == point.x) {
                rect.right = i11 + iG;
            }
        }
        return rect;
    }
}
