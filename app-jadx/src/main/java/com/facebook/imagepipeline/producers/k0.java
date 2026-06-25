package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.G;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class k0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f36215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B5.i f36216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f36217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f36218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final M6.d f36219e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class a extends AbstractC3199t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f36220c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final M6.d f36221d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final e0 f36222e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f36223f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final G f36224g;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.k0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0607a implements G.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ k0 f36226a;

            C0607a(k0 k0Var) {
                this.f36226a = k0Var;
            }

            @Override // com.facebook.imagepipeline.producers.G.d
            public void a(E6.k kVar, int i10) throws Throwable {
                if (kVar == null) {
                    a.this.p().c(null, i10);
                } else {
                    a aVar = a.this;
                    aVar.w(kVar, i10, (M6.c) y5.k.g(aVar.f36221d.createImageTranscoder(kVar.o(), a.this.f36220c)));
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class b extends AbstractC3186f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ k0 f36228a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3194n f36229b;

            b(k0 k0Var, InterfaceC3194n interfaceC3194n) {
                this.f36228a = k0Var;
                this.f36229b = interfaceC3194n;
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC3186f, com.facebook.imagepipeline.producers.f0
            public void a() {
                if (a.this.f36222e.o()) {
                    a.this.f36224g.h();
                }
            }

            @Override // com.facebook.imagepipeline.producers.f0
            public void b() {
                a.this.f36224g.c();
                a.this.f36223f = true;
                this.f36229b.b();
            }
        }

        a(InterfaceC3194n interfaceC3194n, e0 e0Var, boolean z10, M6.d dVar) {
            super(interfaceC3194n);
            this.f36223f = false;
            this.f36222e = e0Var;
            Boolean boolS = e0Var.q().s();
            this.f36220c = boolS != null ? boolS.booleanValue() : z10;
            this.f36221d = dVar;
            this.f36224g = new G(k0.this.f36215a, new C0607a(k0.this), 100);
            e0Var.b(new b(k0.this, interfaceC3194n));
        }

        private E6.k A(E6.k kVar) {
            y6.h hVarT = this.f36222e.q().t();
            return (hVarT.h() || !hVarT.g()) ? kVar : y(kVar, hVarT.f());
        }

        private E6.k B(E6.k kVar) {
            return (this.f36222e.q().t().d() || kVar.h1() == 0 || kVar.h1() == -1) ? kVar : y(kVar, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w(E6.k kVar, int i10, M6.c cVar) throws Throwable {
            this.f36222e.m().d(this.f36222e, "ResizeAndRotateProducer");
            K6.b bVarQ = this.f36222e.q();
            B5.k kVarC = k0.this.f36216b.c();
            try {
                try {
                    M6.b bVarB = cVar.b(kVar, kVarC, bVarQ.t(), bVarQ.r(), null, 85, kVar.l());
                    if (bVarB.a() == 2) {
                        throw new RuntimeException("Error while transcoding the image");
                    }
                    Map mapZ = z(kVar, bVarQ.r(), bVarB, cVar.a());
                    C5.a aVarJ = C5.a.J(kVarC.a());
                    try {
                        E6.k kVar2 = new E6.k(aVarJ);
                        kVar2.a1(q6.b.f57656b);
                        try {
                            kVar2.h0();
                            this.f36222e.m().j(this.f36222e, "ResizeAndRotateProducer", mapZ);
                            if (bVarB.a() != 1) {
                                i10 |= 16;
                            }
                            p().c(kVar2, i10);
                            E6.k.g(kVar2);
                            C5.a.m(aVarJ);
                            kVarC.close();
                        } catch (Throwable th2) {
                            E6.k.g(kVar2);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        C5.a.m(aVarJ);
                        throw th3;
                    }
                } catch (Exception e10) {
                    this.f36222e.m().k(this.f36222e, "ResizeAndRotateProducer", e10, null);
                    if (AbstractC3183c.e(i10)) {
                        p().a(e10);
                    }
                    kVarC.close();
                }
            } catch (Throwable th4) {
                kVarC.close();
                throw th4;
            }
        }

        private void x(E6.k kVar, int i10, q6.c cVar) {
            p().c((cVar == q6.b.f57656b || cVar == q6.b.f57666l) ? B(kVar) : A(kVar), i10);
        }

        private E6.k y(E6.k kVar, int i10) {
            E6.k kVarB = E6.k.b(kVar);
            if (kVarB != null) {
                kVarB.q1(i10);
            }
            return kVarB;
        }

        private Map z(E6.k kVar, y6.g gVar, M6.b bVar, String str) {
            String str2;
            if (!this.f36222e.m().f(this.f36222e, "ResizeAndRotateProducer")) {
                return null;
            }
            String str3 = kVar.getWidth() + "x" + kVar.getHeight();
            if (gVar != null) {
                str2 = gVar.f64868a + "x" + gVar.f64869b;
            } else {
                str2 = "Unspecified";
            }
            HashMap map = new HashMap();
            map.put("Image format", String.valueOf(kVar.o()));
            map.put("Original size", str3);
            map.put("Requested size", str2);
            map.put("queueTime", String.valueOf(this.f36224g.f()));
            map.put("Transcoder id", str);
            map.put("Transcoding result", String.valueOf(bVar));
            return y5.g.a(map);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC3183c
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public void i(E6.k kVar, int i10) {
            if (this.f36223f) {
                return;
            }
            boolean zE = AbstractC3183c.e(i10);
            if (kVar == null) {
                if (zE) {
                    p().c(null, 1);
                    return;
                }
                return;
            }
            q6.c cVarO = kVar.o();
            G5.e eVarH = k0.h(this.f36222e.q(), kVar, (M6.c) y5.k.g(this.f36221d.createImageTranscoder(cVarO, this.f36220c)));
            if (zE || eVarH != G5.e.UNSET) {
                if (eVarH != G5.e.YES) {
                    x(kVar, i10, cVarO);
                } else if (this.f36224g.k(kVar, i10)) {
                    if (zE || this.f36222e.o()) {
                        this.f36224g.h();
                    }
                }
            }
        }
    }

    public k0(Executor executor, B5.i iVar, d0 d0Var, boolean z10, M6.d dVar) {
        this.f36215a = (Executor) y5.k.g(executor);
        this.f36216b = (B5.i) y5.k.g(iVar);
        this.f36217c = (d0) y5.k.g(d0Var);
        this.f36219e = (M6.d) y5.k.g(dVar);
        this.f36218d = z10;
    }

    private static boolean f(y6.h hVar, E6.k kVar) {
        if (hVar.d()) {
            return false;
        }
        return M6.e.e(hVar, kVar) != 0 || g(hVar, kVar);
    }

    private static boolean g(y6.h hVar, E6.k kVar) {
        if (hVar.g() && !hVar.d()) {
            return M6.e.f12235b.contains(Integer.valueOf(kVar.U0()));
        }
        kVar.G0(0);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static G5.e h(K6.b bVar, E6.k kVar, M6.c cVar) {
        if (kVar == null || kVar.o() == q6.c.f57672d) {
            return G5.e.UNSET;
        }
        if (cVar.d(kVar.o())) {
            return G5.e.c(f(bVar.t(), kVar) || cVar.c(kVar, bVar.t(), bVar.r()));
        }
        return G5.e.NO;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC3194n interfaceC3194n, e0 e0Var) {
        this.f36217c.a(new a(interfaceC3194n, e0Var, this.f36218d, this.f36219e), e0Var);
    }
}
