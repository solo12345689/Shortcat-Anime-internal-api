package com.google.android.material.internal;

import E9.a;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import p9.AbstractC5946a;
import x9.AbstractC7066a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private Typeface f42498A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Typeface f42499B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private Typeface f42500C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Typeface f42501D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private E9.a f42502E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private E9.a f42503F;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private CharSequence f42505H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private CharSequence f42506I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f42507J;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private float f42509L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private float f42510M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private float f42511N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float f42512O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private float f42513P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f42514Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f42515R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int[] f42516S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f42517T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final TextPaint f42518U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final TextPaint f42519V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private TimeInterpolator f42520W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private TimeInterpolator f42521X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private float f42522Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float f42523Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f42524a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f42525a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f42526b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private ColorStateList f42527b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42528c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private float f42529c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f42530d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private float f42531d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f42532e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private float f42533e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f42534f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private ColorStateList f42535f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f42536g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private float f42537g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Rect f42538h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private float f42539h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Rect f42540i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private float f42541i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final RectF f42542j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private StaticLayout f42543j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private float f42545k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private float f42547l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private float f42549m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private CharSequence f42551n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ColorStateList f42552o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ColorStateList f42554p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f42556q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f42558r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f42560s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f42562t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private i f42563t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f42564u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f42566v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f42568w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f42569w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Typeface f42570x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Typeface f42571y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Typeface f42572z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f42544k = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f42546l = 16;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f42548m = 15.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f42550n = 15.0f;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private TextUtils.TruncateAt f42504G = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f42508K = true;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f42553o0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f42555p0 = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private float f42557q0 = 0.0f;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private float f42559r0 = 1.0f;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f42561s0 = h.f42582o;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f42565u0 = -1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f42567v0 = -1;

    /* JADX INFO: renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0643a implements a.InterfaceC0056a {
        C0643a() {
        }

        @Override // E9.a.InterfaceC0056a
        public void a(Typeface typeface) {
            a.this.Y(typeface);
        }
    }

    public a(View view) {
        this.f42524a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f42518U = textPaint;
        this.f42519V = new TextPaint(textPaint);
        this.f42538h = new Rect();
        this.f42536g = new Rect();
        this.f42542j = new RectF();
        this.f42532e = e();
        L(view.getContext().getResources().getConfiguration());
    }

    private Layout.Alignment C() {
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f42544k, this.f42507J ? 1 : 0) & 7;
        return absoluteGravity != 1 ? absoluteGravity != 5 ? this.f42507J ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f42507J ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    private void D(TextPaint textPaint) {
        textPaint.setTextSize(this.f42550n);
        textPaint.setTypeface(this.f42570x);
        textPaint.setLetterSpacing(this.f42537g0);
    }

    private void E(TextPaint textPaint) {
        textPaint.setTextSize(this.f42548m);
        textPaint.setTypeface(this.f42498A);
        textPaint.setLetterSpacing(this.f42539h0);
    }

    private void F(float f10) {
        if (this.f42528c) {
            this.f42542j.set(f10 < this.f42532e ? this.f42536g : this.f42538h);
            return;
        }
        this.f42542j.left = K(this.f42536g.left, this.f42538h.left, f10, this.f42520W);
        this.f42542j.top = K(this.f42558r, this.f42560s, f10, this.f42520W);
        this.f42542j.right = K(this.f42536g.right, this.f42538h.right, f10, this.f42520W);
        this.f42542j.bottom = K(this.f42536g.bottom, this.f42538h.bottom, f10, this.f42520W);
    }

    private static boolean G(float f10, float f11) {
        return Math.abs(f10 - f11) < 1.0E-5f;
    }

    private boolean H() {
        return this.f42524a.getLayoutDirection() == 1;
    }

    private boolean J(CharSequence charSequence, boolean z10) {
        return (z10 ? J1.o.f9237d : J1.o.f9236c).isRtl(charSequence, 0, charSequence.length());
    }

    private static float K(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return AbstractC5946a.a(f10, f11, f12);
    }

    private float M(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static boolean P(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    private void V(float f10) {
        this.f42547l0 = f10;
        this.f42524a.postInvalidateOnAnimation();
    }

    private boolean Z(Typeface typeface) {
        E9.a aVar = this.f42503F;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f42572z == typeface) {
            return false;
        }
        this.f42572z = typeface;
        Typeface typefaceB = E9.i.b(this.f42524a.getContext().getResources().getConfiguration(), typeface);
        this.f42571y = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f42572z;
        }
        this.f42570x = typefaceB;
        return true;
    }

    private static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), Math.round((Color.red(i10) * f11) + (Color.red(i11) * f10)), Math.round((Color.green(i10) * f11) + (Color.green(i11) * f10)), Math.round((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    private void b(boolean z10) {
        float fM;
        i(1.0f, z10);
        if (this.f42506I != null && this.f42543j0 != null) {
            this.f42551n0 = r0() ? TextUtils.ellipsize(this.f42506I, this.f42518U, this.f42543j0.getWidth(), this.f42504G) : this.f42506I;
        }
        CharSequence charSequence = this.f42551n0;
        if (charSequence != null) {
            this.f42545k0 = M(this.f42518U, charSequence);
        } else {
            this.f42545k0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f42546l, this.f42507J ? 1 : 0);
        Rect rect = this.f42540i;
        if (rect == null) {
            rect = this.f42538h;
        }
        int i10 = absoluteGravity & 112;
        if (i10 == 48) {
            this.f42560s = rect.top;
        } else if (i10 != 80) {
            this.f42560s = rect.centerY() - ((this.f42518U.descent() - this.f42518U.ascent()) / 2.0f);
        } else {
            this.f42560s = rect.bottom + this.f42518U.ascent();
        }
        int i11 = absoluteGravity & 8388615;
        if (i11 == 1) {
            this.f42564u = rect.centerX() - (this.f42545k0 / 2.0f);
        } else if (i11 != 5) {
            this.f42564u = rect.left;
        } else {
            this.f42564u = rect.right - this.f42545k0;
        }
        if (this.f42545k0 <= this.f42538h.width()) {
            float f10 = this.f42564u;
            float fMax = f10 + Math.max(0.0f, this.f42538h.left - f10);
            this.f42564u = fMax;
            this.f42564u = fMax + Math.min(0.0f, this.f42538h.right - (this.f42545k0 + fMax));
        }
        if (m() <= this.f42538h.height()) {
            float f11 = this.f42560s;
            float fMax2 = f11 + Math.max(0.0f, this.f42538h.top - f11);
            this.f42560s = fMax2;
            this.f42560s = fMax2 + Math.min(0.0f, this.f42538h.bottom - (q() + fMax2));
        }
        i(0.0f, z10);
        float height = this.f42543j0 != null ? r11.getHeight() : 0.0f;
        StaticLayout staticLayout = this.f42543j0;
        if (staticLayout == null || this.f42553o0 <= 1) {
            CharSequence charSequence2 = this.f42506I;
            fM = charSequence2 != null ? M(this.f42518U, charSequence2) : 0.0f;
        } else {
            fM = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.f42543j0;
        this.f42556q = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f42544k, this.f42507J ? 1 : 0);
        int i12 = absoluteGravity2 & 112;
        if (i12 == 48) {
            this.f42558r = this.f42536g.top;
        } else if (i12 != 80) {
            this.f42558r = this.f42536g.centerY() - (height / 2.0f);
        } else {
            this.f42558r = (this.f42536g.bottom - height) + (this.f42569w0 ? this.f42518U.descent() : 0.0f);
        }
        int i13 = absoluteGravity2 & 8388615;
        if (i13 == 1) {
            this.f42562t = this.f42536g.centerX() - (fM / 2.0f);
        } else if (i13 != 5) {
            this.f42562t = this.f42536g.left;
        } else {
            this.f42562t = this.f42536g.right - fM;
        }
        k0(this.f42526b);
    }

    private void c() {
        g(this.f42526b);
    }

    private float d(float f10) {
        float f11 = this.f42532e;
        return f10 <= f11 ? AbstractC5946a.b(1.0f, 0.0f, this.f42530d, f11, f10) : AbstractC5946a.b(0.0f, 1.0f, f11, 1.0f, f10);
    }

    private float e() {
        float f10 = this.f42530d;
        return f10 + ((1.0f - f10) * 0.5f);
    }

    private boolean f(CharSequence charSequence) {
        boolean zH = H();
        return this.f42508K ? J(charSequence, zH) : zH;
    }

    private void f0(float f10) {
        this.f42549m0 = f10;
        this.f42524a.postInvalidateOnAnimation();
    }

    private void g(float f10) {
        float f11;
        F(f10);
        if (!this.f42528c) {
            this.f42566v = K(this.f42562t, this.f42564u, f10, this.f42520W);
            this.f42568w = K(this.f42558r, this.f42560s, f10, this.f42520W);
            k0(f10);
            f11 = f10;
        } else if (f10 < this.f42532e) {
            this.f42566v = this.f42562t;
            this.f42568w = this.f42558r;
            k0(0.0f);
            f11 = 0.0f;
        } else {
            this.f42566v = this.f42564u;
            this.f42568w = this.f42560s - Math.max(0, this.f42534f);
            k0(1.0f);
            f11 = 1.0f;
        }
        TimeInterpolator timeInterpolator = AbstractC5946a.f55827b;
        V(1.0f - K(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        f0(K(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f42554p != this.f42552o) {
            this.f42518U.setColor(a(v(), t(), f11));
        } else {
            this.f42518U.setColor(t());
        }
        float f12 = this.f42537g0;
        float f13 = this.f42539h0;
        if (f12 != f13) {
            this.f42518U.setLetterSpacing(K(f13, f12, f10, timeInterpolator));
        } else {
            this.f42518U.setLetterSpacing(f12);
        }
        this.f42511N = K(this.f42529c0, this.f42522Y, f10, null);
        this.f42512O = K(this.f42531d0, this.f42523Z, f10, null);
        this.f42513P = K(this.f42533e0, this.f42525a0, f10, null);
        int iA = a(u(this.f42535f0), u(this.f42527b0), f10);
        this.f42514Q = iA;
        this.f42518U.setShadowLayer(this.f42511N, this.f42512O, this.f42513P, iA);
        if (this.f42528c) {
            this.f42518U.setAlpha((int) (d(f10) * this.f42518U.getAlpha()));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.f42518U;
                textPaint.setShadowLayer(this.f42511N, this.f42512O, this.f42513P, AbstractC7066a.a(this.f42514Q, textPaint.getAlpha()));
            }
        }
        this.f42524a.postInvalidateOnAnimation();
    }

    private void h(float f10) {
        i(f10, false);
    }

    private void i(float f10, boolean z10) {
        Typeface typeface;
        float f11;
        float f12;
        if (this.f42505H == null) {
            return;
        }
        float fWidth = this.f42538h.width();
        float fWidth2 = this.f42536g.width();
        if (G(f10, 1.0f)) {
            f11 = r0() ? this.f42550n : this.f42548m;
            f12 = r0() ? this.f42537g0 : this.f42539h0;
            this.f42509L = r0() ? 1.0f : K(this.f42548m, this.f42550n, f10, this.f42521X) / this.f42548m;
            if (!r0()) {
                fWidth = fWidth2;
            }
            typeface = this.f42570x;
            fWidth2 = fWidth;
        } else {
            float f13 = this.f42548m;
            float f14 = this.f42539h0;
            typeface = this.f42498A;
            if (G(f10, 0.0f)) {
                this.f42509L = 1.0f;
            } else {
                this.f42509L = K(this.f42548m, this.f42550n, f10, this.f42521X) / this.f42548m;
            }
            float f15 = this.f42550n / this.f42548m;
            float f16 = fWidth2 * f15;
            if (!z10 && !this.f42528c && f16 > fWidth && r0()) {
                fWidth2 = Math.min(fWidth / f15, fWidth2);
            }
            f11 = f13;
            f12 = f14;
        }
        int i10 = f10 < 0.5f ? this.f42553o0 : this.f42555p0;
        if (fWidth2 > 0.0f) {
            boolean z11 = this.f42510M != f11;
            boolean z12 = this.f42541i0 != f12;
            boolean z13 = this.f42501D != typeface;
            StaticLayout staticLayout = this.f42543j0;
            boolean z14 = z11 || z12 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z13 || (this.f42515R != i10) || this.f42517T;
            this.f42510M = f11;
            this.f42541i0 = f12;
            this.f42501D = typeface;
            this.f42517T = false;
            this.f42515R = i10;
            this.f42518U.setLinearText(this.f42509L != 1.0f);
            z = z14;
        }
        if (this.f42506I == null || z) {
            this.f42518U.setTextSize(this.f42510M);
            this.f42518U.setTypeface(this.f42501D);
            this.f42518U.setLetterSpacing(this.f42541i0);
            this.f42507J = f(this.f42505H);
            StaticLayout staticLayoutJ = j(q0() ? i10 : 1, this.f42518U, this.f42505H, fWidth2 * (r0() ? 1.0f : this.f42509L), this.f42507J);
            this.f42543j0 = staticLayoutJ;
            this.f42506I = staticLayoutJ.getText();
        }
    }

    private boolean i0(Typeface typeface) {
        E9.a aVar = this.f42502E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f42500C == typeface) {
            return false;
        }
        this.f42500C = typeface;
        Typeface typefaceB = E9.i.b(this.f42524a.getContext().getResources().getConfiguration(), typeface);
        this.f42499B = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f42500C;
        }
        this.f42498A = typefaceB;
        return true;
    }

    private StaticLayout j(int i10, TextPaint textPaint, CharSequence charSequence, float f10, boolean z10) {
        return (StaticLayout) K1.f.g(h.b(charSequence, textPaint, (int) f10).d(this.f42504G).g(z10).c(i10 == 1 ? Layout.Alignment.ALIGN_NORMAL : C()).f(false).i(i10).h(this.f42557q0, this.f42559r0).e(this.f42561s0).j(this.f42563t0).a());
    }

    private void k0(float f10) {
        h(f10);
        this.f42524a.postInvalidateOnAnimation();
    }

    private void l(Canvas canvas, float f10, float f11) {
        int alpha = this.f42518U.getAlpha();
        canvas.translate(f10, f11);
        if (!this.f42528c) {
            this.f42518U.setAlpha((int) (this.f42549m0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.f42518U;
                textPaint.setShadowLayer(this.f42511N, this.f42512O, this.f42513P, AbstractC7066a.a(this.f42514Q, textPaint.getAlpha()));
            }
            this.f42543j0.draw(canvas);
        }
        if (!this.f42528c) {
            this.f42518U.setAlpha((int) (this.f42547l0 * alpha));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            TextPaint textPaint2 = this.f42518U;
            textPaint2.setShadowLayer(this.f42511N, this.f42512O, this.f42513P, AbstractC7066a.a(this.f42514Q, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f42543j0.getLineBaseline(0);
        CharSequence charSequence = this.f42551n0;
        float f12 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, this.f42518U);
        if (i10 >= 31) {
            this.f42518U.setShadowLayer(this.f42511N, this.f42512O, this.f42513P, this.f42514Q);
        }
        if (this.f42528c) {
            return;
        }
        String strTrim = this.f42551n0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.f42518U.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f42543j0.getLineEnd(0), str.length()), 0.0f, f12, (Paint) this.f42518U);
    }

    private boolean q0() {
        if (this.f42553o0 > 1 || this.f42555p0 > 1) {
            return !this.f42507J || this.f42528c;
        }
        return false;
    }

    private float r(int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (i10 / 2.0f) - (this.f42545k0 / 2.0f) : ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.f42507J ? this.f42538h.left : this.f42538h.right - this.f42545k0 : this.f42507J ? this.f42538h.right - this.f42545k0 : this.f42538h.left;
    }

    private boolean r0() {
        return this.f42555p0 == 1;
    }

    private float s(RectF rectF, int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (i10 / 2.0f) + (this.f42545k0 / 2.0f) : ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.f42507J ? rectF.left + this.f42545k0 : this.f42538h.right : this.f42507J ? this.f42538h.right : rectF.left + this.f42545k0;
    }

    private int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f42516S;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private int v() {
        return u(this.f42552o);
    }

    public float A() {
        E(this.f42519V);
        return -this.f42519V.ascent();
    }

    public float B() {
        return this.f42526b;
    }

    public final boolean I() {
        ColorStateList colorStateList = this.f42554p;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f42552o;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    public void L(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f42572z;
            if (typeface != null) {
                this.f42571y = E9.i.b(configuration, typeface);
            }
            Typeface typeface2 = this.f42500C;
            if (typeface2 != null) {
                this.f42499B = E9.i.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f42571y;
            if (typeface3 == null) {
                typeface3 = this.f42572z;
            }
            this.f42570x = typeface3;
            Typeface typeface4 = this.f42499B;
            if (typeface4 == null) {
                typeface4 = this.f42500C;
            }
            this.f42498A = typeface4;
            O(true);
        }
    }

    public void N() {
        O(false);
    }

    public void O(boolean z10) {
        if ((this.f42524a.getHeight() <= 0 || this.f42524a.getWidth() <= 0) && !z10) {
            return;
        }
        b(z10);
        c();
    }

    public void Q(ColorStateList colorStateList) {
        if (this.f42554p == colorStateList && this.f42552o == colorStateList) {
            return;
        }
        this.f42554p = colorStateList;
        this.f42552o = colorStateList;
        N();
    }

    public void R(int i10, int i11, int i12, int i13) {
        if (P(this.f42538h, i10, i11, i12, i13)) {
            return;
        }
        this.f42538h.set(i10, i11, i12, i13);
        this.f42517T = true;
    }

    public void S(Rect rect) {
        R(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void T(int i10) {
        if (i10 != this.f42555p0) {
            this.f42555p0 = i10;
            N();
        }
    }

    public void U(int i10) {
        E9.e eVar = new E9.e(this.f42524a.getContext(), i10);
        if (eVar.j() != null) {
            this.f42554p = eVar.j();
        }
        if (eVar.k() != 0.0f) {
            this.f42550n = eVar.k();
        }
        ColorStateList colorStateList = eVar.f5794c;
        if (colorStateList != null) {
            this.f42527b0 = colorStateList;
        }
        this.f42523Z = eVar.f5800i;
        this.f42525a0 = eVar.f5801j;
        this.f42522Y = eVar.f5802k;
        this.f42537g0 = eVar.f5804m;
        E9.a aVar = this.f42503F;
        if (aVar != null) {
            aVar.c();
        }
        this.f42503F = new E9.a(new C0643a(), eVar.e());
        eVar.g(this.f42524a.getContext(), this.f42503F);
        N();
    }

    public void W(ColorStateList colorStateList) {
        if (this.f42554p != colorStateList) {
            this.f42554p = colorStateList;
            N();
        }
    }

    public void X(int i10) {
        if (this.f42546l != i10) {
            this.f42546l = i10;
            N();
        }
    }

    public void Y(Typeface typeface) {
        if (Z(typeface)) {
            N();
        }
    }

    public void a0(int i10, int i11, int i12, int i13) {
        b0(i10, i11, i12, i13, true);
    }

    public void b0(int i10, int i11, int i12, int i13, boolean z10) {
        if (P(this.f42536g, i10, i11, i12, i13) && z10 == this.f42569w0) {
            return;
        }
        this.f42536g.set(i10, i11, i12, i13);
        this.f42517T = true;
        this.f42569w0 = z10;
    }

    public void c0(Rect rect) {
        a0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void d0(float f10) {
        if (this.f42539h0 != f10) {
            this.f42539h0 = f10;
            N();
        }
    }

    public void e0(int i10) {
        if (i10 != this.f42553o0) {
            this.f42553o0 = i10;
            N();
        }
    }

    public void g0(int i10) {
        if (this.f42544k != i10) {
            this.f42544k = i10;
            N();
        }
    }

    public void h0(float f10) {
        if (this.f42548m != f10) {
            this.f42548m = f10;
            N();
        }
    }

    public void j0(float f10) {
        float fA = E1.a.a(f10, 0.0f, 1.0f);
        if (fA != this.f42526b) {
            this.f42526b = fA;
            c();
        }
    }

    public void k(Canvas canvas) {
        int iSave = canvas.save();
        if (this.f42506I == null || this.f42542j.width() <= 0.0f || this.f42542j.height() <= 0.0f) {
            return;
        }
        this.f42518U.setTextSize(this.f42510M);
        float f10 = this.f42566v;
        float f11 = this.f42568w;
        float f12 = this.f42509L;
        if (f12 != 1.0f && !this.f42528c) {
            canvas.scale(f12, f12, f10, f11);
        }
        if (q0() && r0() && (!this.f42528c || this.f42526b > this.f42532e)) {
            l(canvas, this.f42566v - this.f42543j0.getLineStart(0), f11);
        } else {
            canvas.translate(f10, f11);
            this.f42543j0.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    public void l0(TimeInterpolator timeInterpolator) {
        this.f42520W = timeInterpolator;
        N();
    }

    public float m() {
        D(this.f42519V);
        return (-this.f42519V.ascent()) + this.f42519V.descent();
    }

    public final boolean m0(int[] iArr) {
        this.f42516S = iArr;
        if (!I()) {
            return false;
        }
        N();
        return true;
    }

    public float n() {
        D(this.f42519V);
        return -this.f42519V.ascent();
    }

    public void n0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f42505H, charSequence)) {
            this.f42505H = charSequence;
            this.f42506I = null;
            N();
        }
    }

    public void o(RectF rectF, int i10, int i11) {
        this.f42507J = f(this.f42505H);
        rectF.left = Math.max(r(i10, i11), this.f42538h.left);
        rectF.top = this.f42538h.top;
        rectF.right = Math.min(s(rectF, i10, i11), this.f42538h.right);
        rectF.bottom = this.f42538h.top + q();
        if (this.f42543j0 == null || r0()) {
            return;
        }
        float lineWidth = this.f42543j0.getLineWidth(r4.getLineCount() - 1) * (this.f42550n / this.f42548m);
        if (this.f42507J) {
            rectF.left = rectF.right - lineWidth;
        } else {
            rectF.right = rectF.left + lineWidth;
        }
    }

    public void o0(TimeInterpolator timeInterpolator) {
        this.f42521X = timeInterpolator;
        N();
    }

    public ColorStateList p() {
        return this.f42554p;
    }

    public void p0(Typeface typeface) {
        boolean Z10 = Z(typeface);
        boolean zI0 = i0(typeface);
        if (Z10 || zI0) {
            N();
        }
    }

    public float q() {
        int i10 = this.f42565u0;
        return i10 != -1 ? i10 : n();
    }

    public void s0(int i10) {
        D(this.f42519V);
        float f10 = i10;
        this.f42565u0 = j(this.f42555p0, this.f42519V, this.f42505H, f10 * (this.f42550n / this.f42548m), this.f42507J).getHeight();
        E(this.f42519V);
        this.f42567v0 = j(this.f42553o0, this.f42519V, this.f42505H, f10, this.f42507J).getHeight();
    }

    public int t() {
        return u(this.f42554p);
    }

    public int w() {
        return this.f42556q;
    }

    public int x() {
        return this.f42553o0;
    }

    public float y() {
        E(this.f42519V);
        return (-this.f42519V.ascent()) + this.f42519V.descent();
    }

    public float z() {
        int i10 = this.f42567v0;
        return i10 != -1 ? i10 : A();
    }
}
