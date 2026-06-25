package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3583t3 extends AbstractC3442d5 implements F5 {
    private static final C3583t3 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C3583t3 c3583t3 = new C3583t3();
        zzg = c3583t3;
        AbstractC3442d5.s(C3583t3.class, c3583t3);
    }

    private C3583t3() {
    }

    public static C3521m3 D() {
        return (C3521m3) zzg.o();
    }

    public static C3583t3 E() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3442d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3442d5.t(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", C3565r3.f39954a, "zze", C3530n3.f39870a, "zzf", C3548p3.f39925a});
        }
        if (i11 == 3) {
            return new C3583t3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C3521m3(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final EnumC3539o3 C() {
        EnumC3539o3 enumC3539o3A = EnumC3539o3.a(this.zze);
        return enumC3539o3A == null ? EnumC3539o3.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : enumC3539o3A;
    }

    final /* synthetic */ void F(EnumC3539o3 enumC3539o3) {
        this.zze = enumC3539o3.zza();
        this.zzb |= 2;
    }

    public final int H() {
        int iA = AbstractC3574s3.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int I() {
        int iA = AbstractC3557q3.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    final /* synthetic */ void J(int i10) {
        this.zzd = i10 - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void K(int i10) {
        this.zzf = i10 - 1;
        this.zzb |= 4;
    }
}
