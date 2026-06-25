.class public final Lio/sentry/android/replay/capture/a$e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lle/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/sentry/android/replay/capture/a;-><init>(Lio/sentry/z3;Lio/sentry/a0;Lio/sentry/transport/o;Ljava/util/concurrent/ScheduledExecutorService;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicReference;

.field final synthetic b:Lio/sentry/android/replay/capture/a;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lio/sentry/android/replay/capture/a;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lio/sentry/android/replay/capture/a;Ljava/lang/String;Lio/sentry/android/replay/capture/a;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lio/sentry/android/replay/capture/a$e;->b:Lio/sentry/android/replay/capture/a;

    .line 2
    .line 3
    iput-object p3, p0, Lio/sentry/android/replay/capture/a$e;->c:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p4, p0, Lio/sentry/android/replay/capture/a$e;->d:Lio/sentry/android/replay/capture/a;

    .line 6
    .line 7
    iput-object p5, p0, Lio/sentry/android/replay/capture/a$e;->e:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance p2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    .line 14
    invoke-direct {p2, p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Lio/sentry/android/replay/capture/a$e;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 18
    .line 19
    return-void
.end method

.method private final c(Lie/a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/capture/a$e;->b:Lio/sentry/android/replay/capture/a;

    .line 2
    .line 3
    invoke-static {v0}, Lio/sentry/android/replay/capture/a;->k(Lio/sentry/android/replay/capture/a;)Lio/sentry/z3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lio/sentry/z3;->getThreadChecker()Lio/sentry/util/thread/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Lio/sentry/util/thread/a;->a()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lio/sentry/android/replay/capture/a$e;->b:Lio/sentry/android/replay/capture/a;

    .line 18
    .line 19
    invoke-static {v0}, Lio/sentry/android/replay/capture/a;->l(Lio/sentry/android/replay/capture/a;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, Lio/sentry/android/replay/util/m;

    .line 24
    .line 25
    new-instance v2, Lio/sentry/android/replay/capture/a$e$a;

    .line 26
    .line 27
    invoke-direct {v2, p1}, Lio/sentry/android/replay/capture/a$e$a;-><init>(Lie/a;)V

    .line 28
    .line 29
    .line 30
    const-string p1, "CaptureStrategy.runInBackground"

    .line 31
    .line 32
    invoke-direct {v1, p1, v2}, Lio/sentry/android/replay/util/m;-><init>(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    :try_start_0
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    iget-object v0, p0, Lio/sentry/android/replay/capture/a$e;->b:Lio/sentry/android/replay/capture/a;

    .line 45
    .line 46
    invoke-static {v0}, Lio/sentry/android/replay/capture/a;->k(Lio/sentry/android/replay/capture/a;)Lio/sentry/z3;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sget-object v1, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 55
    .line 56
    const-string v2, "Failed to execute task CaptureStrategy.runInBackground"

    .line 57
    .line 58
    invoke-interface {v0, v1, v2, p1}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lpe/m;)Ljava/lang/Object;
    .locals 0

    .line 1
    const-string p1, "property"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lio/sentry/android/replay/capture/a$e;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public b(Ljava/lang/Object;Lpe/m;Ljava/lang/Object;)V
    .locals 6

    .line 1
    const-string p1, "property"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lio/sentry/android/replay/capture/a$e;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    invoke-virtual {p1, p3}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-static {v2, p3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    new-instance v0, Lio/sentry/android/replay/capture/a$e$b;

    .line 19
    .line 20
    iget-object v1, p0, Lio/sentry/android/replay/capture/a$e;->c:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v4, p0, Lio/sentry/android/replay/capture/a$e;->d:Lio/sentry/android/replay/capture/a;

    .line 23
    .line 24
    iget-object v5, p0, Lio/sentry/android/replay/capture/a$e;->e:Ljava/lang/String;

    .line 25
    .line 26
    move-object v3, p3

    .line 27
    invoke-direct/range {v0 .. v5}, Lio/sentry/android/replay/capture/a$e$b;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lio/sentry/android/replay/capture/a;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, v0}, Lio/sentry/android/replay/capture/a$e;->c(Lie/a;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method
