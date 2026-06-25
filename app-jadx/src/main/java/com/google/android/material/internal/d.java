package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.T;
import o9.AbstractC5848k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends T {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f42576p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Rect f42577q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Rect f42578r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f42579s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f42580t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f42581u;

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f42577q = new Rect();
        this.f42578r = new Rect();
        this.f42579s = 119;
        this.f42580t = true;
        this.f42581u = false;
        TypedArray typedArrayI = m.i(context, attributeSet, AbstractC5848k.f54964I1, i10, 0, new int[0]);
        this.f42579s = typedArrayI.getInt(AbstractC5848k.f54980K1, this.f42579s);
        Drawable drawable = typedArrayI.getDrawable(AbstractC5848k.f54972J1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f42580t = typedArrayI.getBoolean(AbstractC5848k.f54988L1, true);
        typedArrayI.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f42576p;
        if (drawable != null) {
            if (this.f42581u) {
                this.f42581u = false;
                Rect rect = this.f42577q;
                Rect rect2 = this.f42578r;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f42580t) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f42579s, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f42576p;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f42576p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f42576p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f42576p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f42579s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f42576p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.T, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f42581u = z10 | this.f42581u;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f42581u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f42576p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f42576p);
            }
            this.f42576p = drawable;
            this.f42581u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f42579s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f42579s != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f42579s = i10;
            if (i10 == 119 && this.f42576p != null) {
                this.f42576p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f42576p;
    }
}
