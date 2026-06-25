package com.adjust.sdk;

import com.adjust.sdk.AdjustInstance;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class h0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdjustAttribution f34140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdjustInstance.l f34141b;

    public h0(AdjustInstance.l lVar, AdjustAttribution adjustAttribution) {
        this.f34141b = lVar;
        this.f34140a = adjustAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34141b.f34006b.onAttributionRead(this.f34140a);
    }
}
