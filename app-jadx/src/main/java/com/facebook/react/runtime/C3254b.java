package com.facebook.react.runtime;

import android.content.res.AssetManager;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeArrayInterface;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.turbomodule.core.interfaces.NativeMethodCallInvokerHolder;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.facebook.react.runtime.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3254b implements CatalystInstance {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f37269b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactHostImpl f37270a;

    /* JADX INFO: renamed from: com.facebook.react.runtime.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        W6.b.a("BridgelessCatalystInstance", W6.a.f20778b);
    }

    public C3254b(ReactHostImpl reactHost) {
        AbstractC5504s.h(reactHost, "reactHost");
        this.f37270a = reactHost;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener listener) {
        AbstractC5504s.h(listener, "listener");
        throw new UnsupportedOperationException("Unimplemented method 'addBridgeIdleDebugListener'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void callFunction(String module, String method, NativeArray nativeArray) {
        AbstractC5504s.h(module, "module");
        AbstractC5504s.h(method, "method");
        throw new UnsupportedOperationException("Unimplemented method 'callFunction'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    /* JADX INFO: renamed from: destroy */
    public void lambda$onNativeException$6() {
        throw new UnsupportedOperationException("Unimplemented method 'destroy'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void extendNativeModules(NativeModuleRegistry modules) {
        AbstractC5504s.h(modules, "modules");
        throw new UnsupportedOperationException("Unimplemented method 'extendNativeModules'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public UIManager getFabricUIManager() {
        throw new UnsupportedOperationException("Unimplemented method 'getFabricUIManager'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public CallInvokerHolder getJSCallInvokerHolder() {
        CallInvokerHolder jsCallInvokerHolder$ReactAndroid_release = this.f37270a.getJsCallInvokerHolder$ReactAndroid_release();
        AbstractC5504s.e(jsCallInvokerHolder$ReactAndroid_release);
        return jsCallInvokerHolder$ReactAndroid_release;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public JavaScriptModule getJSModule(Class jsInterface) {
        AbstractC5504s.h(jsInterface, "jsInterface");
        ReactContext currentReactContext = this.f37270a.getCurrentReactContext();
        if (currentReactContext != null) {
            return currentReactContext.getJSModule(jsInterface);
        }
        return null;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        JavaScriptContextHolder javaScriptContextHolder$ReactAndroid_release = this.f37270a.getJavaScriptContextHolder$ReactAndroid_release();
        AbstractC5504s.e(javaScriptContextHolder$ReactAndroid_release);
        return javaScriptContextHolder$ReactAndroid_release;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public NativeMethodCallInvokerHolder getNativeMethodCallInvokerHolder() {
        throw new UnsupportedOperationException("Unimplemented method 'getNativeMethodCallInvokerHolder'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public NativeModule getNativeModule(Class nativeModuleInterface) {
        AbstractC5504s.h(nativeModuleInterface, "nativeModuleInterface");
        return this.f37270a.getNativeModule$ReactAndroid_release(nativeModuleInterface);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public Collection getNativeModules() {
        return this.f37270a.getNativeModules$ReactAndroid_release();
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public ReactQueueConfiguration getReactQueueConfiguration() {
        ReactQueueConfiguration reactQueueConfiguration = this.f37270a.getReactQueueConfiguration();
        AbstractC5504s.e(reactQueueConfiguration);
        return reactQueueConfiguration;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public RuntimeExecutor getRuntimeExecutor() {
        return this.f37270a.getRuntimeExecutor$ReactAndroid_release();
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public RuntimeScheduler getRuntimeScheduler() {
        throw new UnsupportedOperationException("Unimplemented method 'getRuntimeScheduler'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public String getSourceURL() {
        throw new UnsupportedOperationException("Unimplemented method 'getSourceURL'");
    }

    @Override // com.facebook.react.bridge.MemoryPressureListener
    public void handleMemoryPressure(int i10) {
        throw new UnsupportedOperationException("Unimplemented method 'handleMemoryPressure'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public boolean hasNativeModule(Class nativeModuleInterface) {
        AbstractC5504s.h(nativeModuleInterface, "nativeModuleInterface");
        return this.f37270a.hasNativeModule$ReactAndroid_release(nativeModuleInterface);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public boolean hasRunJSBundle() {
        throw new UnsupportedOperationException("Unimplemented method 'hasRunJSBundle'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void initialize() {
        throw new UnsupportedOperationException("Unimplemented method 'initialize'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance, com.facebook.react.bridge.JSInstance
    public void invokeCallback(int i10, NativeArrayInterface arguments) {
        AbstractC5504s.h(arguments, "arguments");
        throw new UnsupportedOperationException("Unimplemented method 'invokeCallback'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public boolean isDestroyed() {
        throw new UnsupportedOperationException("Unimplemented method 'isDestroyed'");
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromAssets(AssetManager assetManager, String assetURL, boolean z10) {
        AbstractC5504s.h(assetManager, "assetManager");
        AbstractC5504s.h(assetURL, "assetURL");
        throw new UnsupportedOperationException("Unimplemented method 'loadScriptFromAssets'");
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromFile(String fileName, String sourceURL, boolean z10) {
        AbstractC5504s.h(fileName, "fileName");
        AbstractC5504s.h(sourceURL, "sourceURL");
        throw new UnsupportedOperationException("Unimplemented method 'loadScriptFromFile'");
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadSplitBundleFromFile(String fileName, String sourceURL) {
        AbstractC5504s.h(fileName, "fileName");
        AbstractC5504s.h(sourceURL, "sourceURL");
        throw new UnsupportedOperationException("Unimplemented method 'loadSplitBundleFromFile'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void registerSegment(int i10, String path) {
        AbstractC5504s.h(path, "path");
        throw new UnsupportedOperationException("Unimplemented method 'registerSegment'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener listener) {
        AbstractC5504s.h(listener, "listener");
        throw new UnsupportedOperationException("Unimplemented method 'removeBridgeIdleDebugListener'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void runJSBundle() {
        throw new UnsupportedOperationException("Unimplemented method 'runJSBundle'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void setFabricUIManager(UIManager fabricUIManager) {
        AbstractC5504s.h(fabricUIManager, "fabricUIManager");
        throw new UnsupportedOperationException("Unimplemented method 'setFabricUIManager'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void setGlobalVariable(String propName, String jsonValue) {
        AbstractC5504s.h(propName, "propName");
        AbstractC5504s.h(jsonValue, "jsonValue");
        throw new UnsupportedOperationException("Unimplemented method 'setGlobalVariable'");
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void setSourceURLs(String deviceURL, String remoteURL) {
        AbstractC5504s.h(deviceURL, "deviceURL");
        AbstractC5504s.h(remoteURL, "remoteURL");
        throw new UnsupportedOperationException("Unimplemented method 'setSourceURLs'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void setTurboModuleRegistry(TurboModuleRegistry turboModuleRegistry) {
        AbstractC5504s.h(turboModuleRegistry, "turboModuleRegistry");
        throw new UnsupportedOperationException("Unimplemented method 'setTurboModuleRegistry'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public NativeModule getNativeModule(String moduleName) {
        AbstractC5504s.h(moduleName, "moduleName");
        return this.f37270a.getNativeModule$ReactAndroid_release(moduleName);
    }
}
