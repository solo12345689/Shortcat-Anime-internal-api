package Pe;

import kotlin.jvm.internal.AbstractC5504s;
import qf.AbstractC6175A;
import qf.AbstractC6183d0;
import qf.InterfaceC6177a0;
import qf.J0;
import qf.L0;
import qf.M0;
import vf.AbstractC6867d;

/* JADX INFO: renamed from: Pe.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2025j extends AbstractC6175A implements InterfaceC6177a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC6183d0 f13896b;

    public C2025j(AbstractC6183d0 delegate) {
        AbstractC5504s.h(delegate, "delegate");
        this.f13896b = delegate;
    }

    private final AbstractC6183d0 Z0(AbstractC6183d0 abstractC6183d0) {
        AbstractC6183d0 abstractC6183d0R0 = abstractC6183d0.R0(false);
        return !AbstractC6867d.y(abstractC6183d0) ? abstractC6183d0R0 : new C2025j(abstractC6183d0R0);
    }

    @Override // qf.InterfaceC6212w
    public boolean F0() {
        return true;
    }

    @Override // qf.AbstractC6175A, qf.S
    public boolean O0() {
        return false;
    }

    @Override // qf.InterfaceC6212w
    public qf.S T(qf.S replacement) {
        AbstractC5504s.h(replacement, "replacement");
        M0 m0Q0 = replacement.Q0();
        if (!AbstractC6867d.y(m0Q0) && !J0.l(m0Q0)) {
            return m0Q0;
        }
        if (m0Q0 instanceof AbstractC6183d0) {
            return Z0((AbstractC6183d0) m0Q0);
        }
        if (!(m0Q0 instanceof qf.I)) {
            throw new Td.r();
        }
        qf.I i10 = (qf.I) m0Q0;
        return L0.d(qf.V.e(Z0(i10.V0()), Z0(i10.W0())), L0.a(m0Q0));
    }

    @Override // qf.M0
    /* JADX INFO: renamed from: U0 */
    public AbstractC6183d0 R0(boolean z10) {
        return z10 ? W0().R0(true) : this;
    }

    @Override // qf.AbstractC6175A
    protected AbstractC6183d0 W0() {
        return this.f13896b;
    }

    @Override // qf.AbstractC6183d0
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C2025j T0(qf.r0 newAttributes) {
        AbstractC5504s.h(newAttributes, "newAttributes");
        return new C2025j(W0().T0(newAttributes));
    }

    @Override // qf.AbstractC6175A
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C2025j Y0(AbstractC6183d0 delegate) {
        AbstractC5504s.h(delegate, "delegate");
        return new C2025j(delegate);
    }
}
