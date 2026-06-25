package F;

import t.C6547M;
import t.Y;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6547M f6019a = Y.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6547M f6020b = Y.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f6021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f6022d;

    /* JADX INFO: Access modifiers changed from: private */
    public final long d(long j10, long j11) {
        if (j11 == 0) {
            return j10;
        }
        long j12 = 4;
        return ((j11 / j12) * ((long) 3)) + (j10 / j12);
    }

    public final long e() {
        return this.f6021c;
    }

    public final C6547M f() {
        return this.f6019a;
    }

    public final long g() {
        return this.f6022d;
    }

    public final C6547M h() {
        return this.f6020b;
    }
}
