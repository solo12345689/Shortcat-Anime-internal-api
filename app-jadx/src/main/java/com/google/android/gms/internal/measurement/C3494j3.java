package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j3 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3494j3 extends AbstractC3442d5 implements F5 {
    private static final C3494j3 zzg;
    private InterfaceC3487i5 zzb = AbstractC3442d5.w();
    private InterfaceC3487i5 zzd = AbstractC3442d5.w();
    private InterfaceC3496j5 zze = AbstractC3442d5.y();
    private InterfaceC3496j5 zzf = AbstractC3442d5.y();

    static {
        C3494j3 c3494j3 = new C3494j3();
        zzg = c3494j3;
        AbstractC3442d5.s(C3494j3.class, c3494j3);
    }

    private C3494j3() {
    }

    public static C3485i3 K() {
        return (C3485i3) zzg.o();
    }

    public static C3494j3 L() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3442d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3442d5.t(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", Q2.class, "zzf", C3512l3.class});
        }
        if (i11 == 3) {
            return new C3494j3();
        }
        if (i11 == 4) {
            return new C3485i3(null);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final List C() {
        return this.zzb;
    }

    public final int D() {
        return this.zzb.size();
    }

    public final List E() {
        return this.zzd;
    }

    public final int F() {
        return this.zzd.size();
    }

    public final List G() {
        return this.zze;
    }

    public final int H() {
        return this.zze.size();
    }

    public final List I() {
        return this.zzf;
    }

    public final int J() {
        return this.zzf.size();
    }

    final /* synthetic */ void M(Iterable iterable) {
        InterfaceC3487i5 interfaceC3487i5 = this.zzb;
        if (!interfaceC3487i5.zza()) {
            this.zzb = AbstractC3442d5.x(interfaceC3487i5);
        }
        AbstractC3593u4.g(iterable, this.zzb);
    }

    final /* synthetic */ void N() {
        this.zzb = AbstractC3442d5.w();
    }

    final /* synthetic */ void O(Iterable iterable) {
        InterfaceC3487i5 interfaceC3487i5 = this.zzd;
        if (!interfaceC3487i5.zza()) {
            this.zzd = AbstractC3442d5.x(interfaceC3487i5);
        }
        AbstractC3593u4.g(iterable, this.zzd);
    }

    final /* synthetic */ void P() {
        this.zzd = AbstractC3442d5.w();
    }

    final /* synthetic */ void Q(Iterable iterable) {
        InterfaceC3496j5 interfaceC3496j5 = this.zze;
        if (!interfaceC3496j5.zza()) {
            this.zze = AbstractC3442d5.z(interfaceC3496j5);
        }
        AbstractC3593u4.g(iterable, this.zze);
    }

    final /* synthetic */ void R() {
        this.zze = AbstractC3442d5.y();
    }

    final /* synthetic */ void S(Iterable iterable) {
        InterfaceC3496j5 interfaceC3496j5 = this.zzf;
        if (!interfaceC3496j5.zza()) {
            this.zzf = AbstractC3442d5.z(interfaceC3496j5);
        }
        AbstractC3593u4.g(iterable, this.zzf);
    }

    final /* synthetic */ void T() {
        this.zzf = AbstractC3442d5.y();
    }
}
