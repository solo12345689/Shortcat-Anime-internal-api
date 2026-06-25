package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class b extends c {

    /* JADX INFO: renamed from: a */
    final SideSheetBehavior f42798a;

    b(SideSheetBehavior sideSheetBehavior) {
        this.f42798a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.c
    int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.c
    float b(int i10) {
        float fD = d();
        return (fD - i10) / (fD - c());
    }

    @Override // com.google.android.material.sidesheet.c
    int c() {
        return Math.max(0, (d() - this.f42798a.Y()) - this.f42798a.d0());
    }

    @Override // com.google.android.material.sidesheet.c
    int d() {
        return this.f42798a.g0();
    }

    @Override // com.google.android.material.sidesheet.c
    int e() {
        return this.f42798a.g0();
    }

    @Override // com.google.android.material.sidesheet.c
    int f() {
        return c();
    }

    @Override // com.google.android.material.sidesheet.c
    int g(View view) {
        return view.getLeft() - this.f42798a.d0();
    }

    @Override // com.google.android.material.sidesheet.c
    public int h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // com.google.android.material.sidesheet.c
    int i() {
        return 0;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean j(float f10) {
        return f10 < 0.0f;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean k(View view) {
        return view.getLeft() > (d() + c()) / 2;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean l(float f10, float f11) {
        return d.a(f10, f11) && Math.abs(f10) > ((float) this.f42798a.h0());
    }

    @Override // com.google.android.material.sidesheet.c
    boolean m(View view, float f10) {
        return Math.abs(((float) view.getRight()) + (f10 * this.f42798a.b0())) > this.f42798a.c0();
    }

    @Override // com.google.android.material.sidesheet.c
    void n(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        int iG0 = this.f42798a.g0();
        if (i10 <= iG0) {
            marginLayoutParams.rightMargin = iG0 - i10;
        }
    }
}
