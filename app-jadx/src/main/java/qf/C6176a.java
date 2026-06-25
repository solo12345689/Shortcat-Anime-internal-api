package qf;

import kotlin.jvm.internal.AbstractC5504s;
import rf.AbstractC6317g;

/* JADX INFO: renamed from: qf.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6176a extends AbstractC6175A {

    /* JADX INFO: renamed from: b */
    private final AbstractC6183d0 f58034b;

    /* JADX INFO: renamed from: c */
    private final AbstractC6183d0 f58035c;

    public C6176a(AbstractC6183d0 delegate, AbstractC6183d0 abbreviation) {
        AbstractC5504s.h(delegate, "delegate");
        AbstractC5504s.h(abbreviation, "abbreviation");
        this.f58034b = delegate;
        this.f58035c = abbreviation;
    }

    public final AbstractC6183d0 G() {
        return W0();
    }

    @Override // qf.M0
    /* JADX INFO: renamed from: V0 */
    public AbstractC6183d0 T0(r0 newAttributes) {
        AbstractC5504s.h(newAttributes, "newAttributes");
        return new C6176a(W0().T0(newAttributes), this.f58035c);
    }

    @Override // qf.AbstractC6175A
    protected AbstractC6183d0 W0() {
        return this.f58034b;
    }

    public final AbstractC6183d0 Z0() {
        return this.f58035c;
    }

    @Override // qf.AbstractC6183d0
    /* JADX INFO: renamed from: a1 */
    public C6176a R0(boolean z10) {
        return new C6176a(W0().R0(z10), this.f58035c.R0(z10));
    }

    @Override // qf.AbstractC6175A
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C6176a X0(AbstractC6317g kotlinTypeRefiner) {
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        S sA = kotlinTypeRefiner.a(W0());
        AbstractC5504s.f(sA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        S sA2 = kotlinTypeRefiner.a(this.f58035c);
        AbstractC5504s.f(sA2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C6176a((AbstractC6183d0) sA, (AbstractC6183d0) sA2);
    }

    @Override // qf.AbstractC6175A
    /* JADX INFO: renamed from: c1 */
    public C6176a Y0(AbstractC6183d0 delegate) {
        AbstractC5504s.h(delegate, "delegate");
        return new C6176a(delegate, this.f58035c);
    }
}
