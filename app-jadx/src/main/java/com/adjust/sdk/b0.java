package com.adjust.sdk;

import com.adjust.sdk.ActivityHandler;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler.RunnableC3121m f34124a;

    public b0(ActivityHandler.RunnableC3121m runnableC3121m) {
        this.f34124a = runnableC3121m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnAdidReadListener onAdidReadListener = this.f34124a.f33966a.getOnAdidReadListener();
        if (onAdidReadListener != null) {
            onAdidReadListener.onAdidRead(null);
        }
        this.f34124a.f33966a.setOnAdidReadListener(null);
    }
}
