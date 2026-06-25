package qf;

import kotlin.jvm.internal.AbstractC5504s;
import rf.AbstractC6317g;

/* JADX INFO: renamed from: qf.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6189g0 extends AbstractC6175A implements K0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC6183d0 f58056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final S f58057c;

    public C6189g0(AbstractC6183d0 delegate, S enhancement) {
        AbstractC5504s.h(delegate, "delegate");
        AbstractC5504s.h(enhancement, "enhancement");
        this.f58056b = delegate;
        this.f58057c = enhancement;
    }

    @Override // qf.M0
    /* JADX INFO: renamed from: U0 */
    public AbstractC6183d0 R0(boolean z10) {
        M0 m0D = L0.d(H0().R0(z10), j0().Q0().R0(z10));
        AbstractC5504s.f(m0D, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (AbstractC6183d0) m0D;
    }

    @Override // qf.M0
    /* JADX INFO: renamed from: V0 */
    public AbstractC6183d0 T0(r0 newAttributes) {
        AbstractC5504s.h(newAttributes, "newAttributes");
        M0 m0D = L0.d(H0().T0(newAttributes), j0());
        AbstractC5504s.f(m0D, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (AbstractC6183d0) m0D;
    }

    @Override // qf.AbstractC6175A
    protected AbstractC6183d0 W0() {
        return this.f58056b;
    }

    @Override // qf.K0
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public AbstractC6183d0 H0() {
        return W0();
    }

    @Override // qf.AbstractC6175A
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C6189g0 X0(AbstractC6317g kotlinTypeRefiner) {
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        S sA = kotlinTypeRefiner.a(W0());
        AbstractC5504s.f(sA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C6189g0((AbstractC6183d0) sA, kotlinTypeRefiner.a(j0()));
    }

    @Override // qf.AbstractC6175A
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C6189g0 Y0(AbstractC6183d0 delegate) {
        AbstractC5504s.h(delegate, "delegate");
        return new C6189g0(delegate, j0());
    }

    @Override // qf.K0
    public S j0() {
        return this.f58057c;
    }

    @Override // qf.AbstractC6183d0
    public String toString() {
        return "[@EnhancedForWarnings(" + j0() + ")] " + H0();
    }
}
