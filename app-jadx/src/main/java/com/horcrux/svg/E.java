package com.horcrux.svg;

import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.C3992a;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class E extends AbstractC3996e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float[] f43555h = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SVGLength f43556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SVGLength f43557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SVGLength f43558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SVGLength f43559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ReadableArray f43560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C3992a.b f43561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Matrix f43562g;

    public E(ReactContext reactContext) {
        super(reactContext);
        this.f43562g = null;
    }

    public void B(ReadableArray readableArray) {
        this.f43560e = readableArray;
        invalidate();
    }

    public void C(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f43555h;
            int iC = M.c(readableArray, fArr, this.mScale);
            if (iC == 6) {
                if (this.f43562g == null) {
                    this.f43562g = new Matrix();
                }
                this.f43562g.setValues(fArr);
            } else if (iC != -1) {
                AbstractC7283a.I("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f43562g = null;
        }
        invalidate();
    }

    public void D(int i10) {
        if (i10 == 0) {
            this.f43561f = C3992a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f43561f = C3992a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void E(Dynamic dynamic) {
        this.f43556a = SVGLength.b(dynamic);
        invalidate();
    }

    public void F(Dynamic dynamic) {
        this.f43558c = SVGLength.b(dynamic);
        invalidate();
    }

    public void G(Dynamic dynamic) {
        this.f43557b = SVGLength.b(dynamic);
        invalidate();
    }

    public void H(Dynamic dynamic) {
        this.f43559d = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            C3992a c3992a = new C3992a(C3992a.EnumC0653a.LINEAR_GRADIENT, new SVGLength[]{this.f43556a, this.f43557b, this.f43558c, this.f43559d}, this.f43561f);
            c3992a.e(this.f43560e);
            Matrix matrix = this.f43562g;
            if (matrix != null) {
                c3992a.f(matrix);
            }
            SvgView svgView = getSvgView();
            if (this.f43561f == C3992a.b.USER_SPACE_ON_USE) {
                c3992a.h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(c3992a, this.mName);
        }
    }
}
