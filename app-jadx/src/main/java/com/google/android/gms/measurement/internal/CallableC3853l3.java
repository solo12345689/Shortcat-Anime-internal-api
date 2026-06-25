package com.google.android.gms.measurement.internal;

import j9.C5344a;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.l3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class CallableC3853l3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f41413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC3950z3 f41414b;

    CallableC3853l3(BinderC3950z3 binderC3950z3, B6 b62) {
        this.f41413a = b62;
        Objects.requireNonNull(binderC3950z3);
        this.f41414b = binderC3950z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        BinderC3950z3 binderC3950z3 = this.f41414b;
        binderC3950z3.L3().E();
        return new C5344a(binderC3950z3.L3().S0(this.f41413a.f40646a));
    }
}
