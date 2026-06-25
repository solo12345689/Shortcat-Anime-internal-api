package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class Z extends l0 {

    /* JADX INFO: renamed from: q */
    private String f43715q;

    /* JADX INFO: renamed from: r */
    private j0 f43716r;

    /* JADX INFO: renamed from: s */
    private i0 f43717s;

    /* JADX INFO: renamed from: t */
    private SVGLength f43718t;

    /* JADX INFO: renamed from: u */
    private h0 f43719u;

    /* JADX INFO: renamed from: v */
    private k0 f43720v;

    public Z(ReactContext reactContext) {
        super(reactContext);
        this.f43719u = h0.align;
        this.f43720v = k0.exact;
    }

    @Override // com.horcrux.svg.l0
    public void X(String str) {
        this.f43719u = h0.valueOf(str);
        invalidate();
    }

    i0 d0() {
        return this.f43717s;
    }

    @Override // com.horcrux.svg.l0, com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
        B(canvas, paint, f10);
    }

    j0 e0() {
        return this.f43716r;
    }

    SVGLength f0() {
        return this.f43718t;
    }

    Path g0(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f43715q);
        if (definedTemplate instanceof RenderableView) {
            return ((RenderableView) definedTemplate).getPath(canvas, paint);
        }
        return null;
    }

    @Override // com.horcrux.svg.l0, com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        return O(canvas, paint);
    }

    public void h0(String str) {
        this.f43715q = str;
        invalidate();
    }

    public void i0(String str) {
        this.f43717s = i0.valueOf(str);
        invalidate();
    }

    public void j0(String str) {
        this.f43716r = j0.valueOf(str);
        invalidate();
    }

    public void k0(String str) {
        this.f43720v = k0.valueOf(str);
        invalidate();
    }

    public void l0(Dynamic dynamic) {
        this.f43718t = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.B
    void G() {
    }

    @Override // com.horcrux.svg.l0, com.horcrux.svg.B
    void H() {
    }
}
