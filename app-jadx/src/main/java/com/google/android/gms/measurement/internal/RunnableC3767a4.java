package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC3623y0;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.a4 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3767a4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InterfaceC3623y0 f41093a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C3937x4 f41094b;

    RunnableC3767a4(C3937x4 c3937x4, InterfaceC3623y0 interfaceC3623y0) {
        this.f41093a = interfaceC3623y0;
        Objects.requireNonNull(c3937x4);
        this.f41094b = c3937x4;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.x4 r0 = r8.f41094b
            com.google.android.gms.measurement.internal.X2 r1 = r0.f40611a
            com.google.android.gms.measurement.internal.N5 r1 = r1.z()
            com.google.android.gms.measurement.internal.X2 r1 = r1.f40611a
            com.google.android.gms.measurement.internal.E2 r2 = r1.x()
            com.google.android.gms.measurement.internal.E3 r2 = r2.w()
            j9.v r3 = j9.v.ANALYTICS_STORAGE
            boolean r2 = r2.o(r3)
            r3 = 0
            if (r2 != 0) goto L2a
            com.google.android.gms.measurement.internal.q2 r1 = r1.a()
            com.google.android.gms.measurement.internal.o2 r1 = r1.t()
            java.lang.String r2 = "Analytics storage consent denied; will not get session id"
            r1.a(r2)
        L28:
            r1 = r3
            goto L5b
        L2a:
            com.google.android.gms.measurement.internal.E2 r2 = r1.x()
            com.google.android.gms.common.util.d r4 = r1.e()
            long r4 = r4.a()
            boolean r2 = r2.A(r4)
            if (r2 != 0) goto L28
            com.google.android.gms.measurement.internal.E2 r2 = r1.x()
            com.google.android.gms.measurement.internal.B2 r2 = r2.f40729r
            long r4 = r2.a()
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L4d
            goto L28
        L4d:
            com.google.android.gms.measurement.internal.E2 r1 = r1.x()
            com.google.android.gms.measurement.internal.B2 r1 = r1.f40729r
            long r1 = r1.a()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L5b:
            if (r1 == 0) goto L6d
            com.google.android.gms.measurement.internal.X2 r0 = r0.f40611a
            com.google.android.gms.internal.measurement.y0 r2 = r8.f41093a
            com.google.android.gms.measurement.internal.z6 r0 = r0.C()
            long r3 = r1.longValue()
            r0.b0(r2, r3)
            return
        L6d:
            com.google.android.gms.internal.measurement.y0 r0 = r8.f41093a     // Catch: android.os.RemoteException -> L73
            r0.f(r3)     // Catch: android.os.RemoteException -> L73
            return
        L73:
            r0 = move-exception
            com.google.android.gms.measurement.internal.x4 r1 = r8.f41094b
            com.google.android.gms.measurement.internal.X2 r1 = r1.f40611a
            com.google.android.gms.measurement.internal.q2 r1 = r1.a()
            com.google.android.gms.measurement.internal.o2 r1 = r1.o()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.RunnableC3767a4.run():void");
    }
}
