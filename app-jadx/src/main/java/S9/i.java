package S9;

import O9.n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public static byte a(long j10) {
        n.g((j10 >> 8) == 0, "out of range: %s", j10);
        return (byte) j10;
    }

    public static int b(byte b10) {
        return b10 & 255;
    }
}
