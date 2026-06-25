package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class z3 extends J1 implements InterfaceC3671g2 {
    private static final z3 zzb;
    private int zzd;
    private int zzf;
    private O1 zze = J1.u();
    private String zzg = "";

    static {
        z3 z3Var = new z3();
        zzb = z3Var;
        J1.z(z3.class, z3Var);
    }

    private z3() {
    }

    @Override // com.google.android.gms.internal.play_billing.J1
    protected final Object i(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return J1.w(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new z3();
        }
        y3 y3Var = null;
        if (i11 == 4) {
            return new x3(y3Var);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
