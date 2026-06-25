package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.d3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3790d3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3826i f41257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC3950z3 f41258b;

    RunnableC3790d3(BinderC3950z3 binderC3950z3, C3826i c3826i) {
        this.f41257a = c3826i;
        Objects.requireNonNull(binderC3950z3);
        this.f41258b = binderC3950z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC3950z3 binderC3950z3 = this.f41258b;
        binderC3950z3.L3().E();
        C3826i c3826i = this.f41257a;
        if (c3826i.f41353c.c() == null) {
            binderC3950z3.L3().l0(c3826i);
        } else {
            binderC3950z3.L3().j0(c3826i);
        }
    }
}
