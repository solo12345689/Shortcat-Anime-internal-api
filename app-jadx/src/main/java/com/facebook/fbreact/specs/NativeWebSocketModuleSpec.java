package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeWebSocketModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "WebSocketModule";

    public NativeWebSocketModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void close(double d10, String str, double d11);

    @ReactMethod
    public abstract void connect(String str, ReadableArray readableArray, ReadableMap readableMap, double d10);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WebSocketModule";
    }

    @ReactMethod
    public abstract void ping(double d10);

    @ReactMethod
    public abstract void removeListeners(double d10);

    @ReactMethod
    public abstract void send(String str, double d10);

    @ReactMethod
    public abstract void sendBinary(String str, double d10);
}
