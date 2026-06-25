package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeImageEditorSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ImageEditingManager";

    public NativeImageEditorSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public abstract void cropImage(String str, ReadableMap readableMap, Callback callback, Callback callback2);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }
}
