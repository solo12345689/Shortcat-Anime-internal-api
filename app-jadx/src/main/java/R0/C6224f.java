package r0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: r0.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6224f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f58329b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f58330c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f58331d = e(9187343241974906880L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f58332e = e(9205357640488583168L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f58333a;

    /* JADX INFO: renamed from: r0.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return C6224f.f58331d;
        }

        public final long b() {
            return C6224f.f58332e;
        }

        public final long c() {
            return C6224f.f58330c;
        }

        private a() {
        }
    }

    private /* synthetic */ C6224f(long j10) {
        this.f58333a = j10;
    }

    public static final /* synthetic */ C6224f d(long j10) {
        return new C6224f(j10);
    }

    public static final long f(long j10, float f10, float f11) {
        return e((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
    }

    public static /* synthetic */ long g(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if ((i10 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (4294967295L & j10));
        }
        return f(j10, f10, f11);
    }

    public static final long h(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) / f10;
        return e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static boolean i(long j10, Object obj) {
        return (obj instanceof C6224f) && j10 == ((C6224f) obj).u();
    }

    public static final boolean j(long j10, long j11) {
        return j10 == j11;
    }

    public static final float k(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (float) Math.sqrt((fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2));
    }

    public static final float l(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2);
    }

    public static final float m(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float n(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static int o(long j10) {
        return Long.hashCode(j10);
    }

    public static final long p(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - Float.intBitsToFloat((int) (j11 & 4294967295L));
        return e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static final long q(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat((int) (j11 & 4294967295L));
        return e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static final long r(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * f10;
        return e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static String s(long j10) {
        if ((9223372034707292159L & j10) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + AbstractC6221c.a(Float.intBitsToFloat((int) (j10 >> 32)), 1) + ", " + AbstractC6221c.a(Float.intBitsToFloat((int) (j10 & 4294967295L)), 1) + ')';
    }

    public static final long t(long j10) {
        return e(j10 ^ (-9223372034707292160L));
    }

    public boolean equals(Object obj) {
        return i(this.f58333a, obj);
    }

    public int hashCode() {
        return o(this.f58333a);
    }

    public String toString() {
        return s(this.f58333a);
    }

    public final /* synthetic */ long u() {
        return this.f58333a;
    }

    public static long e(long j10) {
        return j10;
    }
}
