package com.shopify.reactnative.skia;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.RuntimeExecutor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
abstract class h {
    public static RuntimeExecutor a(ReactContext reactContext) {
        return reactContext.getCatalystInstance().getRuntimeExecutor();
    }
}
