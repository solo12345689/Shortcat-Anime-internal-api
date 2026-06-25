package com.horcrux.svg;

import android.graphics.Rect;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.horcrux.svg.SVGLength;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class FilterRegion {
    SVGLength mH;
    SVGLength mW;
    SVGLength mX;
    SVGLength mY;

    private double getRelativeOrDefault(VirtualView virtualView, SVGLength sVGLength, float f10, double d10) {
        return (sVGLength == null || sVGLength.f43657b == SVGLength.UnitType.UNKNOWN) ? d10 : virtualView.relativeOn(sVGLength, f10);
    }

    public Rect getCropRect(VirtualView virtualView, EnumC4013v enumC4013v, RectF rectF) {
        double dRelativeOnFraction;
        double relativeOrDefault;
        double dRelativeOnFraction2;
        double dRelativeOnFraction3;
        if (rectF == null) {
            return new Rect(0, 0, 0, 0);
        }
        if (enumC4013v == EnumC4013v.OBJECT_BOUNDING_BOX) {
            dRelativeOnFraction = ((double) rectF.left) + virtualView.relativeOnFraction(this.mX, rectF.width());
            dRelativeOnFraction3 = ((double) rectF.top) + virtualView.relativeOnFraction(this.mY, rectF.height());
            dRelativeOnFraction2 = virtualView.relativeOnFraction(this.mW, rectF.width());
            relativeOrDefault = virtualView.relativeOnFraction(this.mH, rectF.height());
        } else {
            float canvasWidth = virtualView.getSvgView().getCanvasWidth();
            float canvasHeight = virtualView.getSvgView().getCanvasHeight();
            double relativeOrDefault2 = getRelativeOrDefault(virtualView, this.mX, canvasWidth, rectF.left);
            double relativeOrDefault3 = getRelativeOrDefault(virtualView, this.mY, canvasHeight, rectF.top);
            double relativeOrDefault4 = getRelativeOrDefault(virtualView, this.mW, canvasWidth, rectF.width());
            dRelativeOnFraction = relativeOrDefault2;
            relativeOrDefault = getRelativeOrDefault(virtualView, this.mH, canvasHeight, rectF.height());
            dRelativeOnFraction2 = relativeOrDefault4;
            dRelativeOnFraction3 = relativeOrDefault3;
        }
        return new Rect((int) dRelativeOnFraction, (int) dRelativeOnFraction3, (int) (dRelativeOnFraction + dRelativeOnFraction2), (int) (dRelativeOnFraction3 + relativeOrDefault));
    }

    public void setHeight(Dynamic dynamic) {
        this.mH = SVGLength.b(dynamic);
    }

    public void setWidth(Dynamic dynamic) {
        this.mW = SVGLength.b(dynamic);
    }

    public void setX(Dynamic dynamic) {
        this.mX = SVGLength.b(dynamic);
    }

    public void setY(Dynamic dynamic) {
        this.mY = SVGLength.b(dynamic);
    }
}
