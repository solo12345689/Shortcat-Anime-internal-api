.class public Ls4/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static b:Ls4/i;


# instance fields
.field public a:Lcg/t;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lapp/notifee/core/database/NotifeeCoreDatabase;->D(Landroid/content/Context;)Lapp/notifee/core/database/NotifeeCoreDatabase;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Lapp/notifee/core/database/NotifeeCoreDatabase;->E()Lcg/t;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Ls4/i;->a:Lcg/t;

    .line 13
    .line 14
    return-void
.end method

.method public static synthetic a(Ls4/i;Lcg/v;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ls4/i;->r(Lcg/v;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Ls4/i;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ls4/i;->v(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Ls4/i;Lcg/v;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ls4/i;->u(Lcg/v;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(Ls4/i;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-direct {p0}, Ls4/i;->x()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Ls4/i;Ljava/lang/String;)Lcg/v;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ls4/i;->w(Ljava/lang/String;)Lcg/v;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic f(Ls4/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ls4/i;->t()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Ls4/i;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ls4/i;->s(Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic h(Ls4/i;Ljava/lang/Boolean;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ls4/i;->q(Ljava/lang/Boolean;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static j(Landroid/content/Context;)Ls4/i;
    .locals 2

    .line 1
    const-class v0, Ls4/i;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Ls4/i;->b:Ls4/i;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Ls4/i;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Ls4/i;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Ls4/i;->b:Ls4/i;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    sget-object p0, Ls4/i;->b:Ls4/i;

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-object p0

    .line 22
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw p0
.end method

.method private synthetic q(Ljava/lang/Boolean;)Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ls4/i;->a:Lcg/t;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcg/t;->e(Ljava/lang/Boolean;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method private synthetic r(Lcg/v;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ls4/i;->a:Lcg/t;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcg/t;->c(Lcg/v;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private synthetic s(Ljava/util/List;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ls4/i;->a:Lcg/t;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcg/t;->a(Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private synthetic t()V
    .locals 1

    .line 1
    iget-object v0, p0, Ls4/i;->a:Lcg/t;

    .line 2
    .line 3
    invoke-interface {v0}, Lcg/t;->b()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private synthetic u(Lcg/v;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ls4/i;->a:Lcg/t;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcg/t;->d(Lcg/v;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private synthetic v(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ls4/i;->a:Lcg/t;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcg/t;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private synthetic w(Ljava/lang/String;)Lcg/v;
    .locals 1

    .line 1
    iget-object v0, p0, Ls4/i;->a:Lcg/t;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcg/t;->b(Ljava/lang/String;)Lcg/v;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method private synthetic x()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ls4/i;->a:Lcg/t;

    .line 2
    .line 3
    invoke-interface {v0}, Lcg/t;->a()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method


# virtual methods
.method public i(Ljava/lang/Boolean;)Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    sget-object v0, Lapp/notifee/core/database/NotifeeCoreDatabase;->q:Lcom/google/common/util/concurrent/r;

    .line 2
    .line 3
    new-instance v1, Ls4/b;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Ls4/b;-><init>(Ls4/i;Ljava/lang/Boolean;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Lcom/google/common/util/concurrent/r;->submit(Ljava/util/concurrent/Callable;)Lcom/google/common/util/concurrent/p;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public k()V
    .locals 2

    .line 1
    sget-object v0, Lapp/notifee/core/database/NotifeeCoreDatabase;->q:Lcom/google/common/util/concurrent/r;

    .line 2
    .line 3
    new-instance v1, Ls4/f;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Ls4/f;-><init>(Ls4/i;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public l(Lcg/v;)V
    .locals 2

    .line 1
    sget-object v0, Lapp/notifee/core/database/NotifeeCoreDatabase;->q:Lcom/google/common/util/concurrent/r;

    .line 2
    .line 3
    new-instance v1, Ls4/d;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Ls4/d;-><init>(Ls4/i;Lcg/v;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public m(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Lapp/notifee/core/database/NotifeeCoreDatabase;->q:Lcom/google/common/util/concurrent/r;

    .line 2
    .line 3
    new-instance v1, Ls4/h;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Ls4/h;-><init>(Ls4/i;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public n(Ljava/util/List;)V
    .locals 2

    .line 1
    sget-object v0, Lapp/notifee/core/database/NotifeeCoreDatabase;->q:Lcom/google/common/util/concurrent/r;

    .line 2
    .line 3
    new-instance v1, Ls4/c;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Ls4/c;-><init>(Ls4/i;Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public o()Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    sget-object v0, Lapp/notifee/core/database/NotifeeCoreDatabase;->q:Lcom/google/common/util/concurrent/r;

    .line 2
    .line 3
    new-instance v1, Ls4/a;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Ls4/a;-><init>(Ls4/i;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Lcom/google/common/util/concurrent/r;->submit(Ljava/util/concurrent/Callable;)Lcom/google/common/util/concurrent/p;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public p(Ljava/lang/String;)Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    sget-object v0, Lapp/notifee/core/database/NotifeeCoreDatabase;->q:Lcom/google/common/util/concurrent/r;

    .line 2
    .line 3
    new-instance v1, Ls4/e;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Ls4/e;-><init>(Ls4/i;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Lcom/google/common/util/concurrent/r;->submit(Ljava/util/concurrent/Callable;)Lcom/google/common/util/concurrent/p;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public y(Lcg/v;)V
    .locals 2

    .line 1
    sget-object v0, Lapp/notifee/core/database/NotifeeCoreDatabase;->q:Lcom/google/common/util/concurrent/r;

    .line 2
    .line 3
    new-instance v1, Ls4/g;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Ls4/g;-><init>(Ls4/i;Lcg/v;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
