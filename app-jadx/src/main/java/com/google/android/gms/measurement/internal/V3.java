package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class V3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f40996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3937x4 f40997b;

    V3(C3937x4 c3937x4, long j10) {
        this.f40996a = j10;
        Objects.requireNonNull(c3937x4);
        this.f40997b = c3937x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3937x4 c3937x4 = this.f40997b;
        c3937x4.h();
        c3937x4.j();
        X2 x22 = c3937x4.f40611a;
        x22.a().v().a("Resetting analytics data (FE)");
        X2 x23 = c3937x4.f40611a;
        N5 n5Z = x23.z();
        n5Z.h();
        n5Z.f40880f.c();
        x23.L().p();
        boolean z10 = !c3937x4.f40611a.g();
        E2 e2X = x22.x();
        e2X.f40717f.b(this.f40996a);
        X2 x24 = e2X.f40611a;
        if (!TextUtils.isEmpty(x24.x().f40734w.a())) {
            e2X.f40734w.b(null);
        }
        e2X.f40728q.b(0L);
        e2X.f40729r.b(0L);
        if (!x24.w().L()) {
            e2X.y(z10);
        }
        e2X.f40735x.b(null);
        e2X.f40736y.b(0L);
        e2X.f40737z.b(null);
        x23.J().p();
        x23.z().f40879e.a();
        c3937x4.f41765s = z10;
        x23.J().q(new AtomicReference());
    }
}
