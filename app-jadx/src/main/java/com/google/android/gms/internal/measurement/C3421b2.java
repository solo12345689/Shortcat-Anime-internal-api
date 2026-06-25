package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3421b2 extends AbstractC3442d5 implements F5 {
    private static final C3421b2 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        C3421b2 c3421b2 = new C3421b2();
        zzf = c3421b2;
        AbstractC3442d5.s(C3421b2.class, c3421b2);
    }

    private C3421b2() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3442d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3442d5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new C3421b2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C3412a2(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String C() {
        return this.zzd;
    }
}
