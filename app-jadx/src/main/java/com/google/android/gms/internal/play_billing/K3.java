package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class K3 extends H0 {
    K3() {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.H0
    final void a(L3 l32, L3 l33) {
        l32.f40224b = l33;
    }

    @Override // com.google.android.gms.internal.play_billing.H0
    final void b(L3 l32, Thread thread) {
        l32.f40223a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.H0
    final boolean c(N3 n32, C3730s2 c3730s2, C3730s2 c3730s22) {
        synchronized (n32) {
            try {
                if (n32.f40237b != c3730s2) {
                    return false;
                }
                n32.f40237b = c3730s22;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.H0
    final boolean d(N3 n32, Object obj, Object obj2) {
        synchronized (n32) {
            try {
                if (n32.f40236a != obj) {
                    return false;
                }
                n32.f40236a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.H0
    final boolean e(N3 n32, L3 l32, L3 l33) {
        synchronized (n32) {
            try {
                if (n32.f40238c != l32) {
                    return false;
                }
                n32.f40238c = l33;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
