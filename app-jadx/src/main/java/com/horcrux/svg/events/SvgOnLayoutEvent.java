package com.horcrux.svg.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.events.d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class SvgOnLayoutEvent extends d {
    public static final String EVENT_NAME = "topSvgLayout";
    public int height;
    public int width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f43785x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f43786y;

    public SvgOnLayoutEvent(int i10, int i11, int i12, int i13, int i14, int i15) {
        super(i10, i11);
        this.f43785x = i12;
        this.f43786y = i13;
        this.width = i14;
        this.height = i15;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("x", B.g(this.f43785x));
        writableMapCreateMap.putDouble("y", B.g(this.f43786y));
        writableMapCreateMap.putDouble("width", B.g(this.width));
        writableMapCreateMap.putDouble("height", B.g(this.height));
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap("layout", writableMapCreateMap);
        writableMapCreateMap2.putInt("target", getViewTag());
        return writableMapCreateMap2;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return EVENT_NAME;
    }
}
