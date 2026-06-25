package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.os.RemoteException;
import android.text.TextUtils;
import j9.InterfaceC5347d;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.f5 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3808f5 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicReference f41293a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f41294b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f41295c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ B6 f41296d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C3931w5 f41297e;

    RunnableC3808f5(C3931w5 c3931w5, AtomicReference atomicReference, String str, String str2, String str3, B6 b62) {
        this.f41293a = atomicReference;
        this.f41294b = str2;
        this.f41295c = str3;
        this.f41296d = b62;
        Objects.requireNonNull(c3931w5);
        this.f41297e = c3931w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C3931w5 c3931w5;
        InterfaceC5347d interfaceC5347dN;
        AtomicReference atomicReference2 = this.f41293a;
        synchronized (atomicReference2) {
            try {
                try {
                    c3931w5 = this.f41297e;
                    interfaceC5347dN = c3931w5.N();
                } catch (Throwable th2) {
                    this.f41293a.notify();
                    throw th2;
                }
            } catch (RemoteException e10) {
                this.f41297e.f40611a.a().o().d("(legacy) Failed to get conditional properties; remote exception", null, this.f41294b, e10);
                this.f41293a.set(Collections.EMPTY_LIST);
                atomicReference = this.f41293a;
            }
            if (interfaceC5347dN == null) {
                c3931w5.f40611a.a().o().d("(legacy) Failed to get conditional properties; not connected to service", null, this.f41294b, this.f41295c);
                atomicReference2.set(Collections.EMPTY_LIST);
                atomicReference2.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                B6 b62 = this.f41296d;
                AbstractC2115p.l(b62);
                atomicReference2.set(interfaceC5347dN.p3(this.f41294b, this.f41295c, b62));
            } else {
                atomicReference2.set(interfaceC5347dN.l0(null, this.f41294b, this.f41295c));
            }
            c3931w5.J();
            atomicReference = this.f41293a;
            atomicReference.notify();
        }
    }
}
