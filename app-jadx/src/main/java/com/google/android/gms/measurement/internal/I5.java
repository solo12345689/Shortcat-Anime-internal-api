package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class I5 {

    /* JADX INFO: renamed from: a */
    private H5 f40802a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ N5 f40803b;

    I5(N5 n52) {
        Objects.requireNonNull(n52);
        this.f40803b = n52;
    }

    final void a() {
        N5 n52 = this.f40803b;
        n52.h();
        H5 h52 = this.f40802a;
        if (h52 != null) {
            n52.t().removeCallbacks(h52);
        }
        X2 x22 = n52.f40611a;
        x22.x().f40731t.b(false);
        n52.o(false);
        if (x22.w().H(null, AbstractC3789d2.f41182U0)) {
            X2 x23 = n52.f40611a;
            if (x23.B().v0()) {
                x22.a().w().a("Retrying trigger URI registration in foreground");
                x23.B().x0();
            }
        }
    }

    final void b(long j10) {
        N5 n52 = this.f40803b;
        this.f40802a = new H5(this, n52.f40611a.e().a(), j10);
        n52.t().postDelayed(this.f40802a, 2000L);
    }
}
