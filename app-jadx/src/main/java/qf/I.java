package qf;

import java.util.List;
import jf.InterfaceC5387k;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class I extends M0 implements uf.g {

    /* JADX INFO: renamed from: b */
    private final AbstractC6183d0 f57979b;

    /* JADX INFO: renamed from: c */
    private final AbstractC6183d0 f57980c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(AbstractC6183d0 lowerBound, AbstractC6183d0 upperBound) {
        super(null);
        AbstractC5504s.h(lowerBound, "lowerBound");
        AbstractC5504s.h(upperBound, "upperBound");
        this.f57979b = lowerBound;
        this.f57980c = upperBound;
    }

    @Override // qf.S
    public List L0() {
        return U0().L0();
    }

    @Override // qf.S
    public r0 M0() {
        return U0().M0();
    }

    @Override // qf.S
    public v0 N0() {
        return U0().N0();
    }

    @Override // qf.S
    public boolean O0() {
        return U0().O0();
    }

    public abstract AbstractC6183d0 U0();

    public final AbstractC6183d0 V0() {
        return this.f57979b;
    }

    public final AbstractC6183d0 W0() {
        return this.f57980c;
    }

    public abstract String X0(af.n nVar, af.w wVar);

    @Override // qf.S
    public InterfaceC5387k o() {
        return U0().o();
    }

    public String toString() {
        return af.n.f23996k.S(this);
    }
}
