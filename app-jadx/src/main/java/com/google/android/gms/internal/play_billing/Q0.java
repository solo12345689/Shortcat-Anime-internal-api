package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class Q0 extends J1 implements InterfaceC3671g2 {
    private static final Q0 zzb;
    private int zzd;
    private V0 zze;
    private V0 zzf;
    private int zzg;

    static {
        Q0 q02 = new Q0();
        zzb = q02;
        J1.z(Q0.class, q02);
    }

    private Q0() {
    }

    @Override // com.google.android.gms.internal.play_billing.J1
    protected final Object i(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return J1.w(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", Y0.a()});
        }
        if (i11 == 3) {
            return new Q0();
        }
        if (i11 == 4) {
            return new P0(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
