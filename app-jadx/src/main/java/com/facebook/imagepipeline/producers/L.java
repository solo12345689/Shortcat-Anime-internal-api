package com.facebook.imagepipeline.producers;

import java.io.InputStream;
import java.util.concurrent.Executor;
import y5.AbstractC7204b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class L implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f36070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B5.i f36071b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends m0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ K6.b f36072f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ g0 f36073g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ e0 f36074h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3194n interfaceC3194n, g0 g0Var, e0 e0Var, String str, K6.b bVar, g0 g0Var2, e0 e0Var2) {
            super(interfaceC3194n, g0Var, e0Var, str);
            this.f36072f = bVar;
            this.f36073g = g0Var2;
            this.f36074h = e0Var2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // w5.h
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(E6.k kVar) {
            E6.k.g(kVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // w5.h
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public E6.k c() {
            E6.k kVarD = L.this.d(this.f36072f);
            if (kVarD == null) {
                this.f36073g.b(this.f36074h, L.this.f(), false);
                this.f36074h.h("local", "fetch");
                return null;
            }
            kVarD.h0();
            this.f36073g.b(this.f36074h, L.this.f(), true);
            this.f36074h.h("local", "fetch");
            this.f36074h.k("image_color_space", kVarD.l());
            return kVarD;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends AbstractC3186f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0 f36076a;

        b(m0 m0Var) {
            this.f36076a = m0Var;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void b() {
            this.f36076a.a();
        }
    }

    protected L(Executor executor, B5.i iVar) {
        this.f36070a = executor;
        this.f36071b = iVar;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC3194n interfaceC3194n, e0 e0Var) {
        g0 g0VarM = e0Var.m();
        K6.b bVarQ = e0Var.q();
        e0Var.h("local", "fetch");
        a aVar = new a(interfaceC3194n, g0VarM, e0Var, f(), bVarQ, g0VarM, e0Var);
        e0Var.b(new b(aVar));
        this.f36070a.execute(aVar);
    }

    protected E6.k c(InputStream inputStream, int i10) {
        C5.a aVarJ = null;
        try {
            aVarJ = i10 <= 0 ? C5.a.J(this.f36071b.a(inputStream)) : C5.a.J(this.f36071b.b(inputStream, i10));
            E6.k kVar = new E6.k(aVarJ);
            AbstractC7204b.b(inputStream);
            C5.a.m(aVarJ);
            return kVar;
        } catch (Throwable th2) {
            AbstractC7204b.b(inputStream);
            C5.a.m(aVarJ);
            throw th2;
        }
    }

    protected abstract E6.k d(K6.b bVar);

    protected E6.k e(InputStream inputStream, int i10) {
        return c(inputStream, i10);
    }

    protected abstract String f();
}
