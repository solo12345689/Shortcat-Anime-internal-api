package Mc;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public enum c {
    UNSPECIFIED(-1000, 1),
    NONE(0, 2),
    MIN(1, 3),
    LOW(2, 4),
    DEFAULT(3, 5),
    HIGH(4, 6),
    MAX(5, 7),
    UNKNOWN(3, 0);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12359b;

    c(int i10, int i11) {
        this.f12358a = i10;
        this.f12359b = i11;
    }

    public static c b(int i10) {
        for (c cVar : values()) {
            if (cVar.h() == i10) {
                return cVar;
            }
        }
        return UNKNOWN;
    }

    public static c c(int i10) {
        for (c cVar : values()) {
            if (cVar.k() == i10) {
                return cVar;
            }
        }
        return UNKNOWN;
    }

    public int h() {
        return this.f12359b;
    }

    public int k() {
        return this.f12358a;
    }
}
