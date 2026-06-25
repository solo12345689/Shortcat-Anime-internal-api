package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.os.RemoteException;
import j9.InterfaceC5347d;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.c5 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3784c5 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ B6 f41131a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C3931w5 f41132b;

    RunnableC3784c5(C3931w5 c3931w5, B6 b62) {
        this.f41131a = b62;
        Objects.requireNonNull(c3931w5);
        this.f41132b = c3931w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3931w5 c3931w5 = this.f41132b;
        InterfaceC5347d interfaceC5347dN = c3931w5.N();
        if (interfaceC5347dN == null) {
            c3931w5.f40611a.a().o().a("Failed to send consent settings to service");
            return;
        }
        try {
            B6 b62 = this.f41131a;
            AbstractC2115p.l(b62);
            interfaceC5347dN.C3(b62);
            c3931w5.J();
        } catch (RemoteException e10) {
            this.f41132b.f40611a.a().o().b("Failed to send consent settings to the service", e10);
        }
    }
}
