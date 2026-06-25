.class public final Lio/sentry/android/replay/w;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/sentry/android/replay/g;
.implements Lio/sentry/android/replay/e;
.implements Lio/sentry/android/replay/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/android/replay/w$a;
    }
.end annotation


# instance fields
.field private final a:Lio/sentry/z3;

.field private final b:Lio/sentry/android/replay/r;

.field private final c:Lio/sentry/android/replay/u;

.field private final d:Lio/sentry/android/replay/util/i;

.field private final e:Ljava/util/concurrent/ScheduledExecutorService;

.field private final f:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final g:Ljava/util/ArrayList;

.field private h:Landroid/graphics/Point;

.field private final i:Lio/sentry/util/a;

.field private final j:Lio/sentry/util/a;

.field private final k:Lio/sentry/util/a;

.field private volatile l:Lio/sentry/android/replay/w$a;

.field private volatile m:Landroid/os/HandlerThread;

.field private volatile n:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lio/sentry/z3;Lio/sentry/android/replay/r;Lio/sentry/android/replay/u;Lio/sentry/android/replay/util/i;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 1

    .line 1
    const-string v0, "options"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "windowCallback"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "mainLooperHandler"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "replayExecutor"

    .line 17
    .line 18
    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lio/sentry/android/replay/w;->a:Lio/sentry/z3;

    .line 25
    .line 26
    iput-object p2, p0, Lio/sentry/android/replay/w;->b:Lio/sentry/android/replay/r;

    .line 27
    .line 28
    iput-object p3, p0, Lio/sentry/android/replay/w;->c:Lio/sentry/android/replay/u;

    .line 29
    .line 30
    iput-object p4, p0, Lio/sentry/android/replay/w;->d:Lio/sentry/android/replay/util/i;

    .line 31
    .line 32
    iput-object p5, p0, Lio/sentry/android/replay/w;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 33
    .line 34
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 35
    .line 36
    const/4 p2, 0x0

    .line 37
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lio/sentry/android/replay/w;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 41
    .line 42
    new-instance p1, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lio/sentry/android/replay/w;->g:Ljava/util/ArrayList;

    .line 48
    .line 49
    new-instance p1, Landroid/graphics/Point;

    .line 50
    .line 51
    invoke-direct {p1}, Landroid/graphics/Point;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Lio/sentry/android/replay/w;->h:Landroid/graphics/Point;

    .line 55
    .line 56
    new-instance p1, Lio/sentry/util/a;

    .line 57
    .line 58
    invoke-direct {p1}, Lio/sentry/util/a;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, Lio/sentry/android/replay/w;->i:Lio/sentry/util/a;

    .line 62
    .line 63
    new-instance p1, Lio/sentry/util/a;

    .line 64
    .line 65
    invoke-direct {p1}, Lio/sentry/util/a;-><init>()V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, Lio/sentry/android/replay/w;->j:Lio/sentry/util/a;

    .line 69
    .line 70
    new-instance p1, Lio/sentry/util/a;

    .line 71
    .line 72
    invoke-direct {p1}, Lio/sentry/util/a;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, Lio/sentry/android/replay/w;->k:Lio/sentry/util/a;

    .line 76
    .line 77
    return-void
.end method

