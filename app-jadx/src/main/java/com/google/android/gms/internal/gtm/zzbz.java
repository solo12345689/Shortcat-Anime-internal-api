package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbz implements Runnable {
    final /* synthetic */ zzcb zza;
    final /* synthetic */ zzey zzb;

    zzbz(zzcb zzcbVar, zzey zzeyVar, byte[] bArr) {
        this.zza = zzcbVar;
        this.zzb = zzeyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza.zza.zzg()) {
            return;
        }
        this.zza.zza.zzF("Connected to service after a timeout");
        zzcc.zzi(this.zza.zza, this.zzb);
    }
}
