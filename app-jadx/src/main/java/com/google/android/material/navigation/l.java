package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import o9.AbstractC5842e;
import o9.AbstractC5844g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class l extends FrameLayout implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f42751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f42752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f42753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f42754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ColorStateList f42755e;

    l(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(AbstractC5844g.f54822f, (ViewGroup) this, true);
        this.f42751a = (TextView) findViewById(AbstractC5842e.f54775M);
    }

    private void a() {
        androidx.appcompat.view.menu.g gVar = this.f42754d;
        if (gVar != null) {
            setVisibility((!gVar.isVisible() || (!this.f42752b && this.f42753c)) ? 8 : 0);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(androidx.appcompat.view.menu.g gVar, int i10) {
        this.f42754d = gVar;
        gVar.setCheckable(false);
        this.f42751a.setText(gVar.getTitle());
        a();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public androidx.appcompat.view.menu.g getItemData() {
        return this.f42754d;
    }

    @Override // com.google.android.material.navigation.h
    public void setExpanded(boolean z10) {
        this.f42752b = z10;
        a();
    }

    @Override // com.google.android.material.navigation.h
    public void setOnlyShowWhenExpanded(boolean z10) {
        this.f42753c = z10;
        a();
    }

    public void setTextAppearance(int i10) {
        androidx.core.widget.i.m(this.f42751a, i10);
        ColorStateList colorStateList = this.f42755e;
        if (colorStateList != null) {
            this.f42751a.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f42755e = colorStateList;
        if (colorStateList != null) {
            this.f42751a.setTextColor(colorStateList);
        }
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
