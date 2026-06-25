package M2;

import q2.C6071C;
import q2.Y;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends AbstractC1932w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C6071C f11994f;

    public k0(q2.Y y10, C6071C c6071c) {
        super(y10);
        this.f11994f = c6071c;
    }

    @Override // M2.AbstractC1932w, q2.Y
    public Y.d s(int i10, Y.d dVar, long j10) {
        super.s(i10, dVar, j10);
        C6071C c6071c = this.f11994f;
        dVar.f56680c = c6071c;
        C6071C.h hVar = c6071c.f56328b;
        dVar.f56679b = hVar != null ? hVar.f56437i : null;
        return dVar;
    }
}
