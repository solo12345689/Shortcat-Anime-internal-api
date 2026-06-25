.class public abstract Ld1/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Ljava/lang/String;LU0/Y0;Ljava/util/List;Ljava/util/List;Li1/d;LY0/u$b;)LU0/y;
    .locals 7

    .line 1
    new-instance v0, Ld1/e;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-object v2, p1

    .line 5
    move-object v3, p2

    .line 6
    move-object v4, p3

    .line 7
    move-object v6, p4

    .line 8
    move-object v5, p5

    .line 9
    invoke-direct/range {v0 .. v6}, Ld1/e;-><init>(Ljava/lang/String;LU0/Y0;Ljava/util/List;Ljava/util/List;LY0/u$b;Li1/d;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static final synthetic b(LU0/Y0;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Ld1/f;->c(LU0/Y0;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final c(LU0/Y0;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LU0/Y0;->y()LU0/G;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, LU0/G;->a()LU0/E;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, LU0/E;->b()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {p0}, LU0/i;->d(I)LU0/i;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    :goto_0
    sget-object v0, LU0/i;->b:LU0/i$a;

    .line 24
    .line 25
    invoke-virtual {v0}, LU0/i$a;->c()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez p0, :cond_1

    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-virtual {p0}, LU0/i;->j()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    invoke-static {p0, v0}, LU0/i;->g(II)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    :goto_1
    xor-int/lit8 p0, p0, 0x1

    .line 42
    .line 43
    return p0
.end method

.method public static final d(ILc1/e;)I
    .locals 6

    .line 1
    sget-object v0, Lg1/l;->b:Lg1/l$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg1/l$a;->b()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {p0, v1}, Lg1/l;->j(II)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x2

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    return v2

    .line 15
    :cond_0
    invoke-virtual {v0}, Lg1/l$a;->c()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-static {p0, v1}, Lg1/l;->j(II)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v3, 0x3

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    return v3

    .line 27
    :cond_1
    invoke-virtual {v0}, Lg1/l$a;->d()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static {p0, v1}, Lg1/l;->j(II)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const/4 v4, 0x0

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    return v4

    .line 39
    :cond_2
    invoke-virtual {v0}, Lg1/l$a;->e()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-static {p0, v1}, Lg1/l;->j(II)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    const/4 v5, 0x1

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    return v5

    .line 51
    :cond_3
    invoke-virtual {v0}, Lg1/l$a;->a()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-static {p0, v1}, Lg1/l;->j(II)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_5

    .line 60
    .line 61
    invoke-virtual {v0}, Lg1/l$a;->f()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-static {p0, v0}, Lg1/l;->j(II)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-eqz p0, :cond_4

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    const-string p1, "Invalid TextDirection."

    .line 75
    .line 76
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p0

    .line 80
    :cond_5
    :goto_0
    if-eqz p1, :cond_6

    .line 81
    .line 82
    invoke-virtual {p1, v4}, Lc1/e;->e(I)Lc1/d;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {p0}, Lc1/d;->b()Ljava/util/Locale;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    if-nez p0, :cond_7

    .line 91
    .line 92
    :cond_6
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    :cond_7
    invoke-static {p0}, LJ1/p;->a(Ljava/util/Locale;)I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-eqz p0, :cond_9

    .line 101
    .line 102
    if-eq p0, v5, :cond_8

    .line 103
    .line 104
    return v2

    .line 105
    :cond_8
    return v3

    .line 106
    :cond_9
    return v2
.end method
