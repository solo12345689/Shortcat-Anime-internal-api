package com.facebook.react.uimanager;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: com.facebook.react.uimanager.b0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3284b0 extends ReactContext {

    /* JADX INFO: renamed from: a */
    private final ReactApplicationContext f37551a;

    /* JADX INFO: renamed from: b */
    private final String f37552b;

    /* JADX INFO: renamed from: c */
    private final int f37553c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3284b0(ReactApplicationContext reactApplicationContext, Context base, String str, int i10) {
        super(base);
        AbstractC5504s.h(reactApplicationContext, "reactApplicationContext");
        AbstractC5504s.h(base, "base");
        this.f37551a = reactApplicationContext;
        this.f37552b = str;
        this.f37553c = i10;
        initializeFromOther(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void addLifecycleEventListener(LifecycleEventListener listener) {
        AbstractC5504s.h(listener, "listener");
        this.f37551a.addLifecycleEventListener(listener);
    }

    public final ReactApplicationContext b() {
        return this.f37551a;
    }

    public final int c() {
        return this.f37553c;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void destroy() {
        this.f37551a.destroy();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public CatalystInstance getCatalystInstance() {
        return this.f37551a.getCatalystInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public Activity getCurrentActivity() {
        return this.f37551a.getCurrentActivity();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public UIManager getFabricUIManager() {
        return this.f37551a.getFabricUIManager();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public CallInvokerHolder getJSCallInvokerHolder() {
        return this.f37551a.getJSCallInvokerHolder();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public JavaScriptModule getJSModule(Class jsInterface) {
        AbstractC5504s.h(jsInterface, "jsInterface");
        JavaScriptModule jSModule = this.f37551a.getJSModule(jsInterface);
        AbstractC5504s.g(jSModule, "getJSModule(...)");
        return jSModule;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.f37551a.getJavaScriptContextHolder();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public NativeModule getNativeModule(Class nativeModuleInterface) {
        AbstractC5504s.h(nativeModuleInterface, "nativeModuleInterface");
        return this.f37551a.getNativeModule(nativeModuleInterface);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public Collection getNativeModules() {
        return this.f37551a.getNativeModules();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public String getSourceURL() {
        return this.f37551a.getSourceURL();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void handleException(Exception exc) {
        this.f37551a.handleException(exc);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasActiveCatalystInstance() {
        return this.f37551a.hasActiveCatalystInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasActiveReactInstance() {
        return this.f37551a.hasActiveCatalystInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasCatalystInstance() {
        return this.f37551a.hasCatalystInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasCurrentActivity() {
        return this.f37551a.hasCurrentActivity();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasNativeModule(Class nativeModuleInterface) {
        AbstractC5504s.h(nativeModuleInterface, "nativeModuleInterface");
        return this.f37551a.hasNativeModule(nativeModuleInterface);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasReactInstance() {
        return this.f37551a.hasReactInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean isBridgeless() {
        return this.f37551a.isBridgeless();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void registerSegment(int i10, String str, Callback callback) {
        this.f37551a.registerSegment(i10, str, callback);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void removeLifecycleEventListener(LifecycleEventListener listener) {
        AbstractC5504s.h(listener, "listener");
        this.f37551a.removeLifecycleEventListener(listener);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public NativeModule getNativeModule(String moduleName) {
        AbstractC5504s.h(moduleName, "moduleName");
        return this.f37551a.getNativeModule(moduleName);
    }
}
