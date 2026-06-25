package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.AbstractC3509l0;
import com.google.android.gms.internal.measurement.AbstractC3518m0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class V5 extends AbstractC3777b6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AlarmManager f41000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AbstractC3932x f41001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f41002f;

    protected V5(q6 q6Var) {
        super(q6Var);
        this.f41000d = (AlarmManager) this.f40611a.d().getSystemService("alarm");
    }

    private final AbstractC3932x o() {
        if (this.f41001e == null) {
            this.f41001e = new U5(this, this.f41010b.g0());
        }
        return this.f41001e;
    }

    private final void p() {
        JobScheduler jobScheduler = (JobScheduler) this.f40611a.d().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(q());
        }
    }

    private final int q() {
        if (this.f41002f == null) {
            this.f41002f = Integer.valueOf("measurement".concat(String.valueOf(this.f40611a.d().getPackageName())).hashCode());
        }
        return this.f41002f.intValue();
    }

    private final PendingIntent r() {
        Context contextD = this.f40611a.d();
        return PendingIntent.getBroadcast(contextD, 0, new Intent().setClassName(contextD, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), AbstractC3509l0.f39816a);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3777b6
    protected final boolean l() {
        AlarmManager alarmManager = this.f41000d;
        if (alarmManager != null) {
            alarmManager.cancel(r());
        }
        p();
        return false;
    }

    public final void m(long j10) {
        j();
        X2 x22 = this.f40611a;
        x22.c();
        Context contextD = x22.d();
        if (!z6.j0(contextD)) {
            x22.a().v().a("Receiver not registered/enabled");
        }
        if (!z6.E(contextD, false)) {
            x22.a().v().a("Service not registered/enabled");
        }
        n();
        x22.a().w().b("Scheduling upload, millis", Long.valueOf(j10));
        x22.e().c();
        x22.w();
        if (j10 < Math.max(0L, ((Long) AbstractC3789d2.f41165M.b(null)).longValue()) && !o().c()) {
            o().b(j10);
        }
        x22.c();
        Context contextD2 = x22.d();
        ComponentName componentName = new ComponentName(contextD2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iQ = q();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        AbstractC3518m0.a(contextD2, new JobInfo.Builder(iQ, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void n() {
        j();
        this.f40611a.a().w().a("Unscheduling upload");
        AlarmManager alarmManager = this.f41000d;
        if (alarmManager != null) {
            alarmManager.cancel(r());
        }
        o().d();
        p();
    }
}
