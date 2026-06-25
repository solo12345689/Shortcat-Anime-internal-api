package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.x2 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3935x2 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ boolean f41743a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C3942y2 f41744b;

    RunnableC3935x2(C3942y2 c3942y2, boolean z10) {
        this.f41743a = z10;
        Objects.requireNonNull(c3942y2);
        this.f41744b = c3942y2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41744b.c().s0(this.f41743a);
    }
}
