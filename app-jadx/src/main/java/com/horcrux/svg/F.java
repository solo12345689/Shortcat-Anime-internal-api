package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class F extends B {

    /* JADX INFO: renamed from: f */
    private SVGLength f43563f;

    /* JADX INFO: renamed from: g */
    private SVGLength f43564g;

    /* JADX INFO: renamed from: h */
    private SVGLength f43565h;

    /* JADX INFO: renamed from: i */
    private SVGLength f43566i;

    /* JADX INFO: renamed from: j */
    private String f43567j;

    /* JADX INFO: renamed from: k */
    private String f43568k;

    /* JADX INFO: renamed from: l */
    private float f43569l;

    /* JADX INFO: renamed from: m */
    private float f43570m;

    /* JADX INFO: renamed from: n */
    private float f43571n;

    /* JADX INFO: renamed from: o */
    private float f43572o;

    /* JADX INFO: renamed from: p */
    String f43573p;

    /* JADX INFO: renamed from: q */
    int f43574q;

    /* JADX INFO: renamed from: r */
    Matrix f43575r;

    public F(ReactContext reactContext) {
        super(reactContext);
        this.f43575r = new Matrix();
    }

    void M(Canvas canvas, Paint paint, float f10, N n10, float f11) {
        int iSaveAndSetupCanvas = saveAndSetupCanvas(canvas, this.mCTM);
        this.f43575r.reset();
        L l10 = n10.f43627b;
        this.f43575r.setTranslate((float) l10.f43616a, (float) l10.f43617b);
        double d10 = "auto".equals(this.f43568k) ? -1.0d : Double.parseDouble(this.f43568k);
        if (d10 == -1.0d) {
            d10 = n10.f43628c;
        }
        this.f43575r.preRotate(((float) d10) + 180.0f);
        if ("strokeWidth".equals(this.f43567j)) {
            Matrix matrix = this.f43575r;
            float f12 = this.mScale;
            matrix.preScale(f11 / f12, f11 / f12);
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) relativeOnWidth(this.f43565h), (float) relativeOnHeight(this.f43566i));
        if (this.f43573p != null) {
            float f13 = this.f43569l;
            float f14 = this.mScale;
            float f15 = this.f43570m;
            Matrix matrixA = n0.a(new RectF(f13 * f14, f15 * f14, (f13 + this.f43571n) * f14, (f15 + this.f43572o) * f14), rectF, this.f43573p, this.f43574q);
            float[] fArr = new float[9];
            matrixA.getValues(fArr);
            this.f43575r.preScale(fArr[0], fArr[4]);
        }
        this.f43575r.preTranslate((float) (-relativeOnWidth(this.f43563f)), (float) (-relativeOnHeight(this.f43564g)));
        canvas.concat(this.f43575r);
        B(canvas, paint, f10);
        restoreCanvas(canvas, iSaveAndSetupCanvas);
    }

    public void N(Dynamic dynamic) {
        this.f43566i = SVGLength.b(dynamic);
        invalidate();
    }

    public void O(String str) {
        this.f43567j = str;
        invalidate();
    }

    public void P(Dynamic dynamic) {
        this.f43565h = SVGLength.b(dynamic);
        invalidate();
    }

    public void Q(String str) {
        this.f43568k = str;
        invalidate();
    }

    public void R(Dynamic dynamic) {
        this.f43563f = SVGLength.b(dynamic);
        invalidate();
    }

    public void S(Dynamic dynamic) {
        this.f43564g = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMarker(this, this.mName);
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof VirtualView) {
                    ((VirtualView) childAt).saveDefinition();
                }
            }
        }
    }

    public void setAlign(String str) {
        this.f43573p = str;
        invalidate();
    }

    public void setMeetOrSlice(int i10) {
        this.f43574q = i10;
        invalidate();
    }

    public void setMinX(float f10) {
        this.f43569l = f10;
        invalidate();
    }

    public void setMinY(float f10) {
        this.f43570m = f10;
        invalidate();
    }

    public void setVbHeight(float f10) {
        this.f43572o = f10;
        invalidate();
    }

    public void setVbWidth(float f10) {
        this.f43571n = f10;
        invalidate();
    }
}
