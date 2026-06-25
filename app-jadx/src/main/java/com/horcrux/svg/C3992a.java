package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.SVGLength;
import z5.AbstractC7283a;

/* JADX INFO: renamed from: com.horcrux.svg.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class C3992a {

    /* JADX INFO: renamed from: a */
    private final EnumC0653a f43721a;

    /* JADX INFO: renamed from: b */
    private final SVGLength[] f43722b;

    /* JADX INFO: renamed from: c */
    private ReadableArray f43723c;

    /* JADX INFO: renamed from: d */
    private final boolean f43724d;

    /* JADX INFO: renamed from: e */
    private boolean f43725e;

    /* JADX INFO: renamed from: f */
    private Matrix f43726f;

    /* JADX INFO: renamed from: g */
    private Rect f43727g;

    /* JADX INFO: renamed from: h */
    private K f43728h;

    /* JADX INFO: renamed from: com.horcrux.svg.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    enum EnumC0653a {
        LINEAR_GRADIENT,
        RADIAL_GRADIENT,
        PATTERN
    }

    /* JADX INFO: renamed from: com.horcrux.svg.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    enum b {
        OBJECT_BOUNDING_BOX,
        USER_SPACE_ON_USE
    }

    C3992a(EnumC0653a enumC0653a, SVGLength[] sVGLengthArr, b bVar) {
        this.f43721a = enumC0653a;
        this.f43722b = sVGLengthArr;
        this.f43724d = bVar == b.OBJECT_BOUNDING_BOX;
    }

    private RectF a(RectF rectF) {
        float f10;
        float f11;
        if (!this.f43724d) {
            rectF = new RectF(this.f43727g);
        }
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        if (this.f43724d) {
            f10 = rectF.left;
            f11 = rectF.top;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        return new RectF(f10, f11, fWidth + f10, fHeight + f11);
    }

    private double b(SVGLength sVGLength, double d10, float f10, float f11) {
        return M.a(sVGLength, d10, 0.0d, (this.f43724d && sVGLength.f43657b == SVGLength.UnitType.NUMBER) ? d10 : f10, f11);
    }

    private static void c(ReadableArray readableArray, int i10, float[] fArr, int[] iArr, float f10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = i11 * 2;
            fArr[i11] = (float) readableArray.getDouble(i12);
            iArr[i11] = (readableArray.getInt(i12 + 1) & 16777215) | (Math.round((r1 >>> 24) * f10) << 24);
        }
    }

    void d(b bVar) {
        this.f43725e = bVar == b.OBJECT_BOUNDING_BOX;
    }

    void e(ReadableArray readableArray) {
        this.f43723c = readableArray;
    }

    void f(Matrix matrix) {
        this.f43726f = matrix;
    }

    void g(K k10) {
        this.f43728h = k10;
    }

    void h(Rect rect) {
        this.f43727g = rect;
    }

    void i(Paint paint, RectF rectF, float f10, float f11) {
        int[] iArr;
        float[] fArr;
        int[] iArr2;
        float[] fArr2;
        double d10;
        float f12;
        RectF rectFA = a(rectF);
        float fWidth = rectFA.width();
        float fHeight = rectFA.height();
        float f13 = rectFA.left;
        float f14 = rectFA.top;
        float textSize = paint.getTextSize();
        if (this.f43721a == EnumC0653a.PATTERN) {
            double d11 = fWidth;
            double dB = b(this.f43722b[0], d11, f10, textSize);
            double d12 = fHeight;
            double dB2 = b(this.f43722b[1], d12, f10, textSize);
            double dB3 = b(this.f43722b[2], d11, f10, textSize);
            double dB4 = b(this.f43722b[3], d12, f10, textSize);
            if (dB3 <= 1.0d || dB4 <= 1.0d) {
                return;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) dB3, (int) dB4, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            RectF viewBox = this.f43728h.getViewBox();
            if (viewBox == null || viewBox.width() <= 0.0f || viewBox.height() <= 0.0f) {
                f12 = fHeight;
            } else {
                f12 = fHeight;
                RectF rectF2 = new RectF((float) dB, (float) dB2, (float) dB3, (float) dB4);
                K k10 = this.f43728h;
                canvas.concat(n0.a(viewBox, rectF2, k10.f43613p, k10.f43614q));
            }
            if (this.f43725e) {
                canvas.scale(fWidth / f10, f12 / f10);
            }
            this.f43728h.draw(canvas, new Paint(), f11);
            Matrix matrix = new Matrix();
            Matrix matrix2 = this.f43726f;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            BitmapShader bitmapShader = new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
            bitmapShader.setLocalMatrix(matrix);
            paint.setShader(bitmapShader);
            return;
        }
        int size = this.f43723c.size();
        if (size == 0) {
            AbstractC7283a.I("ReactNative", "Gradient contains no stops");
            return;
        }
        int i10 = size / 2;
        int[] iArr3 = new int[i10];
        float[] fArr3 = new float[i10];
        c(this.f43723c, i10, fArr3, iArr3, f11);
        if (i10 == 1) {
            int[] iArr4 = {iArr3[0], iArr3[0]};
            float[] fArr4 = {fArr3[0], fArr3[0]};
            AbstractC7283a.I("ReactNative", "Gradient contains only one stop");
            fArr = fArr4;
            iArr = iArr4;
        } else {
            iArr = iArr3;
            fArr = fArr3;
        }
        EnumC0653a enumC0653a = this.f43721a;
        if (enumC0653a == EnumC0653a.LINEAR_GRADIENT) {
            double d13 = fWidth;
            double d14 = f13;
            double dB5 = b(this.f43722b[0], d13, f10, textSize) + d14;
            double d15 = fHeight;
            double d16 = f14;
            LinearGradient linearGradient = new LinearGradient((float) dB5, (float) (b(this.f43722b[1], d15, f10, textSize) + d16), (float) (d14 + b(this.f43722b[2], d13, f10, textSize)), (float) (b(this.f43722b[3], d15, f10, textSize) + d16), iArr, fArr, Shader.TileMode.CLAMP);
            if (this.f43726f != null) {
                Matrix matrix3 = new Matrix();
                matrix3.preConcat(this.f43726f);
                linearGradient.setLocalMatrix(matrix3);
            }
            paint.setShader(linearGradient);
            return;
        }
        int[] iArr5 = iArr;
        float[] fArr5 = fArr;
        if (enumC0653a == EnumC0653a.RADIAL_GRADIENT) {
            double d17 = fWidth;
            double dB6 = b(this.f43722b[2], d17, f10, textSize);
            double d18 = fHeight;
            double dB7 = b(this.f43722b[3], d18, f10, textSize);
            if (dB6 <= 0.0d || dB7 <= 0.0d) {
                float[] fArr6 = {fArr5[0], fArr5[fArr5.length - 1]};
                iArr2 = new int[]{iArr5[iArr5.length - 1], iArr5[iArr5.length - 1]};
                fArr2 = fArr6;
                dB6 = d17;
                d10 = d18;
            } else {
                iArr2 = iArr5;
                fArr2 = fArr5;
                d10 = dB7;
            }
            double d19 = d10 / dB6;
            RadialGradient radialGradient = new RadialGradient((float) (b(this.f43722b[4], d17, f10, textSize) + ((double) f13)), (float) (b(this.f43722b[5], d18 / d19, f10, textSize) + (((double) f14) / d19)), (float) dB6, iArr2, fArr2, Shader.TileMode.CLAMP);
            Matrix matrix4 = new Matrix();
            matrix4.preScale(1.0f, (float) d19);
            Matrix matrix5 = this.f43726f;
            if (matrix5 != null) {
                matrix4.preConcat(matrix5);
            }
            radialGradient.setLocalMatrix(matrix4);
            paint.setShader(radialGradient);
        }
    }
}
