package com.google.android.material.internal;

import A1.AbstractC1002a;
import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.core.view.AbstractC2775o0;
import x9.AbstractC7066a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static void a(Window window, boolean z10, Integer num, Integer num2) {
        boolean z11 = num == null || num.intValue() == 0;
        boolean z12 = num2 == null || num2.intValue() == 0;
        if (z11 || z12) {
            int iB = AbstractC7066a.b(window.getContext(), R.attr.colorBackground, -16777216);
            if (z11) {
                num = Integer.valueOf(iB);
            }
            if (z12) {
                num2 = Integer.valueOf(iB);
            }
        }
        AbstractC2775o0.b(window, !z10);
        int iC = c(window.getContext(), z10);
        int iB2 = b(window.getContext(), z10);
        window.setStatusBarColor(iC);
        window.setNavigationBarColor(iB2);
        f(window, d(iC, AbstractC7066a.h(num.intValue())));
        e(window, d(iB2, AbstractC7066a.h(num2.intValue())));
    }

    private static int b(Context context, boolean z10) {
        if (z10 && Build.VERSION.SDK_INT < 27) {
            return AbstractC1002a.k(AbstractC7066a.b(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z10) {
            return 0;
        }
        return AbstractC7066a.b(context, R.attr.navigationBarColor, -16777216);
    }

    private static int c(Context context, boolean z10) {
        if (z10) {
            return 0;
        }
        return AbstractC7066a.b(context, R.attr.statusBarColor, -16777216);
    }

    private static boolean d(int i10, boolean z10) {
        if (AbstractC7066a.h(i10)) {
            return true;
        }
        return i10 == 0 && z10;
    }

    public static void e(Window window, boolean z10) {
        AbstractC2775o0.a(window, window.getDecorView()).d(z10);
    }

    public static void f(Window window, boolean z10) {
        AbstractC2775o0.a(window, window.getDecorView()).e(z10);
    }
}
