package r4;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import app.notifee.core.Logger;
import app.notifee.core.NotificationAlarmReceiver;
import app.notifee.core.model.NotificationModel;
import cg.AbstractC3104a;
import cg.InterfaceC3105b;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import s4.C6429i;
import t4.C6643d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExecutorService f58574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.common.util.concurrent.r f58575b;

    static {
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        f58574a = executorServiceNewCachedThreadPool;
        f58575b = com.google.common.util.concurrent.s.b(executorServiceNewCachedThreadPool);
    }

    public static PendingIntent a(String str) {
        try {
            Context context = cg.f.f33622a;
            Intent intent = new Intent(context, (Class<?>) NotificationAlarmReceiver.class);
            intent.putExtra("notificationId", str);
            return PendingIntent.getBroadcast(context, str.hashCode(), intent, 167772160);
        } catch (Exception e10) {
            Logger.e("NotifeeAlarmManager", "Unable to create AlarmManager intent", e10);
            return null;
        }
    }

    public static com.google.common.util.concurrent.p b() {
        return new cg.h(C6429i.j(cg.f.f33622a).i(Boolean.TRUE)).b(new com.google.common.util.concurrent.d() { // from class: r4.f0
            @Override // com.google.common.util.concurrent.d
            public final com.google.common.util.concurrent.p apply(Object obj) {
                return g0.e((List) obj);
            }
        }, f58575b);
    }

    public static com.google.common.util.concurrent.p c(Bundle bundle, NotificationModel notificationModel, String str, cg.v vVar, Void r52) {
        if (!bundle.containsKey("repeatFrequency") || cg.q.a(bundle.get("repeatFrequency")) == -1) {
            C6429i.j(cg.f.f33622a).m(str);
        } else {
            C6643d c6643d = new C6643d(bundle);
            c6643d.a();
            g(notificationModel, c6643d);
            C6429i.j(cg.f.f33622a).y(new cg.v(str, vVar.f33645b, cg.q.c(bundle), Boolean.TRUE));
        }
        return com.google.common.util.concurrent.j.d(null);
    }

    public static com.google.common.util.concurrent.p d(final String str, final cg.v vVar) {
        byte[] bArr;
        if (vVar == null || vVar.f33645b == null || (bArr = vVar.f33646c) == null) {
            Logger.w("NotifeeAlarmManager", "Attempted to handle doScheduledWork but no notification data was found.");
            return com.google.common.util.concurrent.j.d(null);
        }
        final Bundle bundleB = cg.q.b(bArr);
        final NotificationModel notificationModel = new NotificationModel(cg.q.b(vVar.f33645b));
        return new cg.h(E0.y(notificationModel, bundleB)).b(new com.google.common.util.concurrent.d() { // from class: r4.e0
            @Override // com.google.common.util.concurrent.d
            public final com.google.common.util.concurrent.p apply(Object obj) {
                return g0.c(bundleB, notificationModel, str, vVar, (Void) obj);
            }
        }, f58574a);
    }

    public static com.google.common.util.concurrent.p e(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PendingIntent pendingIntentA = a(((cg.v) it.next()).f33644a);
                AlarmManager alarmManagerA = AbstractC3104a.a();
                if (pendingIntentA != null) {
                    alarmManagerA.cancel(pendingIntentA);
                }
            }
        }
        return com.google.common.util.concurrent.j.d(null);
    }

    public static void f(Bundle bundle) {
        final String string;
        if (bundle == null || (string = bundle.getString("notificationId")) == null) {
            return;
        }
        cg.h hVar = new cg.h(new C6429i(cg.f.f33622a).p(string));
        com.google.common.util.concurrent.d dVar = new com.google.common.util.concurrent.d() { // from class: r4.c0
            @Override // com.google.common.util.concurrent.d
            public final com.google.common.util.concurrent.p apply(Object obj) {
                return g0.d(string, (cg.v) obj);
            }
        };
        ExecutorService executorService = f58574a;
        hVar.b(dVar, executorService).a(new InterfaceC3105b() { // from class: r4.d0
            @Override // cg.InterfaceC3105b
            public final void a(Exception exc, Object obj) {
                g0.h(exc, obj);
            }
        }, executorService);
    }

    public static void g(NotificationModel notificationModel, C6643d c6643d) {
        PendingIntent pendingIntentA = a(notificationModel.c());
        AlarmManager alarmManagerA = AbstractC3104a.a();
        C6643d.a aVar = c6643d.f60728e;
        if (Build.VERSION.SDK_INT >= 31 && Arrays.asList(C6643d.a.SET_EXACT, C6643d.a.SET_EXACT_AND_ALLOW_WHILE_IDLE, C6643d.a.SET_ALARM_CLOCK).contains(aVar) && !alarmManagerA.canScheduleExactAlarms()) {
            System.err.println("Missing SCHEDULE_EXACT_ALARM permission. Trigger not scheduled. See: https://notifee.app/react-native/docs/triggers#android-12-limitations");
            return;
        }
        c6643d.a();
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            alarmManagerA.set(1, c6643d.f60730g.longValue(), pendingIntentA);
            return;
        }
        if (iOrdinal == 1) {
            androidx.core.app.e.b(alarmManagerA, 0, c6643d.f60730g.longValue(), pendingIntentA);
            return;
        }
        if (iOrdinal == 2) {
            androidx.core.app.e.c(alarmManagerA, 0, c6643d.f60730g.longValue(), pendingIntentA);
            return;
        }
        if (iOrdinal == 3) {
            androidx.core.app.e.d(alarmManagerA, 0, c6643d.f60730g.longValue(), pendingIntentA);
        } else {
            if (iOrdinal != 4) {
                return;
            }
            Context context = cg.f.f33622a;
            androidx.core.app.e.a(alarmManagerA, c6643d.f60730g.longValue(), PendingIntent.getActivity(context, notificationModel.c().hashCode(), context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()), 201326592), pendingIntentA);
        }
    }

    public static /* synthetic */ void h(Exception exc, Object obj) {
        if (exc != null) {
            Logger.e("NotifeeAlarmManager", "Failed to display notification", exc);
        }
    }

    public void i() {
        Logger.d("NotifeeAlarmManager", "Reschedule Notifications on reboot");
        com.google.common.util.concurrent.j.a(new C6429i(cg.f.f33622a).i(Boolean.TRUE), new a(), f58575b);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class a implements com.google.common.util.concurrent.i {
        public a() {
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            byte[] bArr;
            for (cg.v vVar : (List) obj) {
                g0.this.getClass();
                byte[] bArr2 = vVar.f33645b;
                if (bArr2 != null && (bArr = vVar.f33646c) != null) {
                    Bundle bundleB = cg.q.b(bArr);
                    NotificationModel notificationModel = new NotificationModel(cg.q.b(bArr2));
                    if (cg.q.a(bundleB.get("type")) == 0) {
                        C6643d c6643d = new C6643d(bundleB);
                        if (c6643d.f60727d.booleanValue()) {
                            g0.g(notificationModel, c6643d);
                        }
                    }
                }
            }
        }

        @Override // com.google.common.util.concurrent.i
        public void a(Throwable th2) {
        }
    }
}
