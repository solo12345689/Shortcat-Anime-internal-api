package i1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f48587b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f48588c = c(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f48589a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return y.f48588c;
        }

        private a() {
        }
    }

    private /* synthetic */ y(long j10) {
        this.f48589a = j10;
    }

    public static final /* synthetic */ y b(long j10) {
        return new y(j10);
    }

    public static final long d(long j10, float f10, float f11) {
        return c((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
    }

    public static /* synthetic */ long e(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if ((i10 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (4294967295L & j10));
        }
        return d(j10, f10, f11);
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof y) && j10 == ((y) obj).o();
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static final float h(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float i(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static int j(long j10) {
        return Long.hashCode(j10);
    }

    public static final long k(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - Float.intBitsToFloat((int) (j11 & 4294967295L));
        return c((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static final long l(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat((int) (j11 & 4294967295L));
        return c((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static final long m(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * f10;
        return c((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static String n(long j10) {
        return '(' + h(j10) + ", " + i(j10) + ") px/sec";
    }

    public boolean equals(Object obj) {
        return f(this.f48589a, obj);
    }

    public int hashCode() {
        return j(this.f48589a);
    }

    public final /* synthetic */ long o() {
        return this.f48589a;
    }

    public String toString() {
        return n(this.f48589a);
    }

    public static long c(long j10) {
        return j10;
    }
}
