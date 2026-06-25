package com.google.android.gms.internal.gtm;

import R8.AbstractC2115p;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import com.google.android.gms.internal.gtm.zzfm;
import m9.C5649a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfn<T extends Context & zzfm> {
    private static Boolean zza;
    private final Handler zzb;
    private final T zzc;

    public zzfn(T t10) {
        AbstractC2115p.l(t10);
        this.zzc = t10;
        this.zzb = new zzga();
    }

    public static boolean zzh(Context context) {
        AbstractC2115p.l(context);
        Boolean bool = zza;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = false;
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"), 0);
            if (serviceInfo != null) {
                if (serviceInfo.enabled) {
                    z10 = true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        zza = Boolean.valueOf(z10);
        return z10;
    }

    public final int zza(Intent intent, int i10, final int i11) {
        try {
            synchronized (zzfi.zza) {
                try {
                    C5649a c5649a = zzfi.zzb;
                    if (c5649a != null && c5649a.b()) {
                        c5649a.c();
                    }
                } finally {
                }
            }
        } catch (SecurityException unused) {
        }
        zzbv zzbvVarZzg = zzbv.zzg(this.zzc);
        final zzfb zzfbVarZzm = zzbvVarZzg.zzm();
        if (intent == null) {
            zzfbVarZzm.zzR("AnalyticsService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzbvVarZzg.zzj();
        zzfbVarZzm.zzQ("Local AnalyticsService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            zzg(new Runnable() { // from class: com.google.android.gms.internal.gtm.zzfj
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzc(i11, zzfbVarZzm);
                }
            });
        }
        return 2;
    }

    public final /* synthetic */ void zzc(int i10, zzfb zzfbVar) {
        if (this.zzc.callServiceStopSelfResult(i10)) {
            zzfbVar.zzO("Local AnalyticsService processed last dispatch request");
        }
    }

    public final /* synthetic */ void zzd(zzfb zzfbVar, JobParameters jobParameters) {
        zzfbVar.zzO("AnalyticsJobService processed last dispatch request");
        this.zzc.zza(jobParameters, false);
    }

    public final void zze() {
        zzbv zzbvVarZzg = zzbv.zzg(this.zzc);
        zzfb zzfbVarZzm = zzbvVarZzg.zzm();
        zzbvVarZzg.zzj();
        zzfbVarZzm.zzO("Local AnalyticsService is starting up");
    }

    public final void zzf() {
        zzbv zzbvVarZzg = zzbv.zzg(this.zzc);
        zzfb zzfbVarZzm = zzbvVarZzg.zzm();
        zzbvVarZzg.zzj();
        zzfbVarZzm.zzO("Local AnalyticsService is shutting down");
    }

    public final void zzg(Runnable runnable) {
        zzbv.zzg(this.zzc).zzf().zze(new zzfl(this, runnable));
    }

    public final boolean zzi(final JobParameters jobParameters) {
        zzbv zzbvVarZzg = zzbv.zzg(this.zzc);
        final zzfb zzfbVarZzm = zzbvVarZzg.zzm();
        String string = jobParameters.getExtras().getString("action");
        zzbvVarZzg.zzj();
        zzfbVarZzm.zzP("Local AnalyticsJobService called. action", string);
        if (!"com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(string)) {
            return true;
        }
        zzg(new Runnable() { // from class: com.google.android.gms.internal.gtm.zzfk
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd(zzfbVarZzm, jobParameters);
            }
        });
        return true;
    }
}
