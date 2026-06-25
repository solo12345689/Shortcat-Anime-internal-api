package com.google.android.material.divider;

import E9.c;
import H9.h;
import K9.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.internal.m;
import o9.AbstractC5838a;
import o9.AbstractC5840c;
import o9.AbstractC5847j;
import o9.AbstractC5848k;
import y1.AbstractC7194b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f42458f = AbstractC5847j.f54869A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f42459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f42462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f42463e;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5838a.f54640i0);
    }

    public int getDividerColor() {
        return this.f42461c;
    }

    public int getDividerInsetEnd() {
        return this.f42463e;
    }

    public int getDividerInsetStart() {
        return this.f42462d;
    }

    public int getDividerThickness() {
        return this.f42460b;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        int i10;
        super.onDraw(canvas);
        boolean z10 = getLayoutDirection() == 1;
        int i11 = z10 ? this.f42463e : this.f42462d;
        if (z10) {
            width = getWidth();
            i10 = this.f42462d;
        } else {
            width = getWidth();
            i10 = this.f42463e;
        }
        this.f42459a.setBounds(i11, 0, width - i10, getBottom() - getTop());
        this.f42459a.draw(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i12 = this.f42460b;
            if (i12 > 0 && measuredHeight != i12) {
                measuredHeight = i12;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i10) {
        if (this.f42461c != i10) {
            this.f42461c = i10;
            this.f42459a.d0(ColorStateList.valueOf(i10));
            invalidate();
        }
    }

    public void setDividerColorResource(int i10) {
        setDividerColor(AbstractC7194b.c(getContext(), i10));
    }

    public void setDividerInsetEnd(int i10) {
        this.f42463e = i10;
    }

    public void setDividerInsetEndResource(int i10) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(int i10) {
        this.f42462d = i10;
    }

    public void setDividerInsetStartResource(int i10) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(int i10) {
        if (this.f42460b != i10) {
            this.f42460b = i10;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i10) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i10));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f42458f;
        super(a.d(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        this.f42459a = new h();
        TypedArray typedArrayI = m.i(context2, attributeSet, AbstractC5848k.f55252r3, i10, i11, new int[0]);
        this.f42460b = typedArrayI.getDimensionPixelSize(AbstractC5848k.f55284v3, getResources().getDimensionPixelSize(AbstractC5840c.f54689I));
        this.f42462d = typedArrayI.getDimensionPixelOffset(AbstractC5848k.f55276u3, 0);
        this.f42463e = typedArrayI.getDimensionPixelOffset(AbstractC5848k.f55268t3, 0);
        setDividerColor(c.a(context2, typedArrayI, AbstractC5848k.f55260s3).getDefaultColor());
        typedArrayI.recycle();
    }
}
