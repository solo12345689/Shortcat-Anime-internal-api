package I1;

import android.R;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsController;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f8771a = new x();

    private x() {
    }

    public static final void a(Resources.Theme theme, View decor, TypedValue tv) {
        AbstractC5504s.h(theme, "theme");
        AbstractC5504s.h(decor, "decor");
        AbstractC5504s.h(tv, "tv");
        int i10 = (!theme.resolveAttribute(R.attr.windowLightStatusBar, tv, true) || tv.data == 0) ? 0 : 8;
        if (theme.resolveAttribute(R.attr.windowLightNavigationBar, tv, true) && tv.data != 0) {
            i10 |= 16;
        }
        WindowInsetsController windowInsetsController = decor.getWindowInsetsController();
        AbstractC5504s.e(windowInsetsController);
        windowInsetsController.setSystemBarsAppearance(i10, 24);
    }

    public static /* synthetic */ void b(Resources.Theme theme, View view, TypedValue typedValue, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            typedValue = new TypedValue();
        }
        a(theme, view, typedValue);
    }
}
