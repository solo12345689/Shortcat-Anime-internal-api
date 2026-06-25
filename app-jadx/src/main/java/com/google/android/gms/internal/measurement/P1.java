package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class P1 extends AbstractC3442d5 implements F5 {
    private static final P1 zzh;
    private int zzb;
    private int zzd;
    private boolean zzf;
    private String zze = "";
    private InterfaceC3496j5 zzg = AbstractC3442d5.y();

    static {
        P1 p12 = new P1();
        zzh = p12;
        AbstractC3442d5.s(P1.class, p12);
    }

    private P1() {
    }

    public static P1 J() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3442d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3442d5.t(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zzd", N1.f39500a, "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new P1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new M1(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean C() {
        return (this.zzb & 1) != 0;
    }

    public final boolean D() {
        return (this.zzb & 2) != 0;
    }

    public final String E() {
        return this.zze;
    }

    public final boolean F() {
        return (this.zzb & 4) != 0;
    }

    public final boolean G() {
        return this.zzf;
    }

    public final List H() {
        return this.zzg;
    }

    public final int I() {
        return this.zzg.size();
    }

    public final int L() {
        int iA = O1.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
