package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e2 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3448e2 extends AbstractC3442d5 implements F5 {
    private static final C3448e2 zzi;
    private int zzb;
    private boolean zzg;
    private InterfaceC3496j5 zzd = AbstractC3442d5.y();
    private InterfaceC3496j5 zze = AbstractC3442d5.y();
    private InterfaceC3496j5 zzf = AbstractC3442d5.y();
    private InterfaceC3496j5 zzh = AbstractC3442d5.y();

    static {
        C3448e2 c3448e2 = new C3448e2();
        zzi = c3448e2;
        AbstractC3442d5.s(C3448e2.class, c3448e2);
    }

    private C3448e2() {
    }

    public static C3448e2 I() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3442d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3442d5.t(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zzd", S1.class, "zze", U1.class, "zzf", C3421b2.class, "zzg", "zzh", S1.class});
        }
        if (i11 == 3) {
            return new C3448e2();
        }
        if (i11 == 4) {
            return new Q1(null);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    public final List C() {
        return this.zzd;
    }

    public final List D() {
        return this.zze;
    }

    public final List E() {
        return this.zzf;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final boolean G() {
        return this.zzg;
    }

    public final List H() {
        return this.zzh;
    }
}
