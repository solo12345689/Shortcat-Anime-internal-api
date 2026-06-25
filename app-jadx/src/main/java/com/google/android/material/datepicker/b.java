package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import o9.AbstractC5848k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f42331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ColorStateList f42332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ColorStateList f42333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ColorStateList f42334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f42335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final H9.l f42336f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, H9.l lVar, Rect rect) {
        K1.f.d(rect.left);
        K1.f.d(rect.top);
        K1.f.d(rect.right);
        K1.f.d(rect.bottom);
        this.f42331a = rect;
        this.f42332b = colorStateList2;
        this.f42333c = colorStateList;
        this.f42334d = colorStateList3;
        this.f42335e = i10;
        this.f42336f = lVar;
    }

    static b a(Context context, int i10) {
        K1.f.b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, AbstractC5848k.f55053T2);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC5848k.f55061U2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC5848k.f55077W2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC5848k.f55069V2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC5848k.f55085X2, 0));
        ColorStateList colorStateListA = E9.c.a(context, typedArrayObtainStyledAttributes, AbstractC5848k.f55093Y2);
        ColorStateList colorStateListA2 = E9.c.a(context, typedArrayObtainStyledAttributes, AbstractC5848k.f55137d3);
        ColorStateList colorStateListA3 = E9.c.a(context, typedArrayObtainStyledAttributes, AbstractC5848k.f55119b3);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC5848k.f55128c3, 0);
        H9.l lVarM = H9.l.b(context, typedArrayObtainStyledAttributes.getResourceId(AbstractC5848k.f55101Z2, 0), typedArrayObtainStyledAttributes.getResourceId(AbstractC5848k.f55110a3, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new b(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, lVarM, rect);
    }

    void b(TextView textView) {
        c(textView, null, null);
    }

    void c(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        H9.h hVar = new H9.h();
        H9.h hVar2 = new H9.h();
        hVar.setShapeAppearanceModel(this.f42336f);
        hVar2.setShapeAppearanceModel(this.f42336f);
        if (colorStateList == null) {
            colorStateList = this.f42333c;
        }
        hVar.d0(colorStateList);
        hVar.k0(this.f42335e, this.f42334d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f42332b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f42332b.withAlpha(30), hVar, hVar2);
        Rect rect = this.f42331a;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
