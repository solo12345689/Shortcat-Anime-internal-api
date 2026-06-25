package D;

import F.InterfaceC1540k;
import I0.K;
import Ud.AbstractC2279u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements InterfaceC1540k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B f3381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3382b;

    public h(B b10, int i10) {
        this.f3381a = b10;
        this.f3382b = i10;
    }

    @Override // F.InterfaceC1540k
    public int a() {
        return this.f3381a.u().g();
    }

    @Override // F.InterfaceC1540k
    public void b() {
        K kB = this.f3381a.B();
        if (kB != null) {
            kB.i();
        }
    }

    @Override // F.InterfaceC1540k
    public boolean c() {
        return !this.f3381a.u().i().isEmpty();
    }

    @Override // F.InterfaceC1540k
    public int d() {
        return Math.max(0, this.f3381a.p() - this.f3382b);
    }

    @Override // F.InterfaceC1540k
    public int e() {
        return Math.min(a() - 1, ((l) AbstractC2279u.y0(this.f3381a.u().i())).getIndex() + this.f3382b);
    }
}
