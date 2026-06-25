package com.facebook.imagepipeline.producers;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class n0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f36239a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends AbstractC3199t {
        a(InterfaceC3194n interfaceC3194n) {
            super(interfaceC3194n);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3183c
        protected void i(Object obj, int i10) {
            if (AbstractC3183c.e(i10)) {
                p().c(null, i10);
            }
        }
    }

    public n0(d0 d0Var) {
        this.f36239a = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC3194n interfaceC3194n, e0 e0Var) {
        this.f36239a.a(new a(interfaceC3194n), e0Var);
    }
}
