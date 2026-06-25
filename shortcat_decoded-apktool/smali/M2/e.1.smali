.class public final LM2/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LM2/C;
.implements LM2/C$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM2/e$a;
    }
.end annotation


# instance fields
.field public final a:LM2/C;

.field private b:LM2/C$a;

.field private c:[LM2/e$a;

.field private d:J

.field e:J

.field f:J

.field private g:LM2/f$d;


# direct methods
.method public constructor <init>(LM2/C;ZJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM2/e;->a:LM2/C;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    new-array p1, p1, [LM2/e$a;

    .line 8
    .line 9
    iput-object p1, p0, LM2/e;->c:[LM2/e$a;

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    move-wide p1, p3

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    :goto_0
    iput-wide p1, p0, LM2/e;->d:J

    .line 21
    .line 22
    iput-wide p3, p0, LM2/e;->e:J

    .line 23
    .line 24
    iput-wide p5, p0, LM2/e;->f:J

    .line 25
    .line 26
    return-void
.end method

.method private h(JLA2/Q;)LA2/Q;
    .locals 8

    .line 1
    iget-wide v0, p3, LA2/Q;->a:J

    .line 2
    .line 3
    iget-wide v2, p0, LM2/e;->e:J

    .line 4
    .line 5
    sub-long v4, p1, v2

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    invoke-static/range {v0 .. v5}, Lt2/a0;->s(JJJ)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iget-wide v2, p3, LA2/Q;->b:J

    .line 14
    .line 15
    iget-wide v4, p0, LM2/e;->f:J

    .line 16
    .line 17
    const-wide/high16 v6, -0x8000000000000000L

    .line 18
    .line 19
    cmp-long v6, v4, v6

    .line 20
    .line 21
    if-nez v6, :cond_0

    .line 22
    .line 23
    const-wide p1, 0x7fffffffffffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    :goto_0
    move-wide v6, p1

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    sub-long p1, v4, p1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    const-wide/16 v4, 0x0

    .line 34
    .line 35
    invoke-static/range {v2 .. v7}, Lt2/a0;->s(JJJ)J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    iget-wide v2, p3, LA2/Q;->a:J

    .line 40
    .line 41
    cmp-long v2, v0, v2

    .line 42
    .line 43
    if-nez v2, :cond_1

    .line 44
    .line 45
    iget-wide v2, p3, LA2/Q;->b:J

    .line 46
    .line 47
    cmp-long v2, p1, v2

    .line 48
    .line 49
    if-nez v2, :cond_1

    .line 50
    .line 51
    return-object p3

    .line 52
    :cond_1
    new-instance p3, LA2/Q;

    .line 53
    .line 54
    invoke-direct {p3, v0, v1, p1, p2}, LA2/Q;-><init>(JJ)V

    .line 55
    .line 56
    .line 57
    return-object p3
.end method

.method private static n(JJJ)J
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->max(JJ)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    const-wide/high16 p2, -0x8000000000000000L

    .line 6
    .line 7
    cmp-long p2, p4, p2

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-static {p0, p1, p4, p5}, Ljava/lang/Math;->min(JJ)J

    .line 12
    .line 13
    .line 14
    move-result-wide p0

    .line 15
    :cond_0
    return-wide p0
.end method

.method private static w(JJ[LP2/A;)Z
    .locals 2

    .line 1
    cmp-long p2, p0, p2

    .line 2
    .line 3
    const/4 p3, 0x1

    .line 4
    if-gez p2, :cond_0

    .line 5
    .line 6
    return p3

    .line 7
    :cond_0
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    cmp-long p0, p0, v0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    if-eqz p0, :cond_2

    .line 13
    .line 14
    array-length p0, p4

    .line 15
    move p2, p1

    .line 16
    :goto_0
    if-ge p2, p0, :cond_2

    .line 17
    .line 18
    aget-object v0, p4, p2

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-interface {v0}, LP2/A;->q()Lq2/x;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, v0, Lq2/x;->o:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v0, v0, Lq2/x;->k:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v1, v0}, Lq2/K;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    return p3

    .line 37
    :cond_1
    add-int/lit8 p2, p2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    return p1
.end method


# virtual methods
.method public a(Landroidx/media3/exoplayer/q0;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LM2/e;->a:LM2/C;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LM2/C;->a(Landroidx/media3/exoplayer/q0;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public b(LM2/C;)V
    .locals 0

    .line 1
    iget-object p1, p0, LM2/e;->g:LM2/f$d;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object p1, p0, LM2/e;->b:LM2/C$a;

    .line 7
    .line 8
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, LM2/C$a;

    .line 13
    .line 14
    invoke-interface {p1, p0}, LM2/C$a;->b(LM2/C;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public c()J
    .locals 7

    .line 1
    iget-object v0, p0, LM2/e;->a:LM2/C;

    .line 2
    .line 3
    invoke-interface {v0}, LM2/C;->c()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/high16 v2, -0x8000000000000000L

    .line 8
    .line 9
    cmp-long v4, v0, v2

    .line 10
    .line 11
    if-eqz v4, :cond_1

    .line 12
    .line 13
    iget-wide v4, p0, LM2/e;->f:J

    .line 14
    .line 15
    cmp-long v6, v4, v2

    .line 16
    .line 17
    if-eqz v6, :cond_0

    .line 18
    .line 19
    cmp-long v4, v0, v4

    .line 20
    .line 21
    if-ltz v4, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-wide v0

    .line 25
    :cond_1
    :goto_0
    return-wide v2
.end method

.method public d(JLA2/Q;)J
    .locals 3

    .line 1
    iget-wide v0, p0, LM2/e;->e:J

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    invoke-direct {p0, p1, p2, p3}, LM2/e;->h(JLA2/Q;)LA2/Q;

    .line 9
    .line 10
    .line 11
    move-result-object p3

    .line 12
    iget-object v0, p0, LM2/e;->a:LM2/C;

    .line 13
    .line 14
    invoke-interface {v0, p1, p2, p3}, LM2/C;->d(JLA2/Q;)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    return-wide p1
.end method

.method public f()J
    .locals 7

    .line 1
    iget-object v0, p0, LM2/e;->a:LM2/C;

    .line 2
    .line 3
    invoke-interface {v0}, LM2/C;->f()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/high16 v2, -0x8000000000000000L

    .line 8
    .line 9
    cmp-long v4, v0, v2

    .line 10
    .line 11
    if-eqz v4, :cond_1

    .line 12
    .line 13
    iget-wide v4, p0, LM2/e;->f:J

    .line 14
    .line 15
    cmp-long v6, v4, v2

    .line 16
    .line 17
    if-eqz v6, :cond_0

    .line 18
    .line 19
    cmp-long v4, v0, v4

    .line 20
    .line 21
    if-ltz v4, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-wide v0

    .line 25
    :cond_1
    :goto_0
    return-wide v2
.end method

.method public g(J)V
    .locals 1

    .line 1
    iget-object v0, p0, LM2/e;->a:LM2/C;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LM2/C;->g(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public i(J)J
    .locals 7

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, LM2/e;->d:J

    .line 7
    .line 8
    iget-object v0, p0, LM2/e;->c:[LM2/e$a;

    .line 9
    .line 10
    array-length v1, v0

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v1, :cond_1

    .line 13
    .line 14
    aget-object v3, v0, v2

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    invoke-virtual {v3}, LM2/e$a;->a()V

    .line 19
    .line 20
    .line 21
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object v0, p0, LM2/e;->a:LM2/C;

    .line 25
    .line 26
    invoke-interface {v0, p1, p2}, LM2/C;->i(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v1

    .line 30
    iget-wide v3, p0, LM2/e;->e:J

    .line 31
    .line 32
    iget-wide v5, p0, LM2/e;->f:J

    .line 33
    .line 34
    invoke-static/range {v1 .. v6}, LM2/e;->n(JJJ)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    return-wide p1
.end method

.method public bridge synthetic j(LM2/d0;)V
    .locals 0

    .line 1
    check-cast p1, LM2/C;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LM2/e;->t(LM2/C;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k()J
    .locals 9

    .line 1
    invoke-virtual {p0}, LM2/e;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-wide v3, p0, LM2/e;->d:J

    .line 13
    .line 14
    iput-wide v1, p0, LM2/e;->d:J

    .line 15
    .line 16
    invoke-virtual {p0}, LM2/e;->k()J

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    cmp-long v0, v5, v1

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    return-wide v5

    .line 25
    :cond_0
    return-wide v3

    .line 26
    :cond_1
    iget-object v0, p0, LM2/e;->a:LM2/C;

    .line 27
    .line 28
    invoke-interface {v0}, LM2/C;->k()J

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    cmp-long v0, v3, v1

    .line 33
    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    return-wide v1

    .line 37
    :cond_2
    iget-wide v5, p0, LM2/e;->e:J

    .line 38
    .line 39
    iget-wide v7, p0, LM2/e;->f:J

    .line 40
    .line 41
    invoke-static/range {v3 .. v8}, LM2/e;->n(JJJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    return-wide v0
.end method

.method public l(LM2/C$a;J)V
    .locals 0

    .line 1
    iput-object p1, p0, LM2/e;->b:LM2/C$a;

    .line 2
    .line 3
    iget-object p1, p0, LM2/e;->a:LM2/C;

    .line 4
    .line 5
    invoke-interface {p1, p0, p2, p3}, LM2/C;->l(LM2/C$a;J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public o()V
    .locals 1

    .line 1
    iget-object v0, p0, LM2/e;->g:LM2/f$d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LM2/e;->a:LM2/C;

    .line 6
    .line 7
    invoke-interface {v0}, LM2/C;->o()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    throw v0
.end method

.method p()Z
    .locals 4

    .line 1
    iget-wide v0, p0, LM2/e;->d:J

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
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
.end method

.method public q()Z
    .locals 1

    .line 1
    iget-object v0, p0, LM2/e;->a:LM2/C;

    .line 2
    .line 3
    invoke-interface {v0}, LM2/C;->q()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public r([LP2/A;[Z[LM2/c0;[ZJ)J
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    new-array v2, v2, [LM2/e$a;

    .line 7
    .line 8
    iput-object v2, v0, LM2/e;->c:[LM2/e$a;

    .line 9
    .line 10
    array-length v2, v1

    .line 11
    new-array v6, v2, [LM2/c0;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :goto_0
    array-length v4, v1

    .line 16
    const/4 v10, 0x0

    .line 17
    if-ge v3, v4, :cond_1

    .line 18
    .line 19
    iget-object v4, v0, LM2/e;->c:[LM2/e$a;

    .line 20
    .line 21
    aget-object v5, v1, v3

    .line 22
    .line 23
    check-cast v5, LM2/e$a;

    .line 24
    .line 25
    aput-object v5, v4, v3

    .line 26
    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    iget-object v10, v5, LM2/e$a;->a:LM2/c0;

    .line 30
    .line 31
    :cond_0
    aput-object v10, v6, v3

    .line 32
    .line 33
    add-int/lit8 v3, v3, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-object v3, v0, LM2/e;->a:LM2/C;

    .line 37
    .line 38
    move-object/from16 v4, p1

    .line 39
    .line 40
    move-object/from16 v5, p2

    .line 41
    .line 42
    move-object/from16 v7, p4

    .line 43
    .line 44
    move-wide/from16 v8, p5

    .line 45
    .line 46
    invoke-interface/range {v3 .. v9}, LM2/C;->r([LP2/A;[Z[LM2/c0;[ZJ)J

    .line 47
    .line 48
    .line 49
    move-result-wide v11

    .line 50
    iget-wide v3, v0, LM2/e;->f:J

    .line 51
    .line 52
    move-wide/from16 v13, p5

    .line 53
    .line 54
    move-wide v15, v3

    .line 55
    invoke-static/range {v11 .. v16}, LM2/e;->n(JJJ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v3

    .line 59
    invoke-virtual {v0}, LM2/e;->p()Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_2

    .line 64
    .line 65
    move-object/from16 v5, p1

    .line 66
    .line 67
    move-wide/from16 v13, p5

    .line 68
    .line 69
    invoke-static {v11, v12, v13, v14, v5}, LM2/e;->w(JJ[LP2/A;)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_2

    .line 74
    .line 75
    move-wide v7, v3

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    :goto_1
    iput-wide v7, v0, LM2/e;->d:J

    .line 83
    .line 84
    :goto_2
    array-length v5, v1

    .line 85
    if-ge v2, v5, :cond_6

    .line 86
    .line 87
    aget-object v5, v6, v2

    .line 88
    .line 89
    if-nez v5, :cond_3

    .line 90
    .line 91
    iget-object v5, v0, LM2/e;->c:[LM2/e$a;

    .line 92
    .line 93
    aput-object v10, v5, v2

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_3
    iget-object v7, v0, LM2/e;->c:[LM2/e$a;

    .line 97
    .line 98
    aget-object v8, v7, v2

    .line 99
    .line 100
    if-eqz v8, :cond_4

    .line 101
    .line 102
    iget-object v8, v8, LM2/e$a;->a:LM2/c0;

    .line 103
    .line 104
    if-eq v8, v5, :cond_5

    .line 105
    .line 106
    :cond_4
    new-instance v8, LM2/e$a;

    .line 107
    .line 108
    invoke-direct {v8, v0, v5}, LM2/e$a;-><init>(LM2/e;LM2/c0;)V

    .line 109
    .line 110
    .line 111
    aput-object v8, v7, v2

    .line 112
    .line 113
    :cond_5
    :goto_3
    iget-object v5, v0, LM2/e;->c:[LM2/e$a;

    .line 114
    .line 115
    aget-object v5, v5, v2

    .line 116
    .line 117
    aput-object v5, v1, v2

    .line 118
    .line 119
    add-int/lit8 v2, v2, 0x1

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_6
    return-wide v3
.end method

.method public s()LM2/n0;
    .locals 1

    .line 1
    iget-object v0, p0, LM2/e;->a:LM2/C;

    .line 2
    .line 3
    invoke-interface {v0}, LM2/C;->s()LM2/n0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public t(LM2/C;)V
    .locals 0

    .line 1
    iget-object p1, p0, LM2/e;->b:LM2/C$a;

    .line 2
    .line 3
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LM2/C$a;

    .line 8
    .line 9
    invoke-interface {p1, p0}, LM2/d0$a;->j(LM2/d0;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public u(JZ)V
    .locals 1

    .line 1
    iget-object v0, p0, LM2/e;->a:LM2/C;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, LM2/C;->u(JZ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public v(LM2/f$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LM2/e;->g:LM2/f$d;

    .line 2
    .line 3
    return-void
.end method

.method public x(JJ)V
    .locals 0

    .line 1
    iput-wide p1, p0, LM2/e;->e:J

    .line 2
    .line 3
    iput-wide p3, p0, LM2/e;->f:J

    .line 4
    .line 5
    return-void
.end method
