package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class f extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f41904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41906c;

    public f() {
        this.f41905b = 0;
        this.f41906c = 0;
    }

    public int E() {
        g gVar = this.f41904a;
        if (gVar != null) {
            return gVar.b();
        }
        return 0;
    }

    protected void F(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.O(view, i10);
    }

    public boolean G(int i10) {
        g gVar = this.f41904a;
        if (gVar != null) {
            return gVar.e(i10);
        }
        this.f41905b = i10;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        F(coordinatorLayout, view, i10);
        if (this.f41904a == null) {
            this.f41904a = new g(view);
        }
        this.f41904a.c();
        this.f41904a.a();
        int i11 = this.f41905b;
        if (i11 != 0) {
            this.f41904a.e(i11);
            this.f41905b = 0;
        }
        int i12 = this.f41906c;
        if (i12 == 0) {
            return true;
        }
        this.f41904a.d(i12);
        this.f41906c = 0;
        return true;
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41905b = 0;
        this.f41906c = 0;
    }
}
