package androidx.core.view;

import android.graphics.Insets;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DisplayCutout f29116a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {
        static List a(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        static int b(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b {
        static Insets a(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    private r(DisplayCutout displayCutout) {
        this.f29116a = displayCutout;
    }

    static r g(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new r(displayCutout);
    }

    public List a() {
        return Build.VERSION.SDK_INT >= 28 ? a.a(this.f29116a) : Collections.EMPTY_LIST;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.b(this.f29116a);
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.c(this.f29116a);
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.d(this.f29116a);
        }
        return 0;
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.e(this.f29116a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        return K1.b.a(this.f29116a, ((r) obj).f29116a);
    }

    public A1.b f() {
        return Build.VERSION.SDK_INT >= 30 ? A1.b.f(b.a(this.f29116a)) : A1.b.f103e;
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f29116a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f29116a + "}";
    }
}
