package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: renamed from: com.horcrux.svg.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class C4016y extends B {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    SVGLength f43924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    SVGLength f43925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    SVGLength f43926h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    SVGLength f43927i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Bitmap f43928j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    Canvas f43929k;

    public C4016y(ReactContext reactContext) {
        super(reactContext);
        this.f43928j = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        this.f43929k = new Canvas(this.f43928j);
    }

    @Override // com.horcrux.svg.B
    void B(Canvas canvas, Paint paint, float f10) {
        H();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (!(childAt instanceof G)) {
                if (childAt instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt;
                    if (!"none".equals(virtualView.mDisplay)) {
                        boolean z10 = virtualView instanceof RenderableView;
                        if (z10) {
                            ((RenderableView) virtualView).mergeProperties(this);
                        }
                        int iSaveAndSetupCanvas = virtualView.saveAndSetupCanvas(canvas, this.mCTM);
                        virtualView.render(canvas, paint, this.mOpacity * f10);
                        RectF clientRect = virtualView.getClientRect();
                        if (clientRect != null) {
                            rectF.union(clientRect);
                        }
                        virtualView.restoreCanvas(canvas, iSaveAndSetupCanvas);
                        if (z10) {
                            ((RenderableView) virtualView).resetProperties();
                        }
                        if (virtualView.isResponsible()) {
                            svgView.enableTouchEvents();
                        }
                    }
                } else if (childAt instanceof SvgView) {
                    SvgView svgView2 = (SvgView) childAt;
                    svgView2.drawChildren(canvas);
                    if (svgView2.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                } else {
                    int iSave = canvas.save();
                    canvas.translate(childAt.getLeft(), childAt.getTop());
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        canvas.concat(matrix);
                    }
                    childAt.draw(canvas);
                    canvas.restoreToCount(iSave);
                }
            }
        }
        setClientRect(rectF);
        G();
    }

    public void M(Dynamic dynamic) {
        this.f43927i = SVGLength.b(dynamic);
        invalidate();
    }

    public void N(Dynamic dynamic) {
        this.f43926h = SVGLength.b(dynamic);
        invalidate();
    }

    public void O(Dynamic dynamic) {
        this.f43924f = SVGLength.b(dynamic);
        invalidate();
    }

    public void P(Dynamic dynamic) {
        this.f43925g = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(this.f43929k);
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
        float fRelativeOnWidth = (float) relativeOnWidth(this.f43924f);
        float fRelativeOnHeight = (float) relativeOnHeight(this.f43925g);
        float fRelativeOnWidth2 = (float) relativeOnWidth(this.f43926h);
        float fRelativeOnHeight2 = (float) relativeOnHeight(this.f43927i);
        canvas.translate(fRelativeOnWidth, fRelativeOnHeight);
        canvas.clipRect(0.0f, 0.0f, fRelativeOnWidth2, fRelativeOnHeight2);
        super.draw(canvas, paint, f10);
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(this.f43929k, view, j10);
    }

    @Override // com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        super.invalidate();
        SvgView svgView = getSvgView();
        if (svgView != null) {
            svgView.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }
}
