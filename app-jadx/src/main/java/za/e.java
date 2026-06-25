package Za;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends com.facebook.react.uimanager.events.d implements Wa.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f23238d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f23241c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Wa.b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // Wa.b
        public String a() {
            return "onNativeFocusChange";
        }

        @Override // Wa.b
        public String getEventName() {
            return "topNativeFocusChange";
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i10, int i11, String tabKey, int i12, boolean z10) {
        super(i10, i11);
        AbstractC5504s.h(tabKey, "tabKey");
        this.f23239a = tabKey;
        this.f23240b = i12;
        this.f23241c = z10;
    }

    @Override // Wa.b
    public String a() {
        return "onNativeFocusChange";
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) ((this.f23240b * 10) + (this.f23241c ? 1 : 0));
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("tabKey", this.f23239a);
        writableMapCreateMap.putBoolean("repeatedSelectionHandledBySpecialEffect", this.f23241c);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topNativeFocusChange";
    }
}
