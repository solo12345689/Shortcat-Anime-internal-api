package U4;

import U4.h;
import Y4.n;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f19145a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f19146b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.d f19147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f19148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Class f19151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private h.e f19152h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private S4.h f19153i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f19154j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Class f19155k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f19156l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f19157m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private S4.f f19158n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.g f19159o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private j f19160p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f19161q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f19162r;

    g() {
    }

    void a() {
        this.f19147c = null;
        this.f19148d = null;
        this.f19158n = null;
        this.f19151g = null;
        this.f19155k = null;
        this.f19153i = null;
        this.f19159o = null;
        this.f19154j = null;
        this.f19160p = null;
        this.f19145a.clear();
        this.f19156l = false;
        this.f19146b.clear();
        this.f19157m = false;
    }

    V4.b b() {
        return this.f19147c.a();
    }

    List c() {
        if (!this.f19157m) {
            this.f19157m = true;
            this.f19146b.clear();
            List listG = g();
            int size = listG.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.a aVar = (n.a) listG.get(i10);
                if (!this.f19146b.contains(aVar.f22810a)) {
                    this.f19146b.add(aVar.f22810a);
                }
                for (int i11 = 0; i11 < aVar.f22811b.size(); i11++) {
                    if (!this.f19146b.contains(aVar.f22811b.get(i11))) {
                        this.f19146b.add((S4.f) aVar.f22811b.get(i11));
                    }
                }
            }
        }
        return this.f19146b;
    }

    W4.a d() {
        return this.f19152h.a();
    }

    j e() {
        return this.f19160p;
    }

    int f() {
        return this.f19150f;
    }

    List g() {
        if (!this.f19156l) {
            this.f19156l = true;
            this.f19145a.clear();
            List listI = this.f19147c.h().i(this.f19148d);
            int size = listI.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.a aVarB = ((Y4.n) listI.get(i10)).b(this.f19148d, this.f19149e, this.f19150f, this.f19153i);
                if (aVarB != null) {
                    this.f19145a.add(aVarB);
                }
            }
        }
        return this.f19145a;
    }

    t h(Class cls) {
        return this.f19147c.h().h(cls, this.f19151g, this.f19155k);
    }

    Class i() {
        return this.f19148d.getClass();
    }

    List j(File file) {
        return this.f19147c.h().i(file);
    }

    S4.h k() {
        return this.f19153i;
    }

    com.bumptech.glide.g l() {
        return this.f19159o;
    }

    List m() {
        return this.f19147c.h().j(this.f19148d.getClass(), this.f19151g, this.f19155k);
    }

    S4.k n(v vVar) {
        return this.f19147c.h().k(vVar);
    }

    com.bumptech.glide.load.data.e o(Object obj) {
        return this.f19147c.h().l(obj);
    }

    S4.f p() {
        return this.f19158n;
    }

    S4.d q(Object obj) {
        return this.f19147c.h().m(obj);
    }

    Class r() {
        return this.f19155k;
    }

    S4.l s(Class cls) {
        S4.l lVar = (S4.l) this.f19154j.get(cls);
        if (lVar == null) {
            Iterator it = this.f19154j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    lVar = (S4.l) entry.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.f19154j.isEmpty() || !this.f19161q) {
            return a5.k.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    int t() {
        return this.f19149e;
    }

    boolean u(Class cls) {
        return h(cls) != null;
    }

    void v(com.bumptech.glide.d dVar, Object obj, S4.f fVar, int i10, int i11, j jVar, Class cls, Class cls2, com.bumptech.glide.g gVar, S4.h hVar, Map map, boolean z10, boolean z11, h.e eVar) {
        this.f19147c = dVar;
        this.f19148d = obj;
        this.f19158n = fVar;
        this.f19149e = i10;
        this.f19150f = i11;
        this.f19160p = jVar;
        this.f19151g = cls;
        this.f19152h = eVar;
        this.f19155k = cls2;
        this.f19159o = gVar;
        this.f19153i = hVar;
        this.f19154j = map;
        this.f19161q = z10;
        this.f19162r = z11;
    }

    boolean w(v vVar) {
        return this.f19147c.h().n(vVar);
    }

    boolean x() {
        return this.f19162r;
    }

    boolean y(S4.f fVar) {
        List listG = g();
        int size = listG.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((n.a) listG.get(i10)).f22810a.equals(fVar)) {
                return true;
            }
        }
        return false;
    }
}
