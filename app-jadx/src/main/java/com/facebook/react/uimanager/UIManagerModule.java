package com.facebook.react.uimanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.OnBatchCompleteListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import k7.InterfaceC5454a;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = UIManagerModule.NAME)
@Deprecated(since = "This class is part of Legacy Architecture and will be removed in a future release")
public class UIManagerModule extends ReactContextBaseJavaModule implements OnBatchCompleteListener, LifecycleEventListener, UIManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean DEBUG;
    public static final String NAME = "UIManager";
    public static final String TAG;
    private int mBatchId;
    private final Map<String, Object> mCustomDirectEvents;
    private final EventDispatcher mEventDispatcher;
    private final e mMemoryTrimCallback;
    private final Map<String, Object> mModuleConstants;
    private final e0 mUIImplementation;
    private final CopyOnWriteArrayList<UIManagerListener> mUIManagerListeners;
    private final y0 mViewManagerRegistry;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements d {
        a() {
        }

        @Override // com.facebook.react.uimanager.UIManagerModule.d
        public String a(String str) {
            return UIManagerModule.this.resolveCustomDirectEventName(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends GuardedRunnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f37530a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Object f37531b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ReactContext reactContext, int i10, Object obj) {
            super(reactContext);
            this.f37530a = i10;
            this.f37531b = obj;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            UIManagerModule.this.mUIImplementation.U(this.f37530a, this.f37531b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c extends GuardedRunnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f37533a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f37534b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f37535c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ReactContext reactContext, int i10, int i11, int i12) {
            super(reactContext);
            this.f37533a = i10;
            this.f37534b = i11;
            this.f37535c = i12;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            UIManagerModule.this.mUIImplementation.Y(this.f37533a, this.f37534b, this.f37535c);
            UIManagerModule.this.mUIImplementation.m(-1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface d {
        String a(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class e implements ComponentCallbacks2 {
        /* synthetic */ e(g0 g0Var) {
            this();
        }

        private e() {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
        }
    }

    static {
        W6.b.a("UIManagerModule", W6.a.f20778b);
        TAG = UIManagerModule.class.getSimpleName();
        DEBUG = K5.c.a().c(L5.a.f11312g);
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, z0 z0Var, int i10) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new e();
        this.mUIManagerListeners = new CopyOnWriteArrayList<>();
        this.mBatchId = 0;
        C3289e.i(reactApplicationContext);
        com.facebook.react.uimanager.events.g gVar = new com.facebook.react.uimanager.events.g(reactApplicationContext);
        this.mEventDispatcher = gVar;
        this.mModuleConstants = createConstants(z0Var);
        this.mCustomDirectEvents = h0.f37693c;
        y0 y0Var = new y0(z0Var);
        this.mViewManagerRegistry = y0Var;
        this.mUIImplementation = new e0(reactApplicationContext, y0Var, gVar, i10);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    private static Map<String, Object> createConstants(z0 z0Var) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        U7.b.a(0L, "CreateUIManagerConstants").b("Lazy", Boolean.TRUE).c();
        try {
            return i0.b(z0Var);
        } finally {
            U7.a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    public <T extends View> int addRootView(T t10) {
        return addRootView(t10, null);
    }

    public void addUIBlock(InterfaceC3288d0 interfaceC3288d0) {
        this.mUIImplementation.a(interfaceC3288d0);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void addUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mUIManagerListeners.add(uIManagerListener);
    }

    @ReactMethod
    public void clearJSResponder() {
        this.mUIImplementation.f();
    }

    @ReactMethod
    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.mUIImplementation.g(readableMap, callback);
    }

    @ReactMethod
    public void createView(int i10, String str, int i11, ReadableMap readableMap) {
        if (DEBUG) {
            String str2 = "(UIManager.createView) tag: " + i10 + ", class: " + str + ", props: " + readableMap;
            AbstractC7283a.b("ReactNative", str2);
            K5.c.a().b(L5.a.f11312g, str2);
        }
        this.mUIImplementation.j(i10, str, i11, readableMap);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i10, int i11, ReadableArray readableArray) {
        this.mUIImplementation.k(i10, i11, readableArray);
    }

    @ReactMethod
    public void dispatchViewManagerCommand(int i10, Dynamic dynamic, ReadableArray readableArray) {
        UIManager uIManagerG = f0.g(getReactApplicationContext(), C7.a.a(i10));
        if (uIManagerG == null) {
            return;
        }
        if (dynamic.getType() == ReadableType.Number) {
            uIManagerG.dispatchCommand(i10, dynamic.asInt(), readableArray);
        } else if (dynamic.getType() == ReadableType.String) {
            uIManagerG.dispatchCommand(i10, dynamic.asString(), readableArray);
        }
    }

    @ReactMethod
    public void findSubviewIn(int i10, ReadableArray readableArray, Callback callback) {
        this.mUIImplementation.o(i10, Math.round(B.h(readableArray.getDouble(0))), Math.round(B.h(readableArray.getDouble(1))), callback);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return this.mModuleConstants;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getConstantsForViewManager(String str) {
        ViewManager viewManagerO = this.mUIImplementation.O(str);
        if (viewManagerO == null) {
            return null;
        }
        return getConstantsForViewManager(viewManagerO, this.mCustomDirectEvents);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getDefaultEventTypes() {
        return Arguments.makeNativeMap((Map<String, ? extends Object>) i0.a());
    }

    @Deprecated
    public d getDirectEventNamesResolver() {
        return new a();
    }

    @Override // com.facebook.react.bridge.UIManager
    public EventDispatcher getEventDispatcher() {
        return this.mEventDispatcher;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        return this.mUIImplementation.p();
    }

    @Deprecated
    public e0 getUIImplementation() {
        return this.mUIImplementation;
    }

    @Deprecated
    public y0 getViewManagerRegistry_DO_NOT_USE() {
        return this.mViewManagerRegistry;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        getReactApplicationContext().registerComponentCallbacks(this.mMemoryTrimCallback);
        getReactApplicationContext().registerComponentCallbacks(this.mViewManagerRegistry);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        this.mEventDispatcher.a();
        this.mUIImplementation.B();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.unregisterComponentCallbacks(this.mMemoryTrimCallback);
        reactApplicationContext.unregisterComponentCallbacks(this.mViewManagerRegistry);
        r0.b();
    }

    public void invalidateNodeLayout(int i10) {
        O oN = this.mUIImplementation.N(i10);
        if (oN != null) {
            oN.dirty();
            this.mUIImplementation.m(-1);
        } else {
            AbstractC7283a.I("ReactNative", "Warning : attempted to dirty a non-existent react shadow node. reactTag=" + i10);
        }
    }

    @ReactMethod
    public void manageChildren(int i10, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        if (DEBUG) {
            String str = "(UIManager.manageChildren) tag: " + i10 + ", moveFrom: " + readableArray + ", moveTo: " + readableArray2 + ", addTags: " + readableArray3 + ", atIndices: " + readableArray4 + ", removeFrom: " + readableArray5;
            AbstractC7283a.b("ReactNative", str);
            K5.c.a().b(L5.a.f11312g, str);
        }
        this.mUIImplementation.u(i10, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
    }

    @ReactMethod
    public void measure(int i10, Callback callback) {
        this.mUIImplementation.v(i10, callback);
    }

    @ReactMethod
    public void measureInWindow(int i10, Callback callback) {
        this.mUIImplementation.w(i10, callback);
    }

    @ReactMethod
    public void measureLayout(int i10, int i11, Callback callback, Callback callback2) {
        this.mUIImplementation.x(i10, i11, callback, callback2);
    }

    @Override // com.facebook.react.bridge.OnBatchCompleteListener
    public void onBatchComplete() {
        int i10 = this.mBatchId;
        this.mBatchId = i10 + 1;
        U7.b.a(0L, "onBatchCompleteUI").a("BatchId", i10).c();
        Iterator<UIManagerListener> it = this.mUIManagerListeners.iterator();
        while (it.hasNext()) {
            it.next().willDispatchViewUpdates(this);
        }
        try {
            if (this.mUIImplementation.q() > 0) {
                this.mUIImplementation.m(i10);
            }
        } finally {
            U7.a.i(0L);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        this.mUIImplementation.C();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mUIImplementation.D();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mUIImplementation.E();
    }

    public void prependUIBlock(InterfaceC3288d0 interfaceC3288d0) {
        this.mUIImplementation.F(interfaceC3288d0);
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
        this.mUIImplementation.G();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i10, String str, WritableMap writableMap) {
        receiveEvent(-1, i10, str, writableMap);
    }

    @ReactMethod
    public void removeRootView(int i10) {
        this.mUIImplementation.J(i10);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void removeUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mUIManagerListeners.remove(uIManagerListener);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public String resolveCustomDirectEventName(String str) {
        Map map;
        return (str == null || (map = (Map) this.mCustomDirectEvents.get(str)) == null) ? str : (String) map.get("registrationName");
    }

    @Deprecated
    public int resolveRootTagFromReactTag(int i10) {
        return C7.a.d(i10) ? i10 : this.mUIImplementation.M(i10);
    }

    @Override // com.facebook.react.bridge.UIManager, com.facebook.react.fabric.interop.UIBlockViewResolver
    public View resolveView(int i10) {
        UiThreadUtil.assertOnUiThread();
        return this.mUIImplementation.r().S().u(i10);
    }

    @Override // com.facebook.react.bridge.UIManager
    @ReactMethod
    public void sendAccessibilityEvent(int i10, int i11) {
        int iA = C7.a.a(i10);
        if (iA != 2) {
            this.mUIImplementation.P(i10, i11);
            return;
        }
        UIManager uIManagerG = f0.g(getReactApplicationContext(), iA);
        if (uIManagerG != null) {
            uIManagerG.sendAccessibilityEvent(i10, i11);
        }
    }

    @ReactMethod
    public void setChildren(int i10, ReadableArray readableArray) {
        if (DEBUG) {
            String str = "(UIManager.setChildren) tag: " + i10 + ", children: " + readableArray;
            AbstractC7283a.b("ReactNative", str);
            K5.c.a().b(L5.a.f11312g, str);
        }
        this.mUIImplementation.Q(i10, readableArray);
    }

    @ReactMethod
    public void setJSResponder(int i10, boolean z10) {
        this.mUIImplementation.R(i10, z10);
    }

    @ReactMethod
    public void setLayoutAnimationEnabledExperimental(boolean z10) {
        this.mUIImplementation.S(z10);
    }

    public void setViewHierarchyUpdateDebugListener(D7.a aVar) {
        this.mUIImplementation.T(aVar);
    }

    public void setViewLocalData(int i10, Object obj) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.assertOnUiQueueThread();
        reactApplicationContext.runOnNativeModulesQueueThread(new b(reactApplicationContext, i10, obj));
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int startSurface(T t10, String str, WritableMap writableMap, int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void stopSurface(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void synchronouslyUpdateViewOnUIThread(int i10, ReadableMap readableMap) {
        this.mUIImplementation.V(i10, new Q(readableMap));
    }

    public void updateInsetsPadding(int i10, int i11, int i12, int i13, int i14) {
        getReactApplicationContext().assertOnNativeModulesQueueThread();
        this.mUIImplementation.W(i10, i11, i12, i13, i14);
    }

    public void updateNodeSize(int i10, int i11, int i12) {
        getReactApplicationContext().assertOnNativeModulesQueueThread();
        this.mUIImplementation.X(i10, i11, i12);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(int i10, int i11, int i12, int i13, int i14) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.runOnNativeModulesQueueThread(new c(reactApplicationContext, i10, i11, i12));
    }

    @ReactMethod
    public void updateView(int i10, String str, ReadableMap readableMap) {
        if (DEBUG) {
            String str2 = "(UIManager.updateView) tag: " + i10 + ", class: " + str + ", props: " + readableMap;
            AbstractC7283a.b("ReactNative", str2);
            K5.c.a().b(L5.a.f11312g, str2);
        }
        this.mUIImplementation.a0(i10, str, readableMap);
    }

    @ReactMethod
    @Deprecated
    public void viewIsDescendantOf(int i10, int i11, Callback callback) {
        this.mUIImplementation.c0(i10, i11, callback);
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int addRootView(T t10, WritableMap writableMap) {
        U7.a.c(0L, "UIManagerModule.addRootView");
        int iA = N.a();
        this.mUIImplementation.H(t10, iA, new C3284b0(getReactApplicationContext(), t10.getContext(), ((M) t10).getSurfaceID(), -1));
        U7.a.i(0L);
        return iA;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void dispatchCommand(int i10, String str, ReadableArray readableArray) {
        this.mUIImplementation.l(i10, str, readableArray);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i10, int i11, String str, WritableMap writableMap) {
        ((RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class)).receiveEvent(i11, str, writableMap);
    }

    public static WritableMap getConstantsForViewManager(ViewManager viewManager, Map<String, Object> map) {
        U7.b.a(0L, "UIManagerModule.getConstantsForViewManager").b("ViewManager", viewManager.getName()).b("Lazy", Boolean.TRUE).c();
        try {
            Map mapD = i0.d(viewManager, null, null, null, map);
            if (mapD != null) {
                return Arguments.makeNativeMap((Map<String, ? extends Object>) mapD);
            }
            return null;
        } finally {
            U7.b.b(0L).c();
        }
    }

    public static Map<String, Object> createConstants(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        U7.b.a(0L, "CreateUIManagerConstants").b("Lazy", Boolean.FALSE).c();
        try {
            return i0.c(list, map, map2);
        } finally {
            U7.a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i10) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new e();
        this.mUIManagerListeners = new CopyOnWriteArrayList<>();
        this.mBatchId = 0;
        C3289e.i(reactApplicationContext);
        com.facebook.react.uimanager.events.g gVar = new com.facebook.react.uimanager.events.g(reactApplicationContext);
        this.mEventDispatcher = gVar;
        HashMap mapB = U6.c.b();
        this.mCustomDirectEvents = mapB;
        this.mModuleConstants = createConstants(list, null, mapB);
        y0 y0Var = new y0(list);
        this.mViewManagerRegistry = y0Var;
        this.mUIImplementation = new e0(reactApplicationContext, y0Var, gVar, i10);
        if (Y6.a.f22860b) {
            for (ViewManager viewManager : list) {
                F7.a.a(reactApplicationContext, viewManager.getShadowNodeClass(), viewManager.getClass().getSimpleName());
            }
        }
        reactApplicationContext.addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void markActiveTouchForTag(int i10, int i11) {
    }

    @Override // com.facebook.react.bridge.UIManager
    public void sweepActiveTouchForTag(int i10, int i11) {
    }
}
