package Jf;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class B extends Kf.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f9514a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Zd.e f9515b;

    @Override // Kf.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(z zVar) {
        if (this.f9514a >= 0) {
            return false;
        }
        this.f9514a = zVar.X();
        return true;
    }

    @Override // Kf.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Zd.e[] b(z zVar) {
        long j10 = this.f9514a;
        this.f9514a = -1L;
        this.f9515b = null;
        return zVar.W(j10);
    }
}
