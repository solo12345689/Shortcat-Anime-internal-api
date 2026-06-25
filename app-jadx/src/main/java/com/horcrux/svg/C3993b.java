package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.horcrux.svg.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class C3993b extends RenderableView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SVGLength f43755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SVGLength f43756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SVGLength f43757c;

    public C3993b(ReactContext reactContext) {
        super(reactContext);
    }

    public void B(Dynamic dynamic) {
        this.f43755a = SVGLength.b(dynamic);
        invalidate();
    }

    public void C(Dynamic dynamic) {
        this.f43756b = SVGLength.b(dynamic);
        invalidate();
    }

    public void D(Dynamic dynamic) {
        this.f43757c = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.f43755a);
        double dRelativeOnHeight = relativeOnHeight(this.f43756b);
        double dRelativeOnOther = relativeOnOther(this.f43757c);
        path.addCircle((float) dRelativeOnWidth, (float) dRelativeOnHeight, (float) dRelativeOnOther, Path.Direction.CW);
        ArrayList<H> arrayList = new ArrayList<>();
        this.elements = arrayList;
        double d10 = dRelativeOnHeight - dRelativeOnOther;
        arrayList.add(new H(EnumC3998g.kCGPathElementMoveToPoint, new L[]{new L(dRelativeOnWidth, d10)}));
        ArrayList<H> arrayList2 = this.elements;
        EnumC3998g enumC3998g = EnumC3998g.kCGPathElementAddLineToPoint;
        double d11 = dRelativeOnWidth + dRelativeOnOther;
        arrayList2.add(new H(enumC3998g, new L[]{new L(dRelativeOnWidth, d10), new L(d11, dRelativeOnHeight)}));
        double d12 = dRelativeOnHeight + dRelativeOnOther;
        this.elements.add(new H(enumC3998g, new L[]{new L(d11, dRelativeOnHeight), new L(dRelativeOnWidth, d12)}));
        ArrayList<H> arrayList3 = this.elements;
        L l10 = new L(dRelativeOnWidth, d12);
        double d13 = dRelativeOnWidth - dRelativeOnOther;
        arrayList3.add(new H(enumC3998g, new L[]{l10, new L(d13, dRelativeOnHeight)}));
        this.elements.add(new H(enumC3998g, new L[]{new L(d13, dRelativeOnHeight), new L(dRelativeOnWidth, d10)}));
        return path;
    }
}
