package androidx.core.widget;

import L1.B;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.C;
import androidx.core.view.C2746a;
import androidx.core.view.C2774o;
import androidx.core.view.D;
import androidx.core.view.E;
import androidx.core.view.G;
import androidx.core.view.H;
import androidx.core.view.InterfaceC2776p;
import androidx.core.view.M;
import androidx.core.view.ScrollingView;
import x1.AbstractC7044a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements G, D, ScrollingView {

    /* JADX INFO: renamed from: E */
    private static final float f29131E = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: F */
    private static final a f29132F = new a();

    /* JADX INFO: renamed from: G */
    private static final int[] f29133G = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A */
    private float f29134A;

    /* JADX INFO: renamed from: B */
    private e f29135B;

    /* JADX INFO: renamed from: C */
    final d f29136C;

    /* JADX INFO: renamed from: D */
    C2774o f29137D;

    /* JADX INFO: renamed from: a */
    private final float f29138a;

    /* JADX INFO: renamed from: b */
    private long f29139b;

    /* JADX INFO: renamed from: c */
    private final Rect f29140c;

    /* JADX INFO: renamed from: d */
    private OverScroller f29141d;

    /* JADX INFO: renamed from: e */
    public EdgeEffect f29142e;

    /* JADX INFO: renamed from: f */
    public EdgeEffect f29143f;

    /* JADX INFO: renamed from: g */
    M f29144g;

    /* JADX INFO: renamed from: h */
    private int f29145h;

    /* JADX INFO: renamed from: i */
    private boolean f29146i;

    /* JADX INFO: renamed from: j */
    private boolean f29147j;

    /* JADX INFO: renamed from: k */
    private View f29148k;

    /* JADX INFO: renamed from: l */
    private boolean f29149l;

    /* JADX INFO: renamed from: m */
    private VelocityTracker f29150m;

    /* JADX INFO: renamed from: n */
    private boolean f29151n;

    /* JADX INFO: renamed from: o */
    private boolean f29152o;

    /* JADX INFO: renamed from: p */
    private int f29153p;

    /* JADX INFO: renamed from: q */
    private int f29154q;

    /* JADX INFO: renamed from: r */
    private int f29155r;

    /* JADX INFO: renamed from: s */
    private int f29156s;

    /* JADX INFO: renamed from: t */
    private final int[] f29157t;

    /* JADX INFO: renamed from: u */
    private final int[] f29158u;

    /* JADX INFO: renamed from: v */
    private int f29159v;

    /* JADX INFO: renamed from: w */
    private int f29160w;

    /* JADX INFO: renamed from: x */
    private f f29161x;

    /* JADX INFO: renamed from: y */
    private final H f29162y;

    /* JADX INFO: renamed from: z */
    private final E f29163z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends C2746a {
        a() {
        }

        @Override // androidx.core.view.C2746a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            L1.D.a(accessibilityEvent, nestedScrollView.getScrollX());
            L1.D.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.C2746a
        public void g(View view, B b10) {
            int scrollRange;
            super.g(view, b10);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            b10.z0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            b10.c1(true);
            if (nestedScrollView.getScrollY() > 0) {
                b10.b(B.a.f11226r);
                b10.b(B.a.f11193C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                b10.b(B.a.f11225q);
                b10.b(B.a.f11195E);
            }
        }

        @Override // androidx.core.view.C2746a
        public boolean j(View view, int i10, Bundle bundle) {
            if (super.j(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.X(0, iMax, true);
                    return true;
                }
                if (i10 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.X(0, iMin, true);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c {
        public static void a(View view, float f10) {
            try {
                view.setFrameContentVelocity(f10);
            } catch (LinkageError unused) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d implements InterfaceC2776p {
        d() {
        }

        @Override // androidx.core.view.InterfaceC2776p
        public boolean a(float f10) {
            if (f10 == 0.0f) {
                return false;
            }
            c();
            NestedScrollView.this.v((int) f10);
            return true;
        }

        @Override // androidx.core.view.InterfaceC2776p
        public float b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // androidx.core.view.InterfaceC2776p
        public void c() {
            NestedScrollView.this.f29141d.abortAnimation();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface e {
        void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        public int f29165a;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f29165a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f29165a);
        }

        f(Parcel parcel) {
            super(parcel);
            this.f29165a = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC7044a.f63604c);
    }

    private void A() {
        VelocityTracker velocityTracker = this.f29150m;
        if (velocityTracker == null) {
            this.f29150m = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void B() {
        this.f29141d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f29153p = viewConfiguration.getScaledTouchSlop();
        this.f29154q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f29155r = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void C() {
        if (this.f29150m == null) {
            this.f29150m = VelocityTracker.obtain();
        }
    }

    private void D(int i10, int i11) {
        this.f29145h = i10;
        this.f29156s = i11;
        Y(2, 0);
    }

    private boolean E(View view) {
        return !G(view, 0, getHeight());
    }

    private static boolean F(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && F((View) parent, view2);
    }

    private boolean G(View view, int i10, int i11) {
        view.getDrawingRect(this.f29140c);
        offsetDescendantRectToMyCoords(view, this.f29140c);
        return this.f29140c.bottom + i10 >= getScrollY() && this.f29140c.top - i10 <= getScrollY() + i11;
    }

    private void H(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f29163z.e(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    private void I(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f29156s) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f29145h = (int) motionEvent.getY(i10);
            this.f29156s = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f29150m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void L() {
        VelocityTracker velocityTracker = this.f29150m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f29150m = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int M(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f29142e
            float r0 = androidx.core.widget.d.b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.f29142e
            float r4 = -r4
            float r4 = androidx.core.widget.d.d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f29142e
            float r5 = androidx.core.widget.d.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f29142e
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.f29143f
            float r0 = androidx.core.widget.d.b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.f29143f
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.d.d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f29143f
            float r5 = androidx.core.widget.d.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f29143f
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L63
            r3.invalidate()
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.M(int, float):int");
    }

    private void N(boolean z10) {
        if (z10) {
            Y(2, 1);
        } else {
            a0(1);
        }
        this.f29160w = getScrollY();
        postInvalidateOnAnimation();
    }

    private boolean O(int i10, int i11, int i12) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z10 = false;
        boolean z11 = i10 == 33;
        View viewU = u(z11, i11, i12);
        if (viewU == null) {
            viewU = this;
        }
        if (i11 < scrollY || i12 > i13) {
            P(z11 ? i11 - scrollY : i12 - i13, 0, 1, true);
            z10 = true;
        }
        if (viewU != findFocus()) {
            viewU.requestFocus(i10);
        }
        return z10;
    }

    private int P(int i10, int i11, int i12, boolean z10) {
        return Q(i10, -1, null, i11, i12, z10);
    }

    private void R(View view) {
        view.getDrawingRect(this.f29140c);
        offsetDescendantRectToMyCoords(view, this.f29140c);
        int iG = g(this.f29140c);
        if (iG != 0) {
            scrollBy(0, iG);
        }
    }

    private boolean S(Rect rect, boolean z10) {
        int iG = g(rect);
        boolean z11 = iG != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, iG);
                return z11;
            }
            U(0, iG);
        }
        return z11;
    }

    private boolean T(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        return x(-i10) < androidx.core.widget.d.b(edgeEffect) * ((float) getHeight());
    }

    private void V(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f29139b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f29141d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, i12);
            N(z10);
        } else {
            if (!this.f29141d.isFinished()) {
                a();
            }
            scrollBy(i10, i11);
        }
        this.f29139b = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean Z(MotionEvent motionEvent) {
        boolean z10;
        if (androidx.core.widget.d.b(this.f29142e) != 0.0f) {
            androidx.core.widget.d.d(this.f29142e, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        if (androidx.core.widget.d.b(this.f29143f) == 0.0f) {
            return z10;
        }
        androidx.core.widget.d.d(this.f29143f, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void a() {
        this.f29141d.abortAnimation();
        a0(1);
    }

    private boolean d() {
        int overScrollMode = getOverScrollMode();
        return overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0);
    }

    private boolean e() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    private static int f(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private M getScrollFeedbackProvider() {
        if (this.f29144g == null) {
            this.f29144g = M.a(this);
        }
        return this.f29144g;
    }

    private void q(int i10) {
        if (i10 != 0) {
            if (this.f29152o) {
                U(0, i10);
            } else {
                scrollBy(0, i10);
            }
        }
    }

    private boolean r(int i10) {
        if (androidx.core.widget.d.b(this.f29142e) != 0.0f) {
            if (T(this.f29142e, i10)) {
                this.f29142e.onAbsorb(i10);
                return true;
            }
            v(-i10);
            return true;
        }
        if (androidx.core.widget.d.b(this.f29143f) == 0.0f) {
            return false;
        }
        int i11 = -i10;
        if (T(this.f29143f, i11)) {
            this.f29143f.onAbsorb(i11);
            return true;
        }
        v(i11);
        return true;
    }

    private void s() {
        this.f29156s = -1;
        this.f29149l = false;
        L();
        a0(0);
        this.f29142e.onRelease();
        this.f29143f.onRelease();
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.view.View u(boolean r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 2
            java.util.ArrayList r0 = r12.getFocusables(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = r3
            r5 = r4
        Ld:
            if (r4 >= r1) goto L53
            java.lang.Object r6 = r0.get(r4)
            android.view.View r6 = (android.view.View) r6
            int r7 = r6.getTop()
            int r8 = r6.getBottom()
            if (r14 >= r8) goto L50
            if (r7 >= r15) goto L50
            r9 = 1
            if (r14 >= r7) goto L28
            if (r8 >= r15) goto L28
            r10 = r9
            goto L29
        L28:
            r10 = r3
        L29:
            if (r2 != 0) goto L2e
            r2 = r6
            r5 = r10
            goto L50
        L2e:
            if (r13 == 0) goto L36
            int r11 = r2.getTop()
            if (r7 < r11) goto L3e
        L36:
            if (r13 != 0) goto L40
            int r7 = r2.getBottom()
            if (r8 <= r7) goto L40
        L3e:
            r7 = r9
            goto L41
        L40:
            r7 = r3
        L41:
            if (r5 == 0) goto L48
            if (r10 == 0) goto L50
            if (r7 == 0) goto L50
            goto L4f
        L48:
            if (r10 == 0) goto L4d
            r2 = r6
            r5 = r9
            goto L50
        L4d:
            if (r7 == 0) goto L50
        L4f:
            r2 = r6
        L50:
            int r4 = r4 + 1
            goto Ld
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.u(boolean, int, int):android.view.View");
    }

    private float x(int i10) {
        double dLog = Math.log((Math.abs(i10) * 0.35f) / (this.f29138a * 0.015f));
        float f10 = f29131E;
        return (float) (((double) (this.f29138a * 0.015f)) * Math.exp((((double) f10) / (((double) f10) - 1.0d)) * dLog));
    }

    private boolean z(int i10, int i11) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            if (i11 >= childAt.getTop() - scrollY && i11 < childAt.getBottom() - scrollY && i10 >= childAt.getLeft() && i10 < childAt.getRight()) {
                return true;
            }
        }
        return false;
    }

    boolean J(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        boolean z11;
        boolean z12;
        int i18;
        int overScrollMode = getOverScrollMode();
        boolean z13 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z14 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z15 = overScrollMode == 0 || (overScrollMode == 1 && z13);
        boolean z16 = overScrollMode == 0 || (overScrollMode == 1 && z14);
        int i19 = i12 + i10;
        int i20 = !z15 ? 0 : i16;
        int i21 = i13 + i11;
        int i22 = !z16 ? 0 : i17;
        int i23 = -i20;
        int i24 = i20 + i14;
        int i25 = -i22;
        int i26 = i22 + i15;
        if (i19 > i24) {
            i19 = i24;
            z11 = true;
        } else if (i19 < i23) {
            z11 = true;
            i19 = i23;
        } else {
            z11 = false;
        }
        if (i21 > i26) {
            i21 = i26;
            z12 = true;
        } else if (i21 < i25) {
            z12 = true;
            i21 = i25;
        } else {
            z12 = false;
        }
        if (!z12 || y(1)) {
            i18 = i19;
        } else {
            int i27 = i19;
            this.f29141d.springBack(i27, i21, 0, 0, 0, getScrollRange());
            i18 = i27;
        }
        onOverScrolled(i18, i21, z11, z12);
        return z11 || z12;
    }

    public boolean K(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        if (z10) {
            this.f29140c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f29140c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f29140c.top = getScrollY() - height;
            Rect rect2 = this.f29140c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f29140c;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return O(i10, i11, i12);
    }

    int Q(int i10, int i11, MotionEvent motionEvent, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        VelocityTracker velocityTracker;
        if (i13 == 1) {
            Y(2, i13);
        }
        boolean z11 = false;
        if (l(0, i10, this.f29158u, this.f29157t, i13)) {
            int i16 = i10 - this.f29158u[1];
            i15 = this.f29157t[1];
            i14 = i16;
        } else {
            i14 = i10;
            i15 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z12 = d() && !z10;
        int i17 = i14;
        boolean z13 = J(0, i14, 0, scrollY, 0, scrollRange, 0, 0, true) && !y(i13);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().c(motionEvent.getDeviceId(), motionEvent.getSource(), i11, scrollY2);
        }
        int[] iArr = this.f29158u;
        iArr[1] = 0;
        p(0, scrollY2, 0, i17 - scrollY2, this.f29157t, i13, iArr);
        int i18 = i15 + this.f29157t[1];
        int i19 = i17 - this.f29158u[1];
        int i20 = scrollY + i19;
        if (i20 < 0) {
            if (z12) {
                androidx.core.widget.d.d(this.f29142e, (-i19) / getHeight(), i12 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().b(motionEvent.getDeviceId(), motionEvent.getSource(), i11, true);
                }
                if (!this.f29143f.isFinished()) {
                    this.f29143f.onRelease();
                }
            }
        } else if (i20 > scrollRange && z12) {
            androidx.core.widget.d.d(this.f29143f, i19 / getHeight(), 1.0f - (i12 / getWidth()));
            if (motionEvent != null) {
                getScrollFeedbackProvider().b(motionEvent.getDeviceId(), motionEvent.getSource(), i11, false);
            }
            if (!this.f29142e.isFinished()) {
                this.f29142e.onRelease();
            }
        }
        if (this.f29142e.isFinished() && this.f29143f.isFinished()) {
            z11 = z13;
        } else {
            postInvalidateOnAnimation();
        }
        if (z11 && i13 == 0 && (velocityTracker = this.f29150m) != null) {
            velocityTracker.clear();
        }
        if (i13 == 1) {
            a0(i13);
            this.f29142e.onRelease();
            this.f29143f.onRelease();
        }
        return i18;
    }

    public final void U(int i10, int i11) {
        V(i10, i11, 250, false);
    }

    void W(int i10, int i11, int i12, boolean z10) {
        V(i10 - getScrollX(), i11 - getScrollY(), i12, z10);
    }

    void X(int i10, int i11, boolean z10) {
        W(i10, i11, 250, z10);
    }

    public boolean Y(int i10, int i11) {
        return this.f29163z.p(i10, i11);
    }

    public void a0(int i10) {
        this.f29163z.r(i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public boolean c(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !G(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            P(maxScrollAmount, 0, 1, true);
        } else {
            viewFindNextFocus.getDrawingRect(this.f29140c);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f29140c);
            P(g(this.f29140c), 0, 1, true);
            viewFindNextFocus.requestFocus(i10);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && E(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        int i10;
        if (this.f29141d.isFinished()) {
            return;
        }
        this.f29141d.computeScrollOffset();
        int currY = this.f29141d.getCurrY();
        int iH = h(currY - this.f29160w);
        this.f29160w = currY;
        int[] iArr = this.f29158u;
        iArr[1] = 0;
        l(0, iH, iArr, null, 1);
        int i11 = iH - this.f29158u[1];
        int scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            c.a(this, Math.abs(this.f29141d.getCurrVelocity()));
        }
        if (i11 != 0) {
            int scrollY = getScrollY();
            J(0, i11, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            i10 = scrollRange;
            int scrollY2 = getScrollY() - scrollY;
            int i12 = i11 - scrollY2;
            int[] iArr2 = this.f29158u;
            iArr2[1] = 0;
            p(0, scrollY2, 0, i12, this.f29157t, 1, iArr2);
            i11 = i12 - this.f29158u[1];
        } else {
            i10 = scrollRange;
        }
        if (i11 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && i10 > 0)) {
                if (i11 < 0) {
                    if (this.f29142e.isFinished()) {
                        this.f29142e.onAbsorb((int) this.f29141d.getCurrVelocity());
                    }
                } else if (this.f29143f.isFinished()) {
                    this.f29143f.onAbsorb((int) this.f29141d.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f29141d.isFinished()) {
            a0(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || t(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f29163z.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f29163z.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return l(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f29163z.f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f29142e.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f29142e.setSize(width, height);
            if (this.f29142e.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f29143f.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f29143f.setSize(width2, height2);
        if (this.f29143f.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    protected int g(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i11, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f29162y.a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    float getVerticalScrollFactorCompat() {
        if (this.f29134A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f29134A = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f29134A;
    }

    int h(int i10) {
        int height = getHeight();
        if (i10 > 0 && androidx.core.widget.d.b(this.f29142e) != 0.0f) {
            int iRound = Math.round(((-height) / 4.0f) * androidx.core.widget.d.d(this.f29142e, ((-i10) * 4.0f) / height, 0.5f));
            if (iRound != i10) {
                this.f29142e.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || androidx.core.widget.d.b(this.f29143f) == 0.0f) {
            return i10;
        }
        float f10 = height;
        int iRound2 = Math.round((f10 / 4.0f) * androidx.core.widget.d.d(this.f29143f, (i10 * 4.0f) / f10, 0.5f));
        if (iRound2 != i10) {
            this.f29143f.finish();
        }
        return i10 - iRound2;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return y(0);
    }

    @Override // androidx.core.view.F
    public void i(View view, View view2, int i10, int i11) {
        this.f29162y.c(view, view2, i10, i11);
        Y(2, i11);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f29163z.l();
    }

    @Override // androidx.core.view.F
    public void j(View view, int i10) {
        this.f29162y.e(view, i10);
        a0(i10);
    }

    @Override // androidx.core.view.F
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        l(i10, i11, iArr, null, i12);
    }

    public boolean l(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.f29163z.d(i10, i11, iArr, iArr2, i12);
    }

    @Override // androidx.core.view.G
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        H(i13, i14, iArr);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i10, int i11) {
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // androidx.core.view.F
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        H(i13, i14, null);
    }

    @Override // androidx.core.view.F
    public boolean o(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29147j = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i10;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f29149l) {
            if (C.a(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
                i10 = 9;
                width = (int) motionEvent.getX();
            } else if (C.a(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i10 = 26;
                axisValue = axisValue2;
            } else {
                i10 = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                Q(-((int) (axisValue * getVerticalScrollFactorCompat())), i10, motionEvent, width, 1, C.a(motionEvent, 8194));
                if (i10 == 0) {
                    return true;
                }
                this.f29137D.g(motionEvent, i10);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x007e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredHeight = 0;
        this.f29146i = false;
        View view = this.f29148k;
        if (view != null && F(view, this)) {
            R(this.f29148k);
        }
        this.f29148k = null;
        if (!this.f29147j) {
            if (this.f29161x != null) {
                scrollTo(getScrollX(), this.f29161x.f29165a);
                this.f29161x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iF = f(scrollY, paddingTop, measuredHeight);
            if (iF != scrollY) {
                scrollTo(getScrollX(), iF);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f29147j = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f29151n && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        v((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        k(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        H(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        i(view, view2, i10, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i10) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        if (viewFindNextFocus == null || E(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        this.f29161x = fVar;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f29165a = getScrollY();
        return fVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        e eVar = this.f29135B;
        if (eVar != null) {
            eVar.a(this, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !G(viewFindFocus, 0, i13)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f29140c);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f29140c);
        q(g(this.f29140c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        j(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        NestedScrollView nestedScrollView;
        ViewParent parent;
        C();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f29159v = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.f29159v);
        if (actionMasked == 0) {
            nestedScrollView = this;
            if (getChildCount() == 0) {
                return false;
            }
            if (nestedScrollView.f29149l && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!nestedScrollView.f29141d.isFinished()) {
                a();
            }
            D((int) motionEvent.getY(), motionEvent.getPointerId(0));
        } else if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f29156s);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f29156s + " in onTouchEvent");
                } else {
                    int y10 = (int) motionEvent.getY(iFindPointerIndex);
                    int i10 = this.f29145h - y10;
                    int iM = i10 - M(i10, motionEvent.getX(iFindPointerIndex));
                    if (!this.f29149l && Math.abs(iM) > this.f29153p) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f29149l = true;
                        iM = iM > 0 ? iM - this.f29153p : iM + this.f29153p;
                    }
                    int i11 = iM;
                    if (this.f29149l) {
                        nestedScrollView = this;
                        int iQ = nestedScrollView.Q(i11, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        nestedScrollView.f29145h = y10 - iQ;
                        nestedScrollView.f29159v += iQ;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f29149l && getChildCount() > 0 && this.f29141d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f29145h = (int) motionEvent.getY(actionIndex);
                this.f29156s = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                I(motionEvent);
                this.f29145h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f29156s));
            }
            nestedScrollView = this;
        } else {
            nestedScrollView = this;
            VelocityTracker velocityTracker = nestedScrollView.f29150m;
            velocityTracker.computeCurrentVelocity(1000, nestedScrollView.f29155r);
            int yVelocity = (int) velocityTracker.getYVelocity(nestedScrollView.f29156s);
            if (Math.abs(yVelocity) >= nestedScrollView.f29154q) {
                if (!r(yVelocity)) {
                    int i12 = -yVelocity;
                    float f10 = i12;
                    if (!dispatchNestedPreFling(0.0f, f10)) {
                        dispatchNestedFling(0.0f, f10, true);
                        v(i12);
                    }
                }
            } else if (nestedScrollView.f29141d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            s();
        }
        VelocityTracker velocityTracker2 = nestedScrollView.f29150m;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public void p(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.f29163z.e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f29146i) {
            this.f29148k = view2;
        } else {
            R(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return S(rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            L();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f29146i = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iF = f(i10, width, width2);
            int iF2 = f(i11, height, height2);
            if (iF == getScrollX() && iF2 == getScrollY()) {
                return;
            }
            super.scrollTo(iF, iF2);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f29151n) {
            this.f29151n = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f29163z.m(z10);
    }

    public void setOnScrollChangeListener(e eVar) {
        this.f29135B = eVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f29152o = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return Y(i10, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        a0(0);
    }

    public boolean t(KeyEvent keyEvent) {
        this.f29140c.setEmpty();
        if (!e()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
            return false;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? w(33) : c(33);
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? w(130) : c(130);
            }
            if (keyCode == 62) {
                K(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
            if (keyCode == 92) {
                return w(33);
            }
            if (keyCode == 93) {
                return w(130);
            }
            if (keyCode == 122) {
                K(33);
                return false;
            }
            if (keyCode == 123) {
                K(130);
                return false;
            }
        }
        return false;
    }

    public void v(int i10) {
        if (getChildCount() > 0) {
            this.f29141d.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            N(true);
            if (Build.VERSION.SDK_INT >= 35) {
                c.a(this, Math.abs(this.f29141d.getCurrVelocity()));
            }
        }
    }

    public boolean w(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f29140c;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f29140c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f29140c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f29140c;
        return O(i10, rect3.top, rect3.bottom);
    }

    public boolean y(int i10) {
        return this.f29163z.k(i10);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f29140c = new Rect();
        this.f29146i = true;
        this.f29147j = false;
        this.f29148k = null;
        this.f29149l = false;
        this.f29152o = true;
        this.f29156s = -1;
        this.f29157t = new int[2];
        this.f29158u = new int[2];
        d dVar = new d();
        this.f29136C = dVar;
        this.f29137D = new C2774o(getContext(), dVar);
        this.f29142e = androidx.core.widget.d.a(context, attributeSet);
        this.f29143f = androidx.core.widget.d.a(context, attributeSet);
        this.f29138a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        B();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f29133G, i10, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f29162y = new H(this);
        this.f29163z = new E(this);
        setNestedScrollingEnabled(true);
        AbstractC2747a0.k0(this, f29132F);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
