package com.facebook.imagepipeline.producers;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class t0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u0[] f36297a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class a extends AbstractC3199t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e0 f36298c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f36299d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final y6.g f36300e;

        public a(InterfaceC3194n interfaceC3194n, e0 e0Var, int i10) {
            super(interfaceC3194n);
            this.f36298c = e0Var;
            this.f36299d = i10;
            this.f36300e = e0Var.q().r();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3199t, com.facebook.imagepipeline.producers.AbstractC3183c
        protected void h(Throwable th2) {
            if (t0.this.e(this.f36299d + 1, p(), this.f36298c)) {
                return;
            }
            p().a(th2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC3183c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(E6.k kVar, int i10) {
            if (kVar != null && (AbstractC3183c.f(i10) || v0.c(kVar, this.f36300e))) {
                p().c(kVar, i10);
            } else if (AbstractC3183c.e(i10)) {
                E6.k.g(kVar);
                if (t0.this.e(this.f36299d + 1, p(), this.f36298c)) {
                    return;
                }
                p().c(null, 1);
            }
        }
    }

    public t0(u0... u0VarArr) {
        u0[] u0VarArr2 = (u0[]) y5.k.g(u0VarArr);
        this.f36297a = u0VarArr2;
        y5.k.e(0, u0VarArr2.length);
    }

    private int d(int i10, y6.g gVar) {
        while (true) {
            u0[] u0VarArr = this.f36297a;
            if (i10 >= u0VarArr.length) {
                return -1;
            }
            if (u0VarArr[i10].b(gVar)) {
                return i10;
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(int i10, InterfaceC3194n interfaceC3194n, e0 e0Var) {
        int iD = d(i10, e0Var.q().r());
        if (iD == -1) {
            return false;
        }
        this.f36297a[iD].a(new a(interfaceC3194n, e0Var, iD), e0Var);
        return true;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC3194n interfaceC3194n, e0 e0Var) {
        if (e0Var.q().r() == null) {
            interfaceC3194n.c(null, 1);
        } else {
            if (e(0, interfaceC3194n, e0Var)) {
                return;
            }
            interfaceC3194n.c(null, 1);
        }
    }
}
