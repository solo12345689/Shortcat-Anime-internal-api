package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.D5;
import j9.I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementJobService extends JobService implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private D5 f40597a;

    private final D5 d() {
        if (this.f40597a == null) {
            this.f40597a = new D5(this);
        }
        return this.f40597a;
    }

    @Override // j9.I
    public final boolean a(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // j9.I
    public final void c(JobParameters jobParameters, boolean z10) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        d().a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        d().b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        d();
        D5.i(intent);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        d().e(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        d();
        D5.j(intent);
        return true;
    }

    @Override // j9.I
    public final void b(Intent intent) {
    }
}
