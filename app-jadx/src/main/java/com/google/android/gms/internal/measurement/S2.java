package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class S2 extends AbstractC3442d5 implements F5 {
    private static final S2 zzj;
    private int zzb;
    private InterfaceC3496j5 zzd = AbstractC3442d5.y();
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;

    static {
        S2 s22 = new S2();
        zzj = s22;
        AbstractC3442d5.s(S2.class, s22);
    }

    private S2() {
    }

    public static R2 M() {
        return (R2) zzj.o();
    }

    private final void X() {
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
            return AbstractC3442d5.t(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", W2.class, "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new S2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new R2(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final List C() {
        return this.zzd;
    }

    public final int D() {
        return this.zzd.size();
    }

    public final W2 E(int i10) {
        return (W2) this.zzd.get(i10);
    }

    public final String F() {
        return this.zze;
    }

    public final boolean G() {
        return (this.zzb & 2) != 0;
    }

    public final long H() {
        return this.zzf;
    }

    public final boolean I() {
        return (this.zzb & 4) != 0;
    }

    public final long J() {
        return this.zzg;
    }

    public final boolean K() {
        return (this.zzb & 8) != 0;
    }

    public final int L() {
        return this.zzh;
    }

    final /* synthetic */ void N(int i10, W2 w22) {
        w22.getClass();
        X();
        this.zzd.set(i10, w22);
    }

    final /* synthetic */ void O(W2 w22) {
        w22.getClass();
        X();
        this.zzd.add(w22);
    }

    final /* synthetic */ void P(Iterable iterable) {
        X();
        AbstractC3593u4.g(iterable, this.zzd);
    }

    final /* synthetic */ void Q() {
        this.zzd = AbstractC3442d5.y();
    }

    final /* synthetic */ void R(int i10) {
        X();
        this.zzd.remove(i10);
    }

    final /* synthetic */ void S(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    final /* synthetic */ void T(long j10) {
        this.zzb |= 2;
        this.zzf = j10;
    }

    final /* synthetic */ void U(long j10) {
        this.zzb |= 4;
        this.zzg = j10;
    }

    final /* synthetic */ void V(long j10) {
        this.zzb |= 16;
        this.zzi = j10;
    }
}
