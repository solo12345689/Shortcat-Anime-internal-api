package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: androidx.compose.ui.platform.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2693e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2693e0 f27449a = new C2693e0();

    private C2693e0() {
    }

    public final int a(AccessibilityManager accessibilityManager, int i10, int i11) {
        return accessibilityManager.getRecommendedTimeoutMillis(i10, i11);
    }
}
