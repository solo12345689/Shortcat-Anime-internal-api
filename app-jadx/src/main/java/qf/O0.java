package qf;

import java.util.List;
import jf.InterfaceC5387k;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class O0 extends S {
    public O0() {
        super(null);
    }

    @Override // qf.S
    public List L0() {
        return R0().L0();
    }

    @Override // qf.S
    public r0 M0() {
        return R0().M0();
    }

    @Override // qf.S
    public v0 N0() {
        return R0().N0();
    }

    @Override // qf.S
    public boolean O0() {
        return R0().O0();
    }

    @Override // qf.S
    public final M0 Q0() {
        S sR0 = R0();
        while (sR0 instanceof O0) {
            sR0 = ((O0) sR0).R0();
        }
        AbstractC5504s.f(sR0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (M0) sR0;
    }

    protected abstract S R0();

    public abstract boolean S0();

    @Override // qf.S
    public InterfaceC5387k o() {
        return R0().o();
    }

    public String toString() {
        return S0() ? R0().toString() : "<Not computed yet>";
    }
}
