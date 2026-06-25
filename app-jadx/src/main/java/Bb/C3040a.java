package bb;

import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: bb.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C3040a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0559a f33257e = new C0559a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C3040a f33258f = new C3040a(false, false, false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f33259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f33260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f33261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f33262d;

    /* JADX INFO: renamed from: bb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0559a {
        public /* synthetic */ C0559a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3040a a(ReadableMap readableMap) {
            if (readableMap != null) {
                return new C3040a(readableMap.getBoolean("left"), readableMap.getBoolean("top"), readableMap.getBoolean("right"), readableMap.getBoolean("bottom"));
            }
            return null;
        }

        private C0559a() {
        }
    }

    public C3040a(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f33259a = z10;
        this.f33260b = z11;
        this.f33261c = z12;
        this.f33262d = z13;
    }

    public final boolean a() {
        return this.f33262d;
    }

    public final boolean b() {
        return this.f33259a;
    }

    public final boolean c() {
        return this.f33261c;
    }

    public final boolean d() {
        return this.f33260b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3040a)) {
            return false;
        }
        C3040a c3040a = (C3040a) obj;
        return this.f33259a == c3040a.f33259a && this.f33260b == c3040a.f33260b && this.f33261c == c3040a.f33261c && this.f33262d == c3040a.f33262d;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f33259a) * 31) + Boolean.hashCode(this.f33260b)) * 31) + Boolean.hashCode(this.f33261c)) * 31) + Boolean.hashCode(this.f33262d);
    }

    public String toString() {
        return "SafeAreaViewEdges(left=" + this.f33259a + ", top=" + this.f33260b + ", right=" + this.f33261c + ", bottom=" + this.f33262d + ")";
    }
}
