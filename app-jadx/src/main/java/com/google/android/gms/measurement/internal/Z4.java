package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC3623y0;
import j9.InterfaceC5347d;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class Z4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ G f41080a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f41081b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ InterfaceC3623y0 f41082c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C3931w5 f41083d;

    Z4(C3931w5 c3931w5, G g10, String str, InterfaceC3623y0 interfaceC3623y0) {
        this.f41080a = g10;
        this.f41081b = str;
        this.f41082c = interfaceC3623y0;
        Objects.requireNonNull(c3931w5);
        this.f41083d = c3931w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3623y0 interfaceC3623y0;
        z6 z6VarC;
        C3931w5 c3931w5;
        InterfaceC5347d interfaceC5347dN;
        byte[] bArrG0 = null;
        try {
            try {
                c3931w5 = this.f41083d;
                interfaceC5347dN = c3931w5.N();
            } catch (RemoteException e10) {
                this.f41083d.f40611a.a().o().b("Failed to send event to the service to bundle", e10);
            }
            if (interfaceC5347dN == null) {
                X2 x22 = c3931w5.f40611a;
                x22.a().o().a("Discarding data. Failed to send event to service to bundle");
                z6VarC = x22.C();
                interfaceC3623y0 = this.f41082c;
                z6VarC.d0(interfaceC3623y0, bArrG0);
            }
            bArrG0 = interfaceC5347dN.G0(this.f41080a, this.f41081b);
            c3931w5.J();
            C3931w5 c3931w52 = this.f41083d;
            interfaceC3623y0 = this.f41082c;
            z6VarC = c3931w52.f40611a.C();
            z6VarC.d0(interfaceC3623y0, bArrG0);
        } catch (Throwable th2) {
            C3931w5 c3931w53 = this.f41083d;
            c3931w53.f40611a.C().d0(this.f41082c, null);
            throw th2;
        }
    }
}
