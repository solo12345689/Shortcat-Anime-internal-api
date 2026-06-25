package com.horcrux.svg;

import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.C3992a;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class P extends AbstractC3996e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float[] f43635j = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SVGLength f43636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SVGLength f43637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SVGLength f43638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SVGLength f43639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SVGLength f43640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SVGLength f43641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ReadableArray f43642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C3992a.b f43643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Matrix f43644i;

    public P(ReactContext reactContext) {
        super(reactContext);
        this.f43644i = null;
    }

    public void B(Dynamic dynamic) {
        this.f43640e = SVGLength.b(dynamic);
        invalidate();
    }

    public void C(Dynamic dynamic) {
        this.f43641f = SVGLength.b(dynamic);
        invalidate();
    }

    public void D(Dynamic dynamic) {
        this.f43636a = SVGLength.b(dynamic);
        invalidate();
    }

    public void E(Dynamic dynamic) {
        this.f43637b = SVGLength.b(dynamic);
        invalidate();
    }

    public void F(ReadableArray readableArray) {
        this.f43642g = readableArray;
        invalidate();
    }

    public void G(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f43635j;
            int iC = M.c(readableArray, fArr, this.mScale);
            if (iC == 6) {
                if (this.f43644i == null) {
                    this.f43644i = new Matrix();
                }
                this.f43644i.setValues(fArr);
            } else if (iC != -1) {
                AbstractC7283a.I("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f43644i = null;
        }
        invalidate();
    }

    public void H(int i10) {
        if (i10 == 0) {
            this.f43643h = C3992a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f43643h = C3992a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void I(Dynamic dynamic) {
        this.f43638c = SVGLength.b(dynamic);
        invalidate();
    }

    public void J(Dynamic dynamic) {
        this.f43639d = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            C3992a c3992a = new C3992a(C3992a.EnumC0653a.RADIAL_GRADIENT, new SVGLength[]{this.f43636a, this.f43637b, this.f43638c, this.f43639d, this.f43640e, this.f43641f}, this.f43643h);
            c3992a.e(this.f43642g);
            Matrix matrix = this.f43644i;
            if (matrix != null) {
                c3992a.f(matrix);
            }
            SvgView svgView = getSvgView();
            if (this.f43643h == C3992a.b.USER_SPACE_ON_USE) {
                c3992a.h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(c3992a, this.mName);
        }
    }
}
