package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.m3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3860m3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ G f41429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ B6 f41430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC3950z3 f41431c;

    RunnableC3860m3(BinderC3950z3 binderC3950z3, G g10, B6 b62) {
        this.f41429a = g10;
        this.f41430b = b62;
        Objects.requireNonNull(binderC3950z3);
        this.f41431c = binderC3950z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        G g10 = this.f41429a;
        B6 b62 = this.f41430b;
        BinderC3950z3 binderC3950z3 = this.f41431c;
        binderC3950z3.P3(binderC3950z3.Q3(g10, b62), b62);
    }
}
