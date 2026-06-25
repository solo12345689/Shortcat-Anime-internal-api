package h5;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import b5.P;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Set f47609a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile boolean f47610b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements ViewTreeObserver.OnDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f47611a;

        /* JADX INFO: renamed from: h5.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class RunnableC0765a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnDrawListener f47613a;

            RunnableC0765a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f47613a = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                P.b().h();
                h.this.f47610b = true;
                h.b(a.this.f47611a, this.f47613a);
                h.this.f47609a.clear();
            }
        }

        a(View view) {
            this.f47611a = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            o5.l.w(new RunnableC0765a(this));
        }
    }

    h() {
    }

    static void b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // h5.i
    public void a(Activity activity) {
        if (!this.f47610b && this.f47609a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}
