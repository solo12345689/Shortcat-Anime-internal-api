package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends androidx.appcompat.view.menu.e {

    /* JADX INFO: renamed from: B */
    private final Class f42687B;

    /* JADX INFO: renamed from: C */
    private final int f42688C;

    /* JADX INFO: renamed from: D */
    private final boolean f42689D;

    public f(Context context, Class cls, int i10, boolean z10) {
        super(context);
        this.f42687B = cls;
        this.f42688C = i10;
        this.f42689D = z10;
    }

    @Override // androidx.appcompat.view.menu.e
    protected MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        if (size() + 1 <= this.f42688C) {
            i0();
            MenuItem menuItemA = super.a(i10, i11, i12, charSequence);
            h0();
            return menuItemA;
        }
        String simpleName = this.f42687B.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.f42688C + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        if (this.f42689D) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) a(i10, i11, i12, charSequence);
            k kVar = new k(w(), this, gVar);
            gVar.x(kVar);
            return kVar;
        }
        throw new UnsupportedOperationException(this.f42687B.getSimpleName() + " does not support submenus");
    }
}
