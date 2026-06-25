.class public final Lexpo/modules/updates/db/UpdatesDatabase$b;
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
    const/16 v0, 0xb

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, LN3/b;-><init>(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic b(LS3/g;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/updates/db/UpdatesDatabase$b;->c(LS3/g;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final c(LS3/g;)LTd/L;
    .locals 1

    .line 1
    const-string v0, "$this$runInTransactionWithForeignKeysOff"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "CREATE TABLE `new_updates` (`id` BLOB NOT NULL, `scope_key` TEXT NOT NULL, `commit_time` INTEGER NOT NULL, `runtime_version` TEXT NOT NULL, `launch_asset_id` INTEGER, `manifest` TEXT NOT NULL, `status` INTEGER NOT NULL, `keep` INTEGER NOT NULL, `last_accessed` INTEGER NOT NULL, `successful_launch_count` INTEGER NOT NULL DEFAULT 0, `failed_launch_count` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`id`), FOREIGN KEY(`launch_asset_id`) REFERENCES `assets`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )"

    .line 7
    .line 8
    invoke-interface {p0, v0}, LS3/g;->T(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "INSERT INTO `new_updates` (`id`, `scope_key`, `commit_time`, `runtime_version`, `launch_asset_id`, `manifest`, `status`, `keep`, `last_accessed`, `successful_launch_count`, `failed_launch_count`) SELECT `id`, `scope_key`, `commit_time`, `runtime_version`, `launch_asset_id`, `manifest`, `status`, `keep`, `last_accessed`, `successful_launch_count`, `failed_launch_count` FROM `updates` WHERE `manifest` IS NOT NULL"

    .line 12
    .line 13
    invoke-interface {p0, v0}, LS3/g;->T(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "DROP TABLE `updates`"

    .line 17
    .line 18
    invoke-interface {p0, v0}, LS3/g;->T(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "ALTER TABLE `new_updates` RENAME TO `updates`"

    .line 22
    .line 23
    invoke-interface {p0, v0}, LS3/g;->T(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "CREATE INDEX `index_updates_launch_asset_id` ON `updates` (`launch_asset_id`)"

    .line 27
    .line 28
    invoke-interface {p0, v0}, LS3/g;->T(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "CREATE UNIQUE INDEX `index_updates_scope_key_commit_time` ON `updates` (`scope_key`, `commit_time`)"

    .line 32
    .line 33
    invoke-interface {p0, v0}, LS3/g;->T(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    sget-object p0, LTd/L;->a:LTd/L;

    .line 37
    .line 38
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
    new-instance v1, Lpd/f;

    .line 9
    .line 10
    invoke-direct {v1}, Lpd/f;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, p1, v1}, Lexpo/modules/updates/db/UpdatesDatabase$j;->b(Lexpo/modules/updates/db/UpdatesDatabase$j;LS3/g;Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
