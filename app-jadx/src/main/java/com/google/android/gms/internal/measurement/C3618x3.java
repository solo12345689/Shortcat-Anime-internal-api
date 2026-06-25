package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x3 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3618x3 extends AbstractC3442d5 implements F5 {
    private static final C3618x3 zzd;
    private InterfaceC3496j5 zzb = AbstractC3442d5.y();

    static {
        C3618x3 c3618x3 = new C3618x3();
        zzd = c3618x3;
        AbstractC3442d5.s(C3618x3.class, c3618x3);
    }

    private C3618x3() {
    }

    public static C3618x3 E() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3442d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3442d5.t(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", C3634z3.class});
        }
        if (i11 == 3) {
            return new C3618x3();
        }
        if (i11 == 4) {
            return new C3610w3(null);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List C() {
        return this.zzb;
    }

    public final int D() {
        return this.zzb.size();
    }
}
