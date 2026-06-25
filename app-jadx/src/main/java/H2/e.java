package H2;

import Q2.o;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f7719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f7720b;

    public e(l lVar, List list) {
        this.f7719a = lVar;
        this.f7720b = list;
    }

    @Override // H2.l
    public o.a a(i iVar, f fVar) {
        return new L2.b(this.f7719a.a(iVar, fVar), this.f7720b);
    }

    @Override // H2.l
    public o.a b() {
        return new L2.b(this.f7719a.b(), this.f7720b);
    }
}
