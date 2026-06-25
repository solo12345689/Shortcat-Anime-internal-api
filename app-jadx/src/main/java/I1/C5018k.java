package i1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: i1.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5018k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f48556b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f48557c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f48558d = d(9205357640488583168L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f48559a;

    /* JADX INFO: renamed from: i1.k$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return C5018k.f48558d;
        }

        public final long b() {
            return C5018k.f48557c;
        }

        private a() {
        }
    }

    private /* synthetic */ C5018k(long j10) {
        this.f48559a = j10;
    }

    public static final /* synthetic */ C5018k c(long j10) {
        return new C5018k(j10);
    }

    public static boolean e(long j10, Object obj) {
        return (obj instanceof C5018k) && j10 == ((C5018k) obj).k();
    }

    public static final boolean f(long j10, long j11) {
        return j10 == j11;
    }

    public static final float g(long j10) {
        return C5015h.n(Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    public static final float h(long j10) {
        return C5015h.n(Float.intBitsToFloat((int) (j10 >> 32)));
    }

    public static int i(long j10) {
        return Long.hashCode(j10);
    }

    public static String j(long j10) {
        if (j10 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) C5015h.s(h(j10))) + " x " + ((Object) C5015h.s(g(j10)));
    }

    public boolean equals(Object obj) {
        return e(this.f48559a, obj);
    }

    public int hashCode() {
        return i(this.f48559a);
    }

    public final /* synthetic */ long k() {
        return this.f48559a;
    }

    public String toString() {
        return j(this.f48559a);
    }

    public static long d(long j10) {
        return j10;
    }
}
