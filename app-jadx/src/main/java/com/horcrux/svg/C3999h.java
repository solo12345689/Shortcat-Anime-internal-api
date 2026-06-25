package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.horcrux.svg.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class C3999h extends RenderableView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SVGLength f43804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SVGLength f43805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SVGLength f43806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SVGLength f43807d;

    public C3999h(ReactContext reactContext) {
        super(reactContext);
    }

    public void B(Dynamic dynamic) {
        this.f43804a = SVGLength.b(dynamic);
        invalidate();
    }

    public void C(Dynamic dynamic) {
        this.f43805b = SVGLength.b(dynamic);
        invalidate();
    }

    public void D(Dynamic dynamic) {
        this.f43806c = SVGLength.b(dynamic);
        invalidate();
    }

    public void E(Dynamic dynamic) {
        this.f43807d = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.f43804a);
        double dRelativeOnHeight = relativeOnHeight(this.f43805b);
        double dRelativeOnWidth2 = relativeOnWidth(this.f43806c);
        double dRelativeOnHeight2 = relativeOnHeight(this.f43807d);
        double d10 = dRelativeOnWidth - dRelativeOnWidth2;
        double d11 = dRelativeOnHeight - dRelativeOnHeight2;
        double d12 = dRelativeOnWidth + dRelativeOnWidth2;
        double d13 = dRelativeOnHeight + dRelativeOnHeight2;
        path.addOval(new RectF((float) d10, (float) d11, (float) d12, (float) d13), Path.Direction.CW);
        ArrayList<H> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new H(EnumC3998g.kCGPathElementMoveToPoint, new L[]{new L(dRelativeOnWidth, d11)}));
        ArrayList<H> arrayList2 = this.elements;
        EnumC3998g enumC3998g = EnumC3998g.kCGPathElementAddLineToPoint;
        arrayList2.add(new H(enumC3998g, new L[]{new L(dRelativeOnWidth, d11), new L(d12, dRelativeOnHeight)}));
        this.elements.add(new H(enumC3998g, new L[]{new L(d12, dRelativeOnHeight), new L(dRelativeOnWidth, d13)}));
        this.elements.add(new H(enumC3998g, new L[]{new L(dRelativeOnWidth, d13), new L(d10, dRelativeOnHeight)}));
        this.elements.add(new H(enumC3998g, new L[]{new L(d10, dRelativeOnHeight), new L(dRelativeOnWidth, d11)}));
        return path;
    }
}
