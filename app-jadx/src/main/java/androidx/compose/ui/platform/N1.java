package androidx.compose.ui.platform;

import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class N1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N1 f27333a = new N1();

    private N1() {
    }

    public final void a(AndroidComposeView androidComposeView) {
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
