package com.google.android.gms.internal.measurement;

import R8.AbstractC2115p;
import android.app.Activity;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v1 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3599v1 extends AbstractRunnableC3546p1 {

    /* JADX INFO: renamed from: e */
    final /* synthetic */ Activity f40001e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ BinderC3571s0 f40002f;

    /* JADX INFO: renamed from: g */
    final /* synthetic */ C3624y1 f40003g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3599v1(C3624y1 c3624y1, Activity activity, BinderC3571s0 binderC3571s0) {
        super(c3624y1.f40109a, true);
        this.f40001e = activity;
        this.f40002f = binderC3571s0;
        Objects.requireNonNull(c3624y1);
        this.f40003g = c3624y1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3546p1
    final void a() {
        ((InterfaceC3598v0) AbstractC2115p.l(this.f40003g.f40109a.n())).onActivitySaveInstanceStateByScionActivityInfo(J0.c(this.f40001e), this.f40002f, this.f39922b);
    }
}
