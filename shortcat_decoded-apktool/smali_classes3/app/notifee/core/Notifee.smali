.class public Lapp/notifee/core/Notifee;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final REQUEST_CODE_NOTIFICATION_PERMISSION:I = 0x2b67

.field public static b:Lapp/notifee/core/Notifee; = null

.field public static c:Z = false

.field public static final d:Lcom/google/common/util/concurrent/r;


# instance fields
.field public a:Lapp/notifee/core/interfaces/MethodCallResult;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

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
    sput-object v0, Lapp/notifee/core/Notifee;->d:Lcom/google/common/util/concurrent/r;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Landroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-static {}, Lapp/notifee/core/Notifee;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static getContext()Landroid/content/Context;
    .locals 1

    .line 1
    sget-object v0, Lcg/f;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public static getInstance()Lapp/notifee/core/Notifee;
    .locals 2

    .line 1
    sget-boolean v0, Lapp/notifee/core/Notifee;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "API"

    .line 6
    .line 7
    const-string v1, "getInstance() accessed before event listener is initialized"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lapp/notifee/core/Logger;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Lapp/notifee/core/Notifee;

    .line 13
    .line 14
    invoke-direct {v0}, Lapp/notifee/core/Notifee;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lapp/notifee/core/Notifee;->b:Lapp/notifee/core/Notifee;

    .line 18
    .line 19
    :cond_0
    sget-object v0, Lapp/notifee/core/Notifee;->b:Lapp/notifee/core/Notifee;

    .line 20
    .line 21
    return-object v0
.end method

