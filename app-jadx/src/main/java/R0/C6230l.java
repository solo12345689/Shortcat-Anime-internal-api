package r0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: r0.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6230l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f58350b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f58351c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f58352d = d(9205357640488583168L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f58353a;

    /* JADX INFO: renamed from: r0.l$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return C6230l.f58352d;
        }

        public final long b() {
            return C6230l.f58351c;
        }

        private a() {
        }
    }

    private /* synthetic */ C6230l(long j10) {
        this.f58353a = j10;
    }

    public static final /* synthetic */ C6230l c(long j10) {
        return new C6230l(j10);
    }

    public static boolean e(long j10, Object obj) {
        return (obj instanceof C6230l) && j10 == ((C6230l) obj).m();
    }

    public static final boolean f(long j10, long j11) {
        return j10 == j11;
    }

    public static final float g(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static final float h(long j10) {
        return Math.min(Float.intBitsToFloat((int) ((j10 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j10 & 2147483647L)));
    }

    public static final float i(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static int j(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean k(long j10) {
        return (j10 == 9205357640488583168L) | (Float.intBitsToFloat((int) (j10 >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j10 & 4294967295L)) <= 0.0f);
    }

    public static String l(long j10) {
        if (j10 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + AbstractC6221c.a(Float.intBitsToFloat((int) (j10 >> 32)), 1) + ", " + AbstractC6221c.a(Float.intBitsToFloat((int) (j10 & 4294967295L)), 1) + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f58353a, obj);
    }

    public int hashCode() {
        return j(this.f58353a);
    }

    public final /* synthetic */ long m() {
        return this.f58353a;
    }

    public String toString() {
        return l(this.f58353a);
    }

    public static long d(long j10) {
        return j10;
    }
}
