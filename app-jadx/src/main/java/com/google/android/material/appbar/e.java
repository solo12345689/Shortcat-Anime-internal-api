package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.L0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class e extends f {

    /* JADX INFO: renamed from: d */
    final Rect f41900d;

    /* JADX INFO: renamed from: e */
    final Rect f41901e;

    /* JADX INFO: renamed from: f */
    private int f41902f;

    /* JADX INFO: renamed from: g */
    private int f41903g;

    public e() {
        this.f41900d = new Rect();
        this.f41901e = new Rect();
        this.f41902f = 0;
    }

    private static int N(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    @Override // com.google.android.material.appbar.f
    protected void F(CoordinatorLayout coordinatorLayout, View view, int i10) {
        View viewH = H(coordinatorLayout.w(view));
        if (viewH == null) {
            super.F(coordinatorLayout, view, i10);
            this.f41902f = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        Rect rect = this.f41900d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, viewH.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + viewH.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        L0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left += lastWindowInsets.k();
            rect.right -= lastWindowInsets.l();
        }
        Rect rect2 = this.f41901e;
        Gravity.apply(N(fVar.f28706c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
        int I10 = I(viewH);
        view.layout(rect2.left, rect2.top - I10, rect2.right, rect2.bottom - I10);
        this.f41902f = rect2.top - viewH.getBottom();
    }

    abstract View H(List list);

    final int I(View view) {
        if (this.f41903g == 0) {
            return 0;
        }
        float fJ = J(view);
        int i10 = this.f41903g;
        return E1.a.b((int) (fJ * i10), 0, i10);
    }

    abstract float J(View view);

    public final int K() {
        return this.f41903g;
    }

    int L(View view) {
        return view.getMeasuredHeight();
    }

    final int M() {
        return this.f41902f;
    }

    public final void O(int i10) {
        this.f41903g = i10;
    }

    protected boolean P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        View viewH;
        L0 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (viewH = H(coordinatorLayout.w(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (viewH.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.m() + lastWindowInsets.j();
        }
        int iL = size + L(viewH);
        int measuredHeight = viewH.getMeasuredHeight();
        if (P()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iL -= measuredHeight;
        }
        coordinatorLayout.P(view, i10, i11, View.MeasureSpec.makeMeasureSpec(iL, i14 == -1 ? 1073741824 : Integer.MIN_VALUE), i13);
        return true;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41900d = new Rect();
        this.f41901e = new Rect();
        this.f41902f = 0;
    }
}
