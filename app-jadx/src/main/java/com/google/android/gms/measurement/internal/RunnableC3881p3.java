package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.p3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3881p3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ v6 f41491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ B6 f41492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC3950z3 f41493c;

    RunnableC3881p3(BinderC3950z3 binderC3950z3, v6 v6Var, B6 b62) {
        this.f41491a = v6Var;
        this.f41492b = b62;
        Objects.requireNonNull(binderC3950z3);
        this.f41493c = binderC3950z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC3950z3 binderC3950z3 = this.f41493c;
        binderC3950z3.L3().E();
        v6 v6Var = this.f41491a;
        if (v6Var.c() != null) {
            binderC3950z3.L3().c0(v6Var, this.f41492b);
        } else {
            B6 b62 = this.f41492b;
            binderC3950z3.L3().d0(v6Var.f41669b, b62);
        }
    }
}
