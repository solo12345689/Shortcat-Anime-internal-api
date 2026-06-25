package com.shopify.reactnative.skia;

import K7.f1;
import K7.g1;
import android.view.View;
import com.facebook.react.uimanager.C3284b0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class SkiaPictureViewManager extends SkiaBaseViewManager<SkiaPictureView> implements g1 {
    protected f1 mDelegate = new f1(this);

    SkiaPictureViewManager() {
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SkiaPictureView";
    }

    @Override // K7.g1
    public void setColorSpace(SkiaPictureView skiaPictureView, String str) {
    }

    @Override // K7.g1
    @B7.a(name = "debug")
    public /* bridge */ /* synthetic */ void setDebug(View view, boolean z10) {
        super.setDebug((i) view, z10);
    }

    @Override // K7.g1
    @B7.a(name = "opaque")
    public /* bridge */ /* synthetic */ void setOpaque(View view, boolean z10) {
        super.setOpaque((i) view, z10);
    }

    @Override // K7.g1
    @B7.a(name = "pointerEvents")
    public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
        super.setPointerEvents((i) view, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* JADX INFO: renamed from: getDelegate */
    public f1 getMDelegate() {
        return this.mDelegate;
    }

    @Override // K7.g1
    public void setAndroidWarmup(SkiaPictureView skiaPictureView, boolean z10) {
        skiaPictureView.setAndroidWarmup(z10);
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public SkiaPictureView createViewInstance(C3284b0 c3284b0) {
        return new SkiaPictureView(c3284b0);
    }
}
