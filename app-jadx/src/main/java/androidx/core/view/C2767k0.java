package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: androidx.core.view.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2767k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f29058a;

    /* JADX INFO: renamed from: androidx.core.view.k0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2769l0 f29059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f29060b;

        a(InterfaceC2769l0 interfaceC2769l0, View view) {
            this.f29059a = interfaceC2769l0;
            this.f29060b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f29059a.a(this.f29060b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f29059a.b(this.f29060b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f29059a.c(this.f29060b);
        }
    }

    C2767k0(View view) {
        this.f29058a = new WeakReference(view);
    }

    private void h(View view, InterfaceC2769l0 interfaceC2769l0) {
        if (interfaceC2769l0 != null) {
            view.animate().setListener(new a(interfaceC2769l0, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public C2767k0 b(float f10) {
        View view = (View) this.f29058a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f29058a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f29058a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public C2767k0 e(long j10) {
        View view = (View) this.f29058a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public C2767k0 f(Interpolator interpolator) {
        View view = (View) this.f29058a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public C2767k0 g(InterfaceC2769l0 interfaceC2769l0) {
        View view = (View) this.f29058a.get();
        if (view != null) {
            h(view, interfaceC2769l0);
        }
        return this;
    }

    public C2767k0 i(long j10) {
        View view = (View) this.f29058a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public C2767k0 j(final InterfaceC2773n0 interfaceC2773n0) {
        final View view = (View) this.f29058a.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC2773n0 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.j0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    interfaceC2773n0.a(view);
                }
            } : null);
        }
        return this;
    }

    public void k() {
        View view = (View) this.f29058a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public C2767k0 l(float f10) {
        View view = (View) this.f29058a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
