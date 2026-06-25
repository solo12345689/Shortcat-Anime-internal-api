package com.google.android.gms.internal.gtm;

import android.content.ComponentName;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class zzca implements Runnable {
    final /* synthetic */ ComponentName zza;
    final /* synthetic */ zzcb zzb;

    zzca(zzcb zzcbVar, ComponentName componentName) {
        this.zzb = zzcbVar;
        this.zza = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcc.zzb(this.zzb.zza, this.zza);
    }
}
