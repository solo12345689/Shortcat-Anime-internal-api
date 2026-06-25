package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeIntentAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IntentAndroid";

    public NativeIntentAndroidSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public abstract void canOpenURL(String str, Promise promise);

    @ReactMethod
    public abstract void getInitialURL(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "IntentAndroid";
    }

    @ReactMethod
    public abstract void openSettings(Promise promise);

    @ReactMethod
    public abstract void openURL(String str, Promise promise);

    @ReactMethod
    public abstract void sendIntent(String str, ReadableArray readableArray, Promise promise);
}
