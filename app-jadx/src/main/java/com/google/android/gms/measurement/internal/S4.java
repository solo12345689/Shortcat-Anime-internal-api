package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.os.RemoteException;
import j9.InterfaceC5347d;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class S4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicReference f40959a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ B6 f40960b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C3931w5 f40961c;

    S4(C3931w5 c3931w5, AtomicReference atomicReference, B6 b62) {
        this.f40959a = atomicReference;
        this.f40960b = b62;
        Objects.requireNonNull(c3931w5);
        this.f40961c = c3931w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C3931w5 c3931w5;
        X2 x22;
        AtomicReference atomicReference2 = this.f40959a;
        synchronized (atomicReference2) {
            try {
                try {
                    c3931w5 = this.f40961c;
                    x22 = c3931w5.f40611a;
                } catch (RemoteException e10) {
                    this.f40961c.f40611a.a().o().b("Failed to get app instance id", e10);
                    atomicReference = this.f40959a;
                }
                if (x22.x().w().o(j9.v.ANALYTICS_STORAGE)) {
                    InterfaceC5347d interfaceC5347dN = c3931w5.N();
                    if (interfaceC5347dN != null) {
                        B6 b62 = this.f40960b;
                        AbstractC2115p.l(b62);
                        atomicReference2.set(interfaceC5347dN.w1(b62));
                        String str = (String) atomicReference2.get();
                        if (str != null) {
                            c3931w5.f40611a.B().E(str);
                            x22.x().f40719h.b(str);
                        }
                        c3931w5.J();
                        atomicReference = this.f40959a;
                        atomicReference.notify();
                        return;
                    }
                    x22.a().o().a("Failed to get app instance id");
                } else {
                    x22.a().t().a("Analytics storage consent denied; will not get app instance id");
                    c3931w5.f40611a.B().E(null);
                    x22.x().f40719h.b(null);
                    atomicReference2.set(null);
                }
                atomicReference2.notify();
            } catch (Throwable th2) {
                this.f40959a.notify();
                throw th2;
            }
        }
    }
}
