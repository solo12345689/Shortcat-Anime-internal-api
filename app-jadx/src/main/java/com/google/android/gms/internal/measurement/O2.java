package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class O2 extends AbstractC3442d5 implements F5 {
    private static final O2 zzd;
    private InterfaceC3496j5 zzb = AbstractC3442d5.y();

    static {
        O2 o22 = new O2();
        zzd = o22;
        AbstractC3442d5.s(O2.class, o22);
    }

    private O2() {
    }

    public static H2 D() {
        return (H2) zzd.o();
    }

    public static O2 E() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3442d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3442d5.t(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", L2.class});
        }
        if (i11 == 3) {
            return new O2();
        }
        if (i11 == 4) {
            return new H2(null);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List C() {
        return this.zzb;
    }

    final /* synthetic */ void F(Iterable iterable) {
        InterfaceC3496j5 interfaceC3496j5 = this.zzb;
        if (!interfaceC3496j5.zza()) {
            this.zzb = AbstractC3442d5.z(interfaceC3496j5);
        }
        AbstractC3593u4.g(iterable, this.zzb);
    }
}
