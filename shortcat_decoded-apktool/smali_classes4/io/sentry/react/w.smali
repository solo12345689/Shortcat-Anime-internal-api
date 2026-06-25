.class public abstract Lio/sentry/react/w;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Ljava/util/Map;

.field private static b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lio/sentry/react/w$a;

    .line 2
    .line 3
    const/high16 v1, 0x3f400000    # 0.75f

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/16 v3, 0x33

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lio/sentry/react/w$a;-><init>(IFZ)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lio/sentry/react/w;->a:Ljava/util/Map;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    sput-object v0, Lio/sentry/react/w;->b:Ljava/lang/String;

    .line 15
    .line 16
    return-void
.end method

.method public static synthetic a(Lio/sentry/p2;Lcom/facebook/react/bridge/Promise;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lio/sentry/react/v;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lio/sentry/react/v;-><init>(Lio/sentry/p2;Lcom/facebook/react/bridge/Promise;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catch_0
    move-exception p0

    .line 15
    const-string v0, "Failed to receive the instance of Choreographer"

    .line 16
    .line 17
    invoke-interface {p1, v0, p0}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static synthetic b(Lio/sentry/p2;Lcom/facebook/react/bridge/Promise;J)V
    .locals 2

    .line 1
    invoke-interface {p0}, Lio/sentry/p2;->now()Lio/sentry/o2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lio/sentry/o2;->m()J

    .line 6
    .line 7
    .line 8
    move-result-wide p2

    .line 9
    long-to-double p2, p2

    .line 10
    const-wide v0, 0x41cdcd6500000000L    # 1.0E9

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    div-double/2addr p2, v0

    .line 16
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p1, p0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static c(Lcom/facebook/react/bridge/Promise;Lio/sentry/p2;)V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string p1, "GetTimeToDisplay is not able to measure the time to display: Main looper not available."

    .line 8
    .line 9
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance v1, Landroid/os/Handler;

    .line 14
    .line 15
    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lio/sentry/react/u;

    .line 19
    .line 20
    invoke-direct {v0, p1, p0}, Lio/sentry/react/u;-><init>(Lio/sentry/p2;Lcom/facebook/react/bridge/Promise;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/Double;
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/react/w;->a:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Double;

    .line 8
    .line 9
    return-object p0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/Double;)V
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/react/w;->a:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static f(Ljava/lang/Double;)V
    .locals 2

    .line 1
    sget-object v0, Lio/sentry/react/w;->b:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v1, "ttid-navigation-"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    sget-object v1, Lio/sentry/react/w;->b:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0, p0}, Lio/sentry/react/w;->e(Ljava/lang/String;Ljava/lang/Double;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public static g(Ljava/lang/String;)V
    .locals 0

    .line 1
    sput-object p0, Lio/sentry/react/w;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
