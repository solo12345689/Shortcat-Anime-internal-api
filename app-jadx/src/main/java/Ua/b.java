package Ua;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final boolean a(float f10, float f11, float f12) {
        return Math.abs(f10 - f11) <= f12;
    }

    public static /* synthetic */ boolean b(float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f12 = 1.0E-4f;
        }
        return a(f10, f11, f12);
    }
}
