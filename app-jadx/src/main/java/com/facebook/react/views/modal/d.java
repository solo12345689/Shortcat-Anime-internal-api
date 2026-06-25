package com.facebook.react.views.modal;

import Td.L;
import Ud.AbstractC2279u;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.activity.G;
import androidx.activity.r;
import androidx.core.view.L0;
import androidx.core.view.l1;
import com.facebook.react.AbstractC3247l;
import com.facebook.react.AbstractC3251p;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.C3300p;
import com.facebook.react.uimanager.C3301q;
import com.facebook.react.uimanager.InterfaceC3282a0;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.W;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.view.WindowUtilKt;
import com.facebook.react.views.view.g;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends ViewGroup implements LifecycleEventListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f37952k = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f37953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f37954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DialogInterface.OnShowListener f37955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f37956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f37957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f37958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f37959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f37960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f37961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f37962j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
        void a(DialogInterface dialogInterface);
    }

    /* JADX INFO: renamed from: com.facebook.react.views.modal.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class DialogInterfaceOnKeyListenerC0627d implements DialogInterface.OnKeyListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5082a f37970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f37971b;

        DialogInterfaceOnKeyListenerC0627d(InterfaceC5082a interfaceC5082a, d dVar) {
            this.f37970a = interfaceC5082a;
            this.f37971b = dVar;
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialog, int i10, KeyEvent event) {
            AbstractC5504s.h(dialog, "dialog");
            AbstractC5504s.h(event, "event");
            if (event.getAction() != 1) {
                return false;
            }
            if (i10 == 4 || i10 == 111) {
                this.f37970a.invoke();
                return true;
            }
            Context context = this.f37971b.getContext();
            AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            Activity currentActivity = ((ReactContext) context).getCurrentActivity();
            if (currentActivity != null) {
                return currentActivity.onKeyUp(i10, event);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends G {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5082a f37972d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC5082a interfaceC5082a) {
            super(true);
            this.f37972d = interfaceC5082a;
        }

        @Override // androidx.activity.G
        public void d() {
            this.f37972d.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C3284b0 context) {
        super(context);
        AbstractC5504s.h(context, "context");
        this.f37961i = new b(context);
    }

    private final void b() {
        Activity activity;
        UiThreadUtil.assertOnUiThread();
        r rVar = this.f37953a;
        if (rVar != null) {
            if (rVar.isShowing() && ((activity = (Activity) L7.a.a(rVar.getContext(), Activity.class)) == null || !activity.isFinishing())) {
                rVar.dismiss();
            }
            this.f37953a = null;
            this.f37962j = true;
            ViewParent parent = this.f37961i.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeViewAt(0);
            }
        }
    }

    private final boolean c(Activity activity) {
        return (activity == null || (activity.getWindow().getAttributes().flags & 8192) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L f(d dVar, r rVar) {
        c cVar = dVar.f37956d;
        if (cVar == null) {
            throw new IllegalStateException("onRequestClose callback must be set if back key is expected to close the modal");
        }
        cVar.a(rVar);
        return L.f17438a;
    }

    private final void g(L0 l02, l1 l1Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (l02.r(iIntValue)) {
                if (l1Var != null) {
                    l1Var.g(iIntValue);
                }
            } else if (l1Var != null) {
                l1Var.b(iIntValue);
            }
        }
    }

    private final View getContentView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.f37961i);
        if (!getStatusBarTranslucent()) {
            frameLayout.setFitsSystemWindows(true);
        }
        return frameLayout;
    }

    private final Activity getCurrentActivity() {
        Context context = getContext();
        AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        return ((C3284b0) context).getCurrentActivity();
    }

    static /* synthetic */ void h(d dVar, L0 l02, l1 l1Var, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = AbstractC2279u.p(Integer.valueOf(L0.p.h()), Integer.valueOf(L0.p.g()));
        }
        dVar.g(l02, l1Var, list);
    }

    private final void i() {
        r rVar = this.f37953a;
        if (rVar == null) {
            throw new IllegalStateException("dialog must exist when we call updateProperties");
        }
        Window window = rVar.getWindow();
        if (window == null) {
            throw new IllegalStateException("dialog must have window when we call updateProperties");
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing() || currentActivity.isDestroyed()) {
            return;
        }
        try {
            Window window2 = currentActivity.getWindow();
            if (window2 != null) {
                if ((window2.getAttributes().flags & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                    window.addFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
                } else {
                    window.clearFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
                }
            }
            if (getNavigationBarTranslucent()) {
                WindowUtilKt.enableEdgeToEdge(window);
            } else {
                WindowUtilKt.disableEdgeToEdge(window);
                WindowUtilKt.setStatusBarTranslucency(window, getStatusBarTranslucent());
            }
            if (this.f37954b) {
                window.clearFlags(2);
            } else {
                window.setDimAmount(0.5f);
                window.setFlags(2, 2);
            }
        } catch (IllegalArgumentException e10) {
            AbstractC7283a.o("ReactModalHost", "ReactModalHostView: error while setting window flags: ", e10.getMessage());
        }
    }

    private final void j() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        r rVar = this.f37953a;
        if (rVar == null) {
            throw new IllegalStateException("dialog must exist when we call updateProperties");
        }
        Window window = rVar.getWindow();
        if (window == null) {
            throw new IllegalStateException("dialog must have window when we call updateProperties");
        }
        Window window2 = currentActivity.getWindow();
        if (Build.VERSION.SDK_INT <= 30) {
            window.getDecorView().setSystemUiVisibility(window2.getDecorView().getSystemUiVisibility());
            return;
        }
        l1 l1Var = new l1(window2, window2.getDecorView());
        l1 l1Var2 = new l1(window, window.getDecorView());
        if (WindowUtilKt.isEdgeToEdgeFeatureFlagOn()) {
            l1Var.f(2);
            l1Var2.f(2);
        }
        l1Var2.e(l1Var.c());
        WindowInsets rootWindowInsets = window2.getDecorView().getRootWindowInsets();
        if (rootWindowInsets != null) {
            L0 l0Z = L0.z(rootWindowInsets);
            AbstractC5504s.g(l0Z, "toWindowInsetsCompat(...)");
            h(this, l0Z, l1Var2, null, 4, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addChildrenForAccessibility(ArrayList outChildren) {
        AbstractC5504s.h(outChildren, "outChildren");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        UiThreadUtil.assertOnUiThread();
        this.f37961i.addView(view, i10);
    }

    public final void d() {
        Context context = getContext();
        AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((C3284b0) context).removeLifecycleEventListener(this);
        b();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        AbstractC5504s.h(event, "event");
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(ViewStructure structure) {
        AbstractC5504s.h(structure, "structure");
        this.f37961i.dispatchProvideStructure(structure);
    }

    public final void e() {
        UiThreadUtil.assertOnUiThread();
        if (this.f37962j) {
            b();
        } else if (this.f37953a != null) {
            i();
            return;
        }
        this.f37962j = false;
        String str = this.f37959g;
        int i10 = AbstractC5504s.c(str, "fade") ? AbstractC3251p.f37155e : AbstractC5504s.c(str, "slide") ? AbstractC3251p.f37156f : AbstractC3251p.f37154d;
        Activity currentActivity = getCurrentActivity();
        Context context = currentActivity != null ? currentActivity : getContext();
        AbstractC5504s.e(context);
        final r rVar = new r(context, i10);
        this.f37953a = rVar;
        Window window = rVar.getWindow();
        if (window == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        window.setFlags(8, 8);
        rVar.setContentView(getContentView());
        i();
        rVar.setOnShowListener(this.f37955c);
        InterfaceC5082a interfaceC5082a = new InterfaceC5082a() { // from class: com.facebook.react.views.modal.c
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return d.f(this.f37950a, rVar);
            }
        };
        rVar.getOnBackPressedDispatcher().i(rVar, new e(interfaceC5082a));
        rVar.setOnKeyListener(new DialogInterfaceOnKeyListenerC0627d(interfaceC5082a, this));
        window.setSoftInputMode(16);
        if (this.f37960h) {
            window.addFlags(16777216);
        }
        if (c(currentActivity)) {
            window.setFlags(8192, 8192);
        }
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        rVar.show();
        j();
        window.clearFlags(8);
    }

    public final String getAnimationType() {
        return this.f37959g;
    }

    @Override // android.view.ViewGroup
    public View getChildAt(int i10) {
        return this.f37961i.getChildAt(i10);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return this.f37961i.getChildCount();
    }

    public final r getDialog() {
        return this.f37953a;
    }

    public final EventDispatcher getEventDispatcher() {
        return this.f37961i.getEventDispatcher$ReactAndroid_release();
    }

    public final boolean getHardwareAccelerated() {
        return this.f37960h;
    }

    public final boolean getNavigationBarTranslucent() {
        return this.f37958f || WindowUtilKt.isEdgeToEdgeFeatureFlagOn();
    }

    public final c getOnRequestCloseListener() {
        return this.f37956d;
    }

    public final DialogInterface.OnShowListener getOnShowListener() {
        return this.f37955c;
    }

    public final InterfaceC3282a0 getStateWrapper() {
        return this.f37961i.getStateWrapper$ReactAndroid_release();
    }

    public final boolean getStatusBarTranslucent() {
        return this.f37957e || WindowUtilKt.isEdgeToEdgeFeatureFlagOn();
    }

    public final boolean getTransparent() {
        return this.f37954b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((C3284b0) context).addLifecycleEventListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        d();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        e();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        UiThreadUtil.assertOnUiThread();
        if (view != null) {
            this.f37961i.removeView(view);
        }
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        UiThreadUtil.assertOnUiThread();
        this.f37961i.removeView(getChildAt(i10));
    }

    public final void setAnimationType(String str) {
        this.f37959g = str;
        this.f37962j = true;
    }

    public final void setDialogRootViewGroupTestId(String str) {
        this.f37961i.setTag(AbstractC3247l.f36928v, str);
    }

    public final void setEventDispatcher(EventDispatcher eventDispatcher) {
        this.f37961i.setEventDispatcher$ReactAndroid_release(eventDispatcher);
    }

    public final void setHardwareAccelerated(boolean z10) {
        this.f37960h = z10;
        this.f37962j = true;
    }

    @Override // android.view.View
    public void setId(int i10) {
        super.setId(i10);
        this.f37961i.setId(i10);
    }

    public final void setNavigationBarTranslucent(boolean z10) {
        this.f37958f = z10;
        this.f37962j = this.f37962j || !WindowUtilKt.isEdgeToEdgeFeatureFlagOn();
    }

    public final void setOnRequestCloseListener(c cVar) {
        this.f37956d = cVar;
    }

    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f37955c = onShowListener;
    }

    public final void setStateWrapper(InterfaceC3282a0 interfaceC3282a0) {
        this.f37961i.setStateWrapper$ReactAndroid_release(interfaceC3282a0);
    }

    public final void setStatusBarTranslucent(boolean z10) {
        this.f37957e = z10;
        this.f37962j = this.f37962j || !WindowUtilKt.isEdgeToEdgeFeatureFlagOn();
    }

    public final void setTransparent(boolean z10) {
        this.f37954b = z10;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends g implements W {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private InterfaceC3282a0 f37963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private EventDispatcher f37964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f37965c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f37966d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final C3301q f37967e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private C3300p f37968f;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a extends GuardedRunnable {
            a(C3284b0 c3284b0) {
                super(c3284b0);
            }

            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                UIManagerModule uIManagerModule = (UIManagerModule) b.this.getReactContext().b().getNativeModule(UIManagerModule.class);
                if (uIManagerModule != null) {
                    uIManagerModule.updateNodeSize(b.this.getId(), b.this.f37965c, b.this.f37966d);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(context);
            AbstractC5504s.h(context, "context");
            this.f37967e = new C3301q(this);
            if (ReactFeatureFlags.dispatchPointerEvents) {
                this.f37968f = new C3300p(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C3284b0 getReactContext() {
            Context context = getContext();
            AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
            return (C3284b0) context;
        }

        public final void E(int i10, int i11) {
            B b10 = B.f37368a;
            float fE = b10.e(i10);
            float fE2 = b10.e(i11);
            InterfaceC3282a0 interfaceC3282a0 = this.f37963a;
            if (interfaceC3282a0 == null) {
                if (Y6.a.f22864f) {
                    return;
                }
                getReactContext().runOnNativeModulesQueueThread(new a(getReactContext()));
            } else {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble("screenWidth", fE);
                writableNativeMap.putDouble("screenHeight", fE2);
                interfaceC3282a0.updateState(writableNativeMap);
            }
        }

        @Override // com.facebook.react.uimanager.W
        public void a(View view, MotionEvent ev) {
            AbstractC5504s.h(ev, "ev");
            EventDispatcher eventDispatcher = this.f37964b;
            if (eventDispatcher != null) {
                this.f37967e.h(ev, eventDispatcher, getReactContext());
                C3300p c3300p = this.f37968f;
                if (c3300p != null) {
                    c3300p.p(view, ev, eventDispatcher);
                }
            }
        }

        public final EventDispatcher getEventDispatcher$ReactAndroid_release() {
            return this.f37964b;
        }

        public final InterfaceC3282a0 getStateWrapper$ReactAndroid_release() {
            return this.f37963a;
        }

        @Override // com.facebook.react.uimanager.W
        public void j(View childView, MotionEvent ev) {
            AbstractC5504s.h(childView, "childView");
            AbstractC5504s.h(ev, "ev");
            EventDispatcher eventDispatcher = this.f37964b;
            if (eventDispatcher != null) {
                this.f37967e.f(ev, eventDispatcher);
            }
            C3300p c3300p = this.f37968f;
            if (c3300p != null) {
                c3300p.o();
            }
        }

        @Override // com.facebook.react.views.view.g, android.view.View
        public boolean onHoverEvent(MotionEvent event) {
            C3300p c3300p;
            AbstractC5504s.h(event, "event");
            EventDispatcher eventDispatcher = this.f37964b;
            if (eventDispatcher != null && (c3300p = this.f37968f) != null) {
                c3300p.k(event, eventDispatcher, false);
            }
            return super.onHoverEvent(event);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
            AbstractC5504s.h(info, "info");
            super.onInitializeAccessibilityNodeInfo(info);
            String str = (String) getTag(AbstractC3247l.f36928v);
            if (str != null) {
                info.setViewIdResourceName(str);
            }
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptHoverEvent(MotionEvent event) {
            C3300p c3300p;
            AbstractC5504s.h(event, "event");
            EventDispatcher eventDispatcher = this.f37964b;
            if (eventDispatcher != null && (c3300p = this.f37968f) != null) {
                c3300p.k(event, eventDispatcher, true);
            }
            return super.onHoverEvent(event);
        }

        @Override // com.facebook.react.views.view.g, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent event) {
            AbstractC5504s.h(event, "event");
            EventDispatcher eventDispatcher = this.f37964b;
            if (eventDispatcher != null) {
                this.f37967e.d(event, eventDispatcher, getReactContext());
                C3300p c3300p = this.f37968f;
                if (c3300p != null) {
                    c3300p.k(event, eventDispatcher, true);
                }
            }
            return super.onInterceptTouchEvent(event);
        }

        @Override // com.facebook.react.views.view.g, android.view.View
        protected void onSizeChanged(int i10, int i11, int i12, int i13) {
            super.onSizeChanged(i10, i11, i12, i13);
            this.f37965c = i10;
            this.f37966d = i11;
            E(i10, i11);
        }

        @Override // com.facebook.react.views.view.g, android.view.View
        public boolean onTouchEvent(MotionEvent event) {
            AbstractC5504s.h(event, "event");
            EventDispatcher eventDispatcher = this.f37964b;
            if (eventDispatcher != null) {
                this.f37967e.d(event, eventDispatcher, getReactContext());
                C3300p c3300p = this.f37968f;
                if (c3300p != null) {
                    c3300p.k(event, eventDispatcher, false);
                }
            }
            super.onTouchEvent(event);
            return true;
        }

        public final void setEventDispatcher$ReactAndroid_release(EventDispatcher eventDispatcher) {
            this.f37964b = eventDispatcher;
        }

        public final void setStateWrapper$ReactAndroid_release(InterfaceC3282a0 interfaceC3282a0) {
            this.f37963a = interfaceC3282a0;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public void requestDisallowInterceptTouchEvent(boolean z10) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
