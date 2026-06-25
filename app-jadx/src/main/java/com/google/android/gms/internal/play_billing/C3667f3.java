package com.google.android.gms.internal.play_billing;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.f3 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3667f3 extends J1 implements InterfaceC3671g2 {
    private static final C3667f3 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;

    static {
        C3667f3 c3667f3 = new C3667f3();
        zzb = c3667f3;
        J1.z(C3667f3.class, c3667f3);
    }

    private C3667f3() {
    }

    static /* synthetic */ void C(C3667f3 c3667f3, int i10) {
        c3667f3.zzd |= 128;
        c3667f3.zzl = i10;
    }

    static /* synthetic */ void D(C3667f3 c3667f3, int i10) {
        c3667f3.zzd |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        c3667f3.zzm = i10;
    }

    static /* synthetic */ void E(C3667f3 c3667f3, int i10) {
        c3667f3.zzd |= 8;
        c3667f3.zzh = i10;
    }

    static /* synthetic */ void F(C3667f3 c3667f3, long j10) {
        c3667f3.zzd |= 16;
        c3667f3.zzi = j10;
    }

    static /* synthetic */ void G(C3667f3 c3667f3, long j10) {
        c3667f3.zzd |= 32;
        c3667f3.zzj = j10;
    }

    static /* synthetic */ void H(C3667f3 c3667f3, long j10) {
        c3667f3.zzd |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        c3667f3.zzn = 772604006L;
    }

    static /* synthetic */ void I(C3667f3 c3667f3, String str) {
        str.getClass();
        c3667f3.zzd |= 4;
        c3667f3.zzg = str;
    }

    static /* synthetic */ void J(C3667f3 c3667f3, boolean z10) {
        c3667f3.zzd |= 64;
        c3667f3.zzk = z10;
    }

    static /* synthetic */ void K(C3667f3 c3667f3, String str) {
        str.getClass();
        c3667f3.zzd |= 1;
        c3667f3.zze = str;
    }

    static /* synthetic */ void L(C3667f3 c3667f3, String str) {
        c3667f3.zzd |= 2;
        c3667f3.zzf = str;
    }

    public static C3657d3 M() {
        return (C3657d3) zzb.n();
    }

    @Override // com.google.android.gms.internal.play_billing.J1
    protected final Object i(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return J1.w(zzb, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i11 == 3) {
            return new C3667f3();
        }
        if (i11 == 4) {
            return new C3657d3(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
