package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class T2 extends J1 implements InterfaceC3671g2 {
    private static final T2 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private String zzf = "";
    private String zzh = "";

    static {
        T2 t22 = new T2();
        zzb = t22;
        J1.z(T2.class, t22);
    }

    private T2() {
    }

    static /* synthetic */ void C(T2 t22, String str) {
        t22.zzd |= 8;
        t22.zzh = str;
    }

    static /* synthetic */ void D(T2 t22, String str) {
        str.getClass();
        t22.zzd |= 2;
        t22.zzf = str;
    }

    static /* synthetic */ void E(T2 t22, int i10) {
        t22.zzd |= 16;
        t22.zzi = i10;
    }

    static /* synthetic */ void F(T2 t22, R2 r22) {
        t22.zzg = r22.zza();
        t22.zzd |= 4;
    }

    static /* synthetic */ void G(T2 t22, int i10) {
        t22.zzd |= 1;
        t22.zze = i10;
    }

    public static P2 H() {
        return (P2) zzb.n();
    }

    @Override // com.google.android.gms.internal.play_billing.J1
    protected final Object i(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return J1.w(zzb, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", Q2.f40254a, "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new T2();
        }
        if (i11 == 4) {
            return new P2(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
