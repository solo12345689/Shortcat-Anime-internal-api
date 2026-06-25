package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import i.AbstractC4956a;
import j.AbstractC5323a;

/* JADX INFO: renamed from: androidx.appcompat.widget.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C2650d extends AutoCompleteTextView {

    /* JADX INFO: renamed from: d */
    private static final int[] f25369d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a */
    private final C2651e f25370a;

    /* JADX INFO: renamed from: b */
    private final C f25371b;

    /* JADX INFO: renamed from: c */
    private final C2659m f25372c;

    public C2650d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4956a.f47966m);
    }

    void a(C2659m c2659m) {
        KeyListener keyListener = getKeyListener();
        if (c2659m.b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = c2659m.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C2651e c2651e = this.f25370a;
        if (c2651e != null) {
            c2651e.b();
        }
        C c10 = this.f25371b;
        if (c10 != null) {
            c10.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.i.o(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2651e c2651e = this.f25370a;
        if (c2651e != null) {
            return c2651e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2651e c2651e = this.f25370a;
        if (c2651e != null) {
            return c2651e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f25371b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f25371b.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f25372c.d(AbstractC2661o.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2651e c2651e = this.f25370a;
        if (c2651e != null) {
            c2651e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C2651e c2651e = this.f25370a;
        if (c2651e != null) {
            c2651e.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f25371b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f25371b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.p(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(AbstractC5323a.b(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f25372c.e(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f25372c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2651e c2651e = this.f25370a;
        if (c2651e != null) {
            c2651e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2651e c2651e = this.f25370a;
        if (c2651e != null) {
            c2651e.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f25371b.w(colorStateList);
        this.f25371b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f25371b.x(mode);
        this.f25371b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C c10 = this.f25371b;
        if (c10 != null) {
            c10.q(context, i10);
        }
    }

    public C2650d(Context context, AttributeSet attributeSet, int i10) {
        super(e0.b(context), attributeSet, i10);
        d0.a(this, getContext());
        h0 h0VarV = h0.v(getContext(), attributeSet, f25369d, i10, 0);
        if (h0VarV.s(0)) {
            setDropDownBackgroundDrawable(h0VarV.g(0));
        }
        h0VarV.x();
        C2651e c2651e = new C2651e(this);
        this.f25370a = c2651e;
        c2651e.e(attributeSet, i10);
        C c10 = new C(this);
        this.f25371b = c10;
        c10.m(attributeSet, i10);
        c10.b();
        C2659m c2659m = new C2659m(this);
        this.f25372c = c2659m;
        c2659m.c(attributeSet, i10);
        a(c2659m);
    }
}
