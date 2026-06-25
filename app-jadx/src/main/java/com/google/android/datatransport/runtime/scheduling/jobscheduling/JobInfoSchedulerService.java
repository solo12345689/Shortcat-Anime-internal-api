package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import C8.a;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import r8.AbstractC6289o;
import r8.C6294t;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        C6294t.f(getApplicationContext());
        AbstractC6289o.a aVarD = AbstractC6289o.a().b(string).d(a.b(i10));
        if (string2 != null) {
            aVarD.c(Base64.decode(string2, 0));
        }
        C6294t.c().e().m(aVarD.a(), i11, new Runnable() { // from class: y8.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f64924a.jobFinished(jobParameters, false);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
