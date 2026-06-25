.class final LM2/g0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LM2/C;
.implements LQ2/m$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM2/g0$b;,
        LM2/g0$c;
    }
.end annotation


# instance fields
.field private final a:Lw2/o;

.field private final b:Lw2/g$a;

.field private final c:Lw2/F;

.field private final d:LQ2/k;

.field private final e:LM2/L$a;

.field private final f:LM2/n0;

.field private final g:Ljava/util/ArrayList;

.field private final h:J

.field final i:LQ2/m;

.field final j:Lq2/x;

.field final k:Z

.field l:Z

.field m:[B

.field n:I


# direct methods
.method public constructor <init>(Lw2/o;Lw2/g$a;Lw2/F;Lq2/x;JLQ2/k;LM2/L$a;ZLR2/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM2/g0;->a:Lw2/o;

    .line 5
    .line 6
    iput-object p2, p0, LM2/g0;->b:Lw2/g$a;

    .line 7
    .line 8
    iput-object p3, p0, LM2/g0;->c:Lw2/F;

    .line 9
    .line 10
    iput-object p4, p0, LM2/g0;->j:Lq2/x;

    .line 11
    .line 12
    iput-wide p5, p0, LM2/g0;->h:J

    .line 13
    .line 14
    iput-object p7, p0, LM2/g0;->d:LQ2/k;

    .line 15
    .line 16
    iput-object p8, p0, LM2/g0;->e:LM2/L$a;

    .line 17
    .line 18
    iput-boolean p9, p0, LM2/g0;->k:Z

    .line 19
    .line 20
    new-instance p1, LM2/n0;

    .line 21
    .line 22
    new-instance p2, Lq2/a0;

    .line 23
    .line 24
    filled-new-array {p4}, [Lq2/x;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    invoke-direct {p2, p3}, Lq2/a0;-><init>([Lq2/x;)V

    .line 29
    .line 30
    .line 31
    filled-new-array {p2}, [Lq2/a0;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-direct {p1, p2}, LM2/n0;-><init>([Lq2/a0;)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, LM2/g0;->f:LM2/n0;

    .line 39
    .line 40
    new-instance p1, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, LM2/g0;->g:Ljava/util/ArrayList;

    .line 46
    .line 47
    if-eqz p10, :cond_0

    .line 48
    .line 49
    new-instance p1, LQ2/m;

    .line 50
    .line 51
    invoke-direct {p1, p10}, LQ2/m;-><init>(LR2/a;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    new-instance p1, LQ2/m;

    .line 56
    .line 57
    const-string p2, "SingleSampleMediaPeriod"

    .line 58
    .line 59
    invoke-direct {p1, p2}, LQ2/m;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :goto_0
    iput-object p1, p0, LM2/g0;->i:LQ2/m;

    .line 63
    .line 64
    return-void
.end method

.method static synthetic b(LM2/g0;)LM2/L$a;
    .locals 0

    .line 1
    iget-object p0, p0, LM2/g0;->e:LM2/L$a;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a(Landroidx/media3/exoplayer/q0;)Z
    .locals 3

    .line 1
    iget-boolean p1, p0, LM2/g0;->l:Z

    .line 2
    .line 3
    if-nez p1, :cond_2

    .line 4
    .line 5
    iget-object p1, p0, LM2/g0;->i:LQ2/m;

    .line 6
    .line 7
    invoke-virtual {p1}, LQ2/m;->j()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_2

    .line 12
    .line 13
    iget-object p1, p0, LM2/g0;->i:LQ2/m;

    .line 14
    .line 15
    invoke-virtual {p1}, LQ2/m;->i()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p1, p0, LM2/g0;->b:Lw2/g$a;

    .line 23
    .line 24
    invoke-interface {p1}, Lw2/g$a;->a()Lw2/g;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object v0, p0, LM2/g0;->c:Lw2/F;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-interface {p1, v0}, Lw2/g;->i(Lw2/F;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    new-instance v0, LM2/g0$c;

    .line 36
    .line 37
    iget-object v1, p0, LM2/g0;->a:Lw2/o;

    .line 38
    .line 39
    invoke-direct {v0, v1, p1}, LM2/g0$c;-><init>(Lw2/o;Lw2/g;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, LM2/g0;->i:LQ2/m;

    .line 43
    .line 44
    iget-object v1, p0, LM2/g0;->d:LQ2/k;

    .line 45
    .line 46
    const/4 v2, 0x1

    .line 47
    invoke-interface {v1, v2}, LQ2/k;->a(I)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-virtual {p1, v0, p0, v1}, LQ2/m;->n(LQ2/m$e;LQ2/m$b;I)J

    .line 52
    .line 53
    .line 54
    return v2

    .line 55
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 56
    return p1
.end method

.method public c()J
    .locals 2

    .line 1
    iget-boolean v0, p0, LM2/g0;->l:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, LM2/g0;->i:LQ2/m;

    .line 6
    .line 7
    invoke-virtual {v0}, LQ2/m;->j()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_1
    :goto_0
    const-wide/high16 v0, -0x8000000000000000L

    .line 18
    .line 19
    return-wide v0
.end method

.method public d(JLA2/Q;)J
    .locals 0

    .line 1
    return-wide p1
.end method

.method public e(LM2/g0$c;JJZ)V
    .locals 13

    .line 1
    invoke-static {p1}, LM2/g0$c;->b(LM2/g0$c;)Lw2/D;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LM2/y;

    .line 6
    .line 7
    iget-wide v2, p1, LM2/g0$c;->a:J

    .line 8
    .line 9
    iget-object v4, p1, LM2/g0$c;->b:Lw2/o;

    .line 10
    .line 11
    invoke-virtual {v0}, Lw2/D;->q()Landroid/net/Uri;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-virtual {v0}, Lw2/D;->r()Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    invoke-virtual {v0}, Lw2/D;->p()J

    .line 20
    .line 21
    .line 22
    move-result-wide v11

    .line 23
    move-wide v7, p2

    .line 24
    move-wide/from16 v9, p4

    .line 25
    .line 26
    invoke-direct/range {v1 .. v12}, LM2/y;-><init>(JLw2/o;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, LM2/g0;->d:LQ2/k;

    .line 30
    .line 31
    iget-wide v2, p1, LM2/g0$c;->a:J

    .line 32
    .line 33
    invoke-interface {v0, v2, v3}, LQ2/k;->d(J)V

    .line 34
    .line 35
    .line 36
    move-object v2, v1

    .line 37
    iget-object v1, p0, LM2/g0;->e:LM2/L$a;

    .line 38
    .line 39
    const-wide/16 v8, 0x0

    .line 40
    .line 41
    iget-wide v10, p0, LM2/g0;->h:J

    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    const/4 v4, -0x1

    .line 45
    const/4 v5, 0x0

    .line 46
    const/4 v6, 0x0

    .line 47
    const/4 v7, 0x0

    .line 48
    invoke-virtual/range {v1 .. v11}, LM2/L$a;->m(LM2/y;IILq2/x;ILjava/lang/Object;JJ)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public f()J
    .locals 2

    .line 1
    iget-boolean v0, p0, LM2/g0;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-wide/high16 v0, -0x8000000000000000L

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    return-wide v0
.end method

.method public g(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic h(LQ2/m$e;JJZ)V
    .locals 0

    .line 1
    check-cast p1, LM2/g0$c;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p6}, LM2/g0;->e(LM2/g0$c;JJZ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public i(J)J
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, LM2/g0;->g:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, LM2/g0;->g:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, LM2/g0$b;

    .line 17
    .line 18
    invoke-virtual {v1}, LM2/g0$b;->c()V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-wide p1
.end method

.method public bridge synthetic j(LQ2/m$e;JJ)V
    .locals 0

    .line 1
    check-cast p1, LM2/g0$c;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, LM2/g0;->m(LM2/g0$c;JJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k()J
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    return-wide v0
.end method

.method public l(LM2/C$a;J)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, LM2/C$a;->b(LM2/C;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public m(LM2/g0$c;JJ)V
    .locals 13

    .line 1
    invoke-static {p1}, LM2/g0$c;->b(LM2/g0$c;)Lw2/D;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lw2/D;->p()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    long-to-int v0, v0

    .line 10
    iput v0, p0, LM2/g0;->n:I

    .line 11
    .line 12
    invoke-static {p1}, LM2/g0$c;->d(LM2/g0$c;)[B

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, [B

    .line 21
    .line 22
    iput-object v0, p0, LM2/g0;->m:[B

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, LM2/g0;->l:Z

    .line 26
    .line 27
    invoke-static {p1}, LM2/g0$c;->b(LM2/g0$c;)Lw2/D;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, LM2/y;

    .line 32
    .line 33
    iget-wide v2, p1, LM2/g0$c;->a:J

    .line 34
    .line 35
    iget-object v4, p1, LM2/g0$c;->b:Lw2/o;

    .line 36
    .line 37
    invoke-virtual {v0}, Lw2/D;->q()Landroid/net/Uri;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-virtual {v0}, Lw2/D;->r()Ljava/util/Map;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    iget v0, p0, LM2/g0;->n:I

    .line 46
    .line 47
    int-to-long v11, v0

    .line 48
    move-wide v7, p2

    .line 49
    move-wide/from16 v9, p4

    .line 50
    .line 51
    invoke-direct/range {v1 .. v12}, LM2/y;-><init>(JLw2/o;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, LM2/g0;->d:LQ2/k;

    .line 55
    .line 56
    iget-wide v2, p1, LM2/g0$c;->a:J

    .line 57
    .line 58
    invoke-interface {v0, v2, v3}, LQ2/k;->d(J)V

    .line 59
    .line 60
    .line 61
    move-object v2, v1

    .line 62
    iget-object v1, p0, LM2/g0;->e:LM2/L$a;

    .line 63
    .line 64
    iget-object v5, p0, LM2/g0;->j:Lq2/x;

    .line 65
    .line 66
    const-wide/16 v8, 0x0

    .line 67
    .line 68
    iget-wide v10, p0, LM2/g0;->h:J

    .line 69
    .line 70
    const/4 v3, 0x1

    .line 71
    const/4 v4, -0x1

    .line 72
    const/4 v6, 0x0

    .line 73
    const/4 v7, 0x0

    .line 74
    invoke-virtual/range {v1 .. v11}, LM2/L$a;->p(LM2/y;IILq2/x;ILjava/lang/Object;JJ)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public bridge synthetic n(LQ2/m$e;JJLjava/io/IOException;I)LQ2/m$c;
    .locals 0

    .line 1
    check-cast p1, LM2/g0$c;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p7}, LM2/g0;->p(LM2/g0$c;JJLjava/io/IOException;I)LQ2/m$c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public o()V
    .locals 0

    .line 1
    return-void
.end method

.method public p(LM2/g0$c;JJLjava/io/IOException;I)LQ2/m$c;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v13, p6

    .line 6
    .line 7
    move/from16 v2, p7

    .line 8
    .line 9
    invoke-static {v1}, LM2/g0$c;->b(LM2/g0$c;)Lw2/D;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    new-instance v14, LM2/y;

    .line 14
    .line 15
    iget-wide v4, v1, LM2/g0$c;->a:J

    .line 16
    .line 17
    iget-object v6, v1, LM2/g0$c;->b:Lw2/o;

    .line 18
    .line 19
    invoke-virtual {v3}, Lw2/D;->q()Landroid/net/Uri;

    .line 20
    .line 21
    .line 22
    move-result-object v18

    .line 23
    invoke-virtual {v3}, Lw2/D;->r()Ljava/util/Map;

    .line 24
    .line 25
    .line 26
    move-result-object v19

    .line 27
    invoke-virtual {v3}, Lw2/D;->p()J

    .line 28
    .line 29
    .line 30
    move-result-wide v24

    .line 31
    move-wide/from16 v20, p2

    .line 32
    .line 33
    move-wide/from16 v22, p4

    .line 34
    .line 35
    move-wide v15, v4

    .line 36
    move-object/from16 v17, v6

    .line 37
    .line 38
    invoke-direct/range {v14 .. v25}, LM2/y;-><init>(JLw2/o;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 39
    .line 40
    .line 41
    new-instance v3, LM2/B;

    .line 42
    .line 43
    iget-object v6, v0, LM2/g0;->j:Lq2/x;

    .line 44
    .line 45
    iget-wide v4, v0, LM2/g0;->h:J

    .line 46
    .line 47
    invoke-static {v4, v5}, Lt2/a0;->F1(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide v11

    .line 51
    const/4 v4, 0x1

    .line 52
    const/4 v5, -0x1

    .line 53
    const/4 v7, 0x0

    .line 54
    const/4 v8, 0x0

    .line 55
    const-wide/16 v9, 0x0

    .line 56
    .line 57
    invoke-direct/range {v3 .. v12}, LM2/B;-><init>(IILq2/x;ILjava/lang/Object;JJ)V

    .line 58
    .line 59
    .line 60
    iget-object v4, v0, LM2/g0;->d:LQ2/k;

    .line 61
    .line 62
    new-instance v5, LQ2/k$c;

    .line 63
    .line 64
    invoke-direct {v5, v14, v3, v13, v2}, LQ2/k$c;-><init>(LM2/y;LM2/B;Ljava/io/IOException;I)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v4, v5}, LQ2/k;->c(LQ2/k$c;)J

    .line 68
    .line 69
    .line 70
    move-result-wide v3

    .line 71
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    cmp-long v5, v3, v5

    .line 77
    .line 78
    const/4 v6, 0x0

    .line 79
    const/4 v7, 0x1

    .line 80
    if-eqz v5, :cond_1

    .line 81
    .line 82
    iget-object v8, v0, LM2/g0;->d:LQ2/k;

    .line 83
    .line 84
    invoke-interface {v8, v7}, LQ2/k;->a(I)I

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    if-lt v2, v8, :cond_0

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    move v2, v6

    .line 92
    goto :goto_1

    .line 93
    :cond_1
    :goto_0
    move v2, v7

    .line 94
    :goto_1
    iget-boolean v8, v0, LM2/g0;->k:Z

    .line 95
    .line 96
    if-eqz v8, :cond_2

    .line 97
    .line 98
    if-eqz v2, :cond_2

    .line 99
    .line 100
    const-string v2, "SingleSampleMediaPeriod"

    .line 101
    .line 102
    const-string v3, "Loading failed, treating as end-of-stream."

    .line 103
    .line 104
    invoke-static {v2, v3, v13}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    iput-boolean v7, v0, LM2/g0;->l:Z

    .line 108
    .line 109
    sget-object v2, LQ2/m;->f:LQ2/m$c;

    .line 110
    .line 111
    :goto_2
    move-object v15, v2

    .line 112
    goto :goto_3

    .line 113
    :cond_2
    if-eqz v5, :cond_3

    .line 114
    .line 115
    invoke-static {v6, v3, v4}, LQ2/m;->h(ZJ)LQ2/m$c;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    goto :goto_2

    .line 120
    :cond_3
    sget-object v2, LQ2/m;->g:LQ2/m$c;

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :goto_3
    invoke-virtual {v15}, LQ2/m$c;->c()Z

    .line 124
    .line 125
    .line 126
    move-result v16

    .line 127
    move-object v3, v14

    .line 128
    xor-int/lit8 v14, v16, 0x1

    .line 129
    .line 130
    iget-object v2, v0, LM2/g0;->e:LM2/L$a;

    .line 131
    .line 132
    iget-object v6, v0, LM2/g0;->j:Lq2/x;

    .line 133
    .line 134
    const-wide/16 v9, 0x0

    .line 135
    .line 136
    iget-wide v11, v0, LM2/g0;->h:J

    .line 137
    .line 138
    const/4 v4, 0x1

    .line 139
    const/4 v5, -0x1

    .line 140
    const/4 v7, 0x0

    .line 141
    const/4 v8, 0x0

    .line 142
    invoke-virtual/range {v2 .. v14}, LM2/L$a;->r(LM2/y;IILq2/x;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    .line 143
    .line 144
    .line 145
    if-nez v16, :cond_4

    .line 146
    .line 147
    iget-object v2, v0, LM2/g0;->d:LQ2/k;

    .line 148
    .line 149
    iget-wide v3, v1, LM2/g0$c;->a:J

    .line 150
    .line 151
    invoke-interface {v2, v3, v4}, LQ2/k;->d(J)V

    .line 152
    .line 153
    .line 154
    :cond_4
    return-object v15
.end method

.method public q()Z
    .locals 1

    .line 1
    iget-object v0, p0, LM2/g0;->i:LQ2/m;

    .line 2
    .line 3
    invoke-virtual {v0}, LQ2/m;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public r([LP2/A;[Z[LM2/c0;[ZJ)J
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p1

    .line 3
    if-ge v0, v1, :cond_3

    .line 4
    .line 5
    aget-object v1, p3, v0

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    aget-object v3, p1, v0

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    aget-boolean v3, p2, v0

    .line 15
    .line 16
    if-nez v3, :cond_1

    .line 17
    .line 18
    :cond_0
    iget-object v3, p0, LM2/g0;->g:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    aput-object v2, p3, v0

    .line 24
    .line 25
    :cond_1
    aget-object v1, p3, v0

    .line 26
    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    aget-object v1, p1, v0

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    new-instance v1, LM2/g0$b;

    .line 34
    .line 35
    invoke-direct {v1, p0, v2}, LM2/g0$b;-><init>(LM2/g0;LM2/g0$a;)V

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, LM2/g0;->g:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    aput-object v1, p3, v0

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    aput-boolean v1, p4, v0

    .line 47
    .line 48
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    return-wide p5
.end method

.method public s()LM2/n0;
    .locals 1

    .line 1
    iget-object v0, p0, LM2/g0;->f:LM2/n0;

    .line 2
    .line 3
    return-object v0
.end method

.method public t(LM2/g0$c;JJI)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-static {v1}, LM2/g0$c;->b(LM2/g0$c;)Lw2/D;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-nez p6, :cond_0

    .line 10
    .line 11
    new-instance v3, LM2/y;

    .line 12
    .line 13
    iget-wide v4, v1, LM2/g0$c;->a:J

    .line 14
    .line 15
    iget-object v6, v1, LM2/g0$c;->b:Lw2/o;

    .line 16
    .line 17
    move-wide/from16 v7, p2

    .line 18
    .line 19
    invoke-direct/range {v3 .. v8}, LM2/y;-><init>(JLw2/o;J)V

    .line 20
    .line 21
    .line 22
    move-object v6, v3

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v4, LM2/y;

    .line 25
    .line 26
    iget-wide v5, v1, LM2/g0$c;->a:J

    .line 27
    .line 28
    iget-object v7, v1, LM2/g0$c;->b:Lw2/o;

    .line 29
    .line 30
    invoke-virtual {v2}, Lw2/D;->q()Landroid/net/Uri;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    invoke-virtual {v2}, Lw2/D;->r()Ljava/util/Map;

    .line 35
    .line 36
    .line 37
    move-result-object v9

    .line 38
    invoke-virtual {v2}, Lw2/D;->p()J

    .line 39
    .line 40
    .line 41
    move-result-wide v14

    .line 42
    move-wide/from16 v10, p2

    .line 43
    .line 44
    move-wide/from16 v12, p4

    .line 45
    .line 46
    invoke-direct/range {v4 .. v15}, LM2/y;-><init>(JLw2/o;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 47
    .line 48
    .line 49
    move-object v6, v4

    .line 50
    :goto_0
    iget-object v5, v0, LM2/g0;->e:LM2/L$a;

    .line 51
    .line 52
    iget-object v9, v0, LM2/g0;->j:Lq2/x;

    .line 53
    .line 54
    const-wide/16 v12, 0x0

    .line 55
    .line 56
    iget-wide v14, v0, LM2/g0;->h:J

    .line 57
    .line 58
    const/4 v7, 0x1

    .line 59
    const/4 v8, -0x1

    .line 60
    const/4 v10, 0x0

    .line 61
    const/4 v11, 0x0

    .line 62
    move/from16 v16, p6

    .line 63
    .line 64
    invoke-virtual/range {v5 .. v16}, LM2/L$a;->v(LM2/y;IILq2/x;ILjava/lang/Object;JJI)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public u(JZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic v(LQ2/m$e;JJI)V
    .locals 0

    .line 1
    check-cast p1, LM2/g0$c;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p6}, LM2/g0;->t(LM2/g0$c;JJI)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public w()V
    .locals 1

    .line 1
    iget-object v0, p0, LM2/g0;->i:LQ2/m;

    .line 2
    .line 3
    invoke-virtual {v0}, LQ2/m;->l()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
