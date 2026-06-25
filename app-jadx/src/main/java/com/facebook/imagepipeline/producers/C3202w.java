package com.facebook.imagepipeline.producers;

import K6.b;
import com.facebook.imagepipeline.producers.C3200u;
import s5.InterfaceC6433d;
import z6.InterfaceC7289c;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3202w implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y5.n f36313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x6.k f36314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f36315c;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.w$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a extends AbstractC3199t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e0 f36316c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final y5.n f36317d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final x6.k f36318e;

        @Override // com.facebook.imagepipeline.producers.AbstractC3183c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(E6.k kVar, int i10) {
            this.f36316c.m().d(this.f36316c, "DiskCacheWriteProducer");
            if (AbstractC3183c.f(i10) || kVar == null || AbstractC3183c.m(i10, 10) || kVar.o() == q6.c.f57672d) {
                this.f36316c.m().j(this.f36316c, "DiskCacheWriteProducer", null);
                p().c(kVar, i10);
                return;
            }
            K6.b bVarQ = this.f36316c.q();
            InterfaceC6433d interfaceC6433dD = this.f36318e.d(bVarQ, this.f36316c.a());
            InterfaceC7289c interfaceC7289c = (InterfaceC7289c) this.f36317d.get();
            x6.j jVarA = C3200u.a(bVarQ, interfaceC7289c.a(), interfaceC7289c.b(), interfaceC7289c.c());
            if (jVarA != null) {
                jVarA.p(interfaceC6433dD, kVar);
                this.f36316c.m().j(this.f36316c, "DiskCacheWriteProducer", null);
                p().c(kVar, i10);
                return;
            }
            this.f36316c.m().k(this.f36316c, "DiskCacheWriteProducer", new C3200u.a("Got no disk cache for CacheChoice: " + Integer.valueOf(bVarQ.c().ordinal()).toString()), null);
            p().c(kVar, i10);
        }

        private a(InterfaceC3194n interfaceC3194n, e0 e0Var, y5.n nVar, x6.k kVar) {
            super(interfaceC3194n);
            this.f36316c = e0Var;
            this.f36317d = nVar;
            this.f36318e = kVar;
        }
    }

    public C3202w(y5.n nVar, x6.k kVar, d0 d0Var) {
        this.f36313a = nVar;
        this.f36314b = kVar;
        this.f36315c = d0Var;
    }

    private void c(InterfaceC3194n interfaceC3194n, e0 e0Var) {
        e0 e0Var2;
        if (e0Var.E().b() >= b.c.DISK_CACHE.b()) {
            e0Var.h("disk", "nil-result_write");
            interfaceC3194n.c(null, 1);
            return;
        }
        if (e0Var.q().y(32)) {
            e0Var2 = e0Var;
            interfaceC3194n = new a(interfaceC3194n, e0Var2, this.f36313a, this.f36314b);
        } else {
            e0Var2 = e0Var;
        }
        this.f36315c.a(interfaceC3194n, e0Var2);
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC3194n interfaceC3194n, e0 e0Var) {
        c(interfaceC3194n, e0Var);
    }
}
