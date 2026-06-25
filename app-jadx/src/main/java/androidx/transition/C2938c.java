package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC2946k;

/* JADX INFO: renamed from: androidx.transition.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C2938c extends O {

    /* JADX INFO: renamed from: androidx.transition.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a extends AnimatorListenerAdapter implements AbstractC2946k.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f32384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f32385b = false;

        a(View view) {
            this.f32384a = view;
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void b(AbstractC2946k abstractC2946k) {
            this.f32384a.setTag(AbstractC2943h.f32408d, null);
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void f(AbstractC2946k abstractC2946k) {
            this.f32384a.setTag(AbstractC2943h.f32408d, Float.valueOf(this.f32384a.getVisibility() == 0 ? C.b(this.f32384a) : 0.0f));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C.e(this.f32384a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f32384a.hasOverlappingRendering() && this.f32384a.getLayerType() == 0) {
                this.f32385b = true;
                this.f32384a.setLayerType(2, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f32385b) {
                this.f32384a.setLayerType(0, null);
            }
            if (z10) {
                return;
            }
            C.e(this.f32384a, 1.0f);
            C.a(this.f32384a);
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void e(AbstractC2946k abstractC2946k) {
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void i(AbstractC2946k abstractC2946k) {
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void k(AbstractC2946k abstractC2946k) {
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void l(AbstractC2946k abstractC2946k, boolean z10) {
        }
    }

    public C2938c(int i10) {
        z0(i10);
    }

    private Animator A0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        C.e(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) C.f32323b, f11);
        a aVar = new a(view);
        objectAnimatorOfFloat.addListener(aVar);
        G().d(aVar);
        return objectAnimatorOfFloat;
    }

    private static float C0(y yVar, float f10) {
        Float f11;
        return (yVar == null || (f11 = (Float) yVar.f32493a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    @Override // androidx.transition.AbstractC2946k
    public boolean R() {
        return true;
    }

    @Override // androidx.transition.O, androidx.transition.AbstractC2946k
    public void m(y yVar) {
        super.m(yVar);
        Float fValueOf = (Float) yVar.f32494b.getTag(AbstractC2943h.f32408d);
        if (fValueOf == null) {
            fValueOf = yVar.f32494b.getVisibility() == 0 ? Float.valueOf(C.b(yVar.f32494b)) : Float.valueOf(0.0f);
        }
        yVar.f32493a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // androidx.transition.O
    public Animator v0(ViewGroup viewGroup, View view, y yVar, y yVar2) {
        C.c(view);
        return A0(view, C0(yVar, 0.0f), 1.0f);
    }

    @Override // androidx.transition.O
    public Animator x0(ViewGroup viewGroup, View view, y yVar, y yVar2) {
        C.c(view);
        Animator animatorA0 = A0(view, C0(yVar, 1.0f), 0.0f);
        if (animatorA0 == null) {
            C.e(view, C0(yVar2, 1.0f));
        }
        return animatorA0;
    }

    public C2938c() {
    }
}
