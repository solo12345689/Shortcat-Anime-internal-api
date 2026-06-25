package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbo implements Runnable {
    final /* synthetic */ zzcz zza;
    final /* synthetic */ zzbq zzb;

    zzbo(zzbq zzbqVar, zzcz zzczVar) {
        this.zzb = zzbqVar;
        this.zza = zzczVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        this.zzb.zza.zzf(this.zza);
    }
}
