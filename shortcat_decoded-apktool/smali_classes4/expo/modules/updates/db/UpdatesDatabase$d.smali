.class public final Lexpo/modules/updates/db/UpdatesDatabase$d;
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
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x5

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
    invoke-static {p0}, Lexpo/modules/updates/db/UpdatesDatabase$d;->c(LS3/g;)LTd/L;

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
    const-string v0, "CREATE TABLE `new_assets` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `url` TEXT, `key` TEXT, `headers` TEXT, `type` TEXT NOT NULL, `metadata` TEXT, `download_time` INTEGER, `relative_path` TEXT, `hash` BLOB, `hash_type` INTEGER NOT NULL, `marked_for_deletion` INTEGER NOT NULL)"

    .line 7
    .line 8
    invoke-interface {p0, v0}, LS3/g;->T(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "INSERT INTO `new_assets` (`id`, `url`, `key`, `headers`, `type`, `metadata`, `download_time`, `relative_path`, `hash`, `hash_type`, `marked_for_deletion`) SELECT `id`, `url`, `key`, `headers`, `type`, `metadata`, `download_time`, `relative_path`, `hash`, `hash_type`, `marked_for_deletion` FROM `assets`"

    .line 12
    .line 13
    invoke-interface {p0, v0}, LS3/g;->T(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "DROP TABLE `assets`"

    .line 17
    .line 18
    invoke-interface {p0, v0}, LS3/g;->T(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "ALTER TABLE `new_assets` RENAME TO `assets`"

    .line 22
    .line 23
    invoke-interface {p0, v0}, LS3/g;->T(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "CREATE UNIQUE INDEX `index_assets_key` ON `assets` (`key`)"

    .line 27
    .line 28
    invoke-interface {p0, v0}, LS3/g;->T(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sget-object p0, LTd/L;->a:LTd/L;

    .line 32
    .line 33
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
    new-instance v1, Lpd/h;

    .line 9
    .line 10
    invoke-direct {v1}, Lpd/h;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, p1, v1}, Lexpo/modules/updates/db/UpdatesDatabase$j;->b(Lexpo/modules/updates/db/UpdatesDatabase$j;LS3/g;Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
