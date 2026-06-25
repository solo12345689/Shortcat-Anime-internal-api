package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.i3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3830i3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f41367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC3950z3 f41368b;

    RunnableC3830i3(BinderC3950z3 binderC3950z3, B6 b62) {
        this.f41367a = b62;
        Objects.requireNonNull(binderC3950z3);
        this.f41368b = binderC3950z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC3950z3 binderC3950z3 = this.f41368b;
        binderC3950z3.L3().E();
        q6 q6VarL3 = binderC3950z3.L3();
        q6VarL3.b().h();
        q6VarL3.O0();
        B6 b62 = this.f41367a;
        AbstractC2115p.f(b62.f40646a);
        q6VarL3.o0(b62);
    }
}
