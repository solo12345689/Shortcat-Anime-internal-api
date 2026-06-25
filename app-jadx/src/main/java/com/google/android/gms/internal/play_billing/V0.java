package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class V0 extends J1 implements InterfaceC3671g2 {
    private static final V0 zzb;
    private int zzd;
    private String zze = "";

    static {
        V0 v02 = new V0();
        zzb = v02;
        J1.z(V0.class, v02);
    }

    private V0() {
    }

    @Override // com.google.android.gms.internal.play_billing.J1
    protected final Object i(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return J1.w(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new V0();
        }
        W0 w02 = null;
        if (i11 == 4) {
            return new U0(w02);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
