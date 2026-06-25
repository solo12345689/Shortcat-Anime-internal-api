package M6;

import E6.k;
import android.graphics.Matrix;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f12234a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y5.f f12235b;

    static {
        y5.f fVarD = y5.f.d(2, 7, 4, 5);
        AbstractC5504s.g(fVarD, "of(...)");
        f12235b = fVarD;
    }

    private e() {
    }

    public static final int a(int i10) {
        return Math.max(1, 8 / i10);
    }

    public static final float b(y6.g gVar, int i10, int i11) {
        if (gVar == null) {
            return 1.0f;
        }
        float f10 = i10;
        float f11 = i11;
        float fMax = Math.max(gVar.f64868a / f10, gVar.f64869b / f11);
        float f12 = f10 * fMax;
        float f13 = gVar.f64870c;
        if (f12 > f13) {
            fMax = f13 / f10;
        }
        return f11 * fMax > f13 ? f13 / f11 : fMax;
    }

    private final int c(k kVar) {
        int iH1 = kVar.h1();
        if (iH1 == 90 || iH1 == 180 || iH1 == 270) {
            return kVar.h1();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int d(y6.h rotationOptions, k encodedImage) {
        AbstractC5504s.h(rotationOptions, "rotationOptions");
        AbstractC5504s.h(encodedImage, "encodedImage");
        int iU0 = encodedImage.U0();
        y5.f fVar = f12235b;
        int iIndexOf = fVar.indexOf(Integer.valueOf(iU0));
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("Only accepts inverted exif orientations");
        }
        E e10 = fVar.get((iIndexOf + ((!rotationOptions.h() ? rotationOptions.f() : 0) / 90)) % fVar.size());
        AbstractC5504s.g(e10, "get(...)");
        return ((Number) e10).intValue();
    }

    public static final int e(y6.h rotationOptions, k encodedImage) {
        AbstractC5504s.h(rotationOptions, "rotationOptions");
        AbstractC5504s.h(encodedImage, "encodedImage");
        if (!rotationOptions.g()) {
            return 0;
        }
        int iC = f12234a.c(encodedImage);
        return rotationOptions.h() ? iC : (iC + rotationOptions.f()) % 360;
    }

    public static final int f(y6.h rotationOptions, y6.g gVar, k encodedImage, boolean z10) {
        AbstractC5504s.h(rotationOptions, "rotationOptions");
        AbstractC5504s.h(encodedImage, "encodedImage");
        if (!z10 || gVar == null) {
            return 8;
        }
        int iE = e(rotationOptions, encodedImage);
        int iD = f12235b.contains(Integer.valueOf(encodedImage.U0())) ? d(rotationOptions, encodedImage) : 0;
        boolean z11 = iE == 90 || iE == 270 || iD == 5 || iD == 7;
        int iK = k(b(gVar, z11 ? encodedImage.getHeight() : encodedImage.getWidth(), z11 ? encodedImage.getWidth() : encodedImage.getHeight()), gVar.f64871d);
        if (iK > 8) {
            return 8;
        }
        if (iK < 1) {
            return 1;
        }
        return iK;
    }

    public static final Matrix g(k encodedImage, y6.h rotationOptions) {
        AbstractC5504s.h(encodedImage, "encodedImage");
        AbstractC5504s.h(rotationOptions, "rotationOptions");
        if (f12235b.contains(Integer.valueOf(encodedImage.U0()))) {
            return f12234a.h(d(rotationOptions, encodedImage));
        }
        int iE = e(rotationOptions, encodedImage);
        if (iE == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(iE);
        return matrix;
    }

    private final Matrix h(int i10) {
        Matrix matrix = new Matrix();
        if (i10 == 2) {
            matrix.setScale(-1.0f, 1.0f);
            return matrix;
        }
        if (i10 == 7) {
            matrix.setRotate(-90.0f);
            matrix.postScale(-1.0f, 1.0f);
            return matrix;
        }
        if (i10 == 4) {
            matrix.setRotate(180.0f);
            matrix.postScale(-1.0f, 1.0f);
            return matrix;
        }
        if (i10 != 5) {
            return null;
        }
        matrix.setRotate(90.0f);
        matrix.postScale(-1.0f, 1.0f);
        return matrix;
    }

    public static final boolean i(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static final boolean j(int i10) {
        return i10 >= 0 && i10 <= 270 && i10 % 90 == 0;
    }

    public static final int k(float f10, float f11) {
        return (int) (f11 + (f10 * 8));
    }
}
