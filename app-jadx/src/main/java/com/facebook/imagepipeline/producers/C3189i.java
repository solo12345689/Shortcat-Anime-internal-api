package com.facebook.imagepipeline.producers;

import K6.b;
import s5.InterfaceC6433d;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3189i implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x6.x f36187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x6.k f36188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f36189c;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.i$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends AbstractC3199t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6433d f36190c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f36191d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3194n interfaceC3194n, InterfaceC6433d interfaceC6433d, boolean z10) {
            super(interfaceC3194n);
            this.f36190c = interfaceC6433d;
            this.f36191d = z10;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3183c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(C5.a aVar, int i10) {
            C5.a aVar2;
            try {
                if (L6.b.d()) {
                    L6.b.a("BitmapMemoryCacheProducer#onNewResultImpl");
                }
                boolean zE = AbstractC3183c.e(i10);
                if (aVar == null) {
                    if (zE) {
                        p().c(null, i10);
                    }
                    if (L6.b.d()) {
                        L6.b.b();
                        return;
                    }
                    return;
                }
                if (!((E6.e) aVar.C()).W1() && !AbstractC3183c.n(i10, 8)) {
                    if (!zE && (aVar2 = C3189i.this.f36187a.get(this.f36190c)) != null) {
                        try {
                            E6.p pVarX1 = ((E6.e) aVar.C()).x1();
                            E6.p pVarX12 = ((E6.e) aVar2.C()).x1();
                            if (pVarX12.a() || pVarX12.c() >= pVarX1.c()) {
                                p().c(aVar2, i10);
                                if (L6.b.d()) {
                                    L6.b.b();
                                    return;
                                }
                                return;
                            }
                        } finally {
                            C5.a.m(aVar2);
                        }
                    }
                    C5.a aVarC = this.f36191d ? C3189i.this.f36187a.c(this.f36190c, aVar) : null;
                    if (zE) {
                        try {
                            p().d(1.0f);
                        } catch (Throwable th2) {
                            C5.a.m(aVarC);
                            throw th2;
                        }
                    }
                    InterfaceC3194n interfaceC3194nP = p();
                    if (aVarC != null) {
                        aVar = aVarC;
                    }
                    interfaceC3194nP.c(aVar, i10);
                    C5.a.m(aVarC);
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
            } catch (Throwable th3) {
                if (L6.b.d()) {
                    L6.b.b();
                }
                throw th3;
            }
        }
    }

    public C3189i(x6.x xVar, x6.k kVar, d0 d0Var) {
        this.f36187a = xVar;
        this.f36188b = kVar;
        this.f36189c = d0Var;
    }

    private static void f(E6.l lVar, e0 e0Var) {
        e0Var.w(lVar.getExtras());
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC3194n interfaceC3194n, e0 e0Var) {
        try {
            if (L6.b.d()) {
                L6.b.a("BitmapMemoryCacheProducer#produceResults");
            }
            g0 g0VarM = e0Var.m();
            g0VarM.d(e0Var, e());
            InterfaceC6433d interfaceC6433dA = this.f36188b.a(e0Var.q(), e0Var.a());
            C5.a aVar = e0Var.q().y(1) ? this.f36187a.get(interfaceC6433dA) : null;
            if (aVar != null) {
                f((E6.l) aVar.C(), e0Var);
                boolean zA = ((E6.e) aVar.C()).x1().a();
                if (zA) {
                    g0VarM.j(e0Var, e(), g0VarM.f(e0Var, e()) ? y5.g.of("cached_value_found", com.amazon.a.a.o.b.f34640af) : null);
                    g0VarM.b(e0Var, e(), true);
                    e0Var.h("memory_bitmap", d());
                    interfaceC3194n.d(1.0f);
                }
                interfaceC3194n.c(aVar, AbstractC3183c.l(zA));
                aVar.close();
                if (zA) {
                    if (L6.b.d()) {
                        L6.b.b();
                        return;
                    }
                    return;
                }
            }
            if (e0Var.E().b() >= b.c.BITMAP_MEMORY_CACHE.b()) {
                g0VarM.j(e0Var, e(), g0VarM.f(e0Var, e()) ? y5.g.of("cached_value_found", com.amazon.a.a.o.b.f34641ag) : null);
                g0VarM.b(e0Var, e(), false);
                e0Var.h("memory_bitmap", d());
                interfaceC3194n.c(null, 1);
                if (L6.b.d()) {
                    L6.b.b();
                    return;
                }
                return;
            }
            InterfaceC3194n interfaceC3194nG = g(interfaceC3194n, interfaceC6433dA, e0Var.q().y(2));
            g0VarM.j(e0Var, e(), g0VarM.f(e0Var, e()) ? y5.g.of("cached_value_found", com.amazon.a.a.o.b.f34641ag) : null);
            if (L6.b.d()) {
                L6.b.a("mInputProducer.produceResult");
            }
            this.f36189c.a(interfaceC3194nG, e0Var);
            if (L6.b.d()) {
                L6.b.b();
            }
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

    protected String d() {
        return "pipe_bg";
    }

    protected String e() {
        return "BitmapMemoryCacheProducer";
    }

    protected InterfaceC3194n g(InterfaceC3194n interfaceC3194n, InterfaceC6433d interfaceC6433d, boolean z10) {
        return new a(interfaceC3194n, interfaceC6433d, z10);
    }
}
