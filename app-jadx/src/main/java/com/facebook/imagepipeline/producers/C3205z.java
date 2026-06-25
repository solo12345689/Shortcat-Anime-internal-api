package com.facebook.imagepipeline.producers;

import K6.b;
import s5.InterfaceC6433d;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3205z implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x6.x f36320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x6.k f36321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f36322c;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.z$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a extends AbstractC3199t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final x6.x f36323c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final InterfaceC6433d f36324d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f36325e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f36326f;

        public a(InterfaceC3194n interfaceC3194n, x6.x xVar, InterfaceC6433d interfaceC6433d, boolean z10, boolean z11) {
            super(interfaceC3194n);
            this.f36323c = xVar;
            this.f36324d = interfaceC6433d;
            this.f36325e = z10;
            this.f36326f = z11;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3183c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(E6.k kVar, int i10) {
            try {
                if (L6.b.d()) {
                    L6.b.a("EncodedMemoryCacheProducer#onNewResultImpl");
                }
                if (!AbstractC3183c.f(i10) && kVar != null && !AbstractC3183c.m(i10, 10) && kVar.o() != q6.c.f57672d) {
                    C5.a aVarJ = kVar.j();
                    if (aVarJ != null) {
                        try {
                            C5.a aVarC = (this.f36326f && this.f36325e) ? this.f36323c.c(this.f36324d, aVarJ) : null;
                            if (aVarC != null) {
                                try {
                                    E6.k kVar2 = new E6.k(aVarC);
                                    kVar2.h(kVar);
                                    try {
                                        p().d(1.0f);
                                        p().c(kVar2, i10);
                                        if (L6.b.d()) {
                                            L6.b.b();
                                            return;
                                        }
                                        return;
                                    } finally {
                                        E6.k.g(kVar2);
                                    }
                                } finally {
                                    C5.a.m(aVarC);
                                }
                            }
                        } finally {
                            C5.a.m(aVarJ);
                        }
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

    public C3205z(x6.x xVar, x6.k kVar, d0 d0Var) {
        this.f36320a = xVar;
        this.f36321b = kVar;
        this.f36322c = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC3194n interfaceC3194n, e0 e0Var) {
        try {
            if (L6.b.d()) {
                L6.b.a("EncodedMemoryCacheProducer#produceResults");
            }
            g0 g0VarM = e0Var.m();
            g0VarM.d(e0Var, "EncodedMemoryCacheProducer");
            InterfaceC6433d interfaceC6433dD = this.f36321b.d(e0Var.q(), e0Var.a());
            C5.a aVar = e0Var.q().y(4) ? this.f36320a.get(interfaceC6433dD) : null;
            try {
                if (aVar != null) {
                    E6.k kVar = new E6.k(aVar);
                    try {
                        g0VarM.j(e0Var, "EncodedMemoryCacheProducer", g0VarM.f(e0Var, "EncodedMemoryCacheProducer") ? y5.g.of("cached_value_found", com.amazon.a.a.o.b.f34640af) : null);
                        g0VarM.b(e0Var, "EncodedMemoryCacheProducer", true);
                        e0Var.l("memory_encoded");
                        interfaceC3194n.d(1.0f);
                        interfaceC3194n.c(kVar, 1);
                        E6.k.g(kVar);
                        C5.a.m(aVar);
                        if (L6.b.d()) {
                            L6.b.b();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        E6.k.g(kVar);
                        throw th2;
                    }
                }
                if (e0Var.E().b() < b.c.ENCODED_MEMORY_CACHE.b()) {
                    a aVar2 = new a(interfaceC3194n, this.f36320a, interfaceC6433dD, e0Var.q().y(8), e0Var.g().G().D());
                    g0VarM.j(e0Var, "EncodedMemoryCacheProducer", g0VarM.f(e0Var, "EncodedMemoryCacheProducer") ? y5.g.of("cached_value_found", com.amazon.a.a.o.b.f34641ag) : null);
                    this.f36322c.a(aVar2, e0Var);
                    C5.a.m(aVar);
                    if (L6.b.d()) {
                        L6.b.b();
                        return;
                    }
                    return;
                }
                g0VarM.j(e0Var, "EncodedMemoryCacheProducer", g0VarM.f(e0Var, "EncodedMemoryCacheProducer") ? y5.g.of("cached_value_found", com.amazon.a.a.o.b.f34641ag) : null);
                g0VarM.b(e0Var, "EncodedMemoryCacheProducer", false);
                e0Var.h("memory_encoded", "nil-result");
                interfaceC3194n.c(null, 1);
                C5.a.m(aVar);
                if (L6.b.d()) {
                    L6.b.b();
                }
            } catch (Throwable th3) {
                C5.a.m(aVar);
                throw th3;
            }
        } finally {
        }
    }
}
