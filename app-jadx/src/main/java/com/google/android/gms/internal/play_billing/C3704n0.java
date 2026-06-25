package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3704n0 extends AbstractC3694l0 {
    /* synthetic */ C3704n0(AbstractC3743v0 abstractC3743v0) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3694l0
    final C3679i0 a(AbstractC3719q0 abstractC3719q0, C3679i0 c3679i0) {
        C3679i0 c3679i02;
        synchronized (abstractC3719q0) {
            try {
                c3679i02 = abstractC3719q0.f40540b;
                if (c3679i02 != c3679i0) {
                    abstractC3719q0.f40540b = c3679i0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c3679i02;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3694l0
    final C3714p0 b(AbstractC3719q0 abstractC3719q0, C3714p0 c3714p0) {
        C3714p0 c3714p02;
        synchronized (abstractC3719q0) {
            try {
                c3714p02 = abstractC3719q0.f40541c;
                if (c3714p02 != c3714p0) {
                    abstractC3719q0.f40541c = c3714p0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c3714p02;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3694l0
    final void c(C3714p0 c3714p0, C3714p0 c3714p02) {
        c3714p0.f40531b = c3714p02;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC3694l0
    public final void d(C3714p0 c3714p0, Thread thread) {
        c3714p0.f40530a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3694l0
    final boolean e(AbstractC3719q0 abstractC3719q0, C3679i0 c3679i0, C3679i0 c3679i02) {
        synchronized (abstractC3719q0) {
            try {
                if (abstractC3719q0.f40540b != c3679i0) {
                    return false;
                }
                abstractC3719q0.f40540b = c3679i02;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3694l0
    final boolean f(AbstractC3719q0 abstractC3719q0, Object obj, Object obj2) {
        synchronized (abstractC3719q0) {
            try {
                if (abstractC3719q0.f40539a != obj) {
                    return false;
                }
                abstractC3719q0.f40539a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3694l0
    final boolean g(AbstractC3719q0 abstractC3719q0, C3714p0 c3714p0, C3714p0 c3714p02) {
        synchronized (abstractC3719q0) {
            try {
                if (abstractC3719q0.f40541c != c3714p0) {
                    return false;
                }
                abstractC3719q0.f40541c = c3714p02;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
