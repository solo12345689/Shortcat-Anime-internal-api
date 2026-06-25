package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.imagepipeline.producers.X;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class W implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final B5.i f36122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B5.a f36123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X f36124c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements X.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C f36125a;

        a(C c10) {
            this.f36125a = c10;
        }

        @Override // com.facebook.imagepipeline.producers.X.a
        public void a(Throwable th2) {
            W.this.l(this.f36125a, th2);
        }

        @Override // com.facebook.imagepipeline.producers.X.a
        public void b() {
            W.this.k(this.f36125a);
        }

        @Override // com.facebook.imagepipeline.producers.X.a
        public void c(InputStream inputStream, int i10) throws Throwable {
            if (L6.b.d()) {
                L6.b.a("NetworkFetcher->onResponse");
            }
            W.this.m(this.f36125a, inputStream, i10);
            if (L6.b.d()) {
                L6.b.b();
            }
        }
    }

    public W(B5.i iVar, B5.a aVar, X x10) {
        this.f36122a = iVar;
        this.f36123b = aVar;
        this.f36124c = x10;
    }

    protected static float e(int i10, int i11) {
        return i11 > 0 ? i10 / i11 : 1.0f - ((float) Math.exp(((double) (-i10)) / 50000.0d));
    }

    private Map f(C c10, int i10) {
        if (c10.d().f(c10.b(), "NetworkFetchProducer")) {
            return this.f36124c.d(c10, i10);
        }
        return null;
    }

    protected static void j(B5.k kVar, int i10, y6.b bVar, InterfaceC3194n interfaceC3194n, e0 e0Var) throws Throwable {
        C5.a aVarJ = C5.a.J(kVar.a());
        E6.k kVar2 = null;
        try {
            E6.k kVar3 = new E6.k(aVarJ);
            try {
                kVar3.F0(bVar);
                kVar3.h0();
                interfaceC3194n.c(kVar3, i10);
                E6.k.g(kVar3);
                C5.a.m(aVarJ);
            } catch (Throwable th2) {
                th = th2;
                kVar2 = kVar3;
                E6.k.g(kVar2);
                C5.a.m(aVarJ);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(C c10) {
        c10.d().c(c10.b(), "NetworkFetchProducer", null);
        c10.a().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(C c10, Throwable th2) {
        c10.d().k(c10.b(), "NetworkFetchProducer", th2, null);
        c10.d().b(c10.b(), "NetworkFetchProducer", false);
        c10.b().l("network");
        c10.a().a(th2);
    }

    private boolean n(C c10, e0 e0Var) {
        C6.e eVarH = e0Var.g().h();
        if (eVarH != null && eVarH.c() && c10.b().o()) {
            return this.f36124c.c(c10);
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC3194n interfaceC3194n, e0 e0Var) {
        e0Var.m().d(e0Var, "NetworkFetchProducer");
        C cE = this.f36124c.e(interfaceC3194n, e0Var);
        this.f36124c.a(cE, new a(cE));
    }

    protected long g() {
        return SystemClock.uptimeMillis();
    }

    protected void h(B5.k kVar, C c10) throws Throwable {
        Map mapF = f(c10, kVar.size());
        g0 g0VarD = c10.d();
        g0VarD.j(c10.b(), "NetworkFetchProducer", mapF);
        g0VarD.b(c10.b(), "NetworkFetchProducer", true);
        c10.b().l("network");
        j(kVar, c10.e() | 1, c10.f(), c10.a(), c10.b());
    }

    protected void i(B5.k kVar, C c10) throws Throwable {
        if (n(c10, c10.b())) {
            long jG = g();
            if (jG - c10.c() >= 100) {
                c10.h(jG);
                c10.d().h(c10.b(), "NetworkFetchProducer", "intermediate_result");
                j(kVar, c10.e(), c10.f(), c10.a(), c10.b());
            }
        }
    }

    protected void m(C c10, InputStream inputStream, int i10) throws Throwable {
        B5.k kVarE = i10 > 0 ? this.f36122a.e(i10) : this.f36122a.c();
        byte[] bArr = (byte[]) this.f36123b.get(16384);
        while (true) {
            try {
                int i11 = inputStream.read(bArr);
                if (i11 < 0) {
                    this.f36124c.b(c10, kVarE.size());
                    h(kVarE, c10);
                    this.f36123b.a(bArr);
                    kVarE.close();
                    return;
                }
                if (i11 > 0) {
                    kVarE.write(bArr, 0, i11);
                    i(kVarE, c10);
                    c10.a().d(e(kVarE.size(), i10));
                }
            } catch (Throwable th2) {
                this.f36123b.a(bArr);
                kVarE.close();
                throw th2;
            }
        }
    }
}
