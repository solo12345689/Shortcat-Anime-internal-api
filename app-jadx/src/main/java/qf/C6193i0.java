package qf;

import kotlin.jvm.internal.AbstractC5504s;
import rf.AbstractC6317g;

/* JADX INFO: renamed from: qf.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6193i0 extends C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S f58060a;

    public C6193i0(ve.i kotlinBuiltIns) {
        AbstractC5504s.h(kotlinBuiltIns, "kotlinBuiltIns");
        AbstractC6183d0 abstractC6183d0J = kotlinBuiltIns.J();
        AbstractC5504s.g(abstractC6183d0J, "getNullableAnyType(...)");
        this.f58060a = abstractC6183d0J;
    }

    @Override // qf.B0
    public boolean a() {
        return true;
    }

    @Override // qf.B0
    public N0 b() {
        return N0.f58001g;
    }

    @Override // qf.B0
    public S getType() {
        return this.f58060a;
    }

    @Override // qf.B0
    public B0 o(AbstractC6317g kotlinTypeRefiner) {
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}
