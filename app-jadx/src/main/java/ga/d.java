package Ga;

import Na.e;
import com.facebook.react.uimanager.C3284b0;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f7440a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final e a(C3284b0 reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        return new e(reactContext);
    }

    public final void b(e view, boolean z10) {
        AbstractC5504s.h(view, "view");
        if (z10) {
            view.C();
        } else {
            view.B();
        }
    }
}
