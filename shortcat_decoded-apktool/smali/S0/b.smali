.class public final LS0/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lt/o;

.field private final b:LS0/a;

.field private final c:LS0/d;

.field private final d:Lt/L;

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:Ljava/lang/Object;

.field private i:J

.field private final j:Lie/a;

.field private final k:Lr0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lt/o;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LS0/b;->a:Lt/o;

    .line 5
    .line 6
    new-instance p1, LS0/a;

    .line 7
    .line 8
    invoke-direct {p1}, LS0/a;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, LS0/b;->b:LS0/a;

    .line 12
    .line 13
    new-instance p1, LS0/d;

    .line 14
    .line 15
    invoke-direct {p1}, LS0/d;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, LS0/b;->c:LS0/d;

    .line 19
    .line 20
    new-instance p1, Lt/L;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    const/4 v1, 0x0

    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-direct {p1, v2, v0, v1}, Lt/L;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, LS0/b;->d:Lt/L;

    .line 29
    .line 30
    const-wide/16 v0, -0x1

    .line 31
    .line 32
    iput-wide v0, p0, LS0/b;->i:J

    .line 33
    .line 34
    new-instance p1, LS0/b$a;

    .line 35
    .line 36
    invoke-direct {p1, p0}, LS0/b$a;-><init>(LS0/b;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, LS0/b;->j:Lie/a;

    .line 40
    .line 41
    new-instance p1, Lr0/d;

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-direct {p1, v0, v0, v0, v0}, Lr0/d;-><init>(FFFF)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, LS0/b;->k:Lr0/d;

    .line 48
    .line 49
    return-void
.end method

.method public static final synthetic a(LS0/b;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, LS0/b;->h:Ljava/lang/Object;

    .line 2
    .line 3
    return-void
.end method

.method private final b(LK0/e0;Lr0/d;)V
    .locals 8

    .line 1
    :cond_0
    :goto_0
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, LK0/e0;->H2()LK0/o0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1}, LK0/e0;->P1()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-static {v1, v2}, Li1/n;->k(J)I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    int-to-float v3, v3

    .line 16
    invoke-static {v1, v2}, Li1/n;->l(J)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    int-to-float v1, v1

    .line 21
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    int-to-long v2, v2

    .line 26
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    int-to-long v4, v1

    .line 31
    const/16 v1, 0x20

    .line 32
    .line 33
    shl-long v1, v2, v1

    .line 34
    .line 35
    const-wide v6, 0xffffffffL

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    and-long v3, v4, v6

    .line 41
    .line 42
    or-long/2addr v1, v3

    .line 43
    invoke-static {v1, v2}, Lr0/f;->e(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide v1

    .line 47
    invoke-virtual {p2, v1, v2}, Lr0/d;->m(J)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, LK0/e0;->P2()LK0/e0;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    invoke-interface {v0}, LK0/o0;->b()[F

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, Ls0/h1;->a([F)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_0

    .line 65
    .line 66
    invoke-static {v0, p2}, Ls0/g1;->g([FLr0/d;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    return-void
.end method

.method private final e(LK0/J;ZIIII)V
    .locals 9

    .line 1
    invoke-virtual {p1}, LK0/J;->y()I

    .line 2
    .line 3
    .line 4
    move-result v1

    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LS0/b;->b:LS0/a;

    .line 8
    .line 9
    move v2, p3

    .line 10
    move v3, p4

    .line 11
    move v4, p5

    .line 12
    move v5, p6

    .line 13
    invoke-virtual/range {v0 .. v5}, LS0/a;->f(IIIII)Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-nez p2, :cond_2

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v2, p3

    .line 21
    move v3, p4

    .line 22
    move v4, p5

    .line 23
    move v5, p6

    .line 24
    :goto_0
    invoke-virtual {p1}, LK0/J;->A0()LK0/J;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    invoke-virtual {p2}, LK0/J;->y()I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    :goto_1
    move v6, p2

    .line 35
    goto :goto_2

    .line 36
    :cond_1
    const/4 p2, -0x1

    .line 37
    goto :goto_1

    .line 38
    :goto_2
    iget-object v0, p0, LS0/b;->b:LS0/a;

    .line 39
    .line 40
    invoke-virtual {p1}, LK0/J;->t0()LK0/c0;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    const/16 p3, 0x400

    .line 45
    .line 46
    invoke-static {p3}, LK0/g0;->a(I)I

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    invoke-virtual {p2, p3}, LK0/c0;->q(I)Z

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    invoke-virtual {p1}, LK0/J;->t0()LK0/c0;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const/16 p2, 0x10

    .line 59
    .line 60
    invoke-static {p2}, LK0/g0;->a(I)I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    invoke-virtual {p1, p2}, LK0/c0;->q(I)Z

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    invoke-virtual/range {v0 .. v8}, LS0/a;->d(IIIIIIZZ)V

    .line 69
    .line 70
    .line 71
    :cond_2
    invoke-virtual {p0}, LS0/b;->h()V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method private final f(LK0/J;Z)V
    .locals 13

    .line 1
    invoke-virtual {p1}, LK0/J;->w0()LK0/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, LK0/J;->l0()LK0/X;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, LK0/X;->S0()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {v1}, LK0/X;->Q0()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget-object v3, p0, LS0/b;->k:Lr0/d;

    .line 18
    .line 19
    int-to-float v2, v2

    .line 20
    int-to-float v1, v1

    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-virtual {v3, v4, v4, v2, v1}, Lr0/d;->g(FFFF)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, v0, v3}, LS0/b;->b(LK0/e0;Lr0/d;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3}, Lr0/d;->b()F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    float-to-int v6, v0

    .line 33
    invoke-virtual {v3}, Lr0/d;->d()F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    float-to-int v7, v0

    .line 38
    invoke-virtual {v3}, Lr0/d;->c()F

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    float-to-int v8, v0

    .line 43
    invoke-virtual {v3}, Lr0/d;->a()F

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    float-to-int v9, v0

    .line 48
    invoke-virtual {p1}, LK0/J;->y()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-nez p2, :cond_0

    .line 53
    .line 54
    iget-object v4, p0, LS0/b;->b:LS0/a;

    .line 55
    .line 56
    invoke-virtual/range {v4 .. v9}, LS0/a;->i(IIIII)Z

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    if-nez p2, :cond_2

    .line 61
    .line 62
    :cond_0
    invoke-virtual {p1}, LK0/J;->A0()LK0/J;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    if-eqz p2, :cond_1

    .line 67
    .line 68
    invoke-virtual {p2}, LK0/J;->y()I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    :goto_0
    move v10, p2

    .line 73
    goto :goto_1

    .line 74
    :cond_1
    const/4 p2, -0x1

    .line 75
    goto :goto_0

    .line 76
    :goto_1
    iget-object v4, p0, LS0/b;->b:LS0/a;

    .line 77
    .line 78
    invoke-virtual {p1}, LK0/J;->t0()LK0/c0;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    const/16 v0, 0x400

    .line 83
    .line 84
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    invoke-virtual {p2, v0}, LK0/c0;->q(I)Z

    .line 89
    .line 90
    .line 91
    move-result v11

    .line 92
    invoke-virtual {p1}, LK0/J;->t0()LK0/c0;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    const/16 p2, 0x10

    .line 97
    .line 98
    invoke-static {p2}, LK0/g0;->a(I)I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    invoke-virtual {p1, p2}, LK0/c0;->q(I)Z

    .line 103
    .line 104
    .line 105
    move-result v12

    .line 106
    invoke-virtual/range {v4 .. v12}, LS0/a;->d(IIIIIIZZ)V

    .line 107
    .line 108
    .line 109
    :cond_2
    invoke-virtual {p0}, LS0/b;->h()V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method private final g(LK0/J;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, LK0/J;->I0()La0/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, La0/c;->a:[Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {p1}, La0/c;->p()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v1, 0x0

    .line 12
    move v2, v1

    .line 13
    :goto_0
    if-ge v2, p1, :cond_0

    .line 14
    .line 15
    aget-object v3, v0, v2

    .line 16
    .line 17
    check-cast v3, LK0/J;

    .line 18
    .line 19
    invoke-direct {p0, v3, v1}, LS0/b;->f(LK0/J;Z)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v3}, LS0/b;->g(LK0/J;)V

    .line 23
    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method private final l(LK0/J;)J
    .locals 6

    .line 1
    invoke-virtual {p1}, LK0/J;->w0()LK0/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lr0/f;->b:Lr0/f$a;

    .line 6
    .line 7
    invoke-virtual {v1}, Lr0/f$a;->c()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-virtual {p1}, LK0/J;->X()LK0/e0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :cond_0
    :goto_0
    if-eqz p1, :cond_3

    .line 16
    .line 17
    if-eq p1, v0, :cond_3

    .line 18
    .line 19
    invoke-virtual {p1}, LK0/e0;->H2()LK0/o0;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {p1}, LK0/e0;->P1()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    invoke-static {v1, v2, v4, v5}, Li1/o;->c(JJ)J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    invoke-virtual {p1}, LK0/e0;->P2()LK0/e0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    invoke-interface {v3}, LK0/o0;->b()[F

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-static {v3}, LS0/c;->a([F)I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    const/4 v5, 0x3

    .line 46
    if-ne v4, v5, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    and-int/lit8 v4, v4, 0x2

    .line 50
    .line 51
    if-nez v4, :cond_2

    .line 52
    .line 53
    sget-object p1, Li1/n;->b:Li1/n$a;

    .line 54
    .line 55
    invoke-virtual {p1}, Li1/n$a;->a()J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    return-wide v0

    .line 60
    :cond_2
    invoke-static {v3, v1, v2}, Ls0/g1;->f([FJ)J

    .line 61
    .line 62
    .line 63
    move-result-wide v1

    .line 64
    goto :goto_0

    .line 65
    :cond_3
    invoke-static {v1, v2}, Li1/o;->d(J)J

    .line 66
    .line 67
    .line 68
    move-result-wide v0

    .line 69
    return-wide v0
.end method

.method private final m(LK0/J;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, LK0/J;->w0()LK0/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/e0;->P1()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-virtual {p1}, LK0/J;->A0()LK0/J;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eqz v2, :cond_4

    .line 14
    .line 15
    invoke-virtual {v2}, LK0/J;->u0()J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    invoke-static {v3, v4}, LS0/c;->b(J)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    invoke-direct {p0, v2}, LS0/b;->m(LK0/J;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {v2}, LK0/J;->u0()J

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    invoke-static {v3, v4}, LS0/c;->b(J)Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-nez v5, :cond_1

    .line 37
    .line 38
    sget-object v0, Li1/n;->b:Li1/n$a;

    .line 39
    .line 40
    invoke-virtual {v0}, Li1/n$a;->a()J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {v2}, LK0/J;->y0()Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_2

    .line 50
    .line 51
    invoke-direct {p0, v2}, LS0/b;->l(LK0/J;)J

    .line 52
    .line 53
    .line 54
    move-result-wide v5

    .line 55
    invoke-virtual {v2, v5, v6}, LK0/J;->Y1(J)V

    .line 56
    .line 57
    .line 58
    const/4 v7, 0x0

    .line 59
    invoke-virtual {v2, v7}, LK0/J;->Z1(Z)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    invoke-virtual {v2}, LK0/J;->x0()J

    .line 64
    .line 65
    .line 66
    move-result-wide v5

    .line 67
    :goto_0
    invoke-static {v5, v6}, LS0/c;->b(J)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-nez v2, :cond_3

    .line 72
    .line 73
    sget-object v0, Li1/n;->b:Li1/n$a;

    .line 74
    .line 75
    invoke-virtual {v0}, Li1/n$a;->a()J

    .line 76
    .line 77
    .line 78
    move-result-wide v0

    .line 79
    goto :goto_1

    .line 80
    :cond_3
    invoke-static {v3, v4, v5, v6}, Li1/n;->o(JJ)J

    .line 81
    .line 82
    .line 83
    move-result-wide v2

    .line 84
    invoke-static {v2, v3, v0, v1}, Li1/n;->o(JJ)J

    .line 85
    .line 86
    .line 87
    move-result-wide v0

    .line 88
    :cond_4
    :goto_1
    invoke-virtual {p1, v0, v1}, LK0/J;->V1(J)V

    .line 89
    .line 90
    .line 91
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Ll0/c;->b()J

    .line 4
    .line 5
    .line 6
    move-result-wide v7

    .line 7
    iget-boolean v1, v0, LS0/b;->e:Z

    .line 8
    .line 9
    const/4 v9, 0x1

    .line 10
    const/4 v10, 0x0

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    iget-boolean v2, v0, LS0/b;->f:Z

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v11, v10

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    move v11, v9

    .line 21
    :goto_1
    if-eqz v1, :cond_9

    .line 22
    .line 23
    iput-boolean v10, v0, LS0/b;->e:Z

    .line 24
    .line 25
    iget-object v1, v0, LS0/b;->d:Lt/L;

    .line 26
    .line 27
    iget-object v2, v1, Lt/V;->a:[Ljava/lang/Object;

    .line 28
    .line 29
    iget v1, v1, Lt/V;->b:I

    .line 30
    .line 31
    move v3, v10

    .line 32
    :goto_2
    if-ge v3, v1, :cond_2

    .line 33
    .line 34
    aget-object v4, v2, v3

    .line 35
    .line 36
    check-cast v4, Lie/a;

    .line 37
    .line 38
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    add-int/lit8 v3, v3, 0x1

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    iget-object v1, v0, LS0/b;->b:LS0/a;

    .line 45
    .line 46
    iget-object v12, v1, LS0/a;->a:[J

    .line 47
    .line 48
    iget v13, v1, LS0/a;->c:I

    .line 49
    .line 50
    move v14, v10

    .line 51
    :goto_3
    array-length v1, v12

    .line 52
    add-int/lit8 v1, v1, -0x2

    .line 53
    .line 54
    if-ge v14, v1, :cond_4

    .line 55
    .line 56
    if-ge v14, v13, :cond_4

    .line 57
    .line 58
    add-int/lit8 v1, v14, 0x2

    .line 59
    .line 60
    aget-wide v1, v12, v1

    .line 61
    .line 62
    const/16 v3, 0x3d

    .line 63
    .line 64
    shr-long v3, v1, v3

    .line 65
    .line 66
    long-to-int v3, v3

    .line 67
    and-int/2addr v3, v9

    .line 68
    if-eqz v3, :cond_3

    .line 69
    .line 70
    aget-wide v3, v12, v14

    .line 71
    .line 72
    add-int/lit8 v5, v14, 0x1

    .line 73
    .line 74
    aget-wide v5, v12, v5

    .line 75
    .line 76
    long-to-int v1, v1

    .line 77
    const v2, 0x3ffffff

    .line 78
    .line 79
    .line 80
    and-int/2addr v2, v1

    .line 81
    iget-object v1, v0, LS0/b;->c:LS0/d;

    .line 82
    .line 83
    invoke-virtual/range {v1 .. v8}, LS0/d;->c(IJJJ)V

    .line 84
    .line 85
    .line 86
    :cond_3
    add-int/lit8 v14, v14, 0x3

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_4
    iget-object v1, v0, LS0/b;->c:LS0/d;

    .line 90
    .line 91
    invoke-virtual {v1}, LS0/d;->e()Lt/F;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    iget-object v2, v1, Lt/o;->c:[Ljava/lang/Object;

    .line 96
    .line 97
    iget-object v1, v1, Lt/o;->a:[J

    .line 98
    .line 99
    array-length v3, v1

    .line 100
    add-int/lit8 v3, v3, -0x2

    .line 101
    .line 102
    if-ltz v3, :cond_8

    .line 103
    .line 104
    move v4, v10

    .line 105
    :goto_4
    aget-wide v5, v1, v4

    .line 106
    .line 107
    not-long v12, v5

    .line 108
    const/4 v9, 0x7

    .line 109
    shl-long/2addr v12, v9

    .line 110
    and-long/2addr v12, v5

    .line 111
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    and-long/2addr v12, v14

    .line 117
    cmp-long v9, v12, v14

    .line 118
    .line 119
    if-eqz v9, :cond_7

    .line 120
    .line 121
    sub-int v9, v4, v3

    .line 122
    .line 123
    not-int v9, v9

    .line 124
    ushr-int/lit8 v9, v9, 0x1f

    .line 125
    .line 126
    const/16 v12, 0x8

    .line 127
    .line 128
    rsub-int/lit8 v9, v9, 0x8

    .line 129
    .line 130
    move v13, v10

    .line 131
    :goto_5
    if-ge v13, v9, :cond_6

    .line 132
    .line 133
    const-wide/16 v14, 0xff

    .line 134
    .line 135
    and-long/2addr v14, v5

    .line 136
    const-wide/16 v16, 0x80

    .line 137
    .line 138
    cmp-long v14, v14, v16

    .line 139
    .line 140
    if-gez v14, :cond_5

    .line 141
    .line 142
    shl-int/lit8 v14, v4, 0x3

    .line 143
    .line 144
    add-int/2addr v14, v13

    .line 145
    aget-object v14, v2, v14

    .line 146
    .line 147
    invoke-static {v14}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :cond_5
    shr-long/2addr v5, v12

    .line 151
    add-int/lit8 v13, v13, 0x1

    .line 152
    .line 153
    goto :goto_5

    .line 154
    :cond_6
    if-ne v9, v12, :cond_8

    .line 155
    .line 156
    :cond_7
    if-eq v4, v3, :cond_8

    .line 157
    .line 158
    add-int/lit8 v4, v4, 0x1

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_8
    iget-object v1, v0, LS0/b;->b:LS0/a;

    .line 162
    .line 163
    invoke-virtual {v1}, LS0/a;->a()V

    .line 164
    .line 165
    .line 166
    :cond_9
    iget-boolean v1, v0, LS0/b;->f:Z

    .line 167
    .line 168
    if-eqz v1, :cond_a

    .line 169
    .line 170
    iput-boolean v10, v0, LS0/b;->f:Z

    .line 171
    .line 172
    iget-object v1, v0, LS0/b;->c:LS0/d;

    .line 173
    .line 174
    invoke-virtual {v1, v7, v8}, LS0/d;->b(J)V

    .line 175
    .line 176
    .line 177
    :cond_a
    if-eqz v11, :cond_b

    .line 178
    .line 179
    iget-object v1, v0, LS0/b;->c:LS0/d;

    .line 180
    .line 181
    invoke-virtual {v1, v7, v8}, LS0/d;->a(J)V

    .line 182
    .line 183
    .line 184
    :cond_b
    iget-boolean v1, v0, LS0/b;->g:Z

    .line 185
    .line 186
    if-eqz v1, :cond_c

    .line 187
    .line 188
    iput-boolean v10, v0, LS0/b;->g:Z

    .line 189
    .line 190
    iget-object v1, v0, LS0/b;->b:LS0/a;

    .line 191
    .line 192
    invoke-virtual {v1}, LS0/a;->b()V

    .line 193
    .line 194
    .line 195
    :cond_c
    iget-object v1, v0, LS0/b;->c:LS0/d;

    .line 196
    .line 197
    invoke-virtual {v1, v7, v8}, LS0/d;->f(J)V

    .line 198
    .line 199
    .line 200
    return-void
.end method

.method public final d()LS0/a;
    .locals 1

    .line 1
    iget-object v0, p0, LS0/b;->b:LS0/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LS0/b;->e:Z

    .line 3
    .line 4
    return-void
.end method

.method public final i(LK0/J;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LS0/b;->e:Z

    .line 3
    .line 4
    iget-object v1, p0, LS0/b;->b:LS0/a;

    .line 5
    .line 6
    invoke-virtual {p1}, LK0/J;->y()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-virtual {v1, p1}, LS0/a;->e(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, LS0/b;->o(Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final j(LK0/J;)V
    .locals 5

    .line 1
    sget-boolean v0, Ll0/h;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-direct {p0, p1}, LS0/b;->l(LK0/J;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, LS0/c;->b(J)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    invoke-virtual {p1, v0, v1}, LK0/J;->Y1(J)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p1, v0}, LK0/J;->Z1(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, LK0/J;->I0()La0/c;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v2, v1, La0/c;->a:[Ljava/lang/Object;

    .line 28
    .line 29
    invoke-virtual {v1}, La0/c;->p()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    move v3, v0

    .line 34
    :goto_0
    if-ge v3, v1, :cond_1

    .line 35
    .line 36
    aget-object v4, v2, v3

    .line 37
    .line 38
    check-cast v4, LK0/J;

    .line 39
    .line 40
    invoke-virtual {p0, v4, v0}, LS0/b;->k(LK0/J;Z)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v3, v3, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-virtual {p0, p1}, LS0/b;->i(LK0/J;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    invoke-direct {p0, p1}, LS0/b;->g(LK0/J;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final k(LK0/J;Z)V
    .locals 19

    .line 1
    sget-boolean v0, Ll0/h;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual/range {p1 .. p1}, LK0/J;->l0()LK0/X;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, LK0/X;->S0()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v0}, LK0/X;->Q0()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual/range {p1 .. p1}, LK0/J;->u0()J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    invoke-virtual/range {p1 .. p1}, LK0/J;->c0()J

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    const/16 v6, 0x20

    .line 27
    .line 28
    shr-long v7, v4, v6

    .line 29
    .line 30
    long-to-int v7, v7

    .line 31
    const-wide v8, 0xffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr v4, v8

    .line 37
    long-to-int v4, v4

    .line 38
    invoke-direct/range {p0 .. p1}, LS0/b;->m(LK0/J;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual/range {p1 .. p1}, LK0/J;->u0()J

    .line 42
    .line 43
    .line 44
    move-result-wide v10

    .line 45
    invoke-static {v10, v11}, LS0/c;->b(J)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-nez v5, :cond_1

    .line 50
    .line 51
    invoke-direct/range {p0 .. p2}, LS0/b;->f(LK0/J;Z)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    int-to-long v12, v1

    .line 56
    shl-long v5, v12, v6

    .line 57
    .line 58
    int-to-long v12, v0

    .line 59
    and-long/2addr v8, v12

    .line 60
    or-long/2addr v5, v8

    .line 61
    invoke-static {v5, v6}, Li1/r;->c(J)J

    .line 62
    .line 63
    .line 64
    move-result-wide v5

    .line 65
    move-object/from16 v13, p1

    .line 66
    .line 67
    invoke-virtual {v13, v5, v6}, LK0/J;->S1(J)V

    .line 68
    .line 69
    .line 70
    invoke-static {v10, v11}, Li1/n;->k(J)I

    .line 71
    .line 72
    .line 73
    move-result v15

    .line 74
    invoke-static {v10, v11}, Li1/n;->l(J)I

    .line 75
    .line 76
    .line 77
    move-result v16

    .line 78
    add-int v17, v15, v1

    .line 79
    .line 80
    add-int v18, v16, v0

    .line 81
    .line 82
    if-nez p2, :cond_2

    .line 83
    .line 84
    invoke-static {v10, v11, v2, v3}, Li1/n;->j(JJ)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_2

    .line 89
    .line 90
    if-ne v7, v1, :cond_2

    .line 91
    .line 92
    if-ne v4, v0, :cond_2

    .line 93
    .line 94
    :goto_0
    return-void

    .line 95
    :cond_2
    move-object/from16 v12, p0

    .line 96
    .line 97
    move/from16 v14, p2

    .line 98
    .line 99
    invoke-direct/range {v12 .. v18}, LS0/b;->e(LK0/J;ZIIII)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public final n(LK0/J;)V
    .locals 1

    .line 1
    iget-object v0, p0, LS0/b;->b:LS0/a;

    .line 2
    .line 3
    invoke-virtual {p1}, LK0/J;->y()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {v0, p1}, LS0/a;->g(I)Z

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LS0/b;->h()V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, LS0/b;->g:Z

    .line 15
    .line 16
    return-void
.end method

.method public final o(Z)V
    .locals 6

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object p1, p0, LS0/b;->h:Ljava/lang/Object;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    goto :goto_1

    .line 10
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 11
    :goto_1
    iget-object v0, p0, LS0/b;->c:LS0/d;

    .line 12
    .line 13
    invoke-virtual {v0}, LS0/d;->d()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    cmp-long v2, v0, v2

    .line 20
    .line 21
    if-gez v2, :cond_2

    .line 22
    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_2
    iget-wide v2, p0, LS0/b;->i:J

    .line 27
    .line 28
    cmp-long v2, v2, v0

    .line 29
    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    :goto_2
    return-void

    .line 35
    :cond_3
    iget-object p1, p0, LS0/b;->h:Ljava/lang/Object;

    .line 36
    .line 37
    if-eqz p1, :cond_4

    .line 38
    .line 39
    invoke-static {p1}, Ll0/c;->e(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :cond_4
    invoke-static {}, Ll0/c;->b()J

    .line 43
    .line 44
    .line 45
    move-result-wide v2

    .line 46
    const/16 p1, 0x10

    .line 47
    .line 48
    int-to-long v4, p1

    .line 49
    add-long/2addr v4, v2

    .line 50
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    iput-wide v0, p0, LS0/b;->i:J

    .line 55
    .line 56
    sub-long/2addr v0, v2

    .line 57
    iget-object p1, p0, LS0/b;->j:Lie/a;

    .line 58
    .line 59
    invoke-static {v0, v1, p1}, Ll0/c;->c(JLie/a;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, LS0/b;->h:Ljava/lang/Object;

    .line 64
    .line 65
    return-void
.end method

.method public final p(LK0/J;ZZ)V
    .locals 1

    .line 1
    invoke-virtual {p1}, LK0/J;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LS0/b;->b:LS0/a;

    .line 8
    .line 9
    invoke-virtual {p1}, LK0/J;->y()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {v0, p1, p2, p3}, LS0/a;->j(IZZ)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final q(JJ[FII)V
    .locals 9

    .line 1
    invoke-static {p5}, LS0/c;->a([F)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, LS0/b;->c:LS0/d;

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x2

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    :goto_0
    move-wide v2, p1

    .line 12
    move-wide v4, p3

    .line 13
    move-object v6, p5

    .line 14
    move v7, p6

    .line 15
    move/from16 v8, p7

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const/4 p5, 0x0

    .line 19
    goto :goto_0

    .line 20
    :goto_1
    invoke-virtual/range {v1 .. v8}, LS0/d;->g(JJ[FII)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-nez p1, :cond_2

    .line 25
    .line 26
    iget-boolean p1, p0, LS0/b;->f:Z

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_1
    const/4 p1, 0x0

    .line 32
    goto :goto_3

    .line 33
    :cond_2
    :goto_2
    const/4 p1, 0x1

    .line 34
    :goto_3
    iput-boolean p1, p0, LS0/b;->f:Z

    .line 35
    .line 36
    return-void
.end method
