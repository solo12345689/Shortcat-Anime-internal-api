package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class Q extends RenderableView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SVGLength f43645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SVGLength f43646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SVGLength f43647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SVGLength f43648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SVGLength f43649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SVGLength f43650f;

    public Q(ReactContext reactContext) {
        super(reactContext);
    }

    public void B(Dynamic dynamic) {
        this.f43648d = SVGLength.b(dynamic);
        invalidate();
    }

    public void C(Dynamic dynamic) {
        this.f43649e = SVGLength.b(dynamic);
        invalidate();
    }

    public void D(Dynamic dynamic) {
        this.f43650f = SVGLength.b(dynamic);
        invalidate();
    }

    public void E(Dynamic dynamic) {
        this.f43647c = SVGLength.b(dynamic);
        invalidate();
    }

    public void F(Dynamic dynamic) {
        this.f43645a = SVGLength.b(dynamic);
        invalidate();
    }

    public void G(Dynamic dynamic) {
        this.f43646b = SVGLength.b(dynamic);
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    android.graphics.Path getPath(android.graphics.Canvas r20, android.graphics.Paint r21) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.Q.getPath(android.graphics.Canvas, android.graphics.Paint):android.graphics.Path");
    }
}
