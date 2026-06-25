.class public abstract LGf/I;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static synthetic a(Lkotlin/jvm/internal/N;ZLZd/i;LZd/i$b;)LZd/i;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LGf/I;->e(Lkotlin/jvm/internal/N;ZLZd/i;LZd/i$b;)LZd/i;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(LZd/i;LZd/i$b;)LZd/i;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LGf/I;->f(LZd/i;LZd/i$b;)LZd/i;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(ZLZd/i$b;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, LGf/I;->i(ZLZd/i$b;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final d(LZd/i;LZd/i;Z)LZd/i;
    .locals 3

    .line 1
    invoke-static {p0}, LGf/I;->h(LZd/i;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, LGf/I;->h(LZd/i;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-interface {p0, p1}, LZd/i;->w(LZd/i;)LZd/i;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    new-instance v0, Lkotlin/jvm/internal/N;

    .line 19
    .line 20
    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 24
    .line 25
    sget-object p1, LZd/j;->a:LZd/j;

    .line 26
    .line 27
    new-instance v2, LGf/G;

    .line 28
    .line 29
    invoke-direct {v2, v0, p2}, LGf/G;-><init>(Lkotlin/jvm/internal/N;Z)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p0, p1, v2}, LZd/i;->y1(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, LZd/i;

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    iget-object p2, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p2, LZd/i;

    .line 43
    .line 44
    new-instance v1, LGf/H;

    .line 45
    .line 46
    invoke-direct {v1}, LGf/H;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-interface {p2, p1, v1}, LZd/i;->y1(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iput-object p1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 54
    .line 55
    :cond_1
    iget-object p1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, LZd/i;

    .line 58
    .line 59
    invoke-interface {p0, p1}, LZd/i;->w(LZd/i;)LZd/i;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method

.method private static final e(Lkotlin/jvm/internal/N;ZLZd/i;LZd/i$b;)LZd/i;
    .locals 0

    .line 1
    invoke-interface {p2, p3}, LZd/i;->w(LZd/i;)LZd/i;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final f(LZd/i;LZd/i$b;)LZd/i;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, LZd/i;->w(LZd/i;)LZd/i;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final g(LZd/i;)Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method private static final h(LZd/i;)Z
    .locals 2

    .line 1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    new-instance v1, LGf/F;

    .line 4
    .line 5
    invoke-direct {v1}, LGf/F;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, v0, v1}, LZd/i;->y1(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method private static final i(ZLZd/i$b;)Z
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    const/4 p0, 0x1

    .line 6
    return p0
.end method

.method public static final j(LGf/O;LZd/i;)LZd/i;
    .locals 1

    .line 1
    invoke-interface {p0}, LGf/O;->getCoroutineContext()LZd/i;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-static {p0, p1, v0}, LGf/I;->d(LZd/i;LZd/i;Z)LZd/i;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {}, LGf/f0;->a()LGf/K;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eq p0, p1, :cond_0

    .line 15
    .line 16
    sget-object p1, LZd/f;->S:LZd/f$b;

    .line 17
    .line 18
    invoke-interface {p0, p1}, LZd/i;->l(LZd/i$c;)LZd/i$b;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    invoke-static {}, LGf/f0;->a()LGf/K;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-interface {p0, p1}, LZd/i;->w(LZd/i;)LZd/i;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :cond_0
    return-object p0
.end method

.method public static final k(LZd/i;LZd/i;)LZd/i;
    .locals 1

    .line 1
    invoke-static {p1}, LGf/I;->h(LZd/i;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0, p1}, LZd/i;->w(LZd/i;)LZd/i;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    invoke-static {p0, p1, v0}, LGf/I;->d(LZd/i;LZd/i;Z)LZd/i;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static final l(Lkotlin/coroutines/jvm/internal/e;)LGf/f1;
    .locals 2

    .line 1
    :cond_0
    instance-of v0, p0, LGf/b0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_1
    invoke-interface {p0}, Lkotlin/coroutines/jvm/internal/e;->getCallerFrame()Lkotlin/coroutines/jvm/internal/e;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-nez p0, :cond_2

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_2
    instance-of v0, p0, LGf/f1;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    check-cast p0, LGf/f1;

    .line 19
    .line 20
    return-object p0
.end method

.method public static final m(LZd/e;LZd/i;Ljava/lang/Object;)LGf/f1;
    .locals 2

    .line 1
    instance-of v0, p0, Lkotlin/coroutines/jvm/internal/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    sget-object v0, LGf/g1;->a:LGf/g1;

    .line 8
    .line 9
    invoke-interface {p1, v0}, LZd/i;->l(LZd/i$c;)LZd/i$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    check-cast p0, Lkotlin/coroutines/jvm/internal/e;

    .line 16
    .line 17
    invoke-static {p0}, LGf/I;->l(Lkotlin/coroutines/jvm/internal/e;)LGf/f1;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, LGf/f1;->X0(LZd/i;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-object p0

    .line 27
    :cond_2
    return-object v1
.end method
