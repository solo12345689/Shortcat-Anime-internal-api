package com.google.android.material.behavior;

import L1.B;
import L1.E;
import R1.c;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC2747a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: a */
    R1.c f41951a;

    /* JADX INFO: renamed from: b */
    private boolean f41952b;

    /* JADX INFO: renamed from: c */
    private boolean f41953c;

    /* JADX INFO: renamed from: e */
    private boolean f41955e;

    /* JADX INFO: renamed from: d */
    private float f41954d = 0.0f;

    /* JADX INFO: renamed from: f */
    int f41956f = 2;

    /* JADX INFO: renamed from: g */
    float f41957g = 0.5f;

    /* JADX INFO: renamed from: h */
    float f41958h = 0.0f;

    /* JADX INFO: renamed from: i */
    float f41959i = 0.5f;

    /* JADX INFO: renamed from: j */
    private final c.AbstractC0259c f41960j = new a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends c.AbstractC0259c {

        /* JADX INFO: renamed from: a */
        private int f41961a;

        /* JADX INFO: renamed from: b */
        private int f41962b = -1;

        a() {
        }

        private boolean n(View view, float f10) {
            if (f10 == 0.0f) {
                return Math.abs(view.getLeft() - this.f41961a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f41957g);
            }
            boolean z10 = view.getLayoutDirection() == 1;
            int i10 = SwipeDismissBehavior.this.f41956f;
            if (i10 == 2) {
                return true;
            }
            if (i10 == 0) {
                return z10 ? f10 < 0.0f : f10 > 0.0f;
            }
            if (i10 == 1) {
                if (z10) {
                    return f10 > 0.0f;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // R1.c.AbstractC0259c
        public int a(View view, int i10, int i11) {
            int width;
            int width2;
            int width3;
            boolean z10 = view.getLayoutDirection() == 1;
            int i12 = SwipeDismissBehavior.this.f41956f;
            if (i12 == 0) {
                if (z10) {
                    width = this.f41961a - view.getWidth();
                    width2 = this.f41961a;
                } else {
                    width = this.f41961a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i12 != 1) {
                width = this.f41961a - view.getWidth();
                width2 = view.getWidth() + this.f41961a;
            } else if (z10) {
                width = this.f41961a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f41961a - view.getWidth();
                width2 = this.f41961a;
            }
            return SwipeDismissBehavior.H(width, i10, width2);
        }

        @Override // R1.c.AbstractC0259c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // R1.c.AbstractC0259c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // R1.c.AbstractC0259c
        public void i(View view, int i10) {
            this.f41962b = i10;
            this.f41961a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f41953c = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f41953c = false;
            }
        }

        @Override // R1.c.AbstractC0259c
        public void j(int i10) {
            SwipeDismissBehavior.this.getClass();
        }

        @Override // R1.c.AbstractC0259c
        public void k(View view, int i10, int i11, int i12, int i13) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f41958h;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f41959i;
            float fAbs = Math.abs(i10 - this.f41961a);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.G(0.0f, 1.0f - SwipeDismissBehavior.J(width, width2, fAbs), 1.0f));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x001d  */
        @Override // R1.c.AbstractC0259c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void l(android.view.View r3, float r4, float r5) {
            /*
                r2 = this;
                r5 = -1
                r2.f41962b = r5
                int r5 = r3.getWidth()
                boolean r0 = r2.n(r3, r4)
                if (r0 == 0) goto L23
                r0 = 0
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 < 0) goto L1d
                int r4 = r3.getLeft()
                int r0 = r2.f41961a
                if (r4 >= r0) goto L1b
                goto L1d
            L1b:
                int r0 = r0 + r5
                goto L21
            L1d:
                int r4 = r2.f41961a
                int r0 = r4 - r5
            L21:
                r4 = 1
                goto L26
            L23:
                int r0 = r2.f41961a
                r4 = 0
            L26:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                R1.c r5 = r5.f41951a
                int r1 = r3.getTop()
                boolean r5 = r5.O(r0, r1)
                if (r5 == 0) goto L3f
                com.google.android.material.behavior.SwipeDismissBehavior$c r5 = new com.google.android.material.behavior.SwipeDismissBehavior$c
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r5.<init>(r3, r4)
                r3.postOnAnimation(r5)
                return
            L3f:
                if (r4 == 0) goto L46
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r3.getClass()
            L46:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.l(android.view.View, float, float):void");
        }

        @Override // R1.c.AbstractC0259c
        public boolean m(View view, int i10) {
            int i11 = this.f41962b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.F(view);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements E {
        b() {
        }

        @Override // L1.E
        public boolean a(View view, E.a aVar) {
            if (!SwipeDismissBehavior.this.F(view)) {
                return false;
            }
            boolean z10 = view.getLayoutDirection() == 1;
            int i10 = SwipeDismissBehavior.this.f41956f;
            AbstractC2747a0.U(view, (!(i10 == 0 && z10) && (i10 != 1 || z10)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            SwipeDismissBehavior.this.getClass();
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class c implements Runnable {

        /* JADX INFO: renamed from: a */
        private final View f41965a;

        /* JADX INFO: renamed from: b */
        private final boolean f41966b;

        c(View view, boolean z10) {
            this.f41965a = view;
            this.f41966b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            R1.c cVar = SwipeDismissBehavior.this.f41951a;
            if (cVar != null && cVar.m(true)) {
                this.f41965a.postOnAnimation(this);
            } else if (this.f41966b) {
                SwipeDismissBehavior.this.getClass();
            }
        }
    }

    static float G(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    static int H(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    private void I(ViewGroup viewGroup) {
        if (this.f41951a == null) {
            this.f41951a = this.f41955e ? R1.c.n(viewGroup, this.f41954d, this.f41960j) : R1.c.o(viewGroup, this.f41960j);
        }
    }

    static float J(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    private void N(View view) {
        AbstractC2747a0.e0(view, 1048576);
        if (F(view)) {
            AbstractC2747a0.g0(view, B.a.f11233y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f41951a == null) {
            return false;
        }
        if (this.f41953c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f41951a.F(motionEvent);
        return true;
    }

    public boolean F(View view) {
        return true;
    }

    public void K(float f10) {
        this.f41959i = G(0.0f, f10, 1.0f);
    }

    public void L(float f10) {
        this.f41958h = G(0.0f, f10, 1.0f);
    }

    public void M(int i10) {
        this.f41956f = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zG = this.f41952b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zG = coordinatorLayout.G(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f41952b = zG;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f41952b = false;
        }
        if (zG) {
            I(coordinatorLayout);
            if (!this.f41953c && this.f41951a.P(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        boolean zL = super.l(coordinatorLayout, view, i10);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            N(view);
        }
        return zL;
    }
}
