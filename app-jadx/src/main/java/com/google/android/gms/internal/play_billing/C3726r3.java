package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.r3 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3726r3 extends J1 implements InterfaceC3671g2 {
    private static final C3726r3 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        C3726r3 c3726r3 = new C3726r3();
        zzb = c3726r3;
        J1.z(C3726r3.class, c3726r3);
    }

    private C3726r3() {
    }

    @Override // com.google.android.gms.internal.play_billing.J1
    protected final Object i(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return J1.w(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", C3722q3.f40542a, "zzf"});
        }
        if (i11 == 3) {
            return new C3726r3();
        }
        if (i11 == 4) {
            return new C3717p3(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
