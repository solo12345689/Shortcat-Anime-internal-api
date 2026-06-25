package io.sentry.android.core;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class ApplicationNotResponding extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread f49470a;

    ApplicationNotResponding(String str, Thread thread) {
        super(str);
        Thread thread2 = (Thread) io.sentry.util.w.c(thread, "Thread must be provided.");
        this.f49470a = thread2;
        setStackTrace(thread2.getStackTrace());
    }

    public Thread a() {
        return this.f49470a;
    }
}
