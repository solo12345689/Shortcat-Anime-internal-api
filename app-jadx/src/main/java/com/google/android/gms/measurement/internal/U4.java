package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.os.RemoteException;
import j9.InterfaceC5347d;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class U4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ B6 f40988a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C3931w5 f40989b;

    U4(C3931w5 c3931w5, B6 b62, boolean z10) {
        this.f40988a = b62;
        Objects.requireNonNull(c3931w5);
        this.f40989b = c3931w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3931w5 c3931w5 = this.f40989b;
        InterfaceC5347d interfaceC5347dN = c3931w5.N();
        if (interfaceC5347dN == null) {
            c3931w5.f40611a.a().o().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            B6 b62 = this.f40988a;
            AbstractC2115p.l(b62);
            X2 x22 = c3931w5.f40611a;
            C3856m c3856mW = x22.w();
            C3781c2 c3781c2 = AbstractC3789d2.f41201c1;
            if (c3856mW.H(null, c3781c2)) {
                c3931w5.b0(interfaceC5347dN, null, b62);
            }
            interfaceC5347dN.W2(b62);
            c3931w5.f40611a.E().v();
            x22.w().H(null, c3781c2);
            c3931w5.b0(interfaceC5347dN, null, b62);
            c3931w5.J();
        } catch (RemoteException e10) {
            this.f40989b.f40611a.a().o().b("Failed to send app launch to the service", e10);
        }
    }
}
