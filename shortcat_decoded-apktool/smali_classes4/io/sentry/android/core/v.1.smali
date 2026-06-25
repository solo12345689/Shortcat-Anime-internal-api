.class public Lio/sentry/android/core/v;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/sentry/N;
.implements Lio/sentry/transport/z$b;


# instance fields
.field private final a:Lio/sentry/ILogger;

.field private final b:Ljava/lang/String;

.field private final c:I

.field private final d:Lio/sentry/d0;

.field private final e:Lio/sentry/android/core/g0;

.field private f:Z

.field private final g:Lio/sentry/android/core/internal/util/G;

.field private h:Lio/sentry/android/core/M;

.field private i:Z

.field private j:Lio/sentry/a0;

.field private k:Ljava/util/concurrent/Future;

.field private l:Lio/sentry/i;

.field private final m:Ljava/util/List;

.field private n:Lio/sentry/protocol/x;

.field private o:Lio/sentry/protocol/x;

.field private final p:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private q:Lio/sentry/o2;

.field private volatile r:Z

.field private s:Z

.field private t:Z

.field private u:I

.field private final v:Lio/sentry/util/a;

.field private final w:Lio/sentry/util/a;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/g0;Lio/sentry/android/core/internal/util/G;Lio/sentry/ILogger;Ljava/lang/String;ILio/sentry/d0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lio/sentry/android/core/v;->f:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-object v1, p0, Lio/sentry/android/core/v;->h:Lio/sentry/android/core/M;

    .line 9
    .line 10
    iput-boolean v0, p0, Lio/sentry/android/core/v;->i:Z

    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lio/sentry/android/core/v;->m:Ljava/util/List;

    .line 18
    .line 19
    sget-object v1, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 20
    .line 21
    iput-object v1, p0, Lio/sentry/android/core/v;->n:Lio/sentry/protocol/x;

    .line 22
    .line 23
    iput-object v1, p0, Lio/sentry/android/core/v;->o:Lio/sentry/protocol/x;

    .line 24
    .line 25
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lio/sentry/android/core/v;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 31
    .line 32
    new-instance v1, Lio/sentry/r3;

    .line 33
    .line 34
    invoke-direct {v1}, Lio/sentry/r3;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lio/sentry/android/core/v;->q:Lio/sentry/o2;

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    iput-boolean v1, p0, Lio/sentry/android/core/v;->r:Z

    .line 41
    .line 42
    iput-boolean v0, p0, Lio/sentry/android/core/v;->s:Z

    .line 43
    .line 44
    iput-boolean v0, p0, Lio/sentry/android/core/v;->t:Z

    .line 45
    .line 46
    iput v0, p0, Lio/sentry/android/core/v;->u:I

    .line 47
    .line 48
    new-instance v0, Lio/sentry/util/a;

    .line 49
    .line 50
    invoke-direct {v0}, Lio/sentry/util/a;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Lio/sentry/android/core/v;->v:Lio/sentry/util/a;

    .line 54
    .line 55
    new-instance v0, Lio/sentry/util/a;

    .line 56
    .line 57
    invoke-direct {v0}, Lio/sentry/util/a;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Lio/sentry/android/core/v;->w:Lio/sentry/util/a;

    .line 61
    .line 62
    iput-object p3, p0, Lio/sentry/android/core/v;->a:Lio/sentry/ILogger;

    .line 63
    .line 64
    iput-object p2, p0, Lio/sentry/android/core/v;->g:Lio/sentry/android/core/internal/util/G;

    .line 65
    .line 66
    iput-object p1, p0, Lio/sentry/android/core/v;->e:Lio/sentry/android/core/g0;

    .line 67
    .line 68
    iput-object p4, p0, Lio/sentry/android/core/v;->b:Ljava/lang/String;

    .line 69
    .line 70
    iput p5, p0, Lio/sentry/android/core/v;->c:I

    .line 71
    .line 72
    iput-object p6, p0, Lio/sentry/android/core/v;->d:Lio/sentry/d0;

    .line 73
    .line 74
    return-void
.end method

