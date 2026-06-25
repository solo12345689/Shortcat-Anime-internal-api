package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class C4003l extends AbstractC4008q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f43828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f43829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f43830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f43831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f43832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f43833h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    EnumC4012u f43834i;

    /* JADX INFO: renamed from: com.horcrux.svg.l$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f43835a;

        static {
            int[] iArr = new int[EnumC4012u.values().length];
            f43835a = iArr;
            try {
                iArr[EnumC4012u.OVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43835a[EnumC4012u.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43835a[EnumC4012u.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43835a[EnumC4012u.ATOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43835a[EnumC4012u.XOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f43835a[EnumC4012u.ARITHMETIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public C4003l(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.AbstractC4008q
    public Bitmap B(HashMap map, Bitmap bitmap) {
        Bitmap bitmapD = AbstractC4008q.D(map, bitmap, this.f43828c);
        Bitmap bitmapD2 = AbstractC4008q.D(map, bitmap, this.f43829d);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapD.getWidth(), bitmapD.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(bitmapD, 0.0f, 0.0f, paint);
        switch (a.f43835a[this.f43834i.ordinal()]) {
            case 1:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                break;
            case 2:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                break;
            case 3:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                break;
            case 4:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
                break;
            case 5:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
                break;
            case 6:
                int width = bitmapCreateBitmap.getWidth() * bitmapCreateBitmap.getHeight();
                int[] iArr = new int[width];
                bitmapCreateBitmap.getPixels(iArr, 0, bitmapCreateBitmap.getWidth(), 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                int width2 = bitmapCreateBitmap.getWidth();
                int width3 = bitmapCreateBitmap.getWidth();
                int height = bitmapCreateBitmap.getHeight();
                int[] iArr2 = new int[width];
                bitmapD2.getPixels(iArr2, 0, width2, 0, 0, width3, height);
                int i10 = 0;
                while (i10 < width) {
                    int i11 = iArr[i10];
                    int i12 = iArr2[i10];
                    int i13 = width;
                    int[] iArr3 = iArr2;
                    float f10 = this.f43830e;
                    float f11 = (i11 >> 16) & 255;
                    float f12 = (i12 >> 16) & 255;
                    float f13 = f10 * f11 * f12;
                    float f14 = this.f43831f;
                    float f15 = f13 + (f11 * f14);
                    float f16 = this.f43832g;
                    float f17 = f15 + (f12 * f16);
                    float f18 = this.f43833h;
                    int i14 = (int) (f17 + f18);
                    float f19 = (i11 >> 8) & 255;
                    float f20 = (i12 >> 8) & 255;
                    int i15 = (int) ((f10 * f19 * f20) + (f19 * f14) + (f20 * f16) + f18);
                    float f21 = i11 & 255;
                    float f22 = i12 & 255;
                    int i16 = (int) ((f10 * f21 * f22) + (f21 * f14) + (f22 * f16) + f18);
                    float f23 = i11 >>> 24;
                    float f24 = i12 >>> 24;
                    int i17 = (int) ((f10 * f23 * f24) + (f23 * f14) + (f16 * f24) + f18);
                    int iMin = Math.min(255, Math.max(0, i14));
                    iArr[i10] = (Math.min(255, Math.max(0, i15)) << 8) | (iMin << 16) | (Math.min(255, Math.max(0, i17)) << 24) | Math.min(255, Math.max(0, i16));
                    i10++;
                    width = i13;
                    iArr2 = iArr3;
                }
                int width4 = bitmapCreateBitmap.getWidth();
                int width5 = bitmapCreateBitmap.getWidth();
                bitmapCreateBitmap = bitmapCreateBitmap;
                bitmapCreateBitmap.setPixels(iArr, 0, width4, 0, 0, width5, bitmapCreateBitmap.getHeight());
                break;
        }
        if (this.f43834i != EnumC4012u.ARITHMETIC) {
            canvas.drawBitmap(bitmapD2, 0.0f, 0.0f, paint);
        }
        return bitmapCreateBitmap;
    }

    public void J(String str) {
        this.f43828c = str;
        invalidate();
    }

    public void K(String str) {
        this.f43829d = str;
        invalidate();
    }

    public void L(Float f10) {
        this.f43830e = f10.floatValue();
        invalidate();
    }

    public void M(Float f10) {
        this.f43831f = f10.floatValue();
        invalidate();
    }

    public void N(Float f10) {
        this.f43832g = f10.floatValue();
        invalidate();
    }

    public void O(Float f10) {
        this.f43833h = f10.floatValue();
        invalidate();
    }

    public void P(String str) {
        this.f43834i = EnumC4012u.b(str);
        invalidate();
    }
}
