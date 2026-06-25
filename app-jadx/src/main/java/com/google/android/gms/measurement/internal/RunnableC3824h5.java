package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.os.RemoteException;
import android.text.TextUtils;
import j9.InterfaceC5347d;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.h5 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3824h5 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicReference f41344a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f41345b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f41346c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ B6 f41347d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ boolean f41348e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ C3931w5 f41349f;

    RunnableC3824h5(C3931w5 c3931w5, AtomicReference atomicReference, String str, String str2, String str3, B6 b62, boolean z10) {
        this.f41344a = atomicReference;
        this.f41345b = str2;
        this.f41346c = str3;
        this.f41347d = b62;
        this.f41348e = z10;
        Objects.requireNonNull(c3931w5);
        this.f41349f = c3931w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C3931w5 c3931w5;
        InterfaceC5347d interfaceC5347dN;
        AtomicReference atomicReference2 = this.f41344a;
        synchronized (atomicReference2) {
            try {
                try {
                    c3931w5 = this.f41349f;
                    interfaceC5347dN = c3931w5.N();
                } catch (Throwable th2) {
                    this.f41344a.notify();
                    throw th2;
                }
            } catch (RemoteException e10) {
                this.f41349f.f40611a.a().o().d("(legacy) Failed to get user properties; remote exception", null, this.f41345b, e10);
                this.f41344a.set(Collections.EMPTY_LIST);
                atomicReference = this.f41344a;
            }
            if (interfaceC5347dN == null) {
                c3931w5.f40611a.a().o().d("(legacy) Failed to get user properties; not connected to service", null, this.f41345b, this.f41346c);
                atomicReference2.set(Collections.EMPTY_LIST);
                atomicReference2.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                B6 b62 = this.f41347d;
                AbstractC2115p.l(b62);
                atomicReference2.set(interfaceC5347dN.j3(this.f41345b, this.f41346c, this.f41348e, b62));
            } else {
                atomicReference2.set(interfaceC5347dN.K(null, this.f41345b, this.f41346c, this.f41348e));
            }
            c3931w5.J();
            atomicReference = this.f41344a;
            atomicReference.notify();
        }
    }
}
