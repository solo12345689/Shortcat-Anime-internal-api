package io.sentry.util.thread;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f51435a = Thread.currentThread().getId();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f51436b = new c();

    private c() {
    }

    public static c d() {
        return f51436b;
    }

    @Override // io.sentry.util.thread.a
    public boolean a() {
        return f(Thread.currentThread());
    }

    @Override // io.sentry.util.thread.a
    public String b() {
        return Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.a
    public long c() {
        return Thread.currentThread().getId();
    }

    public boolean e(long j10) {
        return f51435a == j10;
    }

    public boolean f(Thread thread) {
        return e(thread.getId());
    }
}
