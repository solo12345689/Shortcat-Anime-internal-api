package com.swmansion.rnscreens;

import android.app.Activity;
import android.view.View;
import android.view.ViewParent;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.C2777p0;
import androidx.core.view.L0;
import com.facebook.react.bridge.ReactContext;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class D extends com.facebook.react.views.view.g {

    /* JADX INFO: renamed from: j */
    public static final a f44339j = new a(null);

    /* JADX INFO: renamed from: a */
    private final ReactContext f44340a;

    /* JADX INFO: renamed from: b */
    private int f44341b;

    /* JADX INFO: renamed from: c */
    private int f44342c;

    /* JADX INFO: renamed from: d */
    private boolean f44343d;

    /* JADX INFO: renamed from: e */
    private float f44344e;

    /* JADX INFO: renamed from: f */
    private int f44345f;

    /* JADX INFO: renamed from: g */
    private boolean f44346g;

    /* JADX INFO: renamed from: h */
    private final c f44347h;

    /* JADX INFO: renamed from: i */
    private b f44348i;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends BottomSheetBehavior.f {
        b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View bottomSheet, float f10) {
            AbstractC5504s.h(bottomSheet, "bottomSheet");
            D.this.f44344e = Math.max(f10, 0.0f);
            if (D.this.f44343d) {
                return;
            }
            D d10 = D.this;
            int i10 = d10.f44341b;
            int reactHeight = D.this.getReactHeight();
            D d11 = D.this;
            d10.M(i10, reactHeight, d11.T(d11.f44344e), D.this.f44345f);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(View bottomSheet, int i10) {
            AbstractC5504s.h(bottomSheet, "bottomSheet");
            if (Sa.q.f16066a.b(i10)) {
                if (i10 == 3 || i10 == 4 || i10 == 6) {
                    D d10 = D.this;
                    d10.M(d10.f44341b, D.this.getReactHeight(), D.this.S(i10), D.this.f44345f);
                }
                D.this.f44342c = i10;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends C2777p0.b {
        c() {
            super(0);
        }

        @Override // androidx.core.view.C2777p0.b
        public void onEnd(C2777p0 animation) {
            AbstractC5504s.h(animation, "animation");
            D.this.f44343d = false;
        }

        @Override // androidx.core.view.C2777p0.b
        public L0 onProgress(L0 insets, List runningAnimations) {
            AbstractC5504s.h(insets, "insets");
            AbstractC5504s.h(runningAnimations, "runningAnimations");
            D.this.f44345f = insets.f(L0.p.d()).f107d - insets.f(L0.p.g()).f107d;
            D d10 = D.this;
            int i10 = d10.f44341b;
            int reactHeight = D.this.getReactHeight();
            D d11 = D.this;
            d10.M(i10, reactHeight, d11.T(d11.f44344e), D.this.f44345f);
            return insets;
        }

        @Override // androidx.core.view.C2777p0.b
        public C2777p0.a onStart(C2777p0 animation, C2777p0.a bounds) {
            AbstractC5504s.h(animation, "animation");
            AbstractC5504s.h(bounds, "bounds");
            D.this.f44343d = true;
            C2777p0.a aVarOnStart = super.onStart(animation, bounds);
            AbstractC5504s.g(aVarOnStart, "onStart(...)");
            return aVarOnStart;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(ReactContext reactContext) {
        super(reactContext);
        AbstractC5504s.h(reactContext, "reactContext");
        this.f44340a = reactContext;
        this.f44342c = 5;
        c cVar = new c();
        this.f44347h = cVar;
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("[RNScreens] Context detached from activity while creating ScreenFooter");
        }
        View decorView = currentActivity.getWindow().getDecorView();
        AbstractC5504s.g(decorView, "getDecorView(...)");
        AbstractC2747a0.C0(decorView, cVar);
        this.f44348i = new b();
    }

    public static /* synthetic */ void N(D d10, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        d10.M(i10, i11, i12, i13);
    }

    private final C4546y Q() {
        C4546y screenParent = getScreenParent();
        if (screenParent != null) {
            return screenParent;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final BottomSheetBehavior R() {
        BottomSheetBehavior<C4546y> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            return sheetBehavior;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final int S(int i10) {
        BottomSheetBehavior bottomSheetBehaviorR = R();
        if (i10 == 3) {
            return bottomSheetBehaviorR.n0();
        }
        if (i10 == 4) {
            return this.f44341b - bottomSheetBehaviorR.q0();
        }
        if (i10 == 5) {
            return this.f44341b;
        }
        if (i10 == 6) {
            return (int) (this.f44341b * (1 - bottomSheetBehaviorR.o0()));
        }
        throw new IllegalArgumentException("[RNScreens] use of stable-state method for unstable state");
    }

    public final int T(float f10) {
        C4546y screenParent = getScreenParent();
        return screenParent != null ? screenParent.getTop() : (int) B9.a.c(S(4), S(3), f10);
    }

    private final boolean getHasReceivedInitialLayoutFromParent() {
        return this.f44341b > 0;
    }

    public final int getReactHeight() {
        return getMeasuredHeight();
    }

    private final int getReactWidth() {
        return getMeasuredWidth();
    }

    private final C4546y getScreenParent() {
        ViewParent parent = getParent();
        if (parent instanceof C4546y) {
            return (C4546y) parent;
        }
        return null;
    }

    private final BottomSheetBehavior<C4546y> getSheetBehavior() {
        return Q().getSheetBehavior();
    }

    public final void M(int i10, int i11, int i12, int i13) {
        int iMax = ((i10 - i11) - i12) - Math.max(i13, 0);
        int reactHeight = getReactHeight();
        setTop(Math.max(iMax, 0));
        setBottom(getTop() + reactHeight);
    }

    public final void O(boolean z10, int i10, int i11, int i12, int i13, int i14) {
        this.f44341b = i14;
        N(this, i14, getReactHeight(), S(R().r0()), 0, 8, null);
    }

    public final void P(BottomSheetBehavior behavior) {
        AbstractC5504s.h(behavior, "behavior");
        if (this.f44346g) {
            return;
        }
        behavior.Y(this.f44348i);
        this.f44346g = true;
    }

    public final void U(BottomSheetBehavior behavior) {
        AbstractC5504s.h(behavior, "behavior");
        if (this.f44346g) {
            behavior.D0(this.f44348i);
            this.f44346g = false;
        }
    }

    public final ReactContext getReactContext() {
        return this.f44340a;
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        BottomSheetBehavior<C4546y> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            P(sheetBehavior);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BottomSheetBehavior<C4546y> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            U(sheetBehavior);
        }
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (getHasReceivedInitialLayoutFromParent()) {
            M(this.f44341b, i13 - i11, S(R().r0()), this.f44345f);
        }
    }
}
