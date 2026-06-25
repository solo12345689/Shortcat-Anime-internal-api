package com.facebook.react.uimanager;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G f37521a = new G();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Rect f37522b = new Rect();

    private G() {
    }

    public static final void a(View view, Rect outputRect) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(outputRect, "outputRect");
        ViewParent parent = view.getParent();
        if (parent == null) {
            outputRect.setEmpty();
            return;
        }
        if (parent instanceof F) {
            F f10 = (F) parent;
            if (f10.getRemoveClippedSubviews()) {
                Rect rect = f37522b;
                f10.getClippingRect(rect);
                if (!rect.intersect(view.getLeft(), view.getTop() + ((int) view.getTranslationY()), view.getRight(), view.getBottom() + ((int) view.getTranslationY()))) {
                    outputRect.setEmpty();
                    return;
                }
                rect.offset(-view.getLeft(), -view.getTop());
                rect.offset(-((int) view.getTranslationX()), -((int) view.getTranslationY()));
                rect.offset(view.getScrollX(), view.getScrollY());
                outputRect.set(rect);
                return;
            }
        }
        view.getDrawingRect(outputRect);
    }
}
