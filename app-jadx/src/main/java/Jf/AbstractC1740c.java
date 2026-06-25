package Jf;

import ae.AbstractC2605b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Jf.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
abstract class AbstractC1740c extends Kf.e {

    /* JADX INFO: renamed from: d */
    private final Function2 f9568d;

    public AbstractC1740c(Function2 function2, Zd.i iVar, int i10, If.a aVar) {
        super(iVar, i10, aVar);
        this.f9568d = function2;
    }

    static /* synthetic */ Object n(AbstractC1740c abstractC1740c, If.u uVar, Zd.e eVar) {
        Object objInvoke = abstractC1740c.f9568d.invoke(uVar, eVar);
        return objInvoke == AbstractC2605b.f() ? objInvoke : Td.L.f17438a;
    }

    @Override // Kf.e
    protected Object g(If.u uVar, Zd.e eVar) {
        return n(this, uVar, eVar);
    }

    @Override // Kf.e
    public String toString() {
        return "block[" + this.f9568d + "] -> " + super.toString();
    }
}
