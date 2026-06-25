package w;

/* JADX INFO: renamed from: w.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6901g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f62519a = Float.MAX_VALUE;

    public static final long a(float f10, float f11) {
        return U.a((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static final float b() {
        return f62519a;
    }
}