.method public static synthetic a(Lio/sentry/android/core/v;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lio/sentry/android/core/v;->n(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static synthetic b(Lio/sentry/android/core/v;Lio/sentry/z3;Lio/sentry/a0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/v;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    iget-object v1, p0, Lio/sentry/android/core/v;->m:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lio/sentry/android/core/v;->w:Lio/sentry/util/a;

    .line 22
    .line 23
    invoke-virtual {v1}, Lio/sentry/util/a;->a()Lio/sentry/e0;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :try_start_0
    iget-object v2, p0, Lio/sentry/android/core/v;->m:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Lio/sentry/r1$a;

    .line 44
    .line 45
    invoke-virtual {v3, p1}, Lio/sentry/r1$a;->a(Lio/sentry/z3;)Lio/sentry/r1;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception p0

    .line 54
    goto :goto_3

    .line 55
    :cond_1
    iget-object p0, p0, Lio/sentry/android/core/v;->m:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {p0}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    invoke-interface {v1}, Lio/sentry/e0;->close()V

    .line 63
    .line 64
    .line 65
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_3

    .line 74
    .line 75
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Lio/sentry/r1;

    .line 80
    .line 81
    invoke-interface {p2, p1}, Lio/sentry/a0;->w(Lio/sentry/r1;)Lio/sentry/protocol/x;

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    :goto_2
    return-void

    .line 86
    :goto_3
    if-eqz v1, :cond_4

    .line 87
    .line 88
    :try_start_1
    invoke-interface {v1}, Lio/sentry/e0;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 89
    .line 90
    .line 91
    goto :goto_4

    .line 92
    :catchall_1
    move-exception p1

    .line 93
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    :cond_4
    :goto_4
    throw p0
.end method

.method private i()V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lio/sentry/android/core/v;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lio/sentry/android/core/v;->f:Z

    .line 8
    .line 9
    iget-object v2, p0, Lio/sentry/android/core/v;->b:Ljava/lang/String;

    .line 10
    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lio/sentry/android/core/v;->a:Lio/sentry/ILogger;

    .line 14
    .line 15
    sget-object v1, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    new-array v2, v2, [Ljava/lang/Object;

    .line 19
    .line 20
    const-string v3, "Disabling profiling because no profiling traces dir path is defined in options."

    .line 21
    .line 22
    invoke-interface {v0, v1, v3, v2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    iget v0, p0, Lio/sentry/android/core/v;->c:I

    .line 27
    .line 28
    if-gtz v0, :cond_2

    .line 29
    .line 30
    iget-object v1, p0, Lio/sentry/android/core/v;->a:Lio/sentry/ILogger;

    .line 31
    .line 32
    sget-object v2, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 33
    .line 34
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v3, "Disabling profiling because trace rate is set to %d"

    .line 43
    .line 44
    invoke-interface {v1, v2, v3, v0}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    new-instance v1, Lio/sentry/android/core/M;

    .line 49
    .line 50
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 51
    .line 52
    const-wide/16 v3, 0x1

    .line 53
    .line 54
    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    .line 55
    .line 56
    .line 57
    move-result-wide v3

    .line 58
    long-to-int v0, v3

    .line 59
    iget v3, p0, Lio/sentry/android/core/v;->c:I

    .line 60
    .line 61
    div-int v3, v0, v3

    .line 62
    .line 63
    iget-object v4, p0, Lio/sentry/android/core/v;->g:Lio/sentry/android/core/internal/util/G;

    .line 64
    .line 65
    const/4 v5, 0x0

    .line 66
    iget-object v6, p0, Lio/sentry/android/core/v;->a:Lio/sentry/ILogger;

    .line 67
    .line 68
    invoke-direct/range {v1 .. v6}, Lio/sentry/android/core/M;-><init>(Ljava/lang/String;ILio/sentry/android/core/internal/util/G;Lio/sentry/d0;Lio/sentry/ILogger;)V

    .line 69
    .line 70
    .line 71
    iput-object v1, p0, Lio/sentry/android/core/v;->h:Lio/sentry/android/core/M;

    .line 72
    .line 73
    return-void
.end method

.method private j()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/v;->j:Lio/sentry/a0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lio/sentry/U0;->i()Lio/sentry/U0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    :cond_0
    invoke-static {}, Lio/sentry/g2;->r()Lio/sentry/a0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {}, Lio/sentry/U0;->i()Lio/sentry/U0;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eq v0, v1, :cond_1

    .line 20
    .line 21
    invoke-static {}, Lio/sentry/g2;->r()Lio/sentry/a0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lio/sentry/android/core/v;->j:Lio/sentry/a0;

    .line 26
    .line 27
    invoke-static {}, Lio/sentry/g2;->r()Lio/sentry/a0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v0}, Lio/sentry/a0;->h()Lio/sentry/z3;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Lio/sentry/z3;->getCompositePerformanceCollector()Lio/sentry/i;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Lio/sentry/android/core/v;->l:Lio/sentry/i;

    .line 40
    .line 41
    iget-object v0, p0, Lio/sentry/android/core/v;->j:Lio/sentry/a0;

    .line 42
    .line 43
    invoke-interface {v0}, Lio/sentry/a0;->n()Lio/sentry/transport/z;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Lio/sentry/transport/z;->j(Lio/sentry/transport/z$b;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    return-void
.end method

.method private k(Lio/sentry/a0;Lio/sentry/z3;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lio/sentry/z3;->getExecutorService()Lio/sentry/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lio/sentry/android/core/u;

    .line 6
    .line 7
    invoke-direct {v1, p0, p2, p1}, Lio/sentry/android/core/u;-><init>(Lio/sentry/android/core/v;Lio/sentry/z3;Lio/sentry/a0;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Lio/sentry/d0;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    invoke-virtual {p2}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    sget-object v0, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 20
    .line 21
    const-string v1, "Failed to send profile chunks."

    .line 22
    .line 23
    invoke-interface {p2, v0, v1, p1}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private l()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lio/sentry/android/core/v;->j()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/sentry/android/core/v;->e:Lio/sentry/android/core/g0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lio/sentry/android/core/g0;->d()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0x16

    .line 11
    .line 12
    if-ge v0, v1, :cond_0

    .line 13
    .line 14
    goto/16 :goto_1

    .line 15
    .line 16
    :cond_0
    invoke-direct {p0}, Lio/sentry/android/core/v;->i()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lio/sentry/android/core/v;->h:Lio/sentry/android/core/M;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    iget-object v0, p0, Lio/sentry/android/core/v;->j:Lio/sentry/a0;

    .line 25
    .line 26
    if-eqz v0, :cond_5

    .line 27
    .line 28
    invoke-interface {v0}, Lio/sentry/a0;->n()Lio/sentry/transport/z;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v1, 0x0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    sget-object v2, Lio/sentry/k;->All:Lio/sentry/k;

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Lio/sentry/transport/z;->o(Lio/sentry/k;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_2

    .line 42
    .line 43
    sget-object v2, Lio/sentry/k;->ProfileChunkUi:Lio/sentry/k;

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Lio/sentry/transport/z;->o(Lio/sentry/k;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    :cond_2
    iget-object v0, p0, Lio/sentry/android/core/v;->a:Lio/sentry/ILogger;

    .line 52
    .line 53
    sget-object v2, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 54
    .line 55
    const-string v3, "SDK is rate limited. Stopping profiler."

    .line 56
    .line 57
    new-array v4, v1, [Ljava/lang/Object;

    .line 58
    .line 59
    invoke-interface {v0, v2, v3, v4}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-direct {p0, v1}, Lio/sentry/android/core/v;->n(Z)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_3
    iget-object v0, p0, Lio/sentry/android/core/v;->j:Lio/sentry/a0;

    .line 67
    .line 68
    invoke-interface {v0}, Lio/sentry/a0;->h()Lio/sentry/z3;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Lio/sentry/z3;->getConnectionStatusProvider()Lio/sentry/M;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-interface {v0}, Lio/sentry/M;->x0()Lio/sentry/M$a;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    sget-object v2, Lio/sentry/M$a;->DISCONNECTED:Lio/sentry/M$a;

    .line 81
    .line 82
    if-ne v0, v2, :cond_4

    .line 83
    .line 84
    iget-object v0, p0, Lio/sentry/android/core/v;->a:Lio/sentry/ILogger;

    .line 85
    .line 86
    sget-object v2, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 87
    .line 88
    const-string v3, "Device is offline. Stopping profiler."

    .line 89
    .line 90
    new-array v4, v1, [Ljava/lang/Object;

    .line 91
    .line 92
    invoke-interface {v0, v2, v3, v4}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-direct {p0, v1}, Lio/sentry/android/core/v;->n(Z)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_4
    iget-object v0, p0, Lio/sentry/android/core/v;->j:Lio/sentry/a0;

    .line 100
    .line 101
    invoke-interface {v0}, Lio/sentry/a0;->h()Lio/sentry/z3;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0}, Lio/sentry/z3;->getDateProvider()Lio/sentry/p2;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-interface {v0}, Lio/sentry/p2;->now()Lio/sentry/o2;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iput-object v0, p0, Lio/sentry/android/core/v;->q:Lio/sentry/o2;

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_5
    new-instance v0, Lio/sentry/r3;

    .line 117
    .line 118
    invoke-direct {v0}, Lio/sentry/r3;-><init>()V

    .line 119
    .line 120
    .line 121
    iput-object v0, p0, Lio/sentry/android/core/v;->q:Lio/sentry/o2;

    .line 122
    .line 123
    :goto_0
    iget-object v0, p0, Lio/sentry/android/core/v;->h:Lio/sentry/android/core/M;

    .line 124
    .line 125
    invoke-virtual {v0}, Lio/sentry/android/core/M;->j()Lio/sentry/android/core/M$c;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    if-nez v0, :cond_6

    .line 130
    .line 131
    :goto_1
    return-void

    .line 132
    :cond_6
    const/4 v0, 0x1

    .line 133
    iput-boolean v0, p0, Lio/sentry/android/core/v;->i:Z

    .line 134
    .line 135
    iget-object v1, p0, Lio/sentry/android/core/v;->n:Lio/sentry/protocol/x;

    .line 136
    .line 137
    sget-object v2, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 138
    .line 139
    invoke-virtual {v1, v2}, Lio/sentry/protocol/x;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-eqz v1, :cond_7

    .line 144
    .line 145
    new-instance v1, Lio/sentry/protocol/x;

    .line 146
    .line 147
    invoke-direct {v1}, Lio/sentry/protocol/x;-><init>()V

    .line 148
    .line 149
    .line 150
    iput-object v1, p0, Lio/sentry/android/core/v;->n:Lio/sentry/protocol/x;

    .line 151
    .line 152
    :cond_7
    iget-object v1, p0, Lio/sentry/android/core/v;->o:Lio/sentry/protocol/x;

    .line 153
    .line 154
    invoke-virtual {v1, v2}, Lio/sentry/protocol/x;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-eqz v1, :cond_8

    .line 159
    .line 160
    new-instance v1, Lio/sentry/protocol/x;

    .line 161
    .line 162
    invoke-direct {v1}, Lio/sentry/protocol/x;-><init>()V

    .line 163
    .line 164
    .line 165
    iput-object v1, p0, Lio/sentry/android/core/v;->o:Lio/sentry/protocol/x;

    .line 166
    .line 167
    :cond_8
    iget-object v1, p0, Lio/sentry/android/core/v;->l:Lio/sentry/i;

    .line 168
    .line 169
    if-eqz v1, :cond_9

    .line 170
    .line 171
    iget-object v2, p0, Lio/sentry/android/core/v;->o:Lio/sentry/protocol/x;

    .line 172
    .line 173
    invoke-virtual {v2}, Lio/sentry/protocol/x;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-interface {v1, v2}, Lio/sentry/i;->f(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    :cond_9
    :try_start_0
    iget-object v1, p0, Lio/sentry/android/core/v;->d:Lio/sentry/d0;

    .line 181
    .line 182
    new-instance v2, Lio/sentry/android/core/t;

    .line 183
    .line 184
    invoke-direct {v2, p0}, Lio/sentry/android/core/t;-><init>(Lio/sentry/android/core/v;)V

    .line 185
    .line 186
    .line 187
    const-wide/32 v3, 0xea60

    .line 188
    .line 189
    .line 190
    invoke-interface {v1, v2, v3, v4}, Lio/sentry/d0;->schedule(Ljava/lang/Runnable;J)Ljava/util/concurrent/Future;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    iput-object v1, p0, Lio/sentry/android/core/v;->k:Ljava/util/concurrent/Future;
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 195
    .line 196
    return-void

    .line 197
    :catch_0
    move-exception v1

    .line 198
    iget-object v2, p0, Lio/sentry/android/core/v;->a:Lio/sentry/ILogger;

    .line 199
    .line 200
    sget-object v3, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 201
    .line 202
    const-string v4, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?"

    .line 203
    .line 204
    invoke-interface {v2, v3, v4, v1}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 205
    .line 206
    .line 207
    iput-boolean v0, p0, Lio/sentry/android/core/v;->s:Z

    .line 208
    .line 209
    return-void
.end method

.method private n(Z)V
    .locals 12

    .line 1
    invoke-direct {p0}, Lio/sentry/android/core/v;->j()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/sentry/android/core/v;->v:Lio/sentry/util/a;

    .line 5
    .line 6
    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/e0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :try_start_0
    iget-object v0, p0, Lio/sentry/android/core/v;->k:Ljava/util/concurrent/Future;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-interface {v0, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    move-object p1, v0

    .line 21
    goto/16 :goto_6

    .line 22
    .line 23
    :cond_0
    :goto_0
    iget-object v0, p0, Lio/sentry/android/core/v;->h:Lio/sentry/android/core/M;

    .line 24
    .line 25
    if-eqz v0, :cond_9

    .line 26
    .line 27
    iget-boolean v0, p0, Lio/sentry/android/core/v;->i:Z

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    goto/16 :goto_5

    .line 32
    .line 33
    :cond_1
    iget-object v0, p0, Lio/sentry/android/core/v;->e:Lio/sentry/android/core/g0;

    .line 34
    .line 35
    invoke-virtual {v0}, Lio/sentry/android/core/g0;->d()I

    .line 36
    .line 37
    .line 38
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    const/16 v2, 0x16

    .line 40
    .line 41
    if-ge v0, v2, :cond_2

    .line 42
    .line 43
    if-eqz v1, :cond_a

    .line 44
    .line 45
    invoke-interface {v1}, Lio/sentry/e0;->close()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    :try_start_1
    iget-object v0, p0, Lio/sentry/android/core/v;->l:Lio/sentry/i;

    .line 50
    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    iget-object v2, p0, Lio/sentry/android/core/v;->o:Lio/sentry/protocol/x;

    .line 54
    .line 55
    invoke-virtual {v2}, Lio/sentry/protocol/x;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-interface {v0, v2}, Lio/sentry/i;->c(Ljava/lang/String;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    goto :goto_1

    .line 64
    :cond_3
    const/4 v0, 0x0

    .line 65
    :goto_1
    iget-object v2, p0, Lio/sentry/android/core/v;->h:Lio/sentry/android/core/M;

    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    invoke-virtual {v2, v3, v0}, Lio/sentry/android/core/M;->g(ZLjava/util/List;)Lio/sentry/android/core/M$b;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-nez v0, :cond_4

    .line 73
    .line 74
    iget-object v0, p0, Lio/sentry/android/core/v;->a:Lio/sentry/ILogger;

    .line 75
    .line 76
    sget-object v2, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 77
    .line 78
    const-string v4, "An error occurred while collecting a profile chunk, and it won\'t be sent."

    .line 79
    .line 80
    new-array v5, v3, [Ljava/lang/Object;

    .line 81
    .line 82
    invoke-interface {v0, v2, v4, v5}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    iget-object v2, p0, Lio/sentry/android/core/v;->w:Lio/sentry/util/a;

    .line 87
    .line 88
    invoke-virtual {v2}, Lio/sentry/util/a;->a()Lio/sentry/e0;

    .line 89
    .line 90
    .line 91
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    :try_start_2
    iget-object v4, p0, Lio/sentry/android/core/v;->m:Ljava/util/List;

    .line 93
    .line 94
    new-instance v5, Lio/sentry/r1$a;

    .line 95
    .line 96
    iget-object v6, p0, Lio/sentry/android/core/v;->n:Lio/sentry/protocol/x;

    .line 97
    .line 98
    iget-object v7, p0, Lio/sentry/android/core/v;->o:Lio/sentry/protocol/x;

    .line 99
    .line 100
    iget-object v8, v0, Lio/sentry/android/core/M$b;->d:Ljava/util/Map;

    .line 101
    .line 102
    iget-object v9, v0, Lio/sentry/android/core/M$b;->c:Ljava/io/File;

    .line 103
    .line 104
    iget-object v10, p0, Lio/sentry/android/core/v;->q:Lio/sentry/o2;

    .line 105
    .line 106
    const-string v11, "android"

    .line 107
    .line 108
    invoke-direct/range {v5 .. v11}, Lio/sentry/r1$a;-><init>(Lio/sentry/protocol/x;Lio/sentry/protocol/x;Ljava/util/Map;Ljava/io/File;Lio/sentry/o2;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 112
    .line 113
    .line 114
    if-eqz v2, :cond_5

    .line 115
    .line 116
    :try_start_3
    invoke-interface {v2}, Lio/sentry/e0;->close()V

    .line 117
    .line 118
    .line 119
    :cond_5
    :goto_2
    iput-boolean v3, p0, Lio/sentry/android/core/v;->i:Z

    .line 120
    .line 121
    sget-object v0, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 122
    .line 123
    iput-object v0, p0, Lio/sentry/android/core/v;->o:Lio/sentry/protocol/x;

    .line 124
    .line 125
    iget-object v2, p0, Lio/sentry/android/core/v;->j:Lio/sentry/a0;

    .line 126
    .line 127
    if-eqz v2, :cond_6

    .line 128
    .line 129
    invoke-interface {v2}, Lio/sentry/a0;->h()Lio/sentry/z3;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-direct {p0, v2, v4}, Lio/sentry/android/core/v;->k(Lio/sentry/a0;Lio/sentry/z3;)V

    .line 134
    .line 135
    .line 136
    :cond_6
    if-eqz p1, :cond_7

    .line 137
    .line 138
    iget-boolean p1, p0, Lio/sentry/android/core/v;->s:Z

    .line 139
    .line 140
    if-nez p1, :cond_7

    .line 141
    .line 142
    iget-object p1, p0, Lio/sentry/android/core/v;->a:Lio/sentry/ILogger;

    .line 143
    .line 144
    sget-object v0, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 145
    .line 146
    const-string v2, "Profile chunk finished. Starting a new one."

    .line 147
    .line 148
    new-array v3, v3, [Ljava/lang/Object;

    .line 149
    .line 150
    invoke-interface {p1, v0, v2, v3}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    invoke-direct {p0}, Lio/sentry/android/core/v;->l()V

    .line 154
    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_7
    iput-object v0, p0, Lio/sentry/android/core/v;->n:Lio/sentry/protocol/x;

    .line 158
    .line 159
    iget-object p1, p0, Lio/sentry/android/core/v;->a:Lio/sentry/ILogger;

    .line 160
    .line 161
    sget-object v0, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 162
    .line 163
    const-string v2, "Profile chunk finished."

    .line 164
    .line 165
    new-array v3, v3, [Ljava/lang/Object;

    .line 166
    .line 167
    invoke-interface {p1, v0, v2, v3}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 168
    .line 169
    .line 170
    :goto_3
    if-eqz v1, :cond_a

    .line 171
    .line 172
    invoke-interface {v1}, Lio/sentry/e0;->close()V

    .line 173
    .line 174
    .line 175
    return-void

    .line 176
    :catchall_1
    move-exception v0

    .line 177
    move-object p1, v0

    .line 178
    if-eqz v2, :cond_8

    .line 179
    .line 180
    :try_start_4
    invoke-interface {v2}, Lio/sentry/e0;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 181
    .line 182
    .line 183
    goto :goto_4

    .line 184
    :catchall_2
    move-exception v0

    .line 185
    :try_start_5
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 186
    .line 187
    .line 188
    :cond_8
    :goto_4
    throw p1

    .line 189
    :cond_9
    :goto_5
    sget-object p1, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 190
    .line 191
    iput-object p1, p0, Lio/sentry/android/core/v;->n:Lio/sentry/protocol/x;

    .line 192
    .line 193
    iput-object p1, p0, Lio/sentry/android/core/v;->o:Lio/sentry/protocol/x;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 194
    .line 195
    if-eqz v1, :cond_a

    .line 196
    .line 197
    invoke-interface {v1}, Lio/sentry/e0;->close()V

    .line 198
    .line 199
    .line 200
    :cond_a
    return-void

    .line 201
    :goto_6
    if-eqz v1, :cond_b

    .line 202
    .line 203
    :try_start_6
    invoke-interface {v1}, Lio/sentry/e0;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 204
    .line 205
    .line 206
    goto :goto_7

    .line 207
    :catchall_3
    move-exception v0

    .line 208
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 209
    .line 210
    .line 211
    :cond_b
    :goto_7
    throw p1
.end method


# virtual methods
.method public c(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/v;->v:Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/e0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :try_start_0
    iput v1, p0, Lio/sentry/android/core/v;->u:I

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    iput-boolean v2, p0, Lio/sentry/android/core/v;->s:Z

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-direct {p0, v1}, Lio/sentry/android/core/v;->n(Z)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lio/sentry/android/core/v;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-interface {v0}, Lio/sentry/e0;->close()V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void

    .line 32
    :goto_1
    if-eqz v0, :cond_2

    .line 33
    .line 34
    :try_start_1
    invoke-interface {v0}, Lio/sentry/e0;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    .line 36
    .line 37
    goto :goto_2

    .line 38
    :catchall_1
    move-exception v0

    .line 39
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    :goto_2
    throw p1
.end method

.method public d(Lio/sentry/t1;Lio/sentry/g4;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/v;->v:Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/e0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    iget-boolean v1, p0, Lio/sentry/android/core/v;->r:Z

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-static {}, Lio/sentry/util/B;->a()Lio/sentry/util/z;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Lio/sentry/util/z;->c()D

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    invoke-virtual {p2, v3, v4}, Lio/sentry/g4;->c(D)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    iput-boolean p2, p0, Lio/sentry/android/core/v;->t:Z

    .line 25
    .line 26
    iput-boolean v2, p0, Lio/sentry/android/core/v;->r:Z

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto :goto_2

    .line 31
    :cond_0
    :goto_0
    iget-boolean p2, p0, Lio/sentry/android/core/v;->t:Z

    .line 32
    .line 33
    if-nez p2, :cond_1

    .line 34
    .line 35
    iget-object p1, p0, Lio/sentry/android/core/v;->a:Lio/sentry/ILogger;

    .line 36
    .line 37
    sget-object p2, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 38
    .line 39
    const-string v1, "Profiler was not started due to sampling decision."

    .line 40
    .line 41
    new-array v2, v2, [Ljava/lang/Object;

    .line 42
    .line 43
    invoke-interface {p1, p2, v1, v2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    if-eqz v0, :cond_7

    .line 47
    .line 48
    invoke-interface {v0}, Lio/sentry/e0;->close()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    :try_start_1
    sget-object p2, Lio/sentry/android/core/v$a;->a:[I

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    aget p1, p2, p1

    .line 59
    .line 60
    const/4 p2, 0x1

    .line 61
    if-eq p1, p2, :cond_3

    .line 62
    .line 63
    const/4 p2, 0x2

    .line 64
    if-eq p1, p2, :cond_2

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    invoke-virtual {p0}, Lio/sentry/android/core/v;->isRunning()Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_5

    .line 72
    .line 73
    iget-object p1, p0, Lio/sentry/android/core/v;->a:Lio/sentry/ILogger;

    .line 74
    .line 75
    sget-object p2, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 76
    .line 77
    const-string v1, "Profiler is already running."

    .line 78
    .line 79
    new-array v2, v2, [Ljava/lang/Object;

    .line 80
    .line 81
    invoke-interface {p1, p2, v1, v2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    .line 83
    .line 84
    if-eqz v0, :cond_7

    .line 85
    .line 86
    invoke-interface {v0}, Lio/sentry/e0;->close()V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_3
    :try_start_2
    iget p1, p0, Lio/sentry/android/core/v;->u:I

    .line 91
    .line 92
    if-gez p1, :cond_4

    .line 93
    .line 94
    iput v2, p0, Lio/sentry/android/core/v;->u:I

    .line 95
    .line 96
    :cond_4
    iget p1, p0, Lio/sentry/android/core/v;->u:I

    .line 97
    .line 98
    add-int/2addr p1, p2

    .line 99
    iput p1, p0, Lio/sentry/android/core/v;->u:I

    .line 100
    .line 101
    :cond_5
    :goto_1
    invoke-virtual {p0}, Lio/sentry/android/core/v;->isRunning()Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-nez p1, :cond_6

    .line 106
    .line 107
    iget-object p1, p0, Lio/sentry/android/core/v;->a:Lio/sentry/ILogger;

    .line 108
    .line 109
    sget-object p2, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 110
    .line 111
    const-string v1, "Started Profiler."

    .line 112
    .line 113
    new-array v2, v2, [Ljava/lang/Object;

    .line 114
    .line 115
    invoke-interface {p1, p2, v1, v2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-direct {p0}, Lio/sentry/android/core/v;->l()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 119
    .line 120
    .line 121
    :cond_6
    if-eqz v0, :cond_7

    .line 122
    .line 123
    invoke-interface {v0}, Lio/sentry/e0;->close()V

    .line 124
    .line 125
    .line 126
    :cond_7
    return-void

    .line 127
    :goto_2
    if-eqz v0, :cond_8

    .line 128
    .line 129
    :try_start_3
    invoke-interface {v0}, Lio/sentry/e0;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 130
    .line 131
    .line 132
    goto :goto_3

    .line 133
    :catchall_1
    move-exception p2

    .line 134
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    :cond_8
    :goto_3
    throw p1
.end method

.method public e()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lio/sentry/android/core/v;->r:Z

    .line 3
    .line 4
    return-void
.end method

.method public f()Lio/sentry/protocol/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/v;->o:Lio/sentry/protocol/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public g(Lio/sentry/t1;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/v;->v:Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/e0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    sget-object v1, Lio/sentry/android/core/v$a;->a:[I

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    aget p1, v1, p1

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-eq p1, v1, :cond_1

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    if-eq p1, v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iput-boolean v1, p0, Lio/sentry/android/core/v;->s:Z

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    iget p1, p0, Lio/sentry/android/core/v;->u:I

    .line 28
    .line 29
    sub-int/2addr p1, v1

    .line 30
    iput p1, p0, Lio/sentry/android/core/v;->u:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    if-lez p1, :cond_2

    .line 33
    .line 34
    if-eqz v0, :cond_4

    .line 35
    .line 36
    invoke-interface {v0}, Lio/sentry/e0;->close()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    if-gez p1, :cond_3

    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    :try_start_1
    iput p1, p0, Lio/sentry/android/core/v;->u:I

    .line 44
    .line 45
    :cond_3
    iput-boolean v1, p0, Lio/sentry/android/core/v;->s:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    .line 47
    :goto_0
    if-eqz v0, :cond_4

    .line 48
    .line 49
    invoke-interface {v0}, Lio/sentry/e0;->close()V

    .line 50
    .line 51
    .line 52
    :cond_4
    return-void

    .line 53
    :goto_1
    if-eqz v0, :cond_5

    .line 54
    .line 55
    :try_start_2
    invoke-interface {v0}, Lio/sentry/e0;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :catchall_1
    move-exception v0

    .line 60
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    :cond_5
    :goto_2
    throw p1
.end method

.method public h()Lio/sentry/protocol/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/v;->n:Lio/sentry/protocol/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public isRunning()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/sentry/android/core/v;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public m(Lio/sentry/transport/z;)V
    .locals 4

    .line 1
    sget-object v0, Lio/sentry/k;->All:Lio/sentry/k;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lio/sentry/transport/z;->o(Lio/sentry/k;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    sget-object v0, Lio/sentry/k;->ProfileChunkUi:Lio/sentry/k;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lio/sentry/transport/z;->o(Lio/sentry/k;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void

    .line 19
    :cond_1
    :goto_0
    iget-object p1, p0, Lio/sentry/android/core/v;->a:Lio/sentry/ILogger;

    .line 20
    .line 21
    sget-object v0, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 22
    .line 23
    const-string v1, "SDK is rate limited. Stopping profiler."

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    new-array v3, v2, [Ljava/lang/Object;

    .line 27
    .line 28
    invoke-interface {p1, v0, v1, v3}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, v2}, Lio/sentry/android/core/v;->n(Z)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
