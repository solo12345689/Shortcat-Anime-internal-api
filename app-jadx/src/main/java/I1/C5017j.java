package i1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: i1.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5017j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f48552b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f48553c = b(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f48554d = b(9205357640488583168L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f48555a;

    /* JADX INFO: renamed from: i1.j$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ C5017j(long j10) {
        this.f48555a = j10;
    }

    public static final /* synthetic */ C5017j a(long j10) {
        return new C5017j(j10);
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof C5017j) && j10 == ((C5017j) obj).h();
    }

    public static final float d(long j10) {
        return C5015h.n(Float.intBitsToFloat((int) (j10 >> 32)));
    }

    public static final float e(long j10) {
        return C5015h.n(Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    public static int f(long j10) {
        return Long.hashCode(j10);
    }

    public static String g(long j10) {
        if (j10 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return '(' + ((Object) C5015h.s(d(j10))) + ", " + ((Object) C5015h.s(e(j10))) + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f48555a, obj);
    }

    public final /* synthetic */ long h() {
        return this.f48555a;
    }

    public int hashCode() {
        return f(this.f48555a);
    }

    public String toString() {
        return g(this.f48555a);
    }

    public static long b(long j10) {
        return j10;
    }
}
