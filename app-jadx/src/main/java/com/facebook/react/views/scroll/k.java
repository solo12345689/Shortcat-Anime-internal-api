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
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.AbstractC2747a0;
import com.facebook.react.AbstractC3247l;
import com.facebook.react.bridge.ReadableMap;
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
import java.util.List;
import java.util.Set;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class k extends ScrollView implements F, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener, h, K, n.c, n.e, n.a, n.b, n.d, s {

    /* JADX INFO: renamed from: n0 */
    private static Field f38069n0 = null;

    /* JADX INFO: renamed from: o0 */
    private static boolean f38070o0 = false;

    /* JADX INFO: renamed from: A */
    private ReadableMap f38071A;

    /* JADX INFO: renamed from: B */
    private int f38072B;

    /* JADX INFO: renamed from: C */
    private int f38073C;

    /* JADX INFO: renamed from: D */
    private InterfaceC3282a0 f38074D;

    /* JADX INFO: renamed from: E */
    private n.h f38075E;

    /* JADX INFO: renamed from: F */
    private C f38076F;

    /* JADX INFO: renamed from: G */
    private long f38077G;

    /* JADX INFO: renamed from: H */
    private int f38078H;

    /* JADX INFO: renamed from: I */
    private f f38079I;

    /* JADX INFO: renamed from: a */
    private final g f38080a;

    /* JADX INFO: renamed from: b */
    private final OverScroller f38081b;

    /* JADX INFO: renamed from: c */
    private final q f38082c;

    /* JADX INFO: renamed from: d */
    private final Rect f38083d;

    /* JADX INFO: renamed from: e */
    private final ValueAnimator f38084e;

    /* JADX INFO: renamed from: f */
    private Rect f38085f;

    /* JADX INFO: renamed from: g */
    private v f38086g;

    /* JADX INFO: renamed from: h */
    private boolean f38087h;

    /* JADX INFO: renamed from: i */
    private Rect f38088i;

    /* JADX INFO: renamed from: j */
    private H7.v f38089j;

    /* JADX INFO: renamed from: k */
    private boolean f38090k;

    /* JADX INFO: renamed from: l */
    private boolean f38091l;

    /* JADX INFO: renamed from: l0 */
    private int f38092l0;

    /* JADX INFO: renamed from: m */
    private Runnable f38093m;

    /* JADX INFO: renamed from: m0 */
    private int f38094m0;

    /* JADX INFO: renamed from: n */
    private boolean f38095n;

    /* JADX INFO: renamed from: o */
    private boolean f38096o;

    /* JADX INFO: renamed from: p */
    private boolean f38097p;

    /* JADX INFO: renamed from: q */
    private String f38098q;

    /* JADX INFO: renamed from: r */
    private Drawable f38099r;

    /* JADX INFO: renamed from: s */
    private int f38100s;

    /* JADX INFO: renamed from: t */
    private boolean f38101t;

    /* JADX INFO: renamed from: u */
    private int f38102u;

    /* JADX INFO: renamed from: v */
    private List f38103v;

    /* JADX INFO: renamed from: w */
    private boolean f38104w;

    /* JADX INFO: renamed from: x */
    private boolean f38105x;

    /* JADX INFO: renamed from: y */
    private int f38106y;

    /* JADX INFO: renamed from: z */
    private View f38107z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.f38093m = null;
            k.this.x(0, 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        private boolean f38109a = false;

        /* JADX INFO: renamed from: b */
        private int f38110b = 0;

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k.this.f38087h) {
                k.this.f38087h = false;
                this.f38110b = 0;
                k.this.postOnAnimationDelayed(this, 20L);
                return;
            }
            n.z(k.this);
            int i10 = this.f38110b + 1;
            this.f38110b = i10;
            if (i10 >= 3) {
                k.this.f38093m = null;
                if (k.this.f38097p) {
                    n.l(k.this);
                }
                n.r(k.this);
                k.this.p();
                return;
            }
            if (k.this.f38091l && !this.f38109a) {
                this.f38109a = true;
                k.this.s(0);
            }
            k.this.postOnAnimationDelayed(this, 20L);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f38112a;

        static {
            int[] iArr = new int[H7.v.values().length];
            f38112a = iArr;
            try {
                iArr[H7.v.f8137c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38112a[H7.v.f8138d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38112a[H7.v.f8136b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public k(Context context, com.facebook.react.views.scroll.a aVar) {
        super(context);
        this.f38080a = new g();
        this.f38082c = new q();
        this.f38083d = new Rect();
        this.f38084e = ObjectAnimator.ofInt(this, "scrollY", 0, 0);
        this.f38081b = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
        setClipChildren(false);
        AbstractC2747a0.k0(this, new l());
        y();
    }

    private boolean A() {
        return false;
    }

    private int B(int i10) {
        return getFlingAnimator() == this.f38084e ? n.u(this, 0, i10, 0, getMaxScrollY()).y : n.p(this, getScrollY(), getReactScrollViewScrollState().d().y, i10) + t(i10);
    }

    private void C(int i10) {
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().cancel();
        }
        OverScroller overScroller = this.f38081b;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        int currY = this.f38081b.getCurrY();
        boolean zComputeScrollOffset = this.f38081b.computeScrollOffset();
        this.f38081b.forceFinished(true);
        if (!zComputeScrollOffset) {
            scrollTo(getScrollX(), i10 + (this.f38081b.getCurrY() - currY));
            return;
        }
        this.f38081b.fling(getScrollX(), i10, 0, (int) (this.f38081b.getCurrVelocity() * Math.signum(this.f38081b.getFinalY() - this.f38081b.getStartY())), 0, 0, 0, Integer.MAX_VALUE);
    }

    private void F(View view) {
        View view2 = null;
        for (View view3 = view; view3 != null && view3 != this; view3 = (View) view3.getParent()) {
            if (view3 instanceof k) {
                view2 = view3;
            }
        }
        if (view2 != null) {
            view = view2;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (iComputeScrollDeltaToGetChildRectOnScreen != 0) {
            scrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
        }
    }

    private void H(int i10, int i11) {
        if (z()) {
            this.f38072B = -1;
            this.f38073C = -1;
        } else {
            this.f38072B = i10;
            this.f38073C = i11;
        }
    }

    private void J(int i10) {
        double snapInterval = getSnapInterval();
        double dP = n.p(this, getScrollY(), getReactScrollViewScrollState().d().y, i10);
        double dB = B(i10);
        double d10 = dP / snapInterval;
        int iFloor = (int) Math.floor(d10);
        int iCeil = (int) Math.ceil(d10);
        int iRound = (int) Math.round(d10);
        int iRound2 = (int) Math.round(dB / snapInterval);
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
            this.f38087h = true;
            b(getScrollX(), (int) d11);
        }
    }

    private void L(int i10) {
        getReactScrollViewScrollState().o(i10);
        n.n(this);
    }

    private View getContentView() {
        return getChildAt(0);
    }

    private int getMaxScrollY() {
        View view = this.f38107z;
        return Math.max(0, (view == null ? 0 : view.getHeight()) - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    private int getSnapInterval() {
        int i10 = this.f38102u;
        return i10 != 0 ? i10 : getHeight();
    }

    private void n() {
        Runnable runnable = this.f38093m;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f38093m = null;
            getFlingAnimator().cancel();
        }
    }

    private int o(int i10) {
        if (Build.VERSION.SDK_INT != 28) {
            return i10;
        }
        float fSignum = Math.signum(this.f38080a.b());
        if (fSignum == 0.0f) {
            fSignum = Math.signum(i10);
        }
        return (int) (Math.abs(i10) * fSignum);
    }

    public void p() {
        if (A()) {
            Q6.a.c(null);
            Q6.a.c(this.f38098q);
            throw null;
        }
    }

    private void q() {
        if (A()) {
            Q6.a.c(null);
            Q6.a.c(this.f38098q);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:225:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(int r29) {
        /*
            Method dump skipped, instruction units count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.scroll.k.s(int):void");
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
                throw new IllegalStateException("Invalid SnapToAlignment value: " + this.f38106y);
            }
            i14 = i13 - i12;
        }
        return i11 - i14;
    }

    private int v(View view) {
        view.getDrawingRect(this.f38083d);
        offsetDescendantRectToMyCoords(view, this.f38083d);
        return computeScrollDeltaToGetChildRectOnScreen(this.f38083d);
    }

    public void x(int i10, int i11) {
        if (this.f38093m != null) {
            return;
        }
        if (this.f38097p) {
            q();
            n.k(this, i10, i11);
        }
        this.f38087h = false;
        b bVar = new b();
        this.f38093m = bVar;
        postOnAnimationDelayed(bVar, 20L);
    }

    private void y() {
        this.f38085f = new Rect();
        this.f38086g = null;
        this.f38087h = false;
        this.f38088i = null;
        this.f38089j = C4914b.t() ? H7.v.f8136b : H7.v.f8138d;
        this.f38090k = false;
        this.f38091l = false;
        this.f38093m = null;
        this.f38095n = false;
        this.f38096o = true;
        this.f38097p = false;
        this.f38098q = null;
        this.f38099r = null;
        this.f38100s = 0;
        this.f38101t = false;
        this.f38102u = 0;
        this.f38103v = null;
        this.f38104w = true;
        this.f38105x = true;
        this.f38106y = 0;
        this.f38107z = null;
        this.f38071A = null;
        this.f38072B = -1;
        this.f38073C = -1;
        this.f38074D = null;
        this.f38075E = new n.h();
        this.f38076F = C.f37391e;
        this.f38077G = 0L;
        this.f38078H = 0;
        this.f38079I = null;
        this.f38092l0 = 0;
        this.f38094m0 = 0;
    }

    private boolean z() {
        View contentView = getContentView();
        return (contentView == null || contentView.getWidth() == 0 || contentView.getHeight() == 0) ? false : true;
    }

    void D() {
        y();
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        M();
    }

    protected void E(View view, View view2) {
        super.requestChildFocus(view, view2);
    }

    public void G(float f10, int i10) {
        C3281a.s(this, H7.i.values()[i10], Float.isNaN(f10) ? null : new C3303t(B.g(f10), EnumC3304u.f37832a));
    }

    public void I(int i10, boolean z10) {
        int childCount = getChildCount();
        Q6.a.b(childCount <= 1, "React Native ScrollView should not have more than one child, it should have exactly 1 child; a content View");
        if (childCount > 0) {
            for (int i11 = 0; i11 < childCount; i11++) {
                getChildAt(i11).setTranslationY(i10);
            }
            setPadding(0, 0, 0, i10);
        }
        if (z10) {
            L(i10);
        }
        setRemoveClippedSubviews(this.f38095n);
    }

    public void K() {
        updateClippingRect(null);
    }

    @Override // com.facebook.react.views.scroll.n.d
    public void a(int i10, int i11) {
        scrollTo(i10, i11);
        C(i11);
    }

    @Override // com.facebook.react.views.scroll.n.d
    public void b(int i10, int i11) {
        n.y(this, i10, i11);
        H(i10, i11);
    }

    @Override // com.facebook.react.views.scroll.h
    public boolean c(View view) {
        int iV = v(view);
        view.getDrawingRect(this.f38083d);
        return iV != 0 && Math.abs(iV) < this.f38083d.width();
    }

    @Override // com.facebook.react.views.scroll.n.a
    public void d(int i10, int i11) {
        this.f38084e.cancel();
        int iO = n.o(getContext());
        this.f38084e.setDuration(iO).setIntValues(i10, i11);
        this.f38084e.start();
        if (this.f38097p) {
            n.k(this, 0, iO > 0 ? (i11 - i10) / iO : 0);
            n.c(this);
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (!C.c(this.f38076F)) {
            return false;
        }
        if (motionEvent.getActionMasked() != 8 || motionEvent.getAxisValue(9) == 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        boolean zDispatchGenericMotionEvent = super.dispatchGenericMotionEvent(motionEvent);
        if (zDispatchGenericMotionEvent && (this.f38091l || this.f38102u != 0 || this.f38103v != null || this.f38106y != 0)) {
            Runnable runnable = this.f38093m;
            if (runnable != null) {
                removeCallbacks(runnable);
            }
            a aVar = new a();
            this.f38093m = aVar;
            postOnAnimationDelayed(aVar, 20L);
        }
        return zDispatchGenericMotionEvent;
    }

    @Override // android.widget.ScrollView, android.view.View
    public void draw(Canvas canvas) {
        if (this.f38100s != 0) {
            View contentView = getContentView();
            if (this.f38099r != null && contentView != null && contentView.getBottom() < getHeight()) {
                this.f38099r.setBounds(0, contentView.getBottom(), getWidth(), getHeight());
                this.f38099r.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.ScrollView
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.f38096o || !(keyCode == 19 || keyCode == 20)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.widget.ScrollView
    public void fling(int i10) {
        int iO = o(i10);
        if (this.f38091l) {
            s(iO);
        } else if (this.f38081b != null) {
            this.f38081b.fling(getScrollX(), getScrollY(), 0, iO, 0, 0, 0, Integer.MAX_VALUE, 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
            AbstractC2747a0.b0(this);
        } else {
            super.fling(iO);
        }
        x(0, iO);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View viewM;
        View viewFocusSearch = super.focusSearch(view, i10);
        return (!C4914b.j() || !(viewFocusSearch == null || findViewById(viewFocusSearch.getId()) == null) || (viewM = n.m(this, view, i10)) == null) ? viewFocusSearch : viewM;
    }

    @Override // android.widget.ScrollView, android.view.View
    protected float getBottomFadingEdgeStrength() {
        return this.f38094m0 / Math.max(this.f38092l0, this.f38094m0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // com.facebook.react.uimanager.F
    public void getClippingRect(Rect rect) {
        rect.set((Rect) Q6.a.c(this.f38088i));
    }

    public int getFadingEdgeLengthEnd() {
        return this.f38094m0;
    }

    public int getFadingEdgeLengthStart() {
        return this.f38092l0;
    }

    @Override // com.facebook.react.views.scroll.n.a
    public ValueAnimator getFlingAnimator() {
        return this.f38084e;
    }

    @Override // com.facebook.react.views.scroll.n.b
    public long getLastScrollDispatchTime() {
        return this.f38077G;
    }

    protected OverScroller getOverScrollerFromParent() {
        if (!f38070o0) {
            f38070o0 = true;
            try {
                Field declaredField = ScrollView.class.getDeclaredField("mScroller");
                f38069n0 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                AbstractC7283a.I("ReactNative", "Failed to get mScroller field for ScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = f38069n0;
        OverScroller overScroller = null;
        if (field != null) {
            try {
                Object obj = field.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    AbstractC7283a.I("ReactNative", "Failed to cast mScroller field in ScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Failed to get mScroller from ScrollView!", e10);
            }
        }
        return overScroller;
    }

    @Override // com.facebook.react.uimanager.J
    public String getOverflow() {
        int i10 = c.f38112a[this.f38089j.ordinal()];
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
        return this.f38085f;
    }

    public C getPointerEvents() {
        return this.f38076F;
    }

    @Override // com.facebook.react.views.scroll.n.c
    public n.h getReactScrollViewScrollState() {
        return this.f38075E;
    }

    @Override // com.facebook.react.uimanager.F
    public boolean getRemoveClippedSubviews() {
        return this.f38095n;
    }

    @Override // com.facebook.react.views.scroll.h
    public boolean getScrollEnabled() {
        return this.f38096o;
    }

    @Override // com.facebook.react.views.scroll.n.b
    public int getScrollEventThrottle() {
        return this.f38078H;
    }

    @Override // com.facebook.react.views.scroll.n.e
    public InterfaceC3282a0 getStateWrapper() {
        return this.f38074D;
    }

    @Override // android.widget.ScrollView, android.view.View
    protected float getTopFadingEdgeStrength() {
        return this.f38092l0 / Math.max(this.f38092l0, this.f38094m0);
    }

    @Override // com.facebook.react.views.scroll.s
    public v getVirtualViewContainerState() {
        if (this.f38086g == null) {
            this.f38086g = v.c(this);
        }
        return this.f38086g;
    }

    public void m() {
        OverScroller overScroller = this.f38081b;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        this.f38081b.abortAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f38095n) {
            K();
        }
        f fVar = this.f38079I;
        if (fVar != null) {
            fVar.f();
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        this.f38107z = view2;
        view2.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        View view3 = this.f38107z;
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(this);
            this.f38107z = null;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.f38079I;
        if (fVar != null) {
            fVar.g();
        }
        v vVar = this.f38086g;
        if (vVar != null) {
            vVar.b();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f38089j != H7.v.f8136b) {
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

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f38096o) {
            return false;
        }
        if (!C.c(this.f38076F)) {
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

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (z()) {
            int scrollX = this.f38072B;
            if (scrollX == -1) {
                scrollX = getScrollX();
            }
            int scrollY = this.f38073C;
            if (scrollY == -1) {
                scrollY = getScrollY();
            }
            scrollTo(scrollX, scrollY);
        }
        n.e(this);
        v vVar = this.f38086g;
        if (vVar != null) {
            vVar.s();
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (this.f38107z == null) {
            return;
        }
        f fVar = this.f38079I;
        if (fVar != null) {
            fVar.h();
        }
        if (isShown() && z()) {
            int scrollY = getScrollY();
            int maxScrollY = getMaxScrollY();
            if (scrollY > maxScrollY) {
                scrollTo(getScrollX(), maxScrollY);
            }
        }
        n.d(this);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        C3306w.a(i10, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
    }

    @Override // android.widget.ScrollView, android.view.View
    protected void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        int maxScrollY;
        OverScroller overScroller = this.f38081b;
        if (overScroller != null && this.f38107z != null && !overScroller.isFinished() && this.f38081b.getCurrY() != this.f38081b.getFinalY() && i11 >= (maxScrollY = getMaxScrollY())) {
            this.f38081b.abortAnimation();
            i11 = maxScrollY;
        }
        super.onOverScrolled(i10, i11, z10, z11);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        U7.a.c(0L, "ReactScrollView.onScrollChanged");
        try {
            super.onScrollChanged(i10, i11, i12, i13);
            this.f38087h = true;
            if (this.f38080a.c(i10, i11)) {
                if (this.f38095n) {
                    K();
                }
                n.B(this, this.f38080a.a(), this.f38080a.b());
                v vVar = this.f38086g;
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

    @Override // android.widget.ScrollView, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f38095n) {
            K();
        }
        v vVar = this.f38086g;
        if (vVar != null) {
            vVar.s();
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f38096o || !C.b(this.f38076F)) {
            return false;
        }
        this.f38082c.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 && this.f38090k) {
            n.z(this);
            float fB = this.f38082c.b();
            float fC = this.f38082c.c();
            n.g(this, fB, fC);
            if (!C4914b.H()) {
                com.facebook.react.uimanager.events.p.a(this, motionEvent);
            }
            this.f38090k = false;
            x(Math.round(fB), Math.round(fC));
        }
        if (actionMasked == 0) {
            n();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void r() {
        awakenScrollBars();
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (view2 != null) {
            F(view2);
        }
        E(view, view2);
    }

    @Override // android.widget.ScrollView, android.view.View
    public void scrollTo(int i10, int i11) {
        super.scrollTo(i10, i11);
        n.z(this);
        H(i10, i11);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        C3281a.m(this, Integer.valueOf(i10));
    }

    public void setBorderRadius(float f10) {
        G(f10, H7.i.f8043a.ordinal());
    }

    public void setBorderStyle(String str) {
        C3281a.t(this, str == null ? null : H7.k.b(str));
    }

    public void setContentOffset(ReadableMap readableMap) {
        ReadableMap readableMap2 = this.f38071A;
        if (readableMap2 == null || !readableMap2.equals(readableMap)) {
            this.f38071A = readableMap;
            if (readableMap != null) {
                scrollTo((int) B.h(readableMap.hasKey("x") ? readableMap.getDouble("x") : 0.0d), (int) B.h(readableMap.hasKey("y") ? readableMap.getDouble("y") : 0.0d));
            } else {
                scrollTo(0, 0);
            }
        }
    }

    public void setDecelerationRate(float f10) {
        getReactScrollViewScrollState().k(f10);
        OverScroller overScroller = this.f38081b;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f10);
        }
    }

    public void setDisableIntervalMomentum(boolean z10) {
        this.f38101t = z10;
    }

    public void setEndFillColor(int i10) {
        if (i10 != this.f38100s) {
            this.f38100s = i10;
            this.f38099r = new ColorDrawable(this.f38100s);
        }
    }

    public void setFadingEdgeLengthEnd(int i10) {
        this.f38094m0 = i10;
        invalidate();
    }

    public void setFadingEdgeLengthStart(int i10) {
        this.f38092l0 = i10;
        invalidate();
    }

    @Override // com.facebook.react.views.scroll.n.b
    public void setLastScrollDispatchTime(long j10) {
        this.f38077G = j10;
    }

    public void setMaintainVisibleContentPosition(f.a aVar) {
        f fVar;
        if (aVar != null && this.f38079I == null) {
            f fVar2 = new f(this, false);
            this.f38079I = fVar2;
            fVar2.f();
        } else if (aVar == null && (fVar = this.f38079I) != null) {
            fVar.g();
            this.f38079I = null;
        }
        f fVar3 = this.f38079I;
        if (fVar3 != null) {
            fVar3.e(aVar);
        }
    }

    public void setOverflow(String str) {
        if (str == null) {
            this.f38089j = H7.v.f8138d;
        } else {
            H7.v vVarB = H7.v.b(str);
            if (vVarB == null) {
                vVarB = C4914b.t() ? H7.v.f8136b : H7.v.f8138d;
            }
            this.f38089j = vVarB;
        }
        invalidate();
    }

    @Override // com.facebook.react.uimanager.K
    public void setOverflowInset(int i10, int i11, int i12, int i13) {
        this.f38085f.set(i10, i11, i12, i13);
    }

    public void setPagingEnabled(boolean z10) {
        this.f38091l = z10;
    }

    public void setPointerEvents(C c10) {
        this.f38076F = c10;
    }

    @Override // com.facebook.react.views.scroll.n.c
    public void setReactScrollViewScrollState(n.h hVar) {
        this.f38075E = hVar;
        if (C4914b.u() || C4914b.P()) {
            I(hVar.f(), false);
            Point pointE = hVar.e();
            scrollTo(pointE.x, pointE.y);
        }
    }

    public void setRemoveClippedSubviews(boolean z10) {
        if (z10 && this.f38088i == null) {
            this.f38088i = new Rect();
        }
        this.f38095n = z10;
        K();
    }

    public void setScrollAwayTopPaddingEnabledUnstable(int i10) {
        I(i10, true);
    }

    public void setScrollEnabled(boolean z10) {
        this.f38096o = z10;
    }

    public void setScrollEventThrottle(int i10) {
        this.f38078H = i10;
    }

    public void setScrollPerfTag(String str) {
        this.f38098q = str;
    }

    public void setSendMomentumEvents(boolean z10) {
        this.f38097p = z10;
    }

    public void setSnapInterval(int i10) {
        this.f38102u = i10;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.f38103v = list;
    }

    public void setSnapToAlignment(int i10) {
        this.f38106y = i10;
    }

    public void setSnapToEnd(boolean z10) {
        this.f38105x = z10;
    }

    public void setSnapToStart(boolean z10) {
        this.f38104w = z10;
    }

    public void setStateWrapper(InterfaceC3282a0 interfaceC3282a0) {
        this.f38074D = interfaceC3282a0;
    }

    public int t(int i10) {
        return n.u(this, 0, i10, 0, getMaxScrollY()).y;
    }

    @Override // com.facebook.react.uimanager.F
    public void updateClippingRect(Set set) {
        if (this.f38095n) {
            U7.a.c(0L, "ReactScrollView.updateClippingRect");
            try {
                Q6.a.c(this.f38088i);
                G.a(this, this.f38088i);
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
        this.f38090k = true;
        q();
        getFlingAnimator().cancel();
    }

    private void M() {
    }
}
