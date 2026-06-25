package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: com.facebook.react.uimanager.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3297m extends InterfaceC3298n {
    void addView(View view, View view2, int i10);

    View getChildAt(View view, int i10);

    int getChildCount(View view);

    default void removeAllViews(View parent) {
        AbstractC5504s.h(parent, "parent");
        UiThreadUtil.assertOnUiThread();
        int childCount = getChildCount(parent);
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return;
            } else {
                removeViewAt(parent, childCount);
            }
        }
    }

    void removeViewAt(View view, int i10);
}
