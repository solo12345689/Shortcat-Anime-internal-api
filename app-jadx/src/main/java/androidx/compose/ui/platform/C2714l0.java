package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: renamed from: androidx.compose.ui.platform.l0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2714l0 implements InterfaceC2702h0 {

    /* JADX INFO: renamed from: b */
    public static final C2714l0 f27481b = new C2714l0();

    private C2714l0() {
    }

    @Override // androidx.compose.ui.platform.InterfaceC2702h0
    public Rect a(Activity activity) {
        return ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
    }
}
