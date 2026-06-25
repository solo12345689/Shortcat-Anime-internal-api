package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class T extends B {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f43697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f43698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f43699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f43700i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f43701j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f43702k;

    public T(ReactContext reactContext) {
        super(reactContext);
    }

    void M(Canvas canvas, Paint paint, float f10, float f11, float f12) {
        if (this.f43701j != null) {
            float f13 = this.f43697f;
            float f14 = this.mScale;
            float f15 = this.f43698g;
            canvas.concat(n0.a(new RectF(f13 * f14, f15 * f14, (f13 + this.f43699h) * f14, (f15 + this.f43700i) * f14), new RectF(0.0f, 0.0f, f11, f12), this.f43701j, this.f43702k));
            super.draw(canvas, paint, f10);
        }
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
        saveDefinition();
    }

    public void setAlign(String str) {
        this.f43701j = str;
        invalidate();
    }

    public void setMeetOrSlice(int i10) {
        this.f43702k = i10;
        invalidate();
    }

    public void setMinX(float f10) {
        this.f43697f = f10;
        invalidate();
    }

    public void setMinY(float f10) {
        this.f43698g = f10;
        invalidate();
    }

    public void setVbHeight(float f10) {
        this.f43700i = f10;
        invalidate();
    }

    public void setVbWidth(float f10) {
        this.f43699h = f10;
        invalidate();
    }
}
