package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class J2 extends J1 implements InterfaceC3671g2 {
    private static final J2 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private T2 zzh;
    private int zzi;

    static {
        J2 j22 = new J2();
        zzb = j22;
        J1.z(J2.class, j22);
    }

    private J2() {
    }

    public static J2 C(byte[] bArr, C3760z1 c3760z1) {
        return (J2) J1.s(zzb, bArr, c3760z1);
    }

    static /* synthetic */ void E(J2 j22, Y2 y22) {
        j22.zzi = y22.zza();
        j22.zzd |= 4;
    }

    static /* synthetic */ void F(J2 j22, T2 t22) {
        t22.getClass();
        j22.zzh = t22;
        j22.zzd |= 2;
    }

    static /* synthetic */ void G(J2 j22, C3702m3 c3702m3) {
        c3702m3.getClass();
        j22.zzf = c3702m3;
        j22.zze = 4;
    }

    static /* synthetic */ void H(J2 j22, C3736t3 c3736t3) {
        c3736t3.getClass();
        j22.zzf = c3736t3;
        j22.zze = 7;
    }

    static /* synthetic */ void I(J2 j22, J3 j32) {
        j32.getClass();
        j22.zzf = j32;
        j22.zze = 6;
    }

    static /* synthetic */ void J(J2 j22, int i10) {
        j22.zzg = i10 - 1;
        j22.zzd |= 1;
    }

    public static H2 K() {
        return (H2) zzb.n();
    }

    public final C3736t3 D() {
        return this.zze == 7 ? (C3736t3) this.zzf : C3736t3.E();
    }

    @Override // com.google.android.gms.internal.play_billing.J1
    protected final Object i(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return J1.w(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", K2.f40220a, "zzh", C3702m3.class, "zzi", X2.f40420a, J3.class, C3736t3.class});
        }
        if (i11 == 3) {
            return new J2();
        }
        if (i11 == 4) {
            return new H2(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
