package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class R5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.d f40945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f40946b;

    public R5(com.google.android.gms.common.util.d dVar) {
        AbstractC2115p.l(dVar);
        this.f40945a = dVar;
    }

    public final void a() {
        this.f40946b = this.f40945a.c();
    }

    public final void b() {
        this.f40946b = 0L;
    }

    public final boolean c(long j10) {
        return this.f40946b == 0 || this.f40945a.c() - this.f40946b >= 3600000;
    }
}
