package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class C4001j extends AbstractC4008q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f43814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f43815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    EnumC4010s f43816e;

    /* JADX INFO: renamed from: com.horcrux.svg.j$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f43817a;

        static {
            int[] iArr = new int[EnumC4010s.values().length];
            f43817a = iArr;
            try {
                iArr[EnumC4010s.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43817a[EnumC4010s.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43817a[EnumC4010s.SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43817a[EnumC4010s.LIGHTEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43817a[EnumC4010s.DARKEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f43817a[EnumC4010s.MULTIPLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public C4001j(ReactContext reactContext) {
        super(reactContext);
        this.f43864b.mX = new SVGLength(0.0d);
        this.f43864b.mY = new SVGLength(0.0d);
        this.f43864b.mW = new SVGLength("100%");
        this.f43864b.mH = new SVGLength("100%");
    }

    public static /* synthetic */ float[] J(float[] fArr, float[] fArr2) {
        float f10 = fArr[0];
        float f11 = 1.0f - f10;
        float f12 = fArr2[0];
        float f13 = 1.0f - f12;
        float f14 = fArr[1] * f10;
        float f15 = fArr2[1];
        float f16 = (f14 * f13) + (f15 * f12 * f11) + (f14 * f15 * f12);
        float f17 = fArr[2] * f10;
        float f18 = fArr2[2];
        float f19 = fArr[3] * f10;
        float f20 = fArr2[3];
        return new float[]{1.0f - (f11 * f13), f16, (f17 * f13) + (f18 * f12 * f11) + (f17 * f18 * f12), (f13 * f19) + (f20 * f12 * f11) + (f19 * f20 * f12)};
    }

    @Override // com.horcrux.svg.AbstractC4008q
    public Bitmap B(HashMap map, Bitmap bitmap) {
        Bitmap bitmapD = AbstractC4008q.D(map, bitmap, this.f43814c);
        Bitmap bitmapD2 = AbstractC4008q.D(map, bitmap, this.f43815d);
        if (this.f43816e == EnumC4010s.MULTIPLY) {
            return CustomFilter.apply(bitmapD, bitmapD2, new InterfaceC3995d() { // from class: com.horcrux.svg.i
                @Override // com.horcrux.svg.InterfaceC3995d
                public final float[] a(float[] fArr, float[] fArr2) {
                    return C4001j.J(fArr, fArr2);
                }
            });
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapD.getWidth(), bitmapD.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(bitmapD, 0.0f, 0.0f, paint);
        int i10 = a.f43817a[this.f43816e.ordinal()];
        if (i10 == 1 || i10 == 2) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        } else if (i10 == 3) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
        } else if (i10 == 4) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        } else if (i10 == 5) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DARKEN));
        }
        canvas.drawBitmap(bitmapD2, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    public void K(String str) {
        this.f43814c = str;
        invalidate();
    }

    public void L(String str) {
        this.f43815d = str;
        invalidate();
    }

    public void M(String str) {
        this.f43816e = EnumC4010s.b(str);
        invalidate();
    }
}
