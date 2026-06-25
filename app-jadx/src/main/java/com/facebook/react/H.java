package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC2747a0;
import c7.f;
import com.facebook.react.T;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BridgeReactContext;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactCxxErrorHandler;
import com.facebook.react.bridge.ReactInstanceManagerInspectorTarget;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.InspectorFlags;
import com.facebook.react.devsupport.InterfaceC3213b0;
import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import com.facebook.react.devsupport.u0;
import com.facebook.react.internal.turbomodule.core.TurboModuleManager;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.C3289e;
import com.facebook.react.uimanager.f0;
import com.facebook.soloader.SoLoader;
import g7.C4858a;
import g7.InterfaceC4859b;
import h7.C4921i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import q7.InterfaceC6143a;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class H {

    /* JADX INFO: renamed from: C */
    private static final String f36346C;

    /* JADX INFO: renamed from: b */
    private volatile LifecycleState f36350b;

    /* JADX INFO: renamed from: c */
    private e f36351c;

    /* JADX INFO: renamed from: d */
    private volatile Thread f36352d;

    /* JADX INFO: renamed from: e */
    private final JavaScriptExecutorFactory f36353e;

    /* JADX INFO: renamed from: g */
    private final String f36355g;

    /* JADX INFO: renamed from: h */
    private final List f36356h;

    /* JADX INFO: renamed from: i */
    private final c7.f f36357i;

    /* JADX INFO: renamed from: j */
    private final boolean f36358j;

    /* JADX INFO: renamed from: k */
    private final boolean f36359k;

    /* JADX INFO: renamed from: l */
    private final boolean f36360l;

    /* JADX INFO: renamed from: m */
    private final NotThreadSafeBridgeIdleDebugListener f36361m;
    private final JSBundleLoader mBundleLoader;

    /* JADX INFO: renamed from: o */
    private volatile ReactContext f36363o;

    /* JADX INFO: renamed from: p */
    private final Context f36364p;

    /* JADX INFO: renamed from: q */
    private InterfaceC6143a f36365q;

    /* JADX INFO: renamed from: r */
    private Activity f36366r;

    /* JADX INFO: renamed from: s */
    private ReactInstanceManagerInspectorTarget f36367s;

    /* JADX INFO: renamed from: w */
    private final ComponentCallbacks2C3243h f36371w;

    /* JADX INFO: renamed from: x */
    private final JSExceptionHandler f36372x;

    /* JADX INFO: renamed from: y */
    private final UIManagerProvider f36373y;

    /* JADX INFO: renamed from: z */
    private final T.a f36374z;

    /* JADX INFO: renamed from: a */
    private final Set f36349a = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: f */
    private Collection f36354f = null;

    /* JADX INFO: renamed from: n */
    private final Object f36362n = new Object();

    /* JADX INFO: renamed from: t */
    private final Collection f36368t = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: u */
    private volatile boolean f36369u = false;

    /* JADX INFO: renamed from: v */
    private volatile Boolean f36370v = Boolean.FALSE;

    /* JADX INFO: renamed from: A */
    private boolean f36347A = true;

    /* JADX INFO: renamed from: B */
    private volatile boolean f36348B = false;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements c7.h {
        b() {
        }

        public /* synthetic */ void c(boolean z10) {
            if (H.this.f36348B) {
                return;
            }
            if (z10) {
                H.this.f36357i.B();
            } else if (!H.this.f36357i.E() || H.this.f36347A) {
                H.this.i0();
            } else {
                H.this.a0();
            }
        }

        @Override // c7.h
        public void a(final boolean z10) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.I
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36385a.c(z10);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class d implements ReactInstanceManagerInspectorTarget.TargetDelegate {

        /* JADX INFO: renamed from: a */
        private WeakReference f36379a;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements f.a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ H f36380a;

            a(H h10) {
                this.f36380a = h10;
            }

            @Override // c7.f.a
            public void onResume() {
                UiThreadUtil.assertOnUiThread();
                if (this.f36380a.f36367s != null) {
                    this.f36380a.f36367s.sendDebuggerResumeCommand();
                }
            }
        }

        public d(H h10) {
            this.f36379a = new WeakReference(h10);
        }

        public /* synthetic */ void b() {
            H h10 = (H) this.f36379a.get();
            if (h10 != null) {
                h10.f36357i.B();
            }
        }

        @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
        public Map getMetadata() {
            H h10 = (H) this.f36379a.get();
            return com.facebook.react.modules.systeminfo.a.f(h10 != null ? h10.f36364p : null);
        }

        @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
        public void loadNetworkResource(String str, InspectorNetworkRequestListener inspectorNetworkRequestListener) {
            b7.f.a(str, inspectorNetworkRequestListener);
        }

        @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
        public void onReload() {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.J
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36387a.b();
                }
            });
        }

        @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
        public void onSetPausedInDebuggerMessage(String str) {
            H h10 = (H) this.f36379a.get();
            if (h10 == null) {
                return;
            }
            if (str == null) {
                h10.f36357i.f();
            } else {
                h10.f36357i.h(str, new a(h10));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class e {

        /* JADX INFO: renamed from: a */
        private final JavaScriptExecutorFactory f36382a;

        /* JADX INFO: renamed from: b */
        private final JSBundleLoader f36383b;

        public e(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
            this.f36382a = (JavaScriptExecutorFactory) Q6.a.c(javaScriptExecutorFactory);
            this.f36383b = (JSBundleLoader) Q6.a.c(jSBundleLoader);
        }

        public JSBundleLoader a() {
            return this.f36383b;
        }

        public JavaScriptExecutorFactory b() {
            return this.f36382a;
        }
    }

    static {
        W6.b.a("ReactInstanceManager", W6.a.f20777a);
        f36346C = H.class.getSimpleName();
    }

    H(Context context, Activity activity, InterfaceC6143a interfaceC6143a, JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader, String str, List list, boolean z10, InterfaceC3213b0 interfaceC3213b0, boolean z11, boolean z12, NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener, LifecycleState lifecycleState, JSExceptionHandler jSExceptionHandler, c7.j jVar, boolean z13, c7.c cVar, int i10, int i11, UIManagerProvider uIManagerProvider, Map map, T.a aVar, U6.h hVar, c7.d dVar, InterfaceC4859b interfaceC4859b, c7.i iVar) {
        AbstractC7283a.b(f36346C, "ReactInstanceManager.ctor()");
        H(context);
        C3289e.i(context);
        this.f36364p = context;
        this.f36366r = activity;
        this.f36365q = interfaceC6143a;
        this.f36353e = javaScriptExecutorFactory;
        this.mBundleLoader = jSBundleLoader;
        this.f36355g = str;
        ArrayList arrayList = new ArrayList();
        this.f36356h = arrayList;
        this.f36358j = z10;
        this.f36359k = z11;
        this.f36360l = z12;
        U7.a.c(0L, "ReactInstanceManager.initDevSupportManager");
        c7.f fVarB = interfaceC3213b0.b(context, w(), str, z10, jVar, cVar, i10, map, hVar, dVar, iVar);
        this.f36357i = fVarB;
        U7.a.i(0L);
        this.f36361m = notThreadSafeBridgeIdleDebugListener;
        this.f36350b = lifecycleState;
        this.f36371w = new ComponentCallbacks2C3243h(context);
        this.f36372x = jSExceptionHandler;
        this.f36374z = aVar;
        synchronized (arrayList) {
            try {
                K5.c.a().b(L5.a.f11309d, "RNCore: Use Split Packages");
                if (z10) {
                    arrayList.add(new C3240e());
                }
                arrayList.addAll(list);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f36373y = uIManagerProvider;
        com.facebook.react.modules.core.b.i(interfaceC4859b != null ? interfaceC4859b : C4858a.b());
        if (z10) {
            fVarB.y();
        }
        k0();
        throw new UnsupportedOperationException("ReactInstanceManager.createReactContext is unsupported.");
    }

    private void A(com.facebook.react.uimanager.M m10, ReactContext reactContext) {
        AbstractC7283a.b("ReactNative", "ReactInstanceManager.detachRootViewFromInstance()");
        UiThreadUtil.assertOnUiThread();
        if (m10.getState().compareAndSet(1, 0)) {
            int uIManagerType = m10.getUIManagerType();
            if (uIManagerType != 2) {
                ((AppRegistry) reactContext.getCatalystInstance().getJSModule(AppRegistry.class)).unmountApplicationComponentAtRootTag(m10.getRootViewTag());
                return;
            }
            int rootViewTag = m10.getRootViewTag();
            if (rootViewTag != -1) {
                UIManager uIManagerG = f0.g(reactContext, uIManagerType);
                if (uIManagerG != null) {
                    uIManagerG.stopSurface(rootViewTag);
                } else {
                    AbstractC7283a.I("ReactNative", "Failed to stop surface, UIManager has already gone away");
                }
            } else {
                ReactSoftExceptionLogger.logSoftException(f36346C, new RuntimeException("detachRootViewFromInstance called with ReactRootView with invalid id"));
            }
            v(m10);
        }
    }

    public JavaScriptExecutorFactory D() {
        return this.f36353e;
    }

    private ReactInstanceManagerInspectorTarget F() {
        if (this.f36367s == null && InspectorFlags.getFuseboxEnabled()) {
            this.f36367s = new ReactInstanceManagerInspectorTarget(new d(this));
        }
        return this.f36367s;
    }

    static void H(Context context) {
        SoLoader.m(context, false);
    }

    private void I() {
        UiThreadUtil.assertOnUiThread();
        InterfaceC6143a interfaceC6143a = this.f36365q;
        if (interfaceC6143a != null) {
            interfaceC6143a.a();
        }
    }

    public /* synthetic */ void J() {
        e eVar = this.f36351c;
        if (eVar != null) {
            m0(eVar);
            this.f36351c = null;
        }
    }

    public /* synthetic */ void K(ReactApplicationContext reactApplicationContext) {
        try {
            n0(reactApplicationContext);
        } catch (Exception e10) {
            this.f36357i.handleException(e10);
        }
    }

    public /* synthetic */ void L(e eVar) {
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_END);
        synchronized (this.f36370v) {
            while (this.f36370v.booleanValue()) {
                try {
                    this.f36370v.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        this.f36369u = true;
        try {
            Process.setThreadPriority(-4);
            ReactMarker.logMarker(ReactMarkerConstants.VM_INIT);
            final ReactApplicationContext reactApplicationContextX = x(eVar.b().create(), eVar.a());
            try {
                this.f36352d = null;
                ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_START);
                Runnable runnable = new Runnable() { // from class: com.facebook.react.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f36340a.J();
                    }
                };
                reactApplicationContextX.runOnNativeModulesQueueThread(new Runnable() { // from class: com.facebook.react.D
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f36341a.K(reactApplicationContextX);
                    }
                });
                UiThreadUtil.runOnUiThread(runnable);
            } catch (Exception e10) {
                this.f36357i.handleException(e10);
            }
        } catch (Exception e11) {
            this.f36369u = false;
            this.f36352d = null;
            this.f36357i.handleException(e11);
        }
    }

    public /* synthetic */ void M(z[] zVarArr, ReactApplicationContext reactApplicationContext) {
        N();
        for (z zVar : zVarArr) {
            if (zVar != null) {
                zVar.a(reactApplicationContext);
            }
        }
    }

    private synchronized void N() {
        if (this.f36350b == LifecycleState.f36552c) {
            Q(true);
        }
    }

    private synchronized void O() {
        try {
            ReactContext reactContextB = B();
            if (reactContextB != null) {
                if (this.f36350b == LifecycleState.f36552c) {
                    reactContextB.onHostPause();
                    this.f36350b = LifecycleState.f36551b;
                }
                if (this.f36350b == LifecycleState.f36551b) {
                    reactContextB.onHostDestroy(this.f36360l);
                }
            }
            this.f36350b = LifecycleState.f36550a;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void P() {
        try {
            ReactContext reactContextB = B();
            if (reactContextB != null) {
                if (this.f36350b == LifecycleState.f36550a) {
                    reactContextB.onHostResume(this.f36366r);
                    reactContextB.onHostPause();
                } else if (this.f36350b == LifecycleState.f36552c) {
                    reactContextB.onHostPause();
                }
            }
            this.f36350b = LifecycleState.f36551b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void Q(boolean z10) {
        try {
            ReactContext reactContextB = B();
            if (reactContextB != null && (z10 || this.f36350b == LifecycleState.f36551b || this.f36350b == LifecycleState.f36550a)) {
                reactContextB.onHostResume(this.f36366r);
            }
            this.f36350b = LifecycleState.f36552c;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void a0() {
        AbstractC7283a.b("ReactNative", "ReactInstanceManager.onJSBundleLoadedFromServer()");
        h0(this.f36353e, JSBundleLoader.createCachedBundleFromNetworkLoader(this.f36357i.u(), this.f36357i.j()));
    }

    public static /* synthetic */ void e(int i10, com.facebook.react.uimanager.M m10) {
        U7.a.g(0L, "pre_rootView.onAttachedToReactInstance", i10);
        m10.b(101);
    }

    private void e0(O o10, C3244i c3244i) {
        U7.b.a(0L, "processPackage").b("className", o10.getClass().getSimpleName()).c();
        c3244i.b(o10);
        U7.b.b(0L).c();
    }

    private NativeModuleRegistry f0(ReactApplicationContext reactApplicationContext, List list) {
        C3244i c3244i = new C3244i(reactApplicationContext);
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_START);
        synchronized (this.f36356h) {
            try {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        O o10 = (O) it.next();
                        U7.a.c(0L, "createAndProcessCustomReactPackage");
                        try {
                            e0(o10, c3244i);
                            U7.a.i(0L);
                        } catch (Throwable th2) {
                            U7.a.i(0L);
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_END);
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_START);
        U7.a.c(0L, "buildNativeModuleRegistry");
        try {
            return c3244i.a();
        } finally {
            U7.a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END);
        }
    }

    public static /* synthetic */ void g() {
        Process.setThreadPriority(0);
        ReactMarker.logMarker(ReactMarkerConstants.CHANGE_THREAD_PRIORITY, "js_default");
    }

    private void h0(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
        AbstractC7283a.b("ReactNative", "ReactInstanceManager.recreateReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        e eVar = new e(javaScriptExecutorFactory, jSBundleLoader);
        if (this.f36352d == null) {
            m0(eVar);
        } else {
            this.f36351c = eVar;
        }
    }

    public void i0() {
        AbstractC7283a.b(f36346C, "ReactInstanceManager.recreateReactContextInBackgroundFromBundleLoader()");
        K5.c.a().b(L5.a.f11309d, "RNCore: load from BundleLoader");
        h0(this.f36353e, this.mBundleLoader);
    }

    private void j0() {
        AbstractC7283a.b(f36346C, "ReactInstanceManager.recreateReactContextInBackgroundInner()");
        K5.c.a().b(L5.a.f11309d, "RNCore: recreateReactContextInBackground");
        UiThreadUtil.assertOnUiThread();
        if (this.f36358j && this.f36355g != null) {
            this.f36357i.D();
            if (!U7.a.j(0L)) {
                if (this.mBundleLoader == null) {
                    this.f36357i.B();
                    return;
                } else {
                    this.f36357i.n(new b());
                    return;
                }
            }
        }
        i0();
    }

    private void k0() {
        Method method;
        if (Y6.a.f22864f) {
            return;
        }
        try {
            method = H.class.getMethod("G", Exception.class);
        } catch (NoSuchMethodException e10) {
            AbstractC7283a.n("ReactInstanceHolder", "Failed to set cxx error handler function", e10);
            method = null;
        }
        ReactCxxErrorHandler.setHandleErrorFunc(this, method);
    }

    private void m0(final e eVar) {
        AbstractC7283a.b("ReactNative", "ReactInstanceManager.runCreateReactContextOnNewThread()");
        UiThreadUtil.assertOnUiThread();
        Q6.a.b(!this.f36348B, "Cannot create a new React context on an invalidated ReactInstanceManager");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGE_LOADING_START);
        synchronized (this.f36349a) {
            synchronized (this.f36362n) {
                try {
                    if (this.f36363o != null) {
                        p0(this.f36363o);
                        this.f36363o = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f36352d = new Thread(null, new Runnable() { // from class: com.facebook.react.B
            @Override // java.lang.Runnable
            public final void run() {
                this.f36338a.L(eVar);
            }
        }, "create_react_context");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_START);
        this.f36352d.start();
    }

    private void n0(final ReactApplicationContext reactApplicationContext) {
        AbstractC7283a.b("ReactNative", "ReactInstanceManager.setupReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_START);
        U7.a.c(0L, "setupReactContext");
        synchronized (this.f36349a) {
            try {
                synchronized (this.f36362n) {
                    this.f36363o = (ReactContext) Q6.a.c(reactApplicationContext);
                }
                CatalystInstance catalystInstance = (CatalystInstance) Q6.a.c(reactApplicationContext.getCatalystInstance());
                catalystInstance.initialize();
                this.f36357i.A(reactApplicationContext);
                this.f36371w.a(catalystInstance);
                ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_START);
                Iterator it = this.f36349a.iterator();
                while (it.hasNext()) {
                    t((com.facebook.react.uimanager.M) it.next());
                }
                ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_END);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        final z[] zVarArr = (z[]) this.f36368t.toArray(new z[this.f36368t.size()]);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.E
            @Override // java.lang.Runnable
            public final void run() {
                this.f36343a.M(zVarArr, reactApplicationContext);
            }
        });
        reactApplicationContext.runOnJSQueueThread(new Runnable() { // from class: com.facebook.react.F
            @Override // java.lang.Runnable
            public final void run() {
                H.g();
            }
        });
        reactApplicationContext.runOnNativeModulesQueueThread(new Runnable() { // from class: com.facebook.react.G
            @Override // java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(0);
            }
        });
        U7.a.i(0L);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGE_LOADING_END);
    }

    private void p0(ReactContext reactContext) {
        AbstractC7283a.b("ReactNative", "ReactInstanceManager.tearDownReactContext()");
        UiThreadUtil.assertOnUiThread();
        if (this.f36350b == LifecycleState.f36552c) {
            reactContext.onHostPause();
        }
        synchronized (this.f36349a) {
            try {
                Iterator it = this.f36349a.iterator();
                while (it.hasNext()) {
                    A((com.facebook.react.uimanager.M) it.next(), reactContext);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f36371w.d(reactContext.getCatalystInstance());
        reactContext.destroy();
        this.f36357i.H(reactContext);
    }

    public void q0() {
        ReactContext reactContextB = B();
        if (reactContextB == null || !reactContextB.hasActiveReactInstance()) {
            ReactSoftExceptionLogger.logSoftException(f36346C, new ReactNoCrashSoftException("Cannot toggleElementInspector, CatalystInstance not available"));
        } else {
            reactContextB.emitDeviceEvent("toggleElementInspector");
        }
    }

    private void t(final com.facebook.react.uimanager.M m10) {
        final int iAddRootView;
        AbstractC7283a.b("ReactNative", "ReactInstanceManager.attachRootViewToInstance()");
        if (m10.getState().compareAndSet(0, 1)) {
            U7.a.c(0L, "attachRootViewToInstance");
            UIManager uIManagerG = f0.g(this.f36363o, m10.getUIManagerType());
            if (uIManagerG == null) {
                throw new IllegalStateException("Unable to attach a rootView to ReactInstance when UIManager is not properly initialized.");
            }
            Bundle appProperties = m10.getAppProperties();
            if (m10.getUIManagerType() == 2) {
                iAddRootView = uIManagerG.startSurface(m10.getRootViewGroup(), m10.getJSModuleName(), appProperties == null ? new WritableNativeMap() : Arguments.fromBundle(appProperties), m10.getWidthMeasureSpec(), m10.getHeightMeasureSpec());
                m10.setShouldLogContentAppeared(true);
            } else {
                iAddRootView = uIManagerG.addRootView(m10.getRootViewGroup(), appProperties == null ? new WritableNativeMap() : Arguments.fromBundle(appProperties));
                m10.setRootViewTag(iAddRootView);
                m10.c();
            }
            U7.a.a(0L, "pre_rootView.onAttachedToReactInstance", iAddRootView);
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.A
                @Override // java.lang.Runnable
                public final void run() {
                    H.e(iAddRootView, m10);
                }
            });
            U7.a.i(0L);
        }
    }

    public static K u() {
        return new K();
    }

    private void v(com.facebook.react.uimanager.M m10) {
        UiThreadUtil.assertOnUiThread();
        m10.getState().compareAndSet(1, 0);
        ViewGroup rootViewGroup = m10.getRootViewGroup();
        rootViewGroup.removeAllViews();
        rootViewGroup.setId(-1);
    }

    private u0 w() {
        return new a();
    }

    private ReactApplicationContext x(JavaScriptExecutor javaScriptExecutor, JSBundleLoader jSBundleLoader) {
        UIManager uIManagerCreateUIManager;
        T.a aVar;
        AbstractC7283a.b("ReactNative", "ReactInstanceManager.createReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_REACT_CONTEXT_START, javaScriptExecutor.getName());
        BridgeReactContext bridgeReactContext = new BridgeReactContext(this.f36364p);
        JSExceptionHandler jSExceptionHandler = this.f36372x;
        if (jSExceptionHandler == null) {
            jSExceptionHandler = this.f36357i;
        }
        bridgeReactContext.setJSExceptionHandler(jSExceptionHandler);
        CatalystInstanceImpl.Builder inspectorTarget = new CatalystInstanceImpl.Builder().setReactQueueConfigurationSpec(ReactQueueConfigurationSpec.createDefault()).setJSExecutor(javaScriptExecutor).setRegistry(f0(bridgeReactContext, this.f36356h)).setJSBundleLoader(jSBundleLoader).setJSExceptionHandler(jSExceptionHandler).setInspectorTarget(F());
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START);
        U7.a.c(0L, "createCatalystInstance");
        try {
            CatalystInstanceImpl catalystInstanceImplBuild = inspectorTarget.build();
            U7.a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            bridgeReactContext.initializeWithInstance(catalystInstanceImplBuild);
            catalystInstanceImplBuild.getRuntimeScheduler();
            if (C4921i.e() && (aVar = this.f36374z) != null) {
                TurboModuleManager turboModuleManager = new TurboModuleManager(catalystInstanceImplBuild.getRuntimeExecutor(), aVar.c(this.f36356h).d(bridgeReactContext).a(), catalystInstanceImplBuild.getJSCallInvokerHolder(), catalystInstanceImplBuild.getNativeMethodCallInvokerHolder());
                catalystInstanceImplBuild.setTurboModuleRegistry(turboModuleManager);
                Iterator<String> it = turboModuleManager.getEagerInitModuleNames().iterator();
                while (it.hasNext()) {
                    turboModuleManager.getModule(it.next());
                }
            }
            UIManagerProvider uIManagerProvider = this.f36373y;
            if (uIManagerProvider != null && (uIManagerCreateUIManager = uIManagerProvider.createUIManager(bridgeReactContext)) != null) {
                catalystInstanceImplBuild.setFabricUIManager(uIManagerCreateUIManager);
                uIManagerCreateUIManager.initialize();
                catalystInstanceImplBuild.setFabricUIManager(uIManagerCreateUIManager);
            }
            NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = this.f36361m;
            if (notThreadSafeBridgeIdleDebugListener != null) {
                catalystInstanceImplBuild.addBridgeIdleDebugListener(notThreadSafeBridgeIdleDebugListener);
            }
            if (U7.a.j(0L)) {
                catalystInstanceImplBuild.setGlobalVariable("__RCTProfileIsProfiling", com.amazon.a.a.o.b.f34640af);
            }
            ReactMarker.logMarker(ReactMarkerConstants.PRE_RUN_JS_BUNDLE_START);
            U7.a.c(0L, "runJSBundle");
            catalystInstanceImplBuild.runJSBundle();
            U7.a.i(0L);
            return bridgeReactContext;
        } catch (Throwable th2) {
            U7.a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            throw th2;
        }
    }

    public ReactContext B() {
        ReactContext reactContext;
        synchronized (this.f36362n) {
            reactContext = this.f36363o;
        }
        return reactContext;
    }

    public c7.f C() {
        return this.f36357i;
    }

    public LifecycleState E() {
        return this.f36350b;
    }

    public void G(Exception exc) {
        this.f36357i.handleException(exc);
    }

    public void R(Activity activity, int i10, int i11, Intent intent) {
        ReactContext reactContextB = B();
        if (reactContextB != null) {
            reactContextB.onActivityResult(activity, i10, i11, intent);
        }
    }

    public void S() {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContext = this.f36363o;
        if (reactContext == null) {
            AbstractC7283a.I(f36346C, "Instance detached from instance manager");
            I();
        } else {
            DeviceEventManagerModule deviceEventManagerModule = (DeviceEventManagerModule) reactContext.getNativeModule(DeviceEventManagerModule.class);
            if (deviceEventManagerModule != null) {
                deviceEventManagerModule.emitHardwareBackPressed();
            }
        }
    }

    public void T(Context context, Configuration configuration) {
        AppearanceModule appearanceModule;
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContextB = B();
        if (reactContextB == null || (appearanceModule = (AppearanceModule) reactContextB.getNativeModule(AppearanceModule.class)) == null) {
            return;
        }
        appearanceModule.onConfigurationChanged(context);
    }

    public void U() {
        UiThreadUtil.assertOnUiThread();
        if (this.f36358j) {
            this.f36357i.s(false);
        }
        O();
        if (this.f36360l) {
            return;
        }
        this.f36366r = null;
    }

    public void V(Activity activity) {
        if (activity == this.f36366r) {
            U();
        }
    }

    public void W() {
        UiThreadUtil.assertOnUiThread();
        this.f36365q = null;
        if (this.f36358j) {
            this.f36357i.s(false);
        }
        P();
    }

    public void X(Activity activity) {
        if (this.f36359k) {
            if (this.f36366r == null) {
                AbstractC7283a.m(f36346C, "ReactInstanceManager.onHostPause called with null activity");
                for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                    AbstractC7283a.m(f36346C, stackTraceElement.toString());
                }
            }
            Q6.a.a(this.f36366r != null);
        }
        Activity activity2 = this.f36366r;
        if (activity2 != null) {
            Q6.a.b(activity == activity2, "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + this.f36366r.getClass().getSimpleName() + " Paused activity: " + activity.getClass().getSimpleName());
        }
        W();
    }

    public void Y(Activity activity) {
        UiThreadUtil.assertOnUiThread();
        this.f36366r = activity;
        if (this.f36358j) {
            if (activity != null) {
                View decorView = activity.getWindow().getDecorView();
                if (AbstractC2747a0.P(decorView)) {
                    this.f36357i.s(true);
                } else {
                    decorView.addOnAttachStateChangeListener(new c(decorView));
                }
            } else if (!this.f36359k) {
                this.f36357i.s(true);
            }
        }
        Q(false);
    }

    public void Z(Activity activity, InterfaceC6143a interfaceC6143a) {
        UiThreadUtil.assertOnUiThread();
        this.f36365q = interfaceC6143a;
        Y(activity);
    }

    public void b0(Intent intent) {
        DeviceEventManagerModule deviceEventManagerModule;
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContextB = B();
        if (reactContextB == null) {
            AbstractC7283a.I(f36346C, "Instance detached from instance manager");
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if (data != null && (("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action)) && (deviceEventManagerModule = (DeviceEventManagerModule) reactContextB.getNativeModule(DeviceEventManagerModule.class)) != null)) {
            deviceEventManagerModule.emitNewIntentReceived(data);
        }
        reactContextB.onNewIntent(this.f36366r, intent);
    }

    public void c0(Activity activity) {
        Activity activity2 = this.f36366r;
        if (activity2 == null || activity != activity2) {
            return;
        }
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContextB = B();
        if (reactContextB != null) {
            reactContextB.onUserLeaveHint(activity);
        }
    }

    public void d0(boolean z10) {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContextB = B();
        if (reactContextB != null) {
            reactContextB.onWindowFocusChange(z10);
        }
    }

    public void g0() {
        Q6.a.b(this.f36369u, "recreateReactContextInBackground should only be called after the initial createReactContextInBackground call.");
        j0();
    }

    public void l0(z zVar) {
        this.f36368t.remove(zVar);
    }

    public void o0() {
        UiThreadUtil.assertOnUiThread();
        this.f36357i.F();
    }

    public void r(z zVar) {
        this.f36368t.add(zVar);
    }

    public void s(com.facebook.react.uimanager.M m10) {
        UiThreadUtil.assertOnUiThread();
        synchronized (this.f36349a) {
            try {
                if (this.f36349a.add(m10)) {
                    v(m10);
                } else {
                    AbstractC7283a.m("ReactNative", "ReactRoot was attached multiple times");
                }
                ReactContext reactContextB = B();
                if (this.f36352d == null && reactContextB != null) {
                    t(m10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void y() {
        AbstractC7283a.b(f36346C, "ReactInstanceManager.createReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        if (this.f36369u) {
            return;
        }
        this.f36369u = true;
        j0();
    }

    public void z(com.facebook.react.uimanager.M m10) {
        ReactContext reactContext;
        UiThreadUtil.assertOnUiThread();
        if (this.f36349a.remove(m10) && (reactContext = this.f36363o) != null && reactContext.hasActiveReactInstance()) {
            A(m10, reactContext);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements u0 {
        a() {
        }

        @Override // com.facebook.react.devsupport.u0
        public Activity a() {
            return H.this.f36366r;
        }

        @Override // com.facebook.react.devsupport.u0
        public View b(String str) {
            Activity activityA = a();
            if (activityA == null) {
                return null;
            }
            W w10 = new W(activityA);
            w10.setIsFabric(C4921i.b());
            w10.u(H.this, str, new Bundle());
            return w10;
        }

        @Override // com.facebook.react.devsupport.u0
        public JavaScriptExecutorFactory c() {
            return H.this.D();
        }

        @Override // com.facebook.react.devsupport.u0
        public void e(View view) {
            if (view instanceof W) {
                ((W) view).v();
            }
        }

        @Override // com.facebook.react.devsupport.u0
        public void g() {
            H.this.q0();
        }

        @Override // com.facebook.react.devsupport.u0
        public void reload(String str) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f36377a;

        c(View view) {
            this.f36377a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f36377a.removeOnAttachStateChangeListener(this);
            H.this.f36357i.s(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
