package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f42763h;

    public SearchBar$ScrollingViewBehavior() {
        this.f42763h = false;
    }

    private void U(AppBarLayout appBarLayout) {
        appBarLayout.setBackgroundColor(0);
        appBarLayout.setTargetElevation(0.0f);
    }

    @Override // com.google.android.material.appbar.e
    protected boolean P() {
        return true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean zH = super.h(coordinatorLayout, view, view2);
        if (!this.f42763h && (view2 instanceof AppBarLayout)) {
            this.f42763h = true;
            U((AppBarLayout) view2);
        }
        return zH;
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42763h = false;
    }
}
