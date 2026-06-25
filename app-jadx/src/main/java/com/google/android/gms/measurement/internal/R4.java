package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.os.RemoteException;
import j9.InterfaceC5347d;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class R4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ B6 f40943a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C3931w5 f40944b;

    R4(C3931w5 c3931w5, B6 b62) {
        this.f40943a = b62;
        Objects.requireNonNull(c3931w5);
        this.f40944b = c3931w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3931w5 c3931w5 = this.f40944b;
        InterfaceC5347d interfaceC5347dN = c3931w5.N();
        if (interfaceC5347dN == null) {
            c3931w5.f40611a.a().o().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            B6 b62 = this.f40943a;
            AbstractC2115p.l(b62);
            interfaceC5347dN.b2(b62);
        } catch (RemoteException e10) {
            this.f40944b.f40611a.a().o().b("Failed to reset data on the service: remote exception", e10);
        }
        this.f40944b.J();
    }
}
