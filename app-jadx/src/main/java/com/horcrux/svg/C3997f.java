package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: renamed from: com.horcrux.svg.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class C3997f extends AbstractC3996e {
    public C3997f(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }

    @Override // com.horcrux.svg.AbstractC3996e, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
    }
}
