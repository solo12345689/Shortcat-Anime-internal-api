package androidx.appcompat.widget;

import A1.AbstractC1002a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f25373a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f25374b = {-16842910};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int[] f25375c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int[] f25376d = {R.attr.state_activated};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int[] f25377e = {R.attr.state_pressed};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int[] f25378f = {R.attr.state_checked};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int[] f25379g = {R.attr.state_selected};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int[] f25380h = {-16842919, -16842908};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int[] f25381i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f25382j = new int[1];

    public static void a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i.j.f48379y0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(i.j.f48146D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i10) {
        ColorStateList colorStateListE = e(context, i10);
        if (colorStateListE != null && colorStateListE.isStateful()) {
            return colorStateListE.getColorForState(f25374b, colorStateListE.getDefaultColor());
        }
        TypedValue typedValueF = f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueF, true);
        return d(context, i10, typedValueF.getFloat());
    }

    public static int c(Context context, int i10) {
        int[] iArr = f25382j;
        iArr[0] = i10;
        h0 h0VarU = h0.u(context, null, iArr);
        try {
            return h0VarU.b(0, 0);
        } finally {
            h0VarU.x();
        }
    }

    static int d(Context context, int i10, float f10) {
        return AbstractC1002a.k(c(context, i10), Math.round(Color.alpha(r0) * f10));
    }

    public static ColorStateList e(Context context, int i10) {
        int[] iArr = f25382j;
        iArr[0] = i10;
        h0 h0VarU = h0.u(context, null, iArr);
        try {
            return h0VarU.c(0);
        } finally {
            h0VarU.x();
        }
    }

    private static TypedValue f() {
        ThreadLocal threadLocal = f25373a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
