package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class H extends ToggleButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2651e f25002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C f25003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C2660n f25004c;

    public H(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    private C2660n getEmojiTextViewHelper() {
        if (this.f25004c == null) {
            this.f25004c = new C2660n(this);
        }
        return this.f25004c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C2651e c2651e = this.f25002a;
        if (c2651e != null) {
            c2651e.b();
        }
        C c10 = this.f25003b;
        if (c10 != null) {
            c10.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2651e c2651e = this.f25002a;
        if (c2651e != null) {
            return c2651e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2651e c2651e = this.f25002a;
        if (c2651e != null) {
            return c2651e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f25003b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f25003b.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2651e c2651e = this.f25002a;
        if (c2651e != null) {
            c2651e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C2651e c2651e = this.f25002a;
        if (c2651e != null) {
            c2651e.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f25003b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f25003b;
        if (c10 != null) {
            c10.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2651e c2651e = this.f25002a;
        if (c2651e != null) {
            c2651e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2651e c2651e = this.f25002a;
        if (c2651e != null) {
            c2651e.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f25003b.w(colorStateList);
        this.f25003b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f25003b.x(mode);
        this.f25003b.b();
    }

    public H(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        d0.a(this, getContext());
        C2651e c2651e = new C2651e(this);
        this.f25002a = c2651e;
        c2651e.e(attributeSet, i10);
        C c10 = new C(this);
        this.f25003b = c10;
        c10.m(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }
}
