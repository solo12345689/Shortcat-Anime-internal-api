package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class Z3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f41075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f41076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f41077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f41078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ C3937x4 f41079e;

    Z3(C3937x4 c3937x4, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.f41075a = atomicReference;
        this.f41076b = str2;
        this.f41077c = str3;
        this.f41078d = z10;
        Objects.requireNonNull(c3937x4);
        this.f41079e = c3937x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41079e.f40611a.J().g0(this.f41075a, null, this.f41076b, this.f41077c, this.f41078d);
    }
}
