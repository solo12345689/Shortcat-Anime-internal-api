.class LF2/g$c;
.super Landroid/os/Handler;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF2/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field private a:Z

.field final synthetic b:LF2/g;


# direct methods
.method public constructor <init>(LF2/g;Landroid/os/Looper;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF2/g$c;->b:LF2/g;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private a(Landroid/os/Message;LF2/N;)Z
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, LF2/g$d;

    .line 10
    .line 11
    iget-boolean v4, v3, LF2/g$d;->b:Z

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    if-nez v4, :cond_0

    .line 15
    .line 16
    return v5

    .line 17
    :cond_0
    iget v4, v3, LF2/g$d;->e:I

    .line 18
    .line 19
    const/4 v6, 0x1

    .line 20
    add-int/2addr v4, v6

    .line 21
    iput v4, v3, LF2/g$d;->e:I

    .line 22
    .line 23
    iget-object v7, v1, LF2/g$c;->b:LF2/g;

    .line 24
    .line 25
    invoke-static {v7}, LF2/g;->p(LF2/g;)LQ2/k;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    const/4 v8, 0x3

    .line 30
    invoke-interface {v7, v8}, LQ2/k;->a(I)I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    if-le v4, v7, :cond_1

    .line 35
    .line 36
    return v5

    .line 37
    :cond_1
    new-instance v9, LM2/y;

    .line 38
    .line 39
    iget-wide v10, v3, LF2/g$d;->a:J

    .line 40
    .line 41
    iget-object v12, v2, LF2/N;->a:Lw2/o;

    .line 42
    .line 43
    iget-object v13, v2, LF2/N;->b:Landroid/net/Uri;

    .line 44
    .line 45
    iget-object v14, v2, LF2/N;->c:Ljava/util/Map;

    .line 46
    .line 47
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 48
    .line 49
    .line 50
    move-result-wide v15

    .line 51
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 52
    .line 53
    .line 54
    move-result-wide v17

    .line 55
    move v4, v5

    .line 56
    move v7, v6

    .line 57
    iget-wide v5, v3, LF2/g$d;->c:J

    .line 58
    .line 59
    sub-long v17, v17, v5

    .line 60
    .line 61
    iget-wide v5, v2, LF2/N;->d:J

    .line 62
    .line 63
    move-wide/from16 v19, v5

    .line 64
    .line 65
    invoke-direct/range {v9 .. v20}, LM2/y;-><init>(JLw2/o;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 66
    .line 67
    .line 68
    new-instance v5, LM2/B;

    .line 69
    .line 70
    invoke-direct {v5, v8}, LM2/B;-><init>(I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    instance-of v6, v6, Ljava/io/IOException;

    .line 78
    .line 79
    if-eqz v6, :cond_2

    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, Ljava/io/IOException;

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    new-instance v6, LF2/g$f;

    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-direct {v6, v2}, LF2/g$f;-><init>(Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    move-object v2, v6

    .line 98
    :goto_0
    iget-object v6, v1, LF2/g$c;->b:LF2/g;

    .line 99
    .line 100
    invoke-static {v6}, LF2/g;->p(LF2/g;)LQ2/k;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    new-instance v8, LQ2/k$c;

    .line 105
    .line 106
    iget v3, v3, LF2/g$d;->e:I

    .line 107
    .line 108
    invoke-direct {v8, v9, v5, v2, v3}, LQ2/k$c;-><init>(LM2/y;LM2/B;Ljava/io/IOException;I)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v6, v8}, LQ2/k;->c(LQ2/k$c;)J

    .line 112
    .line 113
    .line 114
    move-result-wide v2

    .line 115
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    cmp-long v5, v2, v5

    .line 121
    .line 122
    if-nez v5, :cond_3

    .line 123
    .line 124
    return v4

    .line 125
    :cond_3
    monitor-enter p0

    .line 126
    :try_start_0
    iget-boolean v5, v1, LF2/g$c;->a:Z

    .line 127
    .line 128
    if-nez v5, :cond_4

    .line 129
    .line 130
    invoke-static {v0}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 135
    .line 136
    .line 137
    monitor-exit p0

    .line 138
    return v7

    .line 139
    :catchall_0
    move-exception v0

    .line 140
    goto :goto_1

    .line 141
    :cond_4
    monitor-exit p0

    .line 142
    return v4

    .line 143
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 144
    throw v0
.end method


# virtual methods
.method b(ILjava/lang/Object;Z)V
    .locals 7

    .line 1
    new-instance v0, LF2/g$d;

    .line 2
    .line 3
    invoke-static {}, LM2/y;->a()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 8
    .line 9
    .line 10
    move-result-wide v4

    .line 11
    move-object v6, p2

    .line 12
    move v3, p3

    .line 13
    invoke-direct/range {v0 .. v6}, LF2/g$d;-><init>(JZJLjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public declared-synchronized c()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, LF2/g$c;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    monitor-exit p0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception v0

    .line 12
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    throw v0
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LF2/g$d;

    .line 4
    .line 5
    :try_start_0
    iget v1, p1, Landroid/os/Message;->what:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eq v1, v2, :cond_1

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, LF2/g$c;->b:LF2/g;

    .line 14
    .line 15
    invoke-static {v1}, LF2/g;->o(LF2/g;)LF2/M;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v2, p0, LF2/g$c;->b:LF2/g;

    .line 20
    .line 21
    invoke-static {v2}, LF2/g;->n(LF2/g;)Ljava/util/UUID;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget-object v3, v0, LF2/g$d;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v3, LF2/A$a;

    .line 28
    .line 29
    invoke-interface {v1, v2, v3}, LF2/M;->b(Ljava/util/UUID;LF2/A$a;)[B

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    goto :goto_2

    .line 34
    :catch_0
    move-exception v1

    .line 35
    goto :goto_0

    .line 36
    :catch_1
    move-exception v1

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    new-instance v1, Ljava/lang/RuntimeException;

    .line 39
    .line 40
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 41
    .line 42
    .line 43
    throw v1

    .line 44
    :cond_1
    iget-object v1, p0, LF2/g$c;->b:LF2/g;

    .line 45
    .line 46
    invoke-static {v1}, LF2/g;->o(LF2/g;)LF2/M;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v2, p0, LF2/g$c;->b:LF2/g;

    .line 51
    .line 52
    invoke-static {v2}, LF2/g;->n(LF2/g;)Ljava/util/UUID;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iget-object v3, v0, LF2/g$d;->d:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v3, LF2/A$d;

    .line 59
    .line 60
    invoke-interface {v1, v2, v3}, LF2/M;->a(Ljava/util/UUID;LF2/A$d;)[B

    .line 61
    .line 62
    .line 63
    move-result-object v1
    :try_end_0
    .catch LF2/N; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    goto :goto_2

    .line 65
    :goto_0
    const-string v2, "DefaultDrmSession"

    .line 66
    .line 67
    const-string v3, "Key/provisioning request produced an unexpected exception. Not retrying."

    .line 68
    .line 69
    invoke-static {v2, v3, v1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :goto_1
    invoke-direct {p0, p1, v1}, LF2/g$c;->a(Landroid/os/Message;LF2/N;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_2

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_2
    :goto_2
    iget-object v2, p0, LF2/g$c;->b:LF2/g;

    .line 81
    .line 82
    invoke-static {v2}, LF2/g;->p(LF2/g;)LQ2/k;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    iget-wide v3, v0, LF2/g$d;->a:J

    .line 87
    .line 88
    invoke-interface {v2, v3, v4}, LQ2/k;->d(J)V

    .line 89
    .line 90
    .line 91
    monitor-enter p0

    .line 92
    :try_start_1
    iget-boolean v2, p0, LF2/g$c;->a:Z

    .line 93
    .line 94
    if-nez v2, :cond_3

    .line 95
    .line 96
    iget-object v2, p0, LF2/g$c;->b:LF2/g;

    .line 97
    .line 98
    invoke-static {v2}, LF2/g;->q(LF2/g;)LF2/g$e;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    iget p1, p1, Landroid/os/Message;->what:I

    .line 103
    .line 104
    iget-object v0, v0, LF2/g$d;->d:Ljava/lang/Object;

    .line 105
    .line 106
    invoke-static {v0, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v2, p1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 115
    .line 116
    .line 117
    goto :goto_3

    .line 118
    :catchall_0
    move-exception p1

    .line 119
    goto :goto_5

    .line 120
    :cond_3
    :goto_3
    monitor-exit p0

    .line 121
    :goto_4
    return-void

    .line 122
    :goto_5
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 123
    throw p1
.end method
