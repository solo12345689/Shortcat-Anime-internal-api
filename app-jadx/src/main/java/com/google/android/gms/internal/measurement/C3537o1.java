package com.google.android.gms.internal.measurement;

import R8.AbstractC2115p;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3537o1 extends AbstractRunnableC3546p1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Long f39884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f39885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f39886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ Bundle f39887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ boolean f39888i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ boolean f39889j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ C3632z1 f39890k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3537o1(C3632z1 c3632z1, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(c3632z1, true);
        this.f39884e = l10;
        this.f39885f = str;
        this.f39886g = str2;
        this.f39887h = bundle;
        this.f39888i = z10;
        this.f39889j = z11;
        Objects.requireNonNull(c3632z1);
        this.f39890k = c3632z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3546p1
    final void a() {
        Long l10 = this.f39884e;
        ((InterfaceC3598v0) AbstractC2115p.l(this.f39890k.n())).logEvent(this.f39885f, this.f39886g, this.f39887h, this.f39888i, this.f39889j, l10 == null ? this.f39921a : l10.longValue());
    }
}
