package com.google.android.material.navigation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import o9.AbstractC5844g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b extends FrameLayout implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f42618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f42619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42620c;

    b(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(AbstractC5844g.f54821e, (ViewGroup) this, true);
        a();
    }

    public void a() {
        setVisibility((!this.f42620c || (!this.f42618a && this.f42619b)) ? 8 : 0);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(androidx.appcompat.view.menu.g gVar, int i10) {
        a();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public androidx.appcompat.view.menu.g getItemData() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setDividersEnabled(boolean z10) {
        this.f42620c = z10;
        a();
    }

    @Override // com.google.android.material.navigation.h
    public void setExpanded(boolean z10) {
        this.f42618a = z10;
        a();
    }

    @Override // com.google.android.material.navigation.h
    public void setOnlyShowWhenExpanded(boolean z10) {
        this.f42619b = z10;
        a();
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