.method public static getListeningExecutorService()Lcom/google/common/util/concurrent/r;
    .locals 1

    .line 1
    sget-object v0, Lapp/notifee/core/Notifee;->d:Lcom/google/common/util/concurrent/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public static initialize(Lapp/notifee/core/interfaces/EventListener;)V
    .locals 2

    .line 1
    const-class v0, Lapp/notifee/core/Notifee;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-boolean v1, Lapp/notifee/core/Notifee;->c:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v1, Lapp/notifee/core/Notifee;->b:Lapp/notifee/core/Notifee;

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    new-instance v1, Lapp/notifee/core/Notifee;

    .line 17
    .line 18
    invoke-direct {v1}, Lapp/notifee/core/Notifee;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lapp/notifee/core/Notifee;->b:Lapp/notifee/core/Notifee;

    .line 22
    .line 23
    :cond_1
    if-eqz p0, :cond_2

    .line 24
    .line 25
    invoke-static {p0}, Lapp/notifee/core/EventSubscriber;->register(Lapp/notifee/core/interfaces/EventListener;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    const/4 p0, 0x1

    .line 29
    sput-boolean p0, Lapp/notifee/core/Notifee;->c:Z

    .line 30
    .line 31
    monitor-exit v0

    .line 32
    return-void

    .line 33
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    throw p0
.end method


# virtual methods
.method public cancelAllNotifications(ILapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lr4/E0;->e(I)Lcom/google/common/util/concurrent/p;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lapp/notifee/core/Notifee$g;

    .line 6
    .line 7
    invoke-direct {v0, p0, p2}, Lapp/notifee/core/Notifee$g;-><init>(Lapp/notifee/core/Notifee;Lapp/notifee/core/interfaces/MethodCallResult;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lapp/notifee/core/Notifee;->getListeningExecutorService()Lcom/google/common/util/concurrent/r;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-static {p1, v0, p2}, Lcom/google/common/util/concurrent/j;->a(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/i;Ljava/util/concurrent/Executor;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public cancelAllNotificationsWithIds(ILjava/util/List;Ljava/lang/String;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p1, p2, p3}, Lr4/E0;->h(ILjava/util/List;Ljava/lang/String;)Lcom/google/common/util/concurrent/p;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, Lapp/notifee/core/Notifee$h;

    .line 6
    .line 7
    invoke-direct {p2, p0, p4}, Lapp/notifee/core/Notifee$h;-><init>(Lapp/notifee/core/Notifee;Lapp/notifee/core/interfaces/MethodCallResult;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lapp/notifee/core/Notifee;->getListeningExecutorService()Lcom/google/common/util/concurrent/r;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    invoke-static {p1, p2, p3}, Lcom/google/common/util/concurrent/j;->a(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/i;Ljava/util/concurrent/Executor;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public createChannel(Landroid/os/Bundle;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcg/d;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcg/d;-><init>(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lr4/b0;->e(Lcg/d;)Lcom/google/common/util/concurrent/p;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    new-instance v0, Lapp/notifee/core/Notifee$i;

    .line 11
    .line 12
    invoke-direct {v0, p0, p2}, Lapp/notifee/core/Notifee$i;-><init>(Lapp/notifee/core/Notifee;Lapp/notifee/core/interfaces/MethodCallResult;)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lapp/notifee/core/Notifee;->getListeningExecutorService()Lcom/google/common/util/concurrent/r;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-static {p1, v0, p2}, Lcom/google/common/util/concurrent/j;->a(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/i;Ljava/util/concurrent/Executor;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public createChannelGroup(Landroid/os/Bundle;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcg/c;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcg/c;-><init>(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lr4/b0;->d(Lcg/c;)Lcom/google/common/util/concurrent/p;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    new-instance v0, Lapp/notifee/core/Notifee$k;

    .line 11
    .line 12
    invoke-direct {v0, p0, p2}, Lapp/notifee/core/Notifee$k;-><init>(Lapp/notifee/core/Notifee;Lapp/notifee/core/interfaces/MethodCallResult;)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lapp/notifee/core/Notifee;->getListeningExecutorService()Lcom/google/common/util/concurrent/r;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-static {p1, v0, p2}, Lcom/google/common/util/concurrent/j;->a(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/i;Ljava/util/concurrent/Executor;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public createChannelGroups(Ljava/util/List;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Landroid/os/Bundle;

    .line 25
    .line 26
    new-instance v2, Lcg/c;

    .line 27
    .line 28
    invoke-direct {v2, v1}, Lcg/c;-><init>(Landroid/os/Bundle;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-static {v0}, Lr4/b0;->g(Ljava/util/List;)Lcom/google/common/util/concurrent/p;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance v0, Lapp/notifee/core/Notifee$l;

    .line 40
    .line 41
    invoke-direct {v0, p0, p2}, Lapp/notifee/core/Notifee$l;-><init>(Lapp/notifee/core/Notifee;Lapp/notifee/core/interfaces/MethodCallResult;)V

    .line 42
    .line 43
    .line 44
    invoke-static {}, Lapp/notifee/core/Notifee;->getListeningExecutorService()Lcom/google/common/util/concurrent/r;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-static {p1, v0, p2}, Lcom/google/common/util/concurrent/j;->a(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/i;Ljava/util/concurrent/Executor;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public createChannels(Ljava/util/List;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Landroid/os/Bundle;

    .line 25
    .line 26
    new-instance v2, Lcg/d;

    .line 27
    .line 28
    invoke-direct {v2, v1}, Lcg/d;-><init>(Landroid/os/Bundle;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-static {v0}, Lr4/b0;->j(Ljava/util/List;)Lcom/google/common/util/concurrent/p;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance v0, Lapp/notifee/core/Notifee$j;

    .line 40
    .line 41
    invoke-direct {v0, p0, p2}, Lapp/notifee/core/Notifee$j;-><init>(Lapp/notifee/core/Notifee;Lapp/notifee/core/interfaces/MethodCallResult;)V

    .line 42
    .line 43
    .line 44
    invoke-static {}, Lapp/notifee/core/Notifee;->getListeningExecutorService()Lcom/google/common/util/concurrent/r;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-static {p1, v0, p2}, Lcom/google/common/util/concurrent/j;->a(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/i;Ljava/util/concurrent/Executor;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public createTriggerNotification(Landroid/os/Bundle;Landroid/os/Bundle;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            "Landroid/os/Bundle;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lapp/notifee/core/model/NotificationModel;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lapp/notifee/core/model/NotificationModel;-><init>(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0, p2}, Lr4/E0;->m(Lapp/notifee/core/model/NotificationModel;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/p;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    new-instance p2, Lapp/notifee/core/Notifee$n;

    .line 11
    .line 12
    invoke-direct {p2, p0, p3}, Lapp/notifee/core/Notifee$n;-><init>(Lapp/notifee/core/Notifee;Lapp/notifee/core/interfaces/MethodCallResult;)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lapp/notifee/core/Notifee;->getListeningExecutorService()Lcom/google/common/util/concurrent/r;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    invoke-static {p1, p2, p3}, Lcom/google/common/util/concurrent/j;->a(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/i;Ljava/util/concurrent/Executor;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public deleteChannel(Ljava/lang/String;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcg/f;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/core/app/q;->i(Landroid/content/Context;)Landroidx/core/app/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Landroidx/core/app/q;->g(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-interface {p2, p1, p1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public deleteChannelGroup(Ljava/lang/String;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcg/f;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/core/app/q;->i(Landroid/content/Context;)Landroidx/core/app/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Landroidx/core/app/q;->h(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-interface {p2, p1, p1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public displayNotification(Landroid/os/Bundle;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lapp/notifee/core/model/NotificationModel;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lapp/notifee/core/model/NotificationModel;-><init>(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-static {v0, p1}, Lr4/E0;->y(Lapp/notifee/core/model/NotificationModel;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/p;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    new-instance v0, Lapp/notifee/core/Notifee$m;

    .line 12
    .line 13
    invoke-direct {v0, p0, p2}, Lapp/notifee/core/Notifee$m;-><init>(Lapp/notifee/core/Notifee;Lapp/notifee/core/interfaces/MethodCallResult;)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lapp/notifee/core/Notifee;->getListeningExecutorService()Lcom/google/common/util/concurrent/r;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-static {p1, v0, p2}, Lcom/google/common/util/concurrent/j;->a(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/i;Ljava/util/concurrent/Executor;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public getChannel(Ljava/lang/String;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Landroid/os/Bundle;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lr4/b0;->f(Ljava/lang/String;)Lcom/google/common/util/concurrent/p;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lapp/notifee/core/Notifee$b;

    .line 6
    .line 7
    invoke-direct {v0, p0, p2}, Lapp/notifee/core/Notifee$b;-><init>(Lapp/notifee/core/Notifee;Lapp/notifee/core/interfaces/MethodCallResult;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lapp/notifee/core/Notifee;->getListeningExecutorService()Lcom/google/common/util/concurrent/r;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-static {p1, v0, p2}, Lcom/google/common/util/concurrent/j;->a(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/i;Ljava/util/concurrent/Executor;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public getChannelGroup(Ljava/lang/String;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Landroid/os/Bundle;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lr4/b0;->i(Ljava/lang/String;)Lcom/google/common/util/concurrent/p;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lapp/notifee/core/Notifee$d;

    .line 6
    .line 7
    invoke-direct {v0, p0, p2}, Lapp/notifee/core/Notifee$d;-><init>(Lapp/notifee/core/Notifee;Lapp/notifee/core/interfaces/MethodCallResult;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lapp/notifee/core/Notifee;->getListeningExecutorService()Lcom/google/common/util/concurrent/r;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-static {p1, v0, p2}, Lcom/google/common/util/concurrent/j;->a(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/i;Ljava/util/concurrent/Executor;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public getChannelGroups(Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lr4/b0;->c()Lcom/google/common/util/concurrent/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lapp/notifee/core/Notifee$c;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lapp/notifee/core/Notifee$c;-><init>(Lapp/notifee/core/Notifee;Lapp/notifee/core/interfaces/MethodCallResult;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lapp/notifee/core/Notifee;->getListeningExecutorService()Lcom/google/common/util/concurrent/r;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {v0, v1, p1}, Lcom/google/common/util/concurrent/j;->a(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/i;Ljava/util/concurrent/Executor;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public getChannels(Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lr4/b0;->h()Lcom/google/common/util/concurrent/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lapp/notifee/core/Notifee$a;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lapp/notifee/core/Notifee$a;-><init>(Lapp/notifee/core/Notifee;Lapp/notifee/core/interfaces/MethodCallResult;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lapp/notifee/core/Notifee;->getListeningExecutorService()Lcom/google/common/util/concurrent/r;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {v0, v1, p1}, Lcom/google/common/util/concurrent/j;->a(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/i;Ljava/util/concurrent/Executor;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public getDisplayedNotifications(Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lr4/E0;->d()Lcom/google/common/util/concurrent/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lapp/notifee/core/Notifee$o;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lapp/notifee/core/Notifee$o;-><init>(Lapp/notifee/core/Notifee;Lapp/notifee/core/interfaces/MethodCallResult;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lapp/notifee/core/Notifee;->getListeningExecutorService()Lcom/google/common/util/concurrent/r;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {v0, v1, p1}, Lcom/google/common/util/concurrent/j;->a(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/i;Ljava/util/concurrent/Executor;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public getInitialNotification(Landroid/app/Activity;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Landroid/os/Bundle;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcg/g;->b:Lcg/g;

    .line 2
    .line 3
    iget-object v0, v0, Lcg/g;->a:Lci/c;

    .line 4
    .line 5
    const-class v1, Lcg/i;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lci/c;->q(Ljava/lang/Class;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcg/i;

    .line 12
    .line 13
    new-instance v1, Landroid/os/Bundle;

    .line 14
    .line 15
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const-string v3, "notification"

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object p1, v0, Lcg/i;->b:Landroid/os/Bundle;

    .line 24
    .line 25
    invoke-virtual {v1, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, v0, Lcg/i;->a:Lapp/notifee/core/model/NotificationModel;

    .line 29
    .line 30
    invoke-virtual {p1}, Lapp/notifee/core/model/NotificationModel;->toBundle()Landroid/os/Bundle;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {v1, v3, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p2, v2, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    if-eqz p1, :cond_1

    .line 42
    .line 43
    :try_start_0
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    invoke-virtual {p1, v3}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    invoke-virtual {p1, v3}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {v1, v3, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {p2, v2, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :catch_0
    move-exception p1

    .line 73
    const-string v0, "API"

    .line 74
    .line 75
    const-string v1, "getInitialNotification"

    .line 76
    .line 77
    invoke-static {v0, v1, p1}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 78
    .line 79
    .line 80
    :cond_1
    invoke-interface {p2, v2, v2}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public getMainComponent(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lcg/g;->b:Lcg/g;

    .line 2
    .line 3
    iget-object v0, v0, Lcg/g;->a:Lci/c;

    .line 4
    .line 5
    const-class v1, Lcg/l;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lci/c;->q(Ljava/lang/Class;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcg/l;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    iget-object p1, v0, Lcg/l;->a:Ljava/lang/String;

    .line 17
    .line 18
    return-object p1
.end method

.method public getNotificationSettings(Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Landroid/os/Bundle;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcg/f;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/core/app/q;->i(Landroid/content/Context;)Landroidx/core/app/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/core/app/q;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    new-instance v1, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const-string v3, "authorizationStatus"

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1, v3, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    :goto_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 30
    .line 31
    const/16 v3, 0x1f

    .line 32
    .line 33
    if-lt v0, v3, :cond_1

    .line 34
    .line 35
    invoke-static {}, Lcg/a;->a()Landroid/app/AlarmManager;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, Lr4/f;->a(Landroid/app/AlarmManager;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move v0, v4

    .line 45
    :goto_1
    new-instance v3, Landroid/os/Bundle;

    .line 46
    .line 47
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 48
    .line 49
    .line 50
    const-string v5, "alarm"

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    invoke-virtual {v3, v5, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 59
    .line 60
    .line 61
    :goto_2
    const-string v0, "android"

    .line 62
    .line 63
    invoke-virtual {v1, v0, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 64
    .line 65
    .line 66
    const/4 v0, 0x0

    .line 67
    invoke-interface {p1, v0, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public getPowerManagerInfo(Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Landroid/os/Bundle;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcg/f;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lcg/r;->a(Landroid/content/Context;)Landroid/content/Intent;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcg/k;->b(Landroid/content/Intent;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 12
    .line 13
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 14
    .line 15
    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v4, Landroid/os/Bundle;

    .line 18
    .line 19
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v5, "manufacturer"

    .line 23
    .line 24
    invoke-virtual {v4, v5, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string v1, "model"

    .line 28
    .line 29
    invoke-virtual {v4, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v1, "version"

    .line 33
    .line 34
    invoke-virtual {v4, v1, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v1, "activity"

    .line 38
    .line 39
    invoke-virtual {v4, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    invoke-interface {p1, v0, v4}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public getTriggerNotificationIds(Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lr4/E0;->a:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v0, Ls4/i;

    .line 4
    .line 5
    sget-object v1, Lcg/f;->a:Landroid/content/Context;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ls4/i;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ls4/i;->o()Lcom/google/common/util/concurrent/p;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Lcg/n;

    .line 15
    .line 16
    invoke-direct {v1, p1}, Lcg/n;-><init>(Lapp/notifee/core/interfaces/MethodCallResult;)V

    .line 17
    .line 18
    .line 19
    sget-object p1, Lr4/E0;->b:Lcom/google/common/util/concurrent/r;

    .line 20
    .line 21
    invoke-static {v0, v1, p1}, Lcom/google/common/util/concurrent/j;->a(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/i;Ljava/util/concurrent/Executor;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public getTriggerNotifications(Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lr4/E0;->a:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v0, Ls4/i;

    .line 4
    .line 5
    sget-object v1, Lcg/f;->a:Landroid/content/Context;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ls4/i;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ls4/i;->o()Lcom/google/common/util/concurrent/p;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v2, Lcg/m;

    .line 20
    .line 21
    invoke-direct {v2, v1, p1}, Lcg/m;-><init>(Ljava/util/List;Lapp/notifee/core/interfaces/MethodCallResult;)V

    .line 22
    .line 23
    .line 24
    sget-object p1, Lr4/E0;->b:Lcom/google/common/util/concurrent/r;

    .line 25
    .line 26
    invoke-static {v0, v2, p1}, Lcom/google/common/util/concurrent/j;->a(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/i;Ljava/util/concurrent/Executor;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public isBatteryOptimizationEnabled(Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcg/f;->a:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "power"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Landroid/os/PowerManager;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v1, v0}, Landroid/os/PowerManager;->isIgnoringBatteryOptimizations(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    xor-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-interface {p1, v1, v0}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public isChannelBlocked(Ljava/lang/String;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lr4/b0;->m(Ljava/lang/String;)Lcom/google/common/util/concurrent/p;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lapp/notifee/core/Notifee$f;

    .line 6
    .line 7
    invoke-direct {v0, p0, p2}, Lapp/notifee/core/Notifee$f;-><init>(Lapp/notifee/core/Notifee;Lapp/notifee/core/interfaces/MethodCallResult;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lapp/notifee/core/Notifee;->getListeningExecutorService()Lcom/google/common/util/concurrent/r;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-static {p1, v0, p2}, Lcom/google/common/util/concurrent/j;->a(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/i;Ljava/util/concurrent/Executor;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public isChannelCreated(Ljava/lang/String;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lr4/b0;->p(Ljava/lang/String;)Lcom/google/common/util/concurrent/p;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lapp/notifee/core/Notifee$e;

    .line 6
    .line 7
    invoke-direct {v0, p0, p2}, Lapp/notifee/core/Notifee$e;-><init>(Lapp/notifee/core/Notifee;Lapp/notifee/core/interfaces/MethodCallResult;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lapp/notifee/core/Notifee;->getListeningExecutorService()Lcom/google/common/util/concurrent/r;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-static {p1, v0, p2}, Lcom/google/common/util/concurrent/j;->a(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/i;Ljava/util/concurrent/Executor;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 0

    .line 1
    const/16 p2, 0x2b67

    .line 2
    .line 3
    if-ne p1, p2, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lapp/notifee/core/Notifee;->a:Lapp/notifee/core/interfaces/MethodCallResult;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lapp/notifee/core/Notifee;->getNotificationSettings(Lapp/notifee/core/interfaces/MethodCallResult;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1
.end method

.method public openAlarmPermissionSettings(Landroid/app/Activity;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 11
    .line 12
    .line 13
    const/high16 v1, 0x10000000

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 16
    .line 17
    .line 18
    const-string v1, "android.settings.REQUEST_SCHEDULE_EXACT_ALARM"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    sget-object v1, Lcg/f;->a:Landroid/content/Context;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    new-instance v2, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v3, "package:"

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 51
    .line 52
    .line 53
    invoke-static {p1, v0}, Lcg/k;->c(Landroid/app/Activity;Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catch_0
    move-exception p1

    .line 58
    const-string v0, "AlarmUtils"

    .line 59
    .line 60
    const-string v1, "An error occurred whilst trying to open alarm permission settings"

    .line 61
    .line 62
    invoke-static {v0, v1, p1}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 63
    .line 64
    .line 65
    :goto_0
    const/4 p1, 0x0

    .line 66
    invoke-interface {p2, p1, p1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public openBatteryOptimizationSettings(Landroid/app/Activity;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "PowerManagerUtils"

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    .line 4
    .line 5
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS"

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 11
    .line 12
    .line 13
    const/high16 v2, 0x10000000

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 16
    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    sget-object v2, Lcg/f;->a:Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {v2, v1}, Lcg/k;->d(Landroid/content/Context;Landroid/content/Intent;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    const-string p1, "battery optimization settings is not available on device"

    .line 29
    .line 30
    invoke-static {v0, p1}, Lapp/notifee/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :catch_0
    move-exception p1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {p1, v1}, Lcg/k;->c(Landroid/app/Activity;Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :goto_0
    const-string v1, "An error occurred whilst trying to open battery optimization settings"

    .line 41
    .line 42
    invoke-static {v0, v1, p1}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    :goto_1
    const/4 p1, 0x0

    .line 46
    invoke-interface {p2, p1, p1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public openNotificationSettings(Ljava/lang/String;Landroid/app/Activity;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/app/Activity;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lapp/notifee/core/Notifee;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    .line 13
    const/16 v2, 0x1a

    .line 14
    .line 15
    if-lt v0, v2, :cond_2

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    new-instance v0, Landroid/content/Intent;

    .line 20
    .line 21
    const-string v2, "android.settings.CHANNEL_NOTIFICATION_SETTINGS"

    .line 22
    .line 23
    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v2, "android.provider.extra.CHANNEL_ID"

    .line 27
    .line 28
    invoke-virtual {v0, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    new-instance v0, Landroid/content/Intent;

    .line 33
    .line 34
    const-string p1, "android.settings.APP_NOTIFICATION_SETTINGS"

    .line 35
    .line 36
    invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-static {}, Lapp/notifee/core/Notifee;->getContext()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const-string v2, "android.provider.extra.APP_PACKAGE"

    .line 48
    .line 49
    invoke-virtual {v0, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    new-instance v0, Landroid/content/Intent;

    .line 54
    .line 55
    const-string p1, "android.settings.APPLICATION_SETTINGS"

    .line 56
    .line 57
    invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :goto_1
    const/high16 p1, 0x10000000

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 63
    .line 64
    .line 65
    new-instance p1, Lr4/g;

    .line 66
    .line 67
    invoke-direct {p1, v0}, Lr4/g;-><init>(Landroid/content/Intent;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 71
    .line 72
    .line 73
    invoke-interface {p3, v1, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_3
    :goto_2
    const-string p1, "openNotificationSettings"

    .line 78
    .line 79
    const-string p2, "attempted to start activity but no current activity or context was available."

    .line 80
    .line 81
    invoke-static {p1, p2}, Lapp/notifee/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p3, v1, v1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public openPowerManagerSettings(Landroid/app/Activity;Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-class v0, Lcg/r;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcg/r;->a:Landroid/content/Intent;

    .line 5
    .line 6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcg/f;->a:Landroid/content/Context;

    .line 10
    .line 11
    invoke-static {v0}, Lcg/r;->a(Landroid/content/Context;)Landroid/content/Intent;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :cond_0
    if-eqz v1, :cond_1

    .line 16
    .line 17
    const/high16 v0, 0x10000000

    .line 18
    .line 19
    :try_start_1
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 20
    .line 21
    .line 22
    invoke-static {p1, v1}, Lcg/k;->c(Landroid/app/Activity;Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catch_0
    move-exception p1

    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v2, "Unable to start activity: "

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-static {v1}, Lcg/k;->b(Landroid/content/Intent;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-string v1, "PowerManagerUtils"

    .line 49
    .line 50
    invoke-static {v1, v0, p1}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    const-string p1, "PowerManagerUtils"

    .line 55
    .line 56
    const-string v0, "Unable to find an activity to open the device\'s power manager"

    .line 57
    .line 58
    invoke-static {p1, v0}, Lapp/notifee/core/Logger;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :goto_0
    const/4 p1, 0x0

    .line 62
    invoke-interface {p2, p1, p1}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 68
    throw p1
.end method

.method public setRequestPermissionCallback(Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Landroid/os/Bundle;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lapp/notifee/core/Notifee;->a:Lapp/notifee/core/interfaces/MethodCallResult;

    .line 2
    .line 3
    return-void
.end method

.method public stopForegroundService(Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lapp/notifee/core/interfaces/MethodCallResult<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lapp/notifee/core/ForegroundService;->a:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v0, Landroid/content/Intent;

    .line 4
    .line 5
    sget-object v1, Lcg/f;->a:Landroid/content/Context;

    .line 6
    .line 7
    const-class v2, Lapp/notifee/core/ForegroundService;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "app.notifee.core.ForegroundService.STOP"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 15
    .line 16
    .line 17
    :try_start_0
    sget-object v1, Lcg/f;->a:Landroid/content/Context;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception v0

    .line 24
    const-string v1, "ForegroundService"

    .line 25
    .line 26
    const-string v2, "Unable to stop foreground service"

    .line 27
    .line 28
    invoke-static {v1, v2, v0}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catch_1
    sget-object v1, Lcg/f;->a:Landroid/content/Context;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    .line 35
    .line 36
    .line 37
    :goto_0
    const/4 v0, 0x0

    .line 38
    invoke-interface {p1, v0, v0}, Lapp/notifee/core/interfaces/MethodCallResult;->onComplete(Ljava/lang/Exception;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method
