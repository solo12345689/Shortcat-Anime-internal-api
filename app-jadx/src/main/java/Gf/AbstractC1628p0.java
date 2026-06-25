package Gf;

/* JADX INFO: renamed from: Gf.p0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1628p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lf.E f7605a = new Lf.E("REMOVED_TASK");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lf.E f7606b = new Lf.E("CLOSED_EMPTY");

    public static final long c(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j10 * 1000000;
    }
}
