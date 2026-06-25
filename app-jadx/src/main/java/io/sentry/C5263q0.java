package io.sentry;

/* JADX INFO: renamed from: io.sentry.q0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5263q0 implements W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runtime f51163a = Runtime.getRuntime();

    @Override // io.sentry.W
    public void d(C5248p1 c5248p1) {
        c5248p1.f(Long.valueOf(this.f51163a.totalMemory() - this.f51163a.freeMemory()));
    }

    @Override // io.sentry.W
    public void c() {
    }
}
