package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.AbstractC2747a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f41907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f41910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f41911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f41912f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f41913g = true;

    public g(View view) {
        this.f41907a = view;
    }

    void a() {
        View view = this.f41907a;
        AbstractC2747a0.V(view, this.f41910d - (view.getTop() - this.f41908b));
        View view2 = this.f41907a;
        AbstractC2747a0.U(view2, this.f41911e - (view2.getLeft() - this.f41909c));
    }

    public int b() {
        return this.f41910d;
    }

    void c() {
        this.f41908b = this.f41907a.getTop();
        this.f41909c = this.f41907a.getLeft();
    }

    public boolean d(int i10) {
        if (!this.f41913g || this.f41911e == i10) {
            return false;
        }
        this.f41911e = i10;
        a();
        return true;
    }

    public boolean e(int i10) {
        if (!this.f41912f || this.f41910d == i10) {
            return false;
        }
        this.f41910d = i10;
        a();
        return true;
    }
}
