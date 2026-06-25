package com.swmansion.worklets;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.soloader.SoLoader;
import com.swmansion.worklets.runloop.AnimationFrameCallback;
import com.swmansion.worklets.runloop.AnimationFrameQueue;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import k7.InterfaceC5454a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC5454a(name = NativeWorkletsModuleSpec.NAME)
public class WorkletsModule extends NativeWorkletsModuleSpec implements LifecycleEventListener {
    private final AndroidUIScheduler mAndroidUIScheduler;
    private final AnimationFrameQueue mAnimationFrameQueue;
    private HybridData mHybridData;
    private final AtomicBoolean mInvalidated;
    private final WorkletsMessageQueueThread mMessageQueueThread;
    private boolean mSlowAnimationsEnabled;

    static {
        SoLoader.t("worklets");
    }

    public WorkletsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mMessageQueueThread = new WorkletsMessageQueueThread();
        this.mInvalidated = new AtomicBoolean(false);
        reactApplicationContext.assertOnJSQueueThread();
        this.mAndroidUIScheduler = new AndroidUIScheduler(reactApplicationContext);
        this.mAnimationFrameQueue = new AnimationFrameQueue(reactApplicationContext);
    }

    private native HybridData initHybrid(long j10, MessageQueueThread messageQueueThread, CallInvokerHolderImpl callInvokerHolderImpl, AndroidUIScheduler androidUIScheduler);

    private native void invalidateCpp();

    protected HybridData getHybridData() {
        return this.mHybridData;
    }

    @Override // com.swmansion.worklets.NativeWorkletsModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean installTurboModule() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.assertOnJSQueueThread();
        JavaScriptContextHolder javaScriptContextHolder = reactApplicationContext.getJavaScriptContextHolder();
        Objects.requireNonNull(javaScriptContextHolder);
        this.mHybridData = initHybrid(javaScriptContextHolder.getContext(), this.mMessageQueueThread, JSCallInvokerResolver.getJSCallInvokerHolder(reactApplicationContext), this.mAndroidUIScheduler);
        return true;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        if (this.mInvalidated.getAndSet(true)) {
            return;
        }
        HybridData hybridData = this.mHybridData;
        if (hybridData != null && hybridData.isValid()) {
            invalidateCpp();
        }
        this.mAndroidUIScheduler.deactivate();
    }

    public boolean isOnJSQueueThread() {
        return getReactApplicationContext().isOnJSQueueThread();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mAnimationFrameQueue.pause();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mAnimationFrameQueue.resume();
    }

    public void requestAnimationFrame(AnimationFrameCallback animationFrameCallback) {
        this.mAnimationFrameQueue.requestAnimationFrame(animationFrameCallback);
    }

    public void toggleSlowAnimations() {
        boolean z10 = !this.mSlowAnimationsEnabled;
        this.mSlowAnimationsEnabled = z10;
        this.mAnimationFrameQueue.enableSlowAnimations(z10, 10);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }
}
