package com.facebook.imagepipeline.producers;

import K6.b;
import com.facebook.imagepipeline.producers.C3200u;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import s5.InterfaceC6433d;
import u4.C6736f;
import u4.InterfaceC6734d;
import z6.InterfaceC7289c;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3201v implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y5.n f36303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x6.k f36304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f36305c;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.v$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements InterfaceC6734d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g0 f36306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e0 f36307b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3194n f36308c;

        a(g0 g0Var, e0 e0Var, InterfaceC3194n interfaceC3194n) {
            this.f36306a = g0Var;
            this.f36307b = e0Var;
            this.f36308c = interfaceC3194n;
        }

        @Override // u4.InterfaceC6734d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(C6736f c6736f) {
            if (C3201v.f(c6736f)) {
                this.f36306a.c(this.f36307b, "DiskCacheProducer", null);
                this.f36308c.b();
            } else if (c6736f.n()) {
                this.f36306a.k(this.f36307b, "DiskCacheProducer", c6736f.i(), null);
                C3201v.this.f36305c.a(this.f36308c, this.f36307b);
            } else {
                E6.k kVar = (E6.k) c6736f.j();
                if (kVar != null) {
                    g0 g0Var = this.f36306a;
                    e0 e0Var = this.f36307b;
                    g0Var.j(e0Var, "DiskCacheProducer", C3201v.e(g0Var, e0Var, true, kVar.C()));
                    this.f36306a.b(this.f36307b, "DiskCacheProducer", true);
                    this.f36307b.l("disk");
                    this.f36308c.d(1.0f);
                    this.f36308c.c(kVar, 1);
                    kVar.close();
                } else {
                    g0 g0Var2 = this.f36306a;
                    e0 e0Var2 = this.f36307b;
                    g0Var2.j(e0Var2, "DiskCacheProducer", C3201v.e(g0Var2, e0Var2, false, 0));
                    C3201v.this.f36305c.a(this.f36308c, this.f36307b);
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.v$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends AbstractC3186f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f36310a;

        b(AtomicBoolean atomicBoolean) {
            this.f36310a = atomicBoolean;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void b() {
            this.f36310a.set(true);
        }
    }

    public C3201v(y5.n nVar, x6.k kVar, d0 d0Var) {
        this.f36303a = nVar;
        this.f36304b = kVar;
        this.f36305c = d0Var;
    }

    static Map e(g0 g0Var, e0 e0Var, boolean z10, int i10) {
        if (g0Var.f(e0Var, "DiskCacheProducer")) {
            return z10 ? y5.g.of("cached_value_found", String.valueOf(z10), "encodedImageSize", String.valueOf(i10)) : y5.g.of("cached_value_found", String.valueOf(z10));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean f(C6736f c6736f) {
        if (c6736f.l()) {
            return true;
        }
        return c6736f.n() && (c6736f.i() instanceof CancellationException);
    }

    private void g(InterfaceC3194n interfaceC3194n, e0 e0Var) {
        if (e0Var.E().b() < b.c.DISK_CACHE.b()) {
            this.f36305c.a(interfaceC3194n, e0Var);
        } else {
            e0Var.h("disk", "nil-result_read");
            interfaceC3194n.c(null, 1);
        }
    }

    private InterfaceC6734d h(InterfaceC3194n interfaceC3194n, e0 e0Var) {
        return new a(e0Var.m(), e0Var, interfaceC3194n);
    }

    private void i(AtomicBoolean atomicBoolean, e0 e0Var) {
        e0Var.b(new b(atomicBoolean));
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC3194n interfaceC3194n, e0 e0Var) {
        K6.b bVarQ = e0Var.q();
        if (!e0Var.q().y(16)) {
            g(interfaceC3194n, e0Var);
            return;
        }
        e0Var.m().d(e0Var, "DiskCacheProducer");
        InterfaceC6433d interfaceC6433dD = this.f36304b.d(bVarQ, e0Var.a());
        InterfaceC7289c interfaceC7289c = (InterfaceC7289c) this.f36303a.get();
        x6.j jVarA = C3200u.a(bVarQ, interfaceC7289c.a(), interfaceC7289c.b(), interfaceC7289c.c());
        if (jVarA != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            jVarA.m(interfaceC6433dD, atomicBoolean).e(h(interfaceC3194n, e0Var));
            i(atomicBoolean, e0Var);
        } else {
            e0Var.m().k(e0Var, "DiskCacheProducer", new C3200u.a("Got no disk cache for CacheChoice: " + Integer.valueOf(bVarQ.c().ordinal()).toString()), null);
            g(interfaceC3194n, e0Var);
        }
    }
}
