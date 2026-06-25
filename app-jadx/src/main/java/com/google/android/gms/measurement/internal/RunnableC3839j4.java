package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.j4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3839j4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ E3 f41385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f41386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f41387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3937x4 f41388d;

    RunnableC3839j4(C3937x4 c3937x4, E3 e32, long j10, boolean z10) {
        this.f41385a = e32;
        this.f41386b = j10;
        this.f41387c = z10;
        Objects.requireNonNull(c3937x4);
        this.f41388d = c3937x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3937x4 c3937x4 = this.f41388d;
        E3 e32 = this.f41385a;
        c3937x4.o(e32);
        c3937x4.X(e32, this.f41386b, false, this.f41387c);
    }
}
