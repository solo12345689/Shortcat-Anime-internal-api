package com.facebook.react.uimanager;

import android.util.DisplayMetrics;
import android.util.TypedValue;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f37368a = new B();

    private B() {
    }

    public static final float d() {
        return C3289e.e().density;
    }

    public static final float g(float f10) {
        if (Float.isNaN(f10)) {
            return Float.NaN;
        }
        return f10 / C3289e.e().density;
    }

    public static final float h(double d10) {
        return i((float) d10);
    }

    public static final float i(float f10) {
        if (Float.isNaN(f10)) {
            return Float.NaN;
        }
        return TypedValue.applyDimension(1, f10, C3289e.e());
    }

    public static final float j(double d10) {
        return m((float) d10, 0.0f, 2, null);
    }

    public static final float k(float f10) {
        return m(f10, 0.0f, 2, null);
    }

    public static final float l(float f10, float f11) {
        if (Float.isNaN(f10)) {
            return Float.NaN;
        }
        DisplayMetrics displayMetricsE = C3289e.e();
        float fApplyDimension = TypedValue.applyDimension(2, f10, displayMetricsE);
        return f11 >= 1.0f ? Math.min(fApplyDimension, f10 * displayMetricsE.density * f11) : fApplyDimension;
    }

    public static /* synthetic */ float m(float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = Float.NaN;
        }
        return l(f10, f11);
    }

    public final float a(double d10) {
        return i((float) d10);
    }

    public final float b(float f10) {
        return i(f10);
    }

    public final float c(int i10) {
        return i(i10);
    }

    public final float e(float f10) {
        return g(f10);
    }

    public final float f(int i10) {
        return g(i10);
    }
}
