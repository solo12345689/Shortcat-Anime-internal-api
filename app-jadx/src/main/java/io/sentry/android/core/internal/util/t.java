package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import io.sentry.android.core.C5131g0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class t implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f49922a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f49923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f49924c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnDrawListener(t.this);
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    private t(View view, Runnable runnable) {
        this.f49923b = new AtomicReference(view);
        this.f49924c = runnable;
    }

    public static /* synthetic */ void a(t tVar, View view) {
        tVar.getClass();
        view.getViewTreeObserver().removeOnDrawListener(tVar);
    }

    public static /* synthetic */ void b(Window window, Window.Callback callback, Runnable runnable, C5131g0 c5131g0) {
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView != null) {
            window.setCallback(callback);
            e(viewPeekDecorView, runnable, c5131g0);
        }
    }

    private static boolean c(View view) {
        return view.getViewTreeObserver().isAlive() && view.isAttachedToWindow();
    }

    public static void d(Activity activity, final Runnable runnable, final C5131g0 c5131g0) {
        final Window window = activity.getWindow();
        if (window != null) {
            View viewPeekDecorView = window.peekDecorView();
            if (viewPeekDecorView != null) {
                e(viewPeekDecorView, runnable, c5131g0);
            } else {
                final Window.Callback callback = window.getCallback();
                window.setCallback(new io.sentry.android.core.performance.j(callback != null ? callback : new io.sentry.android.core.internal.gestures.b(), new Runnable() { // from class: io.sentry.android.core.internal.util.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.b(window, callback, runnable, c5131g0);
                    }
                }));
            }
        }
    }

    public static void e(View view, Runnable runnable, C5131g0 c5131g0) {
        t tVar = new t(view, runnable);
        if (c5131g0.d() >= 26 || c(view)) {
            view.getViewTreeObserver().addOnDrawListener(tVar);
        } else {
            view.addOnAttachStateChangeListener(tVar.new a());
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View view = (View) this.f49923b.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.sentry.android.core.internal.util.s
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                t.a(this.f49920a, view);
            }
        });
        this.f49922a.postAtFrontOfQueue(this.f49924c);
    }
}
