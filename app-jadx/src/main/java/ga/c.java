package Ga;

import La.f;
import com.facebook.react.uimanager.C3284b0;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f7439a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final f a(C3284b0 reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        return new f(reactContext);
    }

    public final void b(f view, String interpolator) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(interpolator, "interpolator");
        view.setInterpolator(interpolator);
    }

    public final void c(f view, double d10) {
        AbstractC5504s.h(view, "view");
        view.setOffset(d10);
    }

    public final void d(f view, boolean z10) {
        AbstractC5504s.h(view, "view");
        view.setScrollKeyboardOffScreenWhenVisible(z10);
    }

    public final void e(f view, boolean z10) {
        AbstractC5504s.h(view, "view");
        view.setScrollKeyboardOnScreenWhenNotVisible(z10);
    }
}