.method public static final synthetic j(Lio/sentry/android/replay/w;)Landroid/graphics/Point;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/android/replay/w;->h:Landroid/graphics/Point;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic k(Lio/sentry/android/replay/w;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/android/replay/w;->g:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic l(Lio/sentry/android/replay/w;)Lio/sentry/android/replay/u;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/android/replay/w;->c:Lio/sentry/android/replay/u;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a(Landroid/view/View;Z)V
    .locals 4

    .line 1
    const-string v0, "root"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/sentry/android/replay/w;->i:Lio/sentry/util/a;

    .line 7
    .line 8
    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/e0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz p2, :cond_2

    .line 14
    .line 15
    :try_start_0
    invoke-static {p1}, Lio/sentry/android/replay/y;->a(Landroid/view/View;)Landroid/view/Window;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, Lio/sentry/android/replay/w;->a:Lio/sentry/z3;

    .line 22
    .line 23
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    sget-object p2, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 28
    .line 29
    const-string v2, "Root view does not have a phone window, skipping."

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    new-array v3, v3, [Ljava/lang/Object;

    .line 33
    .line 34
    invoke-interface {p1, p2, v2, v3}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1}, Lge/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_2

    .line 43
    :cond_0
    :try_start_1
    iget-object p2, p0, Lio/sentry/android/replay/w;->g:Ljava/util/ArrayList;

    .line 44
    .line 45
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 46
    .line 47
    invoke-direct {v2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, Lio/sentry/android/replay/w;->l:Lio/sentry/android/replay/w$a;

    .line 54
    .line 55
    if-eqz p2, :cond_1

    .line 56
    .line 57
    invoke-virtual {p2}, Lio/sentry/android/replay/w$a;->a()Lio/sentry/android/replay/q;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    if-eqz p2, :cond_1

    .line 62
    .line 63
    invoke-virtual {p2, p1}, Lio/sentry/android/replay/q;->a(Landroid/view/View;)V

    .line 64
    .line 65
    .line 66
    :cond_1
    invoke-virtual {p0, p1}, Lio/sentry/android/replay/w;->m(Landroid/view/View;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    iget-object p2, p0, Lio/sentry/android/replay/w;->l:Lio/sentry/android/replay/w$a;

    .line 71
    .line 72
    if-eqz p2, :cond_3

    .line 73
    .line 74
    invoke-virtual {p2}, Lio/sentry/android/replay/w$a;->a()Lio/sentry/android/replay/q;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    if-eqz p2, :cond_3

    .line 79
    .line 80
    invoke-virtual {p2, p1}, Lio/sentry/android/replay/q;->f(Landroid/view/View;)V

    .line 81
    .line 82
    .line 83
    :cond_3
    iget-object p2, p0, Lio/sentry/android/replay/w;->g:Ljava/util/ArrayList;

    .line 84
    .line 85
    new-instance v2, Lio/sentry/android/replay/w$c;

    .line 86
    .line 87
    invoke-direct {v2, p1}, Lio/sentry/android/replay/w$c;-><init>(Landroid/view/View;)V

    .line 88
    .line 89
    .line 90
    invoke-static {p2, v2}, LUd/u;->K(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 91
    .line 92
    .line 93
    iget-object p2, p0, Lio/sentry/android/replay/w;->g:Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-static {p2}, LUd/u;->A0(Ljava/util/List;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    check-cast p2, Ljava/lang/ref/WeakReference;

    .line 100
    .line 101
    if-eqz p2, :cond_4

    .line 102
    .line 103
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    check-cast p2, Landroid/view/View;

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_4
    move-object p2, v1

    .line 111
    :goto_0
    if-eqz p2, :cond_6

    .line 112
    .line 113
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    if-nez p1, :cond_6

    .line 118
    .line 119
    iget-object p1, p0, Lio/sentry/android/replay/w;->l:Lio/sentry/android/replay/w$a;

    .line 120
    .line 121
    if-eqz p1, :cond_5

    .line 122
    .line 123
    invoke-virtual {p1}, Lio/sentry/android/replay/w$a;->a()Lio/sentry/android/replay/q;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    if-eqz p1, :cond_5

    .line 128
    .line 129
    invoke-virtual {p1, p2}, Lio/sentry/android/replay/q;->a(Landroid/view/View;)V

    .line 130
    .line 131
    .line 132
    :cond_5
    invoke-virtual {p0, p2}, Lio/sentry/android/replay/w;->m(Landroid/view/View;)V

    .line 133
    .line 134
    .line 135
    :cond_6
    :goto_1
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 136
    .line 137
    invoke-static {v0, v1}, Lge/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :goto_2
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 142
    :catchall_1
    move-exception p2

    .line 143
    invoke-static {v0, p1}, Lge/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 144
    .line 145
    .line 146
    throw p2
.end method

.method public b()Lio/sentry/android/replay/util/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/w;->d:Lio/sentry/android/replay/util/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public close()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lio/sentry/android/replay/w;->reset()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/sentry/android/replay/w;->d:Lio/sentry/android/replay/util/i;

    .line 5
    .line 6
    iget-object v1, p0, Lio/sentry/android/replay/w;->l:Lio/sentry/android/replay/w$a;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lio/sentry/android/replay/util/i;->d(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lio/sentry/android/replay/w;->k:Lio/sentry/util/a;

    .line 12
    .line 13
    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/e0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :try_start_0
    iget-object v1, p0, Lio/sentry/android/replay/w;->n:Landroid/os/Handler;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    :goto_0
    iget-object v1, p0, Lio/sentry/android/replay/w;->m:Landroid/os/HandlerThread;

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/os/HandlerThread;->quitSafely()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-static {v0, v2}, Lge/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lio/sentry/android/replay/w;->stop()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :goto_1
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 43
    :catchall_1
    move-exception v2

    .line 44
    invoke-static {v0, v1}, Lge/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    throw v2
.end method

.method public g()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/w;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()Landroid/os/Handler;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/w;->n:Landroid/os/Handler;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lio/sentry/android/replay/w;->k:Lio/sentry/util/a;

    .line 6
    .line 7
    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/e0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :try_start_0
    iget-object v1, p0, Lio/sentry/android/replay/w;->n:Landroid/os/Handler;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    new-instance v1, Landroid/os/HandlerThread;

    .line 16
    .line 17
    const-string v2, "SentryReplayBackgroundProcessing"

    .line 18
    .line 19
    invoke-direct {v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lio/sentry/android/replay/w;->m:Landroid/os/HandlerThread;

    .line 23
    .line 24
    iget-object v1, p0, Lio/sentry/android/replay/w;->m:Landroid/os/HandlerThread;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    new-instance v1, Landroid/os/Handler;

    .line 35
    .line 36
    iget-object v2, p0, Lio/sentry/android/replay/w;->m:Landroid/os/HandlerThread;

    .line 37
    .line 38
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 46
    .line 47
    .line 48
    iput-object v1, p0, Lio/sentry/android/replay/w;->n:Landroid/os/Handler;

    .line 49
    .line 50
    :cond_1
    sget-object v1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    invoke-static {v0, v1}, Lge/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :goto_1
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 58
    :catchall_1
    move-exception v2

    .line 59
    invoke-static {v0, v1}, Lge/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    throw v2

    .line 63
    :cond_2
    :goto_2
    iget-object v0, p0, Lio/sentry/android/replay/w;->n:Landroid/os/Handler;

    .line 64
    .line 65
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-object v0
.end method

.method public i()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/w;->l:Lio/sentry/android/replay/w$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/sentry/android/replay/w$a;->c()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final m(Landroid/view/View;)V
    .locals 3

    .line 1
    const-string v0, "root"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lio/sentry/android/replay/util/r;->e(Landroid/view/View;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v1, p0, Lio/sentry/android/replay/w;->h:Landroid/graphics/Point;

    .line 17
    .line 18
    iget v1, v1, Landroid/graphics/Point;->x:I

    .line 19
    .line 20
    if-eq v0, v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v1, p0, Lio/sentry/android/replay/w;->h:Landroid/graphics/Point;

    .line 27
    .line 28
    iget v2, v1, Landroid/graphics/Point;->y:I

    .line 29
    .line 30
    if-eq v0, v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-virtual {v1, v0, v2}, Landroid/graphics/Point;->set(II)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lio/sentry/android/replay/w;->c:Lio/sentry/android/replay/u;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-interface {v0, v1, p1}, Lio/sentry/android/replay/u;->h(II)V

    .line 54
    .line 55
    .line 56
    :cond_0
    return-void

    .line 57
    :cond_1
    new-instance v0, Lio/sentry/android/replay/w$b;

    .line 58
    .line 59
    invoke-direct {v0, p0, p1}, Lio/sentry/android/replay/w$b;-><init>(Lio/sentry/android/replay/w;Landroid/view/View;)V

    .line 60
    .line 61
    .line 62
    invoke-static {p1, v0}, Lio/sentry/android/replay/util/r;->b(Landroid/view/View;Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public pause()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/w;->l:Lio/sentry/android/replay/w$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/sentry/android/replay/w$a;->b()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public r(Lio/sentry/android/replay/s;)V
    .locals 5

    .line 1
    const-string v0, "config"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/sentry/android/replay/w;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto/16 :goto_5

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lio/sentry/android/replay/w;->l:Lio/sentry/android/replay/w$a;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    iget-object v0, p0, Lio/sentry/android/replay/w;->j:Lio/sentry/util/a;

    .line 22
    .line 23
    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/e0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :try_start_0
    iget-object v2, p0, Lio/sentry/android/replay/w;->l:Lio/sentry/android/replay/w$a;

    .line 28
    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    new-instance v2, Lio/sentry/android/replay/w$a;

    .line 32
    .line 33
    iget-object v3, p0, Lio/sentry/android/replay/w;->a:Lio/sentry/z3;

    .line 34
    .line 35
    iget-object v4, p0, Lio/sentry/android/replay/w;->d:Lio/sentry/android/replay/util/i;

    .line 36
    .line 37
    invoke-direct {v2, v3, v4}, Lio/sentry/android/replay/w$a;-><init>(Lio/sentry/z3;Lio/sentry/android/replay/util/i;)V

    .line 38
    .line 39
    .line 40
    iput-object v2, p0, Lio/sentry/android/replay/w;->l:Lio/sentry/android/replay/w$a;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    :goto_0
    sget-object v2, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    invoke-static {v0, v1}, Lge/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :goto_1
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 52
    :catchall_1
    move-exception v1

    .line 53
    invoke-static {v0, p1}, Lge/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    throw v1

    .line 57
    :cond_2
    :goto_2
    iget-object v0, p0, Lio/sentry/android/replay/w;->l:Lio/sentry/android/replay/w$a;

    .line 58
    .line 59
    if-nez v0, :cond_3

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_3
    invoke-virtual {v0, p1}, Lio/sentry/android/replay/w$a;->d(Lio/sentry/android/replay/s;)V

    .line 63
    .line 64
    .line 65
    :goto_3
    iget-object v0, p0, Lio/sentry/android/replay/w;->l:Lio/sentry/android/replay/w$a;

    .line 66
    .line 67
    if-nez v0, :cond_4

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_4
    new-instance v2, Lio/sentry/android/replay/q;

    .line 71
    .line 72
    iget-object v3, p0, Lio/sentry/android/replay/w;->a:Lio/sentry/z3;

    .line 73
    .line 74
    iget-object v4, p0, Lio/sentry/android/replay/w;->b:Lio/sentry/android/replay/r;

    .line 75
    .line 76
    invoke-direct {v2, p1, v3, p0, v4}, Lio/sentry/android/replay/q;-><init>(Lio/sentry/android/replay/s;Lio/sentry/z3;Lio/sentry/android/replay/b;Lio/sentry/android/replay/r;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v2}, Lio/sentry/android/replay/w$a;->e(Lio/sentry/android/replay/q;)V

    .line 80
    .line 81
    .line 82
    :goto_4
    iget-object p1, p0, Lio/sentry/android/replay/w;->g:Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-static {p1}, LUd/u;->A0(Ljava/util/List;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    check-cast p1, Ljava/lang/ref/WeakReference;

    .line 89
    .line 90
    if-eqz p1, :cond_5

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    move-object v1, p1

    .line 97
    check-cast v1, Landroid/view/View;

    .line 98
    .line 99
    :cond_5
    if-eqz v1, :cond_6

    .line 100
    .line 101
    iget-object p1, p0, Lio/sentry/android/replay/w;->l:Lio/sentry/android/replay/w$a;

    .line 102
    .line 103
    if-eqz p1, :cond_6

    .line 104
    .line 105
    invoke-virtual {p1}, Lio/sentry/android/replay/w$a;->a()Lio/sentry/android/replay/q;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-eqz p1, :cond_6

    .line 110
    .line 111
    invoke-virtual {p1, v1}, Lio/sentry/android/replay/q;->a(Landroid/view/View;)V

    .line 112
    .line 113
    .line 114
    :cond_6
    iget-object p1, p0, Lio/sentry/android/replay/w;->d:Lio/sentry/android/replay/util/i;

    .line 115
    .line 116
    iget-object v0, p0, Lio/sentry/android/replay/w;->l:Lio/sentry/android/replay/w$a;

    .line 117
    .line 118
    invoke-virtual {p1, v0}, Lio/sentry/android/replay/util/i;->d(Ljava/lang/Runnable;)V

    .line 119
    .line 120
    .line 121
    iget-object p1, p0, Lio/sentry/android/replay/w;->d:Lio/sentry/android/replay/util/i;

    .line 122
    .line 123
    iget-object v0, p0, Lio/sentry/android/replay/w;->l:Lio/sentry/android/replay/w$a;

    .line 124
    .line 125
    const-wide/16 v1, 0x64

    .line 126
    .line 127
    invoke-virtual {p1, v0, v1, v2}, Lio/sentry/android/replay/util/i;->c(Ljava/lang/Runnable;J)Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-nez p1, :cond_7

    .line 132
    .line 133
    iget-object p1, p0, Lio/sentry/android/replay/w;->a:Lio/sentry/z3;

    .line 134
    .line 135
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    sget-object v0, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 140
    .line 141
    const/4 v1, 0x0

    .line 142
    new-array v1, v1, [Ljava/lang/Object;

    .line 143
    .line 144
    const-string v2, "Failed to post the capture runnable, main looper is shutting down."

    .line 145
    .line 146
    invoke-interface {p1, v0, v2, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    :cond_7
    :goto_5
    return-void
.end method

.method public reset()V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/w;->h:Landroid/graphics/Point;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1, v1}, Landroid/graphics/Point;->set(II)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lio/sentry/android/replay/w;->i:Lio/sentry/util/a;

    .line 8
    .line 9
    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/e0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :try_start_0
    iget-object v1, p0, Lio/sentry/android/replay/w;->g:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 30
    .line 31
    iget-object v3, p0, Lio/sentry/android/replay/w;->l:Lio/sentry/android/replay/w$a;

    .line 32
    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    invoke-virtual {v3}, Lio/sentry/android/replay/w$a;->a()Lio/sentry/android/replay/q;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Landroid/view/View;

    .line 46
    .line 47
    invoke-virtual {v3, v2}, Lio/sentry/android/replay/q;->f(Landroid/view/View;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception v1

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    iget-object v1, p0, Lio/sentry/android/replay/w;->g:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 56
    .line 57
    .line 58
    sget-object v1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    invoke-static {v0, v1}, Lge/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :goto_1
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 66
    :catchall_1
    move-exception v2

    .line 67
    invoke-static {v0, v1}, Lge/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    throw v2
.end method

.method public start()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/w;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public stop()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/w;->l:Lio/sentry/android/replay/w$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/sentry/android/replay/w$a;->f()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lio/sentry/android/replay/w;->j:Lio/sentry/util/a;

    .line 9
    .line 10
    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/e0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :try_start_0
    iput-object v1, p0, Lio/sentry/android/replay/w;->l:Lio/sentry/android/replay/w$a;

    .line 16
    .line 17
    sget-object v2, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    invoke-static {v0, v1}, Lge/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lio/sentry/android/replay/w;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception v1

    .line 30
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 31
    :catchall_1
    move-exception v2

    .line 32
    invoke-static {v0, v1}, Lge/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    throw v2
.end method
