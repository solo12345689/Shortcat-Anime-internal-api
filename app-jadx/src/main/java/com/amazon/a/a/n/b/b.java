package com.amazon.a.a.n.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f34579a = new com.amazon.a.a.o.c("SimpleTaskPipeline");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f34580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<Runnable> f34581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f34582d;

    private b(HandlerThread handlerThread) {
        this.f34581c = Collections.synchronizedSet(new HashSet());
        this.f34582d = handlerThread.getName();
        handlerThread.start();
        this.f34580b = new Handler(handlerThread.getLooper());
    }

    private Runnable c(final com.amazon.a.a.n.a aVar) {
        Runnable runnable = new Runnable() { // from class: com.amazon.a.a.n.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.this.f34581c.remove(this);
                try {
                    if (com.amazon.a.a.o.c.f34699a) {
                        b.f34579a.a(b.this.f34582d + ": Executing Task: " + aVar + ", current time: " + new Date() + ", uptime: " + SystemClock.uptimeMillis());
                    }
                    aVar.a();
                } catch (Throwable th2) {
                    try {
                        if (com.amazon.a.a.o.c.f34700b) {
                            b.f34579a.b("Task Failed with unhandled exception: " + th2, th2);
                        }
                        if (com.amazon.a.a.o.c.f34699a) {
                            b.f34579a.a(b.this.f34582d + ": Task finished executing: " + aVar);
                        }
                    } finally {
                        if (com.amazon.a.a.o.c.f34699a) {
                            b.f34579a.a(b.this.f34582d + ": Task finished executing: " + aVar);
                        }
                    }
                }
            }

            public String toString() {
                return aVar.toString();
            }
        };
        this.f34581c.add(runnable);
        return runnable;
    }

    public static b a(String str) {
        return new b(new HandlerThread("KIWI_" + str));
    }

    public static b b(String str) {
        return new b(str);
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar) {
        if (com.amazon.a.a.o.c.f34699a) {
            f34579a.a("Scheduling task: " + aVar);
        }
        this.f34580b.post(c(aVar));
    }

    @Override // com.amazon.a.a.n.b.c
    public void b(com.amazon.a.a.n.a aVar) {
        if (com.amazon.a.a.o.c.f34699a) {
            f34579a.a(this.f34582d + ": Scheduling task immediately: " + aVar);
        }
        this.f34580b.postAtFrontOfQueue(c(aVar));
    }

    private b(String str) {
        this.f34581c = Collections.synchronizedSet(new HashSet());
        this.f34582d = str;
        this.f34580b = new Handler();
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar, Date date) {
        long jA = a(date);
        if (com.amazon.a.a.o.c.f34699a) {
            f34579a.a(this.f34582d + ": Scheduling task: " + aVar + ", at time: " + date + ", System uptimeMillis: " + System.currentTimeMillis() + ", uptimeMillis: " + jA);
        }
        this.f34580b.postAtTime(c(aVar), jA);
    }

    private long a(Date date) {
        return SystemClock.uptimeMillis() + (date.getTime() - System.currentTimeMillis());
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar, long j10) {
        if (com.amazon.a.a.o.c.f34699a) {
            f34579a.a(this.f34582d + ": Scheduling task: " + aVar + ", with delay: " + j10);
        }
        this.f34580b.postDelayed(c(aVar), j10);
    }

    @Override // com.amazon.a.a.n.b.c
    public void a() {
        for (Runnable runnable : this.f34581c) {
            if (com.amazon.a.a.o.c.f34699a) {
                f34579a.a(this.f34582d + ": Removing callback: " + runnable);
            }
            this.f34580b.removeCallbacks(runnable);
        }
        this.f34581c.clear();
        if (this.f34580b.getLooper() == Looper.getMainLooper() || !this.f34580b.getLooper().getThread().isAlive()) {
            return;
        }
        com.amazon.a.a.o.c cVar = f34579a;
        cVar.a("Interrupting looper thread!");
        this.f34580b.getLooper().getThread().interrupt();
        cVar.a("Quitting looper: " + this.f34580b.getLooper().getThread() + ", " + this.f34580b.getLooper().getThread().isAlive());
        this.f34580b.getLooper().quit();
    }
}
