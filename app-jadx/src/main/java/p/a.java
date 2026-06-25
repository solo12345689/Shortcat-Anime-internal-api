package P;

import i1.InterfaceC5011d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0211a f13180a = new C0211a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f13181b = b(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: P.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0211a {
        public /* synthetic */ C0211a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return a.f13181b;
        }

        private C0211a() {
        }
    }

    public static long b(float f10, float f11) {
        return c((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static long d(InterfaceC5011d interfaceC5011d) {
        return b(interfaceC5011d.getDensity(), interfaceC5011d.j1());
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final float f(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float g(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static String h(long j10) {
        return "InlineDensity(density=" + f(j10) + ", fontScale=" + g(j10) + ')';
    }

    private static long c(long j10) {
        return j10;
    }
}
