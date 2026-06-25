package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l3 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3512l3 extends AbstractC3442d5 implements F5 {
    private static final C3512l3 zzf;
    private int zzb;
    private int zzd;
    private InterfaceC3487i5 zze = AbstractC3442d5.w();

    static {
        C3512l3 c3512l3 = new C3512l3();
        zzf = c3512l3;
        AbstractC3442d5.s(C3512l3.class, c3512l3);
    }

    private C3512l3() {
    }

    public static C3503k3 H() {
        return (C3503k3) zzf.o();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3442d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3442d5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new C3512l3();
        }
        if (i11 == 4) {
            return new C3503k3(null);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final boolean C() {
        return (this.zzb & 1) != 0;
    }

    public final int D() {
        return this.zzd;
    }

    public final List E() {
        return this.zze;
    }

    public final int F() {
        return this.zze.size();
    }

    public final long G(int i10) {
        return this.zze.p0(i10);
    }

    final /* synthetic */ void I(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    final /* synthetic */ void J(Iterable iterable) {
        InterfaceC3487i5 interfaceC3487i5 = this.zze;
        if (!interfaceC3487i5.zza()) {
            this.zze = AbstractC3442d5.x(interfaceC3487i5);
        }
        AbstractC3593u4.g(iterable, this.zze);
    }
}
