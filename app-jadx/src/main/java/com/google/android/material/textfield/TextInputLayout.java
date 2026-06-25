package com.google.android.material.textfield;

import H9.l;
import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C2657k;
import androidx.appcompat.widget.O;
import androidx.appcompat.widget.h0;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.C2746a;
import androidx.transition.C2938c;
import com.google.android.material.internal.CheckableImageButton;
import i.AbstractC4956a;
import j.AbstractC5323a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o9.AbstractC5838a;
import o9.AbstractC5839b;
import o9.AbstractC5840c;
import o9.AbstractC5842e;
import o9.AbstractC5846i;
import o9.AbstractC5847j;
import o9.AbstractC5848k;
import p9.AbstractC5946a;
import x9.AbstractC7066a;
import y1.AbstractC7194b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: c1 */
    private static final int f42830c1 = AbstractC5847j.f54886o;

    /* JADX INFO: renamed from: d1 */
    private static final int[][] f42831d1 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* JADX INFO: renamed from: A */
    private ColorStateList f42832A;

    /* JADX INFO: renamed from: A0 */
    private final RectF f42833A0;

    /* JADX INFO: renamed from: B */
    private ColorStateList f42834B;

    /* JADX INFO: renamed from: B0 */
    private Typeface f42835B0;

    /* JADX INFO: renamed from: C */
    private ColorStateList f42836C;

    /* JADX INFO: renamed from: C0 */
    private Drawable f42837C0;

    /* JADX INFO: renamed from: D */
    private boolean f42838D;

    /* JADX INFO: renamed from: D0 */
    private int f42839D0;

    /* JADX INFO: renamed from: E */
    private CharSequence f42840E;

    /* JADX INFO: renamed from: E0 */
    private final LinkedHashSet f42841E0;

    /* JADX INFO: renamed from: F */
    private boolean f42842F;

    /* JADX INFO: renamed from: F0 */
    private Drawable f42843F0;

    /* JADX INFO: renamed from: G */
    private H9.h f42844G;

    /* JADX INFO: renamed from: G0 */
    private int f42845G0;

    /* JADX INFO: renamed from: H */
    private H9.h f42846H;

    /* JADX INFO: renamed from: H0 */
    private Drawable f42847H0;

    /* JADX INFO: renamed from: I */
    private StateListDrawable f42848I;

    /* JADX INFO: renamed from: I0 */
    private ColorStateList f42849I0;

    /* JADX INFO: renamed from: J0 */
    private ColorStateList f42850J0;

    /* JADX INFO: renamed from: K0 */
    private int f42851K0;

    /* JADX INFO: renamed from: L0 */
    private int f42852L0;

    /* JADX INFO: renamed from: M0 */
    private int f42853M0;

    /* JADX INFO: renamed from: N0 */
    private ColorStateList f42854N0;

    /* JADX INFO: renamed from: O0 */
    private int f42855O0;

    /* JADX INFO: renamed from: P0 */
    private int f42856P0;

    /* JADX INFO: renamed from: Q0 */
    private int f42857Q0;

    /* JADX INFO: renamed from: R0 */
    private int f42858R0;

    /* JADX INFO: renamed from: S0 */
    private int f42859S0;

    /* JADX INFO: renamed from: T0 */
    int f42860T0;

    /* JADX INFO: renamed from: U0 */
    private boolean f42861U0;

    /* JADX INFO: renamed from: V0 */
    final com.google.android.material.internal.a f42862V0;

    /* JADX INFO: renamed from: W0 */
    private boolean f42863W0;

    /* JADX INFO: renamed from: X0 */
    private boolean f42864X0;

    /* JADX INFO: renamed from: Y0 */
    private ValueAnimator f42865Y0;

    /* JADX INFO: renamed from: Z0 */
    private boolean f42866Z0;

    /* JADX INFO: renamed from: a */
    private final FrameLayout f42867a;

    /* JADX INFO: renamed from: a1 */
    private boolean f42868a1;

    /* JADX INFO: renamed from: b */
    private final z f42869b;

    /* JADX INFO: renamed from: b1 */
    private boolean f42870b1;

    /* JADX INFO: renamed from: c */
    private final r f42871c;

    /* JADX INFO: renamed from: d */
    private final int f42872d;

    /* JADX INFO: renamed from: e */
    EditText f42873e;

    /* JADX INFO: renamed from: f */
    private CharSequence f42874f;

    /* JADX INFO: renamed from: g */
    private int f42875g;

    /* JADX INFO: renamed from: h */
    private int f42876h;

    /* JADX INFO: renamed from: i */
    private int f42877i;

    /* JADX INFO: renamed from: j */
    private int f42878j;

    /* JADX INFO: renamed from: k */
    private final u f42879k;

    /* JADX INFO: renamed from: l */
    boolean f42880l;

    /* JADX INFO: renamed from: l0 */
    private boolean f42881l0;

    /* JADX INFO: renamed from: m */
    private int f42882m;

    /* JADX INFO: renamed from: m0 */
    private H9.h f42883m0;

    /* JADX INFO: renamed from: n */
    private boolean f42884n;

    /* JADX INFO: renamed from: n0 */
    private H9.h f42885n0;

    /* JADX INFO: renamed from: o */
    private f f42886o;

    /* JADX INFO: renamed from: o0 */
    private H9.l f42887o0;

    /* JADX INFO: renamed from: p */
    private TextView f42888p;

    /* JADX INFO: renamed from: p0 */
    private boolean f42889p0;

    /* JADX INFO: renamed from: q */
    private int f42890q;

    /* JADX INFO: renamed from: q0 */
    private final int f42891q0;

    /* JADX INFO: renamed from: r */
    private int f42892r;

    /* JADX INFO: renamed from: r0 */
    private int f42893r0;

    /* JADX INFO: renamed from: s */
    private CharSequence f42894s;

    /* JADX INFO: renamed from: s0 */
    private int f42895s0;

    /* JADX INFO: renamed from: t */
    private boolean f42896t;

    /* JADX INFO: renamed from: t0 */
    private int f42897t0;

    /* JADX INFO: renamed from: u */
    private TextView f42898u;

    /* JADX INFO: renamed from: u0 */
    private int f42899u0;

    /* JADX INFO: renamed from: v */
    private ColorStateList f42900v;

    /* JADX INFO: renamed from: v0 */
    private int f42901v0;

    /* JADX INFO: renamed from: w */
    private int f42902w;

    /* JADX INFO: renamed from: w0 */
    private int f42903w0;

    /* JADX INFO: renamed from: x */
    private C2938c f42904x;

    /* JADX INFO: renamed from: x0 */
    private int f42905x0;

    /* JADX INFO: renamed from: y */
    private C2938c f42906y;

    /* JADX INFO: renamed from: y0 */
    private final Rect f42907y0;

    /* JADX INFO: renamed from: z */
    private ColorStateList f42908z;

    /* JADX INFO: renamed from: z0 */
    private final Rect f42909z0;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends C2746a {
        b() {
        }

        @Override // androidx.core.view.C2746a
        public void g(View view, L1.B b10) {
            super.g(view, b10);
            b10.q1(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f42871c.h();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f42862V0.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class e extends C2746a {

        /* JADX INFO: renamed from: d */
        private final TextInputLayout f42916d;

        public e(TextInputLayout textInputLayout) {
            this.f42916d = textInputLayout;
        }

        @Override // androidx.core.view.C2746a
        public void g(View view, L1.B b10) {
            super.g(view, b10);
            EditText editText = this.f42916d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f42916d.getHint();
            CharSequence error = this.f42916d.getError();
            CharSequence placeholderText = this.f42916d.getPlaceholderText();
            int counterMaxLength = this.f42916d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f42916d.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zQ = this.f42916d.Q();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z10 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            this.f42916d.f42869b.A(b10);
            if (!zIsEmpty) {
                b10.i1(text);
            } else if (!TextUtils.isEmpty(string)) {
                b10.i1(string);
                if (!zQ && placeholderText != null) {
                    b10.i1(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                b10.i1(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    b10.M0(string);
                } else {
                    if (!zIsEmpty) {
                        string = ((Object) text) + ", " + string;
                    }
                    b10.i1(string);
                }
                b10.e1(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            b10.S0(counterMaxLength);
            if (z10) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                b10.I0(error);
            }
            View viewT = this.f42916d.f42879k.t();
            if (viewT != null) {
                b10.O0(viewT);
            }
            this.f42916d.f42871c.m().o(view, b10);
        }

        @Override // androidx.core.view.C2746a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.f42916d.f42871c.m().p(view, accessibilityEvent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface f {
        int a(Editable editable);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface g {
        void a(TextInputLayout textInputLayout);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class h extends Q1.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: c */
        CharSequence f42917c;

        /* JADX INFO: renamed from: d */
        boolean f42918d;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f42917c) + "}";
        }

        @Override // Q1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f42917c, parcel, i10);
            parcel.writeInt(this.f42918d ? 1 : 0);
        }

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f42917c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f42918d = parcel.readInt() == 1;
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5838a.f54605J0);
    }

    private void A(boolean z10) {
        ValueAnimator valueAnimator = this.f42865Y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f42865Y0.cancel();
        }
        if (z10 && this.f42864X0) {
            m(1.0f);
        } else {
            this.f42862V0.j0(1.0f);
        }
        this.f42861U0 = false;
        if (C()) {
            W();
        }
        z0();
        this.f42869b.l(false);
        this.f42871c.H(false);
    }

    public void A0(Editable editable) {
        if (this.f42886o.a(editable) != 0 || this.f42861U0) {
            M();
        } else {
            g0();
        }
    }

    private C2938c B() {
        C2938c c2938c = new C2938c();
        c2938c.l0(C9.d.f(getContext(), AbstractC5838a.f54654p0, 87));
        c2938c.n0(C9.d.g(getContext(), AbstractC5838a.f54664u0, AbstractC5946a.f55826a));
        return c2938c;
    }

    private void B0(boolean z10, boolean z11) {
        int defaultColor = this.f42854N0.getDefaultColor();
        int colorForState = this.f42854N0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f42854N0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.f42903w0 = colorForState2;
        } else if (z11) {
            this.f42903w0 = colorForState;
        } else {
            this.f42903w0 = defaultColor;
        }
    }

    private boolean C() {
        return this.f42838D && !TextUtils.isEmpty(this.f42840E) && (this.f42844G instanceof AbstractC3960h);
    }

    private void D() {
        Iterator it = this.f42841E0.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(this);
        }
    }

    private void E(Canvas canvas) {
        H9.h hVar;
        if (this.f42885n0 == null || (hVar = this.f42883m0) == null) {
            return;
        }
        hVar.draw(canvas);
        if (this.f42873e.isFocused()) {
            Rect bounds = this.f42885n0.getBounds();
            Rect bounds2 = this.f42883m0.getBounds();
            float fB = this.f42862V0.B();
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC5946a.c(iCenterX, bounds2.left, fB);
            bounds.right = AbstractC5946a.c(iCenterX, bounds2.right, fB);
            this.f42885n0.draw(canvas);
        }
    }

    private void F(Canvas canvas) {
        if (this.f42838D) {
            this.f42862V0.k(canvas);
        }
    }

    private void G(boolean z10) {
        ValueAnimator valueAnimator = this.f42865Y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f42865Y0.cancel();
        }
        if (z10 && this.f42864X0) {
            m(0.0f);
        } else {
            this.f42862V0.j0(0.0f);
        }
        if (C() && ((AbstractC3960h) this.f42844G).w0()) {
            z();
        }
        this.f42861U0 = true;
        M();
        this.f42869b.l(true);
        this.f42871c.H(true);
    }

    private H9.h H(boolean z10) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(AbstractC5840c.f54736o0);
        float f10 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f42873e;
        float popupElevation = editText instanceof v ? ((v) editText).getPopupElevation() : getResources().getDimensionPixelOffset(AbstractC5840c.f54681A);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(AbstractC5840c.f54728k0);
        H9.l lVarM = H9.l.a().D(f10).I(f10).u(dimensionPixelOffset).y(dimensionPixelOffset).m();
        EditText editText2 = this.f42873e;
        H9.h hVarR = H9.h.r(getContext(), popupElevation, editText2 instanceof v ? ((v) editText2).getDropDownBackgroundTintList() : null);
        hVarR.setShapeAppearanceModel(lVarM);
        hVarR.g0(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return hVarR;
    }

    private static Drawable I(H9.h hVar, int i10, int i11, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC7066a.j(i11, i10, 0.1f), i10}), hVar, hVar);
    }

    private int J(int i10, boolean z10) {
        return i10 + ((z10 || getPrefixText() == null) ? (!z10 || getSuffixText() == null) ? this.f42873e.getCompoundPaddingLeft() : this.f42871c.y() : this.f42869b.c());
    }

    private int K(int i10, boolean z10) {
        return i10 - ((z10 || getSuffixText() == null) ? (!z10 || getPrefixText() == null) ? this.f42873e.getCompoundPaddingRight() : this.f42869b.c() : this.f42871c.y());
    }

    private static Drawable L(Context context, H9.h hVar, int i10, int[][] iArr) {
        int iC = AbstractC7066a.c(context, AbstractC5838a.f54604J, "TextInputLayout");
        H9.h hVar2 = new H9.h(hVar.H());
        int iJ = AbstractC7066a.j(i10, iC, 0.1f);
        hVar2.d0(new ColorStateList(iArr, new int[]{iJ, 0}));
        hVar2.setTint(iC);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iJ, iC});
        H9.h hVar3 = new H9.h(hVar.H());
        hVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, hVar2, hVar3), hVar});
    }

    private void M() {
        TextView textView = this.f42898u;
        if (textView == null || !this.f42896t) {
            return;
        }
        textView.setText((CharSequence) null);
        androidx.transition.t.a(this.f42867a, this.f42906y);
        this.f42898u.setVisibility(4);
    }

    private boolean R() {
        return getHintMaxLines() == 1;
    }

    private boolean S() {
        if (d0()) {
            return true;
        }
        return this.f42888p != null && this.f42884n;
    }

    private boolean U() {
        return this.f42893r0 == 1 && this.f42873e.getMinLines() <= 1;
    }

    private void V() {
        q();
        s0();
        C0();
        h0();
        l();
        if (this.f42893r0 != 0) {
            v0();
        }
        b0();
    }

    private void W() {
        if (C()) {
            RectF rectF = this.f42833A0;
            this.f42862V0.o(rectF, this.f42873e.getWidth(), this.f42873e.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            p(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f42897t0);
            rectF.top = 0.0f;
            ((AbstractC3960h) this.f42844G).z0(rectF);
        }
    }

    private void X() {
        if (!C() || this.f42861U0) {
            return;
        }
        z();
        W();
    }

    private static void Y(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                Y((ViewGroup) childAt, z10);
            }
        }
    }

    private void a0() {
        TextView textView = this.f42898u;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void b0() {
        EditText editText = this.f42873e;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i10 = this.f42893r0;
                if (i10 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i10 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public static /* synthetic */ int c(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    private boolean e0() {
        return (this.f42871c.G() || ((this.f42871c.A() && N()) || this.f42871c.w() != null)) && this.f42871c.getMeasuredWidth() > 0;
    }

    private boolean f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f42869b.getMeasuredWidth() > 0;
    }

    private void g0() {
        if (this.f42898u == null || !this.f42896t || TextUtils.isEmpty(this.f42894s)) {
            return;
        }
        this.f42898u.setText(this.f42894s);
        androidx.transition.t.a(this.f42867a, this.f42904x);
        this.f42898u.setVisibility(0);
        this.f42898u.bringToFront();
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f42873e;
        if (!(editText instanceof AutoCompleteTextView) || q.a(editText)) {
            return this.f42844G;
        }
        int iD = AbstractC7066a.d(this.f42873e, AbstractC4956a.f47973t);
        int i10 = this.f42893r0;
        if (i10 == 2) {
            return L(getContext(), this.f42844G, iD, f42831d1);
        }
        if (i10 == 1) {
            return I(this.f42844G, this.f42905x0, iD, f42831d1);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f42848I == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f42848I = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f42848I.addState(new int[0], H(false));
        }
        return this.f42848I;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f42846H == null) {
            this.f42846H = H(true);
        }
        return this.f42846H;
    }

    private void h0() {
        if (this.f42893r0 == 1) {
            if (E9.c.l(getContext())) {
                this.f42895s0 = getResources().getDimensionPixelSize(AbstractC5840c.f54695O);
            } else if (E9.c.k(getContext())) {
                this.f42895s0 = getResources().getDimensionPixelSize(AbstractC5840c.f54694N);
            }
        }
    }

    private void i0(Rect rect) {
        H9.h hVar = this.f42883m0;
        if (hVar != null) {
            int i10 = rect.bottom;
            hVar.setBounds(rect.left, i10 - this.f42899u0, rect.right, i10);
        }
        H9.h hVar2 = this.f42885n0;
        if (hVar2 != null) {
            int i11 = rect.bottom;
            hVar2.setBounds(rect.left, i11 - this.f42901v0, rect.right, i11);
        }
    }

    private void j0(int i10) {
        this.f42862V0.s0(i10);
        Rect rect = this.f42907y0;
        com.google.android.material.internal.b.a(this, this.f42873e, rect);
        this.f42862V0.S(s(rect));
        v0();
        l();
        t0(i10);
    }

    private void k() {
        TextView textView = this.f42898u;
        if (textView != null) {
            this.f42867a.addView(textView);
            this.f42898u.setVisibility(0);
        }
    }

    private void k0() {
        if (this.f42888p != null) {
            EditText editText = this.f42873e;
            l0(editText == null ? null : editText.getText());
        }
    }

    private void l() {
        if (this.f42873e == null || this.f42893r0 != 1) {
            return;
        }
        if (!R()) {
            EditText editText = this.f42873e;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.f42862V0.q() + this.f42872d), this.f42873e.getPaddingEnd(), getResources().getDimensionPixelSize(AbstractC5840c.f54690J));
        } else if (E9.c.l(getContext())) {
            EditText editText2 = this.f42873e;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(AbstractC5840c.f54693M), this.f42873e.getPaddingEnd(), getResources().getDimensionPixelSize(AbstractC5840c.f54692L));
        } else if (E9.c.k(getContext())) {
            EditText editText3 = this.f42873e;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(AbstractC5840c.f54691K), this.f42873e.getPaddingEnd(), getResources().getDimensionPixelSize(AbstractC5840c.f54690J));
        }
    }

    private static void m0(Context context, TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? AbstractC5846i.f54845c : AbstractC5846i.f54844b, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private void n() {
        H9.h hVar = this.f42844G;
        if (hVar == null) {
            return;
        }
        H9.l lVarH = hVar.H();
        H9.l lVar = this.f42887o0;
        if (lVarH != lVar) {
            this.f42844G.setShapeAppearanceModel(lVar);
        }
        if (x()) {
            this.f42844G.j0(this.f42897t0, this.f42903w0);
        }
        int iR = r();
        this.f42905x0 = iR;
        this.f42844G.d0(ColorStateList.valueOf(iR));
        o();
        s0();
    }

    private void n0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f42888p;
        if (textView != null) {
            c0(textView, this.f42884n ? this.f42890q : this.f42892r);
            if (!this.f42884n && (colorStateList2 = this.f42908z) != null) {
                this.f42888p.setTextColor(colorStateList2);
            }
            if (!this.f42884n || (colorStateList = this.f42832A) == null) {
                return;
            }
            this.f42888p.setTextColor(colorStateList);
        }
    }

    private void o() {
        if (this.f42883m0 == null || this.f42885n0 == null) {
            return;
        }
        if (y()) {
            this.f42883m0.d0(this.f42873e.isFocused() ? ColorStateList.valueOf(this.f42851K0) : ColorStateList.valueOf(this.f42903w0));
            this.f42885n0.d0(ColorStateList.valueOf(this.f42903w0));
        }
        invalidate();
    }

    private void o0() {
        ColorStateList colorStateList;
        ColorStateList colorStateListG = this.f42834B;
        if (colorStateListG == null) {
            colorStateListG = AbstractC7066a.g(getContext(), AbstractC4956a.f47972s);
        }
        EditText editText = this.f42873e;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = B1.a.r(this.f42873e.getTextCursorDrawable()).mutate();
        if (S() && (colorStateList = this.f42836C) != null) {
            colorStateListG = colorStateList;
        }
        drawableMutate.setTintList(colorStateListG);
    }

    private void p(RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.f42891q0;
        rectF.left = f10 - i10;
        rectF.right += i10;
    }

    private void q() {
        int i10 = this.f42893r0;
        if (i10 == 0) {
            this.f42844G = null;
            this.f42883m0 = null;
            this.f42885n0 = null;
            return;
        }
        if (i10 == 1) {
            this.f42844G = new H9.h(this.f42887o0);
            this.f42883m0 = new H9.h();
            this.f42885n0 = new H9.h();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(this.f42893r0 + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f42838D || (this.f42844G instanceof AbstractC3960h)) {
                this.f42844G = new H9.h(this.f42887o0);
            } else {
                this.f42844G = AbstractC3960h.u0(this.f42887o0);
            }
            this.f42883m0 = null;
            this.f42885n0 = null;
        }
    }

    private int r() {
        return this.f42893r0 == 1 ? AbstractC7066a.i(AbstractC7066a.e(this, AbstractC5838a.f54604J, 0), this.f42905x0) : this.f42905x0;
    }

    private void r0() {
        this.f42873e.setBackground(getEditTextBoxBackground());
    }

    private Rect s(Rect rect) {
        if (this.f42873e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f42909z0;
        boolean zG = com.google.android.material.internal.p.g(this);
        rect2.bottom = rect.bottom;
        int i10 = this.f42893r0;
        if (i10 == 1) {
            rect2.left = J(rect.left, zG);
            rect2.top = rect.top + this.f42895s0;
            rect2.right = K(rect.right, zG);
            return rect2;
        }
        if (i10 != 2) {
            rect2.left = J(rect.left, zG);
            rect2.top = getPaddingTop();
            rect2.right = K(rect.right, zG);
            return rect2;
        }
        rect2.left = rect.left + this.f42873e.getPaddingLeft();
        rect2.top = rect.top - w();
        rect2.right = rect.right - this.f42873e.getPaddingRight();
        return rect2;
    }

    private void setEditText(EditText editText) {
        if (this.f42873e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f42873e = editText;
        int i10 = this.f42875g;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f42877i);
        }
        int i11 = this.f42876h;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f42878j);
        }
        this.f42881l0 = false;
        V();
        setTextInputAccessibilityDelegate(new e(this));
        this.f42862V0.p0(this.f42873e.getTypeface());
        this.f42862V0.h0(this.f42873e.getTextSize());
        this.f42862V0.d0(this.f42873e.getLetterSpacing());
        int gravity = this.f42873e.getGravity();
        this.f42862V0.X((gravity & (-113)) | 48);
        this.f42862V0.g0(gravity);
        this.f42860T0 = editText.getMinimumHeight();
        this.f42873e.addTextChangedListener(new a(editText));
        if (this.f42849I0 == null) {
            this.f42849I0 = this.f42873e.getHintTextColors();
        }
        if (this.f42838D) {
            if (TextUtils.isEmpty(this.f42840E)) {
                CharSequence hint = this.f42873e.getHint();
                this.f42874f = hint;
                setHint(hint);
                this.f42873e.setHint((CharSequence) null);
            }
            this.f42842F = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            o0();
        }
        if (this.f42888p != null) {
            l0(this.f42873e.getText());
        }
        q0();
        this.f42879k.f();
        this.f42869b.bringToFront();
        this.f42871c.bringToFront();
        D();
        this.f42871c.x0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        x0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f42840E)) {
            return;
        }
        this.f42840E = charSequence;
        this.f42862V0.n0(charSequence);
        if (this.f42861U0) {
            return;
        }
        W();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f42896t == z10) {
            return;
        }
        if (z10) {
            k();
        } else {
            a0();
            this.f42898u = null;
        }
        this.f42896t = z10;
    }

    private int t(Rect rect, Rect rect2, float f10) {
        return U() ? (int) (rect2.top + f10) : rect.bottom - this.f42873e.getCompoundPaddingBottom();
    }

    private void t0(int i10) {
        if (this.f42873e == null) {
            return;
        }
        float fZ = this.f42862V0.z();
        if (this.f42894s != null) {
            TextPaint textPaint = new TextPaint(129);
            textPaint.set(this.f42898u.getPaint());
            textPaint.setTextSize(this.f42898u.getTextSize());
            textPaint.setTypeface(this.f42898u.getTypeface());
            textPaint.setLetterSpacing(this.f42898u.getLetterSpacing());
            fQ = (this.f42893r0 == 1 ? this.f42872d + this.f42862V0.q() + this.f42895s0 : 0.0f) + com.google.android.material.internal.h.b(this.f42894s, textPaint, i10).g(getLayoutDirection() == 1).f(true).h(this.f42898u.getLineSpacingExtra(), this.f42898u.getLineSpacingMultiplier()).j(new com.google.android.material.internal.i() { // from class: com.google.android.material.textfield.J
                @Override // com.google.android.material.internal.i
                public final void a(StaticLayout.Builder builder) {
                    builder.setBreakStrategy(this.f42827a.f42898u.getBreakStrategy());
                }
            }).a().getHeight();
        }
        float fMax = Math.max(fZ, fQ);
        if (this.f42873e.getMeasuredHeight() < fMax) {
            this.f42873e.setMinimumHeight(Math.round(fMax));
        }
    }

    private int u(Rect rect, float f10) {
        if (U()) {
            return (int) (rect.centerY() - (f10 / 2.0f));
        }
        return (rect.top + this.f42873e.getCompoundPaddingTop()) - ((this.f42893r0 != 0 || R()) ? 0 : (int) (this.f42862V0.A() / 2.0f));
    }

    private boolean u0() {
        int iMax;
        if (this.f42873e == null || this.f42873e.getMeasuredHeight() >= (iMax = Math.max(this.f42871c.getMeasuredHeight(), this.f42869b.getMeasuredHeight()))) {
            return false;
        }
        this.f42873e.setMinimumHeight(iMax);
        return true;
    }

    private Rect v(Rect rect) {
        if (this.f42873e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f42909z0;
        float fA = R() ? this.f42862V0.A() : this.f42862V0.y() * this.f42862V0.w();
        rect2.left = rect.left + this.f42873e.getCompoundPaddingLeft();
        rect2.top = u(rect, fA);
        rect2.right = rect.right - this.f42873e.getCompoundPaddingRight();
        rect2.bottom = t(rect, rect2, fA);
        return rect2;
    }

    private void v0() {
        if (this.f42893r0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f42867a.getLayoutParams();
            int iW = w();
            if (iW != layoutParams.topMargin) {
                layoutParams.topMargin = iW;
                this.f42867a.requestLayout();
            }
        }
    }

    private int w() {
        if (!this.f42838D) {
            return 0;
        }
        int i10 = this.f42893r0;
        if (i10 == 0) {
            return (int) this.f42862V0.q();
        }
        if (i10 != 2) {
            return 0;
        }
        return R() ? (int) (this.f42862V0.q() / 2.0f) : Math.max(0, (int) (this.f42862V0.q() - (this.f42862V0.n() / 2.0f)));
    }

    private boolean x() {
        return this.f42893r0 == 2 && y();
    }

    private void x0(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f42873e;
        boolean z12 = false;
        boolean z13 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f42873e;
        if (editText2 != null && editText2.hasFocus()) {
            z12 = true;
        }
        ColorStateList colorStateList2 = this.f42849I0;
        if (colorStateList2 != null) {
            this.f42862V0.Q(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f42849I0;
            this.f42862V0.Q(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f42859S0) : this.f42859S0));
        } else if (d0()) {
            this.f42862V0.Q(this.f42879k.r());
        } else if (this.f42884n && (textView = this.f42888p) != null) {
            this.f42862V0.Q(textView.getTextColors());
        } else if (z12 && (colorStateList = this.f42850J0) != null) {
            this.f42862V0.W(colorStateList);
        }
        if (z13 || !this.f42863W0 || (isEnabled() && z12)) {
            if (z11 || this.f42861U0) {
                A(z10);
                return;
            }
            return;
        }
        if (z11 || !this.f42861U0) {
            G(z10);
        }
    }

    private boolean y() {
        return this.f42897t0 > -1 && this.f42903w0 != 0;
    }

    private void y0() {
        EditText editText;
        if (this.f42898u == null || (editText = this.f42873e) == null) {
            return;
        }
        this.f42898u.setGravity(editText.getGravity());
        this.f42898u.setPadding(this.f42873e.getCompoundPaddingLeft(), this.f42873e.getCompoundPaddingTop(), this.f42873e.getCompoundPaddingRight(), this.f42873e.getCompoundPaddingBottom());
    }

    private void z() {
        if (C()) {
            ((AbstractC3960h) this.f42844G).x0();
        }
    }

    private void z0() {
        EditText editText = this.f42873e;
        A0(editText == null ? null : editText.getText());
    }

    void C0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f42844G == null || this.f42893r0 == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.f42873e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f42873e) != null && editText.isHovered())) {
            z10 = true;
        }
        if (!isEnabled()) {
            this.f42903w0 = this.f42859S0;
        } else if (d0()) {
            if (this.f42854N0 != null) {
                B0(z11, z10);
            } else {
                this.f42903w0 = getErrorCurrentTextColors();
            }
        } else if (!this.f42884n || (textView = this.f42888p) == null) {
            if (z11) {
                this.f42903w0 = this.f42853M0;
            } else if (z10) {
                this.f42903w0 = this.f42852L0;
            } else {
                this.f42903w0 = this.f42851K0;
            }
        } else if (this.f42854N0 != null) {
            B0(z11, z10);
        } else {
            this.f42903w0 = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            o0();
        }
        this.f42871c.I();
        Z();
        if (this.f42893r0 == 2) {
            int i10 = this.f42897t0;
            if (z11 && isEnabled()) {
                this.f42897t0 = this.f42901v0;
            } else {
                this.f42897t0 = this.f42899u0;
            }
            if (this.f42897t0 != i10) {
                X();
            }
        }
        if (this.f42893r0 == 1) {
            if (!isEnabled()) {
                this.f42905x0 = this.f42856P0;
            } else if (z10 && !z11) {
                this.f42905x0 = this.f42858R0;
            } else if (z11) {
                this.f42905x0 = this.f42857Q0;
            } else {
                this.f42905x0 = this.f42855O0;
            }
        }
        n();
    }

    public boolean N() {
        return this.f42871c.F();
    }

    public boolean O() {
        return this.f42879k.A();
    }

    public boolean P() {
        return this.f42879k.B();
    }

    final boolean Q() {
        return this.f42861U0;
    }

    public boolean T() {
        return this.f42842F;
    }

    public void Z() {
        this.f42869b.m();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f42867a.addView(view, layoutParams2);
        this.f42867a.setLayoutParams(layoutParams);
        v0();
        setEditText((EditText) view);
    }

    void c0(TextView textView, int i10) {
        try {
            androidx.core.widget.i.m(textView, i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        androidx.core.widget.i.m(textView, i.i.f48125b);
        textView.setTextColor(AbstractC7194b.c(getContext(), AbstractC5839b.f54675a));
    }

    boolean d0() {
        return this.f42879k.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f42873e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f42874f != null) {
            boolean z10 = this.f42842F;
            this.f42842F = false;
            CharSequence hint = editText.getHint();
            this.f42873e.setHint(this.f42874f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f42873e.setHint(hint);
                this.f42842F = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f42867a.getChildCount());
        for (int i11 = 0; i11 < this.f42867a.getChildCount(); i11++) {
            View childAt = this.f42867a.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f42873e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f42868a1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f42868a1 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        F(canvas);
        E(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f42866Z0) {
            return;
        }
        this.f42866Z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.a aVar = this.f42862V0;
        boolean zM0 = aVar != null ? aVar.m0(drawableState) : false;
        if (this.f42873e != null) {
            w0(isLaidOut() && isEnabled());
        }
        q0();
        C0();
        if (zM0) {
            invalidate();
        }
        this.f42866Z0 = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f42873e;
        return editText != null ? editText.getBaseline() + getPaddingTop() + w() : super.getBaseline();
    }

    H9.h getBoxBackground() {
        int i10 = this.f42893r0;
        if (i10 == 1 || i10 == 2) {
            return this.f42844G;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f42905x0;
    }

    public int getBoxBackgroundMode() {
        return this.f42893r0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f42895s0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return com.google.android.material.internal.p.g(this) ? this.f42887o0.j().a(this.f42833A0) : this.f42887o0.l().a(this.f42833A0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return com.google.android.material.internal.p.g(this) ? this.f42887o0.l().a(this.f42833A0) : this.f42887o0.j().a(this.f42833A0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return com.google.android.material.internal.p.g(this) ? this.f42887o0.r().a(this.f42833A0) : this.f42887o0.t().a(this.f42833A0);
    }

    public float getBoxCornerRadiusTopStart() {
        return com.google.android.material.internal.p.g(this) ? this.f42887o0.t().a(this.f42833A0) : this.f42887o0.r().a(this.f42833A0);
    }

    public int getBoxStrokeColor() {
        return this.f42853M0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f42854N0;
    }

    public int getBoxStrokeWidth() {
        return this.f42899u0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f42901v0;
    }

    public int getCounterMaxLength() {
        return this.f42882m;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f42880l && this.f42884n && (textView = this.f42888p) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f42832A;
    }

    public ColorStateList getCounterTextColor() {
        return this.f42908z;
    }

    public ColorStateList getCursorColor() {
        return this.f42834B;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f42836C;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f42849I0;
    }

    public EditText getEditText() {
        return this.f42873e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f42871c.l();
    }

    public Drawable getEndIconDrawable() {
        return this.f42871c.n();
    }

    public int getEndIconMinSize() {
        return this.f42871c.o();
    }

    public int getEndIconMode() {
        return this.f42871c.p();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f42871c.q();
    }

    CheckableImageButton getEndIconView() {
        return this.f42871c.r();
    }

    public CharSequence getError() {
        if (this.f42879k.A()) {
            return this.f42879k.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f42879k.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f42879k.o();
    }

    public int getErrorCurrentTextColors() {
        return this.f42879k.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f42871c.s();
    }

    public CharSequence getHelperText() {
        if (this.f42879k.B()) {
            return this.f42879k.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f42879k.u();
    }

    public CharSequence getHint() {
        if (this.f42838D) {
            return this.f42840E;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f42862V0.q();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f42862V0.t();
    }

    public int getHintMaxLines() {
        return this.f42862V0.x();
    }

    public ColorStateList getHintTextColor() {
        return this.f42850J0;
    }

    public f getLengthCounter() {
        return this.f42886o;
    }

    public int getMaxEms() {
        return this.f42876h;
    }

    public int getMaxWidth() {
        return this.f42878j;
    }

    public int getMinEms() {
        return this.f42875g;
    }

    public int getMinWidth() {
        return this.f42877i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f42871c.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f42871c.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.f42896t) {
            return this.f42894s;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f42902w;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f42900v;
    }

    public CharSequence getPrefixText() {
        return this.f42869b.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f42869b.b();
    }

    public TextView getPrefixTextView() {
        return this.f42869b.d();
    }

    public H9.l getShapeAppearanceModel() {
        return this.f42887o0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f42869b.e();
    }

    public Drawable getStartIconDrawable() {
        return this.f42869b.f();
    }

    public int getStartIconMinSize() {
        return this.f42869b.g();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f42869b.h();
    }

    public CharSequence getSuffixText() {
        return this.f42871c.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f42871c.x();
    }

    public TextView getSuffixTextView() {
        return this.f42871c.z();
    }

    public Typeface getTypeface() {
        return this.f42835B0;
    }

    public void j(g gVar) {
        this.f42841E0.add(gVar);
        if (this.f42873e != null) {
            gVar.a(this);
        }
    }

    void l0(Editable editable) {
        int iA = this.f42886o.a(editable);
        boolean z10 = this.f42884n;
        int i10 = this.f42882m;
        if (i10 == -1) {
            this.f42888p.setText(String.valueOf(iA));
            this.f42888p.setContentDescription(null);
            this.f42884n = false;
        } else {
            this.f42884n = iA > i10;
            m0(getContext(), this.f42888p, iA, this.f42882m, this.f42884n);
            if (z10 != this.f42884n) {
                n0();
            }
            this.f42888p.setText(J1.a.c().j(getContext().getString(AbstractC5846i.f54846d, Integer.valueOf(iA), Integer.valueOf(this.f42882m))));
        }
        if (this.f42873e == null || z10 == this.f42884n) {
            return;
        }
        w0(false);
        C0();
        q0();
    }

    void m(float f10) {
        if (this.f42862V0.B() == f10) {
            return;
        }
        if (this.f42865Y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f42865Y0 = valueAnimator;
            valueAnimator.setInterpolator(C9.d.g(getContext(), AbstractC5838a.f54662t0, AbstractC5946a.f55827b));
            this.f42865Y0.setDuration(C9.d.f(getContext(), AbstractC5838a.f54652o0, 167));
            this.f42865Y0.addUpdateListener(new d());
        }
        this.f42865Y0.setFloatValues(this.f42862V0.B(), f10);
        this.f42865Y0.start();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f42862V0.L(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f42871c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f42870b1 = false;
        boolean zU0 = u0();
        boolean zP0 = p0();
        if (zU0 || zP0) {
            this.f42873e.post(new Runnable() { // from class: com.google.android.material.textfield.H
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42826a.f42873e.requestLayout();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f42873e;
        if (editText != null) {
            Rect rect = this.f42907y0;
            com.google.android.material.internal.b.a(this, editText, rect);
            i0(rect);
            if (this.f42838D) {
                this.f42862V0.h0(this.f42873e.getTextSize());
                int gravity = this.f42873e.getGravity();
                this.f42862V0.X((gravity & (-113)) | 48);
                this.f42862V0.g0(gravity);
                this.f42862V0.S(s(rect));
                this.f42862V0.c0(v(rect));
                this.f42862V0.N();
                if (!C() || this.f42861U0) {
                    return;
                }
                W();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f42870b1) {
            this.f42871c.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f42870b1 = true;
        }
        y0();
        this.f42871c.x0();
        if (R()) {
            return;
        }
        j0((this.f42873e.getMeasuredWidth() - this.f42873e.getCompoundPaddingLeft()) - this.f42873e.getCompoundPaddingRight());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        setError(hVar.f42917c);
        if (hVar.f42918d) {
            post(new c());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = i10 == 1;
        if (z10 != this.f42889p0) {
            float fA = this.f42887o0.r().a(this.f42833A0);
            float fA2 = this.f42887o0.t().a(this.f42833A0);
            H9.l lVarM = H9.l.a().C(this.f42887o0.s()).H(this.f42887o0.q()).t(this.f42887o0.k()).x(this.f42887o0.i()).D(fA2).I(fA).u(this.f42887o0.l().a(this.f42833A0)).y(this.f42887o0.j().a(this.f42833A0)).m();
            this.f42889p0 = z10;
            setShapeAppearanceModel(lVarM);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (d0()) {
            hVar.f42917c = getError();
        }
        hVar.f42918d = this.f42871c.E();
        return hVar;
    }

    boolean p0() {
        boolean z10;
        if (this.f42873e == null) {
            return false;
        }
        boolean z11 = true;
        if (f0()) {
            int measuredWidth = this.f42869b.getMeasuredWidth() - this.f42873e.getPaddingLeft();
            if (this.f42837C0 == null || this.f42839D0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f42837C0 = colorDrawable;
                this.f42839D0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.f42873e.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.f42837C0;
            if (drawable != drawable2) {
                this.f42873e.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z10 = true;
            }
            z10 = false;
        } else {
            if (this.f42837C0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.f42873e.getCompoundDrawablesRelative();
                this.f42873e.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f42837C0 = null;
                z10 = true;
            }
            z10 = false;
        }
        if (e0()) {
            int measuredWidth2 = this.f42871c.z().getMeasuredWidth() - this.f42873e.getPaddingRight();
            CheckableImageButton checkableImageButtonK = this.f42871c.k();
            if (checkableImageButtonK != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButtonK.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) checkableImageButtonK.getLayoutParams()).getMarginStart();
            }
            Drawable[] compoundDrawablesRelative3 = this.f42873e.getCompoundDrawablesRelative();
            Drawable drawable3 = this.f42843F0;
            if (drawable3 != null && this.f42845G0 != measuredWidth2) {
                this.f42845G0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f42873e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f42843F0, compoundDrawablesRelative3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.f42843F0 = colorDrawable2;
                this.f42845G0 = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = compoundDrawablesRelative3[2];
            Drawable drawable5 = this.f42843F0;
            if (drawable4 != drawable5) {
                this.f42847H0 = drawable4;
                this.f42873e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.f42843F0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f42873e.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.f42843F0) {
                this.f42873e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f42847H0, compoundDrawablesRelative4[3]);
            } else {
                z11 = z10;
            }
            this.f42843F0 = null;
            return z11;
        }
        return z10;
    }

    void q0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f42873e;
        if (editText == null || this.f42893r0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (O.a(background)) {
            background = background.mutate();
        }
        if (d0()) {
            background.setColorFilter(C2657k.e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f42884n && (textView = this.f42888p) != null) {
            background.setColorFilter(C2657k.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            B1.a.c(background);
            this.f42873e.refreshDrawableState();
        }
    }

    void s0() {
        EditText editText = this.f42873e;
        if (editText == null || this.f42844G == null) {
            return;
        }
        if ((this.f42881l0 || editText.getBackground() == null) && this.f42893r0 != 0) {
            r0();
            this.f42881l0 = true;
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f42905x0 != i10) {
            this.f42905x0 = i10;
            this.f42855O0 = i10;
            this.f42857Q0 = i10;
            this.f42858R0 = i10;
            n();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(AbstractC7194b.c(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f42855O0 = defaultColor;
        this.f42905x0 = defaultColor;
        this.f42856P0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f42857Q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f42858R0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        n();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f42893r0) {
            return;
        }
        this.f42893r0 = i10;
        if (this.f42873e != null) {
            V();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f42895s0 = i10;
    }

    public void setBoxCornerFamily(int i10) {
        this.f42887o0 = this.f42887o0.w().B(i10, this.f42887o0.r()).G(i10, this.f42887o0.t()).s(i10, this.f42887o0.j()).w(i10, this.f42887o0.l()).m();
        n();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f42853M0 != i10) {
            this.f42853M0 = i10;
            C0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f42851K0 = colorStateList.getDefaultColor();
            this.f42859S0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f42852L0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f42853M0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f42853M0 != colorStateList.getDefaultColor()) {
            this.f42853M0 = colorStateList.getDefaultColor();
        }
        C0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f42854N0 != colorStateList) {
            this.f42854N0 = colorStateList;
            C0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f42899u0 = i10;
        C0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f42901v0 = i10;
        C0();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f42880l != z10) {
            if (z10) {
                androidx.appcompat.widget.D d10 = new androidx.appcompat.widget.D(getContext());
                this.f42888p = d10;
                d10.setId(AbstractC5842e.f54781S);
                Typeface typeface = this.f42835B0;
                if (typeface != null) {
                    this.f42888p.setTypeface(typeface);
                }
                this.f42888p.setMaxLines(1);
                this.f42879k.e(this.f42888p, 2);
                ((ViewGroup.MarginLayoutParams) this.f42888p.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(AbstractC5840c.f54746t0));
                n0();
                k0();
            } else {
                this.f42879k.C(this.f42888p, 2);
                this.f42888p = null;
            }
            this.f42880l = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f42882m != i10) {
            if (i10 > 0) {
                this.f42882m = i10;
            } else {
                this.f42882m = -1;
            }
            if (this.f42880l) {
                k0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f42890q != i10) {
            this.f42890q = i10;
            n0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f42832A != colorStateList) {
            this.f42832A = colorStateList;
            n0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f42892r != i10) {
            this.f42892r = i10;
            n0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f42908z != colorStateList) {
            this.f42908z = colorStateList;
            n0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f42834B != colorStateList) {
            this.f42834B = colorStateList;
            o0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f42836C != colorStateList) {
            this.f42836C = colorStateList;
            if (S()) {
                o0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f42849I0 = colorStateList;
        this.f42850J0 = colorStateList;
        if (this.f42873e != null) {
            w0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        Y(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f42871c.N(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f42871c.O(z10);
    }

    public void setEndIconContentDescription(int i10) {
        this.f42871c.P(i10);
    }

    public void setEndIconDrawable(int i10) {
        this.f42871c.R(i10);
    }

    public void setEndIconMinSize(int i10) {
        this.f42871c.T(i10);
    }

    public void setEndIconMode(int i10) {
        this.f42871c.U(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f42871c.V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f42871c.W(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.f42871c.X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f42871c.Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f42871c.Z(mode);
    }

    public void setEndIconVisible(boolean z10) {
        this.f42871c.a0(z10);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f42879k.A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f42879k.w();
        } else {
            this.f42879k.Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        this.f42879k.E(i10);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f42879k.F(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.f42879k.G(z10);
    }

    public void setErrorIconDrawable(int i10) {
        this.f42871c.b0(i10);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f42871c.d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f42871c.e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f42871c.f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f42871c.g0(mode);
    }

    public void setErrorTextAppearance(int i10) {
        this.f42879k.H(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f42879k.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f42863W0 != z10) {
            this.f42863W0 = z10;
            w0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (P()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!P()) {
                setHelperTextEnabled(true);
            }
            this.f42879k.R(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f42879k.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f42879k.K(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.f42879k.J(i10);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f42838D) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f42864X0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.f42838D) {
            this.f42838D = z10;
            if (z10) {
                CharSequence hint = this.f42873e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f42840E)) {
                        setHint(hint);
                    }
                    this.f42873e.setHint((CharSequence) null);
                }
                this.f42842F = true;
            } else {
                this.f42842F = false;
                if (!TextUtils.isEmpty(this.f42840E) && TextUtils.isEmpty(this.f42873e.getHint())) {
                    this.f42873e.setHint(this.f42840E);
                }
                setHintInternal(null);
            }
            if (this.f42873e != null) {
                v0();
            }
        }
    }

    public void setHintMaxLines(int i10) {
        this.f42862V0.T(i10);
        this.f42862V0.e0(i10);
        requestLayout();
    }

    public void setHintTextAppearance(int i10) {
        this.f42862V0.U(i10);
        this.f42850J0 = this.f42862V0.p();
        if (this.f42873e != null) {
            w0(false);
            v0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f42850J0 != colorStateList) {
            if (this.f42849I0 == null) {
                this.f42862V0.W(colorStateList);
            }
            this.f42850J0 = colorStateList;
            if (this.f42873e != null) {
                w0(false);
            }
        }
    }

    public void setLengthCounter(f fVar) {
        this.f42886o = fVar;
    }

    public void setMaxEms(int i10) {
        this.f42876h = i10;
        EditText editText = this.f42873e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.f42878j = i10;
        EditText editText = this.f42873e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f42875g = i10;
        EditText editText = this.f42873e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.f42877i = i10;
        EditText editText = this.f42873e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        this.f42871c.i0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        this.f42871c.k0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        this.f42871c.m0(z10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f42871c.n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f42871c.o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f42898u == null) {
            androidx.appcompat.widget.D d10 = new androidx.appcompat.widget.D(getContext());
            this.f42898u = d10;
            d10.setId(AbstractC5842e.f54784V);
            this.f42898u.setImportantForAccessibility(1);
            this.f42898u.setAccessibilityLiveRegion(1);
            C2938c c2938cB = B();
            this.f42904x = c2938cB;
            c2938cB.q0(67L);
            this.f42906y = B();
            setPlaceholderTextAppearance(this.f42902w);
            setPlaceholderTextColor(this.f42900v);
            AbstractC2747a0.k0(this.f42898u, new b());
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f42896t) {
                setPlaceholderTextEnabled(true);
            }
            this.f42894s = charSequence;
        }
        z0();
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f42902w = i10;
        TextView textView = this.f42898u;
        if (textView != null) {
            androidx.core.widget.i.m(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f42900v != colorStateList) {
            this.f42900v = colorStateList;
            TextView textView = this.f42898u;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f42869b.n(charSequence);
    }

    public void setPrefixTextAppearance(int i10) {
        this.f42869b.o(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f42869b.p(colorStateList);
    }

    public void setShapeAppearanceModel(H9.l lVar) {
        H9.h hVar = this.f42844G;
        if (hVar == null || hVar.H() == lVar) {
            return;
        }
        this.f42887o0 = lVar;
        n();
    }

    public void setStartIconCheckable(boolean z10) {
        this.f42869b.q(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? AbstractC5323a.b(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        this.f42869b.t(i10);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f42869b.u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f42869b.v(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.f42869b.w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f42869b.x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f42869b.y(mode);
    }

    public void setStartIconVisible(boolean z10) {
        this.f42869b.z(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f42871c.p0(charSequence);
    }

    public void setSuffixTextAppearance(int i10) {
        this.f42871c.q0(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f42871c.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f42873e;
        if (editText != null) {
            AbstractC2747a0.k0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f42835B0) {
            this.f42835B0 = typeface;
            this.f42862V0.p0(typeface);
            this.f42879k.N(typeface);
            TextView textView = this.f42888p;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    void w0(boolean z10) {
        x0(z10, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f42830c1;
        super(K9.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f42875g = -1;
        this.f42876h = -1;
        this.f42877i = -1;
        this.f42878j = -1;
        this.f42879k = new u(this);
        this.f42886o = new f() { // from class: com.google.android.material.textfield.I
            @Override // com.google.android.material.textfield.TextInputLayout.f
            public final int a(Editable editable) {
                return TextInputLayout.c(editable);
            }
        };
        this.f42907y0 = new Rect();
        this.f42909z0 = new Rect();
        this.f42833A0 = new RectF();
        this.f42841E0 = new LinkedHashSet();
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a(this);
        this.f42862V0 = aVar;
        this.f42870b1 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f42867a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = AbstractC5946a.f55826a;
        aVar.o0(timeInterpolator);
        aVar.l0(timeInterpolator);
        aVar.X(8388659);
        h0 h0VarJ = com.google.android.material.internal.m.j(context2, attributeSet, AbstractC5848k.f54944F5, i10, i11, AbstractC5848k.f55131c6, AbstractC5848k.f55113a6, AbstractC5848k.f55279u6, AbstractC5848k.f55319z6, AbstractC5848k.f54937E6);
        z zVar = new z(this, h0VarJ);
        this.f42869b = zVar;
        this.f42838D = h0VarJ.a(AbstractC5848k.f54921C6, true);
        setHint(h0VarJ.p(AbstractC5848k.f54984K5));
        this.f42864X0 = h0VarJ.a(AbstractC5848k.f54913B6, true);
        this.f42863W0 = h0VarJ.a(AbstractC5848k.f55295w6, true);
        if (h0VarJ.s(AbstractC5848k.f55000M5)) {
            setMinEms(h0VarJ.k(AbstractC5848k.f55000M5, -1));
        } else if (h0VarJ.s(AbstractC5848k.f54976J5)) {
            setMinWidth(h0VarJ.f(AbstractC5848k.f54976J5, -1));
        }
        if (h0VarJ.s(AbstractC5848k.f54992L5)) {
            setMaxEms(h0VarJ.k(AbstractC5848k.f54992L5, -1));
        } else if (h0VarJ.s(AbstractC5848k.f54968I5)) {
            setMaxWidth(h0VarJ.f(AbstractC5848k.f54968I5, -1));
        }
        this.f42887o0 = H9.l.e(context2, attributeSet, i10, i11).m();
        this.f42891q0 = context2.getResources().getDimensionPixelOffset(AbstractC5840c.f54740q0);
        this.f42895s0 = h0VarJ.e(AbstractC5848k.f55024P5, 0);
        this.f42872d = getResources().getDimensionPixelSize(AbstractC5840c.f54682B);
        this.f42899u0 = h0VarJ.f(AbstractC5848k.f55080W5, context2.getResources().getDimensionPixelSize(AbstractC5840c.f54742r0));
        this.f42901v0 = h0VarJ.f(AbstractC5848k.f55088X5, context2.getResources().getDimensionPixelSize(AbstractC5840c.f54744s0));
        this.f42897t0 = this.f42899u0;
        float fD = h0VarJ.d(AbstractC5848k.f55056T5, -1.0f);
        float fD2 = h0VarJ.d(AbstractC5848k.f55048S5, -1.0f);
        float fD3 = h0VarJ.d(AbstractC5848k.f55032Q5, -1.0f);
        float fD4 = h0VarJ.d(AbstractC5848k.f55040R5, -1.0f);
        l.b bVarW = this.f42887o0.w();
        if (fD >= 0.0f) {
            bVarW.D(fD);
        }
        if (fD2 >= 0.0f) {
            bVarW.I(fD2);
        }
        if (fD3 >= 0.0f) {
            bVarW.y(fD3);
        }
        if (fD4 >= 0.0f) {
            bVarW.u(fD4);
        }
        this.f42887o0 = bVarW.m();
        ColorStateList colorStateListB = E9.c.b(context2, h0VarJ, AbstractC5848k.f55008N5);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.f42855O0 = defaultColor;
            this.f42905x0 = defaultColor;
            if (colorStateListB.isStateful()) {
                this.f42856P0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.f42857Q0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f42858R0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f42857Q0 = this.f42855O0;
                ColorStateList colorStateListA = AbstractC5323a.a(context2, AbstractC5839b.f54677c);
                this.f42856P0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.f42858R0 = colorStateListA.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f42905x0 = 0;
            this.f42855O0 = 0;
            this.f42856P0 = 0;
            this.f42857Q0 = 0;
            this.f42858R0 = 0;
        }
        if (h0VarJ.s(AbstractC5848k.f54960H5)) {
            ColorStateList colorStateListC = h0VarJ.c(AbstractC5848k.f54960H5);
            this.f42850J0 = colorStateListC;
            this.f42849I0 = colorStateListC;
        }
        ColorStateList colorStateListB2 = E9.c.b(context2, h0VarJ, AbstractC5848k.f55064U5);
        this.f42853M0 = h0VarJ.b(AbstractC5848k.f55064U5, 0);
        this.f42851K0 = AbstractC7194b.c(context2, AbstractC5839b.f54678d);
        this.f42859S0 = AbstractC7194b.c(context2, AbstractC5839b.f54679e);
        this.f42852L0 = AbstractC7194b.c(context2, AbstractC5839b.f54680f);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        if (h0VarJ.s(AbstractC5848k.f55072V5)) {
            setBoxStrokeErrorColor(E9.c.b(context2, h0VarJ, AbstractC5848k.f55072V5));
        }
        if (h0VarJ.n(AbstractC5848k.f54937E6, -1) != -1) {
            setHintTextAppearance(h0VarJ.n(AbstractC5848k.f54937E6, 0));
        }
        this.f42834B = h0VarJ.c(AbstractC5848k.f55149e6);
        this.f42836C = h0VarJ.c(AbstractC5848k.f55158f6);
        int iN = h0VarJ.n(AbstractC5848k.f55279u6, 0);
        CharSequence charSequenceP = h0VarJ.p(AbstractC5848k.f55239p6);
        int iK = h0VarJ.k(AbstractC5848k.f55231o6, 1);
        boolean zA = h0VarJ.a(AbstractC5848k.f55247q6, false);
        int iN2 = h0VarJ.n(AbstractC5848k.f55319z6, 0);
        boolean zA2 = h0VarJ.a(AbstractC5848k.f55311y6, false);
        CharSequence charSequenceP2 = h0VarJ.p(AbstractC5848k.f55303x6);
        int iN3 = h0VarJ.n(AbstractC5848k.f55001M6, 0);
        CharSequence charSequenceP3 = h0VarJ.p(AbstractC5848k.f54993L6);
        boolean zA3 = h0VarJ.a(AbstractC5848k.f55096Y5, false);
        setCounterMaxLength(h0VarJ.k(AbstractC5848k.f55104Z5, -1));
        this.f42892r = h0VarJ.n(AbstractC5848k.f55131c6, 0);
        this.f42890q = h0VarJ.n(AbstractC5848k.f55113a6, 0);
        setBoxBackgroundMode(h0VarJ.k(AbstractC5848k.f55016O5, 0));
        setErrorContentDescription(charSequenceP);
        setErrorAccessibilityLiveRegion(iK);
        setCounterOverflowTextAppearance(this.f42890q);
        setHelperTextTextAppearance(iN2);
        setErrorTextAppearance(iN);
        setCounterTextAppearance(this.f42892r);
        setPlaceholderText(charSequenceP3);
        setPlaceholderTextAppearance(iN3);
        if (h0VarJ.s(AbstractC5848k.f55287v6)) {
            setErrorTextColor(h0VarJ.c(AbstractC5848k.f55287v6));
        }
        if (h0VarJ.s(AbstractC5848k.f54905A6)) {
            setHelperTextColor(h0VarJ.c(AbstractC5848k.f54905A6));
        }
        if (h0VarJ.s(AbstractC5848k.f54945F6)) {
            setHintTextColor(h0VarJ.c(AbstractC5848k.f54945F6));
        }
        if (h0VarJ.s(AbstractC5848k.f55140d6)) {
            setCounterTextColor(h0VarJ.c(AbstractC5848k.f55140d6));
        }
        if (h0VarJ.s(AbstractC5848k.f55122b6)) {
            setCounterOverflowTextColor(h0VarJ.c(AbstractC5848k.f55122b6));
        }
        if (h0VarJ.s(AbstractC5848k.f55009N6)) {
            setPlaceholderTextColor(h0VarJ.c(AbstractC5848k.f55009N6));
        }
        r rVar = new r(this, h0VarJ);
        this.f42871c = rVar;
        boolean zA4 = h0VarJ.a(AbstractC5848k.f54952G5, true);
        setHintMaxLines(h0VarJ.k(AbstractC5848k.f54929D6, 1));
        h0VarJ.x();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(zVar);
        frameLayout.addView(rVar);
        addView(frameLayout);
        setEnabled(zA4);
        setHelperTextEnabled(zA2);
        setErrorEnabled(zA);
        setCounterEnabled(zA3);
        setHelperText(charSequenceP2);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f42871c.Q(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f42871c.S(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f42871c.c0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f42871c.j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f42871c.l0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f42869b.r(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f42869b.s(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        int f42910a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ EditText f42911b;

        a(EditText editText) {
            this.f42911b = editText;
            this.f42910a = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.w0(!r0.f42868a1);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f42880l) {
                textInputLayout.l0(editable);
            }
            if (TextInputLayout.this.f42896t) {
                TextInputLayout.this.A0(editable);
            }
            int lineCount = this.f42911b.getLineCount();
            int i10 = this.f42910a;
            if (lineCount != i10) {
                if (lineCount < i10) {
                    int minimumHeight = this.f42911b.getMinimumHeight();
                    int i11 = TextInputLayout.this.f42860T0;
                    if (minimumHeight != i11) {
                        this.f42911b.setMinimumHeight(i11);
                    }
                }
                this.f42910a = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
