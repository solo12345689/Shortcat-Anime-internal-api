package N2;

import q2.C6109x;
import t2.AbstractC6614a;
import w2.InterfaceC6940g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f12659j;

    public m(InterfaceC6940g interfaceC6940g, w2.o oVar, C6109x c6109x, int i10, Object obj, long j10, long j11, long j12) {
        super(interfaceC6940g, oVar, 1, c6109x, i10, obj, j10, j11);
        AbstractC6614a.e(c6109x);
        this.f12659j = j12;
    }

    public long g() {
        long j10 = this.f12659j;
        if (j10 != -1) {
            return j10 + 1;
        }
        return -1L;
    }

    public abstract boolean h();
}
