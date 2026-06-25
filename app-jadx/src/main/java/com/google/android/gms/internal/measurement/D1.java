package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class D1 extends AbstractC3442d5 implements F5 {
    private static final D1 zzl;
    private int zzb;
    private int zzd;
    private String zze = "";
    private InterfaceC3496j5 zzf = AbstractC3442d5.y();
    private boolean zzg;
    private J1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        D1 d12 = new D1();
        zzl = d12;
        AbstractC3442d5.s(D1.class, d12);
    }

    private D1() {
    }

    public static C1 O() {
        return (C1) zzl.o();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3442d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3442d5.t(zzl, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", F1.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new D1();
        }
        if (i11 == 4) {
            return new C1(null);
        }
        if (i11 == 5) {
            return zzl;
        }
        throw null;
    }

    public final boolean C() {
        return (this.zzb & 1) != 0;
    }

    public final int D() {
        return this.zzd;
    }

    public final String E() {
        return this.zze;
    }

    public final List F() {
        return this.zzf;
    }

    public final int G() {
        return this.zzf.size();
    }

    public final F1 H(int i10) {
        return (F1) this.zzf.get(i10);
    }

    public final boolean I() {
        return (this.zzb & 8) != 0;
    }

    public final J1 J() {
        J1 j12 = this.zzh;
        return j12 == null ? J1.L() : j12;
    }

    public final boolean K() {
        return this.zzi;
    }

    public final boolean L() {
        return this.zzj;
    }

    public final boolean M() {
        return (this.zzb & 64) != 0;
    }

    public final boolean N() {
        return this.zzk;
    }

    final /* synthetic */ void P(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    final /* synthetic */ void Q(int i10, F1 f12) {
        f12.getClass();
        InterfaceC3496j5 interfaceC3496j5 = this.zzf;
        if (!interfaceC3496j5.zza()) {
            this.zzf = AbstractC3442d5.z(interfaceC3496j5);
        }
        this.zzf.set(i10, f12);
    }
}
