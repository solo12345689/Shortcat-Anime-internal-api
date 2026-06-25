package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityManager;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.UIManagerModule;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final DeviceEventManagerModule.RCTDeviceEventEmitter a(ReactContext reactContext) {
        AbstractC5504s.h(reactContext, "<this>");
        JavaScriptModule jSModule = reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        AbstractC5504s.g(jSModule, "getJSModule(...)");
        return (DeviceEventManagerModule.RCTDeviceEventEmitter) jSModule;
    }

    public static final UIManagerModule b(ReactContext reactContext) {
        AbstractC5504s.h(reactContext, "<this>");
        NativeModule nativeModule = reactContext.getNativeModule((Class<NativeModule>) UIManagerModule.class);
        AbstractC5504s.e(nativeModule);
        return (UIManagerModule) nativeModule;
    }

    public static final boolean c(MotionEvent motionEvent) {
        AbstractC5504s.h(motionEvent, "<this>");
        return motionEvent.getAction() == 7 || motionEvent.getAction() == 9 || motionEvent.getAction() == 10;
    }

    public static final boolean d(Context context) {
        AbstractC5504s.h(context, "<this>");
        Object systemService = context.getSystemService("accessibility");
        AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        return ((AccessibilityManager) systemService).isTouchExplorationEnabled();
    }
}
