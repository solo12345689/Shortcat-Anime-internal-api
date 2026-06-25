.class final LM2/W;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LM2/C;
.implements LU2/r;
.implements LQ2/m$b;
.implements LQ2/m$f;
.implements LM2/b0$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM2/W$c;,
        LM2/W$e;,
        LM2/W$f;,
        LM2/W$d;,
        LM2/W$b;
    }
.end annotation


# static fields
.field private static final q0:Ljava/util/Map;

.field private static final r0:Lq2/x;


# instance fields
.field private A:Z

.field private B:LM2/W$f;

.field private C:LU2/J;

.field private D:J

.field private E:Z

.field private F:I

.field private G:Z

.field private H:Z

.field private I:Z

.field private X:I

.field private Y:Z

.field private Z:J

.field private final a:Landroid/net/Uri;

.field private final b:Lw2/g;

.field private final c:LF2/u;

.field private final d:LQ2/k;

.field private final e:LM2/L$a;

.field private final f:LF2/t$a;

.field private final g:LM2/W$c;

.field private final h:LQ2/b;

.field private final i:Ljava/lang/String;

.field private final j:J

.field private final k:I

.field private final l:Lq2/x;

.field private l0:J

.field private final m:J

.field private m0:Z

.field private final n:LQ2/m;

.field private n0:I

.field private final o:LM2/Q;

.field private o0:Z

.field private final p:Lt2/m;

.field private p0:Z

.field private final q:Ljava/lang/Runnable;

.field private final r:Ljava/lang/Runnable;

.field private final s:Landroid/os/Handler;

.field private t:LM2/C$a;

.field private u:Lh3/b;

