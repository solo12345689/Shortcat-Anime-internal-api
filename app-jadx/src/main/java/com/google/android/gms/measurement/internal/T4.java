package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC3623y0;
import j9.InterfaceC5347d;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class T4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ B6 f40979a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ InterfaceC3623y0 f40980b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C3931w5 f40981c;

    T4(C3931w5 c3931w5, B6 b62, InterfaceC3623y0 interfaceC3623y0) {
        this.f40979a = b62;
        this.f40980b = interfaceC3623y0;
        Objects.requireNonNull(c3931w5);
        this.f40981c = c3931w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3623y0 interfaceC3623y0;
        z6 z6VarC;
        C3931w5 c3931w5;
        X2 x22;
        String strW1 = null;
        try {
            try {
                c3931w5 = this.f40981c;
                x22 = c3931w5.f40611a;
            } catch (RemoteException e10) {
                this.f40981c.f40611a.a().o().b("Failed to get app instance id", e10);
            }
            if (x22.x().w().o(j9.v.ANALYTICS_STORAGE)) {
                InterfaceC5347d interfaceC5347dN = c3931w5.N();
                if (interfaceC5347dN != null) {
                    B6 b62 = this.f40979a;
                    AbstractC2115p.l(b62);
                    strW1 = interfaceC5347dN.w1(b62);
                    if (strW1 != null) {
                        c3931w5.f40611a.B().E(strW1);
                        x22.x().f40719h.b(strW1);
                    }
                    c3931w5.J();
                    C3931w5 c3931w52 = this.f40981c;
                    interfaceC3623y0 = this.f40980b;
                    z6VarC = c3931w52.f40611a.C();
                    z6VarC.a0(interfaceC3623y0, strW1);
                }
                x22.a().o().a("Failed to get app instance id");
            } else {
                x22.a().t().a("Analytics storage consent denied; will not get app instance id");
                c3931w5.f40611a.B().E(null);
                x22.x().f40719h.b(null);
            }
            z6VarC = x22.C();
            interfaceC3623y0 = this.f40980b;
            z6VarC.a0(interfaceC3623y0, strW1);
        } catch (Throwable th2) {
            C3931w5 c3931w53 = this.f40981c;
            c3931w53.f40611a.C().a0(this.f40980b, null);
            throw th2;
        }
    }
}
