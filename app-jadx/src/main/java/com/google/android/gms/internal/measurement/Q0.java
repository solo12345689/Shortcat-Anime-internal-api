package com.google.android.gms.internal.measurement;

import R8.AbstractC2115p;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class Q0 extends AbstractRunnableC3546p1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ J0 f39547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f39548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f39549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ C3632z1 f39550h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q0(C3632z1 c3632z1, J0 j02, String str, String str2) {
        super(c3632z1, true);
        this.f39547e = j02;
        this.f39548f = str;
        this.f39549g = str2;
        Objects.requireNonNull(c3632z1);
        this.f39550h = c3632z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3546p1
    final void a() {
        ((InterfaceC3598v0) AbstractC2115p.l(this.f39550h.n())).setCurrentScreenByScionActivityInfo(this.f39547e, this.f39548f, this.f39549g, this.f39921a);
    }
}
