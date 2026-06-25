package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class K3 implements com.google.common.util.concurrent.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ S5 f40830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3937x4 f40831b;

    K3(C3937x4 c3937x4, S5 s52) {
        this.f40830a = s52;
        Objects.requireNonNull(c3937x4);
        this.f40831b = c3937x4;
    }

    private final void b() {
        X2 x22 = this.f40831b.f40611a;
        SparseArray sparseArrayR = x22.x().r();
        S5 s52 = this.f40830a;
        sparseArrayR.put(s52.f40964c, Long.valueOf(s52.f40963b));
        E2 e2X = x22.x();
        int[] iArr = new int[sparseArrayR.size()];
        long[] jArr = new long[sparseArrayR.size()];
        for (int i10 = 0; i10 < sparseArrayR.size(); i10++) {
            iArr[i10] = sparseArrayR.keyAt(i10);
            jArr[i10] = ((Long) sparseArrayR.valueAt(i10)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        e2X.f40726o.b(bundle);
    }

    @Override // com.google.common.util.concurrent.i
    public final void a(Throwable th2) {
        C3937x4 c3937x4 = this.f40831b;
        c3937x4.h();
        c3937x4.Z(false);
        X2 x22 = c3937x4.f40611a;
        int iD0 = (x22.w().H(null, AbstractC3789d2.f41182U0) ? c3937x4.d0(th2) : 2) - 1;
        if (iD0 == 0) {
            x22.a().r().c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", C3887q2.x(c3937x4.f40611a.L().q()), C3887q2.x(th2.toString()));
            c3937x4.b0(1);
            c3937x4.w0().add(this.f40830a);
            return;
        }
        if (iD0 != 1) {
            x22.a().o().c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", C3887q2.x(c3937x4.f40611a.L().q()), th2);
            b();
            c3937x4.b0(1);
            c3937x4.x0();
            return;
        }
        c3937x4.w0().add(this.f40830a);
        if (c3937x4.a0() > ((Integer) AbstractC3789d2.f41252x0.b(null)).intValue()) {
            c3937x4.b0(1);
            x22.a().r().c("registerTriggerAsync failed. May try later. App ID, throwable", C3887q2.x(c3937x4.f40611a.L().q()), C3887q2.x(th2.toString()));
        } else {
            x22.a().r().d("registerTriggerAsync failed. App ID, delay in seconds, throwable", C3887q2.x(c3937x4.f40611a.L().q()), C3887q2.x(String.valueOf(c3937x4.a0())), C3887q2.x(th2.toString()));
            c3937x4.V(c3937x4.a0());
            int iA0 = c3937x4.a0();
            c3937x4.b0(iA0 + iA0);
        }
    }

    @Override // com.google.common.util.concurrent.i
    public final void onSuccess(Object obj) {
        C3937x4 c3937x4 = this.f40831b;
        c3937x4.h();
        b();
        c3937x4.Z(false);
        c3937x4.b0(1);
        c3937x4.f40611a.a().v().b("Successfully registered trigger URI", this.f40830a.f40962a);
        c3937x4.x0();
    }
}
