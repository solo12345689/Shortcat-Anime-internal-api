package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.AbstractC2747a0;

/* JADX INFO: renamed from: androidx.appcompat.widget.e */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class C2651e {

    /* JADX INFO: renamed from: a */
    private final View f25383a;

    /* JADX INFO: renamed from: d */
    private f0 f25386d;

    /* JADX INFO: renamed from: e */
    private f0 f25387e;

    /* JADX INFO: renamed from: f */
    private f0 f25388f;

    /* JADX INFO: renamed from: c */
    private int f25385c = -1;

    /* JADX INFO: renamed from: b */
    private final C2657k f25384b = C2657k.b();

    C2651e(View view) {
        this.f25383a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f25388f == null) {
            this.f25388f = new f0();
        }
        f0 f0Var = this.f25388f;
        f0Var.a();
        ColorStateList colorStateListQ = AbstractC2747a0.q(this.f25383a);
        if (colorStateListQ != null) {
            f0Var.f25399d = true;
            f0Var.f25396a = colorStateListQ;
        }
        PorterDuff.Mode modeR = AbstractC2747a0.r(this.f25383a);
        if (modeR != null) {
            f0Var.f25398c = true;
            f0Var.f25397b = modeR;
        }
        if (!f0Var.f25399d && !f0Var.f25398c) {
            return false;
        }
        C2657k.i(drawable, f0Var, this.f25383a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f25386d != null;
    }

    void b() {
        Drawable background = this.f25383a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            f0 f0Var = this.f25387e;
            if (f0Var != null) {
                C2657k.i(background, f0Var, this.f25383a.getDrawableState());
                return;
            }
            f0 f0Var2 = this.f25386d;
            if (f0Var2 != null) {
                C2657k.i(background, f0Var2, this.f25383a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        f0 f0Var = this.f25387e;
        if (f0Var != null) {
            return f0Var.f25396a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        f0 f0Var = this.f25387e;
        if (f0Var != null) {
            return f0Var.f25397b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i10) {
        h0 h0VarV = h0.v(this.f25383a.getContext(), attributeSet, i.j.f48214Q3, i10, 0);
        View view = this.f25383a;
        AbstractC2747a0.i0(view, view.getContext(), i.j.f48214Q3, attributeSet, h0VarV.r(), i10, 0);
        try {
            if (h0VarV.s(i.j.f48219R3)) {
                this.f25385c = h0VarV.n(i.j.f48219R3, -1);
                ColorStateList colorStateListF = this.f25384b.f(this.f25383a.getContext(), this.f25385c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            if (h0VarV.s(i.j.f48224S3)) {
                AbstractC2747a0.p0(this.f25383a, h0VarV.c(i.j.f48224S3));
            }
            if (h0VarV.s(i.j.f48229T3)) {
                AbstractC2747a0.q0(this.f25383a, O.e(h0VarV.k(i.j.f48229T3, -1), null));
            }
            h0VarV.x();
        } catch (Throwable th2) {
            h0VarV.x();
            throw th2;
        }
    }

    void f(Drawable drawable) {
        this.f25385c = -1;
        h(null);
        b();
    }

    void g(int i10) {
        this.f25385c = i10;
        C2657k c2657k = this.f25384b;
        h(c2657k != null ? c2657k.f(this.f25383a.getContext(), i10) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f25386d == null) {
                this.f25386d = new f0();
            }
            f0 f0Var = this.f25386d;
            f0Var.f25396a = colorStateList;
            f0Var.f25399d = true;
        } else {
            this.f25386d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f25387e == null) {
            this.f25387e = new f0();
        }
        f0 f0Var = this.f25387e;
        f0Var.f25396a = colorStateList;
        f0Var.f25399d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f25387e == null) {
            this.f25387e = new f0();
        }
        f0 f0Var = this.f25387e;
        f0Var.f25397b = mode;
        f0Var.f25398c = true;
        b();
    }
}
