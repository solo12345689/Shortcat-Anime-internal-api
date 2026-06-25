.class public final Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;
.super Lapp/notifee/core/database/NotifeeCoreDatabase;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field public volatile s:Lcg/t;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lapp/notifee/core/database/NotifeeCoreDatabase;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic F(Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;LS3/g;)LS3/g;
    .locals 0

    .line 1
    iput-object p1, p0, LM3/q;->a:LS3/g;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic G(Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, LM3/q;->h:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic H(Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, LM3/q;->h:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic I(Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;LS3/g;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LM3/q;->u(LS3/g;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic J(Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, LM3/q;->h:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic K(Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, LM3/q;->h:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic L(Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, LM3/q;->h:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic M(Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, LM3/q;->h:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic N(Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, LM3/q;->h:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic O(Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, LM3/q;->h:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic P(Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, LM3/q;->h:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public E()Lcg/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;->s:Lcg/t;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;->s:Lcg/t;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    monitor-enter p0

    .line 9
    :try_start_0
    iget-object v0, p0, Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;->s:Lcg/t;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    new-instance v0, Lcg/u;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lcg/u;-><init>(LM3/q;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;->s:Lcg/t;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    iget-object v0, p0, Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;->s:Lcg/t;

    .line 24
    .line 25
    monitor-exit p0

    .line 26
    return-object v0

    .line 27
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    throw v0
.end method

.method public g()Landroidx/room/c;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v2, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Landroidx/room/c;

    .line 13
    .line 14
    const-string v3, "work_data"

    .line 15
    .line 16
    filled-new-array {v3}, [Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-direct {v1, p0, v0, v2, v3}, Landroidx/room/c;-><init>(LM3/q;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object v1
.end method

.method public h(LM3/f;)LS3/h;
    .locals 4

    .line 1
    new-instance v0, LM3/s;

    .line 2
    .line 3
    new-instance v1, Lapp/notifee/core/database/NotifeeCoreDatabase_Impl$a;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v1, p0, v2}, Lapp/notifee/core/database/NotifeeCoreDatabase_Impl$a;-><init>(Lapp/notifee/core/database/NotifeeCoreDatabase_Impl;I)V

    .line 7
    .line 8
    .line 9
    const-string v2, "24b2477514809255df232947ce7928c4"

    .line 10
    .line 11
    const-string v3, "1ddaa4b892e61b0f7010597ddc582ed3"

    .line 12
    .line 13
    invoke-direct {v0, p1, v1, v2, v3}, LM3/s;-><init>(LM3/f;LM3/s$b;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p1, LM3/f;->a:Landroid/content/Context;

    .line 17
    .line 18
    invoke-static {v1}, LS3/h$b;->a(Landroid/content/Context;)LS3/h$b$a;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v2, p1, LM3/f;->b:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v1, v2}, LS3/h$b$a;->d(Ljava/lang/String;)LS3/h$b$a;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1, v0}, LS3/h$b$a;->c(LS3/h$a;)LS3/h$b$a;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, LS3/h$b$a;->b()LS3/h$b;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object p1, p1, LM3/f;->c:LS3/h$c;

    .line 37
    .line 38
    invoke-interface {p1, v0}, LS3/h$c;->a(LS3/h$b;)LS3/h;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1
.end method

.method public j(Ljava/util/Map;)Ljava/util/List;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    new-array p1, p1, [LN3/b;

    .line 3
    .line 4
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method public o()Ljava/util/Set;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public p()Ljava/util/Map;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-class v1, Lcg/t;

    .line 7
    .line 8
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
