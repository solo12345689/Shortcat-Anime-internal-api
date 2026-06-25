.class abstract synthetic LJf/s;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(LJf/t;)LJf/y;
    .locals 2

    .line 1
    new-instance v0, LJf/v;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LJf/v;-><init>(LJf/y;LGf/C0;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public static final b(LJf/u;)LJf/I;
    .locals 2

    .line 1
    new-instance v0, LJf/w;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LJf/w;-><init>(LJf/I;LGf/C0;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method private static final c(LJf/e;I)LJf/D;
    .locals 7

    .line 1
    sget-object v0, LIf/g;->L:LIf/g$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LIf/g$a;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {p1, v0}, Loe/j;->e(II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sub-int/2addr v0, p1

    .line 12
    instance-of v1, p0, LKf/e;

    .line 13
    .line 14
    if-eqz v1, :cond_4

    .line 15
    .line 16
    move-object v1, p0

    .line 17
    check-cast v1, LKf/e;

    .line 18
    .line 19
    invoke-virtual {v1}, LKf/e;->j()LJf/e;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    if-eqz v2, :cond_4

    .line 24
    .line 25
    new-instance p0, LJf/D;

    .line 26
    .line 27
    iget v3, v1, LKf/e;->b:I

    .line 28
    .line 29
    const/4 v4, -0x3

    .line 30
    if-eq v3, v4, :cond_0

    .line 31
    .line 32
    const/4 v4, -0x2

    .line 33
    if-eq v3, v4, :cond_0

    .line 34
    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    move v0, v3

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget-object v4, v1, LKf/e;->c:LIf/a;

    .line 40
    .line 41
    sget-object v5, LIf/a;->a:LIf/a;

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    if-ne v4, v5, :cond_2

    .line 45
    .line 46
    if-nez v3, :cond_3

    .line 47
    .line 48
    :cond_1
    move v0, v6

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    if-nez p1, :cond_1

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    :cond_3
    :goto_0
    iget-object p1, v1, LKf/e;->c:LIf/a;

    .line 54
    .line 55
    iget-object v1, v1, LKf/e;->a:LZd/i;

    .line 56
    .line 57
    invoke-direct {p0, v2, v0, p1, v1}, LJf/D;-><init>(LJf/e;ILIf/a;LZd/i;)V

    .line 58
    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_4
    new-instance p1, LJf/D;

    .line 62
    .line 63
    sget-object v1, LIf/a;->a:LIf/a;

    .line 64
    .line 65
    sget-object v2, LZd/j;->a:LZd/j;

    .line 66
    .line 67
    invoke-direct {p1, p0, v0, v1, v2}, LJf/D;-><init>(LJf/e;ILIf/a;LZd/i;)V

    .line 68
    .line 69
    .line 70
    return-object p1
.end method

.method private static final d(LGf/O;LZd/i;LJf/e;LJf/t;LJf/E;Ljava/lang/Object;)LGf/C0;
    .locals 7

    .line 1
    sget-object v0, LJf/E;->a:LJf/E$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LJf/E$a;->c()LJf/E;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget-object v0, LGf/Q;->a:LGf/Q;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object v0, LGf/Q;->d:LGf/Q;

    .line 17
    .line 18
    :goto_0
    new-instance v1, LJf/s$a;

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    move-object v3, p2

    .line 22
    move-object v4, p3

    .line 23
    move-object v2, p4

    .line 24
    move-object v5, p5

    .line 25
    invoke-direct/range {v1 .. v6}, LJf/s$a;-><init>(LJf/E;LJf/e;LJf/t;Ljava/lang/Object;LZd/e;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0, p1, v0, v1}, LGf/i;->c(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;)LGf/C0;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public static final e(LJf/e;LGf/O;LJf/E;Ljava/lang/Object;)LJf/I;
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0}, LJf/s;->c(LJf/e;I)LJf/D;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-static {p3}, LJf/K;->a(Ljava/lang/Object;)LJf/u;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    iget-object v1, p0, LJf/D;->d:LZd/i;

    .line 11
    .line 12
    iget-object v2, p0, LJf/D;->a:LJf/e;

    .line 13
    .line 14
    move-object v0, p1

    .line 15
    move-object v4, p2

    .line 16
    move-object v5, p3

    .line 17
    invoke-static/range {v0 .. v5}, LJf/s;->d(LGf/O;LZd/i;LJf/e;LJf/t;LJf/E;Ljava/lang/Object;)LGf/C0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    new-instance p1, LJf/w;

    .line 22
    .line 23
    invoke-direct {p1, v3, p0}, LJf/w;-><init>(LJf/I;LGf/C0;)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method
