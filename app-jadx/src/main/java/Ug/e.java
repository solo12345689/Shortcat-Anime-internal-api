package ug;

import kotlin.jvm.internal.AbstractC5504s;
import tg.W;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class e {
    public static final int a(int[] iArr, int i10, int i11, int i12) {
        AbstractC5504s.h(iArr, "<this>");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    public static final int b(W w10, int i10) {
        AbstractC5504s.h(w10, "<this>");
        int iA = a(w10.S(), i10 + 1, 0, w10.T().length);
        return iA >= 0 ? iA : ~iA;
    }
}
