package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfl implements zzcz {
    final /* synthetic */ Runnable zza;
    final /* synthetic */ zzfn zzb;

    zzfl(zzfn zzfnVar, Runnable runnable) {
        this.zzb = zzfnVar;
        this.zza = runnable;
    }

    @Override // com.google.android.gms.internal.gtm.zzcz
    public final void zza(Throwable th2) {
        this.zzb.zzb.post(this.zza);
    }
}
