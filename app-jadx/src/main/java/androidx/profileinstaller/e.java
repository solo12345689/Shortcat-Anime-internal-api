package androidx.profileinstaller;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
enum e {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f31645a;

    e(long j10) {
        this.f31645a = j10;
    }

    public long b() {
        return this.f31645a;
    }
}
