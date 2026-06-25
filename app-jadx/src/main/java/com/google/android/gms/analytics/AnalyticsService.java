package com.google.android.gms.analytics;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.internal.gtm.zzfm;
import com.google.android.gms.internal.gtm.zzfn;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class AnalyticsService extends Service implements zzfm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private zzfn f38842a;

    private final zzfn a() {
        if (this.f38842a == null) {
            this.f38842a = new zzfn(this);
        }
        return this.f38842a;
    }

    @Override // com.google.android.gms.internal.gtm.zzfm
    public boolean callServiceStopSelfResult(int i10) {
        return stopSelfResult(i10);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        a();
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        a().zze();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        a().zzf();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        a().zza(intent, i10, i11);
        return 2;
    }

    @Override // com.google.android.gms.internal.gtm.zzfm
    public final void zza(JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }
}
