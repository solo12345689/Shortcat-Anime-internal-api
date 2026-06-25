package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m3 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3702m3 extends J1 implements InterfaceC3671g2 {
    private static final C3702m3 zzb;
    private int zzd;
    private int zze;

    static {
        C3702m3 c3702m3 = new C3702m3();
        zzb = c3702m3;
        J1.z(C3702m3.class, c3702m3);
    }

    private C3702m3() {
    }

    static /* synthetic */ void C(C3702m3 c3702m3, int i10) {
        c3702m3.zze = i10 - 1;
        c3702m3.zzd |= 1;
    }

    public static C3687j3 D() {
        return (C3687j3) zzb.n();
    }

    @Override // com.google.android.gms.internal.play_billing.J1
    protected final Object i(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return J1.w(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C3692k3.f40496a});
        }
        if (i11 == 3) {
            return new C3702m3();
        }
        if (i11 == 4) {
            return new C3687j3(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
