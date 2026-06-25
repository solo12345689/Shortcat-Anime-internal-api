package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.os.Bundle;
import android.os.RemoteException;
import j9.InterfaceC5347d;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class Y4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ B6 f41065a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ boolean f41066b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ E f41067c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ Bundle f41068d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C3931w5 f41069e;

    Y4(C3931w5 c3931w5, boolean z10, B6 b62, boolean z11, E e10, Bundle bundle) {
        this.f41065a = b62;
        this.f41066b = z11;
        this.f41067c = e10;
        this.f41068d = bundle;
        Objects.requireNonNull(c3931w5);
        this.f41069e = c3931w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3931w5 c3931w5 = this.f41069e;
        InterfaceC5347d interfaceC5347dN = c3931w5.N();
        if (interfaceC5347dN == null) {
            c3931w5.f40611a.a().o().a("Failed to send default event parameters to service");
            return;
        }
        if (c3931w5.f40611a.w().H(null, AbstractC3789d2.f41201c1)) {
            B6 b62 = this.f41065a;
            AbstractC2115p.l(b62);
            this.f41069e.b0(interfaceC5347dN, this.f41066b ? null : this.f41067c, b62);
            return;
        }
        try {
            B6 b63 = this.f41065a;
            AbstractC2115p.l(b63);
            interfaceC5347dN.P2(this.f41068d, b63);
            c3931w5.J();
        } catch (RemoteException e10) {
            this.f41069e.f40611a.a().o().b("Failed to send default event parameters to service", e10);
        }
    }
}
