package Q8;

import P8.a;
import Q8.r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class W extends r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ r.a f14446d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    W(r.a aVar, O8.c[] cVarArr, boolean z10, int i10) {
        super(cVarArr, z10, i10);
        this.f14446d = aVar;
    }

    @Override // Q8.r
    protected final void b(a.b bVar, n9.j jVar) {
        this.f14446d.f14507a.accept(bVar, jVar);
    }
}
