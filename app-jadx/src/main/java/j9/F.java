package j9;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public enum F {
    UNKNOWN(0),
    SUCCESS(1),
    FAILURE(2),
    BACKOFF(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f51689a;

    F(int i10) {
        this.f51689a = i10;
    }

    public final int zza() {
        return this.f51689a;
    }
}
