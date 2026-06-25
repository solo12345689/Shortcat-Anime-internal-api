package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.g4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3815g4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Boolean f41325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3937x4 f41326b;

    RunnableC3815g4(C3937x4 c3937x4, Boolean bool) {
        this.f41325a = bool;
        Objects.requireNonNull(c3937x4);
        this.f41326b = c3937x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41326b.W(this.f41325a, true);
    }
}
