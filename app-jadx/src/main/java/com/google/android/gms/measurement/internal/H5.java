package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class H5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final long f40791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f40792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ I5 f40793c;

    H5(I5 i52, long j10, long j11) {
        Objects.requireNonNull(i52);
        this.f40793c = i52;
        this.f40791a = j10;
        this.f40792b = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40793c.f40803b.f40611a.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.G5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                H5 h52 = this.f40784a;
                N5 n52 = h52.f40793c.f40803b;
                n52.h();
                X2 x22 = n52.f40611a;
                x22.a().v().a("Application going to the background");
                x22.x().f40731t.b(true);
                n52.o(true);
                if (!x22.w().N()) {
                    long j10 = h52.f40792b;
                    L5 l52 = n52.f40880f;
                    l52.d(false, false, j10);
                    l52.b(j10);
                }
                x22.a().u().b("Application backgrounded at: timestamp_millis", Long.valueOf(h52.f40791a));
                X2 x23 = n52.f40611a;
                C3937x4 c3937x4B = x23.B();
                c3937x4B.h();
                X2 x24 = c3937x4B.f40611a;
                c3937x4B.j();
                C3931w5 c3931w5J = x24.J();
                c3931w5J.h();
                c3931w5J.j();
                if (!c3931w5J.y() || c3931w5J.f40611a.C().W() >= 242600) {
                    x24.J().t();
                }
                if (x22.w().H(null, AbstractC3789d2.f41170O0)) {
                    long jD = x22.C().P(x22.d().getPackageName(), x22.w().R()) ? 1000L : x22.w().D(x22.d().getPackageName(), AbstractC3789d2.f41149E);
                    x22.a().w().b("[sgtm] Scheduling batch upload with minimum latency in millis", Long.valueOf(jD));
                    x23.N().o(jD);
                }
            }
        });
    }
}
