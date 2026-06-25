package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.view.AbstractC2747a0;
import j.AbstractC5323a;

/* JADX INFO: renamed from: androidx.appcompat.widget.j */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class C2656j {

    /* JADX INFO: renamed from: a */
    private final CompoundButton f25419a;

    /* JADX INFO: renamed from: b */
    private ColorStateList f25420b = null;

    /* JADX INFO: renamed from: c */
    private PorterDuff.Mode f25421c = null;

    /* JADX INFO: renamed from: d */
    private boolean f25422d = false;

    /* JADX INFO: renamed from: e */
    private boolean f25423e = false;

    /* JADX INFO: renamed from: f */
    private boolean f25424f;

    C2656j(CompoundButton compoundButton) {
        this.f25419a = compoundButton;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.c.a(this.f25419a);
        if (drawableA != null) {
            if (this.f25422d || this.f25423e) {
                Drawable drawableMutate = B1.a.r(drawableA).mutate();
                if (this.f25422d) {
                    B1.a.o(drawableMutate, this.f25420b);
                }
                if (this.f25423e) {
                    B1.a.p(drawableMutate, this.f25421c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f25419a.getDrawableState());
                }
                this.f25419a.setButtonDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f25420b;
    }

    PorterDuff.Mode c() {
        return this.f25421c;
    }

    void d(AttributeSet attributeSet, int i10) {
        int iN;
        int iN2;
        h0 h0VarV = h0.v(this.f25419a.getContext(), attributeSet, i.j.f48231U0, i10, 0);
        CompoundButton compoundButton = this.f25419a;
        AbstractC2747a0.i0(compoundButton, compoundButton.getContext(), i.j.f48231U0, attributeSet, h0VarV.r(), i10, 0);
        try {
            if (h0VarV.s(i.j.f48241W0) && (iN2 = h0VarV.n(i.j.f48241W0, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f25419a;
                    compoundButton2.setButtonDrawable(AbstractC5323a.b(compoundButton2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    if (h0VarV.s(i.j.f48236V0)) {
                        CompoundButton compoundButton3 = this.f25419a;
                        compoundButton3.setButtonDrawable(AbstractC5323a.b(compoundButton3.getContext(), iN));
                    }
                }
            } else if (h0VarV.s(i.j.f48236V0) && (iN = h0VarV.n(i.j.f48236V0, 0)) != 0) {
                CompoundButton compoundButton32 = this.f25419a;
                compoundButton32.setButtonDrawable(AbstractC5323a.b(compoundButton32.getContext(), iN));
            }
            if (h0VarV.s(i.j.f48246X0)) {
                androidx.core.widget.c.d(this.f25419a, h0VarV.c(i.j.f48246X0));
            }
            if (h0VarV.s(i.j.f48251Y0)) {
                androidx.core.widget.c.e(this.f25419a, O.e(h0VarV.k(i.j.f48251Y0, -1), null));
            }
            h0VarV.x();
        } catch (Throwable th2) {
            h0VarV.x();
            throw th2;
        }
    }

    void e() {
        if (this.f25424f) {
            this.f25424f = false;
        } else {
            this.f25424f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f25420b = colorStateList;
        this.f25422d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f25421c = mode;
        this.f25423e = true;
        a();
    }
}
