package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class T3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f40977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3937x4 f40978b;

    T3(C3937x4 c3937x4, AtomicReference atomicReference) {
        this.f40977a = atomicReference;
        Objects.requireNonNull(c3937x4);
        this.f40978b = c3937x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f40977a;
        synchronized (atomicReference) {
            try {
                try {
                    C3937x4 c3937x4 = this.f40978b;
                    atomicReference.set(Boolean.valueOf(c3937x4.f40611a.w().H(c3937x4.f40611a.L().q(), AbstractC3789d2.f41197b0)));
                } finally {
                    this.f40977a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
