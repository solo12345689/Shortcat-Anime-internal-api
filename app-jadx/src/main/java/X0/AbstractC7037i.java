package x0;

import java.util.ArrayList;
import java.util.List;
import x0.AbstractC7036h;

/* JADX INFO: renamed from: x0.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7037i {
    public static final void a(char c10, ArrayList arrayList, float[] fArr, int i10) {
        int i11 = 0;
        switch (c10) {
            case 'A':
                int i12 = i10 - 7;
                for (int i13 = 0; i13 <= i12; i13 += 7) {
                    arrayList.add(new AbstractC7036h.a(fArr[i13], fArr[i13 + 1], fArr[i13 + 2], Float.compare(fArr[i13 + 3], 0.0f) != 0, Float.compare(fArr[i13 + 4], 0.0f) != 0, fArr[i13 + 5], fArr[i13 + 6]));
                }
                return;
            case 'C':
                int i14 = i10 - 6;
                while (i11 <= i14) {
                    arrayList.add(new AbstractC7036h.c(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3], fArr[i11 + 4], fArr[i11 + 5]));
                    i11 += 6;
                }
                return;
            case 'H':
                int i15 = i10 - 1;
                while (i11 <= i15) {
                    arrayList.add(new AbstractC7036h.d(fArr[i11]));
                    i11++;
                }
                return;
            case 'L':
                int i16 = i10 - 2;
                while (i11 <= i16) {
                    arrayList.add(new AbstractC7036h.e(fArr[i11], fArr[i11 + 1]));
                    i11 += 2;
                }
                return;
            case 'M':
                b(arrayList, fArr, i10);
                return;
            case 'Q':
                int i17 = i10 - 4;
                while (i11 <= i17) {
                    arrayList.add(new AbstractC7036h.g(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                    i11 += 4;
                }
                return;
            case 'S':
                int i18 = i10 - 4;
                while (i11 <= i18) {
                    arrayList.add(new AbstractC7036h.C0958h(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                    i11 += 4;
                }
                return;
            case 'T':
                int i19 = i10 - 2;
                while (i11 <= i19) {
                    arrayList.add(new AbstractC7036h.i(fArr[i11], fArr[i11 + 1]));
                    i11 += 2;
                }
                return;
            case 'V':
                int i20 = i10 - 1;
                while (i11 <= i20) {
                    arrayList.add(new AbstractC7036h.s(fArr[i11]));
                    i11++;
                }
                return;
            case 'Z':
            case 'z':
                arrayList.add(AbstractC7036h.b.f63501c);
                return;
            case 'a':
                int i21 = i10 - 7;
                for (int i22 = 0; i22 <= i21; i22 += 7) {
                    arrayList.add(new AbstractC7036h.j(fArr[i22], fArr[i22 + 1], fArr[i22 + 2], Float.compare(fArr[i22 + 3], 0.0f) != 0, Float.compare(fArr[i22 + 4], 0.0f) != 0, fArr[i22 + 5], fArr[i22 + 6]));
                }
                return;
            case 'c':
                int i23 = i10 - 6;
                while (i11 <= i23) {
                    arrayList.add(new AbstractC7036h.k(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3], fArr[i11 + 4], fArr[i11 + 5]));
                    i11 += 6;
                }
                return;
            case 'h':
                int i24 = i10 - 1;
                while (i11 <= i24) {
                    arrayList.add(new AbstractC7036h.l(fArr[i11]));
                    i11++;
                }
                return;
            case 'l':
                int i25 = i10 - 2;
                while (i11 <= i25) {
                    arrayList.add(new AbstractC7036h.m(fArr[i11], fArr[i11 + 1]));
                    i11 += 2;
                }
                return;
            case 'm':
                c(arrayList, fArr, i10);
                return;
            case 'q':
                int i26 = i10 - 4;
                while (i11 <= i26) {
                    arrayList.add(new AbstractC7036h.o(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                    i11 += 4;
                }
                return;
            case 's':
                int i27 = i10 - 4;
                while (i11 <= i27) {
                    arrayList.add(new AbstractC7036h.p(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                    i11 += 4;
                }
                return;
            case 't':
                int i28 = i10 - 2;
                while (i11 <= i28) {
                    arrayList.add(new AbstractC7036h.q(fArr[i11], fArr[i11 + 1]));
                    i11 += 2;
                }
                return;
            case 'v':
                int i29 = i10 - 1;
                while (i11 <= i29) {
                    arrayList.add(new AbstractC7036h.r(fArr[i11]));
                    i11++;
                }
                return;
            default:
                throw new IllegalArgumentException("Unknown command for: " + c10);
        }
    }

    private static final void b(List list, float[] fArr, int i10) {
        int i11 = i10 - 2;
        if (i11 >= 0) {
            list.add(new AbstractC7036h.f(fArr[0], fArr[1]));
            for (int i12 = 2; i12 <= i11; i12 += 2) {
                list.add(new AbstractC7036h.e(fArr[i12], fArr[i12 + 1]));
            }
        }
    }

    private static final void c(List list, float[] fArr, int i10) {
        int i11 = i10 - 2;
        if (i11 >= 0) {
            list.add(new AbstractC7036h.n(fArr[0], fArr[1]));
            for (int i12 = 2; i12 <= i11; i12 += 2) {
                list.add(new AbstractC7036h.m(fArr[i12], fArr[i12 + 1]));
            }
        }
    }
}
