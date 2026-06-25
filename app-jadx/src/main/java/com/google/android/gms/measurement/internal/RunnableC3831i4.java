package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.i4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3831i4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ E3 f41369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f41370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f41371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3937x4 f41372d;

    RunnableC3831i4(C3937x4 c3937x4, E3 e32, long j10, boolean z10) {
        this.f41369a = e32;
        this.f41370b = j10;
        this.f41371c = z10;
        Objects.requireNonNull(c3937x4);
        this.f41372d = c3937x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3937x4 c3937x4 = this.f41372d;
        E3 e32 = this.f41369a;
        c3937x4.o(e32);
        c3937x4.X(e32, this.f41370b, true, this.f41371c);
    }
}
