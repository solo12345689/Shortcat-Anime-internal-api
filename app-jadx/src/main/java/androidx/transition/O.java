package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC2946k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class O extends AbstractC2946k {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final String[] f32332p0 = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f32333o0 = 3;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a extends AnimatorListenerAdapter implements AbstractC2946k.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f32334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f32335b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ViewGroup f32336c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f32337d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f32338e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f32339f = false;

        a(View view, int i10, boolean z10) {
            this.f32334a = view;
            this.f32335b = i10;
            this.f32336c = (ViewGroup) view.getParent();
            this.f32337d = z10;
            c(true);
        }

        private void a() {
            if (!this.f32339f) {
                C.f(this.f32334a, this.f32335b);
                ViewGroup viewGroup = this.f32336c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            c(false);
        }

        private void c(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f32337d || this.f32338e == z10 || (viewGroup = this.f32336c) == null) {
                return;
            }
            this.f32338e = z10;
            B.b(viewGroup, z10);
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void b(AbstractC2946k abstractC2946k) {
            c(true);
            if (this.f32339f) {
                return;
            }
            C.f(this.f32334a, 0);
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void f(AbstractC2946k abstractC2946k) {
            c(false);
            if (this.f32339f) {
                return;
            }
            C.f(this.f32334a, this.f32335b);
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void i(AbstractC2946k abstractC2946k) {
            abstractC2946k.f0(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f32339f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            a();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            if (z10) {
                C.f(this.f32334a, 0);
                ViewGroup viewGroup = this.f32336c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void e(AbstractC2946k abstractC2946k) {
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void k(AbstractC2946k abstractC2946k) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class b extends AnimatorListenerAdapter implements AbstractC2946k.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewGroup f32340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f32341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final View f32342c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f32343d = true;

        b(ViewGroup viewGroup, View view, View view2) {
            this.f32340a = viewGroup;
            this.f32341b = view;
            this.f32342c = view2;
        }

        private void a() {
            this.f32342c.setTag(AbstractC2943h.f32405a, null);
            this.f32340a.getOverlay().remove(this.f32341b);
            this.f32343d = false;
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void i(AbstractC2946k abstractC2946k) {
            abstractC2946k.f0(this);
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void k(AbstractC2946k abstractC2946k) {
            if (this.f32343d) {
                a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f32340a.getOverlay().remove(this.f32341b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f32341b.getParent() == null) {
                this.f32340a.getOverlay().add(this.f32341b);
            } else {
                O.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            if (z10) {
                this.f32342c.setTag(AbstractC2943h.f32405a, this.f32341b);
                this.f32340a.getOverlay().add(this.f32341b);
                this.f32343d = true;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            a();
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void b(AbstractC2946k abstractC2946k) {
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void e(AbstractC2946k abstractC2946k) {
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void f(AbstractC2946k abstractC2946k) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f32345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f32346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f32347c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f32348d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ViewGroup f32349e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ViewGroup f32350f;

        c() {
        }
    }

    private void t0(y yVar) {
        yVar.f32493a.put("android:visibility:visibility", Integer.valueOf(yVar.f32494b.getVisibility()));
        yVar.f32493a.put("android:visibility:parent", yVar.f32494b.getParent());
        int[] iArr = new int[2];
        yVar.f32494b.getLocationOnScreen(iArr);
        yVar.f32493a.put("android:visibility:screenLocation", iArr);
    }

    private c u0(y yVar, y yVar2) {
        c cVar = new c();
        cVar.f32345a = false;
        cVar.f32346b = false;
        if (yVar == null || !yVar.f32493a.containsKey("android:visibility:visibility")) {
            cVar.f32347c = -1;
            cVar.f32349e = null;
        } else {
            cVar.f32347c = ((Integer) yVar.f32493a.get("android:visibility:visibility")).intValue();
            cVar.f32349e = (ViewGroup) yVar.f32493a.get("android:visibility:parent");
        }
        if (yVar2 == null || !yVar2.f32493a.containsKey("android:visibility:visibility")) {
            cVar.f32348d = -1;
            cVar.f32350f = null;
        } else {
            cVar.f32348d = ((Integer) yVar2.f32493a.get("android:visibility:visibility")).intValue();
            cVar.f32350f = (ViewGroup) yVar2.f32493a.get("android:visibility:parent");
        }
        if (yVar != null && yVar2 != null) {
            int i10 = cVar.f32347c;
            int i11 = cVar.f32348d;
            if (i10 != i11 || cVar.f32349e != cVar.f32350f) {
                if (i10 != i11) {
                    if (i10 == 0) {
                        cVar.f32346b = false;
                        cVar.f32345a = true;
                        return cVar;
                    }
                    if (i11 == 0) {
                        cVar.f32346b = true;
                        cVar.f32345a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f32350f == null) {
                        cVar.f32346b = false;
                        cVar.f32345a = true;
                        return cVar;
                    }
                    if (cVar.f32349e == null) {
                        cVar.f32346b = true;
                        cVar.f32345a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (yVar == null && cVar.f32348d == 0) {
                cVar.f32346b = true;
                cVar.f32345a = true;
                return cVar;
            }
            if (yVar2 == null && cVar.f32347c == 0) {
                cVar.f32346b = false;
                cVar.f32345a = true;
            }
        }
        return cVar;
    }

    @Override // androidx.transition.AbstractC2946k
    public String[] O() {
        return f32332p0;
    }

    @Override // androidx.transition.AbstractC2946k
    public boolean S(y yVar, y yVar2) {
        if (yVar == null && yVar2 == null) {
            return false;
        }
        if (yVar != null && yVar2 != null && yVar2.f32493a.containsKey("android:visibility:visibility") != yVar.f32493a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarU0 = u0(yVar, yVar2);
        return cVarU0.f32345a && (cVarU0.f32347c == 0 || cVarU0.f32348d == 0);
    }

    @Override // androidx.transition.AbstractC2946k
    public void i(y yVar) {
        t0(yVar);
    }

    @Override // androidx.transition.AbstractC2946k
    public void m(y yVar) {
        t0(yVar);
    }

    @Override // androidx.transition.AbstractC2946k
    public Animator r(ViewGroup viewGroup, y yVar, y yVar2) {
        c cVarU0 = u0(yVar, yVar2);
        if (!cVarU0.f32345a) {
            return null;
        }
        if (cVarU0.f32349e == null && cVarU0.f32350f == null) {
            return null;
        }
        return cVarU0.f32346b ? w0(viewGroup, yVar, cVarU0.f32347c, yVar2, cVarU0.f32348d) : y0(viewGroup, yVar, cVarU0.f32347c, yVar2, cVarU0.f32348d);
    }

    public abstract Animator v0(ViewGroup viewGroup, View view, y yVar, y yVar2);

    public Animator w0(ViewGroup viewGroup, y yVar, int i10, y yVar2, int i11) {
        if ((this.f32333o0 & 1) != 1 || yVar2 == null) {
            return null;
        }
        if (yVar == null) {
            View view = (View) yVar2.f32494b.getParent();
            if (u0(C(view, false), P(view, false)).f32345a) {
                return null;
            }
        }
        return v0(viewGroup, yVar2.f32494b, yVar, yVar2);
    }

    public abstract Animator x0(ViewGroup viewGroup, View view, y yVar, y yVar2);

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[PHI: r2
  0x0069: PHI (r2v3 android.view.View) = 
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v6 android.view.View)
 binds: [B:26:0x003e, B:31:0x004d, B:37:0x0076, B:39:0x0079, B:41:0x007f, B:43:0x0083, B:34:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator y0(android.view.ViewGroup r10, androidx.transition.y r11, int r12, androidx.transition.y r13, int r14) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.O.y0(android.view.ViewGroup, androidx.transition.y, int, androidx.transition.y, int):android.animation.Animator");
    }

    public void z0(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f32333o0 = i10;
    }
}
