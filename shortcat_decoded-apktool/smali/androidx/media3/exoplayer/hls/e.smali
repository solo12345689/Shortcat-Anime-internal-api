.class final Landroidx/media3/exoplayer/hls/e;
.super LN2/m;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final O:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field private final A:Z

.field private final B:Z

.field private final C:LB2/K1;

.field private final D:J

.field private E:LG2/f;

.field private F:Landroidx/media3/exoplayer/hls/l;

.field private G:I

.field private H:Z

.field private volatile I:Z

.field private J:Z

.field private K:LP9/u;

.field private L:Z

.field private M:J

.field private N:Z

.field public final k:I

.field public final l:I

.field public final m:Landroid/net/Uri;

.field public final n:Z

.field public final o:I

.field private final p:Lw2/g;

.field private final q:Lw2/o;

.field private final r:LG2/f;

.field private final s:Z

.field private final t:Z

.field private final u:Lt2/O;

.field private final v:LG2/e;

.field private final w:Ljava/util/List;

.field private final x:Lq2/q;

.field private final y:Li3/h;

.field private final z:Lt2/I;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/media3/exoplayer/hls/e;->O:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>(LG2/e;Lw2/g;Lw2/o;Lq2/x;ZLw2/g;Lw2/o;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLt2/O;JLq2/q;LG2/f;Li3/h;Lt2/I;ZZLB2/K1;)V
    .locals 13

    move-object/from16 v0, p7

    move-object v1, p0

    move-object v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p11

    move-object/from16 v6, p12

    move-wide/from16 v7, p13

    move-wide/from16 v9, p15

    move-wide/from16 v11, p17

    .line 1
    invoke-direct/range {v1 .. v12}, LN2/m;-><init>(Lw2/g;Lw2/o;Lq2/x;ILjava/lang/Object;JJJ)V

    move/from16 p2, p5

    .line 2
    iput-boolean p2, p0, Landroidx/media3/exoplayer/hls/e;->A:Z

    move/from16 p2, p19

    .line 3
    iput p2, p0, Landroidx/media3/exoplayer/hls/e;->o:I

    if-eqz p20, :cond_0

    sub-long v2, p15, p13

    goto :goto_0

    :cond_0
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    :goto_0
    iput-wide v2, p0, Landroidx/media3/exoplayer/hls/e;->M:J

    move/from16 p2, p21

    .line 5
    iput p2, p0, Landroidx/media3/exoplayer/hls/e;->l:I

    .line 6
    iput-object v0, p0, Landroidx/media3/exoplayer/hls/e;->q:Lw2/o;

    move-object/from16 p2, p6

    .line 7
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/e;->p:Lw2/g;

    if-eqz v0, :cond_1

    const/4 p2, 0x1

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    .line 8
    :goto_1
    iput-boolean p2, p0, Landroidx/media3/exoplayer/hls/e;->H:Z

    move/from16 p2, p8

    .line 9
    iput-boolean p2, p0, Landroidx/media3/exoplayer/hls/e;->B:Z

    move-object/from16 p2, p9

    .line 10
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/e;->m:Landroid/net/Uri;

    move/from16 p2, p23

    .line 11
    iput-boolean p2, p0, Landroidx/media3/exoplayer/hls/e;->s:Z

    move-object/from16 p2, p24

    .line 12
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/e;->u:Lt2/O;

    move-wide/from16 v2, p25

    .line 13
    iput-wide v2, p0, Landroidx/media3/exoplayer/hls/e;->D:J

    move/from16 p2, p22

    .line 14
    iput-boolean p2, p0, Landroidx/media3/exoplayer/hls/e;->t:Z

    .line 15
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/e;->v:LG2/e;

    move-object/from16 p1, p10

    .line 16
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/e;->w:Ljava/util/List;

    move-object/from16 p1, p27

    .line 17
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/e;->x:Lq2/q;

    move-object/from16 p1, p28

    .line 18
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/e;->r:LG2/f;

    move-object/from16 p1, p29

    .line 19
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/e;->y:Li3/h;

    move-object/from16 p1, p30

    .line 20
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/e;->z:Lt2/I;

    move/from16 p1, p31

    .line 21
    iput-boolean p1, p0, Landroidx/media3/exoplayer/hls/e;->N:Z

    move/from16 p1, p32

    .line 22
    iput-boolean p1, p0, Landroidx/media3/exoplayer/hls/e;->n:Z

    move-object/from16 p1, p33

    .line 23
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/e;->C:LB2/K1;

    .line 24
    invoke-static {}, LP9/u;->A()LP9/u;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/e;->K:LP9/u;

    .line 25
    sget-object p1, Landroidx/media3/exoplayer/hls/e;->O:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    iput p1, p0, Landroidx/media3/exoplayer/hls/e;->k:I

    return-void
