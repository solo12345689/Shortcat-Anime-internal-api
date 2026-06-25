package Lf;

import Gf.InterfaceC1612h0;
import Gf.InterfaceC1623n;
import Gf.V;
import Gf.Y;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: Lf.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1905l extends Gf.K implements Y {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f11577i = AtomicIntegerFieldUpdater.newUpdater(C1905l.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Y f11578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Gf.K f11579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f11580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f11581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1910q f11582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f11583h;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: Lf.l$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Runnable f11584a;

        public a(Runnable runnable) {
            this.f11584a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f11584a.run();
                } catch (Throwable th2) {
                    Gf.M.a(Zd.j.f23275a, th2);
                }
                Runnable runnableG2 = C1905l.this.g2();
                if (runnableG2 == null) {
                    return;
                }
                try {
                    this.f11584a = runnableG2;
                    i10++;
                    if (i10 >= 16 && AbstractC1903j.d(C1905l.this.f11579d, C1905l.this)) {
                        AbstractC1903j.c(C1905l.this.f11579d, C1905l.this, this);
                        return;
                    }
                } catch (Throwable th3) {
                    Object obj = C1905l.this.f11583h;
                    C1905l c1905l = C1905l.this;
                    synchronized (obj) {
                        C1905l.f2().decrementAndGet(c1905l);
                        throw th3;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1905l(Gf.K k10, int i10, String str) {
        Y y10 = k10 instanceof Y ? (Y) k10 : null;
        this.f11578c = y10 == null ? V.a() : y10;
        this.f11579d = k10;
        this.f11580e = i10;
        this.f11581f = str;
        this.f11582g = new C1910q(false);
        this.f11583h = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2() {
        return f11577i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable g2() {
        while (true) {
            Runnable runnable = (Runnable) this.f11582g.e();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f11583h) {
                f11577i.decrementAndGet(this);
                if (this.f11582g.c() == 0) {
                    return null;
                }
                f11577i.incrementAndGet(this);
            }
        }
    }

    private final boolean h2() {
        synchronized (this.f11583h) {
            if (f11577i.get(this) >= this.f11580e) {
                return false;
            }
            f11577i.incrementAndGet(this);
            return true;
        }
    }

    @Override // Gf.Y
    public InterfaceC1612h0 B0(long j10, Runnable runnable, Zd.i iVar) {
        return this.f11578c.B0(j10, runnable, iVar);
    }

    @Override // Gf.K
    public void D1(Zd.i iVar, Runnable runnable) {
        Runnable runnableG2;
        this.f11582g.a(runnable);
        if (f11577i.get(this) >= this.f11580e || !h2() || (runnableG2 = g2()) == null) {
            return;
        }
        try {
            AbstractC1903j.c(this.f11579d, this, new a(runnableG2));
        } catch (Throwable th2) {
            f11577i.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // Gf.Y
    public void G0(long j10, InterfaceC1623n interfaceC1623n) {
        this.f11578c.G0(j10, interfaceC1623n);
    }

    @Override // Gf.K
    public void O1(Zd.i iVar, Runnable runnable) {
        Runnable runnableG2;
        this.f11582g.a(runnable);
        if (f11577i.get(this) >= this.f11580e || !h2() || (runnableG2 = g2()) == null) {
            return;
        }
        try {
            this.f11579d.O1(this, new a(runnableG2));
        } catch (Throwable th2) {
            f11577i.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // Gf.K
    public Gf.K Z1(int i10, String str) {
        AbstractC1906m.a(i10);
        return i10 >= this.f11580e ? AbstractC1906m.b(this, str) : super.Z1(i10, str);
    }

    @Override // Gf.K
    public String toString() {
        String str = this.f11581f;
        if (str != null) {
            return str;
        }
        return this.f11579d + ".limitedParallelism(" + this.f11580e + ')';
    }
}
