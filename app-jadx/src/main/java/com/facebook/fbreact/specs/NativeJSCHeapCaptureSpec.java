package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeJSCHeapCaptureSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "JSCHeapCapture";

    public NativeJSCHeapCaptureSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public abstract void captureComplete(String str, String str2);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }
}
