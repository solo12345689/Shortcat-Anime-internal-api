package qf;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: qf.f0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class C6187f0 extends B {

    /* JADX INFO: renamed from: c */
    private final r0 f58051c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6187f0(AbstractC6183d0 delegate, r0 attributes) {
        super(delegate);
        AbstractC5504s.h(delegate, "delegate");
        AbstractC5504s.h(attributes, "attributes");
        this.f58051c = attributes;
    }

    @Override // qf.AbstractC6175A, qf.S
    public r0 M0() {
        return this.f58051c;
    }

    @Override // qf.AbstractC6175A
    /* JADX INFO: renamed from: Z0 */
    public C6187f0 Y0(AbstractC6183d0 delegate) {
        AbstractC5504s.h(delegate, "delegate");
        return new C6187f0(delegate, M0());
    }
}
