package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.imageutils.JfifUtil;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o9.AbstractC5838a;
import p9.AbstractC5946a;
import y1.AbstractC7194b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f41915m = AbstractC5838a.f54648m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f41916n = AbstractC5838a.f54652o0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f41917o = AbstractC5838a.f54662t0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f41918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TimeInterpolator f41921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TimeInterpolator f41922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f41923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AccessibilityManager f41924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AccessibilityManager.TouchExplorationStateChangeListener f41925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f41926i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f41927j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f41928k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ViewPropertyAnimator f41929l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f41929l = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f41918a = new LinkedHashSet();
        this.f41923f = 0;
        this.f41926i = true;
        this.f41927j = 2;
        this.f41928k = 0;
    }

    public static /* synthetic */ void E(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior, View view, boolean z10) {
        if (!z10) {
            hideBottomViewOnScrollBehavior.getClass();
        } else if (hideBottomViewOnScrollBehavior.L()) {
            hideBottomViewOnScrollBehavior.P(view);
        }
    }

    private void J(View view, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f41929l = view.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new b());
    }

    private void K(final View view) {
        if (this.f41924g == null) {
            this.f41924g = (AccessibilityManager) AbstractC7194b.j(view.getContext(), AccessibilityManager.class);
        }
        if (this.f41924g == null || this.f41925h != null) {
            return;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: r9.a
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                HideBottomViewOnScrollBehavior.E(this.f58723a, view, z10);
            }
        };
        this.f41925h = touchExplorationStateChangeListener;
        this.f41924g.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        view.addOnAttachStateChangeListener(new a());
    }

    private void R(View view, int i10) {
        this.f41927j = i10;
        Iterator it = this.f41918a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        return i10 == 2;
    }

    public boolean L() {
        return this.f41927j == 1;
    }

    public boolean M() {
        return this.f41927j == 2;
    }

    public void N(View view) {
        O(view, true);
    }

    public void O(View view, boolean z10) {
        AccessibilityManager accessibilityManager;
        if (L()) {
            return;
        }
        if (this.f41926i && (accessibilityManager = this.f41924g) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f41929l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        R(view, 1);
        int i10 = this.f41923f + this.f41928k;
        if (z10) {
            J(view, i10, this.f41920c, this.f41922e);
        } else {
            view.setTranslationY(i10);
        }
    }

    public void P(View view) {
        Q(view, true);
    }

    public void Q(View view, boolean z10) {
        if (M()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f41929l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        R(view, 2);
        if (z10) {
            J(view, 0, this.f41919b, this.f41921d);
        } else {
            view.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f41923f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f41919b = C9.d.f(view.getContext(), f41915m, JfifUtil.MARKER_APP1);
        this.f41920c = C9.d.f(view.getContext(), f41916n, 175);
        Context context = view.getContext();
        int i11 = f41917o;
        this.f41921d = C9.d.g(context, i11, AbstractC5946a.f55829d);
        this.f41922e = C9.d.g(view.getContext(), i11, AbstractC5946a.f55828c);
        K(view);
        return super.l(coordinatorLayout, view, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            N(view);
        } else if (i11 < 0) {
            P(view);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41918a = new LinkedHashSet();
        this.f41923f = 0;
        this.f41926i = true;
        this.f41927j = 2;
        this.f41928k = 0;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (HideBottomViewOnScrollBehavior.this.f41925h == null || HideBottomViewOnScrollBehavior.this.f41924g == null) {
                return;
            }
            HideBottomViewOnScrollBehavior.this.f41924g.removeTouchExplorationStateChangeListener(HideBottomViewOnScrollBehavior.this.f41925h);
            HideBottomViewOnScrollBehavior.this.f41925h = null;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
