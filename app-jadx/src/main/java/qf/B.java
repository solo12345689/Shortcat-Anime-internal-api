package qf;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class B extends AbstractC6175A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC6183d0 f57960b;

    public B(AbstractC6183d0 delegate) {
        AbstractC5504s.h(delegate, "delegate");
        this.f57960b = delegate;
    }

    @Override // qf.M0
    /* JADX INFO: renamed from: U0 */
    public AbstractC6183d0 R0(boolean z10) {
        return z10 == O0() ? this : W0().R0(z10).T0(M0());
    }

    @Override // qf.M0
    /* JADX INFO: renamed from: V0 */
    public AbstractC6183d0 T0(r0 newAttributes) {
        AbstractC5504s.h(newAttributes, "newAttributes");
        return newAttributes != M0() ? new C6187f0(this, newAttributes) : this;
    }

    @Override // qf.AbstractC6175A
    protected AbstractC6183d0 W0() {
        return this.f57960b;
    }
}
