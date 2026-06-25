package Jf;

import ae.AbstractC2605b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class x extends AbstractC1738a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function2 f9671a;

    public x(Function2 function2) {
        this.f9671a = function2;
    }

    @Override // Jf.AbstractC1738a
    public Object b(InterfaceC1743f interfaceC1743f, Zd.e eVar) {
        Object objInvoke = this.f9671a.invoke(interfaceC1743f, eVar);
        return objInvoke == AbstractC2605b.f() ? objInvoke : Td.L.f17438a;
    }
}
