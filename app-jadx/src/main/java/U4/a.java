package U4;

import U4.p;
import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f19119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f19120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map f19121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReferenceQueue f19122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p.a f19123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f19124f;

    /* JADX INFO: renamed from: U4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class ThreadFactoryC0326a implements ThreadFactory {

        /* JADX INFO: renamed from: U4.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class RunnableC0327a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f19125a;

            RunnableC0327a(Runnable runnable) {
                this.f19125a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f19125a.run();
            }
        }

        ThreadFactoryC0326a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0327a(runnable), "glide-active-resources");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends WeakReference {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final S4.f f19128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f19129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        v f19130c;

        c(S4.f fVar, p pVar, ReferenceQueue referenceQueue, boolean z10) {
            super(pVar, referenceQueue);
            this.f19128a = (S4.f) o5.k.e(fVar);
            this.f19130c = (pVar.d() && z10) ? (v) o5.k.e(pVar.c()) : null;
            this.f19129b = pVar.d();
        }

        void a() {
            this.f19130c = null;
            clear();
        }
    }

    a(boolean z10) {
        this(z10, Executors.newSingleThreadExecutor(new ThreadFactoryC0326a()));
    }

    synchronized void a(S4.f fVar, p pVar) {
        c cVar = (c) this.f19121c.put(fVar, new c(fVar, pVar, this.f19122d, this.f19119a));
        if (cVar != null) {
            cVar.a();
        }
    }

    void b() {
        while (!this.f19124f) {
            try {
                c((c) this.f19122d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    void c(c cVar) {
        v vVar;
        synchronized (this) {
            this.f19121c.remove(cVar.f19128a);
            if (cVar.f19129b && (vVar = cVar.f19130c) != null) {
                this.f19123e.d(cVar.f19128a, new p(vVar, true, false, cVar.f19128a, this.f19123e));
            }
        }
    }

    synchronized void d(S4.f fVar) {
        c cVar = (c) this.f19121c.remove(fVar);
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    synchronized p e(S4.f fVar) {
        c cVar = (c) this.f19121c.get(fVar);
        if (cVar == null) {
            return null;
        }
        p pVar = (p) cVar.get();
        if (pVar == null) {
            c(cVar);
        }
        return pVar;
    }

    void f(p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f19123e = aVar;
            }
        }
    }

    a(boolean z10, Executor executor) {
        this.f19121c = new HashMap();
        this.f19122d = new ReferenceQueue();
        this.f19119a = z10;
        this.f19120b = executor;
        executor.execute(new b());
    }
}
