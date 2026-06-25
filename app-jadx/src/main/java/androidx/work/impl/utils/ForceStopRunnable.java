package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.a;
import androidx.work.impl.A;
import androidx.work.impl.E;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.g;
import androidx.work.impl.u;
import i4.i;
import i4.s;
import java.util.List;
import java.util.concurrent.TimeUnit;
import n4.C5745u;
import n4.InterfaceC5742r;
import n4.InterfaceC5746v;
import o4.f;
import o4.q;
import o4.r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class ForceStopRunnable implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f32910e = i.i("ForceStopRunnable");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f32911f = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E f32913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q f32914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32915d = 0;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f32916a = i.i("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            i.e().j(f32916a, "Rescheduling alarm that keeps track of force-stops.");
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, E e10) {
        this.f32912a = context.getApplicationContext();
        this.f32913b = e10;
        this.f32914c = e10.r();
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int i10) {
        return PendingIntent.getBroadcast(context, -1, c(context), i10);
    }

    static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent pendingIntentD = d(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + f32911f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentD);
        }
    }

    public boolean a() {
        boolean zI = g.i(this.f32912a, this.f32913b);
        WorkDatabase workDatabaseV = this.f32913b.v();
        InterfaceC5746v interfaceC5746vJ = workDatabaseV.J();
        InterfaceC5742r interfaceC5742rI = workDatabaseV.I();
        workDatabaseV.e();
        try {
            List<C5745u> listT = interfaceC5746vJ.t();
            boolean z10 = (listT == null || listT.isEmpty()) ? false : true;
            if (z10) {
                for (C5745u c5745u : listT) {
                    interfaceC5746vJ.q(s.ENQUEUED, c5745u.f53943a);
                    interfaceC5746vJ.n(c5745u.f53943a, -1L);
                }
            }
            interfaceC5742rI.b();
            workDatabaseV.B();
            workDatabaseV.i();
            return z10 || zI;
        } catch (Throwable th2) {
            workDatabaseV.i();
            throw th2;
        }
    }

    public void b() {
        boolean zA = a();
        if (h()) {
            i.e().a(f32910e, "Rescheduling Workers.");
            this.f32913b.z();
            this.f32913b.r().e(false);
        } else if (e()) {
            i.e().a(f32910e, "Application was force-stopped, rescheduling.");
            this.f32913b.z();
            this.f32914c.d(System.currentTimeMillis());
        } else if (zA) {
            i.e().a(f32910e, "Found unfinished work, scheduling it.");
            u.b(this.f32913b.o(), this.f32913b.v(), this.f32913b.t());
        }
    }

    public boolean e() {
        try {
            int i10 = Build.VERSION.SDK_INT;
            PendingIntent pendingIntentD = d(this.f32912a, i10 >= 31 ? 570425344 : 536870912);
            if (i10 >= 30) {
                if (pendingIntentD != null) {
                    pendingIntentD.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) this.f32912a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long jA = this.f32914c.a();
                    for (int i11 = 0; i11 < historicalProcessExitReasons.size(); i11++) {
                        ApplicationExitInfo applicationExitInfoA = f.a(historicalProcessExitReasons.get(i11));
                        if (applicationExitInfoA.getReason() == 10 && applicationExitInfoA.getTimestamp() >= jA) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntentD == null) {
                g(this.f32912a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e10) {
            e = e10;
            i.e().l(f32910e, "Ignoring exception", e);
            return true;
        } catch (SecurityException e11) {
            e = e11;
            i.e().l(f32910e, "Ignoring exception", e);
            return true;
        }
    }

    public boolean f() {
        a aVarO = this.f32913b.o();
        if (TextUtils.isEmpty(aVarO.c())) {
            i.e().a(f32910e, "The default process name was not specified.");
            return true;
        }
        boolean zB = r.b(this.f32912a, aVarO);
        i.e().a(f32910e, "Is default app process = " + zB);
        return zB;
    }

    public boolean h() {
        return this.f32913b.r().b();
    }

    public void i(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        try {
            if (f()) {
                while (true) {
                    try {
                        A.d(this.f32912a);
                        i.e().a(f32910e, "Performing cleanup operations.");
                        try {
                            b();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e10) {
                            i10 = this.f32915d + 1;
                            this.f32915d = i10;
                            if (i10 >= 3) {
                                i iVarE = i.e();
                                String str = f32910e;
                                iVarE.d(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                                IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                                K1.a aVarE = this.f32913b.o().e();
                                if (aVarE == null) {
                                    throw illegalStateException;
                                }
                                i.e().b(str, "Routing exception to the specified exception handler", illegalStateException);
                                aVarE.accept(illegalStateException);
                            } else {
                                i.e().b(f32910e, "Retrying after " + (((long) i10) * 300), e10);
                                i(((long) this.f32915d) * 300);
                            }
                        }
                        i.e().b(f32910e, "Retrying after " + (((long) i10) * 300), e10);
                        i(((long) this.f32915d) * 300);
                    } catch (SQLiteException e11) {
                        i.e().c(f32910e, "Unexpected SQLite exception during migrations");
                        IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e11);
                        K1.a aVarE2 = this.f32913b.o().e();
                        if (aVarE2 == null) {
                            throw illegalStateException2;
                        }
                        aVarE2.accept(illegalStateException2);
                    }
                }
            }
        } finally {
            this.f32913b.y();
        }
    }
}