.end method

.method private static i(Lw2/g;[B[B)Lw2/g;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/media3/exoplayer/hls/a;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1, p2}, Landroidx/media3/exoplayer/hls/a;-><init>(Lw2/g;[B[B)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    return-object p0
.end method

.method public static k(LG2/e;Lw2/g;Lq2/x;JLH2/f;Landroidx/media3/exoplayer/hls/c$e;Landroid/net/Uri;Ljava/util/List;ILjava/lang/Object;ZLG2/j;JLandroidx/media3/exoplayer/hls/e;[B[BZZLB2/K1;LQ2/f$a;)Landroidx/media3/exoplayer/hls/e;
    .locals 44

    move-object/from16 v0, p1

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    move-object/from16 v3, p15

    move-object/from16 v4, p16

    move-object/from16 v5, p17

    .line 1
    iget-object v6, v2, Landroidx/media3/exoplayer/hls/c$e;->a:LH2/f$g;

    .line 2
    new-instance v7, Lw2/o$b;

    invoke-direct {v7}, Lw2/o$b;-><init>()V

    iget-object v8, v1, LH2/j;->a:Ljava/lang/String;

    iget-object v9, v6, LH2/f$g;->a:Ljava/lang/String;

    .line 3
    invoke-static {v8, v9}, Lt2/Q;->g(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    invoke-virtual {v7, v8}, Lw2/o$b;->i(Landroid/net/Uri;)Lw2/o$b;

    move-result-object v7

    iget-wide v8, v6, LH2/f$g;->i:J

    .line 4
    invoke-virtual {v7, v8, v9}, Lw2/o$b;->h(J)Lw2/o$b;

    move-result-object v7

    iget-wide v8, v6, LH2/f$g;->j:J

    .line 5
    invoke-virtual {v7, v8, v9}, Lw2/o$b;->g(J)Lw2/o$b;

    move-result-object v7

    .line 6
    iget-boolean v8, v2, Landroidx/media3/exoplayer/hls/c$e;->d:Z

    if-eqz v8, :cond_0

    const/16 v8, 0x8

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    :goto_0
    invoke-virtual {v7, v8}, Lw2/o$b;->b(I)Lw2/o$b;

    move-result-object v7

    .line 7
    invoke-virtual {v7}, Lw2/o$b;->a()Lw2/o;

    move-result-object v13

    if-eqz v4, :cond_1

    const/4 v15, 0x1

    goto :goto_1

    :cond_1
    const/4 v15, 0x0

    :goto_1
    if-eqz v15, :cond_2

    .line 8
    iget-object v10, v6, LH2/f$g;->h:Ljava/lang/String;

    invoke-static {v10}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-static {v10}, Landroidx/media3/exoplayer/hls/e;->m(Ljava/lang/String;)[B

    move-result-object v10

    goto :goto_2

    :cond_2
    const/4 v10, 0x0

    .line 9
    :goto_2
    invoke-static {v0, v4, v10}, Landroidx/media3/exoplayer/hls/e;->i(Lw2/g;[B[B)Lw2/g;

    move-result-object v12

    .line 10
    iget-object v4, v6, LH2/f$g;->b:LH2/f$f;

    if-eqz v4, :cond_5

    if-eqz v5, :cond_3

    const/4 v10, 0x1

    goto :goto_3

    :cond_3
    const/4 v10, 0x0

    :goto_3
    if-eqz v10, :cond_4

    .line 11
    iget-object v11, v4, LH2/f$g;->h:Ljava/lang/String;

    invoke-static {v11}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-static {v11}, Landroidx/media3/exoplayer/hls/e;->m(Ljava/lang/String;)[B

    move-result-object v11

    goto :goto_4

    :cond_4
    const/4 v11, 0x0

    .line 12
    :goto_4
    iget-object v14, v1, LH2/j;->a:Ljava/lang/String;

    const/16 p21, 0x1

    iget-object v7, v4, LH2/f$g;->a:Ljava/lang/String;

    invoke-static {v14, v7}, Lt2/Q;->g(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v7

    .line 13
    new-instance v14, Lw2/o$b;

    invoke-direct {v14}, Lw2/o$b;-><init>()V

    .line 14
    invoke-virtual {v14, v7}, Lw2/o$b;->i(Landroid/net/Uri;)Lw2/o$b;

    move-result-object v7

    iget-wide v8, v4, LH2/f$g;->i:J

    .line 15
    invoke-virtual {v7, v8, v9}, Lw2/o$b;->h(J)Lw2/o$b;

    move-result-object v7

    iget-wide v8, v4, LH2/f$g;->j:J

    .line 16
    invoke-virtual {v7, v8, v9}, Lw2/o$b;->g(J)Lw2/o$b;

    move-result-object v4

    .line 17
    invoke-virtual {v4}, Lw2/o$b;->a()Lw2/o;

    move-result-object v4

    .line 18
    invoke-static {v0, v5, v11}, Landroidx/media3/exoplayer/hls/e;->i(Lw2/g;[B[B)Lw2/g;

    move-result-object v0

    move/from16 v18, v10

    goto :goto_5

    :cond_5
    const/16 p21, 0x1

    const/4 v0, 0x0

    const/4 v4, 0x0

    const/16 v18, 0x0

    .line 19
    :goto_5
    iget-wide v7, v6, LH2/f$g;->e:J

    add-long v23, p3, v7

    .line 20
    iget-wide v7, v6, LH2/f$g;->c:J

    add-long v25, v23, v7

    .line 21
    iget v1, v1, LH2/f;->j:I

    iget v5, v6, LH2/f$g;->d:I

    add-int/2addr v1, v5

    if-eqz v3, :cond_a

    .line 22
    iget-object v5, v3, Landroidx/media3/exoplayer/hls/e;->q:Lw2/o;

    if-eq v4, v5, :cond_7

    if-eqz v4, :cond_6

    if-eqz v5, :cond_6

    iget-object v7, v4, Lw2/o;->a:Landroid/net/Uri;

    iget-object v5, v5, Lw2/o;->a:Landroid/net/Uri;

    .line 23
    invoke-virtual {v7, v5}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    iget-wide v7, v4, Lw2/o;->g:J

    iget-object v5, v3, Landroidx/media3/exoplayer/hls/e;->q:Lw2/o;

    iget-wide v9, v5, Lw2/o;->g:J

    cmp-long v5, v7, v9

    if-nez v5, :cond_6

    goto :goto_6

    :cond_6
    const/4 v5, 0x0

    goto :goto_7

    :cond_7
    :goto_6
    move/from16 v5, p21

    .line 24
    :goto_7
    iget-object v7, v3, Landroidx/media3/exoplayer/hls/e;->m:Landroid/net/Uri;

    move-object/from16 v8, p7

    .line 25
    invoke-virtual {v8, v7}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    iget-boolean v7, v3, Landroidx/media3/exoplayer/hls/e;->J:Z

    if-eqz v7, :cond_8

    move/from16 v9, p21

    goto :goto_8

    :cond_8
    const/4 v9, 0x0

    .line 26
    :goto_8
    iget-object v7, v3, Landroidx/media3/exoplayer/hls/e;->y:Li3/h;

    .line 27
    iget-object v10, v3, Landroidx/media3/exoplayer/hls/e;->z:Lt2/I;

    if-eqz v5, :cond_9

    if-eqz v9, :cond_9

    .line 28
    iget-boolean v5, v3, Landroidx/media3/exoplayer/hls/e;->L:Z

    if-nez v5, :cond_9

    iget v5, v3, Landroidx/media3/exoplayer/hls/e;->l:I

    if-ne v5, v1, :cond_9

    .line 29
    iget-object v3, v3, Landroidx/media3/exoplayer/hls/e;->E:LG2/f;

    move-object/from16 v16, v3

    goto :goto_9

    :cond_9
    const/16 v16, 0x0

    :goto_9
    move-object/from16 v38, v16

    :goto_a
    move-object/from16 v39, v7

    move-object/from16 v40, v10

    goto :goto_b

    :cond_a
    move-object/from16 v8, p7

    .line 30
    new-instance v7, Li3/h;

    invoke-direct {v7}, Li3/h;-><init>()V

    .line 31
    new-instance v10, Lt2/I;

    const/16 v3, 0xa

    invoke-direct {v10, v3}, Lt2/I;-><init>(I)V

    const/16 v38, 0x0

    goto :goto_a

    .line 32
    :goto_b
    new-instance v10, Landroidx/media3/exoplayer/hls/e;

    move-object/from16 v17, v4

    iget-wide v3, v2, Landroidx/media3/exoplayer/hls/c$e;->b:J

    iget v5, v2, Landroidx/media3/exoplayer/hls/c$e;->c:I

    iget-boolean v2, v2, Landroidx/media3/exoplayer/hls/c$e;->d:Z

    xor-int/lit8 v30, v2, 0x1

    iget-boolean v2, v6, LH2/f$g;->k:Z

    move-object/from16 v7, p12

    .line 33
    invoke-virtual {v7, v1}, LG2/j;->a(I)Lt2/O;

    move-result-object v34

    iget-object v6, v6, LH2/f$g;->f:Lq2/q;

    move-object/from16 v11, p0

    move-object/from16 v14, p2

    move-object/from16 v20, p8

    move/from16 v21, p9

    move-object/from16 v22, p10

    move/from16 v33, p11

    move-wide/from16 v35, p13

    move/from16 v41, p18

    move/from16 v42, p19

    move-object/from16 v43, p20

    move-object/from16 v16, v0

    move/from16 v31, v1

    move/from16 v32, v2

    move-wide/from16 v27, v3

    move/from16 v29, v5

    move-object/from16 v37, v6

    move-object/from16 v19, v8

    invoke-direct/range {v10 .. v43}, Landroidx/media3/exoplayer/hls/e;-><init>(LG2/e;Lw2/g;Lw2/o;Lq2/x;ZLw2/g;Lw2/o;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLt2/O;JLq2/q;LG2/f;Li3/h;Lt2/I;ZZLB2/K1;)V

    return-object v10
.end method

.method private l(Lw2/g;Lw2/o;ZZ)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p3, :cond_1

    .line 3
    .line 4
    iget p3, p0, Landroidx/media3/exoplayer/hls/e;->G:I

    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    :cond_0
    move-object p3, p2

    .line 10
    goto :goto_0

    .line 11
    :cond_1
    iget p3, p0, Landroidx/media3/exoplayer/hls/e;->G:I

    .line 12
    .line 13
    int-to-long v1, p3

    .line 14
    invoke-virtual {p2, v1, v2}, Lw2/o;->e(J)Lw2/o;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    :goto_0
    :try_start_0
    invoke-direct {p0, p1, p3, p4}, Landroidx/media3/exoplayer/hls/e;->v(Lw2/g;Lw2/o;Z)LU2/j;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget p4, p0, Landroidx/media3/exoplayer/hls/e;->G:I

    .line 25
    .line 26
    invoke-interface {p3, p4}, LU2/q;->m(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception p2

    .line 31
    goto :goto_6

    .line 32
    :cond_2
    :goto_1
    :try_start_1
    iget-boolean p4, p0, Landroidx/media3/exoplayer/hls/e;->I:Z

    .line 33
    .line 34
    if-nez p4, :cond_3

    .line 35
    .line 36
    iget-object p4, p0, Landroidx/media3/exoplayer/hls/e;->E:LG2/f;

    .line 37
    .line 38
    invoke-interface {p4, p3}, LG2/f;->b(LU2/q;)Z

    .line 39
    .line 40
    .line 41
    move-result p4
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 42
    if-eqz p4, :cond_3

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :catchall_1
    move-exception p4

    .line 46
    goto :goto_5

    .line 47
    :catch_0
    move-exception p4

    .line 48
    goto :goto_3

    .line 49
    :cond_3
    :try_start_2
    invoke-interface {p3}, LU2/q;->getPosition()J

    .line 50
    .line 51
    .line 52
    move-result-wide p3

    .line 53
    :goto_2
    iget-wide v0, p2, Lw2/o;->g:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 54
    .line 55
    goto :goto_4

    .line 56
    :goto_3
    :try_start_3
    iget-object v0, p0, LN2/e;->d:Lq2/x;

    .line 57
    .line 58
    iget v0, v0, Lq2/x;->f:I

    .line 59
    .line 60
    and-int/lit16 v0, v0, 0x4000

    .line 61
    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    iget-object p4, p0, Landroidx/media3/exoplayer/hls/e;->E:LG2/f;

    .line 65
    .line 66
    invoke-interface {p4}, LG2/f;->d()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 67
    .line 68
    .line 69
    :try_start_4
    invoke-interface {p3}, LU2/q;->getPosition()J

    .line 70
    .line 71
    .line 72
    move-result-wide p3

    .line 73
    goto :goto_2

    .line 74
    :goto_4
    sub-long/2addr p3, v0

    .line 75
    long-to-int p2, p3

    .line 76
    iput p2, p0, Landroidx/media3/exoplayer/hls/e;->G:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 77
    .line 78
    invoke-static {p1}, Lw2/n;->a(Lw2/g;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_4
    :try_start_5
    throw p4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 83
    :goto_5
    :try_start_6
    invoke-interface {p3}, LU2/q;->getPosition()J

    .line 84
    .line 85
    .line 86
    move-result-wide v0

    .line 87
    iget-wide p2, p2, Lw2/o;->g:J

    .line 88
    .line 89
    sub-long/2addr v0, p2

    .line 90
    long-to-int p2, v0

    .line 91
    iput p2, p0, Landroidx/media3/exoplayer/hls/e;->G:I

    .line 92
    .line 93
    throw p4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 94
    :goto_6
    invoke-static {p1}, Lw2/n;->a(Lw2/g;)V

    .line 95
    .line 96
    .line 97
    throw p2
.end method

.method private static m(Ljava/lang/String;)[B
    .locals 4

    .line 1
    invoke-static {p0}, LO9/c;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "0x"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_0
    new-instance v0, Ljava/math/BigInteger;

    .line 19
    .line 20
    const/16 v1, 0x10

    .line 21
    .line 22
    invoke-direct {v0, p0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-array v0, v1, [B

    .line 30
    .line 31
    array-length v2, p0

    .line 32
    if-le v2, v1, :cond_1

    .line 33
    .line 34
    array-length v2, p0

    .line 35
    sub-int/2addr v2, v1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v2, 0x0

    .line 38
    :goto_0
    array-length v3, p0

    .line 39
    sub-int/2addr v1, v3

    .line 40
    add-int/2addr v1, v2

    .line 41
    array-length v3, p0

    .line 42
    sub-int/2addr v3, v2

    .line 43
    invoke-static {p0, v2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    return-object v0
.end method

.method private s()V
    .locals 4

    .line 1
    iget-object v0, p0, LN2/e;->i:Lw2/D;

    .line 2
    .line 3
    iget-object v1, p0, LN2/e;->b:Lw2/o;

    .line 4
    .line 5
    iget-boolean v2, p0, Landroidx/media3/exoplayer/hls/e;->A:Z

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-direct {p0, v0, v1, v2, v3}, Landroidx/media3/exoplayer/hls/e;->l(Lw2/g;Lw2/o;ZZ)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private t()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/e;->H:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/e;->p:Lw2/g;

    .line 7
    .line 8
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/e;->q:Lw2/o;

    .line 12
    .line 13
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/e;->p:Lw2/g;

    .line 17
    .line 18
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/e;->q:Lw2/o;

    .line 19
    .line 20
    iget-boolean v2, p0, Landroidx/media3/exoplayer/hls/e;->B:Z

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-direct {p0, v0, v1, v2, v3}, Landroidx/media3/exoplayer/hls/e;->l(Lw2/g;Lw2/o;ZZ)V

    .line 24
    .line 25
    .line 26
    iput v3, p0, Landroidx/media3/exoplayer/hls/e;->G:I

    .line 27
    .line 28
    iput-boolean v3, p0, Landroidx/media3/exoplayer/hls/e;->H:Z

    .line 29
    .line 30
    return-void
.end method

.method private u(LU2/q;)J
    .locals 8

    .line 1
    invoke-interface {p1}, LU2/q;->g()V

    .line 2
    .line 3
    .line 4
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    :try_start_0
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/e;->z:Lt2/I;

    .line 10
    .line 11
    const/16 v3, 0xa

    .line 12
    .line 13
    invoke-virtual {v2, v3}, Lt2/I;->X(I)V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/e;->z:Lt2/I;

    .line 17
    .line 18
    invoke-virtual {v2}, Lt2/I;->f()[B

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-interface {p1, v2, v4, v3}, LU2/q;->o([BII)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/e;->z:Lt2/I;

    .line 27
    .line 28
    invoke-virtual {v2}, Lt2/I;->P()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const v5, 0x494433

    .line 33
    .line 34
    .line 35
    if-eq v2, v5, :cond_0

    .line 36
    .line 37
    return-wide v0

    .line 38
    :cond_0
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/e;->z:Lt2/I;

    .line 39
    .line 40
    const/4 v5, 0x3

    .line 41
    invoke-virtual {v2, v5}, Lt2/I;->c0(I)V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/e;->z:Lt2/I;

    .line 45
    .line 46
    invoke-virtual {v2}, Lt2/I;->L()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    add-int/lit8 v5, v2, 0xa

    .line 51
    .line 52
    iget-object v6, p0, Landroidx/media3/exoplayer/hls/e;->z:Lt2/I;

    .line 53
    .line 54
    invoke-virtual {v6}, Lt2/I;->b()I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-le v5, v6, :cond_1

    .line 59
    .line 60
    iget-object v6, p0, Landroidx/media3/exoplayer/hls/e;->z:Lt2/I;

    .line 61
    .line 62
    invoke-virtual {v6}, Lt2/I;->f()[B

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    iget-object v7, p0, Landroidx/media3/exoplayer/hls/e;->z:Lt2/I;

    .line 67
    .line 68
    invoke-virtual {v7, v5}, Lt2/I;->X(I)V

    .line 69
    .line 70
    .line 71
    iget-object v5, p0, Landroidx/media3/exoplayer/hls/e;->z:Lt2/I;

    .line 72
    .line 73
    invoke-virtual {v5}, Lt2/I;->f()[B

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-static {v6, v4, v5, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 78
    .line 79
    .line 80
    :cond_1
    iget-object v5, p0, Landroidx/media3/exoplayer/hls/e;->z:Lt2/I;

    .line 81
    .line 82
    invoke-virtual {v5}, Lt2/I;->f()[B

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-interface {p1, v5, v3, v2}, LU2/q;->o([BII)V

    .line 87
    .line 88
    .line 89
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/e;->y:Li3/h;

    .line 90
    .line 91
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/e;->z:Lt2/I;

    .line 92
    .line 93
    invoke-virtual {v3}, Lt2/I;->f()[B

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {p1, v3, v2}, Li3/h;->e([BI)Lq2/J;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    if-nez p1, :cond_2

    .line 102
    .line 103
    return-wide v0

    .line 104
    :cond_2
    invoke-virtual {p1}, Lq2/J;->e()I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    move v3, v4

    .line 109
    :goto_0
    if-ge v3, v2, :cond_4

    .line 110
    .line 111
    invoke-virtual {p1, v3}, Lq2/J;->d(I)Lq2/J$a;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    instance-of v6, v5, Li3/m;

    .line 116
    .line 117
    if-eqz v6, :cond_3

    .line 118
    .line 119
    check-cast v5, Li3/m;

    .line 120
    .line 121
    const-string v6, "com.apple.streaming.transportStreamTimestamp"

    .line 122
    .line 123
    iget-object v7, v5, Li3/m;->b:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    if-eqz v6, :cond_3

    .line 130
    .line 131
    iget-object p1, v5, Li3/m;->c:[B

    .line 132
    .line 133
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/e;->z:Lt2/I;

    .line 134
    .line 135
    invoke-virtual {v0}, Lt2/I;->f()[B

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    const/16 v1, 0x8

    .line 140
    .line 141
    invoke-static {p1, v4, v0, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 142
    .line 143
    .line 144
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/e;->z:Lt2/I;

    .line 145
    .line 146
    invoke-virtual {p1, v4}, Lt2/I;->b0(I)V

    .line 147
    .line 148
    .line 149
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/e;->z:Lt2/I;

    .line 150
    .line 151
    invoke-virtual {p1, v1}, Lt2/I;->a0(I)V

    .line 152
    .line 153
    .line 154
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/e;->z:Lt2/I;

    .line 155
    .line 156
    invoke-virtual {p1}, Lt2/I;->F()J

    .line 157
    .line 158
    .line 159
    move-result-wide v0

    .line 160
    const-wide v2, 0x1ffffffffL

    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    and-long/2addr v0, v2

    .line 166
    return-wide v0

    .line 167
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :catch_0
    :cond_4
    return-wide v0
.end method

.method private v(Lw2/g;Lw2/o;Z)LU2/j;
    .locals 12

    .line 1
    invoke-interface {p1, p2}, Lw2/g;->a(Lw2/o;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v4

    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    :try_start_0
    iget-object v6, p0, Landroidx/media3/exoplayer/hls/e;->u:Lt2/O;

    .line 8
    .line 9
    iget-boolean v7, p0, Landroidx/media3/exoplayer/hls/e;->s:Z

    .line 10
    .line 11
    iget-wide v8, p0, LN2/e;->g:J

    .line 12
    .line 13
    iget-wide v10, p0, Landroidx/media3/exoplayer/hls/e;->D:J

    .line 14
    .line 15
    invoke-virtual/range {v6 .. v11}, Lt2/O;->j(ZJJ)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catch_0
    move-exception v0

    .line 20
    move-object p1, v0

    .line 21
    new-instance p2, Ljava/io/IOException;

    .line 22
    .line 23
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    throw p2

    .line 27
    :catch_1
    new-instance p1, Ljava/io/InterruptedIOException;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_0
    :goto_0
    new-instance v0, LU2/j;

    .line 34
    .line 35
    iget-wide v2, p2, Lw2/o;->g:J

    .line 36
    .line 37
    move-object v1, p1

    .line 38
    invoke-direct/range {v0 .. v5}, LU2/j;-><init>(Lq2/m;JJ)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/e;->E:LG2/f;

    .line 42
    .line 43
    if-nez p1, :cond_4

    .line 44
    .line 45
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/hls/e;->u(LU2/q;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v8

    .line 49
    invoke-virtual {v0}, LU2/j;->g()V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/e;->r:LG2/f;

    .line 53
    .line 54
    if-eqz p1, :cond_1

    .line 55
    .line 56
    invoke-interface {p1}, LG2/f;->g()LG2/f;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    move-object v6, v0

    .line 62
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/e;->v:LG2/e;

    .line 63
    .line 64
    iget-object p1, p2, Lw2/o;->a:Landroid/net/Uri;

    .line 65
    .line 66
    iget-object v2, p0, LN2/e;->d:Lq2/x;

    .line 67
    .line 68
    iget-object v3, p0, Landroidx/media3/exoplayer/hls/e;->w:Ljava/util/List;

    .line 69
    .line 70
    iget-object v4, p0, Landroidx/media3/exoplayer/hls/e;->u:Lt2/O;

    .line 71
    .line 72
    invoke-interface {v1}, Lw2/g;->f()Ljava/util/Map;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    iget-object v7, p0, Landroidx/media3/exoplayer/hls/e;->C:LB2/K1;

    .line 77
    .line 78
    move-object v1, p1

    .line 79
    invoke-interface/range {v0 .. v7}, LG2/e;->e(Landroid/net/Uri;Lq2/x;Ljava/util/List;Lt2/O;Ljava/util/Map;LU2/q;LB2/K1;)LG2/f;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    move-object v0, v6

    .line 84
    :goto_1
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/e;->E:LG2/f;

    .line 85
    .line 86
    invoke-interface {p1}, LG2/f;->f()Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_3

    .line 91
    .line 92
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/e;->F:Landroidx/media3/exoplayer/hls/l;

    .line 93
    .line 94
    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    cmp-long p2, v8, p2

    .line 100
    .line 101
    if-eqz p2, :cond_2

    .line 102
    .line 103
    iget-object p2, p0, Landroidx/media3/exoplayer/hls/e;->u:Lt2/O;

    .line 104
    .line 105
    invoke-virtual {p2, v8, v9}, Lt2/O;->b(J)J

    .line 106
    .line 107
    .line 108
    move-result-wide p2

    .line 109
    goto :goto_2

    .line 110
    :cond_2
    iget-wide p2, p0, LN2/e;->g:J

    .line 111
    .line 112
    :goto_2
    invoke-virtual {p1, p2, p3}, Landroidx/media3/exoplayer/hls/l;->r0(J)V

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_3
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/e;->F:Landroidx/media3/exoplayer/hls/l;

    .line 117
    .line 118
    const-wide/16 p2, 0x0

    .line 119
    .line 120
    invoke-virtual {p1, p2, p3}, Landroidx/media3/exoplayer/hls/l;->r0(J)V

    .line 121
    .line 122
    .line 123
    :goto_3
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/e;->F:Landroidx/media3/exoplayer/hls/l;

    .line 124
    .line 125
    invoke-virtual {p1}, Landroidx/media3/exoplayer/hls/l;->d0()V

    .line 126
    .line 127
    .line 128
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/e;->E:LG2/f;

    .line 129
    .line 130
    iget-object p2, p0, Landroidx/media3/exoplayer/hls/e;->F:Landroidx/media3/exoplayer/hls/l;

    .line 131
    .line 132
    invoke-interface {p1, p2}, LG2/f;->c(LU2/r;)V

    .line 133
    .line 134
    .line 135
    :cond_4
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/e;->F:Landroidx/media3/exoplayer/hls/l;

    .line 136
    .line 137
    iget-object p2, p0, Landroidx/media3/exoplayer/hls/e;->x:Lq2/q;

    .line 138
    .line 139
    invoke-virtual {p1, p2}, Landroidx/media3/exoplayer/hls/l;->o0(Lq2/q;)V

    .line 140
    .line 141
    .line 142
    return-object v0
.end method

.method public static y(Landroidx/media3/exoplayer/hls/e;JLandroid/net/Uri;ZLandroidx/media3/exoplayer/hls/c$e;J)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/e;->m:Landroid/net/Uri;

    .line 6
    .line 7
    invoke-virtual {p3, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    if-eqz p3, :cond_1

    .line 12
    .line 13
    iget-boolean p0, p0, Landroidx/media3/exoplayer/hls/e;->J:Z

    .line 14
    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    return v0

    .line 18
    :cond_1
    iget-object p0, p5, Landroidx/media3/exoplayer/hls/c$e;->a:LH2/f$g;

    .line 19
    .line 20
    iget-wide v1, p0, LH2/f$g;->e:J

    .line 21
    .line 22
    add-long/2addr p6, v1

    .line 23
    if-eqz p4, :cond_3

    .line 24
    .line 25
    cmp-long p0, p6, p1

    .line 26
    .line 27
    if-gez p0, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    return v0

    .line 31
    :cond_3
    :goto_0
    const/4 p0, 0x1

    .line 32
    return p0
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/e;->F:Landroidx/media3/exoplayer/hls/l;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/e;->E:LG2/f;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/e;->r:LG2/f;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, LG2/f;->e()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/e;->r:LG2/f;

    .line 21
    .line 22
    iput-object v0, p0, Landroidx/media3/exoplayer/hls/e;->E:LG2/f;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Landroidx/media3/exoplayer/hls/e;->H:Z

    .line 26
    .line 27
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/e;->t()V

    .line 28
    .line 29
    .line 30
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/e;->I:Z

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/e;->t:Z

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/e;->s()V

    .line 39
    .line 40
    .line 41
    :cond_1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/e;->I:Z

    .line 42
    .line 43
    xor-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    iput-boolean v0, p0, Landroidx/media3/exoplayer/hls/e;->J:Z

    .line 46
    .line 47
    :cond_2
    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/hls/e;->I:Z

    .line 3
    .line 4
    return-void
.end method

.method public h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/e;->J:Z

    .line 2
    .line 3
    return v0
.end method

.method public j()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/hls/e;->N:Z

    .line 3
    .line 4
    return-void
.end method

.method public n(I)I
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/e;->N:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/e;->K:LP9/u;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-lt p1, v0, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/e;->K:LP9/u;

    .line 19
    .line 20
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1
.end method

.method public o()J
    .locals 5

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/hls/e;->M:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v4, v0, v2

    .line 9
    .line 10
    if-eqz v4, :cond_0

    .line 11
    .line 12
    iget-wide v2, p0, LN2/e;->g:J

    .line 13
    .line 14
    add-long/2addr v2, v0

    .line 15
    :cond_0
    return-wide v2
.end method

.method public p(Landroidx/media3/exoplayer/hls/l;LP9/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/e;->F:Landroidx/media3/exoplayer/hls/l;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/e;->K:LP9/u;

    .line 4
    .line 5
    return-void
.end method

.method public q()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/hls/e;->L:Z

    .line 3
    .line 4
    return-void
.end method

.method public r()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/hls/e;->M:J

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

.method public w(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/media3/exoplayer/hls/e;->M:J

    .line 2
    .line 3
    return-void
.end method

.method public x()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/e;->N:Z

    .line 2
    .line 3
    return v0
.end method
