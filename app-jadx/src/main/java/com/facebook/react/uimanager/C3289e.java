package com.facebook.react.uimanager;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.L0;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: com.facebook.react.uimanager.e */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3289e {

    /* JADX INFO: renamed from: a */
    public static final C3289e f37568a = new C3289e();

    /* JADX INFO: renamed from: b */
    private static DisplayMetrics f37569b;

    /* JADX INFO: renamed from: c */
    private static DisplayMetrics f37570c;

    private C3289e() {
    }

    public static final WritableMap b(double d10) {
        if (f37569b == null) {
            throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        }
        if (f37570c == null) {
            throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        C3289e c3289e = f37568a;
        DisplayMetrics displayMetrics = f37569b;
        AbstractC5504s.f(displayMetrics, "null cannot be cast to non-null type android.util.DisplayMetrics");
        writableNativeMap.putMap("windowPhysicalPixels", c3289e.d(displayMetrics, d10));
        DisplayMetrics displayMetrics2 = f37570c;
        AbstractC5504s.f(displayMetrics2, "null cannot be cast to non-null type android.util.DisplayMetrics");
        writableNativeMap.putMap("screenPhysicalPixels", c3289e.d(displayMetrics2, d10));
        return writableNativeMap;
    }

    public static final long c(Activity activity) {
        Window window;
        View decorView;
        L0 l0F;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || (l0F = AbstractC2747a0.F(decorView)) == null) {
            return 0L;
        }
        A1.b bVarF = l0F.f(L0.p.h() | L0.p.g() | L0.p.c());
        AbstractC5504s.g(bVarF, "getInsets(...)");
        int i10 = bVarF.f105b + bVarF.f107d;
        C3289e c3289e = f37568a;
        B b10 = B.f37368a;
        if (f37570c == null) {
            throw new IllegalStateException("Required value was null.");
        }
        float fE = b10.e(r2.widthPixels);
        if (f37570c != null) {
            return c3289e.a(fE, b10.e(r4.heightPixels - i10));
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final WritableMap d(DisplayMetrics displayMetrics, double d10) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("width", displayMetrics.widthPixels);
        writableNativeMap.putInt("height", displayMetrics.heightPixels);
        writableNativeMap.putDouble("scale", displayMetrics.density);
        writableNativeMap.putDouble("fontScale", d10);
        writableNativeMap.putDouble("densityDpi", displayMetrics.densityDpi);
        return writableNativeMap;
    }

    public static final DisplayMetrics e() {
        DisplayMetrics displayMetrics = f37570c;
        if (displayMetrics == null) {
            throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        }
        AbstractC5504s.f(displayMetrics, "null cannot be cast to non-null type android.util.DisplayMetrics");
        return displayMetrics;
    }

    public static final DisplayMetrics g() {
        DisplayMetrics displayMetrics = f37569b;
        if (displayMetrics == null) {
            throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        }
        AbstractC5504s.f(displayMetrics, "null cannot be cast to non-null type android.util.DisplayMetrics");
        return displayMetrics;
    }

    public static final void h(Context context) {
        AbstractC5504s.h(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        f37569b = displayMetrics;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        displayMetrics2.setTo(displayMetrics);
        Object systemService = context.getSystemService("window");
        AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics2);
        displayMetrics2.scaledDensity = displayMetrics.scaledDensity;
        f37570c = displayMetrics2;
    }

    public static final void i(Context context) {
        AbstractC5504s.h(context, "context");
        if (f37570c != null) {
            return;
        }
        h(context);
    }

    public final long a(float f10, float f11) {
        return ((long) Float.floatToRawIntBits(f11)) | (((long) Float.floatToRawIntBits(f10)) << 32);
    }

    public final int f(Activity activity) {
        Window window;
        View decorView;
        L0 l0F;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || (l0F = AbstractC2747a0.F(decorView)) == null) {
            return 0;
        }
        return l0F.f(L0.p.h() | L0.p.g() | L0.p.c()).f105b;
    }
}
