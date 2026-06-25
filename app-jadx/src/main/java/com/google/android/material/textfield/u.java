package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.List;
import o9.AbstractC5838a;
import o9.AbstractC5840c;
import o9.AbstractC5842e;
import p9.AbstractC5946a;
import p9.AbstractC5947b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class u {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private ColorStateList f42993A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Typeface f42994B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f42998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TimeInterpolator f42999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TimeInterpolator f43000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f43001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TextInputLayout f43002h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private LinearLayout f43003i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f43004j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private FrameLayout f43005k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Animator f43006l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f43007m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f43008n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f43009o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f43010p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f43011q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f43012r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f43013s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f43014t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f43015u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ColorStateList f43016v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CharSequence f43017w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f43018x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private TextView f43019y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f43020z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f43021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f43022b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f43023c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f43024d;

        a(int i10, TextView textView, int i11, TextView textView2) {
            this.f43021a = i10;
            this.f43022b = textView;
            this.f43023c = i11;
            this.f43024d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            u.this.f43008n = this.f43021a;
            u.this.f43006l = null;
            TextView textView = this.f43022b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f43023c == 1 && u.this.f43012r != null) {
                    u.this.f43012r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f43024d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f43024d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f43024d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f43024d.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends View.AccessibilityDelegate {
        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = u.this.f43002h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f43001g = context;
        this.f43002h = textInputLayout;
        this.f43007m = context.getResources().getDimensionPixelSize(AbstractC5840c.f54733n);
        this.f42995a = C9.d.f(context, AbstractC5838a.f54658r0, JfifUtil.MARKER_EOI);
        this.f42996b = C9.d.f(context, AbstractC5838a.f54652o0, 167);
        this.f42997c = C9.d.f(context, AbstractC5838a.f54658r0, 167);
        this.f42998d = C9.d.g(context, AbstractC5838a.f54660s0, AbstractC5946a.f55829d);
        int i10 = AbstractC5838a.f54660s0;
        TimeInterpolator timeInterpolator = AbstractC5946a.f55826a;
        this.f42999e = C9.d.g(context, i10, timeInterpolator);
        this.f43000f = C9.d.g(context, AbstractC5838a.f54664u0, timeInterpolator);
    }

    private void D(int i10, int i11) {
        TextView textViewM;
        TextView textViewM2;
        if (i10 == i11) {
            return;
        }
        if (i11 != 0 && (textViewM2 = m(i11)) != null) {
            textViewM2.setVisibility(0);
            textViewM2.setAlpha(1.0f);
        }
        if (i10 != 0 && (textViewM = m(i10)) != null) {
            textViewM.setVisibility(4);
            if (i10 == 1) {
                textViewM.setText((CharSequence) null);
            }
        }
        this.f43008n = i11;
    }

    private void M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void O(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean P(TextView textView, CharSequence charSequence) {
        if (this.f43002h.isLaidOut() && this.f43002h.isEnabled()) {
            return (this.f43009o == this.f43008n && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    private void S(int i10, int i11, boolean z10) {
        u uVar;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f43006l = animatorSet;
            ArrayList arrayList = new ArrayList();
            uVar = this;
            uVar.i(arrayList, this.f43018x, this.f43019y, 2, i10, i11);
            uVar.i(arrayList, uVar.f43011q, uVar.f43012r, 1, i10, i11);
            AbstractC5947b.a(animatorSet, arrayList);
            animatorSet.addListener(uVar.new a(i11, m(i10), i10, m(i11)));
            animatorSet.start();
        } else {
            uVar = this;
            D(i10, i11);
        }
        uVar.f43002h.q0();
        uVar.f43002h.w0(z10);
        uVar.f43002h.C0();
    }

    private boolean g() {
        return (this.f43003i == null || this.f43002h.getEditText() == null) ? false : true;
    }

    private void i(List list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            ObjectAnimator objectAnimatorJ = j(textView, i12 == i10);
            if (i10 == i12 && i11 != 0) {
                objectAnimatorJ.setStartDelay(this.f42997c);
            }
            list.add(objectAnimatorJ);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorK = k(textView);
            objectAnimatorK.setStartDelay(this.f42997c);
            list.add(objectAnimatorK);
        }
    }

    private ObjectAnimator j(TextView textView, boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(z10 ? this.f42996b : this.f42997c);
        objectAnimatorOfFloat.setInterpolator(z10 ? this.f42999e : this.f43000f);
        return objectAnimatorOfFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f43007m, 0.0f);
        objectAnimatorOfFloat.setDuration(this.f42995a);
        objectAnimatorOfFloat.setInterpolator(this.f42998d);
        return objectAnimatorOfFloat;
    }

    private TextView m(int i10) {
        if (i10 == 1) {
            return this.f43012r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f43019y;
    }

    private int v(boolean z10, int i10, int i11) {
        return z10 ? this.f43001g.getResources().getDimensionPixelSize(i10) : i11;
    }

    private boolean y(int i10) {
        return (i10 != 1 || this.f43012r == null || TextUtils.isEmpty(this.f43010p)) ? false : true;
    }

    boolean A() {
        return this.f43011q;
    }

    boolean B() {
        return this.f43018x;
    }

    void C(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f43003i == null) {
            return;
        }
        if (!z(i10) || (frameLayout = this.f43005k) == null) {
            this.f43003i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i11 = this.f43004j - 1;
        this.f43004j = i11;
        O(this.f43003i, i11);
    }

    void E(int i10) {
        this.f43014t = i10;
        TextView textView = this.f43012r;
        if (textView != null) {
            textView.setAccessibilityLiveRegion(i10);
        }
    }

    void F(CharSequence charSequence) {
        this.f43013s = charSequence;
        TextView textView = this.f43012r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void G(boolean z10) {
        if (this.f43011q == z10) {
            return;
        }
        h();
        if (z10) {
            androidx.appcompat.widget.D d10 = new androidx.appcompat.widget.D(this.f43001g);
            this.f43012r = d10;
            d10.setId(AbstractC5842e.f54782T);
            this.f43012r.setTextAlignment(5);
            Typeface typeface = this.f42994B;
            if (typeface != null) {
                this.f43012r.setTypeface(typeface);
            }
            H(this.f43015u);
            I(this.f43016v);
            F(this.f43013s);
            E(this.f43014t);
            this.f43012r.setVisibility(4);
            e(this.f43012r, 0);
        } else {
            w();
            C(this.f43012r, 0);
            this.f43012r = null;
            this.f43002h.q0();
            this.f43002h.C0();
        }
        this.f43011q = z10;
    }

    void H(int i10) {
        this.f43015u = i10;
        TextView textView = this.f43012r;
        if (textView != null) {
            this.f43002h.c0(textView, i10);
        }
    }

    void I(ColorStateList colorStateList) {
        this.f43016v = colorStateList;
        TextView textView = this.f43012r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void J(int i10) {
        this.f43020z = i10;
        TextView textView = this.f43019y;
        if (textView != null) {
            androidx.core.widget.i.m(textView, i10);
        }
    }

    void K(boolean z10) {
        if (this.f43018x == z10) {
            return;
        }
        h();
        if (z10) {
            androidx.appcompat.widget.D d10 = new androidx.appcompat.widget.D(this.f43001g);
            this.f43019y = d10;
            d10.setId(AbstractC5842e.f54783U);
            this.f43019y.setTextAlignment(5);
            Typeface typeface = this.f42994B;
            if (typeface != null) {
                this.f43019y.setTypeface(typeface);
            }
            this.f43019y.setVisibility(4);
            this.f43019y.setAccessibilityLiveRegion(1);
            J(this.f43020z);
            L(this.f42993A);
            e(this.f43019y, 1);
            this.f43019y.setAccessibilityDelegate(new b());
        } else {
            x();
            C(this.f43019y, 1);
            this.f43019y = null;
            this.f43002h.q0();
            this.f43002h.C0();
        }
        this.f43018x = z10;
    }

    void L(ColorStateList colorStateList) {
        this.f42993A = colorStateList;
        TextView textView = this.f43019y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void N(Typeface typeface) {
        if (typeface != this.f42994B) {
            this.f42994B = typeface;
            M(this.f43012r, typeface);
            M(this.f43019y, typeface);
        }
    }

    void Q(CharSequence charSequence) {
        h();
        this.f43010p = charSequence;
        this.f43012r.setText(charSequence);
        int i10 = this.f43008n;
        if (i10 != 1) {
            this.f43009o = 1;
        }
        S(i10, this.f43009o, P(this.f43012r, charSequence));
    }

    void R(CharSequence charSequence) {
        h();
        this.f43017w = charSequence;
        this.f43019y.setText(charSequence);
        int i10 = this.f43008n;
        if (i10 != 2) {
            this.f43009o = 2;
        }
        S(i10, this.f43009o, P(this.f43019y, charSequence));
    }

    void e(TextView textView, int i10) {
        if (this.f43003i == null && this.f43005k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f43001g);
            this.f43003i = linearLayout;
            linearLayout.setOrientation(0);
            this.f43002h.addView(this.f43003i, -1, -2);
            this.f43005k = new FrameLayout(this.f43001g);
            this.f43003i.addView(this.f43005k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f43002h.getEditText() != null) {
                f();
            }
        }
        if (z(i10)) {
            this.f43005k.setVisibility(0);
            this.f43005k.addView(textView);
        } else {
            this.f43003i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f43003i.setVisibility(0);
        this.f43004j++;
    }

    void f() {
        if (g()) {
            EditText editText = this.f43002h.getEditText();
            boolean zK = E9.c.k(this.f43001g);
            this.f43003i.setPaddingRelative(v(zK, AbstractC5840c.f54697Q, editText.getPaddingStart()), v(zK, AbstractC5840c.f54698R, this.f43001g.getResources().getDimensionPixelSize(AbstractC5840c.f54696P)), v(zK, AbstractC5840c.f54697Q, editText.getPaddingEnd()), 0);
        }
    }

    void h() {
        Animator animator = this.f43006l;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean l() {
        return y(this.f43009o);
    }

    int n() {
        return this.f43014t;
    }

    CharSequence o() {
        return this.f43013s;
    }

    CharSequence p() {
        return this.f43010p;
    }

    int q() {
        TextView textView = this.f43012r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    ColorStateList r() {
        TextView textView = this.f43012r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    CharSequence s() {
        return this.f43017w;
    }

    View t() {
        return this.f43019y;
    }

    int u() {
        TextView textView = this.f43019y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    void w() {
        this.f43010p = null;
        h();
        if (this.f43008n == 1) {
            if (!this.f43018x || TextUtils.isEmpty(this.f43017w)) {
                this.f43009o = 0;
            } else {
                this.f43009o = 2;
            }
        }
        S(this.f43008n, this.f43009o, P(this.f43012r, ""));
    }

    void x() {
        h();
        int i10 = this.f43008n;
        if (i10 == 2) {
            this.f43009o = 0;
        }
        S(i10, this.f43009o, P(this.f43019y, ""));
    }

    boolean z(int i10) {
        return i10 == 0 || i10 == 1;
    }
}
