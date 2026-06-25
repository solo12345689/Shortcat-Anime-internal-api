package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC3571s0 extends AbstractBinderC3615x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f39975a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f39976b;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r2 = r2.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object H3(android.os.Bundle r2, java.lang.Class r3) {
        /*
            r0 = 0
            if (r2 == 0) goto L2d
            java.lang.String r1 = "r"
            java.lang.Object r2 = r2.get(r1)
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r3.cast(r2)     // Catch: java.lang.ClassCastException -> L10
            return r2
        L10:
            r0 = move-exception
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getCanonicalName()
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            java.lang.String r3 = "Unexpected object type. Expected, Received: %s, %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.String r3 = "AM"
            android.util.Log.w(r3, r2, r0)
            throw r0
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.BinderC3571s0.H3(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    public final Bundle G3(long j10) {
        Bundle bundle;
        AtomicReference atomicReference = this.f39975a;
        synchronized (atomicReference) {
            if (!this.f39976b) {
                try {
                    atomicReference.wait(j10);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f39975a.get();
        }
        return bundle;
    }

    public final String e(long j10) {
        return (String) H3(G3(j10), String.class);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3623y0
    public final void f(Bundle bundle) {
        AtomicReference atomicReference = this.f39975a;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f39976b = true;
                } finally {
                    this.f39975a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Long h(long j10) {
        return (Long) H3(G3(j10), Long.class);
    }
}
