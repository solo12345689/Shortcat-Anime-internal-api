package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.f4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3807f4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f41291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3937x4 f41292b;

    RunnableC3807f4(C3937x4 c3937x4, AtomicReference atomicReference) {
        this.f41291a = atomicReference;
        Objects.requireNonNull(c3937x4);
        this.f41292b = c3937x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f41291a;
        synchronized (atomicReference) {
            try {
                try {
                    C3937x4 c3937x4 = this.f41292b;
                    atomicReference.set(Double.valueOf(c3937x4.f40611a.w().G(c3937x4.f40611a.L().q(), AbstractC3789d2.f41209f0)));
                } finally {
                    this.f41291a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
