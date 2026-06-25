package com.google.android.gms.internal.gtm;

import java.lang.Thread;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbu implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ zzbv zza;

    zzbu(zzbv zzbvVar) {
        this.zza = zzbvVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        zzfb zzfbVarZzn = this.zza.zzn();
        if (zzfbVarZzn != null) {
            zzfbVarZzn.zzK("Job execution failed", th2);
        }
    }
}
