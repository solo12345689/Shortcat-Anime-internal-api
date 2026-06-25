package y8;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.adjust.sdk.Constants;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.zip.Adler32;
import r8.AbstractC6289o;
import v8.AbstractC6852a;
import z8.InterfaceC7327d;

/* JADX INFO: renamed from: y8.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C7211d implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f64921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC7327d f64922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f64923c;

    public C7211d(Context context, InterfaceC7327d interfaceC7327d, f fVar) {
        this.f64921a = context;
        this.f64922b = interfaceC7327d;
        this.f64923c = fVar;
    }

    private boolean d(JobScheduler jobScheduler, int i10, int i11) {
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            JobInfo next = it.next();
            int i12 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i10) {
                if (i12 >= i11) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // y8.x
    public void a(AbstractC6289o abstractC6289o, int i10) {
        b(abstractC6289o, i10, false);
    }

    @Override // y8.x
    public void b(AbstractC6289o abstractC6289o, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f64921a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f64921a.getSystemService("jobscheduler");
        int iC = c(abstractC6289o);
        if (!z10 && d(jobScheduler, iC, i10)) {
            AbstractC6852a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", abstractC6289o);
            return;
        }
        long jR1 = this.f64922b.r1(abstractC6289o);
        JobInfo.Builder builderC = this.f64923c.c(new JobInfo.Builder(iC, componentName), abstractC6289o.d(), jR1, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", abstractC6289o.b());
        persistableBundle.putInt("priority", C8.a.a(abstractC6289o.d()));
        if (abstractC6289o.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(abstractC6289o.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        AbstractC6852a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", abstractC6289o, Integer.valueOf(iC), Long.valueOf(this.f64923c.g(abstractC6289o.d(), jR1, i10)), Long.valueOf(jR1), Integer.valueOf(i10));
        jobScheduler.schedule(builderC.build());
    }

    int c(AbstractC6289o abstractC6289o) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f64921a.getPackageName().getBytes(Charset.forName(Constants.ENCODING)));
        adler32.update(abstractC6289o.b().getBytes(Charset.forName(Constants.ENCODING)));
        adler32.update(ByteBuffer.allocate(4).putInt(C8.a.a(abstractC6289o.d())).array());
        if (abstractC6289o.c() != null) {
            adler32.update(abstractC6289o.c());
        }
        return (int) adler32.getValue();
    }
}
