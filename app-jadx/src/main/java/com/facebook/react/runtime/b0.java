package com.facebook.react.runtime;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.devsupport.inspector.TracingState;
import com.facebook.react.devsupport.u0;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import d7.InterfaceC4569a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements u0, InterfaceC4569a, b7.g {

    /* JADX INFO: renamed from: a */
    private final ReactHostImpl f37271a;

    public b0(ReactHostImpl delegate) {
        AbstractC5504s.h(delegate, "delegate");
        this.f37271a = delegate;
    }

    @Override // com.facebook.react.devsupport.u0
    public Activity a() {
        return this.f37271a.getLastUsedActivity$ReactAndroid_release();
    }

    @Override // com.facebook.react.devsupport.u0
    public View b(String appKey) {
        AbstractC5504s.h(appKey, "appKey");
        Activity activityA = a();
        if (activityA == null || this.f37271a.isSurfaceWithModuleNameAttached$ReactAndroid_release(appKey)) {
            return null;
        }
        j0 j0VarD = j0.f37302e.d(activityA, appKey, new Bundle());
        j0VarD.c(this.f37271a);
        j0VarD.start();
        return j0VarD.a();
    }

    @Override // com.facebook.react.devsupport.u0
    public JavaScriptExecutorFactory c() {
        throw new IllegalStateException("Not implemented for bridgeless mode");
    }

    @Override // d7.InterfaceC4569a
    public d7.c d() {
        return this.f37271a.getReactHostInspectorTarget();
    }

    @Override // com.facebook.react.devsupport.u0
    public void e(View rootView) {
        AbstractC5504s.h(rootView, "rootView");
    }

    @Override // com.facebook.react.devsupport.u0
    public void g() {
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
        ReactContext currentReactContext = this.f37271a.getCurrentReactContext();
        if (currentReactContext == null || (rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) currentReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)) == null) {
            return;
        }
        rCTDeviceEventEmitter.emit("toggleElementInspector", null);
    }

    @Override // b7.g
    public TracingState getTracingState() {
        TracingState tracingState;
        ReactHostInspectorTarget reactHostInspectorTarget = this.f37271a.getReactHostInspectorTarget();
        return (reactHostInspectorTarget == null || (tracingState = reactHostInspectorTarget.getTracingState()) == null) ? TracingState.ENABLED_IN_CDP_MODE : tracingState;
    }

    @Override // com.facebook.react.devsupport.u0
    public void reload(String reason) {
        AbstractC5504s.h(reason, "reason");
        this.f37271a.reload(reason);
    }
}
