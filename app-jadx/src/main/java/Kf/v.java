package Kf;

import Jf.InterfaceC1743f;
import Td.L;
import ae.AbstractC2605b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class v implements InterfaceC1743f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final If.w f11133a;

    public v(If.w wVar) {
        this.f11133a = wVar;
    }

    @Override // Jf.InterfaceC1743f
    public Object emit(Object obj, Zd.e eVar) {
        Object objE = this.f11133a.e(obj, eVar);
        return objE == AbstractC2605b.f() ? objE : L.f17438a;
    }
}
