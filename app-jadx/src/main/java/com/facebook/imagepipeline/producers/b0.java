package com.facebook.imagepipeline.producers;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f36153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w6.d f36154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f36155c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class a extends AbstractC3199t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g0 f36156c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e0 f36157d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final K6.d f36158e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f36159f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private C5.a f36160g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f36161h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f36162i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f36163j;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.b0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0606a extends AbstractC3186f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b0 f36165a;

            C0606a(b0 b0Var) {
                this.f36165a = b0Var;
            }

            @Override // com.facebook.imagepipeline.producers.f0
            public void b() {
                a.this.C();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C5.a aVar;
                int i10;
                synchronized (a.this) {
                    aVar = a.this.f36160g;
                    i10 = a.this.f36161h;
                    a.this.f36160g = null;
                    a.this.f36162i = false;
                }
                if (C5.a.H(aVar)) {
                    try {
                        a.this.z(aVar, i10);
                    } finally {
                        C5.a.m(aVar);
                    }
                }
                a.this.x();
            }
        }

        public a(InterfaceC3194n interfaceC3194n, g0 g0Var, K6.d dVar, e0 e0Var) {
            super(interfaceC3194n);
            this.f36160g = null;
            this.f36161h = 0;
            this.f36162i = false;
            this.f36163j = false;
            this.f36156c = g0Var;
            this.f36158e = dVar;
            this.f36157d = e0Var;
            e0Var.b(new C0606a(b0.this));
        }

        private Map A(g0 g0Var, e0 e0Var, K6.d dVar) {
            if (g0Var.f(e0Var, "PostprocessorProducer")) {
                return y5.g.of("Postprocessor", dVar.getName());
            }
            return null;
        }

        private synchronized boolean B() {
            return this.f36159f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C() {
            if (y()) {
                p().b();
            }
        }

        private void D(Throwable th2) {
            if (y()) {
                p().a(th2);
            }
        }

        private void E(C5.a aVar, int i10) {
            boolean zE = AbstractC3183c.e(i10);
            if ((zE || B()) && !(zE && y())) {
                return;
            }
            p().c(aVar, i10);
        }

        private C5.a G(E6.e eVar) {
            E6.f fVar = (E6.f) eVar;
            C5.a aVarA = this.f36158e.a(fVar.G1(), b0.this.f36154b);
            try {
                E6.f fVarW0 = E6.f.W0(aVarA, eVar.x1(), fVar.h1(), fVar.U0());
                fVarW0.w(fVar.getExtras());
                return C5.a.J(fVarW0);
            } finally {
                C5.a.m(aVarA);
            }
        }

        private synchronized boolean H() {
            if (this.f36159f || !this.f36162i || this.f36163j || !C5.a.H(this.f36160g)) {
                return false;
            }
            this.f36163j = true;
            return true;
        }

        private boolean I(E6.e eVar) {
            return eVar instanceof E6.f;
        }

        private void J() {
            b0.this.f36155c.execute(new b());
        }

        private void K(C5.a aVar, int i10) {
            synchronized (this) {
                try {
                    if (this.f36159f) {
                        return;
                    }
                    C5.a aVar2 = this.f36160g;
                    this.f36160g = C5.a.j(aVar);
                    this.f36161h = i10;
                    this.f36162i = true;
                    boolean zH = H();
                    C5.a.m(aVar2);
                    if (zH) {
                        J();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x() {
            boolean zH;
            synchronized (this) {
                this.f36163j = false;
                zH = H();
            }
            if (zH) {
                J();
            }
        }

        private boolean y() {
            synchronized (this) {
                try {
                    if (this.f36159f) {
                        return false;
                    }
                    C5.a aVar = this.f36160g;
                    this.f36160g = null;
                    this.f36159f = true;
                    C5.a.m(aVar);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z(C5.a aVar, int i10) {
            y5.k.b(Boolean.valueOf(C5.a.H(aVar)));
            if (!I((E6.e) aVar.C())) {
                E(aVar, i10);
                return;
            }
            this.f36156c.d(this.f36157d, "PostprocessorProducer");
            try {
                try {
                    C5.a aVarG = G((E6.e) aVar.C());
                    g0 g0Var = this.f36156c;
                    e0 e0Var = this.f36157d;
                    g0Var.j(e0Var, "PostprocessorProducer", A(g0Var, e0Var, this.f36158e));
                    E(aVarG, i10);
                    C5.a.m(aVarG);
                } catch (Exception e10) {
                    g0 g0Var2 = this.f36156c;
                    e0 e0Var2 = this.f36157d;
                    g0Var2.k(e0Var2, "PostprocessorProducer", e10, A(g0Var2, e0Var2, this.f36158e));
                    D(e10);
                    C5.a.m(null);
                }
            } catch (Throwable th2) {
                C5.a.m(null);
                throw th2;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC3183c
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void i(C5.a aVar, int i10) {
            if (C5.a.H(aVar)) {
                K(aVar, i10);
            } else if (AbstractC3183c.e(i10)) {
                E(null, i10);
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3199t, com.facebook.imagepipeline.producers.AbstractC3183c
        protected void g() {
            C();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3199t, com.facebook.imagepipeline.producers.AbstractC3183c
        protected void h(Throwable th2) {
            D(th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends AbstractC3199t {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC3183c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(C5.a aVar, int i10) {
            if (AbstractC3183c.f(i10)) {
                return;
            }
            p().c(aVar, i10);
        }

        private b(a aVar) {
            super(aVar);
        }
    }

    public b0(d0 d0Var, w6.d dVar, Executor executor) {
        this.f36153a = (d0) y5.k.g(d0Var);
        this.f36154b = dVar;
        this.f36155c = (Executor) y5.k.g(executor);
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC3194n interfaceC3194n, e0 e0Var) {
        g0 g0VarM = e0Var.m();
        K6.d dVarL = e0Var.q().l();
        y5.k.g(dVarL);
        this.f36153a.a(new b(new a(interfaceC3194n, g0VarM, dVarL, e0Var)), e0Var);
    }
}
