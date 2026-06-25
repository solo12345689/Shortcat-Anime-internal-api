package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.j3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3838j3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f41383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC3950z3 f41384b;

    RunnableC3838j3(BinderC3950z3 binderC3950z3, B6 b62) {
        this.f41383a = b62;
        Objects.requireNonNull(binderC3950z3);
        this.f41384b = binderC3950z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC3950z3 binderC3950z3 = this.f41384b;
        binderC3950z3.L3().E();
        binderC3950z3.L3().b0(this.f41383a);
    }
}
