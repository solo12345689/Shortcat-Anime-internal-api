package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.f3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class CallableC3806f3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f41287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f41288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f41289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ BinderC3950z3 f41290d;

    CallableC3806f3(BinderC3950z3 binderC3950z3, String str, String str2, String str3) {
        this.f41287a = str;
        this.f41288b = str2;
        this.f41289c = str3;
        Objects.requireNonNull(binderC3950z3);
        this.f41290d = binderC3950z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        BinderC3950z3 binderC3950z3 = this.f41290d;
        binderC3950z3.L3().E();
        return binderC3950z3.L3().F0().D0(this.f41287a, this.f41288b, this.f41289c);
    }
}
