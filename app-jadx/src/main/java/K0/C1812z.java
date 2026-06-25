package K0;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: K0.z */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C1812z {

    /* JADX INFO: renamed from: a */
    private int[] f10834a;

    /* JADX INFO: renamed from: b */
    private int f10835b;

    public C1812z(int i10) {
        this.f10834a = new int[i10];
    }

    private final boolean a(int i10, int i11) {
        int[] iArr = this.f10834a;
        int i12 = iArr[i10];
        int i13 = iArr[i11];
        return i12 < i13 || (i12 == i13 && iArr[i10 + 1] <= iArr[i11 + 1]);
    }

    private final int e(int i10, int i11, int i12) {
        int i13 = i10 - i12;
        while (i10 < i11) {
            if (a(i10, i11)) {
                i13 += i12;
                l(i13, i10);
            }
            i10 += i12;
        }
        int i14 = i13 + i12;
        l(i14, i11);
        return i14;
    }

    private final void i(int i10, int i11, int i12) {
        if (i10 < i11) {
            int iE = e(i10, i11, i12);
            i(i10, iE - i12, i12);
            i(iE + i12, i11, i12);
        }
    }

    private final int[] j(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
        AbstractC5504s.g(iArrCopyOf, "copyOf(...)");
        this.f10834a = iArrCopyOf;
        return iArrCopyOf;
    }

    private final void l(int i10, int i11) {
        int[] iArr = this.f10834a;
        AbstractC1779b0.i(iArr, i10, i11);
        AbstractC1779b0.i(iArr, i10 + 1, i11 + 1);
        AbstractC1779b0.i(iArr, i10 + 2, i11 + 2);
    }

    public final int b(int i10) {
        return this.f10834a[i10];
    }

    public final int c() {
        return this.f10835b;
    }

    public final boolean d() {
        return this.f10835b != 0;
    }

    public final int f() {
        int[] iArr = this.f10834a;
        int i10 = this.f10835b - 1;
        this.f10835b = i10;
        return iArr[i10];
    }

    public final void g(int i10, int i11, int i12) {
        int i13 = this.f10835b;
        int[] iArrJ = this.f10834a;
        int i14 = i13 + 3;
        if (i14 >= iArrJ.length) {
            iArrJ = j(iArrJ);
        }
        iArrJ[i13] = i10 + i12;
        iArrJ[i13 + 1] = i11 + i12;
        iArrJ[i13 + 2] = i12;
        this.f10835b = i14;
    }

    public final void h(int i10, int i11, int i12, int i13) {
        int i14 = this.f10835b;
        int[] iArrJ = this.f10834a;
        int i15 = i14 + 4;
        if (i15 >= iArrJ.length) {
            iArrJ = j(iArrJ);
        }
        iArrJ[i14] = i10;
        iArrJ[i14 + 1] = i11;
        iArrJ[i14 + 2] = i12;
        iArrJ[i14 + 3] = i13;
        this.f10835b = i15;
    }

    public final void k() {
        int i10 = this.f10835b;
        if (!(i10 % 3 == 0)) {
            H0.a.b("Array size not a multiple of 3");
        }
        if (i10 > 3) {
            i(0, i10 - 3, 3);
        }
    }
}
