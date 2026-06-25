package com.facebook.yoga;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public enum YogaLogLevel {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38628a;

    YogaLogLevel(int i10) {
        this.f38628a = i10;
    }

    public static YogaLogLevel fromInt(int i10) {
        if (i10 == 0) {
            return ERROR;
        }
        if (i10 == 1) {
            return WARN;
        }
        if (i10 == 2) {
            return INFO;
        }
        if (i10 == 3) {
            return DEBUG;
        }
        if (i10 == 4) {
            return VERBOSE;
        }
        if (i10 == 5) {
            return FATAL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i10);
    }
}
