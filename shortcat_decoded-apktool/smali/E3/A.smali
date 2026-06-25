.class public LE3/A;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lq2/P;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE3/A$c;,
        LE3/A$b;,
        LE3/A$d;,
        LE3/A$a;
    }
.end annotation


# instance fields
.field private final a:Lq2/Y$d;

.field private b:Z

.field private final c:LE3/A$d;

.field final d:LE3/A$c;

.field final e:Landroid/os/Handler;

.field private f:J

.field private g:Z

.field private final h:I

.field final i:LE3/A$b;


# direct methods
.method constructor <init>(Landroid/content/Context;LE3/Y6;Landroid/os/Bundle;LE3/A$c;Landroid/os/Looper;LE3/A$b;Lt2/h;IJ)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "context must not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    const-string v0, "token must not be null"

    .line 10
    .line 11
    invoke-static {p2, v0}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v1, "Init "

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, " ["

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, "AndroidXMedia3/1.8.0"

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v1, "] ["

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    sget-object v1, Lt2/a0;->e:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, "]"

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const-string v1, "MediaController"

    .line 65
    .line 66
    invoke-static {v1, v0}, Lt2/w;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    new-instance v0, Lq2/Y$d;

    .line 70
    .line 71
    invoke-direct {v0}, Lq2/Y$d;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, LE3/A;->a:Lq2/Y$d;

    .line 75
    .line 76
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    iput-wide v0, p0, LE3/A;->f:J

    .line 82
    .line 83
    iput-object p4, p0, LE3/A;->d:LE3/A$c;

    .line 84
    .line 85
    new-instance p4, Landroid/os/Handler;

    .line 86
    .line 87
    invoke-direct {p4, p5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 88
    .line 89
    .line 90
    iput-object p4, p0, LE3/A;->e:Landroid/os/Handler;

    .line 91
    .line 92
    iput-object p6, p0, LE3/A;->i:LE3/A$b;

    .line 93
    .line 94
    move/from16 p4, p8

    .line 95
    .line 96
    iput p4, p0, LE3/A;->h:I

    .line 97
    .line 98
    move-object v0, p0

    .line 99
    move-object v1, p1

    .line 100
    move-object v2, p2

    .line 101
    move-object v3, p3

    .line 102
    move-object v4, p5

    .line 103
    move-object v5, p7

    .line 104
    move-wide/from16 v6, p9

    .line 105
    .line 106
    invoke-virtual/range {v0 .. v7}, LE3/A;->b1(Landroid/content/Context;LE3/Y6;Landroid/os/Bundle;Landroid/os/Looper;Lt2/h;J)LE3/A$d;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iput-object p1, p0, LE3/A;->c:LE3/A$d;

    .line 111
    .line 112
    invoke-interface {p1}, LE3/A$d;->S()V

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public static synthetic Z0(LE3/A;LE3/A$c;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, p0}, LE3/A$c;->o0(LE3/A;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private static a1()Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    new-instance v0, LE3/X6;

    .line 2
    .line 3
    const/16 v1, -0x64

    .line 4
    .line 5
    invoke-direct {v0, v1}, LE3/X6;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/google/common/util/concurrent/j;->d(Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public static j1(Ljava/util/concurrent/Future;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    :try_start_0
    invoke-static {p0}, Lcom/google/common/util/concurrent/j;->b(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, LE3/A;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    invoke-virtual {p0}, LE3/A;->a()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catch_0
    move-exception p0

    .line 20
    const-string v0, "MediaController"

    .line 21
    .line 22
    const-string v1, "MediaController future failed (so we couldn\'t release it)"

    .line 23
    .line 24
    invoke-static {v0, v1, p0}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private m1()V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, LE3/A;->m()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    const-string v1, "MediaController method is called from a wrong thread. See javadoc of MediaController for details."

    .line 15
    .line 16
    invoke-static {v0, v1}, Lt2/a;->h(ZLjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final A0()Z
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->A0()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    return v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method public final B(Landroid/view/Surface;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string p1, "MediaController"

    .line 11
    .line 12
    const-string v0, "The controller is not connected. Ignoring setVideoSurface()."

    .line 13
    .line 14
    invoke-static {p1, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0, p1}, LE3/A$d;->B(Landroid/view/Surface;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final B0()I
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->B0()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, -0x1

    .line 18
    return v0
.end method

.method public final C(Lq2/I;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    const-string v0, "playlistMetadata must not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const-string p1, "MediaController"

    .line 16
    .line 17
    const-string v0, "The controller is not connected. Ignoring setPlaylistMetadata()."

    .line 18
    .line 19
    invoke-static {p1, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 24
    .line 25
    invoke-interface {v0, p1}, LE3/A$d;->C(Lq2/I;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final C0(ILq2/C;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string p1, "MediaController"

    .line 11
    .line 12
    const-string p2, "The controller is not connected. Ignoring replaceMediaItem()."

    .line 13
    .line 14
    invoke-static {p1, p2}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0, p1, p2}, LE3/A$d;->C0(ILq2/C;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final D()Z
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->D()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    return v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method public final D0(Ljava/util/List;IJ)V
    .locals 5

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    const-string v0, "mediaItems must not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    move v1, v0

    .line 11
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v1, v2, :cond_1

    .line 16
    .line 17
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    move v2, v0

    .line 26
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v4, "items must not contain null, index="

    .line 32
    .line 33
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-static {v2, v3}, Lt2/a;->b(ZLjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_2

    .line 54
    .line 55
    const-string p1, "MediaController"

    .line 56
    .line 57
    const-string p2, "The controller is not connected. Ignoring setMediaItems()."

    .line 58
    .line 59
    invoke-static {p1, p2}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_2
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 64
    .line 65
    invoke-interface {v0, p1, p2, p3, p4}, LE3/A$d;->D0(Ljava/util/List;IJ)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final E()J
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->E()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_0
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    return-wide v0
.end method

.method public final E0(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string p1, "MediaController"

    .line 11
    .line 12
    const-string v0, "The controller is not connected. Ignoring seekTo()."

    .line 13
    .line 14
    invoke-static {p1, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0, p1}, LE3/A$d;->E0(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final F(ZI)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string p1, "MediaController"

    .line 11
    .line 12
    const-string p2, "The controller is not connected. Ignoring setDeviceMuted()."

    .line 13
    .line 14
    invoke-static {p1, p2}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0, p1, p2}, LE3/A$d;->F(ZI)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final F0()J
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->F0()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_0
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    return-wide v0
.end method

.method public final G()V
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "MediaController"

    .line 11
    .line 12
    const-string v1, "The controller is not connected. Ignoring clearMediaItems()."

    .line 13
    .line 14
    invoke-static {v0, v1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0}, LE3/A$d;->G()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final G0()J
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->G0()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_0
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    return-wide v0
.end method

.method public final H(Lq2/P$d;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    const-string v0, "listener must not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 10
    .line 11
    invoke-interface {v0, p1}, LE3/A$d;->H(Lq2/P$d;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final H0(ILjava/util/List;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string p1, "MediaController"

    .line 11
    .line 12
    const-string p2, "The controller is not connected. Ignoring addMediaItems()."

    .line 13
    .line 14
    invoke-static {p1, p2}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0, p1, p2}, LE3/A$d;->H0(ILjava/util/List;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final I()I
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->I()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public final I0()J
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->I0()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_0
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    return-wide v0
.end method

.method public final J()V
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "MediaController"

    .line 11
    .line 12
    const-string v1, "The controller is not connected. Ignoring seekToPreviousMediaItem()."

    .line 13
    .line 14
    invoke-static {v0, v1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0}, LE3/A$d;->J()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final J0()Lq2/I;
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->J0()Lq2/I;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0

    .line 17
    :cond_0
    sget-object v0, Lq2/I;->K:Lq2/I;

    .line 18
    .line 19
    return-object v0
.end method

.method public final K()V
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "MediaController"

    .line 11
    .line 12
    const-string v1, "The controller is not connected. Ignoring seekTo()."

    .line 13
    .line 14
    invoke-static {v0, v1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0}, LE3/A$d;->K()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final K0()I
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->K0()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, -0x1

    .line 18
    return v0
.end method

.method public final L(Ljava/util/List;Z)V
    .locals 5

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    const-string v0, "mediaItems must not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    move v1, v0

    .line 11
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v1, v2, :cond_1

    .line 16
    .line 17
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    move v2, v0

    .line 26
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v4, "items must not contain null, index="

    .line 32
    .line 33
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-static {v2, v3}, Lt2/a;->b(ZLjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_2

    .line 54
    .line 55
    const-string p1, "MediaController"

    .line 56
    .line 57
    const-string p2, "The controller is not connected. Ignoring setMediaItems()."

    .line 58
    .line 59
    invoke-static {p1, p2}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_2
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 64
    .line 65
    invoke-interface {v0, p1, p2}, LE3/A$d;->L(Ljava/util/List;Z)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final L0(Landroid/view/SurfaceView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string p1, "MediaController"

    .line 11
    .line 12
    const-string v0, "The controller is not connected. Ignoring clearVideoSurfaceView()."

    .line 13
    .line 14
    invoke-static {p1, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0, p1}, LE3/A$d;->L0(Landroid/view/SurfaceView;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final M()V
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "MediaController"

    .line 11
    .line 12
    const-string v1, "The controller is not connected. Ignoring decreaseDeviceVolume()."

    .line 13
    .line 14
    invoke-static {v0, v1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0}, LE3/A$d;->M()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final M0(II)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string p1, "MediaController"

    .line 11
    .line 12
    const-string p2, "The controller is not connected. Ignoring moveMediaItem()."

    .line 13
    .line 14
    invoke-static {p1, p2}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0, p1, p2}, LE3/A$d;->M0(II)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final N(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string p1, "MediaController"

    .line 11
    .line 12
    const-string v0, "The controller is not connected. Ignoring increaseDeviceVolume()."

    .line 13
    .line 14
    invoke-static {p1, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0, p1}, LE3/A$d;->N(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final N0(III)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string p1, "MediaController"

    .line 11
    .line 12
    const-string p2, "The controller is not connected. Ignoring moveMediaItems()."

    .line 13
    .line 14
    invoke-static {p1, p2}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0, p1, p2, p3}, LE3/A$d;->N0(III)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final O(Landroid/view/SurfaceView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string p1, "MediaController"

    .line 11
    .line 12
    const-string v0, "The controller is not connected. Ignoring setVideoSurfaceView()."

    .line 13
    .line 14
    invoke-static {p1, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0, p1}, LE3/A$d;->O(Landroid/view/SurfaceView;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final O0(Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string p1, "MediaController"

    .line 11
    .line 12
    const-string v0, "The controller is not connected. Ignoring addMediaItems()."

    .line 13
    .line 14
    invoke-static {p1, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0, p1}, LE3/A$d;->O0(Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final P(Lq2/d0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "MediaController"

    .line 11
    .line 12
    const-string v1, "The controller is not connected. Ignoring setTrackSelectionParameters()."

    .line 13
    .line 14
    invoke-static {v0, v1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 18
    .line 19
    invoke-interface {v0, p1}, LE3/A$d;->P(Lq2/d0;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final P0()Z
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 13
    .line 14
    invoke-interface {v0}, LE3/A$d;->P0()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public final Q(IILjava/util/List;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string p1, "MediaController"

    .line 11
    .line 12
    const-string p2, "The controller is not connected. Ignoring replaceMediaItems()."

    .line 13
    .line 14
    invoke-static {p1, p2}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0, p1, p2, p3}, LE3/A$d;->Q(IILjava/util/List;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final Q0()Z
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->Q0()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    return v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method public final R(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string p1, "MediaController"

    .line 11
    .line 12
    const-string v0, "The controller is not connected. Ignoring removeMediaItem()."

    .line 13
    .line 14
    invoke-static {p1, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0, p1}, LE3/A$d;->R(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final R0()J
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->R0()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_0
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    return-wide v0
.end method

.method public final S0(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string p1, "MediaController"

    .line 11
    .line 12
    const-string v0, "The controller is not connected. Ignoring setDeviceVolume()."

    .line 13
    .line 14
    invoke-static {p1, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0, p1}, LE3/A$d;->S0(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final T(II)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string p1, "MediaController"

    .line 11
    .line 12
    const-string p2, "The controller is not connected. Ignoring removeMediaItems()."

    .line 13
    .line 14
    invoke-static {p1, p2}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0, p1, p2}, LE3/A$d;->T(II)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final T0()V
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "MediaController"

    .line 11
    .line 12
    const-string v1, "The controller is not connected. Ignoring seekForward()."

    .line 13
    .line 14
    invoke-static {v0, v1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0}, LE3/A$d;->T0()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final U()V
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "MediaController"

    .line 11
    .line 12
    const-string v1, "The controller is not connected. Ignoring seekToPrevious()."

    .line 13
    .line 14
    invoke-static {v0, v1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0}, LE3/A$d;->U()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final U0()V
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "MediaController"

    .line 11
    .line 12
    const-string v1, "The controller is not connected. Ignoring seekBack()."

    .line 13
    .line 14
    invoke-static {v0, v1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0}, LE3/A$d;->U0()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final V(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0, p1}, LE3/A$d;->V(Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final V0()Lq2/I;
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->V0()Lq2/I;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0

    .line 17
    :cond_0
    sget-object v0, Lq2/I;->K:Lq2/I;

    .line 18
    .line 19
    return-object v0
.end method

.method public final W()V
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "MediaController"

    .line 11
    .line 12
    const-string v1, "The controller is not connected. Ignoring seekToNextMediaItem()."

    .line 13
    .line 14
    invoke-static {v0, v1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0}, LE3/A$d;->W()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final W0(Lq2/c;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string p1, "MediaController"

    .line 11
    .line 12
    const-string p2, "The controller is not connected. Ignoring setAudioAttributes()."

    .line 13
    .line 14
    invoke-static {p1, p2}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0, p1, p2}, LE3/A$d;->W0(Lq2/c;Z)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final X(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string p1, "MediaController"

    .line 11
    .line 12
    const-string v0, "The controller is not connected. Ignoring decreaseDeviceVolume()."

    .line 13
    .line 14
    invoke-static {p1, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0, p1}, LE3/A$d;->X(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final X0()J
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->X0()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_0
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    return-wide v0
.end method

.method public final Y()Lq2/h0;
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->Y()Lq2/h0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0

    .line 17
    :cond_0
    sget-object v0, Lq2/h0;->b:Lq2/h0;

    .line 18
    .line 19
    return-object v0
.end method

.method public final Y0()Z
    .locals 3

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->h0()Lq2/Y;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lq2/Y;->u()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, LE3/A;->K0()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v2, p0, LE3/A;->a:Lq2/Y$d;

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lq2/Y$d;->g()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    return v0

    .line 32
    :cond_0
    const/4 v0, 0x0

    .line 33
    return v0
.end method

.method public final Z()Z
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->Z()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    return v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method public final a()V
    .locals 4

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, LE3/A;->b:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v1, "Release "

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, " ["

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, "AndroidXMedia3/1.8.0"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, "] ["

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    sget-object v2, Lt2/a0;->e:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-static {}, Lq2/H;->b()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v1, "]"

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const-string v1, "MediaController"

    .line 70
    .line 71
    invoke-static {v1, v0}, Lt2/w;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const/4 v0, 0x1

    .line 75
    iput-boolean v0, p0, LE3/A;->b:Z

    .line 76
    .line 77
    iget-object v2, p0, LE3/A;->e:Landroid/os/Handler;

    .line 78
    .line 79
    const/4 v3, 0x0

    .line 80
    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    :try_start_0
    iget-object v2, p0, LE3/A;->c:LE3/A$d;

    .line 84
    .line 85
    invoke-interface {v2}, LE3/A$d;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :catch_0
    move-exception v2

    .line 90
    const-string v3, "Exception while releasing impl"

    .line 91
    .line 92
    invoke-static {v1, v3, v2}, Lt2/w;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    :goto_0
    iget-boolean v1, p0, LE3/A;->g:Z

    .line 96
    .line 97
    if-eqz v1, :cond_1

    .line 98
    .line 99
    new-instance v0, LE3/y;

    .line 100
    .line 101
    invoke-direct {v0, p0}, LE3/y;-><init>(LE3/A;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, v0}, LE3/A;->i1(Lt2/n;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_1
    iput-boolean v0, p0, LE3/A;->g:Z

    .line 109
    .line 110
    iget-object v0, p0, LE3/A;->i:LE3/A$b;

    .line 111
    .line 112
    invoke-interface {v0}, LE3/A$b;->a()V

    .line 113
    .line 114
    .line 115
    :goto_1
    return-void
.end method

.method public final a0(Lq2/P$d;)V
    .locals 1

    .line 1
    const-string v0, "listener must not be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 7
    .line 8
    invoke-interface {v0, p1}, LE3/A$d;->a0(Lq2/P$d;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final b()Lq2/C;
    .locals 3

    .line 1
    invoke-virtual {p0}, LE3/A;->h0()Lq2/Y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lq2/Y;->u()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0

    .line 13
    :cond_0
    invoke-virtual {p0}, LE3/A;->K0()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget-object v2, p0, LE3/A;->a:Lq2/Y$d;

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v0, v0, Lq2/Y$d;->c:Lq2/C;

    .line 24
    .line 25
    return-object v0
.end method

.method public final b0()Ls2/e;
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->b0()Ls2/e;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0

    .line 17
    :cond_0
    sget-object v0, Ls2/e;->d:Ls2/e;

    .line 18
    .line 19
    return-object v0
.end method

.method b1(Landroid/content/Context;LE3/Y6;Landroid/os/Bundle;Landroid/os/Looper;Lt2/h;J)LE3/A$d;
    .locals 14

    .line 1
    invoke-virtual/range {p2 .. p2}, LE3/Y6;->j()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v1, LE3/B2;

    .line 8
    .line 9
    invoke-static/range {p5 .. p5}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    move-object v7, v0

    .line 14
    check-cast v7, Lt2/h;

    .line 15
    .line 16
    move-object v3, p0

    .line 17
    move-object v2, p1

    .line 18
    move-object/from16 v4, p2

    .line 19
    .line 20
    move-object/from16 v5, p3

    .line 21
    .line 22
    move-object/from16 v6, p4

    .line 23
    .line 24
    move-wide/from16 v8, p6

    .line 25
    .line 26
    invoke-direct/range {v1 .. v9}, LE3/B2;-><init>(Landroid/content/Context;LE3/A;LE3/Y6;Landroid/os/Bundle;Landroid/os/Looper;Lt2/h;J)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_0
    new-instance v8, LE3/S1;

    .line 31
    .line 32
    move-object v10, p0

    .line 33
    move-object v9, p1

    .line 34
    move-object/from16 v11, p2

    .line 35
    .line 36
    move-object/from16 v12, p3

    .line 37
    .line 38
    move-object/from16 v13, p4

    .line 39
    .line 40
    invoke-direct/range {v8 .. v13}, LE3/S1;-><init>(Landroid/content/Context;LE3/A;LE3/Y6;Landroid/os/Bundle;Landroid/os/Looper;)V

    .line 41
    .line 42
    .line 43
    return-object v8
.end method

.method public final c()Lq2/O;
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->c()Lq2/O;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0

    .line 17
    :cond_0
    sget-object v0, Lq2/O;->d:Lq2/O;

    .line 18
    .line 19
    return-object v0
.end method

.method public final c0()I
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->c0()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, -0x1

    .line 18
    return v0
.end method

.method public final c1()LE3/U6;
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object v0, LE3/U6;->b:LE3/U6;

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 14
    .line 15
    invoke-interface {v0}, LE3/A$d;->Y0()LE3/U6;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public final d0(Lq2/C;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    const-string v0, "mediaItems must not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const-string p1, "MediaController"

    .line 16
    .line 17
    const-string p2, "The controller is not connected. Ignoring setMediaItems()."

    .line 18
    .line 19
    invoke-static {p1, p2}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 24
    .line 25
    invoke-interface {v0, p1, p2}, LE3/A$d;->d0(Lq2/C;Z)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method d1()Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 2
    .line 3
    invoke-interface {v0}, LE3/A$d;->a1()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final e(Lq2/O;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    const-string v0, "playbackParameters must not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const-string p1, "MediaController"

    .line 16
    .line 17
    const-string v0, "The controller is not connected. Ignoring setPlaybackParameters()."

    .line 18
    .line 19
    invoke-static {p1, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 24
    .line 25
    invoke-interface {v0, p1}, LE3/A$d;->e(Lq2/O;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final e0(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string p1, "MediaController"

    .line 11
    .line 12
    const-string v0, "The controller is not connected. Ignoring setDeviceMuted()."

    .line 13
    .line 14
    invoke-static {p1, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0, p1}, LE3/A$d;->e0(Z)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method e1()I
    .locals 1

    .line 1
    iget v0, p0, LE3/A;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public final f0(Lq2/C;J)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    const-string v0, "mediaItems must not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const-string p1, "MediaController"

    .line 16
    .line 17
    const-string p2, "The controller is not connected. Ignoring setMediaItem()."

    .line 18
    .line 19
    invoke-static {p1, p2}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 24
    .line 25
    invoke-interface {v0, p1, p2, p3}, LE3/A$d;->f0(Lq2/C;J)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method final f1()J
    .locals 2

    .line 1
    iget-wide v0, p0, LE3/A;->f:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final g()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final g0()I
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->g0()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public final g1()Z
    .locals 1

    .line 1
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 2
    .line 3
    invoke-interface {v0}, LE3/A$d;->A()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getCurrentPosition()J
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->getCurrentPosition()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_0
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    return-wide v0
.end method

.method public final getDeviceInfo()Lq2/p;
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Lq2/p;->e:Lq2/p;

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 14
    .line 15
    invoke-interface {v0}, LE3/A$d;->getDeviceInfo()Lq2/p;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public final getDuration()J
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->getDuration()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    return-wide v0
.end method

.method public final h0()Lq2/Y;
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->h0()Lq2/Y;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0

    .line 17
    :cond_0
    sget-object v0, Lq2/Y;->a:Lq2/Y;

    .line 18
    .line 19
    return-object v0
.end method

.method final h1()V
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, LE3/A;->m()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    move v0, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 16
    .line 17
    .line 18
    iget-boolean v0, p0, LE3/A;->g:Z

    .line 19
    .line 20
    xor-int/2addr v0, v2

    .line 21
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 22
    .line 23
    .line 24
    iput-boolean v2, p0, LE3/A;->g:Z

    .line 25
    .line 26
    iget-object v0, p0, LE3/A;->i:LE3/A$b;

    .line 27
    .line 28
    invoke-interface {v0}, LE3/A$b;->b()V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final i0()V
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "MediaController"

    .line 11
    .line 12
    const-string v1, "The controller is not connected. Ignoring increaseDeviceVolume()."

    .line 13
    .line 14
    invoke-static {v0, v1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0}, LE3/A$d;->i0()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method final i1(Lt2/n;)V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, LE3/A;->m()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, LE3/A;->d:LE3/A$c;

    .line 18
    .line 19
    invoke-interface {p1, v0}, Lt2/n;->accept(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final isPlaying()Z
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->isPlaying()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    return v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method public final j0()Lq2/d0;
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Lq2/d0;->F:Lq2/d0;

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 14
    .line 15
    invoke-interface {v0}, LE3/A$d;->j0()Lq2/d0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public final k(I)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LE3/A;->p0()Lq2/P$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lq2/P$b;->c(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final k0()V
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "MediaController"

    .line 11
    .line 12
    const-string v1, "The controller is not connected. Ignoring seekToNext()."

    .line 13
    .line 14
    invoke-static {v0, v1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0}, LE3/A$d;->k0()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method final k1(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/A;->e:Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final l()Z
    .locals 3

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->h0()Lq2/Y;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lq2/Y;->u()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, LE3/A;->K0()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v2, p0, LE3/A;->a:Lq2/Y$d;

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-boolean v0, v0, Lq2/Y$d;->i:Z

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    return v0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    return v0
.end method

.method public final l0(Landroid/view/TextureView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string p1, "MediaController"

    .line 11
    .line 12
    const-string v0, "The controller is not connected. Ignoring setVideoTextureView()."

    .line 13
    .line 14
    invoke-static {p1, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0, p1}, LE3/A$d;->l0(Landroid/view/TextureView;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final l1(LE3/T6;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    const-string v0, "command must not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iget v0, p1, LE3/T6;->a:I

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    const-string v1, "command must be a custom command"

    .line 17
    .line 18
    invoke-static {v0, v1}, Lt2/a;->b(ZLjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 28
    .line 29
    invoke-interface {v0, p1, p2}, LE3/A$d;->Z0(LE3/T6;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/p;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_1
    invoke-static {}, LE3/A;->a1()Lcom/google/common/util/concurrent/p;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
.end method

.method public final m()Landroid/os/Looper;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/A;->e:Landroid/os/Handler;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final m0()I
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 13
    .line 14
    invoke-interface {v0}, LE3/A$d;->m0()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public final n0()J
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->n0()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    return-wide v0
.end method

.method public final o0(IJ)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string p1, "MediaController"

    .line 11
    .line 12
    const-string p2, "The controller is not connected. Ignoring seekTo()."

    .line 13
    .line 14
    invoke-static {p1, p2}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0, p1, p2, p3}, LE3/A$d;->o0(IJ)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final p()I
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->p()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x1

    .line 18
    return v0
.end method

.method public final p0()Lq2/P$b;
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Lq2/P$b;->b:Lq2/P$b;

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 14
    .line 15
    invoke-interface {v0}, LE3/A$d;->p0()Lq2/P$b;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public final pause()V
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "MediaController"

    .line 11
    .line 12
    const-string v1, "The controller is not connected. Ignoring pause()."

    .line 13
    .line 14
    invoke-static {v0, v1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0}, LE3/A$d;->pause()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final q()Z
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->q()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    return v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method public final q0()Z
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->q0()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    return v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method public final r()Z
    .locals 3

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->h0()Lq2/Y;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lq2/Y;->u()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, LE3/A;->K0()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v2, p0, LE3/A;->a:Lq2/Y$d;

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-boolean v0, v0, Lq2/Y$d;->h:Z

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    return v0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    return v0
.end method

.method public final r0(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string p1, "MediaController"

    .line 11
    .line 12
    const-string v0, "The controller is not connected. Ignoring setShuffleMode()."

    .line 13
    .line 14
    invoke-static {p1, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0, p1}, LE3/A$d;->r0(Z)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final s()V
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "MediaController"

    .line 11
    .line 12
    const-string v1, "The controller is not connected. Ignoring prepare()."

    .line 13
    .line 14
    invoke-static {v0, v1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0}, LE3/A$d;->s()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final s0()J
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->s0()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_0
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    return-wide v0
.end method

.method public final stop()V
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "MediaController"

    .line 11
    .line 12
    const-string v1, "The controller is not connected. Ignoring stop()."

    .line 13
    .line 14
    invoke-static {v0, v1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0}, LE3/A$d;->stop()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final t(F)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string p1, "MediaController"

    .line 11
    .line 12
    const-string v0, "The controller is not connected. Ignoring setPlaybackSpeed()."

    .line 13
    .line 14
    invoke-static {p1, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0, p1}, LE3/A$d;->t(F)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final t0()J
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->t0()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    return-wide v0
.end method

.method public final u()V
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "MediaController"

    .line 11
    .line 12
    const-string v1, "The controller is not connected. Ignoring play()."

    .line 13
    .line 14
    invoke-static {v0, v1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0}, LE3/A$d;->u()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final u0()I
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->u0()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, -0x1

    .line 18
    return v0
.end method

.method public final v(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string p1, "MediaController"

    .line 11
    .line 12
    const-string v0, "The controller is not connected. Ignoring setRepeatMode()."

    .line 13
    .line 14
    invoke-static {p1, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0, p1}, LE3/A$d;->v(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final v0(Landroid/view/TextureView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string p1, "MediaController"

    .line 11
    .line 12
    const-string v0, "The controller is not connected. Ignoring clearVideoTextureView()."

    .line 13
    .line 14
    invoke-static {p1, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0, p1}, LE3/A$d;->v0(Landroid/view/TextureView;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final w(F)V
    .locals 2

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    cmpl-float v0, p1, v0

    .line 6
    .line 7
    if-ltz v0, :cond_0

    .line 8
    .line 9
    const/high16 v0, 0x3f800000    # 1.0f

    .line 10
    .line 11
    cmpg-float v0, p1, v0

    .line 12
    .line 13
    if-gtz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    const-string v1, "volume must be between 0 and 1"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lt2/a;->b(ZLjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    const-string p1, "MediaController"

    .line 30
    .line 31
    const-string v0, "The controller is not connected. Ignoring setVolume()."

    .line 32
    .line 33
    invoke-static {p1, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 38
    .line 39
    invoke-interface {v0, p1}, LE3/A$d;->w(F)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final w0()Lq2/l0;
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->w0()Lq2/l0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0

    .line 17
    :cond_0
    sget-object v0, Lq2/l0;->e:Lq2/l0;

    .line 18
    .line 19
    return-object v0
.end method

.method public final x()I
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->x()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public final x0()F
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->x0()F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0

    .line 17
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 18
    .line 19
    return v0
.end method

.method public final y()Lq2/N;
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 11
    .line 12
    invoke-interface {v0}, LE3/A$d;->y()Lq2/N;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return-object v0
.end method

.method public final y0()Lq2/c;
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Lq2/c;->h:Lq2/c;

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 14
    .line 15
    invoke-interface {v0}, LE3/A$d;->y0()Lq2/c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public final z(J)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string p1, "MediaController"

    .line 11
    .line 12
    const-string p2, "The controller is not connected. Ignoring seekTo()."

    .line 13
    .line 14
    invoke-static {p1, p2}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0, p1, p2}, LE3/A$d;->z(J)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final z0(II)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/A;->m1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE3/A;->g1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string p1, "MediaController"

    .line 11
    .line 12
    const-string p2, "The controller is not connected. Ignoring setDeviceVolume()."

    .line 13
    .line 14
    invoke-static {p1, p2}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE3/A;->c:LE3/A$d;

    .line 19
    .line 20
    invoke-interface {v0, p1, p2}, LE3/A$d;->z0(II)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
