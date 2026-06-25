.class final Lcom/google/android/gms/internal/play_billing/n0;
.super Lcom/google/android/gms/internal/play_billing/l0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/play_billing/v0;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/play_billing/l0;-><init>(Lcom/google/android/gms/internal/play_billing/v0;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method final a(Lcom/google/android/gms/internal/play_billing/q0;Lcom/google/android/gms/internal/play_billing/i0;)Lcom/google/android/gms/internal/play_billing/i0;
    .locals 1

    .line 1
    monitor-enter p1

    .line 2
    :try_start_0
    iget-object v0, p1, Lcom/google/android/gms/internal/play_billing/q0;->b:Lcom/google/android/gms/internal/play_billing/i0;

    .line 3
    .line 4
    if-eq v0, p2, :cond_0

    .line 5
    .line 6
    iput-object p2, p1, Lcom/google/android/gms/internal/play_billing/q0;->b:Lcom/google/android/gms/internal/play_billing/i0;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catchall_0
    move-exception p2

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    :goto_0
    monitor-exit p1

    .line 12
    return-object v0

    .line 13
    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw p2
.end method

.method final b(Lcom/google/android/gms/internal/play_billing/q0;Lcom/google/android/gms/internal/play_billing/p0;)Lcom/google/android/gms/internal/play_billing/p0;
    .locals 1

    .line 1
    monitor-enter p1

    .line 2
    :try_start_0
    iget-object v0, p1, Lcom/google/android/gms/internal/play_billing/q0;->c:Lcom/google/android/gms/internal/play_billing/p0;

    .line 3
    .line 4
    if-eq v0, p2, :cond_0

    .line 5
    .line 6
    iput-object p2, p1, Lcom/google/android/gms/internal/play_billing/q0;->c:Lcom/google/android/gms/internal/play_billing/p0;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catchall_0
    move-exception p2

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    :goto_0
    monitor-exit p1

    .line 12
    return-object v0

    .line 13
    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw p2
.end method

.method final c(Lcom/google/android/gms/internal/play_billing/p0;Lcom/google/android/gms/internal/play_billing/p0;)V
    .locals 0

    .line 1
    iput-object p2, p1, Lcom/google/android/gms/internal/play_billing/p0;->b:Lcom/google/android/gms/internal/play_billing/p0;

    .line 2
    .line 3
    return-void
.end method

.method final d(Lcom/google/android/gms/internal/play_billing/p0;Ljava/lang/Thread;)V
    .locals 0

    .line 1
    iput-object p2, p1, Lcom/google/android/gms/internal/play_billing/p0;->a:Ljava/lang/Thread;

    .line 2
    .line 3
    return-void
.end method

.method final e(Lcom/google/android/gms/internal/play_billing/q0;Lcom/google/android/gms/internal/play_billing/i0;Lcom/google/android/gms/internal/play_billing/i0;)Z
    .locals 1

    .line 1
    monitor-enter p1

    .line 2
    :try_start_0
    iget-object v0, p1, Lcom/google/android/gms/internal/play_billing/q0;->b:Lcom/google/android/gms/internal/play_billing/i0;

    .line 3
    .line 4
    if-ne v0, p2, :cond_0

    .line 5
    .line 6
    iput-object p3, p1, Lcom/google/android/gms/internal/play_billing/q0;->b:Lcom/google/android/gms/internal/play_billing/i0;

    .line 7
    .line 8
    monitor-exit p1

    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :catchall_0
    move-exception p2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    monitor-exit p1

    .line 14
    const/4 p1, 0x0

    .line 15
    return p1

    .line 16
    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw p2
.end method

.method final f(Lcom/google/android/gms/internal/play_billing/q0;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    monitor-enter p1

    .line 2
    :try_start_0
    iget-object v0, p1, Lcom/google/android/gms/internal/play_billing/q0;->a:Ljava/lang/Object;

    .line 3
    .line 4
    if-ne v0, p2, :cond_0

    .line 5
    .line 6
    iput-object p3, p1, Lcom/google/android/gms/internal/play_billing/q0;->a:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-exit p1

    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :catchall_0
    move-exception p2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    monitor-exit p1

    .line 14
    const/4 p1, 0x0

    .line 15
    return p1

    .line 16
    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw p2
.end method

.method final g(Lcom/google/android/gms/internal/play_billing/q0;Lcom/google/android/gms/internal/play_billing/p0;Lcom/google/android/gms/internal/play_billing/p0;)Z
    .locals 1

    .line 1
    monitor-enter p1

    .line 2
    :try_start_0
    iget-object v0, p1, Lcom/google/android/gms/internal/play_billing/q0;->c:Lcom/google/android/gms/internal/play_billing/p0;

    .line 3
    .line 4
    if-ne v0, p2, :cond_0

    .line 5
    .line 6
    iput-object p3, p1, Lcom/google/android/gms/internal/play_billing/q0;->c:Lcom/google/android/gms/internal/play_billing/p0;

    .line 7
    .line 8
    monitor-exit p1

    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :catchall_0
    move-exception p2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    monitor-exit p1

    .line 14
    const/4 p1, 0x0

    .line 15
    return p1

    .line 16
    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw p2
.end method
