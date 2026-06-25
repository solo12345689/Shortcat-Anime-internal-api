package T2;

import T2.e;
import java.util.ArrayList;
import java.util.zip.Inflater;
import t2.C6608H;
import t2.C6609I;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class f {
    public static e a(byte[] bArr, int i10) {
        ArrayList arrayListF;
        C6609I c6609i = new C6609I(bArr);
        try {
            arrayListF = c(c6609i) ? f(c6609i) : e(c6609i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayListF = null;
        }
        if (arrayListF == null) {
            return null;
        }
        int size = arrayListF.size();
        if (size == 1) {
            return new e((e.a) arrayListF.get(0), i10);
        }
        if (size != 2) {
            return null;
        }
        return new e((e.a) arrayListF.get(0), (e.a) arrayListF.get(1), i10);
    }

    private static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >> 1);
    }

    private static boolean c(C6609I c6609i) {
        c6609i.c0(4);
        int iV = c6609i.v();
        c6609i.b0(0);
        return iV == 1886547818;
    }

    private static e.a d(C6609I c6609i) {
        int iV = c6609i.v();
        e.a aVar = null;
        if (iV > 10000) {
            return null;
        }
        float[] fArr = new float[iV];
        for (int i10 = 0; i10 < iV; i10++) {
            fArr[i10] = c6609i.u();
        }
        int iV2 = c6609i.v();
        if (iV2 > 32000) {
            return null;
        }
        double d10 = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(((double) iV) * 2.0d) / dLog);
        C6608H c6608h = new C6608H(c6609i.f());
        int i11 = 8;
        c6608h.p(c6609i.g() * 8);
        float[] fArr2 = new float[iV2 * 5];
        int[] iArr = new int[5];
        int i12 = 0;
        int i13 = 0;
        while (i12 < iV2) {
            e.a aVar2 = aVar;
            int i14 = 0;
            while (i14 < 5) {
                int iB = iArr[i14] + b(c6608h.h(iCeil));
                if (iB >= iV || iB < 0) {
                    return aVar2;
                }
                fArr2[i13] = fArr[iB];
                iArr[i14] = iB;
                i14++;
                i13++;
            }
            i12++;
            aVar = aVar2;
        }
        e.a aVar3 = aVar;
        c6608h.p((c6608h.e() + 7) & (-8));
        int i15 = 32;
        int iH = c6608h.h(32);
        e.b[] bVarArr = new e.b[iH];
        int i16 = 0;
        while (i16 < iH) {
            int iH2 = c6608h.h(i11);
            int iH3 = c6608h.h(i11);
            int iH4 = c6608h.h(i15);
            if (iH4 > 128000) {
                return aVar3;
            }
            int i17 = iH;
            int iCeil2 = (int) Math.ceil(Math.log(((double) iV2) * d10) / dLog);
            float[] fArr3 = new float[iH4 * 3];
            float[] fArr4 = new float[iH4 * 2];
            int i18 = 0;
            int i19 = 0;
            while (i18 < iH4) {
                int iB2 = i19 + b(c6608h.h(iCeil2));
                if (iB2 < 0 || iB2 >= iV2) {
                    return aVar3;
                }
                int i20 = i18 * 3;
                int i21 = iB2 * 5;
                fArr3[i20] = fArr2[i21];
                fArr3[i20 + 1] = fArr2[i21 + 1];
                fArr3[i20 + 2] = fArr2[i21 + 2];
                int i22 = i18 * 2;
                fArr4[i22] = fArr2[i21 + 3];
                fArr4[i22 + 1] = fArr2[i21 + 4];
                i18++;
                i19 = iB2;
            }
            bVarArr[i16] = new e.b(iH2, fArr3, fArr4, iH3);
            i16++;
            iH = i17;
            i15 = 32;
            d10 = 2.0d;
            i11 = 8;
        }
        return new e.a(bVarArr);
    }

    private static ArrayList e(C6609I c6609i) {
        if (c6609i.M() != 0) {
            return null;
        }
        c6609i.c0(7);
        int iV = c6609i.v();
        if (iV == 1684433976) {
            C6609I c6609i2 = new C6609I();
            Inflater inflater = new Inflater(true);
            try {
                if (!a0.G0(c6609i, c6609i2, inflater)) {
                    return null;
                }
                inflater.end();
                c6609i = c6609i2;
            } finally {
                inflater.end();
            }
        } else if (iV != 1918990112) {
            return null;
        }
        return g(c6609i);
    }

    private static ArrayList f(C6609I c6609i) {
        int iV;
        c6609i.c0(8);
        int iG = c6609i.g();
        int iJ = c6609i.j();
        while (iG < iJ && (iV = c6609i.v() + iG) > iG && iV <= iJ) {
            int iV2 = c6609i.v();
            if (iV2 == 2037673328 || iV2 == 1836279920) {
                c6609i.a0(iV);
                return e(c6609i);
            }
            c6609i.b0(iV);
            iG = iV;
        }
        return null;
    }

    private static ArrayList g(C6609I c6609i) {
        ArrayList arrayList = new ArrayList();
        int iG = c6609i.g();
        int iJ = c6609i.j();
        while (iG < iJ) {
            int iV = c6609i.v() + iG;
            if (iV <= iG || iV > iJ) {
                return null;
            }
            if (c6609i.v() == 1835365224) {
                e.a aVarD = d(c6609i);
                if (aVarD == null) {
                    return null;
                }
                arrayList.add(aVarD);
            }
            c6609i.b0(iV);
            iG = iV;
        }
        return arrayList;
    }
}
