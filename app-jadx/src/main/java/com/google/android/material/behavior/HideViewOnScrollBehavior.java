package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.imageutils.JfifUtil;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o9.AbstractC5838a;
import p9.AbstractC5946a;
import y1.AbstractC7194b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class HideViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f41932o = AbstractC5838a.f54648m0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f41933p = AbstractC5838a.f54652o0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f41934q = AbstractC5838a.f54662t0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f41935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AccessibilityManager f41936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AccessibilityManager.TouchExplorationStateChangeListener f41937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f41938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LinkedHashSet f41939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f41940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f41941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TimeInterpolator f41942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TimeInterpolator f41943i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f41944j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f41945k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f41946l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ViewPropertyAnimator f41947m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f41948n;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideViewOnScrollBehavior.this.f41947m = null;
        }
    }

    public HideViewOnScrollBehavior() {
        this.f41938d = true;
        this.f41939e = new LinkedHashSet();
        this.f41944j = 0;
        this.f41945k = 2;
        this.f41946l = 0;
        this.f41948n = false;
    }

    public static /* synthetic */ void E(HideViewOnScrollBehavior hideViewOnScrollBehavior, View view, boolean z10) {
        if (hideViewOnScrollBehavior.f41938d && z10 && hideViewOnScrollBehavior.O()) {
            hideViewOnScrollBehavior.R(view);
        }
    }

    private void J(View view, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f41947m = this.f41935a.d(view, i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new b());
    }

    private void K(final View view) {
        if (this.f41936b == null) {
            this.f41936b = (AccessibilityManager) AbstractC7194b.j(view.getContext(), AccessibilityManager.class);
        }
        if (this.f41936b == null || this.f41937c != null) {
            return;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: r9.b
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                HideViewOnScrollBehavior.E(this.f58725a, view, z10);
            }
        };
        this.f41937c = touchExplorationStateChangeListener;
        this.f41936b.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        view.addOnAttachStateChangeListener(new a());
    }

    private boolean L(int i10) {
        return i10 == 80 || i10 == 81;
    }

    private boolean M(int i10) {
        return i10 == 3 || i10 == 19;
    }

    private void P(View view, int i10) {
        if (this.f41948n) {
            return;
        }
        int i11 = ((CoordinatorLayout.f) view.getLayoutParams()).f28706c;
        if (L(i11)) {
            Q(1);
        } else {
            Q(M(Gravity.getAbsoluteGravity(i11, i10)) ? 2 : 0);
        }
    }

    private void Q(int i10) {
        d dVar = this.f41935a;
        if (dVar == null || dVar.c() != i10) {
            if (i10 == 0) {
                this.f41935a = new c();
                return;
            }
            if (i10 == 1) {
                this.f41935a = new com.google.android.material.behavior.a();
                return;
            }
            if (i10 == 2) {
                this.f41935a = new com.google.android.material.behavior.b();
                return;
            }
            throw new IllegalArgumentException("Invalid view edge position value: " + i10 + ". Must be 0, 1 or 2.");
        }
    }

    private void V(View view, int i10) {
        this.f41945k = i10;
        Iterator it = this.f41939e.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        return i10 == 2;
    }

    public boolean N() {
        return this.f41945k == 2;
    }

    public boolean O() {
        return this.f41945k == 1;
    }

    public void R(View view) {
        S(view, true);
    }

    public void S(View view, boolean z10) {
        if (N()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f41947m;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        V(view, 2);
        int iB = this.f41935a.b();
        if (z10) {
            J(view, iB, this.f41940f, this.f41942h);
        } else {
            this.f41935a.e(view, iB);
        }
    }

    public void T(View view) {
        U(view, true);
    }

    public void U(View view, boolean z10) {
        AccessibilityManager accessibilityManager;
        if (O()) {
            return;
        }
        if (this.f41938d && (accessibilityManager = this.f41936b) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f41947m;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        V(view, 1);
        int i10 = this.f41944j + this.f41946l;
        if (z10) {
            J(view, i10, this.f41941g, this.f41943i);
        } else {
            this.f41935a.e(view, i10);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        K(view);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        P(view, i10);
        this.f41944j = this.f41935a.a(view, marginLayoutParams);
        this.f41940f = C9.d.f(view.getContext(), f41932o, JfifUtil.MARKER_APP1);
        this.f41941g = C9.d.f(view.getContext(), f41933p, 175);
        Context context = view.getContext();
        int i11 = f41934q;
        this.f41942h = C9.d.g(context, i11, AbstractC5946a.f55829d);
        this.f41943i = C9.d.g(view.getContext(), i11, AbstractC5946a.f55828c);
        return super.l(coordinatorLayout, view, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            T(view);
        } else if (i11 < 0) {
            R(view);
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41938d = true;
        this.f41939e = new LinkedHashSet();
        this.f41944j = 0;
        this.f41945k = 2;
        this.f41946l = 0;
        this.f41948n = false;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (HideViewOnScrollBehavior.this.f41937c == null || HideViewOnScrollBehavior.this.f41936b == null) {
                return;
            }
            HideViewOnScrollBehavior.this.f41936b.removeTouchExplorationStateChangeListener(HideViewOnScrollBehavior.this.f41937c);
            HideViewOnScrollBehavior.this.f41937c = null;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
