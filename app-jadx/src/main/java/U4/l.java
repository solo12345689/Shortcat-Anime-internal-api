package U4;

import U4.h;
import U4.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import o5.AbstractC5828e;
import p5.AbstractC5933a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class l implements h.b, AbstractC5933a.f {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final c f19256z = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final e f19257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p5.c f19258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p.a f19259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final K1.d f19260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f19261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m f19262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final X4.a f19263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final X4.a f19264h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final X4.a f19265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final X4.a f19266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f19267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private S4.f f19268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f19269m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f19270n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f19271o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f19272p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private v f19273q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    S4.a f19274r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f19275s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    q f19276t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f19277u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    p f19278v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private h f19279w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private volatile boolean f19280x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f19281y;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k5.g f19282a;

        a(k5.g gVar) {
            this.f19282a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f19282a.d()) {
                synchronized (l.this) {
                    try {
                        if (l.this.f19257a.c(this.f19282a)) {
                            l.this.e(this.f19282a);
                        }
                        l.this.i();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k5.g f19284a;

        b(k5.g gVar) {
            this.f19284a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f19284a.d()) {
                synchronized (l.this) {
                    try {
                        if (l.this.f19257a.c(this.f19284a)) {
                            l.this.f19278v.b();
                            l.this.f(this.f19284a);
                            l.this.r(this.f19284a);
                        }
                        l.this.i();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c {
        c() {
        }

        public p a(v vVar, boolean z10, S4.f fVar, p.a aVar) {
            return new p(vVar, z10, true, fVar, aVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final k5.g f19286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f19287b;

        d(k5.g gVar, Executor executor) {
            this.f19286a = gVar;
            this.f19287b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f19286a.equals(((d) obj).f19286a);
            }
            return false;
        }

        public int hashCode() {
            return this.f19286a.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e implements Iterable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f19288a;

        e() {
            this(new ArrayList(2));
        }

        private static d e(k5.g gVar) {
            return new d(gVar, AbstractC5828e.a());
        }

        void b(k5.g gVar, Executor executor) {
            this.f19288a.add(new d(gVar, executor));
        }

        boolean c(k5.g gVar) {
            return this.f19288a.contains(e(gVar));
        }

        void clear() {
            this.f19288a.clear();
        }

        e d() {
            return new e(new ArrayList(this.f19288a));
        }

        void f(k5.g gVar) {
            this.f19288a.remove(e(gVar));
        }

        boolean isEmpty() {
            return this.f19288a.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f19288a.iterator();
        }

        int size() {
            return this.f19288a.size();
        }

        e(List list) {
            this.f19288a = list;
        }
    }

    l(X4.a aVar, X4.a aVar2, X4.a aVar3, X4.a aVar4, m mVar, p.a aVar5, K1.d dVar) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, dVar, f19256z);
    }

    private X4.a j() {
        return this.f19270n ? this.f19265i : this.f19271o ? this.f19266j : this.f19264h;
    }

    private boolean m() {
        return this.f19277u || this.f19275s || this.f19280x;
    }

    private synchronized void q() {
        if (this.f19268l == null) {
            throw new IllegalArgumentException();
        }
        this.f19257a.clear();
        this.f19268l = null;
        this.f19278v = null;
        this.f19273q = null;
        this.f19277u = false;
        this.f19280x = false;
        this.f19275s = false;
        this.f19281y = false;
        this.f19279w.E(false);
        this.f19279w = null;
        this.f19276t = null;
        this.f19274r = null;
        this.f19260d.a(this);
    }

    @Override // U4.h.b
    public void a(q qVar) {
        synchronized (this) {
            this.f19276t = qVar;
        }
        n();
    }

    @Override // U4.h.b
    public void b(v vVar, S4.a aVar, boolean z10) {
        synchronized (this) {
            this.f19273q = vVar;
            this.f19274r = aVar;
            this.f19281y = z10;
        }
        o();
    }

    @Override // U4.h.b
    public void c(h hVar) {
        j().execute(hVar);
    }

    synchronized void d(k5.g gVar, Executor executor) {
        try {
            this.f19258b.c();
            this.f19257a.b(gVar, executor);
            if (this.f19275s) {
                k(1);
                executor.execute(new b(gVar));
            } else if (this.f19277u) {
                k(1);
                executor.execute(new a(gVar));
            } else {
                o5.k.b(!this.f19280x, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    void e(k5.g gVar) {
        try {
            gVar.a(this.f19276t);
        } catch (Throwable th2) {
            throw new U4.b(th2);
        }
    }

    void f(k5.g gVar) {
        try {
            gVar.b(this.f19278v, this.f19274r, this.f19281y);
        } catch (Throwable th2) {
            throw new U4.b(th2);
        }
    }

    void g() {
        if (m()) {
            return;
        }
        this.f19280x = true;
        this.f19279w.b();
        this.f19262f.a(this, this.f19268l);
    }

    @Override // p5.AbstractC5933a.f
    public p5.c h() {
        return this.f19258b;
    }

    void i() {
        p pVar;
        synchronized (this) {
            try {
                this.f19258b.c();
                o5.k.b(m(), "Not yet complete!");
                int iDecrementAndGet = this.f19267k.decrementAndGet();
                o5.k.b(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    pVar = this.f19278v;
                    q();
                } else {
                    pVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (pVar != null) {
            pVar.e();
        }
    }

    synchronized void k(int i10) {
        p pVar;
        o5.k.b(m(), "Not yet complete!");
        if (this.f19267k.getAndAdd(i10) == 0 && (pVar = this.f19278v) != null) {
            pVar.b();
        }
    }

    synchronized l l(S4.f fVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f19268l = fVar;
        this.f19269m = z10;
        this.f19270n = z11;
        this.f19271o = z12;
        this.f19272p = z13;
        return this;
    }

    void n() {
        synchronized (this) {
            try {
                this.f19258b.c();
                if (this.f19280x) {
                    q();
                    return;
                }
                if (this.f19257a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f19277u) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f19277u = true;
                S4.f fVar = this.f19268l;
                e<d> eVarD = this.f19257a.d();
                k(eVarD.size() + 1);
                this.f19262f.c(this, fVar, null);
                for (d dVar : eVarD) {
                    dVar.f19287b.execute(new a(dVar.f19286a));
                }
                i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void o() {
        synchronized (this) {
            try {
                this.f19258b.c();
                if (this.f19280x) {
                    this.f19273q.recycle();
                    q();
                    return;
                }
                if (this.f19257a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f19275s) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f19278v = this.f19261e.a(this.f19273q, this.f19269m, this.f19268l, this.f19259c);
                this.f19275s = true;
                e<d> eVarD = this.f19257a.d();
                k(eVarD.size() + 1);
                this.f19262f.c(this, this.f19268l, this.f19278v);
                for (d dVar : eVarD) {
                    dVar.f19287b.execute(new b(dVar.f19286a));
                }
                i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean p() {
        return this.f19272p;
    }

    synchronized void r(k5.g gVar) {
        try {
            this.f19258b.c();
            this.f19257a.f(gVar);
            if (this.f19257a.isEmpty()) {
                g();
                if (this.f19275s || this.f19277u) {
                    if (this.f19267k.get() == 0) {
                        q();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void s(h hVar) {
        try {
            this.f19279w = hVar;
            (hVar.M() ? this.f19263g : j()).execute(hVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    l(X4.a aVar, X4.a aVar2, X4.a aVar3, X4.a aVar4, m mVar, p.a aVar5, K1.d dVar, c cVar) {
        this.f19257a = new e();
        this.f19258b = p5.c.a();
        this.f19267k = new AtomicInteger();
        this.f19263g = aVar;
        this.f19264h = aVar2;
        this.f19265i = aVar3;
        this.f19266j = aVar4;
        this.f19262f = mVar;
        this.f19259c = aVar5;
        this.f19260d = dVar;
        this.f19261e = cVar;
    }
}
