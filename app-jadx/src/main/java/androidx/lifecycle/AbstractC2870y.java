package androidx.lifecycle;

import androidx.lifecycle.AbstractC2857k;
import java.util.Map;
import p.C5905b;

/* JADX INFO: renamed from: androidx.lifecycle.y */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2870y {

    /* JADX INFO: renamed from: k */
    static final Object f30265k = new Object();

    /* JADX INFO: renamed from: a */
    final Object f30266a = new Object();

    /* JADX INFO: renamed from: b */
    private C5905b f30267b = new C5905b();

    /* JADX INFO: renamed from: c */
    int f30268c = 0;

    /* JADX INFO: renamed from: d */
    private boolean f30269d;

    /* JADX INFO: renamed from: e */
    private volatile Object f30270e;

    /* JADX INFO: renamed from: f */
    volatile Object f30271f;

    /* JADX INFO: renamed from: g */
    private int f30272g;

    /* JADX INFO: renamed from: h */
    private boolean f30273h;

    /* JADX INFO: renamed from: i */
    private boolean f30274i;

    /* JADX INFO: renamed from: j */
    private final Runnable f30275j;

    /* JADX INFO: renamed from: androidx.lifecycle.y$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (AbstractC2870y.this.f30266a) {
                obj = AbstractC2870y.this.f30271f;
                AbstractC2870y.this.f30271f = AbstractC2870y.f30265k;
            }
            AbstractC2870y.this.n(obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.y$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class b extends d {
        b(B b10) {
            super(b10);
        }

        @Override // androidx.lifecycle.AbstractC2870y.d
        boolean d() {
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.y$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c extends d implements InterfaceC2861o {

        /* JADX INFO: renamed from: e */
        final r f30278e;

        c(r rVar, B b10) {
            super(b10);
            this.f30278e = rVar;
        }

        @Override // androidx.lifecycle.AbstractC2870y.d
        void b() {
            this.f30278e.getLifecycle().removeObserver(this);
        }

        @Override // androidx.lifecycle.AbstractC2870y.d
        boolean c(r rVar) {
            return this.f30278e == rVar;
        }

        @Override // androidx.lifecycle.AbstractC2870y.d
        boolean d() {
            return this.f30278e.getLifecycle().getCurrentState().b(AbstractC2857k.b.f30238d);
        }

        @Override // androidx.lifecycle.InterfaceC2861o
        public void g(r rVar, AbstractC2857k.a aVar) {
            AbstractC2857k.b currentState = this.f30278e.getLifecycle().getCurrentState();
            if (currentState == AbstractC2857k.b.f30235a) {
                AbstractC2870y.this.m(this.f30280a);
                return;
            }
            AbstractC2857k.b bVar = null;
            while (bVar != currentState) {
                a(d());
                bVar = currentState;
                currentState = this.f30278e.getLifecycle().getCurrentState();
            }
        }
    }

    public AbstractC2870y() {
        Object obj = f30265k;
        this.f30271f = obj;
        this.f30275j = new a();
        this.f30270e = obj;
        this.f30272g = -1;
    }

    static void b(String str) {
        if (o.c.g().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void d(d dVar) {
        if (dVar.f30281b) {
            if (!dVar.d()) {
                dVar.a(false);
                return;
            }
            int i10 = dVar.f30282c;
            int i11 = this.f30272g;
            if (i10 >= i11) {
                return;
            }
            dVar.f30282c = i11;
            dVar.f30280a.a(this.f30270e);
        }
    }

    void c(int i10) {
        int i11 = this.f30268c;
        this.f30268c = i10 + i11;
        if (this.f30269d) {
            return;
        }
        this.f30269d = true;
        while (true) {
            try {
                int i12 = this.f30268c;
                if (i11 == i12) {
                    this.f30269d = false;
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    j();
                } else if (z11) {
                    k();
                }
                i11 = i12;
            } catch (Throwable th2) {
                this.f30269d = false;
                throw th2;
            }
        }
    }

    void e(d dVar) {
        if (this.f30273h) {
            this.f30274i = true;
            return;
        }
        this.f30273h = true;
        do {
            this.f30274i = false;
            if (dVar != null) {
                d(dVar);
                dVar = null;
            } else {
                C5905b.d dVarD = this.f30267b.d();
                while (dVarD.hasNext()) {
                    d((d) ((Map.Entry) dVarD.next()).getValue());
                    if (this.f30274i) {
                        break;
                    }
                }
            }
        } while (this.f30274i);
        this.f30273h = false;
    }

    public Object f() {
        Object obj = this.f30270e;
        if (obj != f30265k) {
            return obj;
        }
        return null;
    }

    public boolean g() {
        return this.f30268c > 0;
    }

    public void h(r rVar, B b10) {
        b("observe");
        if (rVar.getLifecycle().getCurrentState() == AbstractC2857k.b.f30235a) {
            return;
        }
        c cVar = new c(rVar, b10);
        d dVar = (d) this.f30267b.i(b10, cVar);
        if (dVar != null && !dVar.c(rVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        rVar.getLifecycle().addObserver(cVar);
    }

    public void i(B b10) {
        b("observeForever");
        b bVar = new b(b10);
        d dVar = (d) this.f30267b.i(b10, bVar);
        if (dVar instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        bVar.a(true);
    }

    protected void l(Object obj) {
        boolean z10;
        synchronized (this.f30266a) {
            z10 = this.f30271f == f30265k;
            this.f30271f = obj;
        }
        if (z10) {
            o.c.g().c(this.f30275j);
        }
    }

    public void m(B b10) {
        b("removeObserver");
        d dVar = (d) this.f30267b.l(b10);
        if (dVar == null) {
            return;
        }
        dVar.b();
        dVar.a(false);
    }

    protected void n(Object obj) {
        b("setValue");
        this.f30272g++;
        this.f30270e = obj;
        e(null);
    }

    /* JADX INFO: renamed from: androidx.lifecycle.y$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private abstract class d {

        /* JADX INFO: renamed from: a */
        final B f30280a;

        /* JADX INFO: renamed from: b */
        boolean f30281b;

        /* JADX INFO: renamed from: c */
        int f30282c = -1;

        d(B b10) {
            this.f30280a = b10;
        }

        void a(boolean z10) {
            if (z10 == this.f30281b) {
                return;
            }
            this.f30281b = z10;
            AbstractC2870y.this.c(z10 ? 1 : -1);
            if (this.f30281b) {
                AbstractC2870y.this.e(this);
            }
        }

        boolean c(r rVar) {
            return false;
        }

        abstract boolean d();

        void b() {
        }
    }

    protected void j() {
    }

    protected void k() {
    }
}
