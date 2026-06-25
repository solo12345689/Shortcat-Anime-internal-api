package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class O2 extends J1 implements InterfaceC3671g2 {
    private static final O2 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        O2 o22 = new O2();
        zzb = o22;
        J1.z(O2.class, o22);
    }

    private O2() {
    }

    static /* synthetic */ void D(O2 o22, Y2 y22) {
        o22.zzh = y22.zza();
        o22.zzd |= 2;
    }

    static /* synthetic */ void E(O2 o22, C3702m3 c3702m3) {
        c3702m3.getClass();
        o22.zzf = c3702m3;
        o22.zze = 2;
    }

    static /* synthetic */ void F(O2 o22, C3736t3 c3736t3) {
        c3736t3.getClass();
        o22.zzf = c3736t3;
        o22.zze = 4;
    }

    static /* synthetic */ void G(O2 o22, J3 j32) {
        j32.getClass();
        o22.zzf = j32;
        o22.zze = 3;
    }

    static /* synthetic */ void H(O2 o22, int i10) {
        o22.zzg = i10 - 1;
        o22.zzd |= 1;
    }

    public static L2 I() {
        return (L2) zzb.n();
    }

    public final C3736t3 C() {
        return this.zze == 4 ? (C3736t3) this.zzf : C3736t3.E();
    }

    @Override // com.google.android.gms.internal.play_billing.J1
    protected final Object i(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return J1.w(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", K2.f40220a, C3702m3.class, J3.class, C3736t3.class, "zzh", X2.f40420a});
        }
        if (i11 == 3) {
            return new O2();
        }
        if (i11 == 4) {
            return new L2(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
