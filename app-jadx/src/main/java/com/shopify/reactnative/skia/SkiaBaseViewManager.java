package com.shopify.reactnative.skia;

import com.facebook.react.uimanager.C;
import com.facebook.react.views.view.ReactViewManager;
import com.shopify.reactnative.skia.i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class SkiaBaseViewManager<T extends i> extends ReactViewManager {
    @B7.a(name = "debug")
    public void setDebug(T t10, boolean z10) {
        t10.setDebugMode(z10);
    }

    @B7.a(name = "opaque")
    public void setOpaque(T t10, boolean z10) {
        t10.setOpaque(z10);
    }

    @B7.a(name = "pointerEvents")
    public void setPointerEvents(T t10, String str) {
        t10.setPointerEvents(C.h(str));
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(com.facebook.react.views.view.g gVar) {
        super.onDropViewInstance(gVar);
        ((i) gVar).B();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setNativeId(com.facebook.react.views.view.g gVar, String str) {
        super.setNativeId(gVar, str);
        ((i) gVar).registerView(Integer.parseInt(str));
    }
}
