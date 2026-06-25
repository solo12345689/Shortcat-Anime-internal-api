package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import i.AbstractC4956a;

/* JADX INFO: renamed from: androidx.appcompat.widget.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C2652f extends Button {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2651e f25393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C f25394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C2660n f25395c;

    public C2652f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4956a.f47967n);
    }

    private C2660n getEmojiTextViewHelper() {
        if (this.f25395c == null) {
            this.f25395c = new C2660n(this);
        }
        return this.f25395c;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C2651e c2651e = this.f25393a;
        if (c2651e != null) {
            c2651e.b();
        }
        C c10 = this.f25394b;
        if (c10 != null) {
            c10.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (s0.f25509c) {
            return super.getAutoSizeMaxTextSize();
        }
        C c10 = this.f25394b;
        if (c10 != null) {
            return c10.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (s0.f25509c) {
            return super.getAutoSizeMinTextSize();
        }
        C c10 = this.f25394b;
        if (c10 != null) {
            return c10.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (s0.f25509c) {
            return super.getAutoSizeStepGranularity();
        }
        C c10 = this.f25394b;
        if (c10 != null) {
            return c10.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (s0.f25509c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C c10 = this.f25394b;
        return c10 != null ? c10.h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (s0.f25509c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C c10 = this.f25394b;
        if (c10 != null) {
            return c10.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.i.o(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2651e c2651e = this.f25393a;
        if (c2651e != null) {
            return c2651e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2651e c2651e = this.f25393a;
        if (c2651e != null) {
            return c2651e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f25394b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f25394b.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C c10 = this.f25394b;
        if (c10 != null) {
            c10.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C c10 = this.f25394b;
        if (c10 == null || s0.f25509c || !c10.l()) {
            return;
        }
        this.f25394b.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (s0.f25509c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        C c10 = this.f25394b;
        if (c10 != null) {
            c10.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (s0.f25509c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        C c10 = this.f25394b;
        if (c10 != null) {
            c10.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (s0.f25509c) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        C c10 = this.f25394b;
        if (c10 != null) {
            c10.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2651e c2651e = this.f25393a;
        if (c2651e != null) {
            c2651e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C2651e c2651e = this.f25393a;
        if (c2651e != null) {
            c2651e.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        C c10 = this.f25394b;
        if (c10 != null) {
            c10.s(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2651e c2651e = this.f25393a;
        if (c2651e != null) {
            c2651e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2651e c2651e = this.f25393a;
        if (c2651e != null) {
            c2651e.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f25394b.w(colorStateList);
        this.f25394b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f25394b.x(mode);
        this.f25394b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C c10 = this.f25394b;
        if (c10 != null) {
            c10.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (s0.f25509c) {
            super.setTextSize(i10, f10);
            return;
        }
        C c10 = this.f25394b;
        if (c10 != null) {
            c10.A(i10, f10);
        }
    }

    public C2652f(Context context, AttributeSet attributeSet, int i10) {
        super(e0.b(context), attributeSet, i10);
        d0.a(this, getContext());
        C2651e c2651e = new C2651e(this);
        this.f25393a = c2651e;
        c2651e.e(attributeSet, i10);
        C c10 = new C(this);
        this.f25394b = c10;
        c10.m(attributeSet, i10);
        c10.b();
        getEmojiTextViewHelper().c(attributeSet, i10);
    }
}
