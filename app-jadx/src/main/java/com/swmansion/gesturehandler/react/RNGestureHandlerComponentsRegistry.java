package com.swmansion.gesturehandler.react;

import com.facebook.jni.HybridData;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.soloader.SoLoader;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class RNGestureHandlerComponentsRegistry {
    private final HybridData mHybridData;

    static {
        SoLoader.t("fabricjni");
        SoLoader.t("gesturehandler");
    }

    private RNGestureHandlerComponentsRegistry(ComponentFactory componentFactory) {
        this.mHybridData = initHybrid(componentFactory);
    }

    private native HybridData initHybrid(ComponentFactory componentFactory);

    public static RNGestureHandlerComponentsRegistry register(ComponentFactory componentFactory) {
        return new RNGestureHandlerComponentsRegistry(componentFactory);
    }
}
