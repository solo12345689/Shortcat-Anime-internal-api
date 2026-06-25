.class public final LM2/X;
.super LM2/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LM2/W$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM2/X$b;
    }
.end annotation


# instance fields
.field private final h:Lw2/g$a;

.field private final i:LM2/Q$a;

.field private final j:LF2/u;

.field private final k:LQ2/k;

.field private final l:I

.field private final m:I

.field private final n:Lq2/x;

.field private final o:LO9/t;

.field private p:Z

.field private q:J

.field private r:Z

.field private s:Z

.field private t:Lw2/F;

.field private u:Lq2/C;


# direct methods
.method private constructor <init>(Lq2/C;Lw2/g$a;LM2/Q$a;LF2/u;LQ2/k;IILq2/x;LO9/t;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LM2/a;-><init>()V

    .line 3
    iput-object p1, p0, LM2/X;->u:Lq2/C;

    .line 4
    iput-object p2, p0, LM2/X;->h:Lw2/g$a;

    .line 5
    iput-object p3, p0, LM2/X;->i:LM2/Q$a;

    .line 6
    iput-object p4, p0, LM2/X;->j:LF2/u;

    .line 7
    iput-object p5, p0, LM2/X;->k:LQ2/k;

    .line 8
    iput p6, p0, LM2/X;->l:I

    .line 9
    iput-object p8, p0, LM2/X;->n:Lq2/x;

    .line 10
    iput p7, p0, LM2/X;->m:I

    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, LM2/X;->p:Z

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    iput-wide p1, p0, LM2/X;->q:J

    .line 13
    iput-object p9, p0, LM2/X;->o:LO9/t;

    return-void
.end method

.method synthetic constructor <init>(Lq2/C;Lw2/g$a;LM2/Q$a;LF2/u;LQ2/k;IILq2/x;LO9/t;LM2/X$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p9}, LM2/X;-><init>(Lq2/C;Lw2/g$a;LM2/Q$a;LF2/u;LQ2/k;IILq2/x;LO9/t;)V

    return-void
.end method

.method private D()Lq2/C$h;
    .locals 1

    .line 1
    invoke-virtual {p0}, LM2/X;->a()Lq2/C;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lq2/C;->b:Lq2/C$h;

    .line 6
    .line 7
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lq2/C$h;

    .line 12
    .line 13
    return-object v0
.end method

.method private E()V
    .locals 8

    .line 1
    new-instance v0, LM2/f0;

    .line 2
    .line 3
    iget-wide v1, p0, LM2/X;->q:J

    .line 4
    .line 5
    iget-boolean v3, p0, LM2/X;->r:Z

    .line 6
    .line 7
    iget-boolean v5, p0, LM2/X;->s:Z

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    invoke-virtual {p0}, LM2/X;->a()Lq2/C;

    .line 11
    .line 12
    .line 13
    move-result-object v7

    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-direct/range {v0 .. v7}, LM2/f0;-><init>(JZZZLjava/lang/Object;Lq2/C;)V

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, LM2/X;->p:Z

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    new-instance v1, LM2/X$a;

    .line 23
    .line 24
    invoke-direct {v1, p0, v0}, LM2/X$a;-><init>(LM2/X;Lq2/Y;)V

    .line 25
    .line 26
    .line 27
    move-object v0, v1

    .line 28
    :cond_0
    invoke-virtual {p0, v0}, LM2/a;->B(Lq2/Y;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method protected A(Lw2/F;)V
    .locals 2

    .line 1
    iput-object p1, p0, LM2/X;->t:Lw2/F;

    .line 2
    .line 3
    iget-object p1, p0, LM2/X;->j:LF2/u;

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/os/Looper;

    .line 14
    .line 15
    invoke-virtual {p0}, LM2/a;->y()LB2/K1;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {p1, v0, v1}, LF2/u;->e(Landroid/os/Looper;LB2/K1;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, LM2/X;->j:LF2/u;

    .line 23
    .line 24
    invoke-interface {p1}, LF2/u;->s()V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, LM2/X;->E()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method protected C()V
    .locals 1

    .line 1
    iget-object v0, p0, LM2/X;->j:LF2/u;

    .line 2
    .line 3
    invoke-interface {v0}, LF2/u;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public declared-synchronized a()Lq2/C;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LM2/X;->u:Lq2/C;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method

.method public e(Lq2/C;)Z
    .locals 5

    .line 1
    invoke-direct {p0}, LM2/X;->D()Lq2/C$h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p1, p1, Lq2/C;->b:Lq2/C$h;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object v1, p1, Lq2/C$h;->a:Landroid/net/Uri;

    .line 10
    .line 11
    iget-object v2, v0, Lq2/C$h;->a:Landroid/net/Uri;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-wide v1, p1, Lq2/C$h;->j:J

    .line 20
    .line 21
    iget-wide v3, v0, Lq2/C$h;->j:J

    .line 22
    .line 23
    cmp-long v1, v1, v3

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    iget-object p1, p1, Lq2/C$h;->f:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v0, v0, Lq2/C$h;->f:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    return p1

    .line 39
    :cond_0
    const/4 p1, 0x0

    .line 40
    return p1
.end method

.method public f(LM2/D$b;LQ2/b;J)LM2/C;
    .locals 17

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    iget-object v0, v8, LM2/X;->h:Lw2/g$a;

    .line 4
    .line 5
    invoke-interface {v0}, Lw2/g$a;->a()Lw2/g;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v0, v8, LM2/X;->t:Lw2/F;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v2, v0}, Lw2/g;->i(Lw2/F;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-direct {v8}, LM2/X;->D()Lq2/C$h;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, LM2/W;

    .line 21
    .line 22
    move-object v3, v1

    .line 23
    iget-object v1, v0, Lq2/C$h;->a:Landroid/net/Uri;

    .line 24
    .line 25
    iget-object v4, v8, LM2/X;->i:LM2/Q$a;

    .line 26
    .line 27
    invoke-virtual {v8}, LM2/a;->y()LB2/K1;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-interface {v4, v5}, LM2/Q$a;->a(LB2/K1;)LM2/Q;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    move-object v5, v3

    .line 36
    move-object v3, v4

    .line 37
    iget-object v4, v8, LM2/X;->j:LF2/u;

    .line 38
    .line 39
    move-object v6, v5

    .line 40
    invoke-virtual/range {p0 .. p1}, LM2/a;->t(LM2/D$b;)LF2/t$a;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    move-object v7, v6

    .line 45
    iget-object v6, v8, LM2/X;->k:LQ2/k;

    .line 46
    .line 47
    invoke-virtual/range {p0 .. p1}, LM2/a;->v(LM2/D$b;)LM2/L$a;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    iget-object v10, v0, Lq2/C$h;->f:Ljava/lang/String;

    .line 52
    .line 53
    iget v11, v8, LM2/X;->l:I

    .line 54
    .line 55
    iget v12, v8, LM2/X;->m:I

    .line 56
    .line 57
    iget-object v13, v8, LM2/X;->n:Lq2/x;

    .line 58
    .line 59
    iget-wide v14, v0, Lq2/C$h;->j:J

    .line 60
    .line 61
    invoke-static {v14, v15}, Lt2/a0;->V0(J)J

    .line 62
    .line 63
    .line 64
    move-result-wide v14

    .line 65
    iget-object v0, v8, LM2/X;->o:LO9/t;

    .line 66
    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    invoke-interface {v0}, LO9/t;->get()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, LR2/a;

    .line 74
    .line 75
    :goto_0
    move-object/from16 v16, v0

    .line 76
    .line 77
    move-object v0, v7

    .line 78
    move-object v7, v9

    .line 79
    move-object/from16 v9, p2

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    const/4 v0, 0x0

    .line 83
    goto :goto_0

    .line 84
    :goto_1
    invoke-direct/range {v0 .. v16}, LM2/W;-><init>(Landroid/net/Uri;Lw2/g;LM2/Q;LF2/u;LF2/t$a;LQ2/k;LM2/L$a;LM2/W$c;LQ2/b;Ljava/lang/String;IILq2/x;JLR2/a;)V

    .line 85
    .line 86
    .line 87
    return-object v0
.end method

.method public g(JLU2/J;Z)V
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-wide p1, p0, LM2/X;->q:J

    .line 11
    .line 12
    :cond_0
    invoke-interface {p3}, LU2/J;->k()Z

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    iget-boolean v0, p0, LM2/X;->p:Z

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget-wide v0, p0, LM2/X;->q:J

    .line 21
    .line 22
    cmp-long v0, v0, p1

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    iget-boolean v0, p0, LM2/X;->r:Z

    .line 27
    .line 28
    if-ne v0, p3, :cond_1

    .line 29
    .line 30
    iget-boolean v0, p0, LM2/X;->s:Z

    .line 31
    .line 32
    if-ne v0, p4, :cond_1

    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    iput-wide p1, p0, LM2/X;->q:J

    .line 36
    .line 37
    iput-boolean p3, p0, LM2/X;->r:Z

    .line 38
    .line 39
    iput-boolean p4, p0, LM2/X;->s:Z

    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    iput-boolean p1, p0, LM2/X;->p:Z

    .line 43
    .line 44
    invoke-direct {p0}, LM2/X;->E()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public declared-synchronized j(Lq2/C;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, LM2/X;->u:Lq2/C;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public l()V
    .locals 0

    .line 1
    return-void
.end method

.method public m(LM2/C;)V
    .locals 0

    .line 1
    check-cast p1, LM2/W;

    .line 2
    .line 3
    invoke-virtual {p1}, LM2/W;->f0()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
