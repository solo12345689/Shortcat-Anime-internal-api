package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.c3 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3652c3 extends J1 implements InterfaceC3671g2 {
    private static final C3652c3 zzb;
    private int zzd;
    private int zzf;
    private T2 zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private N1 zzg = J1.t();
    private O1 zzh = J1.u();

    static {
        C3652c3 c3652c3 = new C3652c3();
        zzb = c3652c3;
        J1.z(C3652c3.class, c3652c3);
    }

    private C3652c3() {
    }

    @Override // com.google.android.gms.internal.play_billing.J1
    protected final Object i(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return J1.w(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", C3642a3.f40440a, "zzg", X2.f40420a, "zzh", z3.class, "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new C3652c3();
        }
        if (i11 == 4) {
            return new Z2(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
