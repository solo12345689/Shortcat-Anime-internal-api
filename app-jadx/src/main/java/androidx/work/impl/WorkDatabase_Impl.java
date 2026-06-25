package androidx.work.impl;

import M3.q;
import M3.s;
import O3.e;
import S3.h;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n4.AbstractC5732h;
import n4.C5723A;
import n4.C5727c;
import n4.C5730f;
import n4.C5735k;
import n4.C5740p;
import n4.C5743s;
import n4.C5747w;
import n4.InterfaceC5726b;
import n4.InterfaceC5729e;
import n4.InterfaceC5731g;
import n4.InterfaceC5734j;
import n4.InterfaceC5739o;
import n4.InterfaceC5742r;
import n4.InterfaceC5746v;
import n4.InterfaceC5750z;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile InterfaceC5746v f32771q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile InterfaceC5726b f32772r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile InterfaceC5750z f32773s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile InterfaceC5734j f32774t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private volatile InterfaceC5739o f32775u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private volatile InterfaceC5742r f32776v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private volatile InterfaceC5729e f32777w;

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC5726b E() {
        InterfaceC5726b interfaceC5726b;
        if (this.f32772r != null) {
            return this.f32772r;
        }
        synchronized (this) {
            try {
                if (this.f32772r == null) {
                    this.f32772r = new C5727c(this);
                }
                interfaceC5726b = this.f32772r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC5726b;
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC5729e F() {
        InterfaceC5729e interfaceC5729e;
        if (this.f32777w != null) {
            return this.f32777w;
        }
        synchronized (this) {
            try {
                if (this.f32777w == null) {
                    this.f32777w = new C5730f(this);
                }
                interfaceC5729e = this.f32777w;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC5729e;
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC5734j G() {
        InterfaceC5734j interfaceC5734j;
        if (this.f32774t != null) {
            return this.f32774t;
        }
        synchronized (this) {
            try {
                if (this.f32774t == null) {
                    this.f32774t = new C5735k(this);
                }
                interfaceC5734j = this.f32774t;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC5734j;
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC5739o H() {
        InterfaceC5739o interfaceC5739o;
        if (this.f32775u != null) {
            return this.f32775u;
        }
        synchronized (this) {
            try {
                if (this.f32775u == null) {
                    this.f32775u = new C5740p(this);
                }
                interfaceC5739o = this.f32775u;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC5739o;
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC5742r I() {
        InterfaceC5742r interfaceC5742r;
        if (this.f32776v != null) {
            return this.f32776v;
        }
        synchronized (this) {
            try {
                if (this.f32776v == null) {
                    this.f32776v = new C5743s(this);
                }
                interfaceC5742r = this.f32776v;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC5742r;
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC5746v J() {
        InterfaceC5746v interfaceC5746v;
        if (this.f32771q != null) {
            return this.f32771q;
        }
        synchronized (this) {
            try {
                if (this.f32771q == null) {
                    this.f32771q = new C5747w(this);
                }
                interfaceC5746v = this.f32771q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC5746v;
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC5750z K() {
        InterfaceC5750z interfaceC5750z;
        if (this.f32773s != null) {
            return this.f32773s;
        }
        synchronized (this) {
            try {
                if (this.f32773s == null) {
                    this.f32773s = new C5723A(this);
                }
                interfaceC5750z = this.f32773s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC5750z;
    }

    @Override // M3.q
    protected androidx.room.c g() {
        return new androidx.room.c(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // M3.q
    protected S3.h h(M3.f fVar) {
        return fVar.f12117c.a(h.b.a(fVar.f12115a).d(fVar.f12116b).c(new M3.s(fVar, new a(16), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e")).b());
    }

    @Override // M3.q
    public List j(Map map) {
        return Arrays.asList(new C(), new D());
    }

    @Override // M3.q
    public Set o() {
        return new HashSet();
    }

    @Override // M3.q
    protected Map p() {
        HashMap map = new HashMap();
        map.put(InterfaceC5746v.class, C5747w.y());
        map.put(InterfaceC5726b.class, C5727c.e());
        map.put(InterfaceC5750z.class, C5723A.e());
        map.put(InterfaceC5734j.class, C5735k.h());
        map.put(InterfaceC5739o.class, C5740p.c());
        map.put(InterfaceC5742r.class, C5743s.c());
        map.put(InterfaceC5729e.class, C5730f.c());
        map.put(InterfaceC5731g.class, AbstractC5732h.a());
        return map;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends s.b {
        a(int i10) {
            super(i10);
        }

        @Override // M3.s.b
        public void a(S3.g gVar) {
            gVar.T("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.T("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            gVar.T("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            gVar.T("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            gVar.T("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            gVar.T("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            gVar.T("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.T("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            gVar.T("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.T("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.T("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            gVar.T("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.T("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            gVar.T("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.T("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
        }

        @Override // M3.s.b
        public void b(S3.g gVar) {
            gVar.T("DROP TABLE IF EXISTS `Dependency`");
            gVar.T("DROP TABLE IF EXISTS `WorkSpec`");
            gVar.T("DROP TABLE IF EXISTS `WorkTag`");
            gVar.T("DROP TABLE IF EXISTS `SystemIdInfo`");
            gVar.T("DROP TABLE IF EXISTS `WorkName`");
            gVar.T("DROP TABLE IF EXISTS `WorkProgress`");
            gVar.T("DROP TABLE IF EXISTS `Preference`");
            if (((M3.q) WorkDatabase_Impl.this).f12153h != null) {
                int size = ((M3.q) WorkDatabase_Impl.this).f12153h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((q.b) ((M3.q) WorkDatabase_Impl.this).f12153h.get(i10)).b(gVar);
                }
            }
        }

        @Override // M3.s.b
        public void c(S3.g gVar) {
            if (((M3.q) WorkDatabase_Impl.this).f12153h != null) {
                int size = ((M3.q) WorkDatabase_Impl.this).f12153h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((q.b) ((M3.q) WorkDatabase_Impl.this).f12153h.get(i10)).a(gVar);
                }
            }
        }

        @Override // M3.s.b
        public void d(S3.g gVar) {
            ((M3.q) WorkDatabase_Impl.this).f12146a = gVar;
            gVar.T("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.u(gVar);
            if (((M3.q) WorkDatabase_Impl.this).f12153h != null) {
                int size = ((M3.q) WorkDatabase_Impl.this).f12153h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((q.b) ((M3.q) WorkDatabase_Impl.this).f12153h.get(i10)).c(gVar);
                }
            }
        }

        @Override // M3.s.b
        public void f(S3.g gVar) throws IOException {
            O3.b.a(gVar);
        }

        @Override // M3.s.b
        public s.c g(S3.g gVar) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 1, null, 1));
            map.put("prerequisite_id", new e.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(DiagnosticsEntry.ID_KEY)));
            hashSet.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList(DiagnosticsEntry.ID_KEY)));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new e.C0205e("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet2.add(new e.C0205e("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            O3.e eVar = new O3.e("Dependency", map, hashSet, hashSet2);
            O3.e eVarA = O3.e.a(gVar, "Dependency");
            if (!eVar.equals(eVarA)) {
                return new s.c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + eVarA);
            }
            HashMap map2 = new HashMap(27);
            map2.put(DiagnosticsEntry.ID_KEY, new e.a(DiagnosticsEntry.ID_KEY, "TEXT", true, 1, null, 1));
            map2.put("state", new e.a("state", "INTEGER", true, 0, null, 1));
            map2.put("worker_class_name", new e.a("worker_class_name", "TEXT", true, 0, null, 1));
            map2.put("input_merger_class_name", new e.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            map2.put("input", new e.a("input", "BLOB", true, 0, null, 1));
            map2.put("output", new e.a("output", "BLOB", true, 0, null, 1));
            map2.put("initial_delay", new e.a("initial_delay", "INTEGER", true, 0, null, 1));
            map2.put("interval_duration", new e.a("interval_duration", "INTEGER", true, 0, null, 1));
            map2.put("flex_duration", new e.a("flex_duration", "INTEGER", true, 0, null, 1));
            map2.put("run_attempt_count", new e.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            map2.put("backoff_policy", new e.a("backoff_policy", "INTEGER", true, 0, null, 1));
            map2.put("backoff_delay_duration", new e.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            map2.put("last_enqueue_time", new e.a("last_enqueue_time", "INTEGER", true, 0, null, 1));
            map2.put("minimum_retention_duration", new e.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            map2.put("schedule_requested_at", new e.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            map2.put("run_in_foreground", new e.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            map2.put("out_of_quota_policy", new e.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            map2.put("period_count", new e.a("period_count", "INTEGER", true, 0, "0", 1));
            map2.put("generation", new e.a("generation", "INTEGER", true, 0, "0", 1));
            map2.put("required_network_type", new e.a("required_network_type", "INTEGER", true, 0, null, 1));
            map2.put("requires_charging", new e.a("requires_charging", "INTEGER", true, 0, null, 1));
            map2.put("requires_device_idle", new e.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            map2.put("requires_battery_not_low", new e.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            map2.put("requires_storage_not_low", new e.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            map2.put("trigger_content_update_delay", new e.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            map2.put("trigger_max_content_delay", new e.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            map2.put("content_uri_triggers", new e.a("content_uri_triggers", "BLOB", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new e.C0205e("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet4.add(new e.C0205e("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            O3.e eVar2 = new O3.e("WorkSpec", map2, hashSet3, hashSet4);
            O3.e eVarA2 = O3.e.a(gVar, "WorkSpec");
            if (!eVar2.equals(eVarA2)) {
                return new s.c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + eVarA2);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new e.a("tag", "TEXT", true, 1, null, 1));
            map3.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(DiagnosticsEntry.ID_KEY)));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new e.C0205e("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            O3.e eVar3 = new O3.e("WorkTag", map3, hashSet5, hashSet6);
            O3.e eVarA3 = O3.e.a(gVar, "WorkTag");
            if (!eVar3.equals(eVarA3)) {
                return new s.c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + eVarA3);
            }
            HashMap map4 = new HashMap(3);
            map4.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 1, null, 1));
            map4.put("generation", new e.a("generation", "INTEGER", true, 2, "0", 1));
            map4.put("system_id", new e.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(DiagnosticsEntry.ID_KEY)));
            O3.e eVar4 = new O3.e("SystemIdInfo", map4, hashSet7, new HashSet(0));
            O3.e eVarA4 = O3.e.a(gVar, "SystemIdInfo");
            if (!eVar4.equals(eVarA4)) {
                return new s.c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + eVarA4);
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new e.a("name", "TEXT", true, 1, null, 1));
            map5.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(DiagnosticsEntry.ID_KEY)));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new e.C0205e("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            O3.e eVar5 = new O3.e("WorkName", map5, hashSet8, hashSet9);
            O3.e eVarA5 = O3.e.a(gVar, "WorkName");
            if (!eVar5.equals(eVarA5)) {
                return new s.c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + eVarA5);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 1, null, 1));
            map6.put(ReactProgressBarViewManager.PROP_PROGRESS, new e.a(ReactProgressBarViewManager.PROP_PROGRESS, "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(DiagnosticsEntry.ID_KEY)));
            O3.e eVar6 = new O3.e("WorkProgress", map6, hashSet10, new HashSet(0));
            O3.e eVarA6 = O3.e.a(gVar, "WorkProgress");
            if (!eVar6.equals(eVarA6)) {
                return new s.c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + eVarA6);
            }
            HashMap map7 = new HashMap(2);
            map7.put(SubscriberAttributeKt.JSON_NAME_KEY, new e.a(SubscriberAttributeKt.JSON_NAME_KEY, "TEXT", true, 1, null, 1));
            map7.put("long_value", new e.a("long_value", "INTEGER", false, 0, null, 1));
            O3.e eVar7 = new O3.e("Preference", map7, new HashSet(0), new HashSet(0));
            O3.e eVarA7 = O3.e.a(gVar, "Preference");
            if (eVar7.equals(eVarA7)) {
                return new s.c(true, null);
            }
            return new s.c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + eVarA7);
        }

        @Override // M3.s.b
        public void e(S3.g gVar) {
        }
    }
}
