.class public final Landroidx/media3/exoplayer/dash/DashMediaSource;
.super LM2/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/dash/DashMediaSource$c;,
        Landroidx/media3/exoplayer/dash/DashMediaSource$e;,
        Landroidx/media3/exoplayer/dash/DashMediaSource$f;,
        Landroidx/media3/exoplayer/dash/DashMediaSource$d;,
        Landroidx/media3/exoplayer/dash/DashMediaSource$h;,
        Landroidx/media3/exoplayer/dash/DashMediaSource$g;,
        Landroidx/media3/exoplayer/dash/DashMediaSource$b;,
        Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;
    }
.end annotation


# instance fields
.field private A:LQ2/m;

.field private B:Lw2/F;

.field private C:Ljava/io/IOException;

.field private D:Landroid/os/Handler;

.field private E:Lq2/C$g;

.field private F:Landroid/net/Uri;

.field private G:Landroid/net/Uri;

.field private H:LE2/c;

.field private I:Z

.field private J:J

.field private K:J

.field private L:J

.field private M:I

.field private N:J

.field private O:I

.field private P:Lq2/C;

.field private final h:Z

.field private final i:Lw2/g$a;

.field private final j:Landroidx/media3/exoplayer/dash/a$a;

.field private final k:LM2/j;

.field private final l:LF2/u;

.field private final m:LQ2/k;

.field private final n:LD2/b;

.field private final o:J

.field private final p:J

.field private final q:LM2/L$a;

.field private final r:LQ2/o$a;

.field private final s:Landroidx/media3/exoplayer/dash/DashMediaSource$e;

.field private final t:Ljava/lang/Object;

.field private final u:Landroid/util/SparseArray;

.field private final v:Ljava/lang/Runnable;

.field private final w:Ljava/lang/Runnable;

.field private final x:Landroidx/media3/exoplayer/dash/f$b;

.field private final y:LQ2/n;

.field private z:Lw2/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "media3.exoplayer.dash"

    .line 2
    .line 3
    invoke-static {v0}, Lq2/H;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private constructor <init>(Lq2/C;LE2/c;Lw2/g$a;LQ2/o$a;Landroidx/media3/exoplayer/dash/a$a;LM2/j;LQ2/e;LF2/u;LQ2/k;JJ)V
    .locals 0

    .line 2
    invoke-direct {p0}, LM2/a;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->P:Lq2/C;

    .line 4
    iget-object p7, p1, Lq2/C;->d:Lq2/C$g;

    iput-object p7, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->E:Lq2/C$g;

    .line 5
    iget-object p7, p1, Lq2/C;->b:Lq2/C$h;

    invoke-static {p7}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p7

    check-cast p7, Lq2/C$h;

    iget-object p7, p7, Lq2/C$h;->a:Landroid/net/Uri;

    iput-object p7, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->F:Landroid/net/Uri;

    .line 6
    iget-object p1, p1, Lq2/C;->b:Lq2/C$h;

    iget-object p1, p1, Lq2/C$h;->a:Landroid/net/Uri;

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->G:Landroid/net/Uri;

    .line 7
    iput-object p2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 8
    iput-object p3, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->i:Lw2/g$a;

    .line 9
    iput-object p4, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->r:LQ2/o$a;

    .line 10
    iput-object p5, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->j:Landroidx/media3/exoplayer/dash/a$a;

    .line 11
    iput-object p8, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->l:LF2/u;

    .line 12
    iput-object p9, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->m:LQ2/k;

    .line 13
    iput-wide p10, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->o:J

    .line 14
    iput-wide p12, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->p:J

    .line 15
    iput-object p6, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->k:LM2/j;

    .line 16
    new-instance p1, LD2/b;

    invoke-direct {p1}, LD2/b;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->n:LD2/b;

    const/4 p1, 0x1

    if-eqz p2, :cond_0

    move p3, p1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    .line 17
    :goto_0
    iput-boolean p3, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->h:Z

    const/4 p4, 0x0

    .line 18
    invoke-virtual {p0, p4}, LM2/a;->v(LM2/D$b;)LM2/L$a;

    move-result-object p5

    iput-object p5, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->q:LM2/L$a;

    .line 19
    new-instance p5, Ljava/lang/Object;

    invoke-direct {p5}, Ljava/lang/Object;-><init>()V

    iput-object p5, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->t:Ljava/lang/Object;

    .line 20
    new-instance p5, Landroid/util/SparseArray;

    invoke-direct {p5}, Landroid/util/SparseArray;-><init>()V

    iput-object p5, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->u:Landroid/util/SparseArray;

    .line 21
    new-instance p5, Landroidx/media3/exoplayer/dash/DashMediaSource$c;

    invoke-direct {p5, p0, p4}, Landroidx/media3/exoplayer/dash/DashMediaSource$c;-><init>(Landroidx/media3/exoplayer/dash/DashMediaSource;Landroidx/media3/exoplayer/dash/DashMediaSource$a;)V

    iput-object p5, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->x:Landroidx/media3/exoplayer/dash/f$b;

    const-wide p5, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    iput-wide p5, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->N:J

    .line 23
    iput-wide p5, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->L:J

    if-eqz p3, :cond_1

    .line 24
    iget-boolean p2, p2, LE2/c;->d:Z

    xor-int/2addr p1, p2

    invoke-static {p1}, Lt2/a;->g(Z)V

    .line 25
    iput-object p4, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->s:Landroidx/media3/exoplayer/dash/DashMediaSource$e;

    .line 26
    iput-object p4, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->v:Ljava/lang/Runnable;

    .line 27
    iput-object p4, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->w:Ljava/lang/Runnable;

    .line 28
    new-instance p1, LQ2/n$a;

    invoke-direct {p1}, LQ2/n$a;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->y:LQ2/n;

    return-void

    .line 29
    :cond_1
    new-instance p1, Landroidx/media3/exoplayer/dash/DashMediaSource$e;

    invoke-direct {p1, p0, p4}, Landroidx/media3/exoplayer/dash/DashMediaSource$e;-><init>(Landroidx/media3/exoplayer/dash/DashMediaSource;Landroidx/media3/exoplayer/dash/DashMediaSource$a;)V

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->s:Landroidx/media3/exoplayer/dash/DashMediaSource$e;

    .line 30
    new-instance p1, Landroidx/media3/exoplayer/dash/DashMediaSource$f;

    invoke-direct {p1, p0}, Landroidx/media3/exoplayer/dash/DashMediaSource$f;-><init>(Landroidx/media3/exoplayer/dash/DashMediaSource;)V

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->y:LQ2/n;

    .line 31
    new-instance p1, LD2/d;

    invoke-direct {p1, p0}, LD2/d;-><init>(Landroidx/media3/exoplayer/dash/DashMediaSource;)V

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->v:Ljava/lang/Runnable;

    .line 32
    new-instance p1, LD2/e;

    invoke-direct {p1, p0}, LD2/e;-><init>(Landroidx/media3/exoplayer/dash/DashMediaSource;)V

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->w:Ljava/lang/Runnable;

    return-void
.end method

.method synthetic constructor <init>(Lq2/C;LE2/c;Lw2/g$a;LQ2/o$a;Landroidx/media3/exoplayer/dash/a$a;LM2/j;LQ2/e;LF2/u;LQ2/k;JJLandroidx/media3/exoplayer/dash/DashMediaSource$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p13}, Landroidx/media3/exoplayer/dash/DashMediaSource;-><init>(Lq2/C;LE2/c;Lw2/g$a;LQ2/o$a;Landroidx/media3/exoplayer/dash/a$a;LM2/j;LQ2/e;LF2/u;LQ2/k;JJ)V

    return-void
.end method

