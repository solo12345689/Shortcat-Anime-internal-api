package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import i.AbstractC4956a;
import j.AbstractC5323a;

/* JADX INFO: renamed from: androidx.appcompat.widget.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C2667v extends RadioButton implements androidx.core.widget.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2656j f25515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2651e f25516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C f25517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C2660n f25518d;

    public C2667v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4956a.f47944F);
    }

    private C2660n getEmojiTextViewHelper() {
        if (this.f25518d == null) {
            this.f25518d = new C2660n(this);
        }
        return this.f25518d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C2651e c2651e = this.f25516b;
        if (c2651e != null) {
            c2651e.b();
        }
        C c10 = this.f25517c;
        if (c10 != null) {
            c10.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2651e c2651e = this.f25516b;
        if (c2651e != null) {
            return c2651e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2651e c2651e = this.f25516b;
        if (c2651e != null) {
            return c2651e.d();
        }
        return null;
    }

    @Override // androidx.core.widget.k
    public ColorStateList getSupportButtonTintList() {
        C2656j c2656j = this.f25515a;
        if (c2656j != null) {
            return c2656j.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C2656j c2656j = this.f25515a;
        if (c2656j != null) {
            return c2656j.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f25517c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f25517c.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2651e c2651e = this.f25516b;
        if (c2651e != null) {
            c2651e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C2651e c2651e = this.f25516b;
        if (c2651e != null) {
            c2651e.g(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C2656j c2656j = this.f25515a;
        if (c2656j != null) {
            c2656j.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f25517c;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f25517c;
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
        C2651e c2651e = this.f25516b;
        if (c2651e != null) {
            c2651e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2651e c2651e = this.f25516b;
        if (c2651e != null) {
            c2651e.j(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C2656j c2656j = this.f25515a;
        if (c2656j != null) {
            c2656j.f(colorStateList);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C2656j c2656j = this.f25515a;
        if (c2656j != null) {
            c2656j.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f25517c.w(colorStateList);
        this.f25517c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f25517c.x(mode);
        this.f25517c.b();
    }

    public C2667v(Context context, AttributeSet attributeSet, int i10) {
        super(e0.b(context), attributeSet, i10);
        d0.a(this, getContext());
        C2656j c2656j = new C2656j(this);
        this.f25515a = c2656j;
        c2656j.d(attributeSet, i10);
        C2651e c2651e = new C2651e(this);
        this.f25516b = c2651e;
        c2651e.e(attributeSet, i10);
        C c10 = new C(this);
        this.f25517c = c10;
        c10.m(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(AbstractC5323a.b(getContext(), i10));
    }
}
