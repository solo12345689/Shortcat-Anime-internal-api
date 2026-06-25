package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.h0;
import androidx.core.view.L0;
import com.google.android.material.internal.p;
import com.google.android.material.navigation.i;
import com.google.android.material.navigation.m;
import o9.AbstractC5838a;
import o9.AbstractC5847j;
import o9.AbstractC5848k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c extends m {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements p.c {
        a() {
        }

        @Override // com.google.android.material.internal.p.c
        public L0 a(View view, L0 l02, p.d dVar) {
            dVar.f42617d += l02.j();
            boolean z10 = view.getLayoutDirection() == 1;
            int iK = l02.k();
            int iL = l02.l();
            dVar.f42614a += z10 ? iL : iK;
            int i10 = dVar.f42616c;
            if (!z10) {
                iK = iL;
            }
            dVar.f42616c = i10 + iK;
            dVar.a(view);
            return l02;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b extends m.b {
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomnavigation.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface InterfaceC0638c extends m.c {
    }

    public c(Context context) {
        this(context, null);
    }

    private void j() {
        p.b(this, new a());
    }

    private int k(int i10) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i10) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i10;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i10), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), Integer.MIN_VALUE);
    }

    @Override // com.google.android.material.navigation.m
    protected i c(Context context) {
        return new com.google.android.material.bottomnavigation.b(context);
    }

    @Override // com.google.android.material.navigation.m
    public int getMaxItemCount() {
        return 6;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, k(i11));
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), Math.max(getMeasuredHeight(), getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom()));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        com.google.android.material.bottomnavigation.b bVar = (com.google.android.material.bottomnavigation.b) getMenuView();
        if (bVar.v() != z10) {
            bVar.setItemHorizontalTranslationEnabled(z10);
            getPresenter().i(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(b bVar) {
        setOnItemReselectedListener(bVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(InterfaceC0638c interfaceC0638c) {
        setOnItemSelectedListener(interfaceC0638c);
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5838a.f54627c);
    }

    public c(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, AbstractC5847j.f54883l);
    }

    public c(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        h0 h0VarJ = com.google.android.material.internal.m.j(getContext(), attributeSet, AbstractC5848k.f55058U, i10, i11, new int[0]);
        setItemHorizontalTranslationEnabled(h0VarJ.a(AbstractC5848k.f55074W, true));
        if (h0VarJ.s(AbstractC5848k.f55066V)) {
            setMinimumHeight(h0VarJ.f(AbstractC5848k.f55066V, 0));
        }
        h0VarJ.x();
        j();
    }
}
