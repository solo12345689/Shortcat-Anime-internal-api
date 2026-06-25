.class abstract synthetic LGf/j;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(LZd/i;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LZd/f;->S:LZd/f$b;

    .line 6
    .line 7
    invoke-interface {p0, v1}, LZd/i;->l(LZd/i$c;)LZd/i$b;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, LZd/f;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    sget-object v1, LGf/Z0;->a:LGf/Z0;

    .line 16
    .line 17
    invoke-virtual {v1}, LGf/Z0;->b()LGf/l0;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sget-object v2, LGf/v0;->a:LGf/v0;

    .line 22
    .line 23
    invoke-interface {p0, v1}, LZd/i;->w(LZd/i;)LZd/i;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {v2, p0}, LGf/I;->j(LGf/O;LZd/i;)LZd/i;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    goto :goto_3

    .line 32
    :cond_0
    instance-of v2, v1, LGf/l0;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    check-cast v1, LGf/l0;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move-object v1, v3

    .line 41
    :goto_0
    if-eqz v1, :cond_4

    .line 42
    .line 43
    invoke-virtual {v1}, LGf/l0;->m2()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    move-object v3, v1

    .line 50
    :cond_2
    if-nez v3, :cond_3

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    move-object v1, v3

    .line 54
    goto :goto_2

    .line 55
    :cond_4
    :goto_1
    sget-object v1, LGf/Z0;->a:LGf/Z0;

    .line 56
    .line 57
    invoke-virtual {v1}, LGf/Z0;->a()LGf/l0;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    :goto_2
    sget-object v2, LGf/v0;->a:LGf/v0;

    .line 62
    .line 63
    invoke-static {v2, p0}, LGf/I;->j(LGf/O;LZd/i;)LZd/i;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    :goto_3
    new-instance v2, LGf/g;

    .line 68
    .line 69
    invoke-direct {v2, p0, v0, v1}, LGf/g;-><init>(LZd/i;Ljava/lang/Thread;LGf/l0;)V

    .line 70
    .line 71
    .line 72
    sget-object p0, LGf/Q;->a:LGf/Q;

    .line 73
    .line 74
    invoke-virtual {v2, p0, v2, p1}, LGf/a;->T0(LGf/Q;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, LGf/g;->U0()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0
.end method

.method public static synthetic b(LZd/i;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    sget-object p0, LZd/j;->a:LZd/j;

    .line 6
    .line 7
    :cond_0
    invoke-static {p0, p1}, LGf/i;->e(LZd/i;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
