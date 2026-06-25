package com.adjust.sdk;

import com.adjust.sdk.ActivityHandler;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class c0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler.RunnableC3122n f34125a;

    public c0(ActivityHandler.RunnableC3122n runnableC3122n) {
        this.f34125a = runnableC3122n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnAttributionReadListener onAttributionReadListener = this.f34125a.f33969a.getOnAttributionReadListener();
        if (onAttributionReadListener != null) {
            onAttributionReadListener.onAttributionRead(null);
        }
        this.f34125a.f33969a.setOnAttributionReadListener(null);
    }
}
