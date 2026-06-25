package Mc;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public enum a {
    UNKNOWN(0, 0),
    SPEECH(1, 1),
    MUSIC(2, 2),
    MOVIE(3, 3),
    SONIFICIATION(4, 4);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12330b;

    a(int i10, int i11) {
        this.f12329a = i10;
        this.f12330b = i11;
    }

    public static a b(int i10) {
        for (a aVar : values()) {
            if (aVar.h() == i10) {
                return aVar;
            }
        }
        return UNKNOWN;
    }

    public static a c(int i10) {
        for (a aVar : values()) {
            if (aVar.h() == i10) {
                return aVar;
            }
        }
        return UNKNOWN;
    }

    public int h() {
        return this.f12330b;
    }

    public int k() {
        return this.f12329a;
    }
}
