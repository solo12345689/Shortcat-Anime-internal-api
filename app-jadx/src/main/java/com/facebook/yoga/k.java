package com.facebook.yoga;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public enum k {
    NONE(0),
    STRETCH_FLEX_BASIS(1),
    ABSOLUTE_POSITION_WITHOUT_INSETS_EXCLUDES_PADDING(2),
    ABSOLUTE_PERCENT_AGAINST_INNER_SIZE(4),
    ALL(Integer.MAX_VALUE),
    CLASSIC(2147483646);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38691a;

    k(int i10) {
        this.f38691a = i10;
    }

    public int b() {
        return this.f38691a;
    }
}
