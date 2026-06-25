.class public final synthetic Lio/sentry/transport/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/concurrent/RejectedExecutionHandler;


# instance fields
.field public final synthetic a:Lio/sentry/cache/g;

.field public final synthetic b:Lio/sentry/ILogger;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/cache/g;Lio/sentry/ILogger;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/transport/a;->a:Lio/sentry/cache/g;

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/transport/a;->b:Lio/sentry/ILogger;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final rejectedExecution(Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/transport/a;->a:Lio/sentry/cache/g;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/transport/a;->b:Lio/sentry/ILogger;

    .line 4
    .line 5
    invoke-static {v0, v1, p1, p2}, Lio/sentry/transport/e;->h(Lio/sentry/cache/g;Lio/sentry/ILogger;Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
