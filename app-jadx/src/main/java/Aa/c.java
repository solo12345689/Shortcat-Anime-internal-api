package Aa;

import Td.L;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f331b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f332a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i10, int i11, d event) {
        super(i10, i11);
        AbstractC5504s.h(event, "event");
        this.f332a = event;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("target", this.f332a.g());
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        WritableMap writableMapCreateMap3 = Arguments.createMap();
        writableMapCreateMap3.putDouble("x", this.f332a.e());
        writableMapCreateMap3.putDouble("y", this.f332a.f());
        writableMapCreateMap3.putInt("position", this.f332a.d());
        L l10 = L.f17438a;
        writableMapCreateMap2.putMap("start", writableMapCreateMap3);
        WritableMap writableMapCreateMap4 = Arguments.createMap();
        writableMapCreateMap4.putDouble("x", this.f332a.b());
        writableMapCreateMap4.putDouble("y", this.f332a.c());
        writableMapCreateMap4.putInt("position", this.f332a.a());
        writableMapCreateMap2.putMap("end", writableMapCreateMap4);
        writableMapCreateMap.putMap("selection", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topFocusedInputSelectionChanged";
    }
}
