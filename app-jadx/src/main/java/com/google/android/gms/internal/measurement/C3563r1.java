package com.google.android.gms.internal.measurement;

import R8.AbstractC2115p;
import android.app.Activity;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r1 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3563r1 extends AbstractRunnableC3546p1 {

    /* JADX INFO: renamed from: e */
    final /* synthetic */ Activity f39952e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ C3624y1 f39953f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3563r1(C3624y1 c3624y1, Activity activity) {
        super(c3624y1.f40109a, true);
        this.f39952e = activity;
        Objects.requireNonNull(c3624y1);
        this.f39953f = c3624y1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3546p1
    final void a() {
        ((InterfaceC3598v0) AbstractC2115p.l(this.f39953f.f40109a.n())).onActivityStartedByScionActivityInfo(J0.c(this.f39952e), this.f39922b);
    }
}
