package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.EnumC3539o3;
import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class D4 extends AbstractC3805f2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JobScheduler f40708c;

    public D4(X2 x22) {
        super(x22);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3805f2
    protected final boolean m() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3805f2
    protected final void n() {
        this.f40708c = (JobScheduler) this.f40611a.d().getSystemService("jobscheduler");
    }

    public final void o(long j10) {
        j();
        h();
        JobScheduler jobScheduler = this.f40708c;
        if (jobScheduler != null && jobScheduler.getPendingJob(p()) != null) {
            this.f40611a.a().w().a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        EnumC3539o3 enumC3539o3Q = q();
        if (enumC3539o3Q != EnumC3539o3.CLIENT_UPLOAD_ELIGIBLE) {
            this.f40611a.a().w().b("[sgtm] Not eligible for Scion upload", enumC3539o3Q.name());
            return;
        }
        X2 x22 = this.f40611a;
        x22.a().w().b("[sgtm] Scheduling Scion upload, millis", Long.valueOf(j10));
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        x22.a().w().b("[sgtm] Scion upload job scheduled with result", ((JobScheduler) AbstractC2115p.l(this.f40708c)).schedule(new JobInfo.Builder(p(), new ComponentName(x22.d(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build()) == 1 ? HybridPurchaseLogicBridge.RESULT_SUCCESS : "FAILURE");
    }

    final int p() {
        return "measurement-client".concat(String.valueOf(this.f40611a.d().getPackageName())).hashCode();
    }

    final EnumC3539o3 q() {
        j();
        h();
        if (this.f40708c == null) {
            return EnumC3539o3.MISSING_JOB_SCHEDULER;
        }
        X2 x22 = this.f40611a;
        if (!x22.w().P()) {
            return EnumC3539o3.NOT_ENABLED_IN_MANIFEST;
        }
        X2 x23 = this.f40611a;
        return x23.L().u() >= 119000 ? !z6.F(x22.d(), "com.google.android.gms.measurement.AppMeasurementJobService") ? EnumC3539o3.MEASUREMENT_SERVICE_NOT_ENABLED : !x23.J().y() ? EnumC3539o3.NON_PLAY_MODE : EnumC3539o3.CLIENT_UPLOAD_ELIGIBLE : EnumC3539o3.SDK_TOO_OLD;
    }
}
