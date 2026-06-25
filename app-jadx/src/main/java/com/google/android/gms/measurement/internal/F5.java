package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class F5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f40761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ N5 f40762b;

    F5(N5 n52, long j10) {
        this.f40761a = j10;
        Objects.requireNonNull(n52);
        this.f40762b = n52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40762b.s(this.f40761a);
    }
}
