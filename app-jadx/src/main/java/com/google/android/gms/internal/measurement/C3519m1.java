package com.google.android.gms.internal.measurement;

import R8.AbstractC2115p;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3519m1 extends AbstractRunnableC3546p1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f39851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ C3632z1 f39852f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3519m1(C3632z1 c3632z1, boolean z10) {
        super(c3632z1, true);
        this.f39851e = z10;
        Objects.requireNonNull(c3632z1);
        this.f39852f = c3632z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3546p1
    final void a() {
        ((InterfaceC3598v0) AbstractC2115p.l(this.f39852f.n())).setDataCollectionEnabled(this.f39851e);
    }
}
