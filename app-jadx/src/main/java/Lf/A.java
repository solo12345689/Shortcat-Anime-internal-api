package Lf;

import Gf.AbstractC1597a;
import ae.AbstractC2605b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class A extends AbstractC1597a implements kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Zd.e f11545d;

    public A(Zd.i iVar, Zd.e eVar) {
        super(iVar, true, true);
        this.f11545d = eVar;
    }

    @Override // Gf.AbstractC1597a
    protected void Q0(Object obj) {
        Zd.e eVar = this.f11545d;
        eVar.resumeWith(Gf.E.a(obj, eVar));
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final kotlin.coroutines.jvm.internal.e getCallerFrame() {
        Zd.e eVar = this.f11545d;
        if (eVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) eVar;
        }
        return null;
    }

    @Override // Gf.I0
    protected final boolean n0() {
        return true;
    }

    @Override // Gf.I0
    protected void t(Object obj) {
        AbstractC1903j.b(AbstractC2605b.c(this.f11545d), Gf.E.a(obj, this.f11545d));
    }

    public void U0() {
    }
}
