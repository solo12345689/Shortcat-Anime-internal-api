package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f44848c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.th3rdwave.safeareacontext.a f44849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f44850b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i10, int i11, com.th3rdwave.safeareacontext.a mInsets, c mFrame) {
        super(i10, i11);
        AbstractC5504s.h(mInsets, "mInsets");
        AbstractC5504s.h(mFrame, "mFrame");
        this.f44849a = mInsets;
        this.f44850b = mFrame;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putMap("insets", q.b(this.f44849a));
        writableMapCreateMap.putMap("frame", q.d(this.f44850b));
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topInsetsChange";
    }
}
