package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.c4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3783c4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f41129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3937x4 f41130b;

    RunnableC3783c4(C3937x4 c3937x4, AtomicReference atomicReference) {
        this.f41129a = atomicReference;
        Objects.requireNonNull(c3937x4);
        this.f41130b = c3937x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f41129a;
        synchronized (atomicReference) {
            try {
                try {
                    C3937x4 c3937x4 = this.f41130b;
                    atomicReference.set(c3937x4.f40611a.w().C(c3937x4.f40611a.L().q(), AbstractC3789d2.f41200c0));
                } finally {
                    this.f41129a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
