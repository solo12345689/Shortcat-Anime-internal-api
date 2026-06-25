package u1;

import u1.f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f61171m;

    g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f61154e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f61154e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // u1.f
    public void d(int i10) {
        if (this.f61159j) {
            return;
        }
        this.f61159j = true;
        this.f61156g = i10;
        for (d dVar : this.f61160k) {
            dVar.a(dVar);
        }
    }
}
