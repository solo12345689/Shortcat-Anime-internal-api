package com.horcrux.svg;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.C3992a;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class K extends B {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final float[] f43602s = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SVGLength f43603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SVGLength f43604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SVGLength f43605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SVGLength f43606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C3992a.b f43607j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C3992a.b f43608k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f43609l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f43610m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f43611n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f43612o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    String f43613p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f43614q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Matrix f43615r;

    public K(ReactContext reactContext) {
        super(reactContext);
        this.f43615r = null;
    }

    public void M(Dynamic dynamic) {
        this.f43606i = SVGLength.b(dynamic);
        invalidate();
    }

    public void N(int i10) {
        if (i10 == 0) {
            this.f43608k = C3992a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f43608k = C3992a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void O(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f43602s;
            int iC = M.c(readableArray, fArr, this.mScale);
            if (iC == 6) {
                if (this.f43615r == null) {
                    this.f43615r = new Matrix();
                }
                this.f43615r.setValues(fArr);
            } else if (iC != -1) {
                AbstractC7283a.I("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f43615r = null;
        }
        invalidate();
    }

    public void P(int i10) {
        if (i10 == 0) {
            this.f43607j = C3992a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f43607j = C3992a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void Q(Dynamic dynamic) {
        this.f43605h = SVGLength.b(dynamic);
        invalidate();
    }

    public void R(Dynamic dynamic) {
        this.f43603f = SVGLength.b(dynamic);
        invalidate();
    }

    public void S(Dynamic dynamic) {
        this.f43604g = SVGLength.b(dynamic);
        invalidate();
    }

    RectF getViewBox() {
        float f10 = this.f43609l;
        float f11 = this.mScale;
        float f12 = this.f43610m;
        return new RectF(f10 * f11, f12 * f11, (f10 + this.f43611n) * f11, (f12 + this.f43612o) * f11);
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            C3992a c3992a = new C3992a(C3992a.EnumC0653a.PATTERN, new SVGLength[]{this.f43603f, this.f43604g, this.f43605h, this.f43606i}, this.f43607j);
            c3992a.d(this.f43608k);
            c3992a.g(this);
            Matrix matrix = this.f43615r;
            if (matrix != null) {
                c3992a.f(matrix);
            }
            SvgView svgView = getSvgView();
            C3992a.b bVar = this.f43607j;
            C3992a.b bVar2 = C3992a.b.USER_SPACE_ON_USE;
            if (bVar == bVar2 || this.f43608k == bVar2) {
                c3992a.h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(c3992a, this.mName);
        }
    }

    public void setAlign(String str) {
        this.f43613p = str;
        invalidate();
    }

    public void setMeetOrSlice(int i10) {
        this.f43614q = i10;
        invalidate();
    }

    public void setMinX(float f10) {
        this.f43609l = f10;
        invalidate();
    }

    public void setMinY(float f10) {
        this.f43610m = f10;
        invalidate();
    }

    public void setVbHeight(float f10) {
        this.f43612o = f10;
        invalidate();
    }

    public void setVbWidth(float f10) {
        this.f43611n = f10;
        invalidate();
    }
}
