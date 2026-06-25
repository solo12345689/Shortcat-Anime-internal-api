package Mc;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public enum e {
    PUBLIC(1, 1),
    PRIVATE(0, 2),
    SECRET(-1, 3),
    UNKNOWN(1, 0);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12374b;

    e(int i10, int i11) {
        this.f12373a = i10;
        this.f12374b = i11;
    }

    public static e b(int i10) {
        for (e eVar : values()) {
            if (eVar.h() == i10) {
                return eVar;
            }
        }
        return UNKNOWN;
    }

    public static e c(int i10) {
        for (e eVar : values()) {
            if (eVar.k() == i10) {
                return eVar;
            }
        }
        return UNKNOWN;
    }

    public int h() {
        return this.f12374b;
    }

    public int k() {
        return this.f12373a;
    }
}
