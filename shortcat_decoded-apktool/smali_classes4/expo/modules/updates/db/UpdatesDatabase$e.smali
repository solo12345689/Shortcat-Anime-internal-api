.class public final Lexpo/modules/updates/db/UpdatesDatabase$e;
.super LN3/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/updates/db/UpdatesDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x5

    .line 2
    const/4 v1, 0x6

    .line 3
    invoke-direct {p0, v0, v1}, LN3/b;-><init>(II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic b(LS3/g;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/updates/db/UpdatesDatabase$e;->c(LS3/g;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final c(LS3/g;)LTd/L;
    .locals 2

    .line 1
    const-string v0, "$this$runInTransactionWithForeignKeysOff"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "CREATE TABLE `new_updates` (`id` BLOB NOT NULL, `scope_key` TEXT NOT NULL, `commit_time` INTEGER NOT NULL, `runtime_version` TEXT NOT NULL, `launch_asset_id` INTEGER, `manifest` TEXT, `status` INTEGER NOT NULL, `keep` INTEGER NOT NULL, `last_accessed` INTEGER NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`launch_asset_id`) REFERENCES `assets`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )"

    .line 7
    .line 8
    invoke-interface {p0, v0}, LS3/g;->T(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/Date;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "INSERT INTO `new_updates` (`id`, `scope_key`, `commit_time`, `runtime_version`, `launch_asset_id`, `manifest`, `status`, `keep`, `last_accessed`) SELECT `id`, `scope_key`, `commit_time`, `runtime_version`, `launch_asset_id`, `metadata` AS `manifest`, `status`, `keep`, ?1 AS `last_accessed` FROM `updates`"

    .line 29
    .line 30
    invoke-interface {p0, v1, v0}, LS3/g;->m0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    const-string v0, "DROP TABLE `updates`"

    .line 34
    .line 35
    invoke-interface {p0, v0}, LS3/g;->T(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-string v0, "ALTER TABLE `new_updates` RENAME TO `updates`"

    .line 39
    .line 40
    invoke-interface {p0, v0}, LS3/g;->T(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const-string v0, "CREATE INDEX `index_updates_launch_asset_id` ON `updates` (`launch_asset_id`)"

    .line 44
    .line 45
    invoke-interface {p0, v0}, LS3/g;->T(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v0, "CREATE UNIQUE INDEX `index_updates_scope_key_commit_time` ON `updates` (`scope_key`, `commit_time`)"

    .line 49
    .line 50
    invoke-interface {p0, v0}, LS3/g;->T(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    sget-object p0, LTd/L;->a:LTd/L;

    .line 54
    .line 55
    return-object p0
.end method


# virtual methods
.method public a(LS3/g;)V
    .locals 2

    .line 1
    const-string v0, "db"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lexpo/modules/updates/db/UpdatesDatabase;->p:Lexpo/modules/updates/db/UpdatesDatabase$j;

    .line 7
    .line 8
    new-instance v1, Lpd/i;

    .line 9
    .line 10
    invoke-direct {v1}, Lpd/i;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, p1, v1}, Lexpo/modules/updates/db/UpdatesDatabase$j;->b(Lexpo/modules/updates/db/UpdatesDatabase$j;LS3/g;Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
