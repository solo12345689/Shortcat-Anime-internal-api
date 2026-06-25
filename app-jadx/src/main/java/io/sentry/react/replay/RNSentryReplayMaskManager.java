package io.sentry.react.replay;

import K7.c1;
import android.view.View;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.q0;
import k7.InterfaceC5454a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC5454a(name = "RNSentryReplayMask")
public class RNSentryReplayMaskManager extends ViewGroupManager<b> implements A0 {
    private final c1 delegate = new c1(this);

    @Override // com.facebook.react.uimanager.ViewManager
    /* JADX INFO: renamed from: getDelegate */
    public q0 getMDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSentryReplayMask";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public b createViewInstance(C3284b0 c3284b0) {
        return new b(c3284b0);
    }
}
