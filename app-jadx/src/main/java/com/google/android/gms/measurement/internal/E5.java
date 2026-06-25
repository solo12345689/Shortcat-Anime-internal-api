package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class E5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f40747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ N5 f40748b;

    E5(N5 n52, long j10) {
        this.f40747a = j10;
        Objects.requireNonNull(n52);
        this.f40748b = n52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40748b.r(this.f40747a);
    }
}
