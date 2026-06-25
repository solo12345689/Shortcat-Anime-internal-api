package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class S0 extends J1 implements InterfaceC3671g2 {
    private static final S0 zzb;
    private O1 zzd = J1.u();

    static {
        S0 s02 = new S0();
        zzb = s02;
        J1.z(S0.class, s02);
    }

    private S0() {
    }

    public static R0 C() {
        return (R0) zzb.n();
    }

    static /* synthetic */ void E(S0 s02, Iterable iterable) {
        O1 o12 = s02.zzd;
        if (!o12.k()) {
            int size = o12.size();
            s02.zzd = o12.a(size + size);
        }
        AbstractC3640a1.g(iterable, s02.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.J1
    protected final Object i(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return J1.w(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", Q0.class});
        }
        if (i11 == 3) {
            return new S0();
        }
        if (i11 == 4) {
            return new R0(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
