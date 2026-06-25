package com.google.android.material.search;

import android.content.Context;
import android.support.v4.media.session.b;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class SearchView extends FrameLayout implements CoordinatorLayout.b {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class Behavior extends CoordinatorLayout.c {
        public Behavior() {
        }

        public boolean E(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            b.a(view);
            return E(coordinatorLayout, null, view2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
