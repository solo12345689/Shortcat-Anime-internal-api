package Rh;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f15540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f15541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[] f15542c;

    h() {
    }

    static void a(h hVar, a aVar) {
        int length = hVar.f15542c.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            hVar.f15542c[i11] = i10;
            e.n(hVar.f15540a, hVar.f15541b, i10, aVar);
            i10 += 1080;
        }
    }

    static void b(h hVar, int i10, int i11) {
        hVar.f15540a = i10;
        hVar.f15541b = new int[i11 * 1080];
        hVar.f15542c = new int[i11];
    }
}
