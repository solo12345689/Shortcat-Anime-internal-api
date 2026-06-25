.class public abstract LA/g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(LG/C;LG/A;Lie/o;)LA/j;
    .locals 1

    .line 1
    new-instance v0, LA/g$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p2, p1}, LA/g$a;-><init>(LG/C;Lie/o;LG/A;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final synthetic b(LG/C;)F
    .locals 0

    .line 1
    invoke-static {p0}, LA/g;->e(LG/C;)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic c(LG/C;)Z
    .locals 0

    .line 1
    invoke-static {p0}, LA/g;->g(LG/C;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final d(LG/C;Li1/t;FFFF)F
    .locals 5

    .line 1
    invoke-virtual {p0}, LG/C;->C()LG/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LG/n;->a()Lz/q;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lz/q;->a:Lz/q;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-static {p0}, LA/g;->g(LG/C;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object v0, Li1/t;->a:Li1/t;

    .line 19
    .line 20
    if-ne p1, v0, :cond_1

    .line 21
    .line 22
    invoke-static {p0}, LA/g;->g(LG/C;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-static {p0}, LA/g;->g(LG/C;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    goto :goto_0

    .line 35
    :cond_2
    const/4 p1, 0x0

    .line 36
    :goto_0
    invoke-virtual {p0}, LG/C;->C()LG/n;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v0}, LG/n;->h()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/4 v1, 0x0

    .line 45
    if-nez v0, :cond_3

    .line 46
    .line 47
    move v2, v1

    .line 48
    goto :goto_1

    .line 49
    :cond_3
    invoke-static {p0}, LA/g;->e(LG/C;)F

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    int-to-float v0, v0

    .line 54
    div-float/2addr v2, v0

    .line 55
    :goto_1
    float-to-int v0, v2

    .line 56
    int-to-float v0, v0

    .line 57
    sub-float v0, v2, v0

    .line 58
    .line 59
    invoke-virtual {p0}, LG/C;->x()Li1/d;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-static {v3, p3}, LA/f;->a(Li1/d;F)I

    .line 64
    .line 65
    .line 66
    move-result p3

    .line 67
    sget-object v3, LA/d;->a:LA/d$a;

    .line 68
    .line 69
    invoke-virtual {v3}, LA/d$a;->a()I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    invoke-static {p3, v4}, LA/d;->e(II)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eqz v4, :cond_6

    .line 78
    .line 79
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 80
    .line 81
    .line 82
    move-result p3

    .line 83
    cmpl-float p2, p3, p2

    .line 84
    .line 85
    if-lez p2, :cond_4

    .line 86
    .line 87
    if-eqz p1, :cond_9

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    invoke-virtual {p0}, LG/C;->L()F

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    cmpl-float p0, p2, p0

    .line 103
    .line 104
    if-ltz p0, :cond_5

    .line 105
    .line 106
    if-eqz p1, :cond_7

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_5
    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    invoke-static {p5}, Ljava/lang/Math;->abs(F)F

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    cmpg-float p0, p0, p1

    .line 118
    .line 119
    if-gez p0, :cond_7

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_6
    invoke-virtual {v3}, LA/d$a;->b()I

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    invoke-static {p3, p0}, LA/d;->e(II)Z

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    if-eqz p0, :cond_8

    .line 131
    .line 132
    :cond_7
    :goto_2
    return p5

    .line 133
    :cond_8
    invoke-virtual {v3}, LA/d$a;->c()I

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    invoke-static {p3, p0}, LA/d;->e(II)Z

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    if-eqz p0, :cond_a

    .line 142
    .line 143
    :cond_9
    :goto_3
    return p4

    .line 144
    :cond_a
    return v1
.end method

.method private static final e(LG/C;)F
    .locals 2

    .line 1
    invoke-virtual {p0}, LG/C;->C()LG/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LG/n;->a()Lz/q;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lz/q;->b:Lz/q;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, LG/C;->R()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    invoke-static {v0, v1}, Lr0/f;->m(J)F

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    :cond_0
    invoke-virtual {p0}, LG/C;->R()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    invoke-static {v0, v1}, Lr0/f;->n(J)F

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method

.method private static final f(LG/C;)Z
    .locals 1

    .line 1
    invoke-static {p0}, LA/g;->e(LG/C;)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x0

    .line 6
    cmpl-float p0, p0, v0

    .line 7
    .line 8
    if-lez p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method private static final g(LG/C;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, LG/C;->C()LG/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LG/n;->g()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {p0}, LA/g;->f(LG/C;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    :cond_0
    invoke-static {p0}, LA/g;->f(LG/C;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_2

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    :cond_1
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_2
    const/4 p0, 0x0

    .line 28
    return p0
.end method
