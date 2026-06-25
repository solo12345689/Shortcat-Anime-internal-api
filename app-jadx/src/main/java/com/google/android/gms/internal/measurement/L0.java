package com.google.android.gms.internal.measurement;

import R8.AbstractC2115p;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class L0 extends AbstractRunnableC3546p1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f39407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f39408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Object f39409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f39410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ C3632z1 f39411i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L0(C3632z1 c3632z1, String str, String str2, Object obj, boolean z10) {
        super(c3632z1, true);
        this.f39407e = str;
        this.f39408f = str2;
        this.f39409g = obj;
        this.f39410h = z10;
        Objects.requireNonNull(c3632z1);
        this.f39411i = c3632z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3546p1
    final void a() {
        ((InterfaceC3598v0) AbstractC2115p.l(this.f39411i.n())).setUserProperty(this.f39407e, this.f39408f, Y8.b.G3(this.f39409g), this.f39410h, this.f39921a);
    }
}
