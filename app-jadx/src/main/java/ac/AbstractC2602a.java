package ac;

import android.R;
import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Build;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: ac.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2602a {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            activity.getWindow().setNavigationBarContrastEnforced(c(activity));
        }
    }

    private static final boolean c(Activity activity) {
        TypedArray typedArrayObtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{R.attr.enforceNavigationBarContrast});
        AbstractC5504s.g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            return typedArrayObtainStyledAttributes.getBoolean(0, true);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
