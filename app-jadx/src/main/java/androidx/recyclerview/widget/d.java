package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.AbstractC2747a0;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class d extends RecyclerView.o implements RecyclerView.s {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final int[] f32067D = {R.attr.state_pressed};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final int[] f32068E = new int[0];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    int f32069A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final Runnable f32070B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final RecyclerView.t f32071C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final StateListDrawable f32074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Drawable f32075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f32076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f32077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final StateListDrawable f32078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Drawable f32079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f32080i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f32081j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f32082k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f32083l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f32084m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f32085n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f32086o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f32087p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private RecyclerView f32090s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final ValueAnimator f32097z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f32088q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f32089r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f32091t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f32092u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f32093v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f32094w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int[] f32095x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int[] f32096y = new int[2];

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.q(500);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends RecyclerView.t {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i10, int i11) {
            d.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f32100a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f32100a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f32100a) {
                this.f32100a = false;
                return;
            }
            if (((Float) d.this.f32097z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.f32069A = 0;
                dVar.y(0);
            } else {
                d dVar2 = d.this;
                dVar2.f32069A = 2;
                dVar2.v();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class C0530d implements ValueAnimator.AnimatorUpdateListener {
        C0530d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f32074c.setAlpha(iFloatValue);
            d.this.f32075d.setAlpha(iFloatValue);
            d.this.v();
        }
    }

    d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f32097z = valueAnimatorOfFloat;
        this.f32069A = 0;
        this.f32070B = new a();
        this.f32071C = new b();
        this.f32074c = stateListDrawable;
        this.f32075d = drawable;
        this.f32078g = stateListDrawable2;
        this.f32079h = drawable2;
        this.f32076e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f32077f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f32080i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f32081j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f32072a = i11;
        this.f32073b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new C0530d());
        j(recyclerView);
    }

    private void C(float f10) {
        int[] iArrP = p();
        float fMax = Math.max(iArrP[0], Math.min(iArrP[1], f10));
        if (Math.abs(this.f32083l - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f32084m, fMax, iArrP, this.f32090s.computeVerticalScrollRange(), this.f32090s.computeVerticalScrollOffset(), this.f32089r);
        if (iX != 0) {
            this.f32090s.scrollBy(0, iX);
        }
        this.f32084m = fMax;
    }

    private void k() {
        this.f32090s.removeCallbacks(this.f32070B);
    }

    private void l() {
        this.f32090s.c1(this);
        this.f32090s.d1(this);
        this.f32090s.e1(this.f32071C);
        k();
    }

    private void m(Canvas canvas) {
        int i10 = this.f32089r;
        int i11 = this.f32080i;
        int i12 = this.f32086o;
        int i13 = this.f32085n;
        this.f32078g.setBounds(0, 0, i13, i11);
        this.f32079h.setBounds(0, 0, this.f32088q, this.f32081j);
        canvas.translate(0.0f, i10 - i11);
        this.f32079h.draw(canvas);
        canvas.translate(i12 - (i13 / 2), 0.0f);
        this.f32078g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    private void n(Canvas canvas) {
        int i10 = this.f32088q;
        int i11 = this.f32076e;
        int i12 = i10 - i11;
        int i13 = this.f32083l;
        int i14 = this.f32082k;
        int i15 = i13 - (i14 / 2);
        this.f32074c.setBounds(0, 0, i11, i14);
        this.f32075d.setBounds(0, 0, this.f32077f, this.f32089r);
        if (!s()) {
            canvas.translate(i12, 0.0f);
            this.f32075d.draw(canvas);
            canvas.translate(0.0f, i15);
            this.f32074c.draw(canvas);
            canvas.translate(-i12, -i15);
            return;
        }
        this.f32075d.draw(canvas);
        canvas.translate(this.f32076e, i15);
        canvas.scale(-1.0f, 1.0f);
        this.f32074c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f32076e, -i15);
    }

    private int[] o() {
        int[] iArr = this.f32096y;
        int i10 = this.f32073b;
        iArr[0] = i10;
        iArr[1] = this.f32088q - i10;
        return iArr;
    }

    private int[] p() {
        int[] iArr = this.f32095x;
        int i10 = this.f32073b;
        iArr[0] = i10;
        iArr[1] = this.f32089r - i10;
        return iArr;
    }

    private void r(float f10) {
        int[] iArrO = o();
        float fMax = Math.max(iArrO[0], Math.min(iArrO[1], f10));
        if (Math.abs(this.f32086o - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f32087p, fMax, iArrO, this.f32090s.computeHorizontalScrollRange(), this.f32090s.computeHorizontalScrollOffset(), this.f32088q);
        if (iX != 0) {
            this.f32090s.scrollBy(iX, 0);
        }
        this.f32087p = fMax;
    }

    private boolean s() {
        return AbstractC2747a0.y(this.f32090s) == 1;
    }

    private void w(int i10) {
        k();
        this.f32090s.postDelayed(this.f32070B, i10);
    }

    private int x(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    private void z() {
        this.f32090s.h(this);
        this.f32090s.j(this);
        this.f32090s.k(this.f32071C);
    }

    public void A() {
        int i10 = this.f32069A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                this.f32097z.cancel();
            }
        }
        this.f32069A = 1;
        ValueAnimator valueAnimator = this.f32097z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f32097z.setDuration(500L);
        this.f32097z.setStartDelay(0L);
        this.f32097z.start();
    }

    void B(int i10, int i11) {
        int iComputeVerticalScrollRange = this.f32090s.computeVerticalScrollRange();
        int i12 = this.f32089r;
        this.f32091t = iComputeVerticalScrollRange - i12 > 0 && i12 >= this.f32072a;
        int iComputeHorizontalScrollRange = this.f32090s.computeHorizontalScrollRange();
        int i13 = this.f32088q;
        boolean z10 = iComputeHorizontalScrollRange - i13 > 0 && i13 >= this.f32072a;
        this.f32092u = z10;
        boolean z11 = this.f32091t;
        if (!z11 && !z10) {
            if (this.f32093v != 0) {
                y(0);
                return;
            }
            return;
        }
        if (z11) {
            float f10 = i12;
            this.f32083l = (int) ((f10 * (i11 + (f10 / 2.0f))) / iComputeVerticalScrollRange);
            this.f32082k = Math.min(i12, (i12 * i12) / iComputeVerticalScrollRange);
        }
        if (this.f32092u) {
            float f11 = i13;
            this.f32086o = (int) ((f11 * (i10 + (f11 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f32085n = Math.min(i13, (i13 * i13) / iComputeHorizontalScrollRange);
        }
        int i14 = this.f32093v;
        if (i14 == 0 || i14 == 1) {
            y(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f32093v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (zU || zT) {
                if (zT) {
                    this.f32094w = 1;
                    this.f32087p = (int) motionEvent.getX();
                } else if (zU) {
                    this.f32094w = 2;
                    this.f32084m = (int) motionEvent.getY();
                }
                y(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f32093v == 2) {
            this.f32084m = 0.0f;
            this.f32087p = 0.0f;
            y(1);
            this.f32094w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f32093v == 2) {
            A();
            if (this.f32094w == 1) {
                r(motionEvent.getX());
            }
            if (this.f32094w == 2) {
                C(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f32093v;
        if (i10 != 1) {
            return i10 == 2;
        }
        boolean zU = u(motionEvent.getX(), motionEvent.getY());
        boolean zT = t(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!zU && !zT)) {
            return false;
        }
        if (zT) {
            this.f32094w = 1;
            this.f32087p = (int) motionEvent.getX();
        } else if (zU) {
            this.f32094w = 2;
            this.f32084m = (int) motionEvent.getY();
        }
        y(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.A a10) {
        if (this.f32088q != this.f32090s.getWidth() || this.f32089r != this.f32090s.getHeight()) {
            this.f32088q = this.f32090s.getWidth();
            this.f32089r = this.f32090s.getHeight();
            y(0);
        } else if (this.f32069A != 0) {
            if (this.f32091t) {
                n(canvas);
            }
            if (this.f32092u) {
                m(canvas);
            }
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f32090s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            l();
        }
        this.f32090s = recyclerView;
        if (recyclerView != null) {
            z();
        }
    }

    void q(int i10) {
        int i11 = this.f32069A;
        if (i11 == 1) {
            this.f32097z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.f32069A = 3;
        ValueAnimator valueAnimator = this.f32097z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f32097z.setDuration(i10);
        this.f32097z.start();
    }

    boolean t(float f10, float f11) {
        if (f11 < this.f32089r - this.f32080i) {
            return false;
        }
        int i10 = this.f32086o;
        int i11 = this.f32085n;
        return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) (i10 + (i11 / 2)));
    }

    boolean u(float f10, float f11) {
        if (s()) {
            if (f10 > this.f32076e) {
                return false;
            }
        } else if (f10 < this.f32088q - this.f32076e) {
            return false;
        }
        int i10 = this.f32083l;
        int i11 = this.f32082k;
        return f11 >= ((float) (i10 - (i11 / 2))) && f11 <= ((float) (i10 + (i11 / 2)));
    }

    void v() {
        this.f32090s.invalidate();
    }

    void y(int i10) {
        if (i10 == 2 && this.f32093v != 2) {
            this.f32074c.setState(f32067D);
            k();
        }
        if (i10 == 0) {
            v();
        } else {
            A();
        }
        if (this.f32093v == 2 && i10 != 2) {
            this.f32074c.setState(f32068E);
            w(1200);
        } else if (i10 == 1) {
            w(1500);
        }
        this.f32093v = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void c(boolean z10) {
    }
}
