package L1;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: L1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1865b {

    /* JADX INFO: renamed from: L1.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {
        static void a(AccessibilityEvent accessibilityEvent, boolean z10) {
            accessibilityEvent.setAccessibilityDataSensitive(z10);
        }
    }

    public static int a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static void b(AccessibilityEvent accessibilityEvent, boolean z10) {
        if (Build.VERSION.SDK_INT >= 34) {
            a.a(accessibilityEvent, z10);
        }
    }

    public static void c(AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setContentChangeTypes(i10);
    }
}
