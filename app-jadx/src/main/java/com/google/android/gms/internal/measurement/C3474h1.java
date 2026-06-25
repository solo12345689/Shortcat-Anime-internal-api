package com.google.android.gms.internal.measurement;

import R8.AbstractC2115p;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3474h1 extends AbstractRunnableC3546p1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f39775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ Object f39776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ C3632z1 f39777g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3474h1(C3632z1 c3632z1, boolean z10, int i10, String str, Object obj, Object obj2, Object obj3) {
        super(c3632z1, false);
        this.f39775e = str;
        this.f39776f = obj;
        Objects.requireNonNull(c3632z1);
        this.f39777g = c3632z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3546p1
    final void a() {
        ((InterfaceC3598v0) AbstractC2115p.l(this.f39777g.n())).logHealthData(5, this.f39775e, Y8.b.G3(this.f39776f), Y8.b.G3(null), Y8.b.G3(null));
    }
}
