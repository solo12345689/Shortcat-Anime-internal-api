package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.work.impl.E;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.t;
import i4.i;
import i4.m;
import i4.s;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import n4.AbstractC5736l;
import n4.AbstractC5748x;
import n4.C5733i;
import n4.C5737m;
import n4.C5745u;
import n4.InterfaceC5746v;
import o4.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class g implements t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f32839e = i.i("SystemJobScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JobScheduler f32841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E f32842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f32843d;

    public g(Context context, E e10) {
        this(context, e10, (JobScheduler) context.getSystemService("jobscheduler"), new f(context));
    }

    public static void b(Context context) {
        List listG;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (listG = g(context, jobScheduler)) == null || listG.isEmpty()) {
            return;
        }
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            e(jobScheduler, ((JobInfo) it.next()).getId());
        }
    }

    private static void e(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            i.e().d(f32839e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th2);
        }
    }

    private static List f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> listG = g(context, jobScheduler);
        if (listG == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listG) {
            C5737m c5737mH = h(jobInfo);
            if (c5737mH != null && str.equals(c5737mH.b())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static List g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            i.e().d(f32839e, "getAllPendingJobs() is not reliable on this device.", th2);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static C5737m h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C5737m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, E e10) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listG = g(context, jobScheduler);
        List listD = e10.v().G().d();
        boolean z10 = false;
        HashSet hashSet = new HashSet(listG != null ? listG.size() : 0);
        if (listG != null && !listG.isEmpty()) {
            for (JobInfo jobInfo : listG) {
                C5737m c5737mH = h(jobInfo);
                if (c5737mH != null) {
                    hashSet.add(c5737mH.b());
                } else {
                    e(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator it = listD.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains((String) it.next())) {
                i.e().a(f32839e, "Reconciling jobs");
                z10 = true;
                break;
            }
        }
        if (!z10) {
            return z10;
        }
        WorkDatabase workDatabaseV = e10.v();
        workDatabaseV.e();
        try {
            InterfaceC5746v interfaceC5746vJ = workDatabaseV.J();
            Iterator it2 = listD.iterator();
            while (it2.hasNext()) {
                interfaceC5746vJ.n((String) it2.next(), -1L);
            }
            workDatabaseV.B();
            workDatabaseV.i();
            return z10;
        } catch (Throwable th2) {
            workDatabaseV.i();
            throw th2;
        }
    }

    @Override // androidx.work.impl.t
    public void a(C5745u... c5745uArr) {
        WorkDatabase workDatabaseV = this.f32842c.v();
        k kVar = new k(workDatabaseV);
        for (C5745u c5745u : c5745uArr) {
            workDatabaseV.e();
            try {
                C5745u c5745uH = workDatabaseV.J().h(c5745u.f53943a);
                if (c5745uH == null) {
                    i.e().k(f32839e, "Skipping scheduling " + c5745u.f53943a + " because it's no longer in the DB");
                    workDatabaseV.B();
                } else if (c5745uH.f53944b != s.ENQUEUED) {
                    i.e().k(f32839e, "Skipping scheduling " + c5745u.f53943a + " because it is no longer enqueued");
                    workDatabaseV.B();
                } else {
                    C5737m c5737mA = AbstractC5748x.a(c5745u);
                    C5733i c5733iB = workDatabaseV.G().b(c5737mA);
                    int iE = c5733iB != null ? c5733iB.f53918c : kVar.e(this.f32842c.o().i(), this.f32842c.o().g());
                    if (c5733iB == null) {
                        this.f32842c.v().G().a(AbstractC5736l.a(c5737mA, iE));
                    }
                    j(c5745u, iE);
                    workDatabaseV.B();
                }
            } finally {
                workDatabaseV.i();
            }
        }
    }

    @Override // androidx.work.impl.t
    public void c(String str) {
        List listF = f(this.f32840a, this.f32841b, str);
        if (listF == null || listF.isEmpty()) {
            return;
        }
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            e(this.f32841b, ((Integer) it.next()).intValue());
        }
        this.f32842c.v().G().g(str);
    }

    @Override // androidx.work.impl.t
    public boolean d() {
        return true;
    }

    public void j(C5745u c5745u, int i10) {
        JobInfo jobInfoA = this.f32843d.a(c5745u, i10);
        i iVarE = i.e();
        String str = f32839e;
        iVarE.a(str, "Scheduling work ID " + c5745u.f53943a + "Job ID " + i10);
        try {
            if (this.f32841b.schedule(jobInfoA) == 0) {
                i.e().k(str, "Unable to schedule work ID " + c5745u.f53943a);
                if (c5745u.f53959q && c5745u.f53960r == m.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    c5745u.f53959q = false;
                    i.e().a(str, String.format("Scheduling a non-expedited job (work ID %s)", c5745u.f53943a));
                    j(c5745u, i10);
                }
            }
        } catch (IllegalStateException e10) {
            List listG = g(this.f32840a, this.f32841b);
            String str2 = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(listG != null ? listG.size() : 0), Integer.valueOf(this.f32842c.v().J().e().size()), Integer.valueOf(this.f32842c.o().h()));
            i.e().c(f32839e, str2);
            IllegalStateException illegalStateException = new IllegalStateException(str2, e10);
            K1.a aVarL = this.f32842c.o().l();
            if (aVarL == null) {
                throw illegalStateException;
            }
            aVarL.accept(illegalStateException);
        } catch (Throwable th2) {
            i.e().d(f32839e, "Unable to schedule " + c5745u, th2);
        }
    }

    public g(Context context, E e10, JobScheduler jobScheduler, f fVar) {
        this.f32840a = context;
        this.f32842c = e10;
        this.f32841b = jobScheduler;
        this.f32843d = fVar;
    }
}
