package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3 extends AbstractC3442d5 implements F5 {
    private static final C3 zzf;
    private int zzb;
    private InterfaceC3496j5 zzd = AbstractC3442d5.y();
    private C3618x3 zze;

    static {
        C3 c32 = new C3();
        zzf = c32;
        AbstractC3442d5.s(C3.class, c32);
    }

    private C3() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3442d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3442d5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", G3.class, "zze"});
        }
        if (i11 == 3) {
            return new C3();
        }
        if (i11 == 4) {
            return new A3(null);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final List C() {
        return this.zzd;
    }

    public final C3618x3 D() {
        C3618x3 c3618x3 = this.zze;
        return c3618x3 == null ? C3618x3.E() : c3618x3;
    }
}
