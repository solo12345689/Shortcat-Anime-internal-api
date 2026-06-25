package com.swmansion.reanimated.nativeProxy;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class EventHandler implements RCTEventEmitter {
    public UIManagerModule.d mCustomEventNamesResolver;
    private final HybridData mHybridData;

    private EventHandler(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i10, String str, WritableMap writableMap) {
        receiveEvent(this.mCustomEventNamesResolver.a(str), i10, writableMap);
    }

    public native void receiveEvent(String str, int i10, WritableMap writableMap);

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
    }
}
