package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class C4002k extends AbstractC4008q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f43821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    EnumC4011t f43822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ReadableArray f43823e;

    /* JADX INFO: renamed from: com.horcrux.svg.k$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f43824a;

        static {
            int[] iArr = new int[EnumC4011t.values().length];
            f43824a = iArr;
            try {
                iArr[EnumC4011t.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43824a[EnumC4011t.SATURATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43824a[EnumC4011t.HUE_ROTATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43824a[EnumC4011t.LUMINANCE_TO_ALPHA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C4002k(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.AbstractC4008q
    public Bitmap B(HashMap map, Bitmap bitmap) {
        Bitmap bitmapD = AbstractC4008q.D(map, bitmap, this.f43821c);
        ColorMatrix colorMatrix = new ColorMatrix();
        int i10 = a.f43824a[this.f43822d.ordinal()];
        if (i10 == 1) {
            if (this.f43823e.size() >= 20) {
                float[] fArr = new float[this.f43823e.size()];
                for (int i11 = 0; i11 < this.f43823e.size(); i11++) {
                    fArr[i11] = ((float) this.f43823e.getDouble(i11)) * (i11 % 5 == 4 ? 255 : 1);
                }
                colorMatrix.set(fArr);
                return FilterUtils.getBitmapWithColorMatrix(colorMatrix, bitmapD);
            }
            return bitmapD;
        }
        if (i10 == 2) {
            if (this.f43823e.size() == 1) {
                colorMatrix.setSaturation((float) this.f43823e.getDouble(0));
                return FilterUtils.getBitmapWithColorMatrix(colorMatrix, bitmapD);
            }
            return bitmapD;
        }
        if (i10 == 3) {
            if (this.f43823e.size() == 1) {
                double d10 = (((double) ((float) this.f43823e.getDouble(0))) * 3.141592653589793d) / 180.0d;
                float fCos = (float) Math.cos(d10);
                float fSin = (float) Math.sin(d10);
                float f10 = 0.715f - (fCos * 0.715f);
                float f11 = fSin * 0.715f;
                float f12 = 0.072f - (fCos * 0.072f);
                float f13 = 0.213f - (fCos * 0.213f);
                colorMatrix.set(new float[]{((fCos * 0.787f) + 0.213f) - (fSin * 0.213f), f10 - f11, f12 + (fSin * 0.928f), 0.0f, 0.0f, f13 + (0.143f * fSin), (0.285f * fCos) + 0.715f + (0.14f * fSin), f12 - (0.283f * fSin), 0.0f, 0.0f, f13 - (0.787f * fSin), f10 + f11, (fCos * 0.928f) + 0.072f + (fSin * 0.072f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
            }
            return bitmapD;
        }
        if (i10 == 4) {
            colorMatrix.set(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2125f, 0.7154f, 0.0721f, 0.0f, 0.0f});
        }
        return FilterUtils.getBitmapWithColorMatrix(colorMatrix, bitmapD);
    }

    public void J(String str) {
        this.f43821c = str;
        invalidate();
    }

    public void K(String str) {
        this.f43822d = EnumC4011t.b(str);
        invalidate();
    }

    public void L(ReadableArray readableArray) {
        this.f43823e = readableArray;
        invalidate();
    }
}
