package E;

import F.InterfaceC1540k;
import Ud.AbstractC2279u;

/* JADX INFO: renamed from: E.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1286g implements InterfaceC1540k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I f3882a;

    public C1286g(I i10) {
        this.f3882a = i10;
    }

    @Override // F.InterfaceC1540k
    public int a() {
        return this.f3882a.s().g();
    }

    @Override // F.InterfaceC1540k
    public void b() {
        I0.K kY = this.f3882a.y();
        if (kY != null) {
            kY.i();
        }
    }

    @Override // F.InterfaceC1540k
    public boolean c() {
        return !this.f3882a.s().i().isEmpty();
    }

    @Override // F.InterfaceC1540k
    public int d() {
        return this.f3882a.o();
    }

    @Override // F.InterfaceC1540k
    public int e() {
        return ((InterfaceC1290k) AbstractC2279u.y0(this.f3882a.s().i())).getIndex();
    }
}
