package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class L implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f28950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewTreeObserver f28951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f28952c;

    private L(View view, Runnable runnable) {
        this.f28950a = view;
        this.f28951b = view.getViewTreeObserver();
        this.f28952c = runnable;
    }

    public static L a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        L l10 = new L(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(l10);
        view.addOnAttachStateChangeListener(l10);
        return l10;
    }

    public void b() {
        if (this.f28951b.isAlive()) {
            this.f28951b.removeOnPreDrawListener(this);
        } else {
            this.f28950a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f28950a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f28952c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f28951b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
