package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import o9.AbstractC5838a;
import o9.AbstractC5841d;
import o9.AbstractC5846i;
import p9.AbstractC5946a;

/* JADX INFO: renamed from: com.google.android.material.textfield.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class C3958f extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f42924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f42925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TimeInterpolator f42926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TimeInterpolator f42927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private EditText f42928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View.OnClickListener f42929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnFocusChangeListener f42930k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AnimatorSet f42931l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ValueAnimator f42932m;

    /* JADX INFO: renamed from: com.google.android.material.textfield.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C3958f.this.f42990b.a0(true);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.f$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C3958f.this.f42990b.a0(false);
        }
    }

    C3958f(r rVar) {
        super(rVar);
        this.f42929j = new View.OnClickListener() { // from class: com.google.android.material.textfield.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3958f.v(this.f42919a, view);
            }
        };
        this.f42930k = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C3958f c3958f = this.f42920a;
                c3958f.A(c3958f.E());
            }
        };
        this.f42924e = C9.d.f(rVar.getContext(), AbstractC5838a.f54656q0, 100);
        this.f42925f = C9.d.f(rVar.getContext(), AbstractC5838a.f54656q0, 150);
        this.f42926g = C9.d.g(rVar.getContext(), AbstractC5838a.f54664u0, AbstractC5946a.f55826a);
        this.f42927h = C9.d.g(rVar.getContext(), AbstractC5838a.f54662t0, AbstractC5946a.f55829d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(boolean z10) {
        boolean z11 = this.f42990b.F() == z10;
        if (z10 && !this.f42931l.isRunning()) {
            this.f42932m.cancel();
            this.f42931l.start();
            if (z11) {
                this.f42931l.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f42931l.cancel();
        this.f42932m.start();
        if (z11) {
            this.f42932m.end();
        }
    }

    private ValueAnimator B(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f42926g);
        valueAnimatorOfFloat.setDuration(this.f42924e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C3958f.x(this.f42921a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private ValueAnimator C() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f42927h);
        valueAnimatorOfFloat.setDuration(this.f42925f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C3958f.y(this.f42923a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void D() {
        ValueAnimator valueAnimatorC = C();
        ValueAnimator valueAnimatorB = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f42931l = animatorSet;
        animatorSet.playTogether(valueAnimatorC, valueAnimatorB);
        this.f42931l.addListener(new a());
        ValueAnimator valueAnimatorB2 = B(1.0f, 0.0f);
        this.f42932m = valueAnimatorB2;
        valueAnimatorB2.addListener(new b());
    }

    private boolean E() {
        EditText editText = this.f42928i;
        if (editText != null) {
            return (editText.hasFocus() || this.f42992d.hasFocus()) && this.f42928i.getText().length() > 0;
        }
        return false;
    }

    public static /* synthetic */ void v(C3958f c3958f, View view) {
        EditText editText = c3958f.f42928i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        c3958f.r();
    }

    public static /* synthetic */ void x(C3958f c3958f, ValueAnimator valueAnimator) {
        c3958f.getClass();
        c3958f.f42992d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(C3958f c3958f, ValueAnimator valueAnimator) {
        c3958f.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c3958f.f42992d.setScaleX(fFloatValue);
        c3958f.f42992d.setScaleY(fFloatValue);
    }

    @Override // com.google.android.material.textfield.s
    void a(Editable editable) {
        if (this.f42990b.w() != null) {
            return;
        }
        A(E());
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return AbstractC5846i.f54847e;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return AbstractC5841d.f54760h;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener e() {
        return this.f42930k;
    }

    @Override // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.f42929j;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener g() {
        return this.f42930k;
    }

    @Override // com.google.android.material.textfield.s
    public void n(EditText editText) {
        this.f42928i = editText;
        this.f42989a.setEndIconVisible(E());
    }

    @Override // com.google.android.material.textfield.s
    void q(boolean z10) {
        if (this.f42990b.w() == null) {
            return;
        }
        A(z10);
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        D();
    }

    @Override // com.google.android.material.textfield.s
    void u() {
        EditText editText = this.f42928i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42922a.A(true);
                }
            });
        }
    }
}
