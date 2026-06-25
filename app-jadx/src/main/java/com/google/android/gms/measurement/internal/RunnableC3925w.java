package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.w */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3925w implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C3 f41675a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AbstractC3932x f41676b;

    RunnableC3925w(AbstractC3932x abstractC3932x, C3 c32) {
        this.f41675a = c32;
        Objects.requireNonNull(abstractC3932x);
        this.f41676b = abstractC3932x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3 c32 = this.f41675a;
        c32.c();
        if (C3802f.a()) {
            c32.b().t(this);
            return;
        }
        AbstractC3932x abstractC3932x = this.f41676b;
        boolean zC = abstractC3932x.c();
        abstractC3932x.e(0L);
        if (zC) {
            abstractC3932x.a();
        }
    }
}
