package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.r3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class CallableC3894r3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f41574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f41575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC3950z3 f41576c;

    CallableC3894r3(BinderC3950z3 binderC3950z3, B6 b62, Bundle bundle) {
        this.f41574a = b62;
        this.f41575b = bundle;
        Objects.requireNonNull(binderC3950z3);
        this.f41576c = binderC3950z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        BinderC3950z3 binderC3950z3 = this.f41576c;
        binderC3950z3.L3().E();
        return binderC3950z3.L3().q0(this.f41574a, this.f41575b);
    }
}
