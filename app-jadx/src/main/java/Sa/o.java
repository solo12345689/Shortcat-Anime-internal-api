package Sa;

import Ta.e;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.inputmethod.InputMethodManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.I;
import androidx.core.view.L0;
import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import androidx.lifecycle.AbstractC2857k;
import androidx.lifecycle.InterfaceC2861o;
import com.facebook.react.uimanager.C3284b0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.A;
import com.swmansion.rnscreens.AbstractC4536n;
import com.swmansion.rnscreens.B;
import com.swmansion.rnscreens.C4533k;
import com.swmansion.rnscreens.C4534l;
import com.swmansion.rnscreens.C4535m;
import com.swmansion.rnscreens.C4537o;
import com.swmansion.rnscreens.C4546y;
import com.swmansion.rnscreens.D;
import com.swmansion.rnscreens.X;
import eb.C4665a;
import fb.AbstractC4791a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements InterfaceC2861o, I {

    /* JADX INFO: renamed from: l */
    public static final a f16044l = new a(null);

    /* JADX INFO: renamed from: a */
    private final C4546y f16045a;

    /* JADX INFO: renamed from: b */
    private boolean f16046b;

    /* JADX INFO: renamed from: c */
    private AbstractC4536n f16047c;

    /* JADX INFO: renamed from: d */
    private boolean f16048d;

    /* JADX INFO: renamed from: e */
    private int f16049e;

    /* JADX INFO: renamed from: f */
    private int f16050f;

    /* JADX INFO: renamed from: g */
    private int f16051g;

    /* JADX INFO: renamed from: h */
    private int f16052h;

    /* JADX INFO: renamed from: i */
    private final d f16053i;

    /* JADX INFO: renamed from: j */
    private final b f16054j;

    /* JADX INFO: renamed from: k */
    private View f16055k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class b extends BottomSheetBehavior.f {
        public b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View bottomSheet, float f10) {
            AbstractC5504s.h(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(View bottomSheet, int i10) {
            AbstractC5504s.h(bottomSheet, "bottomSheet");
            if (i10 == 4 && L0.z(bottomSheet.getRootWindowInsets()).r(L0.p.d())) {
                bottomSheet.requestFocus();
                InputMethodManager inputMethodManagerZ = o.this.z();
                if (inputMethodManagerZ != null) {
                    inputMethodManagerZ.hideSoftInputFromWindow(bottomSheet.getWindowToken(), 0);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {

        /* JADX INFO: renamed from: a */
        private final X f16057a;

        /* JADX INFO: renamed from: b */
        private final C4546y f16058b;

        /* JADX INFO: renamed from: c */
        private final CoordinatorLayout f16059c;

        /* JADX INFO: renamed from: d */
        private final g f16060d;

        public c(X fragment, C4546y screen, CoordinatorLayout coordinatorLayout, g dimmingDelegate) {
            AbstractC5504s.h(fragment, "fragment");
            AbstractC5504s.h(screen, "screen");
            AbstractC5504s.h(coordinatorLayout, "coordinatorLayout");
            AbstractC5504s.h(dimmingDelegate, "dimmingDelegate");
            this.f16057a = fragment;
            this.f16058b = screen;
            this.f16059c = coordinatorLayout;
            this.f16060d = dimmingDelegate;
        }

        public final CoordinatorLayout a() {
            return this.f16059c;
        }

        public final g b() {
            return this.f16060d;
        }

        public final X c() {
            return this.f16057a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC5504s.c(this.f16057a, cVar.f16057a) && AbstractC5504s.c(this.f16058b, cVar.f16058b) && AbstractC5504s.c(this.f16059c, cVar.f16059c) && AbstractC5504s.c(this.f16060d, cVar.f16060d);
        }

        public int hashCode() {
            return (((((this.f16057a.hashCode() * 31) + this.f16058b.hashCode()) * 31) + this.f16059c.hashCode()) * 31) + this.f16060d.hashCode();
        }

        public String toString() {
            return "SheetAnimationContext(fragment=" + this.f16057a + ", screen=" + this.f16058b + ", coordinatorLayout=" + this.f16059c + ", dimmingDelegate=" + this.f16060d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class d extends BottomSheetBehavior.f {
        public d() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View bottomSheet, float f10) {
            AbstractC5504s.h(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(View bottomSheet, int i10) {
            AbstractC5504s.h(bottomSheet, "bottomSheet");
            o.this.K(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16062a;

        static {
            int[] iArr = new int[AbstractC2857k.a.values().length];
            try {
                iArr[AbstractC2857k.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC2857k.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC2857k.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC2857k.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC2857k.a.ON_DESTROY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f16062a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            AbstractC5504s.h(animation, "animation");
            o.this.f16048d = false;
            o.this.A().y();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            AbstractC5504s.h(animation, "animation");
            o.this.f16048d = true;
        }
    }

    public o(C4546y screen) {
        AbstractC5504s.h(screen, "screen");
        this.f16045a = screen;
        this.f16047c = C4535m.f44646a;
        this.f16051g = screen.getSheetInitialDetentIndex();
        this.f16052h = screen.getSheetDetents().k(screen.getSheetInitialDetentIndex());
        d dVar = new d();
        this.f16053i = dVar;
        this.f16054j = new b();
        screen.getFragment();
        AbstractComponentCallbacksC2838q fragment = screen.getFragment();
        AbstractC5504s.e(fragment);
        fragment.getLifecycle().addObserver(this);
        BottomSheetBehavior bottomSheetBehaviorB = B();
        if (bottomSheetBehaviorB == null) {
            throw new IllegalStateException("[RNScreens] Sheet delegate accepts screen with initialized sheet behaviour only.");
        }
        bottomSheetBehaviorB.Y(dVar);
    }

    private final BottomSheetBehavior B() {
        return this.f16045a.getSheetBehavior();
    }

    private final X C() {
        AbstractComponentCallbacksC2838q fragment = this.f16045a.getFragment();
        AbstractC5504s.f(fragment, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragment");
        return (X) fragment;
    }

    private final void D() {
        L();
    }

    private final void F() {
        N();
    }

    private final void G() {
        C4533k.f44637a.g(this);
    }

    private final void H() {
        C4533k.f44637a.a(this);
    }

    private final void I() {
        C4533k.f44637a.e(M());
    }

    public final void K(int i10) {
        boolean zB = q.f16066a.b(i10);
        if (zB) {
            this.f16052h = i10;
            this.f16051g = this.f16045a.getSheetDetents().h(i10);
        }
        this.f16045a.x(this.f16051g, zB);
        if (O(i10)) {
            C().Z();
        }
    }

    private final void L() {
        View currentFocus;
        View decorView;
        Activity currentActivity = this.f16045a.getReactContext().getCurrentActivity();
        if (currentActivity == null || (currentFocus = currentActivity.getCurrentFocus()) == null) {
            return;
        }
        Window window = currentActivity.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null && AbstractC5504s.c(AbstractC4791a.c(decorView), Boolean.TRUE)) {
            this.f16055k = currentFocus;
        }
        this.f16045a.setDescendantFocusability(262144);
        this.f16045a.requestFocus();
        InputMethodManager inputMethodManagerZ = z();
        if (inputMethodManagerZ != null) {
            inputMethodManagerZ.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    private final View M() {
        Activity currentActivity = this.f16045a.getReactContext().getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("[RNScreens] Attempt to access activity on detached context");
        }
        View decorView = currentActivity.getWindow().getDecorView();
        AbstractC5504s.g(decorView, "getDecorView(...)");
        return decorView;
    }

    private final void N() {
        View view = this.f16055k;
        if (view != null) {
            view.requestFocus();
            InputMethodManager inputMethodManagerZ = z();
            if (inputMethodManagerZ != null) {
                inputMethodManagerZ.showSoftInput(view, 0);
            }
        }
        this.f16055k = null;
    }

    private final boolean O(int i10) {
        return i10 == 5;
    }

    private final Integer P() {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        DisplayMetrics displayMetrics;
        A container = this.f16045a.getContainer();
        if (container != null) {
            return Integer.valueOf(container.getHeight());
        }
        C3284b0 reactContext = this.f16045a.getReactContext();
        Resources resources = reactContext.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            return Integer.valueOf(displayMetrics.heightPixels);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Object systemService = reactContext.getSystemService("window");
            WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
            if (windowManager != null && (currentWindowMetrics = windowManager.getCurrentWindowMetrics()) != null && (bounds = currentWindowMetrics.getBounds()) != null) {
                return Integer.valueOf(bounds.height());
            }
        }
        return null;
    }

    private final Integer R() {
        Integer numP = P();
        if (numP != null) {
            return Integer.valueOf(numP.intValue() - this.f16049e);
        }
        return null;
    }

    private final void T(float f10) {
        this.f16045a.setTranslationY(f10 - l(this.f16050f));
    }

    private final void k(AnimatorSet animatorSet, boolean z10, X x10) {
        animatorSet.addListener(new Ta.e(x10, new Ta.i(this.f16045a), z10 ? e.a.f17349a : e.a.f17350b));
        animatorSet.addListener(new f());
    }

    public static /* synthetic */ BottomSheetBehavior n(o oVar, BottomSheetBehavior bottomSheetBehavior, AbstractC4536n abstractC4536n, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            abstractC4536n = C4535m.f44646a;
        }
        if ((i11 & 4) != 0) {
            i10 = oVar.f16051g;
        }
        return oVar.m(bottomSheetBehavior, abstractC4536n, i10);
    }

    private final ValueAnimator o(float f10, float f11, final g gVar) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Sa.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o.p(gVar, valueAnimator);
            }
        });
        AbstractC5504s.g(valueAnimatorOfFloat, "apply(...)");
        return valueAnimatorOfFloat;
    }

    public static final void p(g gVar, ValueAnimator animator) {
        AbstractC5504s.h(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Float f10 = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (f10 != null) {
            gVar.d().setAlpha(f10.floatValue());
        }
    }

    private final ValueAnimator s() {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new C4665a(new Function1() { // from class: Sa.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(o.t(this.f16040a, (Number) obj));
            }
        }, new Function1() { // from class: Sa.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o.u((Number) obj);
            }
        }), Float.valueOf(this.f16045a.getHeight()), Float.valueOf(0.0f));
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Sa.l
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o.v(this.f16041a, valueAnimator);
            }
        });
        AbstractC5504s.g(valueAnimatorOfObject, "apply(...)");
        return valueAnimatorOfObject;
    }

    public static final float t(o oVar, Number number) {
        return oVar.f16045a.getHeight();
    }

    public static final Float u(Number number) {
        return Float.valueOf(0.0f);
    }

    public static final void v(o oVar, ValueAnimator it) {
        AbstractC5504s.h(it, "it");
        Object animatedValue = it.getAnimatedValue();
        AbstractC5504s.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        oVar.T(((Float) animatedValue).floatValue());
    }

    private final ValueAnimator x(CoordinatorLayout coordinatorLayout) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (coordinatorLayout.getBottom() - this.f16045a.getTop()) - this.f16045a.getTranslationY());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Sa.n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o.y(this.f16043a, valueAnimator);
            }
        });
        AbstractC5504s.g(valueAnimatorOfFloat, "apply(...)");
        return valueAnimatorOfFloat;
    }

    public static final void y(o oVar, ValueAnimator it) {
        AbstractC5504s.h(it, "it");
        Object animatedValue = it.getAnimatedValue();
        AbstractC5504s.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        oVar.T(((Float) animatedValue).floatValue());
    }

    public final InputMethodManager z() {
        Object systemService = this.f16045a.getReactContext().getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            return (InputMethodManager) systemService;
        }
        return null;
    }

    public final C4546y A() {
        return this.f16045a;
    }

    public final void J(L0 insets) {
        AbstractC5504s.h(insets, "insets");
        this.f16050f = insets.f(L0.p.d()).f107d;
        if (this.f16048d) {
            return;
        }
        T(0.0f);
    }

    public final Integer Q() {
        return this.f16045a.getSheetShouldOverflowTopInset() ? P() : R();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(com.google.android.material.bottomsheet.BottomSheetBehavior r7) {
        /*
            r6 = this;
            java.lang.String r0 = "behavior"
            kotlin.jvm.internal.AbstractC5504s.h(r7, r0)
            java.lang.Integer r0 = r6.Q()
            if (r0 == 0) goto L70
            com.swmansion.rnscreens.y r1 = r6.f16045a
            boolean r1 = Sa.r.b(r1)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L2e
            com.swmansion.rnscreens.y r1 = r6.f16045a
            com.swmansion.rnscreens.B r1 = r1.getContentWrapper()
            if (r1 == 0) goto L2c
            int r2 = r1.getHeight()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r1 = Sa.r.a(r1)
            if (r1 == 0) goto L2c
            goto L45
        L2c:
            r2 = r3
            goto L45
        L2e:
            if (r1 != 0) goto L6a
            com.swmansion.rnscreens.y r1 = r6.f16045a
            Sa.p r1 = r1.getSheetDetents()
            double r1 = r1.g()
            int r4 = r0.intValue()
            double r4 = (double) r4
            double r1 = r1 * r4
            int r1 = (int) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
        L45:
            com.swmansion.rnscreens.y r1 = r6.f16045a
            Sa.p r1 = r1.getSheetDetents()
            int r1 = r1.d()
            r4 = 3
            if (r1 != r4) goto L66
            com.swmansion.rnscreens.y r1 = r6.f16045a
            Sa.p r1 = r1.getSheetDetents()
            int r0 = r0.intValue()
            int r3 = r6.f16049e
            int r0 = r1.b(r0, r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L66:
            Sa.a.b(r7, r2, r3)
            return
        L6a:
            Td.r r7 = new Td.r
            r7.<init>()
            throw r7
        L70:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "[RNScreens] Failed to find window height during bottom sheet behaviour configuration"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Sa.o.S(com.google.android.material.bottomsheet.BottomSheetBehavior):void");
    }

    @Override // androidx.core.view.I
    public L0 d(View v10, L0 insets) {
        AbstractC5504s.h(v10, "v");
        AbstractC5504s.h(insets, "insets");
        boolean zR = insets.r(L0.p.d());
        A1.b bVarF = insets.f(L0.p.d());
        AbstractC5504s.g(bVarF, "getInsets(...)");
        A1.b bVarF2 = insets.f(L0.p.i());
        AbstractC5504s.g(bVarF2, "getInsets(...)");
        A1.b bVarF3 = insets.f(L0.p.c());
        AbstractC5504s.g(bVarF3, "getInsets(...)");
        this.f16049e = Math.max(bVarF2.f105b, bVarF3.f105b);
        if (zR) {
            this.f16046b = true;
            this.f16047c = new C4537o(bVarF.f107d);
            BottomSheetBehavior bottomSheetBehaviorB = B();
            if (bottomSheetBehaviorB != null) {
                n(this, bottomSheetBehaviorB, this.f16047c, 0, 4, null);
            }
        } else {
            BottomSheetBehavior bottomSheetBehaviorB2 = B();
            if (bottomSheetBehaviorB2 != null) {
                if (this.f16046b) {
                    n(this, bottomSheetBehaviorB2, C4534l.f44644a, 0, 4, null);
                } else {
                    AbstractC4536n abstractC4536n = this.f16047c;
                    C4535m c4535m = C4535m.f44646a;
                    if (!AbstractC5504s.c(abstractC4536n, c4535m)) {
                        n(this, bottomSheetBehaviorB2, c4535m, 0, 4, null);
                    }
                }
            }
            this.f16047c = C4535m.f44646a;
            this.f16046b = false;
        }
        L0 l0A = new L0.a(insets).b(L0.p.i(), A1.b.c(bVarF2.f104a, bVarF2.f105b, bVarF2.f106c, zR ? 0 : bVarF2.f107d)).a();
        AbstractC5504s.g(l0A, "build(...)");
        return l0A;
    }

    @Override // androidx.lifecycle.InterfaceC2861o
    public void g(androidx.lifecycle.r source, AbstractC2857k.a event) {
        AbstractC5504s.h(source, "source");
        AbstractC5504s.h(event, "event");
        int i10 = e.f16062a[event.ordinal()];
        if (i10 == 1) {
            D();
            return;
        }
        if (i10 == 2) {
            I();
            return;
        }
        if (i10 == 3) {
            H();
        } else if (i10 == 4) {
            G();
        } else {
            if (i10 != 5) {
                return;
            }
            F();
        }
    }

    public final int l(int i10) {
        Integer numQ = Q();
        if (numQ == null) {
            throw new IllegalStateException("[RNScreens] Failed to find window height during bottom sheet behaviour configuration");
        }
        if (!r.b(this.f16045a)) {
            return Math.min(numQ.intValue() - ((int) (AbstractC5874j.k(this.f16045a.getSheetDetents().g(), 0.0d, 1.0d) * ((double) numQ.intValue()))), i10);
        }
        B contentWrapper = this.f16045a.getContentWrapper();
        return Math.min(Math.max(numQ.intValue() - (contentWrapper != null ? contentWrapper.getHeight() : 0), 0), i10);
    }

    public final BottomSheetBehavior m(BottomSheetBehavior behavior, AbstractC4536n keyboardState, int i10) {
        BottomSheetBehavior bottomSheetBehavior;
        BottomSheetBehavior bottomSheetBehavior2;
        AbstractC5504s.h(behavior, "behavior");
        AbstractC5504s.h(keyboardState, "keyboardState");
        Integer numQ = Q();
        if (numQ == null) {
            throw new IllegalStateException("[RNScreens] Failed to find window height during bottom sheet behaviour configuration");
        }
        behavior.O0(true);
        behavior.I0(true);
        behavior.Y(this.f16053i);
        D footer = this.f16045a.getFooter();
        if (footer != null) {
            footer.P(behavior);
        }
        if (keyboardState instanceof C4535m) {
            int iD = this.f16045a.getSheetDetents().d();
            if (iD == 1) {
                Sa.a.e(behavior, Integer.valueOf(r.b(this.f16045a) ? this.f16045a.getSheetDetents().j(this.f16045a) : this.f16045a.getSheetDetents().i(numQ.intValue())), false, 2, null);
                return behavior;
            }
            if (iD == 2) {
                return Sa.a.h(behavior, Integer.valueOf(this.f16045a.getSheetDetents().k(i10)), Integer.valueOf(this.f16045a.getSheetDetents().c(numQ.intValue())), Integer.valueOf(this.f16045a.getSheetDetents().i(numQ.intValue())));
            }
            if (iD == 3) {
                return Sa.a.f(behavior, Integer.valueOf(this.f16045a.getSheetDetents().k(i10)), Integer.valueOf(this.f16045a.getSheetDetents().c(numQ.intValue())), Integer.valueOf(this.f16045a.getSheetDetents().i(numQ.intValue())), Float.valueOf(this.f16045a.getSheetDetents().e()), Integer.valueOf(this.f16045a.getSheetDetents().b(numQ.intValue(), this.f16049e)));
            }
            throw new IllegalStateException("[RNScreens] Invalid detent count " + this.f16045a.getSheetDetents().d() + ". Expected at most 3.");
        }
        if (!(keyboardState instanceof C4537o)) {
            if (!(keyboardState instanceof C4534l)) {
                throw new Td.r();
            }
            behavior.D0(this.f16054j);
            int iD2 = this.f16045a.getSheetDetents().d();
            if (iD2 == 1) {
                Sa.a.d(behavior, Integer.valueOf(r.b(this.f16045a) ? this.f16045a.getSheetDetents().j(this.f16045a) : this.f16045a.getSheetDetents().i(numQ.intValue())), false);
                return behavior;
            }
            if (iD2 == 2) {
                return Sa.a.i(behavior, null, Integer.valueOf(this.f16045a.getSheetDetents().c(numQ.intValue())), Integer.valueOf(this.f16045a.getSheetDetents().i(numQ.intValue())), 1, null);
            }
            if (iD2 == 3) {
                return Sa.a.g(behavior, null, Integer.valueOf(this.f16045a.getSheetDetents().c(numQ.intValue())), Integer.valueOf(this.f16045a.getSheetDetents().i(numQ.intValue())), Float.valueOf(this.f16045a.getSheetDetents().e()), Integer.valueOf(this.f16045a.getSheetDetents().b(numQ.intValue(), this.f16049e)), 1, null);
            }
            throw new IllegalStateException("[RNScreens] Invalid detent count " + this.f16045a.getSheetDetents().d() + ". Expected at most 3.");
        }
        boolean z10 = ((C4537o) keyboardState).a() != 0;
        int iD3 = this.f16045a.getSheetDetents().d();
        if (iD3 == 1) {
            behavior.Y(this.f16054j);
            return behavior;
        }
        if (iD3 == 2) {
            if (z10) {
                bottomSheetBehavior = behavior;
                Sa.a.i(bottomSheetBehavior, 3, null, null, 6, null);
            } else {
                Sa.a.i(behavior, null, null, null, 7, null);
                bottomSheetBehavior = behavior;
            }
            bottomSheetBehavior.Y(this.f16054j);
            return bottomSheetBehavior;
        }
        if (iD3 != 3) {
            throw new IllegalStateException("[RNScreens] Invalid detent count " + this.f16045a.getSheetDetents().d() + ". Expected at most 3.");
        }
        if (z10) {
            Sa.a.g(behavior, 3, null, null, null, null, 30, null);
            bottomSheetBehavior2 = behavior;
        } else {
            bottomSheetBehavior2 = behavior;
            Sa.a.g(bottomSheetBehavior2, null, null, null, null, null, 31, null);
        }
        bottomSheetBehavior2.Y(this.f16054j);
        return bottomSheetBehavior2;
    }

    public final Animator q(c sheetAnimationContext) {
        AbstractC5504s.h(sheetAnimationContext, "sheetAnimationContext");
        AnimatorSet animatorSet = new AnimatorSet();
        g gVarB = sheetAnimationContext.b();
        X xC = sheetAnimationContext.c();
        ValueAnimator valueAnimatorO = o(0.0f, gVarB.e(), gVarB);
        AnimatorSet.Builder builderPlay = animatorSet.play(s());
        C4546y c4546y = this.f16045a;
        if (!gVarB.j(c4546y, c4546y.getSheetInitialDetentIndex())) {
            builderPlay = null;
        }
        if (builderPlay != null) {
            builderPlay.with(valueAnimatorO);
        }
        k(animatorSet, true, xC);
        return animatorSet;
    }

    public final Animator r(c sheetAnimationContext) {
        AbstractC5504s.h(sheetAnimationContext, "sheetAnimationContext");
        AnimatorSet animatorSet = new AnimatorSet();
        CoordinatorLayout coordinatorLayoutA = sheetAnimationContext.a();
        g gVarB = sheetAnimationContext.b();
        X xC = sheetAnimationContext.c();
        ValueAnimator valueAnimatorO = o(gVarB.d().getAlpha(), 0.0f, gVarB);
        animatorSet.play(valueAnimatorO).with(x(coordinatorLayoutA));
        k(animatorSet, false, xC);
        return animatorSet;
    }
}
