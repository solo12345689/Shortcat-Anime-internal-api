package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class G3 extends J1 implements InterfaceC3671g2 {
    private static final G3 zzb;
    private int zzd;
    private int zze;

    static {
        G3 g32 = new G3();
        zzb = g32;
        J1.z(G3.class, g32);
    }

    private G3() {
    }

    public static G3 D() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.J1
    protected final Object i(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return J1.w(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", E3.f40203a});
        }
        if (i11 == 3) {
            return new G3();
        }
        if (i11 == 4) {
            return new D3(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
