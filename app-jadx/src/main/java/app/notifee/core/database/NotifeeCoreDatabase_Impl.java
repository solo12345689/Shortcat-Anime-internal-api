package app.notifee.core.database;

import M3.f;
import M3.q;
import M3.s;
import N3.b;
import O3.e;
import S3.g;
import S3.h;
import androidx.room.c;
import cg.t;
import cg.u;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class NotifeeCoreDatabase_Impl extends NotifeeCoreDatabase {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile t f32994s;

    @Override // app.notifee.core.database.NotifeeCoreDatabase
    public t E() {
        t tVar;
        if (this.f32994s != null) {
            return this.f32994s;
        }
        synchronized (this) {
            try {
                if (this.f32994s == null) {
                    this.f32994s = new u(this);
                }
                tVar = this.f32994s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }

    @Override // M3.q
    public c g() {
        return new c(this, new HashMap(0), new HashMap(0), "work_data");
    }

    @Override // M3.q
    public h h(f fVar) {
        return fVar.f12117c.a(h.b.a(fVar.f12115a).d(fVar.f12116b).c(new s(fVar, new a(2), "24b2477514809255df232947ce7928c4", "1ddaa4b892e61b0f7010597ddc582ed3")).b());
    }

    @Override // M3.q
    public List j(Map map) {
        return Arrays.asList(new b[0]);
    }

    @Override // M3.q
    public Set o() {
        return new HashSet();
    }

    @Override // M3.q
    public Map p() {
        HashMap map = new HashMap();
        map.put(t.class, Collections.EMPTY_LIST);
        return map;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class a extends s.b {
        public a(int i10) {
            super(i10);
        }

        @Override // M3.s.b
        public void a(g gVar) {
            gVar.T("CREATE TABLE IF NOT EXISTS `work_data` (`id` TEXT NOT NULL, `notification` BLOB, `trigger` BLOB, `with_alarm_manager` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`id`))");
            gVar.T("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.T("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '24b2477514809255df232947ce7928c4')");
        }

        @Override // M3.s.b
        public void b(g gVar) {
            gVar.T("DROP TABLE IF EXISTS `work_data`");
            if (((q) NotifeeCoreDatabase_Impl.this).f12153h != null) {
                int size = ((q) NotifeeCoreDatabase_Impl.this).f12153h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((q.b) ((q) NotifeeCoreDatabase_Impl.this).f12153h.get(i10)).b(gVar);
                }
            }
        }

        @Override // M3.s.b
        public void c(g gVar) {
            if (((q) NotifeeCoreDatabase_Impl.this).f12153h != null) {
                int size = ((q) NotifeeCoreDatabase_Impl.this).f12153h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((q.b) ((q) NotifeeCoreDatabase_Impl.this).f12153h.get(i10)).a(gVar);
                }
            }
        }

        @Override // M3.s.b
        public void d(g gVar) {
            ((q) NotifeeCoreDatabase_Impl.this).f12146a = gVar;
            NotifeeCoreDatabase_Impl.this.u(gVar);
            if (((q) NotifeeCoreDatabase_Impl.this).f12153h != null) {
                int size = ((q) NotifeeCoreDatabase_Impl.this).f12153h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((q.b) ((q) NotifeeCoreDatabase_Impl.this).f12153h.get(i10)).c(gVar);
                }
            }
        }

        @Override // M3.s.b
        public void f(g gVar) throws IOException {
            O3.b.a(gVar);
        }

        @Override // M3.s.b
        public s.c g(g gVar) {
            HashMap map = new HashMap(4);
            map.put(DiagnosticsEntry.ID_KEY, new e.a(DiagnosticsEntry.ID_KEY, "TEXT", true, 1, null, 1));
            map.put("notification", new e.a("notification", "BLOB", false, 0, null, 1));
            map.put("trigger", new e.a("trigger", "BLOB", false, 0, null, 1));
            map.put("with_alarm_manager", new e.a("with_alarm_manager", "INTEGER", true, 0, "0", 1));
            e eVar = new e("work_data", map, new HashSet(0), new HashSet(0));
            e eVarA = e.a(gVar, "work_data");
            if (eVar.equals(eVarA)) {
                return new s.c(true, null);
            }
            return new s.c(false, "work_data(app.notifee.core.database.WorkDataEntity).\n Expected:\n" + eVar + "\n Found:\n" + eVarA);
        }

        @Override // M3.s.b
        public void e(g gVar) {
        }
    }
}
