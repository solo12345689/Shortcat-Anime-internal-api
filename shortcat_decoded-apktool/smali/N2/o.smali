.class public final LN2/o;
.super LN2/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final o:I

.field private final p:Lq2/x;

.field private q:J

.field private r:Z


# direct methods
.method public constructor <init>(Lw2/g;Lw2/o;Lq2/x;ILjava/lang/Object;JJJILq2/x;)V
    .locals 16

    .line 1
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    move-object/from16 v0, p0

    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    move-object/from16 v2, p2

    .line 16
    .line 17
    move-object/from16 v3, p3

    .line 18
    .line 19
    move/from16 v4, p4

    .line 20
    .line 21
    move-object/from16 v5, p5

    .line 22
    .line 23
    move-wide/from16 v6, p6

    .line 24
    .line 25
    move-wide/from16 v8, p8

    .line 26
    .line 27
    move-wide/from16 v14, p10

    .line 28
    .line 29
    invoke-direct/range {v0 .. v15}, LN2/a;-><init>(Lw2/g;Lw2/o;Lq2/x;ILjava/lang/Object;JJJJJ)V

    .line 30
    .line 31
    .line 32
    move/from16 v1, p12

    .line 33
    .line 34
    iput v1, v0, LN2/o;->o:I

    .line 35
    .line 36
    move-object/from16 v1, p13

    .line 37
    .line 38
    iput-object v1, v0, LN2/o;->p:Lq2/x;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public a()V
    .locals 10

    .line 1
    invoke-virtual {p0}, LN2/a;->j()LN2/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, LN2/c;->b(J)V

    .line 8
    .line 9
    .line 10
    iget v1, p0, LN2/o;->o:I

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v2, v1}, LN2/c;->e(II)LU2/O;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    iget-object v0, p0, LN2/o;->p:Lq2/x;

    .line 18
    .line 19
    invoke-interface {v3, v0}, LU2/O;->c(Lq2/x;)V

    .line 20
    .line 21
    .line 22
    :try_start_0
    iget-object v0, p0, LN2/e;->b:Lw2/o;

    .line 23
    .line 24
    iget-wide v4, p0, LN2/o;->q:J

    .line 25
    .line 26
    invoke-virtual {v0, v4, v5}, Lw2/o;->e(J)Lw2/o;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, LN2/e;->i:Lw2/D;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Lw2/D;->a(Lw2/o;)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    const-wide/16 v4, -0x1

    .line 37
    .line 38
    cmp-long v4, v0, v4

    .line 39
    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    iget-wide v4, p0, LN2/o;->q:J

    .line 43
    .line 44
    add-long/2addr v0, v4

    .line 45
    :cond_0
    move-wide v8, v0

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    goto :goto_2

    .line 49
    :goto_0
    new-instance v4, LU2/j;

    .line 50
    .line 51
    iget-object v5, p0, LN2/e;->i:Lw2/D;

    .line 52
    .line 53
    iget-wide v6, p0, LN2/o;->q:J

    .line 54
    .line 55
    invoke-direct/range {v4 .. v9}, LU2/j;-><init>(Lq2/m;JJ)V

    .line 56
    .line 57
    .line 58
    :goto_1
    const/4 v0, -0x1

    .line 59
    const/4 v1, 0x1

    .line 60
    if-eq v2, v0, :cond_1

    .line 61
    .line 62
    iget-wide v5, p0, LN2/o;->q:J

    .line 63
    .line 64
    int-to-long v7, v2

    .line 65
    add-long/2addr v5, v7

    .line 66
    iput-wide v5, p0, LN2/o;->q:J

    .line 67
    .line 68
    const v0, 0x7fffffff

    .line 69
    .line 70
    .line 71
    invoke-interface {v3, v4, v0, v1}, LU2/O;->e(Lq2/m;IZ)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    goto :goto_1

    .line 76
    :cond_1
    iget-wide v4, p0, LN2/o;->q:J

    .line 77
    .line 78
    long-to-int v7, v4

    .line 79
    iget-wide v4, p0, LN2/e;->g:J

    .line 80
    .line 81
    const/4 v8, 0x0

    .line 82
    const/4 v9, 0x0

    .line 83
    const/4 v6, 0x1

    .line 84
    invoke-interface/range {v3 .. v9}, LU2/O;->a(JIIILU2/O$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, LN2/e;->i:Lw2/D;

    .line 88
    .line 89
    invoke-static {v0}, Lw2/n;->a(Lw2/g;)V

    .line 90
    .line 91
    .line 92
    iput-boolean v1, p0, LN2/o;->r:Z

    .line 93
    .line 94
    return-void

    .line 95
    :goto_2
    iget-object v1, p0, LN2/e;->i:Lw2/D;

    .line 96
    .line 97
    invoke-static {v1}, Lw2/n;->a(Lw2/g;)V

    .line 98
    .line 99
    .line 100
    throw v0
.end method

.method public c()V
    .locals 0

    .line 1
    return-void
.end method

.method public h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LN2/o;->r:Z

    .line 2
    .line 3
    return v0
.end method
