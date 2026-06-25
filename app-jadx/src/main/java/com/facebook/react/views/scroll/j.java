package com.facebook.react.views.scroll;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import androidx.core.view.AbstractC2747a0;
import com.facebook.react.AbstractC3247l;
import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.C;
import com.facebook.react.uimanager.C3281a;
import com.facebook.react.uimanager.C3303t;
import com.facebook.react.uimanager.C3306w;
import com.facebook.react.uimanager.EnumC3304u;
import com.facebook.react.uimanager.F;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.InterfaceC3282a0;
import com.facebook.react.uimanager.K;
import com.facebook.react.views.scroll.f;
import com.facebook.react.views.scroll.n;
import h7.C4914b;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class j extends HorizontalScrollView implements F, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener, h, K, n.c, n.e, n.a, n.b, n.d, s {

    /* JADX INFO: renamed from: o0 */
    private static final boolean f38022o0 = false;

    /* JADX INFO: renamed from: p0 */
    private static final String f38023p0 = "j";

    /* JADX INFO: renamed from: q0 */
    private static Field f38024q0 = null;

    /* JADX INFO: renamed from: r0 */
    private static boolean f38025r0 = false;

    /* JADX INFO: renamed from: A */
    private boolean f38026A;

    /* JADX INFO: renamed from: B */
    private int f38027B;

    /* JADX INFO: renamed from: C */
    private int f38028C;

    /* JADX INFO: renamed from: D */
    private InterfaceC3282a0 f38029D;

    /* JADX INFO: renamed from: E */
    private n.h f38030E;

    /* JADX INFO: renamed from: F */
    private C f38031F;

    /* JADX INFO: renamed from: G */
    private long f38032G;

    /* JADX INFO: renamed from: H */
    private int f38033H;

    /* JADX INFO: renamed from: I */
    private View f38034I;

    /* JADX INFO: renamed from: a */
    private int f38035a;

    /* JADX INFO: renamed from: b */
    private final g f38036b;

    /* JADX INFO: renamed from: c */
    private final OverScroller f38037c;

    /* JADX INFO: renamed from: d */
    private final q f38038d;

    /* JADX INFO: renamed from: e */
    private final Rect f38039e;

    /* JADX INFO: renamed from: f */
    private final ValueAnimator f38040f;

    /* JADX INFO: renamed from: g */
    private Rect f38041g;

    /* JADX INFO: renamed from: h */
    private v f38042h;

    /* JADX INFO: renamed from: i */
    private boolean f38043i;

    /* JADX INFO: renamed from: j */
    private Rect f38044j;

    /* JADX INFO: renamed from: k */
    private H7.v f38045k;

    /* JADX INFO: renamed from: l */
    private boolean f38046l;

    /* JADX INFO: renamed from: l0 */
    private f f38047l0;

    /* JADX INFO: renamed from: m */
    private boolean f38048m;

    /* JADX INFO: renamed from: m0 */
    private int f38049m0;

    /* JADX INFO: renamed from: n */
    private Runnable f38050n;

    /* JADX INFO: renamed from: n0 */
    private int f38051n0;

    /* JADX INFO: renamed from: o */
    private boolean f38052o;

    /* JADX INFO: renamed from: p */
    private boolean f38053p;

    /* JADX INFO: renamed from: q */
    private boolean f38054q;

    /* JADX INFO: renamed from: r */
    private String f38055r;

    /* JADX INFO: renamed from: s */
    private Drawable f38056s;

    /* JADX INFO: renamed from: t */
    private int f38057t;

    /* JADX INFO: renamed from: u */
    private boolean f38058u;

    /* JADX INFO: renamed from: v */
    private int f38059v;

    /* JADX INFO: renamed from: w */
    private List f38060w;

    /* JADX INFO: renamed from: x */
    private boolean f38061x;

    /* JADX INFO: renamed from: y */
    private boolean f38062y;

    /* JADX INFO: renamed from: z */
    private int f38063z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.f38050n = null;
            j.this.x(0, 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        private boolean f38065a = false;

        /* JADX INFO: renamed from: b */
        private int f38066b = 0;

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j.this.f38043i) {
                j.this.f38043i = false;
                this.f38066b = 0;
                j.this.postOnAnimationDelayed(this, 20L);
                return;
            }
            n.z(j.this);
            int i10 = this.f38066b + 1;
            this.f38066b = i10;
            if (i10 >= 3) {
                j.this.f38050n = null;
                if (j.this.f38054q) {
                    n.l(j.this);
                }
                n.r(j.this);
                return;
            }
            if (j.this.f38048m && !this.f38065a) {
                this.f38065a = true;
                j.this.s(0);
            }
            j.this.postOnAnimationDelayed(this, 20L);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f38068a;

        static {
            int[] iArr = new int[H7.v.values().length];
            f38068a = iArr;
            try {
                iArr[H7.v.f8137c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38068a[H7.v.f8138d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38068a[H7.v.f8136b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public j(Context context, com.facebook.react.views.scroll.a aVar) {
        super(context);
        this.f38035a = Integer.MIN_VALUE;
        this.f38036b = new g();
        this.f38038d = new q();
        this.f38039e = new Rect();
        this.f38040f = ObjectAnimator.ofInt(this, "scrollX", 0, 0);
        this.f38041g = new Rect();
        this.f38045k = H7.v.f8138d;
        this.f38048m = false;
        this.f38053p = true;
        this.f38057t = 0;
        this.f38058u = false;
        this.f38059v = 0;
        this.f38061x = true;
        this.f38062y = true;
        this.f38063z = 0;
        this.f38026A = false;
        this.f38027B = -1;
        this.f38028C = -1;
        this.f38029D = null;
        this.f38031F = C.f37391e;
        this.f38032G = 0L;
        this.f38033H = 0;
        this.f38049m0 = 0;
        this.f38051n0 = 0;
        AbstractC2747a0.k0(this, new l());
        this.f38037c = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setClipChildren(false);
        y();
    }

    private boolean A(View view) {
        int iV = v(view);
        view.getDrawingRect(this.f38039e);
        return iV != 0 && Math.abs(iV) < this.f38039e.width() / 2;
    }

    private boolean B() {
        return false;
    }

    private boolean C(View view) {
        return v(view) == 0;
    }

    private int D(int i10) {
        return getFlingAnimator() == this.f38040f ? n.u(this, i10, 0, Math.max(0, computeHorizontalScrollRange() - getWidth()), 0).x : n.p(this, getScrollX(), getReactScrollViewScrollState().d().x, i10) + t(i10);
    }

    private void E(int i10, int i11) {
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().cancel();
        }
        OverScroller overScroller = this.f38037c;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        int currX = this.f38037c.getCurrX();
        boolean zComputeScrollOffset = this.f38037c.computeScrollOffset();
        this.f38037c.forceFinished(true);
        if (!zComputeScrollOffset) {
            scrollTo((this.f38037c.getCurrX() - currX) + i10, getScrollY());
            return;
        }
        this.f38037c.fling(i10, getScrollY(), (int) (this.f38037c.getCurrVelocity() * Math.signum(this.f38037c.getFinalX() - this.f38037c.getStartX())), 0, 0, i11, 0, 0);
    }

    private void I(View view) {
        int iV = v(view);
        if (iV != 0) {
            scrollBy(iV, 0);
        }
    }

    private void K(int i10, int i11) {
        if (f38022o0) {
            AbstractC7283a.u(f38023p0, "setPendingContentOffsets[%d] x %d y %d", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        if (z()) {
            this.f38027B = -1;
            this.f38028C = -1;
        } else {
            this.f38027B = i10;
            this.f38028C = i11;
        }
    }

    private void L(int i10) {
        if (f38022o0) {
            AbstractC7283a.t(f38023p0, "smoothScrollAndSnap[%d] velocity %d", Integer.valueOf(getId()), Integer.valueOf(i10));
        }
        double snapInterval = getSnapInterval();
        double dP = n.p(this, getScrollX(), getReactScrollViewScrollState().d().x, i10);
        double D10 = D(i10);
        double d10 = dP / snapInterval;
        int iFloor = (int) Math.floor(d10);
        int iCeil = (int) Math.ceil(d10);
        int iRound = (int) Math.round(d10);
        int iRound2 = (int) Math.round(D10 / snapInterval);
        if (i10 > 0 && iCeil == iFloor) {
            iCeil++;
        } else if (i10 < 0 && iFloor == iCeil) {
            iFloor--;
        }
        if (i10 > 0 && iRound < iCeil && iRound2 > iFloor) {
            iRound = iCeil;
        } else if (i10 < 0 && iRound > iFloor && iRound2 < iCeil) {
            iRound = iFloor;
        }
        double d11 = ((double) iRound) * snapInterval;
        if (d11 != dP) {
            this.f38043i = true;
            b((int) d11, getScrollY());
        }
    }

    private void M(int i10) {
        if (f38022o0) {
            AbstractC7283a.t(f38023p0, "smoothScrollToNextPage[%d] direction %d", Integer.valueOf(getId()), Integer.valueOf(i10));
        }
        int width = getWidth();
        int scrollX = getScrollX();
        int i11 = scrollX / width;
        if (scrollX % width != 0) {
            i11++;
        }
        int i12 = i10 == 17 ? i11 - 1 : i11 + 1;
        if (i12 < 0) {
            i12 = 0;
        }
        b(i12 * width, getScrollY());
        x(0, 0);
    }

    private View getContentView() {
        return getChildAt(0);
    }

    private OverScroller getOverScrollerFromParent() {
        if (!f38025r0) {
            f38025r0 = true;
            try {
                Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
                f38024q0 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                AbstractC7283a.I(f38023p0, "Failed to get mScroller field for HorizontalScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = f38024q0;
        OverScroller overScroller = null;
        if (field != null) {
            try {
                Object obj = field.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    AbstractC7283a.I(f38023p0, "Failed to cast mScroller field in HorizontalScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Failed to get mScroller from HorizontalScrollView!", e10);
            }
        }
        return overScroller;
    }

    private int getSnapInterval() {
        int i10 = this.f38059v;
        return i10 != 0 ? i10 : getWidth();
    }

    private void m(int i10, int i11, int i12, int i13) {
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().end();
        }
        int i14 = i11 - i10;
        int scrollX = i14 - (i13 - getScrollX());
        scrollTo(scrollX, getScrollY());
        E(scrollX, i14 - getWidth());
    }

    private void n() {
        Runnable runnable = this.f38050n;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f38050n = null;
            getFlingAnimator().cancel();
        }
    }

    private void o() {
        if (B()) {
            Q6.a.c(null);
            Q6.a.c(this.f38055r);
            throw null;
        }
    }

    private static HorizontalScrollView p(View view, MotionEvent motionEvent) {
        return q(view, motionEvent, true);
    }

    private static HorizontalScrollView q(View view, MotionEvent motionEvent, boolean z10) {
        if (view == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            return null;
        }
        if (!z10 && (view instanceof HorizontalScrollView) && AbstractC2747a0.R(view) && (view instanceof j) && ((j) view).f38053p) {
            return (HorizontalScrollView) view;
        }
        if (view instanceof ViewGroup) {
            int i10 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i10 >= viewGroup.getChildCount()) {
                    break;
                }
                HorizontalScrollView horizontalScrollViewQ = q(viewGroup.getChildAt(i10), motionEvent, false);
                if (horizontalScrollViewQ != null) {
                    return horizontalScrollViewQ;
                }
                i10++;
            }
        }
        return null;
    }

    public void s(int i10) {
        int scrollX;
        int iMin;
        int iIntValue;
        int iMax;
        int iIntValue2;
        OverScroller overScroller;
        if (f38022o0) {
            AbstractC7283a.t(f38023p0, "smoothScrollAndSnap[%d] velocityX %d", Integer.valueOf(getId()), Integer.valueOf(i10));
        }
        if (getChildCount() <= 0) {
            return;
        }
        if (this.f38059v == 0 && this.f38060w == null && this.f38063z == 0) {
            L(i10);
            return;
        }
        boolean z10 = getFlingAnimator() != this.f38040f;
        int iMax2 = Math.max(0, computeHorizontalScrollRange() - getWidth());
        int iD = D(i10);
        if (this.f38058u) {
            iD = getScrollX();
        }
        int width = (getWidth() - AbstractC2747a0.D(this)) - AbstractC2747a0.C(this);
        if (getLayoutDirection() == 1) {
            iD = iMax2 - iD;
            scrollX = -i10;
        } else {
            scrollX = i10;
        }
        List list = this.f38060w;
        if (list == null || list.isEmpty()) {
            int i11 = this.f38063z;
            if (i11 != 0) {
                int i12 = this.f38059v;
                if (i12 > 0) {
                    double d10 = ((double) iD) / ((double) i12);
                    double dFloor = Math.floor(d10);
                    int i13 = this.f38059v;
                    int iMax3 = Math.max(u(i11, (int) (dFloor * ((double) i13)), i13, width), 0);
                    int i14 = this.f38063z;
                    double dCeil = Math.ceil(d10);
                    int i15 = this.f38059v;
                    iMin = Math.min(u(i14, (int) (dCeil * ((double) i15)), i15, width), iMax2);
                    iIntValue = iMax2;
                    iMax = iMax3;
                    iIntValue2 = 0;
                } else {
                    ViewGroup viewGroup = (ViewGroup) getContentView();
                    int iMin2 = iMax2;
                    int i16 = iMin2;
                    int i17 = 0;
                    int iMax4 = 0;
                    for (int i18 = 0; i18 < viewGroup.getChildCount(); i18++) {
                        View childAt = viewGroup.getChildAt(i18);
                        int iU = u(this.f38063z, childAt.getLeft(), childAt.getWidth(), width);
                        if (iU <= iD && iD - iU < iD - i17) {
                            i17 = iU;
                        }
                        if (iU >= iD && iU - iD < i16 - iD) {
                            i16 = iU;
                        }
                        iMin2 = Math.min(iMin2, iU);
                        iMax4 = Math.max(iMax4, iU);
                    }
                    iMax = Math.max(i17, iMin2);
                    iMin = Math.min(i16, iMax4);
                    iIntValue = iMax2;
                }
            } else {
                double snapInterval = getSnapInterval();
                double d11 = ((double) iD) / snapInterval;
                int iFloor = (int) (Math.floor(d11) * snapInterval);
                iMin = Math.min((int) (Math.ceil(d11) * snapInterval), iMax2);
                iIntValue = iMax2;
                iMax = iFloor;
            }
            iIntValue2 = 0;
        } else {
            iIntValue2 = ((Integer) this.f38060w.get(0)).intValue();
            List list2 = this.f38060w;
            iIntValue = ((Integer) list2.get(list2.size() - 1)).intValue();
            iMin = iMax2;
            iMax = 0;
            for (int i19 = 0; i19 < this.f38060w.size(); i19++) {
                int iIntValue3 = ((Integer) this.f38060w.get(i19)).intValue();
                if (iIntValue3 <= iD && iD - iIntValue3 < iD - iMax) {
                    iMax = iIntValue3;
                }
                if (iIntValue3 >= iD && iIntValue3 - iD < iMin - iD) {
                    iMin = iIntValue3;
                }
            }
        }
        int i20 = iD - iMax;
        int i21 = iMin - iD;
        int i22 = Math.abs(i20) < Math.abs(i21) ? iMax : iMin;
        int scrollX2 = getScrollX();
        if (getLayoutDirection() == 1) {
            scrollX2 = iMax2 - scrollX2;
        }
        if (this.f38062y || iD < iIntValue) {
            if (this.f38061x || iD > iIntValue2) {
                if (scrollX > 0) {
                    if (!z10) {
                        scrollX += (int) (((double) i21) * 10.0d);
                    }
                    iD = iMin;
                } else if (scrollX < 0) {
                    if (!z10) {
                        scrollX -= (int) (((double) i20) * 10.0d);
                    }
                    iD = iMax;
                } else {
                    iD = i22;
                }
            } else if (scrollX2 > iIntValue2) {
                iD = iIntValue2;
            }
        } else if (scrollX2 < iIntValue) {
            iD = iIntValue;
        }
        int iMin3 = Math.min(Math.max(0, iD), iMax2);
        if (getLayoutDirection() == 1) {
            iMin3 = iMax2 - iMin3;
            scrollX = -scrollX;
        }
        int i23 = iMin3;
        if (z10 || (overScroller = this.f38037c) == null) {
            b(i23, getScrollY());
            return;
        }
        this.f38043i = true;
        int scrollX3 = getScrollX();
        int scrollY = getScrollY();
        if (scrollX == 0) {
            scrollX = i23 - getScrollX();
        }
        overScroller.fling(scrollX3, scrollY, scrollX, 0, i23, i23, 0, 0, (i23 == 0 || i23 == iMax2) ? width / 2 : 0, 0);
        postInvalidateOnAnimation();
    }

    private int u(int i10, int i11, int i12, int i13) {
        int i14;
        if (i10 == 1) {
            return i11;
        }
        if (i10 == 2) {
            i14 = (i13 - i12) / 2;
        } else {
            if (i10 != 3) {
                throw new IllegalStateException("Invalid SnapToAlignment value: " + this.f38063z);
            }
            i14 = i13 - i12;
        }
        return i11 - i14;
    }

    private int v(View view) {
        view.getDrawingRect(this.f38039e);
        offsetDescendantRectToMyCoords(view, this.f38039e);
        return computeScrollDeltaToGetChildRectOnScreen(this.f38039e);
    }

    public void x(int i10, int i11) {
        if (f38022o0) {
            AbstractC7283a.u(f38023p0, "handlePostTouchScrolling[%d] velocityX %d velocityY %d", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        if (this.f38050n != null) {
            return;
        }
        if (this.f38054q) {
            n.k(this, i10, i11);
        }
        this.f38043i = false;
        b bVar = new b();
        this.f38050n = bVar;
        postOnAnimationDelayed(bVar, 20L);
    }

    private void y() {
        this.f38041g = new Rect();
        this.f38042h = null;
        this.f38043i = false;
        this.f38044j = null;
        this.f38045k = C4914b.t() ? H7.v.f8136b : H7.v.f8138d;
        this.f38046l = false;
        this.f38048m = false;
        this.f38050n = null;
        this.f38052o = false;
        this.f38053p = true;
        this.f38054q = false;
        this.f38055r = null;
        this.f38056s = null;
        this.f38057t = 0;
        this.f38058u = false;
        this.f38059v = 0;
        this.f38060w = null;
        this.f38061x = true;
        this.f38062y = true;
        this.f38063z = 0;
        this.f38026A = false;
        this.f38027B = -1;
        this.f38028C = -1;
        this.f38029D = null;
        this.f38030E = new n.h();
        this.f38031F = C.f37391e;
        this.f38032G = 0L;
        this.f38033H = 0;
        this.f38034I = null;
        this.f38047l0 = null;
        this.f38049m0 = 0;
        this.f38051n0 = 0;
    }

    private boolean z() {
        View contentView = getContentView();
        return (contentView == null || contentView.getWidth() == 0 || contentView.getHeight() == 0) ? false : true;
    }

    void F() {
        y();
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        O();
    }

    protected void G(View view, View view2) {
        super.requestChildFocus(view, view2);
    }

    protected void H(int i10, int i11) {
        scrollTo(i10, i11);
    }

    public void J(float f10, int i10) {
        C3281a.s(this, H7.i.values()[i10], Float.isNaN(f10) ? null : new C3303t(B.g(f10), EnumC3304u.f37832a));
    }

    public void N() {
        updateClippingRect(null);
    }

    @Override // com.facebook.react.views.scroll.n.d
    public void a(int i10, int i11) {
        scrollTo(i10, i11);
        E(i10, Integer.MAX_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        if (!this.f38048m || this.f38026A) {
            super.addFocusables(arrayList, i10, i11);
            return;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        super.addFocusables(arrayList2, i10, i11);
        for (View view : arrayList2) {
            if (C(view) || c(view) || view.isFocused()) {
                arrayList.add(view);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView
    public boolean arrowScroll(int i10) {
        if (!this.f38048m) {
            return super.arrowScroll(i10);
        }
        boolean z10 = true;
        this.f38026A = true;
        if (getChildCount() > 0) {
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus(), i10);
            View contentView = getContentView();
            if (contentView == null || viewFindNextFocus == null || viewFindNextFocus.getParent() != contentView) {
                M(i10);
            } else {
                if (!C(viewFindNextFocus) && !A(viewFindNextFocus)) {
                    M(i10);
                }
                viewFindNextFocus.requestFocus();
            }
        } else {
            z10 = false;
        }
        this.f38026A = false;
        return z10;
    }

    @Override // com.facebook.react.views.scroll.n.d
    public void b(int i10, int i11) {
        n.y(this, i10, i11);
        K(i10, i11);
    }

    @Override // com.facebook.react.views.scroll.h
    public boolean c(View view) {
        int iV = v(view);
        view.getDrawingRect(this.f38039e);
        return iV != 0 && Math.abs(iV) < this.f38039e.width();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.f38053p && super.canScrollHorizontally(i10);
    }

    @Override // com.facebook.react.views.scroll.n.a
    public void d(int i10, int i11) {
        this.f38040f.cancel();
        int iO = n.o(getContext());
        this.f38040f.setDuration(iO).setIntValues(i10, i11);
        this.f38040f.start();
        if (this.f38054q) {
            n.k(this, iO > 0 ? (i11 - i10) / iO : 0, 0);
            n.c(this);
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (!C.c(this.f38031F)) {
            return false;
        }
        if (motionEvent.getActionMasked() != 8 || motionEvent.getAxisValue(10) == 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        boolean zDispatchGenericMotionEvent = super.dispatchGenericMotionEvent(motionEvent);
        if (zDispatchGenericMotionEvent && (this.f38048m || this.f38059v != 0 || this.f38060w != null || this.f38063z != 0)) {
            Runnable runnable = this.f38050n;
            if (runnable != null) {
                removeCallbacks(runnable);
            }
            a aVar = new a();
            this.f38050n = aVar;
            postOnAnimationDelayed(aVar, 20L);
        }
        return zDispatchGenericMotionEvent;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void draw(Canvas canvas) {
        if (this.f38057t != 0) {
            View contentView = getContentView();
            if (this.f38056s != null && contentView != null && contentView.getRight() < getWidth()) {
                this.f38056s.setBounds(contentView.getRight(), 0, getWidth(), getHeight());
                this.f38056s.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.HorizontalScrollView
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.f38053p || !(keyCode == 21 || keyCode == 22)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i10) {
        if (f38022o0) {
            AbstractC7283a.t(f38023p0, "fling[%d] velocityX %d", Integer.valueOf(getId()), Integer.valueOf(i10));
        }
        if (Build.VERSION.SDK_INT == 28) {
            i10 = (int) (Math.abs(i10) * Math.signum(this.f38036b.a()));
        }
        int i11 = i10;
        if (this.f38048m) {
            s(i11);
        } else if (this.f38037c != null) {
            this.f38037c.fling(getScrollX(), getScrollY(), i11, 0, 0, Integer.MAX_VALUE, 0, 0, ((getWidth() - AbstractC2747a0.D(this)) - AbstractC2747a0.C(this)) / 2, 0);
            AbstractC2747a0.b0(this);
        } else {
            super.fling(i11);
        }
        x(i11, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View viewM;
        View viewFocusSearch = super.focusSearch(view, i10);
        return (!C4914b.j() || !(viewFocusSearch == null || findViewById(viewFocusSearch.getId()) == null) || (viewM = n.m(this, view, i10)) == null) ? viewFocusSearch : viewM;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // com.facebook.react.uimanager.F
    public void getClippingRect(Rect rect) {
        rect.set((Rect) Q6.a.c(this.f38044j));
    }

    public int getFadingEdgeLengthEnd() {
        return this.f38051n0;
    }

    public int getFadingEdgeLengthStart() {
        return this.f38049m0;
    }

    @Override // com.facebook.react.views.scroll.n.a
    public ValueAnimator getFlingAnimator() {
        return this.f38040f;
    }

    @Override // com.facebook.react.views.scroll.n.b
    public long getLastScrollDispatchTime() {
        return this.f38032G;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected float getLeftFadingEdgeStrength() {
        return (getLayoutDirection() == 1 ? this.f38051n0 : this.f38049m0) / Math.max(this.f38049m0, this.f38051n0);
    }

    @Override // com.facebook.react.uimanager.J
    public String getOverflow() {
        int i10 = c.f38068a[this.f38045k.ordinal()];
        if (i10 == 1) {
            return "hidden";
        }
        if (i10 == 2) {
            return "scroll";
        }
        if (i10 != 3) {
            return null;
        }
        return "visible";
    }

    @Override // com.facebook.react.uimanager.K
    public Rect getOverflowInset() {
        return this.f38041g;
    }

    public C getPointerEvents() {
        return this.f38031F;
    }

    @Override // com.facebook.react.views.scroll.n.c
    public n.h getReactScrollViewScrollState() {
        return this.f38030E;
    }

    @Override // com.facebook.react.uimanager.F
    public boolean getRemoveClippedSubviews() {
        return this.f38052o;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected float getRightFadingEdgeStrength() {
        return (getLayoutDirection() == 1 ? this.f38049m0 : this.f38051n0) / Math.max(this.f38049m0, this.f38051n0);
    }

    @Override // com.facebook.react.views.scroll.h
    public boolean getScrollEnabled() {
        return this.f38053p;
    }

    @Override // com.facebook.react.views.scroll.n.b
    public int getScrollEventThrottle() {
        return this.f38033H;
    }

    @Override // com.facebook.react.views.scroll.n.e
    public InterfaceC3282a0 getStateWrapper() {
        return this.f38029D;
    }

    @Override // com.facebook.react.views.scroll.s
    public v getVirtualViewContainerState() {
        if (this.f38042h == null) {
            this.f38042h = v.c(this);
        }
        return this.f38042h;
    }

    public void l() {
        OverScroller overScroller = this.f38037c;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        this.f38037c.abortAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f38052o) {
            N();
        }
        f fVar = this.f38047l0;
        if (fVar != null) {
            fVar.f();
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        this.f38034I = view2;
        view2.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        View view3 = this.f38034I;
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(this);
        }
        this.f38034I = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.f38047l0;
        if (fVar != null) {
            fVar.g();
        }
        v vVar = this.f38042h;
        if (vVar != null) {
            vVar.b();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f38045k != H7.v.f8136b) {
            C3281a.a(this, canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str = (String) getTag(AbstractC3247l.f36928v);
        if (str != null) {
            accessibilityNodeInfo.setViewIdResourceName(str);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f38053p) {
            return false;
        }
        if (motionEvent.getAction() == 0 && p(this, motionEvent) != null) {
            return false;
        }
        if (!C.c(this.f38031F)) {
            return true;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                w(motionEvent);
                return true;
            }
        } catch (IllegalArgumentException e10) {
            AbstractC7283a.J("ReactNative", "Error intercepting touch event.", e10);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        OverScroller overScroller;
        boolean z11 = f38022o0;
        if (z11) {
            AbstractC7283a.v(f38023p0, "onLayout[%d] l %d t %d r %d b %d", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
        int i14 = this.f38035a;
        if (i14 != Integer.MIN_VALUE && (overScroller = this.f38037c) != null && i14 != overScroller.getFinalX() && !this.f38037c.isFinished()) {
            if (z11) {
                AbstractC7283a.t(f38023p0, "onLayout[%d] scroll hack enabled: reset to previous scrollX position of %d", Integer.valueOf(getId()), Integer.valueOf(this.f38035a));
            }
            OverScroller overScroller2 = this.f38037c;
            overScroller2.startScroll(this.f38035a, overScroller2.getFinalY(), 0, 0);
            this.f38037c.forceFinished(true);
            this.f38035a = Integer.MIN_VALUE;
        }
        if (z()) {
            int scrollX = this.f38027B;
            if (scrollX == -1) {
                scrollX = getScrollX();
            }
            int scrollY = this.f38028C;
            if (scrollY == -1) {
                scrollY = getScrollY();
            }
            scrollTo(scrollX, scrollY);
        }
        n.e(this);
        v vVar = this.f38042h;
        if (vVar != null) {
            vVar.s();
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (this.f38034I == null) {
            return;
        }
        if (view.getLayoutDirection() == 1) {
            m(i10, i12, i14, i16);
        } else {
            f fVar = this.f38047l0;
            if (fVar != null) {
                fVar.h();
            }
        }
        n.d(this);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        OverScroller overScroller;
        C3306w.a(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (f38022o0) {
            AbstractC7283a.u(f38023p0, "onMeasure[%d] measured width: %d measured height: %d", Integer.valueOf(getId()), Integer.valueOf(size), Integer.valueOf(size2));
        }
        boolean z10 = getMeasuredHeight() != size2;
        setMeasuredDimension(size, size2);
        if (!z10 || (overScroller = this.f38037c) == null) {
            return;
        }
        this.f38035a = overScroller.getCurrX();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        int iMax;
        if (f38022o0) {
            AbstractC7283a.v(f38023p0, "onOverScrolled[%d] scrollX %d scrollY %d clampedX %b clampedY %b", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10), Boolean.valueOf(z11));
        }
        OverScroller overScroller = this.f38037c;
        if (overScroller != null && !overScroller.isFinished() && this.f38037c.getCurrX() != this.f38037c.getFinalX() && i10 >= (iMax = Math.max(computeHorizontalScrollRange() - getWidth(), 0))) {
            this.f38037c.abortAnimation();
            i10 = iMax;
        }
        super.onOverScrolled(i10, i11, z10, z11);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        if (f38022o0) {
            AbstractC7283a.v(f38023p0, "onScrollChanged[%d] x %d y %d oldx %d oldy %d", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
        U7.a.c(0L, "ReactHorizontalScrollView.onScrollChanged");
        try {
            super.onScrollChanged(i10, i11, i12, i13);
            this.f38043i = true;
            if (this.f38036b.c(i10, i11)) {
                if (this.f38052o) {
                    N();
                }
                n.B(this, this.f38036b.a(), this.f38036b.b());
                v vVar = this.f38042h;
                if (vVar != null) {
                    vVar.s();
                }
            }
            U7.a.i(0L);
        } catch (Throwable th2) {
            U7.a.i(0L);
            throw th2;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f38052o) {
            N();
        }
        v vVar = this.f38042h;
        if (vVar != null) {
            vVar.s();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f38053p || !C.b(this.f38031F)) {
            return false;
        }
        this.f38038d.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 && this.f38046l) {
            n.z(this);
            float fB = this.f38038d.b();
            float fC = this.f38038d.c();
            n.g(this, fB, fC);
            if (!C4914b.H()) {
                com.facebook.react.uimanager.events.p.a(this, motionEvent);
            }
            this.f38046l = false;
            x(Math.round(fB), Math.round(fC));
        }
        if (actionMasked == 0) {
            n();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView
    public boolean pageScroll(int i10) {
        boolean zPageScroll = super.pageScroll(i10);
        if (this.f38048m && zPageScroll) {
            x(0, 0);
        }
        return zPageScroll;
    }

    public void r() {
        awakenScrollBars();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (view2 != null && !this.f38048m) {
            I(view2);
        }
        G(view, view2);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void scrollTo(int i10, int i11) {
        if (f38022o0) {
            AbstractC7283a.u(f38023p0, "scrollTo[%d] x %d y %d", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        super.scrollTo(i10, i11);
        n.z(this);
        K(i10, i11);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        C3281a.m(this, Integer.valueOf(i10));
    }

    public void setBorderRadius(float f10) {
        J(f10, H7.i.f8043a.ordinal());
    }

    public void setBorderStyle(String str) {
        C3281a.t(this, str == null ? null : H7.k.b(str));
    }

    public void setDecelerationRate(float f10) {
        getReactScrollViewScrollState().k(f10);
        OverScroller overScroller = this.f38037c;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f10);
        }
    }

    public void setDisableIntervalMomentum(boolean z10) {
        this.f38058u = z10;
    }

    public void setEndFillColor(int i10) {
        if (i10 != this.f38057t) {
            this.f38057t = i10;
            this.f38056s = new ColorDrawable(this.f38057t);
        }
    }

    public void setFadingEdgeLengthEnd(int i10) {
        this.f38051n0 = i10;
        invalidate();
    }

    public void setFadingEdgeLengthStart(int i10) {
        this.f38049m0 = i10;
        invalidate();
    }

    @Override // com.facebook.react.views.scroll.n.b
    public void setLastScrollDispatchTime(long j10) {
        this.f38032G = j10;
    }

    public void setMaintainVisibleContentPosition(f.a aVar) {
        f fVar;
        if (aVar != null && this.f38047l0 == null) {
            f fVar2 = new f(this, true);
            this.f38047l0 = fVar2;
            fVar2.f();
        } else if (aVar == null && (fVar = this.f38047l0) != null) {
            fVar.g();
            this.f38047l0 = null;
        }
        f fVar3 = this.f38047l0;
        if (fVar3 != null) {
            fVar3.e(aVar);
        }
    }

    public void setOverflow(String str) {
        if (str == null) {
            this.f38045k = H7.v.f8138d;
        } else {
            H7.v vVarB = H7.v.b(str);
            if (vVarB == null) {
                vVarB = C4914b.t() ? H7.v.f8136b : H7.v.f8138d;
            }
            this.f38045k = vVarB;
        }
        invalidate();
    }

    @Override // com.facebook.react.uimanager.K
    public void setOverflowInset(int i10, int i11, int i12, int i13) {
        this.f38041g.set(i10, i11, i12, i13);
    }

    public void setPagingEnabled(boolean z10) {
        this.f38048m = z10;
    }

    public void setPointerEvents(C c10) {
        this.f38031F = c10;
    }

    @Override // com.facebook.react.views.scroll.n.c
    public void setReactScrollViewScrollState(n.h hVar) {
        this.f38030E = hVar;
        if (C4914b.u() || C4914b.P()) {
            Point pointE = hVar.e();
            H(pointE.x, pointE.y);
        }
    }

    public void setRemoveClippedSubviews(boolean z10) {
        if (z10 && this.f38044j == null) {
            this.f38044j = new Rect();
        }
        this.f38052o = z10;
        N();
    }

    public void setScrollEnabled(boolean z10) {
        this.f38053p = z10;
    }

    public void setScrollEventThrottle(int i10) {
        this.f38033H = i10;
    }

    public void setScrollPerfTag(String str) {
        this.f38055r = str;
    }

    public void setSendMomentumEvents(boolean z10) {
        this.f38054q = z10;
    }

    public void setSnapInterval(int i10) {
        this.f38059v = i10;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.f38060w = list;
    }

    public void setSnapToAlignment(int i10) {
        this.f38063z = i10;
    }

    public void setSnapToEnd(boolean z10) {
        this.f38062y = z10;
    }

    public void setSnapToStart(boolean z10) {
        this.f38061x = z10;
    }

    public void setStateWrapper(InterfaceC3282a0 interfaceC3282a0) {
        this.f38029D = interfaceC3282a0;
    }

    public int t(int i10) {
        return n.u(this, i10, 0, Math.max(0, computeHorizontalScrollRange() - getWidth()), 0).x;
    }

    @Override // com.facebook.react.uimanager.F
    public void updateClippingRect(Set set) {
        if (this.f38052o) {
            U7.a.c(0L, "ReactHorizontalScrollView.updateClippingRect");
            try {
                Q6.a.c(this.f38044j);
                G.a(this, this.f38044j);
                KeyEvent.Callback contentView = getContentView();
                if (contentView instanceof F) {
                    ((F) contentView).updateClippingRect(set);
                }
            } finally {
                U7.a.i(0L);
            }
        }
    }

    protected void w(MotionEvent motionEvent) {
        if (!C4914b.H()) {
            com.facebook.react.uimanager.events.p.b(this, motionEvent);
        }
        n.f(this);
        this.f38046l = true;
        o();
        getFlingAnimator().cancel();
    }

    private void O() {
    }
}
