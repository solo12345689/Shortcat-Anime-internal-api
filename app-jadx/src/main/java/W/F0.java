package w;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class F0 implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f62357a;

    public F0(int i10) {
        this.f62357a = i10;
    }

    @Override // w.y0
    public int c() {
        return 0;
    }

    @Override // w.v0
    public AbstractC6913q d(long j10, AbstractC6913q abstractC6913q, AbstractC6913q abstractC6913q2, AbstractC6913q abstractC6913q3) {
        return j10 < ((long) f()) * 1000000 ? abstractC6913q : abstractC6913q2;
    }

    @Override // w.y0
    public int f() {
        return this.f62357a;
    }

    @Override // w.v0
    public AbstractC6913q e(long j10, AbstractC6913q abstractC6913q, AbstractC6913q abstractC6913q2, AbstractC6913q abstractC6913q3) {
        return abstractC6913q3;
    }
}
