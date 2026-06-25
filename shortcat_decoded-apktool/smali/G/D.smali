.class public abstract LG/D;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:F

.field private static final b:LG/u;

.field private static final c:LG/D$b;


# direct methods
.method static constructor <clinit>()V
    .locals 24

    .line 1
    const/16 v0, 0x38

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    invoke-static {v0}, Li1/h;->n(F)F

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sput v0, LG/D;->a:F

    .line 9
    .line 10
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    sget-object v6, Lz/q;->b:Lz/q;

    .line 15
    .line 16
    sget-object v16, LA/k$a;->a:LA/k$a;

    .line 17
    .line 18
    new-instance v17, LG/D$a;

    .line 19
    .line 20
    invoke-direct/range {v17 .. v17}, LG/D$a;-><init>()V

    .line 21
    .line 22
    .line 23
    sget-object v0, LZd/j;->a:LZd/j;

    .line 24
    .line 25
    invoke-static {v0}, LGf/P;->a(LZd/i;)LGf/O;

    .line 26
    .line 27
    .line 28
    move-result-object v21

    .line 29
    new-instance v1, LG/u;

    .line 30
    .line 31
    const/high16 v22, 0x60000

    .line 32
    .line 33
    const/16 v23, 0x0

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v7, 0x0

    .line 39
    const/4 v8, 0x0

    .line 40
    const/4 v9, 0x0

    .line 41
    const/4 v10, 0x0

    .line 42
    const/4 v11, 0x0

    .line 43
    const/4 v12, 0x0

    .line 44
    const/4 v13, 0x0

    .line 45
    const/4 v14, 0x0

    .line 46
    const/4 v15, 0x0

    .line 47
    const/16 v18, 0x0

    .line 48
    .line 49
    const/16 v19, 0x0

    .line 50
    .line 51
    const/16 v20, 0x0

    .line 52
    .line 53
    invoke-direct/range {v1 .. v23}, LG/u;-><init>(Ljava/util/List;IIILz/q;IIZILG/e;LG/e;FIZLA/k;LI0/C;ZLjava/util/List;Ljava/util/List;LGf/O;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 54
    .line 55
    .line 56
    sput-object v1, LG/D;->b:LG/u;

    .line 57
    .line 58
    new-instance v0, LG/D$b;

    .line 59
    .line 60
    invoke-direct {v0}, LG/D$b;-><init>()V

    .line 61
    .line 62
    .line 63
    sput-object v0, LG/D;->c:LG/D$b;

    .line 64
    .line 65
    return-void
.end method

.method public static final synthetic a(LF/f;IFLw/i;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, LG/D;->d(LF/f;IFLw/i;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b(LG/u;I)J
    .locals 0

    .line 1
    invoke-static {p0, p1}, LG/D;->h(LG/u;I)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static final synthetic c()LG/D$b;
    .locals 1

    .line 1
    sget-object v0, LG/D;->c:LG/D$b;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final d(LF/f;IFLw/i;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;
    .locals 7

    .line 1
    new-instance v0, LG/D$c;

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    move-object v3, p0

    .line 5
    move v2, p1

    .line 6
    move v4, p2

    .line 7
    move-object v5, p3

    .line 8
    move-object v1, p4

    .line 9
    invoke-direct/range {v0 .. v6}, LG/D$c;-><init>(Lkotlin/jvm/functions/Function2;ILF/f;FLw/i;LZd/e;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v3, v0, p5}, LF/f;->e(Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-ne p0, p1, :cond_0

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    sget-object p0, LTd/L;->a:LTd/L;

    .line 24
    .line 25
    return-object p0
.end method

.method public static final e(LG/C;LZd/e;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p0}, LG/C;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-virtual {p0}, LG/C;->F()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ge v0, v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, LG/C;->v()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    add-int/lit8 v2, v0, 0x1

    .line 18
    .line 19
    const/4 v6, 0x6

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    move-object v1, p0

    .line 24
    move-object v5, p1

    .line 25
    invoke-static/range {v1 .. v7}, LG/C;->n(LG/C;IFLw/i;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-ne p0, p1, :cond_0

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_0
    sget-object p0, LTd/L;->a:LTd/L;

    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_1
    sget-object p0, LTd/L;->a:LTd/L;

    .line 40
    .line 41
    return-object p0
.end method

.method public static final f(LG/C;LZd/e;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p0}, LG/C;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    if-ltz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, LG/C;->v()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    add-int/lit8 v2, v0, -0x1

    .line 14
    .line 15
    const/4 v6, 0x6

    .line 16
    const/4 v7, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    move-object v1, p0

    .line 20
    move-object v5, p1

    .line 21
    invoke-static/range {v1 .. v7}, LG/C;->n(LG/C;IFLw/i;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-ne p0, p1, :cond_0

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_0
    sget-object p0, LTd/L;->a:LTd/L;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_1
    sget-object p0, LTd/L;->a:LTd/L;

    .line 36
    .line 37
    return-object p0
.end method

.method public static final g(LG/n;I)J
    .locals 10

    .line 1
    invoke-interface {p0}, LG/n;->j()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p0}, LG/n;->h()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v0, v1

    .line 10
    int-to-long v1, p1

    .line 11
    int-to-long v3, v0

    .line 12
    mul-long/2addr v1, v3

    .line 13
    invoke-interface {p0}, LG/n;->e()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    int-to-long v3, v0

    .line 18
    add-long/2addr v1, v3

    .line 19
    invoke-interface {p0}, LG/n;->c()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    int-to-long v3, v0

    .line 24
    add-long/2addr v1, v3

    .line 25
    invoke-interface {p0}, LG/n;->a()Lz/q;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sget-object v3, Lz/q;->b:Lz/q;

    .line 30
    .line 31
    if-ne v0, v3, :cond_0

    .line 32
    .line 33
    invoke-interface {p0}, LG/n;->b()J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    invoke-static {v3, v4}, Li1/r;->g(J)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    :goto_0
    move v4, v0

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    invoke-interface {p0}, LG/n;->b()J

    .line 44
    .line 45
    .line 46
    move-result-wide v3

    .line 47
    invoke-static {v3, v4}, Li1/r;->f(J)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    goto :goto_0

    .line 52
    :goto_1
    invoke-interface {p0}, LG/n;->l()LA/k;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-interface {p0}, LG/n;->h()I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    add-int/lit8 v8, p1, -0x1

    .line 61
    .line 62
    invoke-interface {p0}, LG/n;->e()I

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    invoke-interface {p0}, LG/n;->c()I

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    move v9, p1

    .line 71
    invoke-interface/range {v3 .. v9}, LA/k;->a(IIIIII)I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    const/4 p1, 0x0

    .line 76
    invoke-static {p0, p1, v4}, Loe/j;->m(III)I

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    sub-int/2addr v4, p0

    .line 81
    int-to-long p0, v4

    .line 82
    sub-long/2addr v1, p0

    .line 83
    const-wide/16 p0, 0x0

    .line 84
    .line 85
    invoke-static {v1, v2, p0, p1}, Loe/j;->f(JJ)J

    .line 86
    .line 87
    .line 88
    move-result-wide p0

    .line 89
    return-wide p0
.end method

.method private static final h(LG/u;I)J
    .locals 8

    .line 1
    invoke-virtual {p0}, LG/u;->a()Lz/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lz/q;->b:Lz/q;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, LG/u;->b()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-static {v0, v1}, Li1/r;->g(J)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    :goto_0
    move v2, v0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    invoke-virtual {p0}, LG/u;->b()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    invoke-static {v0, v1}, Li1/r;->f(J)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    goto :goto_0

    .line 28
    :goto_1
    invoke-virtual {p0}, LG/u;->l()LA/k;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {p0}, LG/u;->h()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-virtual {p0}, LG/u;->e()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    invoke-virtual {p0}, LG/u;->c()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const/4 v6, 0x0

    .line 45
    move v7, p1

    .line 46
    invoke-interface/range {v1 .. v7}, LA/k;->a(IIIIII)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    const/4 p1, 0x0

    .line 51
    invoke-static {p0, p1, v2}, Loe/j;->m(III)I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    int-to-long p0, p0

    .line 56
    return-wide p0
.end method

.method public static final i()F
    .locals 1

    .line 1
    sget v0, LG/D;->a:F

    .line 2
    .line 3
    return v0
.end method

.method public static final j()LG/u;
    .locals 1

    .line 1
    sget-object v0, LG/D;->b:LG/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final k(IFLie/a;LY/m;II)LG/C;
    .locals 10

    .line 1
    and-int/lit8 v0, p5, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p0, v1

    .line 7
    :cond_0
    and-int/lit8 p5, p5, 0x2

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    :cond_1
    invoke-static {}, LY/w;->L()Z

    .line 13
    .line 14
    .line 15
    move-result p5

    .line 16
    if-eqz p5, :cond_2

    .line 17
    .line 18
    const/4 p5, -0x1

    .line 19
    const-string v0, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:86)"

    .line 20
    .line 21
    const v2, -0x482adcfd

    .line 22
    .line 23
    .line 24
    invoke-static {v2, p4, p5, v0}, LY/w;->U(IIILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_2
    new-array v3, v1, [Ljava/lang/Object;

    .line 28
    .line 29
    sget-object p5, LG/b;->L:LG/b$c;

    .line 30
    .line 31
    invoke-virtual {p5}, LG/b$c;->a()Lh0/v;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    and-int/lit8 p5, p4, 0xe

    .line 36
    .line 37
    xor-int/lit8 p5, p5, 0x6

    .line 38
    .line 39
    const/4 v0, 0x4

    .line 40
    const/4 v2, 0x1

    .line 41
    if-le p5, v0, :cond_3

    .line 42
    .line 43
    invoke-interface {p3, p0}, LY/m;->c(I)Z

    .line 44
    .line 45
    .line 46
    move-result p5

    .line 47
    if-nez p5, :cond_4

    .line 48
    .line 49
    :cond_3
    and-int/lit8 p5, p4, 0x6

    .line 50
    .line 51
    if-ne p5, v0, :cond_5

    .line 52
    .line 53
    :cond_4
    move p5, v2

    .line 54
    goto :goto_0

    .line 55
    :cond_5
    move p5, v1

    .line 56
    :goto_0
    and-int/lit8 v0, p4, 0x70

    .line 57
    .line 58
    xor-int/lit8 v0, v0, 0x30

    .line 59
    .line 60
    const/16 v5, 0x20

    .line 61
    .line 62
    if-le v0, v5, :cond_6

    .line 63
    .line 64
    invoke-interface {p3, p1}, LY/m;->b(F)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_7

    .line 69
    .line 70
    :cond_6
    and-int/lit8 v0, p4, 0x30

    .line 71
    .line 72
    if-ne v0, v5, :cond_8

    .line 73
    .line 74
    :cond_7
    move v0, v2

    .line 75
    goto :goto_1

    .line 76
    :cond_8
    move v0, v1

    .line 77
    :goto_1
    or-int/2addr p5, v0

    .line 78
    and-int/lit16 v0, p4, 0x380

    .line 79
    .line 80
    xor-int/lit16 v0, v0, 0x180

    .line 81
    .line 82
    const/16 v5, 0x100

    .line 83
    .line 84
    if-le v0, v5, :cond_9

    .line 85
    .line 86
    invoke-interface {p3, p2}, LY/m;->U(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_a

    .line 91
    .line 92
    :cond_9
    and-int/lit16 p4, p4, 0x180

    .line 93
    .line 94
    if-ne p4, v5, :cond_b

    .line 95
    .line 96
    :cond_a
    move v1, v2

    .line 97
    :cond_b
    or-int p4, p5, v1

    .line 98
    .line 99
    invoke-interface {p3}, LY/m;->D()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p5

    .line 103
    if-nez p4, :cond_c

    .line 104
    .line 105
    sget-object p4, LY/m;->a:LY/m$a;

    .line 106
    .line 107
    invoke-virtual {p4}, LY/m$a;->a()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p4

    .line 111
    if-ne p5, p4, :cond_d

    .line 112
    .line 113
    :cond_c
    new-instance p5, LG/D$d;

    .line 114
    .line 115
    invoke-direct {p5, p0, p1, p2}, LG/D$d;-><init>(IFLie/a;)V

    .line 116
    .line 117
    .line 118
    invoke-interface {p3, p5}, LY/m;->u(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_d
    move-object v6, p5

    .line 122
    check-cast v6, Lie/a;

    .line 123
    .line 124
    const/4 v8, 0x0

    .line 125
    const/4 v9, 0x4

    .line 126
    const/4 v5, 0x0

    .line 127
    move-object v7, p3

    .line 128
    invoke-static/range {v3 .. v9}, Lh0/d;->e([Ljava/lang/Object;Lh0/v;Ljava/lang/String;Lie/a;LY/m;II)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    check-cast p0, LG/b;

    .line 133
    .line 134
    invoke-virtual {p0}, LG/b;->m0()LY/C0;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-interface {p1, p2}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    invoke-static {}, LY/w;->L()Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    if-eqz p1, :cond_e

    .line 146
    .line 147
    invoke-static {}, LY/w;->T()V

    .line 148
    .line 149
    .line 150
    :cond_e
    return-object p0
.end method
