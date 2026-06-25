.class public Lapp/notifee/core/EventSubscriber;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final b:Lapp/notifee/core/EventSubscriber;


# instance fields
.field public final a:Ljava/util/Set;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lapp/notifee/core/EventSubscriber;

    .line 2
    .line 3
    invoke-direct {v0}, Lapp/notifee/core/EventSubscriber;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lapp/notifee/core/EventSubscriber;->b:Lapp/notifee/core/EventSubscriber;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lapp/notifee/core/EventSubscriber;->a:Ljava/util/Set;

    .line 10
    .line 11
    invoke-static {p0}, Lcg/g;->c(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
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

.method public static register(Lapp/notifee/core/interfaces/EventListener;)V
    .locals 1

    .line 1
    sget-object v0, Lapp/notifee/core/EventSubscriber;->b:Lapp/notifee/core/EventSubscriber;

    .line 2
    .line 3
    iget-object v0, v0, Lapp/notifee/core/EventSubscriber;->a:Ljava/util/Set;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static unregister(Lapp/notifee/core/interfaces/EventListener;)V
    .locals 1

    .line 1
    sget-object v0, Lapp/notifee/core/EventSubscriber;->b:Lapp/notifee/core/EventSubscriber;

    .line 2
    .line 3
    iget-object v0, v0, Lapp/notifee/core/EventSubscriber;->a:Ljava/util/Set;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onBlockStateEvent(Lapp/notifee/core/event/BlockStateEvent;)V
    .locals 2
    .annotation runtime Lci/m;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    iget-object v0, p0, Lapp/notifee/core/EventSubscriber;->a:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lapp/notifee/core/interfaces/EventListener;

    .line 18
    .line 19
    invoke-interface {v1, p1}, Lapp/notifee/core/interfaces/EventListener;->onBlockStateEvent(Lapp/notifee/core/event/BlockStateEvent;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public onForegroundServiceEvent(Lapp/notifee/core/event/ForegroundServiceEvent;)V
    .locals 2
    .annotation runtime Lci/m;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    iget-object v0, p0, Lapp/notifee/core/EventSubscriber;->a:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lapp/notifee/core/interfaces/EventListener;

    .line 18
    .line 19
    invoke-interface {v1, p1}, Lapp/notifee/core/interfaces/EventListener;->onForegroundServiceEvent(Lapp/notifee/core/event/ForegroundServiceEvent;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public onLogEvent(Lapp/notifee/core/event/LogEvent;)V
    .locals 2
    .annotation runtime Lci/m;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    iget-object v0, p0, Lapp/notifee/core/EventSubscriber;->a:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lapp/notifee/core/interfaces/EventListener;

    .line 18
    .line 19
    invoke-interface {v1, p1}, Lapp/notifee/core/interfaces/EventListener;->onLogEvent(Lapp/notifee/core/event/LogEvent;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public onNotificationEvent(Lapp/notifee/core/event/NotificationEvent;)V
    .locals 2
    .annotation runtime Lci/m;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    iget-object v0, p0, Lapp/notifee/core/EventSubscriber;->a:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lapp/notifee/core/interfaces/EventListener;

    .line 18
    .line 19
    invoke-interface {v1, p1}, Lapp/notifee/core/interfaces/EventListener;->onNotificationEvent(Lapp/notifee/core/event/NotificationEvent;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method
