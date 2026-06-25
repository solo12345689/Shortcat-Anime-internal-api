package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class P3 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ long f40908a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C3937x4 f40909b;

    P3(C3937x4 c3937x4, long j10) {
        this.f40908a = j10;
        Objects.requireNonNull(c3937x4);
        this.f40909b = c3937x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        X2 x22 = this.f40909b.f40611a;
        B2 b22 = x22.x().f40723l;
        long j10 = this.f40908a;
        b22.b(j10);
        x22.a().v().b("Session timeout duration set", Long.valueOf(j10));
    }
}
