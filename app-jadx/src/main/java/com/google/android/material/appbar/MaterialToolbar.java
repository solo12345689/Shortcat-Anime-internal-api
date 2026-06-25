package com.google.android.material.appbar;

import H9.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.m;
import com.google.android.material.internal.n;
import i.AbstractC4956a;
import o9.AbstractC5847j;
import o9.AbstractC5848k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private static final int f41877B0 = AbstractC5847j.f54871C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private static final ImageView.ScaleType[] f41878C0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private Boolean f41879A0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private Integer f41880w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private boolean f41881x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private boolean f41882y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private ImageView.ScaleType f41883z0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4956a.f47953O);
    }

    private Pair S(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i10 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i10 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i10 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void T(Context context) {
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : com.google.android.material.drawable.d.f(background);
        if (colorStateListValueOf != null) {
            H9.h hVar = new H9.h();
            hVar.d0(colorStateListValueOf);
            hVar.R(context);
            hVar.c0(getElevation());
            setBackground(hVar);
        }
    }

    private void U(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i10 += iMax;
            i11 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i10, view.getTop(), i11, view.getBottom());
    }

    private void V() {
        if (this.f41881x0 || this.f41882y0) {
            TextView textViewE = n.e(this);
            TextView textViewC = n.c(this);
            if (textViewE == null && textViewC == null) {
                return;
            }
            Pair pairS = S(textViewE, textViewC);
            if (this.f41881x0 && textViewE != null) {
                U(textViewE, pairS);
            }
            if (!this.f41882y0 || textViewC == null) {
                return;
            }
            U(textViewC, pairS);
        }
    }

    private Drawable W(Drawable drawable) {
        if (drawable == null || this.f41880w0 == null) {
            return drawable;
        }
        Drawable drawableR = B1.a.r(drawable.mutate());
        drawableR.setTint(this.f41880w0.intValue());
        return drawableR;
    }

    private void X() {
        ImageView imageViewB = n.b(this);
        if (imageViewB != null) {
            Boolean bool = this.f41879A0;
            if (bool != null) {
                imageViewB.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f41883z0;
            if (scaleType != null) {
                imageViewB.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f41883z0;
    }

    public Integer getNavigationIconTint() {
        return this.f41880w0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        i.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        V();
        X();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        i.d(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f41879A0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f41879A0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f41883z0 != scaleType) {
            this.f41883z0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(W(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.f41880w0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f41882y0 != z10) {
            this.f41882y0 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f41881x0 != z10) {
            this.f41881x0 = z10;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f41877B0;
        super(K9.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayI = m.i(context2, attributeSet, AbstractC5848k.f55038R3, i10, i11, new int[0]);
        if (typedArrayI.hasValue(AbstractC5848k.f55062U3)) {
            setNavigationIconTint(typedArrayI.getColor(AbstractC5848k.f55062U3, -1));
        }
        this.f41881x0 = typedArrayI.getBoolean(AbstractC5848k.f55078W3, false);
        this.f41882y0 = typedArrayI.getBoolean(AbstractC5848k.f55070V3, false);
        int i12 = typedArrayI.getInt(AbstractC5848k.f55054T3, -1);
        if (i12 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f41878C0;
            if (i12 < scaleTypeArr.length) {
                this.f41883z0 = scaleTypeArr[i12];
            }
        }
        if (typedArrayI.hasValue(AbstractC5848k.f55046S3)) {
            this.f41879A0 = Boolean.valueOf(typedArrayI.getBoolean(AbstractC5848k.f55046S3, false));
        }
        typedArrayI.recycle();
        T(context2);
    }
}
