package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import androidx.work.impl.E;
import androidx.work.impl.InterfaceC2955e;
import androidx.work.impl.v;
import androidx.work.impl.w;
import i4.i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import n4.C5737m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class SystemJobService extends JobService implements InterfaceC2955e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f32832d = i.i("SystemJobService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private E f32833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f32834b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w f32835c = new w();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {
        static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b {
        static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    private static C5737m a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C5737m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // androidx.work.impl.InterfaceC2955e
    public void f(C5737m c5737m, boolean z10) {
        JobParameters jobParameters;
        i.e().a(f32832d, c5737m.b() + " executed on JobScheduler");
        synchronized (this.f32834b) {
            jobParameters = (JobParameters) this.f32834b.remove(c5737m);
        }
        this.f32835c.b(c5737m);
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            E eQ = E.q(getApplicationContext());
            this.f32833a = eQ;
            eQ.s().g(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            i.e().k(f32832d, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        E e10 = this.f32833a;
        if (e10 != null) {
            e10.s().l(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f32833a == null) {
            i.e().a(f32832d, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        C5737m c5737mA = a(jobParameters);
        if (c5737mA == null) {
            i.e().c(f32832d, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f32834b) {
            try {
                if (this.f32834b.containsKey(c5737mA)) {
                    i.e().a(f32832d, "Job is already being executed by SystemJobService: " + c5737mA);
                    return false;
                }
                i.e().a(f32832d, "onStartJob for " + c5737mA);
                this.f32834b.put(c5737mA, jobParameters);
                int i10 = Build.VERSION.SDK_INT;
                WorkerParameters.a aVar = new WorkerParameters.a();
                if (a.b(jobParameters) != null) {
                    aVar.f32659b = Arrays.asList(a.b(jobParameters));
                }
                if (a.a(jobParameters) != null) {
                    aVar.f32658a = Arrays.asList(a.a(jobParameters));
                }
                if (i10 >= 28) {
                    aVar.f32660c = b.a(jobParameters);
                }
                this.f32833a.C(this.f32835c.d(c5737mA), aVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f32833a == null) {
            i.e().a(f32832d, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        C5737m c5737mA = a(jobParameters);
        if (c5737mA == null) {
            i.e().c(f32832d, "WorkSpec id not found!");
            return false;
        }
        i.e().a(f32832d, "onStopJob for " + c5737mA);
        synchronized (this.f32834b) {
            this.f32834b.remove(c5737mA);
        }
        v vVarB = this.f32835c.b(c5737mA);
        if (vVarB != null) {
            this.f32833a.E(vVarB);
        }
        return !this.f32833a.s().j(c5737mA.b());
    }
}
