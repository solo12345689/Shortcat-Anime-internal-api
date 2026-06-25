package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class w3 extends J1 implements InterfaceC3671g2 {
    private static final w3 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private C3667f3 zzg;
    private C3682i3 zzh;

    static {
        w3 w3Var = new w3();
        zzb = w3Var;
        J1.z(w3.class, w3Var);
    }

    private w3() {
    }

    static /* synthetic */ void C(w3 w3Var, J2 j22) {
        w3Var.zzf = j22;
        w3Var.zze = 2;
    }

    static /* synthetic */ void D(w3 w3Var, O2 o22) {
        w3Var.zzf = o22;
        w3Var.zze = 3;
    }

    static /* synthetic */ void E(w3 w3Var, W2 w22) {
        w22.getClass();
        w3Var.zzf = w22;
        w3Var.zze = 7;
    }

    static /* synthetic */ void F(w3 w3Var, C3667f3 c3667f3) {
        c3667f3.getClass();
        w3Var.zzg = c3667f3;
        w3Var.zzd |= 1;
    }

    static /* synthetic */ void G(w3 w3Var, C3 c32) {
        c32.getClass();
        w3Var.zzf = c32;
        w3Var.zze = 8;
    }

    static /* synthetic */ void H(w3 w3Var, G3 g32) {
        w3Var.zzf = g32;
        w3Var.zze = 4;
    }

    public static C3741u3 I() {
        return (C3741u3) zzb.n();
    }

    @Override // com.google.android.gms.internal.play_billing.J1
    protected final Object i(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return J1.w(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", J2.class, O2.class, G3.class, C3652c3.class, "zzh", W2.class, C3.class});
        }
        if (i11 == 3) {
            return new w3();
        }
        v3 v3Var = null;
        if (i11 == 4) {
            return new C3741u3(v3Var);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
