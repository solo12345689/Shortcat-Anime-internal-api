package s0;

import Ud.AbstractC2279u;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class W {
    public static final Shader a(long j10, long j11, List list, List list2, int i10) {
        f(list, list2);
        int iC = c(list);
        return new LinearGradient(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), d(list, iC), e(list2, list, iC), X.a(i10));
    }

    public static final Shader b(long j10, float f10, List list, List list2, int i10) {
        f(list, list2);
        int iC = c(list);
        return new RadialGradient(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), f10, d(list, iC), e(list2, list, iC), X.a(i10));
    }

    public static final int c(List list) {
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int iO = AbstractC2279u.o(list);
        for (int i11 = 1; i11 < iO; i11++) {
            if (C6385r0.t(((C6385r0) list.get(i11)).A()) == 0.0f) {
                i10++;
            }
        }
        return i10;
    }

    public static final int[] d(List list, int i10) {
        int i11;
        int i12 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i12 < size) {
                iArr[i12] = AbstractC6387s0.k(((C6385r0) list.get(i12)).A());
                i12++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i10];
        int iO = AbstractC2279u.o(list);
        int size2 = list.size();
        int i13 = 0;
        while (i12 < size2) {
            long jA = ((C6385r0) list.get(i12)).A();
            if (C6385r0.t(jA) == 0.0f) {
                if (i12 == 0) {
                    i11 = i13 + 1;
                    iArr2[i13] = AbstractC6387s0.k(C6385r0.q(((C6385r0) list.get(1)).A(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i12 == iO) {
                    i11 = i13 + 1;
                    iArr2[i13] = AbstractC6387s0.k(C6385r0.q(((C6385r0) list.get(i12 - 1)).A(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i14 = i13 + 1;
                    iArr2[i13] = AbstractC6387s0.k(C6385r0.q(((C6385r0) list.get(i12 - 1)).A(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i13 += 2;
                    iArr2[i14] = AbstractC6387s0.k(C6385r0.q(((C6385r0) list.get(i12 + 1)).A(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i13 = i11;
            } else {
                iArr2[i13] = AbstractC6387s0.k(jA);
                i13++;
            }
            i12++;
        }
        return iArr2;
    }

    public static final float[] e(List list, List list2, int i10) {
        if (i10 == 0) {
            if (list != null) {
                return AbstractC2279u.Y0(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i10];
        fArr[0] = list != null ? ((Number) list.get(0)).floatValue() : 0.0f;
        int iO = AbstractC2279u.o(list2);
        int i11 = 1;
        for (int i12 = 1; i12 < iO; i12++) {
            long jA = ((C6385r0) list2.get(i12)).A();
            float fFloatValue = list != null ? ((Number) list.get(i12)).floatValue() : i12 / AbstractC2279u.o(list2);
            int i13 = i11 + 1;
            fArr[i11] = fFloatValue;
            if (C6385r0.t(jA) == 0.0f) {
                i11 += 2;
                fArr[i13] = fFloatValue;
            } else {
                i11 = i13;
            }
        }
        fArr[i11] = list != null ? ((Number) list.get(AbstractC2279u.o(list2))).floatValue() : 1.0f;
        return fArr;
    }

    private static final void f(List list, List list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
