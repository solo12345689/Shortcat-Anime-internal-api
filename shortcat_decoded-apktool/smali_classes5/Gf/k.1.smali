.class abstract synthetic LGf/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;)LGf/W;
    .locals 1

    .line 1
    invoke-static {p0, p1}, LGf/I;->j(LGf/O;LZd/i;)LZd/i;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p2}, LGf/Q;->c()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, LGf/K0;

    .line 12
    .line 13
    invoke-direct {p1, p0, p3}, LGf/K0;-><init>(LZd/i;Lkotlin/jvm/functions/Function2;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, LGf/X;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-direct {p1, p0, v0}, LGf/X;-><init>(LZd/i;Z)V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {p1, p2, p1, p3}, LGf/a;->T0(LGf/Q;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method

.method public static synthetic b(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/W;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p1, LZd/j;->a:LZd/j;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x2

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    sget-object p2, LGf/Q;->a:LGf/Q;

    .line 12
    .line 13
    :cond_1
    invoke-static {p0, p1, p2, p3}, LGf/i;->a(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;)LGf/W;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static final c(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;)LGf/C0;
    .locals 1

    .line 1
    invoke-static {p0, p1}, LGf/I;->j(LGf/O;LZd/i;)LZd/i;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p2}, LGf/Q;->c()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, LGf/L0;

    .line 12
    .line 13
    invoke-direct {p1, p0, p3}, LGf/L0;-><init>(LZd/i;Lkotlin/jvm/functions/Function2;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, LGf/V0;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-direct {p1, p0, v0}, LGf/V0;-><init>(LZd/i;Z)V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {p1, p2, p1, p3}, LGf/a;->T0(LGf/Q;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method

.method public static synthetic d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p1, LZd/j;->a:LZd/j;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x2

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    sget-object p2, LGf/Q;->a:LGf/Q;

    .line 12
    .line 13
    :cond_1
    invoke-static {p0, p1, p2, p3}, LGf/i;->c(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;)LGf/C0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static final e(LZd/i;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-interface {p2}, LZd/e;->getContext()LZd/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p0}, LGf/I;->k(LZd/i;LZd/i;)LZd/i;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, LGf/F0;->j(LZd/i;)V

    .line 10
    .line 11
    .line 12
    if-ne p0, v0, :cond_0

    .line 13
    .line 14
    new-instance v0, LLf/A;

    .line 15
    .line 16
    invoke-direct {v0, p0, p2}, LLf/A;-><init>(LZd/i;LZd/e;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v0, p1}, LMf/b;->d(LLf/A;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object v1, LZd/f;->S:LZd/f$b;

    .line 25
    .line 26
    invoke-interface {p0, v1}, LZd/i;->l(LZd/i$c;)LZd/i$b;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v0, v1}, LZd/i;->l(LZd/i$c;)LZd/i$b;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    new-instance v0, LGf/f1;

    .line 41
    .line 42
    invoke-direct {v0, p0, p2}, LGf/f1;-><init>(LZd/i;LZd/e;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, LGf/a;->getContext()LZd/i;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-static {p0, v1}, LLf/L;->i(LZd/i;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :try_start_0
    invoke-static {v0, v0, p1}, LMf/b;->d(LLf/A;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    invoke-static {p0, v1}, LLf/L;->f(LZd/i;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move-object p0, p1

    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    invoke-static {p0, v1}, LLf/L;->f(LZd/i;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_1
    new-instance v0, LGf/b0;

    .line 69
    .line 70
    invoke-direct {v0, p0, p2}, LGf/b0;-><init>(LZd/i;LZd/e;)V

    .line 71
    .line 72
    .line 73
    invoke-static {p1, v0, v0}, LMf/a;->c(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;LZd/e;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, LGf/b0;->V0()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    :goto_0
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-ne p0, p1, :cond_2

    .line 85
    .line 86
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 87
    .line 88
    .line 89
    :cond_2
    return-object p0
.end method
