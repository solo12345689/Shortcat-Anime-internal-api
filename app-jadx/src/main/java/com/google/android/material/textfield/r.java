package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.h0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import j.AbstractC5323a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o9.AbstractC5840c;
import o9.AbstractC5842e;
import o9.AbstractC5844g;
import o9.AbstractC5846i;
import o9.AbstractC5848k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class r extends LinearLayout {

    /* JADX INFO: renamed from: a */
    final TextInputLayout f42959a;

    /* JADX INFO: renamed from: b */
    private final FrameLayout f42960b;

    /* JADX INFO: renamed from: c */
    private final CheckableImageButton f42961c;

    /* JADX INFO: renamed from: d */
    private ColorStateList f42962d;

    /* JADX INFO: renamed from: e */
    private PorterDuff.Mode f42963e;

    /* JADX INFO: renamed from: f */
    private View.OnLongClickListener f42964f;

    /* JADX INFO: renamed from: g */
    private final CheckableImageButton f42965g;

    /* JADX INFO: renamed from: h */
    private final d f42966h;

    /* JADX INFO: renamed from: i */
    private int f42967i;

    /* JADX INFO: renamed from: j */
    private final LinkedHashSet f42968j;

    /* JADX INFO: renamed from: k */
    private ColorStateList f42969k;

    /* JADX INFO: renamed from: l */
    private PorterDuff.Mode f42970l;

    /* JADX INFO: renamed from: m */
    private int f42971m;

    /* JADX INFO: renamed from: n */
    private ImageView.ScaleType f42972n;

    /* JADX INFO: renamed from: o */
    private View.OnLongClickListener f42973o;

    /* JADX INFO: renamed from: p */
    private CharSequence f42974p;

    /* JADX INFO: renamed from: q */
    private final TextView f42975q;

    /* JADX INFO: renamed from: r */
    private boolean f42976r;

    /* JADX INFO: renamed from: s */
    private EditText f42977s;

    /* JADX INFO: renamed from: t */
    private final AccessibilityManager f42978t;

    /* JADX INFO: renamed from: u */
    private AccessibilityManager.TouchExplorationStateChangeListener f42979u;

    /* JADX INFO: renamed from: v */
    private final TextWatcher f42980v;

    /* JADX INFO: renamed from: w */
    private final TextInputLayout.g f42981w;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends com.google.android.material.internal.l {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            r.this.m().a(editable);
        }

        @Override // com.google.android.material.internal.l, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            r.this.m().b(charSequence, i10, i11, i12);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements TextInputLayout.g {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout) {
            if (r.this.f42977s == textInputLayout.getEditText()) {
                return;
            }
            if (r.this.f42977s != null) {
                r.this.f42977s.removeTextChangedListener(r.this.f42980v);
                if (r.this.f42977s.getOnFocusChangeListener() == r.this.m().e()) {
                    r.this.f42977s.setOnFocusChangeListener(null);
                }
            }
            r.this.f42977s = textInputLayout.getEditText();
            if (r.this.f42977s != null) {
                r.this.f42977s.addTextChangedListener(r.this.f42980v);
            }
            r.this.m().n(r.this.f42977s);
            r rVar = r.this;
            rVar.h0(rVar.m());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            r.this.g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            r.this.M();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class d {

        /* JADX INFO: renamed from: a */
        private final SparseArray f42985a = new SparseArray();

        /* JADX INFO: renamed from: b */
        private final r f42986b;

        /* JADX INFO: renamed from: c */
        private final int f42987c;

        /* JADX INFO: renamed from: d */
        private final int f42988d;

        d(r rVar, h0 h0Var) {
            this.f42986b = rVar;
            this.f42987c = h0Var.n(AbstractC5848k.f55183i6, 0);
            this.f42988d = h0Var.n(AbstractC5848k.f54961H6, 0);
        }

        private s b(int i10) {
            if (i10 == -1) {
                return new C3959g(this.f42986b);
            }
            if (i10 == 0) {
                return new w(this.f42986b);
            }
            if (i10 == 1) {
                return new y(this.f42986b, this.f42988d);
            }
            if (i10 == 2) {
                return new C3958f(this.f42986b);
            }
            if (i10 == 3) {
                return new p(this.f42986b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i10);
        }

        s c(int i10) {
            s sVar = (s) this.f42985a.get(i10);
            if (sVar != null) {
                return sVar;
            }
            s sVarB = b(i10);
            this.f42985a.append(i10, sVarB);
            return sVarB;
        }
    }

    r(TextInputLayout textInputLayout, h0 h0Var) {
        super(textInputLayout.getContext());
        this.f42967i = 0;
        this.f42968j = new LinkedHashSet();
        this.f42980v = new a();
        b bVar = new b();
        this.f42981w = bVar;
        this.f42978t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f42959a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f42960b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonI = i(this, layoutInflaterFrom, AbstractC5842e.f54780R);
        this.f42961c = checkableImageButtonI;
        CheckableImageButton checkableImageButtonI2 = i(frameLayout, layoutInflaterFrom, AbstractC5842e.f54779Q);
        this.f42965g = checkableImageButtonI2;
        this.f42966h = new d(this, h0Var);
        androidx.appcompat.widget.D d10 = new androidx.appcompat.widget.D(getContext());
        this.f42975q = d10;
        C(h0Var);
        B(h0Var);
        D(h0Var);
        frameLayout.addView(checkableImageButtonI2);
        addView(d10);
        addView(frameLayout);
        addView(checkableImageButtonI);
        textInputLayout.j(bVar);
        addOnAttachStateChangeListener(new c());
    }

    private void B(h0 h0Var) {
        if (!h0Var.s(AbstractC5848k.f54969I6)) {
            if (h0Var.s(AbstractC5848k.f55215m6)) {
                this.f42969k = E9.c.b(getContext(), h0Var, AbstractC5848k.f55215m6);
            }
            if (h0Var.s(AbstractC5848k.f55223n6)) {
                this.f42970l = com.google.android.material.internal.p.h(h0Var.k(AbstractC5848k.f55223n6, -1), null);
            }
        }
        if (h0Var.s(AbstractC5848k.f55199k6)) {
            U(h0Var.k(AbstractC5848k.f55199k6, 0));
            if (h0Var.s(AbstractC5848k.f55175h6)) {
                Q(h0Var.p(AbstractC5848k.f55175h6));
            }
            O(h0Var.a(AbstractC5848k.f55167g6, true));
        } else if (h0Var.s(AbstractC5848k.f54969I6)) {
            if (h0Var.s(AbstractC5848k.f54977J6)) {
                this.f42969k = E9.c.b(getContext(), h0Var, AbstractC5848k.f54977J6);
            }
            if (h0Var.s(AbstractC5848k.f54985K6)) {
                this.f42970l = com.google.android.material.internal.p.h(h0Var.k(AbstractC5848k.f54985K6, -1), null);
            }
            U(h0Var.a(AbstractC5848k.f54969I6, false) ? 1 : 0);
            Q(h0Var.p(AbstractC5848k.f54953G6));
        }
        T(h0Var.f(AbstractC5848k.f55191j6, getResources().getDimensionPixelSize(AbstractC5840c.f54730l0)));
        if (h0Var.s(AbstractC5848k.f55207l6)) {
            X(t.b(h0Var.k(AbstractC5848k.f55207l6, -1)));
        }
    }

    private void C(h0 h0Var) {
        if (h0Var.s(AbstractC5848k.f55263s6)) {
            this.f42962d = E9.c.b(getContext(), h0Var, AbstractC5848k.f55263s6);
        }
        if (h0Var.s(AbstractC5848k.f55271t6)) {
            this.f42963e = com.google.android.material.internal.p.h(h0Var.k(AbstractC5848k.f55271t6, -1), null);
        }
        if (h0Var.s(AbstractC5848k.f55255r6)) {
            c0(h0Var.g(AbstractC5848k.f55255r6));
        }
        this.f42961c.setContentDescription(getResources().getText(AbstractC5846i.f54848f));
        this.f42961c.setImportantForAccessibility(2);
        this.f42961c.setClickable(false);
        this.f42961c.setPressable(false);
        this.f42961c.setCheckable(false);
        this.f42961c.setFocusable(false);
    }

    private void D(h0 h0Var) {
        this.f42975q.setVisibility(8);
        this.f42975q.setId(AbstractC5842e.f54786X);
        this.f42975q.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        this.f42975q.setAccessibilityLiveRegion(1);
        q0(h0Var.n(AbstractC5848k.f55105Z6, 0));
        if (h0Var.s(AbstractC5848k.f55114a7)) {
            r0(h0Var.c(AbstractC5848k.f55114a7));
        }
        p0(h0Var.p(AbstractC5848k.f55097Y6));
    }

    public void M() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f42979u;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.f42978t) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }

    public void g() {
        if (this.f42979u == null || this.f42978t == null || !isAttachedToWindow()) {
            return;
        }
        this.f42978t.addTouchExplorationStateChangeListener(this.f42979u);
    }

    public void h0(s sVar) {
        if (this.f42977s == null) {
            return;
        }
        if (sVar.e() != null) {
            this.f42977s.setOnFocusChangeListener(sVar.e());
        }
        if (sVar.g() != null) {
            this.f42965g.setOnFocusChangeListener(sVar.g());
        }
    }

    private CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(AbstractC5844g.f54819c, viewGroup, false);
        checkableImageButton.setId(i10);
        t.e(checkableImageButton);
        if (E9.c.k(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    private void j(int i10) {
        Iterator it = this.f42968j.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    private void s0(s sVar) {
        sVar.s();
        this.f42979u = sVar.h();
        g();
    }

    private int t(s sVar) {
        int i10 = this.f42966h.f42987c;
        return i10 == 0 ? sVar.d() : i10;
    }

    private void t0(s sVar) {
        M();
        this.f42979u = null;
        sVar.u();
    }

    private void u0(boolean z10) {
        if (!z10 || n() == null) {
            t.a(this.f42959a, this.f42965g, this.f42969k, this.f42970l);
            return;
        }
        Drawable drawableMutate = B1.a.r(n()).mutate();
        drawableMutate.setTint(this.f42959a.getErrorCurrentTextColors());
        this.f42965g.setImageDrawable(drawableMutate);
    }

    private void v0() {
        this.f42960b.setVisibility((this.f42965g.getVisibility() != 0 || G()) ? 8 : 0);
        setVisibility((F() || G() || ((this.f42974p == null || this.f42976r) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    private void w0() {
        this.f42961c.setVisibility(s() != null && this.f42959a.O() && this.f42959a.d0() ? 0 : 8);
        v0();
        x0();
        if (A()) {
            return;
        }
        this.f42959a.p0();
    }

    private void y0() {
        int visibility = this.f42975q.getVisibility();
        int i10 = (this.f42974p == null || this.f42976r) ? 8 : 0;
        if (visibility != i10) {
            m().q(i10 == 0);
        }
        v0();
        this.f42975q.setVisibility(i10);
        this.f42959a.p0();
    }

    boolean A() {
        return this.f42967i != 0;
    }

    boolean E() {
        return A() && this.f42965g.isChecked();
    }

    boolean F() {
        return this.f42960b.getVisibility() == 0 && this.f42965g.getVisibility() == 0;
    }

    boolean G() {
        return this.f42961c.getVisibility() == 0;
    }

    void H(boolean z10) {
        this.f42976r = z10;
        y0();
    }

    void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.f42959a.d0());
        }
    }

    void J() {
        t.d(this.f42959a, this.f42965g, this.f42969k);
    }

    void K() {
        t.d(this.f42959a, this.f42961c, this.f42962d);
    }

    void L(boolean z10) {
        boolean z11;
        boolean zIsActivated;
        boolean zIsChecked;
        s sVarM = m();
        boolean z12 = true;
        if (!sVarM.l() || (zIsChecked = this.f42965g.isChecked()) == sVarM.m()) {
            z11 = false;
        } else {
            this.f42965g.setChecked(!zIsChecked);
            z11 = true;
        }
        if (!sVarM.j() || (zIsActivated = this.f42965g.isActivated()) == sVarM.k()) {
            z12 = z11;
        } else {
            N(!zIsActivated);
        }
        if (z10 || z12) {
            J();
        }
    }

    void N(boolean z10) {
        this.f42965g.setActivated(z10);
    }

    void O(boolean z10) {
        this.f42965g.setCheckable(z10);
    }

    void P(int i10) {
        Q(i10 != 0 ? getResources().getText(i10) : null);
    }

    void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.f42965g.setContentDescription(charSequence);
        }
    }

    void R(int i10) {
        S(i10 != 0 ? AbstractC5323a.b(getContext(), i10) : null);
    }

    void S(Drawable drawable) {
        this.f42965g.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.f42959a, this.f42965g, this.f42969k, this.f42970l);
            J();
        }
    }

    void T(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != this.f42971m) {
            this.f42971m = i10;
            t.g(this.f42965g, i10);
            t.g(this.f42961c, i10);
        }
    }

    void U(int i10) {
        if (this.f42967i == i10) {
            return;
        }
        t0(m());
        int i11 = this.f42967i;
        this.f42967i = i10;
        j(i11);
        a0(i10 != 0);
        s sVarM = m();
        R(t(sVarM));
        P(sVarM.c());
        O(sVarM.l());
        if (!sVarM.i(this.f42959a.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f42959a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        s0(sVarM);
        V(sVarM.f());
        EditText editText = this.f42977s;
        if (editText != null) {
            sVarM.n(editText);
            h0(sVarM);
        }
        t.a(this.f42959a, this.f42965g, this.f42969k, this.f42970l);
        L(true);
    }

    void V(View.OnClickListener onClickListener) {
        t.h(this.f42965g, onClickListener, this.f42973o);
    }

    void W(View.OnLongClickListener onLongClickListener) {
        this.f42973o = onLongClickListener;
        t.i(this.f42965g, onLongClickListener);
    }

    void X(ImageView.ScaleType scaleType) {
        this.f42972n = scaleType;
        t.j(this.f42965g, scaleType);
        t.j(this.f42961c, scaleType);
    }

    void Y(ColorStateList colorStateList) {
        if (this.f42969k != colorStateList) {
            this.f42969k = colorStateList;
            t.a(this.f42959a, this.f42965g, colorStateList, this.f42970l);
        }
    }

    void Z(PorterDuff.Mode mode) {
        if (this.f42970l != mode) {
            this.f42970l = mode;
            t.a(this.f42959a, this.f42965g, this.f42969k, mode);
        }
    }

    void a0(boolean z10) {
        if (F() != z10) {
            this.f42965g.setVisibility(z10 ? 0 : 8);
            v0();
            x0();
            this.f42959a.p0();
        }
    }

    void b0(int i10) {
        c0(i10 != 0 ? AbstractC5323a.b(getContext(), i10) : null);
        K();
    }

    void c0(Drawable drawable) {
        this.f42961c.setImageDrawable(drawable);
        w0();
        t.a(this.f42959a, this.f42961c, this.f42962d, this.f42963e);
    }

    void d0(View.OnClickListener onClickListener) {
        t.h(this.f42961c, onClickListener, this.f42964f);
    }

    void e0(View.OnLongClickListener onLongClickListener) {
        this.f42964f = onLongClickListener;
        t.i(this.f42961c, onLongClickListener);
    }

    void f0(ColorStateList colorStateList) {
        if (this.f42962d != colorStateList) {
            this.f42962d = colorStateList;
            t.a(this.f42959a, this.f42961c, colorStateList, this.f42963e);
        }
    }

    void g0(PorterDuff.Mode mode) {
        if (this.f42963e != mode) {
            this.f42963e = mode;
            t.a(this.f42959a, this.f42961c, this.f42962d, mode);
        }
    }

    void h() {
        this.f42965g.performClick();
        this.f42965g.jumpDrawablesToCurrentState();
    }

    void i0(int i10) {
        j0(i10 != 0 ? getResources().getText(i10) : null);
    }

    void j0(CharSequence charSequence) {
        this.f42965g.setContentDescription(charSequence);
    }

    CheckableImageButton k() {
        if (G()) {
            return this.f42961c;
        }
        if (A() && F()) {
            return this.f42965g;
        }
        return null;
    }

    void k0(int i10) {
        l0(i10 != 0 ? AbstractC5323a.b(getContext(), i10) : null);
    }

    CharSequence l() {
        return this.f42965g.getContentDescription();
    }

    void l0(Drawable drawable) {
        this.f42965g.setImageDrawable(drawable);
    }

    s m() {
        return this.f42966h.c(this.f42967i);
    }

    void m0(boolean z10) {
        if (z10 && this.f42967i != 1) {
            U(1);
        } else {
            if (z10) {
                return;
            }
            U(0);
        }
    }

    Drawable n() {
        return this.f42965g.getDrawable();
    }

    void n0(ColorStateList colorStateList) {
        this.f42969k = colorStateList;
        t.a(this.f42959a, this.f42965g, colorStateList, this.f42970l);
    }

    int o() {
        return this.f42971m;
    }

    void o0(PorterDuff.Mode mode) {
        this.f42970l = mode;
        t.a(this.f42959a, this.f42965g, this.f42969k, mode);
    }

    int p() {
        return this.f42967i;
    }

    void p0(CharSequence charSequence) {
        this.f42974p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f42975q.setText(charSequence);
        y0();
    }

    ImageView.ScaleType q() {
        return this.f42972n;
    }

    void q0(int i10) {
        androidx.core.widget.i.m(this.f42975q, i10);
    }

    CheckableImageButton r() {
        return this.f42965g;
    }

    void r0(ColorStateList colorStateList) {
        this.f42975q.setTextColor(colorStateList);
    }

    Drawable s() {
        return this.f42961c.getDrawable();
    }

    CharSequence u() {
        return this.f42965g.getContentDescription();
    }

    Drawable v() {
        return this.f42965g.getDrawable();
    }

    CharSequence w() {
        return this.f42974p;
    }

    ColorStateList x() {
        return this.f42975q.getTextColors();
    }

    void x0() {
        if (this.f42959a.f42873e == null) {
            return;
        }
        this.f42975q.setPaddingRelative(getContext().getResources().getDimensionPixelSize(AbstractC5840c.f54699S), this.f42959a.f42873e.getPaddingTop(), (F() || G()) ? 0 : this.f42959a.f42873e.getPaddingEnd(), this.f42959a.f42873e.getPaddingBottom());
    }

    int y() {
        return getPaddingEnd() + this.f42975q.getPaddingEnd() + ((F() || G()) ? this.f42965g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.f42965g.getLayoutParams()).getMarginStart() : 0);
    }

    TextView z() {
        return this.f42975q;
    }
}
