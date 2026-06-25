package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.e6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3801e6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ r6 f41282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ q6 f41283b;

    RunnableC3801e6(q6 q6Var, r6 r6Var) {
        this.f41282a = r6Var;
        Objects.requireNonNull(q6Var);
        this.f41283b = q6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q6 q6Var = this.f41283b;
        q6Var.u0(this.f41282a);
        q6Var.A0();
    }
}
