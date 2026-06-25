package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.i6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class CallableC3833i6 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f41375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ q6 f41376b;

    CallableC3833i6(q6 q6Var, B6 b62) {
        this.f41375a = b62;
        Objects.requireNonNull(q6Var);
        this.f41376b = q6Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        B6 b62 = this.f41375a;
        String str = (String) AbstractC2115p.l(b62.f40646a);
        q6 q6Var = this.f41376b;
        E3 e3G = q6Var.g(str);
        j9.v vVar = j9.v.ANALYTICS_STORAGE;
        if (e3G.o(vVar) && E3.f(b62.f40664s, 100).o(vVar)) {
            return q6Var.o0(b62).p0();
        }
        q6Var.a().w().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
