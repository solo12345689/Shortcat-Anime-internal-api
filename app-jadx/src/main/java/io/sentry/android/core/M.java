package io.sentry.android.core;

import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import io.sentry.AbstractC5226l;
import io.sentry.C5248p1;
import io.sentry.C5270r3;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5187d0;
import io.sentry.InterfaceC5192e0;
import io.sentry.M3;
import io.sentry.android.core.internal.util.G;
import io.sentry.util.C5288a;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f49507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f49508c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f49511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.G f49512g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final InterfaceC5187d0 f49517l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ILogger f49518m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f49506a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Future f49509d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f49510e = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayDeque f49513h = new ArrayDeque();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ArrayDeque f49514i = new ArrayDeque();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ArrayDeque f49515j = new ArrayDeque();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map f49516k = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f49519n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected final C5288a f49520o = new C5288a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements G.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f49521a = 0.0f;

        a() {
        }

        @Override // io.sentry.android.core.internal.util.G.b
        public void e(long j10, long j11, long j12, long j13, boolean z10, boolean z11, float f10) {
            long jM = new C5270r3().m();
            long jNanoTime = ((j11 - System.nanoTime()) + SystemClock.elapsedRealtimeNanos()) - M.this.f49506a;
            if (jNanoTime < 0) {
                return;
            }
            if (z11) {
                M.this.f49515j.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jNanoTime), Long.valueOf(j12), jM));
            } else if (z10) {
                M.this.f49514i.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jNanoTime), Long.valueOf(j12), jM));
            }
            if (f10 != this.f49521a) {
                this.f49521a = f10;
                M.this.f49513h.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jNanoTime), Float.valueOf(f10), jM));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f49523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f49524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final File f49525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map f49526d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f49527e;

        public b(long j10, long j11, boolean z10, File file, Map map) {
            this.f49523a = j10;
            this.f49525c = file;
            this.f49524b = j11;
            this.f49526d = map;
            this.f49527e = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f49528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f49529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Date f49530c;

        public c(long j10, long j11, Date date) {
            this.f49528a = j10;
            this.f49529b = j11;
            this.f49530c = date;
        }
    }

    public M(String str, int i10, io.sentry.android.core.internal.util.G g10, InterfaceC5187d0 interfaceC5187d0, ILogger iLogger) {
        this.f49507b = new File((String) io.sentry.util.w.c(str, "TracesFilesDirPath is required"));
        this.f49508c = i10;
        this.f49518m = (ILogger) io.sentry.util.w.c(iLogger, "Logger is required");
        this.f49517l = interfaceC5187d0;
        this.f49512g = (io.sentry.android.core.internal.util.G) io.sentry.util.w.c(g10, "SentryFrameMetricsCollector is required");
    }

    private void i(List list) {
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.f49506a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C5248p1 c5248p1 = (C5248p1) it.next();
                        long jB = c5248p1.b();
                        long j10 = jB + jElapsedRealtimeNanos;
                        Double dA = c5248p1.a();
                        Long lC = c5248p1.c();
                        Long lD = c5248p1.d();
                        if (dA != null) {
                            arrayDeque3.add(new io.sentry.profilemeasurements.b(Long.valueOf(j10), dA, jB));
                        }
                        if (lC != null) {
                            arrayDeque.add(new io.sentry.profilemeasurements.b(Long.valueOf(j10), lC, jB));
                        }
                        if (lD != null) {
                            arrayDeque2.add(new io.sentry.profilemeasurements.b(Long.valueOf(j10), lD, jB));
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.f49516k.put("cpu_usage", new io.sentry.profilemeasurements.a("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.f49516k.put("memory_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.f49516k.put("memory_native_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque2));
        }
    }

    public void f() {
        InterfaceC5192e0 interfaceC5192e0A = this.f49520o.a();
        try {
            Future future = this.f49509d;
            if (future != null) {
                future.cancel(true);
                this.f49509d = null;
            }
            if (this.f49519n) {
                g(true, null);
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public b g(boolean z10, List list) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49520o.a();
        try {
            if (!this.f49519n) {
                this.f49518m.c(EnumC5215i3.WARNING, "Profiler not running", new Object[0]);
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
                return null;
            }
            try {
                Debug.stopMethodTracing();
            } finally {
                try {
                } catch (Throwable th2) {
                }
            }
            this.f49519n = false;
            this.f49512g.m(this.f49511f);
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            if (this.f49510e == null) {
                this.f49518m.c(EnumC5215i3.ERROR, "Trace file does not exists", new Object[0]);
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
                return null;
            }
            if (!this.f49514i.isEmpty()) {
                this.f49516k.put("slow_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.f49514i));
            }
            if (!this.f49515j.isEmpty()) {
                this.f49516k.put("frozen_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.f49515j));
            }
            if (!this.f49513h.isEmpty()) {
                this.f49516k.put("screen_frame_rates", new io.sentry.profilemeasurements.a("hz", this.f49513h));
            }
            i(list);
            Future future = this.f49509d;
            if (future != null) {
                future.cancel(true);
                this.f49509d = null;
            }
            b bVar = new b(jElapsedRealtimeNanos, elapsedCpuTime, z10, this.f49510e, this.f49516k);
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return bVar;
        } finally {
        }
    }

    boolean h() {
        return this.f49519n;
    }

    public c j() {
        InterfaceC5192e0 interfaceC5192e0A = this.f49520o.a();
        try {
            int i10 = this.f49508c;
            if (i10 == 0) {
                this.f49518m.c(EnumC5215i3.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i10));
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
                return null;
            }
            if (this.f49519n) {
                this.f49518m.c(EnumC5215i3.WARNING, "Profiling has already started...", new Object[0]);
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
                return null;
            }
            this.f49510e = new File(this.f49507b, M3.a() + ".trace");
            this.f49516k.clear();
            this.f49513h.clear();
            this.f49514i.clear();
            this.f49515j.clear();
            this.f49511f = this.f49512g.l(new a());
            try {
                InterfaceC5187d0 interfaceC5187d0 = this.f49517l;
                if (interfaceC5187d0 != null) {
                    this.f49509d = interfaceC5187d0.schedule(new Runnable() { // from class: io.sentry.android.core.L
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f49504a.g(true, null);
                        }
                    }, HTTPTimeoutManager.DEFAULT_TIMEOUT_MS);
                }
            } catch (RejectedExecutionException e10) {
                this.f49518m.b(EnumC5215i3.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e10);
            }
            this.f49506a = SystemClock.elapsedRealtimeNanos();
            Date dateD = AbstractC5226l.d();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            try {
                Debug.startMethodTracingSampling(this.f49510e.getPath(), 3000000, this.f49508c);
                this.f49519n = true;
                c cVar = new c(this.f49506a, elapsedCpuTime, dateD);
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
                return cVar;
            } catch (Throwable th2) {
                g(false, null);
                this.f49518m.b(EnumC5215i3.ERROR, "Unable to start a profile: ", th2);
                this.f49519n = false;
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
                return null;
            }
        } finally {
        }
    }
}
