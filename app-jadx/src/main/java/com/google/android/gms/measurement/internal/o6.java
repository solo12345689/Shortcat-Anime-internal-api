package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q6 f41482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41483b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f41484c = d();

    public o6(q6 q6Var) {
        this.f41482a = q6Var;
    }

    private final long d() {
        q6 q6Var = this.f41482a;
        AbstractC2115p.l(q6Var);
        long jLongValue = ((Long) AbstractC3789d2.f41247v.b(null)).longValue();
        long jLongValue2 = ((Long) AbstractC3789d2.f41249w.b(null)).longValue();
        for (int i10 = 1; i10 < this.f41483b; i10++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        return q6Var.e().a() + Math.min(jLongValue, jLongValue2);
    }

    public final void a() {
        this.f41483b++;
        this.f41484c = d();
    }

    public final boolean b() {
        return this.f41482a.e().a() >= this.f41484c;
    }

    final /* synthetic */ long c() {
        return this.f41484c;
    }
}
