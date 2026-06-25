package com.swmansion.reanimated;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.swmansion.worklets.WorkletsModule;
import k7.InterfaceC5454a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC5454a(name = NativeReanimatedModuleSpec.NAME)
public class ReanimatedModule extends NativeReanimatedModuleSpec implements LifecycleEventListener {
    private final NodesManager mNodesManager;
    private final WorkletsModule mWorkletsModule;

    public ReanimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.assertOnJSQueueThread();
        WorkletsModule workletsModule = (WorkletsModule) reactApplicationContext.getNativeModule(WorkletsModule.class);
        this.mWorkletsModule = workletsModule;
        this.mNodesManager = new NodesManager(reactApplicationContext, workletsModule);
    }

    public NodesManager getNodesManager() {
        return this.mNodesManager;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.assertOnJSQueueThread();
        reactApplicationContext.addLifecycleEventListener(this);
    }

    @Override // com.swmansion.reanimated.NativeReanimatedModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean installTurboModule() {
        getReactApplicationContext().assertOnJSQueueThread();
        this.mNodesManager.getNativeProxy().installJSIBindings();
        return true;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        this.mNodesManager.invalidate();
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mNodesManager.onHostPause();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mNodesManager.onHostResume();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }
}
