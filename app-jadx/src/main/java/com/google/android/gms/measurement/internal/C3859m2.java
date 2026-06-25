package com.google.android.gms.measurement.internal;

import R8.AbstractC2119u;
import R8.C2112m;
import R8.C2118t;
import R8.C2121w;
import R8.InterfaceC2120v;
import android.content.Context;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import n9.InterfaceC5761e;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.m2 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3859m2 {

    /* JADX INFO: renamed from: d */
    private static C3859m2 f41425d;

    /* JADX INFO: renamed from: a */
    private final X2 f41426a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC2120v f41427b;

    /* JADX INFO: renamed from: c */
    private final AtomicLong f41428c = new AtomicLong(-1);

    private C3859m2(Context context, X2 x22) {
        this.f41427b = AbstractC2119u.b(context, C2121w.a().b("measurement:api").a());
        this.f41426a = x22;
    }

    static C3859m2 a(X2 x22) {
        if (f41425d == null) {
            f41425d = new C3859m2(x22.d(), x22);
        }
        return f41425d;
    }

    public final synchronized void b(int i10, int i11, long j10, long j11, int i12) {
        final long jC = this.f41426a.e().c();
        AtomicLong atomicLong = this.f41428c;
        if (atomicLong.get() != -1 && jC - atomicLong.get() <= 1800000) {
            return;
        }
        this.f41427b.c(new C2118t(0, Arrays.asList(new C2112m(36301, i11, 0, j10, j11, null, null, 0, i12)))).e(new InterfaceC5761e() { // from class: com.google.android.gms.measurement.internal.l2
            @Override // n9.InterfaceC5761e
            public final /* synthetic */ void onFailure(Exception exc) {
                this.f41411a.c(jC, exc);
            }
        });
    }

    final /* synthetic */ void c(long j10, Exception exc) {
        this.f41428c.set(j10);
    }
}
