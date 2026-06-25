package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeDevSettingsSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DevSettings";

    public NativeDevSettingsSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void addMenuItem(String str);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DevSettings";
    }

    @ReactMethod
    public abstract void reload();

    @ReactMethod
    public abstract void removeListeners(double d10);

    @ReactMethod
    public abstract void setHotLoadingEnabled(boolean z10);

    @ReactMethod
    public abstract void setIsShakeToShowDevMenuEnabled(boolean z10);

    @ReactMethod
    public abstract void setProfilingEnabled(boolean z10);

    @ReactMethod
    public abstract void toggleElementInspector();

    @ReactMethod
    public void onFastRefresh() {
    }

    @ReactMethod
    public void openDebugger() {
    }

    @ReactMethod
    public void reloadWithReason(String str) {
    }
}
