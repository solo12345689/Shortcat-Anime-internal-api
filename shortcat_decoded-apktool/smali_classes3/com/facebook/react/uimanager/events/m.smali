.class public final Lcom/facebook/react/uimanager/events/m;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/uimanager/events/EventDispatcher;
.implements Lcom/facebook/react/bridge/LifecycleEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/events/m$a;,
        Lcom/facebook/react/uimanager/events/m$b;
    }
.end annotation


# static fields
.field private static final h:Lcom/facebook/react/uimanager/events/m$a;

.field private static final i:Landroid/os/Handler;


# instance fields
.field private final a:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private final b:Lcom/facebook/react/uimanager/events/EventEmitterImpl;

.field private final c:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private final d:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private final e:Lcom/facebook/react/uimanager/events/m$b;

.field private f:Z

.field private final g:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/events/m$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/events/m$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/uimanager/events/m;->h:Lcom/facebook/react/uimanager/events/m$a;

    .line 8
    .line 9
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->getUiThreadHandler()Landroid/os/Handler;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lcom/facebook/react/uimanager/events/m;->i:Landroid/os/Handler;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V
    .locals 2

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fabricEventEmitter"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/facebook/react/uimanager/events/m;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 15
    .line 16
    new-instance v0, Lcom/facebook/react/uimanager/events/EventEmitterImpl;

    .line 17
    .line 18
    invoke-direct {v0, p1}, Lcom/facebook/react/uimanager/events/EventEmitterImpl;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/facebook/react/uimanager/events/m;->b:Lcom/facebook/react/uimanager/events/EventEmitterImpl;

    .line 22
    .line 23
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lcom/facebook/react/uimanager/events/m;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 29
    .line 30
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lcom/facebook/react/uimanager/events/m;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 36
    .line 37
    new-instance v1, Lcom/facebook/react/uimanager/events/m$b;

    .line 38
    .line 39
    invoke-direct {v1, p0}, Lcom/facebook/react/uimanager/events/m$b;-><init>(Lcom/facebook/react/uimanager/events/m;)V

    .line 40
    .line 41
    .line 42
    iput-object v1, p0, Lcom/facebook/react/uimanager/events/m;->e:Lcom/facebook/react/uimanager/events/m$b;

    .line 43
    .line 44
    new-instance v1, Lcom/facebook/react/uimanager/events/l;

    .line 45
    .line 46
    invoke-direct {v1, p0}, Lcom/facebook/react/uimanager/events/l;-><init>(Lcom/facebook/react/uimanager/events/m;)V

    .line 47
    .line 48
    .line 49
    iput-object v1, p0, Lcom/facebook/react/uimanager/events/m;->g:Ljava/lang/Runnable;

    .line 50
    .line 51
    invoke-virtual {p1, p0}, Lcom/facebook/react/bridge/ReactContext;->addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p2}, Lcom/facebook/react/uimanager/events/EventEmitterImpl;->registerFabricEventEmitter(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public static synthetic e(Lcom/facebook/react/uimanager/events/m;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/uimanager/events/m;->m(Lcom/facebook/react/uimanager/events/m;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Lcom/facebook/react/uimanager/events/m;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/uimanager/events/m;->p(Lcom/facebook/react/uimanager/events/m;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic g(Lcom/facebook/react/uimanager/events/m;)Lcom/facebook/react/uimanager/events/m$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/uimanager/events/m;->e:Lcom/facebook/react/uimanager/events/m$b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(Lcom/facebook/react/uimanager/events/m;)Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/uimanager/events/m;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic i(Lcom/facebook/react/uimanager/events/m;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/uimanager/events/m;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    return-object p0
.end method

.method private final k()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lh7/b;->O()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Lcom/facebook/react/uimanager/events/m;->f:Z

    .line 12
    .line 13
    sget-object v0, Lcom/facebook/react/uimanager/events/m;->i:Landroid/os/Handler;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/facebook/react/uimanager/events/m;->g:Ljava/lang/Runnable;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/m;->e:Lcom/facebook/react/uimanager/events/m$b;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/events/m$b;->g()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private static final m(Lcom/facebook/react/uimanager/events/m;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/facebook/react/uimanager/events/m;->f:Z

    .line 3
    .line 4
    const-string v0, "BatchEventDispatchedListeners"

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    invoke-static {v1, v2, v0}, LU7/a;->c(JLjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    iget-object p0, p0, Lcom/facebook/react/uimanager/events/m;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v0, "iterator(...)"

    .line 18
    .line 19
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lcom/facebook/react/uimanager/events/a;

    .line 33
    .line 34
    invoke-interface {v0}, Lcom/facebook/react/uimanager/events/a;->onBatchEventDispatched()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    invoke-static {v1, v2}, LU7/a;->i(J)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :goto_1
    invoke-static {v1, v2}, LU7/a;->i(J)V

    .line 45
    .line 46
    .line 47
    throw p0
.end method

.method private final n(Lcom/facebook/react/uimanager/events/d;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->getEventName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v2, "FabricEventDispatcher.dispatchSynchronous(\'"

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v0, "\')"

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-wide/16 v1, 0x0

    .line 28
    .line 29
    invoke-static {v1, v2, v0}, LU7/a;->c(JLjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/m;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 33
    .line 34
    const/4 v3, 0x2

    .line 35
    invoke-static {v0, v3}, Lcom/facebook/react/uimanager/f0;->g(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    instance-of v3, v0, Lcom/facebook/react/uimanager/events/u;

    .line 40
    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    move-object v4, v0

    .line 44
    check-cast v4, Lcom/facebook/react/uimanager/events/u;

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->getSurfaceId()I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->getViewTag()I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->getEventName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->canCoalesce()Z

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->internal_getEventData$ReactAndroid_release()Lcom/facebook/react/bridge/WritableMap;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->internal_getEventCategory$ReactAndroid_release()I

    .line 67
    .line 68
    .line 69
    move-result v10

    .line 70
    const/4 v11, 0x1

    .line 71
    invoke-interface/range {v4 .. v11}, Lcom/facebook/react/uimanager/events/u;->receiveEvent(IILjava/lang/String;ZLcom/facebook/react/bridge/WritableMap;IZ)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    move-object p1, v0

    .line 77
    goto :goto_1

    .line 78
    :cond_0
    const-string p1, "FabricEventDispatcher"

    .line 79
    .line 80
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    const-string v3, "Fabric UIManager expected to implement SynchronousEventReceiver."

    .line 83
    .line 84
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-static {p1, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    .line 89
    .line 90
    :goto_0
    invoke-static {v1, v2}, LU7/a;->i(J)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :goto_1
    invoke-static {v1, v2}, LU7/a;->i(J)V

    .line 95
    .line 96
    .line 97
    throw p1
.end method

.method private static final p(Lcom/facebook/react/uimanager/events/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/m;->k()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final r()V
    .locals 2

    .line 1
    invoke-static {}, Lh7/b;->O()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/facebook/react/uimanager/events/m;->f:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lcom/facebook/react/uimanager/events/m;->f:Z

    .line 13
    .line 14
    sget-object v0, Lcom/facebook/react/uimanager/events/m;->i:Landroid/os/Handler;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/facebook/react/uimanager/events/m;->g:Ljava/lang/Runnable;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/m;->e:Lcom/facebook/react/uimanager/events/m$b;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/events/m$b;->d()V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/m;->o()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public b(Lcom/facebook/react/uimanager/events/i;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/m;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public c(Lcom/facebook/react/uimanager/events/i;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/m;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public d(Lcom/facebook/react/uimanager/events/d;)V
    .locals 2

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/m;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "iterator(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lcom/facebook/react/uimanager/events/i;

    .line 28
    .line 29
    invoke-interface {v1, p1}, Lcom/facebook/react/uimanager/events/i;->onEventDispatch(Lcom/facebook/react/uimanager/events/d;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->internal_experimental_isSynchronous$ReactAndroid_release()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/events/m;->n(Lcom/facebook/react/uimanager/events/d;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/m;->b:Lcom/facebook/react/uimanager/events/EventEmitterImpl;

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Lcom/facebook/react/uimanager/events/d;->dispatchModern(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V

    .line 46
    .line 47
    .line 48
    :goto_1
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->dispose()V

    .line 49
    .line 50
    .line 51
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/m;->r()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public j(Lcom/facebook/react/uimanager/events/a;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/m;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public l()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/m;->r()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final o()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/m;->b:Lcom/facebook/react/uimanager/events/EventEmitterImpl;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/events/EventEmitterImpl;->registerFabricEventEmitter(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lcom/facebook/react/uimanager/events/k;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lcom/facebook/react/uimanager/events/k;-><init>(Lcom/facebook/react/uimanager/events/m;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public onHostDestroy()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/m;->k()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onHostPause()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/m;->k()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onHostResume()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/m;->r()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lh7/b;->O()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/m;->e:Lcom/facebook/react/uimanager/events/m$b;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/events/m$b;->f()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public q(Lcom/facebook/react/uimanager/events/a;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/m;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method
