package k3;

import t2.C6609I;
import t2.O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC5441b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f52046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f52047b;

    private g(long j10, long j11) {
        this.f52046a = j10;
        this.f52047b = j11;
    }

    static g d(C6609I c6609i, long j10, O o10) {
        long jE = e(c6609i, j10);
        return new g(jE, o10.b(jE));
    }

    static long e(C6609I c6609i, long j10) {
        long jM = c6609i.M();
        if ((128 & jM) != 0) {
            return 8589934591L & ((((jM & 1) << 32) | c6609i.O()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // k3.AbstractC5441b
    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f52046a + ", playbackPositionUs= " + this.f52047b + " }";
    }
}
