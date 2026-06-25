package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class D extends RenderableView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SVGLength f43551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SVGLength f43552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SVGLength f43553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SVGLength f43554d;

    public D(ReactContext reactContext) {
        super(reactContext);
    }

    public void B(Dynamic dynamic) {
        this.f43551a = SVGLength.b(dynamic);
        invalidate();
    }

    public void C(Dynamic dynamic) {
        this.f43553c = SVGLength.b(dynamic);
        invalidate();
    }

    public void D(Dynamic dynamic) {
        this.f43552b = SVGLength.b(dynamic);
        invalidate();
    }

    public void E(Dynamic dynamic) {
        this.f43554d = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.f43551a);
        double dRelativeOnHeight = relativeOnHeight(this.f43552b);
        double dRelativeOnWidth2 = relativeOnWidth(this.f43553c);
        double dRelativeOnHeight2 = relativeOnHeight(this.f43554d);
        path.moveTo((float) dRelativeOnWidth, (float) dRelativeOnHeight);
        path.lineTo((float) dRelativeOnWidth2, (float) dRelativeOnHeight2);
        ArrayList<H> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new H(EnumC3998g.kCGPathElementMoveToPoint, new L[]{new L(dRelativeOnWidth, dRelativeOnHeight)}));
        this.elements.add(new H(EnumC3998g.kCGPathElementAddLineToPoint, new L[]{new L(dRelativeOnWidth2, dRelativeOnHeight2)}));
        return path;
    }
}
