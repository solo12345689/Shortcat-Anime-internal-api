package o3;

import q2.C6078J;
import t2.C6609I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    private static int a(int i10, C6609I c6609i, int i11) {
        if (i10 == 12) {
            return 240;
        }
        if (i10 == 13) {
            return 120;
        }
        if (i10 == 21 && c6609i.a() >= 8 && c6609i.g() + 8 <= i11) {
            int iV = c6609i.v();
            int iV2 = c6609i.v();
            if (iV >= 12 && iV2 == 1936877170) {
                return c6609i.N();
            }
        }
        return -2147483647;
    }

    public static C6078J b(C6609I c6609i, int i10) {
        c6609i.c0(12);
        while (c6609i.g() < i10) {
            int iG = c6609i.g();
            int iV = c6609i.v();
            if (c6609i.v() == 1935766900) {
                if (iV < 16) {
                    return null;
                }
                c6609i.c0(4);
                int i11 = -1;
                int i12 = 0;
                for (int i13 = 0; i13 < 2; i13++) {
                    int iM = c6609i.M();
                    int iM2 = c6609i.M();
                    if (iM == 0) {
                        i11 = iM2;
                    } else if (iM == 1) {
                        i12 = iM2;
                    }
                }
                int iA = a(i11, c6609i, i10);
                if (iA == -2147483647) {
                    return null;
                }
                return new C6078J(new j3.d(iA, i12));
            }
            c6609i.b0(iG + iV);
        }
        return null;
    }
}
