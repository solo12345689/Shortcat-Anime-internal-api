package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class Q2 extends AbstractC3442d5 implements F5 {
    private static final Q2 zzf;
    private int zzb;
    private int zzd;
    private long zze;

    static {
        Q2 q22 = new Q2();
        zzf = q22;
        AbstractC3442d5.s(Q2.class, q22);
    }

    private Q2() {
    }

    public static P2 G() {
        return (P2) zzf.o();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3442d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3442d5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new Q2();
        }
        if (i11 == 4) {
            return new P2(null);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final boolean C() {
        return (this.zzb & 1) != 0;
    }

    public final int D() {
        return this.zzd;
    }

    public final boolean E() {
        return (this.zzb & 2) != 0;
    }

    public final long F() {
        return this.zze;
    }

    final /* synthetic */ void H(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    final /* synthetic */ void I(long j10) {
        this.zzb |= 2;
        this.zze = j10;
    }
}
