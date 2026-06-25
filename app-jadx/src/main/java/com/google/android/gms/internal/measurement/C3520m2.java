package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3520m2 extends AbstractC3442d5 implements F5 {
    private static final C3520m2 zzd;
    private InterfaceC3496j5 zzb = AbstractC3442d5.y();

    static {
        C3520m2 c3520m2 = new C3520m2();
        zzd = c3520m2;
        AbstractC3442d5.s(C3520m2.class, c3520m2);
    }

    private C3520m2() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3442d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3442d5.t(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i11 == 3) {
            return new C3520m2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C3511l2(bArr);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }
}
