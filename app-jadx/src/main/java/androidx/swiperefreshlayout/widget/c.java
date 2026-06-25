package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.D;
import androidx.core.view.E;
import androidx.core.view.F;
import androidx.core.view.G;
import androidx.core.view.H;
import y1.AbstractC7194b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends ViewGroup implements G, F, D {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final String f32264r0 = "c";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final int[] f32265s0 = {R.attr.enabled};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    int f32266A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    int f32267B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    androidx.swiperefreshlayout.widget.b f32268C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Animation f32269D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private Animation f32270E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private Animation f32271F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Animation f32272G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private Animation f32273H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    boolean f32274I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f32275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    j f32276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f32277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f32279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f32280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final H f32281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final E f32282h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f32283i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f32284j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f32285k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f32286l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private int f32287l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f32288m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    boolean f32289m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f32290n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f32291n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f32292o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private Animation.AnimationListener f32293o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f32294p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final Animation f32295p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f32296q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private final Animation f32297q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f32298r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean f32299s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f32300t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final DecelerateInterpolator f32301u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    androidx.swiperefreshlayout.widget.a f32302v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f32303w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected int f32304x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    float f32305y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected int f32306z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends Animation {
        b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            c.this.setAnimationProgress(f10);
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0537c extends Animation {
        C0537c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            c.this.setAnimationProgress(1.0f - f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d extends Animation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f32310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f32311b;

        d(int i10, int i11) {
            this.f32310a = i10;
            this.f32311b = i11;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            c.this.f32268C.setAlpha((int) (this.f32310a + ((this.f32311b - r0) * f10)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class f extends Animation {
        f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            c cVar = c.this;
            int iAbs = !cVar.f32289m0 ? cVar.f32266A - Math.abs(cVar.f32306z) : cVar.f32266A;
            c cVar2 = c.this;
            c.this.setTargetOffsetTopAndBottom((cVar2.f32304x + ((int) ((iAbs - r1) * f10))) - cVar2.f32302v.getTop());
            c.this.f32268C.e(1.0f - f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class g extends Animation {
        g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            c.this.p(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class h extends Animation {
        h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            c cVar = c.this;
            float f11 = cVar.f32305y;
            cVar.setAnimationProgress(f11 + ((-f11) * f10));
            c.this.p(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface i {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface j {
        void a();
    }

    public c(Context context) {
        this(context, null);
    }

    private void A(Animation.AnimationListener animationListener) {
        this.f32302v.setVisibility(0);
        this.f32268C.setAlpha(255);
        b bVar = new b();
        this.f32269D = bVar;
        bVar.setDuration(this.f32288m);
        if (animationListener != null) {
            this.f32302v.b(animationListener);
        }
        this.f32302v.clearAnimation();
        this.f32302v.startAnimation(this.f32269D);
    }

    private void a(int i10, Animation.AnimationListener animationListener) {
        this.f32304x = i10;
        this.f32295p0.reset();
        this.f32295p0.setDuration(200L);
        this.f32295p0.setInterpolator(this.f32301u);
        if (animationListener != null) {
            this.f32302v.b(animationListener);
        }
        this.f32302v.clearAnimation();
        this.f32302v.startAnimation(this.f32295p0);
    }

    private void b(int i10, Animation.AnimationListener animationListener) {
        if (this.f32299s) {
            z(i10, animationListener);
            return;
        }
        this.f32304x = i10;
        this.f32297q0.reset();
        this.f32297q0.setDuration(200L);
        this.f32297q0.setInterpolator(this.f32301u);
        if (animationListener != null) {
            this.f32302v.b(animationListener);
        }
        this.f32302v.clearAnimation();
        this.f32302v.startAnimation(this.f32297q0);
    }

    private void d() {
        this.f32302v = new androidx.swiperefreshlayout.widget.a(getContext());
        androidx.swiperefreshlayout.widget.b bVar = new androidx.swiperefreshlayout.widget.b(getContext());
        this.f32268C = bVar;
        bVar.l(1);
        this.f32302v.setImageDrawable(this.f32268C);
        this.f32302v.setVisibility(8);
        addView(this.f32302v);
    }

    private void f() {
        if (this.f32275a == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.f32302v)) {
                    this.f32275a = childAt;
                    return;
                }
            }
        }
    }

    private void g(float f10) {
        if (f10 > this.f32279e) {
            t(true, true);
            return;
        }
        this.f32277c = false;
        this.f32268C.j(0.0f, 0.0f);
        b(this.f32290n, !this.f32299s ? new e() : null);
        this.f32268C.d(false);
    }

    private boolean h(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void l(float f10) {
        this.f32268C.d(true);
        float fMin = Math.min(1.0f, Math.abs(f10 / this.f32279e));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f10) - this.f32279e;
        int i10 = this.f32267B;
        if (i10 <= 0) {
            i10 = this.f32289m0 ? this.f32266A - this.f32306z : this.f32266A;
        }
        float f11 = i10;
        double dMax = Math.max(0.0f, Math.min(fAbs, f11 * 2.0f) / f11) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i11 = this.f32306z + ((int) ((f11 * fMin) + (f11 * fPow * 2.0f)));
        if (this.f32302v.getVisibility() != 0) {
            this.f32302v.setVisibility(0);
        }
        if (!this.f32299s) {
            this.f32302v.setScaleX(1.0f);
            this.f32302v.setScaleY(1.0f);
        }
        if (this.f32299s) {
            setAnimationProgress(Math.min(1.0f, f10 / this.f32279e));
        }
        if (f10 < this.f32279e) {
            if (this.f32268C.getAlpha() > 76 && !h(this.f32271F)) {
                x();
            }
        } else if (this.f32268C.getAlpha() < 255 && !h(this.f32272G)) {
            w();
        }
        this.f32268C.j(0.0f, Math.min(0.8f, fMax * 0.8f));
        this.f32268C.e(Math.min(1.0f, fMax));
        this.f32268C.g((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i11 - this.f32290n);
    }

    private void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f32298r) {
            this.f32298r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void setColorViewAlpha(int i10) {
        this.f32302v.getBackground().setAlpha(i10);
        this.f32268C.setAlpha(i10);
    }

    private void t(boolean z10, boolean z11) {
        if (this.f32277c != z10) {
            this.f32274I = z11;
            f();
            this.f32277c = z10;
            if (z10) {
                a(this.f32290n, this.f32293o0);
            } else {
                y(this.f32293o0);
            }
        }
    }

    private Animation u(int i10, int i11) {
        d dVar = new d(i10, i11);
        dVar.setDuration(300L);
        this.f32302v.b(null);
        this.f32302v.clearAnimation();
        this.f32302v.startAnimation(dVar);
        return dVar;
    }

    private void v(float f10) {
        float f11 = this.f32294p;
        float f12 = f10 - f11;
        int i10 = this.f32278d;
        if (f12 <= i10 || this.f32296q) {
            return;
        }
        this.f32292o = f11 + i10;
        this.f32296q = true;
        this.f32268C.setAlpha(76);
    }

    private void w() {
        this.f32272G = u(this.f32268C.getAlpha(), 255);
    }

    private void x() {
        this.f32271F = u(this.f32268C.getAlpha(), 76);
    }

    private void z(int i10, Animation.AnimationListener animationListener) {
        this.f32304x = i10;
        this.f32305y = this.f32302v.getScaleX();
        h hVar = new h();
        this.f32273H = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.f32302v.b(animationListener);
        }
        this.f32302v.clearAnimation();
        this.f32302v.startAnimation(this.f32273H);
    }

    public boolean c() {
        View view = this.f32275a;
        return view instanceof ListView ? androidx.core.widget.g.a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f32282h.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f32282h.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f32282h.c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f32282h.f(i10, i11, i12, i13, iArr);
    }

    public void e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        if (i14 == 0) {
            this.f32282h.e(i10, i11, i12, i13, iArr, i14, iArr2);
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.f32303w;
        return i12 < 0 ? i11 : i11 == i10 + (-1) ? i12 : i11 >= i12 ? i11 + 1 : i11;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f32281g.a();
    }

    public int getProgressCircleDiameter() {
        return this.f32287l0;
    }

    public int getProgressViewEndOffset() {
        return this.f32266A;
    }

    public int getProgressViewStartOffset() {
        return this.f32306z;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f32282h.j();
    }

    @Override // androidx.core.view.F
    public void i(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f32282h.l();
    }

    @Override // androidx.core.view.F
    public void j(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.F
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // androidx.core.view.G
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i14 != 0) {
            return;
        }
        int i15 = iArr[1];
        e(i10, i11, i12, i13, this.f32284j, i14, iArr);
        int i16 = i13 - (iArr[1] - i15);
        if ((i16 == 0 ? i13 + this.f32284j[1] : i16) >= 0 || c()) {
            return;
        }
        float fAbs = this.f32280f + Math.abs(r14);
        this.f32280f = fAbs;
        l(fAbs);
        iArr[1] = iArr[1] + i16;
    }

    @Override // androidx.core.view.F
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, i14, this.f32285k);
    }

    @Override // androidx.core.view.F
    public boolean o(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            return onStartNestedScroll(view, view2, i10);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0058  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r4.f()
            int r0 = r5.getActionMasked()
            boolean r1 = r4.f32300t
            r2 = 0
            if (r1 == 0) goto L10
            if (r0 != 0) goto L10
            r4.f32300t = r2
        L10:
            boolean r1 = r4.isEnabled()
            if (r1 == 0) goto L81
            boolean r1 = r4.f32300t
            if (r1 != 0) goto L81
            boolean r1 = r4.c()
            if (r1 != 0) goto L81
            boolean r1 = r4.f32277c
            if (r1 != 0) goto L81
            boolean r1 = r4.f32286l
            if (r1 == 0) goto L29
            goto L81
        L29:
            if (r0 == 0) goto L5d
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L58
            r1 = 2
            if (r0 == r1) goto L3d
            r1 = 3
            if (r0 == r1) goto L58
            r1 = 6
            if (r0 == r1) goto L39
            goto L7e
        L39:
            r4.q(r5)
            goto L7e
        L3d:
            int r0 = r4.f32298r
            if (r0 != r3) goto L49
            java.lang.String r5 = androidx.swiperefreshlayout.widget.c.f32264r0
            java.lang.String r0 = "Got ACTION_MOVE event but don't have an active pointer id."
            android.util.Log.e(r5, r0)
            return r2
        L49:
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L50
            return r2
        L50:
            float r5 = r5.getY(r0)
            r4.v(r5)
            goto L7e
        L58:
            r4.f32296q = r2
            r4.f32298r = r3
            goto L7e
        L5d:
            int r0 = r4.f32306z
            androidx.swiperefreshlayout.widget.a r1 = r4.f32302v
            int r1 = r1.getTop()
            int r0 = r0 - r1
            r4.setTargetOffsetTopAndBottom(r0)
            int r0 = r5.getPointerId(r2)
            r4.f32298r = r0
            r4.f32296q = r2
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L78
            return r2
        L78:
            float r5 = r5.getY(r0)
            r4.f32294p = r5
        L7e:
            boolean r5 = r4.f32296q
            return r5
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.swiperefreshlayout.widget.c.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f32275a == null) {
            f();
        }
        View view = this.f32275a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f32302v.getMeasuredWidth();
        int measuredHeight2 = this.f32302v.getMeasuredHeight();
        int i14 = measuredWidth / 2;
        int i15 = measuredWidth2 / 2;
        int i16 = this.f32290n;
        this.f32302v.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f32275a == null) {
            f();
        }
        View view = this.f32275a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f32302v.measure(View.MeasureSpec.makeMeasureSpec(this.f32287l0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f32287l0, 1073741824));
        this.f32303w = -1;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == this.f32302v) {
                this.f32303w = i12;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.f32280f;
            if (f10 > 0.0f) {
                float f11 = i11;
                if (f11 > f10) {
                    iArr[1] = (int) f10;
                    this.f32280f = 0.0f;
                } else {
                    this.f32280f = f10 - f11;
                    iArr[1] = i11;
                }
                l(this.f32280f);
            }
        }
        if (this.f32289m0 && i11 > 0 && this.f32280f == 0.0f && Math.abs(i11 - iArr[1]) > 0) {
            this.f32302v.setVisibility(8);
        }
        int[] iArr2 = this.f32283i;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        m(view, i10, i11, i12, i13, 0, this.f32285k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f32281g.b(view, view2, i10);
        startNestedScroll(i10 & 2);
        this.f32280f = 0.0f;
        this.f32286l = true;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        setRefreshing(kVar.f32317a);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new k(super.onSaveInstanceState(), this.f32277c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return (!isEnabled() || this.f32300t || this.f32277c || (i10 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f32281g.d(view);
        this.f32286l = false;
        float f10 = this.f32280f;
        if (f10 > 0.0f) {
            g(f10);
            this.f32280f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f32300t && actionMasked == 0) {
            this.f32300t = false;
        }
        if (!isEnabled() || this.f32300t || c() || this.f32277c || this.f32286l) {
            return false;
        }
        if (actionMasked == 0) {
            this.f32298r = motionEvent.getPointerId(0);
            this.f32296q = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f32298r);
                if (iFindPointerIndex < 0) {
                    Log.e(f32264r0, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f32296q) {
                    float y10 = (motionEvent.getY(iFindPointerIndex) - this.f32292o) * 0.5f;
                    this.f32296q = false;
                    g(y10);
                }
                this.f32298r = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f32298r);
                if (iFindPointerIndex2 < 0) {
                    Log.e(f32264r0, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y11 = motionEvent.getY(iFindPointerIndex2);
                v(y11);
                if (this.f32296q) {
                    float f10 = (y11 - this.f32292o) * 0.5f;
                    if (f10 <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    l(f10);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(f32264r0, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f32298r = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    q(motionEvent);
                }
            }
        }
        return true;
    }

    void p(float f10) {
        setTargetOffsetTopAndBottom((this.f32304x + ((int) ((this.f32306z - r0) * f10))) - this.f32302v.getTop());
    }

    void r() {
        this.f32302v.clearAnimation();
        this.f32268C.stop();
        this.f32302v.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f32299s) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f32306z - this.f32290n);
        }
        this.f32290n = this.f32302v.getTop();
    }

    public void s(boolean z10, int i10, int i11) {
        this.f32299s = z10;
        this.f32306z = i10;
        this.f32266A = i11;
        this.f32289m0 = true;
        r();
        this.f32277c = false;
    }

    void setAnimationProgress(float f10) {
        this.f32302v.setScaleX(f10);
        this.f32302v.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        f();
        this.f32268C.f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = AbstractC7194b.c(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f32279e = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (z10) {
            return;
        }
        r();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z10) {
        this.f32291n0 = z10;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f32282h.m(z10);
    }

    public void setOnRefreshListener(j jVar) {
        this.f32276b = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.f32302v.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        setProgressBackgroundColorSchemeColor(AbstractC7194b.c(getContext(), i10));
    }

    public void setRefreshing(boolean z10) {
        if (!z10 || this.f32277c == z10) {
            t(z10, false);
            return;
        }
        this.f32277c = z10;
        setTargetOffsetTopAndBottom((!this.f32289m0 ? this.f32266A + this.f32306z : this.f32266A) - this.f32290n);
        this.f32274I = false;
        A(this.f32293o0);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i10 == 0) {
                this.f32287l0 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f32287l0 = (int) (displayMetrics.density * 40.0f);
            }
            this.f32302v.setImageDrawable(null);
            this.f32268C.l(i10);
            this.f32302v.setImageDrawable(this.f32268C);
        }
    }

    public void setSlingshotDistance(int i10) {
        this.f32267B = i10;
    }

    void setTargetOffsetTopAndBottom(int i10) {
        this.f32302v.bringToFront();
        AbstractC2747a0.V(this.f32302v, i10);
        this.f32290n = this.f32302v.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return this.f32282h.o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f32282h.q();
    }

    void y(Animation.AnimationListener animationListener) {
        C0537c c0537c = new C0537c();
        this.f32270E = c0537c;
        c0537c.setDuration(150L);
        this.f32302v.b(animationListener);
        this.f32302v.clearAnimation();
        this.f32302v.startAnimation(this.f32270E);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class k extends View.BaseSavedState {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f32317a;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public k[] newArray(int i10) {
                return new k[i10];
            }
        }

        k(Parcelable parcelable, boolean z10) {
            super(parcelable);
            this.f32317a = z10;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f32317a ? (byte) 1 : (byte) 0);
        }

        k(Parcel parcel) {
            super(parcel);
            this.f32317a = parcel.readByte() != 0;
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32277c = false;
        this.f32279e = -1.0f;
        this.f32283i = new int[2];
        this.f32284j = new int[2];
        this.f32285k = new int[2];
        this.f32298r = -1;
        this.f32303w = -1;
        this.f32293o0 = new a();
        this.f32295p0 = new f();
        this.f32297q0 = new g();
        this.f32278d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f32288m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f32301u = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f32287l0 = (int) (displayMetrics.density * 40.0f);
        d();
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.f32266A = i10;
        this.f32279e = i10;
        this.f32281g = new H(this);
        this.f32282h = new E(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.f32287l0;
        this.f32290n = i11;
        this.f32306z = i11;
        p(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f32265s0);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            c cVar = c.this;
            if (!cVar.f32277c) {
                cVar.r();
                return;
            }
            cVar.f32268C.setAlpha(255);
            c.this.f32268C.start();
            c cVar2 = c.this;
            if (cVar2.f32274I && (jVar = cVar2.f32276b) != null) {
                jVar.a();
            }
            c cVar3 = c.this;
            cVar3.f32290n = cVar3.f32302v.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            c cVar = c.this;
            if (cVar.f32299s) {
                return;
            }
            cVar.y(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public void setOnChildScrollUpCallback(i iVar) {
    }
}
