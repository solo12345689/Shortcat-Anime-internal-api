package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3538o2 extends AbstractC3442d5 implements F5 {
    private static final C3538o2 zzi;
    private int zzb;
    private int zzd = 14;
    private int zze = 11;
    private int zzf = 60;
    private int zzg = 13;
    private int zzh = 11;

    static {
        C3538o2 c3538o2 = new C3538o2();
        zzi = c3538o2;
        AbstractC3442d5.s(C3538o2.class, c3538o2);
    }

    private C3538o2() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3442d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3442d5.t(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C3538o2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C3529n2(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }
}
