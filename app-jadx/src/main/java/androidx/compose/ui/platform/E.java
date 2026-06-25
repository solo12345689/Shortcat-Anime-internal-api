package androidx.compose.ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class E implements ViewTranslationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E f27210a = new E();

    private E() {
    }

    public boolean onClearTranslation(View view) {
        AbstractC5504s.f(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager().r();
        return true;
    }

    public boolean onHideTranslation(View view) {
        AbstractC5504s.f(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager().t();
        return true;
    }

    public boolean onShowTranslation(View view) {
        AbstractC5504s.f(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager().x();
        return true;
    }
}
