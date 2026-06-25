.class public final LU/l0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LU/l0;

.field private static final b:F

.field private static final c:F

.field private static final d:F

.field private static final e:F

.field private static final f:F

.field public static final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LU/l0;

    .line 2
    .line 3
    invoke-direct {v0}, LU/l0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LU/l0;->a:LU/l0;

    .line 7
    .line 8
    sget-object v0, LX/r;->a:LX/r;

    .line 9
    .line 10
    invoke-virtual {v0}, LX/r;->b()F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    sput v1, LU/l0;->b:F

    .line 15
    .line 16
    invoke-virtual {v0}, LX/r;->b()F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    sput v1, LU/l0;->c:F

    .line 21
    .line 22
    sget-object v1, LX/q;->a:LX/q;

    .line 23
    .line 24
    invoke-virtual {v1}, LX/q;->a()F

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    sput v1, LU/l0;->d:F

    .line 29
    .line 30
    invoke-virtual {v0}, LX/r;->b()F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    sput v0, LU/l0;->e:F

    .line 35
    .line 36
    sget-object v0, LX/p;->a:LX/p;

    .line 37
    .line 38
    invoke-virtual {v0}, LX/p;->b()F

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    sput v0, LU/l0;->f:F

    .line 43
    .line 44
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(LU/n0;Lie/a;Lw/i;Lw/z;LY/m;II)LU/m0;
    .locals 7

    .line 1
    and-int/lit8 v0, p7, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v6, 0x7

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    move-object v4, p5

    .line 11
    invoke-static/range {v1 .. v6}, LU/d;->m(FFFLY/m;II)LU/n0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v4, p5

    .line 17
    :goto_0
    and-int/lit8 p5, p7, 0x2

    .line 18
    .line 19
    if-eqz p5, :cond_1

    .line 20
    .line 21
    sget-object p2, LU/l0$a;->a:LU/l0$a;

    .line 22
    .line 23
    :cond_1
    and-int/lit8 p5, p7, 0x4

    .line 24
    .line 25
    if-eqz p5, :cond_2

    .line 26
    .line 27
    const/high16 p3, 0x43c80000    # 400.0f

    .line 28
    .line 29
    const/4 p5, 0x5

    .line 30
    const/4 v0, 0x0

    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-static {v0, p3, v1, p5, v1}, Lw/j;->h(FFLjava/lang/Object;ILjava/lang/Object;)Lw/h0;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    :cond_2
    and-int/lit8 p5, p7, 0x8

    .line 37
    .line 38
    if-eqz p5, :cond_3

    .line 39
    .line 40
    const/4 p4, 0x0

    .line 41
    invoke-static {v4, p4}, Lv/A;->b(LY/m;I)Lw/z;

    .line 42
    .line 43
    .line 44
    move-result-object p4

    .line 45
    :cond_3
    invoke-static {}, LY/w;->L()Z

    .line 46
    .line 47
    .line 48
    move-result p5

    .line 49
    if-eqz p5, :cond_4

    .line 50
    .line 51
    const/4 p5, -0x1

    .line 52
    const-string p7, "androidx.compose.material3.TopAppBarDefaults.exitUntilCollapsedScrollBehavior (AppBar.kt:1252)"

    .line 53
    .line 54
    const v0, -0x68ba0c02

    .line 55
    .line 56
    .line 57
    invoke-static {v0, p6, p5, p7}, LY/w;->U(IIILjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :cond_4
    new-instance p5, LU/t;

    .line 61
    .line 62
    invoke-direct {p5, p1, p3, p4, p2}, LU/t;-><init>(LU/n0;Lw/i;Lw/z;Lie/a;)V

    .line 63
    .line 64
    .line 65
    invoke-static {}, LY/w;->L()Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_5

    .line 70
    .line 71
    invoke-static {}, LY/w;->T()V

    .line 72
    .line 73
    .line 74
    :cond_5
    return-object p5
.end method

.method public final b(LU/l;)LU/k0;
    .locals 13

    .line 1
    invoke-virtual {p1}, LU/l;->f()LU/k0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v1, LU/k0;

    .line 8
    .line 9
    sget-object v0, LX/p;->a:LX/p;

    .line 10
    .line 11
    invoke-virtual {v0}, LX/p;->a()LX/c;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {p1, v2}, LU/m;->f(LU/l;LX/c;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    sget-object v4, LX/r;->a:LX/r;

    .line 20
    .line 21
    invoke-virtual {v4}, LX/r;->f()LX/c;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-static {p1, v4}, LU/m;->f(LU/l;LX/c;)J

    .line 26
    .line 27
    .line 28
    move-result-wide v4

    .line 29
    invoke-virtual {v0}, LX/p;->e()LX/c;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-static {p1, v6}, LU/m;->f(LU/l;LX/c;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v6

    .line 37
    invoke-virtual {v0}, LX/p;->c()LX/c;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    invoke-static {p1, v8}, LU/m;->f(LU/l;LX/c;)J

    .line 42
    .line 43
    .line 44
    move-result-wide v8

    .line 45
    invoke-virtual {v0}, LX/p;->f()LX/c;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {p1, v0}, LU/m;->f(LU/l;LX/c;)J

    .line 50
    .line 51
    .line 52
    move-result-wide v10

    .line 53
    const/4 v12, 0x0

    .line 54
    invoke-direct/range {v1 .. v12}, LU/k0;-><init>(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v1}, LU/l;->V(LU/k0;)V

    .line 58
    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_0
    return-object v0
.end method

.method public final c(LU/l;)LU/k0;
    .locals 13

    .line 1
    invoke-virtual {p1}, LU/l;->j()LU/k0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v1, LU/k0;

    .line 8
    .line 9
    sget-object v0, LX/r;->a:LX/r;

    .line 10
    .line 11
    invoke-virtual {v0}, LX/r;->a()LX/c;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {p1, v2}, LU/m;->f(LU/l;LX/c;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    invoke-virtual {v0}, LX/r;->f()LX/c;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-static {p1, v4}, LU/m;->f(LU/l;LX/c;)J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    invoke-virtual {v0}, LX/r;->e()LX/c;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-static {p1, v6}, LU/m;->f(LU/l;LX/c;)J

    .line 32
    .line 33
    .line 34
    move-result-wide v6

    .line 35
    invoke-virtual {v0}, LX/r;->c()LX/c;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    invoke-static {p1, v8}, LU/m;->f(LU/l;LX/c;)J

    .line 40
    .line 41
    .line 42
    move-result-wide v8

    .line 43
    invoke-virtual {v0}, LX/r;->g()LX/c;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {p1, v0}, LU/m;->f(LU/l;LX/c;)J

    .line 48
    .line 49
    .line 50
    move-result-wide v10

    .line 51
    const/4 v12, 0x0

    .line 52
    invoke-direct/range {v1 .. v12}, LU/k0;-><init>(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v1}, LU/l;->Z(LU/k0;)V

    .line 56
    .line 57
    .line 58
    return-object v1

    .line 59
    :cond_0
    return-object v0
.end method

.method public final d()F
    .locals 1

    .line 1
    sget v0, LU/l0;->e:F

    .line 2
    .line 3
    return v0
.end method

.method public final e()F
    .locals 1

    .line 1
    sget v0, LU/l0;->f:F

    .line 2
    .line 3
    return v0
.end method

.method public final f()F
    .locals 1

    .line 1
    sget v0, LU/l0;->b:F

    .line 2
    .line 3
    return v0
.end method

.method public final g(LY/m;I)LC/P;
    .locals 3

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.material3.TopAppBarDefaults.<get-windowInsets> (AppBar.kt:1025)"

    .line 9
    .line 10
    const v2, 0x7fbe5fff

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object p2, LC/P;->a:LC/P$a;

    .line 17
    .line 18
    const/4 v0, 0x6

    .line 19
    invoke-static {p2, p1, v0}, LW/i;->a(LC/P$a;LY/m;I)LC/P;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    sget-object p2, LC/V;->a:LC/V$a;

    .line 24
    .line 25
    invoke-virtual {p2}, LC/V$a;->f()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {p2}, LC/V$a;->g()I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    invoke-static {v0, p2}, LC/V;->l(II)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    invoke-static {p1, p2}, LC/S;->e(LC/P;I)LC/P;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {}, LY/w;->L()Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    invoke-static {}, LY/w;->T()V

    .line 48
    .line 49
    .line 50
    :cond_1
    return-object p1
.end method

.method public final h(LY/m;I)LU/k0;
    .locals 3

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors (AppBar.kt:1135)"

    .line 9
    .line 10
    const v2, 0x68018e29

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object p2, LU/D;->a:LU/D;

    .line 17
    .line 18
    const/4 v0, 0x6

    .line 19
    invoke-virtual {p2, p1, v0}, LU/D;->a(LY/m;I)LU/l;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, p1}, LU/l0;->b(LU/l;)LU/k0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {}, LY/w;->L()Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    invoke-static {}, LY/w;->T()V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-object p1
.end method

.method public final i(LY/m;I)LU/k0;
    .locals 3

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:977)"

    .line 9
    .line 10
    const v2, -0x52c32596

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object p2, LU/D;->a:LU/D;

    .line 17
    .line 18
    const/4 v0, 0x6

    .line 19
    invoke-virtual {p2, p1, v0}, LU/D;->a(LY/m;I)LU/l;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, p1}, LU/l0;->c(LU/l;)LU/k0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {}, LY/w;->L()Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    invoke-static {}, LY/w;->T()V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-object p1
.end method

.method public final j(JJJJJLY/m;II)LU/k0;
    .locals 14

    .line 1
    and-int/lit8 v0, p13, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ls0/r0;->b:Ls0/r0$a;

    .line 6
    .line 7
    invoke-virtual {v0}, Ls0/r0$a;->j()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-wide v0, p1

    .line 13
    :goto_0
    and-int/lit8 v2, p13, 0x2

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    sget-object v2, Ls0/r0;->b:Ls0/r0$a;

    .line 18
    .line 19
    invoke-virtual {v2}, Ls0/r0$a;->j()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move-wide/from16 v2, p3

    .line 25
    .line 26
    :goto_1
    and-int/lit8 v4, p13, 0x4

    .line 27
    .line 28
    if-eqz v4, :cond_2

    .line 29
    .line 30
    sget-object v4, Ls0/r0;->b:Ls0/r0$a;

    .line 31
    .line 32
    invoke-virtual {v4}, Ls0/r0$a;->j()J

    .line 33
    .line 34
    .line 35
    move-result-wide v4

    .line 36
    goto :goto_2

    .line 37
    :cond_2
    move-wide/from16 v4, p5

    .line 38
    .line 39
    :goto_2
    and-int/lit8 v6, p13, 0x8

    .line 40
    .line 41
    if-eqz v6, :cond_3

    .line 42
    .line 43
    sget-object v6, Ls0/r0;->b:Ls0/r0$a;

    .line 44
    .line 45
    invoke-virtual {v6}, Ls0/r0$a;->j()J

    .line 46
    .line 47
    .line 48
    move-result-wide v6

    .line 49
    goto :goto_3

    .line 50
    :cond_3
    move-wide/from16 v6, p7

    .line 51
    .line 52
    :goto_3
    and-int/lit8 v8, p13, 0x10

    .line 53
    .line 54
    if-eqz v8, :cond_4

    .line 55
    .line 56
    sget-object v8, Ls0/r0;->b:Ls0/r0$a;

    .line 57
    .line 58
    invoke-virtual {v8}, Ls0/r0$a;->j()J

    .line 59
    .line 60
    .line 61
    move-result-wide v8

    .line 62
    goto :goto_4

    .line 63
    :cond_4
    move-wide/from16 v8, p9

    .line 64
    .line 65
    :goto_4
    invoke-static {}, LY/w;->L()Z

    .line 66
    .line 67
    .line 68
    move-result v10

    .line 69
    if-eqz v10, :cond_5

    .line 70
    .line 71
    const/4 v10, -0x1

    .line 72
    const-string v11, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:998)"

    .line 73
    .line 74
    const v12, 0x7fba5a6b

    .line 75
    .line 76
    .line 77
    move/from16 v13, p12

    .line 78
    .line 79
    invoke-static {v12, v13, v10, v11}, LY/w;->U(IIILjava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :cond_5
    sget-object v10, LU/D;->a:LU/D;

    .line 83
    .line 84
    const/4 v11, 0x6

    .line 85
    move-object/from16 v12, p11

    .line 86
    .line 87
    invoke-virtual {v10, v12, v11}, LU/D;->a(LY/m;I)LU/l;

    .line 88
    .line 89
    .line 90
    move-result-object v10

    .line 91
    invoke-virtual {p0, v10}, LU/l0;->c(LU/l;)LU/k0;

    .line 92
    .line 93
    .line 94
    move-result-object v10

    .line 95
    move-wide/from16 p2, v0

    .line 96
    .line 97
    move-wide/from16 p4, v2

    .line 98
    .line 99
    move-wide/from16 p6, v4

    .line 100
    .line 101
    move-wide/from16 p8, v6

    .line 102
    .line 103
    move-wide/from16 p10, v8

    .line 104
    .line 105
    move-object p1, v10

    .line 106
    invoke-virtual/range {p1 .. p11}, LU/k0;->b(JJJJJ)LU/k0;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-static {}, LY/w;->L()Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_6

    .line 115
    .line 116
    invoke-static {}, LY/w;->T()V

    .line 117
    .line 118
    .line 119
    :cond_6
    return-object v0
.end method
