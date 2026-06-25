package o4;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import kotlin.jvm.internal.AbstractC5504s;
import n4.C5728d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    public static final void c(Context context, S3.g sqLiteDatabase) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(sqLiteDatabase, "sqLiteDatabase");
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i10 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i11 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            sqLiteDatabase.M();
            try {
                sqLiteDatabase.m0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                sqLiteDatabase.m0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                sharedPreferences.edit().clear().apply();
                sqLiteDatabase.l0();
            } finally {
                sqLiteDatabase.v0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(WorkDatabase workDatabase, String str) {
        Long lB = workDatabase.F().b(str);
        int iLongValue = lB != null ? (int) lB.longValue() : 0;
        e(workDatabase, str, iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0);
        return iLongValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(WorkDatabase workDatabase, String str, int i10) {
        workDatabase.F().a(new C5728d(str, Long.valueOf(i10)));
    }
}
