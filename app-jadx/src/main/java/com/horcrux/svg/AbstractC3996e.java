package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: renamed from: com.horcrux.svg.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC3996e extends VirtualView {
    AbstractC3996e(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        return null;
    }

    @Override // com.horcrux.svg.VirtualView
    int hitTest(float[] fArr) {
        return -1;
    }

    @Override // com.horcrux.svg.VirtualView
    boolean isResponsible() {
        return false;
    }

    @Override // com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
    }
}
