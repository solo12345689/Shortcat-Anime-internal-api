package com.swmansion.worklets;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class AndroidUIScheduler {
    private final ReactApplicationContext mContext;
    private final AtomicBoolean mActive = new AtomicBoolean(true);
    private final Runnable mUIThreadRunnable = new Runnable() { // from class: com.swmansion.worklets.a
        @Override // java.lang.Runnable
        public final void run() {
            this.f44822a.lambda$new$0();
        }
    };
    private final HybridData mHybridData = initHybrid();

    public AndroidUIScheduler(ReactApplicationContext reactApplicationContext) {
        this.mContext = reactApplicationContext;
    }

    private native HybridData initHybrid();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        synchronized (this.mActive) {
            try {
                if (this.mActive.get()) {
                    triggerUI();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void scheduleTriggerOnUI() {
        UiThreadUtil.runOnUiThread(new GuardedRunnable(this.mContext.getExceptionHandler()) { // from class: com.swmansion.worklets.AndroidUIScheduler.1
            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                AndroidUIScheduler.this.mUIThreadRunnable.run();
            }
        });
    }

    public void deactivate() {
        synchronized (this.mActive) {
            this.mActive.set(false);
            invalidate();
        }
    }

    public native void invalidate();

    public native void triggerUI();
}
