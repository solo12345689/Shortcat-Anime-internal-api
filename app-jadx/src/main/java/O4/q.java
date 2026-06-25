package o4;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import n4.C5728d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WorkDatabase f54500a;

    public q(WorkDatabase workDatabase) {
        this.f54500a = workDatabase;
    }

    public static void c(Context context, S3.g gVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j11 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            gVar.M();
            try {
                gVar.m0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                gVar.m0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j11)});
                sharedPreferences.edit().clear().apply();
                gVar.l0();
            } finally {
                gVar.v0();
            }
        }
    }

    public long a() {
        Long lB = this.f54500a.F().b("last_force_stop_ms");
        if (lB != null) {
            return lB.longValue();
        }
        return 0L;
    }

    public boolean b() {
        Long lB = this.f54500a.F().b("reschedule_needed");
        return lB != null && lB.longValue() == 1;
    }

    public void d(long j10) {
        this.f54500a.F().a(new C5728d("last_force_stop_ms", Long.valueOf(j10)));
    }

    public void e(boolean z10) {
        this.f54500a.F().a(new C5728d("reschedule_needed", z10));
    }
}
