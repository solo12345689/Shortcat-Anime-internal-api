package Gf;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class c1 extends Lf.A implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7554e;

    public c1(long j10, Zd.e eVar) {
        super(eVar.getContext(), eVar);
        this.f7554e = j10;
    }

    @Override // java.lang.Runnable
    public void run() {
        x(d1.a(this.f7554e, Z.c(getContext()), this));
    }

    @Override // Gf.AbstractC1597a, Gf.I0
    public String t0() {
        return super.t0() + "(timeMillis=" + this.f7554e + ')';
    }
}
