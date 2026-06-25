package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import i4.i;
import n4.AbstractC5736l;
import n4.C5733i;
import n4.C5737m;
import n4.InterfaceC5734j;
import o4.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f32790a = i.i("Alarms");

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class C0548a {
        static void a(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setExact(i10, j10, pendingIntent);
        }
    }

    public static void a(Context context, WorkDatabase workDatabase, C5737m c5737m) {
        InterfaceC5734j interfaceC5734jG = workDatabase.G();
        C5733i c5733iB = interfaceC5734jG.b(c5737m);
        if (c5733iB != null) {
            b(context, c5737m, c5733iB.f53918c);
            i.e().a(f32790a, "Removing SystemIdInfo for workSpecId (" + c5737m + ")");
            interfaceC5734jG.e(c5737m);
        }
    }

    private static void b(Context context, C5737m c5737m, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, c5737m), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        i.e().a(f32790a, "Cancelling existing alarm with (workSpecId, systemId) (" + c5737m + ", " + i10 + ")");
        alarmManager.cancel(service);
    }

    public static void c(Context context, WorkDatabase workDatabase, C5737m c5737m, long j10) {
        InterfaceC5734j interfaceC5734jG = workDatabase.G();
        C5733i c5733iB = interfaceC5734jG.b(c5737m);
        if (c5733iB != null) {
            b(context, c5737m, c5733iB.f53918c);
            d(context, c5737m, c5733iB.f53918c, j10);
        } else {
            int iC = new k(workDatabase).c();
            interfaceC5734jG.a(AbstractC5736l.a(c5737m, iC));
            d(context, c5737m, iC, j10);
        }
    }

    private static void d(Context context, C5737m c5737m, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, c5737m), 201326592);
        if (alarmManager != null) {
            C0548a.a(alarmManager, 0, j10, service);
        }
    }
}
