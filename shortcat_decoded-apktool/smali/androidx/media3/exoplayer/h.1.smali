.class public abstract Landroidx/media3/exoplayer/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/media3/exoplayer/N0;
.implements Landroidx/media3/exoplayer/O0;


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:I

.field private final c:LA2/J;

.field private d:LA2/N;

.field private e:I

.field private f:LB2/K1;

.field private g:Lt2/j;

.field private h:I

.field private i:LM2/c0;

.field private j:[Lq2/x;

.field private k:J

.field private l:J

.field private m:J

.field private n:Z

.field private o:Z

.field private p:Lq2/Y;

.field private q:LM2/D$b;

.field private r:Landroidx/media3/exoplayer/O0$a;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/media3/exoplayer/h;->a:Ljava/lang/Object;

    .line 10
    .line 11
    iput p1, p0, Landroidx/media3/exoplayer/h;->b:I

    .line 12
    .line 13
    new-instance p1, LA2/J;

    .line 14
    .line 15
    invoke-direct {p1}, LA2/J;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Landroidx/media3/exoplayer/h;->c:LA2/J;

    .line 19
    .line 20
    const-wide/high16 v0, -0x8000000000000000L

    .line 21
    .line 22
    iput-wide v0, p0, Landroidx/media3/exoplayer/h;->m:J

    .line 23
    .line 24
    sget-object p1, Lq2/Y;->a:Lq2/Y;

    .line 25
    .line 26
    iput-object p1, p0, Landroidx/media3/exoplayer/h;->p:Lq2/Y;

    .line 27
    .line 28
    return-void
.end method

.method private p0(JZ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/h;->n:Z

    .line 3
    .line 4
    iput-wide p1, p0, Landroidx/media3/exoplayer/h;->l:J

    .line 5
    .line 6
    iput-wide p1, p0, Landroidx/media3/exoplayer/h;->m:J

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2, p3}, Landroidx/media3/exoplayer/h;->g0(JZ)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/h;->n:Z

    .line 2
    .line 3
    return v0
.end method

.method public final D(Lq2/Y;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/h;->p:Lq2/Y;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Landroidx/media3/exoplayer/h;->p:Lq2/Y;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/h;->n0(Lq2/Y;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final G()Landroidx/media3/exoplayer/O0;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final H(Landroidx/media3/exoplayer/O0$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/h;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iput-object p1, p0, Landroidx/media3/exoplayer/h;->r:Landroidx/media3/exoplayer/O0$a;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw p1
.end method

.method public L()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final M()LM2/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/h;->i:LM2/c0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final N()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/h;->m:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final O(J)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Landroidx/media3/exoplayer/h;->p0(JZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public P()LA2/L;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method protected final R(Ljava/lang/Throwable;Lq2/x;I)Landroidx/media3/exoplayer/s;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0, p3}, Landroidx/media3/exoplayer/h;->S(Ljava/lang/Throwable;Lq2/x;ZI)Landroidx/media3/exoplayer/s;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method protected final S(Ljava/lang/Throwable;Lq2/x;ZI)Landroidx/media3/exoplayer/s;
    .locals 9

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-boolean v0, p0, Landroidx/media3/exoplayer/h;->o:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Landroidx/media3/exoplayer/h;->o:Z

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :try_start_0
    invoke-interface {p0, p2}, Landroidx/media3/exoplayer/O0;->b(Lq2/x;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Landroidx/media3/exoplayer/O0;->Q(I)I

    .line 16
    .line 17
    .line 18
    move-result v0
    :try_end_0
    .catch Landroidx/media3/exoplayer/s; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    iput-boolean v1, p0, Landroidx/media3/exoplayer/h;->o:Z

    .line 20
    .line 21
    :goto_0
    move v5, v0

    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    move-object p1, v0

    .line 25
    iput-boolean v1, p0, Landroidx/media3/exoplayer/h;->o:Z

    .line 26
    .line 27
    throw p1

    .line 28
    :catch_0
    iput-boolean v1, p0, Landroidx/media3/exoplayer/h;->o:Z

    .line 29
    .line 30
    :cond_0
    const/4 v0, 0x4

    .line 31
    goto :goto_0

    .line 32
    :goto_1
    invoke-interface {p0}, Landroidx/media3/exoplayer/N0;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->W()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    iget-object v6, p0, Landroidx/media3/exoplayer/h;->q:LM2/D$b;

    .line 41
    .line 42
    move-object v1, p1

    .line 43
    move-object v4, p2

    .line 44
    move v7, p3

    .line 45
    move v8, p4

    .line 46
    invoke-static/range {v1 .. v8}, Landroidx/media3/exoplayer/s;->i(Ljava/lang/Throwable;Ljava/lang/String;ILq2/x;ILM2/D$b;ZI)Landroidx/media3/exoplayer/s;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1
.end method

.method protected final T()Lt2/j;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/h;->g:Lt2/j;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lt2/j;

    .line 8
    .line 9
    return-object v0
.end method

.method protected final U()LA2/N;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/h;->d:LA2/N;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LA2/N;

    .line 8
    .line 9
    return-object v0
.end method

.method protected final V()LA2/J;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/h;->c:LA2/J;

    .line 2
    .line 3
    invoke-virtual {v0}, LA2/J;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/h;->c:LA2/J;

    .line 7
    .line 8
    return-object v0
.end method

.method protected final W()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/h;->e:I

    .line 2
    .line 3
    return v0
.end method

.method protected final X()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/h;->l:J

    .line 2
    .line 3
    return-wide v0
.end method

.method protected final Y()LB2/K1;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/h;->f:LB2/K1;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LB2/K1;

    .line 8
    .line 9
    return-object v0
.end method

.method protected final Z()[Lq2/x;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/h;->j:[Lq2/x;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lq2/x;

    .line 8
    .line 9
    return-object v0
.end method

.method public final a()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/h;->h:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->h0()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method protected final a0()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/h;->k:J

    .line 2
    .line 3
    return-wide v0
.end method

.method protected final b0()Lq2/Y;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/h;->p:Lq2/Y;

    .line 2
    .line 3
    return-object v0
.end method

.method protected final c0()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/media3/exoplayer/h;->n:Z

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/h;->i:LM2/c0;

    .line 11
    .line 12
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, LM2/c0;

    .line 17
    .line 18
    invoke-interface {v0}, LM2/c0;->isReady()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0
.end method

.method protected abstract d0()V
.end method

.method public final disable()V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/h;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v0, v2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v2, v1

    .line 9
    :goto_0
    invoke-static {v2}, Lt2/a;->g(Z)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Landroidx/media3/exoplayer/h;->c:LA2/J;

    .line 13
    .line 14
    invoke-virtual {v0}, LA2/J;->a()V

    .line 15
    .line 16
    .line 17
    iput v1, p0, Landroidx/media3/exoplayer/h;->h:I

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, Landroidx/media3/exoplayer/h;->i:LM2/c0;

    .line 21
    .line 22
    iput-object v0, p0, Landroidx/media3/exoplayer/h;->j:[Lq2/x;

    .line 23
    .line 24
    iput-boolean v1, p0, Landroidx/media3/exoplayer/h;->n:Z

    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->d0()V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Landroidx/media3/exoplayer/h;->q:LM2/D$b;

    .line 30
    .line 31
    return-void
.end method

.method protected e0(ZZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public final f()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/h;->b:I

    .line 2
    .line 3
    return v0
.end method

.method protected f0()V
    .locals 0

    .line 1
    return-void
.end method

.method protected abstract g0(JZ)V
.end method

.method public final getState()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/h;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public final h()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/h;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    iput-object v1, p0, Landroidx/media3/exoplayer/h;->r:Landroidx/media3/exoplayer/O0$a;

    .line 6
    .line 7
    monitor-exit v0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception v1

    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    throw v1
.end method

.method protected h0()V
    .locals 0

    .line 1
    return-void
.end method

.method public final i()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/h;->m:J

    .line 2
    .line 3
    const-wide/high16 v2, -0x8000000000000000L

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method protected final i0()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/h;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/media3/exoplayer/h;->r:Landroidx/media3/exoplayer/O0$a;

    .line 5
    .line 6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-interface {v1, p0}, Landroidx/media3/exoplayer/O0$a;->a(Landroidx/media3/exoplayer/N0;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void

    .line 13
    :catchall_0
    move-exception v1

    .line 14
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    throw v1
.end method

.method public final j(LA2/N;[Lq2/x;LM2/c0;JZZJJLM2/D$b;)V
    .locals 8

    .line 1
    iget p4, p0, Landroidx/media3/exoplayer/h;->h:I

    .line 2
    .line 3
    const/4 p5, 0x1

    .line 4
    if-nez p4, :cond_0

    .line 5
    .line 6
    move p4, p5

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p4, 0x0

    .line 9
    :goto_0
    invoke-static {p4}, Lt2/a;->g(Z)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Landroidx/media3/exoplayer/h;->d:LA2/N;

    .line 13
    .line 14
    move-object/from16 v7, p12

    .line 15
    .line 16
    iput-object v7, p0, Landroidx/media3/exoplayer/h;->q:LM2/D$b;

    .line 17
    .line 18
    iput p5, p0, Landroidx/media3/exoplayer/h;->h:I

    .line 19
    .line 20
    invoke-virtual {p0, p6, p7}, Landroidx/media3/exoplayer/h;->e0(ZZ)V

    .line 21
    .line 22
    .line 23
    move-object v0, p0

    .line 24
    move-object v1, p2

    .line 25
    move-object v2, p3

    .line 26
    move-wide/from16 v3, p8

    .line 27
    .line 28
    move-wide/from16 v5, p10

    .line 29
    .line 30
    invoke-virtual/range {v0 .. v7}, Landroidx/media3/exoplayer/h;->p([Lq2/x;LM2/c0;JJLM2/D$b;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0, v3, v4, p6}, Landroidx/media3/exoplayer/h;->p0(JZ)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method protected j0()V
    .locals 0

    .line 1
    return-void
.end method

.method protected k0()V
    .locals 0

    .line 1
    return-void
.end method

.method protected l0()V
    .locals 0

    .line 1
    return-void
.end method

.method protected m0([Lq2/x;JJLM2/D$b;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final n()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/h;->n:Z

    .line 3
    .line 4
    return-void
.end method

.method protected n0(Lq2/Y;)V
    .locals 0

    .line 1
    return-void
.end method

.method protected final o0(LA2/J;Lz2/f;I)I
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/h;->i:LM2/c0;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LM2/c0;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2, p3}, LM2/c0;->p(LA2/J;Lz2/f;I)I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    const/4 v0, -0x4

    .line 14
    if-ne p3, v0, :cond_2

    .line 15
    .line 16
    invoke-virtual {p2}, Lz2/a;->q()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    const-wide/high16 p1, -0x8000000000000000L

    .line 23
    .line 24
    iput-wide p1, p0, Landroidx/media3/exoplayer/h;->m:J

    .line 25
    .line 26
    iget-boolean p1, p0, Landroidx/media3/exoplayer/h;->n:Z

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    return v0

    .line 31
    :cond_0
    const/4 p1, -0x3

    .line 32
    return p1

    .line 33
    :cond_1
    iget-wide v0, p2, Lz2/f;->f:J

    .line 34
    .line 35
    iget-wide v2, p0, Landroidx/media3/exoplayer/h;->k:J

    .line 36
    .line 37
    add-long/2addr v0, v2

    .line 38
    iput-wide v0, p2, Lz2/f;->f:J

    .line 39
    .line 40
    iget-wide p1, p0, Landroidx/media3/exoplayer/h;->m:J

    .line 41
    .line 42
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide p1

    .line 46
    iput-wide p1, p0, Landroidx/media3/exoplayer/h;->m:J

    .line 47
    .line 48
    return p3

    .line 49
    :cond_2
    const/4 p2, -0x5

    .line 50
    if-ne p3, p2, :cond_3

    .line 51
    .line 52
    iget-object p2, p1, LA2/J;->b:Lq2/x;

    .line 53
    .line 54
    invoke-static {p2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    check-cast p2, Lq2/x;

    .line 59
    .line 60
    iget-wide v0, p2, Lq2/x;->t:J

    .line 61
    .line 62
    const-wide v2, 0x7fffffffffffffffL

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    cmp-long v0, v0, v2

    .line 68
    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    invoke-virtual {p2}, Lq2/x;->b()Lq2/x$b;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget-wide v1, p2, Lq2/x;->t:J

    .line 76
    .line 77
    iget-wide v3, p0, Landroidx/media3/exoplayer/h;->k:J

    .line 78
    .line 79
    add-long/2addr v1, v3

    .line 80
    invoke-virtual {v0, v1, v2}, Lq2/x$b;->C0(J)Lq2/x$b;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-virtual {p2}, Lq2/x$b;->P()Lq2/x;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    iput-object p2, p1, LA2/J;->b:Lq2/x;

    .line 89
    .line 90
    :cond_3
    return p3
.end method

.method public final p([Lq2/x;LM2/c0;JJLM2/D$b;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/h;->n:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Landroidx/media3/exoplayer/h;->i:LM2/c0;

    .line 9
    .line 10
    iput-object p7, p0, Landroidx/media3/exoplayer/h;->q:LM2/D$b;

    .line 11
    .line 12
    iget-wide v0, p0, Landroidx/media3/exoplayer/h;->m:J

    .line 13
    .line 14
    const-wide/high16 v2, -0x8000000000000000L

    .line 15
    .line 16
    cmp-long p2, v0, v2

    .line 17
    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    iput-wide p3, p0, Landroidx/media3/exoplayer/h;->m:J

    .line 21
    .line 22
    :cond_0
    iput-object p1, p0, Landroidx/media3/exoplayer/h;->j:[Lq2/x;

    .line 23
    .line 24
    iput-wide p5, p0, Landroidx/media3/exoplayer/h;->k:J

    .line 25
    .line 26
    move-object v0, p0

    .line 27
    move-object v1, p1

    .line 28
    move-wide v2, p3

    .line 29
    move-wide v4, p5

    .line 30
    move-object v6, p7

    .line 31
    invoke-virtual/range {v0 .. v6}, Landroidx/media3/exoplayer/h;->m0([Lq2/x;JJLM2/D$b;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method protected q0(J)I
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/h;->i:LM2/c0;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LM2/c0;

    .line 8
    .line 9
    iget-wide v1, p0, Landroidx/media3/exoplayer/h;->k:J

    .line 10
    .line 11
    sub-long/2addr p1, v1

    .line 12
    invoke-interface {v0, p1, p2}, LM2/c0;->e(J)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
.end method

.method public final reset()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/h;->h:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/h;->c:LA2/J;

    .line 12
    .line 13
    invoke-virtual {v0}, LA2/J;->a()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->j0()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final start()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/h;->h:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v1, 0x0

    .line 8
    :goto_0
    invoke-static {v1}, Lt2/a;->g(Z)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    iput v0, p0, Landroidx/media3/exoplayer/h;->h:I

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->k0()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final stop()V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/h;->h:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 11
    .line 12
    .line 13
    iput v2, p0, Landroidx/media3/exoplayer/h;->h:I

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->l0()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public v(ILjava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final w(ILB2/K1;Lt2/j;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/exoplayer/h;->e:I

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/media3/exoplayer/h;->f:LB2/K1;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/media3/exoplayer/h;->g:Lt2/j;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->f0()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final x()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/h;->i:LM2/c0;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LM2/c0;

    .line 8
    .line 9
    invoke-interface {v0}, LM2/c0;->b()V

    .line 10
    .line 11
    .line 12
    return-void
.end method
