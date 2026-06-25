.class public abstract Lapp/notifee/core/database/NotifeeCoreDatabase;
.super LM3/q;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static volatile p:Lapp/notifee/core/database/NotifeeCoreDatabase;

.field public static final q:Lcom/google/common/util/concurrent/r;

.field public static final r:LN3/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/google/common/util/concurrent/s;->b(Ljava/util/concurrent/ExecutorService;)Lcom/google/common/util/concurrent/r;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lapp/notifee/core/database/NotifeeCoreDatabase;->q:Lcom/google/common/util/concurrent/r;

    .line 10
    .line 11
    new-instance v0, Lapp/notifee/core/database/NotifeeCoreDatabase$a;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    const/4 v2, 0x2

    .line 15
    invoke-direct {v0, v1, v2}, Lapp/notifee/core/database/NotifeeCoreDatabase$a;-><init>(II)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lapp/notifee/core/database/NotifeeCoreDatabase;->r:LN3/b;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LM3/q;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static D(Landroid/content/Context;)Lapp/notifee/core/database/NotifeeCoreDatabase;
    .locals 3

    .line 1
    sget-object v0, Lapp/notifee/core/database/NotifeeCoreDatabase;->p:Lapp/notifee/core/database/NotifeeCoreDatabase;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lapp/notifee/core/database/NotifeeCoreDatabase;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lapp/notifee/core/database/NotifeeCoreDatabase;->p:Lapp/notifee/core/database/NotifeeCoreDatabase;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-class v1, Lapp/notifee/core/database/NotifeeCoreDatabase;

    .line 17
    .line 18
    const-string v2, "notifee_core_database"

    .line 19
    .line 20
    invoke-static {p0, v1, v2}, LM3/p;->a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)LM3/q$a;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    sget-object v1, Lapp/notifee/core/database/NotifeeCoreDatabase;->r:LN3/b;

    .line 25
    .line 26
    filled-new-array {v1}, [LN3/b;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {p0, v1}, LM3/q$a;->b([LN3/b;)LM3/q$a;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, LM3/q$a;->d()LM3/q;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Lapp/notifee/core/database/NotifeeCoreDatabase;

    .line 39
    .line 40
    sput-object p0, Lapp/notifee/core/database/NotifeeCoreDatabase;->p:Lapp/notifee/core/database/NotifeeCoreDatabase;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    :goto_0
    monitor-exit v0

    .line 46
    goto :goto_2

    .line 47
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    throw p0

    .line 49
    :cond_1
    :goto_2
    sget-object p0, Lapp/notifee/core/database/NotifeeCoreDatabase;->p:Lapp/notifee/core/database/NotifeeCoreDatabase;

    .line 50
    .line 51
    return-object p0
.end method


# virtual methods
.method public abstract E()Lcg/t;
.end method
