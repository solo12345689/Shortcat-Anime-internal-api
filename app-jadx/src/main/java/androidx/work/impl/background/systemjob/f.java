package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import i4.EnumC5035a;
import i4.b;
import i4.i;
import i4.j;
import java.util.Iterator;
import n4.C5745u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f32836b = i.i("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ComponentName f32837a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f32838a;

        static {
            int[] iArr = new int[j.values().length];
            f32838a = iArr;
            try {
                iArr[j.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32838a[j.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32838a[j.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32838a[j.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32838a[j.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    f(Context context) {
        this.f32837a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    private static JobInfo.TriggerContentUri b(b.C0772b c0772b) {
        return new JobInfo.TriggerContentUri(c0772b.a(), c0772b.b() ? 1 : 0);
    }

    static int c(j jVar) {
        int i10 = a.f32838a[jVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5 && Build.VERSION.SDK_INT >= 26) {
            return 4;
        }
        i.e().a(f32836b, "API version too low. Cannot convert network type value " + jVar);
        return 1;
    }

    static void d(JobInfo.Builder builder, j jVar) {
        if (Build.VERSION.SDK_INT < 30 || jVar != j.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(jVar));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    JobInfo a(C5745u c5745u, int i10) {
        i4.b bVar = c5745u.f53952j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", c5745u.f53943a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", c5745u.f());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", c5745u.j());
        JobInfo.Builder extras = new JobInfo.Builder(i10, this.f32837a).setRequiresCharging(bVar.g()).setRequiresDeviceIdle(bVar.h()).setExtras(persistableBundle);
        d(extras, bVar.d());
        if (!bVar.h()) {
            extras.setBackoffCriteria(c5745u.f53955m, c5745u.f53954l == EnumC5035a.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(c5745u.c() - System.currentTimeMillis(), 0L);
        if (Build.VERSION.SDK_INT <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!c5745u.f53959q) {
            extras.setImportantWhileForeground(true);
        }
        if (bVar.e()) {
            Iterator it = bVar.c().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b((b.C0772b) it.next()));
            }
            extras.setTriggerContentUpdateDelay(bVar.b());
            extras.setTriggerContentMaxDelay(bVar.a());
        }
        extras.setPersisted(false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            extras.setRequiresBatteryNotLow(bVar.f());
            extras.setRequiresStorageNotLow(bVar.i());
        }
        boolean z10 = c5745u.f53953k > 0;
        boolean z11 = jMax > 0;
        if (i11 >= 31 && c5745u.f53959q && !z10 && !z11) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
