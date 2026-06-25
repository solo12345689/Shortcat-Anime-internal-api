package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h3 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3476h3 extends AbstractC3442d5 implements F5 {
    private static final C3476h3 zzf;
    private int zzb;
    private int zzd = 1;
    private InterfaceC3496j5 zze = AbstractC3442d5.y();

    static {
        C3476h3 c3476h3 = new C3476h3();
        zzf = c3476h3;
        AbstractC3442d5.s(C3476h3.class, c3476h3);
    }

    private C3476h3() {
    }

    public static C3458f3 C() {
        return (C3458f3) zzf.o();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3442d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3442d5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zzd", C3467g3.f39765a, "zze", U2.class});
        }
        if (i11 == 3) {
            return new C3476h3();
        }
        if (i11 == 4) {
            return new C3458f3(null);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    final /* synthetic */ void D(U2 u22) {
        u22.getClass();
        InterfaceC3496j5 interfaceC3496j5 = this.zze;
        if (!interfaceC3496j5.zza()) {
            this.zze = AbstractC3442d5.z(interfaceC3496j5);
        }
        this.zze.add(u22);
    }
}
