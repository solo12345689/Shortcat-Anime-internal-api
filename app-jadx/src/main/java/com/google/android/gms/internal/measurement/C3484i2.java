package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3484i2 extends AbstractC3442d5 implements F5 {
    private static final C3484i2 zzh;
    private int zzb;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        C3484i2 c3484i2 = new C3484i2();
        zzh = c3484i2;
        AbstractC3442d5.s(C3484i2.class, c3484i2);
    }

    private C3484i2() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3442d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3442d5.t(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C3484i2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C3475h2(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final String C() {
        return this.zzd;
    }

    public final boolean D() {
        return (this.zzb & 2) != 0;
    }

    public final boolean E() {
        return this.zze;
    }

    public final boolean F() {
        return (this.zzb & 4) != 0;
    }

    public final boolean G() {
        return this.zzf;
    }

    public final boolean H() {
        return (this.zzb & 8) != 0;
    }

    public final int I() {
        return this.zzg;
    }

    final /* synthetic */ void J(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }
}
