package com.facebook.imagepipeline.producers;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3192l implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f36231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f36232b;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.l$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class a extends AbstractC3199t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e0 f36233c;

        @Override // com.facebook.imagepipeline.producers.AbstractC3199t, com.facebook.imagepipeline.producers.AbstractC3183c
        protected void h(Throwable th2) {
            C3192l.this.f36232b.a(p(), this.f36233c);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC3183c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(E6.k kVar, int i10) {
            K6.b bVarQ = this.f36233c.q();
            boolean zE = AbstractC3183c.e(i10);
            boolean zC = v0.c(kVar, bVarQ.r());
            if (kVar != null && (zC || bVarQ.j())) {
                if (zE && zC) {
                    p().c(kVar, i10);
                } else {
                    p().c(kVar, AbstractC3183c.o(i10, 1));
                }
            }
            if (!zE || zC || bVarQ.i()) {
                return;
            }
            E6.k.g(kVar);
            C3192l.this.f36232b.a(p(), this.f36233c);
        }

        private a(InterfaceC3194n interfaceC3194n, e0 e0Var) {
            super(interfaceC3194n);
            this.f36233c = e0Var;
        }
    }

    public C3192l(d0 d0Var, d0 d0Var2) {
        this.f36231a = d0Var;
        this.f36232b = d0Var2;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC3194n interfaceC3194n, e0 e0Var) {
        this.f36231a.a(new a(interfaceC3194n, e0Var), e0Var);
    }
}
