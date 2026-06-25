package com.swmansion.worklets.runloop;

import com.facebook.jni.HybridData;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class AnimationFrameCallback {
    private final HybridData mHybridData;

    private AnimationFrameCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void onAnimationFrame(double d10);
}
