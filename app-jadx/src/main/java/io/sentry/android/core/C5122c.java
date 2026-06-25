package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.SystemClock;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.sentry.android.core.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class C5122c extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f49671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f49672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N0 f49673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.transport.o f49674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f49675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f49676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ILogger f49677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile long f49678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f49679i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f49680j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f49681k;

    /* JADX INFO: renamed from: io.sentry.android.core.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a(ApplicationNotResponding applicationNotResponding);
    }

    C5122c(long j10, boolean z10, a aVar, ILogger iLogger, Context context) {
        this(new io.sentry.transport.o() { // from class: io.sentry.android.core.a
            @Override // io.sentry.transport.o
            public final long getCurrentTimeMillis() {
                return SystemClock.uptimeMillis();
            }
        }, j10, 500L, z10, aVar, iLogger, new N0(), context);
    }

    public static /* synthetic */ void a(C5122c c5122c, io.sentry.transport.o oVar) {
        c5122c.getClass();
        c5122c.f49678h = oVar.getCurrentTimeMillis();
        c5122c.f49679i.set(false);
    }

    private boolean c() {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        ActivityManager activityManager = (ActivityManager) this.f49680j.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        try {
            processesInErrorState = activityManager.getProcessesInErrorState();
        } catch (Throwable th2) {
            this.f49677g.b(EnumC5215i3.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th2);
            processesInErrorState = null;
        }
        if (processesInErrorState == null) {
            return false;
        }
        Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
        while (it.hasNext()) {
            if (it.next().condition == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.f49681k.run();
        while (!isInterrupted()) {
            this.f49673c.b(this.f49681k);
            try {
                Thread.sleep(this.f49675e);
                if (this.f49674d.getCurrentTimeMillis() - this.f49678h > this.f49676f) {
                    if (!this.f49671a && (Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        this.f49677g.c(EnumC5215i3.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.f49679i.set(true);
                    } else if (c() && this.f49679i.compareAndSet(false, true)) {
                        this.f49672b.a(new ApplicationNotResponding("Application Not Responding for at least " + this.f49676f + " ms.", this.f49673c.a()));
                    }
                }
            } catch (InterruptedException e10) {
                try {
                    Thread.currentThread().interrupt();
                    this.f49677g.c(EnumC5215i3.WARNING, "Interrupted: %s", e10.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.f49677g.c(EnumC5215i3.WARNING, "Failed to interrupt due to SecurityException: %s", e10.getMessage());
                    return;
                }
            }
        }
    }

    C5122c(final io.sentry.transport.o oVar, long j10, long j11, boolean z10, a aVar, ILogger iLogger, N0 n02, Context context) {
        super("|ANR-WatchDog|");
        this.f49678h = 0L;
        this.f49679i = new AtomicBoolean(false);
        this.f49674d = oVar;
        this.f49676f = j10;
        this.f49675e = j11;
        this.f49671a = z10;
        this.f49672b = aVar;
        this.f49677g = iLogger;
        this.f49673c = n02;
        this.f49680j = context;
        this.f49681k = new Runnable() { // from class: io.sentry.android.core.b
            @Override // java.lang.Runnable
            public final void run() {
                C5122c.a(this.f49666a, oVar);
            }
        };
        if (j10 < this.f49675e * 2) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", Long.valueOf(this.f49675e * 2)));
        }
    }
}
