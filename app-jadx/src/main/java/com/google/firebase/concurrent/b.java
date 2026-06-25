package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class b implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ThreadFactory f43218e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicLong f43219a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f43220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f43221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final StrictMode.ThreadPolicy f43222d;

    b(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f43220b = str;
        this.f43221c = i10;
        this.f43222d = threadPolicy;
    }

    public static /* synthetic */ void a(b bVar, Runnable runnable) {
        Process.setThreadPriority(bVar.f43221c);
        StrictMode.ThreadPolicy threadPolicy = bVar.f43222d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread threadNewThread = f43218e.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                b.a(this.f43216a, runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f43220b, Long.valueOf(this.f43219a.getAndIncrement())));
        return threadNewThread;
    }
}
