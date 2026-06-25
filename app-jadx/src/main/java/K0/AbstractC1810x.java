package K0;

/* JADX INFO: renamed from: K0.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1810x {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long a(float f10, boolean z10, boolean z11) {
        return r.b((((z10 ? 1L : 0L) | (z11 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f10)) << 32));
    }

    static /* synthetic */ long b(float f10, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return a(f10, z10, z11);
    }
}
