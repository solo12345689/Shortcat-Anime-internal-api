package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.facebook.react.views.textinput.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3322l extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f38459c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38461b;

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.l$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3322l(int i10, int i11, String text, int i12) {
        super(i10, i11);
        AbstractC5504s.h(text, "text");
        this.f38460a = text;
        this.f38461b = i12;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("text", this.f38460a);
        writableMapCreateMap.putInt("eventCount", this.f38461b);
        writableMapCreateMap.putInt("target", getViewTag());
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topChange";
    }
}
