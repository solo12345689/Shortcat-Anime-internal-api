package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3771b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f41098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C0 f41099b;

    RunnableC3771b0(C0 c02, long j10) {
        this.f41098a = j10;
        Objects.requireNonNull(c02);
        this.f41099b = c02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41099b.n(this.f41098a);
    }
}
