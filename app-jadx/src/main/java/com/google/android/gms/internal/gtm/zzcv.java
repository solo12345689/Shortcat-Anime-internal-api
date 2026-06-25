package com.google.android.gms.internal.gtm;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcv implements Runnable {
    final /* synthetic */ zzcw zza;

    zzcv(zzcw zzcwVar) {
        this.zza = zzcwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.zza.zzb.zzd().e(this);
            return;
        }
        boolean zZzh = this.zza.zzh();
        this.zza.zzd = 0L;
        if (zZzh) {
            this.zza.zza();
        }
    }
}
