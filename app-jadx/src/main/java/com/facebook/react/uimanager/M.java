package com.facebook.react.uimanager;

import android.os.Bundle;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface M {
    void b(int i10);

    void c();

    Bundle getAppProperties();

    int getHeightMeasureSpec();

    String getJSModuleName();

    ViewGroup getRootViewGroup();

    int getRootViewTag();

    AtomicInteger getState();

    String getSurfaceID();

    int getUIManagerType();

    int getWidthMeasureSpec();

    void setRootViewTag(int i10);

    void setShouldLogContentAppeared(boolean z10);
}
