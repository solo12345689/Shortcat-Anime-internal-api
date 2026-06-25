package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class Y2 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f41059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC3950z3 f41060b;

    Y2(BinderC3950z3 binderC3950z3, String str) {
        this.f41059a = str;
        Objects.requireNonNull(binderC3950z3);
        this.f41060b = binderC3950z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        BinderC3950z3 binderC3950z3 = this.f41060b;
        binderC3950z3.L3().E();
        return binderC3950z3.L3().F0().C0(this.f41059a);
    }
}
