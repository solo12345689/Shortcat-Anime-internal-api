package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC3623y0;
import j9.InterfaceC5347d;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.g5 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3816g5 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f41327a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f41328b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ B6 f41329c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ InterfaceC3623y0 f41330d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C3931w5 f41331e;

    RunnableC3816g5(C3931w5 c3931w5, String str, String str2, B6 b62, InterfaceC3623y0 interfaceC3623y0) {
        this.f41327a = str;
        this.f41328b = str2;
        this.f41329c = b62;
        this.f41330d = interfaceC3623y0;
        Objects.requireNonNull(c3931w5);
        this.f41331e = c3931w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3623y0 interfaceC3623y0;
        z6 z6VarC;
        C3931w5 c3931w5;
        InterfaceC5347d interfaceC5347dN;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                c3931w5 = this.f41331e;
                interfaceC5347dN = c3931w5.N();
            } catch (RemoteException e10) {
                this.f41331e.f40611a.a().o().d("Failed to get conditional properties; remote exception", this.f41327a, this.f41328b, e10);
            }
            if (interfaceC5347dN == null) {
                X2 x22 = c3931w5.f40611a;
                x22.a().o().c("Failed to get conditional properties; not connected to service", this.f41327a, this.f41328b);
                z6VarC = x22.C();
                interfaceC3623y0 = this.f41330d;
                z6VarC.g0(interfaceC3623y0, arrayList);
            }
            B6 b62 = this.f41329c;
            AbstractC2115p.l(b62);
            arrayList = z6.h0(interfaceC5347dN.p3(this.f41327a, this.f41328b, b62));
            c3931w5.J();
            C3931w5 c3931w52 = this.f41331e;
            interfaceC3623y0 = this.f41330d;
            z6VarC = c3931w52.f40611a.C();
            z6VarC.g0(interfaceC3623y0, arrayList);
        } catch (Throwable th2) {
            C3931w5 c3931w53 = this.f41331e;
            c3931w53.f40611a.C().g0(this.f41330d, arrayList);
            throw th2;
        }
    }
}
