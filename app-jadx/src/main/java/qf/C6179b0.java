package qf;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: qf.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class C6179b0 extends B {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6179b0(AbstractC6183d0 delegate) {
        super(delegate);
        AbstractC5504s.h(delegate, "delegate");
    }

    @Override // qf.AbstractC6175A, qf.S
    public boolean O0() {
        return true;
    }

    @Override // qf.AbstractC6175A
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public C6179b0 Y0(AbstractC6183d0 delegate) {
        AbstractC5504s.h(delegate, "delegate");
        return new C6179b0(delegate);
    }
}
