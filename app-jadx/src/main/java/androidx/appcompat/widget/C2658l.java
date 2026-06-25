package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.C2752d;
import i.AbstractC4956a;

/* JADX INFO: renamed from: androidx.appcompat.widget.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C2658l extends EditText implements androidx.core.view.K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2651e f25436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C f25437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B f25438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.core.widget.j f25439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C2659m f25440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f25441f;

    /* JADX INFO: renamed from: androidx.appcompat.widget.l$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a {
        a() {
        }

        public TextClassifier a() {
            return C2658l.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            C2658l.super.setTextClassifier(textClassifier);
        }
    }

    public C2658l(Context context) {
        this(context, null);
    }

    private a getSuperCaller() {
        if (this.f25441f == null) {
            this.f25441f = new a();
        }
        return this.f25441f;
    }

    @Override // androidx.core.view.K
    public C2752d a(C2752d c2752d) {
        return this.f25439d.a(this, c2752d);
    }

    void d(C2659m c2659m) {
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
        C2651e c2651e = this.f25436a;
        if (c2651e != null) {
            c2651e.b();
        }
        C c10 = this.f25437b;
        if (c10 != null) {
            c10.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.i.o(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2651e c2651e = this.f25436a;
        if (c2651e != null) {
            return c2651e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2651e c2651e = this.f25436a;
        if (c2651e != null) {
            return c2651e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f25437b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f25437b.k();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        B b10;
        return (Build.VERSION.SDK_INT >= 28 || (b10 = this.f25438c) == null) ? getSuperCaller().a() : b10.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrB;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f25437b.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionA = AbstractC2661o.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionA != null && Build.VERSION.SDK_INT <= 30 && (strArrB = AbstractC2747a0.B(this)) != null) {
            M1.c.d(editorInfo, strArrB);
            inputConnectionA = M1.e.c(this, inputConnectionA, editorInfo);
        }
        return this.f25440e.d(inputConnectionA, editorInfo);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (AbstractC2669x.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (AbstractC2669x.b(this, i10)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2651e c2651e = this.f25436a;
        if (c2651e != null) {
            c2651e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C2651e c2651e = this.f25436a;
        if (c2651e != null) {
            c2651e.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f25437b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f25437b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f25440e.e(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f25440e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2651e c2651e = this.f25436a;
        if (c2651e != null) {
            c2651e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2651e c2651e = this.f25436a;
        if (c2651e != null) {
            c2651e.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f25437b.w(colorStateList);
        this.f25437b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f25437b.x(mode);
        this.f25437b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C c10 = this.f25437b;
        if (c10 != null) {
            c10.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        B b10;
        if (Build.VERSION.SDK_INT >= 28 || (b10 = this.f25438c) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            b10.b(textClassifier);
        }
    }

    public C2658l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4956a.f47939A);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public C2658l(Context context, AttributeSet attributeSet, int i10) {
        super(e0.b(context), attributeSet, i10);
        d0.a(this, getContext());
        C2651e c2651e = new C2651e(this);
        this.f25436a = c2651e;
        c2651e.e(attributeSet, i10);
        C c10 = new C(this);
        this.f25437b = c10;
        c10.m(attributeSet, i10);
        c10.b();
        this.f25438c = new B(this);
        this.f25439d = new androidx.core.widget.j();
        C2659m c2659m = new C2659m(this);
        this.f25440e = c2659m;
        c2659m.c(attributeSet, i10);
        d(c2659m);
    }
}
