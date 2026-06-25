package androidx.compose.ui.window;

import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f27824a = new e();

    private e() {
    }

    public final void a(WindowManager.LayoutParams layoutParams, int i10) {
        layoutParams.setFitInsetsSides(i10);
    }

    public final void b(WindowManager.LayoutParams layoutParams, int i10) {
        layoutParams.setFitInsetsTypes(i10);
    }
}
