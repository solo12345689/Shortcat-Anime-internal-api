.class public abstract LWf/u;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(LWf/b;Lkotlin/jvm/functions/Function1;)LWf/b;
    .locals 1

    .line 1
    const-string v0, "from"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "builderAction"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, LWf/e;

    .line 12
    .line 13
    invoke-direct {v0, p0}, LWf/e;-><init>(LWf/b;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, LWf/e;->a()LWf/g;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    new-instance p1, LWf/t;

    .line 24
    .line 25
    invoke-virtual {v0}, LWf/e;->b()LYf/e;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-direct {p1, p0, v0}, LWf/t;-><init>(LWf/g;LYf/e;)V

    .line 30
    .line 31
    .line 32
    return-object p1
.end method

.method public static synthetic b(LWf/b;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LWf/b;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    sget-object p0, LWf/b;->d:LWf/b$a;

    .line 6
    .line 7
    :cond_0
    invoke-static {p0, p1}, LWf/u;->a(LWf/b;Lkotlin/jvm/functions/Function1;)LWf/b;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
