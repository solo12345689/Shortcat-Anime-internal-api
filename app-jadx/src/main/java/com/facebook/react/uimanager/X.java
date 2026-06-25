package com.facebook.react.uimanager;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X f37537a = new X();

    private X() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final W a(View reactView) {
        AbstractC5504s.h(reactView, "reactView");
        View view = reactView;
        while (!(view instanceof W)) {
            Object parent = view.getParent();
            if (parent == null) {
                return null;
            }
            Q6.a.a(parent instanceof View);
            view = (View) parent;
        }
        return (W) view;
    }

    public static final Point b(View v10) {
        AbstractC5504s.h(v10, "v");
        int[] iArr = new int[2];
        v10.getLocationInWindow(iArr);
        Rect rect = new Rect();
        v10.getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr[0] - rect.left;
        iArr[1] = iArr[1] - rect.top;
        return new Point(iArr[0], iArr[1]);
    }
}
