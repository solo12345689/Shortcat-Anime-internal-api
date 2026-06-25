package com.google.android.material.navigation;

import L1.B;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.m0;
import com.google.android.material.internal.BaselineLayout;
import o9.AbstractC5838a;
import o9.AbstractC5840c;
import o9.AbstractC5841d;
import o9.AbstractC5842e;
import o9.AbstractC5843f;
import o9.AbstractC5846i;
import p9.AbstractC5946a;
import q9.C6164a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends FrameLayout implements h {

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private static final int[] f42622I0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    private static final c f42623J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private static final c f42624K0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private BaselineLayout f42625A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private int f42626A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f42627B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private int f42628B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f42629C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private int f42630C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f42631D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private boolean f42632D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f42633E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private boolean f42634E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f42635F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private boolean f42636F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private ColorStateList f42637G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private boolean f42638G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f42639H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private Rect f42640H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f42641I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f42642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f42643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Drawable f42644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f42645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f42646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f42647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f42648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f42649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f42650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f42651j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f42652k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f42653l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private ColorStateList f42654l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f42655m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private Drawable f42656m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42657n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private Drawable f42658n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f42659o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private ValueAnimator f42660o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final LinearLayout f42661p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private c f42662p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final LinearLayout f42663q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private float f42664q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final View f42665r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f42666r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final FrameLayout f42667s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f42668s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ImageView f42669t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f42670t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final BaselineLayout f42671u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f42672u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final TextView f42673v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f42674v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final TextView f42675w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f42676w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private BaselineLayout f42677x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private int f42678x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private TextView f42679y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private int f42680y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private TextView f42681z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private C6164a f42682z0;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f42683a;

        a(int i10) {
            this.f42683a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.A(this.f42683a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f42685a;

        b(float f10) {
            this.f42685a = f10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            e.this.p(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f42685a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c {
        private c() {
        }

        protected float a(float f10, float f11) {
            return AbstractC5946a.b(0.0f, 1.0f, f11 == 0.0f ? 0.8f : 0.0f, f11 == 0.0f ? 1.0f : 0.2f, f10);
        }

        protected float b(float f10) {
            return AbstractC5946a.a(0.4f, 1.0f, f10);
        }

        protected float c(float f10) {
            return 1.0f;
        }

        public void d(float f10, float f11, View view) {
            view.setScaleX(b(f10));
            view.setScaleY(c(f10));
            view.setAlpha(a(f10, f11));
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class d extends c {
        private d() {
            super(null);
        }

        @Override // com.google.android.material.navigation.e.c
        protected float c(float f10) {
            return b(f10);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f42623J0 = new c(aVar);
        f42624K0 = new d(aVar);
    }

    public e(Context context) {
        super(context);
        this.f42642a = false;
        this.f42627B = -1;
        this.f42629C = 0;
        this.f42631D = 0;
        this.f42633E = 0;
        this.f42635F = 0;
        this.f42639H = false;
        this.f42662p0 = f42623J0;
        this.f42664q0 = 0.0f;
        this.f42666r0 = false;
        this.f42668s0 = 0;
        this.f42670t0 = 0;
        this.f42672u0 = -2;
        this.f42674v0 = 0;
        this.f42676w0 = false;
        this.f42678x0 = 0;
        this.f42680y0 = 0;
        this.f42628B0 = 0;
        this.f42630C0 = 49;
        this.f42632D0 = false;
        this.f42634E0 = false;
        this.f42636F0 = false;
        this.f42638G0 = false;
        this.f42640H0 = new Rect();
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f42661p = (LinearLayout) findViewById(AbstractC5842e.f54768F);
        LinearLayout linearLayout = (LinearLayout) findViewById(AbstractC5842e.f54771I);
        this.f42663q = linearLayout;
        this.f42665r = findViewById(AbstractC5842e.f54767E);
        this.f42667s = (FrameLayout) findViewById(AbstractC5842e.f54769G);
        this.f42669t = (ImageView) findViewById(AbstractC5842e.f54770H);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(AbstractC5842e.f54772J);
        this.f42671u = baselineLayout;
        TextView textView = (TextView) findViewById(AbstractC5842e.f54774L);
        this.f42673v = textView;
        TextView textView2 = (TextView) findViewById(AbstractC5842e.f54773K);
        this.f42675w = textView2;
        j();
        this.f42625A = baselineLayout;
        setBackgroundResource(getItemBackgroundResId());
        this.f42645d = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f42646e = baselineLayout.getPaddingBottom();
        this.f42647f = 0;
        this.f42648g = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        this.f42679y.setImportantForAccessibility(2);
        this.f42681z.setImportantForAccessibility(2);
        setFocusable(true);
        f();
        this.f42674v0 = getResources().getDimensionPixelSize(AbstractC5840c.f54683C);
        linearLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.navigation.d
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                e.a(this.f42621a, view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        });
    }

    private void B() {
        if (k()) {
            this.f42662p0 = f42624K0;
        } else {
            this.f42662p0 = f42623J0;
        }
    }

    private void C() {
        TextView textView = this.f42675w;
        textView.setTypeface(textView.getTypeface(), this.f42639H ? 1 : 0);
        TextView textView2 = this.f42681z;
        textView2.setTypeface(textView2.getTypeface(), this.f42639H ? 1 : 0);
    }

    private void D(TextView textView, int i10) {
        if (textView == null) {
            return;
        }
        t(textView, i10);
        f();
        textView.setMinimumHeight(E9.c.i(textView.getContext(), i10, 0));
        ColorStateList colorStateList = this.f42637G;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        C();
    }

    private void E(TextView textView, int i10) {
        if (textView == null) {
            return;
        }
        t(textView, i10);
        f();
        textView.setMinimumHeight(E9.c.i(textView.getContext(), i10, 0));
        ColorStateList colorStateList = this.f42637G;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    private void F() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.f42628B0 = 0;
        this.f42625A = this.f42671u;
        int i16 = 8;
        if (this.f42626A0 == 1) {
            if (this.f42677x.getParent() == null) {
                e();
            }
            Rect rect = this.f42640H0;
            int i17 = rect.left;
            int i18 = rect.right;
            int i19 = rect.top;
            i10 = rect.bottom;
            this.f42628B0 = 1;
            int i20 = this.f42680y0;
            this.f42625A = this.f42677x;
            i14 = i19;
            i13 = i18;
            i12 = i17;
            i11 = i20;
            i15 = 0;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 8;
            i16 = 0;
        }
        this.f42671u.setVisibility(i16);
        this.f42677x.setVisibility(i15);
        ((FrameLayout.LayoutParams) this.f42661p.getLayoutParams()).gravity = this.f42630C0;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f42663q.getLayoutParams();
        layoutParams.leftMargin = i12;
        layoutParams.rightMargin = i13;
        layoutParams.topMargin = i14;
        layoutParams.bottomMargin = i10;
        setPadding(i11, 0, i11, 0);
        A(getWidth());
    }

    private static void G(View view, int i10) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    private void H() {
        androidx.appcompat.view.menu.g gVar = this.f42641I;
        if (gVar != null) {
            setVisibility((!gVar.isVisible() || (!this.f42632D0 && this.f42634E0)) ? 8 : 0);
        }
    }

    public static /* synthetic */ void a(e eVar, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean z10;
        if (eVar.f42669t.getVisibility() == 0) {
            eVar.z(eVar.f42669t);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) eVar.f42663q.getLayoutParams();
        int i18 = (i12 - i10) + layoutParams.rightMargin + layoutParams.leftMargin;
        int i19 = (i13 - i11) + layoutParams.topMargin + layoutParams.bottomMargin;
        boolean z11 = true;
        if (eVar.f42626A0 == 1 && eVar.f42672u0 == -2) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) eVar.f42665r.getLayoutParams();
            if (eVar.f42672u0 != -2 || eVar.f42665r.getMeasuredWidth() == i18) {
                z10 = false;
            } else {
                layoutParams2.width = Math.max(i18, Math.min(eVar.f42668s0, eVar.getMeasuredWidth() - (eVar.f42678x0 * 2)));
                z10 = true;
            }
            if (eVar.f42665r.getMeasuredHeight() < i19) {
                layoutParams2.height = i19;
            } else {
                z11 = z10;
            }
            if (z11) {
                eVar.f42665r.setLayoutParams(layoutParams2);
            }
        }
    }

    private void e() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f42663q.addView(this.f42677x, layoutParams);
        q();
    }

    private void f() {
        float textSize = this.f42673v.getTextSize();
        float textSize2 = this.f42675w.getTextSize();
        this.f42649h = textSize - textSize2;
        this.f42650i = (textSize2 * 1.0f) / textSize;
        this.f42651j = (textSize * 1.0f) / textSize2;
        float textSize3 = this.f42679y.getTextSize();
        float textSize4 = this.f42681z.getTextSize();
        this.f42652k = textSize3 - textSize4;
        this.f42653l = (textSize4 * 1.0f) / textSize3;
        this.f42655m = (textSize3 * 1.0f) / textSize4;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i10 = 0;
        for (int i11 = 0; i11 < iIndexOfChild; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof e) && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    private int getSuggestedIconWidth() {
        C6164a c6164a = this.f42682z0;
        int minimumWidth = c6164a == null ? 0 : c6164a.getMinimumWidth() - this.f42682z0.o();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f42667s.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.f42669t.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    private static Drawable h(ColorStateList colorStateList) {
        return new RippleDrawable(F9.a.a(colorStateList), null, null);
    }

    private boolean i() {
        return this.f42682z0 != null;
    }

    private void j() {
        float dimension = getResources().getDimension(AbstractC5840c.f54709b);
        float dimension2 = getResources().getDimension(AbstractC5840c.f54707a);
        BaselineLayout baselineLayout = new BaselineLayout(getContext());
        this.f42677x = baselineLayout;
        baselineLayout.setVisibility(8);
        this.f42677x.setDuplicateParentStateEnabled(true);
        this.f42677x.setMeasurePaddingFromBaseline(this.f42636F0);
        TextView textView = new TextView(getContext());
        this.f42679y = textView;
        textView.setMaxLines(1);
        TextView textView2 = this.f42679y;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.f42679y.setDuplicateParentStateEnabled(true);
        this.f42679y.setIncludeFontPadding(false);
        this.f42679y.setGravity(16);
        this.f42679y.setTextSize(dimension);
        TextView textView3 = new TextView(getContext());
        this.f42681z = textView3;
        textView3.setMaxLines(1);
        this.f42681z.setEllipsize(truncateAt);
        this.f42681z.setDuplicateParentStateEnabled(true);
        this.f42681z.setVisibility(4);
        this.f42681z.setIncludeFontPadding(false);
        this.f42681z.setGravity(16);
        this.f42681z.setTextSize(dimension2);
        this.f42677x.addView(this.f42679y);
        this.f42677x.addView(this.f42681z);
    }

    private boolean k() {
        return this.f42676w0 && this.f42657n == 2;
    }

    private void l(float f10) {
        if (!this.f42666r0 || !this.f42642a || !isAttachedToWindow()) {
            p(f10, f10);
            return;
        }
        ValueAnimator valueAnimator = this.f42660o0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f42660o0 = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f42664q0, f10);
        this.f42660o0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new b(f10));
        this.f42660o0.setInterpolator(C9.d.g(getContext(), AbstractC5838a.f54662t0, AbstractC5946a.f55827b));
        this.f42660o0.setDuration(C9.d.f(getContext(), AbstractC5838a.f54648m0, getResources().getInteger(AbstractC5843f.f54815b)));
        this.f42660o0.start();
    }

    private void m() {
        androidx.appcompat.view.menu.g gVar = this.f42641I;
        if (gVar != null) {
            setChecked(gVar.isChecked());
        }
    }

    private void n() {
        Drawable drawableH = this.f42644c;
        RippleDrawable rippleDrawable = null;
        boolean z10 = true;
        if (this.f42643b != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f42666r0 && getActiveIndicatorDrawable() != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(F9.a.d(this.f42643b), null, activeIndicatorDrawable);
                z10 = false;
            } else if (drawableH == null) {
                drawableH = h(this.f42643b);
            }
        }
        this.f42667s.setPadding(0, 0, 0, 0);
        this.f42667s.setForeground(rippleDrawable);
        setBackground(drawableH);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(float f10, float f11) {
        this.f42662p0.d(f10, f11, this.f42665r);
        this.f42664q0 = f10;
    }

    private void q() {
        int i10 = this.f42669t.getLayoutParams().width > 0 ? this.f42648g : 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f42677x.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.rightMargin = getLayoutDirection() == 1 ? i10 : 0;
            layoutParams.leftMargin = getLayoutDirection() != 1 ? i10 : 0;
        }
    }

    private void r(View view, View view2, float f10, float f11) {
        v(this.f42661p, this.f42626A0 == 0 ? (int) (this.f42645d + f11) : 0, 0, this.f42630C0);
        LinearLayout linearLayout = this.f42663q;
        int i10 = this.f42626A0;
        v(linearLayout, i10 == 0 ? 0 : this.f42640H0.top, i10 == 0 ? 0 : this.f42640H0.bottom, i10 == 0 ? 17 : 8388627);
        G(this.f42671u, this.f42646e);
        this.f42625A.setVisibility(0);
        w(view, 1.0f, 1.0f, 0);
        w(view2, f10, f10, 4);
    }

    private void s() {
        LinearLayout linearLayout = this.f42661p;
        int i10 = this.f42645d;
        v(linearLayout, i10, i10, this.f42626A0 == 0 ? 17 : this.f42630C0);
        v(this.f42663q, 0, 0, 17);
        G(this.f42671u, 0);
        this.f42625A.setVisibility(8);
    }

    private void setLabelPivots(TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    private void t(TextView textView, int i10) {
        if (this.f42638G0) {
            androidx.core.widget.i.m(textView, i10);
        } else {
            u(textView, i10);
        }
    }

    private static void u(TextView textView, int i10) {
        androidx.core.widget.i.m(textView, i10);
        int iJ = E9.c.j(textView.getContext(), i10, 0);
        if (iJ != 0) {
            textView.setTextSize(0, iJ);
        }
    }

    private static void v(View view, int i10, int i11, int i12) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i10;
        layoutParams.bottomMargin = i11;
        layoutParams.gravity = i12;
        view.setLayoutParams(layoutParams);
    }

    private static void w(View view, float f10, float f11, int i10) {
        view.setScaleX(f10);
        view.setScaleY(f11);
        view.setVisibility(i10);
    }

    private void x(View view) {
        if (i() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            q9.c.a(this.f42682z0, view);
        }
    }

    private void y(View view) {
        if (i()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                q9.c.e(this.f42682z0, view);
            }
            this.f42682z0 = null;
        }
    }

    private void z(View view) {
        if (i()) {
            q9.c.f(this.f42682z0, view, null);
        }
    }

    public void A(int i10) {
        if (i10 > 0 || getVisibility() != 0) {
            int iMin = Math.min(this.f42668s0, i10 - (this.f42678x0 * 2));
            int iMax = this.f42670t0;
            if (this.f42626A0 == 1) {
                int measuredWidth = i10 - (this.f42680y0 * 2);
                int i11 = this.f42672u0;
                if (i11 != -1) {
                    measuredWidth = i11 == -2 ? this.f42661p.getMeasuredWidth() : Math.min(i11, measuredWidth);
                }
                iMin = measuredWidth;
                iMax = Math.max(this.f42674v0, this.f42663q.getMeasuredHeight());
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f42665r.getLayoutParams();
            if (k()) {
                iMax = iMin;
            }
            layoutParams.height = iMax;
            layoutParams.width = Math.max(0, iMin);
            this.f42665r.setLayoutParams(layoutParams);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(androidx.appcompat.view.menu.g gVar, int i10) {
        this.f42641I = gVar;
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setIcon(gVar.getIcon());
        setTitle(gVar.getTitle());
        setId(gVar.getItemId());
        if (!TextUtils.isEmpty(gVar.getContentDescription())) {
            setContentDescription(gVar.getContentDescription());
        }
        m0.a(this, !TextUtils.isEmpty(gVar.getTooltipText()) ? gVar.getTooltipText() : gVar.getTitle());
        H();
        this.f42642a = true;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f42666r0) {
            this.f42667s.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    void g() {
        o();
        this.f42641I = null;
        this.f42664q0 = 0.0f;
        this.f42642a = false;
    }

    public Drawable getActiveIndicatorDrawable() {
        return this.f42665r.getBackground();
    }

    public C6164a getBadge() {
        return this.f42682z0;
    }

    public BaselineLayout getExpandedLabelGroup() {
        return this.f42677x;
    }

    protected int getItemBackgroundResId() {
        return AbstractC5841d.f54761i;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public androidx.appcompat.view.menu.g getItemData() {
        return this.f42641I;
    }

    protected int getItemDefaultMarginResId() {
        return AbstractC5840c.f54734n0;
    }

    protected abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f42627B;
    }

    public BaselineLayout getLabelGroup() {
        return this.f42671u;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f42661p.getLayoutParams();
        return this.f42661p.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        if (this.f42626A0 == 1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f42663q.getLayoutParams();
            return this.f42663q.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f42671u.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams2.leftMargin + this.f42671u.getMeasuredWidth() + layoutParams2.rightMargin);
    }

    void o() {
        y(this.f42669t);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        androidx.appcompat.view.menu.g gVar = this.f42641I;
        if (gVar != null && gVar.isCheckable() && this.f42641I.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f42622I0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C6164a c6164a = this.f42682z0;
        if (c6164a != null && c6164a.isVisible()) {
            CharSequence title = this.f42641I.getTitle();
            if (!TextUtils.isEmpty(this.f42641I.getContentDescription())) {
                title = this.f42641I.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.f42682z0.l()));
        }
        B bS1 = B.s1(accessibilityNodeInfo);
        bS1.C0(B.g.b(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            bS1.A0(false);
            bS1.p0(B.a.f11217i);
        }
        bS1.a1(getResources().getString(AbstractC5846i.f54850h));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new a(i10));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        this.f42665r.setBackground(drawable);
        n();
    }

    public void setActiveIndicatorEnabled(boolean z10) {
        this.f42666r0 = z10;
        n();
        this.f42665r.setVisibility(z10 ? 0 : 8);
        requestLayout();
    }

    public void setActiveIndicatorExpandedHeight(int i10) {
        this.f42674v0 = i10;
        A(getWidth());
    }

    public void setActiveIndicatorExpandedMarginHorizontal(int i10) {
        this.f42680y0 = i10;
        if (this.f42626A0 == 1) {
            setPadding(i10, 0, i10, 0);
        }
        A(getWidth());
    }

    public void setActiveIndicatorExpandedPadding(Rect rect) {
        this.f42640H0 = rect;
    }

    public void setActiveIndicatorExpandedWidth(int i10) {
        this.f42672u0 = i10;
        A(getWidth());
    }

    public void setActiveIndicatorHeight(int i10) {
        this.f42670t0 = i10;
        A(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        if (this.f42647f != i10) {
            this.f42647f = i10;
            ((LinearLayout.LayoutParams) this.f42671u.getLayoutParams()).topMargin = i10;
            if (this.f42677x.getLayoutParams() != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f42677x.getLayoutParams();
                layoutParams.rightMargin = getLayoutDirection() == 1 ? i10 : 0;
                if (getLayoutDirection() == 1) {
                    i10 = 0;
                }
                layoutParams.leftMargin = i10;
                requestLayout();
            }
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i10) {
        this.f42678x0 = i10;
        A(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z10) {
        this.f42676w0 = z10;
    }

    public void setActiveIndicatorWidth(int i10) {
        this.f42668s0 = i10;
        A(getWidth());
    }

    void setBadge(C6164a c6164a) {
        if (this.f42682z0 == c6164a) {
            return;
        }
        if (i() && this.f42669t != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            y(this.f42669t);
        }
        this.f42682z0 = c6164a;
        c6164a.T(this.f42628B0);
        ImageView imageView = this.f42669t;
        if (imageView != null) {
            x(imageView);
        }
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
    }

    public void setChecked(boolean z10) {
        setLabelPivots(this.f42675w);
        setLabelPivots(this.f42673v);
        setLabelPivots(this.f42681z);
        setLabelPivots(this.f42679y);
        l(z10 ? 1.0f : 0.0f);
        TextView textView = this.f42675w;
        TextView textView2 = this.f42673v;
        float f10 = this.f42649h;
        float f11 = this.f42650i;
        float f12 = this.f42651j;
        if (this.f42626A0 == 1) {
            textView = this.f42681z;
            textView2 = this.f42679y;
            f10 = this.f42652k;
            f11 = this.f42653l;
            f12 = this.f42655m;
        }
        int i10 = this.f42657n;
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        s();
                    }
                } else if (z10) {
                    r(textView, textView2, f11, f10);
                } else {
                    r(textView2, textView, f12, 0.0f);
                }
            } else if (z10) {
                r(textView, textView2, f11, 0.0f);
            } else {
                s();
            }
        } else if (this.f42659o) {
            if (z10) {
                r(textView, textView2, f11, 0.0f);
            } else {
                s();
            }
        } else if (z10) {
            r(textView, textView2, f11, f10);
        } else {
            r(textView2, textView, f12, 0.0f);
        }
        refreshDrawableState();
        setSelected(z10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f42673v.setEnabled(z10);
        this.f42675w.setEnabled(z10);
        this.f42679y.setEnabled(z10);
        this.f42681z.setEnabled(z10);
        this.f42669t.setEnabled(z10);
    }

    @Override // com.google.android.material.navigation.h
    public void setExpanded(boolean z10) {
        this.f42632D0 = z10;
        H();
    }

    public void setHorizontalTextAppearanceActive(int i10) {
        this.f42633E = i10;
        TextView textView = this.f42681z;
        if (i10 == 0) {
            i10 = this.f42629C;
        }
        D(textView, i10);
    }

    public void setHorizontalTextAppearanceInactive(int i10) {
        this.f42635F = i10;
        TextView textView = this.f42679y;
        if (i10 == 0) {
            i10 = this.f42631D;
        }
        E(textView, i10);
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f42656m0) {
            return;
        }
        this.f42656m0 = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = B1.a.r(drawable).mutate();
            this.f42658n0 = drawable;
            ColorStateList colorStateList = this.f42654l0;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.f42669t.setImageDrawable(drawable);
    }

    public void setIconLabelHorizontalSpacing(int i10) {
        if (this.f42648g != i10) {
            this.f42648g = i10;
            q();
            requestLayout();
        }
    }

    public void setIconSize(int i10) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f42669t.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        this.f42669t.setLayoutParams(layoutParams);
        q();
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f42654l0 = colorStateList;
        if (this.f42641I == null || (drawable = this.f42658n0) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.f42658n0.invalidateSelf();
    }

    public void setItemBackground(int i10) {
        setItemBackground(i10 == 0 ? null : getContext().getDrawable(i10));
    }

    public void setItemGravity(int i10) {
        this.f42630C0 = i10;
        requestLayout();
    }

    public void setItemIconGravity(int i10) {
        if (this.f42626A0 != i10) {
            this.f42626A0 = i10;
            F();
            n();
        }
    }

    public void setItemPaddingBottom(int i10) {
        if (this.f42646e != i10) {
            this.f42646e = i10;
            m();
        }
    }

    public void setItemPaddingTop(int i10) {
        if (this.f42645d != i10) {
            this.f42645d = i10;
            m();
        }
    }

    public void setItemPosition(int i10) {
        this.f42627B = i10;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f42643b = colorStateList;
        n();
    }

    public void setLabelFontScalingEnabled(boolean z10) {
        this.f42638G0 = z10;
        setTextAppearanceActive(this.f42629C);
        setTextAppearanceInactive(this.f42631D);
        setHorizontalTextAppearanceActive(this.f42633E);
        setHorizontalTextAppearanceInactive(this.f42635F);
    }

    public void setLabelMaxLines(int i10) {
        this.f42673v.setMaxLines(i10);
        this.f42675w.setMaxLines(i10);
        this.f42679y.setMaxLines(i10);
        this.f42681z.setMaxLines(i10);
        if (Build.VERSION.SDK_INT > 34) {
            this.f42673v.setGravity(17);
            this.f42675w.setGravity(17);
        } else if (i10 > 1) {
            this.f42673v.setEllipsize(null);
            this.f42675w.setEllipsize(null);
            this.f42673v.setGravity(17);
            this.f42675w.setGravity(17);
        } else {
            this.f42673v.setGravity(16);
            this.f42675w.setGravity(16);
        }
        requestLayout();
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f42657n != i10) {
            this.f42657n = i10;
            B();
            A(getWidth());
            m();
        }
    }

    public void setMeasureBottomPaddingFromLabelBaseline(boolean z10) {
        this.f42636F0 = z10;
        this.f42671u.setMeasurePaddingFromBaseline(z10);
        this.f42673v.setIncludeFontPadding(z10);
        this.f42675w.setIncludeFontPadding(z10);
        this.f42677x.setMeasurePaddingFromBaseline(z10);
        this.f42679y.setIncludeFontPadding(z10);
        this.f42681z.setIncludeFontPadding(z10);
        requestLayout();
    }

    @Override // com.google.android.material.navigation.h
    public void setOnlyShowWhenExpanded(boolean z10) {
        this.f42634E0 = z10;
        H();
    }

    public void setShifting(boolean z10) {
        if (this.f42659o != z10) {
            this.f42659o = z10;
            m();
        }
    }

    public void setTextAppearanceActive(int i10) {
        this.f42629C = i10;
        D(this.f42675w, i10);
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f42639H = z10;
        setTextAppearanceActive(this.f42629C);
        setHorizontalTextAppearanceActive(this.f42633E);
        C();
    }

    public void setTextAppearanceInactive(int i10) {
        this.f42631D = i10;
        E(this.f42673v, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f42637G = colorStateList;
        if (colorStateList != null) {
            this.f42673v.setTextColor(colorStateList);
            this.f42675w.setTextColor(colorStateList);
            this.f42679y.setTextColor(colorStateList);
            this.f42681z.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f42673v.setText(charSequence);
        this.f42675w.setText(charSequence);
        this.f42679y.setText(charSequence);
        this.f42681z.setText(charSequence);
        androidx.appcompat.view.menu.g gVar = this.f42641I;
        if (gVar == null || TextUtils.isEmpty(gVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        androidx.appcompat.view.menu.g gVar2 = this.f42641I;
        if (gVar2 != null && !TextUtils.isEmpty(gVar2.getTooltipText())) {
            charSequence = this.f42641I.getTooltipText();
        }
        m0.a(this, charSequence);
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f42644c = drawable;
        n();
    }
}
