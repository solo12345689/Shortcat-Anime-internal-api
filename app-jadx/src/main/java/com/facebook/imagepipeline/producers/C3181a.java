package com.facebook.imagepipeline.producers;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3181a implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f36145a;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class C0605a extends AbstractC3199t {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC3183c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(E6.k kVar, int i10) {
            if (kVar == null) {
                p().c(null, i10);
                return;
            }
            if (!E6.k.O(kVar)) {
                kVar.h0();
            }
            p().c(kVar, i10);
        }

        private C0605a(InterfaceC3194n interfaceC3194n) {
            super(interfaceC3194n);
        }
    }

    public C3181a(d0 d0Var) {
        this.f36145a = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC3194n interfaceC3194n, e0 e0Var) {
        this.f36145a.a(new C0605a(interfaceC3194n), e0Var);
    }
}
