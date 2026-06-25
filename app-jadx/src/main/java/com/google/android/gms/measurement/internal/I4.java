package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class I4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f40800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ M4 f40801b;

    I4(M4 m42, long j10) {
        this.f40800a = j10;
        Objects.requireNonNull(m42);
        this.f40801b = m42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        M4 m42 = this.f40801b;
        m42.f40611a.M().k(this.f40800a);
        m42.f40857e = null;
    }
}
