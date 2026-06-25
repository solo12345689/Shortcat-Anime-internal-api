package io.sentry.android.core;

import android.os.Debug;
import io.sentry.C5248p1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C implements io.sentry.W {
    @Override // io.sentry.W
    public void d(C5248p1 c5248p1) {
        long jFreeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long nativeHeapSize = Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize();
        c5248p1.f(Long.valueOf(jFreeMemory));
        c5248p1.g(Long.valueOf(nativeHeapSize));
    }

    @Override // io.sentry.W
    public void c() {
    }
}
