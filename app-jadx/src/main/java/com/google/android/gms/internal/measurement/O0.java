package com.google.android.gms.internal.measurement;

import R8.AbstractC2115p;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class O0 extends AbstractRunnableC3546p1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f39523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f39524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ BinderC3571s0 f39525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ C3632z1 f39526h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O0(C3632z1 c3632z1, String str, String str2, BinderC3571s0 binderC3571s0) {
        super(c3632z1, true);
        this.f39523e = str;
        this.f39524f = str2;
        this.f39525g = binderC3571s0;
        Objects.requireNonNull(c3632z1);
        this.f39526h = c3632z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3546p1
    final void a() {
        ((InterfaceC3598v0) AbstractC2115p.l(this.f39526h.n())).getConditionalUserProperties(this.f39523e, this.f39524f, this.f39525g);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3546p1
    protected final void b() {
        this.f39525g.f(null);
    }
}
