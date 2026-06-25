package Z7;

import a8.C2585a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class j extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f23228h = e.a("IHDR");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f23229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f23230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    byte[] f23231g = new byte[5];

    j() {
    }

    @Override // Z7.e
    void b(C2585a c2585a) {
        this.f23229e = c2585a.c();
        this.f23230f = c2585a.c();
        byte[] bArr = this.f23231g;
        c2585a.read(bArr, 0, bArr.length);
    }
}
