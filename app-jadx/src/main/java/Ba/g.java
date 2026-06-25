package Ba;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.f0;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public static final void a(C3284b0 c3284b0, int i10, com.facebook.react.uimanager.events.d event) {
        AbstractC5504s.h(event, "event");
        AbstractC5504s.f(c3284b0, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherC = f0.c(c3284b0, i10);
        if (eventDispatcherC != null) {
            eventDispatcherC.d(event);
        }
    }

    public static final void b(C3284b0 c3284b0, String event, WritableMap params) {
        ReactApplicationContext reactApplicationContextB;
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
        AbstractC5504s.h(event, "event");
        AbstractC5504s.h(params, "params");
        if (c3284b0 != null && (reactApplicationContextB = c3284b0.b()) != null && (rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextB.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)) != null) {
            rCTDeviceEventEmitter.emit(event, params);
        }
        Fa.a.b(Fa.a.f6597a, "ThemedReactContext", event, null, 4, null);
    }

    public static final String c(C3284b0 c3284b0) {
        return (c3284b0 != null && a.c(c3284b0)) ? "dark" : "light";
    }

    public static final void d(C3284b0 c3284b0, int i10) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(new int[]{i10}[0]);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putArray("tags", writableArrayCreateArray);
        b(c3284b0, "onUserDrivenAnimationEnded", writableMapCreateMap);
    }
}
