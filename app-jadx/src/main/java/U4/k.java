package U4;

import U4.h;
import U4.p;
import W4.a;
import W4.h;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.Executor;
import o5.AbstractC5830g;
import p5.AbstractC5933a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class k implements m, h.a, p.a {

    /* JADX INFO: renamed from: i */
    private static final boolean f19230i = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a */
    private final s f19231a;

    /* JADX INFO: renamed from: b */
    private final o f19232b;

    /* JADX INFO: renamed from: c */
    private final W4.h f19233c;

    /* JADX INFO: renamed from: d */
    private final b f19234d;

    /* JADX INFO: renamed from: e */
    private final y f19235e;

    /* JADX INFO: renamed from: f */
    private final c f19236f;

    /* JADX INFO: renamed from: g */
    private final a f19237g;

    /* JADX INFO: renamed from: h */
    private final U4.a f19238h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {

        /* JADX INFO: renamed from: a */
        final h.e f19239a;

        /* JADX INFO: renamed from: b */
        final K1.d f19240b = AbstractC5933a.d(150, new C0329a());

        /* JADX INFO: renamed from: c */
        private int f19241c;

        /* JADX INFO: renamed from: U4.k$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0329a implements AbstractC5933a.d {
            C0329a() {
            }

            @Override // p5.AbstractC5933a.d
            /* JADX INFO: renamed from: a */
            public h create() {
                a aVar = a.this;
                return new h(aVar.f19239a, aVar.f19240b);
            }
        }

        a(h.e eVar) {
            this.f19239a = eVar;
        }

        h a(com.bumptech.glide.d dVar, Object obj, n nVar, S4.f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.g gVar, j jVar, Map map, boolean z10, boolean z11, boolean z12, S4.h hVar, h.b bVar) {
            h hVar2 = (h) o5.k.e((h) this.f19240b.b());
            int i12 = this.f19241c;
            this.f19241c = i12 + 1;
            return hVar2.v(dVar, obj, nVar, fVar, i10, i11, cls, cls2, gVar, jVar, map, z10, z11, z12, hVar, bVar, i12);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b {

        /* JADX INFO: renamed from: a */
        final X4.a f19243a;

        /* JADX INFO: renamed from: b */
        final X4.a f19244b;

        /* JADX INFO: renamed from: c */
        final X4.a f19245c;

        /* JADX INFO: renamed from: d */
        final X4.a f19246d;

        /* JADX INFO: renamed from: e */
        final m f19247e;

        /* JADX INFO: renamed from: f */
        final p.a f19248f;

        /* JADX INFO: renamed from: g */
        final K1.d f19249g = AbstractC5933a.d(150, new a());

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements AbstractC5933a.d {
            a() {
            }

            @Override // p5.AbstractC5933a.d
            /* JADX INFO: renamed from: a */
            public l create() {
                b bVar = b.this;
                return new l(bVar.f19243a, bVar.f19244b, bVar.f19245c, bVar.f19246d, bVar.f19247e, bVar.f19248f, bVar.f19249g);
            }
        }

        b(X4.a aVar, X4.a aVar2, X4.a aVar3, X4.a aVar4, m mVar, p.a aVar5) {
            this.f19243a = aVar;
            this.f19244b = aVar2;
            this.f19245c = aVar3;
            this.f19246d = aVar4;
            this.f19247e = mVar;
            this.f19248f = aVar5;
        }

        l a(S4.f fVar, boolean z10, boolean z11, boolean z12, boolean z13) {
            return ((l) o5.k.e((l) this.f19249g.b())).l(fVar, z10, z11, z12, z13);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c implements h.e {

        /* JADX INFO: renamed from: a */
        private final a.InterfaceC0363a f19251a;

        /* JADX INFO: renamed from: b */
        private volatile W4.a f19252b;

        c(a.InterfaceC0363a interfaceC0363a) {
            this.f19251a = interfaceC0363a;
        }

        @Override // U4.h.e
        public W4.a a() {
            if (this.f19252b == null) {
                synchronized (this) {
                    try {
                        if (this.f19252b == null) {
                            this.f19252b = this.f19251a.build();
                        }
                        if (this.f19252b == null) {
                            this.f19252b = new W4.b();
                        }
                    } finally {
                    }
                }
            }
            return this.f19252b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class d {

        /* JADX INFO: renamed from: a */
        private final l f19253a;

        /* JADX INFO: renamed from: b */
        private final k5.g f19254b;

        d(k5.g gVar, l lVar) {
            this.f19254b = gVar;
            this.f19253a = lVar;
        }

        public void a() {
            synchronized (k.this) {
                this.f19253a.r(this.f19254b);
            }
        }
    }

    public k(W4.h hVar, a.InterfaceC0363a interfaceC0363a, X4.a aVar, X4.a aVar2, X4.a aVar3, X4.a aVar4, boolean z10) {
        this(hVar, interfaceC0363a, aVar, aVar2, aVar3, aVar4, null, null, null, null, null, null, z10);
    }

    private p f(S4.f fVar) {
        v vVarD = this.f19233c.d(fVar);
        if (vVarD == null) {
            return null;
        }
        return vVarD instanceof p ? (p) vVarD : new p(vVarD, true, true, fVar, this);
    }

    private p h(S4.f fVar) {
        p pVarE = this.f19238h.e(fVar);
        if (pVarE != null) {
            pVarE.b();
        }
        return pVarE;
    }

    private p i(S4.f fVar) {
        p pVarF = f(fVar);
        if (pVarF != null) {
            pVarF.b();
            this.f19238h.a(fVar, pVarF);
        }
        return pVarF;
    }

    private p j(n nVar, boolean z10, long j10) {
        if (!z10) {
            return null;
        }
        p pVarH = h(nVar);
        if (pVarH != null) {
            if (f19230i) {
                k("Loaded resource from active resources", j10, nVar);
            }
            return pVarH;
        }
        p pVarI = i(nVar);
        if (pVarI == null) {
            return null;
        }
        if (f19230i) {
            k("Loaded resource from cache", j10, nVar);
        }
        return pVarI;
    }

    private static void k(String str, long j10, S4.f fVar) {
        Log.v("Engine", str + " in " + AbstractC5830g.a(j10) + "ms, key: " + fVar);
    }

    private d m(com.bumptech.glide.d dVar, Object obj, S4.f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.g gVar, j jVar, Map map, boolean z10, boolean z11, S4.h hVar, boolean z12, boolean z13, boolean z14, boolean z15, k5.g gVar2, Executor executor, n nVar, long j10) {
        l lVarA = this.f19231a.a(nVar, z15);
        if (lVarA != null) {
            lVarA.d(gVar2, executor);
            if (f19230i) {
                k("Added to existing load", j10, nVar);
            }
            return new d(gVar2, lVarA);
        }
        l lVarA2 = this.f19234d.a(nVar, z12, z13, z14, z15);
        h hVarA = this.f19237g.a(dVar, obj, nVar, fVar, i10, i11, cls, cls2, gVar, jVar, map, z10, z11, z15, hVar, lVarA2);
        this.f19231a.c(nVar, lVarA2);
        lVarA2.d(gVar2, executor);
        lVarA2.s(hVarA);
        if (f19230i) {
            k("Started new load", j10, nVar);
        }
        return new d(gVar2, lVarA2);
    }

    @Override // U4.m
    public synchronized void a(l lVar, S4.f fVar) {
        this.f19231a.d(fVar, lVar);
    }

    @Override // W4.h.a
    public void b(v vVar) {
        this.f19235e.a(vVar, true);
    }

    @Override // U4.m
    public synchronized void c(l lVar, S4.f fVar, p pVar) {
        if (pVar != null) {
            try {
                if (pVar.d()) {
                    this.f19238h.a(fVar, pVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f19231a.d(fVar, lVar);
    }

    @Override // U4.p.a
    public void d(S4.f fVar, p pVar) {
        this.f19238h.d(fVar);
        if (pVar.d()) {
            this.f19233c.c(fVar, pVar);
        } else {
            this.f19235e.a(pVar, false);
        }
    }

    public void e() {
        this.f19236f.a().clear();
    }

    public d g(com.bumptech.glide.d dVar, Object obj, S4.f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.g gVar, j jVar, Map map, boolean z10, boolean z11, S4.h hVar, boolean z12, boolean z13, boolean z14, boolean z15, k5.g gVar2, Executor executor) {
        long jB = f19230i ? AbstractC5830g.b() : 0L;
        n nVarA = this.f19232b.a(obj, fVar, i10, i11, map, cls, cls2, hVar);
        synchronized (this) {
            try {
                p pVarJ = j(nVarA, z12, jB);
                if (pVarJ == null) {
                    return m(dVar, obj, fVar, i10, i11, cls, cls2, gVar, jVar, map, z10, z11, hVar, z12, z13, z14, z15, gVar2, executor, nVarA, jB);
                }
                gVar2.b(pVarJ, S4.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void l(v vVar) {
        if (!(vVar instanceof p)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((p) vVar).e();
    }

    k(W4.h hVar, a.InterfaceC0363a interfaceC0363a, X4.a aVar, X4.a aVar2, X4.a aVar3, X4.a aVar4, s sVar, o oVar, U4.a aVar5, b bVar, a aVar6, y yVar, boolean z10) {
        this.f19233c = hVar;
        c cVar = new c(interfaceC0363a);
        this.f19236f = cVar;
        U4.a aVar7 = aVar5 == null ? new U4.a(z10) : aVar5;
        this.f19238h = aVar7;
        aVar7.f(this);
        this.f19232b = oVar == null ? new o() : oVar;
        this.f19231a = sVar == null ? new s() : sVar;
        this.f19234d = bVar == null ? new b(aVar, aVar2, aVar3, aVar4, this, this) : bVar;
        this.f19237g = aVar6 == null ? new a(cVar) : aVar6;
        this.f19235e = yVar == null ? new y() : yVar;
        hVar.e(this);
    }
}
