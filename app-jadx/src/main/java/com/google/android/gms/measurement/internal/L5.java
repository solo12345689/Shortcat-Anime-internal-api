package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class L5 {

    /* JADX INFO: renamed from: a */
    protected long f40845a;

    /* JADX INFO: renamed from: b */
    protected long f40846b;

    /* JADX INFO: renamed from: c */
    private final AbstractC3932x f40847c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ N5 f40848d;

    public L5(N5 n52) {
        Objects.requireNonNull(n52);
        this.f40848d = n52;
        this.f40847c = new J5(this, n52.f40611a);
        long jC = n52.f40611a.e().c();
        this.f40845a = jC;
        this.f40846b = jC;
    }

    final void a(long j10) {
        this.f40848d.h();
        this.f40847c.d();
        this.f40845a = j10;
        this.f40846b = j10;
    }

    final void b(long j10) {
        this.f40847c.d();
    }

    final void c() {
        this.f40847c.d();
        long jC = this.f40848d.f40611a.e().c();
        this.f40845a = jC;
        this.f40846b = jC;
    }

    public final boolean d(boolean z10, boolean z11, long j10) {
        N5 n52 = this.f40848d;
        n52.h();
        n52.j();
        if (n52.f40611a.g()) {
            X2 x22 = n52.f40611a;
            x22.x().f40728q.b(x22.e().a());
        }
        long j11 = j10 - this.f40845a;
        if (!z10 && j11 < 1000) {
            n52.f40611a.a().w().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
            return false;
        }
        if (!z11) {
            j11 = j10 - this.f40846b;
            this.f40846b = j10;
        }
        X2 x23 = n52.f40611a;
        x23.a().w().b("Recording user engagement, ms", Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        boolean z12 = !x23.w().N();
        X2 x24 = n52.f40611a;
        z6.k0(x24.I().q(z12), bundle, true);
        if (!z11) {
            x24.B().t("auto", "_e", bundle);
        }
        this.f40845a = j10;
        AbstractC3932x abstractC3932x = this.f40847c;
        abstractC3932x.d();
        abstractC3932x.b(((Long) AbstractC3789d2.f41240r0.b(null)).longValue());
        return true;
    }
}
