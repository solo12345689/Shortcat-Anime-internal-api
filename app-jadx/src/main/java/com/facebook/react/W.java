package com.facebook.react;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.C3287d;
import com.facebook.react.uimanager.C3289e;
import com.facebook.react.uimanager.C3299o;
import com.facebook.react.uimanager.C3300p;
import com.facebook.react.uimanager.C3301q;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.f0;
import h7.C4914b;
import java.util.concurrent.atomic.AtomicInteger;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class W extends FrameLayout implements com.facebook.react.uimanager.W, com.facebook.react.uimanager.M {

    /* JADX INFO: renamed from: a */
    private H f36431a;

    /* JADX INFO: renamed from: b */
    private String f36432b;

    /* JADX INFO: renamed from: c */
    private Bundle f36433c;

    /* JADX INFO: renamed from: d */
    private a f36434d;

    /* JADX INFO: renamed from: e */
    private int f36435e;

    /* JADX INFO: renamed from: f */
    private boolean f36436f;

    /* JADX INFO: renamed from: g */
    private boolean f36437g;

    /* JADX INFO: renamed from: h */
    private C3301q f36438h;

    /* JADX INFO: renamed from: i */
    private C3300p f36439i;

    /* JADX INFO: renamed from: j */
    private final C3280u f36440j;

    /* JADX INFO: renamed from: k */
    private boolean f36441k;

    /* JADX INFO: renamed from: l */
    private int f36442l;

    /* JADX INFO: renamed from: m */
    private int f36443m;

    /* JADX INFO: renamed from: n */
    private int f36444n;

    /* JADX INFO: renamed from: o */
    private int f36445o;

    /* JADX INFO: renamed from: p */
    private int f36446p;

    /* JADX INFO: renamed from: q */
    private int f36447q;

    /* JADX INFO: renamed from: r */
    private int f36448r;

    /* JADX INFO: renamed from: s */
    private final AtomicInteger f36449s;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        private final Rect f36450a;

        /* JADX INFO: renamed from: b */
        private final int f36451b;

        /* JADX INFO: renamed from: c */
        private boolean f36452c = false;

        /* JADX INFO: renamed from: d */
        private int f36453d = 0;

        /* JADX INFO: renamed from: e */
        private int f36454e = 0;

        a() {
            C3289e.i(W.this.getContext().getApplicationContext());
            this.f36450a = new Rect();
            this.f36451b = (int) com.facebook.react.uimanager.B.i(60.0f);
        }

        private void a() {
            g();
        }

        private void b() {
            int rotation = ((WindowManager) W.this.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
            if (this.f36454e == rotation) {
                return;
            }
            this.f36454e = rotation;
            C3289e.h(W.this.getContext().getApplicationContext());
            f(rotation);
        }

        private void c() {
            boolean zIsVisible;
            W.this.getRootView().getWindowVisibleDisplayFrame(this.f36450a);
            WindowInsets rootWindowInsets = W.this.getRootView().getRootWindowInsets();
            if (rootWindowInsets == null || (zIsVisible = rootWindowInsets.isVisible(WindowInsets.Type.ime())) == this.f36452c) {
                return;
            }
            this.f36452c = zIsVisible;
            if (!zIsVisible) {
                W.this.r("keyboardDidHide", e(com.facebook.react.uimanager.B.g(this.f36450a.height()), 0.0d, com.facebook.react.uimanager.B.g(this.f36450a.width()), 0.0d));
                return;
            }
            int i10 = rootWindowInsets.getInsets(WindowInsets.Type.ime()).bottom - rootWindowInsets.getInsets(WindowInsets.Type.systemBars()).bottom;
            ViewGroup.LayoutParams layoutParams = W.this.getRootView().getLayoutParams();
            Q6.a.a(layoutParams instanceof WindowManager.LayoutParams);
            W.this.r("keyboardDidShow", e(com.facebook.react.uimanager.B.g(((WindowManager.LayoutParams) layoutParams).softInputMode == 48 ? this.f36450a.bottom - i10 : this.f36450a.bottom), com.facebook.react.uimanager.B.g(this.f36450a.left), com.facebook.react.uimanager.B.g(this.f36450a.width()), com.facebook.react.uimanager.B.g(i10)));
        }

        private void d() {
            WindowInsets rootWindowInsets;
            DisplayCutout displayCutout;
            W.this.getRootView().getWindowVisibleDisplayFrame(this.f36450a);
            int safeInsetTop = (Build.VERSION.SDK_INT < 28 || (rootWindowInsets = W.this.getRootView().getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) ? 0 : displayCutout.getSafeInsetTop();
            int i10 = (C3289e.g().heightPixels - this.f36450a.bottom) + safeInsetTop;
            int i11 = this.f36453d;
            if (i11 != i10 && i10 > this.f36451b) {
                this.f36453d = i10;
                this.f36452c = true;
                W.this.r("keyboardDidShow", e(com.facebook.react.uimanager.B.g(r4), com.facebook.react.uimanager.B.g(this.f36450a.left), com.facebook.react.uimanager.B.g(this.f36450a.width()), com.facebook.react.uimanager.B.g(this.f36453d)));
            } else {
                if (i11 == 0 || i10 > this.f36451b) {
                    return;
                }
                this.f36453d = 0;
                this.f36452c = false;
                W.this.r("keyboardDidHide", e(com.facebook.react.uimanager.B.g(r3.height()), 0.0d, com.facebook.react.uimanager.B.g(this.f36450a.width()), 0.0d));
            }
        }

        private WritableMap e(double d10, double d11, double d12, double d13) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putDouble("height", d13);
            writableMapCreateMap2.putDouble("screenX", d11);
            writableMapCreateMap2.putDouble("width", d12);
            writableMapCreateMap2.putDouble("screenY", d10);
            writableMapCreateMap.putMap("endCoordinates", writableMapCreateMap2);
            writableMapCreateMap.putString("easing", "keyboard");
            writableMapCreateMap.putDouble("duration", 0.0d);
            return writableMapCreateMap;
        }

        private void f(int i10) {
            String str;
            double d10;
            boolean z10 = false;
            if (i10 != 0) {
                if (i10 == 1) {
                    str = "landscape-primary";
                    d10 = -90.0d;
                } else if (i10 == 2) {
                    str = "portrait-secondary";
                    d10 = 180.0d;
                } else {
                    if (i10 != 3) {
                        return;
                    }
                    str = "landscape-secondary";
                    d10 = 90.0d;
                }
                z10 = true;
            } else {
                str = "portrait-primary";
                d10 = 0.0d;
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("name", str);
            writableMapCreateMap.putDouble("rotationDegrees", d10);
            writableMapCreateMap.putBoolean("isLandscape", z10);
            W.this.r("namedOrientationDidChange", writableMapCreateMap);
        }

        private void g() {
            DeviceInfoModule deviceInfoModule;
            ReactContext currentReactContext = W.this.getCurrentReactContext();
            if (currentReactContext == null || (deviceInfoModule = (DeviceInfoModule) currentReactContext.getNativeModule(DeviceInfoModule.class)) == null) {
                return;
            }
            deviceInfoModule.emitUpdateDimensionsEvent();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (W.this.h() && W.this.o()) {
                if (Build.VERSION.SDK_INT >= 30) {
                    c();
                } else {
                    d();
                }
                b();
                a();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
    }

    public W(Context context) {
        super(context);
        this.f36435e = 0;
        this.f36440j = new C3280u();
        this.f36441k = false;
        this.f36442l = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f36443m = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f36444n = 0;
        this.f36445o = 0;
        this.f36446p = Integer.MIN_VALUE;
        this.f36447q = Integer.MIN_VALUE;
        this.f36448r = 1;
        this.f36449s = new AtomicInteger(0);
        k();
    }

    private void d() {
        U7.a.c(0L, "attachToReactInstanceManager");
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER_START);
        if (getId() != -1) {
            ReactSoftExceptionLogger.logSoftException("ReactRootView", new C3299o("Trying to attach a ReactRootView with an explicit id already set to [" + getId() + "]. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID."));
        }
        try {
            if (!this.f36436f) {
                this.f36436f = true;
                ((H) Q6.a.c(this.f36431a)).s(this);
                getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
            }
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER_END);
            U7.a.i(0L);
        }
    }

    private a getCustomGlobalLayoutListener() {
        if (this.f36434d == null) {
            this.f36434d = new a();
        }
        return this.f36434d;
    }

    private void k() {
        setRootViewTag(com.facebook.react.uimanager.N.a());
        setClipChildren(false);
        if (C4914b.n()) {
            C3289e.h(getContext().getApplicationContext());
        }
    }

    private boolean l() {
        if (!h() || !o()) {
            AbstractC7283a.I("ReactRootView", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
            return false;
        }
        if (this.f36438h == null) {
            AbstractC7283a.I("ReactRootView", "Unable to dispatch touch to JS before the dispatcher is available");
            return false;
        }
        if (!ReactFeatureFlags.dispatchPointerEvents || this.f36439i != null) {
            return true;
        }
        AbstractC7283a.I("ReactRootView", "Unable to dispatch pointer events to JS before the dispatcher is available");
        return false;
    }

    private boolean m() {
        return getUIManagerType() == 2;
    }

    private boolean n() {
        int i10 = this.f36435e;
        return (i10 == 0 || i10 == -1) ? false : true;
    }

    private void q() {
        getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
    }

    private void s() {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.f36442l = View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, Integer.MIN_VALUE);
        this.f36443m = View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, Integer.MIN_VALUE);
    }

    private void w(boolean z10, int i10, int i11) {
        UIManager uIManagerG;
        int i12;
        int i13;
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_START);
        if (!i()) {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
            AbstractC7283a.I("ReactRootView", "Unable to update root layout specs for uninitialized ReactInstanceManager");
            return;
        }
        boolean zM = m();
        if (zM && !n()) {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
            AbstractC7283a.m("ReactRootView", "Unable to update root layout specs for ReactRootView: no rootViewTag set yet");
            return;
        }
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null && (uIManagerG = f0.g(currentReactContext, getUIManagerType())) != null) {
            if (zM) {
                Point pointB = com.facebook.react.uimanager.X.b(this);
                int i14 = pointB.x;
                i13 = pointB.y;
                i12 = i14;
            } else {
                i12 = 0;
                i13 = 0;
            }
            if (z10 || i12 != this.f36446p || i13 != this.f36447q) {
                uIManagerG.updateRootLayoutSpecs(getRootViewTag(), i10, i11, i12, i13);
            }
            this.f36446p = i12;
            this.f36447q = i13;
        }
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
    }

    @Override // com.facebook.react.uimanager.W
    public void a(View view, MotionEvent motionEvent) {
        ReactContext currentReactContext;
        EventDispatcher eventDispatcherB;
        C3300p c3300p;
        if (!l() || (currentReactContext = getCurrentReactContext()) == null || (eventDispatcherB = f0.b(currentReactContext, getUIManagerType())) == null) {
            return;
        }
        this.f36438h.h(motionEvent, eventDispatcherB, currentReactContext);
        if (view == null || (c3300p = this.f36439i) == null) {
            return;
        }
        c3300p.p(view, motionEvent, eventDispatcherB);
    }

    @Override // com.facebook.react.uimanager.M
    public void b(int i10) {
        if (i10 != 101) {
            return;
        }
        p();
    }

    @Override // com.facebook.react.uimanager.M
    public void c() {
        U7.a.c(0L, "ReactRootView.runApplication");
        try {
            if (i() && o()) {
                ReactContext currentReactContext = getCurrentReactContext();
                if (currentReactContext == null) {
                    U7.a.i(0L);
                    return;
                }
                CatalystInstance catalystInstance = currentReactContext.getCatalystInstance();
                String jSModuleName = getJSModuleName();
                if (this.f36441k) {
                    w(true, this.f36442l, this.f36443m);
                }
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble("rootTag", getRootViewTag());
                Bundle appProperties = getAppProperties();
                if (appProperties != null) {
                    writableNativeMap.putMap("initialProps", Arguments.fromBundle(appProperties));
                }
                this.f36437g = true;
                ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).runApplication(jSModuleName, writableNativeMap);
                U7.a.i(0L);
            }
        } finally {
            U7.a.i(0L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (StackOverflowError e10) {
            g(e10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!h() || !o()) {
            AbstractC7283a.I("ReactRootView", "Unable to handle key event as the catalyst instance has not been attached");
            return super.dispatchKeyEvent(keyEvent);
        }
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            this.f36440j.d(keyEvent, currentReactContext);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        Canvas canvas2;
        BlendMode blendModeA;
        if (Build.VERSION.SDK_INT >= 29 && C7.a.c(this) == 2 && C3287d.a(this)) {
            blendModeA = U.a(view.getTag(AbstractC3247l.f36925s));
            if (blendModeA != null) {
                Paint paint = new Paint();
                paint.setBlendMode(blendModeA);
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), paint);
            } else {
                canvas2 = canvas;
            }
        } else {
            canvas2 = canvas;
            blendModeA = null;
        }
        boolean zDrawChild = super.drawChild(canvas2, view, j10);
        if (blendModeA != null) {
            canvas2.restore();
        }
        return zDrawChild;
    }

    protected void e(MotionEvent motionEvent, boolean z10) {
        if (!h() || !o()) {
            AbstractC7283a.I("ReactRootView", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
            return;
        }
        if (this.f36439i == null) {
            if (ReactFeatureFlags.dispatchPointerEvents) {
                AbstractC7283a.I("ReactRootView", "Unable to dispatch pointer events to JS before the dispatcher is available");
            }
        } else {
            EventDispatcher eventDispatcherB = f0.b(getCurrentReactContext(), getUIManagerType());
            if (eventDispatcherB != null) {
                this.f36439i.k(motionEvent, eventDispatcherB, z10);
            }
        }
    }

    protected void f(MotionEvent motionEvent) {
        if (!h() || !o()) {
            AbstractC7283a.I("ReactRootView", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
            return;
        }
        if (this.f36438h == null) {
            AbstractC7283a.I("ReactRootView", "Unable to dispatch touch to JS before the dispatcher is available");
            return;
        }
        EventDispatcher eventDispatcherB = f0.b(getCurrentReactContext(), getUIManagerType());
        if (eventDispatcherB != null) {
            this.f36438h.d(motionEvent, eventDispatcherB, getCurrentReactContext());
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        Q6.a.b(!this.f36436f, "The application this ReactRootView was rendering was not unmounted before the ReactRootView was garbage collected. This usually means that your application is leaking large amounts of memory. To solve this, make sure to call ReactRootView#unmountReactApplication in the onDestroy() of your hosting Activity or in the onDestroyView() of your hosting Fragment.");
    }

    public void g(Throwable th2) {
        if (!h()) {
            throw new RuntimeException(th2);
        }
        getCurrentReactContext().handleException(new C3299o(th2.getMessage(), this, th2));
    }

    @Override // com.facebook.react.uimanager.M
    public Bundle getAppProperties() {
        return this.f36433c;
    }

    public ReactContext getCurrentReactContext() {
        H h10 = this.f36431a;
        if (h10 == null) {
            return null;
        }
        return h10.B();
    }

    @Override // com.facebook.react.uimanager.M
    public int getHeightMeasureSpec() {
        return this.f36443m;
    }

    @Override // com.facebook.react.uimanager.M
    public String getJSModuleName() {
        return (String) Q6.a.c(this.f36432b);
    }

    public H getReactInstanceManager() {
        return this.f36431a;
    }

    @Override // com.facebook.react.uimanager.M
    public int getRootViewTag() {
        return this.f36435e;
    }

    @Override // com.facebook.react.uimanager.M
    public AtomicInteger getState() {
        return this.f36449s;
    }

    @Override // com.facebook.react.uimanager.M
    public String getSurfaceID() {
        Bundle appProperties = getAppProperties();
        if (appProperties != null) {
            return appProperties.getString("surfaceID");
        }
        return null;
    }

    @Override // com.facebook.react.uimanager.M
    public int getUIManagerType() {
        return this.f36448r;
    }

    @Override // com.facebook.react.uimanager.M
    public int getWidthMeasureSpec() {
        return this.f36442l;
    }

    public boolean h() {
        H h10 = this.f36431a;
        return (h10 == null || h10.B() == null) ? false : true;
    }

    public boolean i() {
        return this.f36431a != null;
    }

    @Override // com.facebook.react.uimanager.W
    public void j(View view, MotionEvent motionEvent) {
        EventDispatcher eventDispatcherB;
        if (l() && (eventDispatcherB = f0.b(getCurrentReactContext(), getUIManagerType())) != null) {
            this.f36438h.f(motionEvent, eventDispatcherB);
            C3300p c3300p = this.f36439i;
            if (c3300p != null) {
                c3300p.o();
            }
        }
    }

    public boolean o() {
        return this.f36436f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (o()) {
            q();
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (o()) {
            q();
        }
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (!h() || !o()) {
            AbstractC7283a.I("ReactRootView", "Unable to handle focus changed event as the catalyst instance has not been attached");
            super.onFocusChanged(z10, i10, rect);
        } else {
            ReactContext currentReactContext = getCurrentReactContext();
            if (currentReactContext != null) {
                this.f36440j.a(currentReactContext);
            }
            super.onFocusChanged(z10, i10, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        e(motionEvent, false);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        e(motionEvent, true);
        return super.onInterceptHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (t(motionEvent)) {
            f(motionEvent);
        }
        e(motionEvent, true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f36441k && m()) {
            w(false, this.f36442l, this.f36443m);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int iMax;
        int iMax2;
        U7.a.c(0L, "ReactRootView.onMeasure");
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_START);
        try {
            boolean z10 = (i10 == this.f36442l && i11 == this.f36443m) ? false : true;
            this.f36442l = i10;
            this.f36443m = i11;
            int mode = View.MeasureSpec.getMode(i10);
            if (mode == Integer.MIN_VALUE || mode == 0) {
                iMax = 0;
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    iMax = Math.max(iMax, childAt.getLeft() + childAt.getMeasuredWidth() + childAt.getPaddingLeft() + childAt.getPaddingRight());
                }
            } else {
                iMax = View.MeasureSpec.getSize(i10);
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
                iMax2 = 0;
                for (int i13 = 0; i13 < getChildCount(); i13++) {
                    View childAt2 = getChildAt(i13);
                    iMax2 = Math.max(iMax2, childAt2.getTop() + childAt2.getMeasuredHeight() + childAt2.getPaddingTop() + childAt2.getPaddingBottom());
                }
            } else {
                iMax2 = View.MeasureSpec.getSize(i11);
            }
            setMeasuredDimension(iMax, iMax2);
            this.f36441k = true;
            if (i() && !o()) {
                d();
            } else if (z10 || this.f36444n != iMax || this.f36445o != iMax2) {
                w(true, this.f36442l, this.f36443m);
            }
            this.f36444n = iMax;
            this.f36445o = iMax2;
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_END);
            U7.a.i(0L);
        } catch (Throwable th2) {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_END);
            U7.a.i(0L);
            throw th2;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (t(motionEvent)) {
            f(motionEvent);
        }
        e(motionEvent, false);
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.f36437g) {
            this.f36437g = false;
            ReactMarker.logMarker(ReactMarkerConstants.CONTENT_APPEARED, getJSModuleName(), this.f36435e);
        }
    }

    public void p() {
        this.f36438h = new C3301q(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.f36439i = new C3300p(this);
        }
    }

    void r(String str, WritableMap writableMap) {
        if (i()) {
            getCurrentReactContext().emitDeviceEvent(str, writableMap);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!h() || !o()) {
            AbstractC7283a.I("ReactRootView", "Unable to handle child focus changed event as the catalyst instance has not been attached");
            super.requestChildFocus(view, view2);
        } else {
            ReactContext currentReactContext = getCurrentReactContext();
            if (currentReactContext != null) {
                this.f36440j.e(view2, currentReactContext);
            }
            super.requestChildFocus(view, view2);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z10);
        }
    }

    public void setAppProperties(Bundle bundle) {
        UiThreadUtil.assertOnUiThread();
        this.f36433c = bundle;
        if (n()) {
            c();
        }
    }

    public void setIsFabric(boolean z10) {
        this.f36448r = z10 ? 2 : 1;
    }

    @Override // com.facebook.react.uimanager.M
    public void setRootViewTag(int i10) {
        this.f36435e = i10;
    }

    @Override // com.facebook.react.uimanager.M
    public void setShouldLogContentAppeared(boolean z10) {
        this.f36437g = z10;
    }

    public boolean t(MotionEvent motionEvent) {
        return true;
    }

    public void u(H h10, String str, Bundle bundle) {
        U7.a.c(0L, "startReactApplication");
        try {
            UiThreadUtil.assertOnUiThread();
            Q6.a.b(this.f36431a == null, "This root view has already been attached to a catalyst instance manager");
            this.f36431a = h10;
            this.f36432b = str;
            this.f36433c = bundle;
            h10.y();
            if (C4914b.k()) {
                if (!this.f36441k) {
                    s();
                }
                d();
            }
            U7.a.i(0L);
        } catch (Throwable th2) {
            U7.a.i(0L);
            throw th2;
        }
    }

    public void v() {
        UiThreadUtil.assertOnUiThread();
        H h10 = this.f36431a;
        if (h10 != null && this.f36436f) {
            h10.z(this);
            this.f36436f = false;
        }
        this.f36431a = null;
        this.f36437g = false;
    }

    @Override // com.facebook.react.uimanager.M
    public ViewGroup getRootViewGroup() {
        return this;
    }

    public void setEventListener(b bVar) {
    }
}
