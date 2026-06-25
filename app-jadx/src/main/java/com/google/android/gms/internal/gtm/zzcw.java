package com.google.android.gms.internal.gtm;

import R8.AbstractC2115p;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzcw {
    private static volatile Handler zza;
    private final zzbv zzb;
    private final Runnable zzc;
    private volatile long zzd;

    zzcw(zzbv zzbvVar) {
        AbstractC2115p.l(zzbvVar);
        this.zzb = zzbvVar;
        this.zzc = new zzcv(this);
    }

    private final Handler zzi() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzcw.class) {
            try {
                if (zza == null) {
                    zza = new zzga(this.zzb.zza().getMainLooper());
                }
                handler = zza;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public abstract void zza();

    public final long zzb() {
        if (this.zzd == 0) {
            return 0L;
        }
        return Math.abs(this.zzb.zzr().a() - this.zzd);
    }

    public final void zze(long j10) {
        if (zzh()) {
            if (j10 < 0) {
                zzf();
                return;
            }
            long jAbs = j10 - Math.abs(this.zzb.zzr().a() - this.zzd);
            long j11 = jAbs >= 0 ? jAbs : 0L;
            zzi().removeCallbacks(this.zzc);
            if (zzi().postDelayed(this.zzc, j11)) {
                return;
            }
            this.zzb.zzm().zzK("Failed to adjust delayed post. time", Long.valueOf(j11));
        }
    }

    public final void zzf() {
        this.zzd = 0L;
        zzi().removeCallbacks(this.zzc);
    }

    public final void zzg(long j10) {
        zzf();
        if (j10 >= 0) {
            this.zzd = this.zzb.zzr().a();
            if (zzi().postDelayed(this.zzc, j10)) {
                return;
            }
            this.zzb.zzm().zzK("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    public final boolean zzh() {
        return this.zzd != 0;
    }
}
