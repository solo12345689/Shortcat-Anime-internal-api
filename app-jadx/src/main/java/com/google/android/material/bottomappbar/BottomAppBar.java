package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.media.session.b;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;
import o9.AbstractC5838a;
import o9.AbstractC5847j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final int f41968w0 = AbstractC5847j.f54890s;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final int f41969x0 = AbstractC5838a.f54648m0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final int f41970y0 = AbstractC5838a.f54662t0;

    static /* synthetic */ void S(BottomAppBar bottomAppBar) {
        throw null;
    }

    static /* synthetic */ View T(BottomAppBar bottomAppBar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void V(BottomAppBar bottomAppBar, View view) {
        ((CoordinatorLayout.f) view.getLayoutParams()).f28707d = 17;
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final Rect f41971p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private WeakReference f41972q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f41973r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final View.OnLayoutChangeListener f41974s;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                b.a(Behavior.this.f41972q.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f41974s = new a();
            this.f41971p = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            b.a(view);
            return U(coordinatorLayout, null, view2, view3, i10, i11);
        }

        public boolean T(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i10) {
            this.f41972q = new WeakReference(bottomAppBar);
            View viewT = BottomAppBar.T(bottomAppBar);
            if (viewT != null && !viewT.isLaidOut()) {
                BottomAppBar.V(bottomAppBar, viewT);
                this.f41973r = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) viewT.getLayoutParams())).bottomMargin;
                viewT.addOnLayoutChangeListener(this.f41974s);
                BottomAppBar.S(bottomAppBar);
            }
            coordinatorLayout.O(bottomAppBar, i10);
            return super.l(coordinatorLayout, bottomAppBar, i10);
        }

        public boolean U(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i10, int i11) {
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            b.a(view);
            return T(coordinatorLayout, null, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f41974s = new a();
            this.f41971p = new Rect();
        }
    }
}
