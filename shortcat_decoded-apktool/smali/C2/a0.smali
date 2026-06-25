.class public LC2/a0;
.super LJ2/A;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LA2/L;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC2/a0$c;,
        LC2/a0$b;
    }
.end annotation


# instance fields
.field private final i1:Landroid/content/Context;

.field private final j1:LC2/y$a;

.field private final k1:LC2/z;

.field private final l1:LJ2/o;

.field private m1:I

.field private n1:Z

.field private o1:Z

.field private p1:Lq2/x;

.field private q1:Lq2/x;

.field private r1:J

.field private s1:Z

.field private t1:Z

.field private u1:Z

.field private v1:I

.field private w1:Z

.field private x1:J


# direct methods
.method public constructor <init>(Landroid/content/Context;LJ2/q$b;LJ2/E;ZLandroid/os/Handler;LC2/y;LC2/z;)V
    .locals 10

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x23

    if-lt v0, v1, :cond_0

    new-instance v0, LJ2/o;

    invoke-direct {v0}, LJ2/o;-><init>()V

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object v9, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 2
    :goto_1
    invoke-direct/range {v1 .. v9}, LC2/a0;-><init>(Landroid/content/Context;LJ2/q$b;LJ2/E;ZLandroid/os/Handler;LC2/y;LC2/z;LJ2/o;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LJ2/q$b;LJ2/E;ZLandroid/os/Handler;LC2/y;LC2/z;LJ2/o;)V
    .locals 6

    const/4 v1, 0x1

    const v5, 0x472c4400    # 44100.0f

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    .line 3
    invoke-direct/range {v0 .. v5}, LJ2/A;-><init>(ILJ2/q$b;LJ2/E;ZF)V

    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    .line 5
    iput-object p1, v0, LC2/a0;->i1:Landroid/content/Context;

    .line 6
    iput-object p7, v0, LC2/a0;->k1:LC2/z;

    .line 7
    iput-object p8, v0, LC2/a0;->l1:LJ2/o;

    const/16 p1, -0x3e8

    .line 8
    iput p1, v0, LC2/a0;->v1:I

    .line 9
    new-instance p1, LC2/y$a;

    invoke-direct {p1, p5, p6}, LC2/y$a;-><init>(Landroid/os/Handler;LC2/y;)V

    iput-object p1, v0, LC2/a0;->j1:LC2/y$a;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    iput-wide p1, v0, LC2/a0;->x1:J

    .line 11
    new-instance p1, LC2/a0$c;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, LC2/a0$c;-><init>(LC2/a0;LC2/a0$a;)V

    invoke-interface {p7, p1}, LC2/z;->E(LC2/z$d;)V

    return-void
.end method

