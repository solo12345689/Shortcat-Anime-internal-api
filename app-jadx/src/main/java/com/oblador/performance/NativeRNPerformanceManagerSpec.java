package com.oblador.performance;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeRNPerformanceManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNPerformanceManager";

    public NativeRNPerformanceManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public abstract void addListener(String str);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNPerformanceManager";
    }

    @ReactMethod
    public abstract void removeListeners(double d10);
}
