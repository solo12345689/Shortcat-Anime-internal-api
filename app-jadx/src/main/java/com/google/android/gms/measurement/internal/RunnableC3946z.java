package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3946z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f41798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f41799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C0 f41800c;

    RunnableC3946z(C0 c02, String str, long j10) {
        this.f41798a = str;
        this.f41799b = j10;
        Objects.requireNonNull(c02);
        this.f41800c = c02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41800c.m(this.f41798a, this.f41799b);
    }
}
