package com.facebook.imagepipeline.producers;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f36312a = new v0();

    private v0() {
    }

    public static final int a(int i10) {
        return (int) (i10 * 1.3333334f);
    }

    public static final boolean b(int i10, int i11, y6.g gVar) {
        return gVar == null ? ((float) a(i10)) >= 2048.0f && a(i11) >= 2048 : a(i10) >= gVar.f64868a && a(i11) >= gVar.f64869b;
    }

    public static final boolean c(E6.k kVar, y6.g gVar) {
        if (kVar == null) {
            return false;
        }
        int iH1 = kVar.h1();
        return (iH1 == 90 || iH1 == 270) ? b(kVar.getHeight(), kVar.getWidth(), gVar) : b(kVar.getWidth(), kVar.getHeight(), gVar);
    }
}
