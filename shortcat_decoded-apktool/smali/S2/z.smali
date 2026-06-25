.class final LS2/z;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS2/z$a;
    }
.end annotation


# instance fields
.field private final a:LS2/z$a;

.field private final b:LS2/v;

.field private final c:LS2/v$a;

.field private final d:Lt2/N;

.field private final e:Lt2/N;

.field private final f:Lt2/y;

.field private g:J

.field private h:J

.field private i:J

.field private j:Lq2/l0;

.field private k:J


# direct methods
.method public constructor <init>(LS2/z$a;LS2/v;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LS2/z;->a:LS2/z$a;

    .line 5
    .line 6
    iput-object p2, p0, LS2/z;->b:LS2/v;

    .line 7
    .line 8
    new-instance p1, LS2/v$a;

    .line 9
    .line 10
    invoke-direct {p1}, LS2/v$a;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, LS2/z;->c:LS2/v$a;

    .line 14
    .line 15
    new-instance p1, Lt2/N;

    .line 16
    .line 17
    invoke-direct {p1}, Lt2/N;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, LS2/z;->d:Lt2/N;

    .line 21
    .line 22
    new-instance p1, Lt2/N;

    .line 23
    .line 24
    invoke-direct {p1}, Lt2/N;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, LS2/z;->e:Lt2/N;

    .line 28
    .line 29
    new-instance p1, Lt2/y;

    .line 30
    .line 31
    invoke-direct {p1}, Lt2/y;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, LS2/z;->f:Lt2/y;

    .line 35
    .line 36
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    iput-wide p1, p0, LS2/z;->g:J

    .line 42
    .line 43
    sget-object v0, Lq2/l0;->e:Lq2/l0;

    .line 44
    .line 45
    iput-object v0, p0, LS2/z;->j:Lq2/l0;

    .line 46
    .line 47
    iput-wide p1, p0, LS2/z;->h:J

    .line 48
    .line 49
    iput-wide p1, p0, LS2/z;->i:J

    .line 50
    .line 51
    return-void
.end method

.method private a()V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/z;->f:Lt2/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt2/y;->f()J

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LS2/z;->a:LS2/z$a;

    .line 7
    .line 8
    invoke-interface {v0}, LS2/z$a;->c()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static c(Lt2/N;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lt2/N;->l()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    move v0, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    invoke-static {v0}, Lt2/a;->a(Z)V

    .line 12
    .line 13
    .line 14
    :goto_1
    invoke-virtual {p0}, Lt2/N;->l()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-le v0, v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Lt2/N;->i()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-virtual {p0}, Lt2/N;->i()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method private e(J)Z
    .locals 4

    .line 1
    iget-object v0, p0, LS2/z;->e:Lt2/N;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lt2/N;->j(J)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Long;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-wide v2, p0, LS2/z;->k:J

    .line 16
    .line 17
    cmp-long p2, v0, v2

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    iput-wide p1, p0, LS2/z;->k:J

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    return p1

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    return p1
.end method

.method private f(J)Z
    .locals 1

    .line 1
    iget-object v0, p0, LS2/z;->d:Lt2/N;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lt2/N;->j(J)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lq2/l0;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    sget-object p2, Lq2/l0;->e:Lq2/l0;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lq2/l0;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    iget-object p2, p0, LS2/z;->j:Lq2/l0;

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Lq2/l0;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-nez p2, :cond_0

    .line 26
    .line 27
    iput-object p1, p0, LS2/z;->j:Lq2/l0;

    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    return p1

    .line 31
    :cond_0
    const/4 p1, 0x0

    .line 32
    return p1
.end method

.method private k(Z)V
    .locals 7

    .line 1
    iget-object v0, p0, LS2/z;->f:Lt2/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt2/y;->f()J

    .line 4
    .line 5
    .line 6
    move-result-wide v4

    .line 7
    invoke-direct {p0, v4, v5}, LS2/z;->f(J)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LS2/z;->a:LS2/z$a;

    .line 14
    .line 15
    iget-object v1, p0, LS2/z;->j:Lq2/l0;

    .line 16
    .line 17
    invoke-interface {v0, v1}, LS2/z$a;->b(Lq2/l0;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    if-eqz p1, :cond_1

    .line 21
    .line 22
    sget-object p1, Lt2/j;->a:Lt2/j;

    .line 23
    .line 24
    invoke-interface {p1}, Lt2/j;->b()J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    :goto_0
    move-wide v2, v0

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    iget-object p1, p0, LS2/z;->c:LS2/v$a;

    .line 31
    .line 32
    invoke-virtual {p1}, LS2/v$a;->g()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    goto :goto_0

    .line 37
    :goto_1
    iget-object v1, p0, LS2/z;->a:LS2/z$a;

    .line 38
    .line 39
    iget-object p1, p0, LS2/z;->b:LS2/v;

    .line 40
    .line 41
    invoke-virtual {p1}, LS2/v;->g()Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    invoke-interface/range {v1 .. v6}, LS2/z$a;->d(JJZ)V

    .line 46
    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public b()V
    .locals 4

    .line 1
    iget-object v0, p0, LS2/z;->f:Lt2/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt2/y;->b()V

    .line 4
    .line 5
    .line 6
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    iput-wide v0, p0, LS2/z;->g:J

    .line 12
    .line 13
    iput-wide v0, p0, LS2/z;->h:J

    .line 14
    .line 15
    iput-wide v0, p0, LS2/z;->i:J

    .line 16
    .line 17
    iget-object v0, p0, LS2/z;->e:Lt2/N;

    .line 18
    .line 19
    invoke-virtual {v0}, Lt2/N;->l()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-lez v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, LS2/z;->e:Lt2/N;

    .line 26
    .line 27
    invoke-static {v0}, LS2/z;->c(Lt2/N;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/lang/Long;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    iput-wide v0, p0, LS2/z;->k:J

    .line 38
    .line 39
    :cond_0
    iget-object v0, p0, LS2/z;->d:Lt2/N;

    .line 40
    .line 41
    invoke-virtual {v0}, Lt2/N;->l()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-lez v0, :cond_1

    .line 46
    .line 47
    iget-object v0, p0, LS2/z;->d:Lt2/N;

    .line 48
    .line 49
    invoke-static {v0}, LS2/z;->c(Lt2/N;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lq2/l0;

    .line 54
    .line 55
    iget-object v1, p0, LS2/z;->d:Lt2/N;

    .line 56
    .line 57
    const-wide/16 v2, 0x0

    .line 58
    .line 59
    invoke-virtual {v1, v2, v3, v0}, Lt2/N;->a(JLjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    return-void
.end method

.method public d()Z
    .locals 4

    .line 1
    iget-wide v0, p0, LS2/z;->i:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v2, v0, v2

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    iget-wide v2, p0, LS2/z;->h:J

    .line 13
    .line 14
    cmp-long v0, v2, v0

    .line 15
    .line 16
    if-nez v0, :cond_0

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

.method public g(J)V
    .locals 1

    .line 1
    iget-object v0, p0, LS2/z;->f:Lt2/y;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lt2/y;->a(J)V

    .line 4
    .line 5
    .line 6
    iput-wide p1, p0, LS2/z;->g:J

    .line 7
    .line 8
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iput-wide p1, p0, LS2/z;->i:J

    .line 14
    .line 15
    return-void
.end method

.method public h(IJ)V
    .locals 4

    .line 1
    iget-object v0, p0, LS2/z;->f:Lt2/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt2/y;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LS2/z;->b:LS2/v;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, LS2/v;->j(I)V

    .line 12
    .line 13
    .line 14
    iput-wide p2, p0, LS2/z;->k:J

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object p1, p0, LS2/z;->e:Lt2/N;

    .line 18
    .line 19
    iget-wide v0, p0, LS2/z;->g:J

    .line 20
    .line 21
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    cmp-long v2, v0, v2

    .line 27
    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    const-wide/high16 v0, -0x4000000000000000L    # -2.0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const-wide/16 v2, 0x1

    .line 34
    .line 35
    add-long/2addr v0, v2

    .line 36
    :goto_0
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p1, v0, v1, p2}, Lt2/N;->a(JLjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public i(II)V
    .locals 5

    .line 1
    iget-object v0, p0, LS2/z;->d:Lt2/N;

    .line 2
    .line 3
    iget-wide v1, p0, LS2/z;->g:J

    .line 4
    .line 5
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long v3, v1, v3

    .line 11
    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    const-wide/16 v1, 0x0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-wide/16 v3, 0x1

    .line 18
    .line 19
    add-long/2addr v1, v3

    .line 20
    :goto_0
    new-instance v3, Lq2/l0;

    .line 21
    .line 22
    invoke-direct {v3, p1, p2}, Lq2/l0;-><init>(II)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1, v2, v3}, Lt2/N;->a(JLjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public j(JJ)V
    .locals 14

    .line 1
    :goto_0
    iget-object v0, p0, LS2/z;->f:Lt2/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt2/y;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_6

    .line 8
    .line 9
    iget-object v0, p0, LS2/z;->f:Lt2/y;

    .line 10
    .line 11
    invoke-virtual {v0}, Lt2/y;->d()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    invoke-direct {p0, v2, v3}, LS2/z;->e(J)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v13, 0x2

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, LS2/z;->b:LS2/v;

    .line 23
    .line 24
    invoke-virtual {v0, v13}, LS2/v;->j(I)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v1, p0, LS2/z;->b:LS2/v;

    .line 28
    .line 29
    iget-wide v8, p0, LS2/z;->k:J

    .line 30
    .line 31
    const/4 v11, 0x0

    .line 32
    iget-object v12, p0, LS2/z;->c:LS2/v$a;

    .line 33
    .line 34
    const/4 v10, 0x0

    .line 35
    move-wide v4, p1

    .line 36
    move-wide/from16 v6, p3

    .line 37
    .line 38
    invoke-virtual/range {v1 .. v12}, LS2/v;->c(JJJJZZLS2/v$a;)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    const/4 v1, 0x1

    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    if-eq v0, v1, :cond_4

    .line 46
    .line 47
    if-eq v0, v13, :cond_3

    .line 48
    .line 49
    const/4 v1, 0x3

    .line 50
    if-eq v0, v1, :cond_3

    .line 51
    .line 52
    const/4 v1, 0x4

    .line 53
    if-eq v0, v1, :cond_2

    .line 54
    .line 55
    const/4 v1, 0x5

    .line 56
    if-ne v0, v1, :cond_1

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v1

    .line 69
    :cond_2
    iput-wide v2, p0, LS2/z;->h:J

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    iput-wide v2, p0, LS2/z;->h:J

    .line 73
    .line 74
    invoke-direct {p0}, LS2/z;->a()V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_4
    iput-wide v2, p0, LS2/z;->h:J

    .line 79
    .line 80
    if-nez v0, :cond_5

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_5
    const/4 v1, 0x0

    .line 84
    :goto_1
    invoke-direct {p0, v1}, LS2/z;->k(Z)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_6
    :goto_2
    return-void
.end method

.method public l()V
    .locals 4

    .line 1
    iget-wide v0, p0, LS2/z;->g:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-wide/high16 v0, -0x8000000000000000L

    .line 13
    .line 14
    iput-wide v0, p0, LS2/z;->g:J

    .line 15
    .line 16
    iput-wide v0, p0, LS2/z;->h:J

    .line 17
    .line 18
    :cond_0
    iget-wide v0, p0, LS2/z;->g:J

    .line 19
    .line 20
    iput-wide v0, p0, LS2/z;->i:J

    .line 21
    .line 22
    return-void
.end method
