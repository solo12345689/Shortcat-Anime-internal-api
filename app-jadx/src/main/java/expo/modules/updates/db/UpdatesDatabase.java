package expo.modules.updates.db;

import Gf.AbstractC1637u0;
import Gf.K;
import M3.p;
import M3.q;
import Td.L;
import android.content.Context;
import expo.modules.updates.db.UpdatesDatabase;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qd.AbstractC6170a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lexpo/modules/updates/db/UpdatesDatabase;", "LM3/q;", "<init>", "()V", "Lqd/e;", "Q", "()Lqd/e;", "Lqd/a;", "O", "()Lqd/a;", "Lqd/c;", "P", "()Lqd/c;", "p", "j", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class UpdatesDatabase extends q {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static volatile UpdatesDatabase f46437q;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final N3.b f46438r = new d();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final N3.b f46439s = new e();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final N3.b f46440t = new f();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final N3.b f46441u = new g();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final N3.b f46442v = new h();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final N3.b f46443w = new i();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final N3.b f46444x = new a();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final N3.b f46445y = new b();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final N3.b f46446z = new c();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends N3.b {
        a() {
            super(10, 11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final L c(S3.g runInTransaction) {
            AbstractC5504s.h(runInTransaction, "$this$runInTransaction");
            runInTransaction.T("UPDATE `assets` SET `expected_hash` = NULL");
            return L.f17438a;
        }

        @Override // N3.b
        public void a(S3.g db2) {
            AbstractC5504s.h(db2, "db");
            UpdatesDatabase.INSTANCE.m(db2, new Function1() { // from class: pd.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UpdatesDatabase.a.c((S3.g) obj);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends N3.b {
        b() {
            super(11, 12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final L c(S3.g runInTransactionWithForeignKeysOff) {
            AbstractC5504s.h(runInTransactionWithForeignKeysOff, "$this$runInTransactionWithForeignKeysOff");
            runInTransactionWithForeignKeysOff.T("CREATE TABLE `new_updates` (`id` BLOB NOT NULL, `scope_key` TEXT NOT NULL, `commit_time` INTEGER NOT NULL, `runtime_version` TEXT NOT NULL, `launch_asset_id` INTEGER, `manifest` TEXT NOT NULL, `status` INTEGER NOT NULL, `keep` INTEGER NOT NULL, `last_accessed` INTEGER NOT NULL, `successful_launch_count` INTEGER NOT NULL DEFAULT 0, `failed_launch_count` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`id`), FOREIGN KEY(`launch_asset_id`) REFERENCES `assets`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            runInTransactionWithForeignKeysOff.T("INSERT INTO `new_updates` (`id`, `scope_key`, `commit_time`, `runtime_version`, `launch_asset_id`, `manifest`, `status`, `keep`, `last_accessed`, `successful_launch_count`, `failed_launch_count`) SELECT `id`, `scope_key`, `commit_time`, `runtime_version`, `launch_asset_id`, `manifest`, `status`, `keep`, `last_accessed`, `successful_launch_count`, `failed_launch_count` FROM `updates` WHERE `manifest` IS NOT NULL");
            runInTransactionWithForeignKeysOff.T("DROP TABLE `updates`");
            runInTransactionWithForeignKeysOff.T("ALTER TABLE `new_updates` RENAME TO `updates`");
            runInTransactionWithForeignKeysOff.T("CREATE INDEX `index_updates_launch_asset_id` ON `updates` (`launch_asset_id`)");
            runInTransactionWithForeignKeysOff.T("CREATE UNIQUE INDEX `index_updates_scope_key_commit_time` ON `updates` (`scope_key`, `commit_time`)");
            return L.f17438a;
        }

        @Override // N3.b
        public void a(S3.g db2) {
            AbstractC5504s.h(db2, "db");
            UpdatesDatabase.INSTANCE.n(db2, new Function1() { // from class: pd.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UpdatesDatabase.b.c((S3.g) obj);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends N3.b {
        c() {
            super(12, 13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final L c(S3.g runInTransaction) {
            AbstractC5504s.h(runInTransaction, "$this$runInTransaction");
            runInTransaction.T("ALTER TABLE `updates` ADD COLUMN `url` TEXT");
            runInTransaction.T("ALTER TABLE `updates` ADD COLUMN `headers` TEXT");
            return L.f17438a;
        }

        @Override // N3.b
        public void a(S3.g db2) {
            AbstractC5504s.h(db2, "db");
            UpdatesDatabase.INSTANCE.m(db2, new Function1() { // from class: pd.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UpdatesDatabase.c.c((S3.g) obj);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends N3.b {
        d() {
            super(4, 5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final L c(S3.g runInTransactionWithForeignKeysOff) {
            AbstractC5504s.h(runInTransactionWithForeignKeysOff, "$this$runInTransactionWithForeignKeysOff");
            runInTransactionWithForeignKeysOff.T("CREATE TABLE `new_assets` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `url` TEXT, `key` TEXT, `headers` TEXT, `type` TEXT NOT NULL, `metadata` TEXT, `download_time` INTEGER, `relative_path` TEXT, `hash` BLOB, `hash_type` INTEGER NOT NULL, `marked_for_deletion` INTEGER NOT NULL)");
            runInTransactionWithForeignKeysOff.T("INSERT INTO `new_assets` (`id`, `url`, `key`, `headers`, `type`, `metadata`, `download_time`, `relative_path`, `hash`, `hash_type`, `marked_for_deletion`) SELECT `id`, `url`, `key`, `headers`, `type`, `metadata`, `download_time`, `relative_path`, `hash`, `hash_type`, `marked_for_deletion` FROM `assets`");
            runInTransactionWithForeignKeysOff.T("DROP TABLE `assets`");
            runInTransactionWithForeignKeysOff.T("ALTER TABLE `new_assets` RENAME TO `assets`");
            runInTransactionWithForeignKeysOff.T("CREATE UNIQUE INDEX `index_assets_key` ON `assets` (`key`)");
            return L.f17438a;
        }

        @Override // N3.b
        public void a(S3.g db2) {
            AbstractC5504s.h(db2, "db");
            UpdatesDatabase.INSTANCE.n(db2, new Function1() { // from class: pd.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UpdatesDatabase.d.c((S3.g) obj);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends N3.b {
        e() {
            super(5, 6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final L c(S3.g runInTransactionWithForeignKeysOff) {
            AbstractC5504s.h(runInTransactionWithForeignKeysOff, "$this$runInTransactionWithForeignKeysOff");
            runInTransactionWithForeignKeysOff.T("CREATE TABLE `new_updates` (`id` BLOB NOT NULL, `scope_key` TEXT NOT NULL, `commit_time` INTEGER NOT NULL, `runtime_version` TEXT NOT NULL, `launch_asset_id` INTEGER, `manifest` TEXT, `status` INTEGER NOT NULL, `keep` INTEGER NOT NULL, `last_accessed` INTEGER NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`launch_asset_id`) REFERENCES `assets`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            runInTransactionWithForeignKeysOff.m0("INSERT INTO `new_updates` (`id`, `scope_key`, `commit_time`, `runtime_version`, `launch_asset_id`, `manifest`, `status`, `keep`, `last_accessed`) SELECT `id`, `scope_key`, `commit_time`, `runtime_version`, `launch_asset_id`, `metadata` AS `manifest`, `status`, `keep`, ?1 AS `last_accessed` FROM `updates`", new Object[]{Long.valueOf(new Date().getTime())});
            runInTransactionWithForeignKeysOff.T("DROP TABLE `updates`");
            runInTransactionWithForeignKeysOff.T("ALTER TABLE `new_updates` RENAME TO `updates`");
            runInTransactionWithForeignKeysOff.T("CREATE INDEX `index_updates_launch_asset_id` ON `updates` (`launch_asset_id`)");
            runInTransactionWithForeignKeysOff.T("CREATE UNIQUE INDEX `index_updates_scope_key_commit_time` ON `updates` (`scope_key`, `commit_time`)");
            return L.f17438a;
        }

        @Override // N3.b
        public void a(S3.g db2) {
            AbstractC5504s.h(db2, "db");
            UpdatesDatabase.INSTANCE.n(db2, new Function1() { // from class: pd.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UpdatesDatabase.e.c((S3.g) obj);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f extends N3.b {
        f() {
            super(6, 7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final L c(S3.g runInTransactionWithForeignKeysOff) {
            AbstractC5504s.h(runInTransactionWithForeignKeysOff, "$this$runInTransactionWithForeignKeysOff");
            runInTransactionWithForeignKeysOff.T("CREATE TABLE IF NOT EXISTS `new_assets` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `url` TEXT, `key` TEXT, `headers` TEXT, `type` TEXT, `metadata` TEXT, `download_time` INTEGER, `relative_path` TEXT, `hash` BLOB, `hash_type` INTEGER NOT NULL, `marked_for_deletion` INTEGER NOT NULL)");
            runInTransactionWithForeignKeysOff.T("INSERT INTO `new_assets` (`id`, `url`, `key`, `headers`, `type`, `metadata`, `download_time`, `relative_path`, `hash`, `hash_type`, `marked_for_deletion`) SELECT `id`, `url`, `key`, `headers`, `type`, `metadata`, `download_time`, `relative_path`, `hash`, `hash_type`, `marked_for_deletion` FROM `assets`");
            runInTransactionWithForeignKeysOff.T("DROP TABLE `assets`");
            runInTransactionWithForeignKeysOff.T("ALTER TABLE `new_assets` RENAME TO `assets`");
            runInTransactionWithForeignKeysOff.T("CREATE UNIQUE INDEX `index_assets_key` ON `assets` (`key`)");
            return L.f17438a;
        }

        @Override // N3.b
        public void a(S3.g db2) {
            AbstractC5504s.h(db2, "db");
            UpdatesDatabase.INSTANCE.n(db2, new Function1() { // from class: pd.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UpdatesDatabase.f.c((S3.g) obj);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g extends N3.b {
        g() {
            super(7, 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final L c(S3.g runInTransactionWithForeignKeysOff) {
            AbstractC5504s.h(runInTransactionWithForeignKeysOff, "$this$runInTransactionWithForeignKeysOff");
            runInTransactionWithForeignKeysOff.T("CREATE TABLE `new_updates` (`id` BLOB NOT NULL, `scope_key` TEXT NOT NULL, `commit_time` INTEGER NOT NULL, `runtime_version` TEXT NOT NULL, `launch_asset_id` INTEGER, `manifest` TEXT, `status` INTEGER NOT NULL, `keep` INTEGER NOT NULL, `last_accessed` INTEGER NOT NULL, `successful_launch_count` INTEGER NOT NULL DEFAULT 0, `failed_launch_count` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`id`), FOREIGN KEY(`launch_asset_id`) REFERENCES `assets`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            runInTransactionWithForeignKeysOff.T("INSERT INTO `new_updates` (`id`, `scope_key`, `commit_time`, `runtime_version`, `launch_asset_id`, `manifest`, `status`, `keep`, `last_accessed`, `successful_launch_count`, `failed_launch_count`) SELECT `id`, `scope_key`, `commit_time`, `runtime_version`, `launch_asset_id`, `manifest`, `status`, `keep`, `last_accessed`, 1 AS `successful_launch_count`, 0 AS `failed_launch_count` FROM `updates`");
            runInTransactionWithForeignKeysOff.T("DROP TABLE `updates`");
            runInTransactionWithForeignKeysOff.T("ALTER TABLE `new_updates` RENAME TO `updates`");
            runInTransactionWithForeignKeysOff.T("CREATE INDEX `index_updates_launch_asset_id` ON `updates` (`launch_asset_id`)");
            runInTransactionWithForeignKeysOff.T("CREATE UNIQUE INDEX `index_updates_scope_key_commit_time` ON `updates` (`scope_key`, `commit_time`)");
            return L.f17438a;
        }

        @Override // N3.b
        public void a(S3.g db2) {
            AbstractC5504s.h(db2, "db");
            UpdatesDatabase.INSTANCE.n(db2, new Function1() { // from class: pd.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UpdatesDatabase.g.c((S3.g) obj);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h extends N3.b {
        h() {
            super(8, 9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final L c(S3.g runInTransactionWithForeignKeysOff) {
            AbstractC5504s.h(runInTransactionWithForeignKeysOff, "$this$runInTransactionWithForeignKeysOff");
            runInTransactionWithForeignKeysOff.T("ALTER TABLE `assets` ADD COLUMN `extra_request_headers` TEXT");
            return L.f17438a;
        }

        @Override // N3.b
        public void a(S3.g db2) {
            AbstractC5504s.h(db2, "db");
            UpdatesDatabase.INSTANCE.n(db2, new Function1() { // from class: pd.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UpdatesDatabase.h.c((S3.g) obj);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i extends N3.b {
        i() {
            super(9, 10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final L c(S3.g runInTransactionWithForeignKeysOff) {
            AbstractC5504s.h(runInTransactionWithForeignKeysOff, "$this$runInTransactionWithForeignKeysOff");
            runInTransactionWithForeignKeysOff.T("ALTER TABLE `assets` ADD COLUMN `expected_hash` TEXT");
            return L.f17438a;
        }

        @Override // N3.b
        public void a(S3.g db2) {
            AbstractC5504s.h(db2, "db");
            UpdatesDatabase.INSTANCE.n(db2, new Function1() { // from class: pd.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UpdatesDatabase.i.c((S3.g) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: expo.modules.updates.db.UpdatesDatabase$j, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void m(S3.g gVar, Function1 function1) {
            gVar.M();
            try {
                function1.invoke(gVar);
                gVar.l0();
            } finally {
                gVar.v0();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void n(S3.g gVar, Function1 function1) {
            try {
                gVar.T("PRAGMA foreign_keys=OFF");
                m(gVar, function1);
            } finally {
                gVar.T("PRAGMA foreign_keys=ON");
            }
        }

        public final UpdatesDatabase c(Context context, K k10) {
            UpdatesDatabase updatesDatabase;
            AbstractC5504s.h(context, "context");
            UpdatesDatabase updatesDatabase2 = UpdatesDatabase.f46437q;
            if (updatesDatabase2 != null) {
                return updatesDatabase2;
            }
            synchronized (this) {
                try {
                    Context applicationContext = context.getApplicationContext();
                    AbstractC5504s.g(applicationContext, "getApplicationContext(...)");
                    q.a aVarA = p.a(applicationContext, UpdatesDatabase.class, "updates.db");
                    if (k10 != null) {
                        aVarA.g(AbstractC1637u0.a(k10));
                    }
                    Companion companion = UpdatesDatabase.INSTANCE;
                    updatesDatabase = (UpdatesDatabase) aVarA.b(companion.g(), companion.h(), companion.i(), companion.j(), companion.k(), companion.l(), companion.d(), companion.e(), companion.f()).c().e().d();
                    UpdatesDatabase.f46437q = updatesDatabase;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return updatesDatabase;
        }

        public final N3.b d() {
            return UpdatesDatabase.f46444x;
        }

        public final N3.b e() {
            return UpdatesDatabase.f46445y;
        }

        public final N3.b f() {
            return UpdatesDatabase.f46446z;
        }

        public final N3.b g() {
            return UpdatesDatabase.f46438r;
        }

        public final N3.b h() {
            return UpdatesDatabase.f46439s;
        }

        public final N3.b i() {
            return UpdatesDatabase.f46440t;
        }

        public final N3.b j() {
            return UpdatesDatabase.f46441u;
        }

        public final N3.b k() {
            return UpdatesDatabase.f46442v;
        }

        public final N3.b l() {
            return UpdatesDatabase.f46443w;
        }

        private Companion() {
        }
    }

    public abstract AbstractC6170a O();

    public abstract qd.c P();

    public abstract qd.e Q();
}
