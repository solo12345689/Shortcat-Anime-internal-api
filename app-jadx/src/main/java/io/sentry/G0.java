package io.sentry;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class G0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5322z3 f49180a;

    G0(C5322z3 c5322z3) {
        this.f49180a = c5322z3;
    }

    @Override // java.lang.Runnable
    public void run() {
        String cacheDirPath = this.f49180a.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f49180a.getLogger().c(EnumC5215i3.INFO, "Cache dir is not set, not moving the previous session.", new Object[0]);
            return;
        }
        if (!this.f49180a.isEnableAutoSessionTracking()) {
            this.f49180a.getLogger().c(EnumC5215i3.DEBUG, "Session tracking is disabled, bailing from previous session mover.", new Object[0]);
            return;
        }
        io.sentry.cache.g envelopeDiskCache = this.f49180a.getEnvelopeDiskCache();
        if (envelopeDiskCache instanceof io.sentry.cache.f) {
            io.sentry.cache.f fVar = (io.sentry.cache.f) envelopeDiskCache;
            fVar.F(io.sentry.cache.f.A(cacheDirPath), io.sentry.cache.f.D(cacheDirPath));
            fVar.z();
        }
    }
}
