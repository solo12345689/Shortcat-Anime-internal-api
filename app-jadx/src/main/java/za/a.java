package Za;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends com.facebook.react.uimanager.events.d implements Wa.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0401a f23234a = new C0401a(null);

    /* JADX INFO: renamed from: Za.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0401a implements Wa.b {
        public /* synthetic */ C0401a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // Wa.b
        public String a() {
            return "onDidAppear";
        }

        @Override // Wa.b
        public String getEventName() {
            return "topDidAppear";
        }

        private C0401a() {
        }
    }

    public a(int i10, int i11) {
        super(i10, i11);
    }

    @Override // Wa.b
    public String a() {
        return "onDidAppear";
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topDidAppear";
    }
}
