package B;

import Jf.A;
import Jf.t;
import Td.L;
import ae.AbstractC2605b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f781a = A.b(0, 16, If.a.f9115b, 1, null);

    @Override // B.m
    public boolean a(j jVar) {
        return b().c(jVar);
    }

    @Override // B.m
    public Object c(j jVar, Zd.e eVar) {
        Object objEmit = b().emit(jVar, eVar);
        return objEmit == AbstractC2605b.f() ? objEmit : L.f17438a;
    }

    @Override // B.k
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public t b() {
        return this.f781a;
    }
}
