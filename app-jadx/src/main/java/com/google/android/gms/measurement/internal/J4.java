package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class J4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ E4 f40817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f40818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ M4 f40819c;

    J4(M4 m42, E4 e42, long j10) {
        this.f40817a = e42;
        this.f40818b = j10;
        Objects.requireNonNull(m42);
        this.f40819c = m42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        M4 m42 = this.f40819c;
        m42.C(this.f40817a, false, this.f40818b);
        m42.f40857e = null;
        m42.f40611a.J().u(null);
    }
}
