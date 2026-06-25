package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class m0 extends RenderableView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SVGLength f43851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SVGLength f43852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SVGLength f43853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SVGLength f43854e;

    public m0(ReactContext reactContext) {
        super(reactContext);
    }

    public void B(Dynamic dynamic) {
        this.f43854e = SVGLength.b(dynamic);
        invalidate();
    }

    public void C(String str) {
        this.f43850a = str;
        invalidate();
    }

    public void D(Dynamic dynamic) {
        this.f43853d = SVGLength.b(dynamic);
        invalidate();
    }

    public void E(Dynamic dynamic) {
        this.f43851b = SVGLength.b(dynamic);
        invalidate();
    }

    public void F(Dynamic dynamic) {
        this.f43852c = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
        Canvas canvas2;
        Paint paint2;
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f43850a);
        if (definedTemplate == null) {
            AbstractC7283a.I("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f43850a + " is not defined.");
            return;
        }
        definedTemplate.clearCache();
        canvas.translate((float) relativeOnWidth(this.f43851b), (float) relativeOnHeight(this.f43852c));
        boolean z10 = definedTemplate instanceof RenderableView;
        if (z10) {
            ((RenderableView) definedTemplate).mergeProperties(this);
        }
        int iSaveAndSetupCanvas = definedTemplate.saveAndSetupCanvas(canvas, this.mCTM);
        clip(canvas, paint);
        if (definedTemplate instanceof T) {
            canvas2 = canvas;
            paint2 = paint;
            ((T) definedTemplate).M(canvas2, paint2, f10, (float) relativeOnWidth(this.f43853d), (float) relativeOnHeight(this.f43854e));
        } else {
            canvas2 = canvas;
            paint2 = paint;
            definedTemplate.draw(canvas2, paint2, f10 * this.mOpacity);
        }
        RectF rectF = new RectF();
        getPath(canvas2, paint2).computeBounds(rectF, true);
        canvas2.getMatrix().mapRect(rectF);
        setClientRect(rectF);
        definedTemplate.restoreCanvas(canvas2, iSaveAndSetupCanvas);
        if (z10) {
            ((RenderableView) definedTemplate).resetProperties();
        }
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f43850a);
        if (definedTemplate == null) {
            AbstractC7283a.I("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f43850a + " is not defined.");
            return null;
        }
        Path path = definedTemplate.getPath(canvas, paint);
        Path path2 = new Path();
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) relativeOnWidth(this.f43851b), (float) relativeOnHeight(this.f43852c));
        path.transform(matrix, path2);
        return path2;
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    int hitTest(float[] fArr) {
        if (!this.mInvertible) {
            return -1;
        }
        float[] fArr2 = new float[2];
        this.mInvMatrix.mapPoints(fArr2, fArr);
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f43850a);
        if (definedTemplate != null) {
            int iHitTest = definedTemplate.hitTest(fArr2);
            if (iHitTest != -1) {
                return (definedTemplate.isResponsible() || iHitTest != definedTemplate.getId()) ? iHitTest : getId();
            }
            return -1;
        }
        AbstractC7283a.I("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f43850a + " is not defined.");
        return -1;
    }
}
