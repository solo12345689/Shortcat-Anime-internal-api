package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f43122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f43123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RectF f43124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f43125e;

    public FabTransformationBehavior() {
        this.f43122b = new Rect();
        this.f43123c = new RectF();
        this.f43124d = new RectF();
        this.f43125e = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        if (fVar.f28711h == 0) {
            fVar.f28711h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43122b = new Rect();
        this.f43123c = new RectF();
        this.f43124d = new RectF();
        this.f43125e = new int[2];
    }
}
