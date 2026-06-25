package A7;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C0005a f318c = new C0005a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile int f319a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewParent f320b;

    /* JADX INFO: renamed from: A7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0005a {
        public /* synthetic */ C0005a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0005a() {
        }
    }

    private final void c() {
        ViewParent viewParent = this.f320b;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(false);
        }
        this.f320b = null;
    }

    @Override // A7.b
    public boolean a(ViewGroup view, MotionEvent event) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(event, "event");
        int i10 = this.f319a;
        return (i10 == -1 || event.getAction() == 1 || view.getId() != i10) ? false : true;
    }

    public final void b() {
        this.f319a = -1;
        c();
    }

    public final void d(int i10, ViewParent viewParent) {
        this.f319a = i10;
        c();
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(true);
            this.f320b = viewParent;
        }
    }
}
