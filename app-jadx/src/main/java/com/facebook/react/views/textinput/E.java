package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class E extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f38377c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38379b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public E(int i10, int i11, int i12, int i13) {
        super(i10, i11);
        this.f38378a = i12;
        this.f38379b = i13;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("start", this.f38378a);
        readableMapBuilder.put("end", this.f38379b);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap("selection", writableMapCreateMap);
        return writableMapCreateMap2;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topSelectionChange";
    }
}
