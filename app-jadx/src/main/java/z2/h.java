package z2;

import java.util.ArrayDeque;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements InterfaceC7279d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread f65566a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f[] f65570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g[] f65571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f65572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f65573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private f f65574i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private e f65575j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f65576k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f65577l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f65578m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f65567b = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f65579n = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque f65568c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayDeque f65569d = new ArrayDeque();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            h.this.w();
        }
    }

    protected h(f[] fVarArr, g[] gVarArr) {
        this.f65570e = fVarArr;
        this.f65572g = fVarArr.length;
        for (int i10 = 0; i10 < this.f65572g; i10++) {
            this.f65570e[i10] = j();
        }
        this.f65571f = gVarArr;
        this.f65573h = gVarArr.length;
        for (int i11 = 0; i11 < this.f65573h; i11++) {
            this.f65571f[i11] = k();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f65566a = aVar;
        aVar.start();
    }

    private boolean i() {
        return !this.f65568c.isEmpty() && this.f65573h > 0;
    }

    private boolean n() {
        e eVarL;
        synchronized (this.f65567b) {
            while (!this.f65577l && !i()) {
                try {
                    this.f65567b.wait();
                } finally {
                }
            }
            if (this.f65577l) {
                return false;
            }
            f fVar = (f) this.f65568c.removeFirst();
            g[] gVarArr = this.f65571f;
            int i10 = this.f65573h - 1;
            this.f65573h = i10;
            g gVar = gVarArr[i10];
            boolean z10 = this.f65576k;
            this.f65576k = false;
            if (fVar.q()) {
                gVar.k(4);
            } else {
                gVar.f65563b = fVar.f65557f;
                if (fVar.r()) {
                    gVar.k(134217728);
                }
                if (!q(fVar.f65557f)) {
                    gVar.f65565d = true;
                }
                try {
                    eVarL = m(fVar, gVar, z10);
                } catch (OutOfMemoryError e10) {
                    eVarL = l(e10);
                } catch (RuntimeException e11) {
                    eVarL = l(e11);
                }
                if (eVarL != null) {
                    synchronized (this.f65567b) {
                        this.f65575j = eVarL;
                    }
                    return false;
                }
            }
            synchronized (this.f65567b) {
                try {
                    if (this.f65576k) {
                        gVar.w();
                    } else if (gVar.f65565d) {
                        this.f65578m++;
                        gVar.w();
                    } else {
                        gVar.f65564c = this.f65578m;
                        this.f65578m = 0;
                        this.f65569d.addLast(gVar);
                    }
                    t(fVar);
                } finally {
                }
            }
            return true;
        }
    }

    private void r() {
        if (i()) {
            this.f65567b.notify();
        }
    }

    private void s() throws e {
        e eVar = this.f65575j;
        if (eVar != null) {
            throw eVar;
        }
    }

    private void t(f fVar) {
        fVar.m();
        f[] fVarArr = this.f65570e;
        int i10 = this.f65572g;
        this.f65572g = i10 + 1;
        fVarArr[i10] = fVar;
    }

    private void v(g gVar) {
        gVar.m();
        g[] gVarArr = this.f65571f;
        int i10 = this.f65573h;
        this.f65573h = i10 + 1;
        gVarArr[i10] = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (n());
    }

    @Override // z2.InterfaceC7279d
    public void a() {
        synchronized (this.f65567b) {
            this.f65577l = true;
            this.f65567b.notify();
        }
        try {
            this.f65566a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // z2.InterfaceC7279d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void e(f fVar) {
        synchronized (this.f65567b) {
            s();
            AbstractC6614a.a(fVar == this.f65574i);
            this.f65568c.addLast(fVar);
            r();
            this.f65574i = null;
        }
    }

    @Override // z2.InterfaceC7279d
    public final void f(long j10) {
        synchronized (this.f65567b) {
            try {
                AbstractC6614a.g(this.f65572g == this.f65570e.length || this.f65576k);
                this.f65579n = j10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // z2.InterfaceC7279d
    public final void flush() {
        synchronized (this.f65567b) {
            try {
                this.f65576k = true;
                this.f65578m = 0;
                f fVar = this.f65574i;
                if (fVar != null) {
                    t(fVar);
                    this.f65574i = null;
                }
                while (!this.f65568c.isEmpty()) {
                    t((f) this.f65568c.removeFirst());
                }
                while (!this.f65569d.isEmpty()) {
                    ((g) this.f65569d.removeFirst()).w();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected abstract f j();

    protected abstract g k();

    protected abstract e l(Throwable th2);

    protected abstract e m(f fVar, g gVar, boolean z10);

    @Override // z2.InterfaceC7279d
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final f g() {
        f fVar;
        synchronized (this.f65567b) {
            s();
            AbstractC6614a.g(this.f65574i == null);
            int i10 = this.f65572g;
            if (i10 == 0) {
                fVar = null;
            } else {
                f[] fVarArr = this.f65570e;
                int i11 = i10 - 1;
                this.f65572g = i11;
                fVar = fVarArr[i11];
            }
            this.f65574i = fVar;
        }
        return fVar;
    }

    @Override // z2.InterfaceC7279d, I2.b
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final g b() {
        synchronized (this.f65567b) {
            try {
                s();
                if (this.f65569d.isEmpty()) {
                    return null;
                }
                return (g) this.f65569d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final boolean q(long j10) {
        boolean z10;
        synchronized (this.f65567b) {
            long j11 = this.f65579n;
            z10 = j11 == -9223372036854775807L || j10 >= j11;
        }
        return z10;
    }

    protected void u(g gVar) {
        synchronized (this.f65567b) {
            v(gVar);
            r();
        }
    }

    protected final void x(int i10) {
        AbstractC6614a.g(this.f65572g == this.f65570e.length);
        for (f fVar : this.f65570e) {
            fVar.x(i10);
        }
    }
}
