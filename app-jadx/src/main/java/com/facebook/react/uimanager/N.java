package com.facebook.react.uimanager;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N f37523a = new N();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f37524b = 1;

    private N() {
    }

    public static final synchronized int a() {
        int i10;
        i10 = f37524b;
        f37524b = i10 + 10;
        return i10;
    }
}
