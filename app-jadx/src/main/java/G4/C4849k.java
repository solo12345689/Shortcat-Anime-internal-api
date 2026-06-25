package g4;

import android.view.DisplayCutout;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: g4.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4849k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4849k f47343a = new C4849k();

    private C4849k() {
    }

    public final int a(DisplayCutout displayCutout) {
        AbstractC5504s.h(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetBottom();
    }

    public final int b(DisplayCutout displayCutout) {
        AbstractC5504s.h(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetLeft();
    }

    public final int c(DisplayCutout displayCutout) {
        AbstractC5504s.h(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetRight();
    }

    public final int d(DisplayCutout displayCutout) {
        AbstractC5504s.h(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetTop();
    }
}
