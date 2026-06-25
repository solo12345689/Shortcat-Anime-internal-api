package M6;

import E6.k;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12232a = new a();

    private a() {
    }

    public static final float a(y6.h rotationOptions, y6.g gVar, k encodedImage) {
        AbstractC5504s.h(rotationOptions, "rotationOptions");
        AbstractC5504s.h(encodedImage, "encodedImage");
        if (!k.O(encodedImage)) {
            throw new IllegalStateException("Check failed.");
        }
        if (gVar == null || gVar.f64869b <= 0 || gVar.f64868a <= 0 || encodedImage.getWidth() == 0 || encodedImage.getHeight() == 0) {
            return 1.0f;
        }
        int iD = f12232a.d(rotationOptions, encodedImage);
        boolean z10 = iD == 90 || iD == 270;
        int height = z10 ? encodedImage.getHeight() : encodedImage.getWidth();
        int width = z10 ? encodedImage.getWidth() : encodedImage.getHeight();
        float f10 = gVar.f64868a / height;
        float f11 = gVar.f64869b / width;
        float fD = AbstractC5874j.d(f10, f11);
        AbstractC7283a.D("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(gVar.f64868a), Integer.valueOf(gVar.f64869b), Integer.valueOf(height), Integer.valueOf(width), Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(fD));
        return fD;
    }

    public static final int b(y6.h rotationOptions, y6.g gVar, k encodedImage, int i10) {
        AbstractC5504s.h(rotationOptions, "rotationOptions");
        AbstractC5504s.h(encodedImage, "encodedImage");
        if (!k.O(encodedImage)) {
            return 1;
        }
        float fA = a(rotationOptions, gVar, encodedImage);
        int iF = encodedImage.o() == q6.b.f57656b ? f(fA) : e(fA);
        int iMax = Math.max(encodedImage.getHeight(), encodedImage.getWidth());
        float f10 = gVar != null ? gVar.f64870c : i10;
        while (iMax / iF > f10) {
            iF = encodedImage.o() == q6.b.f57656b ? iF * 2 : iF + 1;
        }
        return iF;
    }

    public static final int c(k encodedImage, int i10, int i11) {
        AbstractC5504s.h(encodedImage, "encodedImage");
        int iZ = encodedImage.z();
        while ((((encodedImage.getWidth() * encodedImage.getHeight()) * i10) / iZ) / iZ > i11) {
            iZ *= 2;
        }
        return iZ;
    }

    private final int d(y6.h hVar, k kVar) {
        if (!hVar.h()) {
            return 0;
        }
        int iH1 = kVar.h1();
        if (iH1 == 0 || iH1 == 90 || iH1 == 180 || iH1 == 270) {
            return iH1;
        }
        throw new IllegalStateException("Check failed.");
    }

    public static final int e(float f10) {
        if (f10 > 0.6666667f) {
            return 1;
        }
        int i10 = 2;
        while (true) {
            double d10 = i10;
            if ((1.0d / d10) + ((1.0d / (Math.pow(d10, 2.0d) - d10)) * ((double) 0.33333334f)) <= f10) {
                return i10 - 1;
            }
            i10++;
        }
    }

    public static final int f(float f10) {
        if (f10 > 0.6666667f) {
            return 1;
        }
        int i10 = 2;
        while (true) {
            int i11 = i10 * 2;
            double d10 = 1.0d / ((double) i11);
            if (d10 + (((double) 0.33333334f) * d10) <= f10) {
                return i10;
            }
            i10 = i11;
        }
    }
}
