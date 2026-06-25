package H6;

import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f8002a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f8003b = Runtime.getRuntime().availableProcessors();

    private p() {
    }

    public static final SparseIntArray a(int i10, int i11, int i12) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        while (i10 <= i11) {
            sparseIntArray.put(i10, i12);
            i10 *= 2;
        }
        return sparseIntArray;
    }

    public static final E b() {
        int i10 = f8003b;
        return new E(4194304, i10 * 4194304, a(131072, 4194304, i10), 131072, 4194304, i10);
    }
}
