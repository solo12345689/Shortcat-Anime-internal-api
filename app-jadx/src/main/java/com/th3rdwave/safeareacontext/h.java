package com.th3rdwave.safeareacontext;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h {
    public static final c a(ViewGroup rootView, View view) {
        AbstractC5504s.h(rootView, "rootView");
        AbstractC5504s.h(view, "view");
        if (view.getParent() == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        try {
            rootView.offsetDescendantRectToMyCoords(view, rect);
            return new c(rect.left, rect.top, view.getWidth(), view.getHeight());
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private static final a b(View view) {
        return Build.VERSION.SDK_INT >= 30 ? d(view) : c(view);
    }

    private static final a c(View view) {
        if (view.getRootWindowInsets() == null) {
            return null;
        }
        return new a(r5.getSystemWindowInsetTop(), r5.getSystemWindowInsetRight(), Math.min(r5.getSystemWindowInsetBottom(), r5.getStableInsetBottom()), r5.getSystemWindowInsetLeft());
    }

    private static final a d(View view) {
        Insets insets;
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null || (insets = rootWindowInsets.getInsets(WindowInsets.Type.statusBars() | WindowInsets.Type.displayCutout() | WindowInsets.Type.navigationBars() | WindowInsets.Type.captionBar())) == null) {
            return null;
        }
        return new a(insets.top, insets.right, insets.bottom, insets.left);
    }

    public static final a e(View view) {
        AbstractC5504s.h(view, "view");
        if (view.getHeight() == 0) {
            return null;
        }
        View rootView = view.getRootView();
        AbstractC5504s.e(rootView);
        a aVarB = b(rootView);
        if (aVarB == null) {
            return null;
        }
        float width = rootView.getWidth();
        float height = rootView.getHeight();
        view.getGlobalVisibleRect(new Rect());
        return new a(Math.max(aVarB.d() - r3.top, 0.0f), Math.max(Math.min((r3.left + view.getWidth()) - width, 0.0f) + aVarB.c(), 0.0f), Math.max(Math.min((r3.top + view.getHeight()) - height, 0.0f) + aVarB.a(), 0.0f), Math.max(aVarB.b() - r3.left, 0.0f));
    }
}
