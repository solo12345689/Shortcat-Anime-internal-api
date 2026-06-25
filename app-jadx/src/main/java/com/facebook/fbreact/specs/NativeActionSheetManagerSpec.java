package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeActionSheetManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ActionSheetManager";

    public NativeActionSheetManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void showActionSheetWithOptions(ReadableMap readableMap, Callback callback);

    @ReactMethod
    public abstract void showShareActionSheetWithOptions(ReadableMap readableMap, Callback callback, Callback callback2);

    @ReactMethod
    public void dismissActionSheet() {
    }
}
