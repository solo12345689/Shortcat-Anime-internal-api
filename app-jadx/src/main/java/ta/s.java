package Ta;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f17379c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f17381b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public s(int i10, int i11, int i12, boolean z10) {
        super(i10, i11);
        this.f17380a = i12;
        this.f17381b = z10;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("index", this.f17380a);
        writableMapCreateMap.putBoolean("isStable", this.f17381b);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topSheetDetentChanged";
    }
}
