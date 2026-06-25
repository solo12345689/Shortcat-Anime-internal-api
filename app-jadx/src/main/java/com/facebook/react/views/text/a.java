package com.facebook.react.views.text;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f38214a = new a();

    private a() {
    }

    private final ColorStateList a(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        AbstractC5504s.g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        return typedArrayObtainStyledAttributes.getColorStateList(0);
    }

    public static final ColorStateList b(Context context) {
        AbstractC5504s.h(context, "context");
        return f38214a.a(context, R.attr.textColor);
    }

    public static final int c(Context context) {
        AbstractC5504s.h(context, "context");
        ColorStateList colorStateListA = f38214a.a(context, R.attr.textColorHighlight);
        if (colorStateListA != null) {
            return colorStateListA.getDefaultColor();
        }
        return 0;
    }

    public static final ColorStateList d(Context context) {
        AbstractC5504s.h(context, "context");
        return f38214a.a(context, R.attr.textColorHint);
    }

    public static final ColorStateList e(Context context) {
        AbstractC5504s.h(context, "context");
        return f38214a.a(context, R.attr.textColorSecondary);
    }
}
