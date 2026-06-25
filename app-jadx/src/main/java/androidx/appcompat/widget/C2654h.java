package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import i.AbstractC4956a;
import j.AbstractC5323a;

/* JADX INFO: renamed from: androidx.appcompat.widget.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C2654h extends CheckedTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2655i f25405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2651e f25406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C f25407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C2660n f25408d;

    public C2654h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4956a.f47969p);
    }

    private C2660n getEmojiTextViewHelper() {
        if (this.f25408d == null) {
            this.f25408d = new C2660n(this);
        }
        return this.f25408d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C c10 = this.f25407c;
        if (c10 != null) {
            c10.b();
        }
        C2651e c2651e = this.f25406b;
        if (c2651e != null) {
            c2651e.b();
        }
        C2655i c2655i = this.f25405a;
        if (c2655i != null) {
            c2655i.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.i.o(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2651e c2651e = this.f25406b;
        if (c2651e != null) {
            return c2651e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2651e c2651e = this.f25406b;
        if (c2651e != null) {
            return c2651e.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C2655i c2655i = this.f25405a;
        if (c2655i != null) {
            return c2655i.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C2655i c2655i = this.f25405a;
        if (c2655i != null) {
            return c2655i.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f25407c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f25407c.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC2661o.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2651e c2651e = this.f25406b;
        if (c2651e != null) {
            c2651e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C2651e c2651e = this.f25406b;
        if (c2651e != null) {
            c2651e.g(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C2655i c2655i = this.f25405a;
        if (c2655i != null) {
            c2655i.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f25407c;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f25407c;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2651e c2651e = this.f25406b;
        if (c2651e != null) {
            c2651e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2651e c2651e = this.f25406b;
        if (c2651e != null) {
            c2651e.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C2655i c2655i = this.f25405a;
        if (c2655i != null) {
            c2655i.f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C2655i c2655i = this.f25405a;
        if (c2655i != null) {
            c2655i.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f25407c.w(colorStateList);
        this.f25407c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f25407c.x(mode);
        this.f25407c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C c10 = this.f25407c;
        if (c10 != null) {
            c10.q(context, i10);
        }
    }

    public C2654h(Context context, AttributeSet attributeSet, int i10) {
        super(e0.b(context), attributeSet, i10);
        d0.a(this, getContext());
        C c10 = new C(this);
        this.f25407c = c10;
        c10.m(attributeSet, i10);
        c10.b();
        C2651e c2651e = new C2651e(this);
        this.f25406b = c2651e;
        c2651e.e(attributeSet, i10);
        C2655i c2655i = new C2655i(this);
        this.f25405a = c2655i;
        c2655i.d(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(AbstractC5323a.b(getContext(), i10));
    }
}
