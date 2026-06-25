package Ta;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f17364e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f17365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f17366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f17367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final short f17368d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(int i10, int i11, float f10, boolean z10, boolean z11, short s10) {
        super(i10, i11);
        this.f17365a = f10;
        this.f17366b = z10;
        this.f17367c = z11;
        this.f17368d = s10;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return this.f17368d;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, this.f17365a);
        writableMapCreateMap.putInt("closing", this.f17366b ? 1 : 0);
        writableMapCreateMap.putInt("goingForward", this.f17367c ? 1 : 0);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topTransitionProgress";
    }
}
