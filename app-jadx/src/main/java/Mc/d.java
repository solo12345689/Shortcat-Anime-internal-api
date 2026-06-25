package Mc;

import com.adjust.sdk.Constants;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public enum d {
    MIN(-2, "min"),
    LOW(-1, Constants.LOW),
    DEFAULT(0, "default"),
    HIGH(1, Constants.HIGH),
    MAX(2, "max");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12367b;

    d(int i10, String str) {
        this.f12366a = i10;
        this.f12367b = str;
    }

    public static d b(String str) {
        for (d dVar : values()) {
            if (dVar.h().equalsIgnoreCase(str)) {
                return dVar;
            }
        }
        return null;
    }

    public static d c(int i10) {
        for (d dVar : values()) {
            if (dVar.k() == i10) {
                return dVar;
            }
        }
        return null;
    }

    public String h() {
        return this.f12367b;
    }

    public int k() {
        return this.f12366a;
    }
}
