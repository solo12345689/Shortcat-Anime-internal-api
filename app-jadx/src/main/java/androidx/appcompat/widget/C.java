package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.view.AbstractC2747a0;
import java.lang.ref.WeakReference;
import z1.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class C {

    /* JADX INFO: renamed from: a */
    private final TextView f24948a;

    /* JADX INFO: renamed from: b */
    private f0 f24949b;

    /* JADX INFO: renamed from: c */
    private f0 f24950c;

    /* JADX INFO: renamed from: d */
    private f0 f24951d;

    /* JADX INFO: renamed from: e */
    private f0 f24952e;

    /* JADX INFO: renamed from: f */
    private f0 f24953f;

    /* JADX INFO: renamed from: g */
    private f0 f24954g;

    /* JADX INFO: renamed from: h */
    private f0 f24955h;

    /* JADX INFO: renamed from: i */
    private final E f24956i;

    /* JADX INFO: renamed from: j */
    private int f24957j = 0;

    /* JADX INFO: renamed from: k */
    private int f24958k = -1;

    /* JADX INFO: renamed from: l */
    private Typeface f24959l;

    /* JADX INFO: renamed from: m */
    private boolean f24960m;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ TextView f24965a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Typeface f24966b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f24967c;

        b(TextView textView, Typeface typeface, int i10) {
            this.f24965a = textView;
            this.f24966b = typeface;
            this.f24967c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24965a.setTypeface(this.f24966b, this.f24967c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class d {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class e {
        static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    C(TextView textView) {
        this.f24948a = textView;
        this.f24956i = new E(textView);
    }

    private void B(int i10, float f10) {
        this.f24956i.t(i10, f10);
    }

    private void C(Context context, h0 h0Var) {
        String strO;
        this.f24957j = h0Var.k(i.j.f48238V2, this.f24957j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int iK = h0Var.k(i.j.f48282e3, -1);
            this.f24958k = iK;
            if (iK != -1) {
                this.f24957j &= 2;
            }
        }
        if (!h0Var.s(i.j.f48277d3) && !h0Var.s(i.j.f48287f3)) {
            if (h0Var.s(i.j.f48233U2)) {
                this.f24960m = false;
                int iK2 = h0Var.k(i.j.f48233U2, 1);
                if (iK2 == 1) {
                    this.f24959l = Typeface.SANS_SERIF;
                    return;
                } else if (iK2 == 2) {
                    this.f24959l = Typeface.SERIF;
                    return;
                } else {
                    if (iK2 != 3) {
                        return;
                    }
                    this.f24959l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f24959l = null;
        int i11 = h0Var.s(i.j.f48287f3) ? i.j.f48287f3 : i.j.f48277d3;
        int i12 = this.f24958k;
        int i13 = this.f24957j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = h0Var.j(i11, this.f24957j, new a(i12, i13, new WeakReference(this.f24948a)));
                if (typefaceJ != null) {
                    if (i10 < 28 || this.f24958k == -1) {
                        this.f24959l = typefaceJ;
                    } else {
                        this.f24959l = e.a(Typeface.create(typefaceJ, 0), this.f24958k, (this.f24957j & 2) != 0);
                    }
                }
                this.f24960m = this.f24959l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f24959l != null || (strO = h0Var.o(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f24958k == -1) {
            this.f24959l = Typeface.create(strO, this.f24957j);
        } else {
            this.f24959l = e.a(Typeface.create(strO, 0), this.f24958k, (this.f24957j & 2) != 0);
        }
    }

    private void a(Drawable drawable, f0 f0Var) {
        if (drawable == null || f0Var == null) {
            return;
        }
        C2657k.i(drawable, f0Var, this.f24948a.getDrawableState());
    }

    private static f0 d(Context context, C2657k c2657k, int i10) {
        ColorStateList colorStateListF = c2657k.f(context, i10);
        if (colorStateListF == null) {
            return null;
        }
        f0 f0Var = new f0();
        f0Var.f25399d = true;
        f0Var.f25396a = colorStateListF;
        return f0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f24948a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f24948a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f24948a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f24948a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f24948a.getCompoundDrawables();
        TextView textView2 = this.f24948a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        f0 f0Var = this.f24955h;
        this.f24949b = f0Var;
        this.f24950c = f0Var;
        this.f24951d = f0Var;
        this.f24952e = f0Var;
        this.f24953f = f0Var;
        this.f24954g = f0Var;
    }

    void A(int i10, float f10) {
        if (s0.f25509c || l()) {
            return;
        }
        B(i10, f10);
    }

    void b() {
        if (this.f24949b != null || this.f24950c != null || this.f24951d != null || this.f24952e != null) {
            Drawable[] compoundDrawables = this.f24948a.getCompoundDrawables();
            a(compoundDrawables[0], this.f24949b);
            a(compoundDrawables[1], this.f24950c);
            a(compoundDrawables[2], this.f24951d);
            a(compoundDrawables[3], this.f24952e);
        }
        if (this.f24953f == null && this.f24954g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f24948a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f24953f);
        a(compoundDrawablesRelative[2], this.f24954g);
    }

    void c() {
        this.f24956i.a();
    }

    int e() {
        return this.f24956i.f();
    }

    int f() {
        return this.f24956i.g();
    }

    int g() {
        return this.f24956i.h();
    }

    int[] h() {
        return this.f24956i.i();
    }

    int i() {
        return this.f24956i.j();
    }

    ColorStateList j() {
        f0 f0Var = this.f24955h;
        if (f0Var != null) {
            return f0Var.f25396a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        f0 f0Var = this.f24955h;
        if (f0Var != null) {
            return f0Var.f25397b;
        }
        return null;
    }

    boolean l() {
        return this.f24956i.n();
    }

    void m(AttributeSet attributeSet, int i10) {
        boolean zA;
        boolean z10;
        String strO;
        String strO2;
        boolean z11;
        int iA;
        float f10;
        Context context = this.f24948a.getContext();
        C2657k c2657kB = C2657k.b();
        h0 h0VarV = h0.v(context, attributeSet, i.j.f48250Y, i10, 0);
        TextView textView = this.f24948a;
        AbstractC2747a0.i0(textView, textView.getContext(), i.j.f48250Y, attributeSet, h0VarV.r(), i10, 0);
        int iN = h0VarV.n(i.j.f48254Z, -1);
        if (h0VarV.s(i.j.f48269c0)) {
            this.f24949b = d(context, c2657kB, h0VarV.n(i.j.f48269c0, 0));
        }
        if (h0VarV.s(i.j.f48259a0)) {
            this.f24950c = d(context, c2657kB, h0VarV.n(i.j.f48259a0, 0));
        }
        if (h0VarV.s(i.j.f48274d0)) {
            this.f24951d = d(context, c2657kB, h0VarV.n(i.j.f48274d0, 0));
        }
        if (h0VarV.s(i.j.f48264b0)) {
            this.f24952e = d(context, c2657kB, h0VarV.n(i.j.f48264b0, 0));
        }
        if (h0VarV.s(i.j.f48279e0)) {
            this.f24953f = d(context, c2657kB, h0VarV.n(i.j.f48279e0, 0));
        }
        if (h0VarV.s(i.j.f48284f0)) {
            this.f24954g = d(context, c2657kB, h0VarV.n(i.j.f48284f0, 0));
        }
        h0VarV.x();
        boolean z12 = this.f24948a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iN != -1) {
            h0 h0VarT = h0.t(context, iN, i.j.f48223S2);
            if (z12 || !h0VarT.s(i.j.f48297h3)) {
                zA = false;
                z10 = false;
            } else {
                zA = h0VarT.a(i.j.f48297h3, false);
                z10 = true;
            }
            C(context, h0VarT);
            int i11 = Build.VERSION.SDK_INT;
            strO2 = h0VarT.s(i.j.f48302i3) ? h0VarT.o(i.j.f48302i3) : null;
            strO = (i11 < 26 || !h0VarT.s(i.j.f48292g3)) ? null : h0VarT.o(i.j.f48292g3);
            h0VarT.x();
        } else {
            zA = false;
            z10 = false;
            strO = null;
            strO2 = null;
        }
        h0 h0VarV2 = h0.v(context, attributeSet, i.j.f48223S2, i10, 0);
        if (z12 || !h0VarV2.s(i.j.f48297h3)) {
            z11 = z10;
        } else {
            zA = h0VarV2.a(i.j.f48297h3, false);
            z11 = true;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (h0VarV2.s(i.j.f48302i3)) {
            strO2 = h0VarV2.o(i.j.f48302i3);
        }
        if (i12 >= 26 && h0VarV2.s(i.j.f48292g3)) {
            strO = h0VarV2.o(i.j.f48292g3);
        }
        if (i12 >= 28 && h0VarV2.s(i.j.f48228T2) && h0VarV2.f(i.j.f48228T2, -1) == 0) {
            this.f24948a.setTextSize(0, 0.0f);
        }
        C(context, h0VarV2);
        h0VarV2.x();
        if (!z12 && z11) {
            s(zA);
        }
        Typeface typeface = this.f24959l;
        if (typeface != null) {
            if (this.f24958k == -1) {
                this.f24948a.setTypeface(typeface, this.f24957j);
            } else {
                this.f24948a.setTypeface(typeface);
            }
        }
        if (strO != null) {
            d.d(this.f24948a, strO);
        }
        if (strO2 != null) {
            c.b(this.f24948a, c.a(strO2));
        }
        this.f24956i.o(attributeSet, i10);
        if (s0.f25509c && this.f24956i.j() != 0) {
            int[] iArrI = this.f24956i.i();
            if (iArrI.length > 0) {
                if (d.a(this.f24948a) != -1.0f) {
                    d.b(this.f24948a, this.f24956i.g(), this.f24956i.f(), this.f24956i.h(), 0);
                } else {
                    d.c(this.f24948a, iArrI, 0);
                }
            }
        }
        h0 h0VarU = h0.u(context, attributeSet, i.j.f48289g0);
        int iN2 = h0VarU.n(i.j.f48329o0, -1);
        Drawable drawableC = iN2 != -1 ? c2657kB.c(context, iN2) : null;
        int iN3 = h0VarU.n(i.j.f48354t0, -1);
        Drawable drawableC2 = iN3 != -1 ? c2657kB.c(context, iN3) : null;
        int iN4 = h0VarU.n(i.j.f48334p0, -1);
        Drawable drawableC3 = iN4 != -1 ? c2657kB.c(context, iN4) : null;
        int iN5 = h0VarU.n(i.j.f48319m0, -1);
        Drawable drawableC4 = iN5 != -1 ? c2657kB.c(context, iN5) : null;
        int iN6 = h0VarU.n(i.j.f48339q0, -1);
        Drawable drawableC5 = iN6 != -1 ? c2657kB.c(context, iN6) : null;
        int iN7 = h0VarU.n(i.j.f48324n0, -1);
        y(drawableC, drawableC2, drawableC3, drawableC4, drawableC5, iN7 != -1 ? c2657kB.c(context, iN7) : null);
        if (h0VarU.s(i.j.f48344r0)) {
            androidx.core.widget.i.f(this.f24948a, h0VarU.c(i.j.f48344r0));
        }
        if (h0VarU.s(i.j.f48349s0)) {
            androidx.core.widget.i.g(this.f24948a, O.e(h0VarU.k(i.j.f48349s0, -1), null));
        }
        int iF = h0VarU.f(i.j.f48364v0, -1);
        int iF2 = h0VarU.f(i.j.f48369w0, -1);
        if (h0VarU.s(i.j.f48374x0)) {
            TypedValue typedValueW = h0VarU.w(i.j.f48374x0);
            if (typedValueW == null || typedValueW.type != 5) {
                f10 = h0VarU.f(i.j.f48374x0, -1);
                iA = -1;
            } else {
                iA = K1.i.a(typedValueW.data);
                f10 = TypedValue.complexToFloat(typedValueW.data);
            }
        } else {
            iA = -1;
            f10 = -1.0f;
        }
        h0VarU.x();
        if (iF != -1) {
            androidx.core.widget.i.h(this.f24948a, iF);
        }
        if (iF2 != -1) {
            androidx.core.widget.i.i(this.f24948a, iF2);
        }
        if (f10 != -1.0f) {
            if (iA == -1) {
                androidx.core.widget.i.j(this.f24948a, (int) f10);
            } else {
                androidx.core.widget.i.k(this.f24948a, iA, f10);
            }
        }
    }

    void n(WeakReference weakReference, Typeface typeface) {
        if (this.f24960m) {
            this.f24959l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.f24957j));
                } else {
                    textView.setTypeface(typeface, this.f24957j);
                }
            }
        }
    }

    void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (s0.f25509c) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i10) {
        String strO;
        h0 h0VarT = h0.t(context, i10, i.j.f48223S2);
        if (h0VarT.s(i.j.f48297h3)) {
            s(h0VarT.a(i.j.f48297h3, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (h0VarT.s(i.j.f48228T2) && h0VarT.f(i.j.f48228T2, -1) == 0) {
            this.f24948a.setTextSize(0, 0.0f);
        }
        C(context, h0VarT);
        if (i11 >= 26 && h0VarT.s(i.j.f48292g3) && (strO = h0VarT.o(i.j.f48292g3)) != null) {
            d.d(this.f24948a, strO);
        }
        h0VarT.x();
        Typeface typeface = this.f24959l;
        if (typeface != null) {
            this.f24948a.setTypeface(typeface, this.f24957j);
        }
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        M1.c.f(editorInfo, textView.getText());
    }

    void s(boolean z10) {
        this.f24948a.setAllCaps(z10);
    }

    void t(int i10, int i11, int i12, int i13) {
        this.f24956i.p(i10, i11, i12, i13);
    }

    void u(int[] iArr, int i10) {
        this.f24956i.q(iArr, i10);
    }

    void v(int i10) {
        this.f24956i.r(i10);
    }

    void w(ColorStateList colorStateList) {
        if (this.f24955h == null) {
            this.f24955h = new f0();
        }
        f0 f0Var = this.f24955h;
        f0Var.f25396a = colorStateList;
        f0Var.f25399d = colorStateList != null;
        z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.f24955h == null) {
            this.f24955h = new f0();
        }
        f0 f0Var = this.f24955h;
        f0Var.f25397b = mode;
        f0Var.f25398c = mode != null;
        z();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends k.e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f24961a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f24962b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ WeakReference f24963c;

        a(int i10, int i11, WeakReference weakReference) {
            this.f24961a = i10;
            this.f24962b = i11;
            this.f24963c = weakReference;
        }

        @Override // z1.k.e
        public void g(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f24961a) != -1) {
                typeface = e.a(typeface, i10, (this.f24962b & 2) != 0);
            }
            C.this.n(this.f24963c, typeface);
        }

        @Override // z1.k.e
        public void f(int i10) {
        }
    }
}
