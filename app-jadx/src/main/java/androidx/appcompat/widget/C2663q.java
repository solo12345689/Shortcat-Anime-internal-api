package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.AbstractC2747a0;
import j.AbstractC5323a;

/* JADX INFO: renamed from: androidx.appcompat.widget.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C2663q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageView f25486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f0 f25487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f0 f25488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f0 f25489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25490e = 0;

    public C2663q(ImageView imageView) {
        this.f25486a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f25489d == null) {
            this.f25489d = new f0();
        }
        f0 f0Var = this.f25489d;
        f0Var.a();
        ColorStateList colorStateListA = androidx.core.widget.e.a(this.f25486a);
        if (colorStateListA != null) {
            f0Var.f25399d = true;
            f0Var.f25396a = colorStateListA;
        }
        PorterDuff.Mode modeB = androidx.core.widget.e.b(this.f25486a);
        if (modeB != null) {
            f0Var.f25398c = true;
            f0Var.f25397b = modeB;
        }
        if (!f0Var.f25399d && !f0Var.f25398c) {
            return false;
        }
        C2657k.i(drawable, f0Var, this.f25486a.getDrawableState());
        return true;
    }

    private boolean l() {
        return this.f25487b != null;
    }

    void b() {
        if (this.f25486a.getDrawable() != null) {
            this.f25486a.getDrawable().setLevel(this.f25490e);
        }
    }

    void c() {
        Drawable drawable = this.f25486a.getDrawable();
        if (drawable != null) {
            O.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            f0 f0Var = this.f25488c;
            if (f0Var != null) {
                C2657k.i(drawable, f0Var, this.f25486a.getDrawableState());
                return;
            }
            f0 f0Var2 = this.f25487b;
            if (f0Var2 != null) {
                C2657k.i(drawable, f0Var2, this.f25486a.getDrawableState());
            }
        }
    }

    ColorStateList d() {
        f0 f0Var = this.f25488c;
        if (f0Var != null) {
            return f0Var.f25396a;
        }
        return null;
    }

    PorterDuff.Mode e() {
        f0 f0Var = this.f25488c;
        if (f0Var != null) {
            return f0Var.f25397b;
        }
        return null;
    }

    boolean f() {
        return !(this.f25486a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int iN;
        h0 h0VarV = h0.v(this.f25486a.getContext(), attributeSet, i.j.f48205P, i10, 0);
        ImageView imageView = this.f25486a;
        AbstractC2747a0.i0(imageView, imageView.getContext(), i.j.f48205P, attributeSet, h0VarV.r(), i10, 0);
        try {
            Drawable drawable = this.f25486a.getDrawable();
            if (drawable == null && (iN = h0VarV.n(i.j.f48210Q, -1)) != -1 && (drawable = AbstractC5323a.b(this.f25486a.getContext(), iN)) != null) {
                this.f25486a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                O.b(drawable);
            }
            if (h0VarV.s(i.j.f48215R)) {
                androidx.core.widget.e.c(this.f25486a, h0VarV.c(i.j.f48215R));
            }
            if (h0VarV.s(i.j.f48220S)) {
                androidx.core.widget.e.d(this.f25486a, O.e(h0VarV.k(i.j.f48220S, -1), null));
            }
            h0VarV.x();
        } catch (Throwable th2) {
            h0VarV.x();
            throw th2;
        }
    }

    void h(Drawable drawable) {
        this.f25490e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable drawableB = AbstractC5323a.b(this.f25486a.getContext(), i10);
            if (drawableB != null) {
                O.b(drawableB);
            }
            this.f25486a.setImageDrawable(drawableB);
        } else {
            this.f25486a.setImageDrawable(null);
        }
        c();
    }

    void j(ColorStateList colorStateList) {
        if (this.f25488c == null) {
            this.f25488c = new f0();
        }
        f0 f0Var = this.f25488c;
        f0Var.f25396a = colorStateList;
        f0Var.f25399d = true;
        c();
    }

    void k(PorterDuff.Mode mode) {
        if (this.f25488c == null) {
            this.f25488c = new f0();
        }
        f0 f0Var = this.f25488c;
        f0Var.f25397b = mode;
        f0Var.f25398c = true;
        c();
    }
}
