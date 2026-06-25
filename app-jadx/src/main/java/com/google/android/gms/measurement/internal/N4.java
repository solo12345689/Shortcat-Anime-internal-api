package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC3623y0;
import j9.InterfaceC5347d;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class N4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f40871a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f40872b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ B6 f40873c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ boolean f40874d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ InterfaceC3623y0 f40875e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ C3931w5 f40876f;

    N4(C3931w5 c3931w5, String str, String str2, B6 b62, boolean z10, InterfaceC3623y0 interfaceC3623y0) {
        this.f40871a = str;
        this.f40872b = str2;
        this.f40873c = b62;
        this.f40874d = z10;
        this.f40875e = interfaceC3623y0;
        Objects.requireNonNull(c3931w5);
        this.f40876f = c3931w5;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        RemoteException e10;
        Bundle bundle2 = new Bundle();
        try {
            C3931w5 c3931w5 = this.f40876f;
            InterfaceC5347d interfaceC5347dN = c3931w5.N();
            if (interfaceC5347dN == null) {
                X2 x22 = c3931w5.f40611a;
                x22.a().o().c("Failed to get user properties; not connected to service", this.f40871a, this.f40872b);
                x22.C().f0(this.f40875e, bundle2);
                return;
            }
            B6 b62 = this.f40873c;
            AbstractC2115p.l(b62);
            List<v6> listJ3 = interfaceC5347dN.j3(this.f40871a, this.f40872b, this.f40874d, b62);
            int i10 = z6.f41820k;
            bundle = new Bundle();
            if (listJ3 != null) {
                for (v6 v6Var : listJ3) {
                    String str = v6Var.f41672e;
                    if (str != null) {
                        bundle.putString(v6Var.f41669b, str);
                    } else {
                        Long l10 = v6Var.f41671d;
                        if (l10 != null) {
                            bundle.putLong(v6Var.f41669b, l10.longValue());
                        } else {
                            Double d10 = v6Var.f41674g;
                            if (d10 != null) {
                                bundle.putDouble(v6Var.f41669b, d10.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    c3931w5.J();
                    X2 x23 = c3931w5.f40611a;
                    x23.C().f0(this.f40875e, bundle);
                } catch (Throwable th2) {
                    th = th2;
                    bundle2 = bundle;
                    C3931w5 c3931w52 = this.f40876f;
                    c3931w52.f40611a.C().f0(this.f40875e, bundle2);
                    throw th;
                }
            } catch (RemoteException e11) {
                e10 = e11;
                this.f40876f.f40611a.a().o().c("Failed to get user properties; remote exception", this.f40871a, e10);
                C3931w5 c3931w53 = this.f40876f;
                c3931w53.f40611a.C().f0(this.f40875e, bundle);
            }
        } catch (RemoteException e12) {
            bundle = bundle2;
            e10 = e12;
        } catch (Throwable th3) {
            th = th3;
            C3931w5 c3931w522 = this.f40876f;
            c3931w522.f40611a.C().f0(this.f40875e, bundle2);
            throw th;
        }
    }
}
