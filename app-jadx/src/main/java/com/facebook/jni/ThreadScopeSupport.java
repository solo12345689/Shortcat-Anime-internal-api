package com.facebook.jni;

import R7.a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class ThreadScopeSupport {
    static {
        a.d("fbjni");
    }

    private static void runStdFunction(long j10) {
        runStdFunctionImpl(j10);
    }

    private static native void runStdFunctionImpl(long j10);
}
