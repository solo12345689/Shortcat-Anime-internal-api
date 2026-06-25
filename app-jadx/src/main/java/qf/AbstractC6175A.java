package qf;

import java.util.List;
import jf.InterfaceC5387k;
import kotlin.jvm.internal.AbstractC5504s;
import rf.AbstractC6317g;

/* JADX INFO: renamed from: qf.A */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6175A extends AbstractC6183d0 {
    @Override // qf.S
    public List L0() {
        return W0().L0();
    }

    @Override // qf.S
    public r0 M0() {
        return W0().M0();
    }

    @Override // qf.S
    public v0 N0() {
        return W0().N0();
    }

    @Override // qf.S
    public boolean O0() {
        return W0().O0();
    }

    protected abstract AbstractC6183d0 W0();

    @Override // qf.M0
    public AbstractC6183d0 X0(AbstractC6317g kotlinTypeRefiner) {
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        S sA = kotlinTypeRefiner.a(W0());
        AbstractC5504s.f(sA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return Y0((AbstractC6183d0) sA);
    }

    public abstract AbstractC6175A Y0(AbstractC6183d0 abstractC6183d0);

    @Override // qf.S
    public InterfaceC5387k o() {
        return W0().o();
    }
}
