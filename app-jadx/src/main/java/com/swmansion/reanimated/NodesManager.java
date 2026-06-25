package com.swmansion.reanimated;

import android.os.SystemClock;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.b;
import com.facebook.react.uimanager.AbstractChoreographerFrameCallbackC3296l;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.events.i;
import com.facebook.react.uimanager.f0;
import com.swmansion.reanimated.nativeProxy.NoopEventHandler;
import com.swmansion.worklets.WorkletsModule;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class NodesManager implements i {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private double lastFrameTimeMs;
    private int mAnimationsDragFactor;
    private final AbstractChoreographerFrameCallbackC3296l mChoreographerCallback;
    protected final UIManagerModule.d mCustomEventNamesResolver;
    private final DeviceEventManagerModule.RCTDeviceEventEmitter mEventEmitter;
    private FabricUIManager mFabricUIManager;
    private NativeProxy mNativeProxy;
    private final com.facebook.react.modules.core.b mReactChoreographer;
    private Long mFirstUptime = Long.valueOf(SystemClock.uptimeMillis());
    private boolean mSlowAnimationsEnabled = false;
    private final AtomicBoolean mCallbackPosted = new AtomicBoolean();
    private RCTEventEmitter mCustomEventHandler = new NoopEventHandler();
    private List<OnAnimationFrame> mFrameCallbacks = new ArrayList();
    private ConcurrentLinkedQueue<CopiedEvent> mEventQueue = new ConcurrentLinkedQueue<>();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface OnAnimationFrame {
        void onAnimationFrame(double d10);
    }

    public NodesManager(ReactApplicationContext reactApplicationContext, WorkletsModule workletsModule) {
        reactApplicationContext.assertOnJSQueueThread();
        final UIManager uIManagerG = f0.g(reactApplicationContext, 2);
        Objects.requireNonNull(uIManagerG);
        this.mCustomEventNamesResolver = new UIManagerModule.d() { // from class: com.swmansion.reanimated.b
            @Override // com.facebook.react.uimanager.UIManagerModule.d
            public final String a(String str) {
                return uIManagerG.resolveCustomDirectEventName(str);
            }
        };
        this.mEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        this.mReactChoreographer = com.facebook.react.modules.core.b.h();
        this.mChoreographerCallback = new AbstractChoreographerFrameCallbackC3296l(reactApplicationContext) { // from class: com.swmansion.reanimated.NodesManager.1
            @Override // com.facebook.react.uimanager.AbstractChoreographerFrameCallbackC3296l
            protected void doFrameGuarded(long j10) {
                NodesManager.this.onAnimationFrame(j10);
            }
        };
        this.mNativeProxy = new NativeProxy(reactApplicationContext, workletsModule, this);
        FabricUIManager fabricUIManager = (FabricUIManager) uIManagerG;
        this.mFabricUIManager = fabricUIManager;
        fabricUIManager.getEventDispatcher().c(this);
    }

    private void handleEvent(d dVar) {
        dVar.dispatch(this.mCustomEventHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAnimationFrame(long j10) {
        UiThreadUtil.assertOnUiThread();
        double dLongValue = j10 / 1000000.0d;
        if (this.mSlowAnimationsEnabled) {
            dLongValue = ((dLongValue - this.mFirstUptime.longValue()) / ((double) this.mAnimationsDragFactor)) + this.mFirstUptime.longValue();
        }
        if (dLongValue > this.lastFrameTimeMs) {
            this.lastFrameTimeMs = dLongValue;
            while (!this.mEventQueue.isEmpty()) {
                CopiedEvent copiedEventPoll = this.mEventQueue.poll();
                handleEvent(copiedEventPoll.getTargetTag(), copiedEventPoll.getEventName(), copiedEventPoll.getPayload());
            }
            if (!this.mFrameCallbacks.isEmpty()) {
                List<OnAnimationFrame> list = this.mFrameCallbacks;
                this.mFrameCallbacks = new ArrayList(list.size());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).onAnimationFrame(dLongValue);
                }
            }
            performOperations(false);
        }
        this.mCallbackPosted.set(false);
        if (this.mFrameCallbacks.isEmpty() && this.mEventQueue.isEmpty()) {
            return;
        }
        startUpdatingOnAnimationFrame();
    }

    private void stopUpdatingOnAnimationFrame() {
        if (this.mCallbackPosted.getAndSet(false)) {
            this.mReactChoreographer.n(b.a.f36986d, this.mChoreographerCallback);
        }
    }

    public void enableSlowAnimations(boolean z10, int i10) {
        this.mSlowAnimationsEnabled = z10;
        this.mAnimationsDragFactor = i10;
        if (z10) {
            this.mFirstUptime = Long.valueOf(SystemClock.uptimeMillis());
        }
    }

    public UIManagerModule.d getEventNameResolver() {
        return this.mCustomEventNamesResolver;
    }

    public NativeProxy getNativeProxy() {
        return this.mNativeProxy;
    }

    public void invalidate() {
        NativeProxy nativeProxy = this.mNativeProxy;
        if (nativeProxy != null) {
            nativeProxy.invalidate();
            this.mNativeProxy = null;
        }
        FabricUIManager fabricUIManager = this.mFabricUIManager;
        if (fabricUIManager != null) {
            fabricUIManager.getEventDispatcher().b(this);
        }
    }

    public boolean isAnimationRunning() {
        return this.mCallbackPosted.get();
    }

    @Override // com.facebook.react.uimanager.events.i
    public void onEventDispatch(d dVar) {
        if (this.mNativeProxy == null) {
            return;
        }
        if (UiThreadUtil.isOnUiThread()) {
            handleEvent(dVar);
            performOperations(true);
            return;
        }
        if (this.mNativeProxy.isAnyHandlerWaitingForEvent(this.mCustomEventNamesResolver.a(dVar.getEventName()), dVar.getViewTag())) {
            this.mEventQueue.offer(new CopiedEvent(dVar));
        }
        startUpdatingOnAnimationFrame();
    }

    public void onHostPause() {
        if (this.mCallbackPosted.get()) {
            stopUpdatingOnAnimationFrame();
            this.mCallbackPosted.set(true);
        }
    }

    public void onHostResume() {
        if (this.mCallbackPosted.getAndSet(false)) {
            startUpdatingOnAnimationFrame();
        }
    }

    public void performOperations(boolean z10) {
        UiThreadUtil.assertOnUiThread();
        NativeProxy nativeProxy = this.mNativeProxy;
        if (nativeProxy != null) {
            nativeProxy.performOperations(z10);
        }
    }

    public void postOnAnimation(OnAnimationFrame onAnimationFrame) {
        this.mFrameCallbacks.add(onAnimationFrame);
        startUpdatingOnAnimationFrame();
    }

    public void registerEventHandler(RCTEventEmitter rCTEventEmitter) {
        this.mCustomEventHandler = rCTEventEmitter;
    }

    public void sendEvent(String str, WritableMap writableMap) {
        this.mEventEmitter.emit(str, writableMap);
    }

    public void startUpdatingOnAnimationFrame() {
        if (this.mCallbackPosted.getAndSet(true)) {
            return;
        }
        this.mReactChoreographer.k(b.a.f36986d, this.mChoreographerCallback);
    }

    private void handleEvent(int i10, String str, WritableMap writableMap) {
        this.mCustomEventHandler.receiveEvent(i10, str, writableMap);
    }
}
