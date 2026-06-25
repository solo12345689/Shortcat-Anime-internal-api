package i1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: i1.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5031x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f48582b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f48583c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f48584d = e(4294967296L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f48585e = e(8589934592L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f48586a;

    /* JADX INFO: renamed from: i1.x$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return C5031x.f48585e;
        }

        public final long b() {
            return C5031x.f48584d;
        }

        public final long c() {
            return C5031x.f48583c;
        }

        private a() {
        }
    }

    private /* synthetic */ C5031x(long j10) {
        this.f48586a = j10;
    }

    public static final /* synthetic */ C5031x d(long j10) {
        return new C5031x(j10);
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof C5031x) && j10 == ((C5031x) obj).j();
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static int h(long j10) {
        return Long.hashCode(j10);
    }

    public static String i(long j10) {
        return g(j10, f48583c) ? "Unspecified" : g(j10, f48584d) ? "Sp" : g(j10, f48585e) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f48586a, obj);
    }

    public int hashCode() {
        return h(this.f48586a);
    }

    public final /* synthetic */ long j() {
        return this.f48586a;
    }

    public String toString() {
        return i(this.f48586a);
    }

    public static long e(long j10) {
        return j10;
    }
}
