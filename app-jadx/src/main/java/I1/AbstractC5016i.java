package i1;

import k1.AbstractC5437b;

/* JADX INFO: renamed from: i1.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5016i {
    public static final long a(float f10, float f11) {
        return C5017j.b((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static final long b(float f10, float f11) {
        return C5018k.d((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static final float c(float f10, float f11, float f12) {
        return C5015h.n(AbstractC5437b.b(f10, f11, f12));
    }
}
