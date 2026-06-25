package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class G3 extends AbstractC3442d5 implements F5 {
    private static final G3 zzj;
    private int zzb;
    private int zzd;
    private InterfaceC3496j5 zze = AbstractC3442d5.y();
    private String zzf = "";
    private String zzg = "";
    private boolean zzh;
    private double zzi;

    static {
        G3 g32 = new G3();
        zzj = g32;
        AbstractC3442d5.s(G3.class, g32);
    }

    private G3() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3442d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3442d5.t(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zzd", E3.f39342a, "zze", G3.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new G3();
        }
        if (i11 == 4) {
            return new D3(null);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final List C() {
        return this.zze;
    }

    public final String D() {
        return this.zzf;
    }

    public final boolean E() {
        return (this.zzb & 4) != 0;
    }

    public final String F() {
        return this.zzg;
    }

    public final boolean G() {
        return (this.zzb & 8) != 0;
    }

    public final boolean H() {
        return this.zzh;
    }

    public final boolean I() {
        return (this.zzb & 16) != 0;
    }

    public final double J() {
        return this.zzi;
    }

    public final int L() {
        int iA = F3.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
