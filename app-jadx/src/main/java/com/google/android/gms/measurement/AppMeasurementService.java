package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.D5;
import i2.AbstractC5032a;
import j9.I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementService extends Service implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private D5 f40599a;

    private final D5 d() {
        if (this.f40599a == null) {
            this.f40599a = new D5(this);
        }
        return this.f40599a;
    }

    @Override // j9.I
    public final boolean a(int i10) {
        return stopSelfResult(i10);
    }

    @Override // j9.I
    public final void b(Intent intent) {
        AbstractC5032a.b(intent);
    }

    @Override // j9.I
    public final void c(JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return d().d(intent);
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

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        d().c(intent, i10, i11);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        d();
        D5.j(intent);
        return true;
    }
}
