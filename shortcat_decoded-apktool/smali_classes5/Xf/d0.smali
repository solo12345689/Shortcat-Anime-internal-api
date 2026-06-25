.class public abstract LXf/d0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static synthetic a(Lkotlin/jvm/internal/N;LWf/i;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LXf/d0;->e(Lkotlin/jvm/internal/N;LWf/i;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b(LTf/e;)Z
    .locals 0

    .line 1
    invoke-static {p0}, LXf/d0;->c(LTf/e;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final c(LTf/e;)Z
    .locals 1

    .line 1
    invoke-interface {p0}, LTf/e;->h()LTf/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, LTf/d;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-interface {p0}, LTf/e;->h()LTf/l;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object v0, LTf/l$b;->a:LTf/l$b;

    .line 14
    .line 15
    if-ne p0, v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public static final d(LWf/b;Ljava/lang/Object;LRf/k;)LWf/i;
    .locals 3

    .line 1
    const-string v0, "json"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "serializer"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lkotlin/jvm/internal/N;

    .line 12
    .line 13
    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v1, LXf/L;

    .line 17
    .line 18
    new-instance v2, LXf/c0;

    .line 19
    .line 20
    invoke-direct {v2, v0}, LXf/c0;-><init>(Lkotlin/jvm/internal/N;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, p0, v2}, LXf/L;-><init>(LWf/b;Lkotlin/jvm/functions/Function1;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p2, p1}, LXf/e;->t(LRf/k;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 30
    .line 31
    if-nez p0, :cond_0

    .line 32
    .line 33
    const-string p0, "result"

    .line 34
    .line 35
    invoke-static {p0}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    return-object p0

    .line 40
    :cond_0
    check-cast p0, LWf/i;

    .line 41
    .line 42
    return-object p0
.end method

.method private static final e(Lkotlin/jvm/internal/N;LWf/i;)LTd/L;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 7
    .line 8
    sget-object p0, LTd/L;->a:LTd/L;

    .line 9
    .line 10
    return-object p0
.end method