.method static synthetic g2(LC2/a0;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, LC2/a0;->u1:Z

    .line 2
    .line 3
    return p1
.end method

.method static synthetic h2(LC2/a0;)LC2/y$a;
    .locals 0

    .line 1
    iget-object p0, p0, LC2/a0;->j1:LC2/y$a;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic i2(LC2/a0;)Landroidx/media3/exoplayer/N0$a;
    .locals 0

    .line 1
    invoke-virtual {p0}, LJ2/A;->b1()Landroidx/media3/exoplayer/N0$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic j2(LC2/a0;)Landroidx/media3/exoplayer/N0$a;
    .locals 0

    .line 1
    invoke-virtual {p0}, LJ2/A;->b1()Landroidx/media3/exoplayer/N0$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic k2(LC2/a0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->i0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic l2(LC2/a0;)LJ2/o;
    .locals 0

    .line 1
    iget-object p0, p0, LC2/a0;->l1:LJ2/o;

    .line 2
    .line 3
    return-object p0
.end method

.method private static m2(Ljava/lang/String;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method private static n2(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "OMX.google.opus.decoder"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, "c2.android.opus.decoder"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const-string v0, "OMX.google.vorbis.decoder"

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    const-string v0, "c2.android.vorbis.decoder"

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    return p0

    .line 36
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 37
    return p0
.end method

.method private static o2()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method private p2(Lq2/x;)I
    .locals 1

    .line 1
    iget-object v0, p0, LC2/a0;->k1:LC2/z;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LC2/z;->F(Lq2/x;)LC2/k;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-boolean v0, p1, LC2/k;->a:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return p1

    .line 13
    :cond_0
    iget-boolean v0, p1, LC2/k;->b:Z

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x600

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/16 v0, 0x200

    .line 21
    .line 22
    :goto_0
    iget-boolean p1, p1, LC2/k;->c:Z

    .line 23
    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    or-int/lit16 p1, v0, 0x800

    .line 27
    .line 28
    return p1

    .line 29
    :cond_2
    return v0
.end method

.method private q2(LJ2/t;Lq2/x;)I
    .locals 1

    .line 1
    const-string v0, "OMX.google.raw.decoder"

    .line 2
    .line 3
    iget-object p1, p1, LJ2/t;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    iget p1, p2, Lq2/x;->p:I

    .line 9
    .line 10
    return p1
.end method

.method private static s2(LJ2/E;Lq2/x;ZLC2/z;)Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p1, Lq2/x;->o:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-interface {p3, p1}, LC2/z;->b(Lq2/x;)Z

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    if-eqz p3, :cond_1

    .line 15
    .line 16
    invoke-static {}, LJ2/N;->p()LJ2/t;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    invoke-static {p3}, LP9/u;->B(Ljava/lang/Object;)LP9/u;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_1
    const/4 p3, 0x0

    .line 28
    invoke-static {p0, p1, p2, p3}, LJ2/N;->m(LJ2/E;Lq2/x;ZZ)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method private v2(I)V
    .locals 2

    .line 1
    iget-object v0, p0, LC2/a0;->k1:LC2/z;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LC2/z;->y(I)V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x23

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, LC2/a0;->l1:LJ2/o;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, p1}, LJ2/o;->e(I)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method private w2()V
    .locals 4

    .line 1
    invoke-virtual {p0}, LJ2/A;->N0()LJ2/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v2, 0x23

    .line 11
    .line 12
    if-lt v1, v2, :cond_1

    .line 13
    .line 14
    new-instance v1, Landroid/os/Bundle;

    .line 15
    .line 16
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 17
    .line 18
    .line 19
    iget v2, p0, LC2/a0;->v1:I

    .line 20
    .line 21
    neg-int v2, v2

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const-string v3, "importance"

    .line 28
    .line 29
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, v1}, LJ2/q;->d(Landroid/os/Bundle;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    return-void
.end method

.method private x2()V
    .locals 4

    .line 1
    iget-object v0, p0, LC2/a0;->k1:LC2/z;

    .line 2
    .line 3
    invoke-virtual {p0}, LC2/a0;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-interface {v0, v1}, LC2/z;->L(Z)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-wide/high16 v2, -0x8000000000000000L

    .line 12
    .line 13
    cmp-long v2, v0, v2

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    iget-boolean v2, p0, LC2/a0;->s1:Z

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-wide v2, p0, LC2/a0;->r1:J

    .line 23
    .line 24
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    :goto_0
    iput-wide v0, p0, LC2/a0;->r1:J

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    iput-boolean v0, p0, LC2/a0;->s1:Z

    .line 32
    .line 33
    :cond_1
    return-void
.end method


# virtual methods
.method protected B1(JJLJ2/q;Ljava/nio/ByteBuffer;IIIJZZLq2/x;)Z
    .locals 0

    .line 1
    invoke-static {p6}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide p1, p0, LC2/a0;->x1:J

    .line 10
    .line 11
    iget-object p1, p0, LC2/a0;->q1:Lq2/x;

    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    const/4 p3, 0x0

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    and-int/lit8 p1, p8, 0x2

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-static {p5}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, LJ2/q;

    .line 26
    .line 27
    invoke-interface {p1, p7, p3}, LJ2/q;->p(IZ)V

    .line 28
    .line 29
    .line 30
    return p2

    .line 31
    :cond_0
    if-eqz p12, :cond_2

    .line 32
    .line 33
    if-eqz p5, :cond_1

    .line 34
    .line 35
    invoke-interface {p5, p7, p3}, LJ2/q;->p(IZ)V

    .line 36
    .line 37
    .line 38
    :cond_1
    iget-object p1, p0, LJ2/A;->Z0:LA2/b;

    .line 39
    .line 40
    iget p3, p1, LA2/b;->f:I

    .line 41
    .line 42
    add-int/2addr p3, p9

    .line 43
    iput p3, p1, LA2/b;->f:I

    .line 44
    .line 45
    iget-object p1, p0, LC2/a0;->k1:LC2/z;

    .line 46
    .line 47
    invoke-interface {p1}, LC2/z;->N()V

    .line 48
    .line 49
    .line 50
    return p2

    .line 51
    :cond_2
    :try_start_0
    iget-object p1, p0, LC2/a0;->k1:LC2/z;

    .line 52
    .line 53
    invoke-interface {p1, p6, p10, p11, p9}, LC2/z;->G(Ljava/nio/ByteBuffer;JI)Z

    .line 54
    .line 55
    .line 56
    move-result p1
    :try_end_0
    .catch LC2/z$c; {:try_start_0 .. :try_end_0} :catch_1
    .catch LC2/z$f; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    if-eqz p1, :cond_4

    .line 58
    .line 59
    if-eqz p5, :cond_3

    .line 60
    .line 61
    invoke-interface {p5, p7, p3}, LJ2/q;->p(IZ)V

    .line 62
    .line 63
    .line 64
    :cond_3
    iget-object p1, p0, LJ2/A;->Z0:LA2/b;

    .line 65
    .line 66
    iget p3, p1, LA2/b;->e:I

    .line 67
    .line 68
    add-int/2addr p3, p9

    .line 69
    iput p3, p1, LA2/b;->e:I

    .line 70
    .line 71
    return p2

    .line 72
    :cond_4
    iput-wide p10, p0, LC2/a0;->x1:J

    .line 73
    .line 74
    return p3

    .line 75
    :catch_0
    move-exception p1

    .line 76
    goto :goto_0

    .line 77
    :catch_1
    move-exception p1

    .line 78
    goto :goto_2

    .line 79
    :goto_0
    iget-boolean p2, p1, LC2/z$f;->b:Z

    .line 80
    .line 81
    invoke-virtual {p0}, LJ2/A;->j1()Z

    .line 82
    .line 83
    .line 84
    move-result p3

    .line 85
    if-eqz p3, :cond_5

    .line 86
    .line 87
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->U()LA2/N;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    iget p3, p3, LA2/N;->a:I

    .line 92
    .line 93
    if-eqz p3, :cond_5

    .line 94
    .line 95
    const/16 p3, 0x138b

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_5
    const/16 p3, 0x138a

    .line 99
    .line 100
    :goto_1
    invoke-virtual {p0, p1, p14, p2, p3}, Landroidx/media3/exoplayer/h;->S(Ljava/lang/Throwable;Lq2/x;ZI)Landroidx/media3/exoplayer/s;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    throw p1

    .line 105
    :goto_2
    iget-object p2, p0, LC2/a0;->p1:Lq2/x;

    .line 106
    .line 107
    iget-boolean p3, p1, LC2/z$c;->b:Z

    .line 108
    .line 109
    invoke-virtual {p0}, LJ2/A;->j1()Z

    .line 110
    .line 111
    .line 112
    move-result p4

    .line 113
    if-eqz p4, :cond_6

    .line 114
    .line 115
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->U()LA2/N;

    .line 116
    .line 117
    .line 118
    move-result-object p4

    .line 119
    iget p4, p4, LA2/N;->a:I

    .line 120
    .line 121
    if-eqz p4, :cond_6

    .line 122
    .line 123
    const/16 p4, 0x138c

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_6
    const/16 p4, 0x1389

    .line 127
    .line 128
    :goto_3
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/media3/exoplayer/h;->S(Ljava/lang/Throwable;Lq2/x;ZI)Landroidx/media3/exoplayer/s;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    throw p1
.end method

.method protected G1()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, LC2/a0;->k1:LC2/z;

    .line 2
    .line 3
    invoke-interface {v0}, LC2/z;->I()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LJ2/A;->W0()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, LJ2/A;->W0()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    iput-wide v0, p0, LC2/a0;->x1:J
    :try_end_0
    .catch LC2/z$f; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception v0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void

    .line 29
    :goto_0
    iget-object v1, v0, LC2/z$f;->c:Lq2/x;

    .line 30
    .line 31
    iget-boolean v2, v0, LC2/z$f;->b:Z

    .line 32
    .line 33
    invoke-virtual {p0}, LJ2/A;->j1()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    const/16 v3, 0x138b

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const/16 v3, 0x138a

    .line 43
    .line 44
    :goto_1
    invoke-virtual {p0, v0, v1, v2, v3}, Landroidx/media3/exoplayer/h;->S(Ljava/lang/Throwable;Lq2/x;ZI)Landroidx/media3/exoplayer/s;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    throw v0
.end method

.method public I()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->getState()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-direct {p0}, LC2/a0;->x2()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-wide v0, p0, LC2/a0;->r1:J

    .line 12
    .line 13
    return-wide v0
.end method

.method public P()LA2/L;
    .locals 0

    .line 1
    return-object p0
.end method

.method protected S0(FLq2/x;[Lq2/x;)F
    .locals 4

    .line 1
    array-length p2, p3

    .line 2
    const/4 v0, -0x1

    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v0

    .line 5
    :goto_0
    if-ge v1, p2, :cond_1

    .line 6
    .line 7
    aget-object v3, p3, v1

    .line 8
    .line 9
    iget v3, v3, Lq2/x;->H:I

    .line 10
    .line 11
    if-eq v3, v0, :cond_0

    .line 12
    .line 13
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    if-ne v2, v0, :cond_2

    .line 21
    .line 22
    const/high16 p1, -0x40800000    # -1.0f

    .line 23
    .line 24
    return p1

    .line 25
    :cond_2
    int-to-float p2, v2

    .line 26
    mul-float/2addr p2, p1

    .line 27
    return p2
.end method

.method protected U0(LJ2/E;Lq2/x;Z)Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LC2/a0;->k1:LC2/z;

    .line 2
    .line 3
    invoke-static {p1, p2, p3, v0}, LC2/a0;->s2(LJ2/E;Lq2/x;ZLC2/z;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1, p2}, LJ2/N;->n(Ljava/util/List;Lq2/x;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method protected V0(JJZ)J
    .locals 6

    .line 1
    iget-wide v0, p0, LC2/a0;->x1:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long p5, v0, v2

    .line 9
    .line 10
    if-eqz p5, :cond_0

    .line 11
    .line 12
    const/4 p5, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p5, 0x0

    .line 15
    :goto_0
    iget-boolean v0, p0, LC2/a0;->w1:Z

    .line 16
    .line 17
    const-wide/16 v4, 0x2710

    .line 18
    .line 19
    if-nez v0, :cond_3

    .line 20
    .line 21
    if-nez p5, :cond_2

    .line 22
    .line 23
    invoke-super {p0}, LJ2/A;->d()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    return-wide v4

    .line 31
    :cond_2
    :goto_1
    const-wide/32 p1, 0xf4240

    .line 32
    .line 33
    .line 34
    return-wide p1

    .line 35
    :cond_3
    iget-object v0, p0, LC2/a0;->k1:LC2/z;

    .line 36
    .line 37
    invoke-interface {v0}, LC2/z;->z()J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    if-eqz p5, :cond_6

    .line 42
    .line 43
    cmp-long p5, v0, v2

    .line 44
    .line 45
    if-nez p5, :cond_4

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_4
    iget-wide v2, p0, LC2/a0;->x1:J

    .line 49
    .line 50
    sub-long/2addr v2, p1

    .line 51
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 52
    .line 53
    .line 54
    move-result-wide p1

    .line 55
    long-to-float p1, p1

    .line 56
    invoke-virtual {p0}, LC2/a0;->c()Lq2/O;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    if-eqz p2, :cond_5

    .line 61
    .line 62
    invoke-virtual {p0}, LC2/a0;->c()Lq2/O;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    iget p2, p2, Lq2/O;->a:F

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_5
    const/high16 p2, 0x3f800000    # 1.0f

    .line 70
    .line 71
    :goto_2
    div-float/2addr p1, p2

    .line 72
    const/high16 p2, 0x40000000    # 2.0f

    .line 73
    .line 74
    div-float/2addr p1, p2

    .line 75
    float-to-long p1, p1

    .line 76
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->T()Lt2/j;

    .line 77
    .line 78
    .line 79
    move-result-object p5

    .line 80
    invoke-interface {p5}, Lt2/j;->c()J

    .line 81
    .line 82
    .line 83
    move-result-wide v0

    .line 84
    invoke-static {v0, v1}, Lt2/a0;->V0(J)J

    .line 85
    .line 86
    .line 87
    move-result-wide v0

    .line 88
    sub-long/2addr v0, p3

    .line 89
    sub-long/2addr p1, v0

    .line 90
    invoke-static {v4, v5, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 91
    .line 92
    .line 93
    move-result-wide p1

    .line 94
    return-wide p1

    .line 95
    :cond_6
    :goto_3
    return-wide v4
.end method

.method protected X0(LJ2/t;Lq2/x;Landroid/media/MediaCrypto;F)LJ2/q$a;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->Z()[Lq2/x;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p1, p2, v0}, LC2/a0;->r2(LJ2/t;Lq2/x;[Lq2/x;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iput v0, p0, LC2/a0;->m1:I

    .line 10
    .line 11
    iget-object v0, p1, LJ2/t;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v0}, LC2/a0;->m2(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput-boolean v0, p0, LC2/a0;->n1:Z

    .line 18
    .line 19
    iget-object v0, p1, LJ2/t;->a:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v0}, LC2/a0;->n2(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iput-boolean v0, p0, LC2/a0;->o1:Z

    .line 26
    .line 27
    iget-object v0, p1, LJ2/t;->c:Ljava/lang/String;

    .line 28
    .line 29
    iget v1, p0, LC2/a0;->m1:I

    .line 30
    .line 31
    invoke-virtual {p0, p2, v0, v1, p4}, LC2/a0;->t2(Lq2/x;Ljava/lang/String;IF)Landroid/media/MediaFormat;

    .line 32
    .line 33
    .line 34
    move-result-object p4

    .line 35
    iget-object v0, p1, LJ2/t;->b:Ljava/lang/String;

    .line 36
    .line 37
    const-string v1, "audio/raw"

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    iget-object v0, p2, Lq2/x;->o:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_0

    .line 52
    .line 53
    move-object v0, p2

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/4 v0, 0x0

    .line 56
    :goto_0
    iput-object v0, p0, LC2/a0;->q1:Lq2/x;

    .line 57
    .line 58
    iget-object v0, p0, LC2/a0;->l1:LJ2/o;

    .line 59
    .line 60
    invoke-static {p1, p4, p2, p3, v0}, LJ2/q$a;->a(LJ2/t;Landroid/media/MediaFormat;Lq2/x;Landroid/media/MediaCrypto;LJ2/o;)LJ2/q$a;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1
.end method

.method protected Z1(Lq2/x;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->U()LA2/N;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, LA2/N;->a:I

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-direct {p0, p1}, LC2/a0;->p2(Lq2/x;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    and-int/lit16 v1, v0, 0x200

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->U()LA2/N;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget v1, v1, LA2/N;->a:I

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    if-eq v1, v2, :cond_0

    .line 25
    .line 26
    and-int/lit16 v0, v0, 0x400

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    iget v0, p1, Lq2/x;->J:I

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    iget v0, p1, Lq2/x;->K:I

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    :cond_0
    const/4 p1, 0x1

    .line 39
    return p1

    .line 40
    :cond_1
    iget-object v0, p0, LC2/a0;->k1:LC2/z;

    .line 41
    .line 42
    invoke-interface {v0, p1}, LC2/z;->b(Lq2/x;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    return p1
.end method

.method protected a2(LJ2/E;Lq2/x;)I
    .locals 11

    .line 1
    iget-object v0, p2, Lq2/x;->o:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lq2/K;->o(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Landroidx/media3/exoplayer/O0;->t(I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :cond_0
    iget v0, p2, Lq2/x;->P:I

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    move v0, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move v0, v1

    .line 23
    :goto_0
    invoke-static {p2}, LJ2/A;->b2(Lq2/x;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/16 v4, 0x8

    .line 28
    .line 29
    const/4 v5, 0x4

    .line 30
    if-eqz v3, :cond_3

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-static {}, LJ2/N;->p()LJ2/t;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    :cond_2
    invoke-direct {p0, p2}, LC2/a0;->p2(Lq2/x;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v6, p0, LC2/a0;->k1:LC2/z;

    .line 45
    .line 46
    invoke-interface {v6, p2}, LC2/z;->b(Lq2/x;)Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-eqz v6, :cond_4

    .line 51
    .line 52
    const/16 p1, 0x20

    .line 53
    .line 54
    invoke-static {v5, v4, p1, v0}, Landroidx/media3/exoplayer/O0;->q(IIII)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    return p1

    .line 59
    :cond_3
    move v0, v1

    .line 60
    :cond_4
    const-string v6, "audio/raw"

    .line 61
    .line 62
    iget-object v7, p2, Lq2/x;->o:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-eqz v6, :cond_5

    .line 69
    .line 70
    iget-object v6, p0, LC2/a0;->k1:LC2/z;

    .line 71
    .line 72
    invoke-interface {v6, p2}, LC2/z;->b(Lq2/x;)Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-nez v6, :cond_5

    .line 77
    .line 78
    invoke-static {v2}, Landroidx/media3/exoplayer/O0;->t(I)I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    return p1

    .line 83
    :cond_5
    iget-object v6, p0, LC2/a0;->k1:LC2/z;

    .line 84
    .line 85
    iget v7, p2, Lq2/x;->G:I

    .line 86
    .line 87
    iget v8, p2, Lq2/x;->H:I

    .line 88
    .line 89
    const/4 v9, 0x2

    .line 90
    invoke-static {v9, v7, v8}, Lt2/a0;->n0(III)Lq2/x;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    invoke-interface {v6, v7}, LC2/z;->b(Lq2/x;)Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    if-nez v6, :cond_6

    .line 99
    .line 100
    invoke-static {v2}, Landroidx/media3/exoplayer/O0;->t(I)I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    return p1

    .line 105
    :cond_6
    iget-object v6, p0, LC2/a0;->k1:LC2/z;

    .line 106
    .line 107
    invoke-static {p1, p2, v1, v6}, LC2/a0;->s2(LJ2/E;Lq2/x;ZLC2/z;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    if-eqz v6, :cond_7

    .line 116
    .line 117
    invoke-static {v2}, Landroidx/media3/exoplayer/O0;->t(I)I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    return p1

    .line 122
    :cond_7
    if-nez v3, :cond_8

    .line 123
    .line 124
    invoke-static {v9}, Landroidx/media3/exoplayer/O0;->t(I)I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    return p1

    .line 129
    :cond_8
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    check-cast v3, LJ2/t;

    .line 134
    .line 135
    invoke-virtual {v3, p2}, LJ2/t;->p(Lq2/x;)Z

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    if-nez v6, :cond_a

    .line 140
    .line 141
    move v7, v2

    .line 142
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    if-ge v7, v8, :cond_a

    .line 147
    .line 148
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    check-cast v8, LJ2/t;

    .line 153
    .line 154
    invoke-virtual {v8, p2}, LJ2/t;->p(Lq2/x;)Z

    .line 155
    .line 156
    .line 157
    move-result v9

    .line 158
    if-eqz v9, :cond_9

    .line 159
    .line 160
    move p1, v1

    .line 161
    move-object v3, v8

    .line 162
    goto :goto_2

    .line 163
    :cond_9
    add-int/lit8 v7, v7, 0x1

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_a
    move p1, v2

    .line 167
    move v2, v6

    .line 168
    :goto_2
    if-eqz v2, :cond_b

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_b
    const/4 v5, 0x3

    .line 172
    :goto_3
    if-eqz v2, :cond_c

    .line 173
    .line 174
    invoke-virtual {v3, p2}, LJ2/t;->s(Lq2/x;)Z

    .line 175
    .line 176
    .line 177
    move-result p2

    .line 178
    if-eqz p2, :cond_c

    .line 179
    .line 180
    const/16 v4, 0x10

    .line 181
    .line 182
    :cond_c
    iget-boolean p2, v3, LJ2/t;->h:Z

    .line 183
    .line 184
    if-eqz p2, :cond_d

    .line 185
    .line 186
    const/16 p2, 0x40

    .line 187
    .line 188
    move v3, p2

    .line 189
    goto :goto_4

    .line 190
    :cond_d
    move v3, v1

    .line 191
    :goto_4
    if-eqz p1, :cond_e

    .line 192
    .line 193
    const/16 v1, 0x80

    .line 194
    .line 195
    :cond_e
    const/16 v2, 0x20

    .line 196
    .line 197
    move v10, v5

    .line 198
    move v5, v0

    .line 199
    move v0, v10

    .line 200
    move v10, v4

    .line 201
    move v4, v1

    .line 202
    move v1, v10

    .line 203
    invoke-static/range {v0 .. v5}, Landroidx/media3/exoplayer/O0;->C(IIIIII)I

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    return p1
.end method

.method public c()Lq2/O;
    .locals 1

    .line 1
    iget-object v0, p0, LC2/a0;->k1:LC2/z;

    .line 2
    .line 3
    invoke-interface {v0}, LC2/z;->c()Lq2/O;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method protected c1(Lz2/f;)V
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p1, Lz2/f;->b:Lq2/x;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lq2/x;->o:Ljava/lang/String;

    .line 12
    .line 13
    const-string v1, "audio/opus"

    .line 14
    .line 15
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, LJ2/A;->j1()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p1, Lz2/f;->g:Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 34
    .line 35
    iget-object p1, p1, Lz2/f;->b:Lq2/x;

    .line 36
    .line 37
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Lq2/x;

    .line 42
    .line 43
    iget p1, p1, Lq2/x;->J:I

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    const/16 v2, 0x8

    .line 50
    .line 51
    if-ne v1, v2, :cond_0

    .line 52
    .line 53
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getLong()J

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    const-wide/32 v2, 0xbb80

    .line 64
    .line 65
    .line 66
    mul-long/2addr v0, v2

    .line 67
    const-wide/32 v2, 0x3b9aca00

    .line 68
    .line 69
    .line 70
    div-long/2addr v0, v2

    .line 71
    long-to-int v0, v0

    .line 72
    iget-object v1, p0, LC2/a0;->k1:LC2/z;

    .line 73
    .line 74
    invoke-interface {v1, p1, v0}, LC2/z;->J(II)V

    .line 75
    .line 76
    .line 77
    :cond_0
    return-void
.end method

.method public d()Z
    .locals 1

    .line 1
    invoke-super {p0}, LJ2/A;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LC2/a0;->k1:LC2/z;

    .line 8
    .line 9
    invoke-interface {v0}, LC2/z;->d()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method protected d0()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LC2/a0;->t1:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, LC2/a0;->p1:Lq2/x;

    .line 6
    .line 7
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    iput-wide v0, p0, LC2/a0;->x1:J

    .line 13
    .line 14
    :try_start_0
    iget-object v0, p0, LC2/a0;->k1:LC2/z;

    .line 15
    .line 16
    invoke-interface {v0}, LC2/z;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 17
    .line 18
    .line 19
    :try_start_1
    invoke-super {p0}, LJ2/A;->d0()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, LC2/a0;->j1:LC2/y$a;

    .line 23
    .line 24
    iget-object v1, p0, LJ2/A;->Z0:LA2/b;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, LC2/y$a;->u(LA2/b;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    iget-object v1, p0, LC2/a0;->j1:LC2/y$a;

    .line 32
    .line 33
    iget-object v2, p0, LJ2/A;->Z0:LA2/b;

    .line 34
    .line 35
    invoke-virtual {v1, v2}, LC2/y$a;->u(LA2/b;)V

    .line 36
    .line 37
    .line 38
    throw v0

    .line 39
    :catchall_1
    move-exception v0

    .line 40
    :try_start_2
    invoke-super {p0}, LJ2/A;->d0()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, LC2/a0;->j1:LC2/y$a;

    .line 44
    .line 45
    iget-object v2, p0, LJ2/A;->Z0:LA2/b;

    .line 46
    .line 47
    invoke-virtual {v1, v2}, LC2/y$a;->u(LA2/b;)V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :catchall_2
    move-exception v0

    .line 52
    iget-object v1, p0, LC2/a0;->j1:LC2/y$a;

    .line 53
    .line 54
    iget-object v2, p0, LJ2/A;->Z0:LA2/b;

    .line 55
    .line 56
    invoke-virtual {v1, v2}, LC2/y$a;->u(LA2/b;)V

    .line 57
    .line 58
    .line 59
    throw v0
.end method

.method public e(Lq2/O;)V
    .locals 1

    .line 1
    iget-object v0, p0, LC2/a0;->k1:LC2/z;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LC2/z;->e(Lq2/O;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected e0(ZZ)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, LJ2/A;->e0(ZZ)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LC2/a0;->j1:LC2/y$a;

    .line 5
    .line 6
    iget-object p2, p0, LJ2/A;->Z0:LA2/b;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, LC2/y$a;->v(LA2/b;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->U()LA2/N;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-boolean p1, p1, LA2/N;->b:Z

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, LC2/a0;->k1:LC2/z;

    .line 20
    .line 21
    invoke-interface {p1}, LC2/z;->O()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object p1, p0, LC2/a0;->k1:LC2/z;

    .line 26
    .line 27
    invoke-interface {p1}, LC2/z;->C()V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p1, p0, LC2/a0;->k1:LC2/z;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->Y()LB2/K1;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-interface {p1, p2}, LC2/z;->Q(LB2/K1;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, LC2/a0;->k1:LC2/z;

    .line 40
    .line 41
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->T()Lt2/j;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-interface {p1, p2}, LC2/z;->H(Lt2/j;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method protected g0(JZ)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, LJ2/A;->g0(JZ)V

    .line 2
    .line 3
    .line 4
    iget-object p3, p0, LC2/a0;->k1:LC2/z;

    .line 5
    .line 6
    invoke-interface {p3}, LC2/z;->flush()V

    .line 7
    .line 8
    .line 9
    iput-wide p1, p0, LC2/a0;->r1:J

    .line 10
    .line 11
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    iput-wide p1, p0, LC2/a0;->x1:J

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    iput-boolean p1, p0, LC2/a0;->u1:Z

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, LC2/a0;->s1:Z

    .line 23
    .line 24
    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "MediaCodecAudioRenderer"

    .line 2
    .line 3
    return-object v0
.end method

.method protected h0()V
    .locals 2

    .line 1
    iget-object v0, p0, LC2/a0;->k1:LC2/z;

    .line 2
    .line 3
    invoke-interface {v0}, LC2/z;->a()V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x23

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, LC2/a0;->l1:LJ2/o;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, LJ2/o;->c()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public isReady()Z
    .locals 1

    .line 1
    iget-object v0, p0, LC2/a0;->k1:LC2/z;

    .line 2
    .line 3
    invoke-interface {v0}, LC2/z;->x()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-super {p0}, LJ2/A;->isReady()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0

    .line 18
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 19
    return v0
.end method

.method protected j0()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LC2/a0;->u1:Z

    .line 3
    .line 4
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v1, p0, LC2/a0;->x1:J

    .line 10
    .line 11
    :try_start_0
    invoke-super {p0}, LJ2/A;->j0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    iget-boolean v1, p0, LC2/a0;->t1:Z

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iput-boolean v0, p0, LC2/a0;->t1:Z

    .line 19
    .line 20
    iget-object v0, p0, LC2/a0;->k1:LC2/z;

    .line 21
    .line 22
    invoke-interface {v0}, LC2/z;->reset()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    iget-boolean v2, p0, LC2/a0;->t1:Z

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    iput-boolean v0, p0, LC2/a0;->t1:Z

    .line 32
    .line 33
    iget-object v0, p0, LC2/a0;->k1:LC2/z;

    .line 34
    .line 35
    invoke-interface {v0}, LC2/z;->reset()V

    .line 36
    .line 37
    .line 38
    :cond_1
    throw v1
.end method

.method protected k0()V
    .locals 1

    .line 1
    invoke-super {p0}, LJ2/A;->k0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LC2/a0;->k1:LC2/z;

    .line 5
    .line 6
    invoke-interface {v0}, LC2/z;->u()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, LC2/a0;->w1:Z

    .line 11
    .line 12
    return-void
.end method

.method protected l0()V
    .locals 1

    .line 1
    invoke-direct {p0}, LC2/a0;->x2()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, LC2/a0;->w1:Z

    .line 6
    .line 7
    iget-object v0, p0, LC2/a0;->k1:LC2/z;

    .line 8
    .line 9
    invoke-interface {v0}, LC2/z;->pause()V

    .line 10
    .line 11
    .line 12
    invoke-super {p0}, LJ2/A;->l0()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method protected q1(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    const-string v0, "MediaCodecAudioRenderer"

    .line 2
    .line 3
    const-string v1, "Audio codec error"

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lt2/w;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LC2/a0;->j1:LC2/y$a;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, LC2/y$a;->n(Ljava/lang/Exception;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method protected r1(Ljava/lang/String;LJ2/q$a;JJ)V
    .locals 0

    .line 1
    move-object p2, p1

    .line 2
    iget-object p1, p0, LC2/a0;->j1:LC2/y$a;

    .line 3
    .line 4
    invoke-virtual/range {p1 .. p6}, LC2/y$a;->s(Ljava/lang/String;JJ)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method protected r2(LJ2/t;Lq2/x;[Lq2/x;)I
    .locals 5

    .line 1
    invoke-direct {p0, p1, p2}, LC2/a0;->q2(LJ2/t;Lq2/x;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    array-length v1, p3

    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v1, v2, :cond_0

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    array-length v1, p3

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v1, :cond_2

    .line 13
    .line 14
    aget-object v3, p3, v2

    .line 15
    .line 16
    invoke-virtual {p1, p2, v3}, LJ2/t;->e(Lq2/x;Lq2/x;)LA2/c;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    iget v4, v4, LA2/c;->d:I

    .line 21
    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    invoke-direct {p0, p1, v3}, LC2/a0;->q2(LJ2/t;Lq2/x;)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    return v0
.end method

.method protected s1(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, LC2/a0;->j1:LC2/y$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LC2/y$a;->t(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected t1(LA2/J;)LA2/c;
    .locals 2

    .line 1
    iget-object v0, p1, LA2/J;->b:Lq2/x;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lq2/x;

    .line 8
    .line 9
    iput-object v0, p0, LC2/a0;->p1:Lq2/x;

    .line 10
    .line 11
    invoke-super {p0, p1}, LJ2/A;->t1(LA2/J;)LA2/c;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v1, p0, LC2/a0;->j1:LC2/y$a;

    .line 16
    .line 17
    invoke-virtual {v1, v0, p1}, LC2/y$a;->w(Lq2/x;LA2/c;)V

    .line 18
    .line 19
    .line 20
    return-object p1
.end method

.method protected t2(Lq2/x;Ljava/lang/String;IF)Landroid/media/MediaFormat;
    .locals 3

    .line 1
    new-instance v0, Landroid/media/MediaFormat;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/media/MediaFormat;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "mime"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p2}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p2, "channel-count"

    .line 12
    .line 13
    iget v1, p1, Lq2/x;->G:I

    .line 14
    .line 15
    invoke-virtual {v0, p2, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    const-string p2, "sample-rate"

    .line 19
    .line 20
    iget v1, p1, Lq2/x;->H:I

    .line 21
    .line 22
    invoke-virtual {v0, p2, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    iget-object p2, p1, Lq2/x;->r:Ljava/util/List;

    .line 26
    .line 27
    invoke-static {v0, p2}, Lt2/z;->e(Landroid/media/MediaFormat;Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    const-string p2, "max-input-size"

    .line 31
    .line 32
    invoke-static {v0, p2, p3}, Lt2/z;->d(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 33
    .line 34
    .line 35
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 36
    .line 37
    const-string p3, "priority"

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-virtual {v0, p3, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 41
    .line 42
    .line 43
    const/high16 p3, -0x40800000    # -1.0f

    .line 44
    .line 45
    cmpl-float p3, p4, p3

    .line 46
    .line 47
    if-eqz p3, :cond_0

    .line 48
    .line 49
    invoke-static {}, LC2/a0;->o2()Z

    .line 50
    .line 51
    .line 52
    move-result p3

    .line 53
    if-nez p3, :cond_0

    .line 54
    .line 55
    const-string p3, "operating-rate"

    .line 56
    .line 57
    invoke-virtual {v0, p3, p4}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    .line 58
    .line 59
    .line 60
    :cond_0
    const-string p3, "audio/ac4"

    .line 61
    .line 62
    iget-object p4, p1, Lq2/x;->o:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p3

    .line 68
    if-eqz p3, :cond_2

    .line 69
    .line 70
    invoke-static {p1}, Lt2/k;->r(Lq2/x;)Landroid/util/Pair;

    .line 71
    .line 72
    .line 73
    move-result-object p3

    .line 74
    if-eqz p3, :cond_1

    .line 75
    .line 76
    iget-object p4, p3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p4, Ljava/lang/Integer;

    .line 79
    .line 80
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result p4

    .line 84
    const-string v2, "profile"

    .line 85
    .line 86
    invoke-static {v0, v2, p4}, Lt2/z;->d(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 87
    .line 88
    .line 89
    iget-object p3, p3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p3, Ljava/lang/Integer;

    .line 92
    .line 93
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 94
    .line 95
    .line 96
    move-result p3

    .line 97
    const-string p4, "level"

    .line 98
    .line 99
    invoke-static {v0, p4, p3}, Lt2/z;->d(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 100
    .line 101
    .line 102
    :cond_1
    const/16 p3, 0x1c

    .line 103
    .line 104
    if-gt p2, p3, :cond_2

    .line 105
    .line 106
    const-string p3, "ac4-is-sync"

    .line 107
    .line 108
    const/4 p4, 0x1

    .line 109
    invoke-virtual {v0, p3, p4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 110
    .line 111
    .line 112
    :cond_2
    iget-object p3, p0, LC2/a0;->k1:LC2/z;

    .line 113
    .line 114
    iget p4, p1, Lq2/x;->G:I

    .line 115
    .line 116
    iget p1, p1, Lq2/x;->H:I

    .line 117
    .line 118
    const/4 v2, 0x4

    .line 119
    invoke-static {v2, p4, p1}, Lt2/a0;->n0(III)Lq2/x;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-interface {p3, p1}, LC2/z;->D(Lq2/x;)I

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    const/4 p3, 0x2

    .line 128
    if-ne p1, p3, :cond_3

    .line 129
    .line 130
    const-string p1, "pcm-encoding"

    .line 131
    .line 132
    invoke-virtual {v0, p1, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 133
    .line 134
    .line 135
    :cond_3
    const/16 p1, 0x20

    .line 136
    .line 137
    if-lt p2, p1, :cond_4

    .line 138
    .line 139
    const-string p1, "max-output-channel-count"

    .line 140
    .line 141
    const/16 p3, 0x63

    .line 142
    .line 143
    invoke-virtual {v0, p1, p3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 144
    .line 145
    .line 146
    :cond_4
    const/16 p1, 0x23

    .line 147
    .line 148
    if-lt p2, p1, :cond_5

    .line 149
    .line 150
    iget p1, p0, LC2/a0;->v1:I

    .line 151
    .line 152
    neg-int p1, p1

    .line 153
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    const-string p2, "importance"

    .line 158
    .line 159
    invoke-virtual {v0, p2, p1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 160
    .line 161
    .line 162
    :cond_5
    return-object v0
.end method

.method public u()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, LC2/a0;->u1:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, LC2/a0;->u1:Z

    .line 5
    .line 6
    return v0
.end method

.method protected u0(LJ2/t;Lq2/x;Lq2/x;)LA2/c;
    .locals 8

    .line 1
    invoke-virtual {p1, p2, p3}, LJ2/t;->e(Lq2/x;Lq2/x;)LA2/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, v0, LA2/c;->e:I

    .line 6
    .line 7
    invoke-virtual {p0, p3}, LJ2/A;->k1(Lq2/x;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    const v2, 0x8000

    .line 14
    .line 15
    .line 16
    or-int/2addr v1, v2

    .line 17
    :cond_0
    invoke-direct {p0, p1, p3}, LC2/a0;->q2(LJ2/t;Lq2/x;)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iget v3, p0, LC2/a0;->m1:I

    .line 22
    .line 23
    if-le v2, v3, :cond_1

    .line 24
    .line 25
    or-int/lit8 v1, v1, 0x40

    .line 26
    .line 27
    :cond_1
    move v7, v1

    .line 28
    new-instance v2, LA2/c;

    .line 29
    .line 30
    iget-object v3, p1, LJ2/t;->a:Ljava/lang/String;

    .line 31
    .line 32
    if-eqz v7, :cond_2

    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    :goto_0
    move v6, p1

    .line 36
    move-object v4, p2

    .line 37
    move-object v5, p3

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    iget p1, v0, LA2/c;->d:I

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :goto_1
    invoke-direct/range {v2 .. v7}, LA2/c;-><init>(Ljava/lang/String;Lq2/x;Lq2/x;II)V

    .line 43
    .line 44
    .line 45
    return-object v2
.end method

.method protected u1(Lq2/x;Landroid/media/MediaFormat;)V
    .locals 5

    .line 1
    iget-object v0, p0, LC2/a0;->q1:Lq2/x;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move-object p1, v0

    .line 8
    goto/16 :goto_3

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, LJ2/A;->N0()LJ2/q;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto/16 :goto_3

    .line 17
    .line 18
    :cond_1
    invoke-static {p2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    iget-object v0, p1, Lq2/x;->o:Ljava/lang/String;

    .line 22
    .line 23
    const-string v3, "audio/raw"

    .line 24
    .line 25
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    iget v0, p1, Lq2/x;->I:I

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    const-string v0, "pcm-encoding"

    .line 35
    .line 36
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    goto :goto_0

    .line 47
    :cond_3
    const-string v0, "v-bits-per-sample"

    .line 48
    .line 49
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_4

    .line 54
    .line 55
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-static {v0}, Lt2/a0;->l0(I)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    goto :goto_0

    .line 64
    :cond_4
    const/4 v0, 0x2

    .line 65
    :goto_0
    new-instance v4, Lq2/x$b;

    .line 66
    .line 67
    invoke-direct {v4}, Lq2/x$b;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4, v3}, Lq2/x$b;->y0(Ljava/lang/String;)Lq2/x$b;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-virtual {v3, v0}, Lq2/x$b;->s0(I)Lq2/x$b;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iget v3, p1, Lq2/x;->J:I

    .line 79
    .line 80
    invoke-virtual {v0, v3}, Lq2/x$b;->d0(I)Lq2/x$b;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget v3, p1, Lq2/x;->K:I

    .line 85
    .line 86
    invoke-virtual {v0, v3}, Lq2/x$b;->e0(I)Lq2/x$b;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iget-object v3, p1, Lq2/x;->l:Lq2/J;

    .line 91
    .line 92
    invoke-virtual {v0, v3}, Lq2/x$b;->r0(Lq2/J;)Lq2/x$b;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iget-object v3, p1, Lq2/x;->m:Ljava/lang/Object;

    .line 97
    .line 98
    invoke-virtual {v0, v3}, Lq2/x$b;->Z(Ljava/lang/Object;)Lq2/x$b;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    iget-object v3, p1, Lq2/x;->a:Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {v0, v3}, Lq2/x$b;->j0(Ljava/lang/String;)Lq2/x$b;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iget-object v3, p1, Lq2/x;->b:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v0, v3}, Lq2/x$b;->l0(Ljava/lang/String;)Lq2/x$b;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iget-object v3, p1, Lq2/x;->c:Ljava/util/List;

    .line 115
    .line 116
    invoke-virtual {v0, v3}, Lq2/x$b;->m0(Ljava/util/List;)Lq2/x$b;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    iget-object v3, p1, Lq2/x;->d:Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {v0, v3}, Lq2/x$b;->n0(Ljava/lang/String;)Lq2/x$b;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iget v3, p1, Lq2/x;->e:I

    .line 127
    .line 128
    invoke-virtual {v0, v3}, Lq2/x$b;->A0(I)Lq2/x$b;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iget v3, p1, Lq2/x;->f:I

    .line 133
    .line 134
    invoke-virtual {v0, v3}, Lq2/x$b;->w0(I)Lq2/x$b;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    const-string v3, "channel-count"

    .line 139
    .line 140
    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    invoke-virtual {v0, v3}, Lq2/x$b;->T(I)Lq2/x$b;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    const-string v3, "sample-rate"

    .line 149
    .line 150
    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    move-result p2

    .line 154
    invoke-virtual {v0, p2}, Lq2/x$b;->z0(I)Lq2/x$b;

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    invoke-virtual {p2}, Lq2/x$b;->P()Lq2/x;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    iget-boolean v0, p0, LC2/a0;->n1:Z

    .line 163
    .line 164
    if-eqz v0, :cond_6

    .line 165
    .line 166
    iget v0, p2, Lq2/x;->G:I

    .line 167
    .line 168
    const/4 v3, 0x6

    .line 169
    if-ne v0, v3, :cond_6

    .line 170
    .line 171
    iget v0, p1, Lq2/x;->G:I

    .line 172
    .line 173
    if-ge v0, v3, :cond_6

    .line 174
    .line 175
    new-array v2, v0, [I

    .line 176
    .line 177
    move v0, v1

    .line 178
    :goto_1
    iget v3, p1, Lq2/x;->G:I

    .line 179
    .line 180
    if-ge v0, v3, :cond_5

    .line 181
    .line 182
    aput v0, v2, v0

    .line 183
    .line 184
    add-int/lit8 v0, v0, 0x1

    .line 185
    .line 186
    goto :goto_1

    .line 187
    :cond_5
    :goto_2
    move-object p1, p2

    .line 188
    goto :goto_3

    .line 189
    :cond_6
    iget-boolean p1, p0, LC2/a0;->o1:Z

    .line 190
    .line 191
    if-eqz p1, :cond_5

    .line 192
    .line 193
    iget p1, p2, Lq2/x;->G:I

    .line 194
    .line 195
    invoke-static {p1}, LU2/S;->a(I)[I

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    goto :goto_2

    .line 200
    :goto_3
    :try_start_0
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 201
    .line 202
    const/16 v0, 0x1d

    .line 203
    .line 204
    if-lt p2, v0, :cond_8

    .line 205
    .line 206
    invoke-virtual {p0}, LJ2/A;->j1()Z

    .line 207
    .line 208
    .line 209
    move-result p2

    .line 210
    if-eqz p2, :cond_7

    .line 211
    .line 212
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->U()LA2/N;

    .line 213
    .line 214
    .line 215
    move-result-object p2

    .line 216
    iget p2, p2, LA2/N;->a:I

    .line 217
    .line 218
    if-eqz p2, :cond_7

    .line 219
    .line 220
    iget-object p2, p0, LC2/a0;->k1:LC2/z;

    .line 221
    .line 222
    invoke-virtual {p0}, Landroidx/media3/exoplayer/h;->U()LA2/N;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    iget v0, v0, LA2/N;->a:I

    .line 227
    .line 228
    invoke-interface {p2, v0}, LC2/z;->B(I)V

    .line 229
    .line 230
    .line 231
    goto :goto_4

    .line 232
    :catch_0
    move-exception p1

    .line 233
    goto :goto_5

    .line 234
    :cond_7
    iget-object p2, p0, LC2/a0;->k1:LC2/z;

    .line 235
    .line 236
    invoke-interface {p2, v1}, LC2/z;->B(I)V

    .line 237
    .line 238
    .line 239
    :cond_8
    :goto_4
    iget-object p2, p0, LC2/a0;->k1:LC2/z;

    .line 240
    .line 241
    invoke-interface {p2, p1, v1, v2}, LC2/z;->K(Lq2/x;I[I)V
    :try_end_0
    .catch LC2/z$b; {:try_start_0 .. :try_end_0} :catch_0

    .line 242
    .line 243
    .line 244
    return-void

    .line 245
    :goto_5
    iget-object p2, p1, LC2/z$b;->a:Lq2/x;

    .line 246
    .line 247
    const/16 v0, 0x1389

    .line 248
    .line 249
    invoke-virtual {p0, p1, p2, v0}, Landroidx/media3/exoplayer/h;->R(Ljava/lang/Throwable;Lq2/x;I)Landroidx/media3/exoplayer/s;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    throw p1
.end method

.method protected u2()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LC2/a0;->s1:Z

    .line 3
    .line 4
    return-void
.end method

.method public v(ILjava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    if-eq p1, v0, :cond_6

    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    if-eq p1, v0, :cond_5

    .line 6
    .line 7
    const/4 v0, 0x6

    .line 8
    if-eq p1, v0, :cond_4

    .line 9
    .line 10
    const/16 v0, 0xc

    .line 11
    .line 12
    if-eq p1, v0, :cond_3

    .line 13
    .line 14
    const/16 v0, 0x10

    .line 15
    .line 16
    if-eq p1, v0, :cond_2

    .line 17
    .line 18
    const/16 v0, 0x9

    .line 19
    .line 20
    if-eq p1, v0, :cond_1

    .line 21
    .line 22
    const/16 v0, 0xa

    .line 23
    .line 24
    if-eq p1, v0, :cond_0

    .line 25
    .line 26
    invoke-super {p0, p1, p2}, LJ2/A;->v(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    invoke-static {p2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    invoke-direct {p0, p1}, LC2/a0;->v2(I)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    iget-object p1, p0, LC2/a0;->k1:LC2/z;

    .line 45
    .line 46
    invoke-static {p2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    check-cast p2, Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    invoke-interface {p1, p2}, LC2/z;->R(Z)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_2
    invoke-static {p2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, Ljava/lang/Integer;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    iput p1, p0, LC2/a0;->v1:I

    .line 71
    .line 72
    invoke-direct {p0}, LC2/a0;->w2()V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_3
    iget-object p1, p0, LC2/a0;->k1:LC2/z;

    .line 77
    .line 78
    invoke-static {p1, p2}, LC2/a0$b;->a(LC2/z;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_4
    check-cast p2, Lq2/g;

    .line 83
    .line 84
    iget-object p1, p0, LC2/a0;->k1:LC2/z;

    .line 85
    .line 86
    invoke-static {p2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    check-cast p2, Lq2/g;

    .line 91
    .line 92
    invoke-interface {p1, p2}, LC2/z;->A(Lq2/g;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_5
    check-cast p2, Lq2/c;

    .line 97
    .line 98
    iget-object p1, p0, LC2/a0;->k1:LC2/z;

    .line 99
    .line 100
    invoke-static {p2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    check-cast p2, Lq2/c;

    .line 105
    .line 106
    invoke-interface {p1, p2}, LC2/z;->P(Lq2/c;)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :cond_6
    iget-object p1, p0, LC2/a0;->k1:LC2/z;

    .line 111
    .line 112
    invoke-static {p2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    check-cast p2, Ljava/lang/Float;

    .line 117
    .line 118
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    invoke-interface {p1, p2}, LC2/z;->w(F)V

    .line 123
    .line 124
    .line 125
    return-void
.end method

.method protected v1(J)V
    .locals 1

    .line 1
    iget-object v0, p0, LC2/a0;->k1:LC2/z;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LC2/z;->M(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected x1()V
    .locals 1

    .line 1
    invoke-super {p0}, LJ2/A;->x1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LC2/a0;->k1:LC2/z;

    .line 5
    .line 6
    invoke-interface {v0}, LC2/z;->N()V

    .line 7
    .line 8
    .line 9
    return-void
.end method
