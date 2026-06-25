package com.facebook.yoga;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public enum h {
    INHERIT(0),
    LTR(1),
    RTL(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38667a;

    h(int i10) {
        this.f38667a = i10;
    }

    public static h b(int i10) {
        if (i10 == 0) {
            return INHERIT;
        }
        if (i10 == 1) {
            return LTR;
        }
        if (i10 == 2) {
            return RTL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i10);
    }

    public int c() {
        return this.f38667a;
    }
}
