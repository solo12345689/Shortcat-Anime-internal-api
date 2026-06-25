package i7;

import W6.b;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: i7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5043a extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C0774a f48723c = new C0774a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WritableMap f48725b;

    /* JADX INFO: renamed from: i7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0774a {
        public /* synthetic */ C0774a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0774a() {
        }
    }

    static {
        b.b("InteropEvent", null, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5043a(String interopEventName, WritableMap writableMap, int i10, int i11) {
        super(i10, i11);
        AbstractC5504s.h(interopEventName, "interopEventName");
        this.f48724a = interopEventName;
        this.f48725b = writableMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        return this.f48725b;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return this.f48724a;
    }
}
