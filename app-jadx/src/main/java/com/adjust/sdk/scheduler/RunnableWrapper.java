package com.adjust.sdk.scheduler;

import com.adjust.sdk.AdjustFactory;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableWrapper implements Runnable {
    private Runnable runnable;

    public RunnableWrapper(Runnable runnable) {
        this.runnable = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.runnable.run();
        } catch (Throwable th2) {
            AdjustFactory.getLogger().error("Runnable error [%s] of type [%s]", th2.getMessage(), th2.getClass().getCanonicalName());
        }
    }
}
