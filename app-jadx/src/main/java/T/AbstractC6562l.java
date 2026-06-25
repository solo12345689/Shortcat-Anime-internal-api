package t;

/* JADX INFO: renamed from: t.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6562l {
    public static long a(int i10, int i11) {
        return b((((long) i11) & 4294967295L) | (((long) i10) << 32));
    }

    public static final int c(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int d(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static long b(long j10) {
        return j10;
    }
}
