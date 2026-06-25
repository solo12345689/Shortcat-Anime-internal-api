package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import androidx.core.view.AbstractC2747a0;
import j.AbstractC5323a;

/* JADX INFO: renamed from: androidx.appcompat.widget.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class C2655i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CheckedTextView f25412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f25413b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f25414c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f25415d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25416e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f25417f;

    C2655i(CheckedTextView checkedTextView) {
        this.f25412a = checkedTextView;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.b.a(this.f25412a);
        if (drawableA != null) {
            if (this.f25415d || this.f25416e) {
                Drawable drawableMutate = B1.a.r(drawableA).mutate();
                if (this.f25415d) {
                    B1.a.o(drawableMutate, this.f25413b);
                }
                if (this.f25416e) {
                    B1.a.p(drawableMutate, this.f25414c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f25412a.getDrawableState());
                }
                this.f25412a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f25413b;
    }

    PorterDuff.Mode c() {
        return this.f25414c;
    }

    void d(AttributeSet attributeSet, int i10) {
        int iN;
        int iN2;
        h0 h0VarV = h0.v(this.f25412a.getContext(), attributeSet, i.j.f48206P0, i10, 0);
        CheckedTextView checkedTextView = this.f25412a;
        AbstractC2747a0.i0(checkedTextView, checkedTextView.getContext(), i.j.f48206P0, attributeSet, h0VarV.r(), i10, 0);
        try {
            if (h0VarV.s(i.j.f48216R0) && (iN2 = h0VarV.n(i.j.f48216R0, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.f25412a;
                    checkedTextView2.setCheckMarkDrawable(AbstractC5323a.b(checkedTextView2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    if (h0VarV.s(i.j.f48211Q0)) {
                        CheckedTextView checkedTextView3 = this.f25412a;
                        checkedTextView3.setCheckMarkDrawable(AbstractC5323a.b(checkedTextView3.getContext(), iN));
                    }
                }
            } else if (h0VarV.s(i.j.f48211Q0) && (iN = h0VarV.n(i.j.f48211Q0, 0)) != 0) {
                CheckedTextView checkedTextView32 = this.f25412a;
                checkedTextView32.setCheckMarkDrawable(AbstractC5323a.b(checkedTextView32.getContext(), iN));
            }
            if (h0VarV.s(i.j.f48221S0)) {
                androidx.core.widget.b.b(this.f25412a, h0VarV.c(i.j.f48221S0));
            }
            if (h0VarV.s(i.j.f48226T0)) {
                androidx.core.widget.b.c(this.f25412a, O.e(h0VarV.k(i.j.f48226T0, -1), null));
            }
            h0VarV.x();
        } catch (Throwable th2) {
            h0VarV.x();
            throw th2;
        }
    }

    void e() {
        if (this.f25417f) {
            this.f25417f = false;
        } else {
            this.f25417f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f25413b = colorStateList;
        this.f25415d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f25414c = mode;
        this.f25416e = true;
        a();
    }
}
