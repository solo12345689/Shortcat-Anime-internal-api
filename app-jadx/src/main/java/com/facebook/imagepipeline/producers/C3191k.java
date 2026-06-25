package com.facebook.imagepipeline.producers;

import K6.b;
import s5.InterfaceC6433d;
import x6.C7059d;
import z6.InterfaceC7289c;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3191k implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x6.x f36203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y5.n f36204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x6.k f36205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d0 f36206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C7059d f36207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C7059d f36208f;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.k$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a extends AbstractC3199t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e0 f36209c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final x6.x f36210d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final y5.n f36211e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final x6.k f36212f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final C7059d f36213g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final C7059d f36214h;

        public a(InterfaceC3194n interfaceC3194n, e0 e0Var, x6.x xVar, y5.n nVar, x6.k kVar, C7059d c7059d, C7059d c7059d2) {
            super(interfaceC3194n);
            this.f36209c = e0Var;
            this.f36210d = xVar;
            this.f36211e = nVar;
            this.f36212f = kVar;
            this.f36213g = c7059d;
            this.f36214h = c7059d2;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3183c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(C5.a aVar, int i10) {
            try {
                if (L6.b.d()) {
                    L6.b.a("BitmapProbeProducer#onNewResultImpl");
                }
                if (!AbstractC3183c.f(i10) && aVar != null && !AbstractC3183c.m(i10, 8)) {
                    K6.b bVarQ = this.f36209c.q();
                    InterfaceC6433d interfaceC6433dD = this.f36212f.d(bVarQ, this.f36209c.a());
                    String str = (String) this.f36209c.C("origin");
                    if (str != null && str.equals("memory_bitmap")) {
                        if (this.f36209c.g().G().E() && !this.f36213g.b(interfaceC6433dD)) {
                            this.f36210d.b(interfaceC6433dD);
                            this.f36213g.a(interfaceC6433dD);
                        }
                        if (this.f36209c.g().G().C() && !this.f36214h.b(interfaceC6433dD)) {
                            boolean z10 = bVarQ.c() == b.EnumC0172b.SMALL;
                            InterfaceC7289c interfaceC7289c = (InterfaceC7289c) this.f36211e.get();
                            (z10 ? interfaceC7289c.a() : interfaceC7289c.b()).f(interfaceC6433dD);
                            this.f36214h.a(interfaceC6433dD);
                        }
                    }
                    p().c(aVar, i10);
                    if (L6.b.d()) {
                        L6.b.b();
                        return;
                    }
                    return;
                }
                p().c(aVar, i10);
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

    public C3191k(x6.x xVar, y5.n nVar, x6.k kVar, C7059d c7059d, C7059d c7059d2, d0 d0Var) {
        this.f36203a = xVar;
        this.f36204b = nVar;
        this.f36205c = kVar;
        this.f36207e = c7059d;
        this.f36208f = c7059d2;
        this.f36206d = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC3194n interfaceC3194n, e0 e0Var) {
        try {
            if (L6.b.d()) {
                L6.b.a("BitmapProbeProducer#produceResults");
            }
            g0 g0VarM = e0Var.m();
            g0VarM.d(e0Var, c());
            a aVar = new a(interfaceC3194n, e0Var, this.f36203a, this.f36204b, this.f36205c, this.f36207e, this.f36208f);
            g0VarM.j(e0Var, "BitmapProbeProducer", null);
            if (L6.b.d()) {
                L6.b.a("mInputProducer.produceResult");
            }
            this.f36206d.a(aVar, e0Var);
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
        return "BitmapProbeProducer";
    }
}
