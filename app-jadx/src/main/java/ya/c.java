package Ya;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f22875d = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f22876c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Wa.b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // Wa.b
        public String a() {
            return "onDismiss";
        }

        @Override // Wa.b
        public String getEventName() {
            return "topDismiss";
        }

        private a() {
        }
    }

    public c(int i10, int i11, boolean z10) {
        super(i10, i11, "topDismiss", "onDismiss");
        this.f22876c = z10;
    }

    @Override // Ya.d, com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("isNativeDismiss", this.f22876c);
        return writableMapCreateMap;
    }
}
