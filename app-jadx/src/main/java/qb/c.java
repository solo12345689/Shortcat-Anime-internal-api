package Qb;

import android.graphics.Bitmap;
import android.graphics.Color;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f14791a = new c();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f14792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f14793b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f14794c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float[] f14795d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f14796e;

        public a(int i10, int i11) {
            this.f14792a = i10;
            this.f14793b = i11;
            int i12 = 0;
            int i13 = 0;
            while (i12 < i11) {
                int i14 = i12 > 0 ? 0 : 1;
                while (true) {
                    int i15 = this.f14793b;
                    if (i14 * i15 < this.f14792a * (i15 - i12)) {
                        i13++;
                        i14++;
                    }
                }
                i12++;
            }
            this.f14795d = new float[i13];
        }

        public final a a(int i10, int i11, float[] channel) {
            double d10;
            int i12 = i11;
            AbstractC5504s.h(channel, "channel");
            float[] fArr = new float[i10];
            int i13 = this.f14793b;
            int i14 = 0;
            int i15 = 0;
            while (i14 < i13) {
                int i16 = 0;
                while (true) {
                    int i17 = this.f14793b;
                    if (i16 * i17 < this.f14792a * (i17 - i14)) {
                        int i18 = 0;
                        while (true) {
                            d10 = 3.141592653589793d;
                            if (i18 >= i10) {
                                break;
                            }
                            fArr[i18] = (float) Math.cos((3.141592653589793d / ((double) i10)) * ((double) i16) * ((double) (i18 + 0.5f)));
                            i18++;
                        }
                        int i19 = 0;
                        float f10 = 0.0f;
                        while (i19 < i12) {
                            double d11 = d10;
                            float fCos = (float) Math.cos((d11 / ((double) i12)) * ((double) i14) * ((double) (i19 + 0.5f)));
                            for (int i20 = 0; i20 < i10; i20++) {
                                f10 += channel[(i19 * i10) + i20] * fArr[i20] * fCos;
                            }
                            i19++;
                            i12 = i11;
                            d10 = d11;
                        }
                        float f11 = f10 / (i10 * i11);
                        if (i16 > 0 || i14 > 0) {
                            this.f14795d[i15] = f11;
                            this.f14796e = Math.max(this.f14796e, Math.abs(f11));
                            i15++;
                        } else {
                            this.f14794c = f11;
                        }
                        i16++;
                        i12 = i11;
                    }
                }
                i14++;
                i12 = i11;
            }
            if (this.f14796e > 0.0f) {
                int length = this.f14795d.length;
                for (int i21 = 0; i21 < length; i21++) {
                    float[] fArr2 = this.f14795d;
                    fArr2[i21] = ((0.5f / this.f14796e) * fArr2[i21]) + 0.5f;
                }
            }
            return this;
        }

        public final float[] b() {
            return this.f14795d;
        }

        public final float c() {
            return this.f14794c;
        }

        public final float d() {
            return this.f14796e;
        }

        public final int e(byte[] hash, int i10, int i11) {
            AbstractC5504s.h(hash, "hash");
            for (float f10 : this.f14795d) {
                int i12 = (i11 >> 1) + i10;
                hash[i12] = (byte) ((Math.round(f10 * 15.0f) << ((i11 & 1) << 2)) | hash[i12]);
                i11++;
            }
            return i11;
        }
    }

    private c() {
    }

    private final Bitmap b(Bitmap bitmap, int i10) {
        int i11;
        float width = bitmap.getWidth() / bitmap.getHeight();
        if (width > 1.0f) {
            i11 = (int) (i10 / width);
        } else {
            int i12 = (int) (i10 * width);
            i11 = i10;
            i10 = i12;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
        AbstractC5504s.g(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        return bitmapCreateScaledBitmap;
    }

    public final byte[] a(Bitmap bitmap) {
        int length;
        AbstractC5504s.h(bitmap, "bitmap");
        Bitmap bitmapB = b(bitmap, 100);
        int width = bitmapB.getWidth();
        int height = bitmapB.getHeight();
        int i10 = width * height;
        bitmapB.getPixels(new int[i10], 0, width, 0, 0, width, height);
        float f10 = 0.0f;
        float fRed = 0.0f;
        float fGreen = 0.0f;
        float fBlue = 0.0f;
        for (int i11 = 0; i11 < i10; i11++) {
            float fAlpha = Color.alpha(r4[i11]) / 255.0f;
            float f11 = fAlpha / 255.0f;
            fRed += Color.red(r4[i11]) * f11;
            fGreen += Color.green(r4[i11]) * f11;
            fBlue += f11 * Color.blue(r4[i11]);
            f10 += fAlpha;
        }
        if (f10 > 0.0f) {
            fRed /= f10;
            fGreen /= f10;
            fBlue /= f10;
        }
        boolean z10 = f10 < ((float) i10);
        int i12 = z10 ? 5 : 7;
        int iMax = Math.max(1, Math.round((i12 * width) / Math.max(width, height)));
        int iMax2 = Math.max(1, Math.round((i12 * height) / Math.max(width, height)));
        float[] fArr = new float[i10];
        float[] fArr2 = new float[i10];
        float[] fArr3 = new float[i10];
        float[] fArr4 = new float[i10];
        int i13 = 0;
        while (i13 < i10) {
            int i14 = i10;
            float fAlpha2 = (Color.alpha(r4[i13]) & 255) / 255.0f;
            float f12 = 1.0f - fAlpha2;
            float f13 = fAlpha2 / 255.0f;
            float fRed2 = (fRed * f12) + (Color.red(r4[i13]) * f13);
            float fGreen2 = (fGreen * f12) + (Color.green(r4[i13]) * f13);
            float fBlue2 = (f12 * fBlue) + (f13 * Color.blue(r4[i13]));
            float f14 = fRed2 + fGreen2;
            fArr[i13] = (f14 + fBlue2) / 3.0f;
            fArr2[i13] = (f14 / 2.0f) - fBlue2;
            fArr3[i13] = fRed2 - fGreen2;
            fArr4[i13] = fAlpha2;
            i13++;
            i10 = i14;
        }
        a aVarA = new a(Math.max(3, iMax), Math.max(3, iMax2)).a(width, height, fArr);
        a aVarA2 = new a(3, 3).a(width, height, fArr2);
        a aVarA3 = new a(3, 3).a(width, height, fArr3);
        a aVarA4 = z10 ? new a(5, 5).a(width, height, fArr4) : null;
        boolean z11 = width > height;
        int iRound = Math.round(aVarA.c() * 63.0f) | (Math.round((aVarA2.c() * 31.5f) + 31.5f) << 6) | (Math.round((aVarA3.c() * 31.5f) + 31.5f) << 12) | (Math.round(aVarA.d() * 31.0f) << 18) | (z10 ? 8388608 : 0);
        if (z11) {
            iMax = iMax2;
        }
        int iRound2 = (z11 ? 32768 : 0) | (Math.round(aVarA3.d() * 63.0f) << 9) | (Math.round(aVarA2.d() * 63.0f) << 3) | iMax;
        int i15 = z10 ? 6 : 5;
        int length2 = aVarA.b().length + aVarA2.b().length + aVarA3.b().length;
        if (z10) {
            AbstractC5504s.e(aVarA4);
            length = aVarA4.b().length;
        } else {
            length = 0;
        }
        byte[] bArr = new byte[(((length2 + length) + 1) / 2) + i15];
        bArr[0] = (byte) iRound;
        bArr[1] = (byte) (iRound >> 8);
        bArr[2] = (byte) (iRound >> 16);
        bArr[3] = (byte) iRound2;
        bArr[4] = (byte) (iRound2 >> 8);
        if (z10) {
            AbstractC5504s.e(aVarA4);
            bArr[5] = (byte) (Math.round(aVarA4.c() * 15.0f) | (Math.round(aVarA4.d() * 15.0f) << 4));
        }
        int iE = aVarA3.e(bArr, i15, aVarA2.e(bArr, i15, aVarA.e(bArr, i15, 0)));
        if (z10) {
            AbstractC5504s.e(aVarA4);
            aVarA4.e(bArr, i15, iE);
        }
        return bArr;
    }
}
