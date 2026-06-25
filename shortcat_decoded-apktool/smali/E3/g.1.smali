.class final LE3/g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE3/g$b;,
        LE3/g$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lt/a;

.field private final c:Lt/a;

.field private final d:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(LE3/I3;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lt/a;

    .line 5
    .line 6
    invoke-direct {v0}, Lt/a;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LE3/g;->b:Lt/a;

    .line 10
    .line 11
    new-instance v0, Lt/a;

    .line 12
    .line 13
    invoke-direct {v0}, Lt/a;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LE3/g;->c:Lt/a;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/Object;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, LE3/g;->a:Ljava/lang/Object;

    .line 24
    .line 25
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 26
    .line 27
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, LE3/g;->d:Ljava/lang/ref/WeakReference;

    .line 31
    .line 32
    return-void
.end method

.method public static synthetic a(LE3/g;Ljava/util/concurrent/atomic/AtomicBoolean;LE3/g$b;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/g;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    invoke-direct {p0, p2}, LE3/g;->g(LE3/g$b;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    const/4 p0, 0x1

    .line 17
    invoke-virtual {p3, p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 18
    .line 19
    .line 20
    :goto_0
    monitor-exit v0

    .line 21
    return-void

    .line 22
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw p0
.end method

.method public static synthetic b(LE3/g;LE3/g$a;Ljava/util/concurrent/atomic/AtomicBoolean;LE3/g$b;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, LE3/g$a;->run()Lcom/google/common/util/concurrent/p;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, LE3/f;

    .line 9
    .line 10
    invoke-direct {v0, p0, p2, p3, p4}, LE3/f;-><init>(LE3/g;Ljava/util/concurrent/atomic/AtomicBoolean;LE3/g$b;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lcom/google/common/util/concurrent/s;->a()Ljava/util/concurrent/Executor;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p1, v0, p0}, Lcom/google/common/util/concurrent/p;->k(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static synthetic c(LE3/g;LE3/h3$g;Lq2/P$b;)Lcom/google/common/util/concurrent/p;
    .locals 0

    .line 1
    iget-object p0, p0, LE3/g;->d:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LE3/I3;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2}, LE3/I3;->F0(LE3/h3$g;Lq2/P$b;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {}, Lcom/google/common/util/concurrent/j;->e()Lcom/google/common/util/concurrent/p;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public static synthetic d(LE3/I3;LE3/h3$g;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LE3/I3;->t0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0, p1}, LE3/I3;->A0(LE3/h3$g;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private g(LE3/g$b;)V
    .locals 11

    .line 1
    iget-object v0, p0, LE3/g;->d:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LE3/I3;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    new-instance v6, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    invoke-direct {v6, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    const/4 v8, 0x0

    .line 25
    invoke-virtual {v6, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p1, LE3/g$b;->c:Ljava/util/Deque;

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Deque;->poll()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    move-object v3, v1

    .line 35
    check-cast v3, LE3/g$a;

    .line 36
    .line 37
    if-nez v3, :cond_1

    .line 38
    .line 39
    iput-boolean v8, p1, LE3/g$b;->g:Z

    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    new-instance v4, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 43
    .line 44
    invoke-direct {v4, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, LE3/I3;->X()Landroid/os/Handler;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    iget-object v1, p1, LE3/g$b;->a:Ljava/lang/Object;

    .line 52
    .line 53
    invoke-virtual {p0, v1}, LE3/g;->k(Ljava/lang/Object;)LE3/h3$g;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    new-instance v1, LE3/e;

    .line 58
    .line 59
    move-object v2, p0

    .line 60
    move-object v5, p1

    .line 61
    invoke-direct/range {v1 .. v6}, LE3/e;-><init>(LE3/g;LE3/g$a;Ljava/util/concurrent/atomic/AtomicBoolean;LE3/g$b;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v10, v1}, LE3/I3;->L(LE3/h3$g;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {v9, p1}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 72
    .line 73
    .line 74
    move-object p1, v5

    .line 75
    goto :goto_0

    .line 76
    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public e(Ljava/lang/Object;LE3/h3$g;LE3/U6;Lq2/P$b;)V
    .locals 4

    .line 1
    iget-object v0, p0, LE3/g;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0, p1}, LE3/g;->k(Ljava/lang/Object;)LE3/h3$g;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, LE3/g;->b:Lt/a;

    .line 11
    .line 12
    invoke-virtual {v1, p1, p2}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, LE3/g;->c:Lt/a;

    .line 16
    .line 17
    new-instance v2, LE3/g$b;

    .line 18
    .line 19
    new-instance v3, LE3/S6;

    .line 20
    .line 21
    invoke-direct {v3}, LE3/S6;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-direct {v2, p1, v3, p3, p4}, LE3/g$b;-><init>(Ljava/lang/Object;LE3/S6;LE3/U6;Lq2/P$b;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p2, v2}, Lt/i0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    iget-object p1, p0, LE3/g;->c:Lt/a;

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Lt/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, LE3/g$b;

    .line 40
    .line 41
    invoke-static {p1}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, LE3/g$b;

    .line 46
    .line 47
    iput-object p3, p1, LE3/g$b;->d:LE3/U6;

    .line 48
    .line 49
    iput-object p4, p1, LE3/g$b;->e:Lq2/P$b;

    .line 50
    .line 51
    :goto_0
    monitor-exit v0

    .line 52
    return-void

    .line 53
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    throw p1
.end method

.method public f(LE3/h3$g;ILE3/g$a;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/g;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LE3/g;->c:Lt/a;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Lt/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, LE3/g$b;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object v1, p1, LE3/g$b;->h:Lq2/P$b;

    .line 15
    .line 16
    invoke-virtual {v1}, Lq2/P$b;->b()Lq2/P$b$a;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1, p2}, Lq2/P$b$a;->a(I)Lq2/P$b$a;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p2}, Lq2/P$b$a;->f()Lq2/P$b;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    iput-object p2, p1, LE3/g$b;->h:Lq2/P$b;

    .line 29
    .line 30
    iget-object p1, p1, LE3/g$b;->c:Ljava/util/Deque;

    .line 31
    .line 32
    invoke-interface {p1, p3}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    :goto_0
    monitor-exit v0

    .line 39
    return-void

    .line 40
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    throw p1
.end method

.method public h(LE3/h3$g;)V
    .locals 5

    .line 1
    iget-object v0, p0, LE3/g;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LE3/g;->c:Lt/a;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Lt/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, LE3/g$b;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v2, v1, LE3/g$b;->h:Lq2/P$b;

    .line 19
    .line 20
    sget-object v3, Lq2/P$b;->b:Lq2/P$b;

    .line 21
    .line 22
    iput-object v3, v1, LE3/g$b;->h:Lq2/P$b;

    .line 23
    .line 24
    iget-object v3, v1, LE3/g$b;->c:Ljava/util/Deque;

    .line 25
    .line 26
    new-instance v4, LE3/c;

    .line 27
    .line 28
    invoke-direct {v4, p0, p1, v2}, LE3/c;-><init>(LE3/g;LE3/h3$g;Lq2/P$b;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v3, v4}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    iget-boolean p1, v1, LE3/g$b;->g:Z

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    monitor-exit v0

    .line 39
    return-void

    .line 40
    :cond_1
    const/4 p1, 0x1

    .line 41
    iput-boolean p1, v1, LE3/g$b;->g:Z

    .line 42
    .line 43
    invoke-direct {p0, v1}, LE3/g;->g(LE3/g$b;)V

    .line 44
    .line 45
    .line 46
    monitor-exit v0

    .line 47
    return-void

    .line 48
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    throw p1
.end method

.method public i(LE3/h3$g;)Lq2/P$b;
    .locals 2

    .line 1
    iget-object v0, p0, LE3/g;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LE3/g;->c:Lt/a;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Lt/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, LE3/g$b;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p1, LE3/g$b;->e:Lq2/P$b;

    .line 15
    .line 16
    monitor-exit v0

    .line 17
    return-object p1

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    monitor-exit v0

    .line 21
    const/4 p1, 0x0

    .line 22
    return-object p1

    .line 23
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw p1
.end method

.method public j()LP9/u;
    .locals 2

    .line 1
    iget-object v0, p0, LE3/g;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LE3/g;->b:Lt/a;

    .line 5
    .line 6
    invoke-virtual {v1}, Lt/a;->values()Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {v1}, LP9/u;->w(Ljava/util/Collection;)LP9/u;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    monitor-exit v0

    .line 15
    return-object v1

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw v1
.end method

.method public k(Ljava/lang/Object;)LE3/h3$g;
    .locals 2

    .line 1
    iget-object v0, p0, LE3/g;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LE3/g;->b:Lt/a;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Lt/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, LE3/h3$g;

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-object p1

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p1
.end method

.method public l(LE3/h3$g;)Lq2/N;
    .locals 2

    .line 1
    iget-object v0, p0, LE3/g;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LE3/g;->c:Lt/a;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Lt/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, LE3/g$b;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p1, LE3/g$b;->i:Lq2/N;

    .line 15
    .line 16
    monitor-exit v0

    .line 17
    return-object p1

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    monitor-exit v0

    .line 21
    const/4 p1, 0x0

    .line 22
    return-object p1

    .line 23
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw p1
.end method

.method public m(LE3/h3$g;)LE3/M6;
    .locals 2

    .line 1
    iget-object v0, p0, LE3/g;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LE3/g;->c:Lt/a;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Lt/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, LE3/g$b;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p1, LE3/g$b;->j:LE3/M6;

    .line 15
    .line 16
    monitor-exit v0

    .line 17
    return-object p1

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    monitor-exit v0

    .line 21
    const/4 p1, 0x0

    .line 22
    return-object p1

    .line 23
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw p1
.end method

.method public n(LE3/h3$g;)LE3/S6;
    .locals 2

    .line 1
    iget-object v0, p0, LE3/g;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LE3/g;->c:Lt/a;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Lt/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, LE3/g$b;

    .line 11
    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p1, LE3/g$b;->b:LE3/S6;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return-object p1

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    throw p1
.end method

.method public o(Ljava/lang/Object;)LE3/S6;
    .locals 3

    .line 1
    iget-object v0, p0, LE3/g;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0, p1}, LE3/g;->k(Ljava/lang/Object;)LE3/h3$g;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object v2, p0, LE3/g;->c:Lt/a;

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Lt/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, LE3/g$b;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    move-object p1, v1

    .line 23
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    iget-object p1, p1, LE3/g$b;->b:LE3/S6;

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_1
    return-object v1

    .line 30
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    throw p1
.end method

.method public p(LE3/h3$g;)Z
    .locals 2

    .line 1
    iget-object v0, p0, LE3/g;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LE3/g;->c:Lt/a;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Lt/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    monitor-exit v0

    .line 16
    return p1

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw p1
.end method

.method public q(LE3/h3$g;I)Z
    .locals 2

    .line 1
    iget-object v0, p0, LE3/g;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LE3/g;->c:Lt/a;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Lt/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, LE3/g$b;

    .line 11
    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    iget-object v0, p0, LE3/g;->d:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, LE3/I3;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    iget-object p1, p1, LE3/g$b;->e:Lq2/P$b;

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Lq2/P$b;->c(I)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0}, LE3/I3;->j0()LE3/N6;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, LE3/N6;->p0()Lq2/P$b;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1, p2}, Lq2/P$b;->c(I)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_0

    .line 46
    .line 47
    const/4 p1, 0x1

    .line 48
    return p1

    .line 49
    :cond_0
    const/4 p1, 0x0

    .line 50
    return p1

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    throw p1
.end method

.method public r(LE3/h3$g;I)Z
    .locals 2

    .line 1
    iget-object v0, p0, LE3/g;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LE3/g;->c:Lt/a;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Lt/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, LE3/g$b;

    .line 11
    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p1, LE3/g$b;->d:LE3/U6;

    .line 16
    .line 17
    invoke-virtual {p1, p2}, LE3/U6;->b(I)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    return p1

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    return p1

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    throw p1
.end method

.method public s(LE3/h3$g;LE3/T6;)Z
    .locals 2

    .line 1
    iget-object v0, p0, LE3/g;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LE3/g;->c:Lt/a;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Lt/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, LE3/g$b;

    .line 11
    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p1, LE3/g$b;->d:LE3/U6;

    .line 16
    .line 17
    invoke-virtual {p1, p2}, LE3/U6;->c(LE3/T6;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    return p1

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    return p1

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    throw p1
.end method

.method public t(LE3/h3$g;)V
    .locals 4

    .line 1
    iget-object v0, p0, LE3/g;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LE3/g;->c:Lt/a;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Lt/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, LE3/g$b;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-object v2, p0, LE3/g;->b:Lt/a;

    .line 19
    .line 20
    iget-object v3, v1, LE3/g$b;->a:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Lt/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    iget-object v0, v1, LE3/g$b;->b:LE3/S6;

    .line 27
    .line 28
    invoke-virtual {v0}, LE3/S6;->d()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, LE3/g;->d:Ljava/lang/ref/WeakReference;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, LE3/I3;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-virtual {v0}, LE3/I3;->t0()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {v0}, LE3/I3;->X()Landroid/os/Handler;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    new-instance v2, LE3/d;

    .line 53
    .line 54
    invoke-direct {v2, v0, p1}, LE3/d;-><init>(LE3/I3;LE3/h3$g;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v1, v2}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 58
    .line 59
    .line 60
    :cond_2
    :goto_0
    return-void

    .line 61
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    throw p1
.end method

.method public u(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LE3/g;->k(Ljava/lang/Object;)LE3/h3$g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, LE3/g;->t(LE3/h3$g;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public v(LE3/h3$g;Lq2/N;Lq2/P$b;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/g;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LE3/g;->c:Lt/a;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Lt/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, LE3/g$b;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iput-object p2, p1, LE3/g$b;->i:Lq2/N;

    .line 15
    .line 16
    iput-object p3, p1, LE3/g$b;->f:Lq2/P$b;

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    iput-object p2, p1, LE3/g$b;->j:LE3/M6;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    monitor-exit v0

    .line 25
    return-void

    .line 26
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    throw p1
.end method

.method public w(LE3/h3$g;LE3/M6;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/g;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LE3/g;->c:Lt/a;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Lt/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, LE3/g$b;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object v1, p1, LE3/g$b;->i:Lq2/N;

    .line 15
    .line 16
    invoke-static {v1}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    iput-object p2, p1, LE3/g$b;->j:LE3/M6;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    monitor-exit v0

    .line 25
    return-void

    .line 26
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    throw p1
.end method
