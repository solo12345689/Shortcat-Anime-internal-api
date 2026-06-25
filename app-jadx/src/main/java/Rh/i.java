package Rh;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f15543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f15544b;

    i() {
    }

    static void a(i iVar, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int[] iArr = iVar.f15544b;
            byte[] bArr = iVar.f15543a;
            int i12 = i11 * 4;
            iArr[i11] = ((bArr[i12 + 3] & 255) << 24) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16);
        }
    }

    static void b(i iVar, byte[] bArr, int[] iArr) {
        iVar.f15543a = bArr;
        iVar.f15544b = iArr;
    }
}
