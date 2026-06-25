package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class d extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f41890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    OverScroller f41891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f41892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f41893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f41894h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f41895i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private VelocityTracker f41896j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CoordinatorLayout f41897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f41898b;

        a(CoordinatorLayout coordinatorLayout, View view) {
            this.f41897a = coordinatorLayout;
            this.f41898b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f41898b == null || (overScroller = d.this.f41891e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                d.this.N(this.f41897a, this.f41898b);
                return;
            }
            d dVar = d.this;
            dVar.P(this.f41897a, this.f41898b, dVar.f41891e.getCurrY());
            this.f41898b.postOnAnimation(this);
        }
    }

    public d() {
        this.f41893g = -1;
        this.f41895i = -1;
    }

    private void I() {
        if (this.f41896j == null) {
            this.f41896j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            int r1 = r12.getActionMasked()
            r6 = -1
            r7 = 0
            r8 = 1
            if (r1 == r8) goto L4d
            r3 = 2
            if (r1 == r3) goto L2d
            r2 = 3
            if (r1 == r2) goto L71
            r2 = 6
            if (r1 == r2) goto L13
            goto L4b
        L13:
            int r1 = r12.getActionIndex()
            if (r1 != 0) goto L1b
            r1 = r8
            goto L1c
        L1b:
            r1 = r7
        L1c:
            int r2 = r12.getPointerId(r1)
            r9.f41893g = r2
            float r1 = r12.getY(r1)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r9.f41894h = r1
            goto L4b
        L2d:
            int r1 = r9.f41893g
            int r1 = r12.findPointerIndex(r1)
            if (r1 != r6) goto L36
            return r7
        L36:
            float r1 = r12.getY(r1)
            int r1 = (int) r1
            int r3 = r9.f41894h
            int r3 = r3 - r1
            r9.f41894h = r1
            int r4 = r9.K(r11)
            r5 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r0.O(r1, r2, r3, r4, r5)
        L4b:
            r1 = r7
            goto L80
        L4d:
            android.view.VelocityTracker r1 = r9.f41896j
            if (r1 == 0) goto L71
            r1.addMovement(r12)
            android.view.VelocityTracker r1 = r9.f41896j
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r3)
            android.view.VelocityTracker r1 = r9.f41896j
            int r3 = r9.f41893g
            float r5 = r1.getYVelocity(r3)
            int r1 = r9.L(r11)
            int r3 = -r1
            r4 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r0.J(r1, r2, r3, r4, r5)
            r1 = r8
            goto L72
        L71:
            r1 = r7
        L72:
            r9.f41892f = r7
            r9.f41893g = r6
            android.view.VelocityTracker r2 = r9.f41896j
            if (r2 == 0) goto L80
            r2.recycle()
            r2 = 0
            r9.f41896j = r2
        L80:
            android.view.VelocityTracker r2 = r9.f41896j
            if (r2 == 0) goto L87
            r2.addMovement(r12)
        L87:
            boolean r2 = r9.f41892f
            if (r2 != 0) goto L8f
            if (r1 == 0) goto L8e
            goto L8f
        L8e:
            return r7
        L8f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.d.D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    abstract boolean H(View view);

    final boolean J(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, float f10) {
        Runnable runnable = this.f41890d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f41890d = null;
        }
        if (this.f41891e == null) {
            this.f41891e = new OverScroller(view.getContext());
        }
        this.f41891e.fling(0, E(), 0, Math.round(f10), 0, 0, i10, i11);
        if (!this.f41891e.computeScrollOffset()) {
            N(coordinatorLayout, view);
            return false;
        }
        a aVar = new a(coordinatorLayout, view);
        this.f41890d = aVar;
        view.postOnAnimation(aVar);
        return true;
    }

    abstract int K(View view);

    abstract int L(View view);

    abstract int M();

    abstract void N(CoordinatorLayout coordinatorLayout, View view);

    final int O(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        return Q(coordinatorLayout, view, M() - i10, i11, i12);
    }

    int P(CoordinatorLayout coordinatorLayout, View view, int i10) {
        return Q(coordinatorLayout, view, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    abstract int Q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f41895i < 0) {
            this.f41895i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f41892f) {
            int i10 = this.f41893g;
            if (i10 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y10 - this.f41894h) > this.f41895i) {
                this.f41894h = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f41893g = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = H(view) && coordinatorLayout.G(view, x10, y11);
            this.f41892f = z10;
            if (z10) {
                this.f41894h = y11;
                this.f41893g = motionEvent.getPointerId(0);
                I();
                OverScroller overScroller = this.f41891e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f41891e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f41896j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41893g = -1;
        this.f41895i = -1;
    }
}
