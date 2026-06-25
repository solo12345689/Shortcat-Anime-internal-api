package Rh;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f15609a = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f15610b = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];

    static void a(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int iMin = Math.min(i12 + IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, i11) - i12;
            System.arraycopy(f15609a, 0, bArr, i10 + i12, iMin);
            i12 += iMin;
        }
    }

    static void b(int[] iArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int iMin = Math.min(i12 + IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, i11) - i12;
            System.arraycopy(f15610b, 0, iArr, i10 + i12, iMin);
            i12 += iMin;
        }
    }
}
