package qf;

import kotlin.jvm.internal.AbstractC5504s;
import rf.AbstractC6317g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class K extends I implements K0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final I f57993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final S f57994e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(I origin, S enhancement) {
        super(origin.V0(), origin.W0());
        AbstractC5504s.h(origin, "origin");
        AbstractC5504s.h(enhancement, "enhancement");
        this.f57993d = origin;
        this.f57994e = enhancement;
    }

    @Override // qf.M0
    public M0 R0(boolean z10) {
        return L0.d(H0().R0(z10), j0().Q0().R0(z10));
    }

    @Override // qf.M0
    public M0 T0(r0 newAttributes) {
        AbstractC5504s.h(newAttributes, "newAttributes");
        return L0.d(H0().T0(newAttributes), j0());
    }

    @Override // qf.I
    public AbstractC6183d0 U0() {
        return H0().U0();
    }

    @Override // qf.I
    public String X0(af.n renderer, af.w options) {
        AbstractC5504s.h(renderer, "renderer");
        AbstractC5504s.h(options, "options");
        return options.c() ? renderer.S(j0()) : H0().X0(renderer, options);
    }

    @Override // qf.K0
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public I H0() {
        return this.f57993d;
    }

    @Override // qf.M0
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public K X0(AbstractC6317g kotlinTypeRefiner) {
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        S sA = kotlinTypeRefiner.a(H0());
        AbstractC5504s.f(sA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new K((I) sA, kotlinTypeRefiner.a(j0()));
    }

    @Override // qf.K0
    public S j0() {
        return this.f57994e;
    }

    @Override // qf.I
    public String toString() {
        return "[@EnhancedForWarnings(" + j0() + ")] " + H0();
    }
}
