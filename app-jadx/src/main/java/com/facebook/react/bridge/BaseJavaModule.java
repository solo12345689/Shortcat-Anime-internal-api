package com.facebook.react.bridge;

import java.util.Map;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseJavaModule implements NativeModule {
    public static final String METHOD_TYPE_ASYNC = "async";
    public static final String METHOD_TYPE_PROMISE = "promise";
    public static final String METHOD_TYPE_SYNC = "sync";
    protected CxxCallbackImpl mEventEmitterCallback;
    private final ReactApplicationContext mReactApplicationContext;

    public BaseJavaModule() {
        this(null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return false;
    }

    public Map<String, Object> getConstants() {
        return null;
    }

    protected final ReactApplicationContext getReactApplicationContext() {
        return (ReactApplicationContext) Q6.a.d(this.mReactApplicationContext, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
    }

    protected final ReactApplicationContext getReactApplicationContextIfActiveOrWarn() {
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        if (reactApplicationContext != null && reactApplicationContext.hasActiveReactInstance()) {
            return this.mReactApplicationContext;
        }
        String str = "React Native Instance has already disappeared: requested by " + getName();
        if (Y6.a.f22860b) {
            AbstractC7283a.I("ReactNative", str);
            return null;
        }
        ReactSoftExceptionLogger.logSoftException("ReactNative", new RuntimeException(str));
        return null;
    }

    protected void setEventEmitterCallback(CxxCallbackImpl cxxCallbackImpl) {
        this.mEventEmitterCallback = cxxCallbackImpl;
    }

    public BaseJavaModule(ReactApplicationContext reactApplicationContext) {
        this.mReactApplicationContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
    }
}
