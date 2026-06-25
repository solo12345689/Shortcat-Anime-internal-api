package com.horcrux.svg.events;

import N7.a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class SvgLoadEvent extends d {
    public static final String EVENT_NAME = "topLoad";
    private final float height;
    private final String uri;
    private final float width;

    public SvgLoadEvent(int i10, int i11, ReactContext reactContext, String str, float f10, float f11) {
        super(i10, i11);
        this.uri = new a(reactContext, str).e();
        this.width = f10;
        this.height = f11;
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), getEventData());
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("width", this.width);
        writableMapCreateMap.putDouble("height", this.height);
        writableMapCreateMap.putString("uri", this.uri);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap("source", writableMapCreateMap);
        return writableMapCreateMap2;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return EVENT_NAME;
    }
}
