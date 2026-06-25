package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.HandlerC3562r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class N5 extends AbstractC3805f2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f40877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f40878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final M5 f40879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final L5 f40880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final I5 f40881g;

    N5(X2 x22) {
        super(x22);
        this.f40878d = true;
        this.f40879e = new M5(this);
        this.f40880f = new L5(this);
        this.f40881g = new I5(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void q() {
        h();
        if (this.f40877c == null) {
            this.f40877c = new HandlerC3562r0(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3805f2
    protected final boolean m() {
        return false;
    }

    final void o(boolean z10) {
        h();
        this.f40878d = z10;
    }

    final boolean p() {
        h();
        return this.f40878d;
    }

    final /* synthetic */ void r(long j10) {
        h();
        q();
        X2 x22 = this.f40611a;
        x22.a().w().b("Activity resumed, time", Long.valueOf(j10));
        if (x22.w().H(null, AbstractC3789d2.f41184V0)) {
            if (x22.w().N() || this.f40878d) {
                this.f40880f.a(j10);
            }
        } else if (x22.w().N() || x22.x().f40731t.a()) {
            this.f40880f.a(j10);
        }
        this.f40881g.a();
        M5 m52 = this.f40879e;
        N5 n52 = m52.f40865a;
        n52.h();
        if (n52.f40611a.g()) {
            m52.b(n52.f40611a.e().a(), false);
        }
    }

    final /* synthetic */ void s(long j10) {
        h();
        q();
        X2 x22 = this.f40611a;
        x22.a().w().b("Activity paused, time", Long.valueOf(j10));
        this.f40881g.b(j10);
        if (x22.w().N()) {
            this.f40880f.b(j10);
        }
    }

    final /* synthetic */ Handler t() {
        return this.f40877c;
    }
}
