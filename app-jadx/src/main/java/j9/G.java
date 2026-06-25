package j9;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public enum G {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f51697a;

    G(int i10) {
        this.f51697a = i10;
    }

    public static G a(int i10) {
        for (G g10 : values()) {
            if (g10.f51697a == i10) {
                return g10;
            }
        }
        return UNKNOWN;
    }

    public final int zza() {
        return this.f51697a;
    }
}
