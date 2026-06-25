package t0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: t0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6579b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f60193a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f60194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f60195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f60196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f60197e;

    /* JADX INFO: renamed from: t0.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return AbstractC6579b.f60196d;
        }

        public final long b() {
            return AbstractC6579b.f60194b;
        }

        public final long c() {
            return AbstractC6579b.f60195c;
        }

        private a() {
        }
    }

    static {
        long j10 = 3;
        long j11 = j10 << 32;
        f60194b = d((((long) 0) & 4294967295L) | j11);
        f60195c = d((((long) 1) & 4294967295L) | j11);
        f60196d = d(j11 | (((long) 2) & 4294967295L));
        f60197e = d((j10 & 4294967295L) | (((long) 4) << 32));
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final int f(long j10) {
        return (int) (j10 >> 32);
    }

    public static int g(long j10) {
        return Long.hashCode(j10);
    }

    public static String h(long j10) {
        return e(j10, f60194b) ? "Rgb" : e(j10, f60195c) ? "Xyz" : e(j10, f60196d) ? "Lab" : e(j10, f60197e) ? "Cmyk" : "Unknown";
    }

    public static long d(long j10) {
        return j10;
    }
}
