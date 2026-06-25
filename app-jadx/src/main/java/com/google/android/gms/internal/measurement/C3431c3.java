package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c3 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3431c3 extends AbstractC3442d5 implements F5 {
    private static final C3431c3 zzh;
    private int zzb;
    private InterfaceC3496j5 zzd = AbstractC3442d5.y();
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        C3431c3 c3431c3 = new C3431c3();
        zzh = c3431c3;
        AbstractC3442d5.s(C3431c3.class, c3431c3);
    }

    private C3431c3() {
    }

    public static Z2 J() {
        return (Z2) zzh.o();
    }

    public static Z2 K(C3431c3 c3431c3) {
        AbstractC3424b5 abstractC3424b5O = zzh.o();
        abstractC3424b5O.r(c3431c3);
        return (Z2) abstractC3424b5O;
    }

    private final void S() {
        InterfaceC3496j5 interfaceC3496j5 = this.zzd;
        if (interfaceC3496j5.zza()) {
            return;
        }
        this.zzd = AbstractC3442d5.z(interfaceC3496j5);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3442d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3442d5.t(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", C3449e3.class, "zze", "zzf", "zzg", C3422b3.f39713a});
        }
        if (i11 == 3) {
            return new C3431c3();
        }
        if (i11 == 4) {
            return new Z2(null);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final List C() {
        return this.zzd;
    }

    public final int D() {
        return this.zzd.size();
    }

    public final C3449e3 E(int i10) {
        return (C3449e3) this.zzd.get(i10);
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final String G() {
        return this.zze;
    }

    public final boolean H() {
        return (this.zzb & 2) != 0;
    }

    public final String I() {
        return this.zzf;
    }

    final /* synthetic */ void L(int i10, C3449e3 c3449e3) {
        c3449e3.getClass();
        S();
        this.zzd.set(i10, c3449e3);
    }

    final /* synthetic */ void M(C3449e3 c3449e3) {
        c3449e3.getClass();
        S();
        this.zzd.add(c3449e3);
    }

    final /* synthetic */ void N(Iterable iterable) {
        S();
        AbstractC3593u4.g(iterable, this.zzd);
    }

    final /* synthetic */ void O() {
        this.zzd = AbstractC3442d5.y();
    }

    final /* synthetic */ void P(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    final /* synthetic */ void Q(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }
}
