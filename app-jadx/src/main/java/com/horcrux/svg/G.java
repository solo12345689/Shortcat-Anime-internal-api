package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.horcrux.svg.C3992a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class G extends B {

    /* JADX INFO: renamed from: f */
    SVGLength f43576f;

    /* JADX INFO: renamed from: g */
    SVGLength f43577g;

    /* JADX INFO: renamed from: h */
    SVGLength f43578h;

    /* JADX INFO: renamed from: i */
    SVGLength f43579i;

    /* JADX INFO: renamed from: j */
    private C3992a.b f43580j;

    /* JADX INFO: renamed from: k */
    private C3992a.b f43581k;

    /* JADX INFO: renamed from: l */
    a f43582l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    enum a {
        LUMINANCE,
        ALPHA
    }

    public G(ReactContext reactContext) {
        super(reactContext);
    }

    public a M() {
        return this.f43582l;
    }

    public C3992a.b N() {
        return this.f43580j;
    }

    public void O(Dynamic dynamic) {
        this.f43579i = SVGLength.b(dynamic);
        invalidate();
    }

    public void P(int i10) {
        if (i10 == 0) {
            this.f43581k = C3992a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f43581k = C3992a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void Q(int i10) {
        if (i10 == 0) {
            this.f43582l = a.LUMINANCE;
        } else if (i10 == 1) {
            this.f43582l = a.ALPHA;
        }
        invalidate();
    }

    public void R(int i10) {
        if (i10 == 0) {
            this.f43580j = C3992a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f43580j = C3992a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void S(Dynamic dynamic) {
        this.f43578h = SVGLength.b(dynamic);
        invalidate();
    }

    public void T(Dynamic dynamic) {
        this.f43576f = SVGLength.b(dynamic);
        invalidate();
    }

    public void U(Dynamic dynamic) {
        this.f43577g = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMask(this, this.mName);
        }
    }
}
