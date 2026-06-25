package androidx.core.app;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {
        static AlarmManager.AlarmClockInfo a(long j10, PendingIntent pendingIntent) {
            return new AlarmManager.AlarmClockInfo(j10, pendingIntent);
        }

        static void b(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
            alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b {
        static void a(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i10, j10, pendingIntent);
        }

        static void b(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i10, j10, pendingIntent);
        }
    }

    public static void a(AlarmManager alarmManager, long j10, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        a.b(alarmManager, a.a(j10, pendingIntent), pendingIntent2);
    }

    public static void b(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
        b.a(alarmManager, i10, j10, pendingIntent);
    }

    public static void c(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
        alarmManager.setExact(i10, j10, pendingIntent);
    }

    public static void d(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
        b.b(alarmManager, i10, j10, pendingIntent);
    }
}
