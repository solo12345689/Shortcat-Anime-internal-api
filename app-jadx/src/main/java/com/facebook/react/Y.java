package com.facebook.react;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface Y {
    ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str);

    Collection getViewManagerNames(ReactApplicationContext reactApplicationContext);
}
