package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class S1 extends AbstractC3442d5 implements F5 {
    private static final S1 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        S1 s12 = new S1();
        zzg = s12;
        AbstractC3442d5.s(S1.class, s12);
    }

    private S1() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3442d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3442d5.t(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", X1.f39618a, "zze", V1.f39597a, "zzf", C3430c2.f39728a});
        }
        if (i11 == 3) {
            return new S1();
        }
        if (i11 == 4) {
            return new R1(null);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final int D() {
        int iA = Z1.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int E() {
        int iA = W1.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int F() {
        int iA = AbstractC3439d2.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
