package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class K3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static J3 f39401a;

    public static synchronized void a(J3 j32) {
        if (f39401a != null) {
            throw new IllegalStateException("init() already called");
        }
        f39401a = j32;
    }

    public static synchronized J3 b() {
        try {
            if (f39401a == null) {
                a(new N3());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f39401a;
    }
}
