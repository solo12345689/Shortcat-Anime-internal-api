package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.e;
import q9.C6164a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private final f f42756a;

    /* JADX INFO: renamed from: b */
    private final i f42757b;

    /* JADX INFO: renamed from: c */
    private final j f42758c;

    /* JADX INFO: renamed from: d */
    private MenuInflater f42759d;

    /* JADX INFO: renamed from: e */
    private c f42760e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
        boolean a(MenuItem menuItem);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class d extends Q1.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: c */
        Bundle f42762c;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b */
            public d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel, ClassLoader classLoader) {
            this.f42762c = parcel.readBundle(classLoader);
        }

        @Override // Q1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeBundle(this.f42762c);
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m(android.content.Context r10, android.util.AttributeSet r11, int r12, int r13) {
        /*
            Method dump skipped, instruction units count: 677
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.m.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    static /* synthetic */ b a(m mVar) {
        mVar.getClass();
        return null;
    }

    private MenuInflater getMenuInflater() {
        if (this.f42759d == null) {
            this.f42759d = new androidx.appcompat.view.g(getContext());
        }
        return this.f42759d;
    }

    private void setMeasureBottomPaddingFromLabelBaseline(boolean z10) {
        this.f42757b.setMeasurePaddingFromLabelBaseline(z10);
    }

    protected abstract i c(Context context);

    public C6164a d(int i10) {
        return this.f42757b.j(i10);
    }

    public C6164a e(int i10) {
        return this.f42757b.k(i10);
    }

    public void f(int i10) {
        this.f42758c.m(true);
        getMenuInflater().inflate(i10, this.f42756a);
        this.f42758c.m(false);
        this.f42758c.i(true);
    }

    protected boolean g() {
        return false;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f42757b.getActiveIndicatorLabelPadding();
    }

    public int getCollapsedMaxItemCount() {
        return getMaxItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.f42757b.getHorizontalItemTextAppearanceActive();
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.f42757b.getHorizontalItemTextAppearanceInactive();
    }

    public int getIconLabelHorizontalSpacing() {
        return this.f42757b.getIconLabelHorizontalSpacing();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f42757b.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.f42757b.getItemActiveIndicatorExpandedHeight();
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.f42757b.getItemActiveIndicatorExpandedMarginHorizontal();
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.f42757b.getItemActiveIndicatorExpandedWidth();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f42757b.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f42757b.getItemActiveIndicatorMarginHorizontal();
    }

    public H9.l getItemActiveIndicatorShapeAppearance() {
        return this.f42757b.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f42757b.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f42757b.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f42757b.getItemBackgroundRes();
    }

    public int getItemGravity() {
        return this.f42757b.getItemGravity();
    }

    public int getItemIconGravity() {
        return this.f42757b.getItemIconGravity();
    }

    public int getItemIconSize() {
        return this.f42757b.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f42757b.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f42757b.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f42757b.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f42757b.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f42757b.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f42757b.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f42757b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f42757b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f42756a;
    }

    public androidx.appcompat.view.menu.k getMenuView() {
        return this.f42757b;
    }

    public ViewGroup getMenuViewGroup() {
        return this.f42757b;
    }

    public j getPresenter() {
        return this.f42758c;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.f42757b.getScaleLabelTextWithFont();
    }

    public int getSelectedItemId() {
        return this.f42757b.getSelectedItemId();
    }

    public void h(int i10, int i11, int i12, int i13) {
        this.f42757b.r(i10, i11, i12, i13);
    }

    public boolean i() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        H9.i.e(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.a());
        this.f42756a.T(dVar.f42762c);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        dVar.f42762c = bundle;
        this.f42756a.V(bundle);
        return dVar;
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        this.f42757b.setActiveIndicatorLabelPadding(i10);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        H9.i.d(this, f10);
    }

    public void setHorizontalItemTextAppearanceActive(int i10) {
        this.f42757b.setHorizontalItemTextAppearanceActive(i10);
    }

    public void setHorizontalItemTextAppearanceInactive(int i10) {
        this.f42757b.setHorizontalItemTextAppearanceInactive(i10);
    }

    public void setIconLabelHorizontalSpacing(int i10) {
        this.f42757b.setIconLabelHorizontalSpacing(i10);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f42757b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f42757b.setItemActiveIndicatorEnabled(z10);
    }

    public void setItemActiveIndicatorExpandedHeight(int i10) {
        this.f42757b.setItemActiveIndicatorExpandedHeight(i10);
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i10) {
        this.f42757b.setItemActiveIndicatorExpandedMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorExpandedWidth(int i10) {
        this.f42757b.setItemActiveIndicatorExpandedWidth(i10);
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f42757b.setItemActiveIndicatorHeight(i10);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f42757b.setItemActiveIndicatorMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorShapeAppearance(H9.l lVar) {
        this.f42757b.setItemActiveIndicatorShapeAppearance(lVar);
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f42757b.setItemActiveIndicatorWidth(i10);
    }

    public void setItemBackground(Drawable drawable) {
        this.f42757b.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i10) {
        this.f42757b.setItemBackgroundRes(i10);
    }

    public void setItemGravity(int i10) {
        if (this.f42757b.getItemGravity() != i10) {
            this.f42757b.setItemGravity(i10);
            this.f42758c.i(false);
        }
    }

    public void setItemIconGravity(int i10) {
        if (this.f42757b.getItemIconGravity() != i10) {
            this.f42757b.setItemIconGravity(i10);
            this.f42758c.i(false);
        }
    }

    public void setItemIconSize(int i10) {
        this.f42757b.setItemIconSize(i10);
    }

    public void setItemIconSizeRes(int i10) {
        setItemIconSize(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f42757b.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i10) {
        this.f42757b.setItemPaddingBottom(i10);
    }

    public void setItemPaddingTop(int i10) {
        this.f42757b.setItemPaddingTop(i10);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f42757b.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i10) {
        this.f42757b.setItemTextAppearanceActive(i10);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f42757b.setItemTextAppearanceActiveBoldEnabled(z10);
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.f42757b.setItemTextAppearanceInactive(i10);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f42757b.setItemTextColor(colorStateList);
    }

    public void setLabelFontScalingEnabled(boolean z10) {
        this.f42757b.setLabelFontScalingEnabled(z10);
    }

    public void setLabelMaxLines(int i10) {
        this.f42757b.setLabelMaxLines(i10);
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f42757b.getLabelVisibilityMode() != i10) {
            this.f42757b.setLabelVisibilityMode(i10);
            this.f42758c.i(false);
        }
    }

    public void setOnItemSelectedListener(c cVar) {
        this.f42760e = cVar;
    }

    public void setSelectedItemId(int i10) {
        MenuItem menuItemFindItem = this.f42756a.findItem(i10);
        if (menuItemFindItem != null) {
            boolean zP = this.f42756a.P(menuItemFindItem, this.f42758c, 0);
            if (menuItemFindItem.isCheckable()) {
                if (!zP || menuItemFindItem.isChecked()) {
                    this.f42757b.setCheckedItem(menuItemFindItem);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements e.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            m.a(m.this);
            return (m.this.f42760e == null || m.this.f42760e.a(menuItem)) ? false : true;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
        }
    }

    public void setOnItemReselectedListener(b bVar) {
    }
}
