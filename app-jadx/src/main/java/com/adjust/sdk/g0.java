package com.adjust.sdk;

import com.adjust.sdk.AdjustInstance;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class g0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f34136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdjustInstance.k f34137b;

    public g0(AdjustInstance.k kVar, String str) {
        this.f34137b = kVar;
        this.f34136a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34137b.f34002b.onAdidRead(this.f34136a);
    }
}
