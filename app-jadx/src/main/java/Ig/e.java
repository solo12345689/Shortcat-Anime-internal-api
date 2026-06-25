package ig;

import Td.L;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import fg.AbstractC4807e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: h */
    public static final b f48892h = new b(null);

    /* JADX INFO: renamed from: i */
    public static final e f48893i = new e(new c(AbstractC4807e.N(AbstractC4807e.f47070i + " TaskRunner", true)));

    /* JADX INFO: renamed from: j */
    private static final Logger f48894j;

    /* JADX INFO: renamed from: a */
    private final a f48895a;

    /* JADX INFO: renamed from: b */
    private int f48896b;

    /* JADX INFO: renamed from: c */
    private boolean f48897c;

    /* JADX INFO: renamed from: d */
    private long f48898d;

    /* JADX INFO: renamed from: e */
    private final List f48899e;

    /* JADX INFO: renamed from: f */
    private final List f48900f;

    /* JADX INFO: renamed from: g */
    private final Runnable f48901g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a(e eVar, long j10);

        long b();

        void c(e eVar);

        void execute(Runnable runnable);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger a() {
            return e.f48894j;
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements a {

        /* JADX INFO: renamed from: a */
        private final ThreadPoolExecutor f48902a;

        public c(ThreadFactory threadFactory) {
            AbstractC5504s.h(threadFactory, "threadFactory");
            this.f48902a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // ig.e.a
        public void a(e taskRunner, long j10) throws InterruptedException {
            AbstractC5504s.h(taskRunner, "taskRunner");
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                taskRunner.wait(j11, (int) j12);
            }
        }

        @Override // ig.e.a
        public long b() {
            return System.nanoTime();
        }

        @Override // ig.e.a
        public void c(e taskRunner) {
            AbstractC5504s.h(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // ig.e.a
        public void execute(Runnable runnable) {
            AbstractC5504s.h(runnable, "runnable");
            this.f48902a.execute(runnable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC5097a abstractC5097aD;
            long jB;
            while (true) {
                e eVar = e.this;
                synchronized (eVar) {
                    abstractC5097aD = eVar.d();
                }
                if (abstractC5097aD == null) {
                    return;
                }
                ig.d dVarD = abstractC5097aD.d();
                AbstractC5504s.e(dVarD);
                e eVar2 = e.this;
                boolean zIsLoggable = e.f48892h.a().isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jB = dVarD.h().g().b();
                    AbstractC5098b.c(abstractC5097aD, dVarD, "starting");
                } else {
                    jB = -1;
                }
                try {
                    try {
                        eVar2.j(abstractC5097aD);
                        L l10 = L.f17438a;
                        if (zIsLoggable) {
                            AbstractC5098b.c(abstractC5097aD, dVarD, "finished run in " + AbstractC5098b.b(dVarD.h().g().b() - jB));
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    if (zIsLoggable) {
                        AbstractC5098b.c(abstractC5097aD, dVarD, "failed a run in " + AbstractC5098b.b(dVarD.h().g().b() - jB));
                    }
                    throw th2;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        AbstractC5504s.g(logger, "getLogger(TaskRunner::class.java.name)");
        f48894j = logger;
    }

    public e(a backend) {
        AbstractC5504s.h(backend, "backend");
        this.f48895a = backend;
        this.f48896b = ColorExtractionConstants.MAX_PIXEL_SAMPLES;
        this.f48899e = new ArrayList();
        this.f48900f = new ArrayList();
        this.f48901g = new d();
    }

    private final void c(AbstractC5097a abstractC5097a, long j10) {
        if (AbstractC4807e.f47069h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        ig.d dVarD = abstractC5097a.d();
        AbstractC5504s.e(dVarD);
        if (dVarD.c() != abstractC5097a) {
            throw new IllegalStateException("Check failed.");
        }
        boolean zD = dVarD.d();
        dVarD.m(false);
        dVarD.l(null);
        this.f48899e.remove(dVarD);
        if (j10 != -1 && !zD && !dVarD.g()) {
            dVarD.k(abstractC5097a, j10, true);
        }
        if (dVarD.e().isEmpty()) {
            return;
        }
        this.f48900f.add(dVarD);
    }

    private final void e(AbstractC5097a abstractC5097a) {
        if (AbstractC4807e.f47069h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        abstractC5097a.g(-1L);
        ig.d dVarD = abstractC5097a.d();
        AbstractC5504s.e(dVarD);
        dVarD.e().remove(abstractC5097a);
        this.f48900f.remove(dVarD);
        dVarD.l(abstractC5097a);
        this.f48899e.add(dVarD);
    }

    public final void j(AbstractC5097a abstractC5097a) {
        if (AbstractC4807e.f47069h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(abstractC5097a.b());
        try {
            long jF = abstractC5097a.f();
            synchronized (this) {
                c(abstractC5097a, jF);
                L l10 = L.f17438a;
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th2) {
            synchronized (this) {
                c(abstractC5097a, -1L);
                L l11 = L.f17438a;
                threadCurrentThread.setName(name);
                throw th2;
            }
        }
    }

    public final AbstractC5097a d() {
        boolean z10;
        if (AbstractC4807e.f47069h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.f48900f.isEmpty()) {
            long jB = this.f48895a.b();
            Iterator it = this.f48900f.iterator();
            long jMin = Long.MAX_VALUE;
            AbstractC5097a abstractC5097a = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                AbstractC5097a abstractC5097a2 = (AbstractC5097a) ((ig.d) it.next()).e().get(0);
                long jMax = Math.max(0L, abstractC5097a2.c() - jB);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC5097a != null) {
                        z10 = true;
                        break;
                    }
                    abstractC5097a = abstractC5097a2;
                }
            }
            if (abstractC5097a != null) {
                e(abstractC5097a);
                if (z10 || (!this.f48897c && !this.f48900f.isEmpty())) {
                    this.f48895a.execute(this.f48901g);
                }
                return abstractC5097a;
            }
            if (this.f48897c) {
                if (jMin < this.f48898d - jB) {
                    this.f48895a.c(this);
                }
                return null;
            }
            this.f48897c = true;
            this.f48898d = jB + jMin;
            try {
                try {
                    this.f48895a.a(this, jMin);
                } catch (InterruptedException unused) {
                    f();
                }
            } finally {
                this.f48897c = false;
            }
        }
        return null;
    }

    public final void f() {
        int size = this.f48899e.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((ig.d) this.f48899e.get(size)).b();
            }
        }
        for (int size2 = this.f48900f.size() - 1; -1 < size2; size2--) {
            ig.d dVar = (ig.d) this.f48900f.get(size2);
            dVar.b();
            if (dVar.e().isEmpty()) {
                this.f48900f.remove(size2);
            }
        }
    }

    public final a g() {
        return this.f48895a;
    }

    public final void h(ig.d taskQueue) {
        AbstractC5504s.h(taskQueue, "taskQueue");
        if (AbstractC4807e.f47069h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.c() == null) {
            if (taskQueue.e().isEmpty()) {
                this.f48900f.remove(taskQueue);
            } else {
                AbstractC4807e.c(this.f48900f, taskQueue);
            }
        }
        if (this.f48897c) {
            this.f48895a.c(this);
        } else {
            this.f48895a.execute(this.f48901g);
        }
    }

    public final ig.d i() {
        int i10;
        synchronized (this) {
            i10 = this.f48896b;
            this.f48896b = i10 + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('Q');
        sb2.append(i10);
        return new ig.d(this, sb2.toString());
    }
}
