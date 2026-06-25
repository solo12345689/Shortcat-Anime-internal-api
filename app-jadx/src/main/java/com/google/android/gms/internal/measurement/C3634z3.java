package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z3 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3634z3 extends AbstractC3442d5 implements F5 {
    private static final C3634z3 zzf;
    private int zzb;
    private String zzd = "";
    private InterfaceC3496j5 zze = AbstractC3442d5.y();

    static {
        C3634z3 c3634z3 = new C3634z3();
        zzf = c3634z3;
        AbstractC3442d5.s(C3634z3.class, c3634z3);
    }

    private C3634z3() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3442d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3442d5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zzd", "zze", G3.class});
        }
        if (i11 == 3) {
            return new C3634z3();
        }
        if (i11 == 4) {
            return new C3626y3(null);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String C() {
        return this.zzd;
    }

    public final List D() {
        return this.zze;
    }
}
