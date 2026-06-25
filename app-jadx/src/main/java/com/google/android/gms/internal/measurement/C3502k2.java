package com.google.android.gms.internal.measurement;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k2 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3502k2 extends AbstractC3442d5 implements F5 {
    private static final C3502k2 zzu;
    private int zzb;
    private long zzd;
    private int zzf;
    private boolean zzk;
    private C3448e2 zzp;
    private C3538o2 zzq;
    private C3591u2 zzr;
    private C3556q2 zzs;
    private C3520m2 zzt;
    private String zze = "";
    private InterfaceC3496j5 zzg = AbstractC3442d5.y();
    private InterfaceC3496j5 zzh = AbstractC3442d5.y();
    private InterfaceC3496j5 zzi = AbstractC3442d5.y();
    private String zzj = "";
    private InterfaceC3496j5 zzl = AbstractC3442d5.y();
    private InterfaceC3496j5 zzm = AbstractC3442d5.y();
    private String zzn = "";
    private String zzo = "";

    static {
        C3502k2 c3502k2 = new C3502k2();
        zzu = c3502k2;
        AbstractC3442d5.s(C3502k2.class, c3502k2);
    }

    private C3502k2() {
    }

    public static C3493j2 S() {
        return (C3493j2) zzu.o();
    }

    public static C3502k2 T() {
        return zzu;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3442d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3442d5.t(zzu, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", C3573s2.class, "zzh", C3484i2.class, "zzi", B1.class, "zzj", "zzk", "zzl", C3.class, "zzm", C3466g2.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i11 == 3) {
            return new C3502k2();
        }
        if (i11 == 4) {
            return new C3493j2(null);
        }
        if (i11 == 5) {
            return zzu;
        }
        throw null;
    }

    public final boolean C() {
        return (this.zzb & 1) != 0;
    }

    public final long D() {
        return this.zzd;
    }

    public final boolean E() {
        return (this.zzb & 2) != 0;
    }

    public final String F() {
        return this.zze;
    }

    public final List G() {
        return this.zzg;
    }

    public final int H() {
        return this.zzh.size();
    }

    public final C3484i2 I(int i10) {
        return (C3484i2) this.zzh.get(i10);
    }

    public final List J() {
        return this.zzi;
    }

    public final List K() {
        return this.zzl;
    }

    public final int L() {
        return this.zzl.size();
    }

    public final List M() {
        return this.zzm;
    }

    public final String N() {
        return this.zzn;
    }

    public final boolean O() {
        return (this.zzb & 128) != 0;
    }

    public final C3448e2 P() {
        C3448e2 c3448e2 = this.zzp;
        return c3448e2 == null ? C3448e2.I() : c3448e2;
    }

    public final boolean Q() {
        return (this.zzb & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0;
    }

    public final C3591u2 R() {
        C3591u2 c3591u2 = this.zzr;
        return c3591u2 == null ? C3591u2.G() : c3591u2;
    }

    final /* synthetic */ void U(int i10, C3484i2 c3484i2) {
        c3484i2.getClass();
        InterfaceC3496j5 interfaceC3496j5 = this.zzh;
        if (!interfaceC3496j5.zza()) {
            this.zzh = AbstractC3442d5.z(interfaceC3496j5);
        }
        this.zzh.set(i10, c3484i2);
    }

    final /* synthetic */ void V() {
        this.zzi = AbstractC3442d5.y();
    }

    final /* synthetic */ void W() {
        this.zzl = AbstractC3442d5.y();
    }
}
