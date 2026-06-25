package com.shopify.reactnative.skia;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.RuntimeExecutor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class SkiaManager {
    private ReactContext mContext;
    private HybridData mHybridData;
    private PlatformContext mPlatformContext;

    SkiaManager(ReactContext reactContext) {
        this.mContext = reactContext;
        RuntimeExecutor runtimeExecutorA = h.a(reactContext);
        this.mPlatformContext = new PlatformContext(reactContext);
        this.mHybridData = initHybrid(reactContext.getJavaScriptContextHolder().getContext(), runtimeExecutorA, this.mPlatformContext);
        initializeRuntime();
    }

    private native HybridData initHybrid(long j10, RuntimeExecutor runtimeExecutor, PlatformContext platformContext);

    private native void initializeRuntime();

    public void a() {
        this.mHybridData.resetNative();
    }

    public native void invalidate();
}
