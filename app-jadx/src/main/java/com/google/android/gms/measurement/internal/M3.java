package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class M3 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ boolean f40853a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C3937x4 f40854b;

    M3(C3937x4 c3937x4, boolean z10) {
        this.f40853a = z10;
        Objects.requireNonNull(c3937x4);
        this.f40854b = c3937x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3937x4 c3937x4 = this.f40854b;
        X2 x22 = c3937x4.f40611a;
        boolean zG = x22.g();
        boolean zF = x22.f();
        boolean z10 = this.f40853a;
        x22.P(z10);
        if (zF == z10) {
            x22.a().w().b("Default data collection state already set to", Boolean.valueOf(z10));
        }
        if (x22.g() == zG || x22.g() != x22.f()) {
            x22.a().t().c("Default data collection is different than actual status", Boolean.valueOf(z10), Boolean.valueOf(zG));
        }
        c3937x4.Y();
    }
}
