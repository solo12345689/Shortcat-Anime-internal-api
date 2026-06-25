package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class J3 extends J1 implements InterfaceC3671g2 {
    private static final J3 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;

    static {
        J3 j32 = new J3();
        zzb = j32;
        J1.z(J3.class, j32);
    }

    private J3() {
    }

    static /* synthetic */ void C(J3 j32, boolean z10) {
        j32.zzd |= 8;
        j32.zzh = z10;
    }

    static /* synthetic */ void D(J3 j32, int i10) {
        j32.zzd |= 16;
        j32.zzi = i10;
    }

    static /* synthetic */ void E(J3 j32, long j10) {
        j32.zzd |= 4;
        j32.zzg = j10;
    }

    static /* synthetic */ void F(J3 j32, boolean z10) {
        j32.zzd |= 2;
        j32.zzf = true;
    }

    public static H3 G() {
        return (H3) zzb.n();
    }

    @Override // com.google.android.gms.internal.play_billing.J1
    protected final Object i(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return J1.w(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new J3();
        }
        if (i11 == 4) {
            return new H3(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
