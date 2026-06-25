package com.facebook.imagepipeline.producers;

import K6.b;
import s5.InterfaceC6433d;
import x6.C7059d;
import z6.InterfaceC7289c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class A implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y5.n f36006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x6.k f36007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f36008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C7059d f36009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C7059d f36010e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a extends AbstractC3199t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e0 f36011c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final y5.n f36012d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final x6.k f36013e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final C7059d f36014f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final C7059d f36015g;

        public a(InterfaceC3194n interfaceC3194n, e0 e0Var, y5.n nVar, x6.k kVar, C7059d c7059d, C7059d c7059d2) {
            super(interfaceC3194n);
            this.f36011c = e0Var;
            this.f36012d = nVar;
            this.f36013e = kVar;
            this.f36014f = c7059d;
            this.f36015g = c7059d2;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3183c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(E6.k kVar, int i10) {
            try {
                if (L6.b.d()) {
                    L6.b.a("EncodedProbeProducer#onNewResultImpl");
                }
                if (!AbstractC3183c.f(i10) && kVar != null && !AbstractC3183c.m(i10, 10) && kVar.o() != q6.c.f57672d) {
                    K6.b bVarQ = this.f36011c.q();
                    InterfaceC6433d interfaceC6433dD = this.f36013e.d(bVarQ, this.f36011c.a());
                    this.f36014f.a(interfaceC6433dD);
                    if ("memory_encoded".equals(this.f36011c.C("origin"))) {
                        if (!this.f36015g.b(interfaceC6433dD)) {
                            boolean z10 = bVarQ.c() == b.EnumC0172b.SMALL;
                            InterfaceC7289c interfaceC7289c = (InterfaceC7289c) this.f36012d.get();
                            (z10 ? interfaceC7289c.a() : interfaceC7289c.b()).f(interfaceC6433dD);
                            this.f36015g.a(interfaceC6433dD);
                        }
                    } else if ("disk".equals(this.f36011c.C("origin"))) {
                        this.f36015g.a(interfaceC6433dD);
                    }
                    p().c(kVar, i10);
                    if (L6.b.d()) {
                        L6.b.b();
                        return;
                    }
                    return;
                }
                p().c(kVar, i10);
                if (L6.b.d()) {
                    L6.b.b();
                }
            } catch (Throwable th2) {
                if (L6.b.d()) {
                    L6.b.b();
                }
                throw th2;
            }
        }
    }

    public A(y5.n nVar, x6.k kVar, C7059d c7059d, C7059d c7059d2, d0 d0Var) {
        this.f36006a = nVar;
        this.f36007b = kVar;
        this.f36009d = c7059d;
        this.f36010e = c7059d2;
        this.f36008c = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC3194n interfaceC3194n, e0 e0Var) {
        try {
            if (L6.b.d()) {
                L6.b.a("EncodedProbeProducer#produceResults");
            }
            g0 g0VarM = e0Var.m();
            g0VarM.d(e0Var, c());
            a aVar = new a(interfaceC3194n, e0Var, this.f36006a, this.f36007b, this.f36009d, this.f36010e);
            g0VarM.j(e0Var, "EncodedProbeProducer", null);
            if (L6.b.d()) {
                L6.b.a("mInputProducer.produceResult");
            }
            this.f36008c.a(aVar, e0Var);
            if (L6.b.d()) {
                L6.b.b();
            }
            if (L6.b.d()) {
                L6.b.b();
            }
        } finally {
        }
    }

    protected String c() {
        return "EncodedProbeProducer";
    }
}
