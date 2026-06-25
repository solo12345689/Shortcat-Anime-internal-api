package com.google.android.material.transformation;

import A9.a;
import android.content.Context;
import android.support.v4.media.session.b;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f43121a;

    public ExpandableBehavior() {
        this.f43121a = 0;
    }

    protected a E(CoordinatorLayout coordinatorLayout, View view) {
        List listW = coordinatorLayout.w(view);
        int size = listW.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) listW.get(i10);
            if (e(coordinatorLayout, view, view2)) {
                b.a(view2);
                return null;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean e(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        b.a(view2);
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (view.isLaidOut()) {
            return false;
        }
        E(coordinatorLayout, view);
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43121a = 0;
    }
}
