package I5;

import android.util.Pair;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import y5.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements I5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f8808a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f8811d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Throwable f8812e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f8813f = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8810c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f8809b = d.IN_PROGRESS;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConcurrentLinkedQueue f8814g = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: I5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class RunnableC0118a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f8815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f8816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f8817c;

        RunnableC0118a(boolean z10, e eVar, boolean z11) {
            this.f8815a = z10;
            this.f8816b = eVar;
            this.f8817c = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8815a) {
                this.f8816b.c(a.this);
            } else if (this.f8817c) {
                this.f8816b.d(a.this);
            } else {
                this.f8816b.a(a.this);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f8819a;

        b(e eVar) {
            this.f8819a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8819a.b(a.this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private enum d {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    protected a() {
    }

    public static c h() {
        return null;
    }

    private void l() {
        boolean zI = i();
        boolean zV = v();
        for (Pair pair : this.f8814g) {
            k((e) pair.first, (Executor) pair.second, zI, zV);
        }
    }

    private synchronized boolean q(Throwable th2, Map map) {
        if (!this.f8810c && this.f8809b == d.IN_PROGRESS) {
            this.f8809b = d.FAILURE;
            this.f8812e = th2;
            this.f8808a = map;
            return true;
        }
        return false;
    }

    private synchronized boolean s(float f10) {
        if (!this.f8810c && this.f8809b == d.IN_PROGRESS) {
            if (f10 < this.f8813f) {
                return false;
            }
            this.f8813f = f10;
            return true;
        }
        return false;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0019 -> B:32:0x003a). Please report as a decompilation issue!!! */
    private boolean u(Object obj, boolean z10) {
        Object obj2;
        Object obj3 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        if (!this.f8810c && this.f8809b == d.IN_PROGRESS) {
                            if (z10) {
                                this.f8809b = d.SUCCESS;
                                this.f8813f = 1.0f;
                            }
                            Object obj4 = this.f8811d;
                            if (obj4 != obj) {
                                try {
                                    this.f8811d = obj;
                                    obj2 = obj4;
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj3 = obj4;
                                    throw th;
                                }
                            } else {
                                obj2 = null;
                            }
                            return true;
                        }
                        if (obj != null) {
                            g(obj);
                        }
                        return false;
                    } catch (Throwable th3) {
                        obj3 = obj;
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } finally {
            if (obj3 != null) {
                g(obj3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean v() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.j()     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            boolean r0 = r1.isFinished()     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        Lf:
            r0 = move-exception
            goto L14
        L11:
            r0 = 0
        L12:
            monitor-exit(r1)
            return r0
        L14:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I5.a.v():boolean");
    }

    @Override // I5.c
    public synchronized Object a() {
        return this.f8811d;
    }

    @Override // I5.c
    public synchronized boolean b() {
        return this.f8811d != null;
    }

    @Override // I5.c
    public synchronized Throwable c() {
        return this.f8812e;
    }

    @Override // I5.c
    public boolean close() {
        synchronized (this) {
            try {
                if (this.f8810c) {
                    return false;
                }
                this.f8810c = true;
                Object obj = this.f8811d;
                this.f8811d = null;
                if (obj != null) {
                    g(obj);
                }
                if (!isFinished()) {
                    l();
                }
                synchronized (this) {
                    this.f8814g.clear();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // I5.c
    public synchronized float d() {
        return this.f8813f;
    }

    @Override // I5.c
    public boolean e() {
        return false;
    }

    @Override // I5.c
    public void f(e eVar, Executor executor) {
        k.g(eVar);
        k.g(executor);
        synchronized (this) {
            try {
                if (this.f8810c) {
                    return;
                }
                if (this.f8809b == d.IN_PROGRESS) {
                    this.f8814g.add(Pair.create(eVar, executor));
                }
                boolean z10 = b() || isFinished() || v();
                if (z10) {
                    k(eVar, executor, i(), v());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // I5.c
    public Map getExtras() {
        return this.f8808a;
    }

    public synchronized boolean i() {
        return this.f8809b == d.FAILURE;
    }

    @Override // I5.c
    public synchronized boolean isFinished() {
        return this.f8809b != d.IN_PROGRESS;
    }

    public synchronized boolean j() {
        return this.f8810c;
    }

    protected void k(e eVar, Executor executor, boolean z10, boolean z11) {
        RunnableC0118a runnableC0118a = new RunnableC0118a(z10, eVar, z11);
        h();
        executor.execute(runnableC0118a);
    }

    protected void m() {
        for (Pair pair : this.f8814g) {
            ((Executor) pair.second).execute(new b((e) pair.first));
        }
    }

    protected void n(Map map) {
        this.f8808a = map;
    }

    protected boolean o(Throwable th2) {
        return p(th2, null);
    }

    protected boolean p(Throwable th2, Map map) {
        boolean zQ = q(th2, map);
        if (zQ) {
            l();
        }
        return zQ;
    }

    protected boolean r(float f10) {
        boolean zS = s(f10);
        if (zS) {
            m();
        }
        return zS;
    }

    protected boolean t(Object obj, boolean z10, Map map) {
        n(map);
        boolean zU = u(obj, z10);
        if (zU) {
            l();
        }
        return zU;
    }

    protected void g(Object obj) {
    }
}
