package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class C4014w extends AbstractC3996e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f43902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EnumC4013v f43903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EnumC4013v f43904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FilterRegion f43905d;

    public C4014w(ReactContext reactContext) {
        super(reactContext);
        this.f43902a = new HashMap();
        this.f43905d = new FilterRegion();
    }

    public Bitmap B(Bitmap bitmap, Bitmap bitmap2, RectF rectF) {
        this.f43902a.clear();
        this.f43902a.put("SourceGraphic", bitmap);
        this.f43902a.put("SourceAlpha", FilterUtils.applySourceAlphaFilter(bitmap));
        this.f43902a.put("BackgroundImage", bitmap2);
        this.f43902a.put("BackgroundAlpha", FilterUtils.applySourceAlphaFilter(bitmap2));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect cropRect = this.f43905d.getCropRect(this, this.f43903b, rectF);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof AbstractC4008q) {
                AbstractC4008q abstractC4008q = (AbstractC4008q) childAt;
                bitmapCreateBitmap.eraseColor(0);
                FilterRegion filterRegion = abstractC4008q.f43864b;
                EnumC4013v enumC4013v = this.f43904c;
                Rect cropRect2 = filterRegion.getCropRect(abstractC4008q, enumC4013v, enumC4013v == EnumC4013v.USER_SPACE_ON_USE ? new RectF(cropRect) : rectF);
                canvas.drawBitmap(abstractC4008q.B(this.f43902a, bitmap), cropRect2, cropRect2, (Paint) null);
                bitmap = bitmapCreateBitmap.copy(Bitmap.Config.ARGB_8888, true);
                String strC = abstractC4008q.C();
                if (strC != null) {
                    this.f43902a.put(strC, bitmap);
                }
            } else {
                Log.e("RNSVG", "Invalid `Filter` child: Filter children can only be `Fe...` components");
            }
        }
        bitmapCreateBitmap.eraseColor(0);
        canvas.drawBitmap(bitmap, cropRect, cropRect, (Paint) null);
        return bitmapCreateBitmap;
    }

    public void C(String str) {
        this.f43903b = EnumC4013v.b(str);
        invalidate();
    }

    public void D(Dynamic dynamic) {
        this.f43905d.setHeight(dynamic);
        invalidate();
    }

    public void E(String str) {
        this.f43904c = EnumC4013v.b(str);
        invalidate();
    }

    public void F(Dynamic dynamic) {
        this.f43905d.setWidth(dynamic);
        invalidate();
    }

    public void G(Dynamic dynamic) {
        this.f43905d.setX(dynamic);
        invalidate();
    }

    public void H(Dynamic dynamic) {
        this.f43905d.setY(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
        SvgView svgView;
        if (this.mName == null || (svgView = getSvgView()) == null) {
            return;
        }
        svgView.defineFilter(this, this.mName);
    }
}
