package com.reactnativekeyboardcontroller;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeKeyboardControllerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "KeyboardController";

    public NativeKeyboardControllerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void dismiss(boolean z10, boolean z11);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void preload();

    @ReactMethod
    public abstract void removeListeners(double d10);

    @ReactMethod
    public abstract void setDefaultMode();

    @ReactMethod
    public abstract void setFocusTo(String str);

    @ReactMethod
    public abstract void setInputMode(double d10);
}
