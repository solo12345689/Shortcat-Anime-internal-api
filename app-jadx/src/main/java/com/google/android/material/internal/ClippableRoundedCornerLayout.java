package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class ClippableRoundedCornerLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Path f42482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f42483b;

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42483b = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f42482a == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.f42482a);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    public float[] getCornerRadii() {
        return this.f42483b;
    }
}
