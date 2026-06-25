package r0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: r0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6219a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0883a f58323a = new C0883a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f58324b = b(0);

    /* JADX INFO: renamed from: r0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0883a {
        public /* synthetic */ C0883a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return AbstractC6219a.f58324b;
        }

        private C0883a() {
        }
    }

    public static final boolean c(long j10, long j11) {
        return j10 == j11;
    }

    public static final float d(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float e(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static int f(long j10) {
        return Long.hashCode(j10);
    }

    public static String g(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11)) {
            return "CornerRadius.circular(" + AbstractC6221c.a(Float.intBitsToFloat(i10), 1) + ')';
        }
        return "CornerRadius.elliptical(" + AbstractC6221c.a(Float.intBitsToFloat(i10), 1) + ", " + AbstractC6221c.a(Float.intBitsToFloat(i11), 1) + ')';
    }

    public static long b(long j10) {
        return j10;
    }
}
