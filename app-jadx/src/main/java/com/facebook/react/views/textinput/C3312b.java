package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.facebook.react.views.textinput.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3312b extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f38402c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f38403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f38404b;

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3312b(int i10, int i11, float f10, float f11) {
        super(i10, i11);
        this.f38403a = f10;
        this.f38404b = f11;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("width", this.f38403a);
        readableMapBuilder.put("height", this.f38404b);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap("contentSize", writableMapCreateMap);
        writableMapCreateMap2.putInt("target", getViewTag());
        return writableMapCreateMap2;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topContentSizeChange";
    }
}
