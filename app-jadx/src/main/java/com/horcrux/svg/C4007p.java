package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class C4007p extends AbstractC4008q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f43860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    SVGLength f43861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    SVGLength f43862e;

    public C4007p(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.AbstractC4008q
    public Bitmap B(HashMap map, Bitmap bitmap) {
        Bitmap bitmapD = AbstractC4008q.D(map, bitmap, this.f43860c);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        SVGLength sVGLength = this.f43861d;
        float fRelativeOnWidth = sVGLength != null ? (float) relativeOnWidth(sVGLength) : 0.0f;
        SVGLength sVGLength2 = this.f43862e;
        RectF rectF = new RectF(0.0f, 0.0f, fRelativeOnWidth, sVGLength2 != null ? (float) relativeOnHeight(sVGLength2) : 0.0f);
        getSvgView().getCtm().mapRect(rectF);
        float fWidth = rectF.left;
        if (fWidth >= 0.0f) {
            fWidth = rectF.width();
        }
        float fHeight = rectF.top;
        if (fHeight >= 0.0f) {
            fHeight = rectF.height();
        }
        canvas.drawBitmap(bitmapD, fWidth, fHeight, (Paint) null);
        return bitmapCreateBitmap;
    }

    public void J(Dynamic dynamic) {
        this.f43861d = SVGLength.b(dynamic);
        invalidate();
    }

    public void K(Dynamic dynamic) {
        this.f43862e = SVGLength.b(dynamic);
        invalidate();
    }

    public void L(String str) {
        this.f43860c = str;
        invalidate();
    }
}
