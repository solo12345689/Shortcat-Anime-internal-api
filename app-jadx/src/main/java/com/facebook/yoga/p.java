package com.facebook.yoga;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public enum p {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38715a;

    p(int i10) {
        this.f38715a = i10;
    }

    public static p b(int i10) {
        if (i10 == 0) {
            return UNDEFINED;
        }
        if (i10 == 1) {
            return EXACTLY;
        }
        if (i10 == 2) {
            return AT_MOST;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i10);
    }
}
