package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import j9.InterfaceC5347d;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.e5 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3800e5 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ B6 f41278a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ boolean f41279b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C3826i f41280c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C3931w5 f41281d;

    RunnableC3800e5(C3931w5 c3931w5, boolean z10, B6 b62, boolean z11, C3826i c3826i, C3826i c3826i2) {
        this.f41278a = b62;
        this.f41279b = z11;
        this.f41280c = c3826i;
        Objects.requireNonNull(c3931w5);
        this.f41281d = c3931w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3931w5 c3931w5 = this.f41281d;
        InterfaceC5347d interfaceC5347dN = c3931w5.N();
        if (interfaceC5347dN == null) {
            c3931w5.f40611a.a().o().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        B6 b62 = this.f41278a;
        AbstractC2115p.l(b62);
        c3931w5.b0(interfaceC5347dN, this.f41279b ? null : this.f41280c, b62);
        c3931w5.J();
    }
}
