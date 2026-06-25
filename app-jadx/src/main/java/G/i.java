package G;

import F.InterfaceC1540k;
import I0.K;
import Ud.AbstractC2279u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements InterfaceC1540k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C f6847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6848b;

    public i(C c10, int i10) {
        this.f6847a = c10;
        this.f6848b = i10;
    }

    @Override // F.InterfaceC1540k
    public int a() {
        return this.f6847a.F();
    }

    @Override // F.InterfaceC1540k
    public void b() {
        K kO = this.f6847a.O();
        if (kO != null) {
            kO.i();
        }
    }

    @Override // F.InterfaceC1540k
    public boolean c() {
        return !this.f6847a.C().i().isEmpty();
    }

    @Override // F.InterfaceC1540k
    public int d() {
        return Math.max(0, this.f6847a.y() - this.f6848b);
    }

    @Override // F.InterfaceC1540k
    public int e() {
        return Math.min(a() - 1, ((f) AbstractC2279u.y0(this.f6847a.C().i())).getIndex() + this.f6848b);
    }
}
