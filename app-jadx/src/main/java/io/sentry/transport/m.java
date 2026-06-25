package io.sentry.transport;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o f51381a = new m();

    private m() {
    }

    public static o a() {
        return f51381a;
    }

    @Override // io.sentry.transport.o
    public final long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }
}
