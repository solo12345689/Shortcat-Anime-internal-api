package Gf;

import ae.AbstractC2605b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class K0 extends X {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Zd.e f7521d;

    public K0(Zd.i iVar, Function2 function2) {
        super(iVar, false);
        this.f7521d = AbstractC2605b.a(function2, this, this);
    }

    @Override // Gf.I0
    protected void z0() throws Throwable {
        Mf.a.b(this.f7521d, this);
    }
}
