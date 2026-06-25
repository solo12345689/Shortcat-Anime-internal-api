package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.d4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3791d4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f41259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3937x4 f41260b;

    RunnableC3791d4(C3937x4 c3937x4, AtomicReference atomicReference) {
        this.f41259a = atomicReference;
        Objects.requireNonNull(c3937x4);
        this.f41260b = c3937x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f41259a;
        synchronized (atomicReference) {
            try {
                try {
                    C3937x4 c3937x4 = this.f41260b;
                    atomicReference.set(Long.valueOf(c3937x4.f40611a.w().D(c3937x4.f40611a.L().q(), AbstractC3789d2.f41203d0)));
                } finally {
                    this.f41259a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
