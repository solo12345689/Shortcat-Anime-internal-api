package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t3 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3736t3 extends J1 implements InterfaceC3671g2 {
    private static final C3736t3 zzb;
    private int zzd;
    private O1 zze = J1.u();
    private String zzf = "";
    private boolean zzg;

    static {
        C3736t3 c3736t3 = new C3736t3();
        zzb = c3736t3;
        J1.z(C3736t3.class, c3736t3);
    }

    private C3736t3() {
    }

    static /* synthetic */ void C(C3736t3 c3736t3, boolean z10) {
        c3736t3.zzd |= 2;
        c3736t3.zzg = z10;
    }

    public static C3736t3 E() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.J1
    protected final Object i(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return J1.w(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", C3726r3.class, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C3736t3();
        }
        if (i11 == 4) {
            return new C3712o3(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
