package androidx.compose.ui.platform;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M f27306a = new M();

    private M() {
    }

    public final void a(View view, int i10, boolean z10) {
        view.setFocusable(i10);
        view.setDefaultFocusHighlightEnabled(z10);
    }
}
