package androidx.appcompat.widget;

import J1.m;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import j.AbstractC5323a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class D extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2651e f24977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C f24978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B f24979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C2660n f24980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f24981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f24982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Future f24983g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface a {
        void a(int[] iArr, int i10);

        void b(int i10);

        int c();

        int d();

        void e(int i10, float f10);

        int[] f();

        TextClassifier g();

        int h();

        void i(TextClassifier textClassifier);

        void j(int i10, int i11, int i12, int i13);

        void k(int i10);

        int l();

        void m(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c extends b {
        c() {
            super();
        }

        @Override // androidx.appcompat.widget.D.b, androidx.appcompat.widget.D.a
        public void b(int i10) {
            D.super.setLastBaselineToBottomHeight(i10);
        }

        @Override // androidx.appcompat.widget.D.b, androidx.appcompat.widget.D.a
        public void k(int i10) {
            D.super.setFirstBaselineToTopHeight(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d extends c {
        d() {
            super();
        }

        @Override // androidx.appcompat.widget.D.b, androidx.appcompat.widget.D.a
        public void e(int i10, float f10) {
            D.super.setLineHeight(i10, f10);
        }
    }

    public D(Context context) {
        this(context, null);
    }

    private C2660n getEmojiTextViewHelper() {
        if (this.f24980d == null) {
            this.f24980d = new C2660n(this);
        }
        return this.f24980d;
    }

    private void r() {
        Future future = this.f24983g;
        if (future != null) {
            try {
                this.f24983g = null;
                android.support.v4.media.session.b.a(future.get());
                androidx.core.widget.i.l(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C2651e c2651e = this.f24977a;
        if (c2651e != null) {
            c2651e.b();
        }
        C c10 = this.f24978b;
        if (c10 != null) {
            c10.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (s0.f25509c) {
            return getSuperCaller().h();
        }
        C c10 = this.f24978b;
        if (c10 != null) {
            return c10.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (s0.f25509c) {
            return getSuperCaller().d();
        }
        C c10 = this.f24978b;
        if (c10 != null) {
            return c10.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (s0.f25509c) {
            return getSuperCaller().l();
        }
        C c10 = this.f24978b;
        if (c10 != null) {
            return c10.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (s0.f25509c) {
            return getSuperCaller().f();
        }
        C c10 = this.f24978b;
        return c10 != null ? c10.h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (s0.f25509c) {
            return getSuperCaller().c() == 1 ? 1 : 0;
        }
        C c10 = this.f24978b;
        if (c10 != null) {
            return c10.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.i.o(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.i.a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.i.b(this);
    }

    a getSuperCaller() {
        if (this.f24982f == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f24982f = new d();
            } else if (i10 >= 28) {
                this.f24982f = new c();
            } else if (i10 >= 26) {
                this.f24982f = new b();
            }
        }
        return this.f24982f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2651e c2651e = this.f24977a;
        if (c2651e != null) {
            return c2651e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2651e c2651e = this.f24977a;
        if (c2651e != null) {
            return c2651e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f24978b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f24978b.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        r();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        B b10;
        return (Build.VERSION.SDK_INT >= 28 || (b10 = this.f24979c) == null) ? getSuperCaller().g() : b10.a();
    }

    public m.a getTextMetricsParamsCompat() {
        return androidx.core.widget.i.e(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f24978b.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return AbstractC2661o.a(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C c10 = this.f24978b;
        if (c10 != null) {
            c10.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        r();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C c10 = this.f24978b;
        if (c10 == null || s0.f25509c || !c10.l()) {
            return;
        }
        this.f24978b.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (s0.f25509c) {
            getSuperCaller().j(i10, i11, i12, i13);
            return;
        }
        C c10 = this.f24978b;
        if (c10 != null) {
            c10.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (s0.f25509c) {
            getSuperCaller().a(iArr, i10);
            return;
        }
        C c10 = this.f24978b;
        if (c10 != null) {
            c10.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (s0.f25509c) {
            getSuperCaller().m(i10);
            return;
        }
        C c10 = this.f24978b;
        if (c10 != null) {
            c10.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2651e c2651e = this.f24977a;
        if (c2651e != null) {
            c2651e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C2651e c2651e = this.f24977a;
        if (c2651e != null) {
            c2651e.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f24978b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f24978b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f24978b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f24978b;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().k(i10);
        } else {
            androidx.core.widget.i.h(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i10);
        } else {
            androidx.core.widget.i.i(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        androidx.core.widget.i.j(this, i10);
    }

    public void setPrecomputedText(J1.m mVar) {
        androidx.core.widget.i.l(this, mVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2651e c2651e = this.f24977a;
        if (c2651e != null) {
            c2651e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2651e c2651e = this.f24977a;
        if (c2651e != null) {
            c2651e.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f24978b.w(colorStateList);
        this.f24978b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f24978b.x(mode);
        this.f24978b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C c10 = this.f24978b;
        if (c10 != null) {
            c10.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        B b10;
        if (Build.VERSION.SDK_INT >= 28 || (b10 = this.f24979c) == null) {
            getSuperCaller().i(textClassifier);
        } else {
            b10.b(textClassifier);
        }
    }

    public void setTextFuture(Future<J1.m> future) {
        this.f24983g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(m.a aVar) {
        androidx.core.widget.i.n(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (s0.f25509c) {
            super.setTextSize(i10, f10);
            return;
        }
        C c10 = this.f24978b;
        if (c10 != null) {
            c10.A(i10, f10);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        if (this.f24981e) {
            return;
        }
        Typeface typefaceA = (typeface == null || i10 <= 0) ? null : A1.s.a(getContext(), typeface, i10);
        this.f24981e = true;
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f24981e = false;
        }
    }

    public D(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10, float f10) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().e(i10, f10);
        } else {
            androidx.core.widget.i.k(this, i10, f10);
        }
    }

    public D(Context context, AttributeSet attributeSet, int i10) {
        super(e0.b(context), attributeSet, i10);
        this.f24981e = false;
        this.f24982f = null;
        d0.a(this, getContext());
        C2651e c2651e = new C2651e(this);
        this.f24977a = c2651e;
        c2651e.e(attributeSet, i10);
        C c10 = new C(this);
        this.f24978b = c10;
        c10.m(attributeSet, i10);
        c10.b();
        this.f24979c = new B(this);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? AbstractC5323a.b(context, i10) : null, i11 != 0 ? AbstractC5323a.b(context, i11) : null, i12 != 0 ? AbstractC5323a.b(context, i12) : null, i13 != 0 ? AbstractC5323a.b(context, i13) : null);
        C c10 = this.f24978b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? AbstractC5323a.b(context, i10) : null, i11 != 0 ? AbstractC5323a.b(context, i11) : null, i12 != 0 ? AbstractC5323a.b(context, i12) : null, i13 != 0 ? AbstractC5323a.b(context, i13) : null);
        C c10 = this.f24978b;
        if (c10 != null) {
            c10.p();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements a {
        b() {
        }

        @Override // androidx.appcompat.widget.D.a
        public void a(int[] iArr, int i10) {
            D.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        @Override // androidx.appcompat.widget.D.a
        public int c() {
            return D.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.D.a
        public int d() {
            return D.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.D.a
        public int[] f() {
            return D.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.D.a
        public TextClassifier g() {
            return D.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.D.a
        public int h() {
            return D.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.D.a
        public void i(TextClassifier textClassifier) {
            D.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.D.a
        public void j(int i10, int i11, int i12, int i13) {
            D.super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        @Override // androidx.appcompat.widget.D.a
        public int l() {
            return D.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.D.a
        public void m(int i10) {
            D.super.setAutoSizeTextTypeWithDefaults(i10);
        }

        @Override // androidx.appcompat.widget.D.a
        public void b(int i10) {
        }

        @Override // androidx.appcompat.widget.D.a
        public void k(int i10) {
        }

        @Override // androidx.appcompat.widget.D.a
        public void e(int i10, float f10) {
        }
    }
}
