package Aa;

import Td.L;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0006a f321b = new C0006a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f322a;

    /* JADX INFO: renamed from: Aa.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0006a {
        public /* synthetic */ C0006a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0006a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i10, int i11, b event) {
        super(i10, i11);
        AbstractC5504s.h(event, "event");
        this.f322a = event;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("target", this.f322a.e());
        writableMapCreateMap.putInt("parentScrollViewTarget", this.f322a.d());
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putDouble("x", this.f322a.g());
        writableMapCreateMap2.putDouble("y", this.f322a.h());
        writableMapCreateMap2.putDouble("width", this.f322a.f());
        writableMapCreateMap2.putDouble("height", this.f322a.c());
        writableMapCreateMap2.putDouble("absoluteX", this.f322a.a());
        writableMapCreateMap2.putDouble("absoluteY", this.f322a.b());
        L l10 = L.f17438a;
        writableMapCreateMap.putMap("layout", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topFocusedInputLayoutChanged";
    }
}
