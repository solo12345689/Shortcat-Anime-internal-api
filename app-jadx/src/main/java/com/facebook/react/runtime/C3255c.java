package com.facebook.react.runtime;

import android.content.Context;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.JavaScriptModuleRegistry;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.interop.InteropModuleRegistry;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import h7.C4921i;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC5504s;
import q7.InterfaceC6143a;

/* JADX INFO: renamed from: com.facebook.react.runtime.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3255c extends ReactApplicationContext implements com.facebook.react.uimanager.events.j {

    /* JADX INFO: renamed from: a */
    private final ReactHostImpl f37272a;

    /* JADX INFO: renamed from: b */
    private final AtomicReference f37273b;

    /* JADX INFO: renamed from: c */
    private final String f37274c;

    /* JADX INFO: renamed from: com.facebook.react.runtime.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        private final ReactHostImpl f37275a;

        /* JADX INFO: renamed from: b */
        private final Class f37276b;

        public a(ReactHostImpl reactHost, Class jsModuleInterface) {
            AbstractC5504s.h(reactHost, "reactHost");
            AbstractC5504s.h(jsModuleInterface, "jsModuleInterface");
            this.f37275a = reactHost;
            this.f37276b = jsModuleInterface;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] args) {
            AbstractC5504s.h(proxy, "proxy");
            AbstractC5504s.h(method, "method");
            AbstractC5504s.h(args, "args");
            WritableNativeArray writableNativeArrayFromJavaArgs = Arguments.fromJavaArgs(args);
            ReactHostImpl reactHostImpl = this.f37275a;
            String jSModuleName = JavaScriptModuleRegistry.INSTANCE.getJSModuleName(this.f37276b);
            String name = method.getName();
            AbstractC5504s.g(name, "getName(...)");
            reactHostImpl.callFunctionOnModule$ReactAndroid_release(jSModuleName, name, writableNativeArrayFromJavaArgs);
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3255c(Context context, ReactHostImpl reactHost) {
        super(context);
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(reactHost, "reactHost");
        this.f37272a = reactHost;
        this.f37273b = new AtomicReference();
        String simpleName = C3255c.class.getSimpleName();
        AbstractC5504s.g(simpleName, "getSimpleName(...)");
        this.f37274c = simpleName;
        if (C4921i.c()) {
            initializeInteropModules();
        }
    }

    public final InterfaceC6143a b() {
        return this.f37272a.getDefaultBackButtonHandler$ReactAndroid_release();
    }

    public final c7.f c() {
        return this.f37272a.getDevSupportManager();
    }

    public final void d(String str) {
        this.f37273b.set(str);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void emitDeviceEvent(String eventName, Object obj) {
        AbstractC5504s.h(eventName, "eventName");
        this.f37272a.callFunctionOnModule$ReactAndroid_release("RCTDeviceEventEmitter", "emit", Arguments.fromJavaArgs(new Object[]{eventName, obj}));
    }

    @Override // com.facebook.react.bridge.ReactContext
    public CatalystInstance getCatalystInstance() {
        if (Y6.a.f22864f) {
            throw new UnsupportedOperationException("CatalystInstance is not supported when Bridgeless mode is enabled.");
        }
        Log.w(this.f37274c, "[WARNING] Bridgeless doesn't support CatalystInstance. Accessing an API that's not part of the new architecture is not encouraged usage.");
        return new C3254b(this.f37272a);
    }

    @Override // com.facebook.react.uimanager.events.j
    public EventDispatcher getEventDispatcher() {
        return this.f37272a.getEventDispatcher$ReactAndroid_release();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public UIManager getFabricUIManager() {
        return this.f37272a.getUiManager$ReactAndroid_release();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public CallInvokerHolder getJSCallInvokerHolder() {
        return this.f37272a.getJsCallInvokerHolder$ReactAndroid_release();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public JavaScriptModule getJSModule(Class jsInterface) {
        JavaScriptModule interopModule;
        AbstractC5504s.h(jsInterface, "jsInterface");
        InteropModuleRegistry interopModuleRegistry = this.mInteropModuleRegistry;
        if (interopModuleRegistry != null && (interopModule = interopModuleRegistry.getInteropModule(jsInterface)) != null) {
            if (AbstractC5504s.c(jsInterface, RCTEventEmitter.class)) {
                ReactSoftExceptionLogger.logSoftException(this.f37274c, new IllegalArgumentException("getJSModule(RCTEventEmitter) is not recommended in the new architecture and will stop working with interop disabled. Please use UIManagerHelper.getEventDispatcher or UIManagerHelper.getEventDispatcherForReactTag instead"));
            }
            return interopModule;
        }
        Object objNewProxyInstance = Proxy.newProxyInstance(jsInterface.getClassLoader(), new Class[]{jsInterface}, new a(this.f37272a, jsInterface));
        AbstractC5504s.f(objNewProxyInstance, "null cannot be cast to non-null type com.facebook.react.bridge.JavaScriptModule");
        JavaScriptModule javaScriptModule = (JavaScriptModule) objNewProxyInstance;
        if (javaScriptModule != null) {
            return javaScriptModule;
        }
        return null;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.f37272a.getJavaScriptContextHolder$ReactAndroid_release();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public NativeModule getNativeModule(Class nativeModuleInterface) {
        AbstractC5504s.h(nativeModuleInterface, "nativeModuleInterface");
        return this.f37272a.getNativeModule$ReactAndroid_release(nativeModuleInterface);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public Collection getNativeModules() {
        return this.f37272a.getNativeModules$ReactAndroid_release();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public String getSourceURL() {
        return (String) this.f37273b.get();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void handleException(Exception e10) {
        AbstractC5504s.h(e10, "e");
        this.f37272a.handleHostException$ReactAndroid_release(e10);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasActiveCatalystInstance() {
        return hasActiveReactInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasActiveReactInstance() {
        return this.f37272a.isInstanceInitialized$ReactAndroid_release();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasCatalystInstance() {
        return false;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasNativeModule(Class nativeModuleInterface) {
        AbstractC5504s.h(nativeModuleInterface, "nativeModuleInterface");
        return this.f37272a.hasNativeModule$ReactAndroid_release(nativeModuleInterface);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasReactInstance() {
        return this.f37272a.isInstanceInitialized$ReactAndroid_release();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean isBridgeless() {
        return true;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void registerSegment(int i10, String path, Callback callback) {
        AbstractC5504s.h(path, "path");
        AbstractC5504s.h(callback, "callback");
        this.f37272a.registerSegment$ReactAndroid_release(i10, path, callback);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public NativeModule getNativeModule(String name) {
        AbstractC5504s.h(name, "name");
        return this.f37272a.getNativeModule$ReactAndroid_release(name);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void destroy() {
    }
}
