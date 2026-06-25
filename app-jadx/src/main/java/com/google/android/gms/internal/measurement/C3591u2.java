package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3591u2 extends AbstractC3442d5 implements F5 {
    private static final C3591u2 zzi;
    private int zzb;
    private int zzg;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        C3591u2 c3591u2 = new C3591u2();
        zzi = c3591u2;
        AbstractC3442d5.s(C3591u2.class, c3591u2);
    }

    private C3591u2() {
    }

    public static C3591u2 G() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3442d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3442d5.t(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C3591u2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C3582t2(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    public final String C() {
        return this.zzd;
    }

    public final String D() {
        return this.zze;
    }

    public final int E() {
        return this.zzg;
    }

    public final String F() {
        return this.zzh;
    }
}
