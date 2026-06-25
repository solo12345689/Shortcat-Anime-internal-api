.class final Landroidx/media3/exoplayer/r0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/r0$a;
    }
.end annotation


# instance fields
.field public final a:LM2/C;

.field public final b:Ljava/lang/Object;

.field public final c:[LM2/c0;

.field public final d:J

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Landroidx/media3/exoplayer/s0;

.field public i:Z

.field private final j:[Z

.field private final k:[Landroidx/media3/exoplayer/O0;

.field private final l:LP2/G;

.field private final m:Landroidx/media3/exoplayer/J0;

.field private n:Landroidx/media3/exoplayer/r0;

.field private o:LM2/n0;

.field private p:LP2/H;

.field private q:J


# direct methods
.method public constructor <init>([Landroidx/media3/exoplayer/O0;JLP2/G;LQ2/b;Landroidx/media3/exoplayer/J0;Landroidx/media3/exoplayer/s0;LP2/H;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/r0;->k:[Landroidx/media3/exoplayer/O0;

    .line 5
    .line 6
    iput-wide p2, p0, Landroidx/media3/exoplayer/r0;->q:J

    .line 7
    .line 8
    iput-object p4, p0, Landroidx/media3/exoplayer/r0;->l:LP2/G;

    .line 9
    .line 10
    iput-object p6, p0, Landroidx/media3/exoplayer/r0;->m:Landroidx/media3/exoplayer/J0;

    .line 11
    .line 12
    move-object p2, p1

    .line 13
    iget-object p1, p7, Landroidx/media3/exoplayer/s0;->a:LM2/D$b;

    .line 14
    .line 15
    iget-object p3, p1, LM2/D$b;->a:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p3, p0, Landroidx/media3/exoplayer/r0;->b:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object p7, p0, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 20
    .line 21
    iput-wide p9, p0, Landroidx/media3/exoplayer/r0;->d:J

    .line 22
    .line 23
    sget-object p3, LM2/n0;->d:LM2/n0;

    .line 24
    .line 25
    iput-object p3, p0, Landroidx/media3/exoplayer/r0;->o:LM2/n0;

    .line 26
    .line 27
    iput-object p8, p0, Landroidx/media3/exoplayer/r0;->p:LP2/H;

    .line 28
    .line 29
    array-length p3, p2

    .line 30
    new-array p3, p3, [LM2/c0;

    .line 31
    .line 32
    iput-object p3, p0, Landroidx/media3/exoplayer/r0;->c:[LM2/c0;

    .line 33
    .line 34
    array-length p2, p2

    .line 35
    new-array p2, p2, [Z

    .line 36
    .line 37
    iput-object p2, p0, Landroidx/media3/exoplayer/r0;->j:[Z

    .line 38
    .line 39
    move-object p3, p5

    .line 40
    iget-wide p4, p7, Landroidx/media3/exoplayer/s0;->b:J

    .line 41
    .line 42
    move-object p2, p6

    .line 43
    move-object p8, p7

    .line 44
    iget-wide p6, p8, Landroidx/media3/exoplayer/s0;->d:J

    .line 45
    .line 46
    iget-boolean p8, p8, Landroidx/media3/exoplayer/s0;->f:Z

    .line 47
    .line 48
    invoke-static/range {p1 .. p8}, Landroidx/media3/exoplayer/r0;->f(LM2/D$b;Landroidx/media3/exoplayer/J0;LQ2/b;JJZ)LM2/C;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Landroidx/media3/exoplayer/r0;->a:LM2/C;

    .line 53
    .line 54
    return-void
.end method

.method private c([LM2/c0;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Landroidx/media3/exoplayer/r0;->k:[Landroidx/media3/exoplayer/O0;

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    if-ge v0, v2, :cond_1

    .line 6
    .line 7
    aget-object v1, v1, v0

    .line 8
    .line 9
    invoke-interface {v1}, Landroidx/media3/exoplayer/O0;->f()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, -0x2

    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Landroidx/media3/exoplayer/r0;->p:LP2/H;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, LP2/H;->c(I)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    new-instance v1, LM2/s;

    .line 25
    .line 26
    invoke-direct {v1}, LM2/s;-><init>()V

    .line 27
    .line 28
    .line 29
    aput-object v1, p1, v0

    .line 30
    .line 31
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
.end method

.method private static f(LM2/D$b;Landroidx/media3/exoplayer/J0;LQ2/b;JJZ)LM2/C;
    .locals 0

    .line 1
    invoke-virtual {p1, p0, p2, p3, p4}, Landroidx/media3/exoplayer/J0;->h(LM2/D$b;LQ2/b;J)LM2/C;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long p0, p5, p2

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    new-instance p0, LM2/e;

    .line 15
    .line 16
    xor-int/lit8 p2, p7, 0x1

    .line 17
    .line 18
    const-wide/16 p3, 0x0

    .line 19
    .line 20
    invoke-direct/range {p0 .. p6}, LM2/e;-><init>(LM2/C;ZJJ)V

    .line 21
    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    return-object p1
.end method

.method private g()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/r0;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iget-object v1, p0, Landroidx/media3/exoplayer/r0;->p:LP2/H;

    .line 10
    .line 11
    iget v2, v1, LP2/H;->a:I

    .line 12
    .line 13
    if-ge v0, v2, :cond_2

    .line 14
    .line 15
    invoke-virtual {v1, v0}, LP2/H;->c(I)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v2, p0, Landroidx/media3/exoplayer/r0;->p:LP2/H;

    .line 20
    .line 21
    iget-object v2, v2, LP2/H;->c:[LP2/A;

    .line 22
    .line 23
    aget-object v2, v2, v0

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-interface {v2}, LP2/A;->disable()V

    .line 30
    .line 31
    .line 32
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    :goto_1
    return-void
.end method

.method private h([LM2/c0;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Landroidx/media3/exoplayer/r0;->k:[Landroidx/media3/exoplayer/O0;

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    if-ge v0, v2, :cond_1

    .line 6
    .line 7
    aget-object v1, v1, v0

    .line 8
    .line 9
    invoke-interface {v1}, Landroidx/media3/exoplayer/O0;->f()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, -0x2

    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    aput-object v1, p1, v0

    .line 18
    .line 19
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    return-void
.end method

.method private i()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/r0;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iget-object v1, p0, Landroidx/media3/exoplayer/r0;->p:LP2/H;

    .line 10
    .line 11
    iget v2, v1, LP2/H;->a:I

    .line 12
    .line 13
    if-ge v0, v2, :cond_2

    .line 14
    .line 15
    invoke-virtual {v1, v0}, LP2/H;->c(I)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v2, p0, Landroidx/media3/exoplayer/r0;->p:LP2/H;

    .line 20
    .line 21
    iget-object v2, v2, LP2/H;->c:[LP2/A;

    .line 22
    .line 23
    aget-object v2, v2, v0

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-interface {v2}, LP2/A;->enable()V

    .line 30
    .line 31
    .line 32
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    :goto_1
    return-void
.end method

.method private u()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/r0;->n:Landroidx/media3/exoplayer/r0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method private static y(Landroidx/media3/exoplayer/J0;LM2/C;)V
    .locals 1

    .line 1
    :try_start_0
    instance-of v0, p1, LM2/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, LM2/e;

    .line 6
    .line 7
    iget-object p1, p1, LM2/e;->a:LM2/C;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/J0;->z(LM2/C;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/J0;->z(LM2/C;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    move-exception p0

    .line 18
    const-string p1, "MediaPeriodHolder"

    .line 19
    .line 20
    const-string v0, "Period release failed."

    .line 21
    .line 22
    invoke-static {p1, v0, p0}, Lt2/w;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public A(Landroidx/media3/exoplayer/r0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/r0;->n:Landroidx/media3/exoplayer/r0;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/r0;->g()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Landroidx/media3/exoplayer/r0;->n:Landroidx/media3/exoplayer/r0;

    .line 10
    .line 11
    invoke-direct {p0}, Landroidx/media3/exoplayer/r0;->i()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public B(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/media3/exoplayer/r0;->q:J

    .line 2
    .line 3
    return-void
.end method

.method public C(J)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/r0;->m()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sub-long/2addr p1, v0

    .line 6
    return-wide p1
.end method

.method public D(J)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/r0;->m()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    add-long/2addr p1, v0

    .line 6
    return-wide p1
.end method

.method public E()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/r0;->a:LM2/C;

    .line 2
    .line 3
    instance-of v1, v0, LM2/e;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 8
    .line 9
    iget-wide v1, v1, Landroidx/media3/exoplayer/s0;->d:J

    .line 10
    .line 11
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmp-long v3, v1, v3

    .line 17
    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    const-wide/high16 v1, -0x8000000000000000L

    .line 21
    .line 22
    :cond_0
    check-cast v0, LM2/e;

    .line 23
    .line 24
    const-wide/16 v3, 0x0

    .line 25
    .line 26
    invoke-virtual {v0, v3, v4, v1, v2}, LM2/e;->x(JJ)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public a(LP2/H;JZ)J
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/r0;->k:[Landroidx/media3/exoplayer/O0;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    new-array v6, v0, [Z

    .line 5
    .line 6
    move-object v1, p0

    .line 7
    move-object v2, p1

    .line 8
    move-wide v3, p2

    .line 9
    move v5, p4

    .line 10
    invoke-virtual/range {v1 .. v6}, Landroidx/media3/exoplayer/r0;->b(LP2/H;JZ[Z)J

    .line 11
    .line 12
    .line 13
    move-result-wide p1

    .line 14
    return-wide p1
.end method

.method public b(LP2/H;JZ[Z)J
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget v2, p1, LP2/H;->a:I

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    if-ge v1, v2, :cond_1

    .line 7
    .line 8
    iget-object v2, p0, Landroidx/media3/exoplayer/r0;->j:[Z

    .line 9
    .line 10
    if-nez p4, :cond_0

    .line 11
    .line 12
    iget-object v4, p0, Landroidx/media3/exoplayer/r0;->p:LP2/H;

    .line 13
    .line 14
    invoke-virtual {p1, v4, v1}, LP2/H;->b(LP2/H;I)Z

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    move v3, v0

    .line 22
    :goto_1
    aput-boolean v3, v2, v1

    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object p4, p0, Landroidx/media3/exoplayer/r0;->c:[LM2/c0;

    .line 28
    .line 29
    invoke-direct {p0, p4}, Landroidx/media3/exoplayer/r0;->h([LM2/c0;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0}, Landroidx/media3/exoplayer/r0;->g()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Landroidx/media3/exoplayer/r0;->p:LP2/H;

    .line 36
    .line 37
    invoke-direct {p0}, Landroidx/media3/exoplayer/r0;->i()V

    .line 38
    .line 39
    .line 40
    iget-object v4, p0, Landroidx/media3/exoplayer/r0;->a:LM2/C;

    .line 41
    .line 42
    iget-object v5, p1, LP2/H;->c:[LP2/A;

    .line 43
    .line 44
    iget-object v6, p0, Landroidx/media3/exoplayer/r0;->j:[Z

    .line 45
    .line 46
    iget-object v7, p0, Landroidx/media3/exoplayer/r0;->c:[LM2/c0;

    .line 47
    .line 48
    move-wide v9, p2

    .line 49
    move-object/from16 v8, p5

    .line 50
    .line 51
    invoke-interface/range {v4 .. v10}, LM2/C;->r([LP2/A;[Z[LM2/c0;[ZJ)J

    .line 52
    .line 53
    .line 54
    move-result-wide p2

    .line 55
    iget-object p4, p0, Landroidx/media3/exoplayer/r0;->c:[LM2/c0;

    .line 56
    .line 57
    invoke-direct {p0, p4}, Landroidx/media3/exoplayer/r0;->c([LM2/c0;)V

    .line 58
    .line 59
    .line 60
    iput-boolean v0, p0, Landroidx/media3/exoplayer/r0;->g:Z

    .line 61
    .line 62
    move p4, v0

    .line 63
    :goto_2
    iget-object v1, p0, Landroidx/media3/exoplayer/r0;->c:[LM2/c0;

    .line 64
    .line 65
    array-length v2, v1

    .line 66
    if-ge p4, v2, :cond_5

    .line 67
    .line 68
    aget-object v1, v1, p4

    .line 69
    .line 70
    if-eqz v1, :cond_2

    .line 71
    .line 72
    invoke-virtual {p1, p4}, LP2/H;->c(I)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-static {v1}, Lt2/a;->g(Z)V

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, Landroidx/media3/exoplayer/r0;->k:[Landroidx/media3/exoplayer/O0;

    .line 80
    .line 81
    aget-object v1, v1, p4

    .line 82
    .line 83
    invoke-interface {v1}, Landroidx/media3/exoplayer/O0;->f()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    const/4 v2, -0x2

    .line 88
    if-eq v1, v2, :cond_4

    .line 89
    .line 90
    iput-boolean v3, p0, Landroidx/media3/exoplayer/r0;->g:Z

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_2
    iget-object v1, p1, LP2/H;->c:[LP2/A;

    .line 94
    .line 95
    aget-object v1, v1, p4

    .line 96
    .line 97
    if-nez v1, :cond_3

    .line 98
    .line 99
    move v1, v3

    .line 100
    goto :goto_3

    .line 101
    :cond_3
    move v1, v0

    .line 102
    :goto_3
    invoke-static {v1}, Lt2/a;->g(Z)V

    .line 103
    .line 104
    .line 105
    :cond_4
    :goto_4
    add-int/lit8 p4, p4, 0x1

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_5
    return-wide p2
.end method

.method public d(Landroidx/media3/exoplayer/s0;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 2
    .line 3
    iget-wide v0, v0, Landroidx/media3/exoplayer/s0;->e:J

    .line 4
    .line 5
    iget-wide v2, p1, Landroidx/media3/exoplayer/s0;->e:J

    .line 6
    .line 7
    invoke-static {v0, v1, v2, v3}, Landroidx/media3/exoplayer/u0;->e(JJ)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 14
    .line 15
    iget-wide v1, v0, Landroidx/media3/exoplayer/s0;->b:J

    .line 16
    .line 17
    iget-wide v3, p1, Landroidx/media3/exoplayer/s0;->b:J

    .line 18
    .line 19
    cmp-long v1, v1, v3

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    iget-object v0, v0, Landroidx/media3/exoplayer/s0;->a:LM2/D$b;

    .line 24
    .line 25
    iget-object p1, p1, Landroidx/media3/exoplayer/s0;->a:LM2/D$b;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, LM2/D$b;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    return p1

    .line 35
    :cond_0
    const/4 p1, 0x0

    .line 36
    return p1
.end method

.method public e(Landroidx/media3/exoplayer/q0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/r0;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/exoplayer/r0;->a:LM2/C;

    .line 9
    .line 10
    invoke-interface {v0, p1}, LM2/C;->a(Landroidx/media3/exoplayer/q0;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public j()J
    .locals 5

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/r0;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 6
    .line 7
    iget-wide v0, v0, Landroidx/media3/exoplayer/s0;->b:J

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    iget-boolean v0, p0, Landroidx/media3/exoplayer/r0;->g:Z

    .line 11
    .line 12
    const-wide/high16 v1, -0x8000000000000000L

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/media3/exoplayer/r0;->a:LM2/C;

    .line 17
    .line 18
    invoke-interface {v0}, LM2/C;->f()J

    .line 19
    .line 20
    .line 21
    move-result-wide v3

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move-wide v3, v1

    .line 24
    :goto_0
    cmp-long v0, v3, v1

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 29
    .line 30
    iget-wide v0, v0, Landroidx/media3/exoplayer/s0;->e:J

    .line 31
    .line 32
    return-wide v0

    .line 33
    :cond_2
    return-wide v3
.end method

.method public k()Landroidx/media3/exoplayer/r0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/r0;->n:Landroidx/media3/exoplayer/r0;

    .line 2
    .line 3
    return-object v0
.end method

.method public l()J
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/r0;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/r0;->a:LM2/C;

    .line 9
    .line 10
    invoke-interface {v0}, LM2/C;->c()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0
.end method

.method public m()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/r0;->q:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public n()J
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 2
    .line 3
    iget-wide v0, v0, Landroidx/media3/exoplayer/s0;->b:J

    .line 4
    .line 5
    iget-wide v2, p0, Landroidx/media3/exoplayer/r0;->q:J

    .line 6
    .line 7
    add-long/2addr v0, v2

    .line 8
    return-wide v0
.end method

.method public o()LM2/n0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/r0;->o:LM2/n0;

    .line 2
    .line 3
    return-object v0
.end method

.method public p()LP2/H;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/r0;->p:LP2/H;

    .line 2
    .line 3
    return-object v0
.end method

.method public q(FLq2/Y;Z)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/r0;->f:Z

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/r0;->a:LM2/C;

    .line 5
    .line 6
    invoke-interface {v0}, LM2/C;->s()LM2/n0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Landroidx/media3/exoplayer/r0;->o:LM2/n0;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2, p3}, Landroidx/media3/exoplayer/r0;->z(FLq2/Y;Z)LP2/H;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object p2, p0, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 17
    .line 18
    iget-wide v0, p2, Landroidx/media3/exoplayer/s0;->b:J

    .line 19
    .line 20
    iget-wide p2, p2, Landroidx/media3/exoplayer/s0;->e:J

    .line 21
    .line 22
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long v2, p2, v2

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    cmp-long v2, v0, p2

    .line 32
    .line 33
    if-ltz v2, :cond_0

    .line 34
    .line 35
    const-wide/16 v0, 0x1

    .line 36
    .line 37
    sub-long/2addr p2, v0

    .line 38
    const-wide/16 v0, 0x0

    .line 39
    .line 40
    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->max(JJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    :cond_0
    const/4 p2, 0x0

    .line 45
    invoke-virtual {p0, p1, v0, v1, p2}, Landroidx/media3/exoplayer/r0;->a(LP2/H;JZ)J

    .line 46
    .line 47
    .line 48
    move-result-wide p1

    .line 49
    iget-wide v0, p0, Landroidx/media3/exoplayer/r0;->q:J

    .line 50
    .line 51
    iget-object p3, p0, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 52
    .line 53
    iget-wide v2, p3, Landroidx/media3/exoplayer/s0;->b:J

    .line 54
    .line 55
    sub-long/2addr v2, p1

    .line 56
    add-long/2addr v0, v2

    .line 57
    iput-wide v0, p0, Landroidx/media3/exoplayer/r0;->q:J

    .line 58
    .line 59
    invoke-virtual {p3, p1, p2}, Landroidx/media3/exoplayer/s0;->b(J)Landroidx/media3/exoplayer/s0;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 64
    .line 65
    return-void
.end method

.method public r()Z
    .locals 5

    .line 1
    :try_start_0
    iget-boolean v0, p0, Landroidx/media3/exoplayer/r0;->f:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/r0;->a:LM2/C;

    .line 7
    .line 8
    invoke-interface {v0}, LM2/C;->o()V

    .line 9
    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/r0;->c:[LM2/c0;

    .line 13
    .line 14
    array-length v2, v0

    .line 15
    move v3, v1

    .line 16
    :goto_0
    if-ge v3, v2, :cond_2

    .line 17
    .line 18
    aget-object v4, v0, v3

    .line 19
    .line 20
    if-eqz v4, :cond_1

    .line 21
    .line 22
    invoke-interface {v4}, LM2/c0;->b()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    :goto_1
    return v1

    .line 29
    :catch_0
    const/4 v0, 0x1

    .line 30
    return v0
.end method

.method public s()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/r0;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/media3/exoplayer/r0;->g:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/r0;->a:LM2/C;

    .line 10
    .line 11
    invoke-interface {v0}, LM2/C;->f()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    const-wide/high16 v2, -0x8000000000000000L

    .line 16
    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    :cond_0
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public t()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/r0;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/media3/exoplayer/r0;->s()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/media3/exoplayer/r0;->j()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-object v2, p0, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 16
    .line 17
    iget-wide v2, v2, Landroidx/media3/exoplayer/s0;->b:J

    .line 18
    .line 19
    sub-long/2addr v0, v2

    .line 20
    iget-wide v2, p0, Landroidx/media3/exoplayer/r0;->d:J

    .line 21
    .line 22
    cmp-long v0, v0, v2

    .line 23
    .line 24
    if-ltz v0, :cond_1

    .line 25
    .line 26
    :cond_0
    const/4 v0, 0x1

    .line 27
    return v0

    .line 28
    :cond_1
    const/4 v0, 0x0

    .line 29
    return v0
.end method

.method public v(LM2/C$a;J)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/r0;->e:Z

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/r0;->a:LM2/C;

    .line 5
    .line 6
    invoke-interface {v0, p1, p2, p3}, LM2/C;->l(LM2/C$a;J)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public w(J)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/r0;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Landroidx/media3/exoplayer/r0;->f:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/media3/exoplayer/r0;->a:LM2/C;

    .line 13
    .line 14
    invoke-virtual {p0, p1, p2}, Landroidx/media3/exoplayer/r0;->C(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    invoke-interface {v0, p1, p2}, LM2/C;->g(J)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public x()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/r0;->g()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/r0;->m:Landroidx/media3/exoplayer/J0;

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/media3/exoplayer/r0;->a:LM2/C;

    .line 7
    .line 8
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/r0;->y(Landroidx/media3/exoplayer/J0;LM2/C;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public z(FLq2/Y;Z)LP2/H;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/r0;->l:LP2/G;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/r0;->k:[Landroidx/media3/exoplayer/O0;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/media3/exoplayer/r0;->o()LM2/n0;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v3, p0, Landroidx/media3/exoplayer/r0;->h:Landroidx/media3/exoplayer/s0;

    .line 10
    .line 11
    iget-object v3, v3, Landroidx/media3/exoplayer/s0;->a:LM2/D$b;

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2, v3, p2}, LP2/G;->k([Landroidx/media3/exoplayer/O0;LM2/n0;LM2/D$b;Lq2/Y;)LP2/H;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    const/4 v0, 0x0

    .line 18
    move v1, v0

    .line 19
    :goto_0
    iget v2, p2, LP2/H;->a:I

    .line 20
    .line 21
    if-ge v1, v2, :cond_4

    .line 22
    .line 23
    invoke-virtual {p2, v1}, LP2/H;->c(I)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x1

    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    iget-object v2, p2, LP2/H;->c:[LP2/A;

    .line 31
    .line 32
    aget-object v2, v2, v1

    .line 33
    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    iget-object v2, p0, Landroidx/media3/exoplayer/r0;->k:[Landroidx/media3/exoplayer/O0;

    .line 37
    .line 38
    aget-object v2, v2, v1

    .line 39
    .line 40
    invoke-interface {v2}, Landroidx/media3/exoplayer/O0;->f()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    const/4 v4, -0x2

    .line 45
    if-ne v2, v4, :cond_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    move v3, v0

    .line 49
    :cond_1
    :goto_1
    invoke-static {v3}, Lt2/a;->g(Z)V

    .line 50
    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_2
    iget-object v2, p2, LP2/H;->c:[LP2/A;

    .line 54
    .line 55
    aget-object v2, v2, v1

    .line 56
    .line 57
    if-nez v2, :cond_3

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    move v3, v0

    .line 61
    :goto_2
    invoke-static {v3}, Lt2/a;->g(Z)V

    .line 62
    .line 63
    .line 64
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_4
    iget-object v1, p2, LP2/H;->c:[LP2/A;

    .line 68
    .line 69
    array-length v2, v1

    .line 70
    :goto_4
    if-ge v0, v2, :cond_6

    .line 71
    .line 72
    aget-object v3, v1, v0

    .line 73
    .line 74
    if-eqz v3, :cond_5

    .line 75
    .line 76
    invoke-interface {v3, p1}, LP2/A;->h(F)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v3, p3}, LP2/A;->n(Z)V

    .line 80
    .line 81
    .line 82
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_6
    return-object p2
.end method
