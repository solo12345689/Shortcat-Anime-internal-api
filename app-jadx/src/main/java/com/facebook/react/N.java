package com.facebook.react;

import android.app.Application;
import com.facebook.react.T;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.InterfaceC3213b0;
import g7.InterfaceC4859b;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class N {

    /* JADX INFO: renamed from: a */
    private final Application f36416a;

    /* JADX INFO: renamed from: b */
    private H f36417b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements U6.h {
        a() {
        }

        @Override // U6.h
        public U6.g d(String str) {
            return null;
        }
    }

    static {
        W6.b.a("ReactNativeHost", W6.a.f20778b);
    }

    protected N(Application application) {
        this.f36416a = application;
    }

    public static /* synthetic */ UIManager a(ReactApplicationContext reactApplicationContext) {
        return null;
    }

    public boolean b() {
        return false;
    }

    public synchronized H c() {
        try {
            if (this.f36417b == null) {
                ReactMarker.logMarker(ReactMarkerConstants.INIT_REACT_RUNTIME_START);
                ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_START);
                this.f36417b = createReactInstanceManager();
                ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_END);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f36417b;
    }

    protected H createReactInstanceManager() {
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
        K baseReactInstanceManagerBuilder = getBaseReactInstanceManagerBuilder();
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END);
        return baseReactInstanceManagerBuilder.b();
    }

    public boolean d() {
        return true;
    }

    public U6.h e() {
        return new a();
    }

    public abstract boolean f();

    public synchronized boolean g() {
        return this.f36417b != null;
    }

    protected final Application getApplication() {
        return this.f36416a;
    }

    protected K getBaseReactInstanceManagerBuilder() {
        K kO = H.u().d(this.f36416a).m(getJSMainModuleName()).v(f()).h(getDevSupportManagerFactory()).g(getDevLoadingViewManager()).s(d()).t(e()).l(getJSExceptionHandler()).o(b());
        getRedBoxHandler();
        K kP = kO.r(null).n(getJavaScriptExecutorFactory()).u(getUIManagerProvider()).i(LifecycleState.f36550a).q(getReactPackageTurboModuleManagerDelegateBuilder()).f(getChoreographerProvider()).p(getPausedInDebuggerOverlayManager());
        Iterator<O> it = getPackages().iterator();
        while (it.hasNext()) {
            kP.a(it.next());
        }
        String jSBundleFile = getJSBundleFile();
        if (jSBundleFile != null) {
            kP.j(jSBundleFile);
            return kP;
        }
        kP.e((String) Q6.a.c(getBundleAssetName()));
        return kP;
    }

    protected String getBundleAssetName() {
        return "index.android.bundle";
    }

    protected InterfaceC4859b getChoreographerProvider() {
        return null;
    }

    protected c7.d getDevLoadingViewManager() {
        return null;
    }

    protected InterfaceC3213b0 getDevSupportManagerFactory() {
        return null;
    }

    protected String getJSBundleFile() {
        return null;
    }

    protected JSExceptionHandler getJSExceptionHandler() {
        return null;
    }

    protected String getJSMainModuleName() {
        return "index.android";
    }

    protected JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        return null;
    }

    protected abstract List<O> getPackages();

    protected c7.i getPausedInDebuggerOverlayManager() {
        return null;
    }

    protected T.a getReactPackageTurboModuleManagerDelegateBuilder() {
        return null;
    }

    protected c7.j getRedBoxHandler() {
        return null;
    }

    protected UIManagerProvider getUIManagerProvider() {
        return new UIManagerProvider() { // from class: com.facebook.react.M
            @Override // com.facebook.react.bridge.UIManagerProvider
            public final UIManager createUIManager(ReactApplicationContext reactApplicationContext) {
                return N.a(reactApplicationContext);
            }
        };
    }
}
