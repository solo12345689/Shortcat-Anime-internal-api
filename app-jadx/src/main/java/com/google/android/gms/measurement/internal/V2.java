package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class V2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ G3 f40994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ X2 f40995b;

    V2(X2 x22, G3 g32) {
        this.f40994a = g32;
        Objects.requireNonNull(x22);
        this.f40995b = x22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        X2 x22 = this.f40995b;
        G3 g32 = this.f40994a;
        x22.p(g32);
        x22.v(g32.f40775d);
    }
}