.field private v:[LM2/b0;

.field private w:[LM2/W$e;

.field private x:Z

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, LM2/W;->N()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, LM2/W;->q0:Ljava/util/Map;

    .line 6
    .line 7
    new-instance v0, Lq2/x$b;

    .line 8
    .line 9
    invoke-direct {v0}, Lq2/x$b;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v1, "icy"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lq2/x$b;->j0(Ljava/lang/String;)Lq2/x$b;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "application/x-icy"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lq2/x$b;->y0(Ljava/lang/String;)Lq2/x$b;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lq2/x$b;->P()Lq2/x;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, LM2/W;->r0:Lq2/x;

    .line 29
    .line 30
    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Lw2/g;LM2/Q;LF2/u;LF2/t$a;LQ2/k;LM2/L$a;LM2/W$c;LQ2/b;Ljava/lang/String;IILq2/x;JLR2/a;)V
    .locals 1

    .line 1
    move-object/from16 v0, p16

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LM2/W;->a:Landroid/net/Uri;

    .line 7
    .line 8
    iput-object p2, p0, LM2/W;->b:Lw2/g;

    .line 9
    .line 10
    iput-object p4, p0, LM2/W;->c:LF2/u;

    .line 11
    .line 12
    iput-object p5, p0, LM2/W;->f:LF2/t$a;

    .line 13
    .line 14
    iput-object p6, p0, LM2/W;->d:LQ2/k;

    .line 15
    .line 16
    iput-object p7, p0, LM2/W;->e:LM2/L$a;

    .line 17
    .line 18
    iput-object p8, p0, LM2/W;->g:LM2/W$c;

    .line 19
    .line 20
    iput-object p9, p0, LM2/W;->h:LQ2/b;

    .line 21
    .line 22
    iput-object p10, p0, LM2/W;->i:Ljava/lang/String;

    .line 23
    .line 24
    int-to-long p1, p11

    .line 25
    iput-wide p1, p0, LM2/W;->j:J

    .line 26
    .line 27
    iput p12, p0, LM2/W;->k:I

    .line 28
    .line 29
    iput-object p13, p0, LM2/W;->l:Lq2/x;

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    new-instance p1, LQ2/m;

    .line 34
    .line 35
    invoke-direct {p1, v0}, LQ2/m;-><init>(LR2/a;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance p1, LQ2/m;

    .line 40
    .line 41
    const-string p2, "ProgressiveMediaPeriod"

    .line 42
    .line 43
    invoke-direct {p1, p2}, LQ2/m;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    iput-object p1, p0, LM2/W;->n:LQ2/m;

    .line 47
    .line 48
    iput-object p3, p0, LM2/W;->o:LM2/Q;

    .line 49
    .line 50
    move-wide p1, p14

    .line 51
    iput-wide p1, p0, LM2/W;->m:J

    .line 52
    .line 53
    new-instance p1, Lt2/m;

    .line 54
    .line 55
    invoke-direct {p1}, Lt2/m;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, LM2/W;->p:Lt2/m;

    .line 59
    .line 60
    new-instance p1, LM2/T;

    .line 61
    .line 62
    invoke-direct {p1, p0}, LM2/T;-><init>(LM2/W;)V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, LM2/W;->q:Ljava/lang/Runnable;

    .line 66
    .line 67
    new-instance p1, LM2/U;

    .line 68
    .line 69
    invoke-direct {p1, p0}, LM2/U;-><init>(LM2/W;)V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, LM2/W;->r:Ljava/lang/Runnable;

    .line 73
    .line 74
    invoke-static {}, Lt2/a0;->C()Landroid/os/Handler;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iput-object p1, p0, LM2/W;->s:Landroid/os/Handler;

    .line 79
    .line 80
    const/4 p1, 0x0

    .line 81
    new-array p2, p1, [LM2/W$e;

    .line 82
    .line 83
    iput-object p2, p0, LM2/W;->w:[LM2/W$e;

    .line 84
    .line 85
    new-array p1, p1, [LM2/b0;

    .line 86
    .line 87
    iput-object p1, p0, LM2/W;->v:[LM2/b0;

    .line 88
    .line 89
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    iput-wide p1, p0, LM2/W;->l0:J

    .line 95
    .line 96
    const/4 p1, 0x1

    .line 97
    iput p1, p0, LM2/W;->F:I

    .line 98
    .line 99
    return-void
.end method

.method static synthetic A(LM2/W;)J
    .locals 2

    .line 1
    iget-wide v0, p0, LM2/W;->j:J

    .line 2
    .line 3
    return-wide v0
.end method

.method static synthetic B(LM2/W;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iget-object p0, p0, LM2/W;->r:Ljava/lang/Runnable;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic C(LM2/W;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, LM2/W;->s:Landroid/os/Handler;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic D(LM2/W;Z)J
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LM2/W;->P(Z)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method static synthetic E()Ljava/util/Map;
    .locals 1

    .line 1
    sget-object v0, LM2/W;->q0:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method static synthetic F(LM2/W;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, LM2/W;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic G(LM2/W;)J
    .locals 2

    .line 1
    iget-wide v0, p0, LM2/W;->D:J

    .line 2
    .line 3
    return-wide v0
.end method

.method static synthetic H(LM2/W;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LM2/W;->Y()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic I(LM2/W;)Lh3/b;
    .locals 0

    .line 1
    iget-object p0, p0, LM2/W;->u:Lh3/b;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic J(LM2/W;Lh3/b;)Lh3/b;
    .locals 0

    .line 1
    iput-object p1, p0, LM2/W;->u:Lh3/b;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic K()Lq2/x;
    .locals 1

    .line 1
    sget-object v0, LM2/W;->r0:Lq2/x;

    .line 2
    .line 3
    return-object v0
.end method

.method private L()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LM2/W;->y:Z

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM2/W;->B:LM2/W$f;

    .line 7
    .line 8
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LM2/W;->C:LU2/J;

    .line 12
    .line 13
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private M(LM2/W$b;I)Z
    .locals 6

    .line 1
    iget-boolean v0, p0, LM2/W;->Y:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_3

    .line 5
    .line 6
    iget-object v0, p0, LM2/W;->C:LU2/J;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0}, LU2/J;->n()J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmp-long v0, v2, v4

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-boolean p2, p0, LM2/W;->y:Z

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    invoke-direct {p0}, LM2/W;->k0()Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-nez p2, :cond_1

    .line 34
    .line 35
    iput-boolean v1, p0, LM2/W;->m0:Z

    .line 36
    .line 37
    return v0

    .line 38
    :cond_1
    iget-boolean p2, p0, LM2/W;->y:Z

    .line 39
    .line 40
    iput-boolean p2, p0, LM2/W;->H:Z

    .line 41
    .line 42
    const-wide/16 v2, 0x0

    .line 43
    .line 44
    iput-wide v2, p0, LM2/W;->Z:J

    .line 45
    .line 46
    iput v0, p0, LM2/W;->n0:I

    .line 47
    .line 48
    iget-object p2, p0, LM2/W;->v:[LM2/b0;

    .line 49
    .line 50
    array-length v4, p2

    .line 51
    :goto_0
    if-ge v0, v4, :cond_2

    .line 52
    .line 53
    aget-object v5, p2, v0

    .line 54
    .line 55
    invoke-virtual {v5}, LM2/b0;->X()V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    invoke-static {p1, v2, v3, v2, v3}, LM2/W$b;->h(LM2/W$b;JJ)V

    .line 62
    .line 63
    .line 64
    return v1

    .line 65
    :cond_3
    :goto_1
    iput p2, p0, LM2/W;->n0:I

    .line 66
    .line 67
    return v1
.end method

.method private static N()Ljava/util/Map;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Icy-MetaData"

    .line 7
    .line 8
    const-string v2, "1"

    .line 9
    .line 10
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method private O()I
    .locals 5

    .line 1
    iget-object v0, p0, LM2/W;->v:[LM2/b0;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v2, v1, :cond_0

    .line 7
    .line 8
    aget-object v4, v0, v2

    .line 9
    .line 10
    invoke-virtual {v4}, LM2/b0;->J()I

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    add-int/2addr v3, v4

    .line 15
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return v3
.end method

.method private P(Z)J
    .locals 5

    .line 1
    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_0
    iget-object v3, p0, LM2/W;->v:[LM2/b0;

    .line 5
    .line 6
    array-length v3, v3

    .line 7
    if-ge v2, v3, :cond_2

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    iget-object v3, p0, LM2/W;->B:LM2/W$f;

    .line 12
    .line 13
    invoke-static {v3}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, LM2/W$f;

    .line 18
    .line 19
    iget-object v3, v3, LM2/W$f;->c:[Z

    .line 20
    .line 21
    aget-boolean v3, v3, v2

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    :cond_0
    iget-object v3, p0, LM2/W;->v:[LM2/b0;

    .line 26
    .line 27
    aget-object v3, v3, v2

    .line 28
    .line 29
    invoke-virtual {v3}, LM2/b0;->C()J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    return-wide v0
.end method

.method private R()Z
    .locals 4

    .line 1
    iget-wide v0, p0, LM2/W;->l0:J

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

.method private T()V
    .locals 13

    .line 1
    iget-boolean v0, p0, LM2/W;->p0:Z

    .line 2
    .line 3
    if-nez v0, :cond_c

    .line 4
    .line 5
    iget-boolean v0, p0, LM2/W;->y:Z

    .line 6
    .line 7
    if-nez v0, :cond_c

    .line 8
    .line 9
    iget-boolean v0, p0, LM2/W;->x:Z

    .line 10
    .line 11
    if-eqz v0, :cond_c

    .line 12
    .line 13
    iget-object v0, p0, LM2/W;->C:LU2/J;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_6

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, LM2/W;->v:[LM2/b0;

    .line 20
    .line 21
    array-length v1, v0

    .line 22
    const/4 v2, 0x0

    .line 23
    move v3, v2

    .line 24
    :goto_0
    if-ge v3, v1, :cond_2

    .line 25
    .line 26
    aget-object v4, v0, v3

    .line 27
    .line 28
    invoke-virtual {v4}, LM2/b0;->I()Lq2/x;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    if-nez v4, :cond_1

    .line 33
    .line 34
    goto/16 :goto_6

    .line 35
    .line 36
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    iget-object v0, p0, LM2/W;->p:Lt2/m;

    .line 40
    .line 41
    invoke-virtual {v0}, Lt2/m;->d()Z

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, LM2/W;->v:[LM2/b0;

    .line 45
    .line 46
    array-length v0, v0

    .line 47
    new-array v1, v0, [Lq2/a0;

    .line 48
    .line 49
    new-array v3, v0, [Z

    .line 50
    .line 51
    move v4, v2

    .line 52
    :goto_1
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    const/4 v7, 0x1

    .line 58
    if-ge v4, v0, :cond_a

    .line 59
    .line 60
    iget-object v8, p0, LM2/W;->v:[LM2/b0;

    .line 61
    .line 62
    aget-object v8, v8, v4

    .line 63
    .line 64
    invoke-virtual {v8}, LM2/b0;->I()Lq2/x;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    invoke-static {v8}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    check-cast v8, Lq2/x;

    .line 73
    .line 74
    iget-object v9, v8, Lq2/x;->o:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v9}, Lq2/K;->o(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    if-nez v10, :cond_4

    .line 81
    .line 82
    invoke-static {v9}, Lq2/K;->t(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    if-eqz v11, :cond_3

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    move v11, v2

    .line 90
    goto :goto_3

    .line 91
    :cond_4
    :goto_2
    move v11, v7

    .line 92
    :goto_3
    aput-boolean v11, v3, v4

    .line 93
    .line 94
    iget-boolean v12, p0, LM2/W;->z:Z

    .line 95
    .line 96
    or-int/2addr v11, v12

    .line 97
    iput-boolean v11, p0, LM2/W;->z:Z

    .line 98
    .line 99
    invoke-static {v9}, Lq2/K;->q(Ljava/lang/String;)Z

    .line 100
    .line 101
    .line 102
    move-result v9

    .line 103
    iget-wide v11, p0, LM2/W;->m:J

    .line 104
    .line 105
    cmp-long v5, v11, v5

    .line 106
    .line 107
    if-eqz v5, :cond_5

    .line 108
    .line 109
    if-ne v0, v7, :cond_5

    .line 110
    .line 111
    if-eqz v9, :cond_5

    .line 112
    .line 113
    move v5, v7

    .line 114
    goto :goto_4

    .line 115
    :cond_5
    move v5, v2

    .line 116
    :goto_4
    iput-boolean v5, p0, LM2/W;->A:Z

    .line 117
    .line 118
    iget-object v5, p0, LM2/W;->u:Lh3/b;

    .line 119
    .line 120
    if-eqz v5, :cond_9

    .line 121
    .line 122
    if-nez v10, :cond_6

    .line 123
    .line 124
    iget-object v6, p0, LM2/W;->w:[LM2/W$e;

    .line 125
    .line 126
    aget-object v6, v6, v4

    .line 127
    .line 128
    iget-boolean v6, v6, LM2/W$e;->b:Z

    .line 129
    .line 130
    if-eqz v6, :cond_8

    .line 131
    .line 132
    :cond_6
    iget-object v6, v8, Lq2/x;->l:Lq2/J;

    .line 133
    .line 134
    if-nez v6, :cond_7

    .line 135
    .line 136
    new-instance v6, Lq2/J;

    .line 137
    .line 138
    new-array v7, v7, [Lq2/J$a;

    .line 139
    .line 140
    aput-object v5, v7, v2

    .line 141
    .line 142
    invoke-direct {v6, v7}, Lq2/J;-><init>([Lq2/J$a;)V

    .line 143
    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_7
    new-array v7, v7, [Lq2/J$a;

    .line 147
    .line 148
    aput-object v5, v7, v2

    .line 149
    .line 150
    invoke-virtual {v6, v7}, Lq2/J;->a([Lq2/J$a;)Lq2/J;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    :goto_5
    invoke-virtual {v8}, Lq2/x;->b()Lq2/x$b;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    invoke-virtual {v7, v6}, Lq2/x$b;->r0(Lq2/J;)Lq2/x$b;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    invoke-virtual {v6}, Lq2/x$b;->P()Lq2/x;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    :cond_8
    if-eqz v10, :cond_9

    .line 167
    .line 168
    iget v6, v8, Lq2/x;->h:I

    .line 169
    .line 170
    const/4 v7, -0x1

    .line 171
    if-ne v6, v7, :cond_9

    .line 172
    .line 173
    iget v6, v8, Lq2/x;->i:I

    .line 174
    .line 175
    if-ne v6, v7, :cond_9

    .line 176
    .line 177
    iget v6, v5, Lh3/b;->a:I

    .line 178
    .line 179
    if-eq v6, v7, :cond_9

    .line 180
    .line 181
    invoke-virtual {v8}, Lq2/x;->b()Lq2/x$b;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    iget v5, v5, Lh3/b;->a:I

    .line 186
    .line 187
    invoke-virtual {v6, v5}, Lq2/x$b;->S(I)Lq2/x$b;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    invoke-virtual {v5}, Lq2/x$b;->P()Lq2/x;

    .line 192
    .line 193
    .line 194
    move-result-object v8

    .line 195
    :cond_9
    iget-object v5, p0, LM2/W;->c:LF2/u;

    .line 196
    .line 197
    invoke-interface {v5, v8}, LF2/u;->b(Lq2/x;)I

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    invoke-virtual {v8, v5}, Lq2/x;->c(I)Lq2/x;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    new-instance v6, Lq2/a0;

    .line 206
    .line 207
    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    filled-new-array {v5}, [Lq2/x;

    .line 212
    .line 213
    .line 214
    move-result-object v8

    .line 215
    invoke-direct {v6, v7, v8}, Lq2/a0;-><init>(Ljava/lang/String;[Lq2/x;)V

    .line 216
    .line 217
    .line 218
    aput-object v6, v1, v4

    .line 219
    .line 220
    iget-boolean v6, p0, LM2/W;->I:Z

    .line 221
    .line 222
    iget-boolean v5, v5, Lq2/x;->u:Z

    .line 223
    .line 224
    or-int/2addr v5, v6

    .line 225
    iput-boolean v5, p0, LM2/W;->I:Z

    .line 226
    .line 227
    add-int/lit8 v4, v4, 0x1

    .line 228
    .line 229
    goto/16 :goto_1

    .line 230
    .line 231
    :cond_a
    new-instance v0, LM2/W$f;

    .line 232
    .line 233
    new-instance v2, LM2/n0;

    .line 234
    .line 235
    invoke-direct {v2, v1}, LM2/n0;-><init>([Lq2/a0;)V

    .line 236
    .line 237
    .line 238
    invoke-direct {v0, v2, v3}, LM2/W$f;-><init>(LM2/n0;[Z)V

    .line 239
    .line 240
    .line 241
    iput-object v0, p0, LM2/W;->B:LM2/W$f;

    .line 242
    .line 243
    iget-boolean v0, p0, LM2/W;->A:Z

    .line 244
    .line 245
    if-eqz v0, :cond_b

    .line 246
    .line 247
    iget-wide v0, p0, LM2/W;->D:J

    .line 248
    .line 249
    cmp-long v0, v0, v5

    .line 250
    .line 251
    if-nez v0, :cond_b

    .line 252
    .line 253
    iget-wide v0, p0, LM2/W;->m:J

    .line 254
    .line 255
    iput-wide v0, p0, LM2/W;->D:J

    .line 256
    .line 257
    new-instance v0, LM2/W$a;

    .line 258
    .line 259
    iget-object v1, p0, LM2/W;->C:LU2/J;

    .line 260
    .line 261
    invoke-direct {v0, p0, v1}, LM2/W$a;-><init>(LM2/W;LU2/J;)V

    .line 262
    .line 263
    .line 264
    iput-object v0, p0, LM2/W;->C:LU2/J;

    .line 265
    .line 266
    :cond_b
    iget-object v0, p0, LM2/W;->g:LM2/W$c;

    .line 267
    .line 268
    iget-wide v1, p0, LM2/W;->D:J

    .line 269
    .line 270
    iget-object v3, p0, LM2/W;->C:LU2/J;

    .line 271
    .line 272
    iget-boolean v4, p0, LM2/W;->E:Z

    .line 273
    .line 274
    invoke-interface {v0, v1, v2, v3, v4}, LM2/W$c;->g(JLU2/J;Z)V

    .line 275
    .line 276
    .line 277
    iput-boolean v7, p0, LM2/W;->y:Z

    .line 278
    .line 279
    iget-object v0, p0, LM2/W;->t:LM2/C$a;

    .line 280
    .line 281
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    check-cast v0, LM2/C$a;

    .line 286
    .line 287
    invoke-interface {v0, p0}, LM2/C$a;->b(LM2/C;)V

    .line 288
    .line 289
    .line 290
    :cond_c
    :goto_6
    return-void
.end method

.method private U(I)V
    .locals 10

    .line 1
    invoke-direct {p0}, LM2/W;->L()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LM2/W;->B:LM2/W$f;

    .line 5
    .line 6
    iget-object v1, v0, LM2/W$f;->d:[Z

    .line 7
    .line 8
    aget-boolean v2, v1, p1

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    iget-object v0, v0, LM2/W$f;->a:LM2/n0;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, LM2/n0;->b(I)Lq2/a0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v0, v2}, Lq2/a0;->c(I)Lq2/x;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    iget-object v3, p0, LM2/W;->e:LM2/L$a;

    .line 24
    .line 25
    iget-object v0, v5, Lq2/x;->o:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v0}, Lq2/K;->k(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/4 v7, 0x0

    .line 32
    iget-wide v8, p0, LM2/W;->Z:J

    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    invoke-virtual/range {v3 .. v9}, LM2/L$a;->j(ILq2/x;ILjava/lang/Object;J)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    aput-boolean v0, v1, p1

    .line 40
    .line 41
    :cond_0
    return-void
.end method

.method private V(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, LM2/W;->L()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, LM2/W;->m0:Z

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-boolean v0, p0, LM2/W;->z:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, LM2/W;->B:LM2/W$f;

    .line 13
    .line 14
    iget-object v0, v0, LM2/W$f;->b:[Z

    .line 15
    .line 16
    aget-boolean v0, v0, p1

    .line 17
    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, LM2/W;->v:[LM2/b0;

    .line 21
    .line 22
    aget-object p1, v0, p1

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-virtual {p1, v0}, LM2/b0;->N(Z)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const-wide/16 v1, 0x0

    .line 33
    .line 34
    iput-wide v1, p0, LM2/W;->l0:J

    .line 35
    .line 36
    iput-boolean v0, p0, LM2/W;->m0:Z

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    iput-boolean p1, p0, LM2/W;->H:Z

    .line 40
    .line 41
    iput-wide v1, p0, LM2/W;->Z:J

    .line 42
    .line 43
    iput v0, p0, LM2/W;->n0:I

    .line 44
    .line 45
    iget-object p1, p0, LM2/W;->v:[LM2/b0;

    .line 46
    .line 47
    array-length v1, p1

    .line 48
    :goto_0
    if-ge v0, v1, :cond_2

    .line 49
    .line 50
    aget-object v2, p1, v0

    .line 51
    .line 52
    invoke-virtual {v2}, LM2/b0;->X()V

    .line 53
    .line 54
    .line 55
    add-int/lit8 v0, v0, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    iget-object p1, p0, LM2/W;->t:LM2/C$a;

    .line 59
    .line 60
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, LM2/C$a;

    .line 65
    .line 66
    invoke-interface {p1, p0}, LM2/d0$a;->j(LM2/d0;)V

    .line 67
    .line 68
    .line 69
    :cond_3
    :goto_1
    return-void
.end method

.method private Y()V
    .locals 2

    .line 1
    iget-object v0, p0, LM2/W;->s:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v1, LM2/S;

    .line 4
    .line 5
    invoke-direct {v1, p0}, LM2/S;-><init>(LM2/W;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private d0(LM2/W$e;)LU2/O;
    .locals 4

    .line 1
    iget-object v0, p0, LM2/W;->v:[LM2/b0;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_1

    .line 6
    .line 7
    iget-object v2, p0, LM2/W;->w:[LM2/W$e;

    .line 8
    .line 9
    aget-object v2, v2, v1

    .line 10
    .line 11
    invoke-virtual {p1, v2}, LM2/W$e;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, LM2/W;->v:[LM2/b0;

    .line 18
    .line 19
    aget-object p1, p1, v1

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-boolean v1, p0, LM2/W;->x:Z

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v1, "Extractor added new track (id="

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget p1, p1, LM2/W$e;->a:I

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p1, ") after finishing tracks."

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const-string v0, "ProgressiveMediaPeriod"

    .line 54
    .line 55
    invoke-static {v0, p1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    new-instance p1, LU2/n;

    .line 59
    .line 60
    invoke-direct {p1}, LU2/n;-><init>()V

    .line 61
    .line 62
    .line 63
    return-object p1

    .line 64
    :cond_2
    iget-object v1, p0, LM2/W;->h:LQ2/b;

    .line 65
    .line 66
    iget-object v2, p0, LM2/W;->c:LF2/u;

    .line 67
    .line 68
    iget-object v3, p0, LM2/W;->f:LF2/t$a;

    .line 69
    .line 70
    invoke-static {v1, v2, v3}, LM2/b0;->l(LQ2/b;LF2/u;LF2/t$a;)LM2/b0;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v1, p0}, LM2/b0;->f0(LM2/b0$d;)V

    .line 75
    .line 76
    .line 77
    iget-object v2, p0, LM2/W;->w:[LM2/W$e;

    .line 78
    .line 79
    add-int/lit8 v3, v0, 0x1

    .line 80
    .line 81
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, [LM2/W$e;

    .line 86
    .line 87
    aput-object p1, v2, v0

    .line 88
    .line 89
    invoke-static {v2}, Lt2/a0;->m([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    check-cast p1, [LM2/W$e;

    .line 94
    .line 95
    iput-object p1, p0, LM2/W;->w:[LM2/W$e;

    .line 96
    .line 97
    iget-object p1, p0, LM2/W;->v:[LM2/b0;

    .line 98
    .line 99
    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    check-cast p1, [LM2/b0;

    .line 104
    .line 105
    aput-object v1, p1, v0

    .line 106
    .line 107
    invoke-static {p1}, Lt2/a0;->m([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    check-cast p1, [LM2/b0;

    .line 112
    .line 113
    iput-object p1, p0, LM2/W;->v:[LM2/b0;

    .line 114
    .line 115
    return-object v1
.end method

.method private g0([ZJZ)Z
    .locals 5

    .line 1
    iget-object v0, p0, LM2/W;->v:[LM2/b0;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    :goto_0
    if-ge v2, v0, :cond_4

    .line 7
    .line 8
    iget-object v3, p0, LM2/W;->v:[LM2/b0;

    .line 9
    .line 10
    aget-object v3, v3, v2

    .line 11
    .line 12
    invoke-virtual {v3}, LM2/b0;->F()I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-nez v4, :cond_0

    .line 17
    .line 18
    if-eqz p4, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    iget-boolean v4, p0, LM2/W;->A:Z

    .line 22
    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    invoke-virtual {v3}, LM2/b0;->A()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    invoke-virtual {v3, v4}, LM2/b0;->a0(I)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    iget-boolean v4, p0, LM2/W;->o0:Z

    .line 35
    .line 36
    invoke-virtual {v3, p2, p3, v4}, LM2/b0;->b0(JZ)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    :goto_1
    if-nez v3, :cond_3

    .line 41
    .line 42
    aget-boolean v3, p1, v2

    .line 43
    .line 44
    if-nez v3, :cond_2

    .line 45
    .line 46
    iget-boolean v3, p0, LM2/W;->z:Z

    .line 47
    .line 48
    if-nez v3, :cond_3

    .line 49
    .line 50
    :cond_2
    return v1

    .line 51
    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_4
    const/4 p1, 0x1

    .line 55
    return p1
.end method

.method private h0(LU2/J;)V
    .locals 6

    .line 1
    iget-object v0, p0, LM2/W;->u:Lh3/b;

    .line 2
    .line 3
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    move-object v0, p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v0, LU2/J$b;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, LU2/J$b;-><init>(J)V

    .line 15
    .line 16
    .line 17
    :goto_0
    iput-object v0, p0, LM2/W;->C:LU2/J;

    .line 18
    .line 19
    invoke-interface {p1}, LU2/J;->n()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    iput-wide v3, p0, LM2/W;->D:J

    .line 24
    .line 25
    iget-boolean v0, p0, LM2/W;->Y:Z

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    invoke-interface {p1}, LU2/J;->n()J

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    cmp-long v0, v4, v1

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    move v0, v3

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    :goto_1
    iput-boolean v0, p0, LM2/W;->E:Z

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    const/4 v3, 0x7

    .line 46
    :cond_2
    iput v3, p0, LM2/W;->F:I

    .line 47
    .line 48
    iget-boolean v1, p0, LM2/W;->y:Z

    .line 49
    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    iget-object v1, p0, LM2/W;->g:LM2/W$c;

    .line 53
    .line 54
    iget-wide v2, p0, LM2/W;->D:J

    .line 55
    .line 56
    invoke-interface {v1, v2, v3, p1, v0}, LM2/W$c;->g(JLU2/J;Z)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_3
    invoke-direct {p0}, LM2/W;->T()V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method private j0()V
    .locals 10

    .line 1
    new-instance v0, LM2/W$b;

    .line 2
    .line 3
    iget-object v2, p0, LM2/W;->a:Landroid/net/Uri;

    .line 4
    .line 5
    iget-object v3, p0, LM2/W;->b:Lw2/g;

    .line 6
    .line 7
    iget-object v4, p0, LM2/W;->o:LM2/Q;

    .line 8
    .line 9
    iget-object v6, p0, LM2/W;->p:Lt2/m;

    .line 10
    .line 11
    move-object v5, p0

    .line 12
    move-object v1, p0

    .line 13
    invoke-direct/range {v0 .. v6}, LM2/W$b;-><init>(LM2/W;Landroid/net/Uri;Lw2/g;LM2/Q;LU2/r;Lt2/m;)V

    .line 14
    .line 15
    .line 16
    iget-boolean v2, v1, LM2/W;->y:Z

    .line 17
    .line 18
    if-eqz v2, :cond_2

    .line 19
    .line 20
    invoke-direct {p0}, LM2/W;->R()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-static {v2}, Lt2/a;->g(Z)V

    .line 25
    .line 26
    .line 27
    iget-wide v2, v1, LM2/W;->D:J

    .line 28
    .line 29
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    cmp-long v6, v2, v4

    .line 35
    .line 36
    if-eqz v6, :cond_0

    .line 37
    .line 38
    iget-wide v6, v1, LM2/W;->l0:J

    .line 39
    .line 40
    cmp-long v2, v6, v2

    .line 41
    .line 42
    if-lez v2, :cond_0

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    iput-boolean v0, v1, LM2/W;->o0:Z

    .line 46
    .line 47
    iput-wide v4, v1, LM2/W;->l0:J

    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    iget-object v2, v1, LM2/W;->C:LU2/J;

    .line 51
    .line 52
    invoke-static {v2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, LU2/J;

    .line 57
    .line 58
    iget-wide v6, v1, LM2/W;->l0:J

    .line 59
    .line 60
    invoke-interface {v2, v6, v7}, LU2/J;->g(J)LU2/J$a;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    iget-object v2, v2, LU2/J$a;->a:LU2/K;

    .line 65
    .line 66
    iget-wide v2, v2, LU2/K;->b:J

    .line 67
    .line 68
    iget-wide v6, v1, LM2/W;->l0:J

    .line 69
    .line 70
    invoke-static {v0, v2, v3, v6, v7}, LM2/W$b;->h(LM2/W$b;JJ)V

    .line 71
    .line 72
    .line 73
    iget-object v2, v1, LM2/W;->v:[LM2/b0;

    .line 74
    .line 75
    array-length v3, v2

    .line 76
    const/4 v6, 0x0

    .line 77
    :goto_0
    if-ge v6, v3, :cond_1

    .line 78
    .line 79
    aget-object v7, v2, v6

    .line 80
    .line 81
    iget-wide v8, v1, LM2/W;->l0:J

    .line 82
    .line 83
    invoke-virtual {v7, v8, v9}, LM2/b0;->d0(J)V

    .line 84
    .line 85
    .line 86
    add-int/lit8 v6, v6, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    iput-wide v4, v1, LM2/W;->l0:J

    .line 90
    .line 91
    :cond_2
    invoke-direct {p0}, LM2/W;->O()I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    iput v2, v1, LM2/W;->n0:I

    .line 96
    .line 97
    iget-object v2, v1, LM2/W;->n:LQ2/m;

    .line 98
    .line 99
    iget-object v3, v1, LM2/W;->d:LQ2/k;

    .line 100
    .line 101
    iget v4, v1, LM2/W;->F:I

    .line 102
    .line 103
    invoke-interface {v3, v4}, LQ2/k;->a(I)I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    invoke-virtual {v2, v0, p0, v3}, LQ2/m;->n(LQ2/m$e;LQ2/m$b;I)J

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method private k0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LM2/W;->H:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-direct {p0}, LM2/W;->R()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    return v0
.end method

.method public static synthetic w(LM2/W;LU2/J;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LM2/W;->h0(LU2/J;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic x(LM2/W;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LM2/W;->T()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic y(LM2/W;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LM2/W;->p0:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LM2/W;->t:LM2/C$a;

    .line 6
    .line 7
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, LM2/C$a;

    .line 12
    .line 13
    invoke-interface {v0, p0}, LM2/d0$a;->j(LM2/d0;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public static synthetic z(LM2/W;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LM2/W;->Y:Z

    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method Q()LU2/O;
    .locals 3

    .line 1
    new-instance v0, LM2/W$e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-direct {v0, v1, v2}, LM2/W$e;-><init>(IZ)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, LM2/W;->d0(LM2/W$e;)LU2/O;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method S(I)Z
    .locals 1

    .line 1
    invoke-direct {p0}, LM2/W;->k0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LM2/W;->v:[LM2/b0;

    .line 8
    .line 9
    aget-object p1, v0, p1

    .line 10
    .line 11
    iget-boolean v0, p0, LM2/W;->o0:Z

    .line 12
    .line 13
    invoke-virtual {p1, v0}, LM2/b0;->N(Z)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    return p1
.end method

.method W()V
    .locals 3

    .line 1
    iget-object v0, p0, LM2/W;->n:LQ2/m;

    .line 2
    .line 3
    iget-object v1, p0, LM2/W;->d:LQ2/k;

    .line 4
    .line 5
    iget v2, p0, LM2/W;->F:I

    .line 6
    .line 7
    invoke-interface {v1, v2}, LQ2/k;->a(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0, v1}, LQ2/m;->k(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method X(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LM2/W;->v:[LM2/b0;

    .line 2
    .line 3
    aget-object p1, v0, p1

    .line 4
    .line 5
    invoke-virtual {p1}, LM2/b0;->P()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, LM2/W;->W()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public Z(LM2/W$b;JJZ)V
    .locals 13

    .line 1
    invoke-static {p1}, LM2/W$b;->d(LM2/W$b;)Lw2/D;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LM2/y;

    .line 6
    .line 7
    invoke-static {p1}, LM2/W$b;->e(LM2/W$b;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    invoke-static {p1}, LM2/W$b;->f(LM2/W$b;)Lw2/o;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {v0}, Lw2/D;->q()Landroid/net/Uri;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-virtual {v0}, Lw2/D;->r()Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    invoke-virtual {v0}, Lw2/D;->p()J

    .line 24
    .line 25
    .line 26
    move-result-wide v11

    .line 27
    move-wide v7, p2

    .line 28
    move-wide/from16 v9, p4

    .line 29
    .line 30
    invoke-direct/range {v1 .. v12}, LM2/y;-><init>(JLw2/o;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, LM2/W;->d:LQ2/k;

    .line 34
    .line 35
    invoke-static {p1}, LM2/W$b;->e(LM2/W$b;)J

    .line 36
    .line 37
    .line 38
    move-result-wide v2

    .line 39
    invoke-interface {v0, v2, v3}, LQ2/k;->d(J)V

    .line 40
    .line 41
    .line 42
    move-object v2, v1

    .line 43
    iget-object v1, p0, LM2/W;->e:LM2/L$a;

    .line 44
    .line 45
    invoke-static {p1}, LM2/W$b;->g(LM2/W$b;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v8

    .line 49
    iget-wide v10, p0, LM2/W;->D:J

    .line 50
    .line 51
    const/4 v3, 0x1

    .line 52
    const/4 v4, -0x1

    .line 53
    const/4 v5, 0x0

    .line 54
    const/4 v6, 0x0

    .line 55
    const/4 v7, 0x0

    .line 56
    invoke-virtual/range {v1 .. v11}, LM2/L$a;->m(LM2/y;IILq2/x;ILjava/lang/Object;JJ)V

    .line 57
    .line 58
    .line 59
    if-nez p6, :cond_1

    .line 60
    .line 61
    iget-object p1, p0, LM2/W;->v:[LM2/b0;

    .line 62
    .line 63
    array-length v0, p1

    .line 64
    const/4 v1, 0x0

    .line 65
    :goto_0
    if-ge v1, v0, :cond_0

    .line 66
    .line 67
    aget-object v2, p1, v1

    .line 68
    .line 69
    invoke-virtual {v2}, LM2/b0;->X()V

    .line 70
    .line 71
    .line 72
    add-int/lit8 v1, v1, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    iget p1, p0, LM2/W;->X:I

    .line 76
    .line 77
    if-lez p1, :cond_1

    .line 78
    .line 79
    iget-object p1, p0, LM2/W;->t:LM2/C$a;

    .line 80
    .line 81
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    check-cast p1, LM2/C$a;

    .line 86
    .line 87
    invoke-interface {p1, p0}, LM2/d0$a;->j(LM2/d0;)V

    .line 88
    .line 89
    .line 90
    :cond_1
    return-void
.end method

.method public a(Landroidx/media3/exoplayer/q0;)Z
    .locals 1

    .line 1
    iget-boolean p1, p0, LM2/W;->o0:Z

    .line 2
    .line 3
    if-nez p1, :cond_3

    .line 4
    .line 5
    iget-object p1, p0, LM2/W;->n:LQ2/m;

    .line 6
    .line 7
    invoke-virtual {p1}, LQ2/m;->i()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_3

    .line 12
    .line 13
    iget-boolean p1, p0, LM2/W;->m0:Z

    .line 14
    .line 15
    if-nez p1, :cond_3

    .line 16
    .line 17
    iget-boolean p1, p0, LM2/W;->y:Z

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, LM2/W;->l:Lq2/x;

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    :cond_0
    iget p1, p0, LM2/W;->X:I

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object p1, p0, LM2/W;->p:Lt2/m;

    .line 31
    .line 32
    invoke-virtual {p1}, Lt2/m;->f()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    iget-object v0, p0, LM2/W;->n:LQ2/m;

    .line 37
    .line 38
    invoke-virtual {v0}, LQ2/m;->j()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    invoke-direct {p0}, LM2/W;->j0()V

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x1

    .line 48
    :cond_2
    return p1

    .line 49
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 50
    return p1
.end method

.method public a0(LM2/W$b;JJ)V
    .locals 14

    .line 1
    iget-wide v0, p0, LM2/W;->D:J

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
    const/4 v1, 0x1

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, LM2/W;->C:LU2/J;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-direct {p0, v1}, LM2/W;->P(Z)J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    const-wide/high16 v4, -0x8000000000000000L

    .line 22
    .line 23
    cmp-long v0, v2, v4

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    const-wide/16 v2, 0x0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-wide/16 v4, 0x2710

    .line 31
    .line 32
    add-long/2addr v2, v4

    .line 33
    :goto_0
    iput-wide v2, p0, LM2/W;->D:J

    .line 34
    .line 35
    iget-object v0, p0, LM2/W;->g:LM2/W$c;

    .line 36
    .line 37
    iget-object v4, p0, LM2/W;->C:LU2/J;

    .line 38
    .line 39
    iget-boolean v5, p0, LM2/W;->E:Z

    .line 40
    .line 41
    invoke-interface {v0, v2, v3, v4, v5}, LM2/W$c;->g(JLU2/J;Z)V

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-static {p1}, LM2/W$b;->d(LM2/W$b;)Lw2/D;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v2, LM2/y;

    .line 49
    .line 50
    invoke-static {p1}, LM2/W$b;->e(LM2/W$b;)J

    .line 51
    .line 52
    .line 53
    move-result-wide v3

    .line 54
    invoke-static {p1}, LM2/W$b;->f(LM2/W$b;)Lw2/o;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-virtual {v0}, Lw2/D;->q()Landroid/net/Uri;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-virtual {v0}, Lw2/D;->r()Ljava/util/Map;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-virtual {v0}, Lw2/D;->p()J

    .line 67
    .line 68
    .line 69
    move-result-wide v12

    .line 70
    move-wide/from16 v8, p2

    .line 71
    .line 72
    move-wide/from16 v10, p4

    .line 73
    .line 74
    invoke-direct/range {v2 .. v13}, LM2/y;-><init>(JLw2/o;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, LM2/W;->d:LQ2/k;

    .line 78
    .line 79
    invoke-static {p1}, LM2/W$b;->e(LM2/W$b;)J

    .line 80
    .line 81
    .line 82
    move-result-wide v3

    .line 83
    invoke-interface {v0, v3, v4}, LQ2/k;->d(J)V

    .line 84
    .line 85
    .line 86
    move-object v3, v2

    .line 87
    iget-object v2, p0, LM2/W;->e:LM2/L$a;

    .line 88
    .line 89
    invoke-static {p1}, LM2/W$b;->g(LM2/W$b;)J

    .line 90
    .line 91
    .line 92
    move-result-wide v9

    .line 93
    iget-wide v11, p0, LM2/W;->D:J

    .line 94
    .line 95
    const/4 v4, 0x1

    .line 96
    const/4 v5, -0x1

    .line 97
    const/4 v6, 0x0

    .line 98
    const/4 v7, 0x0

    .line 99
    const/4 v8, 0x0

    .line 100
    invoke-virtual/range {v2 .. v12}, LM2/L$a;->p(LM2/y;IILq2/x;ILjava/lang/Object;JJ)V

    .line 101
    .line 102
    .line 103
    iput-boolean v1, p0, LM2/W;->o0:Z

    .line 104
    .line 105
    iget-object p1, p0, LM2/W;->t:LM2/C$a;

    .line 106
    .line 107
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    check-cast p1, LM2/C$a;

    .line 112
    .line 113
    invoke-interface {p1, p0}, LM2/d0$a;->j(LM2/d0;)V

    .line 114
    .line 115
    .line 116
    return-void
.end method

.method public b(Lq2/x;)V
    .locals 1

    .line 1
    iget-object p1, p0, LM2/W;->s:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v0, p0, LM2/W;->q:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b0(LM2/W$b;JJLjava/io/IOException;I)LQ2/m$c;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, LM2/W$b;->d(LM2/W$b;)Lw2/D;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, LM2/y;

    .line 8
    .line 9
    invoke-static/range {p1 .. p1}, LM2/W$b;->e(LM2/W$b;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    invoke-static/range {p1 .. p1}, LM2/W$b;->f(LM2/W$b;)Lw2/o;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    invoke-virtual {v1}, Lw2/D;->q()Landroid/net/Uri;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    invoke-virtual {v1}, Lw2/D;->r()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    invoke-virtual {v1}, Lw2/D;->p()J

    .line 26
    .line 27
    .line 28
    move-result-wide v12

    .line 29
    move-wide/from16 v8, p2

    .line 30
    .line 31
    move-wide/from16 v10, p4

    .line 32
    .line 33
    invoke-direct/range {v2 .. v13}, LM2/y;-><init>(JLw2/o;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 34
    .line 35
    .line 36
    new-instance v3, LM2/B;

    .line 37
    .line 38
    invoke-static/range {p1 .. p1}, LM2/W$b;->g(LM2/W$b;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v4

    .line 42
    invoke-static {v4, v5}, Lt2/a0;->F1(J)J

    .line 43
    .line 44
    .line 45
    move-result-wide v9

    .line 46
    iget-wide v4, v0, LM2/W;->D:J

    .line 47
    .line 48
    invoke-static {v4, v5}, Lt2/a0;->F1(J)J

    .line 49
    .line 50
    .line 51
    move-result-wide v11

    .line 52
    const/4 v4, 0x1

    .line 53
    const/4 v5, -0x1

    .line 54
    const/4 v6, 0x0

    .line 55
    const/4 v7, 0x0

    .line 56
    const/4 v8, 0x0

    .line 57
    invoke-direct/range {v3 .. v12}, LM2/B;-><init>(IILq2/x;ILjava/lang/Object;JJ)V

    .line 58
    .line 59
    .line 60
    iget-object v1, v0, LM2/W;->d:LQ2/k;

    .line 61
    .line 62
    new-instance v4, LQ2/k$c;

    .line 63
    .line 64
    move-object/from16 v13, p6

    .line 65
    .line 66
    move/from16 v5, p7

    .line 67
    .line 68
    invoke-direct {v4, v2, v3, v13, v5}, LQ2/k$c;-><init>(LM2/y;LM2/B;Ljava/io/IOException;I)V

    .line 69
    .line 70
    .line 71
    invoke-interface {v1, v4}, LQ2/k;->c(LQ2/k$c;)J

    .line 72
    .line 73
    .line 74
    move-result-wide v3

    .line 75
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    cmp-long v1, v3, v5

    .line 81
    .line 82
    if-nez v1, :cond_0

    .line 83
    .line 84
    sget-object v1, LQ2/m;->g:LQ2/m$c;

    .line 85
    .line 86
    move-object/from16 v15, p1

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_0
    invoke-direct {v0}, LM2/W;->O()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    iget v5, v0, LM2/W;->n0:I

    .line 94
    .line 95
    if-le v1, v5, :cond_1

    .line 96
    .line 97
    const/4 v5, 0x1

    .line 98
    :goto_0
    move-object/from16 v15, p1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_1
    const/4 v5, 0x0

    .line 102
    goto :goto_0

    .line 103
    :goto_1
    invoke-direct {v0, v15, v1}, LM2/W;->M(LM2/W$b;I)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_2

    .line 108
    .line 109
    invoke-static {v5, v3, v4}, LQ2/m;->h(ZJ)LQ2/m$c;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    goto :goto_2

    .line 114
    :cond_2
    sget-object v1, LQ2/m;->f:LQ2/m$c;

    .line 115
    .line 116
    :goto_2
    invoke-virtual {v1}, LQ2/m$c;->c()Z

    .line 117
    .line 118
    .line 119
    move-result v16

    .line 120
    xor-int/lit8 v14, v16, 0x1

    .line 121
    .line 122
    move-object v3, v2

    .line 123
    iget-object v2, v0, LM2/W;->e:LM2/L$a;

    .line 124
    .line 125
    invoke-static {v15}, LM2/W$b;->g(LM2/W$b;)J

    .line 126
    .line 127
    .line 128
    move-result-wide v9

    .line 129
    iget-wide v11, v0, LM2/W;->D:J

    .line 130
    .line 131
    const/4 v4, 0x1

    .line 132
    const/4 v5, -0x1

    .line 133
    const/4 v6, 0x0

    .line 134
    const/4 v7, 0x0

    .line 135
    const/4 v8, 0x0

    .line 136
    invoke-virtual/range {v2 .. v14}, LM2/L$a;->r(LM2/y;IILq2/x;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    .line 137
    .line 138
    .line 139
    if-nez v16, :cond_3

    .line 140
    .line 141
    iget-object v2, v0, LM2/W;->d:LQ2/k;

    .line 142
    .line 143
    invoke-static {v15}, LM2/W$b;->e(LM2/W$b;)J

    .line 144
    .line 145
    .line 146
    move-result-wide v3

    .line 147
    invoke-interface {v2, v3, v4}, LQ2/k;->d(J)V

    .line 148
    .line 149
    .line 150
    :cond_3
    return-object v1
.end method

.method public c()J
    .locals 2

    .line 1
    invoke-virtual {p0}, LM2/W;->f()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public c0(LM2/W$b;JJI)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, LM2/W$b;->d(LM2/W$b;)Lw2/D;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez p6, :cond_0

    .line 8
    .line 9
    new-instance v2, LM2/y;

    .line 10
    .line 11
    invoke-static/range {p1 .. p1}, LM2/W$b;->e(LM2/W$b;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v3

    .line 15
    invoke-static/range {p1 .. p1}, LM2/W$b;->f(LM2/W$b;)Lw2/o;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    move-wide/from16 v6, p2

    .line 20
    .line 21
    invoke-direct/range {v2 .. v7}, LM2/y;-><init>(JLw2/o;J)V

    .line 22
    .line 23
    .line 24
    move-object v5, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, LM2/y;

    .line 27
    .line 28
    invoke-static/range {p1 .. p1}, LM2/W$b;->e(LM2/W$b;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    invoke-static/range {p1 .. p1}, LM2/W$b;->f(LM2/W$b;)Lw2/o;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-virtual {v1}, Lw2/D;->q()Landroid/net/Uri;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    invoke-virtual {v1}, Lw2/D;->r()Ljava/util/Map;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    invoke-virtual {v1}, Lw2/D;->p()J

    .line 45
    .line 46
    .line 47
    move-result-wide v13

    .line 48
    move-wide/from16 v9, p2

    .line 49
    .line 50
    move-wide/from16 v11, p4

    .line 51
    .line 52
    invoke-direct/range {v3 .. v14}, LM2/y;-><init>(JLw2/o;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 53
    .line 54
    .line 55
    move-object v5, v3

    .line 56
    :goto_0
    iget-object v4, v0, LM2/W;->e:LM2/L$a;

    .line 57
    .line 58
    invoke-static/range {p1 .. p1}, LM2/W$b;->g(LM2/W$b;)J

    .line 59
    .line 60
    .line 61
    move-result-wide v11

    .line 62
    iget-wide v13, v0, LM2/W;->D:J

    .line 63
    .line 64
    const/4 v6, 0x1

    .line 65
    const/4 v7, -0x1

    .line 66
    const/4 v8, 0x0

    .line 67
    const/4 v9, 0x0

    .line 68
    const/4 v10, 0x0

    .line 69
    move/from16 v15, p6

    .line 70
    .line 71
    invoke-virtual/range {v4 .. v15}, LM2/L$a;->v(LM2/y;IILq2/x;ILjava/lang/Object;JJI)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public d(JLA2/Q;)J
    .locals 9

    .line 1
    invoke-direct {p0}, LM2/W;->L()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LM2/W;->C:LU2/J;

    .line 5
    .line 6
    invoke-interface {v0}, LU2/J;->k()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-wide/16 p1, 0x0

    .line 13
    .line 14
    return-wide p1

    .line 15
    :cond_0
    iget-object v0, p0, LM2/W;->C:LU2/J;

    .line 16
    .line 17
    invoke-interface {v0, p1, p2}, LU2/J;->g(J)LU2/J$a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, v0, LU2/J$a;->a:LU2/K;

    .line 22
    .line 23
    iget-wide v5, v1, LU2/K;->a:J

    .line 24
    .line 25
    iget-object v0, v0, LU2/J$a;->b:LU2/K;

    .line 26
    .line 27
    iget-wide v7, v0, LU2/K;->a:J

    .line 28
    .line 29
    move-wide v3, p1

    .line 30
    move-object v2, p3

    .line 31
    invoke-virtual/range {v2 .. v8}, LA2/Q;->a(JJJ)J

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    return-wide p1
.end method

.method public e(II)LU2/O;
    .locals 1

    .line 1
    new-instance p2, LM2/W$e;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p2, p1, v0}, LM2/W$e;-><init>(IZ)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p2}, LM2/W;->d0(LM2/W$e;)LU2/O;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method e0(ILA2/J;Lz2/f;I)I
    .locals 3

    .line 1
    invoke-direct {p0}, LM2/W;->k0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x3

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-direct {p0, p1}, LM2/W;->U(I)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LM2/W;->v:[LM2/b0;

    .line 13
    .line 14
    aget-object v0, v0, p1

    .line 15
    .line 16
    iget-boolean v2, p0, LM2/W;->o0:Z

    .line 17
    .line 18
    invoke-virtual {v0, p2, p3, p4, v2}, LM2/b0;->U(LA2/J;Lz2/f;IZ)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-ne p2, v1, :cond_1

    .line 23
    .line 24
    invoke-direct {p0, p1}, LM2/W;->V(I)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return p2
.end method

.method public f()J
    .locals 11

    .line 1
    invoke-direct {p0}, LM2/W;->L()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, LM2/W;->o0:Z

    .line 5
    .line 6
    const-wide/high16 v1, -0x8000000000000000L

    .line 7
    .line 8
    if-nez v0, :cond_7

    .line 9
    .line 10
    iget v0, p0, LM2/W;->X:I

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-direct {p0}, LM2/W;->R()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-wide v0, p0, LM2/W;->l0:J

    .line 22
    .line 23
    return-wide v0

    .line 24
    :cond_1
    iget-boolean v0, p0, LM2/W;->z:Z

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const-wide v4, 0x7fffffffffffffffL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    iget-object v0, p0, LM2/W;->v:[LM2/b0;

    .line 35
    .line 36
    array-length v0, v0

    .line 37
    move v6, v3

    .line 38
    move-wide v7, v4

    .line 39
    :goto_0
    if-ge v6, v0, :cond_4

    .line 40
    .line 41
    iget-object v9, p0, LM2/W;->B:LM2/W$f;

    .line 42
    .line 43
    iget-object v10, v9, LM2/W$f;->b:[Z

    .line 44
    .line 45
    aget-boolean v10, v10, v6

    .line 46
    .line 47
    if-eqz v10, :cond_2

    .line 48
    .line 49
    iget-object v9, v9, LM2/W$f;->c:[Z

    .line 50
    .line 51
    aget-boolean v9, v9, v6

    .line 52
    .line 53
    if-eqz v9, :cond_2

    .line 54
    .line 55
    iget-object v9, p0, LM2/W;->v:[LM2/b0;

    .line 56
    .line 57
    aget-object v9, v9, v6

    .line 58
    .line 59
    invoke-virtual {v9}, LM2/b0;->M()Z

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    if-nez v9, :cond_2

    .line 64
    .line 65
    iget-object v9, p0, LM2/W;->v:[LM2/b0;

    .line 66
    .line 67
    aget-object v9, v9, v6

    .line 68
    .line 69
    invoke-virtual {v9}, LM2/b0;->C()J

    .line 70
    .line 71
    .line 72
    move-result-wide v9

    .line 73
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 74
    .line 75
    .line 76
    move-result-wide v7

    .line 77
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    move-wide v7, v4

    .line 81
    :cond_4
    cmp-long v0, v7, v4

    .line 82
    .line 83
    if-nez v0, :cond_5

    .line 84
    .line 85
    invoke-direct {p0, v3}, LM2/W;->P(Z)J

    .line 86
    .line 87
    .line 88
    move-result-wide v7

    .line 89
    :cond_5
    cmp-long v0, v7, v1

    .line 90
    .line 91
    if-nez v0, :cond_6

    .line 92
    .line 93
    iget-wide v0, p0, LM2/W;->Z:J

    .line 94
    .line 95
    return-wide v0

    .line 96
    :cond_6
    return-wide v7

    .line 97
    :cond_7
    :goto_1
    return-wide v1
.end method

.method public f0()V
    .locals 4

    .line 1
    iget-boolean v0, p0, LM2/W;->y:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LM2/W;->v:[LM2/b0;

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    invoke-virtual {v3}, LM2/b0;->T()V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, LM2/W;->n:LQ2/m;

    .line 20
    .line 21
    invoke-virtual {v0, p0}, LQ2/m;->m(LQ2/m$f;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, LM2/W;->s:Landroid/os/Handler;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, LM2/W;->t:LM2/C$a;

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    iput-boolean v0, p0, LM2/W;->p0:Z

    .line 34
    .line 35
    return-void
.end method

.method public g(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic h(LQ2/m$e;JJZ)V
    .locals 0

    .line 1
    check-cast p1, LM2/W$b;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p6}, LM2/W;->Z(LM2/W$b;JJZ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public i(J)J
    .locals 5

    .line 1
    invoke-direct {p0}, LM2/W;->L()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LM2/W;->B:LM2/W$f;

    .line 5
    .line 6
    iget-object v0, v0, LM2/W$f;->b:[Z

    .line 7
    .line 8
    iget-object v1, p0, LM2/W;->C:LU2/J;

    .line 9
    .line 10
    invoke-interface {v1}, LU2/J;->k()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-wide/16 p1, 0x0

    .line 18
    .line 19
    :goto_0
    const/4 v1, 0x0

    .line 20
    iput-boolean v1, p0, LM2/W;->H:Z

    .line 21
    .line 22
    iget-wide v2, p0, LM2/W;->Z:J

    .line 23
    .line 24
    cmp-long v2, v2, p1

    .line 25
    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v2, v1

    .line 31
    :goto_1
    iput-wide p1, p0, LM2/W;->Z:J

    .line 32
    .line 33
    invoke-direct {p0}, LM2/W;->R()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    iput-wide p1, p0, LM2/W;->l0:J

    .line 40
    .line 41
    return-wide p1

    .line 42
    :cond_2
    iget v3, p0, LM2/W;->F:I

    .line 43
    .line 44
    const/4 v4, 0x7

    .line 45
    if-eq v3, v4, :cond_4

    .line 46
    .line 47
    iget-boolean v3, p0, LM2/W;->o0:Z

    .line 48
    .line 49
    if-nez v3, :cond_3

    .line 50
    .line 51
    iget-object v3, p0, LM2/W;->n:LQ2/m;

    .line 52
    .line 53
    invoke-virtual {v3}, LQ2/m;->j()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_4

    .line 58
    .line 59
    :cond_3
    invoke-direct {p0, v0, p1, p2, v2}, LM2/W;->g0([ZJZ)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    goto :goto_4

    .line 66
    :cond_4
    iput-boolean v1, p0, LM2/W;->m0:Z

    .line 67
    .line 68
    iput-wide p1, p0, LM2/W;->l0:J

    .line 69
    .line 70
    iput-boolean v1, p0, LM2/W;->o0:Z

    .line 71
    .line 72
    iput-boolean v1, p0, LM2/W;->I:Z

    .line 73
    .line 74
    iget-object v0, p0, LM2/W;->n:LQ2/m;

    .line 75
    .line 76
    invoke-virtual {v0}, LQ2/m;->j()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_6

    .line 81
    .line 82
    iget-object v0, p0, LM2/W;->v:[LM2/b0;

    .line 83
    .line 84
    array-length v2, v0

    .line 85
    :goto_2
    if-ge v1, v2, :cond_5

    .line 86
    .line 87
    aget-object v3, v0, v1

    .line 88
    .line 89
    invoke-virtual {v3}, LM2/b0;->s()V

    .line 90
    .line 91
    .line 92
    add-int/lit8 v1, v1, 0x1

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_5
    iget-object v0, p0, LM2/W;->n:LQ2/m;

    .line 96
    .line 97
    invoke-virtual {v0}, LQ2/m;->f()V

    .line 98
    .line 99
    .line 100
    return-wide p1

    .line 101
    :cond_6
    iget-object v0, p0, LM2/W;->n:LQ2/m;

    .line 102
    .line 103
    invoke-virtual {v0}, LQ2/m;->g()V

    .line 104
    .line 105
    .line 106
    iget-object v0, p0, LM2/W;->v:[LM2/b0;

    .line 107
    .line 108
    array-length v2, v0

    .line 109
    :goto_3
    if-ge v1, v2, :cond_7

    .line 110
    .line 111
    aget-object v3, v0, v1

    .line 112
    .line 113
    invoke-virtual {v3}, LM2/b0;->X()V

    .line 114
    .line 115
    .line 116
    add-int/lit8 v1, v1, 0x1

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_7
    :goto_4
    return-wide p1
.end method

.method i0(IJ)I
    .locals 2

    .line 1
    invoke-direct {p0}, LM2/W;->k0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-direct {p0, p1}, LM2/W;->U(I)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LM2/W;->v:[LM2/b0;

    .line 13
    .line 14
    aget-object v0, v0, p1

    .line 15
    .line 16
    iget-boolean v1, p0, LM2/W;->o0:Z

    .line 17
    .line 18
    invoke-virtual {v0, p2, p3, v1}, LM2/b0;->H(JZ)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-virtual {v0, p2}, LM2/b0;->g0(I)V

    .line 23
    .line 24
    .line 25
    if-nez p2, :cond_1

    .line 26
    .line 27
    invoke-direct {p0, p1}, LM2/W;->V(I)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return p2
.end method

.method public bridge synthetic j(LQ2/m$e;JJ)V
    .locals 0

    .line 1
    check-cast p1, LM2/W$b;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, LM2/W;->a0(LM2/W$b;JJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k()J
    .locals 3

    .line 1
    iget-boolean v0, p0, LM2/W;->I:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, LM2/W;->I:Z

    .line 7
    .line 8
    iget-wide v0, p0, LM2/W;->Z:J

    .line 9
    .line 10
    return-wide v0

    .line 11
    :cond_0
    iget-boolean v0, p0, LM2/W;->H:Z

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    iget-boolean v0, p0, LM2/W;->o0:Z

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-direct {p0}, LM2/W;->O()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget v2, p0, LM2/W;->n0:I

    .line 24
    .line 25
    if-le v0, v2, :cond_2

    .line 26
    .line 27
    :cond_1
    iput-boolean v1, p0, LM2/W;->H:Z

    .line 28
    .line 29
    iget-wide v0, p0, LM2/W;->Z:J

    .line 30
    .line 31
    return-wide v0

    .line 32
    :cond_2
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    return-wide v0
.end method

.method public l(LM2/C$a;J)V
    .locals 5

    .line 1
    iput-object p1, p0, LM2/W;->t:LM2/C$a;

    .line 2
    .line 3
    iget-object p1, p0, LM2/W;->l:Lq2/x;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget p1, p0, LM2/W;->k:I

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    invoke-virtual {p0, p1, v0}, LM2/W;->e(II)LU2/O;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v0, p0, LM2/W;->l:Lq2/x;

    .line 15
    .line 16
    invoke-interface {p1, v0}, LU2/O;->c(Lq2/x;)V

    .line 17
    .line 18
    .line 19
    new-instance p1, LU2/E;

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    new-array v1, v0, [J

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    const-wide/16 v3, 0x0

    .line 26
    .line 27
    aput-wide v3, v1, v2

    .line 28
    .line 29
    new-array v0, v0, [J

    .line 30
    .line 31
    aput-wide v3, v0, v2

    .line 32
    .line 33
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    invoke-direct {p1, v1, v0, v2, v3}, LU2/E;-><init>([J[JJ)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0, p1}, LM2/W;->h0(LU2/J;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, LM2/W;->p()V

    .line 45
    .line 46
    .line 47
    iput-wide p2, p0, LM2/W;->l0:J

    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    iget-object p1, p0, LM2/W;->p:Lt2/m;

    .line 51
    .line 52
    invoke-virtual {p1}, Lt2/m;->f()Z

    .line 53
    .line 54
    .line 55
    invoke-direct {p0}, LM2/W;->j0()V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public m()V
    .locals 4

    .line 1
    iget-object v0, p0, LM2/W;->v:[LM2/b0;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3}, LM2/b0;->V()V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, LM2/W;->o:LM2/Q;

    .line 16
    .line 17
    invoke-interface {v0}, LM2/Q;->a()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public bridge synthetic n(LQ2/m$e;JJLjava/io/IOException;I)LQ2/m$c;
    .locals 0

    .line 1
    check-cast p1, LM2/W$b;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p7}, LM2/W;->b0(LM2/W$b;JJLjava/io/IOException;I)LQ2/m$c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public o()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LM2/W;->W()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, LM2/W;->o0:Z

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-boolean v0, p0, LM2/W;->y:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string v0, "Loading finished before preparation is complete."

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static {v0, v1}, Lq2/L;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lq2/L;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    throw v0

    .line 21
    :cond_1
    :goto_0
    return-void
.end method

.method public p()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LM2/W;->x:Z

    .line 3
    .line 4
    iget-object v0, p0, LM2/W;->s:Landroid/os/Handler;

    .line 5
    .line 6
    iget-object v1, p0, LM2/W;->q:Ljava/lang/Runnable;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public q()Z
    .locals 1

    .line 1
    iget-object v0, p0, LM2/W;->n:LQ2/m;

    .line 2
    .line 3
    invoke-virtual {v0}, LQ2/m;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LM2/W;->p:Lt2/m;

    .line 10
    .line 11
    invoke-virtual {v0}, Lt2/m;->e()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public r([LP2/A;[Z[LM2/c0;[ZJ)J
    .locals 8

    .line 1
    invoke-direct {p0}, LM2/W;->L()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LM2/W;->B:LM2/W$f;

    .line 5
    .line 6
    iget-object v1, v0, LM2/W$f;->a:LM2/n0;

    .line 7
    .line 8
    iget-object v0, v0, LM2/W$f;->c:[Z

    .line 9
    .line 10
    iget v2, p0, LM2/W;->X:I

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    move v4, v3

    .line 14
    :goto_0
    array-length v5, p1

    .line 15
    const/4 v6, 0x1

    .line 16
    if-ge v4, v5, :cond_2

    .line 17
    .line 18
    aget-object v5, p3, v4

    .line 19
    .line 20
    if-eqz v5, :cond_1

    .line 21
    .line 22
    aget-object v7, p1, v4

    .line 23
    .line 24
    if-eqz v7, :cond_0

    .line 25
    .line 26
    aget-boolean v7, p2, v4

    .line 27
    .line 28
    if-nez v7, :cond_1

    .line 29
    .line 30
    :cond_0
    check-cast v5, LM2/W$d;

    .line 31
    .line 32
    invoke-static {v5}, LM2/W$d;->a(LM2/W$d;)I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    aget-boolean v7, v0, v5

    .line 37
    .line 38
    invoke-static {v7}, Lt2/a;->g(Z)V

    .line 39
    .line 40
    .line 41
    iget v7, p0, LM2/W;->X:I

    .line 42
    .line 43
    sub-int/2addr v7, v6

    .line 44
    iput v7, p0, LM2/W;->X:I

    .line 45
    .line 46
    aput-boolean v3, v0, v5

    .line 47
    .line 48
    const/4 v5, 0x0

    .line 49
    aput-object v5, p3, v4

    .line 50
    .line 51
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    iget-boolean p2, p0, LM2/W;->G:Z

    .line 55
    .line 56
    if-eqz p2, :cond_4

    .line 57
    .line 58
    if-nez v2, :cond_3

    .line 59
    .line 60
    :goto_1
    move p2, v6

    .line 61
    goto :goto_2

    .line 62
    :cond_3
    move p2, v3

    .line 63
    goto :goto_2

    .line 64
    :cond_4
    const-wide/16 v4, 0x0

    .line 65
    .line 66
    cmp-long p2, p5, v4

    .line 67
    .line 68
    if-eqz p2, :cond_3

    .line 69
    .line 70
    iget-boolean p2, p0, LM2/W;->A:Z

    .line 71
    .line 72
    if-nez p2, :cond_3

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :goto_2
    move v2, v3

    .line 76
    :goto_3
    array-length v4, p1

    .line 77
    if-ge v2, v4, :cond_9

    .line 78
    .line 79
    aget-object v4, p3, v2

    .line 80
    .line 81
    if-nez v4, :cond_8

    .line 82
    .line 83
    aget-object v4, p1, v2

    .line 84
    .line 85
    if-eqz v4, :cond_8

    .line 86
    .line 87
    invoke-interface {v4}, LP2/E;->length()I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-ne v5, v6, :cond_5

    .line 92
    .line 93
    move v5, v6

    .line 94
    goto :goto_4

    .line 95
    :cond_5
    move v5, v3

    .line 96
    :goto_4
    invoke-static {v5}, Lt2/a;->g(Z)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v4, v3}, LP2/E;->f(I)I

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    if-nez v5, :cond_6

    .line 104
    .line 105
    move v5, v6

    .line 106
    goto :goto_5

    .line 107
    :cond_6
    move v5, v3

    .line 108
    :goto_5
    invoke-static {v5}, Lt2/a;->g(Z)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v4}, LP2/E;->m()Lq2/a0;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    invoke-virtual {v1, v5}, LM2/n0;->d(Lq2/a0;)I

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    aget-boolean v7, v0, v5

    .line 120
    .line 121
    xor-int/2addr v7, v6

    .line 122
    invoke-static {v7}, Lt2/a;->g(Z)V

    .line 123
    .line 124
    .line 125
    iget v7, p0, LM2/W;->X:I

    .line 126
    .line 127
    add-int/2addr v7, v6

    .line 128
    iput v7, p0, LM2/W;->X:I

    .line 129
    .line 130
    aput-boolean v6, v0, v5

    .line 131
    .line 132
    iget-boolean v7, p0, LM2/W;->I:Z

    .line 133
    .line 134
    invoke-interface {v4}, LP2/A;->q()Lq2/x;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    iget-boolean v4, v4, Lq2/x;->u:Z

    .line 139
    .line 140
    or-int/2addr v4, v7

    .line 141
    iput-boolean v4, p0, LM2/W;->I:Z

    .line 142
    .line 143
    new-instance v4, LM2/W$d;

    .line 144
    .line 145
    invoke-direct {v4, p0, v5}, LM2/W$d;-><init>(LM2/W;I)V

    .line 146
    .line 147
    .line 148
    aput-object v4, p3, v2

    .line 149
    .line 150
    aput-boolean v6, p4, v2

    .line 151
    .line 152
    if-nez p2, :cond_8

    .line 153
    .line 154
    iget-object p2, p0, LM2/W;->v:[LM2/b0;

    .line 155
    .line 156
    aget-object p2, p2, v5

    .line 157
    .line 158
    invoke-virtual {p2}, LM2/b0;->F()I

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    if-eqz v4, :cond_7

    .line 163
    .line 164
    invoke-virtual {p2, p5, p6, v6}, LM2/b0;->b0(JZ)Z

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    if-nez p2, :cond_7

    .line 169
    .line 170
    move p2, v6

    .line 171
    goto :goto_6

    .line 172
    :cond_7
    move p2, v3

    .line 173
    :cond_8
    :goto_6
    add-int/lit8 v2, v2, 0x1

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_9
    iget p1, p0, LM2/W;->X:I

    .line 177
    .line 178
    if-nez p1, :cond_c

    .line 179
    .line 180
    iput-boolean v3, p0, LM2/W;->m0:Z

    .line 181
    .line 182
    iput-boolean v3, p0, LM2/W;->H:Z

    .line 183
    .line 184
    iput-boolean v3, p0, LM2/W;->I:Z

    .line 185
    .line 186
    iget-object p1, p0, LM2/W;->n:LQ2/m;

    .line 187
    .line 188
    invoke-virtual {p1}, LQ2/m;->j()Z

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    if-eqz p1, :cond_b

    .line 193
    .line 194
    iget-object p1, p0, LM2/W;->v:[LM2/b0;

    .line 195
    .line 196
    array-length p2, p1

    .line 197
    :goto_7
    if-ge v3, p2, :cond_a

    .line 198
    .line 199
    aget-object p3, p1, v3

    .line 200
    .line 201
    invoke-virtual {p3}, LM2/b0;->s()V

    .line 202
    .line 203
    .line 204
    add-int/lit8 v3, v3, 0x1

    .line 205
    .line 206
    goto :goto_7

    .line 207
    :cond_a
    iget-object p1, p0, LM2/W;->n:LQ2/m;

    .line 208
    .line 209
    invoke-virtual {p1}, LQ2/m;->f()V

    .line 210
    .line 211
    .line 212
    goto :goto_a

    .line 213
    :cond_b
    iput-boolean v3, p0, LM2/W;->o0:Z

    .line 214
    .line 215
    iget-object p1, p0, LM2/W;->v:[LM2/b0;

    .line 216
    .line 217
    array-length p2, p1

    .line 218
    :goto_8
    if-ge v3, p2, :cond_e

    .line 219
    .line 220
    aget-object p3, p1, v3

    .line 221
    .line 222
    invoke-virtual {p3}, LM2/b0;->X()V

    .line 223
    .line 224
    .line 225
    add-int/lit8 v3, v3, 0x1

    .line 226
    .line 227
    goto :goto_8

    .line 228
    :cond_c
    if-eqz p2, :cond_e

    .line 229
    .line 230
    invoke-virtual {p0, p5, p6}, LM2/W;->i(J)J

    .line 231
    .line 232
    .line 233
    move-result-wide p5

    .line 234
    :goto_9
    array-length p1, p3

    .line 235
    if-ge v3, p1, :cond_e

    .line 236
    .line 237
    aget-object p1, p3, v3

    .line 238
    .line 239
    if-eqz p1, :cond_d

    .line 240
    .line 241
    aput-boolean v6, p4, v3

    .line 242
    .line 243
    :cond_d
    add-int/lit8 v3, v3, 0x1

    .line 244
    .line 245
    goto :goto_9

    .line 246
    :cond_e
    :goto_a
    iput-boolean v6, p0, LM2/W;->G:Z

    .line 247
    .line 248
    return-wide p5
.end method

.method public s()LM2/n0;
    .locals 1

    .line 1
    invoke-direct {p0}, LM2/W;->L()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LM2/W;->B:LM2/W$f;

    .line 5
    .line 6
    iget-object v0, v0, LM2/W$f;->a:LM2/n0;

    .line 7
    .line 8
    return-object v0
.end method

.method public t(LU2/J;)V
    .locals 2

    .line 1
    iget-object v0, p0, LM2/W;->s:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v1, LM2/V;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, LM2/V;-><init>(LM2/W;LU2/J;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public u(JZ)V
    .locals 5

    .line 1
    iget-boolean v0, p0, LM2/W;->A:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    invoke-direct {p0}, LM2/W;->L()V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, LM2/W;->R()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    iget-object v0, p0, LM2/W;->B:LM2/W$f;

    .line 17
    .line 18
    iget-object v0, v0, LM2/W$f;->c:[Z

    .line 19
    .line 20
    iget-object v1, p0, LM2/W;->v:[LM2/b0;

    .line 21
    .line 22
    array-length v1, v1

    .line 23
    const/4 v2, 0x0

    .line 24
    :goto_0
    if-ge v2, v1, :cond_2

    .line 25
    .line 26
    iget-object v3, p0, LM2/W;->v:[LM2/b0;

    .line 27
    .line 28
    aget-object v3, v3, v2

    .line 29
    .line 30
    aget-boolean v4, v0, v2

    .line 31
    .line 32
    invoke-virtual {v3, p1, p2, p3, v4}, LM2/b0;->r(JZZ)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    :goto_1
    return-void
.end method

.method public bridge synthetic v(LQ2/m$e;JJI)V
    .locals 0

    .line 1
    check-cast p1, LM2/W$b;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p6}, LM2/W;->c0(LM2/W$b;JJI)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
