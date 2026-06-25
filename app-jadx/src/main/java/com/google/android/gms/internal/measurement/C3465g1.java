package com.google.android.gms.internal.measurement;

import R8.AbstractC2115p;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3465g1 extends AbstractRunnableC3546p1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f39760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f39761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f39762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ BinderC3571s0 f39763h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ C3632z1 f39764i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3465g1(C3632z1 c3632z1, String str, String str2, boolean z10, BinderC3571s0 binderC3571s0) {
        super(c3632z1, true);
        this.f39760e = str;
        this.f39761f = str2;
        this.f39762g = z10;
        this.f39763h = binderC3571s0;
        Objects.requireNonNull(c3632z1);
        this.f39764i = c3632z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3546p1
    final void a() {
        ((InterfaceC3598v0) AbstractC2115p.l(this.f39764i.n())).getUserProperties(this.f39760e, this.f39761f, this.f39762g, this.f39763h);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3546p1
    protected final void b() {
        this.f39763h.f(null);
    }
}
