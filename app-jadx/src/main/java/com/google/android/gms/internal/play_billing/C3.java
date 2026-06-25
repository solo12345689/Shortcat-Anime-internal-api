package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3 extends J1 implements InterfaceC3671g2 {
    private static final C3 zzb;
    private int zzd;
    private T2 zze;
    private long zzf;

    static {
        C3 c32 = new C3();
        zzb = c32;
        J1.z(C3.class, c32);
    }

    private C3() {
    }

    static /* synthetic */ void C(C3 c32, T2 t22) {
        t22.getClass();
        c32.zze = t22;
        c32.zzd |= 1;
    }

    static /* synthetic */ void D(C3 c32, long j10) {
        c32.zzd |= 2;
        c32.zzf = j10;
    }

    public static A3 E() {
        return (A3) zzb.n();
    }

    @Override // com.google.android.gms.internal.play_billing.J1
    protected final Object i(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return J1.w(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C3();
        }
        if (i11 == 4) {
            return new A3(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
