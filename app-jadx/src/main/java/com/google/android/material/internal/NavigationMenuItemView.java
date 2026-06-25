package com.google.android.material.internal;

import L1.B;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.T;
import androidx.appcompat.widget.m0;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.C2746a;
import i.AbstractC4956a;
import o9.AbstractC5840c;
import o9.AbstractC5841d;
import o9.AbstractC5842e;
import o9.AbstractC5844g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class NavigationMenuItemView extends d implements k.a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final int[] f42484G = {R.attr.state_checked};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private FrameLayout f42485A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f42486B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private ColorStateList f42487C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f42488D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private Drawable f42489E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final C2746a f42490F;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f42491v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f42492w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    boolean f42493x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    boolean f42494y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final CheckedTextView f42495z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends C2746a {
        a() {
        }

        @Override // androidx.core.view.C2746a
        public void g(View view, B b10) {
            super.g(view, b10);
            b10.x0(NavigationMenuItemView.this.f42493x);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private StateListDrawable A() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(AbstractC4956a.f47973t, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f42484G, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean B() {
        return this.f42486B.getTitle() == null && this.f42486B.getIcon() == null && this.f42486B.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f42485A == null) {
                this.f42485A = (FrameLayout) ((ViewStub) findViewById(AbstractC5842e.f54792e)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f42485A.removeAllViews();
            this.f42485A.addView(view);
        }
    }

    private void z() {
        if (B()) {
            this.f42495z.setVisibility(8);
            FrameLayout frameLayout = this.f42485A;
            if (frameLayout != null) {
                T.a aVar = (T.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f42485A.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f42495z.setVisibility(0);
        FrameLayout frameLayout2 = this.f42485A;
        if (frameLayout2 != null) {
            T.a aVar2 = (T.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.f42485A.setLayoutParams(aVar2);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(androidx.appcompat.view.menu.g gVar, int i10) {
        this.f42486B = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            setBackground(A());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        m0.a(this, gVar.getTooltipText());
        z();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public androidx.appcompat.view.menu.g getItemData() {
        return this.f42486B;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        androidx.appcompat.view.menu.g gVar = this.f42486B;
        if (gVar != null && gVar.isCheckable() && this.f42486B.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f42484G);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f42493x != z10) {
            this.f42493x = z10;
            this.f42490F.l(this.f42495z, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.f42495z.setChecked(z10);
        CheckedTextView checkedTextView = this.f42495z;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z10 && this.f42494y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f42488D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = B1.a.r(drawable).mutate();
                drawable.setTintList(this.f42487C);
            }
            int i10 = this.f42491v;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f42492w) {
            if (this.f42489E == null) {
                Drawable drawableF = z1.k.f(getResources(), AbstractC5841d.f54762j, getContext().getTheme());
                this.f42489E = drawableF;
                if (drawableF != null) {
                    int i11 = this.f42491v;
                    drawableF.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f42489E;
        }
        this.f42495z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f42495z.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f42491v = i10;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.f42487C = colorStateList;
        this.f42488D = colorStateList != null;
        androidx.appcompat.view.menu.g gVar = this.f42486B;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f42495z.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f42492w = z10;
    }

    public void setTextAppearance(int i10) {
        androidx.core.widget.i.m(this.f42495z, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f42495z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f42495z.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f42494y = true;
        a aVar = new a();
        this.f42490F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(AbstractC5844g.f54818b, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(AbstractC5840c.f54727k));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(AbstractC5842e.f54793f);
        this.f42495z = checkedTextView;
        AbstractC2747a0.k0(checkedTextView, aVar);
    }
}
