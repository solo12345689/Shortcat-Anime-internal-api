package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.core.view.AbstractC2775o0;
import androidx.core.view.l1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class z extends w {
    @Override // androidx.activity.u, androidx.activity.C
    public void b(M statusBarStyle, M navigationBarStyle, Window window, View view, boolean z10, boolean z11) {
        AbstractC5504s.h(statusBarStyle, "statusBarStyle");
        AbstractC5504s.h(navigationBarStyle, "navigationBarStyle");
        AbstractC5504s.h(window, "window");
        AbstractC5504s.h(view, "view");
        AbstractC2775o0.b(window, false);
        window.setStatusBarColor(statusBarStyle.e(z10));
        window.setNavigationBarColor(navigationBarStyle.e(z11));
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(navigationBarStyle.c() == 0);
        l1 l1Var = new l1(window, view);
        l1Var.e(!z10);
        l1Var.d(true ^ z11);
    }
}
