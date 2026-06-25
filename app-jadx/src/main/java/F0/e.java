package F0;

import E0.C;
import E0.C1294d;
import E0.r;
import Ud.AbstractC2273n;
import java.util.List;
import r0.C6224f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f6140a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f6141b;

    public static final void c(d dVar, C c10) {
        d(dVar, c10, C6224f.f58329b.c());
    }

    public static final void d(d dVar, C c10, long j10) {
        if (f6140a) {
            f(dVar, c10, j10);
        } else {
            e(dVar, c10, j10);
        }
    }

    private static final void e(d dVar, C c10, long j10) {
        if (r.b(c10)) {
            dVar.f(c10.h());
            dVar.e();
        }
        long jK = c10.k();
        List listE = c10.e();
        int size = listE.size();
        int i10 = 0;
        while (i10 < size) {
            C1294d c1294d = (C1294d) listE.get(i10);
            long jP = C6224f.p(c1294d.b(), jK);
            long jB = c1294d.b();
            dVar.f(C6224f.q(dVar.c(), jP));
            dVar.a(c1294d.c(), C6224f.q(dVar.c(), j10));
            i10++;
            jK = jB;
        }
        dVar.f(C6224f.q(dVar.c(), C6224f.p(c10.h(), jK)));
        dVar.a(c10.o(), C6224f.q(dVar.c(), j10));
    }

    private static final void f(d dVar, C c10, long j10) {
        if (r.b(c10)) {
            dVar.e();
        }
        if (!r.d(c10)) {
            List listE = c10.e();
            int size = listE.size();
            for (int i10 = 0; i10 < size; i10++) {
                C1294d c1294d = (C1294d) listE.get(i10);
                dVar.a(c1294d.c(), C6224f.q(c1294d.a(), j10));
            }
            dVar.a(c10.o(), C6224f.q(c10.g(), j10));
        }
        if (r.d(c10) && c10.o() - dVar.d() > 40) {
            dVar.e();
        }
        dVar.g(c10.o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(float[] fArr, float[] fArr2, int i10, boolean z10) {
        int i11 = i10 - 1;
        float f10 = fArr2[i11];
        float fSignum = 0.0f;
        int i12 = i11;
        while (i12 > 0) {
            int i13 = i12 - 1;
            float f11 = fArr2[i13];
            if (f10 != f11) {
                float f12 = (z10 ? -fArr[i13] : fArr[i12] - fArr[i13]) / (f10 - f11);
                fSignum += (f12 - (Math.signum(fSignum) * ((float) Math.sqrt(2 * Math.abs(fSignum))))) * Math.abs(f12);
                if (i12 == i11) {
                    fSignum *= 0.5f;
                }
            }
            i12--;
            f10 = f11;
        }
        return Math.signum(fSignum) * ((float) Math.sqrt(2 * Math.abs(fSignum)));
    }

    private static final float h(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            f10 += fArr[i10] * fArr2[i10];
        }
        return f10;
    }

    public static final boolean i() {
        return f6141b;
    }

    public static final float[] j(float[] fArr, float[] fArr2, int i10, int i11, float[] fArr3) {
        int i12 = i11;
        if (i12 < 1) {
            H0.a.a("The degree must be at positive integer");
        }
        if (i10 == 0) {
            H0.a.a("At least one point must be provided");
        }
        if (i12 >= i10) {
            i12 = i10 - 1;
        }
        int i13 = i12 + 1;
        float[][] fArr4 = new float[i13][];
        for (int i14 = 0; i14 < i13; i14++) {
            fArr4[i14] = new float[i10];
        }
        for (int i15 = 0; i15 < i10; i15++) {
            fArr4[0][i15] = 1.0f;
            for (int i16 = 1; i16 < i13; i16++) {
                fArr4[i16][i15] = fArr4[i16 - 1][i15] * fArr[i15];
            }
        }
        float[][] fArr5 = new float[i13][];
        for (int i17 = 0; i17 < i13; i17++) {
            fArr5[i17] = new float[i10];
        }
        float[][] fArr6 = new float[i13][];
        for (int i18 = 0; i18 < i13; i18++) {
            fArr6[i18] = new float[i13];
        }
        int i19 = 0;
        while (i19 < i13) {
            float[] fArr7 = fArr5[i19];
            AbstractC2273n.j(fArr4[i19], fArr7, 0, 0, i10);
            for (int i20 = 0; i20 < i19; i20++) {
                float[] fArr8 = fArr5[i20];
                float fH = h(fArr7, fArr8);
                for (int i21 = 0; i21 < i10; i21++) {
                    fArr7[i21] = fArr7[i21] - (fArr8[i21] * fH);
                }
            }
            float fSqrt = (float) Math.sqrt(h(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f10 = 1.0f / fSqrt;
            for (int i22 = 0; i22 < i10; i22++) {
                fArr7[i22] = fArr7[i22] * f10;
            }
            float[] fArr9 = fArr6[i19];
            int i23 = 0;
            while (i23 < i13) {
                fArr9[i23] = i23 < i19 ? 0.0f : h(fArr7, fArr4[i23]);
                i23++;
            }
            i19++;
        }
        for (int i24 = i12; -1 < i24; i24--) {
            float fH2 = h(fArr5[i24], fArr2);
            float[] fArr10 = fArr6[i24];
            int i25 = i24 + 1;
            if (i25 <= i12) {
                int i26 = i12;
                while (true) {
                    fH2 -= fArr10[i26] * fArr3[i26];
                    if (i26 != i25) {
                        i26--;
                    }
                }
            }
            fArr3[i24] = fH2 / fArr10[i24];
        }
        return fArr3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(a[] aVarArr, int i10, long j10, float f10) {
        a aVar = aVarArr[i10];
        if (aVar == null) {
            aVarArr[i10] = new a(j10, f10);
        } else {
            aVar.d(j10);
            aVar.c(f10);
        }
    }
}
