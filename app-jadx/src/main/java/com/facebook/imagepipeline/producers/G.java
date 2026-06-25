package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f36040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f36041b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f36044e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f36042c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f36043d = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    E6.k f36045f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f36046g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    f f36047h = f.IDLE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f36048i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    long f36049j = 0;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            G.this.d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            G.this.j();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36052a;

        static {
            int[] iArr = new int[f.values().length];
            f36052a = iArr;
            try {
                iArr[f.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36052a[f.QUEUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36052a[f.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36052a[f.RUNNING_AND_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface d {
        void a(E6.k kVar, int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static ScheduledExecutorService f36053a;

        static ScheduledExecutorService a() {
            if (f36053a == null) {
                f36053a = Executors.newSingleThreadScheduledExecutor();
            }
            return f36053a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    enum f {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    public G(Executor executor, d dVar, int i10) {
        this.f36040a = executor;
        this.f36041b = dVar;
        this.f36044e = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        E6.k kVar;
        int i10;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            kVar = this.f36045f;
            i10 = this.f36046g;
            this.f36045f = null;
            this.f36046g = 0;
            this.f36047h = f.RUNNING;
            this.f36049j = jUptimeMillis;
        }
        try {
            if (i(kVar, i10)) {
                this.f36041b.a(kVar, i10);
            }
        } finally {
            E6.k.g(kVar);
            g();
        }
    }

    private void e(long j10) {
        Runnable runnableA = F6.a.a(this.f36043d, "JobScheduler_enqueueJob");
        if (j10 > 0) {
            e.a().schedule(runnableA, j10, TimeUnit.MILLISECONDS);
        } else {
            runnableA.run();
        }
    }

    private void g() {
        long jMax;
        boolean z10;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (this.f36047h == f.RUNNING_AND_PENDING) {
                    jMax = Math.max(this.f36049j + ((long) this.f36044e), jUptimeMillis);
                    this.f36048i = jUptimeMillis;
                    this.f36047h = f.QUEUED;
                    z10 = true;
                } else {
                    this.f36047h = f.IDLE;
                    jMax = 0;
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            e(jMax - jUptimeMillis);
        }
    }

    private static boolean i(E6.k kVar, int i10) {
        return AbstractC3183c.e(i10) || AbstractC3183c.n(i10, 4) || E6.k.Y(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f36040a.execute(F6.a.a(this.f36042c, "JobScheduler_submitJob"));
    }

    public void c() {
        E6.k kVar;
        synchronized (this) {
            kVar = this.f36045f;
            this.f36045f = null;
            this.f36046g = 0;
        }
        E6.k.g(kVar);
    }

    public synchronized long f() {
        return this.f36049j - this.f36048i;
    }

    public boolean h() {
        long jMax;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                boolean z10 = false;
                if (!i(this.f36045f, this.f36046g)) {
                    return false;
                }
                int i10 = c.f36052a[this.f36047h.ordinal()];
                if (i10 != 1) {
                    if (i10 == 3) {
                        this.f36047h = f.RUNNING_AND_PENDING;
                    }
                    jMax = 0;
                } else {
                    jMax = Math.max(this.f36049j + ((long) this.f36044e), jUptimeMillis);
                    this.f36048i = jUptimeMillis;
                    this.f36047h = f.QUEUED;
                    z10 = true;
                }
                if (z10) {
                    e(jMax - jUptimeMillis);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean k(E6.k kVar, int i10) {
        E6.k kVar2;
        if (!i(kVar, i10)) {
            return false;
        }
        synchronized (this) {
            kVar2 = this.f36045f;
            this.f36045f = E6.k.b(kVar);
            this.f36046g = i10;
        }
        E6.k.g(kVar2);
        return true;
    }
}
