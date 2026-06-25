package Nf;

import Gf.K;
import Lf.AbstractC1906m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class k extends K {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f12876c = new k();

    private k() {
    }

    @Override // Gf.K
    public void D1(Zd.i iVar, Runnable runnable) {
        c.f12860i.d2(runnable, true, false);
    }

    @Override // Gf.K
    public void O1(Zd.i iVar, Runnable runnable) {
        c.f12860i.d2(runnable, true, true);
    }

    @Override // Gf.K
    public K Z1(int i10, String str) {
        AbstractC1906m.a(i10);
        return i10 >= j.f12873d ? AbstractC1906m.b(this, str) : super.Z1(i10, str);
    }

    @Override // Gf.K
    public String toString() {
        return "Dispatchers.IO";
    }
}
