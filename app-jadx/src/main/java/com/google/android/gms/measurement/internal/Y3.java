package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class Y3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f41061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f41062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f41063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3937x4 f41064d;

    Y3(C3937x4 c3937x4, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f41061a = atomicReference;
        this.f41062b = str2;
        this.f41063c = str3;
        Objects.requireNonNull(c3937x4);
        this.f41064d = c3937x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41064d.f40611a.J().e0(this.f41061a, null, this.f41062b, this.f41063c);
    }
}
