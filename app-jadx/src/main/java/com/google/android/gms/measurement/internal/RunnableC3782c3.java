package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.c3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3782c3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3826i f41126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ B6 f41127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC3950z3 f41128c;

    RunnableC3782c3(BinderC3950z3 binderC3950z3, C3826i c3826i, B6 b62) {
        this.f41126a = c3826i;
        this.f41127b = b62;
        Objects.requireNonNull(binderC3950z3);
        this.f41128c = binderC3950z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC3950z3 binderC3950z3 = this.f41128c;
        binderC3950z3.L3().E();
        C3826i c3826i = this.f41126a;
        if (c3826i.f41353c.c() == null) {
            binderC3950z3.L3().m0(c3826i, this.f41127b);
        } else {
            binderC3950z3.L3().k0(c3826i, this.f41127b);
        }
    }
}
