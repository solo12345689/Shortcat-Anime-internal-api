package com.facebook.imagepipeline.producers;

import s5.InterfaceC6433d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x6.x f36146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x6.k f36147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f36148c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends AbstractC3199t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InterfaceC6433d f36149c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f36150d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final x6.x f36151e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f36152f;

        public a(InterfaceC3194n interfaceC3194n, InterfaceC6433d interfaceC6433d, boolean z10, x6.x xVar, boolean z11) {
            super(interfaceC3194n);
            this.f36149c = interfaceC6433d;
            this.f36150d = z10;
            this.f36151e = xVar;
            this.f36152f = z11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC3183c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(C5.a aVar, int i10) {
            if (aVar == null) {
                if (AbstractC3183c.e(i10)) {
                    p().c(null, i10);
                }
            } else if (!AbstractC3183c.f(i10) || this.f36150d) {
                C5.a aVarC = this.f36152f ? this.f36151e.c(this.f36149c, aVar) : null;
                try {
                    p().d(1.0f);
                    InterfaceC3194n interfaceC3194nP = p();
                    if (aVarC != null) {
                        aVar = aVarC;
                    }
                    interfaceC3194nP.c(aVar, i10);
                } finally {
                    C5.a.m(aVarC);
                }
            }
        }
    }

    public a0(x6.x xVar, x6.k kVar, d0 d0Var) {
        this.f36146a = xVar;
        this.f36147b = kVar;
        this.f36148c = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC3194n interfaceC3194n, e0 e0Var) {
        g0 g0VarM = e0Var.m();
        K6.b bVarQ = e0Var.q();
        Object objA = e0Var.a();
        K6.d dVarL = bVarQ.l();
        if (dVarL == null || dVarL.b() == null) {
            this.f36148c.a(interfaceC3194n, e0Var);
            return;
        }
        g0VarM.d(e0Var, c());
        InterfaceC6433d interfaceC6433dB = this.f36147b.b(bVarQ, objA);
        C5.a aVar = e0Var.q().y(1) ? this.f36146a.get(interfaceC6433dB) : null;
        if (aVar == null) {
            a aVar2 = new a(interfaceC3194n, interfaceC6433dB, false, this.f36146a, e0Var.q().y(2));
            g0VarM.j(e0Var, c(), g0VarM.f(e0Var, c()) ? y5.g.of("cached_value_found", com.amazon.a.a.o.b.f34641ag) : null);
            this.f36148c.a(aVar2, e0Var);
        } else {
            g0VarM.j(e0Var, c(), g0VarM.f(e0Var, c()) ? y5.g.of("cached_value_found", com.amazon.a.a.o.b.f34640af) : null);
            g0VarM.b(e0Var, "PostprocessedBitmapMemoryCacheProducer", true);
            e0Var.h("memory_bitmap", "postprocessed");
            interfaceC3194n.d(1.0f);
            interfaceC3194n.c(aVar, 1);
            aVar.close();
        }
    }

    protected String c() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }
}
