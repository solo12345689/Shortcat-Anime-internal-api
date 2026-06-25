package com.swmansion.rnscreens.gamma.tabs;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends AbstractComponentCallbacksC2838q {

    /* JADX INFO: renamed from: a */
    private final a f44558a;

    public e(a tabScreen) {
        AbstractC5504s.h(tabScreen, "tabScreen");
        this.f44558a = tabScreen;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC5504s.h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        this.f44558a.c(this, newConfig);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5504s.h(inflater, "inflater");
        return this.f44558a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onPause() {
        this.f44558a.getEventEmitter$react_native_screens_release().a();
        super.onPause();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onResume() {
        this.f44558a.getEventEmitter$react_native_screens_release().c();
        super.onResume();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onStart() {
        this.f44558a.getEventEmitter$react_native_screens_release().d();
        super.onStart();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onStop() {
        this.f44558a.getEventEmitter$react_native_screens_release().b();
        super.onStop();
    }

    public final a w() {
        return this.f44558a;
    }
}
