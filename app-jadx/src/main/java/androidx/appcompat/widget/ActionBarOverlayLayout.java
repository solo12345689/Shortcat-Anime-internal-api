package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.j;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.L0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i.AbstractC4956a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements I, androidx.core.view.F, androidx.core.view.G {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    static final int[] f24885G = {AbstractC4956a.f47955b, R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final L0 f24886H = new L0.a().d(A1.b.c(0, 1, 0, 1)).a();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final Rect f24887I = new Rect();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    ViewPropertyAnimator f24888A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    final AnimatorListenerAdapter f24889B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final Runnable f24890C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final Runnable f24891D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final androidx.core.view.H f24892E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final f f24893F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ContentFrameLayout f24896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ActionBarContainer f24897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private J f24898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f24899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f24900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f24901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f24902i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f24903j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f24904k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f24905l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Rect f24906m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Rect f24907n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Rect f24908o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Rect f24909p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Rect f24910q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Rect f24911r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Rect f24912s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Rect f24913t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private L0 f24914u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private L0 f24915v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private L0 f24916w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private L0 f24917x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private d f24918y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private OverScroller f24919z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f24888A = null;
            actionBarOverlayLayout.f24903j = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f24888A = null;
            actionBarOverlayLayout.f24903j = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f24888A = actionBarOverlayLayout.f24897d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f24889B);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f24888A = actionBarOverlayLayout.f24897d.animate().translationY(-ActionBarOverlayLayout.this.f24897d.getHeight()).setListener(ActionBarOverlayLayout.this.f24889B);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface d {
        void a();

        void b();

        void c(boolean z10);

        void d();

        void e();

        void onWindowVisibilityChanged(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class f extends View {
        f(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24895b = 0;
        this.f24906m = new Rect();
        this.f24907n = new Rect();
        this.f24908o = new Rect();
        this.f24909p = new Rect();
        this.f24910q = new Rect();
        this.f24911r = new Rect();
        this.f24912s = new Rect();
        this.f24913t = new Rect();
        L0 l02 = L0.f28953b;
        this.f24914u = l02;
        this.f24915v = l02;
        this.f24916w = l02;
        this.f24917x = l02;
        this.f24889B = new a();
        this.f24890C = new b();
        this.f24891D = new c();
        w(context);
        this.f24892E = new androidx.core.view.H(this);
        f fVar = new f(context);
        this.f24893F = fVar;
        addView(fVar);
    }

    private void B() {
        v();
        this.f24890C.run();
    }

    private boolean C(float f10) {
        this.f24919z.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f24919z.getFinalY() > this.f24897d.getHeight();
    }

    private void p() {
        v();
        this.f24891D.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            return r0
        L35:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    private boolean r() {
        AbstractC2747a0.f(this.f24893F, f24886H, this.f24909p);
        return !this.f24909p.equals(f24887I);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private J u(View view) {
        if (view instanceof J) {
            return (J) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void w(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f24885G);
        this.f24894a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f24899f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f24919z = new OverScroller(context);
    }

    private void y() {
        v();
        postDelayed(this.f24891D, 600L);
    }

    private void z() {
        v();
        postDelayed(this.f24890C, 600L);
    }

    void A() {
        if (this.f24896c == null) {
            this.f24896c = (ContentFrameLayout) findViewById(i.f.f48065b);
            this.f24897d = (ActionBarContainer) findViewById(i.f.f48066c);
            this.f24898e = u(findViewById(i.f.f48064a));
        }
    }

    @Override // androidx.appcompat.widget.I
    public boolean a() {
        A();
        return this.f24898e.a();
    }

    @Override // androidx.appcompat.widget.I
    public boolean b() {
        A();
        return this.f24898e.b();
    }

    @Override // androidx.appcompat.widget.I
    public boolean c() {
        A();
        return this.f24898e.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.I
    public void d(Menu menu, j.a aVar) {
        A();
        this.f24898e.d(menu, aVar);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f24899f != null) {
            int bottom = this.f24897d.getVisibility() == 0 ? (int) (this.f24897d.getBottom() + this.f24897d.getTranslationY() + 0.5f) : 0;
            this.f24899f.setBounds(0, bottom, getWidth(), this.f24899f.getIntrinsicHeight() + bottom);
            this.f24899f.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.I
    public boolean e() {
        A();
        return this.f24898e.e();
    }

    @Override // androidx.appcompat.widget.I
    public void f() {
        A();
        this.f24898e.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.I
    public boolean g() {
        A();
        return this.f24898e.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f24897d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f24892E.a();
    }

    public CharSequence getTitle() {
        A();
        return this.f24898e.getTitle();
    }

    @Override // androidx.appcompat.widget.I
    public void h(int i10) {
        A();
        if (i10 == 2) {
            this.f24898e.o();
        } else if (i10 == 5) {
            this.f24898e.w();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.core.view.F
    public void i(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
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

    @Override // androidx.appcompat.widget.I
    public void l() {
        A();
        this.f24898e.q();
    }

    @Override // androidx.core.view.G
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n(view, i10, i11, i12, i13, i14);
    }

    @Override // androidx.core.view.F
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // androidx.core.view.F
    public boolean o(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        A();
        L0 l0A = L0.A(windowInsets, this);
        boolean zQ = q(this.f24897d, new Rect(l0A.k(), l0A.m(), l0A.l(), l0A.j()), true, true, false, true);
        AbstractC2747a0.f(this, l0A, this.f24906m);
        Rect rect = this.f24906m;
        L0 l0O = l0A.o(rect.left, rect.top, rect.right, rect.bottom);
        this.f24914u = l0O;
        boolean z10 = true;
        if (!this.f24915v.equals(l0O)) {
            this.f24915v = this.f24914u;
            zQ = true;
        }
        if (this.f24907n.equals(this.f24906m)) {
            z10 = zQ;
        } else {
            this.f24907n.set(this.f24906m);
        }
        if (z10) {
            requestLayout();
        }
        return l0A.a().c().b().y();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w(getContext());
        AbstractC2747a0.h0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredHeight;
        A();
        measureChildWithMargins(this.f24897d, i10, 0, i11, 0);
        e eVar = (e) this.f24897d.getLayoutParams();
        int iMax = Math.max(0, this.f24897d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f24897d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f24897d.getMeasuredState());
        boolean z10 = (AbstractC2747a0.K(this) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0;
        if (z10) {
            measuredHeight = this.f24894a;
            if (this.f24901h && this.f24897d.getTabContainer() != null) {
                measuredHeight += this.f24894a;
            }
        } else {
            measuredHeight = this.f24897d.getVisibility() != 8 ? this.f24897d.getMeasuredHeight() : 0;
        }
        this.f24908o.set(this.f24906m);
        this.f24916w = this.f24914u;
        if (this.f24900g || z10 || !r()) {
            this.f24916w = new L0.a(this.f24916w).d(A1.b.c(this.f24916w.k(), this.f24916w.m() + measuredHeight, this.f24916w.l(), this.f24916w.j())).a();
        } else {
            Rect rect = this.f24908o;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f24916w = this.f24916w.o(0, measuredHeight, 0, 0);
        }
        q(this.f24896c, this.f24908o, true, true, true, true);
        if (!this.f24917x.equals(this.f24916w)) {
            L0 l02 = this.f24916w;
            this.f24917x = l02;
            AbstractC2747a0.g(this.f24896c, l02);
        }
        measureChildWithMargins(this.f24896c, i10, 0, i11, 0);
        e eVar2 = (e) this.f24896c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f24896c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f24896c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f24896c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f24902i || !z10) {
            return false;
        }
        if (C(f11)) {
            p();
        } else {
            B();
        }
        this.f24903j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f24904k + i11;
        this.f24904k = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f24892E.b(view, view2, i10);
        this.f24904k = getActionBarHideOffset();
        v();
        d dVar = this.f24918y;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f24897d.getVisibility() != 0) {
            return false;
        }
        return this.f24902i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f24902i && !this.f24903j) {
            if (this.f24904k <= this.f24897d.getHeight()) {
                z();
            } else {
                y();
            }
        }
        d dVar = this.f24918y;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        A();
        int i11 = this.f24905l ^ i10;
        this.f24905l = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0;
        d dVar = this.f24918y;
        if (dVar != null) {
            dVar.c(!z11);
            if (z10 || !z11) {
                this.f24918y.a();
            } else {
                this.f24918y.d();
            }
        }
        if ((i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0 || this.f24918y == null) {
            return;
        }
        AbstractC2747a0.h0(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f24895b = i10;
        d dVar = this.f24918y;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    public void setActionBarHideOffset(int i10) {
        v();
        this.f24897d.setTranslationY(-Math.max(0, Math.min(i10, this.f24897d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f24918y = dVar;
        if (getWindowToken() != null) {
            this.f24918y.onWindowVisibilityChanged(this.f24895b);
            int i10 = this.f24905l;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                AbstractC2747a0.h0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f24901h = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f24902i) {
            this.f24902i = z10;
            if (z10) {
                return;
            }
            v();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        A();
        this.f24898e.setIcon(i10);
    }

    public void setLogo(int i10) {
        A();
        this.f24898e.s(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f24900g = z10;
    }

    @Override // androidx.appcompat.widget.I
    public void setWindowCallback(Window.Callback callback) {
        A();
        this.f24898e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.I
    public void setWindowTitle(CharSequence charSequence) {
        A();
        this.f24898e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    void v() {
        removeCallbacks(this.f24890C);
        removeCallbacks(this.f24891D);
        ViewPropertyAnimator viewPropertyAnimator = this.f24888A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean x() {
        return this.f24900g;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        A();
        this.f24898e.setIcon(drawable);
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }
}
