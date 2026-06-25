package r3;

import P9.AbstractC2011u;
import P9.K;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class f implements j {

    /* JADX INFO: renamed from: c */
    private static final K f58498c = K.c().d(new O9.f() { // from class: r3.e
        @Override // O9.f
        public final Object apply(Object obj) {
            return Long.valueOf(f.f(((d) obj).f58495b));
        }
    });

    /* JADX INFO: renamed from: a */
    private final AbstractC2011u f58499a;

    /* JADX INFO: renamed from: b */
    private final long[] f58500b;

    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(java.util.List r15) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.f.<init>(java.util.List):void");
    }

    private static long f(long j10) {
        if (j10 == -9223372036854775807L) {
            return 0L;
        }
        return j10;
    }

    @Override // r3.j
    public int a(long j10) {
        int iG = a0.g(this.f58500b, j10, false, false);
        if (iG < this.f58499a.size()) {
            return iG;
        }
        return -1;
    }

    @Override // r3.j
    public long c(int i10) {
        AbstractC6614a.a(i10 < this.f58499a.size());
        return this.f58500b[i10];
    }

    @Override // r3.j
    /* JADX INFO: renamed from: e */
    public AbstractC2011u b(long j10) {
        int iK = a0.k(this.f58500b, j10, true, false);
        return iK == -1 ? AbstractC2011u.A() : (AbstractC2011u) this.f58499a.get(iK);
    }

    @Override // r3.j
    public int h() {
        return this.f58499a.size();
    }
}
