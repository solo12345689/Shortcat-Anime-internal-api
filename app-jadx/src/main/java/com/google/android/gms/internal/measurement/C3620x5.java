package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3620x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3612w5 f40031a;

    private C3620x5(EnumC3515l6 enumC3515l6, Object obj, EnumC3515l6 enumC3515l62, Object obj2) {
        this.f40031a = new C3612w5(enumC3515l6, "", enumC3515l62, "");
    }

    public static C3620x5 a(EnumC3515l6 enumC3515l6, Object obj, EnumC3515l6 enumC3515l62, Object obj2) {
        return new C3620x5(enumC3515l6, "", enumC3515l62, "");
    }

    static void b(N4 n42, C3612w5 c3612w5, Object obj, Object obj2) {
        W4.c(n42, c3612w5.f40014a, 1, obj);
        W4.c(n42, c3612w5.f40016c, 2, obj2);
    }

    static int c(C3612w5 c3612w5, Object obj, Object obj2) {
        return W4.d(c3612w5.f40014a, 1, obj) + W4.d(c3612w5.f40016c, 2, obj2);
    }

    public final int d(int i10, Object obj, Object obj2) {
        C3612w5 c3612w5 = this.f40031a;
        int iE = N4.E(i10 << 3);
        int iC = c(c3612w5, obj, obj2);
        return iE + N4.E(iC) + iC;
    }

    final C3612w5 e() {
        return this.f40031a;
    }
}
