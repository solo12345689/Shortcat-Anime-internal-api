package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.h3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class CallableC3822h3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f41338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f41339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f41340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ BinderC3950z3 f41341d;

    CallableC3822h3(BinderC3950z3 binderC3950z3, String str, String str2, String str3) {
        this.f41338a = str;
        this.f41339b = str2;
        this.f41340c = str3;
        Objects.requireNonNull(binderC3950z3);
        this.f41341d = binderC3950z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        BinderC3950z3 binderC3950z3 = this.f41341d;
        binderC3950z3.L3().E();
        return binderC3950z3.L3().F0().H0(this.f41338a, this.f41339b, this.f41340c);
    }
}
