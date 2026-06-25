package com.swmansion.worklets.runloop;

import android.os.SystemClock;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.core.b;
import com.facebook.react.uimanager.AbstractChoreographerFrameCallbackC3296l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class AnimationFrameQueue {
    private double lastFrameTimeMs;
    private final AbstractChoreographerFrameCallbackC3296l mChoreographerCallback;
    private Long mFirstUptime = Long.valueOf(SystemClock.uptimeMillis());
    private boolean mSlowAnimationsEnabled = false;
    private int mAnimationsDragFactor = 1;
    private final b mReactChoreographer = b.h();
    private final AtomicBoolean mCallbackPosted = new AtomicBoolean();
    private final AtomicBoolean mPaused = new AtomicBoolean();
    private final List<AnimationFrameCallback> mFrameCallbacks = new ArrayList();

    public AnimationFrameQueue(ReactApplicationContext reactApplicationContext) {
        this.mChoreographerCallback = new AbstractChoreographerFrameCallbackC3296l(reactApplicationContext) { // from class: com.swmansion.worklets.runloop.AnimationFrameQueue.1
            @Override // com.facebook.react.uimanager.AbstractChoreographerFrameCallbackC3296l
            protected void doFrameGuarded(long j10) {
                AnimationFrameQueue.this.executeQueue(j10);
            }
        };
    }

    private double calculateTimestamp(long j10) {
        double d10 = j10 / 1000000.0d;
        return this.mSlowAnimationsEnabled ? this.mFirstUptime.longValue() + ((d10 - this.mFirstUptime.longValue()) / ((double) this.mAnimationsDragFactor)) : d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeQueue(long j10) {
        double dCalculateTimestamp = calculateTimestamp(j10);
        if (dCalculateTimestamp <= this.lastFrameTimeMs) {
            this.mCallbackPosted.set(false);
            scheduleQueueExecution();
            return;
        }
        List<AnimationFrameCallback> listPullCallbacks = pullCallbacks();
        this.mCallbackPosted.set(false);
        this.lastFrameTimeMs = dCalculateTimestamp;
        Iterator<AnimationFrameCallback> it = listPullCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onAnimationFrame(dCalculateTimestamp);
        }
    }

    private List<AnimationFrameCallback> pullCallbacks() {
        ArrayList arrayList;
        synchronized (this.mFrameCallbacks) {
            arrayList = new ArrayList(this.mFrameCallbacks);
            this.mFrameCallbacks.clear();
        }
        return arrayList;
    }

    private void scheduleQueueExecution() {
        synchronized (this.mPaused) {
            try {
                if (!this.mPaused.get() && !this.mCallbackPosted.getAndSet(true)) {
                    this.mReactChoreographer.k(b.a.f36986d, this.mChoreographerCallback);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void enableSlowAnimations(boolean z10, int i10) {
        this.mSlowAnimationsEnabled = z10;
        this.mAnimationsDragFactor = i10;
        if (z10) {
            this.mFirstUptime = Long.valueOf(SystemClock.uptimeMillis());
        }
    }

    public void pause() {
        synchronized (this.mPaused) {
            try {
                if (!this.mPaused.getAndSet(true) && this.mCallbackPosted.getAndSet(false)) {
                    this.mReactChoreographer.n(b.a.f36986d, this.mChoreographerCallback);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void requestAnimationFrame(AnimationFrameCallback animationFrameCallback) {
        synchronized (this.mFrameCallbacks) {
            this.mFrameCallbacks.add(animationFrameCallback);
        }
        scheduleQueueExecution();
    }

    public void resume() {
        if (this.mPaused.getAndSet(false)) {
            scheduleQueueExecution();
        }
    }
}
