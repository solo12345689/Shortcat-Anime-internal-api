package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import o9.AbstractC5838a;
import o9.AbstractC5841d;
import o9.AbstractC5846i;
import p9.AbstractC5946a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class p extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f42944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f42945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TimeInterpolator f42946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AutoCompleteTextView f42947h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View.OnClickListener f42948i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View.OnFocusChangeListener f42949j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AccessibilityManager.TouchExplorationStateChangeListener f42950k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f42951l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f42952m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f42953n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f42954o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AccessibilityManager f42955p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ValueAnimator f42956q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ValueAnimator f42957r;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.this.r();
            p.this.f42957r.start();
        }
    }

    p(r rVar) {
        super(rVar);
        this.f42948i = new View.OnClickListener() { // from class: com.google.android.material.textfield.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f42940a.J();
            }
        };
        this.f42949j = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                p.y(this.f42941a, view, z10);
            }
        };
        this.f42950k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: com.google.android.material.textfield.n
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                p.w(this.f42942a, z10);
            }
        };
        this.f42954o = Long.MAX_VALUE;
        this.f42945f = C9.d.f(rVar.getContext(), AbstractC5838a.f54656q0, 67);
        this.f42944e = C9.d.f(rVar.getContext(), AbstractC5838a.f54656q0, 50);
        this.f42946g = C9.d.g(rVar.getContext(), AbstractC5838a.f54664u0, AbstractC5946a.f55826a);
    }

    public static /* synthetic */ void A(p pVar) {
        pVar.K();
        pVar.H(false);
    }

    private static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator E(int i10, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f42946g);
        valueAnimatorOfFloat.setDuration(i10);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                p.x(this.f42937a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void F() {
        this.f42957r = E(this.f42945f, 0.0f, 1.0f);
        ValueAnimator valueAnimatorE = E(this.f42944e, 1.0f, 0.0f);
        this.f42956q = valueAnimatorE;
        valueAnimatorE.addListener(new a());
    }

    private boolean G() {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f42954o;
        return jUptimeMillis < 0 || jUptimeMillis > 300;
    }

    private void H(boolean z10) {
        if (this.f42953n != z10) {
            this.f42953n = z10;
            this.f42957r.cancel();
            this.f42956q.start();
        }
    }

    private void I() {
        this.f42947h.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return p.z(this.f42938a, view, motionEvent);
            }
        });
        this.f42947h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.k
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                p.A(this.f42939a);
            }
        });
        this.f42947h.setThreshold(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        if (this.f42947h == null) {
            return;
        }
        if (G()) {
            this.f42952m = false;
        }
        if (this.f42952m) {
            this.f42952m = false;
            return;
        }
        H(!this.f42953n);
        if (!this.f42953n) {
            this.f42947h.dismissDropDown();
        } else {
            this.f42947h.requestFocus();
            this.f42947h.showDropDown();
        }
    }

    private void K() {
        this.f42952m = true;
        this.f42954o = SystemClock.uptimeMillis();
    }

    public static /* synthetic */ void v(p pVar) {
        boolean zIsPopupShowing = pVar.f42947h.isPopupShowing();
        pVar.H(zIsPopupShowing);
        pVar.f42952m = zIsPopupShowing;
    }

    public static /* synthetic */ void w(p pVar, boolean z10) {
        AutoCompleteTextView autoCompleteTextView = pVar.f42947h;
        if (autoCompleteTextView == null || q.a(autoCompleteTextView)) {
            return;
        }
        pVar.f42992d.setImportantForAccessibility(z10 ? 2 : 1);
    }

    public static /* synthetic */ void x(p pVar, ValueAnimator valueAnimator) {
        pVar.getClass();
        pVar.f42992d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(p pVar, View view, boolean z10) {
        pVar.f42951l = z10;
        pVar.r();
        if (z10) {
            return;
        }
        pVar.H(false);
        pVar.f42952m = false;
    }

    public static /* synthetic */ boolean z(p pVar, View view, MotionEvent motionEvent) {
        pVar.getClass();
        if (motionEvent.getAction() == 1) {
            if (pVar.G()) {
                pVar.f42952m = false;
            }
            pVar.J();
            pVar.K();
        }
        return false;
    }

    @Override // com.google.android.material.textfield.s
    public void a(Editable editable) {
        if (this.f42955p.isTouchExplorationEnabled() && q.a(this.f42947h) && !this.f42992d.hasFocus()) {
            this.f42947h.dismissDropDown();
        }
        this.f42947h.post(new Runnable() { // from class: com.google.android.material.textfield.o
            @Override // java.lang.Runnable
            public final void run() {
                p.v(this.f42943a);
            }
        });
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return AbstractC5846i.f54849g;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return AbstractC5841d.f54759g;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener e() {
        return this.f42949j;
    }

    @Override // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.f42948i;
    }

    @Override // com.google.android.material.textfield.s
    public AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.f42950k;
    }

    @Override // com.google.android.material.textfield.s
    boolean i(int i10) {
        return i10 != 0;
    }

    @Override // com.google.android.material.textfield.s
    boolean j() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean k() {
        return this.f42951l;
    }

    @Override // com.google.android.material.textfield.s
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean m() {
        return this.f42953n;
    }

    @Override // com.google.android.material.textfield.s
    public void n(EditText editText) {
        this.f42947h = D(editText);
        I();
        this.f42989a.setErrorIconDrawable((Drawable) null);
        if (!q.a(editText) && this.f42955p.isTouchExplorationEnabled()) {
            this.f42992d.setImportantForAccessibility(2);
        }
        this.f42989a.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.s
    public void o(View view, L1.B b10) {
        if (!q.a(this.f42947h)) {
            b10.z0(Spinner.class.getName());
        }
        if (b10.h0()) {
            b10.M0(null);
        }
    }

    @Override // com.google.android.material.textfield.s
    public void p(View view, AccessibilityEvent accessibilityEvent) {
        if (!this.f42955p.isEnabled() || q.a(this.f42947h)) {
            return;
        }
        boolean z10 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f42953n && !this.f42947h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z10) {
            J();
            K();
        }
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        F();
        this.f42955p = (AccessibilityManager) this.f42991c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.s
    boolean t() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    void u() {
        AutoCompleteTextView autoCompleteTextView = this.f42947h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f42947h.setOnDismissListener(null);
        }
    }
}
