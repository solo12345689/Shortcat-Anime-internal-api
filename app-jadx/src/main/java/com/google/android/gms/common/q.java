package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class q extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final WeakReference f38964c = new WeakReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f38965b;

    q(byte[] bArr) {
        super(bArr);
        this.f38965b = f38964c;
    }

    @Override // com.google.android.gms.common.n
    final byte[] G3() {
        byte[] bArrI3;
        synchronized (this) {
            try {
                bArrI3 = (byte[]) this.f38965b.get();
                if (bArrI3 == null) {
                    bArrI3 = I3();
                    this.f38965b = new WeakReference(bArrI3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArrI3;
    }

    protected abstract byte[] I3();
}
