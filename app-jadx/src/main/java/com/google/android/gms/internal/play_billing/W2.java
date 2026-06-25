package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class W2 extends J1 implements InterfaceC3671g2 {
    private static final W2 zzb;

    static {
        W2 w22 = new W2();
        zzb = w22;
        J1.z(W2.class, w22);
    }

    private W2() {
    }

    public static W2 D() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.J1
    protected final Object i(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return J1.w(zzb, "\u0004\u0000", null);
        }
        if (i11 == 3) {
            return new W2();
        }
        if (i11 == 4) {
            return new U2(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