.method public static synthetic D(Landroidx/media3/exoplayer/dash/DashMediaSource;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->a0(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static synthetic E(Landroidx/media3/exoplayer/dash/DashMediaSource;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->g0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic F(Landroidx/media3/exoplayer/dash/DashMediaSource;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/dash/DashMediaSource;->Z(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic G(Landroidx/media3/exoplayer/dash/DashMediaSource;Ljava/io/IOException;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource;->Y(Ljava/io/IOException;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic H(Landroidx/media3/exoplayer/dash/DashMediaSource;)LQ2/m;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->A:LQ2/m;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic I(Landroidx/media3/exoplayer/dash/DashMediaSource;)Ljava/io/IOException;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->C:Ljava/io/IOException;

    .line 2
    .line 3
    return-object p0
.end method

.method private static J(LE2/g;JJ)J
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v3, p3

    .line 6
    .line 7
    iget-wide v5, v0, LE2/g;->b:J

    .line 8
    .line 9
    invoke-static {v5, v6}, Lt2/a0;->V0(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v5

    .line 13
    invoke-static {v0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->N(LE2/g;)Z

    .line 14
    .line 15
    .line 16
    move-result v7

    .line 17
    const-wide v8, 0x7fffffffffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    const/4 v10, 0x0

    .line 23
    move v11, v10

    .line 24
    :goto_0
    iget-object v12, v0, LE2/g;->c:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v12

    .line 30
    if-ge v11, v12, :cond_6

    .line 31
    .line 32
    iget-object v12, v0, LE2/g;->c:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v12, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v12

    .line 38
    check-cast v12, LE2/a;

    .line 39
    .line 40
    iget-object v13, v12, LE2/a;->c:Ljava/util/List;

    .line 41
    .line 42
    iget v12, v12, LE2/a;->b:I

    .line 43
    .line 44
    const/4 v14, 0x1

    .line 45
    if-eq v12, v14, :cond_0

    .line 46
    .line 47
    const/4 v15, 0x2

    .line 48
    if-eq v12, v15, :cond_0

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    move v14, v10

    .line 52
    :goto_1
    if-eqz v7, :cond_1

    .line 53
    .line 54
    if-nez v14, :cond_5

    .line 55
    .line 56
    :cond_1
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v12

    .line 60
    if-eqz v12, :cond_2

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    invoke-interface {v13, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v12

    .line 67
    check-cast v12, LE2/j;

    .line 68
    .line 69
    invoke-virtual {v12}, LE2/j;->b()LD2/f;

    .line 70
    .line 71
    .line 72
    move-result-object v12

    .line 73
    if-nez v12, :cond_3

    .line 74
    .line 75
    add-long/2addr v5, v1

    .line 76
    return-wide v5

    .line 77
    :cond_3
    invoke-interface {v12, v1, v2, v3, v4}, LD2/f;->m(JJ)J

    .line 78
    .line 79
    .line 80
    move-result-wide v13

    .line 81
    const-wide/16 v15, 0x0

    .line 82
    .line 83
    cmp-long v15, v13, v15

    .line 84
    .line 85
    if-nez v15, :cond_4

    .line 86
    .line 87
    return-wide v5

    .line 88
    :cond_4
    invoke-interface {v12, v1, v2, v3, v4}, LD2/f;->f(JJ)J

    .line 89
    .line 90
    .line 91
    move-result-wide v15

    .line 92
    add-long/2addr v15, v13

    .line 93
    const-wide/16 v13, 0x1

    .line 94
    .line 95
    sub-long v13, v15, v13

    .line 96
    .line 97
    invoke-interface {v12, v13, v14}, LD2/f;->d(J)J

    .line 98
    .line 99
    .line 100
    move-result-wide v15

    .line 101
    add-long/2addr v15, v5

    .line 102
    invoke-interface {v12, v13, v14, v1, v2}, LD2/f;->e(JJ)J

    .line 103
    .line 104
    .line 105
    move-result-wide v12

    .line 106
    add-long/2addr v12, v15

    .line 107
    invoke-static {v8, v9, v12, v13}, Ljava/lang/Math;->min(JJ)J

    .line 108
    .line 109
    .line 110
    move-result-wide v8

    .line 111
    :cond_5
    :goto_2
    add-int/lit8 v11, v11, 0x1

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_6
    return-wide v8
.end method

.method private static K(LE2/g;JJ)J
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v3, p3

    .line 6
    .line 7
    iget-wide v5, v0, LE2/g;->b:J

    .line 8
    .line 9
    invoke-static {v5, v6}, Lt2/a0;->V0(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v5

    .line 13
    invoke-static {v0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->N(LE2/g;)Z

    .line 14
    .line 15
    .line 16
    move-result v7

    .line 17
    const/4 v8, 0x0

    .line 18
    move-wide v10, v5

    .line 19
    move v9, v8

    .line 20
    :goto_0
    iget-object v12, v0, LE2/g;->c:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v12

    .line 26
    if-ge v9, v12, :cond_6

    .line 27
    .line 28
    iget-object v12, v0, LE2/g;->c:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v12, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v12

    .line 34
    check-cast v12, LE2/a;

    .line 35
    .line 36
    iget-object v13, v12, LE2/a;->c:Ljava/util/List;

    .line 37
    .line 38
    iget v12, v12, LE2/a;->b:I

    .line 39
    .line 40
    const/4 v14, 0x1

    .line 41
    if-eq v12, v14, :cond_0

    .line 42
    .line 43
    const/4 v15, 0x2

    .line 44
    if-eq v12, v15, :cond_0

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    move v14, v8

    .line 48
    :goto_1
    if-eqz v7, :cond_1

    .line 49
    .line 50
    if-nez v14, :cond_5

    .line 51
    .line 52
    :cond_1
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v12

    .line 56
    if-eqz v12, :cond_2

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_2
    invoke-interface {v13, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v12

    .line 63
    check-cast v12, LE2/j;

    .line 64
    .line 65
    invoke-virtual {v12}, LE2/j;->b()LD2/f;

    .line 66
    .line 67
    .line 68
    move-result-object v12

    .line 69
    if-nez v12, :cond_3

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    invoke-interface {v12, v1, v2, v3, v4}, LD2/f;->m(JJ)J

    .line 73
    .line 74
    .line 75
    move-result-wide v13

    .line 76
    const-wide/16 v15, 0x0

    .line 77
    .line 78
    cmp-long v13, v13, v15

    .line 79
    .line 80
    if-nez v13, :cond_4

    .line 81
    .line 82
    :goto_2
    return-wide v5

    .line 83
    :cond_4
    invoke-interface {v12, v1, v2, v3, v4}, LD2/f;->f(JJ)J

    .line 84
    .line 85
    .line 86
    move-result-wide v13

    .line 87
    invoke-interface {v12, v13, v14}, LD2/f;->d(J)J

    .line 88
    .line 89
    .line 90
    move-result-wide v12

    .line 91
    add-long/2addr v12, v5

    .line 92
    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->max(JJ)J

    .line 93
    .line 94
    .line 95
    move-result-wide v10

    .line 96
    :cond_5
    :goto_3
    add-int/lit8 v9, v9, 0x1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_6
    return-wide v10
.end method

.method private static L(LE2/c;J)J
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, LE2/c;->e()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    invoke-virtual {v0, v1}, LE2/c;->d(I)LE2/g;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-wide v3, v2, LE2/g;->b:J

    .line 14
    .line 15
    invoke-static {v3, v4}, Lt2/a0;->V0(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    invoke-virtual {v0, v1}, LE2/c;->g(I)J

    .line 20
    .line 21
    .line 22
    move-result-wide v5

    .line 23
    invoke-static/range {p1 .. p2}, Lt2/a0;->V0(J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v7

    .line 27
    iget-wide v9, v0, LE2/c;->a:J

    .line 28
    .line 29
    invoke-static {v9, v10}, Lt2/a0;->V0(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v9

    .line 33
    iget-wide v0, v0, LE2/c;->e:J

    .line 34
    .line 35
    invoke-static {v0, v1}, Lt2/a0;->V0(J)J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    cmp-long v11, v0, v11

    .line 45
    .line 46
    const-wide/32 v12, 0x4c4b40

    .line 47
    .line 48
    .line 49
    if-eqz v11, :cond_0

    .line 50
    .line 51
    cmp-long v11, v0, v12

    .line 52
    .line 53
    if-gez v11, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    move-wide v0, v12

    .line 57
    :goto_0
    const/4 v11, 0x0

    .line 58
    move v12, v11

    .line 59
    :goto_1
    iget-object v13, v2, LE2/g;->c:Ljava/util/List;

    .line 60
    .line 61
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 62
    .line 63
    .line 64
    move-result v13

    .line 65
    if-ge v12, v13, :cond_5

    .line 66
    .line 67
    iget-object v13, v2, LE2/g;->c:Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {v13, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v13

    .line 73
    check-cast v13, LE2/a;

    .line 74
    .line 75
    iget-object v13, v13, LE2/a;->c:Ljava/util/List;

    .line 76
    .line 77
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result v14

    .line 81
    if-eqz v14, :cond_1

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_1
    invoke-interface {v13, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v13

    .line 88
    check-cast v13, LE2/j;

    .line 89
    .line 90
    invoke-virtual {v13}, LE2/j;->b()LD2/f;

    .line 91
    .line 92
    .line 93
    move-result-object v13

    .line 94
    if-eqz v13, :cond_4

    .line 95
    .line 96
    add-long v14, v9, v3

    .line 97
    .line 98
    invoke-interface {v13, v5, v6, v7, v8}, LD2/f;->g(JJ)J

    .line 99
    .line 100
    .line 101
    move-result-wide v16

    .line 102
    add-long v14, v14, v16

    .line 103
    .line 104
    sub-long/2addr v14, v7

    .line 105
    const-wide/16 v16, 0x0

    .line 106
    .line 107
    cmp-long v13, v14, v16

    .line 108
    .line 109
    if-gtz v13, :cond_2

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_2
    const-wide/32 v16, 0x186a0

    .line 113
    .line 114
    .line 115
    sub-long v18, v0, v16

    .line 116
    .line 117
    cmp-long v13, v14, v18

    .line 118
    .line 119
    if-ltz v13, :cond_3

    .line 120
    .line 121
    cmp-long v13, v14, v0

    .line 122
    .line 123
    if-lez v13, :cond_4

    .line 124
    .line 125
    add-long v16, v0, v16

    .line 126
    .line 127
    cmp-long v13, v14, v16

    .line 128
    .line 129
    if-gez v13, :cond_4

    .line 130
    .line 131
    :cond_3
    move-wide v0, v14

    .line 132
    :cond_4
    :goto_2
    add-int/lit8 v12, v12, 0x1

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_5
    const-wide/16 v2, 0x3e8

    .line 136
    .line 137
    sget-object v4, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 138
    .line 139
    invoke-static {v0, v1, v2, v3, v4}, LR9/e;->b(JJLjava/math/RoundingMode;)J

    .line 140
    .line 141
    .line 142
    move-result-wide v0

    .line 143
    return-wide v0
.end method

.method private M()J
    .locals 2

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->M:I

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

.method private static N(LE2/g;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, LE2/g;->c:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-ge v1, v2, :cond_2

    .line 10
    .line 11
    iget-object v2, p0, LE2/g;->c:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, LE2/a;

    .line 18
    .line 19
    iget v2, v2, LE2/a;->b:I

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    if-eq v2, v3, :cond_1

    .line 23
    .line 24
    const/4 v4, 0x2

    .line 25
    if-ne v2, v4, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    :goto_1
    return v3

    .line 32
    :cond_2
    return v0
.end method

.method private static O(LE2/g;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, LE2/g;->c:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-ge v1, v2, :cond_2

    .line 10
    .line 11
    iget-object v2, p0, LE2/g;->c:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, LE2/a;

    .line 18
    .line 19
    iget-object v2, v2, LE2/a;->c:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, LE2/j;

    .line 26
    .line 27
    invoke-virtual {v2}, LE2/j;->b()LD2/f;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-interface {v2}, LD2/f;->k()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    :goto_1
    const/4 p0, 0x1

    .line 44
    return p0

    .line 45
    :cond_2
    return v0
.end method

.method private P()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->A:LQ2/m;

    .line 2
    .line 3
    new-instance v1, Landroidx/media3/exoplayer/dash/DashMediaSource$a;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Landroidx/media3/exoplayer/dash/DashMediaSource$a;-><init>(Landroidx/media3/exoplayer/dash/DashMediaSource;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, LR2/b;->l(LQ2/m;LR2/b$b;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private Y(Ljava/io/IOException;)V
    .locals 4

    .line 1
    const-string v0, "DashMediaSource"

    .line 2
    .line 3
    const-string v1, "Failed to resolve time offset."

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lt2/w;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    sub-long/2addr v0, v2

    .line 17
    iput-wide v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->L:J

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource;->a0(Z)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method private Z(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->L:J

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource;->a0(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private a0(Z)V
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    iget-object v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->u:Landroid/util/SparseArray;

    .line 6
    .line 7
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-ge v2, v3, :cond_1

    .line 12
    .line 13
    iget-object v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->u:Landroid/util/SparseArray;

    .line 14
    .line 15
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->keyAt(I)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    iget v4, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->O:I

    .line 20
    .line 21
    if-lt v3, v4, :cond_0

    .line 22
    .line 23
    iget-object v4, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->u:Landroid/util/SparseArray;

    .line 24
    .line 25
    invoke-virtual {v4, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Landroidx/media3/exoplayer/dash/c;

    .line 30
    .line 31
    iget-object v5, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 32
    .line 33
    iget v6, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->O:I

    .line 34
    .line 35
    sub-int/2addr v3, v6

    .line 36
    invoke-virtual {v4, v5, v3}, Landroidx/media3/exoplayer/dash/c;->P(LE2/c;I)V

    .line 37
    .line 38
    .line 39
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iget-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 43
    .line 44
    invoke-virtual {v2, v1}, LE2/c;->d(I)LE2/g;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    iget-object v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 49
    .line 50
    invoke-virtual {v3}, LE2/c;->e()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    const/4 v4, 0x1

    .line 55
    sub-int/2addr v3, v4

    .line 56
    iget-object v5, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 57
    .line 58
    invoke-virtual {v5, v3}, LE2/c;->d(I)LE2/g;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    iget-object v6, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 63
    .line 64
    invoke-virtual {v6, v3}, LE2/c;->g(I)J

    .line 65
    .line 66
    .line 67
    move-result-wide v6

    .line 68
    iget-wide v8, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->L:J

    .line 69
    .line 70
    invoke-static {v8, v9}, Lt2/a0;->k0(J)J

    .line 71
    .line 72
    .line 73
    move-result-wide v8

    .line 74
    invoke-static {v8, v9}, Lt2/a0;->V0(J)J

    .line 75
    .line 76
    .line 77
    move-result-wide v8

    .line 78
    iget-object v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 79
    .line 80
    invoke-virtual {v3, v1}, LE2/c;->g(I)J

    .line 81
    .line 82
    .line 83
    move-result-wide v10

    .line 84
    invoke-static {v2, v10, v11, v8, v9}, Landroidx/media3/exoplayer/dash/DashMediaSource;->K(LE2/g;JJ)J

    .line 85
    .line 86
    .line 87
    move-result-wide v10

    .line 88
    invoke-static {v5, v6, v7, v8, v9}, Landroidx/media3/exoplayer/dash/DashMediaSource;->J(LE2/g;JJ)J

    .line 89
    .line 90
    .line 91
    move-result-wide v6

    .line 92
    iget-object v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 93
    .line 94
    iget-boolean v3, v3, LE2/c;->d:Z

    .line 95
    .line 96
    if-eqz v3, :cond_2

    .line 97
    .line 98
    invoke-static {v5}, Landroidx/media3/exoplayer/dash/DashMediaSource;->O(LE2/g;)Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-nez v3, :cond_2

    .line 103
    .line 104
    move v3, v4

    .line 105
    goto :goto_1

    .line 106
    :cond_2
    move v3, v1

    .line 107
    :goto_1
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    if-eqz v3, :cond_3

    .line 113
    .line 114
    iget-object v5, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 115
    .line 116
    iget-wide v14, v5, LE2/c;->f:J

    .line 117
    .line 118
    cmp-long v5, v14, v12

    .line 119
    .line 120
    if-eqz v5, :cond_3

    .line 121
    .line 122
    invoke-static {v14, v15}, Lt2/a0;->V0(J)J

    .line 123
    .line 124
    .line 125
    move-result-wide v14

    .line 126
    sub-long v14, v6, v14

    .line 127
    .line 128
    invoke-static {v10, v11, v14, v15}, Ljava/lang/Math;->max(JJ)J

    .line 129
    .line 130
    .line 131
    move-result-wide v10

    .line 132
    :cond_3
    sub-long/2addr v6, v10

    .line 133
    iget-object v5, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 134
    .line 135
    iget-boolean v14, v5, LE2/c;->d:Z

    .line 136
    .line 137
    move-wide/from16 v31, v12

    .line 138
    .line 139
    if-eqz v14, :cond_6

    .line 140
    .line 141
    iget-wide v14, v5, LE2/c;->a:J

    .line 142
    .line 143
    cmp-long v5, v14, v31

    .line 144
    .line 145
    if-eqz v5, :cond_4

    .line 146
    .line 147
    move v1, v4

    .line 148
    :cond_4
    invoke-static {v1}, Lt2/a;->g(Z)V

    .line 149
    .line 150
    .line 151
    iget-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 152
    .line 153
    iget-wide v4, v1, LE2/c;->a:J

    .line 154
    .line 155
    invoke-static {v4, v5}, Lt2/a0;->V0(J)J

    .line 156
    .line 157
    .line 158
    move-result-wide v4

    .line 159
    sub-long/2addr v8, v4

    .line 160
    sub-long/2addr v8, v10

    .line 161
    invoke-direct {v0, v8, v9, v6, v7}, Landroidx/media3/exoplayer/dash/DashMediaSource;->h0(JJ)V

    .line 162
    .line 163
    .line 164
    iget-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 165
    .line 166
    iget-wide v4, v1, LE2/c;->a:J

    .line 167
    .line 168
    invoke-static {v10, v11}, Lt2/a0;->F1(J)J

    .line 169
    .line 170
    .line 171
    move-result-wide v14

    .line 172
    add-long/2addr v4, v14

    .line 173
    iget-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->E:Lq2/C$g;

    .line 174
    .line 175
    iget-wide v14, v1, Lq2/C$g;->a:J

    .line 176
    .line 177
    invoke-static {v14, v15}, Lt2/a0;->V0(J)J

    .line 178
    .line 179
    .line 180
    move-result-wide v14

    .line 181
    sub-long/2addr v8, v14

    .line 182
    iget-wide v14, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->p:J

    .line 183
    .line 184
    const-wide/16 v16, 0x2

    .line 185
    .line 186
    const-wide/16 v33, 0x0

    .line 187
    .line 188
    div-long v12, v6, v16

    .line 189
    .line 190
    invoke-static {v14, v15, v12, v13}, Ljava/lang/Math;->min(JJ)J

    .line 191
    .line 192
    .line 193
    move-result-wide v12

    .line 194
    cmp-long v1, v8, v12

    .line 195
    .line 196
    move-wide/from16 v17, v4

    .line 197
    .line 198
    if-gez v1, :cond_5

    .line 199
    .line 200
    move-wide/from16 v26, v12

    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_5
    move-wide/from16 v26, v8

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_6
    const-wide/16 v33, 0x0

    .line 207
    .line 208
    move-wide/from16 v17, v31

    .line 209
    .line 210
    move-wide/from16 v26, v33

    .line 211
    .line 212
    :goto_2
    iget-wide v1, v2, LE2/g;->b:J

    .line 213
    .line 214
    invoke-static {v1, v2}, Lt2/a0;->V0(J)J

    .line 215
    .line 216
    .line 217
    move-result-wide v1

    .line 218
    sub-long v22, v10, v1

    .line 219
    .line 220
    new-instance v14, Landroidx/media3/exoplayer/dash/DashMediaSource$b;

    .line 221
    .line 222
    iget-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 223
    .line 224
    iget-wide v4, v1, LE2/c;->a:J

    .line 225
    .line 226
    iget-wide v8, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->L:J

    .line 227
    .line 228
    iget v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->O:I

    .line 229
    .line 230
    invoke-virtual {v0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->a()Lq2/C;

    .line 231
    .line 232
    .line 233
    move-result-object v29

    .line 234
    iget-object v10, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 235
    .line 236
    iget-boolean v10, v10, LE2/c;->d:Z

    .line 237
    .line 238
    if-eqz v10, :cond_7

    .line 239
    .line 240
    iget-object v10, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->E:Lq2/C$g;

    .line 241
    .line 242
    :goto_3
    move-object/from16 v28, v1

    .line 243
    .line 244
    move/from16 v21, v2

    .line 245
    .line 246
    move-wide v15, v4

    .line 247
    move-wide/from16 v24, v6

    .line 248
    .line 249
    move-wide/from16 v19, v8

    .line 250
    .line 251
    move-object/from16 v30, v10

    .line 252
    .line 253
    goto :goto_4

    .line 254
    :cond_7
    const/4 v10, 0x0

    .line 255
    goto :goto_3

    .line 256
    :goto_4
    invoke-direct/range {v14 .. v30}, Landroidx/media3/exoplayer/dash/DashMediaSource$b;-><init>(JJJIJJJLE2/c;Lq2/C;Lq2/C$g;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0, v14}, LM2/a;->B(Lq2/Y;)V

    .line 260
    .line 261
    .line 262
    iget-boolean v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->h:Z

    .line 263
    .line 264
    if-nez v1, :cond_b

    .line 265
    .line 266
    iget-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->D:Landroid/os/Handler;

    .line 267
    .line 268
    iget-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->w:Ljava/lang/Runnable;

    .line 269
    .line 270
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 271
    .line 272
    .line 273
    if-eqz v3, :cond_8

    .line 274
    .line 275
    iget-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->D:Landroid/os/Handler;

    .line 276
    .line 277
    iget-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->w:Ljava/lang/Runnable;

    .line 278
    .line 279
    iget-object v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 280
    .line 281
    iget-wide v4, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->L:J

    .line 282
    .line 283
    invoke-static {v4, v5}, Lt2/a0;->k0(J)J

    .line 284
    .line 285
    .line 286
    move-result-wide v4

    .line 287
    invoke-static {v3, v4, v5}, Landroidx/media3/exoplayer/dash/DashMediaSource;->L(LE2/c;J)J

    .line 288
    .line 289
    .line 290
    move-result-wide v3

    .line 291
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 292
    .line 293
    .line 294
    :cond_8
    iget-boolean v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->I:Z

    .line 295
    .line 296
    if-eqz v1, :cond_9

    .line 297
    .line 298
    invoke-direct {v0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->g0()V

    .line 299
    .line 300
    .line 301
    return-void

    .line 302
    :cond_9
    if-eqz p1, :cond_b

    .line 303
    .line 304
    iget-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 305
    .line 306
    iget-boolean v2, v1, LE2/c;->d:Z

    .line 307
    .line 308
    if-eqz v2, :cond_b

    .line 309
    .line 310
    iget-wide v1, v1, LE2/c;->e:J

    .line 311
    .line 312
    cmp-long v3, v1, v31

    .line 313
    .line 314
    if-eqz v3, :cond_b

    .line 315
    .line 316
    cmp-long v3, v1, v33

    .line 317
    .line 318
    if-nez v3, :cond_a

    .line 319
    .line 320
    const-wide/16 v1, 0x1388

    .line 321
    .line 322
    :cond_a
    iget-wide v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->J:J

    .line 323
    .line 324
    add-long/2addr v3, v1

    .line 325
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 326
    .line 327
    .line 328
    move-result-wide v1

    .line 329
    sub-long/2addr v3, v1

    .line 330
    move-wide/from16 v1, v33

    .line 331
    .line 332
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 333
    .line 334
    .line 335
    move-result-wide v1

    .line 336
    invoke-direct {v0, v1, v2}, Landroidx/media3/exoplayer/dash/DashMediaSource;->e0(J)V

    .line 337
    .line 338
    .line 339
    :cond_b
    return-void
.end method

.method private b0(LE2/o;)V
    .locals 2

    .line 1
    iget-object v0, p1, LE2/o;->a:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "urn:mpeg:dash:utc:direct:2014"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_7

    .line 10
    .line 11
    const-string v1, "urn:mpeg:dash:utc:direct:2012"

    .line 12
    .line 13
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    goto :goto_3

    .line 20
    :cond_0
    const-string v1, "urn:mpeg:dash:utc:http-iso:2014"

    .line 21
    .line 22
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_6

    .line 27
    .line 28
    const-string v1, "urn:mpeg:dash:utc:http-iso:2012"

    .line 29
    .line 30
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    const-string v1, "urn:mpeg:dash:utc:http-xsdate:2014"

    .line 38
    .line 39
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_5

    .line 44
    .line 45
    const-string v1, "urn:mpeg:dash:utc:http-xsdate:2012"

    .line 46
    .line 47
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    const-string p1, "urn:mpeg:dash:utc:ntp:2014"

    .line 55
    .line 56
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-nez p1, :cond_4

    .line 61
    .line 62
    const-string p1, "urn:mpeg:dash:utc:ntp:2012"

    .line 63
    .line 64
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_3

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    new-instance p1, Ljava/io/IOException;

    .line 72
    .line 73
    const-string v0, "Unsupported UTC timing scheme"

    .line 74
    .line 75
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource;->Y(Ljava/io/IOException;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_4
    :goto_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->P()V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_5
    :goto_1
    new-instance v0, Landroidx/media3/exoplayer/dash/DashMediaSource$h;

    .line 87
    .line 88
    const/4 v1, 0x0

    .line 89
    invoke-direct {v0, v1}, Landroidx/media3/exoplayer/dash/DashMediaSource$h;-><init>(Landroidx/media3/exoplayer/dash/DashMediaSource$a;)V

    .line 90
    .line 91
    .line 92
    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->d0(LE2/o;LQ2/o$a;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_6
    :goto_2
    new-instance v0, Landroidx/media3/exoplayer/dash/DashMediaSource$d;

    .line 97
    .line 98
    invoke-direct {v0}, Landroidx/media3/exoplayer/dash/DashMediaSource$d;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->d0(LE2/o;LQ2/o$a;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_7
    :goto_3
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource;->c0(LE2/o;)V

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method private c0(LE2/o;)V
    .locals 4

    .line 1
    :try_start_0
    iget-object p1, p1, LE2/o;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p1}, Lt2/a0;->d1(Ljava/lang/String;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-wide v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->K:J

    .line 8
    .line 9
    sub-long/2addr v0, v2

    .line 10
    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/dash/DashMediaSource;->Z(J)V
    :try_end_0
    .catch Lq2/L; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catch_0
    move-exception p1

    .line 15
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource;->Y(Ljava/io/IOException;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private d0(LE2/o;LQ2/o$a;)V
    .locals 3

    .line 1
    new-instance v0, LQ2/o;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->z:Lw2/g;

    .line 4
    .line 5
    iget-object p1, p1, LE2/o;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v2, 0x5

    .line 12
    invoke-direct {v0, v1, p1, v2, p2}, LQ2/o;-><init>(Lw2/g;Landroid/net/Uri;ILQ2/o$a;)V

    .line 13
    .line 14
    .line 15
    new-instance p1, Landroidx/media3/exoplayer/dash/DashMediaSource$g;

    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    invoke-direct {p1, p0, p2}, Landroidx/media3/exoplayer/dash/DashMediaSource$g;-><init>(Landroidx/media3/exoplayer/dash/DashMediaSource;Landroidx/media3/exoplayer/dash/DashMediaSource$a;)V

    .line 19
    .line 20
    .line 21
    const/4 p2, 0x1

    .line 22
    invoke-direct {p0, v0, p1, p2}, Landroidx/media3/exoplayer/dash/DashMediaSource;->f0(LQ2/o;LQ2/m$b;I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method private e0(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->D:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->v:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private f0(LQ2/o;LQ2/m$b;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->A:LQ2/m;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, LQ2/m;->n(LQ2/m$e;LQ2/m$b;I)J

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private g0()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->D:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->v:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->A:LQ2/m;

    .line 9
    .line 10
    invoke-virtual {v0}, LQ2/m;->i()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->A:LQ2/m;

    .line 18
    .line 19
    invoke-virtual {v0}, LQ2/m;->j()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x1

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iput-boolean v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->I:Z

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->t:Ljava/lang/Object;

    .line 30
    .line 31
    monitor-enter v0

    .line 32
    :try_start_0
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->F:Landroid/net/Uri;

    .line 33
    .line 34
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    const/4 v0, 0x0

    .line 36
    iput-boolean v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->I:Z

    .line 37
    .line 38
    new-instance v0, Lw2/o$b;

    .line 39
    .line 40
    invoke-direct {v0}, Lw2/o$b;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v2}, Lw2/o$b;->i(Landroid/net/Uri;)Lw2/o$b;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0, v1}, Lw2/o$b;->b(I)Lw2/o$b;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Lw2/o$b;->a()Lw2/o;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    new-instance v1, LQ2/o;

    .line 56
    .line 57
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->z:Lw2/g;

    .line 58
    .line 59
    iget-object v3, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->r:LQ2/o$a;

    .line 60
    .line 61
    const/4 v4, 0x4

    .line 62
    invoke-direct {v1, v2, v0, v4, v3}, LQ2/o;-><init>(Lw2/g;Lw2/o;ILQ2/o$a;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->s:Landroidx/media3/exoplayer/dash/DashMediaSource$e;

    .line 66
    .line 67
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->m:LQ2/k;

    .line 68
    .line 69
    invoke-interface {v2, v4}, LQ2/k;->a(I)I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    invoke-direct {p0, v1, v0, v2}, Landroidx/media3/exoplayer/dash/DashMediaSource;->f0(LQ2/o;LQ2/m$b;I)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :catchall_0
    move-exception v1

    .line 78
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    throw v1
.end method

.method private h0(JJ)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->a()Lq2/C;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, Lq2/C;->d:Lq2/C$g;

    .line 8
    .line 9
    invoke-static/range {p1 .. p2}, Lt2/a0;->F1(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v6

    .line 13
    iget-wide v2, v1, Lq2/C$g;->c:J

    .line 14
    .line 15
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    cmp-long v4, v2, v8

    .line 21
    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    :goto_0
    move-wide v10, v2

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    iget-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 31
    .line 32
    iget-object v2, v2, LE2/c;->j:LE2/l;

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    iget-wide v2, v2, LE2/l;->c:J

    .line 37
    .line 38
    cmp-long v4, v2, v8

    .line 39
    .line 40
    if-eqz v4, :cond_1

    .line 41
    .line 42
    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide v2

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move-wide v10, v6

    .line 48
    :goto_1
    sub-long v2, p1, p3

    .line 49
    .line 50
    invoke-static {v2, v3}, Lt2/a0;->F1(J)J

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    const-wide/16 v4, 0x0

    .line 55
    .line 56
    cmp-long v12, v2, v4

    .line 57
    .line 58
    if-gez v12, :cond_2

    .line 59
    .line 60
    cmp-long v12, v10, v4

    .line 61
    .line 62
    if-lez v12, :cond_2

    .line 63
    .line 64
    move-wide v2, v4

    .line 65
    :cond_2
    iget-object v4, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 66
    .line 67
    iget-wide v4, v4, LE2/c;->c:J

    .line 68
    .line 69
    cmp-long v12, v4, v8

    .line 70
    .line 71
    if-eqz v12, :cond_3

    .line 72
    .line 73
    add-long/2addr v2, v4

    .line 74
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 75
    .line 76
    .line 77
    move-result-wide v2

    .line 78
    :cond_3
    move-wide v4, v2

    .line 79
    iget-wide v2, v1, Lq2/C$g;->b:J

    .line 80
    .line 81
    cmp-long v12, v2, v8

    .line 82
    .line 83
    if-eqz v12, :cond_5

    .line 84
    .line 85
    invoke-static/range {v2 .. v7}, Lt2/a0;->s(JJJ)J

    .line 86
    .line 87
    .line 88
    move-result-wide v4

    .line 89
    :cond_4
    :goto_2
    move-wide v14, v4

    .line 90
    goto :goto_3

    .line 91
    :cond_5
    iget-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 92
    .line 93
    iget-object v2, v2, LE2/c;->j:LE2/l;

    .line 94
    .line 95
    if-eqz v2, :cond_4

    .line 96
    .line 97
    iget-wide v2, v2, LE2/l;->b:J

    .line 98
    .line 99
    cmp-long v12, v2, v8

    .line 100
    .line 101
    if-eqz v12, :cond_4

    .line 102
    .line 103
    invoke-static/range {v2 .. v7}, Lt2/a0;->s(JJJ)J

    .line 104
    .line 105
    .line 106
    move-result-wide v4

    .line 107
    goto :goto_2

    .line 108
    :goto_3
    cmp-long v2, v14, v10

    .line 109
    .line 110
    if-lez v2, :cond_6

    .line 111
    .line 112
    move-wide/from16 v16, v14

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_6
    move-wide/from16 v16, v10

    .line 116
    .line 117
    :goto_4
    iget-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->E:Lq2/C$g;

    .line 118
    .line 119
    iget-wide v2, v2, Lq2/C$g;->a:J

    .line 120
    .line 121
    cmp-long v4, v2, v8

    .line 122
    .line 123
    if-eqz v4, :cond_7

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_7
    iget-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 127
    .line 128
    iget-object v3, v2, LE2/c;->j:LE2/l;

    .line 129
    .line 130
    if-eqz v3, :cond_8

    .line 131
    .line 132
    iget-wide v3, v3, LE2/l;->a:J

    .line 133
    .line 134
    cmp-long v5, v3, v8

    .line 135
    .line 136
    if-eqz v5, :cond_8

    .line 137
    .line 138
    move-wide v2, v3

    .line 139
    goto :goto_5

    .line 140
    :cond_8
    iget-wide v2, v2, LE2/c;->g:J

    .line 141
    .line 142
    cmp-long v4, v2, v8

    .line 143
    .line 144
    if-eqz v4, :cond_9

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_9
    iget-wide v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->o:J

    .line 148
    .line 149
    :goto_5
    cmp-long v4, v2, v14

    .line 150
    .line 151
    if-gez v4, :cond_a

    .line 152
    .line 153
    move-wide v2, v14

    .line 154
    :cond_a
    cmp-long v4, v2, v16

    .line 155
    .line 156
    if-lez v4, :cond_b

    .line 157
    .line 158
    iget-wide v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->p:J

    .line 159
    .line 160
    const-wide/16 v4, 0x2

    .line 161
    .line 162
    div-long v4, p3, v4

    .line 163
    .line 164
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 165
    .line 166
    .line 167
    move-result-wide v2

    .line 168
    sub-long v2, p1, v2

    .line 169
    .line 170
    invoke-static {v2, v3}, Lt2/a0;->F1(J)J

    .line 171
    .line 172
    .line 173
    move-result-wide v12

    .line 174
    invoke-static/range {v12 .. v17}, Lt2/a0;->s(JJJ)J

    .line 175
    .line 176
    .line 177
    move-result-wide v2

    .line 178
    :cond_b
    move-wide/from16 v10, v16

    .line 179
    .line 180
    iget v4, v1, Lq2/C$g;->d:F

    .line 181
    .line 182
    const v5, -0x800001

    .line 183
    .line 184
    .line 185
    cmpl-float v6, v4, v5

    .line 186
    .line 187
    if-eqz v6, :cond_c

    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_c
    iget-object v4, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 191
    .line 192
    iget-object v4, v4, LE2/c;->j:LE2/l;

    .line 193
    .line 194
    if-eqz v4, :cond_d

    .line 195
    .line 196
    iget v4, v4, LE2/l;->d:F

    .line 197
    .line 198
    goto :goto_6

    .line 199
    :cond_d
    move v4, v5

    .line 200
    :goto_6
    iget v1, v1, Lq2/C$g;->e:F

    .line 201
    .line 202
    cmpl-float v6, v1, v5

    .line 203
    .line 204
    if-eqz v6, :cond_e

    .line 205
    .line 206
    goto :goto_7

    .line 207
    :cond_e
    iget-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 208
    .line 209
    iget-object v1, v1, LE2/c;->j:LE2/l;

    .line 210
    .line 211
    if-eqz v1, :cond_f

    .line 212
    .line 213
    iget v1, v1, LE2/l;->e:F

    .line 214
    .line 215
    goto :goto_7

    .line 216
    :cond_f
    move v1, v5

    .line 217
    :goto_7
    cmpl-float v6, v4, v5

    .line 218
    .line 219
    if-nez v6, :cond_11

    .line 220
    .line 221
    cmpl-float v5, v1, v5

    .line 222
    .line 223
    if-nez v5, :cond_11

    .line 224
    .line 225
    iget-object v5, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 226
    .line 227
    iget-object v5, v5, LE2/c;->j:LE2/l;

    .line 228
    .line 229
    if-eqz v5, :cond_10

    .line 230
    .line 231
    iget-wide v5, v5, LE2/l;->a:J

    .line 232
    .line 233
    cmp-long v5, v5, v8

    .line 234
    .line 235
    if-nez v5, :cond_11

    .line 236
    .line 237
    :cond_10
    const/high16 v4, 0x3f800000    # 1.0f

    .line 238
    .line 239
    move v1, v4

    .line 240
    :cond_11
    new-instance v5, Lq2/C$g$a;

    .line 241
    .line 242
    invoke-direct {v5}, Lq2/C$g$a;-><init>()V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v5, v2, v3}, Lq2/C$g$a;->k(J)Lq2/C$g$a;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    invoke-virtual {v2, v14, v15}, Lq2/C$g$a;->i(J)Lq2/C$g$a;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    invoke-virtual {v2, v10, v11}, Lq2/C$g$a;->g(J)Lq2/C$g$a;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    invoke-virtual {v2, v4}, Lq2/C$g$a;->j(F)Lq2/C$g$a;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    invoke-virtual {v2, v1}, Lq2/C$g$a;->h(F)Lq2/C$g$a;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-virtual {v1}, Lq2/C$g$a;->f()Lq2/C$g;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    iput-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->E:Lq2/C$g;

    .line 270
    .line 271
    return-void
.end method


# virtual methods
.method protected A(Lw2/F;)V
    .locals 2

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->B:Lw2/F;

    .line 2
    .line 3
    iget-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->l:LF2/u;

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, LM2/a;->y()LB2/K1;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {p1, v0, v1}, LF2/u;->e(Landroid/os/Looper;LB2/K1;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->l:LF2/u;

    .line 17
    .line 18
    invoke-interface {p1}, LF2/u;->s()V

    .line 19
    .line 20
    .line 21
    iget-boolean p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->h:Z

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource;->a0(Z)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    iget-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->i:Lw2/g$a;

    .line 31
    .line 32
    invoke-interface {p1}, Lw2/g$a;->a()Lw2/g;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->z:Lw2/g;

    .line 37
    .line 38
    new-instance p1, LQ2/m;

    .line 39
    .line 40
    const-string v0, "DashMediaSource"

    .line 41
    .line 42
    invoke-direct {p1, v0}, LQ2/m;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->A:LQ2/m;

    .line 46
    .line 47
    invoke-static {}, Lt2/a0;->C()Landroid/os/Handler;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->D:Landroid/os/Handler;

    .line 52
    .line 53
    invoke-direct {p0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->g0()V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method protected C()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->I:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-object v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->z:Lw2/g;

    .line 6
    .line 7
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->A:LQ2/m;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v2}, LQ2/m;->l()V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->A:LQ2/m;

    .line 15
    .line 16
    :cond_0
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    iput-wide v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->J:J

    .line 19
    .line 20
    iput-wide v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->K:J

    .line 21
    .line 22
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->G:Landroid/net/Uri;

    .line 23
    .line 24
    iput-object v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->F:Landroid/net/Uri;

    .line 25
    .line 26
    iput-object v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->C:Ljava/io/IOException;

    .line 27
    .line 28
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->D:Landroid/os/Handler;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->D:Landroid/os/Handler;

    .line 36
    .line 37
    :cond_1
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    iput-wide v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->L:J

    .line 43
    .line 44
    iput v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->M:I

    .line 45
    .line 46
    iput-wide v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->N:J

    .line 47
    .line 48
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->u:Landroid/util/SparseArray;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->n:LD2/b;

    .line 54
    .line 55
    invoke-virtual {v0}, LD2/b;->i()V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->l:LF2/u;

    .line 59
    .line 60
    invoke-interface {v0}, LF2/u;->a()V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method Q(J)V
    .locals 4

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->N:J

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
    if-eqz v2, :cond_1

    .line 11
    .line 12
    cmp-long v0, v0, p1

    .line 13
    .line 14
    if-gez v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    return-void

    .line 18
    :cond_1
    :goto_0
    iput-wide p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->N:J

    .line 19
    .line 20
    return-void
.end method

.method R()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->D:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->w:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->g0()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method S(LQ2/o;JJ)V
    .locals 12

    .line 1
    new-instance v0, LM2/y;

    .line 2
    .line 3
    iget-wide v1, p1, LQ2/o;->a:J

    .line 4
    .line 5
    iget-object v3, p1, LQ2/o;->b:Lw2/o;

    .line 6
    .line 7
    invoke-virtual {p1}, LQ2/o;->f()Landroid/net/Uri;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    invoke-virtual {p1}, LQ2/o;->d()Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-virtual {p1}, LQ2/o;->b()J

    .line 16
    .line 17
    .line 18
    move-result-wide v10

    .line 19
    move-wide v6, p2

    .line 20
    move-wide/from16 v8, p4

    .line 21
    .line 22
    invoke-direct/range {v0 .. v11}, LM2/y;-><init>(JLw2/o;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->m:LQ2/k;

    .line 26
    .line 27
    iget-wide v2, p1, LQ2/o;->a:J

    .line 28
    .line 29
    invoke-interface {v1, v2, v3}, LQ2/k;->d(J)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->q:LM2/L$a;

    .line 33
    .line 34
    iget p1, p1, LQ2/o;->c:I

    .line 35
    .line 36
    invoke-virtual {v1, v0, p1}, LM2/L$a;->l(LM2/y;I)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method T(LQ2/o;JJ)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    new-instance v2, LM2/y;

    .line 6
    .line 7
    iget-wide v3, v0, LQ2/o;->a:J

    .line 8
    .line 9
    iget-object v5, v0, LQ2/o;->b:Lw2/o;

    .line 10
    .line 11
    invoke-virtual {v0}, LQ2/o;->f()Landroid/net/Uri;

    .line 12
    .line 13
    .line 14
    move-result-object v6

    .line 15
    invoke-virtual {v0}, LQ2/o;->d()Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object v7

    .line 19
    invoke-virtual {v0}, LQ2/o;->b()J

    .line 20
    .line 21
    .line 22
    move-result-wide v12

    .line 23
    move-wide/from16 v8, p2

    .line 24
    .line 25
    move-wide/from16 v10, p4

    .line 26
    .line 27
    invoke-direct/range {v2 .. v13}, LM2/y;-><init>(JLw2/o;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 28
    .line 29
    .line 30
    iget-object v3, v1, Landroidx/media3/exoplayer/dash/DashMediaSource;->m:LQ2/k;

    .line 31
    .line 32
    iget-wide v4, v0, LQ2/o;->a:J

    .line 33
    .line 34
    invoke-interface {v3, v4, v5}, LQ2/k;->d(J)V

    .line 35
    .line 36
    .line 37
    iget-object v3, v1, Landroidx/media3/exoplayer/dash/DashMediaSource;->q:LM2/L$a;

    .line 38
    .line 39
    iget v4, v0, LQ2/o;->c:I

    .line 40
    .line 41
    invoke-virtual {v3, v2, v4}, LM2/L$a;->o(LM2/y;I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, LQ2/o;->e()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, LE2/c;

    .line 49
    .line 50
    iget-object v3, v1, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    if-nez v3, :cond_0

    .line 54
    .line 55
    move v3, v4

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-virtual {v3}, LE2/c;->e()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    :goto_0
    invoke-virtual {v2, v4}, LE2/c;->d(I)LE2/g;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    iget-wide v5, v5, LE2/g;->b:J

    .line 66
    .line 67
    move v7, v4

    .line 68
    :goto_1
    if-ge v7, v3, :cond_1

    .line 69
    .line 70
    iget-object v10, v1, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 71
    .line 72
    invoke-virtual {v10, v7}, LE2/c;->d(I)LE2/g;

    .line 73
    .line 74
    .line 75
    move-result-object v10

    .line 76
    iget-wide v10, v10, LE2/g;->b:J

    .line 77
    .line 78
    cmp-long v10, v10, v5

    .line 79
    .line 80
    if-gez v10, :cond_1

    .line 81
    .line 82
    add-int/lit8 v7, v7, 0x1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    iget-boolean v5, v2, LE2/c;->d:Z

    .line 86
    .line 87
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    if-eqz v5, :cond_5

    .line 93
    .line 94
    sub-int/2addr v3, v7

    .line 95
    invoke-virtual {v2}, LE2/c;->e()I

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-le v3, v5, :cond_2

    .line 100
    .line 101
    const-string v2, "DashMediaSource"

    .line 102
    .line 103
    const-string v3, "Loaded out of sync manifest"

    .line 104
    .line 105
    invoke-static {v2, v3}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_2
    iget-wide v5, v1, Landroidx/media3/exoplayer/dash/DashMediaSource;->N:J

    .line 110
    .line 111
    cmp-long v3, v5, v10

    .line 112
    .line 113
    if-eqz v3, :cond_4

    .line 114
    .line 115
    iget-wide v12, v2, LE2/c;->h:J

    .line 116
    .line 117
    const-wide/16 v14, 0x3e8

    .line 118
    .line 119
    mul-long/2addr v12, v14

    .line 120
    cmp-long v3, v12, v5

    .line 121
    .line 122
    if-gtz v3, :cond_4

    .line 123
    .line 124
    const-string v3, "DashMediaSource"

    .line 125
    .line 126
    new-instance v4, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .line 130
    .line 131
    const-string v5, "Loaded stale dynamic manifest: "

    .line 132
    .line 133
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    iget-wide v5, v2, LE2/c;->h:J

    .line 137
    .line 138
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string v2, ", "

    .line 142
    .line 143
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    iget-wide v5, v1, Landroidx/media3/exoplayer/dash/DashMediaSource;->N:J

    .line 147
    .line 148
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-static {v3, v2}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    :goto_2
    iget v2, v1, Landroidx/media3/exoplayer/dash/DashMediaSource;->M:I

    .line 159
    .line 160
    add-int/lit8 v3, v2, 0x1

    .line 161
    .line 162
    iput v3, v1, Landroidx/media3/exoplayer/dash/DashMediaSource;->M:I

    .line 163
    .line 164
    iget-object v3, v1, Landroidx/media3/exoplayer/dash/DashMediaSource;->m:LQ2/k;

    .line 165
    .line 166
    iget v0, v0, LQ2/o;->c:I

    .line 167
    .line 168
    invoke-interface {v3, v0}, LQ2/k;->a(I)I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-ge v2, v0, :cond_3

    .line 173
    .line 174
    invoke-direct {v1}, Landroidx/media3/exoplayer/dash/DashMediaSource;->M()J

    .line 175
    .line 176
    .line 177
    move-result-wide v2

    .line 178
    invoke-direct {v1, v2, v3}, Landroidx/media3/exoplayer/dash/DashMediaSource;->e0(J)V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :cond_3
    new-instance v0, LD2/c;

    .line 183
    .line 184
    invoke-direct {v0}, LD2/c;-><init>()V

    .line 185
    .line 186
    .line 187
    iput-object v0, v1, Landroidx/media3/exoplayer/dash/DashMediaSource;->C:Ljava/io/IOException;

    .line 188
    .line 189
    return-void

    .line 190
    :cond_4
    iput v4, v1, Landroidx/media3/exoplayer/dash/DashMediaSource;->M:I

    .line 191
    .line 192
    :cond_5
    iput-object v2, v1, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 193
    .line 194
    iget-boolean v3, v1, Landroidx/media3/exoplayer/dash/DashMediaSource;->I:Z

    .line 195
    .line 196
    iget-boolean v2, v2, LE2/c;->d:Z

    .line 197
    .line 198
    and-int/2addr v2, v3

    .line 199
    iput-boolean v2, v1, Landroidx/media3/exoplayer/dash/DashMediaSource;->I:Z

    .line 200
    .line 201
    sub-long v2, v8, p4

    .line 202
    .line 203
    iput-wide v2, v1, Landroidx/media3/exoplayer/dash/DashMediaSource;->J:J

    .line 204
    .line 205
    iput-wide v8, v1, Landroidx/media3/exoplayer/dash/DashMediaSource;->K:J

    .line 206
    .line 207
    iget v2, v1, Landroidx/media3/exoplayer/dash/DashMediaSource;->O:I

    .line 208
    .line 209
    add-int/2addr v2, v7

    .line 210
    iput v2, v1, Landroidx/media3/exoplayer/dash/DashMediaSource;->O:I

    .line 211
    .line 212
    iget-object v2, v1, Landroidx/media3/exoplayer/dash/DashMediaSource;->t:Ljava/lang/Object;

    .line 213
    .line 214
    monitor-enter v2

    .line 215
    :try_start_0
    iget-object v3, v0, LQ2/o;->b:Lw2/o;

    .line 216
    .line 217
    iget-object v3, v3, Lw2/o;->a:Landroid/net/Uri;

    .line 218
    .line 219
    iget-object v4, v1, Landroidx/media3/exoplayer/dash/DashMediaSource;->F:Landroid/net/Uri;

    .line 220
    .line 221
    invoke-virtual {v3, v4}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    if-nez v3, :cond_6

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_6
    iget-object v3, v1, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 229
    .line 230
    iget-object v3, v3, LE2/c;->k:Landroid/net/Uri;

    .line 231
    .line 232
    if-eqz v3, :cond_7

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_7
    invoke-virtual {v0}, LQ2/o;->f()Landroid/net/Uri;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-static {v0}, LQ2/f;->b(Landroid/net/Uri;)Landroid/net/Uri;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    :goto_3
    iput-object v3, v1, Landroidx/media3/exoplayer/dash/DashMediaSource;->F:Landroid/net/Uri;

    .line 244
    .line 245
    :goto_4
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 246
    iget-object v0, v1, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 247
    .line 248
    iget-boolean v2, v0, LE2/c;->d:Z

    .line 249
    .line 250
    if-eqz v2, :cond_9

    .line 251
    .line 252
    iget-wide v2, v1, Landroidx/media3/exoplayer/dash/DashMediaSource;->L:J

    .line 253
    .line 254
    cmp-long v2, v2, v10

    .line 255
    .line 256
    if-nez v2, :cond_9

    .line 257
    .line 258
    iget-object v0, v0, LE2/c;->i:LE2/o;

    .line 259
    .line 260
    if-eqz v0, :cond_8

    .line 261
    .line 262
    invoke-direct {v1, v0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->b0(LE2/o;)V

    .line 263
    .line 264
    .line 265
    return-void

    .line 266
    :cond_8
    invoke-direct {v1}, Landroidx/media3/exoplayer/dash/DashMediaSource;->P()V

    .line 267
    .line 268
    .line 269
    return-void

    .line 270
    :cond_9
    const/4 v0, 0x1

    .line 271
    invoke-direct {v1, v0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->a0(Z)V

    .line 272
    .line 273
    .line 274
    return-void

    .line 275
    :catchall_0
    move-exception v0

    .line 276
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 277
    throw v0
.end method

.method U(LQ2/o;JJLjava/io/IOException;I)LQ2/m$c;
    .locals 13

    .line 1
    move-object/from16 v0, p6

    .line 2
    .line 3
    new-instance v1, LM2/y;

    .line 4
    .line 5
    iget-wide v2, p1, LQ2/o;->a:J

    .line 6
    .line 7
    iget-object v4, p1, LQ2/o;->b:Lw2/o;

    .line 8
    .line 9
    invoke-virtual {p1}, LQ2/o;->f()Landroid/net/Uri;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    invoke-virtual {p1}, LQ2/o;->d()Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    invoke-virtual {p1}, LQ2/o;->b()J

    .line 18
    .line 19
    .line 20
    move-result-wide v11

    .line 21
    move-wide v7, p2

    .line 22
    move-wide/from16 v9, p4

    .line 23
    .line 24
    invoke-direct/range {v1 .. v12}, LM2/y;-><init>(JLw2/o;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 25
    .line 26
    .line 27
    new-instance v2, LM2/B;

    .line 28
    .line 29
    iget v3, p1, LQ2/o;->c:I

    .line 30
    .line 31
    invoke-direct {v2, v3}, LM2/B;-><init>(I)V

    .line 32
    .line 33
    .line 34
    new-instance v3, LQ2/k$c;

    .line 35
    .line 36
    move/from16 v4, p7

    .line 37
    .line 38
    invoke-direct {v3, v1, v2, v0, v4}, LQ2/k$c;-><init>(LM2/y;LM2/B;Ljava/io/IOException;I)V

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->m:LQ2/k;

    .line 42
    .line 43
    invoke-interface {v2, v3}, LQ2/k;->c(LQ2/k$c;)J

    .line 44
    .line 45
    .line 46
    move-result-wide v2

    .line 47
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    cmp-long v4, v2, v4

    .line 53
    .line 54
    if-nez v4, :cond_0

    .line 55
    .line 56
    sget-object v2, LQ2/m;->g:LQ2/m$c;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    const/4 v4, 0x0

    .line 60
    invoke-static {v4, v2, v3}, LQ2/m;->h(ZJ)LQ2/m$c;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    :goto_0
    invoke-virtual {v2}, LQ2/m$c;->c()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    xor-int/lit8 v4, v3, 0x1

    .line 69
    .line 70
    iget-object v5, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->q:LM2/L$a;

    .line 71
    .line 72
    iget v6, p1, LQ2/o;->c:I

    .line 73
    .line 74
    invoke-virtual {v5, v1, v6, v0, v4}, LM2/L$a;->s(LM2/y;ILjava/io/IOException;Z)V

    .line 75
    .line 76
    .line 77
    if-nez v3, :cond_1

    .line 78
    .line 79
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->m:LQ2/k;

    .line 80
    .line 81
    iget-wide v3, p1, LQ2/o;->a:J

    .line 82
    .line 83
    invoke-interface {v0, v3, v4}, LQ2/k;->d(J)V

    .line 84
    .line 85
    .line 86
    :cond_1
    return-object v2
.end method

.method V(LQ2/o;JJI)V
    .locals 15

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p6

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    new-instance v2, LM2/y;

    .line 8
    .line 9
    iget-wide v3, v0, LQ2/o;->a:J

    .line 10
    .line 11
    iget-object v5, v0, LQ2/o;->b:Lw2/o;

    .line 12
    .line 13
    move-wide/from16 v6, p2

    .line 14
    .line 15
    invoke-direct/range {v2 .. v7}, LM2/y;-><init>(JLw2/o;J)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v3, LM2/y;

    .line 20
    .line 21
    iget-wide v4, v0, LQ2/o;->a:J

    .line 22
    .line 23
    iget-object v6, v0, LQ2/o;->b:Lw2/o;

    .line 24
    .line 25
    invoke-virtual {v0}, LQ2/o;->f()Landroid/net/Uri;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    invoke-virtual {v0}, LQ2/o;->d()Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    invoke-virtual {v0}, LQ2/o;->b()J

    .line 34
    .line 35
    .line 36
    move-result-wide v13

    .line 37
    move-wide/from16 v9, p2

    .line 38
    .line 39
    move-wide/from16 v11, p4

    .line 40
    .line 41
    invoke-direct/range {v3 .. v14}, LM2/y;-><init>(JLw2/o;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 42
    .line 43
    .line 44
    move-object v2, v3

    .line 45
    :goto_0
    iget-object v3, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->q:LM2/L$a;

    .line 46
    .line 47
    iget v0, v0, LQ2/o;->c:I

    .line 48
    .line 49
    invoke-virtual {v3, v2, v0, v1}, LM2/L$a;->u(LM2/y;II)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method W(LQ2/o;JJ)V
    .locals 12

    .line 1
    new-instance v0, LM2/y;

    .line 2
    .line 3
    iget-wide v1, p1, LQ2/o;->a:J

    .line 4
    .line 5
    iget-object v3, p1, LQ2/o;->b:Lw2/o;

    .line 6
    .line 7
    invoke-virtual {p1}, LQ2/o;->f()Landroid/net/Uri;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    invoke-virtual {p1}, LQ2/o;->d()Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-virtual {p1}, LQ2/o;->b()J

    .line 16
    .line 17
    .line 18
    move-result-wide v10

    .line 19
    move-wide v6, p2

    .line 20
    move-wide/from16 v8, p4

    .line 21
    .line 22
    invoke-direct/range {v0 .. v11}, LM2/y;-><init>(JLw2/o;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->m:LQ2/k;

    .line 26
    .line 27
    iget-wide v2, p1, LQ2/o;->a:J

    .line 28
    .line 29
    invoke-interface {v1, v2, v3}, LQ2/k;->d(J)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->q:LM2/L$a;

    .line 33
    .line 34
    iget v2, p1, LQ2/o;->c:I

    .line 35
    .line 36
    invoke-virtual {v1, v0, v2}, LM2/L$a;->o(LM2/y;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, LQ2/o;->e()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Ljava/lang/Long;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    sub-long/2addr v0, p2

    .line 50
    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/dash/DashMediaSource;->Z(J)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method X(LQ2/o;JJLjava/io/IOException;)LQ2/m$c;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p6

    .line 6
    .line 7
    iget-object v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->q:LM2/L$a;

    .line 8
    .line 9
    new-instance v4, LM2/y;

    .line 10
    .line 11
    iget-wide v5, v1, LQ2/o;->a:J

    .line 12
    .line 13
    iget-object v7, v1, LQ2/o;->b:Lw2/o;

    .line 14
    .line 15
    invoke-virtual {v1}, LQ2/o;->f()Landroid/net/Uri;

    .line 16
    .line 17
    .line 18
    move-result-object v8

    .line 19
    invoke-virtual {v1}, LQ2/o;->d()Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object v9

    .line 23
    invoke-virtual {v1}, LQ2/o;->b()J

    .line 24
    .line 25
    .line 26
    move-result-wide v14

    .line 27
    move-wide/from16 v10, p2

    .line 28
    .line 29
    move-wide/from16 v12, p4

    .line 30
    .line 31
    invoke-direct/range {v4 .. v15}, LM2/y;-><init>(JLw2/o;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 32
    .line 33
    .line 34
    iget v5, v1, LQ2/o;->c:I

    .line 35
    .line 36
    const/4 v6, 0x1

    .line 37
    invoke-virtual {v3, v4, v5, v2, v6}, LM2/L$a;->s(LM2/y;ILjava/io/IOException;Z)V

    .line 38
    .line 39
    .line 40
    iget-object v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->m:LQ2/k;

    .line 41
    .line 42
    iget-wide v4, v1, LQ2/o;->a:J

    .line 43
    .line 44
    invoke-interface {v3, v4, v5}, LQ2/k;->d(J)V

    .line 45
    .line 46
    .line 47
    invoke-direct {v0, v2}, Landroidx/media3/exoplayer/dash/DashMediaSource;->Y(Ljava/io/IOException;)V

    .line 48
    .line 49
    .line 50
    sget-object v1, LQ2/m;->f:LQ2/m$c;

    .line 51
    .line 52
    return-object v1
.end method

.method public declared-synchronized a()Lq2/C;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->P:Lq2/C;
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
    invoke-virtual {p0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->a()Lq2/C;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Lq2/C;->b:Lq2/C$h;

    .line 6
    .line 7
    invoke-static {v1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lq2/C$h;

    .line 12
    .line 13
    iget-object v2, p1, Lq2/C;->b:Lq2/C$h;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object v3, v2, Lq2/C$h;->a:Landroid/net/Uri;

    .line 18
    .line 19
    iget-object v4, v1, Lq2/C$h;->a:Landroid/net/Uri;

    .line 20
    .line 21
    invoke-virtual {v3, v4}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    iget-object v3, v2, Lq2/C$h;->e:Ljava/util/List;

    .line 28
    .line 29
    iget-object v4, v1, Lq2/C$h;->e:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v3, v4}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    iget-object v2, v2, Lq2/C$h;->c:Lq2/C$f;

    .line 38
    .line 39
    iget-object v1, v1, Lq2/C$h;->c:Lq2/C$f;

    .line 40
    .line 41
    invoke-static {v2, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    iget-object v0, v0, Lq2/C;->d:Lq2/C$g;

    .line 48
    .line 49
    iget-object p1, p1, Lq2/C;->d:Lq2/C$g;

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Lq2/C$g;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_0

    .line 56
    .line 57
    const/4 p1, 0x1

    .line 58
    return p1

    .line 59
    :cond_0
    const/4 p1, 0x0

    .line 60
    return p1
.end method

.method public f(LM2/D$b;LQ2/b;J)LM2/C;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, LM2/D$b;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->O:I

    .line 14
    .line 15
    sub-int v8, v2, v3

    .line 16
    .line 17
    invoke-virtual/range {p0 .. p1}, LM2/a;->v(LM2/D$b;)LM2/L$a;

    .line 18
    .line 19
    .line 20
    move-result-object v15

    .line 21
    invoke-virtual/range {p0 .. p1}, LM2/a;->t(LM2/D$b;)LF2/t$a;

    .line 22
    .line 23
    .line 24
    move-result-object v13

    .line 25
    new-instance v4, Landroidx/media3/exoplayer/dash/c;

    .line 26
    .line 27
    iget v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->O:I

    .line 28
    .line 29
    add-int v5, v1, v8

    .line 30
    .line 31
    iget-object v6, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->H:LE2/c;

    .line 32
    .line 33
    iget-object v7, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->n:LD2/b;

    .line 34
    .line 35
    iget-object v9, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->j:Landroidx/media3/exoplayer/dash/a$a;

    .line 36
    .line 37
    iget-object v10, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->B:Lw2/F;

    .line 38
    .line 39
    iget-object v12, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->l:LF2/u;

    .line 40
    .line 41
    iget-object v14, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->m:LQ2/k;

    .line 42
    .line 43
    iget-wide v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->L:J

    .line 44
    .line 45
    iget-object v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->y:LQ2/n;

    .line 46
    .line 47
    iget-object v11, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->k:LM2/j;

    .line 48
    .line 49
    move-wide/from16 v16, v1

    .line 50
    .line 51
    iget-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->x:Landroidx/media3/exoplayer/dash/f$b;

    .line 52
    .line 53
    invoke-virtual {v0}, LM2/a;->y()LB2/K1;

    .line 54
    .line 55
    .line 56
    move-result-object v22

    .line 57
    move-object/from16 v20, v11

    .line 58
    .line 59
    const/4 v11, 0x0

    .line 60
    move-object/from16 v19, p2

    .line 61
    .line 62
    move-object/from16 v21, v1

    .line 63
    .line 64
    move-object/from16 v18, v3

    .line 65
    .line 66
    invoke-direct/range {v4 .. v22}, Landroidx/media3/exoplayer/dash/c;-><init>(ILE2/c;LD2/b;ILandroidx/media3/exoplayer/dash/a$a;Lw2/F;LQ2/e;LF2/u;LF2/t$a;LQ2/k;LM2/L$a;JLQ2/n;LQ2/b;LM2/j;Landroidx/media3/exoplayer/dash/f$b;LB2/K1;)V

    .line 67
    .line 68
    .line 69
    iget-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->u:Landroid/util/SparseArray;

    .line 70
    .line 71
    iget v2, v4, Landroidx/media3/exoplayer/dash/c;->a:I

    .line 72
    .line 73
    invoke-virtual {v1, v2, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-object v4
.end method

.method public declared-synchronized j(Lq2/C;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->P:Lq2/C;
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
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->y:LQ2/n;

    .line 2
    .line 3
    invoke-interface {v0}, LQ2/n;->b()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public m(LM2/C;)V
    .locals 1

    .line 1
    check-cast p1, Landroidx/media3/exoplayer/dash/c;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/media3/exoplayer/dash/c;->L()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->u:Landroid/util/SparseArray;

    .line 7
    .line 8
    iget p1, p1, Landroidx/media3/exoplayer/dash/c;->a:I

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
