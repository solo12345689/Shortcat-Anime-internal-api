package H7;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.C3303t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f8021e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3303t f8022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3303t f8023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3303t f8024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3303t f8025d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(ReadableMap readableMap) {
            C3303t c3303tA = null;
            if (readableMap == null) {
                return null;
            }
            C3303t c3303tA2 = (!readableMap.hasKey("top") || readableMap.getType("top") == ReadableType.Null) ? null : C3303t.f37827c.a(readableMap.getDynamic("top"), true);
            C3303t c3303tA3 = (!readableMap.hasKey("left") || readableMap.getType("left") == ReadableType.Null) ? null : C3303t.f37827c.a(readableMap.getDynamic("left"), true);
            C3303t c3303tA4 = (!readableMap.hasKey("right") || readableMap.getType("right") == ReadableType.Null) ? null : C3303t.f37827c.a(readableMap.getDynamic("right"), true);
            if (readableMap.hasKey("bottom") && readableMap.getType("bottom") != ReadableType.Null) {
                c3303tA = C3303t.f37827c.a(readableMap.getDynamic("bottom"), true);
            }
            return new b(c3303tA2, c3303tA3, c3303tA4, c3303tA);
        }

        private a() {
        }
    }

    public b(C3303t c3303t, C3303t c3303t2, C3303t c3303t3, C3303t c3303t4) {
        this.f8022a = c3303t;
        this.f8023b = c3303t2;
        this.f8024c = c3303t3;
        this.f8025d = c3303t4;
    }

    public final C3303t a() {
        return this.f8025d;
    }

    public final C3303t b() {
        return this.f8023b;
    }

    public final C3303t c() {
        return this.f8024c;
    }

    public final C3303t d() {
        return this.f8022a;
    }
}
