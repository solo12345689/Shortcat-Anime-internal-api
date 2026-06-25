package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.view.AbstractC2747a0;

/* JADX INFO: renamed from: androidx.appcompat.widget.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class C2671z extends C2666u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SeekBar f25521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f25522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ColorStateList f25523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f25524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f25525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f25526i;

    C2671z(SeekBar seekBar) {
        super(seekBar);
        this.f25523f = null;
        this.f25524g = null;
        this.f25525h = false;
        this.f25526i = false;
        this.f25521d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f25522e;
        if (drawable != null) {
            if (this.f25525h || this.f25526i) {
                Drawable drawableR = B1.a.r(drawable.mutate());
                this.f25522e = drawableR;
                if (this.f25525h) {
                    B1.a.o(drawableR, this.f25523f);
                }
                if (this.f25526i) {
                    B1.a.p(this.f25522e, this.f25524g);
                }
                if (this.f25522e.isStateful()) {
                    this.f25522e.setState(this.f25521d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.C2666u
    void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        h0 h0VarV = h0.v(this.f25521d.getContext(), attributeSet, i.j.f48225T, i10, 0);
        SeekBar seekBar = this.f25521d;
        AbstractC2747a0.i0(seekBar, seekBar.getContext(), i.j.f48225T, attributeSet, h0VarV.r(), i10, 0);
        Drawable drawableH = h0VarV.h(i.j.f48230U);
        if (drawableH != null) {
            this.f25521d.setThumb(drawableH);
        }
        j(h0VarV.g(i.j.f48235V));
        if (h0VarV.s(i.j.f48245X)) {
            this.f25524g = O.e(h0VarV.k(i.j.f48245X, -1), this.f25524g);
            this.f25526i = true;
        }
        if (h0VarV.s(i.j.f48240W)) {
            this.f25523f = h0VarV.c(i.j.f48240W);
            this.f25525h = true;
        }
        h0VarV.x();
        f();
    }

    void g(Canvas canvas) {
        if (this.f25522e != null) {
            int max = this.f25521d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f25522e.getIntrinsicWidth();
                int intrinsicHeight = this.f25522e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f25522e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f25521d.getWidth() - this.f25521d.getPaddingLeft()) - this.f25521d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f25521d.getPaddingLeft(), this.f25521d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f25522e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void h() {
        Drawable drawable = this.f25522e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f25521d.getDrawableState())) {
            this.f25521d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f25522e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f25522e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f25522e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f25521d);
            B1.a.m(drawable, this.f25521d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f25521d.getDrawableState());
            }
            f();
        }
        this.f25521d.invalidate();
    }
}
