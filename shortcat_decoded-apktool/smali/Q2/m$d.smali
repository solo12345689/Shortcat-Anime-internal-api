.class final LQ2/m$d;
.super Landroid/os/Handler;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ2/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "d"
.end annotation


# instance fields
.field public final a:I

.field private final b:LQ2/m$e;

.field private final c:J

.field private d:LQ2/m$b;

.field private e:Ljava/io/IOException;

.field private f:I

.field private g:Ljava/lang/Thread;

.field private h:Z

.field private volatile i:Z

.field final synthetic j:LQ2/m;


# direct methods
.method public constructor <init>(LQ2/m;Landroid/os/Looper;LQ2/m$e;LQ2/m$b;IJ)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ2/m$d;->j:LQ2/m;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    .line 5
    .line 6
    iput-object p3, p0, LQ2/m$d;->b:LQ2/m$e;

    .line 7
    .line 8
    iput-object p4, p0, LQ2/m$d;->d:LQ2/m$b;

    .line 9
    .line 10
    iput p5, p0, LQ2/m$d;->a:I

    .line 11
    .line 12
    iput-wide p6, p0, LQ2/m$d;->c:J

    .line 13
    .line 14
    return-void
.end method

.method private b()V
    .locals 7

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v2

    .line 5
    iget-wide v0, p0, LQ2/m$d;->c:J

    .line 6
    .line 7
    sub-long v4, v2, v0

    .line 8
    .line 9
    iget-object v0, p0, LQ2/m$d;->d:LQ2/m$b;

    .line 10
    .line 11
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, LQ2/m$b;

    .line 16
    .line 17
    iget-object v1, p0, LQ2/m$d;->b:LQ2/m$e;

    .line 18
    .line 19
    iget v6, p0, LQ2/m$d;->f:I

    .line 20
    .line 21
    invoke-interface/range {v0 .. v6}, LQ2/m$b;->v(LQ2/m$e;JJI)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, LQ2/m$d;->e:Ljava/io/IOException;

    .line 26
    .line 27
    iget-object v0, p0, LQ2/m$d;->j:LQ2/m;

    .line 28
    .line 29
    invoke-static {v0}, LQ2/m;->e(LQ2/m;)LR2/a;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v1, p0, LQ2/m$d;->j:LQ2/m;

    .line 34
    .line 35
    invoke-static {v1}, LQ2/m;->a(LQ2/m;)LQ2/m$d;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {v1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Ljava/lang/Runnable;

    .line 44
    .line 45
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method private c()V
    .locals 2

    .line 1
    iget-object v0, p0, LQ2/m$d;->j:LQ2/m;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, LQ2/m;->c(LQ2/m;LQ2/m$d;)LQ2/m$d;

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private d()J
    .locals 2

    .line 1
    iget v0, p0, LQ2/m$d;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    mul-int/lit16 v0, v0, 0x3e8

    .line 6
    .line 7
    const/16 v1, 0x1388

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    int-to-long v0, v0

    .line 14
    return-wide v0
.end method


# virtual methods
.method public a(Z)V
    .locals 8

    .line 1
    iput-boolean p1, p0, LQ2/m$d;->i:Z

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, LQ2/m$d;->e:Ljava/io/IOException;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {p0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    iput-boolean v1, p0, LQ2/m$d;->h:Z

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 16
    .line 17
    .line 18
    if-nez p1, :cond_2

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    invoke-virtual {p0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    monitor-enter p0

    .line 26
    :try_start_0
    iput-boolean v1, p0, LQ2/m$d;->h:Z

    .line 27
    .line 28
    iget-object v1, p0, LQ2/m$d;->b:LQ2/m$e;

    .line 29
    .line 30
    invoke-interface {v1}, LQ2/m$e;->c()V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, LQ2/m$d;->g:Ljava/lang/Thread;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    move-object p1, v0

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    :cond_2
    :goto_1
    if-eqz p1, :cond_3

    .line 46
    .line 47
    invoke-direct {p0}, LQ2/m$d;->c()V

    .line 48
    .line 49
    .line 50
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 51
    .line 52
    .line 53
    move-result-wide v3

    .line 54
    iget-object p1, p0, LQ2/m$d;->d:LQ2/m$b;

    .line 55
    .line 56
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    move-object v1, p1

    .line 61
    check-cast v1, LQ2/m$b;

    .line 62
    .line 63
    iget-object v2, p0, LQ2/m$d;->b:LQ2/m$e;

    .line 64
    .line 65
    iget-wide v5, p0, LQ2/m$d;->c:J

    .line 66
    .line 67
    sub-long v5, v3, v5

    .line 68
    .line 69
    const/4 v7, 0x1

    .line 70
    invoke-interface/range {v1 .. v7}, LQ2/m$b;->h(LQ2/m$e;JJZ)V

    .line 71
    .line 72
    .line 73
    iput-object v0, p0, LQ2/m$d;->d:LQ2/m$b;

    .line 74
    .line 75
    :cond_3
    return-void

    .line 76
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    throw p1
.end method

.method public e(I)V
    .locals 2

    .line 1
    iget-object v0, p0, LQ2/m$d;->e:Ljava/io/IOException;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget v1, p0, LQ2/m$d;->f:I

    .line 6
    .line 7
    if-gt v1, p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    throw v0

    .line 11
    :cond_1
    :goto_0
    return-void
.end method

.method public f(J)V
    .locals 4

    .line 1
    iget-object v0, p0, LQ2/m$d;->j:LQ2/m;

    .line 2
    .line 3
    invoke-static {v0}, LQ2/m;->a(LQ2/m;)LQ2/m$d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    move v0, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LQ2/m$d;->j:LQ2/m;

    .line 17
    .line 18
    invoke-static {v0, p0}, LQ2/m;->c(LQ2/m;LQ2/m$d;)LQ2/m$d;

    .line 19
    .line 20
    .line 21
    const-wide/16 v2, 0x0

    .line 22
    .line 23
    cmp-long v0, p1, v2

    .line 24
    .line 25
    if-lez v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, v1, p1, p2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-direct {p0}, LQ2/m$d;->b()V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 12

    .line 1
    iget-boolean v0, p0, LQ2/m$d;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_1

    .line 6
    .line 7
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    invoke-direct {p0}, LQ2/m$d;->b()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    const/4 v2, 0x4

    .line 17
    if-eq v0, v2, :cond_9

    .line 18
    .line 19
    invoke-direct {p0}, LQ2/m$d;->c()V

    .line 20
    .line 21
    .line 22
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 23
    .line 24
    .line 25
    move-result-wide v5

    .line 26
    iget-wide v2, p0, LQ2/m$d;->c:J

    .line 27
    .line 28
    sub-long v7, v5, v2

    .line 29
    .line 30
    iget-object v0, p0, LQ2/m$d;->d:LQ2/m$b;

    .line 31
    .line 32
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    move-object v3, v0

    .line 37
    check-cast v3, LQ2/m$b;

    .line 38
    .line 39
    iget-boolean v0, p0, LQ2/m$d;->h:Z

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    iget-object v4, p0, LQ2/m$d;->b:LQ2/m$e;

    .line 44
    .line 45
    const/4 v9, 0x0

    .line 46
    invoke-interface/range {v3 .. v9}, LQ2/m$b;->h(LQ2/m$e;JJZ)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    .line 51
    .line 52
    const/4 v2, 0x2

    .line 53
    if-eq v0, v2, :cond_8

    .line 54
    .line 55
    const/4 v11, 0x3

    .line 56
    if-eq v0, v11, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 60
    .line 61
    move-object v9, p1

    .line 62
    check-cast v9, Ljava/io/IOException;

    .line 63
    .line 64
    iput-object v9, p0, LQ2/m$d;->e:Ljava/io/IOException;

    .line 65
    .line 66
    iget p1, p0, LQ2/m$d;->f:I

    .line 67
    .line 68
    add-int/lit8 v10, p1, 0x1

    .line 69
    .line 70
    iput v10, p0, LQ2/m$d;->f:I

    .line 71
    .line 72
    iget-object v4, p0, LQ2/m$d;->b:LQ2/m$e;

    .line 73
    .line 74
    invoke-interface/range {v3 .. v10}, LQ2/m$b;->n(LQ2/m$e;JJLjava/io/IOException;I)LQ2/m$c;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {p1}, LQ2/m$c;->a(LQ2/m$c;)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-ne v0, v11, :cond_4

    .line 83
    .line 84
    iget-object p1, p0, LQ2/m$d;->j:LQ2/m;

    .line 85
    .line 86
    iget-object v0, p0, LQ2/m$d;->e:Ljava/io/IOException;

    .line 87
    .line 88
    invoke-static {p1, v0}, LQ2/m;->d(LQ2/m;Ljava/io/IOException;)Ljava/io/IOException;

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_4
    invoke-static {p1}, LQ2/m$c;->a(LQ2/m$c;)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eq v0, v2, :cond_7

    .line 97
    .line 98
    invoke-static {p1}, LQ2/m$c;->a(LQ2/m$c;)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-ne v0, v1, :cond_5

    .line 103
    .line 104
    iput v1, p0, LQ2/m$d;->f:I

    .line 105
    .line 106
    :cond_5
    invoke-static {p1}, LQ2/m$c;->b(LQ2/m$c;)J

    .line 107
    .line 108
    .line 109
    move-result-wide v0

    .line 110
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    cmp-long v0, v0, v2

    .line 116
    .line 117
    if-eqz v0, :cond_6

    .line 118
    .line 119
    invoke-static {p1}, LQ2/m$c;->b(LQ2/m$c;)J

    .line 120
    .line 121
    .line 122
    move-result-wide v0

    .line 123
    goto :goto_0

    .line 124
    :cond_6
    invoke-direct {p0}, LQ2/m$d;->d()J

    .line 125
    .line 126
    .line 127
    move-result-wide v0

    .line 128
    :goto_0
    invoke-virtual {p0, v0, v1}, LQ2/m$d;->f(J)V

    .line 129
    .line 130
    .line 131
    :cond_7
    :goto_1
    return-void

    .line 132
    :cond_8
    :try_start_0
    iget-object v4, p0, LQ2/m$d;->b:LQ2/m$e;

    .line 133
    .line 134
    invoke-interface/range {v3 .. v8}, LQ2/m$b;->j(LQ2/m$e;JJ)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :catch_0
    move-exception v0

    .line 139
    move-object p1, v0

    .line 140
    const-string v0, "LoadTask"

    .line 141
    .line 142
    const-string v1, "Unexpected exception handling load completed"

    .line 143
    .line 144
    invoke-static {v0, v1, p1}, Lt2/w;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    iget-object v0, p0, LQ2/m$d;->j:LQ2/m;

    .line 148
    .line 149
    new-instance v1, LQ2/m$h;

    .line 150
    .line 151
    invoke-direct {v1, p1}, LQ2/m$h;-><init>(Ljava/lang/Throwable;)V

    .line 152
    .line 153
    .line 154
    invoke-static {v0, v1}, LQ2/m;->d(LQ2/m;Ljava/io/IOException;)Ljava/io/IOException;

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :cond_9
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p1, Ljava/lang/Error;

    .line 161
    .line 162
    throw p1
.end method

.method public run()V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    :try_start_1
    iget-boolean v1, p0, LQ2/m$d;->h:Z

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iput-object v2, p0, LQ2/m$d;->g:Ljava/lang/Thread;

    .line 10
    .line 11
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v2, "load:"

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, LQ2/m$d;->b:LQ2/m$e;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v1}, Lt2/P;->a(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0

    .line 42
    .line 43
    .line 44
    :try_start_3
    iget-object v1, p0, LQ2/m$d;->b:LQ2/m$e;

    .line 45
    .line 46
    invoke-interface {v1}, LQ2/m$e;->a()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 47
    .line 48
    .line 49
    :try_start_4
    invoke-static {}, Lt2/P;->b()V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catch_0
    move-exception v0

    .line 54
    goto :goto_1

    .line 55
    :catch_1
    move-exception v1

    .line 56
    goto :goto_2

    .line 57
    :catch_2
    move-exception v1

    .line 58
    goto :goto_3

    .line 59
    :catch_3
    move-exception v1

    .line 60
    goto :goto_4

    .line 61
    :catchall_0
    move-exception v1

    .line 62
    invoke-static {}, Lt2/P;->b()V

    .line 63
    .line 64
    .line 65
    throw v1

    .line 66
    :cond_0
    :goto_0
    monitor-enter p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_0

    .line 67
    const/4 v1, 0x0

    .line 68
    :try_start_5
    iput-object v1, p0, LQ2/m$d;->g:Ljava/lang/Thread;

    .line 69
    .line 70
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 71
    .line 72
    .line 73
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 74
    :try_start_6
    iget-boolean v1, p0, LQ2/m$d;->i:Z

    .line 75
    .line 76
    if-nez v1, :cond_2

    .line 77
    .line 78
    const/4 v1, 0x2

    .line 79
    invoke-virtual {p0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Error; {:try_start_6 .. :try_end_6} :catch_0

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :catchall_1
    move-exception v1

    .line 84
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 85
    :try_start_8
    throw v1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/Error; {:try_start_8 .. :try_end_8} :catch_0

    .line 86
    :catchall_2
    move-exception v1

    .line 87
    :try_start_9
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 88
    :try_start_a
    throw v1
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_3
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_a .. :try_end_a} :catch_1
    .catch Ljava/lang/Error; {:try_start_a .. :try_end_a} :catch_0

    .line 89
    :goto_1
    iget-boolean v1, p0, LQ2/m$d;->i:Z

    .line 90
    .line 91
    if-nez v1, :cond_1

    .line 92
    .line 93
    const-string v1, "LoadTask"

    .line 94
    .line 95
    const-string v2, "Unexpected error loading stream"

    .line 96
    .line 97
    invoke-static {v1, v2, v0}, Lt2/w;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    const/4 v1, 0x4

    .line 101
    invoke-virtual {p0, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    .line 106
    .line 107
    .line 108
    :cond_1
    throw v0

    .line 109
    :goto_2
    iget-boolean v2, p0, LQ2/m$d;->i:Z

    .line 110
    .line 111
    if-nez v2, :cond_2

    .line 112
    .line 113
    const-string v2, "LoadTask"

    .line 114
    .line 115
    const-string v3, "OutOfMemory error loading stream"

    .line 116
    .line 117
    invoke-static {v2, v3, v1}, Lt2/w;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 118
    .line 119
    .line 120
    new-instance v2, LQ2/m$h;

    .line 121
    .line 122
    invoke-direct {v2, v1}, LQ2/m$h;-><init>(Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, v0, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 130
    .line 131
    .line 132
    goto :goto_5

    .line 133
    :goto_3
    iget-boolean v2, p0, LQ2/m$d;->i:Z

    .line 134
    .line 135
    if-nez v2, :cond_2

    .line 136
    .line 137
    const-string v2, "LoadTask"

    .line 138
    .line 139
    const-string v3, "Unexpected exception loading stream"

    .line 140
    .line 141
    invoke-static {v2, v3, v1}, Lt2/w;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 142
    .line 143
    .line 144
    new-instance v2, LQ2/m$h;

    .line 145
    .line 146
    invoke-direct {v2, v1}, LQ2/m$h;-><init>(Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, v0, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 154
    .line 155
    .line 156
    goto :goto_5

    .line 157
    :goto_4
    iget-boolean v2, p0, LQ2/m$d;->i:Z

    .line 158
    .line 159
    if-nez v2, :cond_2

    .line 160
    .line 161
    invoke-virtual {p0, v0, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 166
    .line 167
    .line 168
    :cond_2
    :goto_5
    return-void
.end method
