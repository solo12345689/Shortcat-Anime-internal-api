.class public final LK/L$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK/L;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LK/L$a;-><init>()V

    return-void
.end method

.method private final c(Ls0/j0;JLa1/J;LU0/T0;Ls0/k1;)V
    .locals 1

    .line 1
    invoke-static {p2, p3}, LU0/W0;->l(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p4, v0}, La1/J;->b(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {p2, p3}, LU0/W0;->k(J)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    invoke-interface {p4, p2}, La1/J;->b(I)I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-eq v0, p2, :cond_0

    .line 18
    .line 19
    invoke-virtual {p5, v0, p2}, LU0/T0;->z(II)Ls0/m1;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-interface {p1, p2, p6}, Ls0/j0;->t(Ls0/m1;Ls0/k1;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(JLa1/d0;)La1/d0;
    .locals 27

    .line 1
    invoke-virtual/range {p3 .. p3}, La1/d0;->a()La1/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static/range {p1 .. p2}, LU0/W0;->n(J)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-interface {v0, v1}, La1/J;->b(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual/range {p3 .. p3}, La1/d0;->a()La1/J;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static/range {p1 .. p2}, LU0/W0;->i(J)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-interface {v1, v2}, La1/J;->b(I)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    new-instance v1, LU0/e$b;

    .line 34
    .line 35
    invoke-virtual/range {p3 .. p3}, La1/d0;->b()LU0/e;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-direct {v1, v3}, LU0/e$b;-><init>(LU0/e;)V

    .line 40
    .line 41
    .line 42
    new-instance v4, LU0/I0;

    .line 43
    .line 44
    sget-object v3, Lg1/k;->b:Lg1/k$a;

    .line 45
    .line 46
    invoke-virtual {v3}, Lg1/k$a;->d()Lg1/k;

    .line 47
    .line 48
    .line 49
    move-result-object v21

    .line 50
    const v25, 0xefff

    .line 51
    .line 52
    .line 53
    const/16 v26, 0x0

    .line 54
    .line 55
    const-wide/16 v5, 0x0

    .line 56
    .line 57
    const-wide/16 v7, 0x0

    .line 58
    .line 59
    const/4 v9, 0x0

    .line 60
    const/4 v10, 0x0

    .line 61
    const/4 v11, 0x0

    .line 62
    const/4 v12, 0x0

    .line 63
    const/4 v13, 0x0

    .line 64
    const-wide/16 v14, 0x0

    .line 65
    .line 66
    const/16 v16, 0x0

    .line 67
    .line 68
    const/16 v17, 0x0

    .line 69
    .line 70
    const/16 v18, 0x0

    .line 71
    .line 72
    const-wide/16 v19, 0x0

    .line 73
    .line 74
    const/16 v22, 0x0

    .line 75
    .line 76
    const/16 v23, 0x0

    .line 77
    .line 78
    const/16 v24, 0x0

    .line 79
    .line 80
    invoke-direct/range {v4 .. v26}, LU0/I0;-><init>(JJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;LU0/F;Lu0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v4, v2, v0}, LU0/e$b;->a(LU0/I0;II)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, LU0/e$b;->l()LU0/e;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual/range {p3 .. p3}, La1/d0;->a()La1/J;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    new-instance v2, La1/d0;

    .line 95
    .line 96
    invoke-direct {v2, v0, v1}, La1/d0;-><init>(LU0/e;La1/J;)V

    .line 97
    .line 98
    .line 99
    return-object v2
.end method

.method public final b(Ls0/j0;La1/U;JJLa1/J;LU0/T0;Ls0/k1;J)V
    .locals 8

    .line 1
    invoke-static {p3, p4}, LU0/W0;->h(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-interface/range {p9 .. p11}, Ls0/k1;->p(J)V

    .line 8
    .line 9
    .line 10
    move-object v1, p0

    .line 11
    move-object v2, p1

    .line 12
    move-wide v3, p3

    .line 13
    move-object v5, p7

    .line 14
    move-object/from16 v6, p8

    .line 15
    .line 16
    move-object/from16 v7, p9

    .line 17
    .line 18
    invoke-direct/range {v1 .. v7}, LK/L$a;->c(Ls0/j0;JLa1/J;LU0/T0;Ls0/k1;)V

    .line 19
    .line 20
    .line 21
    goto/16 :goto_2

    .line 22
    .line 23
    :cond_0
    invoke-static {p5, p6}, LU0/W0;->h(J)Z

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    if-nez p3, :cond_3

    .line 28
    .line 29
    invoke-virtual/range {p8 .. p8}, LU0/T0;->l()LU0/S0;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {p2}, LU0/S0;->i()LU0/Y0;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p2}, LU0/Y0;->j()J

    .line 38
    .line 39
    .line 40
    move-result-wide p2

    .line 41
    invoke-static {p2, p3}, Ls0/r0;->m(J)Ls0/r0;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {p2}, Ls0/r0;->A()J

    .line 46
    .line 47
    .line 48
    move-result-wide p3

    .line 49
    const-wide/16 v0, 0x10

    .line 50
    .line 51
    cmp-long p3, p3, v0

    .line 52
    .line 53
    if-nez p3, :cond_1

    .line 54
    .line 55
    const/4 p2, 0x0

    .line 56
    :cond_1
    if-eqz p2, :cond_2

    .line 57
    .line 58
    invoke-virtual {p2}, Ls0/r0;->A()J

    .line 59
    .line 60
    .line 61
    move-result-wide p2

    .line 62
    :goto_0
    move-wide v0, p2

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    sget-object p2, Ls0/r0;->b:Ls0/r0$a;

    .line 65
    .line 66
    invoke-virtual {p2}, Ls0/r0$a;->a()J

    .line 67
    .line 68
    .line 69
    move-result-wide p2

    .line 70
    goto :goto_0

    .line 71
    :goto_1
    invoke-static {v0, v1}, Ls0/r0;->t(J)F

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    const p3, 0x3e4ccccd    # 0.2f

    .line 76
    .line 77
    .line 78
    mul-float v2, p2, p3

    .line 79
    .line 80
    const/16 v6, 0xe

    .line 81
    .line 82
    const/4 v7, 0x0

    .line 83
    const/4 v3, 0x0

    .line 84
    const/4 v4, 0x0

    .line 85
    const/4 v5, 0x0

    .line 86
    invoke-static/range {v0 .. v7}, Ls0/r0;->q(JFFFFILjava/lang/Object;)J

    .line 87
    .line 88
    .line 89
    move-result-wide p2

    .line 90
    move-object/from16 v7, p9

    .line 91
    .line 92
    invoke-interface {v7, p2, p3}, Ls0/k1;->p(J)V

    .line 93
    .line 94
    .line 95
    move-object v1, p0

    .line 96
    move-object v2, p1

    .line 97
    move-wide v3, p5

    .line 98
    move-object v5, p7

    .line 99
    move-object/from16 v6, p8

    .line 100
    .line 101
    invoke-direct/range {v1 .. v7}, LK/L$a;->c(Ls0/j0;JLa1/J;LU0/T0;Ls0/k1;)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_3
    invoke-virtual {p2}, La1/U;->k()J

    .line 106
    .line 107
    .line 108
    move-result-wide p3

    .line 109
    invoke-static {p3, p4}, LU0/W0;->h(J)Z

    .line 110
    .line 111
    .line 112
    move-result p3

    .line 113
    if-nez p3, :cond_4

    .line 114
    .line 115
    invoke-interface/range {p9 .. p11}, Ls0/k1;->p(J)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p2}, La1/U;->k()J

    .line 119
    .line 120
    .line 121
    move-result-wide v3

    .line 122
    move-object v1, p0

    .line 123
    move-object v2, p1

    .line 124
    move-object v5, p7

    .line 125
    move-object/from16 v6, p8

    .line 126
    .line 127
    move-object/from16 v7, p9

    .line 128
    .line 129
    invoke-direct/range {v1 .. v7}, LK/L$a;->c(Ls0/j0;JLa1/J;LU0/T0;Ls0/k1;)V

    .line 130
    .line 131
    .line 132
    :cond_4
    :goto_2
    sget-object p2, LU0/V0;->a:LU0/V0;

    .line 133
    .line 134
    move-object/from16 v6, p8

    .line 135
    .line 136
    invoke-virtual {p2, p1, v6}, LU0/V0;->a(Ls0/j0;LU0/T0;)V

    .line 137
    .line 138
    .line 139
    return-void
.end method

.method public final d(LK/H;JLi1/t;LU0/T0;)LTd/y;
    .locals 0

    .line 1
    invoke-virtual {p1, p2, p3, p4, p5}, LK/H;->l(JLi1/t;LU0/T0;)LU0/T0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, LTd/y;

    .line 6
    .line 7
    invoke-virtual {p1}, LU0/T0;->B()J

    .line 8
    .line 9
    .line 10
    move-result-wide p3

    .line 11
    invoke-static {p3, p4}, Li1/r;->g(J)I

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    invoke-virtual {p1}, LU0/T0;->B()J

    .line 20
    .line 21
    .line 22
    move-result-wide p4

    .line 23
    invoke-static {p4, p5}, Li1/r;->f(J)I

    .line 24
    .line 25
    .line 26
    move-result p4

    .line 27
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p4

    .line 31
    invoke-direct {p2, p3, p4, p1}, LTd/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-object p2
.end method

.method public final e(La1/U;LK/H;LU0/T0;LI0/p;La1/c0;ZLa1/J;)V
    .locals 7

    .line 1
    if-nez p6, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p1}, La1/U;->k()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    invoke-static {v0, v1}, LU0/W0;->k(J)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-interface {p7, p1}, La1/J;->b(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {p3}, LU0/T0;->l()LU0/S0;

    .line 17
    .line 18
    .line 19
    move-result-object p6

    .line 20
    invoke-virtual {p6}, LU0/S0;->j()LU0/e;

    .line 21
    .line 22
    .line 23
    move-result-object p6

    .line 24
    invoke-virtual {p6}, LU0/e;->length()I

    .line 25
    .line 26
    .line 27
    move-result p6

    .line 28
    if-ge p1, p6, :cond_1

    .line 29
    .line 30
    invoke-virtual {p3, p1}, LU0/T0;->d(I)Lr0/h;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    if-eqz p1, :cond_2

    .line 36
    .line 37
    add-int/lit8 p1, p1, -0x1

    .line 38
    .line 39
    invoke-virtual {p3, p1}, LU0/T0;->d(I)Lr0/h;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-virtual {p2}, LK/H;->j()LU0/Y0;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {p2}, LK/H;->a()Li1/d;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {p2}, LK/H;->b()LY0/u$b;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    const/16 v5, 0x18

    .line 57
    .line 58
    const/4 v6, 0x0

    .line 59
    const/4 v3, 0x0

    .line 60
    const/4 v4, 0x0

    .line 61
    invoke-static/range {v0 .. v6}, LK/M;->b(LU0/Y0;Li1/d;LY0/u$b;Ljava/lang/String;IILjava/lang/Object;)J

    .line 62
    .line 63
    .line 64
    move-result-wide p1

    .line 65
    new-instance p3, Lr0/h;

    .line 66
    .line 67
    invoke-static {p1, p2}, Li1/r;->f(J)I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    int-to-float p1, p1

    .line 72
    const/4 p2, 0x0

    .line 73
    const/high16 p6, 0x3f800000    # 1.0f

    .line 74
    .line 75
    invoke-direct {p3, p2, p2, p6, p1}, Lr0/h;-><init>(FFFF)V

    .line 76
    .line 77
    .line 78
    move-object p1, p3

    .line 79
    :goto_0
    invoke-virtual {p1}, Lr0/h;->i()F

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    invoke-virtual {p1}, Lr0/h;->l()F

    .line 84
    .line 85
    .line 86
    move-result p3

    .line 87
    invoke-static {p2, p3}, Lr0/g;->a(FF)J

    .line 88
    .line 89
    .line 90
    move-result-wide p2

    .line 91
    invoke-interface {p4, p2, p3}, LI0/p;->E0(J)J

    .line 92
    .line 93
    .line 94
    move-result-wide p2

    .line 95
    invoke-static {p2, p3}, Lr0/f;->m(J)F

    .line 96
    .line 97
    .line 98
    move-result p4

    .line 99
    invoke-static {p2, p3}, Lr0/f;->n(J)F

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    invoke-static {p4, p2}, Lr0/g;->a(FF)J

    .line 104
    .line 105
    .line 106
    move-result-wide p2

    .line 107
    invoke-virtual {p1}, Lr0/h;->n()F

    .line 108
    .line 109
    .line 110
    move-result p4

    .line 111
    invoke-virtual {p1}, Lr0/h;->h()F

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    invoke-static {p4, p1}, Lr0/m;->a(FF)J

    .line 116
    .line 117
    .line 118
    move-result-wide p6

    .line 119
    invoke-static {p2, p3, p6, p7}, Lr0/i;->b(JJ)Lr0/h;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {p5, p1}, La1/c0;->c(Lr0/h;)Z

    .line 124
    .line 125
    .line 126
    return-void
.end method

.method public final f(La1/c0;La1/l;Lkotlin/jvm/functions/Function1;)V
    .locals 7

    .line 1
    invoke-virtual {p2}, La1/l;->g()La1/U;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v5, 0x3

    .line 6
    const/4 v6, 0x0

    .line 7
    const/4 v1, 0x0

    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    invoke-static/range {v0 .. v6}, La1/U;->g(La1/U;LU0/e;JLU0/W0;ILjava/lang/Object;)La1/U;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-interface {p3, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, La1/c0;->a()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final g(Ljava/util/List;La1/l;Lkotlin/jvm/functions/Function1;La1/c0;)V
    .locals 0

    .line 1
    invoke-virtual {p2, p1}, La1/l;->b(Ljava/util/List;)La1/U;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    invoke-virtual {p4, p2, p1}, La1/c0;->d(La1/U;La1/U;)Z

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final h(La1/W;La1/U;La1/l;La1/t;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)La1/c0;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p6}, LK/L$a;->i(La1/W;La1/U;La1/l;La1/t;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)La1/c0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final i(La1/W;La1/U;La1/l;La1/t;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)La1/c0;
    .locals 2

    .line 1
    new-instance v0, Lkotlin/jvm/internal/N;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, LK/L$a$a;

    .line 7
    .line 8
    invoke-direct {v1, p3, p5, v0}, LK/L$a$a;-><init>(La1/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/N;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p2, p4, v1, p6}, La1/W;->d(La1/U;La1/t;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)La1/c0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 16
    .line 17
    return-object p1
.end method

.method public final j(JLK/Z;La1/l;La1/J;Lkotlin/jvm/functions/Function1;)V
    .locals 7

    .line 1
    const/4 v4, 0x2

    .line 2
    const/4 v5, 0x0

    .line 3
    const/4 v3, 0x0

    .line 4
    move-wide v1, p1

    .line 5
    move-object v0, p3

    .line 6
    invoke-static/range {v0 .. v5}, LK/Z;->e(LK/Z;JZILjava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-interface {p5, p1}, La1/J;->a(I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-virtual {p4}, La1/l;->g()La1/U;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {p1}, LU0/X0;->a(I)J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    const/4 v5, 0x5

    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v1, 0x0

    .line 25
    const/4 v4, 0x0

    .line 26
    invoke-static/range {v0 .. v6}, La1/U;->g(La1/U;LU0/e;JLU0/W0;ILjava/lang/Object;)La1/U;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p6, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final k(La1/c0;La1/U;La1/J;LK/Z;)V
    .locals 9

    .line 1
    invoke-virtual {p4}, LK/Z;->c()LI0/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-interface {v0}, LI0/p;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p4}, LK/Z;->b()LI0/p;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p4}, LK/Z;->f()LU0/T0;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    new-instance v6, LK/L$a$b;

    .line 25
    .line 26
    invoke-direct {v6, v0}, LK/L$a$b;-><init>(LI0/p;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, LQ/z;->b(LI0/p;)Lr0/h;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    const/4 p4, 0x0

    .line 34
    invoke-interface {v0, v1, p4}, LI0/p;->w0(LI0/p;Z)Lr0/h;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    move-object v2, p1

    .line 39
    move-object v3, p2

    .line 40
    move-object v4, p3

    .line 41
    invoke-virtual/range {v2 .. v8}, La1/c0;->e(La1/U;La1/J;LU0/T0;Lkotlin/jvm/functions/Function1;Lr0/h;Lr0/h;)Z

    .line 42
    .line 43
    .line 44
    :cond_1
    :goto_0
    return-void
.end method
