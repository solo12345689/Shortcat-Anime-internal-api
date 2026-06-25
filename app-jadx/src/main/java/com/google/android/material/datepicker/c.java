package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import o9.AbstractC5838a;
import o9.AbstractC5848k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f42337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f42338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final b f42339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final b f42340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final b f42341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final b f42342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final b f42343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Paint f42344h;

    c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(E9.b.f(context, AbstractC5838a.f54636g0, i.class.getCanonicalName()), AbstractC5848k.f54973J2);
        this.f42337a = b.a(context, typedArrayObtainStyledAttributes.getResourceId(AbstractC5848k.f55005N2, 0));
        this.f42343g = b.a(context, typedArrayObtainStyledAttributes.getResourceId(AbstractC5848k.f54989L2, 0));
        this.f42338b = b.a(context, typedArrayObtainStyledAttributes.getResourceId(AbstractC5848k.f54997M2, 0));
        this.f42339c = b.a(context, typedArrayObtainStyledAttributes.getResourceId(AbstractC5848k.f55013O2, 0));
        ColorStateList colorStateListA = E9.c.a(context, typedArrayObtainStyledAttributes, AbstractC5848k.f55021P2);
        this.f42340d = b.a(context, typedArrayObtainStyledAttributes.getResourceId(AbstractC5848k.f55037R2, 0));
        this.f42341e = b.a(context, typedArrayObtainStyledAttributes.getResourceId(AbstractC5848k.f55029Q2, 0));
        this.f42342f = b.a(context, typedArrayObtainStyledAttributes.getResourceId(AbstractC5848k.f55045S2, 0));
        Paint paint = new Paint();
        this.f42344h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
