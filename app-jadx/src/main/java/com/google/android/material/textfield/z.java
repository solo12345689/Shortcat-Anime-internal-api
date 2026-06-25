package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.h0;
import com.google.android.material.internal.CheckableImageButton;
import o9.AbstractC5840c;
import o9.AbstractC5842e;
import o9.AbstractC5844g;
import o9.AbstractC5848k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class z extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextInputLayout f43043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextView f43044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CharSequence f43045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CheckableImageButton f43046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ColorStateList f43047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PorterDuff.Mode f43048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f43049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView.ScaleType f43050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private View.OnLongClickListener f43051i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f43052j;

    z(TextInputLayout textInputLayout, h0 h0Var) {
        super(textInputLayout.getContext());
        this.f43043a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(AbstractC5844g.f54820d, (ViewGroup) this, false);
        this.f43046d = checkableImageButton;
        t.e(checkableImageButton);
        androidx.appcompat.widget.D d10 = new androidx.appcompat.widget.D(getContext());
        this.f43044b = d10;
        j(h0Var);
        i(h0Var);
        addView(checkableImageButton);
        addView(d10);
    }

    private void C() {
        int i10 = (this.f43045c == null || this.f43052j) ? 8 : 0;
        setVisibility((this.f43046d.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.f43044b.setVisibility(i10);
        this.f43043a.p0();
    }

    private void i(h0 h0Var) {
        this.f43044b.setVisibility(8);
        this.f43044b.setId(AbstractC5842e.f54785W);
        this.f43044b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f43044b.setAccessibilityLiveRegion(1);
        o(h0Var.n(AbstractC5848k.f55025P6, 0));
        if (h0Var.s(AbstractC5848k.f55033Q6)) {
            p(h0Var.c(AbstractC5848k.f55033Q6));
        }
        n(h0Var.p(AbstractC5848k.f55017O6));
    }

    private void j(h0 h0Var) {
        if (E9.c.k(getContext())) {
            ((ViewGroup.MarginLayoutParams) this.f43046d.getLayoutParams()).setMarginEnd(0);
        }
        u(null);
        v(null);
        if (h0Var.s(AbstractC5848k.f55081W6)) {
            this.f43047e = E9.c.b(getContext(), h0Var, AbstractC5848k.f55081W6);
        }
        if (h0Var.s(AbstractC5848k.f55089X6)) {
            this.f43048f = com.google.android.material.internal.p.h(h0Var.k(AbstractC5848k.f55089X6, -1), null);
        }
        if (h0Var.s(AbstractC5848k.f55057T6)) {
            s(h0Var.g(AbstractC5848k.f55057T6));
            if (h0Var.s(AbstractC5848k.f55049S6)) {
                r(h0Var.p(AbstractC5848k.f55049S6));
            }
            q(h0Var.a(AbstractC5848k.f55041R6, true));
        }
        t(h0Var.f(AbstractC5848k.f55065U6, getResources().getDimensionPixelSize(AbstractC5840c.f54730l0)));
        if (h0Var.s(AbstractC5848k.f55073V6)) {
            w(t.b(h0Var.k(AbstractC5848k.f55073V6, -1)));
        }
    }

    void A(L1.B b10) {
        if (this.f43044b.getVisibility() != 0) {
            b10.l1(this.f43046d);
        } else {
            b10.O0(this.f43044b);
            b10.l1(this.f43044b);
        }
    }

    void B() {
        EditText editText = this.f43043a.f42873e;
        if (editText == null) {
            return;
        }
        this.f43044b.setPaddingRelative(k() ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(AbstractC5840c.f54699S), editText.getCompoundPaddingBottom());
    }

    CharSequence a() {
        return this.f43045c;
    }

    ColorStateList b() {
        return this.f43044b.getTextColors();
    }

    int c() {
        return getPaddingStart() + this.f43044b.getPaddingStart() + (k() ? this.f43046d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.f43046d.getLayoutParams()).getMarginEnd() : 0);
    }

    TextView d() {
        return this.f43044b;
    }

    CharSequence e() {
        return this.f43046d.getContentDescription();
    }

    Drawable f() {
        return this.f43046d.getDrawable();
    }

    int g() {
        return this.f43049g;
    }

    ImageView.ScaleType h() {
        return this.f43050h;
    }

    boolean k() {
        return this.f43046d.getVisibility() == 0;
    }

    void l(boolean z10) {
        this.f43052j = z10;
        C();
    }

    void m() {
        t.d(this.f43043a, this.f43046d, this.f43047e);
    }

    void n(CharSequence charSequence) {
        this.f43045c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f43044b.setText(charSequence);
        C();
    }

    void o(int i10) {
        androidx.core.widget.i.m(this.f43044b, i10);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        B();
    }

    void p(ColorStateList colorStateList) {
        this.f43044b.setTextColor(colorStateList);
    }

    void q(boolean z10) {
        this.f43046d.setCheckable(z10);
    }

    void r(CharSequence charSequence) {
        if (e() != charSequence) {
            this.f43046d.setContentDescription(charSequence);
        }
    }

    void s(Drawable drawable) {
        this.f43046d.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.f43043a, this.f43046d, this.f43047e, this.f43048f);
            z(true);
            m();
        } else {
            z(false);
            u(null);
            v(null);
            r(null);
        }
    }

    void t(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i10 != this.f43049g) {
            this.f43049g = i10;
            t.g(this.f43046d, i10);
        }
    }

    void u(View.OnClickListener onClickListener) {
        t.h(this.f43046d, onClickListener, this.f43051i);
    }

    void v(View.OnLongClickListener onLongClickListener) {
        this.f43051i = onLongClickListener;
        t.i(this.f43046d, onLongClickListener);
    }

    void w(ImageView.ScaleType scaleType) {
        this.f43050h = scaleType;
        t.j(this.f43046d, scaleType);
    }

    void x(ColorStateList colorStateList) {
        if (this.f43047e != colorStateList) {
            this.f43047e = colorStateList;
            t.a(this.f43043a, this.f43046d, colorStateList, this.f43048f);
        }
    }

    void y(PorterDuff.Mode mode) {
        if (this.f43048f != mode) {
            this.f43048f = mode;
            t.a(this.f43043a, this.f43046d, this.f43047e, mode);
        }
    }

    void z(boolean z10) {
        if (k() != z10) {
            this.f43046d.setVisibility(z10 ? 0 : 8);
            B();
            C();
        }
    }
}
