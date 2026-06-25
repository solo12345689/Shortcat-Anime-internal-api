package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.z5 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3952z5 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ q6 f41816a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Runnable f41817b;

    RunnableC3952z5(D5 d52, q6 q6Var, Runnable runnable) {
        this.f41816a = q6Var;
        this.f41817b = runnable;
        Objects.requireNonNull(d52);
    }

    @Override // java.lang.Runnable
    public final void run() {
        q6 q6Var = this.f41816a;
        q6Var.E();
        q6Var.D(this.f41817b);
        q6Var.r();
    }
}
