package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcf extends zzbs {
    private final zzav zza;

    zzcf(zzbv zzbvVar) {
        super(zzbvVar);
        this.zza = new zzav();
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
        zzq().b().zzh(this.zza);
        zzft zzftVarZzB = zzB();
        zzftVarZzB.zzW();
        String str = zzftVarZzB.zzb;
        if (str != null) {
            this.zza.zzk(str);
        }
        zzftVarZzB.zzW();
        String str2 = zzftVarZzB.zza;
        if (str2 != null) {
            this.zza.zzl(str2);
        }
    }
}
