package io.sentry.android.replay.util;

import Td.z;
import Ud.AbstractC2279u;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import io.sentry.C5322z3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r {
    public static final void a(View view, ViewTreeObserver.OnDrawListener listener) {
        AbstractC5504s.h(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().addOnDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final void b(View view, ViewTreeObserver.OnPreDrawListener listener) {
        AbstractC5504s.h(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().addOnPreDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final int c(TextView textView) {
        AbstractC5504s.h(textView, "<this>");
        try {
            return textView.getTotalPaddingTop();
        } catch (NullPointerException unused) {
            return textView.getExtendedPaddingTop();
        }
    }

    public static final List d(q qVar, Rect globalRect, int i10, int i11) {
        AbstractC5504s.h(globalRect, "globalRect");
        if (qVar == null) {
            return AbstractC2279u.e(globalRect);
        }
        ArrayList arrayList = new ArrayList();
        int iC = qVar.c();
        for (int i12 = 0; i12 < iC; i12++) {
            int iD = (int) qVar.d(i12, qVar.b(i12));
            int iH = qVar.h(i12);
            int iG = qVar.g(i12);
            int iD2 = (int) qVar.d(i12, (iG - iH) + (iH > 0 ? 1 : 0));
            if (iD2 == 0 && iG > 0) {
                iD2 = ((int) qVar.d(i12, iG - 1)) + 1;
            }
            int iA = qVar.a(i12);
            int iE = qVar.e(i12);
            Rect rect = new Rect();
            int i13 = globalRect.left + i10 + iD;
            rect.left = i13;
            rect.right = i13 + (iD2 - iD);
            int i14 = globalRect.top + i11 + iA;
            rect.top = i14;
            rect.bottom = i14 + (iE - iA);
            arrayList.add(rect);
        }
        return arrayList;
    }

    public static final boolean e(View view) {
        AbstractC5504s.h(view, "<this>");
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static final boolean f(Drawable drawable) {
        if (drawable instanceof InsetDrawable ? true : drawable instanceof ColorDrawable ? true : drawable instanceof VectorDrawable ? true : drawable instanceof GradientDrawable) {
            return false;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            return true;
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        return bitmap != null && !bitmap.isRecycled() && bitmap.getHeight() > 10 && bitmap.getWidth() > 10;
    }

    public static final Pair g(View view) {
        AbstractC5504s.h(view, "<this>");
        if (!view.isAttachedToWindow()) {
            return z.a(Boolean.FALSE, null);
        }
        if (view.getWindowVisibility() != 0) {
            return z.a(Boolean.FALSE, null);
        }
        Object parent = view;
        while (parent instanceof View) {
            float transitionAlpha = Build.VERSION.SDK_INT >= 29 ? ((View) parent).getTransitionAlpha() : 1.0f;
            View view2 = (View) parent;
            if (view2.getAlpha() <= 0.0f || transitionAlpha <= 0.0f || view2.getVisibility() != 0) {
                return z.a(Boolean.FALSE, null);
            }
            parent = view2.getParent();
        }
        Rect rect = new Rect();
        return z.a(Boolean.valueOf(view.getGlobalVisibleRect(rect, new Point())), rect);
    }

    public static final void h(View view, ViewTreeObserver.OnDrawListener listener) {
        AbstractC5504s.h(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final void i(View view, ViewTreeObserver.OnPreDrawListener listener) {
        AbstractC5504s.h(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnPreDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final int j(int i10) {
        return i10 | (-16777216);
    }

    public static final void k(View view, io.sentry.android.replay.viewhierarchy.b parentNode, C5322z3 options) {
        AbstractC5504s.h(view, "<this>");
        AbstractC5504s.h(parentNode, "parentNode");
        AbstractC5504s.h(options, "options");
        if ((view instanceof ViewGroup) && !io.sentry.android.replay.viewhierarchy.a.f50472a.b(view, parentNode, options)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != null) {
                    io.sentry.android.replay.viewhierarchy.b bVarA = io.sentry.android.replay.viewhierarchy.b.f50478m.a(childAt, parentNode, viewGroup.indexOfChild(childAt), options);
                    arrayList.add(bVarA);
                    k(childAt, bVarA, options);
                }
            }
            parentNode.f(arrayList);
        }
    }
}
