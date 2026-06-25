package app.notifee.core.database;

import M3.p;
import M3.q;
import N3.b;
import S3.g;
import android.content.Context;
import cg.t;
import com.google.common.util.concurrent.r;
import com.google.common.util.concurrent.s;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class NotifeeCoreDatabase extends q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static volatile NotifeeCoreDatabase f32991p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final r f32992q = s.b(Executors.newCachedThreadPool());

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f32993r = new a(1, 2);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class a extends b {
        public a(int i10, int i11) {
            super(i10, i11);
        }

        @Override // N3.b
        public void a(g gVar) {
            gVar.T("ALTER TABLE work_data ADD COLUMN with_alarm_manager INTEGER NOT NULL DEFAULT 0");
        }
    }

    public static NotifeeCoreDatabase D(Context context) {
        if (f32991p == null) {
            synchronized (NotifeeCoreDatabase.class) {
                try {
                    if (f32991p == null) {
                        f32991p = (NotifeeCoreDatabase) p.a(context.getApplicationContext(), NotifeeCoreDatabase.class, "notifee_core_database").b(f32993r).d();
                    }
                } finally {
                }
            }
        }
        return f32991p;
    }

    public abstract t E();
}
