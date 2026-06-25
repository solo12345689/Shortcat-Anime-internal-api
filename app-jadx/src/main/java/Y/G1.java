package Y;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class G1 {

    /* JADX INFO: renamed from: a */
    private static final long[] f22126a = new long[0];

    public static final int m(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return i11 >= iArr.length ? iArr.length : iArr[i11 + 4] + Integer.bitCount(iArr[i11 + 1] >> 29);
    }

    public static final C2392b n(ArrayList arrayList, int i10, int i11) {
        int iS = s(arrayList, i10, i11);
        if (iS >= 0) {
            return (C2392b) arrayList.get(iS);
        }
        return null;
    }

    public static final int o(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 3];
    }

    public static final void p(int[] iArr, int i10, int i11, boolean z10, boolean z11, boolean z12, int i12, int i13) {
        int i14 = i10 * 5;
        iArr[i14] = i11;
        iArr[i14 + 1] = ((z10 ? 1 : 0) << 30) | ((z11 ? 1 : 0) << 29) | ((z12 ? 1 : 0) << 28);
        iArr[i14 + 2] = i12;
        iArr[i14 + 3] = 0;
        iArr[i14 + 4] = i13;
    }

    public static final int q(ArrayList arrayList, int i10, int i11) {
        int iS = s(arrayList, i10, i11);
        return iS >= 0 ? iS : -(iS + 1);
    }

    public static final int r(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return iArr[i11 + 4] + Integer.bitCount(iArr[i11 + 1] >> 30);
    }

    public static final int s(ArrayList arrayList, int i10, int i11) {
        int size = arrayList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int iA = ((C2392b) arrayList.get(i13)).a();
            if (iA < 0) {
                iA += i11;
            }
            int i14 = AbstractC5504s.i(iA, i10);
            if (i14 < 0) {
                i12 = i13 + 1;
            } else {
                if (i14 <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    public static final int t(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return iArr[i11 + 4] + Integer.bitCount(iArr[i11 + 1] >> 28);
    }

    public static final void u() {
        throw new ConcurrentModificationException();
    }

    public static final void v(int[] iArr, int i10, boolean z10) {
        int i11 = (i10 * 5) + 1;
        iArr[i11] = ((z10 ? 1 : 0) << 26) | (iArr[i11] & (-67108865));
    }

    public static final void w(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 3] = i11;
    }

    public static final void x(int[] iArr, int i10, boolean z10) {
        int i11 = (i10 * 5) + 1;
        iArr[i11] = ((z10 ? 1 : 0) << 27) | (iArr[i11] & (-134217729));
    }

    public static final void y(int[] iArr, int i10, int i11) {
        if (i11 >= 0) {
        }
        int i12 = (i10 * 5) + 1;
        iArr[i12] = i11 | (iArr[i12] & (-67108864));
    }
}
