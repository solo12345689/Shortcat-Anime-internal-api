package com.google.android.gms.internal.measurement;

import R8.AbstractC2115p;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3456f1 extends AbstractRunnableC3546p1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ BinderC3571s0 f39755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ C3632z1 f39756f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3456f1(C3632z1 c3632z1, BinderC3571s0 binderC3571s0) {
        super(c3632z1, true);
        this.f39755e = binderC3571s0;
        Objects.requireNonNull(c3632z1);
        this.f39756f = c3632z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3546p1
    final void a() {
        ((InterfaceC3598v0) AbstractC2115p.l(this.f39756f.n())).getCurrentScreenClass(this.f39755e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3546p1
    protected final void b() {
        this.f39755e.f(null);
    }
}
