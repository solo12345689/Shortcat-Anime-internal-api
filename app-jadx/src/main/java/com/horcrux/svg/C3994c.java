package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ReactContext;
import z5.AbstractC7283a;

/* JADX INFO: renamed from: com.horcrux.svg.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class C3994c extends B {
    public C3994c(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
        AbstractC7283a.I("ReactNative", "RNSVG: ClipPath can't be drawn, it should be defined as a child component for `Defs` ");
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    int hitTest(float[] fArr) {
        return -1;
    }

    @Override // com.horcrux.svg.VirtualView
    boolean isResponsible() {
        return false;
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.VirtualView
    void saveDefinition() {
        getSvgView().defineClipPath(this, this.mName);
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.RenderableView
    void resetProperties() {
    }

    @Override // com.horcrux.svg.RenderableView
    void mergeProperties(RenderableView renderableView) {
    }
}
