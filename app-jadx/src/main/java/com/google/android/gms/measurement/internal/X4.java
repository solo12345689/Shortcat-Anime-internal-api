package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import j9.InterfaceC5347d;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class X4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ E4 f41047a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C3931w5 f41048b;

    X4(C3931w5 c3931w5, E4 e42) {
        this.f41047a = e42;
        Objects.requireNonNull(c3931w5);
        this.f41048b = c3931w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3931w5 c3931w5 = this.f41048b;
        InterfaceC5347d interfaceC5347dN = c3931w5.N();
        if (interfaceC5347dN == null) {
            c3931w5.f40611a.a().o().a("Failed to send current screen to service");
            return;
        }
        try {
            E4 e42 = this.f41047a;
            if (e42 == null) {
                interfaceC5347dN.a2(0L, null, null, c3931w5.f40611a.d().getPackageName());
            } else {
                interfaceC5347dN.a2(e42.f40743c, e42.f40741a, e42.f40742b, c3931w5.f40611a.d().getPackageName());
            }
            c3931w5.J();
        } catch (RemoteException e10) {
            this.f41048b.f40611a.a().o().b("Failed to send current screen to the service", e10);
        }
    }
}
